package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Taxe;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcTaxesForm;



public class RcTaxesAction extends GeneralDispatchAction implements ScopedModelDriven<RcTaxesForm> {

	private static final long serialVersionUID = 1L;
	private RcTaxesForm rcTaxesForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcTaxes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		Taxe taxesvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcTaxes" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			taxesvo = rcTaxesForm.getNewRcTaxesVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterTaxe(taxesvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcTaxesForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcTaxes";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcTaxes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		Taxe taxesvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcTaxes" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			taxesvo = rcTaxesForm.getNewRcTaxesVO();


			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierTaxe(taxesvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcTaxes";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcTaxes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxes" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodetaxe = (rcTaxesForm.getNumRcCodeTaxeRech()==null ? "" : rcTaxesForm.getNumRcCodeTaxeRech());
		String rcnaturetaxe = (rcTaxesForm.getNumRcNatureTaxeRech()==null ? "" : rcTaxesForm.getNumRcNatureTaxeRech());
		String rclibelletaxe = (rcTaxesForm.getNumRcLibelleTaxeRech()==null ? "" : rcTaxesForm.getNumRcLibelleTaxeRech());


		if (!rccodetaxe.equals("")) {
			condition += " and rcCodeTaxe = '"+rccodetaxe+"' ";
		}
		if (!rclibelletaxe.equals("")) {
			condition += " and rcLibelleTaxe LIKE '%"+rclibelletaxe+"%' ";
		}
		if (!rcnaturetaxe.equals("")) {
			condition += " and rcNatureTaxe LIKE '%"+rcnaturetaxe+"%' ";
		}
		//Rafraichissement de la liste des TAXES
		try
		{

			List listeRcTaxes = null;
			listeRcTaxes = gaindeBusinessDelegate.rechercherTaxe("from Taxe where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcTaxes!=null) {
				rcTaxesForm.setRecords(listeRcTaxes.size()); 
				rcTaxesForm.setTotal(
						(int) Math.ceil((double)rcTaxesForm.getRecords() 
								/ (double)rcTaxesForm.getRows())); 
				int to = (rcTaxesForm.getRows() * rcTaxesForm.getPage());
			    int from = to - rcTaxesForm.getRows();
			    if (to > rcTaxesForm.getRecords()) {
			    	to = rcTaxesForm.getRecords();
			    }
			    listeRcTaxes = listeRcTaxes.subList(from, to);
			}
			rcTaxesForm.setListeRcTaxes(listeRcTaxes);

			if (listeRcTaxes != null && listeRcTaxes.size()!=0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcTaxes";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodetaxe.equals("")) {
						rcTaxesForm.setNumRcCodeTaxeOB(rccodetaxe);
					}
					if (!rclibelletaxe.equals("")) {
						rcTaxesForm.setNumRcLibelleTaxeOB(rclibelletaxe);
					}
					
					if (!rcnaturetaxe.equals("")) {
						rcTaxesForm.setNumRcNatureTaxe(rcnaturetaxe);
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
					rcTaxesForm.resetChampsRecherche ();
				}

			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche TAXES");
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
	public String supprimerRcTaxes() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcTaxes = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxes" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerTaxe(pk);

			//Raffraichissement de la liste des TAXES
			listeRcTaxes = gaindeBusinessDelegate.rechercherTaxe("from Taxe where 1=1 ");
			rcTaxesForm.setListeRcTaxes(listeRcTaxes);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de TAXES non r�ussie !****************");
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
	public String afficherRcTaxes () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcTaxes" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		Taxe taxesvo = null;

		taxesvo = gaindeBusinessDelegate.findTaxeByPrimaryKey(pk);


		//Affichage dans le formulaire
		rcTaxesForm.setTaxes(taxesvo);

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
			rcTaxesForm.reset();
			rcTaxesForm.setListeRcTaxes(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

	@Override
	public RcTaxesForm getModel() {		
		return rcTaxesForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcTaxesForm form) {
		this.rcTaxesForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcTaxesForm getRcTaxesForm() {
		return rcTaxesForm;
	}


	public void setRcTaxesForm(RcTaxesForm rcTaxesForm) {
		this.rcTaxesForm = rcTaxesForm;
	}

}
