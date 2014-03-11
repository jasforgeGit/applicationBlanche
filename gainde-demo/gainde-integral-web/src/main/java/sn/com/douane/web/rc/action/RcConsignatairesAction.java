package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.ConsignataireDto;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcConsignatairesForm;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;


public class RcConsignatairesAction extends GeneralDispatchAction implements SessionAware,ScopedModelDriven<RcConsignatairesForm>{


	private static final long serialVersionUID = 1L;
	private RcConsignatairesForm rcConsignatairesForm;
	private String scopeKey;
	private Map<String, Object> session;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcConsignataires() {

		HttpServletRequest request = ServletActionContext.getRequest();

		// La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcConsignataires"
				: request.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			Consignataire consignatairesvo = rcConsignatairesForm
					.getNewRcConsignatairesVO();
			int valuePpm = gaindeBusinessDelegate
					.ConsVerifierExistencePpm(consignatairesvo);
			int valueNinea = gaindeBusinessDelegate
					.ConsVerifierExistenceNinea(consignatairesvo);
			int valueCreditaire = gaindeBusinessDelegate
					.ConsVerifierExistanceCreditaire(consignatairesvo);
			if (valuePpm == 1) {
				if (valueNinea == 1) {
					if (valueCreditaire == 1) {
						// On ex�cute la commande d'ajout
						gaindeBusinessDelegate.ajouterConsignataire(consignatairesvo);
						if (page.equals("saisieRcPpm")) {
							RcPpmForm rcPpmForm = (RcPpmForm) request
									.getSession().getAttribute("rcPpmForm");
							rcPpmForm.setNumListRcCodeConsignataire(consignatairesvo
											.getRcCodeConsignataire());
							addActionError(getText(ConstErrCodRC.succefulInsertTable," du consignataire "));
						} else {
							addActionError(getText(ConstErrCodRC.succefulInsert));
						}
					} else{
						addActionError(getText(ConstErrCodRC.ppmWithoutCreditaire));
					}
				} else{
					addActionError(getText(ConstErrCodRC.ppmWithoutNinea));
				}
			} else{
				addActionError(getText(ConstErrCodRC.PpmDoesNotExist));
			}

			// On vide les champs du formulaire
			rcConsignatairesForm.reset();
			// On forward si succes

		} catch (Exception e) {
			if (page.equals("saisieRcPpm")) {
				page = "saisieRcConsignatairesppm";
			}
			addActionError(getText(e.getMessage()));
		}
		return page;
	}

	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcConsignataires() {

		HttpServletRequest request = ServletActionContext.getRequest();

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcConsignataires" : request.getParameter(ConstManif.PAGE));
		try{
			//On remplit les attributs du VO
			Consignataire consignatairesvo = rcConsignatairesForm.getNewRcConsignatairesVO();
			//On ex�cute la commande de modification
            gaindeBusinessDelegate.modifierConsignataire(consignatairesvo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));

		}catch (Exception e){
			addActionError(getText(e.getMessage()));
			//On forward
			page = "modificationRcConsignataires";
		}
		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcConsignataires() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodeconsignataire = (rcConsignatairesForm.getNumRcCodeConsignataireRech()==null ? "" : rcConsignatairesForm.getNumRcCodeConsignataireRech());
		String rccodeppm = (rcConsignatairesForm.getNumListRcCodePPMRech()==null ? "" : rcConsignatairesForm.getNumListRcCodePPMRech());
		String rcdatecreationconsig = (rcConsignatairesForm.getDatRcDateCreationConsigRech()==null ? "" : rcConsignatairesForm.getDatRcDateCreationConsigRech());
		String rcdatesuspension = (rcConsignatairesForm.getDatRcDateSuspensionRech()==null ? "" : rcConsignatairesForm.getDatRcDateSuspensionRech());
		if (!rccodeconsignataire.equals("")){
			condition += " and rcCodeConsignataire LIKE '%"+rccodeconsignataire+"%' ";
		}
		if (!rccodeppm.equals("")){
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcdatecreationconsig.equals("")){
			condition += " and rcDateCreationConsig = '"+sysEnv.strToDate(rcdatecreationconsig)+"'";
		}
		if (!rcdatesuspension.equals("")){
			condition += " and rcDateSuspension = '"+sysEnv.strToDate(rcdatesuspension)+"' ";
		}
		try
		{
			List<ConsignataireDto> listeRcConsignataires = gaindeBusinessDelegate.rechercherConsignataire("from Consignataire where 1 = 1 "+condition);
			// pour la pagination du grid 
						if (listeRcConsignataires!=null) {
							rcConsignatairesForm.setRecords(listeRcConsignataires.size()); 
							rcConsignatairesForm.setTotal(
									(int) Math.ceil((double)rcConsignatairesForm.getRecords() 
											/ (double)rcConsignatairesForm.getRows())); 
							int to = (rcConsignatairesForm.getRows() * rcConsignatairesForm.getPage());
						    int from = to - rcConsignatairesForm.getRows();
						    if (to > rcConsignatairesForm.getRecords()) {
						    	to = rcConsignatairesForm.getRecords();
						    }
						    listeRcConsignataires = listeRcConsignataires.subList(from, to);
						}
			rcConsignatairesForm.setListeRcConsignataires(listeRcConsignataires);

			if (listeRcConsignataires!=null && listeRcConsignataires.size()!=0) {

				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcConsignataires";
					rcConsignatairesForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeconsignataire.equals("")){
						rcConsignatairesForm.setNumRcCodeConsignataireOB(rccodeconsignataire);
					}
					if (!rccodeppm.equals("")){
						rcConsignatairesForm.setNumListRcCodePPM(rccodeppm);
					}
					if (!rcdatecreationconsig.equals("")){
						rcConsignatairesForm.setDatRcDateCreationConsig(rcdatecreationconsig);
					}
					if (!rcdatesuspension.equals("")){
						rcConsignatairesForm.setDatRcDateSuspension(rcdatesuspension);
					}
				} else {
					if (ctxmenu.equals("S")){
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcConsignatairesForm.resetChampsRecherche ();
				}

			}
		}catch (Exception e){	
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
	public String supprimerRcConsignataires() {
		HttpServletRequest request = ServletActionContext.getRequest();
		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcConsignataires" : request.getParameter(ConstManif.PAGE));

		try {
            gaindeBusinessDelegate.supprimerConsignataire(pk);
			//Raffraichissement de la liste des CONSIGNATAIRES
			List<ConsignataireDto> listeRcConsignataires = gaindeBusinessDelegate.rechercherConsignataire("from Consignataire where 1 = 1");
			rcConsignatairesForm.setListeRcConsignataires(listeRcConsignataires);
			addActionError(getText(ConstErrCodRC.succefulDelete));

		} catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp)){
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else{
				addActionError(getText(e.getMessage()));
			}
		}
		return page;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcConsignataires ()throws Exception{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcConsignataires" : request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		Consignataire consignatairesvo =gaindeBusinessDelegate.findConsignataireByPrimaryKey(pk);
		rcConsignatairesForm.setConsignataires(consignatairesvo);
		return page;
	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() {
		HttpServletRequest request = ServletActionContext.getRequest();

		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcConsignatairesForm.reset();
			rcConsignatairesForm.setListeRcConsignataires(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}
	@Override
	public RcConsignatairesForm getModel() {		
		return rcConsignatairesForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcConsignatairesForm form) {
		this.rcConsignatairesForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcConsignatairesForm getRcConsignatairesForm() {
		return rcConsignatairesForm;
	}


	public void setRcConsignatairesForm(RcConsignatairesForm rcConsignatairesForm) {
		this.rcConsignatairesForm = rcConsignatairesForm;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}	

}
