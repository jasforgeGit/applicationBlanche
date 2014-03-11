package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Classe;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcClasseForm;

/**
 * The Class RcClasseAction.
 *
 * @author kerfahi ghazi
 */
public class RcClasseAction extends GeneralDispatchAction implements ScopedModelDriven<RcClasseForm> {

	private static final long serialVersionUID = 1L;
	private RcClasseForm rcClasseForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcClasse() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		//Le VO
		Classe classevo ;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcClasse" : request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			classevo = rcClasseForm.getNewRcClasseVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterClasse(classevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcClasseForm.reset();

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcClasse";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcClasse() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		//Le VO
		Classe classevo;
		//On r�cup�re la cl� primaire

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcClasse" : request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			classevo = rcClasseForm.getNewRcClasseVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierClasse(classevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcClasse";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcClasse() {

		HttpServletRequest request = ServletActionContext.getRequest();

		//Le VO

		String pageResult = request.getParameter("pageContext");
		//String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcClasse" : request.getParameter(ConstManif.PAGE_CONTEXT));
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeclasse = (rcClasseForm.getNumRcCodeClasseRech() == null ? "" : rcClasseForm.getNumRcCodeClasseRech());
		String rclibelleclasse = (rcClasseForm.getNumRcLibelleClasseRech() == null ? "" : rcClasseForm.getNumRcLibelleClasseRech());

		//Condition de recherche
		if (!rccodeclasse.equals("")) {
			condition += " and rccodeclasse = " + Integer.valueOf(rccodeclasse) + " ";
		}
		if (!rclibelleclasse.equals("")) {
			condition += " and rclibelleclasse LIKE '%"+rclibelleclasse+"%' ";
		}
		//Rafraichissement de la liste des CLASSE
		try {

			List listeRcClasse = gaindeBusinessDelegate.rechercherClasse("from Classe where 1 = 1 " + condition);
			// pour la pagination du grid 
			if (listeRcClasse != null) {
				rcClasseForm.setRecords(listeRcClasse.size()); 
				rcClasseForm.setTotal(
						(int) Math.ceil((double)rcClasseForm.getRecords() 
								/ (double)rcClasseForm.getRows())); 
				int to = (rcClasseForm.getRows() * rcClasseForm.getPage());
			    int from = to - rcClasseForm.getRows();
			    if (to > rcClasseForm.getRecords()) {
			    	to = rcClasseForm.getRecords();
			    }
			    listeRcClasse = listeRcClasse.subList(from, to);
			}
			rcClasseForm.setListeRcClasse(listeRcClasse);

			if (listeRcClasse != null && listeRcClasse.size() != 0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcClasse";
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodeclasse.equals("")) {
						rcClasseForm.setNumRcCodeClasseOB(rccodeclasse);
					}

					if (!rclibelleclasse.equals("")) {
						rcClasseForm.setNumRcLibelleClasseOB(rclibelleclasse);
					}
				} else
					if (ctxmenu.equals("S"))
					{
						request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
					}
					else
					{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

				if (!ctxmenu.equals("C")) {
					rcClasseForm.resetChampsRecherche();
				}

			}
		} catch (Exception e) {	
			log.error(e.getMessage());
		}

		if (pageResult == null) {
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcClasse() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcClasse ;

		//Le VO


		//Cl� de l'enregistrement � supprimer
		Integer pk = Integer.valueOf((request.getParameter(ConstManif.PK)));

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcClasse" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerClasse(pk);

			//Raffraichissement de la liste des CLASSE
			listeRcClasse = gaindeBusinessDelegate.rechercherClasse("from Classe where 1 = 1 ");
			rcClasseForm.setListeRcClasse(listeRcClasse);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
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
	public String afficherRcClasse () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcClasse" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		Integer pk = Integer.valueOf((request.getParameter(ConstManif.PK)));

		//Le VO
		Classe classevo = gaindeBusinessDelegate.findClasseByPrimaryKey(pk);

		//Affichage dans le formulaire
		rcClasseForm.setClasse(classevo);

		//Redirection
		forward = page;

		return forward;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null) {
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}
		try {
			rcClasseForm.reset();
			rcClasseForm.setListeRcClasse(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

	public RcClasseForm getModel() {		
		return rcClasseForm;
	}

	public String getScopeKey() {		
		return scopeKey;
	}

	public void setModel(RcClasseForm form) {
		this.rcClasseForm = form;
	}

	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}

	public RcClasseForm getRcClasseForm() {
		return rcClasseForm;
	}

	public void setRcClasseForm(RcClasseForm rcClasseForm) {
		this.rcClasseForm = rcClasseForm;
	}
	
}
