package sn.com.douane.web.rc.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegime;
import sn.com.douane.ejb.rc.model.keys.IndicateurRegimeKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcIndicateurregimeForm;



public class RcIndicateurregimeAction extends GeneralDispatchAction implements ScopedModelDriven<RcIndicateurregimeForm> {

	private static final long serialVersionUID = 1L;
	private RcIndicateurregimeForm rcIndicateurregimeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcIndicateurregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		IndicateurRegime indicateurregimevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcIndicateurregime"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			indicateurregimevo = rcIndicateurregimeForm
					.getNewRcIndicateurregimeVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterIndicateurRegime(indicateurregimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcIndicateurregimeForm.reset();

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcIndicateurregime";
		}

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcIndicateurregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		IndicateurRegime indicateurregimevo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcIndicateurregime"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			indicateurregimevo = rcIndicateurregimeForm
					.getNewRcIndicateurregimeVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierIndicateurRegime(indicateurregimevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcIndicateurregime";
		}

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcIndicateurregime() throws Exception {


		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcIndicateurregime" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeindicateur = (rcIndicateurregimeForm
				.getNumListRcCodeIndicateurRech() == null ? ""
				: rcIndicateurregimeForm.getNumListRcCodeIndicateurRech());
		String rccoderegimedouanier = (rcIndicateurregimeForm
				.getNumListRcCodeRegimeDouanierRech() == null ? ""
				: rcIndicateurregimeForm.getNumListRcCodeRegimeDouanierRech());
		String rccoderegimefiscal = (rcIndicateurregimeForm
				.getNumListRcCodeRegimeFiscalRech() == null ? ""
				: rcIndicateurregimeForm.getNumListRcCodeRegimeFiscalRech());
		String rcdatevalidite = (rcIndicateurregimeForm
				.getDatRcDateValiditeRech() == null ? ""
				: rcIndicateurregimeForm.getDatRcDateValiditeRech());
		String rctyperegime = (rcIndicateurregimeForm
				.getNumListRcTypeRegimeRech() == null ? ""
				: rcIndicateurregimeForm.getNumListRcTypeRegimeRech());

		condition = "SELECT IR FROM IndicateurRegime IR, Indicateur I WHERE 1 = 1";

		//Condition de recherche
		if (!rccodeindicateur.equals("")) {
			condition += " and IR.rcCodeIndicateur LIKE '%" + rccodeindicateur
					+ "%' ";
		}
		if (!rccoderegimedouanier.equals("")) {
			condition += " and IR.rcCodeRegimeDouanier = '" + rccoderegimedouanier
					+ "' ";
		}
		if (!rccoderegimefiscal.equals("")) {
			condition += " and IR.rcCodeRegimeFiscal = '" + rccoderegimefiscal
					+ "' ";
		}

		if (!rcdatevalidite.equals("")) {
			condition += " and IR.rcDateValidite = '"
					+ new Date(DateUtil.convertStringToDate(rcdatevalidite)
							.getTime()) + "' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and IR.rcTypeRegime = '" + rctyperegime + "' ";
		}
		condition += " and IR.rcCodeIndicateur = I.rcCodeIndicateur ";
		
