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
import sn.com.douane.ejb.rc.model.entities.IndicateurRegdou;
import sn.com.douane.ejb.rc.model.keys.IndicateurRegdouKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcIndicateurregdouForm;



public class RcIndicateurregdouAction extends GeneralDispatchAction implements ScopedModelDriven<RcIndicateurregdouForm> {

	private static final long serialVersionUID = 1L;
	private RcIndicateurregdouForm rcIndicateurregdouForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcIndicateurregdou() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		IndicateurRegdou indicateurregdouvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcIndicateurregdou"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			indicateurregdouvo = rcIndicateurregdouForm
					.getNewRcIndicateurregdouVO();
			
			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterIndicateurRegdou(indicateurregdouvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcIndicateurregdouForm.reset();

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcIndicateurregdou";
		} 

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcIndicateurregdou() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		IndicateurRegdou indicateurregdouvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcIndicateurregdou"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			indicateurregdouvo = rcIndicateurregdouForm
					.getNewRcIndicateurregdouVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierIndicateurRegdou(indicateurregdouvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcIndicateurregdou";
		} 

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcIndicateurregdou() {
	
		HttpServletRequest request = ServletActionContext.getRequest();
	
		//String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcIndicateurregdou" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";
	
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
	
		//R�cup�ration des crit�res saisis
		String rccodeindicateur = (rcIndicateurregdouForm
				.getNumListRcCodeIndicateurRech() == null ? ""
				: rcIndicateurregdouForm.getNumListRcCodeIndicateurRech());
		String rccoderegimedouanier = (rcIndicateurregdouForm
				.getNumListRcCodeRegimeDouanierRech() == null ? ""
				: rcIndicateurregdouForm.getNumListRcCodeRegimeDouanierRech());
		//String rcdatecloture =
		// (rcindicateurregdoufb.getDAT_RCDATECLOTURERech()==null ? "" :
		// rcindicateurregdoufb.getDAT_RCDATECLOTURERech());
		String rcdatevalidite = (rcIndicateurregdouForm
				.getDatRcDateValiditeRech() == null ? ""
				: rcIndicateurregdouForm.getDatRcDateValiditeRech());
		String rctyperegime = (rcIndicateurregdouForm
				.getNumListRcTypeRegimeRech() == null ? ""
				: rcIndicateurregdouForm.getNumListRcTypeRegimeRech());
	
		condition = "SELECT IR FROM IndicateurRegdou IR, Indicateur I WHERE 1 = 1";
	
		//Condition de recherche
		if (!rccodeindicateur.equals("")) {
			condition += " and IR.rcCodeIndicateur = '" + rccodeindicateur + "' ";
		}
		if (!rccoderegimedouanier.equals("")) {
			condition += " and IR.rcCodeRegimeDouanier = '" + rccoderegimedouanier
					+ "' ";
		}
		//		if (!rcdatecloture.equals(""))
		//			condition += " and RCDATECLOTURE = '"+rcdatecloture+"' ";
	
		if (!rcdatevalidite.equals("")) {
			condition += " and IR.rcDateValidite = '"
					+ new Date(DateUtil.convertStringToDate(rcdatevalidite)
							.getTime()) + "' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and IR.rcTypeRegime = '" + rctyperegime + "' ";
		}
		condition += " and IR.rcCodeIndicateur = I.rcCodeIndicateur ";
	
		//Rafraichissement de la liste des INDICATEURREGDOU
		try {
	
			List listeRcIndicateurregdou = null;
			listeRcIndicateurregdou = gaindeBusinessDelegate.rechercherIndicateurRegdou(condition);
	
			// pour la pagination du grid 
			if (listeRcIndicateurregdou!=null) {
				rcIndicateurregdouForm.setRecords(listeRcIndicateurregdou.size()); 
				rcIndicateurregdouForm.setTotal(
						(int) Math.ceil((double)rcIndicateurregdouForm.getRecords() 
								/ (double)rcIndicateurregdouForm.getRows())); 
				int to = (rcIndicateurregdouForm.getRows() * rcIndicateurregdouForm.getPage());
			    int from = to - rcIndicateurregdouForm.getRows();
			    if (to > rcIndicateurregdouForm.getRecords()) {
			    	to = rcIndicateurregdouForm.getRecords();
			    }
			    listeRcIndicateurregdou = listeRcIndicateurregdou.subList(from, to);
			}
			
			rcIndicateurregdouForm
					.setListeRcIndicateurregdou(listeRcIndicateurregdou);
	
			if (listeRcIndicateurregdou != null && listeRcIndicateurregdou.size() != 0)
	
			{
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {
	
				if (ctxmenu.equals("SM")) {
					page = "saisieRcIndicateurregdou";
	
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");
	
					if (!rccodeindicateur.equals("")) {
						rcIndicateurregdouForm
								.setNumListRcCodeIndicateurOB(rccodeindicateur);
					}
					if (!rccoderegimedouanier.equals("")) {
						rcIndicateurregdouForm
								.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					//					if (!rcdatecloture.equals(""))
					//						rcindicateurregdoufb.setDAT_RCDATECLOTURE(rcdatecloture);
	
					if (!rcdatevalidite.equals("")) {
						rcIndicateurregdouForm
								.setDatRcDateValiditeOB(rcdatevalidite);
					}
					if (!rctyperegime.equals("")) {
						rcIndicateurregdouForm
								.setNumListRcTypeRegimeOB(rctyperegime);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(
							ConstErrCodRC.rcRowNotFound));
				}
	
				if (!ctxmenu.equals("C")) {
					rcIndicateurregdouForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche INDICATEURREGDOU");
		} 
	
//		forward = page;
//		return forward;
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcIndicateurregdou() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcIndicateurregdou = null;


		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rctyperegime = pkTab[0];
		String rccoderegimedouanier = pkTab[1];
		String rccodeindicateur = pkTab[2];
		String rcdatevalidite = pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcIndicateurregdou"
				: request.getParameter(ConstManif.PAGE));

		try {

			//On cr�� la cl�
			IndicateurRegdouKey indicateurregdoukey = new IndicateurRegdouKey(Date.valueOf(rcdatevalidite), rccodeindicateur, rccoderegimedouanier, rctyperegime);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerIndicateurRegdou(indicateurregdoukey);

			//Raffraichissement de la liste des INDICATEURREGDOU
			listeRcIndicateurregdou = gaindeBusinessDelegate.rechercherIndicateurRegdou("from IndicateurRegdou where 1 = 1 ");
			rcIndicateurregdouForm
					.setListeRcIndicateurregdou(listeRcIndicateurregdou);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(
						ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
            log.error("**** Suppression de INDICATEURREGDOU non r�ussie !****************");
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
	public String afficherRcIndicateurregdou() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcIndicateurregdou"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rctyperegime = pkTab[0];
		String rccoderegimedouanier = pkTab[1];
		String rccodeindicateur = pkTab[2];
		String rcdatevalidite = pkTab[3];

		//On cr�� la cl�
		IndicateurRegdouKey indicateurregdoukey = new IndicateurRegdouKey(Date.valueOf(rcdatevalidite), rccodeindicateur, rccoderegimedouanier, rctyperegime);

		//Le VO
		IndicateurRegdou indicateurregdouvo = null;
		indicateurregdouvo = gaindeBusinessDelegate
				.findIndicateurRegdouByPrimaryKey(indicateurregdoukey);


		//Affichage dans le formulaire
		rcIndicateurregdouForm.setIndicateurregdou(indicateurregdouvo);

		//Redirection
		forward = page;

		return forward;

	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}
		try {
			rcIndicateurregdouForm.reset();
			rcIndicateurregdouForm.setListeRcIndicateurregdou(new ArrayList());

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
//	private IndicateurregdouKey createIndicateurregdouKey(String rctyperegime,
//			String rccoderegimedouanier, String rccodeindicateur,
//			String rcdatevalidite) {
//
//		Date rcdatevalidite1 = sysEnv.strToDate(rcdatevalidite);
//		//new Date(DateUtil.convertStringToDate(rcdatevalidite).getTime());
//
//		IndicateurKey indicateurKey = new IndicateurKey(rccodeindicateur);
//		TyperegimedouaneKey typeregimedouaneKey = new TyperegimedouaneKey(
//				rctyperegime);
//		RegimedouanierKey regimedouanierKey = new RegimedouanierKey(
//				rccoderegimedouanier, typeregimedouaneKey);
//
//		IndicateurregdouKey indicateurregdoukey = new IndicateurregdouKey(
//				rcdatevalidite1, indicateurKey, regimedouanierKey);
//
//		return indicateurregdoukey;
//	}
	@Override
	public RcIndicateurregdouForm getModel() {		
		return rcIndicateurregdouForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcIndicateurregdouForm form) {
		this.rcIndicateurregdouForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcIndicateurregdouForm getRcIndicateurregdouForm() {
		return rcIndicateurregdouForm;
	}


	public void setRcIndicateurregdouForm(RcIndicateurregdouForm rcIndicateurregdouForm) {
		this.rcIndicateurregdouForm = rcIndicateurregdouForm;
	}
}