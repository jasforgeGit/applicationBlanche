package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;
import sn.com.douane.ejb.rc.model.keys.RegimeDeclarantKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimedeclarantForm;



public class RcRegimedeclarantAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimedeclarantForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimedeclarantForm rcRegimedeclarantForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimedeclarant() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDeclarant regimedeclarantvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegimedeclarant" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimedeclarantvo = rcRegimedeclarantForm.getNewRcRegimedeclarantVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeDeclarant(regimedeclarantvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimedeclarantForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimedeclarant";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimedeclarant() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDeclarant regimedeclarantvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegimedeclarant" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimedeclarantvo = rcRegimedeclarantForm.getNewRcRegimedeclarantVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeDeclarant(regimedeclarantvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegimedeclarant";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegimedeclarant() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Le VO
		RegimeDeclarant regimedeclarantvo = null;

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedeclarant" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeppm = (rcRegimedeclarantForm.getNumListRcCodePpmRech()==null ? "" : rcRegimedeclarantForm.getNumListRcCodePpmRech());
		String rcregimedouanier = (rcRegimedeclarantForm.getNumListRcRegimeDouanierRech()==null ? "" : rcRegimedeclarantForm.getNumListRcRegimeDouanierRech());
		String rcregimefiscal = (rcRegimedeclarantForm.getNumListRcRegimeFiscalRech()==null ? "" : rcRegimedeclarantForm.getNumListRcRegimeFiscalRech());
		String rctyperegime = (rcRegimedeclarantForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimedeclarantForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccodeppm.equals("")) {
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcregimedouanier.equals("")) {
			condition += " and rcRegimeDouanier = '"+rcregimedouanier+"' ";
		}
		if (!rcregimefiscal.equals("")) {
			condition += " and rcRegimeFiscal LIKE '%"+rcregimefiscal+"%' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des REGIMEDECLARANT
		try
		{

			List listeRcRegimedeclarant = null;
			listeRcRegimedeclarant = gaindeBusinessDelegate.rechercherRegimeDeclarant("from RegimeDeclarant where 1=1 "+condition);
			// pour la pagination du grid 
			if (listeRcRegimedeclarant!=null) {
				rcRegimedeclarantForm.setRecords(listeRcRegimedeclarant.size()); 
				rcRegimedeclarantForm.setTotal(
						(int) Math.ceil((double)rcRegimedeclarantForm.getRecords() 
								/ (double)rcRegimedeclarantForm.getRows())); 
				int to = (rcRegimedeclarantForm.getRows() * rcRegimedeclarantForm.getPage());
			    int from = to - rcRegimedeclarantForm.getRows();
			    if (to > rcRegimedeclarantForm.getRecords()) {
			    	to = rcRegimedeclarantForm.getRecords();
			    }
			    listeRcRegimedeclarant = listeRcRegimedeclarant.subList(from, to);
			}
			rcRegimedeclarantForm.setListeRcRegimedeclarant(listeRcRegimedeclarant);

			if (listeRcRegimedeclarant != null && listeRcRegimedeclarant.size()!=0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcRegimedeclarant";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeppm.equals("")) {
						rcRegimedeclarantForm.setNumListRcCodePpmOB(rccodeppm);
					}
					if (!rcregimedouanier.equals("")) {
						rcRegimedeclarantForm.setNumListRcRegimeDouanierOB(rcregimedouanier);
					}
					if (!rcregimefiscal.equals("")) {
						rcRegimedeclarantForm.setNumListRcRegimeFiscalOB(rcregimefiscal);
					}
					if (!rctyperegime.equals("")) {
						rcRegimedeclarantForm.setNumListRcTypeRegimeOB(rctyperegime);
					}
				}
				else
					if (ctxmenu.equals("S"))
					{
						page = "rechercheRcRegimedeclarant";
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}
					else
					{
						page = "rechercheRcRegimedeclarant";
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

				if (!ctxmenu.equals("C")) {
					rcRegimedeclarantForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche REGIMEDECLARANT"+ e.getMessage());
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
	public String supprimerRcRegimedeclarant() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimedeclarant = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rcregimedouanier=pkTab[1];
		String rcregimefiscal=pkTab[2];
		String rccodeppm=pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedeclarant" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			RegimeDeclarantKey regimedeclarantkey = new RegimeDeclarantKey (rctyperegime,rcregimedouanier,
					rcregimefiscal,rccodeppm);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeDeclarant(regimedeclarantkey);

			//Raffraichissement de la liste des REGIMEDECLARANT
			listeRcRegimedeclarant = gaindeBusinessDelegate.rechercherRegimeDeclarant("from RegimeDeclarant where 1=1 ");
			rcRegimedeclarantForm.setListeRcRegimedeclarant(listeRcRegimedeclarant);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de REGIMEDECLARANT non r�ussie !****************"+ e.getMessage());
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
	public String afficherRcRegimedeclarant () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegimedeclarant" : request.getParameter(ConstManif.PAGE_CONTEXT));


		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rcregimedouanier=pkTab[1];
		String rcregimefiscal=pkTab[2];
		String rccodeppm=pkTab[3];

			//On cr�� la cl�
		RegimeDeclarantKey regimedeclarantkey = new RegimeDeclarantKey (rctyperegime,rcregimedouanier,
					rcregimefiscal,rccodeppm);

		//Le VO
		RegimeDeclarant regimedeclarantvo = null;

		regimedeclarantvo = gaindeBusinessDelegate.findRegimeDeclarantByPrimaryKey(regimedeclarantkey);

		//Affichage dans le formulaire
		rcRegimedeclarantForm.setRegimedeclarant(regimedeclarantvo);

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
			rcRegimedeclarantForm.reset();
			rcRegimedeclarantForm.setListeRcRegimedeclarant(new ArrayList());

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
//private RegimedeclarantKey createRegimedeclarantKey (String rctyperegime, String rcregimedouanier,
//		String rcregimefiscal, String rccodeppm)
//{
//RegimedeclarantKey regimedeclarantkey = new RegimedeclarantKey (rctyperegime, rcregimedouanier,
//		rcregimefiscal, new PpmKey(rccodeppm));
//
//return regimedeclarantkey;
//}
	@Override
	public RcRegimedeclarantForm getModel() {		
		return rcRegimedeclarantForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimedeclarantForm form) {
		this.rcRegimedeclarantForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimedeclarantForm getRcRegimedeclarantForm() {
		return rcRegimedeclarantForm;
	}


	public void setRcRegimedeclarantForm(RcRegimedeclarantForm rcRegimedeclarantForm) {
		this.rcRegimedeclarantForm = rcRegimedeclarantForm;
	}
}
