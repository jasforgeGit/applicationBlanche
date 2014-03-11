package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeProduit;
import sn.com.douane.ejb.rc.model.keys.RegimeProduitKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimeproduitForm;



public class RcRegimeproduitAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimeproduitForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimeproduitForm rcRegimeproduitForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimeproduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeProduit regimeproduitvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegimeproduit" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimeproduitvo = rcRegimeproduitForm.getNewRcRegimeproduitVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeProduit(regimeproduitvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimeproduitForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimeproduit";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimeproduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeProduit regimeproduitvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegimeproduit" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimeproduitvo = rcRegimeproduitForm.getNewRcRegimeproduitVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeProduit(regimeproduitvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcRegimeproduit";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegimeproduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimeproduit" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeprod = (rcRegimeproduitForm.getNumListRcCodeProdRech()==null ? "" : rcRegimeproduitForm.getNumListRcCodeProdRech());
		String rccoderegimedouanier = (rcRegimeproduitForm.getNumListRcCodeRegimeDouanierRech()==null ? "" : rcRegimeproduitForm.getNumListRcCodeRegimeDouanierRech());
		String rccoderegimefiscal = (rcRegimeproduitForm.getNumListRcCodeRegimeFiscalRech()==null ? "" : rcRegimeproduitForm.getNumListRcCodeRegimeFiscalRech());
		String rcprecsenegal = (rcRegimeproduitForm.getNumListRcPrecSenegalRech()==null ? "" : rcRegimeproduitForm.getNumListRcPrecSenegalRech());
		String rcprecuemoa = (rcRegimeproduitForm.getNumListRcPrecUemoaRech()==null ? "" : rcRegimeproduitForm.getNumListRcPrecUemoaRech());
		String rctyperegime = (rcRegimeproduitForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimeproduitForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccodeprod.equals("")) {
			condition += " and rcCodeProd LIKE '%"+rccodeprod+"%' ";
		}
		if (!rccoderegimedouanier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
		}
		if (!rccoderegimefiscal.equals("")) {
			condition += " and rcCodeRegimeFiscal LIKE '%"+rccoderegimefiscal+"%' ";
		}
		if (!rcprecsenegal.equals("")) {
			condition += " and rcPrecSenegal LIKE '%"+rcprecsenegal+"%' ";
		}
		if (!rcprecuemoa.equals("")) {
			condition += " and rcPrecuemoa LIKE '%"+rcprecuemoa+"%' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des REGIMEPRODUIT
		try
		{

			List listeRcRegimeproduit = null;
			listeRcRegimeproduit = gaindeBusinessDelegate.rechercherRegimeProduit("from RegimeProduitwhere 1=1 "+condition);
			// pour la pagination du grid 
			if (listeRcRegimeproduit!=null) {
				rcRegimeproduitForm.setRecords(listeRcRegimeproduit.size()); 
				rcRegimeproduitForm.setTotal(
						(int) Math.ceil((double)rcRegimeproduitForm.getRecords() 
								/ (double)rcRegimeproduitForm.getRows())); 
				int to = (rcRegimeproduitForm.getRows() * rcRegimeproduitForm.getPage());
			    int from = to - rcRegimeproduitForm.getRows();
			    if (to > rcRegimeproduitForm.getRecords()) {
			    	to = rcRegimeproduitForm.getRecords();
			    }
			    listeRcRegimeproduit = listeRcRegimeproduit.subList(from, to);
			}
			rcRegimeproduitForm.setListeRcRegimeproduit(listeRcRegimeproduit);

			if (listeRcRegimeproduit != null && listeRcRegimeproduit.size()!=0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcRegimeproduit";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeprod.equals("")) {
						rcRegimeproduitForm.setNumListRcCodeProdOB(rccodeprod);
					}
					if (!rccoderegimedouanier.equals("")) {
						rcRegimeproduitForm.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					if (!rccoderegimefiscal.equals("")) {
						rcRegimeproduitForm.setNumListRcCodeRegimeFiscalOB(rccoderegimefiscal);
					}
					if (!rcprecsenegal.equals("")) {
						rcRegimeproduitForm.setNumListRcPrecSenegalOB(rcprecsenegal);
					}
					if (!rcprecuemoa.equals("")) {
						rcRegimeproduitForm.setNumListRcPrecUemoaOB(rcprecuemoa);
					}
					if (!rctyperegime.equals("")) {
						rcRegimeproduitForm.setNumListRcTypeRegimeOB(rctyperegime);
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
					rcRegimeproduitForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche REGIMEPRODUIT"+ e.getMessage());
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
	public String supprimerRcRegimeproduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimeproduit = null;
		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rccoderegimedouanier=pkTab[1]; 
		String rccoderegimefiscal=pkTab[2];
		String rccodeprod=pkTab[3]; 
		String rcprecuemoa=pkTab[4]; 
		String rcprecsenegal=pkTab[5];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimeproduit" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			RegimeProduitKey regimeproduitkey = new RegimeProduitKey (rctyperegime, rccoderegimedouanier, rccoderegimefiscal,
					rccodeprod, rcprecuemoa, rcprecsenegal);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeProduit(regimeproduitkey);

			//Raffraichissement de la liste des REGIMEPRODUIT
			listeRcRegimeproduit = gaindeBusinessDelegate.rechercherRegimeProduit("from RegimeProduitwhere 1=1 ");
			rcRegimeproduitForm.setListeRcRegimeproduit(listeRcRegimeproduit);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de REGIMEPRODUIT non r�ussie !****************"+ e.getMessage());
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
	public String afficherRcRegimeproduit () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimeproduit" : request.getParameter(ConstManif.PAGE));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rccoderegimedouanier=pkTab[1]; 
		String rccoderegimefiscal=pkTab[2];
		String rccodeprod=pkTab[3]; 
		String rcprecuemoa=pkTab[4]; 
		String rcprecsenegal=pkTab[5];

			//On cr�� la cl�
		RegimeProduitKey regimeproduitkey = new RegimeProduitKey (rctyperegime, rccoderegimedouanier, rccoderegimefiscal,
					rccodeprod, rcprecuemoa, rcprecsenegal);

		//Le VO
		RegimeProduit regimeproduitvo = null;

		regimeproduitvo = gaindeBusinessDelegate.findRegimeProduitByPrimaryKey(regimeproduitkey);


		//Affichage dans le formulaire
		rcRegimeproduitForm.setRegimeproduit(regimeproduitvo);

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
			rcRegimeproduitForm.reset();
			rcRegimeproduitForm.setListeRcRegimeproduit(new ArrayList());

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
//private RegimeproduitKey createRegimeproduitKey (String rctyperegime, String rccoderegimedouanier, String rccoderegimefiscal,
//		String rccodeprod, String rcprecuemoa, String rcprecsenegal)
//{
//RegimeproduitKey regimeproduitkey = new RegimeproduitKey (new ProduitsKey(rccodeprod,rcprecuemoa,rcprecsenegal),
//		new RegimeKey(new RegimefiscalKey(rccoderegimefiscal),
//				new RegimedouanierKey(rccoderegimedouanier, new TyperegimedouaneKey(rctyperegime))));
//
//return regimeproduitkey;
//}

	@Override
	public RcRegimeproduitForm getModel() {		
		return rcRegimeproduitForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegimeproduitForm form) {
		this.rcRegimeproduitForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegimeproduitForm getRcRegimeproduitForm() {
		return rcRegimeproduitForm;
	}


	public void setRcRegimeproduitForm(RcRegimeproduitForm rcRegimeproduitForm) {
		this.rcRegimeproduitForm = rcRegimeproduitForm;
	}
	
}
