package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import sn.com.douane.ejb.rc.model.keys.RegapuregapureKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcRegapuregapureForm;



public class RcRegapuregapureAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegapuregapureForm> {

	private static final long serialVersionUID = 1L;
	private RcRegapuregapureForm rcRegapuregapureForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegapuregapure() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Regapuregapure regapuregapurevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegapuregapure" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regapuregapurevo = rcRegapuregapureForm.getNewRcRegapuregapureVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegapuregapure(regapuregapurevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegapuregapureForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegapuregapure";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegapuregapure() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Regapuregapure regapuregapurevo = null;

		//On r�cup�re la cl� primaire
		/*String rctyperegapure= rcregapuregapurefb.getTNUM_LIST_RCTYPEREGAPURE_OB();
		String rcregdouapure= rcregapuregapurefb.getTNUM_LIST_RCREGDOUAPURE_OB();
		String rctyperegapurant= rcregapuregapurefb.getTNUM_LIST_RCTYPEREGAPURANT_OB();
		String rcregdouapurant= rcregapuregapurefb.getTNUM_LIST_RCREGDOUAPURANT_OB();*/
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegapuregapure" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regapuregapurevo = rcRegapuregapureForm.getNewRcRegapuregapureVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegapuregapure(regapuregapurevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegapuregapure";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegapuregapure() {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegapuregapure" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rcregdouapurant = (rcRegapuregapureForm.getNumListRcRegDouApurantRech()==null ? "" : rcRegapuregapureForm.getNumListRcRegDouApurantRech());
		String rcregdouapure = (rcRegapuregapureForm.getNumListRcRegDouApureRech()==null ? "" : rcRegapuregapureForm.getNumListRcRegDouApureRech());
		String rctyperegapurant = (rcRegapuregapureForm.getNumListRcTypeRegApurantRech()==null ? "" : rcRegapuregapureForm.getNumListRcTypeRegApurantRech());
		String rctyperegapure = (rcRegapuregapureForm.getNumListRcTypeRegApureRech()==null ? "" : rcRegapuregapureForm.getNumListRcTypeRegApureRech());

		//Condition de recherche
		if (!rcregdouapurant.equals("")&&rcregdouapurant.length()==2) {
			condition += " and rcRegDouApurant = '"+rcregdouapurant.substring(1)+"' ";
		}
		if (!rcregdouapure.equals("")&&rcregdouapure.length()==2) {
			condition += " and rcRegDouApure = '"+rcregdouapure.substring(1)+"' ";
		}
		if (!rctyperegapurant.equals("") && rcregdouapurant.length()==2) {
			condition += " and rcTypeRegApurant = '"+rctyperegapurant.substring(0,1)+"' ";
		}
		if (!rctyperegapure.equals("")&& rcregdouapure.length()==2) {
			condition += " and rcTypeRegApure = '"+rctyperegapure.substring(0,1)+"' ";
		}
		//Rafraichissement de la liste des REGAPUREGAPURE
		try
		{

			List listeRcRegapuregapure = null;
			listeRcRegapuregapure = gaindeBusinessDelegate.rechercherRegapuregapure("from Regapuregapure where 1 = 1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegapuregapure != null) {
				rcRegapuregapureForm.setRecords(listeRcRegapuregapure.size()); 
				rcRegapuregapureForm.setTotal(
						(int) Math.ceil((double)rcRegapuregapureForm.getRecords() 
								/ (double)rcRegapuregapureForm.getRows())); 
				int to = (rcRegapuregapureForm.getRows() * rcRegapuregapureForm.getPage());
			    int from = to - rcRegapuregapureForm.getRows();
			    if (to > rcRegapuregapureForm.getRecords()) {
			    	to = rcRegapuregapureForm.getRecords();
			    }
			    listeRcRegapuregapure = listeRcRegapuregapure.subList(from, to);
			}
			rcRegapuregapureForm.setListeRcRegapuregapure(listeRcRegapuregapure);

			if (listeRcRegapuregapure != null && listeRcRegapuregapure.size() != 0) {

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegapuregapure";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rcregdouapurant.equals("")) {
						rcRegapuregapureForm.setNumListRcRegDouApurantOB(rcregdouapurant);
					}
					if (!rcregdouapure.equals("")) {
						rcRegapuregapureForm.setNumListRcRegDouApureOB(rcregdouapure);
					}
					if (!rctyperegapurant.equals("")) {
						rcRegapuregapureForm.setNumListRcTypeRegApurantOB(rctyperegapurant);
					}
					if (!rctyperegapure.equals("")) {
						rcRegapuregapureForm.setNumListRcTypeRegApureOB(rctyperegapure);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcRegapuregapureForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche REGAPUREGAPURE" + e.getMessage());
		}

//		forward = page;
//		return forward;
		if (page == null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcRegapuregapure() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegapuregapure = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegapure=pkTab[0]; 
		String rcregdouapure=pkTab[1];
		String rctyperegapurant=pkTab[2]; 
		String rcregdouapurant=pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegapuregapure" : request.getParameter(ConstManif.PAGE));

		try {

			// On cr�� la cl�
			RegapuregapureKey regapuregapurekey =
					new RegapuregapureKey(rctyperegapure, rcregdouapure, rctyperegapurant, rcregdouapurant);

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegapuregapure(regapuregapurekey);

			//Raffraichissement de la liste des REGAPUREGAPURE
			listeRcRegapuregapure = gaindeBusinessDelegate.rechercherRegapuregapure("from Regapuregapure where 1 = 1 ");
			rcRegapuregapureForm.setListeRcRegapuregapure(listeRcRegapuregapure);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de REGAPUREGAPURE non r�ussie !****************"+ e.getMessage());
		}
		finally
		{
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcRegapuregapure () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegapuregapure" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegapure=pkTab[0]; 
		String rcregdouapure=pkTab[1];
		String rctyperegapurant=pkTab[2]; 
		String rcregdouapurant=pkTab[3];

			//On cr�� la cl�
		RegapuregapureKey regapuregapurekey = new RegapuregapureKey(rctyperegapure,rcregdouapure,
					rctyperegapurant, rcregdouapurant);

		//Le VO
		Regapuregapure regapuregapurevo = null;

		regapuregapurevo = gaindeBusinessDelegate.findRegapuregapureByPrimaryKey(regapuregapurekey);

		//Affichage dans le formulaire
		rcRegapuregapureForm.setRegapuregapure(regapuregapurevo);

		//Redirection
		forward = page;

		return forward;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}
		try {
			rcRegapuregapureForm.reset();
			rcRegapuregapureForm.setListeRcRegapuregapure(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}


//	/***************************************/
//	/***		     CLE PRIMAIRE		    ***/
//	/***************************************/
//private RegapuregapureKey createRegapuregapureKey (String rctyperegapure, String rcregdouapure,
//		String rctyperegapurant, String rcregdouapurant)
//{
//	
//	RegapuregapureKey regapuregapurekey = new RegapuregapureKey (
//			new RegimedouanierKey(rcregdouapure,new TyperegimedouaneKey(rctyperegapure)),
//			new RegimedouanierKey(rcregdouapurant,new TyperegimedouaneKey(rctyperegapurant)));
//
//return regapuregapurekey;
//}

	@Override
	public RcRegapuregapureForm getModel() {		
		return rcRegapuregapureForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegapuregapureForm form) {
		this.rcRegapuregapureForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegapuregapureForm getRcRegapuregapureForm() {
		return rcRegapuregapureForm;
	}


	public void setRcRegapuregapureForm(RcRegapuregapureForm rcRegapuregapureForm) {
		this.rcRegapuregapureForm = rcRegapuregapureForm;
	}
	
}
