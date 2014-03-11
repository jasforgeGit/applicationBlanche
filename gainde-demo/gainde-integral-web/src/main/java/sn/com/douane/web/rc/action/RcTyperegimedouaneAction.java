package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.TypeRegimeDouane;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcTyperegimedouaneForm;



public class RcTyperegimedouaneAction extends GeneralDispatchAction implements ScopedModelDriven<RcTyperegimedouaneForm> {

	private static final long serialVersionUID = 1L;
	private RcTyperegimedouaneForm rcTyperegimedouaneForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcTyperegimedouane() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		TypeRegimeDouane typeregimedouanevo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcTyperegimedouane" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			typeregimedouanevo = rcTyperegimedouaneForm.getNewRcTyperegimedouaneVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterTypeRegimeDouane(typeregimedouanevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcTyperegimedouaneForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcTyperegimedouane";
		}

		return forward;
	}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcTyperegimedouane() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		TypeRegimeDouane typeregimedouanevo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcTyperegimedouane" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			typeregimedouanevo = rcTyperegimedouaneForm.getNewRcTyperegimedouaneVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierTypeRegimeDouane(typeregimedouanevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcTyperegimedouane";
		}

		return forward;
	}



	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcTyperegimedouane () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
	    String forward = null;
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTyperegimedouane" : request.getParameter(ConstManif.PAGE));
	    String page = request.getParameter(ConstManif.PAGE_CONTEXT);
	    String condition = " ";
		
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String rctyperegime = (rcTyperegimedouaneForm.getNumRcTypeRegimeRech()==null ? "" : rcTyperegimedouaneForm.getNumRcTypeRegimeRech());;
		String rclibelleregime = (rcTyperegimedouaneForm.getNumRcLibelleRegimeRech()==null ? "" : rcTyperegimedouaneForm.getNumRcLibelleRegimeRech());

		//Condition de recherche
	    if (!rctyperegime.equals("")) {
	    	condition += " and rcTypeRegime = '"+rctyperegime+"' ";
	    }
	    if (!rclibelleregime.equals("")) {
	    	condition += " and rcLibelleRegime LIKE '%"+rclibelleregime+"%' ";
	    }
		
		//Rafraichissement de la liste des Typeregimedouane		
		try
		{	
			
			List listeRcTyperegimedouane = null;
			listeRcTyperegimedouane = gaindeBusinessDelegate.rechercherByWhereTypeRegimeDouane("from TypeRegimeDouane where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcTyperegimedouane!=null) {
				rcTyperegimedouaneForm.setRecords(listeRcTyperegimedouane.size()); 
				rcTyperegimedouaneForm.setTotal(
						(int) Math.ceil((double)rcTyperegimedouaneForm.getRecords() 
								/ (double)rcTyperegimedouaneForm.getRows())); 
				int to = (rcTyperegimedouaneForm.getRows() * rcTyperegimedouaneForm.getPage());
			    int from = to - rcTyperegimedouaneForm.getRows();
			    if (to > rcTyperegimedouaneForm.getRecords()) {
			    	to = rcTyperegimedouaneForm.getRecords();
			    }
			    listeRcTyperegimedouane = listeRcTyperegimedouane.subList(from, to);
			}
			rcTyperegimedouaneForm.setListeRcTyperegimedouane(listeRcTyperegimedouane);
			
			if (listeRcTyperegimedouane != null && listeRcTyperegimedouane.size() != 0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcTyperegimedouane";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rctyperegime.equals("")) {
						rcTyperegimedouaneForm.setNumRcTypeRegimeOB(rctyperegime);
					}
					if (!rclibelleregime.equals("")) {
						rcTyperegimedouaneForm.setNumRcLibelleRegime(rclibelleregime);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}
				if (!ctxmenu.equals("C")) {
					rcTyperegimedouaneForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche Typeregimedouane");
		}
		if (page == null) {
			return SUCCESS;
		} else {
			return page;
		}
	}

	
	/***************************************/
	/***          SUPPRESSION            ***/
	/***************************************/
	public String supprimerRcTyperegimedouane() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcTyperegimedouane = null;

		// Cl� de l'enregistrement � supprimer
		String rctyperegime = request.getParameter(ConstManif.PK);

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "rechercheRcTyperegimedouane" : request
						.getParameter(ConstManif.PAGE));

		try {

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerTypeRegimeDouane(rctyperegime);

			// Raffraichissement de la liste des Typeregimedouane
			listeRcTyperegimedouane =
					gaindeBusinessDelegate.rechercherByWhereTypeRegimeDouane("from TypeRegimeDouane where 1=1 ");
			rcTyperegimedouaneForm.setListeRcTyperegimedouane(listeRcTyperegimedouane);

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
	public String afficherRcTyperegimedouane () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;
		
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcTyperegimedouane" : request.getParameter(ConstManif.PAGE_CONTEXT));
	
		
		//Cl� de recherche
		String rctyperegime = request.getParameter(ConstManif.PK);
		
		
		//Objet Typeregimedouane
		TypeRegimeDouane TyperegimedouaneVO = null;
		TyperegimedouaneVO = gaindeBusinessDelegate.findTypeRegimeDouaneByPrimaryKey(rctyperegime);
		
		
		//Affichage dans le formulaire				
		rcTyperegimedouaneForm.setTyperegimedouane(TyperegimedouaneVO);
		
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
			rcTyperegimedouaneForm.reset();
			rcTyperegimedouaneForm.setListeRcTyperegimedouane(new ArrayList());
			
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));

		} finally {
			
			forward = page;
		}
		return forward;
	}

	@Override
	public RcTyperegimedouaneForm getModel() {		
		return rcTyperegimedouaneForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcTyperegimedouaneForm form) {
		this.rcTyperegimedouaneForm = form;

	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcTyperegimedouaneForm getRcTyperegimedouaneForm() {
		return rcTyperegimedouaneForm;
	}

	public void setRcTyperegimedouaneForm(RcTyperegimedouaneForm rcTyperegimedouaneForm) {
		this.rcTyperegimedouaneForm = rcTyperegimedouaneForm;
	}

}
