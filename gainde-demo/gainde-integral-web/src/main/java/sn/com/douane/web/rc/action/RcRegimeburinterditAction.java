package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeBurInterdit;
import sn.com.douane.ejb.rc.model.keys.RegimeBurInterditKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimeburinterditForm;



public class RcRegimeburinterditAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimeburinterditForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimeburinterditForm rcRegimeburinterditForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimeburinterdit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeBurInterdit regimeburinterditvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegimeburinterdit" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimeburinterditvo = rcRegimeburinterditForm.getNewRcRegimeburinterditVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeBurInterdit(regimeburinterditvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimeburinterditForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimeburinterdit";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimeburinterdit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeBurInterdit regimeburinterditvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegimeburinterdit" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimeburinterditvo = rcRegimeburinterditForm.getNewRcRegimeburinterditVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeBurInterdit(regimeburinterditvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegimeburinterdit";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegimeburinterdit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimeburinterdit" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodebureau = (rcRegimeburinterditForm.getNumListRcCodeBureauRech()==null ? "" : rcRegimeburinterditForm.getNumListRcCodeBureauRech());
		String rcregimedouanier = (rcRegimeburinterditForm.getNumListRcRegimeDouanierRech()==null ? "" : rcRegimeburinterditForm.getNumListRcRegimeDouanierRech());
		String rctyperegime = (rcRegimeburinterditForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimeburinterditForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccodebureau.equals("")) {
			condition += " and rcCodeBurDouane LIKE '%"+rccodebureau+"%' ";
		}
		if (!rcregimedouanier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rcregimedouanier+"' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des REGIMEBURINTERDIT
		try
		{

			List listeRcRegimeburinterdit = null;
			listeRcRegimeburinterdit = gaindeBusinessDelegate.rechercherRegimeBurInterdit("from RegimeBurInterdit where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegimeburinterdit!=null) {
				rcRegimeburinterditForm.setRecords(listeRcRegimeburinterdit.size()); 
				rcRegimeburinterditForm.setTotal(
						(int) Math.ceil((double)rcRegimeburinterditForm.getRecords() 
								/ (double)rcRegimeburinterditForm.getRows())); 
				int to = (rcRegimeburinterditForm.getRows() * rcRegimeburinterditForm.getPage());
			    int from = to - rcRegimeburinterditForm.getRows();
			    if (to > rcRegimeburinterditForm.getRecords()) {
			    	to = rcRegimeburinterditForm.getRecords();
			    }
			    listeRcRegimeburinterdit = listeRcRegimeburinterdit.subList(from, to);
			}
			rcRegimeburinterditForm.setListeRcRegimeburinterdit(listeRcRegimeburinterdit);

			if (listeRcRegimeburinterdit != null && listeRcRegimeburinterdit.size()!=0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcRegimeburinterdit";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodebureau.equals("")) {
						rcRegimeburinterditForm.setNumListRcCodeBureauOB(rccodebureau);
					}
					if (!rcregimedouanier.equals("")) {
						rcRegimeburinterditForm.setNumListRcRegimeDouanierOB(rcregimedouanier);
					}
					if (!rctyperegime.equals("")) {
						rcRegimeburinterditForm.setNumListRcTypeRegimeOB(rctyperegime);
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
					rcRegimeburinterditForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche REGIMEBURINTERDIT"+ e.getMessage());
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
	public String supprimerRcRegimeburinterdit() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimeburinterdit = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0];
		String rcregimedouanier=pkTab[1];
		String rccodebureau=pkTab[2];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimeburinterdit" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			RegimeBurInterditKey regimeburinterditkey = new RegimeBurInterditKey (rccodebureau ,
					rcregimedouanier,rctyperegime);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeBurInterdit(regimeburinterditkey);

			//Raffraichissement de la liste des REGIMEBURINTERDIT
			listeRcRegimeburinterdit = gaindeBusinessDelegate.rechercherRegimeBurInterdit("from RegimeBurInterdit where 1=1 ");
			rcRegimeburinterditForm.setListeRcRegimeburinterdit(listeRcRegimeburinterdit);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de REGIMEBURINTERDIT non r�ussie !****************"+ e.getMessage());
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
	public String afficherRcRegimeburinterdit () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegimeburinterdit" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0];
		String rcregimedouanier=pkTab[1];
		String rccodebureau=pkTab[2];

			//On cr�� la cl�
		RegimeBurInterditKey regimeburinterditkey = new RegimeBurInterditKey (rccodebureau ,
				rcregimedouanier,rctyperegime);

		//Le VO
			RegimeBurInterdit regimeburinterditvo = null;

		regimeburinterditvo = gaindeBusinessDelegate.findRegimeBurInterditByPrimaryKey(regimeburinterditkey);

		//Affichage dans le formulaire
		rcRegimeburinterditForm.setRegimeburinterdit(regimeburinterditvo);

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
			rcRegimeburinterditForm.reset();
			rcRegimeburinterditForm.setListeRcRegimeburinterdit(new ArrayList());

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
//private RegimeburinterditKey createRegimeburinterditKey (String rctyperegime,
//		String rcregimedouanier, String rccodebureau)
//{
//RegimeburinterditKey regimeburinterditkey = new RegimeburinterditKey (
//		new BureaudouaneKey(rccodebureau),
//		new RegimedouanierKey(rcregimedouanier, new TyperegimedouaneKey(rctyperegime)));
//
//return regimeburinterditkey;
//}
	@Override
	public RcRegimeburinterditForm getModel() {		
		return rcRegimeburinterditForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimeburinterditForm form) {
		this.rcRegimeburinterditForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimeburinterditForm getRcRegimeburinterditForm() {
		return rcRegimeburinterditForm;
	}


	public void setRcRegimeburinterditForm(RcRegimeburinterditForm rcRegimeburinterditForm) {
		this.rcRegimeburinterditForm = rcRegimeburinterditForm;
	}
}
