package sn.com.douane.web.rc.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.TaxesRegime;
import sn.com.douane.ejb.rc.model.keys.TaxesRegimeKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcTaxesregimeForm;


public class RcTaxesregimeAction extends GeneralDispatchAction implements ScopedModelDriven<RcTaxesregimeForm> {

	private static final long serialVersionUID = 1L;
	private RcTaxesregimeForm rcTaxesregimeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcTaxesregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		TaxesRegime taxesregimevo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcTaxesregime" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			taxesregimevo = rcTaxesregimeForm.getNewRcTaxesregimeVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterTaxesRegime(taxesregimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcTaxesregimeForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcTaxesregime";
		}

		return forward;
	}

	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcTaxesregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		TaxesRegime taxesregimevo = null;
		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcTaxesregime" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			taxesregimevo = rcTaxesregimeForm.getNewRcTaxesregimeVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierTaxesRegime(taxesregimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcTaxesregime";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcTaxesregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxesregime" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		//String rccodetaux = (rctaxesregimefb.getTNUM_RCCODETAUXRech()==null ? "" : rctaxesregimefb.getTNUM_RCCODETAUXRech());
		String rccodetaxe = (rcTaxesregimeForm.getNumListRcCodeTaxeRech()==null ? "" : rcTaxesregimeForm.getNumListRcCodeTaxeRech());
		//String rcdatecloture = (rctaxesregimefb.getDAT_RCDATECLOTURERech()==null ? "" : rctaxesregimefb.getDAT_RCDATECLOTURERech());
		String rcdatevaleur = (rcTaxesregimeForm.getDatRcDateValeurRech()==null ? "" : rcTaxesregimeForm.getDatRcDateValeurRech());
		String rcregimedouanier = (rcTaxesregimeForm.getNumListRcRegimeDouanierRech()==null ? "" : rcTaxesregimeForm.getNumListRcRegimeDouanierRech());
		String rcregimefiscal = (rcTaxesregimeForm.getNumListRcRegimeFiscalRech()==null ? "" : rcTaxesregimeForm.getNumListRcRegimeFiscalRech());
		String rctyperegimedouanier = (rcTaxesregimeForm.getNumListRcTypeRegimeDouanierRech()==null ? "" : rcTaxesregimeForm.getNumListRcTypeRegimeDouanierRech());

		//Condition de recherche
//		if (!rccodetaux.equals(""))
//			condition += " and RCCODETAUX = '"+rccodetaux+"' ";

		if (!rccodetaxe.equals("")) {
			condition += " and rcCodeTaxes = '"+rccodetaxe+"' ";
		}
