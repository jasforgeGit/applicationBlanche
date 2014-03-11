package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.FonctionnaliteDto;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcFonctionnalitesForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;


public class RcFonctionnalitesAction extends GeneralDispatchAction implements ScopedModelDriven<RcFonctionnalitesForm> {

	private static final long serialVersionUID = 1L;
	private RcFonctionnalitesForm rcFonctionnalitesForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcFonctionnalites() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcFonctionnalites" : request.getParameter(ConstManif.PAGE));

		try {
			Fonctionnalite fonctionnalitesvo = rcFonctionnalitesForm.getNewRcFonctionnalitesVO();
			gaindeBusinessDelegate.ajouterFonctionnalite(fonctionnalitesvo);
			addActionError(getText(ConstErrCodRC.succefulInsert));
			rcFonctionnalitesForm.reset();
			forward = page;
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcFonctionnalites";
		}
		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcFonctionnalites() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcFonctionnalites" : request.getParameter(ConstManif.PAGE));

		try {
			Fonctionnalite fonctionnalitesvo = rcFonctionnalitesForm.getNewRcFonctionnalitesVO();
			gaindeBusinessDelegate.modifierFonctionnalite(fonctionnalitesvo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "modificationRcFonctionnalites";
		}
		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcFonctionnalites() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);

		String rccodefonction = (rcFonctionnalitesForm.getNumRcCodeFonctionRech()==null ? "" : rcFonctionnalitesForm.getNumRcCodeFonctionRech());
		String rccodeprofil = (rcFonctionnalitesForm.getNumListRcCodeProfilRech()==null ? "" : rcFonctionnalitesForm.getNumListRcCodeProfilRech());
		String rclibfonction = (rcFonctionnalitesForm.getNumRcLibFonctionRech()==null ? "" : rcFonctionnalitesForm.getNumRcLibFonctionRech());
		String rcordreaffichage = (rcFonctionnalitesForm.getNumRcOrdreAffichageRech()==null ? "" : rcFonctionnalitesForm.getNumRcOrdreAffichageRech());

		//Condition de recherche
		if (!rccodefonction.equals("")){
			condition += " and rcCodeFonction LIKE '%"+rccodefonction+"%' ";
		}
		if (!rccodeprofil.equals("")){
			condition += " and rcCodeProfil LIKE '%"+rccodeprofil+"%' ";
		}
		if (!rclibfonction.equals("")){
			condition += " and rcLibFonction LIKE '%"+rclibfonction+"%' ";
		}
		if (!rcordreaffichage.equals("")){
			condition += " and RCORDREAFFICHAGE = "+rcordreaffichage+" ";
		}
		try {
			List<FonctionnaliteDto> listeRcFonctionnalites  = gaindeBusinessDelegate.rechercherFonctionnalite("from Fonctionnalite where 1 = 1 "+condition);
			// pour la pagination du grid 
						if (listeRcFonctionnalites!=null) {
							rcFonctionnalitesForm.setRecords(listeRcFonctionnalites.size()); 
							rcFonctionnalitesForm.setTotal(
									(int) Math.ceil((double)rcFonctionnalitesForm.getRecords() 
											/ (double)rcFonctionnalitesForm.getRows())); 
							int to = (rcFonctionnalitesForm.getRows() * rcFonctionnalitesForm.getPage());
						    int from = to - rcFonctionnalitesForm.getRows();
						    if (to > rcFonctionnalitesForm.getRecords()) {
						    	to = rcFonctionnalitesForm.getRecords();
						    }
						    listeRcFonctionnalites = listeRcFonctionnalites.subList(from, to);
						}
			rcFonctionnalitesForm.setListeRcFonctionnalites(listeRcFonctionnalites);

			if (listeRcFonctionnalites!=null && listeRcFonctionnalites.size()!=0) {

				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcFonctionnalites";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodefonction.equals("")) {
						rcFonctionnalitesForm.setNumRcCodeFonctionOB(rccodefonction);
					}
					if (!rccodeprofil.equals("")){
						rcFonctionnalitesForm.setNumListRcCodeProfil(rccodeprofil);
					}
					if (!rclibfonction.equals("")){
						rcFonctionnalitesForm.setNumRcLibFonctionOB(rclibfonction);
					}
					if (!rcordreaffichage.equals("")){
						rcFonctionnalitesForm.setNumRcOrdreAffichageOB(rcordreaffichage);
					}
				} else {
					if (ctxmenu.equals("S")){
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}else{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcFonctionnalitesForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e) {
			log.error(e.getMessage());
		}

		if (pageResult==null){
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcFonctionnalites() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcFonctionnalites" : request.getParameter(ConstManif.PAGE));

		try {
			gaindeBusinessDelegate.supprimerFonctionnalite(pk);
			List<FonctionnaliteDto> listeRcFonctionnalites = gaindeBusinessDelegate.rechercherFonctionnalite("from Fonctionnalite where 1 = 1");
			rcFonctionnalitesForm.setListeRcFonctionnalites(listeRcFonctionnalites);
			addActionError(getText(ConstErrCodRC.succefulDelete));

		} catch (EJBTransactionRolledbackException e) {
			addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
		} catch (RcEjbException e) {
			addActionError(getText(e.getMessage()));
		}
		
		return page;
	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcFonctionnalites () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcFonctionnalites" : request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		Fonctionnalite fonctionnalitesvo =gaindeBusinessDelegate.findFonctionnaliteByPrimaryKey(pk);
		rcFonctionnalitesForm.setFonctionnalites(fonctionnalitesvo);
		return page;
	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified()	throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcFonctionnalitesForm.reset();
			rcFonctionnalitesForm.setListeRcFonctionnalites(new ArrayList<Fonctionnalite>());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}

public RcFonctionnalitesForm getModel() {		
	return rcFonctionnalitesForm;
}

public String getScopeKey() {		
	return scopeKey;
}

public void setModel(RcFonctionnalitesForm form) {
	this.rcFonctionnalitesForm = form;
}

public void setScopeKey(String scope) {
	this.scopeKey = scope;
}

public RcFonctionnalitesForm getRcFonctionnalitesForm() {
	return rcFonctionnalitesForm;
}

public void setRcFonctionnalitesForm(RcFonctionnalitesForm rcFonctionnalitesForm) {
	this.rcFonctionnalitesForm = rcFonctionnalitesForm;
}
}
