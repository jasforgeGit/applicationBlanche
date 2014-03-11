package sn.com.douane.web.rc.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;
import sn.com.douane.ejb.rc.model.keys.RegimeDouanierKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcRegimedouanierForm;



public class RcRegimedouanierAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimedouanierForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimedouanierForm rcRegimedouanierForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimedouanier() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDouanier regimedouaniervo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegimedouanier" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimedouaniervo = rcRegimedouanierForm.getNewRcRegimedouanierVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeDouanier(regimedouaniervo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimedouanierForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimedouanier";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimedouanier() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDouanier regimedouaniervo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegimedouanier" : request.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regimedouaniervo = rcRegimedouanierForm.getNewRcRegimedouanierVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeDouanier(regimedouaniervo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcRegimedouanier";
		}

		return forward;
	}

	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcRegimedouanier() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
	    String forward = null;
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedouanier" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";
		
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String rccoderegimedouanier = (rcRegimedouanierForm.getNumRcCodeRegimeDouanierRech()==null ? "" : rcRegimedouanierForm.getNumRcCodeRegimeDouanierRech());;
		String rctyperegime = (rcRegimedouanierForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimedouanierForm.getNumListRcTypeRegimeRech());
		String rclibelleregimedouanier = (rcRegimedouanierForm.getNumRcLibelleRegimeDouanierRech()==null ? "" : rcRegimedouanierForm.getNumRcLibelleRegimeDouanierRech());

		//Condition de recherche
	    if (!rccoderegimedouanier.equals("")) {
	    	condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
	    }
	    if (!rctyperegime.equals("")) {
	    	condition += " and rcTypeRegime = '"+rctyperegime+"' ";
	    }
	    if (!rclibelleregimedouanier.equals("")) {
	    	condition += " and rcLibelleRegimeDouanier LIKE '%"+rclibelleregimedouanier+"%' ";
	    }
		
		//Rafraichissement de la liste des Regimedouanier		
		try {

			List listeRcRegimedouanier = null;
			listeRcRegimedouanier = gaindeBusinessDelegate.rechercherRegimeDouanier("from RegimeDouanier where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegimedouanier!=null) {
				rcRegimedouanierForm.setRecords(listeRcRegimedouanier.size()); 
				rcRegimedouanierForm.setTotal(
						(int) Math.ceil((double)rcRegimedouanierForm.getRecords() 
								/ (double)rcRegimedouanierForm.getRows())); 
				int to = (rcRegimedouanierForm.getRows() * rcRegimedouanierForm.getPage());
			    int from = to - rcRegimedouanierForm.getRows();
			    if (to > rcRegimedouanierForm.getRecords()) {
			    	to = rcRegimedouanierForm.getRecords();
			    }
			    listeRcRegimedouanier = listeRcRegimedouanier.subList(from, to);
			}
			rcRegimedouanierForm.setListeRcRegimedouanier(listeRcRegimedouanier);

			if (listeRcRegimedouanier != null && listeRcRegimedouanier.size() != 0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegimedouanier";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccoderegimedouanier.equals("")) {
						rcRegimedouanierForm.setNumRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					if (!rctyperegime.equals("")) {
						rcRegimedouanierForm.setNumListRcTypeRegimeOB(rctyperegime);
					}
					if (!rclibelleregimedouanier.equals("")) {
						rcRegimedouanierForm.setNumRcLibelleRegimeDouanier(rclibelleregimedouanier);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}
				if (!ctxmenu.equals("C")) {
					rcRegimedouanierForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche Regimedouanier");
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
	public String supprimerRcRegimedouanier() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimedouanier = null;
		
		//Cl� de l'enregistrement � supprimer
		String []rccoderegimedouanierPk = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rccoderegimedouanier = rccoderegimedouanierPk[1];
		String rctyperegime = rccoderegimedouanierPk[0];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedouanier" : request.getParameter(ConstManif.PAGE));
		
		try 
		{
			//On cr�� la cl�
			RegimeDouanierKey regimedouanierKey = new RegimeDouanierKey (rctyperegime, rccoderegimedouanier);

			//On remplit les attributs du VO
			//RegimedouanierVO = rcRegimedouanierFB.getNewRcRegimedouanierVO();
			
			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeDouanier(regimedouanierKey);	
			
			//Rafraichissement de la liste des Regimedouanier
			listeRcRegimedouanier = gaindeBusinessDelegate.rechercherRegimeDouanier("from RegimeDouanier where 1=1 ");
			rcRegimedouanierForm.setListeRcRegimedouanier(listeRcRegimedouanier);
	
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
	public String afficherRcRegimedouanier () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;
		
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegimedouanier" : request.getParameter(ConstManif.PAGE_CONTEXT));
		
		//Cl� de recherche
		String[] pkRegimedouanier = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rctyperegime = pkRegimedouanier[0];
		String rccoderegimedouanier = pkRegimedouanier[1];
		
		//On cr�� la cl�
		RegimeDouanierKey regimedouanierKey = new RegimeDouanierKey (rctyperegime, rccoderegimedouanier);
		
		//Objet Regimedouanier
		RegimeDouanier RegimedouanierVO = null;
		RegimedouanierVO = gaindeBusinessDelegate.findRegimeDouanierByPrimaryKey(regimedouanierKey);
		
		//Affichage dans le formulaire				
		rcRegimedouanierForm.setRegimedouanier(RegimedouanierVO);
		
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
			rcRegimedouanierForm.reset();
			rcRegimedouanierForm.setListeRcRegimedouanier(new ArrayList());
			
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
//private RegimedouanierKey createRegimedouanierKey (String pk, TyperegimedouaneKey typeregimedouaneKey)
//{
//RegimedouanierKey regimedouanierkey = new RegimedouanierKey (pk,typeregimedouaneKey);
//
//return regimedouanierkey;
//}

	@Override
	public RcRegimedouanierForm getModel() {		
		return rcRegimedouanierForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimedouanierForm form) {
		this.rcRegimedouanierForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimedouanierForm getRcRegimedouanierForm() {
		return rcRegimedouanierForm;
	}


	public void setRcRegimedouanierForm(RcRegimedouanierForm rcRegimedouanierForm) {
		this.rcRegimedouanierForm = rcRegimedouanierForm;
	}
}
