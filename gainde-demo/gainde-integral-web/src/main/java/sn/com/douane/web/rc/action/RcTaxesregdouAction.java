package sn.com.douane.web.rc.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.TaxesRegDou;
import sn.com.douane.ejb.rc.model.keys.TaxesRegDouKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcTaxesregdouForm;



public class RcTaxesregdouAction extends GeneralDispatchAction implements ScopedModelDriven<RcTaxesregdouForm> {

	private static final long serialVersionUID = 1L;
	private RcTaxesregdouForm rcTaxesregdouForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcTaxesregdou() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		TaxesRegDou taxesregdouvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcTaxesregdou" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			taxesregdouvo = rcTaxesregdouForm.getNewRcTaxesregdouVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterTaxesRegDou(taxesregdouvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcTaxesregdouForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcTaxesregdou";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcTaxesregdou() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		TaxesRegDou taxesregdouvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcTaxesregdou" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			taxesregdouvo = rcTaxesregdouForm.getNewRcTaxesregdouVO();


			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierTaxesRegDou(taxesregdouvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcTaxesregdou";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcTaxesregdou() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VOull;ew TaxesregdouVO();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxesregdou" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccoderegimedounier = (rcTaxesregdouForm.getNumListRcCodeRegimeDounierRech()==null ? "" : rcTaxesregdouForm.getNumListRcCodeRegimeDounierRech());
		//String rccodetaux = (rctaxesregdoufb.getTNUM_RCCODETAUXRech()==null ? "" : rctaxesregdoufb.getTNUM_RCCODETAUXRech());
		String rccodetaxe = (rcTaxesregdouForm.getNumListRcCodeTaxeRech()==null ? "" : rcTaxesregdouForm.getNumListRcCodeTaxeRech());
		//String rcdatecloture = (rctaxesregdoufb.getDAT_RCDATECLOTURERech()==null ? "" : rctaxesregdoufb.getDAT_RCDATECLOTURERech());
		String rcdatevaleur = (rcTaxesregdouForm.getDatRcDateValeurRech()==null ? "" : rcTaxesregdouForm.getDatRcDateValeurRech());
		String rctyperegime = (rcTaxesregdouForm.getNumListRcTypeRegimeRech()==null ? "" : rcTaxesregdouForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccoderegimedounier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rccoderegimedounier+"' ";
		}
//		if (!rccodetaux.equals(""))
//			condition += " and RCCODETAUX = '"+rccodetaux+"' ";

		if (!rccodetaxe.equals("")) {
			condition += " and rcCodeTaxe = '"+rccodetaxe+"' ";
		}
//		if (!rcdatecloture.equals(""))
//			condition += " and RCDATECLOTURE = '"+rcdatecloture+"' ";

		if (!rcdatevaleur.equals("")) {
			condition += " and rcDateValeur = '"+sysEnv.strToDate(rcdatevaleur)+"' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des TAXESREGDOU
		try
		{

			List listeRcTaxesregdou = null;
			listeRcTaxesregdou = gaindeBusinessDelegate.rechercherTaxesRegDou("from TaxesRegDou where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcTaxesregdou!=null) {
				rcTaxesregdouForm.setRecords(listeRcTaxesregdou.size()); 
				rcTaxesregdouForm.setTotal(
						(int) Math.ceil((double)rcTaxesregdouForm.getRecords() 
								/ (double)rcTaxesregdouForm.getRows())); 
				int to = (rcTaxesregdouForm.getRows() * rcTaxesregdouForm.getPage());
			    int from = to - rcTaxesregdouForm.getRows();
			    if (to > rcTaxesregdouForm.getRecords()) {
			    	to = rcTaxesregdouForm.getRecords();
			    }
			    listeRcTaxesregdou = listeRcTaxesregdou.subList(from, to);
			}
			rcTaxesregdouForm.setListeRcTaxesregdou(listeRcTaxesregdou);

			if (listeRcTaxesregdou != null && listeRcTaxesregdou.size()!=0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcTaxesregdou";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccoderegimedounier.equals("")) {
						rcTaxesregdouForm.setNumListRcCodeRegimeDounierOB(rccoderegimedounier);
					}
//					if (!rccodetaux.equals(""))
//						rctaxesregdoufb.setTNUM_RCCODETAUX_OB(rccodetaux);

					if (!rccodetaxe.equals("")) {
						rcTaxesregdouForm.setNumListRcCodeTaxeOB(rccodetaxe);
					}
//					if (!rcdatecloture.equals(""))
//						rctaxesregdoufb.setDAT_RCDATECLOTURE(rcdatecloture);

					if (!rcdatevaleur.equals("")) {
						rcTaxesregdouForm.setDatRcDateValeurOB(rcdatevaleur);
					}
					if (!rctyperegime.equals("")) {
						rcTaxesregdouForm.setNumListRcTypeRegimeOB(rctyperegime);
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
					rcTaxesregdouForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche TAXESREGDOU");
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
	public String supprimerRcTaxesregdou() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcTaxesregdou = null;

		//Le VO
		TaxesRegDou taxesregdouvo = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodetaxe = pkTab[0];
		String rctyperegime = pkTab[1];
		String rccoderegimedouanier = pkTab[2];
		String rcdatevaleur = pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcTaxesregdou" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			TaxesRegDouKey taxesregdoukey = new TaxesRegDouKey (rccodetaxe, rctyperegime, 
					rccoderegimedouanier, Date.valueOf(rcdatevaleur));

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerTaxesRegDou(taxesregdoukey);

			//Raffraichissement de la liste des TAXESREGDOU
			listeRcTaxesregdou = gaindeBusinessDelegate.rechercherTaxesRegDou("from TaxesRegDou where 1=1 ");
			rcTaxesregdouForm.setListeRcTaxesregdou(listeRcTaxesregdou);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de TAXESREGDOU non r�ussie !****************");
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
	public String afficherRcTaxesregdou () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcTaxesregdou" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodetaxe = pkTab[0];
		String rctyperegime = pkTab[1];
		String rccoderegimedouanier = pkTab[2];
		String rcdatevaleur = pkTab[3];

			//On cr�� la cl�
		TaxesRegDouKey taxesregdoukey = new TaxesRegDouKey (rccodetaxe, rctyperegime, 
					rccoderegimedouanier, Date.valueOf(rcdatevaleur));

		//Le VO
			TaxesRegDou taxesregdouvo = null;

		taxesregdouvo = gaindeBusinessDelegate.findTaxesRegDouByPrimaryKey(taxesregdoukey);

		//Affichage dans le formulaire
		rcTaxesregdouForm.setTaxesregdou(taxesregdouvo);

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
			rcTaxesregdouForm.reset();
			rcTaxesregdouForm.setListeRcTaxesregdou(new ArrayList());

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
//private TaxesregdouKey createTaxesregdouKey (String rccodetaxe, String rctyperegime, 
//		String rccoderegimedouanier, String rcdatevaleurStr)
//{
//	Date rcdatevaleur =  sysEnv.strToDate(rcdatevaleurStr);
//	TaxesKey taxesKey = new TaxesKey(rccodetaxe);
//	TyperegimedouaneKey typeregimedouaneKey = new TyperegimedouaneKey(rctyperegime);
//	RegimedouanierKey regimedouanierKey = new RegimedouanierKey(rccoderegimedouanier,typeregimedouaneKey);
//	
//	TaxesregdouKey taxesregdoukey = new TaxesregdouKey (rcdatevaleur, taxesKey,regimedouanierKey);
//
//return taxesregdoukey;
//}
	@Override
	public RcTaxesregdouForm getModel() {		
		return rcTaxesregdouForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcTaxesregdouForm form) {
		this.rcTaxesregdouForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcTaxesregdouForm getRcTaxesregdouForm() {
		return rcTaxesregdouForm;
	}


	public void setRcTaxesregdouForm(RcTaxesregdouForm rcTaxesregdouForm) {
		this.rcTaxesregdouForm = rcTaxesregdouForm;
	}
}
