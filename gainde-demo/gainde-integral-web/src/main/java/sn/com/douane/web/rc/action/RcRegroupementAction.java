package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Regroupement;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegroupementForm;



public class RcRegroupementAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegroupementForm> {

	private static final long serialVersionUID = 1L;
	private RcRegroupementForm rcRegroupementForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegroupement() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		Regroupement regroupementvo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcRegroupement" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regroupementvo = rcRegroupementForm.getNewRcRegroupementVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegroupement(regroupementvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcRegroupementForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegroupement";
		}

		return forward;
	}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegroupement() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Regroupement regroupementvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegroupement" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regroupementvo = rcRegroupementForm.getNewRcRegroupementVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegroupement(regroupementvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegroupement";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegroupement() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegroupement" :
		// request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		// On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		// R�cup�ration des crit�res saisis
		String rccoderegroup =
				(rcRegroupementForm.getNumRcCodeRegRoupRech() == null ? "" : rcRegroupementForm
						.getNumRcCodeRegRoupRech());
		String rclibelleregroup =
				(rcRegroupementForm.getNumRcLibelleRegRoupRech() == null ? "" : rcRegroupementForm
						.getNumRcLibelleRegRoupRech());

		// Condition de recherche
		if (!rccoderegroup.equals(""))
			condition += " and rcCodeRegroup LIKE '%" + rccoderegroup + "%' ";

		if (!rclibelleregroup.equals(""))
			condition += " and rcLibelleRegroup LIKE '%" + rclibelleregroup + "%' ";

		// Rafraichissement de la liste des REGROUPEMENT
		try {

			List listeRcRegroupement = null;
			listeRcRegroupement = gaindeBusinessDelegate.rechercherByWhereRegroupement("from Regroupement where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegroupement!=null) {
				rcRegroupementForm.setRecords(listeRcRegroupement.size()); 
				rcRegroupementForm.setTotal(
						(int) Math.ceil((double)rcRegroupementForm.getRecords() 
								/ (double)rcRegroupementForm.getRows())); 
				int to = (rcRegroupementForm.getRows() * rcRegroupementForm.getPage());
			    int from = to - rcRegroupementForm.getRows();
			    if (to > rcRegroupementForm.getRecords()) {
			    	to = rcRegroupementForm.getRecords();
			    }
			    listeRcRegroupement = listeRcRegroupement.subList(from, to);
			}
			rcRegroupementForm.setListeRcRegroupement(listeRcRegroupement);

			if (listeRcRegroupement != null && listeRcRegroupement.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegroupement";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccoderegroup.equals("")) {
						rcRegroupementForm.setNumRcCodeRegRoupOB(rccoderegroup);
					}
					if (!rclibelleregroup.equals("")) {
						rcRegroupementForm.setNumRcLibelleRegRoupOB(rclibelleregroup);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcRegroupementForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche REGROUPEMENT" + e.getMessage());
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
	public String supprimerRcRegroupement() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegroupement = null;

		// Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "rechercheRcRegroupement" : request
						.getParameter(ConstManif.PAGE));

		try {

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegroupement(pk);

			// Raffraichissement de la liste des REGROUPEMENT
			listeRcRegroupement = gaindeBusinessDelegate.rechercherByWhereRegroupement("from Regroupement where 1=1 ");
			rcRegroupementForm.setListeRcRegroupement(listeRcRegroupement);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de REGROUPEMENT non r�ussie !****************" + e.getMessage());
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcRegroupement () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegroupement" : request.getParameter(ConstManif.PAGE_CONTEXT));


		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		Regroupement regroupementvo = null;

		regroupementvo = gaindeBusinessDelegate.findRegroupementByPrimaryKey(pk);

		//Affichage dans le formulaire
		rcRegroupementForm.setRegroupement(regroupementvo);

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
			rcRegroupementForm.reset();
			rcRegroupementForm.setListeRcRegroupement(new ArrayList());

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
//private RegroupementKey createRegroupementKey (String pk)
//{
//RegroupementKey regroupementkey = new RegroupementKey (pk);
//
//return regroupementkey;
//}

	@Override
	public RcRegroupementForm getModel() {		
		return rcRegroupementForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegroupementForm form) {
		this.rcRegroupementForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegroupementForm getRcRegroupementForm() {
		return rcRegroupementForm;
	}


	public void setRcRegroupementForm(RcRegroupementForm rcRegroupementForm) {
		this.rcRegroupementForm = rcRegroupementForm;
	}
	
}
