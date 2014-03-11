package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimefiscalForm;



public class RcRegimefiscalAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimefiscalForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimefiscalForm rcRegimefiscalForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimefiscal() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		RegimeFiscal regimefiscalvo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcRegimefiscal" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regimefiscalvo = rcRegimefiscalForm.getNewRcRegimefiscalVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeFiscal(regimefiscalvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcRegimefiscalForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimefiscal";
		}

		return forward;
	}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimefiscal() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		RegimeFiscal regimefiscalvo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcRegimefiscal" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regimefiscalvo = rcRegimefiscalForm.getNewRcRegimefiscalVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeFiscal(regimefiscalvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcRegimefiscal";
		}

		return forward;
	}

	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcRegimefiscal () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimefiscal" : request.getParameter(ConstManif.PAGE));
	    String page = request.getParameter(ConstManif.PAGE_CONTEXT);
	    String condition = " ";
		
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String rccoderegimefiscal = (rcRegimefiscalForm.getNumRcCodeRegimeFiscalRech()==null ? "" : rcRegimefiscalForm.getNumRcCodeRegimeFiscalRech());;
		String rclibelleregimefiscal = (rcRegimefiscalForm.getNumRcLibelleRegimeFiscalRech()==null ? "" : rcRegimefiscalForm.getNumRcLibelleRegimeFiscalRech());
//		String indregexo = (rcRegimefiscalForm.getNumIndRegExoRech()==null ? "" : rcRegimefiscalForm.getNumIndRegExoRech());;
//		String rcindsuspension = (rcRegimefiscalForm.getNumRcIndSuspensionRech()==null ? "" : rcRegimefiscalForm.getNumRcIndSuspensionRech());

		//Condition de recherche
	    if (!rccoderegimefiscal.equals("")) {
	    	condition += " and rcCodeRegimeFiscal = '"+rccoderegimefiscal+"' ";
	    }
	    if (!rclibelleregimefiscal.equals("")) {
	    	condition += " and rcLibelleRegimeFiscal LIKE '%"+rclibelleregimefiscal+"%' ";
	    }
//	    if (!indregexo.equals(""))
//	    	condition += " and INDREGEXO = '"+indregexo+"' ";
//	    
//	    if (!rcindsuspension.equals(""))
//	    	condition += " and RCINDSUSPENSION = '"+rcindsuspension+"' ";
        
		
		//Rafraichissement de la liste des Regimefiscal		
		try
		{	
			
			List listeRcRegimefiscal = null;
			listeRcRegimefiscal = gaindeBusinessDelegate.rechercherRegimeFiscal("from RegimeFiscal where 1=1 "+condition);
			// pour la pagination du grid 
			if (listeRcRegimefiscal!=null) {
				rcRegimefiscalForm.setRecords(listeRcRegimefiscal.size()); 
				rcRegimefiscalForm.setTotal(
						(int) Math.ceil((double)rcRegimefiscalForm.getRecords() 
								/ (double)rcRegimefiscalForm.getRows())); 
				int to = (rcRegimefiscalForm.getRows() * rcRegimefiscalForm.getPage());
			    int from = to - rcRegimefiscalForm.getRows();
			    if (to > rcRegimefiscalForm.getRecords()) {
			    	to = rcRegimefiscalForm.getRecords();
			    }
			    listeRcRegimefiscal = listeRcRegimefiscal.subList(from, to);
			}
			rcRegimefiscalForm.setListeRcRegimefiscal(listeRcRegimefiscal);
			
			if (listeRcRegimefiscal != null && listeRcRegimefiscal.size() != 0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegimefiscal";
	
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");
												
					if (!rccoderegimefiscal.equals("")) {
						rcRegimefiscalForm.setNumRcCodeRegimeFiscalOB(rccoderegimefiscal);
					}
				    if (!rclibelleregimefiscal.equals("")) {
				    	rcRegimefiscalForm.setNumRcLibelleRegimeFiscalOB(rclibelleregimefiscal);
				    }
//				    if (!indregexo.equals(""))
//				    	rcRegimefiscalFB.setTNUM_INDREGEXO_OB(indregexo);
//				    
//				    if (!rcindsuspension.equals(""))
//				    	rcRegimefiscalFB.setTNUM_RCINDSUSPENSION_OB(rcindsuspension);
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}
				if (!ctxmenu.equals("C")) {
					rcRegimefiscalForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche Regimefiscal");
		}	
				
//		forward = page;
//		return forward; 
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	
	/***************************************/
	/***          SUPPRESSION            ***/
	/***************************************/
	public String supprimerRcRegimefiscal() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimefiscal = null;
		
		//Cl� de l'enregistrement � supprimer
		String rccoderegimefiscal = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimefiscal" : request.getParameter(ConstManif.PAGE));
		
		try 
		{
			
			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeFiscal(rccoderegimefiscal);	
			
			//Raffraichissement de la liste des Regimefiscal
			listeRcRegimefiscal = gaindeBusinessDelegate.rechercherRegimeFiscal("from RegimeFiscal where 1=1 ");
			rcRegimefiscalForm.setListeRcRegimefiscal(listeRcRegimefiscal);
	
			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));		
			
		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**************** Suppression  non r�ussie !****************");
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;
	}
	

	/***************************************/
	/***           AFFICHAGE             ***/
	/***************************************/
	public String afficherRcRegimefiscal () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;
		
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegimefiscal" : request.getParameter(ConstManif.PAGE_CONTEXT));
		
		//Cl� de recherche
		String rccoderegimefiscal = request.getParameter(ConstManif.PK);
		
		//Objet Regimefiscal
		RegimeFiscal regimefiscalVO = null;
		regimefiscalVO = gaindeBusinessDelegate.findRegimeFiscalByPrimaryKey(rccoderegimefiscal);
		
		//Affichage dans le formulaire				
		rcRegimefiscalForm.setRegimefiscal(regimefiscalVO);
		
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
			rcRegimefiscalForm.reset();
			rcRegimefiscalForm.setListeRcRegimefiscal(new ArrayList());

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
//private RegimefiscalKey createRegimefiscalKey (String pk)
//{
//RegimefiscalKey regimefiscalkey = new RegimefiscalKey (pk);
//
//return regimefiscalkey;
//}

	@Override
	public RcRegimefiscalForm getModel() {		
		return rcRegimefiscalForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimefiscalForm form) {
		this.rcRegimefiscalForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimefiscalForm getRcRegimefiscalForm() {
		return rcRegimefiscalForm;
	}


	public void setRcRegimefiscalForm(RcRegimefiscalForm rcRegimefiscalForm) {
		this.rcRegimefiscalForm = rcRegimefiscalForm;
	}
}
