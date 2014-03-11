package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.Session;
import sn.com.douane.web.rc.form.AutorisationForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class AutorisationAction extends GeneralDispatchAction implements
		ScopedModelDriven<AutorisationForm> {

	/**
	 * Serial version of class.
	 */
	private static final long serialVersionUID = 1212222807917791034L;

	/**
	 * {@link AutorisationAction}'s default logger.
	 */
	private static final Log LOGGER = LogFactory
			.getLog(AutorisationAction.class);

	/**
	 * Related from.
	 */
	private AutorisationForm autorisationForm;

	/**
	 * Action scope.
	 */
	private String scopeKey;

	/**
	 * Related business delegate.
	 */
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	/***************************************/
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() throws Exception {
		String forward = null; // return value
		HttpServletRequest request = ServletActionContext.getRequest();
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		String page = null;
		// Le Form Bean
		if (Session.getUtilisateurSession(request).getRcCodUser().endsWith("Z")
				&& Session.getUtilisateurSession(request).getRcCodUser()
				.startsWith("T")) {
			page = request.getParameter(ConstManif.PAGE);
			if (page==null){
				page = request.getParameter("pageContext");
			}
			// autr
			if (ctxmenu.equals("SM")) {
				autorisationForm.setNumCodeUser(autorisationForm.getPk());
				String condition = " and rcCodUser  = '"
						+ autorisationForm.getPk() + "'";
				List<UtilisateurDto> listeAgents = gaindeBusinessDelegate
						.rechercherUtilisateur("from Utilisateur where 1=1 "
								+ condition);
				UtilisateurDto utilisateurDto = listeAgents.get(0);
				autorisationForm.setNumIndEnreg(utilisateurDto.getRcindenr());
				autorisationForm.setNumIndPreReg(utilisateurDto.getRcindprereg());
			}
			// autr
		} else {
			page = "index";
			addActionError(getText(ConstErrCodRC.accessdenied));
		}

		try {
			autorisationForm.setListeAgents(new ArrayList<UtilisateurDto>());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

	/***************************************/
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherMesAgents() throws Exception {

		// Declarations
		//String forward = null;
		// La page de forward
		HttpServletRequest request = ServletActionContext.getRequest();
		//String page = request.getParameter(ConstManif.PAGE);
		String pageResult = request.getParameter("pageContext");

		String condition = "";

		// Recuperation des criteres saisis
		String codeuser = autorisationForm.getNumCodeUser();
		// String identification = autorisationFB.getTNUM_indentification_OB();

		// Condition de recherche
		if (codeuser!=null && !"".equals(codeuser.trim())){
			condition += " and rcCodUser  LIKE'%" + codeuser + "%' ";
		}
		condition += " and rcCodUser  LIKE'%"
				+ Session.getUtilisateurSession(request).getCodeppm() + "%' ";
		condition += " and rcCodUser  LIKE'T%'";
		condition += " and rcCodUser  != '"
				+ Session.getUtilisateurSession(request).getRcCodUser() + "'";

		try {

			List<UtilisateurDto> listeAgents = gaindeBusinessDelegate
					.rechercherUtilisateur("from Utilisateur where 1=1 "
							+ condition);
			// pour la pagination du grid 
			if (listeAgents!=null) {
				autorisationForm.setRecords(listeAgents.size()); 
				autorisationForm.setTotal(
						(int) Math.ceil((double)autorisationForm.getRecords() 
								/ (double)autorisationForm.getRows())); 
				int to = (autorisationForm.getRows() * autorisationForm.getPage());
				int from = to - autorisationForm.getRows();
				if (to > autorisationForm.getRecords()) {
					to = autorisationForm.getRecords();
				}
				listeAgents = listeAgents.subList(from, to);
			}
			autorisationForm.setListeAgents(listeAgents);
			if (listeAgents!=null && listeAgents.size() != 0) {
				request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
			} else {
				addActionError(getText(ConstErrCodRC.rcRowNotFound));
			}
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage(), e);
		} 

		if (pageResult == null) {
			return SUCCESS;
		} else {
			return pageResult;
		}
	}

	/***************************************/
	/*** MODIFICATION ***/
	/***************************************/
	public String majAutorisation() throws Exception {

		String forward = null; // return value
		Utilisateur utilisateur = null;
		String pk = autorisationForm.getPk();
		LOGGER.debug("la cle est : " + pk);
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter("pageContext");
		try {
			utilisateur = gaindeBusinessDelegate
					.chercherUtilisateurByPrimaryKey(pk);
			LOGGER.debug("code user  :"	+ utilisateur.getRcCodUser());
			utilisateur.setRcindEnr(autorisationForm.getNumIndEnreg());
			utilisateur.setRcindprereg(autorisationForm.getNumIndPreReg());
			gaindeBusinessDelegate.modifierUtilisateur(utilisateur);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			// On forward si succes
			forward = page;
		} catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage(), e);
			addActionError(getText((e.getMessage())));
			// On forward
			forward = ("majAutorisationAgent");
		} 

		return forward;
	}

	public AutorisationForm getModel() {
		return autorisationForm;
	}

	public void setModel(AutorisationForm autorisationForm) {
		this.autorisationForm = autorisationForm;
	}

	public void setScopeKey(String key) {
		this.scopeKey = key;
	}

	public String getScopeKey() {
		return scopeKey;
	}

}
