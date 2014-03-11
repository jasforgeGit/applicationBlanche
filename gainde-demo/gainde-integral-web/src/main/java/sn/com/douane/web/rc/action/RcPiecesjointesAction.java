package sn.com.douane.web.rc.action;

import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.PieceJointe;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcPiecesjointesForm;
import tn.com.tw.java.exception.ConstErrCodRC;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcPiecesjointesAction  extends GeneralDispatchAction implements
ScopedModelDriven<RcPiecesjointesForm> {
	
	
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	private RcPiecesjointesForm rcPiecesjointesForm;
	private String scopeKey;
	
	public String enregistrerRcPiecesjointes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

	
		//Le VO
		PieceJointe piecesjointesvo ;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcPiecesjointes" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			piecesjointesvo = rcPiecesjointesForm.getNewRcPiecesjointesVO();

			//On execute la commande d'ajout
			gaindeBusinessDelegate.ajouterPiecesJointes(piecesjointesvo);

			addActionError(getText(ConstErrCodRC.succefulInsert));

			//On vide les champs du formulaire
			rcPiecesjointesForm.reset();

		

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
		page ="saisieRcPiecesjointes";
		}
		

		return page;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcPiecesjointes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		
	
		//Le VO
		PieceJointe piecesjointesvo ;

		//On recupere la cle primaire
		//String pk = rcPiecesjointesForm.getPk();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcPiecesjointes" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			piecesjointesvo = rcPiecesjointesForm.getNewRcPiecesjointesVO();

			
			
			//On execute la commande de modification
			gaindeBusinessDelegate.modifierPiecesJointes(piecesjointesvo);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			
		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			page="modificationRcPiecesjointes";
		}
		
		return page;
	}

	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcPiecesjointes () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		
	
		//Le VO
		//PieceJointe PiecesjointesVO = new PieceJointe();
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcPiecesjointes" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";
		
		//On recupere le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//Recuperation des criteres saisis
		String rccodepiecejointe = (rcPiecesjointesForm.getTNUM_RCCODEPIECEJOINTERech()==null ? "" : rcPiecesjointesForm.getTNUM_RCCODEPIECEJOINTERech());;
		String rcnaturepiecejointe = (rcPiecesjointesForm.getTNUM_LIST_RCNATUREPIECEJOINTERech()==null ? "" : rcPiecesjointesForm.getTNUM_LIST_RCNATUREPIECEJOINTERech());
		String rcdespiecejointe = (rcPiecesjointesForm.getTNUM_RCDESPIECEJOINTERech()==null ? "" : rcPiecesjointesForm.getTNUM_RCDESPIECEJOINTERech());
		String rcdatepiecejointe = (rcPiecesjointesForm.getDAT_RCDATEPIECEJOINTERech()==null ? "" : rcPiecesjointesForm.getDAT_RCDATEPIECEJOINTERech());
		
		condition = "Select PJ FROM PieceJointe PJ, NaturePieceJointe NPJ WHERE 1 = 1";

		//Condition de recherche
	    if (!rccodepiecejointe.equals("")) {
	    	condition += " and PJ.rcCodePieceJointe = '"+rccodepiecejointe+"' ";
	    }
	    if (!rcdespiecejointe.equals("")) {
	    	condition += " and PJ.rcDesPieceJointe LIKE '%"+rcdespiecejointe+"%' ";
	    }
	    if (!rcdatepiecejointe.equals("")) {
	    	condition += " and PJ.rcDatePieceJointe = '"+rcdatepiecejointe+"' ";
	    }
	    if (!rcnaturepiecejointe.equals("")) {
	    	condition += " and PJ.rcNaturePieceJointe = '"+rcnaturepiecejointe+"' ";
	    }
		condition += " and PJ.rcNaturePieceJointe = NPJ.rccodepiecejointe ";
		
		log.info("RcPiecesjointesACT.rechercherRcPiecesjointes(REQ = ) "+ condition);
	    //Rafraichissement de la liste des Piecesjointes		
		try
		{	
			//On remplit les attributs du VO			
			//PiecesjointesVO = new PieceJointe();
			
			
			
			List<PieceJointe> listeRcPiecesjointes = gaindeBusinessDelegate.rechercherByWherePieceJointe(condition);
			
			rcPiecesjointesForm.setListeRcPiecesjointes(listeRcPiecesjointes);
			
			if (listeRcPiecesjointes.size()!=0)
			{		
			    if (!ctxmenu.equals("C")) {
			    	request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			    }
			}	
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcPiecesjointes";
	
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");
												
					if (!rccodepiecejointe.equals("")) {
						rcPiecesjointesForm.setTNUM_RCCODEPIECEJOINTE_OB(rccodepiecejointe);
					}
				    if (!rcdespiecejointe.equals("")) {
				    	rcPiecesjointesForm.setTNUM_RCDESPIECEJOINTE_OB(rcdespiecejointe);
				    }
				    if (!rcdatepiecejointe.equals(""))  {
				    	rcPiecesjointesForm.setDAT_RCDATEPIECEJOINTE_OB(rcdatepiecejointe);
				    }
				    if (!rcnaturepiecejointe.equals("")) {
				    	rcPiecesjointesForm.setTNUM_LIST_RCNATUREPIECEJOINTE(rcnaturepiecejointe);
				    }
				}   
				else
					if (ctxmenu.equals("S"))
					{
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}
					else
					{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				if (!ctxmenu.equals("C")) {
					rcPiecesjointesForm.resetChampsRecherche ();
				}
			
			}
		}
		catch (Exception e)
		{	log.info("Erreur de recherche Piecesjointes");
		}
		
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	
	/***************************************/
	/***          SUPPRESSION            ***/
	/***************************************/
	public String supprimerRcPiecesjointes() throws Exception {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<PieceJointe>  listeRcPiecesjointes ;
		
		

		//Le VO
		PieceJointe PiecesjointesVO ;
		
		//Cle de lenregistrement a supprimer
		String rccodepiecejointe = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcPiecesjointes" : request.getParameter(ConstManif.PAGE));
		
		try 
		{
		
			//On remplit les attributs du VO
			PiecesjointesVO = rcPiecesjointesForm.getNewRcPiecesjointesVO();
			PiecesjointesVO.setRcCodePieceJointe(rccodepiecejointe);
			//On execute la commande de suppression
			gaindeBusinessDelegate.supprimerPiecesJointes(PiecesjointesVO);	
			
			//Raffraichissement de la liste des Piecesjointes
			listeRcPiecesjointes = gaindeBusinessDelegate.rechercherByWherePieceJointe("from PieceJointe where 1=1");
			rcPiecesjointesForm.setListeRcPiecesjointes(listeRcPiecesjointes);
	
			addActionError(getText(ConstErrCodRC.succefulDelete));		
			
		} 
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp))			
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));			
			else
				addActionError(getText(e.getMessage()));
			   
			log.info ("**************** Suppression  non reussie !****************");		
		}
		
		
		
		return page;
	}
	

	/***************************************/
	/***           AFFICHAGE             ***/
	/***************************************/
	public String afficherRcPiecesjointes ()	throws Exception
	{
		
		HttpServletRequest request = ServletActionContext.getRequest();
	
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcPiecesjointes" : request.getParameter(ConstManif.PAGE_CONTEXT));
	
		//Cle de recherche
		String rccodepiecejointe = request.getParameter(ConstManif.PK);
		
		//Objet Piecesjointes
		PieceJointe piecesjointesVO =null;
		
		piecesjointesVO = gaindeBusinessDelegate.rechercherPiecesJointe(rccodepiecejointe);
		
	
		//Affichage dans le formulaire				
		rcPiecesjointesForm.setPiecesjointes(piecesjointesVO);
		
		
		return page;	
	}
			
	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified()	throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);		
	
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
				
		
		try {
			rcPiecesjointesForm.reset();
			rcPiecesjointesForm.setListeRcPiecesjointes(new Vector());
			
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));}
			
		return page;
	}

	
	
	/***************************************/
	/***		     CLE PRIMAIRE		    ***/
	/***************************************/



	


	

	@Override
	public void setScopeKey(String key) {
		this.scopeKey = key;

		
	}


	@Override
	public String getScopeKey() {
		
		return scopeKey;
	}


	@Override
	public void setModel(RcPiecesjointesForm model) {
		this.rcPiecesjointesForm=model;
		
	}


	@Override
	public RcPiecesjointesForm getModel() {
		
		return rcPiecesjointesForm;
	}

}
