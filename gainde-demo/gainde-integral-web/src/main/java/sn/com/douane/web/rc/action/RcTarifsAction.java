package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.UserTransaction;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.PositionProduit;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.ReglementExport;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;
import sn.com.douane.ejb.rc.model.entities.Tarif;
import sn.com.douane.ejb.rc.model.keys.ProduitKey;
import sn.com.douane.ejb.rc.model.keys.TarifsKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcTarifsForm;


 
public class RcTarifsAction extends GeneralDispatchAction implements ScopedModelDriven<RcTarifsForm> {

	private static final long serialVersionUID = 1L;
	private RcTarifsForm rcTarifsForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();

	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcTarifs() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Les VO
		Tarif tarifsvo = null;
		Produit produitsvo = null;
		Produit produit = null;
		ReglementImport reglementimportvo = null;
		ReglementExport reglementexportvo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcTarifs" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs des VO
			tarifsvo = rcTarifsForm.getNewRcTarifsVO();
			produitsvo = rcTarifsForm.getNewRcProduitVO();
			reglementimportvo = rcTarifsForm.getNewReglementimportVO();
			reglementexportvo = rcTarifsForm.getNewReglementexportVO();

			try {
				produit =
						gaindeBusinessDelegate.findProduitByPrimaryKey(rcTarifsForm.getNumListRcCodeProdOB(),
								rcTarifsForm.getNumListRcPrecUemoaOB(), rcTarifsForm.getNumListRcPrecSenegalOB());
			} catch (Exception e) {

				// On ex�cute la commande d'ajout

				gaindeBusinessDelegate.ajouterProduit(produitsvo);
				gaindeBusinessDelegate.ajouterReglementImport(reglementimportvo);
				gaindeBusinessDelegate.ajouterReglementExport(reglementexportvo);
			}
			gaindeBusinessDelegate.ajouterTarif(tarifsvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			// rctarifsfb.reset(mapping, request);

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcTarifs";
		}

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcTarifs() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		UserTransaction trans = null;

