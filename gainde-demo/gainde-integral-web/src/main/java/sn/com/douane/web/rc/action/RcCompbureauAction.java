package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.CompBureau;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcCompbureauForm;



public class RcCompbureauAction extends GeneralDispatchAction implements ScopedModelDriven<RcCompbureauForm>{


	private static final long serialVersionUID = 1L;
	private RcCompbureauForm rcCompbureauForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcCompbureau() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		CompBureau compbureauvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcCompbureau" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			compbureauvo = rcCompbureauForm.getNewRcCompbureauVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.insertCompBureau(compbureauvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcCompbureauForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcCompbureau";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcCompbureau() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		CompBureau compbureauvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcCompbureau" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			compbureauvo = rcCompbureauForm.getNewRcCompbureauVO();


			//On ex�cute la commande de modification
			gaindeBusinessDelegate.updateCompBureau(compbureauvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcCompbureau";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcCompbureau() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCompbureau" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodecompetence = (rcCompbureauForm.getNumRcCodeCompetenceRech()==null ? "" : rcCompbureauForm.getNumRcCodeCompetenceRech());
		String rcdescompetences = (rcCompbureauForm.getNumRcDesCompetencesRech()==null ? "" : rcCompbureauForm.getNumRcDesCompetencesRech());

		//Condition de recherche
		if (!rccodecompetence.equals("")) {
			condition += " and rccodecompetence = '"+rccodecompetence+"' ";
		}
		if (!rcdescompetences.equals("")) {
			condition += " and rcdescompetences LIKE '%"+rcdescompetences+"%' ";
		}
		//Rafraichissement de la liste des COMPBUREAU
		try
		{

			List listeRcCompbureau = null;
			listeRcCompbureau = gaindeBusinessDelegate.rechercherByWhereCompBureau("from CompBureau where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcCompbureau!=null) {
				rcCompbureauForm.setRecords(listeRcCompbureau.size()); 
				rcCompbureauForm.setTotal(
						(int) Math.ceil((double)rcCompbureauForm.getRecords() 
								/ (double)rcCompbureauForm.getRows())); 
				int to = (rcCompbureauForm.getRows() * rcCompbureauForm.getPage());
			    int from = to - rcCompbureauForm.getRows();
			    if (to > rcCompbureauForm.getRecords()) {
			    	to = rcCompbureauForm.getRecords();
			    }
			    listeRcCompbureau = listeRcCompbureau.subList(from, to);
			}
			rcCompbureauForm.setListeRcCompbureau(listeRcCompbureau);

			if (listeRcCompbureau != null && listeRcCompbureau.size()!=0)

			{
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcCompbureau";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodecompetence.equals("")) {
						rcCompbureauForm.setNumRcCodeCompetenceOB(rccodecompetence);
					}
					if (!rcdescompetences.equals("")) {
						rcCompbureauForm.setNumRcDesCompetencesOB(rcdescompetences);
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
					rcCompbureauForm.resetChampsRecherche ();
				}

			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche COMPBUREAU");
		}
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcCompbureau() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcCompbureau = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCompbureau" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.deleteCompBureau(pk);

			//Raffraichissement de la liste des COMPBUREAU
			listeRcCompbureau = gaindeBusinessDelegate.rechercherByWhereCompBureau("from CompBureau where 1=1 ");
			rcCompbureauForm.setListeRcCompbureau(listeRcCompbureau);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de COMPBUREAU non r�ussie !****************");
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
	public String afficherRcCompbureau () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcCompbureau" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		CompBureau compbureauvo = null;

		compbureauvo = gaindeBusinessDelegate.findByPrimaryKeyCompBureau(pk);

		//Affichage dans le formulaire
		rcCompbureauForm.setCompbureau(compbureauvo);

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
			rcCompbureauForm.reset();
			rcCompbureauForm.setListeRcCompbureau(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}
	
	@Override
	public RcCompbureauForm getModel() {		
		return rcCompbureauForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcCompbureauForm form) {
		this.rcCompbureauForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcCompbureauForm getRcCompbureauForm() {
		return rcCompbureauForm;
	}


	public void setRcCompbureauForm(RcCompbureauForm rcCompbureauForm) {
		this.rcCompbureauForm = rcCompbureauForm;
	}
	
}