		//Rafraichissement de la liste des INDICATEURREGIME
		try {

			List listeRcIndicateurregime = null;
			listeRcIndicateurregime = gaindeBusinessDelegate.rechercherIndicateurRegime(condition);
			// pour la pagination du grid 
			if (listeRcIndicateurregime!=null) {
				rcIndicateurregimeForm.setRecords(listeRcIndicateurregime.size()); 
				rcIndicateurregimeForm.setTotal(
						(int) Math.ceil((double)rcIndicateurregimeForm.getRecords() 
								/ (double)rcIndicateurregimeForm.getRows())); 
				int to = (rcIndicateurregimeForm.getRows() * rcIndicateurregimeForm.getPage());
			    int from = to - rcIndicateurregimeForm.getRows();
			    if (to > rcIndicateurregimeForm.getRecords()) {
			    	to = rcIndicateurregimeForm.getRecords();
			    }
			    listeRcIndicateurregime = listeRcIndicateurregime.subList(from, to);
			}
			rcIndicateurregimeForm
					.setListeRcIndicateurregime(listeRcIndicateurregime);

			if (listeRcIndicateurregime != null && listeRcIndicateurregime.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcIndicateurregime";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodeindicateur.equals("")) {
						rcIndicateurregimeForm
								.setNumListRcCodeIndicateurOB(rccodeindicateur);
					}
					if (!rccoderegimedouanier.equals("")) {
						rcIndicateurregimeForm
								.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					if (!rccoderegimefiscal.equals("")) {
						rcIndicateurregimeForm
								.setNumListRcCodeRegimeFiscalOB(rccoderegimefiscal);
					}
					if (!rcdatevalidite.equals("")) {
						rcIndicateurregimeForm
								.setDatRcDateValiditeOB(rcdatevalidite);
					}
					if (!rctyperegime.equals("")) {
						rcIndicateurregimeForm
								.setNumListRcTypeRegimeOB(rctyperegime);
					}
				} else if (ctxmenu.equals("S")) {
					page = "rechercheRcIndicateurregime";
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(
							ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcIndicateurregimeForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche INDICATEURREGIME");
		} 

		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcIndicateurregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcIndicateurregime = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rctyperegime = pkTab[0];
		String rccoderegimedouanier = pkTab[1];
		String rccoderegimefiscal = pkTab[2];
		String rccodeindicateur = pkTab[3];
		String rcdatevalidite = pkTab[4];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcIndicateurregime"
				: request.getParameter(ConstManif.PAGE));

		try {

			//On cr�� la cl�
			IndicateurRegimeKey indicateurregimekey = new IndicateurRegimeKey(
					rctyperegime, rccoderegimedouanier, rccoderegimefiscal, rccodeindicateur, sysEnv.strToDate(rcdatevalidite));

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerIndicateurRegime(indicateurregimekey);

			//Raffraichissement de la liste des INDICATEURREGIME
			listeRcIndicateurregime = gaindeBusinessDelegate.rechercherIndicateurRegime("from IndicateurRegime where 1=1 ");
			rcIndicateurregimeForm
					.setListeRcIndicateurregime(listeRcIndicateurregime);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(
						ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
            log.error("**** Suppression de INDICATEURREGIME non r�ussie !****************");
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}

	/** ************************************ */
	/** * AFFICHAGE ** */
	/** ************************************ */
	public String afficherRcIndicateurregime() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcIndicateurregime"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rctyperegime = pkTab[0];
		String rccoderegimedouanier = pkTab[1];
		String rccoderegimefiscal = pkTab[2];
		String rccodeindicateur = pkTab[3];
		String rcdatevalidite = pkTab[4];

		//On cr�� la cl�
		IndicateurRegimeKey indicateurregimekey = new IndicateurRegimeKey(
				rctyperegime, rccoderegimedouanier, rccoderegimefiscal, rccodeindicateur,  sysEnv.strToDate(rcdatevalidite));

		//Le VO
		IndicateurRegime indicateurregimevo = null;

		indicateurregimevo = gaindeBusinessDelegate.findIndicateurRegimeByPrimaryKey(indicateurregimekey);

		//Affichage dans le formulaire
		rcIndicateurregimeForm.setIndicateurregime(indicateurregimevo);

		//Redirection
		forward = page;

		return forward;

	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		try {
			rcIndicateurregimeForm.reset();
			rcIndicateurregimeForm.setListeRcIndicateurregime(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

//	/** ************************************ */
//	/** * CLE PRIMAIRE ** */
//	/** ************************************ */
//	private IndicateurregimeKey createIndicateurregimeKey(String rctyperegime,
//			String rccoderegimedouanier, String rccodeindicateur,
//			String rccoderegimefiscal, String rcdatevalidite) {
//		Date rcdatevalite1 = sysEnv.strToDate(rcdatevalidite);
//		IndicateurKey indicateurKey = new IndicateurKey(rccodeindicateur);
//		TyperegimedouaneKey typeregimedouaneKey = new TyperegimedouaneKey(
//				rctyperegime);
//		RegimedouanierKey regimedouanierKey = new RegimedouanierKey(
//				rccoderegimedouanier, typeregimedouaneKey);
//		RegimefiscalKey regimefiscalKey = new RegimefiscalKey(
//				rccoderegimefiscal);
//		RegimeKey regimeKey = new RegimeKey(regimefiscalKey, regimedouanierKey);
//
//		IndicateurregimeKey indicateurregimekey = new IndicateurregimeKey(
//				rcdatevalite1, indicateurKey, regimeKey);
//
//		return indicateurregimekey;
//	}
	@Override
	public RcIndicateurregimeForm getModel() {		
		return rcIndicateurregimeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcIndicateurregimeForm form) {
		this.rcIndicateurregimeForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcIndicateurregimeForm getRcIndicateurregimeForm() {
		return rcIndicateurregimeForm;
	}


	public void setRcIndicateurregimeForm(RcIndicateurregimeForm rcIndicateurregimeForm) {
		this.rcIndicateurregimeForm = rcIndicateurregimeForm;
	}
}