//		if (!rcdatecloture.equals(""))
//			condition += " and RCDATECLOTURE = '"+rcdatecloture+"' ";

		if (!rcdatevaleur.equals("")) {
			condition += " and rcDateValeur = '"+sysEnv.strToDate(rcdatevaleur)+"' ";
		}
		if (!rcregimedouanier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rcregimedouanier+"' ";
		}
		if (!rcregimefiscal.equals("")) {
			condition += " and rcRegimeFiscal = '"+rcregimefiscal+"' ";
		}
		if (!rctyperegimedouanier.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegimedouanier+"' ";
		}
		//Rafraichissement de la liste des TAXESREGIME
		try
		{

			List listeRcTaxesregime = null;
			listeRcTaxesregime = gaindeBusinessDelegate.rechercherTaxesRegime("from TaxesRegime where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcTaxesregime!=null) {
				rcTaxesregimeForm.setRecords(listeRcTaxesregime.size()); 
				rcTaxesregimeForm.setTotal(
						(int) Math.ceil((double)rcTaxesregimeForm.getRecords() 
								/ (double)rcTaxesregimeForm.getRows())); 
				int to = (rcTaxesregimeForm.getRows() * rcTaxesregimeForm.getPage());
			    int from = to - rcTaxesregimeForm.getRows();
			    if (to > rcTaxesregimeForm.getRecords()) {
			    	to = rcTaxesregimeForm.getRecords();
			    }
			    listeRcTaxesregime = listeRcTaxesregime.subList(from, to);
			}
			rcTaxesregimeForm.setListeRcTaxesregime(listeRcTaxesregime);

			if (listeRcTaxesregime != null && listeRcTaxesregime.size()!=0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcTaxesregime";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

//					if (!rccodetaux.equals(""))
//						rctaxesregimefb.setTNUM_RCCODETAUX_OB(rccodetaux);

					if (!rccodetaxe.equals("")) {
						rcTaxesregimeForm.setNumListRcCodeTaxeOB(rccodetaxe);
					}
//					if (!rcdatecloture.equals(""))
//						rctaxesregimefb.setDAT_RCDATECLOTURE(rcdatecloture);

					if (!rcdatevaleur.equals("")) {
						rcTaxesregimeForm.setDatRcDateValeurOB(rcdatevaleur);
					}
					if (!rcregimedouanier.equals("")) {
						rcTaxesregimeForm.setNumListRcRegimeDouanierOB(rcregimedouanier);
					}
					if (!rcregimefiscal.equals("")) {
						rcTaxesregimeForm.setNumListRcRegimeFiscalOB(rcregimefiscal);
					}
					if (!rctyperegimedouanier.equals("")) {
						rcTaxesregimeForm.setNumListRcTypeRegimeDouanierOB(rctyperegimedouanier);
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
					rcTaxesregimeForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche TAXESREGIME");
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
	public String supprimerRcTaxesregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcTaxesregime = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegimedouanier =pkTab[0];
		String rcregimedouanier= pkTab[1]; 
		String rcregimefiscal = pkTab[2];
		String rccodetaxe = pkTab[3];
		String rcdatevaleur = pkTab[4];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxesregime" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			TaxesRegimeKey taxesregimekey = new TaxesRegimeKey (rctyperegimedouanier, rcregimedouanier,rcregimefiscal,
					rccodetaxe, Date.valueOf(rcdatevaleur));

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerTaxesRegime(taxesregimekey);

			//Raffraichissement de la liste des TAXESREGIME
			listeRcTaxesregime = gaindeBusinessDelegate.rechercherTaxesRegime("from TaxesRegime where 1=1 ");
			rcTaxesregimeForm.setListeRcTaxesregime(listeRcTaxesregime);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de TAXESREGIME non r�ussie !****************");
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
	public String afficherRcTaxesregime () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcTaxesregime" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegimedouanier =pkTab[0];
		String rcregimedouanier= pkTab[1]; 
		String rcregimefiscal = pkTab[2];
		String rccodetaxe = pkTab[3];
		String rcdatevaleur = pkTab[4];

			//On cr�� la cl�
		TaxesRegimeKey taxesregimekey = new TaxesRegimeKey (rctyperegimedouanier, rcregimedouanier,rcregimefiscal,
					rccodetaxe, Date.valueOf(rcdatevaleur));

		//Le VO
			TaxesRegime taxesregimevo = null;

		taxesregimevo = gaindeBusinessDelegate.findTaxesRegimeByPrimaryKey(taxesregimekey);

		//Affichage dans le formulaire
		rcTaxesregimeForm.setTaxesregime(taxesregimevo);

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
			rcTaxesregimeForm.reset();
			rcTaxesregimeForm.setListeRcTaxesregime(new ArrayList());

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
//private TaxesregimeKey createTaxesregimeKey (String rctyperegimedouanier, String rcregimedouanier, String rcregimefiscal,
//		String rccodetaxe, String rcdatevaleurStr)
//{
//	Date rcdatevaleur = sysEnv.strToDate(rcdatevaleurStr);
//	TaxesKey taxesKey = new TaxesKey(rccodetaxe);
//	TyperegimedouaneKey typeregimedouaneKey = new TyperegimedouaneKey(rctyperegimedouanier);
//	RegimedouanierKey regimedouanierKey = new RegimedouanierKey(rcregimedouanier,typeregimedouaneKey);
//	RegimefiscalKey regimefiscalKey = new RegimefiscalKey(rcregimefiscal);
//	RegimeKey regimeKey = new RegimeKey(regimefiscalKey,regimedouanierKey);
//	
//	TaxesregimeKey taxesregimekey = new TaxesregimeKey (rcdatevaleur, taxesKey,regimeKey);
//
//return taxesregimekey;
//}

	@Override
	public RcTaxesregimeForm getModel() {
		return rcTaxesregimeForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcTaxesregimeForm form) {
		this.rcTaxesregimeForm = form;

	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcTaxesregimeForm getRcTaxesregimeForm() {
		return rcTaxesregimeForm;
	}

	public void setRcTaxesregimeForm(RcTaxesregimeForm rcTaxesregimeForm) {
		this.rcTaxesregimeForm = rcTaxesregimeForm;
	}

}
