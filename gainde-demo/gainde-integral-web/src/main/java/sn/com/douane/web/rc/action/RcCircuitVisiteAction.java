package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.CircuitVisite;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcCircuitVisiteForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcCircuitVisiteAction extends GeneralDispatchAction implements ScopedModelDriven<RcCircuitVisiteForm> {
	
	
	private RcCircuitVisiteForm rcCircuitVisiteForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcCircuitvisite() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		//La classe des commandes
		//ReferencesCommunsCmd referencesCommunsCmd = new ReferencesCommunsCmd();

		//Le Form Bean
		//RcCircuitvisiteFB rccircuitvisitefb = (RcCircuitvisiteFB) form;

		//Le VO
		CircuitVisite circuitvisitevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "saisieRcCircuitvisite" : request.getParameter(ConstManif.PAGE_CONTEXT));

		try
		{
			//On remplit les attributs du VO
			circuitvisitevo = rcCircuitVisiteForm.getNewRcCircuitvisiteVO();

			//On execute la commande d'ajout
			gaindeBusinessDelegate.ajouterCircuitVisite(circuitvisitevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcCircuitVisiteForm.reset();

			

		}
		catch (Exception e)
		{
				addActionError(getText("name", e.getMessage()));
			page="saisieRcCircuitvisite";
		}
		

		return page;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcCircuitvisite() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();


		//Le VO
		CircuitVisite circuitvisitevo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcCircuitvisite" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			circuitvisitevo = rcCircuitVisiteForm.getNewRcCircuitvisiteVO();

			
			//On execute la commande de modification
			gaindeBusinessDelegate.modifierCircuitVisite(circuitvisitevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			

		}
		catch (Exception e)
		{
				addActionError(getText("name", e.getMessage()));
			//On forward
			page ="modificationRcCircuitvisite";
		}
		

		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcCircuitvisite() throws Exception {


		HttpServletRequest request = ServletActionContext.getRequest();

		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On recupere le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//Recuperation des criteres saisis
		String rccodecircuit = (rcCircuitVisiteForm.getTNUM_RCCODECIRCUITRech()==null ? "" : rcCircuitVisiteForm.getTNUM_RCCODECIRCUITRech());
		String rcdescircuitvisite = (rcCircuitVisiteForm.getTNUM_RCDESCIRCUITVISITERech()==null ? "" : rcCircuitVisiteForm.getTNUM_RCDESCIRCUITVISITERech());

		//Condition de recherche
		if (!rccodecircuit.equals("")) {
			condition += " and rccodecircuit = '"+rccodecircuit+"' ";
		}
		if (!rcdescircuitvisite.equals("")) {
			condition += " and rcdescircuitvisite = '"+rcdescircuitvisite+"' ";
		}
		//Rafraichissement de la liste des CIRCUITVISITE
		try
		{

			List listeRcCircuitvisite = null;
			listeRcCircuitvisite = gaindeBusinessDelegate.rechercherByWhereCircuitVisite("from CircuitVisite where 1=1 "+condition);

			
			// pour la pagination du grid 
			if (listeRcCircuitvisite!=null) {
				rcCircuitVisiteForm.setRecords(listeRcCircuitvisite.size()); 
				rcCircuitVisiteForm.setTotal(
						(int) Math.ceil((double)rcCircuitVisiteForm.getRecords() 
								/ (double)rcCircuitVisiteForm.getRows())); 
				int to = (rcCircuitVisiteForm.getRows() * rcCircuitVisiteForm.getPage());
			    int from = to - rcCircuitVisiteForm.getRows();
			    if (to > rcCircuitVisiteForm.getRecords()) {
			    	to = rcCircuitVisiteForm.getRecords();
			    }
			    listeRcCircuitvisite = listeRcCircuitvisite.subList(from, to);
			}
		
			
			rcCircuitVisiteForm.setListeRcCircuitvisite(listeRcCircuitvisite);

			if (listeRcCircuitvisite != null && listeRcCircuitvisite.size()!=0)

			{
				//page = "rechercheRcCircuitvisite";

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcCircuitvisite";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodecircuit.equals("")) {
						rcCircuitVisiteForm.setTNUM_RCCODECIRCUIT_OB(rccodecircuit);
					}
					if (!rcdescircuitvisite.equals("")) {
						rcCircuitVisiteForm.setTNUM_RCDESCIRCUITVISITE_OB(rcdescircuitvisite);
					}
				}
				else
					if (ctxmenu.equals("S"))
					{
						//page = "rechercheRcCircuitvisite";
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}
					else
					{
						//page = "rechercheRcCircuitvisite";
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

				if (!ctxmenu.equals("C")) {
					rcCircuitVisiteForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche CIRCUITVISITE");
		}
		

		
		if (page == null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcCircuitvisite() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List listeRcCircuitvisite = null;

		//Cle de l'enregistrement a supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcCircuitvisite" : request.getParameter(ConstManif.PAGE_CONTEXT));

		try
		{

			

			//On execute la commande de suppression
			gaindeBusinessDelegate.supprimerCircuitVisite(pk);

			//Raffraichissement de la liste des CIRCUITVISITE
			listeRcCircuitvisite = gaindeBusinessDelegate.rechercherByWhereCircuitVisite("from CircuitVisite where 1=1 ");
			rcCircuitVisiteForm.setListeRcCircuitvisite(listeRcCircuitvisite);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de CIRCUITVISITE non reussie !****************");
		}
	

		return page;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcCircuitvisite()
	throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
		

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcCircuitvisite" : request.getParameter(ConstManif.PAGE_CONTEXT));

	
		//Cle de recherche
		String pk = request.getParameter(ConstManif.PK);

			

		//Le VO
		CircuitVisite circuitvisitevo = null;

		circuitvisitevo = gaindeBusinessDelegate.rechercherCircuitVisite(pk);

	

		//Affichage dans le formulaire
		rcCircuitVisiteForm.setCircuitvisite(circuitvisitevo);

		

		return page;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified()
		throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		try {
			rcCircuitVisiteForm.reset();
			rcCircuitVisiteForm.setListeRcCircuitvisite(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			
		}

		return page;
	}


	@Override
	public RcCircuitVisiteForm getModel() {		
		return rcCircuitVisiteForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcCircuitVisiteForm form) {
		this.rcCircuitVisiteForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcCircuitVisiteForm getRcCircuitVisiteForm() {
		return rcCircuitVisiteForm;
	}


	public void setRcCircuitVisiteForm(RcCircuitVisiteForm rcCircuitVisiteForm) {
		this.rcCircuitVisiteForm = rcCircuitVisiteForm;
	}

}
