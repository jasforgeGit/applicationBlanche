package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.SoumissionCreditaireDto;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcSoumissioncreditaireForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;


public class RcSoumissioncreditaireAction extends GeneralDispatchAction implements ScopedModelDriven<RcSoumissioncreditaireForm> {

	private static final long serialVersionUID = 1L;
	private RcSoumissioncreditaireForm rcSoumissioncreditaireForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcSoumissioncreditaire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcSoumissioncreditaire" : request.getParameter(ConstManif.PAGE));

		try {
			SoumissionCreditaire soumissioncreditairevo = rcSoumissioncreditaireForm.getNewRcSoumissioncreditaireVO();
			gaindeBusinessDelegate.ajouterSoumissionCreditaire(soumissioncreditairevo);
			addActionError(getText(ConstErrCodRC.succefulInsert));
			rcSoumissioncreditaireForm.reset();
			forward = page;
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcSoumissioncreditaire";
		}
		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcSoumissioncreditaire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcSoumissioncreditaire" : request.getParameter(ConstManif.PAGE));

		try{
			SoumissionCreditaire soumissioncreditairevo = rcSoumissioncreditaireForm.getNewRcSoumissioncreditaireVO();
			gaindeBusinessDelegate.modifierSoumissionCreditaire(soumissioncreditairevo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));
		}catch (Exception e){
			addActionError(getText(e.getMessage()));
			page = "modificationRcSoumissioncreditaire";
		}
		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcSoumissioncreditaire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodecreditaire = (rcSoumissioncreditaireForm.getNumListRcCodeCreditaireRech()==null ? "" : rcSoumissioncreditaireForm.getNumListRcCodeCreditaireRech());
		String rccodeindicateur = (rcSoumissioncreditaireForm.getNumListRcCodeIndicateurRech()==null ? "" : rcSoumissioncreditaireForm.getNumListRcCodeIndicateurRech());

		//Condition de recherche
		if (!rccodecreditaire.equals("")){
			condition += " and rcCodeCreditaire LIKE '%"+rccodecreditaire+"%' ";
		}
		if (!rccodeindicateur.equals("")){
			condition += " and rcCodeIndicateur LIKE '%"+rccodeindicateur+"%' ";
		}
		try {

			List<SoumissionCreditaireDto> listeRcSoumissioncreditaire = gaindeBusinessDelegate
					.rechercherSoumissionCreditaire("from SoumissionCreditaire where 1=1"+condition);
			// pour la pagination du grid 
			if (listeRcSoumissioncreditaire!=null) {
				rcSoumissioncreditaireForm.setRecords(listeRcSoumissioncreditaire.size()); 
				rcSoumissioncreditaireForm.setTotal(
						(int) Math.ceil((double)rcSoumissioncreditaireForm.getRecords() 
								/ (double)rcSoumissioncreditaireForm.getRows())); 
				int to = (rcSoumissioncreditaireForm.getRows() * rcSoumissioncreditaireForm.getPage());
			    int from = to - rcSoumissioncreditaireForm.getRows();
			    if (to > rcSoumissioncreditaireForm.getRecords()) {
			    	to = rcSoumissioncreditaireForm.getRecords();
			    }
			    listeRcSoumissioncreditaire = listeRcSoumissioncreditaire.subList(from, to);
			}
			rcSoumissioncreditaireForm.setListeRcSoumissioncreditaire(listeRcSoumissioncreditaire);

			if (listeRcSoumissioncreditaire!=null && listeRcSoumissioncreditaire.size()!=0){

				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcSoumissioncreditaire";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodecreditaire.equals("")){
						rcSoumissioncreditaireForm.setNumListRcCodeCreditaireOB(rccodecreditaire);
					}
					if (!rccodeindicateur.equals("")){
						rcSoumissioncreditaireForm.setNumListRcCodeIndicateurOB(rccodeindicateur);
					}
				} else {
					if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcSoumissioncreditaireForm.resetChampsRecherche ();
				}
			}
		} catch (Exception e)		{	
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
	public String supprimerRcSoumissioncreditaire() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodeindicateur= pkTab[0]; 
		String rccodecreditaire= pkTab[1];
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcSoumissioncreditaire" : request.getParameter(ConstManif.PAGE));

		try
		{
			gaindeBusinessDelegate.supprimerSoumissionCreditaire(rccodeindicateur, rccodecreditaire);
			List<SoumissionCreditaireDto> listeRcSoumissioncreditaire = gaindeBusinessDelegate.rechercherSoumissionCreditaire("from SoumissionCreditaire");
			rcSoumissioncreditaireForm.setListeRcSoumissioncreditaire(listeRcSoumissioncreditaire);
			addActionError(getText(ConstErrCodRC.succefulDelete));

		}
		catch (EJBTransactionRolledbackException e) {
			addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
		}
		catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcSoumissioncreditaire () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcSoumissioncreditaire" : request.getParameter("pageContext"));
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodeindicateur= pkTab[0]; 
		String rccodecreditaire= pkTab[1];
		SoumissionCreditaire soumissioncreditairevo = gaindeBusinessDelegate.findSoumissionCreditaireByPrimaryKey(rccodeindicateur, rccodecreditaire);
		rcSoumissioncreditaireForm.setSoumissioncreditaire(soumissioncreditairevo);
		return page;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcSoumissioncreditaireForm.reset();
			rcSoumissioncreditaireForm.setListeRcSoumissioncreditaire(new ArrayList<SoumissionCreditaire>());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}

@Override
public RcSoumissioncreditaireForm getModel() {		
	return rcSoumissioncreditaireForm;
}


@Override
public String getScopeKey() {		
	return scopeKey;
}


@Override
public void setModel(RcSoumissioncreditaireForm form) {
	this.rcSoumissioncreditaireForm = form;
	
}

@Override
public void setScopeKey(String scope) {
	this.scopeKey = scope;
	
}


public RcSoumissioncreditaireForm getRcSoumissioncreditaireForm() {
	return rcSoumissioncreditaireForm;
}


public void setRcSoumissioncreditaireForm(RcSoumissioncreditaireForm rcSoumissioncreditaireForm) {
	this.rcSoumissioncreditaireForm = rcSoumissioncreditaireForm;
}
}
