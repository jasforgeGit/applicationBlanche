package sn.com.douane.web.consultationTarif.action;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.ChapitreSection;
import sn.com.douane.ejb.rc.model.entities.PieceJointe;
import sn.com.douane.ejb.rc.model.entities.PositionProduit;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;
import sn.com.douane.ejb.rc.model.entities.ReglementExport;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;
import sn.com.douane.ejb.rc.model.entities.SectionProduit;
import sn.com.douane.ejb.rc.model.entities.Tarif;
import sn.com.douane.ejb.rc.model.entities.Taux;
import sn.com.douane.ejb.rc.model.keys.ProduitKey;
import sn.com.douane.ejb.rc.model.keys.ReglementExportKey;
import sn.com.douane.ejb.rc.model.keys.ReglementImportKey;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.consultationTarif.form.ConsultationTarifForm;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class ConsultationTarifAction extends GeneralDispatchAction implements
		ScopedModelDriven<ConsultationTarifForm> {

	private static final long serialVersionUID = -3718938923475841477L;

	private ConsultationTarifForm consultationTarifForm;

	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	private String scopeKey;

	// Fonction qui permet de rechercher les sections
	public String rechercherSection() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		// Page de forward
		String page ;
		String maPageRetour = "";

		// Champs de recherche
		String rccodesection = consultationTarifForm.getNumRcCodeSectionRech();
		String rclibellesection = consultationTarifForm
				.getNumRcLibelleSectionRech();
		String rccodeprod = consultationTarifForm.getNumRcCodeProdRech();
		String rcprecUemoa = consultationTarifForm.getNumRcPrecUemoaRech();
		String rcprecSenegal = consultationTarifForm.getNumRcPrecSenegalRech();

		// Condition de recherche
		String where = "";
		String whereProduit = "";

		if (rccodesection != null) {
			if (!rccodesection.equals("")){
				where += " AND rcCodeSection = '" + rccodesection + "'";
			}
		}
		if (rclibellesection != null) {
			if (!rclibellesection.equals("")){
				where += " AND rcLibelleSection LIKE '" + rclibellesection
						+ "'";
			}
		}
		if (rccodeprod != null && !rccodeprod.equals("")) {
			whereProduit += " and rccodeprod = '" + rccodeprod + "' and rcactif='O' ";
		}
		if (rcprecUemoa != null && !rcprecUemoa.equals("")) {
			whereProduit += " and rcprecuemoa = '" + rcprecUemoa + "' ";
		}
		if (rcprecSenegal != null && !rcprecSenegal.equals("")) {
			whereProduit += " and rcprecsenegal = '" + rcprecSenegal + "' ";
		}
		if (whereProduit != null && !whereProduit.equals("")) {
			page = "rechercheProduit";
			maPageRetour = "rechercheSection";
			consultationTarifForm.setRcCodePosition("");
		} else {
			page = "rechercheSection";

		}
		request.getSession().setAttribute("pageRetour", maPageRetour);

		try {
			where += " order by rcCodeSection";
			List<SectionProduit> listeSection = null;

			listeSection = gaindeBusinessDelegate
					.rechercherByWhereSectionProduit(" "
							+ "from SectionProduit where 1=1 " + where);
			consultationTarifForm.setListeSection(listeSection);
			List<Produit> listProduits = null;
			listProduits = gaindeBusinessDelegate.rechercherByWhereProduit(" "
					+ "from Produit where 1=1 " + whereProduit);
			consultationTarifForm.setListeProduit(listProduits);
		} catch (Exception e) {
			log.debug("erreur dans rechercherSection " + e.getMessage());
			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'afficher la liste des chapitres correspondant à une
	// section

	public String afficherChapitre() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de recherche
		String pk = request.getParameter(ConstManif.PK);
		String param[] = pk.split(ConstManif.TIELD);
		String rccodesection = param[0];
		String rccoderomainsection = param[1];
		consultationTarifForm.setRcCodeSection(rccodesection);
		consultationTarifForm.setRcCodeRomainSection(rccoderomainsection);

		// Condition de recherche
		String where = " AND rccodesection = '" + rccodesection
				+ "' AND rccoderomainsection = '" + rccoderomainsection + "'";
		try {
			List<ChapitreSection> listeChapitre = null;

			listeChapitre = gaindeBusinessDelegate
					.rechercherByWhereChapitreSection(" "
							+ "from ChapitreSection where 1=1 " + where);

			consultationTarifForm.setListeChapitre(listeChapitre);
		} catch (Exception e) {
			log.error("Erreur de affichage Chapitre " + e.getMessage());

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'effectuer une recherche sur la liste des
	// chapitres correspondant à une section

	public String rechercherChapitre() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de la section
		String rccodesection = consultationTarifForm.getRcCodeSection();
		String rccoderomainsection = consultationTarifForm
				.getRcCodeRomainSection();

		// Champs de recherche chapitre
		String rccodechapitre = consultationTarifForm
				.getNumRcCodeChapitreRech();
		String rclibellechapitre = consultationTarifForm
				.getNumRcLibelleChapitreRech();

		// Condition de recherche
		String where = " AND rccodesection = '" + rccodesection + "' "
				+ " AND rccoderomainsection ='" + rccoderomainsection + "'";

		if (rccodechapitre != null){
			if (!rccodechapitre.equals("")){
				where += " AND rccodechapitre = '" + rccodechapitre + "'";
			}
		}
		if (rclibellechapitre != null){
			if (!rclibellechapitre.equals("")){
				where += " AND rclibellechapitre LIKE '" + rclibellechapitre
						+ "'";
			}
		}
		try {
			where += " order by rccodechapitre";
			List<ChapitreSection> listeChapitre = null;

			listeChapitre = gaindeBusinessDelegate
					.rechercherByWhereChapitreSection(" "
							+ " from ChapitreSection where 1=1 " + where);

			consultationTarifForm.setListeChapitre(listeChapitre);

		} catch (Exception e) {
			log.error("Erreur de recherche Chapitre");

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'afficher la liste des positions correspondant à
	// un chapitre
	public String afficherPosition() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de recherche
		String pk = request.getParameter(ConstManif.PK);
		consultationTarifForm.setRcCodeChapitre(pk);

		// Condition de recherche
		String where = " AND rcCodeChapitre = '" + pk + "'";
		try {
			List<PositionProduit> listePosition = null;

			listePosition = gaindeBusinessDelegate
					.rechercherByWherePositionProduit(" from PositionProduit where 1=1 "+where);

			consultationTarifForm.setListePosition(listePosition);
		} catch (Exception e) {
			log.error("Erreur de affichage Position" + e.getMessage());

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'effectuer une recherche sur la liste des
	// positions correspondant à un chapitre
	public String rechercherPosition() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de la section
		String rccodechapitre = consultationTarifForm.getRcCodeChapitre();

		// Champs de recherche chapitre
		String rccodeposition = consultationTarifForm
				.getNumRcCodePositionRech();
		String rclibelleposition = consultationTarifForm
				.getNumRcLibellePositionRech();

		// Condition de recherche
		String where = " AND rcCodeChapitre = '" + rccodechapitre + "'";

		if (rccodeposition != null){
			if (!rccodeposition.equals("")){
				where += " AND rcCodePosition = '" + rccodeposition + "'";
			}
		}
		if (rclibelleposition != null){
			if (!rclibelleposition.equals("")){
				where += " AND rcLibellePosition LIKE '" + rclibelleposition
						+ "'";
			}
		}

		try {
			List<PositionProduit> listePosition = null;

			listePosition = gaindeBusinessDelegate
					.rechercherByWherePositionProduit(" "
							+ " from PositionProduit where 1=1 " + where);

			consultationTarifForm.setListePosition(listePosition);

		} catch (Exception e) {
			log.error("Erreur de recherche Position " + e.getMessage());

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'afficher la liste des produits correspondant à
	// une position
	public String afficherProduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de recherche
		String pk = request.getParameter(ConstManif.PK);
		consultationTarifForm.setRcCodePosition(pk);

		// Condition de recherche
		String where = " AND rcactif='O' AND rccodeprod LIKE '" + pk + "%'";
		try {
			List<Produit> listeProduit = null;

			listeProduit = gaindeBusinessDelegate.rechercherByWhereProduit(" "
					+ " from Produit where 1=1 " + where);

			consultationTarifForm.setListeProduit(listeProduit);
			String maPageRetour = "recherchePosition";
			request.getSession().setAttribute("pageRetour", maPageRetour);
		} catch (Exception e) {
			log.error("Erreur de affichage Produit" + e.getMessage());

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'effectuer une recherche sur la liste des produits
	// correspondant à un position
	public String rechercherProduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de la position
		String rccodeposition = consultationTarifForm.getRcCodePosition();

		// Champs de recherche produit
		String rccodeprod = consultationTarifForm.getNumRcCodeProdRech();
		String rcprecuemoa = consultationTarifForm.getNumRcPrecUemoaRech();
		String rcprecsenegal = consultationTarifForm.getNumRcPrecSenegalRech();
		String rclibelletarif = consultationTarifForm
				.getNumRcLibelleTarifRech();

		// Condition de recherche
		String where = " and rcactif='O' AND rccodeprod LIKE '"
				+ rccodeposition + "%'";
//		boolean found =false;
		if (!sysEnv.isNullOrEmpty(rccodeprod) ){
			where += " AND rccodeprod = '" + rccodeprod + "' AND rcactif='O'";
//			found=true;
		}

		if (!sysEnv.isNullOrEmpty(rcprecuemoa)){
			where += " AND rcprecuemoa = '" + rcprecuemoa + "'";
//			found=true;
		}

		if (!sysEnv.isNullOrEmpty(rclibelletarif)){
			where += " AND rclibelletarif LIKE '" + rclibelletarif + "'";
//			found=true;
		}

		if (!sysEnv.isNullOrEmpty(rcprecsenegal )){
			where += " AND rcprecsenegal = '" + rcprecsenegal + "'";
//			found=true;
		}

		try {
//			if(!found){
//				return rechercherSection();
//			}
			List<Produit> listeProduit = null;

			listeProduit = gaindeBusinessDelegate
					.rechercherByWhereProduit(" from Produit where 1=1 "
							+ where);

			consultationTarifForm.setListeProduit(listeProduit);

		} catch (Exception e) {
			log.error("Erreur de recherche Produit " + e.getMessage());

			addActionError(e.getMessage());

		}

		return page;
	}

	// Fonction qui permet d'afficher la liste des fiscalite et piece jointe
	// correspondant à un produit
	public String consulterFiscalite() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		// Page de forward
		String page = request.getParameter(ConstManif.PAGE);

		// Clé de recherche
		String pk = request.getParameter(ConstManif.PK);
		try {
			log.info("ConsultationTarifACT.consulterFiscalite() pk=" + pk);
			String[] prd = pk.split(ConstManif.TIELD);
			consultationTarifForm.setNumRcCodeProdRech(prd[0]);
			consultationTarifForm.setNumRcPrecUemoaRech(prd[1]);
			consultationTarifForm.setNumRcPrecSenegalRech(prd[2]);

			Produit produitsvo = null;
			ProduitKey produitsKey = new ProduitKey(prd[0], prd[1], prd[2]);
			produitsvo = gaindeBusinessDelegate.rechercherProduit(produitsKey);

			consultationTarifForm.setRcIndProdPetrolier(produitsvo
					.getRcindprodpetrolier());
			consultationTarifForm.setRcCodeProdArtisanal(produitsvo
					.getRccodeprodartisanal());
			consultationTarifForm.setRcCodeProdCru(produitsvo
					.getRccodeprodcru());
			consultationTarifForm.setRcUniteComp(produitsvo.getRcunitecomp());
			consultationTarifForm.setRcCodeTransit(produitsvo
					.getRccodetransit());
			consultationTarifForm.setRcCodebienEquip(produitsvo
					.getRccodebienequip());
			consultationTarifForm.setRcCodeEntrepot(produitsvo
					.getRccodeentrepot());
			consultationTarifForm.setRcCodeProdSocial(produitsvo
					.getRccodeprodsocial());
			consultationTarifForm.setRcCodePerissable(produitsvo
					.getRccodeperissable());
			consultationTarifForm.setRcExonorePvi(produitsvo.getRcexonorepvi());

			// Condition de recherche
			String whereImp = "select tt from Tarif tt where tt.rcCodeProd ='"
					+ prd[0]
					+ "' and tt.rcPrecueMoa='"
					+ prd[1]
					+ "' and tt.rcPrecSenegal='"
					+ prd[2]
					+ "' "
					+ " and tt.rcCodeCimex='0' and tt.rcDateValeur=( select max(t.rcDateValeur) from Tarif t where t.rcCodeProd ='"
					+ prd[0]
					+ "' and t.rcPrecueMoa='"
					+ prd[1]
					+ "' and t.rcPrecSenegal='"
					+ prd[2]
					+ "' and t.rcCodeCimex='0' and t.rcCodeTaxe = tt.rcCodeTaxe )";

			String whereExp = "select tt from Tarif tt where tt.rcCodeProd ='"
					+ prd[0]
					+ "' and tt.rcPrecueMoa='"
					+ prd[1]
					+ "' and tt.rcPrecSenegal='"
					+ prd[2]
					+ "' "
					+ " and tt.rcCodeCimex='1' and tt.rcDateValeur=( select max(t.rcDateValeur) from Tarif t where t.rcCodeProd ='"
					+ prd[0]
					+ "' and t.rcPrecueMoa='"
					+ prd[1]
					+ "' and t.rcPrecSenegal='"
					+ prd[2]
					+ "' and t.rcCodeCimex='1' and t.rcCodeTaxe=tt.rcCodeTaxe) ";

			List<Tarif> listeTarif = null;
			List<Tarif> lfisimp = null;
			Tarif tarifsVO = null;
			listeTarif = gaindeBusinessDelegate
					.rechercherByWhereTarif(whereImp);
			Taux tauxVO = null;
			lfisimp = new ArrayList<Tarif>();
			List<Taux> maxtaux;
			for (int i = 0; i < listeTarif.size(); i++) {
				tauxVO = new Taux();
				tarifsVO = listeTarif.get(i);
				try {
					log.info("ConsultationTarifACT.consulterFiscalite() tarifsVO.getRccodetaux(), tarifsVO.getRcdatevaleur(), "
							+ "new TaxesKey(tarifsVO.getRccodetaxe())="
							+ tarifsVO.getRcCodeTaux()
							+ "-"
							+ tarifsVO.getRcDateValeur()
							+ "-"
							+ tarifsVO.getRcCodeTaxe());

					tarifsVO.setDateValeurTaux(sysEnv.dateToStr(tarifsVO
							.getRcDateValeur()));

					String whereTaux = null;
					whereTaux = "select taux from Taux taux where  rcCodeTaxe='"
							+ tarifsVO.getRcCodeTaxe()
							+ "' and rcCodeTaux='"
							+ tarifsVO.getRcCodeTaux()
							+ "' "
							+ "and rcDateValeur=(select max(rcDateValeur) from Taux where "
							+ "rcCodeTaxe='"
							+ tarifsVO.getRcCodeTaxe()
							+ "' and rcCodeTaux='"
							+ tarifsVO.getRcCodeTaux()
							+ "') ";

					maxtaux = gaindeBusinessDelegate
							.rechercherByWhereTaux(whereTaux);
					if (maxtaux.size() > 0){
						tauxVO = maxtaux.get(0);
					}
					tarifsVO.setDateValeurTaux(sysEnv.dateToStr(tauxVO
							.getRcDateValeur()));
					tarifsVO.setLibelleTaux(tauxVO.getLibelleTaux());
					tarifsVO.setRcValeurTaux(tauxVO.getRcValeurTaux());
				} catch (Exception e) {

					log.error("ConsultationTarifACT.consulterFiscalite()"
							+ e.getMessage());
				}

				lfisimp.add(tarifsVO);
			}
			consultationTarifForm.setListeFiscaliteImp(lfisimp);

			tarifsVO = new Tarif();
			lfisimp = new ArrayList<Tarif>();
			listeTarif = gaindeBusinessDelegate
					.rechercherByWhereTarif(whereExp);
			String whereTaux = null;
			for (int i = 0; i < listeTarif.size(); i++) {
				tauxVO = new Taux();
				tarifsVO = listeTarif.get(i);
				try {
					tarifsVO.setDateValeurTaux(sysEnv.dateToStr(tarifsVO
							.getRcDateValeur()));
					whereTaux = "select taux  from Taux taux where  rcCodeTaxe='"
							+ tarifsVO.getRcCodeTaxe()
							+ "' and rcCodeTaux='"
							+ tarifsVO.getRcCodeTaux()
							+ "' "
							+ "and rcDateValeur=(select max(rcDateValeur) from Taux where "
							+ "rcCodeTaxe='"
							+ tarifsVO.getRcCodeTaxe()
							+ "' and rcCodeTaux='"
							+ tarifsVO.getRcCodeTaux()
							+ "') ";

					maxtaux = gaindeBusinessDelegate
							.rechercherByWhereTaux(whereTaux);
					if (maxtaux.size() > 0){
						tauxVO = maxtaux.get(0);
					}
					tarifsVO.setLibelleTaux(tauxVO.getLibelleTaux());
					tarifsVO.setDateValeurTaux(sysEnv.dateToStr(tauxVO
							.getRcDateValeur()));
					tarifsVO.setRcValeurTaux(tauxVO.getRcValeurTaux());
				} catch (Exception e) {

					log.error("ConsultationTarifACT.consulterFiscalite()"
							+ e.getMessage());
				}
				lfisimp.add(tarifsVO);
			}
			consultationTarifForm.setListeFiscaliteExp(lfisimp);

			// Partie pieces jointes
			ProduitPjt produitspjtVO = new ProduitPjt();
			List<ProduitPjt> lfisimPjt = new ArrayList<ProduitPjt>();
			PieceJointe piecesjointesVO = null;

			whereImp = " and rccodeproduit='" + prd[0]
					+ "' and rcprecuemoaprod='" + prd[1]
					+ "' and rcprecsenprod='" + prd[2]
					+ "' and rcimportexport='0'";

			whereExp = " and rccodeproduit='" + prd[0]
					+ "' and rcprecuemoaprod='" + prd[1]
					+ "' and rcprecsenprod='" + prd[2]
					+ "' and rcimportexport='1'";
			// cas import
			List<ProduitPjt> listeProduitPjt = gaindeBusinessDelegate
					.rechercherByWhereProduitPjt(" from ProduitPjt where 1=1 "
							+ whereImp);
			for (int i = 0; i < listeProduitPjt.size(); i++) {
				produitspjtVO = listeProduitPjt.get(i);
				try {
					produitspjtVO.setDatePieceJointe(sysEnv
							.dateToStr(produitspjtVO.getRcdatepiecejointe()));

					piecesjointesVO = gaindeBusinessDelegate
							.rechercherPiecesJointe(produitspjtVO
									.getRccodepiecejointe());

					produitspjtVO.setLibellePj(piecesjointesVO
							.getRcDesPieceJointe());
					produitspjtVO.setDatePieceJointe(sysEnv
							.dateToStr(piecesjointesVO.getRcDatePieceJointe()));
				} catch (RcEjbException e) {

					log.error("ConsultationTarifACT.consulterPieceJointe()"
							+ e.getMessage());
				}
				lfisimPjt.add(produitspjtVO);
			}
			consultationTarifForm.setListePieceJointe(lfisimPjt);

			// cas piece joint export

			listeProduitPjt = gaindeBusinessDelegate
					.rechercherByWhereProduitPjt(" from ProduitPjt where 1=1 "
							+ whereExp);
			for (int i = 0; i < listeProduitPjt.size(); i++) {
				produitspjtVO = listeProduitPjt.get(i);
				try {
					produitspjtVO.setDatePieceJointe(sysEnv
							.dateToStr(produitspjtVO.getRcdatepiecejointe()));

					piecesjointesVO = gaindeBusinessDelegate
							.rechercherPiecesJointe(produitspjtVO
									.getRccodepiecejointe());

					produitspjtVO.setLibellePj(piecesjointesVO
							.getRcDesPieceJointe());
					produitspjtVO.setDatePieceJointe(sysEnv
							.dateToStr(piecesjointesVO.getRcDatePieceJointe()));
				} catch (RcEjbException e) {

					log.error("ConsultationTarifACT.consulterPieceJointe()"
							+ e.getMessage());
				}

				lfisimPjt.add(produitspjtVO);
			}
			consultationTarifForm.setListePieceJointeExp(lfisimp);
			// cas de reglement import
			ReglementImport reglementimportVO = null;
			try {
				reglementimportVO = gaindeBusinessDelegate
						.rechercherReglementImport(new ReglementImportKey(
								prd[0], prd[1], prd[2], "0"));
			} catch (FinderException e) {
				log.error("reglementimportVO introuvale avec les paramétres code produit "
						+ prd[0]
						+ " code moa"
						+ prd[1]
						+ " code senegal "
						+ prd[2]);
				reglementimportVO = new ReglementImport();
			}

			consultationTarifForm.setEscorte(reglementimportVO
					.getRcCodeEscort());
			consultationTarifForm.setProhibitionImp(reglementimportVO
					.getRcCodeProhibition());
			consultationTarifForm.setUniteMercurialeImp(reglementimportVO
					.getRcUniteMerc());
			consultationTarifForm.setValeurMedianeImp(sysEnv.NumberToStr(
					reglementimportVO.getRcBaremeMed(), 3));
			consultationTarifForm.setValeurMercurialeImp(sysEnv.NumberToStr(
					reglementimportVO.getRcValeurMerc(), 3));
			consultationTarifForm.setValeurMinimalImp(sysEnv.NumberToStr(
					reglementimportVO.getRcBaremMin(), 3));
			consultationTarifForm.setValeurPerImp(sysEnv.NumberToStr(
					reglementimportVO.getRcValeurMinPerc(), 3));
			consultationTarifForm.setVisiteImp(reglementimportVO
					.getRcCircuitVisite());

			ReglementExport reglementexportVO = null;
			try {
				reglementexportVO = gaindeBusinessDelegate
						.rechercherReglementExport(new ReglementExportKey(
								prd[0], prd[1], prd[2], "1"));
			} catch (Exception e) {
				log.error("reglementexportVO introuvale avec les paramétres code produit "
						+ prd[0]
						+ " code moa"
						+ prd[1]
						+ " code senegal "
						+ prd[2]);
				reglementexportVO = new ReglementExport();
			}

			consultationTarifForm.setSubvention(reglementexportVO
					.getRcsubventionexport());
			consultationTarifForm.setProhibitionExp(reglementexportVO
					.getRccodeprohibition());
			consultationTarifForm.setUniteMercurialeExp(reglementexportVO
					.getRcunitemerc());
			consultationTarifForm.setValeurMedianeExp(sysEnv.NumberToStr(
					reglementexportVO.getRcbarememed(), 3));
			consultationTarifForm.setValeurMercurialeExp(sysEnv.NumberToStr(
					reglementexportVO.getRcvaleurmerc(), 3));
			consultationTarifForm.setValeurMinimalExp(sysEnv.NumberToStr(
					reglementexportVO.getRcbaremmin(), 3));
			consultationTarifForm.setValeurPerExp(sysEnv.NumberToStr(
					reglementexportVO.getRcvaleurminperc(), 3));

		} catch (Exception e) {
			log.error("Erreur de affichage fiscalite exception="
					+ e.getMessage());
			addActionError(e.getMessage());
		}
		return page;
	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);

		try {
			consultationTarifForm.reset();
			consultationTarifForm.setListeSection(new ArrayList());

		} catch (Exception e) {
			addActionError(e.getMessage());
		}
		return page;
	}

	@Override
	public ConsultationTarifForm getModel() {
		return consultationTarifForm;
	}

	@Override
	public void setModel(ConsultationTarifForm model) {
		this.consultationTarifForm = model;
	}

	@Override
	public void setScopeKey(String key) {
		this.scopeKey = key;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	public ConsultationTarifForm getConsultationTarifForm() {
		return consultationTarifForm;
	}

	public void setConsultationTarifForm(
			ConsultationTarifForm consultationTarifForm) {
		this.consultationTarifForm = consultationTarifForm;
	}
}
