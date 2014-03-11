package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Regime;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimeForm;



public class RcRegimeAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimeForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimeForm rcRegimeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Regime regimevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegime" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimevo = rcRegimeForm.getNewRcRegimeVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegime(regimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimeForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegime";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Regime regimevo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegime" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimevo = rcRegimeForm.getNewRcRegimeVO();


			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegime(regimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegime";
		}

		return forward;
	}


	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcRegime () throws Exception {
	    
		HttpServletRequest request = ServletActionContext.getRequest();
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegime" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";
		
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String rccoderegimedouanier = (rcRegimeForm.getNumListRcCodeRegimeDouanierRech() ==null ? "" : rcRegimeForm.getNumListRcCodeRegimeDouanierRech());;
		String rctyperegime = (rcRegimeForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimeForm.getNumListRcTypeRegimeRech());
		String rccoderegimefiscal = (rcRegimeForm.getNumListRcCodeRegimeFiscalRech()==null ? "" : rcRegimeForm.getNumListRcCodeRegimeFiscalRech());
		String rclibelleregime = (rcRegimeForm.getNumRcLibelleRegimeRech() ==null ? "" : rcRegimeForm.getNumRcLibelleRegimeRech());

		//Condition de recherche
	    if (!rccoderegimedouanier.equals("")) {
	    	condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
	    }
	    if (!rctyperegime.equals("")) {
	    	condition += " and rcTypeRegime = '"+rctyperegime+"' ";
	    }
	    if (!rccoderegimefiscal.equals("")) {
	    	condition += " and rcCodeRegimeFiscal = '"+rccoderegimefiscal+"' ";
	    }
	    if (!rclibelleregime.equals("")) {
	    	condition += " and rcLibelleRegime LIKE '%"+rclibelleregime+"%' ";
	    }
		
		//Rafraichissement de la liste des Regimedouanier		
		try
		{	
			
			List listeRcRegime = null;
			listeRcRegime = gaindeBusinessDelegate.rechercherRegime("from Regime where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegime!=null) {
				rcRegimeForm.setRecords(listeRcRegime.size()); 
				rcRegimeForm.setTotal(
						(int) Math.ceil((double)rcRegimeForm.getRecords() 
								/ (double)rcRegimeForm.getRows())); 
				int to = (rcRegimeForm.getRows() * rcRegimeForm.getPage());
			    int from = to - rcRegimeForm.getRows();
			    if (to > rcRegimeForm.getRecords()) {
			    	to = rcRegimeForm.getRecords();
			    }
			    listeRcRegime = listeRcRegime.subList(from, to);
			}
			rcRegimeForm.setListeRcRegime(listeRcRegime);
			
			if (listeRcRegime != null && listeRcRegime.size()!=0)
			{		
			    if (!ctxmenu.equals("C")) {
			    	request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			    }
			}	
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcRegime";
	
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");
												
					if (!rccoderegimedouanier.equals("")) {
						rcRegimeForm.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
				    if (!rctyperegime.equals("")) {
				    	rcRegimeForm.setNumListRcTypeRegimeOB(rctyperegime);
				    }
				    if (!rclibelleregime.equals("")) {
				    	rcRegimeForm.setNumRcLibelleRegimeOB(rclibelleregime);
				    }
				    if (!rccoderegimefiscal.equals("")) {
				    	rcRegimeForm.setNumListRcCodeRegimeFiscalOB(rccoderegimefiscal);
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
					rcRegimeForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche Regime");
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
	public String supprimerRcRegimedouanier() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegime = null;
		
		//Cl� de l'enregistrement � supprimer
		String []rccoderegimePk = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rctyperegime = rccoderegimePk[0];
		String rccoderegimedouanier = rccoderegimePk[1];
		String rccoderegimefiscal = rccoderegimePk[2];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegime" : request.getParameter(ConstManif.PAGE));
		
		try {

			//On remplit les attributs du VO
			//RegimeVO = RcRegimeFB.getNewRcRegimeVO();
			
			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegime(rctyperegime, rccoderegimedouanier, rccoderegimefiscal);	
			
			//Rafraichissement de la liste des Regimedouanier
			listeRcRegime = gaindeBusinessDelegate.rechercherRegime("from Regime where 1=1 ");
			rcRegimeForm.setListeRcRegime(listeRcRegime);
	
			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));		
			
		} 
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {		
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));			
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**************** Suppression  non r�ussie !****************");		
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
	/***           AFFICHAGE             ***/
	/***************************************/
	public String afficherRcRegime () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;
		
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegime" : request.getParameter(ConstManif.PAGE_CONTEXT));
		
		//Cl� de recherche
		String []rccoderegimePk = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rctyperegime = rccoderegimePk[0];
		String rccoderegimedouanier = rccoderegimePk[1];
		String rccoderegimefiscal = rccoderegimePk[2];

		//Objet Regimedouanier
		Regime RegimeVO = null;
		RegimeVO = gaindeBusinessDelegate.rechercherRegime(rctyperegime, rccoderegimedouanier, rccoderegimefiscal);
		
		//Affichage dans le formulaire				
		rcRegimeForm.setRegime(RegimeVO);
		
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
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		try {
			rcRegimeForm.reset();
			rcRegimeForm.setListeRcRegime(new ArrayList());
			
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
//private RegimeKey createRegimeKey (RegimefiscalKey regimefiscalKey,RegimedouanierKey regimedouanierKey)
//{
//RegimeKey regimekey = new RegimeKey (regimefiscalKey,regimedouanierKey);
//
//return regimekey;
//}
	@Override
	public RcRegimeForm getModel() {		
		return rcRegimeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimeForm form) {
		this.rcRegimeForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimeForm getRcRegimeForm() {
		return rcRegimeForm;
	}


	public void setRcRegimeForm(RcRegimeForm rcRegimeForm) {
		this.rcRegimeForm = rcRegimeForm;
	}
}