		// Le VO
		Tarif tarifsvo = null;
		Produit produitsvo = null;
		ReglementImport reglementimportvo = null;
		ReglementExport reglementexportvo = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcTarifs" : request
						.getParameter(ConstManif.PAGE));

		try {

			// On remplit les attributs du VO
			tarifsvo = rcTarifsForm.getNewRcTarifsVO();
			produitsvo = rcTarifsForm.getNewRcProduitVO();
			reglementimportvo = rcTarifsForm.getNewReglementimportVO();
			reglementexportvo = rcTarifsForm.getNewReglementexportVO();

			gaindeBusinessDelegate.modifierTarif(tarifsvo);
			gaindeBusinessDelegate.modifierReglementImport(reglementimportvo);
			gaindeBusinessDelegate.modifierReglementExport(reglementexportvo);
			gaindeBusinessDelegate.modifierProduit(produitsvo);
			trans.commit();

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcTarifs";
		}

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcTarifs() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String forward;
		// Le VO

		// String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcTarifs" :
		// request.getParameter(ConstManif.PAGE));
		String condition = " ";

		// On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		// R�cup�ration des crit�res saisis
		String rccodeprod =
				(rcTarifsForm.getNumListRcCodeProdRech() == null ? "" : rcTarifsForm.getNumListRcCodeProdRech());
		String rccodetaux =
				(rcTarifsForm.getNumListRcCodeTauxRech() == null ? "" : rcTarifsForm.getNumListRcCodeTauxRech());
		String rccodetaxe =
				(rcTarifsForm.getNumListRcCodeTaxeRech() == null ? "" : rcTarifsForm.getNumListRcCodeTaxeRech());
		// String rcdatecloture = (rctarifsfb.getDAT_RCDATECLOTURERech()==null ?
		// "" : rctarifsfb.getDAT_RCDATECLOTURERech());
		String rcdatevaleur =
				(rcTarifsForm.getDatRcDateValeurRech() == null ? "" : rcTarifsForm.getDatRcDateValeurRech());
		String rcprecsenegal =
				(rcTarifsForm.getNumListRcPrecSenegalRech() == null ? "" : rcTarifsForm.getNumListRcPrecSenegalRech());
		String rcprecuemoa =
				(rcTarifsForm.getNumListRcPrecUemoaRech() == null ? "" : rcTarifsForm.getNumListRcPrecUemoaRech());

		String rccodechapitre = "";
		if (!rccodeprod.equals("")) {
			String rccodeposition = rccodeprod.substring(0, 4);
			String whereRCcodeposition = " and rccodeposition = '" + rccodeposition + "' ";
			PositionProduit positionvo = null;
			List vectPosition =
					gaindeBusinessDelegate.rechercherByWherePositionProduit("from PositionProduit where 1=1 "
							+ whereRCcodeposition);
			if (vectPosition.size() == 0) {
				addActionError(getText(ConstErrCodRC.produitError));
				rcTarifsForm.setListeRcTarifs(new ArrayList());
				forward = page;
				return forward;

			} else {
				positionvo = (PositionProduit) vectPosition.get(0);
				rccodechapitre = positionvo.getRcCodeChapitre();
			}
		}

		// Condition de recherche
		if (!rccodeprod.equals("")) {
			condition += " and rcCodeProd = '" + rccodeprod + "' ";
		}

		if (!rccodetaux.equals("")) {
			condition += " and rcCodeTaux = '" + rccodetaux + "' ";
		}
		if (!rccodetaxe.equals("")) {
			condition += " and rcCodeTaxe = '" + rccodetaxe + "' ";
		}
		if (!rcdatevaleur.equals("")) {
			condition += " and rcDateValeur = '" + sysEnv.strToDate(rcdatevaleur) + "' ";
		}
		if (!rcprecsenegal.equals("")) {
			condition += " and rcPrecSenegal = '" + rcprecsenegal + "' ";
		}

		if (!rcprecuemoa.equals("")) {
			condition += " and rcPrecueMoa = '" + rcprecuemoa + "' ";
		}

		// Rafraichissement de la liste des TARIFS
		try {

			List listeRcTarifs = null;
			listeRcTarifs = gaindeBusinessDelegate.rechercherTarif("from Tarif where 1=1 " + condition);
			if (listeRcTarifs != null) {
				rcTarifsForm.setRecords(listeRcTarifs.size());
				rcTarifsForm.setTotal((int) Math.ceil((double) rcTarifsForm.getRecords()
						/ (double) rcTarifsForm.getRows()));
				int to = (rcTarifsForm.getRows() * rcTarifsForm.getPage());
				int from = to - rcTarifsForm.getRows();
				if (to > rcTarifsForm.getRecords()) {
					to = rcTarifsForm.getRecords();
				}
				listeRcTarifs = listeRcTarifs.subList(from, to);
			}
			rcTarifsForm.setListeRcTarifs(listeRcTarifs);

			if (listeRcTarifs != null && listeRcTarifs.size() != 0)

			{

				if (ctxmenu != null && !ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcTarifs";

					// ///////////////
					Produit produitsvo = null;
					ReglementImport reglementimportvo = null;
					ReglementExport reglementexportvo = null;

					try {
						produitsvo =
								gaindeBusinessDelegate.findProduitByPrimaryKey(rccodeprod, rcprecuemoa, rcprecsenegal);
					} catch (Exception e) {

						// if(produitsvo!=null){

						String where =
								" and RCCODEPROD='" + rccodeprod + "' and RCPRECUEMOA='" + rcprecuemoa
										+ "' and RCPRECSENEGAL='" + rcprecsenegal + "'";
						List vectorImport =
								gaindeBusinessDelegate.rechercherReglementImport("from ReglementImport where 1=1 "
										+ where);
						List vectorExport =
								gaindeBusinessDelegate.rechercherReglementExport("from ReglementExport where 1=1 "
										+ where);
						if (vectorImport.size() != 0) {
							reglementimportvo = (ReglementImport) vectorImport.get(0);
						}
						if (vectorExport.size() != 0) {
							reglementexportvo = (ReglementExport) vectorExport.get(0);
						}
						rcTarifsForm.setProduits(produitsvo);
						rcTarifsForm.setReglementExport(reglementexportvo);
						rcTarifsForm.setReglementImport(reglementimportvo);
					}
					// //////////////

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");
					rcTarifsForm.setNumRcCodeCimexOB("0");
					rcTarifsForm.setNumRcExonorePVIOB("N");
					rcTarifsForm.setNumRcActif("O");
					rcTarifsForm.setRcAutChange("0");
					rcTarifsForm.setRcautchangeExport("0");

					if (!rccodeprod.equals("")) {
						rcTarifsForm.setNumListRcCodeProdOB(rccodeprod);
						rcTarifsForm.setNumListrcValChapitreOB(rccodechapitre);
					}
					if (!rccodetaux.equals("")) {
						rcTarifsForm.setNumListRcCodeTauxxOB(rccodetaux);
					}
					if (!rccodetaxe.equals("")) {
						rcTarifsForm.setNumListRcCodeTaxeOB(rccodetaxe);
					}
					if (!rcdatevaleur.equals("")) {
						rcTarifsForm.setDatRcDateValeurOB(rcdatevaleur);
					}
					if (!rcprecsenegal.equals("")) {
						rcTarifsForm.setNumListRcPrecSenegalOB(rcprecsenegal);
					}
					if (!rcprecuemoa.equals("")) {
						rcTarifsForm.setNumListRcPrecUemoaOB(rcprecuemoa);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcTarifsForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			log.error("Erreur de recherche TARIFS");
		}

		if (page == null) {
			return SUCCESS;
		} else {
			return page;
		}
	}

	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcTarifs() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcTarifs = null;

		// Le VO
		Produit produitsvo = null;

		// Cl� de l'enregistrement � supprimer
		String pkTab[] = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rccodeprod = pkTab[0];
		String rcprecuemoa = pkTab[1];
		String rcprecsenegal = pkTab[2];
		// String rccodetaxe = pkTab[3];
		// String rccodetaux = pkTab[4];
		// String rcdatevaleur = pkTab[5];
		// String rccodecimex = pkTab[6];

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "rechercheRcTarifs" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On cr�� la cl�
			produitsvo = gaindeBusinessDelegate.findProduitByPrimaryKey(rccodeprod, rcprecuemoa, rcprecsenegal);

			// On ex�cute la commande de modification
			produitsvo.setRcactif("N");
			gaindeBusinessDelegate.modifierProduit(produitsvo);

			// Rafraichissement de la page
			listeRcTarifs = gaindeBusinessDelegate.rechercherTarif("from Tarif where 1=1 ");
			rcTarifsForm.setListeRcTarifs(listeRcTarifs);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de TARIFS non r�ussie !****************");
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
	public String afficherRcTarifs() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		// Page de redirection
		String forward = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcTarifs" : request
						.getParameter(ConstManif.PAGE_CONTEXT));

		// Cl� de recherche
		String pkTab[] = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rccodeprod = pkTab[0];
		String rcprecuemoa = pkTab[1];
		String rcprecsenegal = pkTab[2];
		String rccodetaxe = pkTab[3];
		String rccodetaux = pkTab[4];
		String rcdatevaleur = pkTab[5];
		String rccodecimex = pkTab[6];

		// On cr�� la cl�
		TarifsKey tarifskey =
				new TarifsKey(rccodeprod, rcprecuemoa, rcprecsenegal, rccodetaxe, rccodetaux,
						sysEnv.strToDate(rcdatevaleur), rccodecimex);

		// Le VO
		Tarif tarifsvo = null;
		Produit produitsvo = null;
		ReglementImport reglementimportvo = null;
		ReglementExport reglementexportvo = null;

		String where =
				" and RCCODEPROD='" + rccodeprod + "' and RCPRECUEMOA='" + rcprecuemoa + "' and RCPRECSENEGAL='"
						+ rcprecsenegal + "'";

		tarifsvo = gaindeBusinessDelegate.findTarifByPrimaryKey(tarifskey);
		produitsvo = gaindeBusinessDelegate.findProduitByPrimaryKey(rccodeprod, rcprecuemoa, rcprecsenegal);
		List vectorImport = gaindeBusinessDelegate.rechercherReglementImport("from ReglementImport where 1=1 " + where);
		List vectorExport = gaindeBusinessDelegate.rechercherReglementExport("from ReglementExport where 1=1 " + where);

		if (vectorImport.size() != 0) {
			reglementimportvo = (ReglementImport) vectorImport.get(0);
		}
		if (vectorExport.size() != 0) {
			reglementexportvo = (ReglementExport) vectorExport.get(0);
		}

		// Affichage dans le formulaire
		rcTarifsForm.setReglementExport(reglementexportvo);
		rcTarifsForm.setReglementImport(reglementimportvo);
		rcTarifsForm.setProduits(produitsvo);
		rcTarifsForm.setTarifs(tarifsvo);

		// Redirection
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
			rcTarifsForm.reset();
			rcTarifsForm.setListeRcTarifs(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

// /** ************************************ */
// /** * CLE PRIMAIRE ** */
// /** ************************************ */
// private TarifsKey createTarifsKey(String rccodeprod, String rcprecuemoa,
// String rcprecsenegal, String rccodetaxe, String rccodetaux,
// String rcdatevaleurStr, String rccodecimex) {
// Date rcdatevaleur = Date.valueOf(DateUtil.convertDateUS2ISO(rcdatevaleurStr));
// ProduitsKey produitsKey = new ProduitsKey(rccodeprod, rcprecuemoa,
// rcprecsenegal);
// TaxesKey taxesKey = new TaxesKey(rccodetaxe);
//
// TarifsKey tarifskey = new TarifsKey(rccodetaux, rcdatevaleur,
// rccodecimex, produitsKey, taxesKey);
//
// return tarifskey;
// }
 @Override
	public RcTarifsForm getModel() {		
		return rcTarifsForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcTarifsForm form) {
		this.rcTarifsForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcTarifsForm getRcTarifsForm() {
		return rcTarifsForm;
	}


	public void setRcTarifsForm(RcTarifsForm rcTarifsForm) {
		this.rcTarifsForm = rcTarifsForm;
	}
 }