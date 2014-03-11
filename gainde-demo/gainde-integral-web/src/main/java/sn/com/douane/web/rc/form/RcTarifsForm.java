package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.ReglementExport;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;
import sn.com.douane.ejb.rc.model.entities.Tarif;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.DateUtil;


public class RcTarifsForm implements Serializable { 

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TARIFS ***/ 
	//Champs de saisie Tarifs
	private String numListRcCodeProdOB;  
	private String numListRcCodeTauxxOB;
	private String numListRcCodeTaxeOB; 
	private String datRcDateCloture; 
	private String datRcDateValeurOB;
	private String numListRcPrecSenegalOB;  
	private String numListRcPrecUemoaOB;
	private String numRcCodeCimexOB;

	//Champs de recherche
	private String numListRcCodeProdRech;
	private String numListRcCodeTauxRech;
	private String numListRcCodeTaxeRech;
	private String datRcDateClotureRech;
	private String datRcDateValeurRech;
	private String numListRcPrecSenegalRech;
	private String numListRcPrecUemoaRech;
	
	//	Champs de saisie Produits
	private String numRcLibelleTarif;
	private String numRcCommProd;
	private String numRcIndProdPetrolier;
	private String numRcCodeProdCru;
	private String numRcCodeProdArtisanal;
	private String numRcUniteComp;
	private String numRcSectActProd;
	private String numRcCodeTransit;
	private String numRcCodeBienEquip;
	private String numRcValEquipProd;
	private String numRcCodeEntrepot;
	private String numRcCodeProdSocial;
	private String numRcValSpecProd;
	private String numListrcValChapitreOB;
	private String numListRcCodeClasseOB;
	private String numRcCodePerissable;
	private String numRcActif;
	private String numRcExonorePVIOB;
	
	//	Champs de saisie ReglementImport
	private java.lang.String rcCodeImpOB; 
	private java.lang.String rcCircuitVisite;
	private java.lang.String rcCodeEscort;
	private java.lang.String rcCodeAdmisDes;
	private java.lang.String rcCodeAdmisDep;
	private java.lang.String rcCodeProhibition;
	private java.lang.String rcAgrementProd;
	private java.lang.String datRcDateAgrement;
	private java.lang.String rcCategProd;
	private java.lang.String rcUniteMerc;
	private java.lang.String rcValeurMerc;
	private java.lang.String datRcDateMerc;
	private java.lang.String rcBaremMin;
	private java.lang.String rcBaremEmed;
	private java.lang.String rcValeurMinPerc;
	private java.lang.String rcCoddeContingent;
	private java.lang.String rcMtContingent; 
	private java.lang.String rcRelConting;
	private java.lang.String datRcDateConting;
	private java.lang.String rcTypeMerc; 
	private java.lang.String rcCodeAnnexe4;
	private java.lang.String rcAutChange;
	 
	//	Champs de saisie ReglementExport
	private java.lang.String rccodeexpOB;
	private java.lang.String rccodeprohibitionExport; 
	private java.lang.String rcunitemercExport;
	private java.lang.String rcvaleurmercExport;
	private java.lang.String datrcdatemercExport;
	private java.lang.String rcbaremminExport;
	private java.lang.String rcbarememedExport;
	private java.lang.String rcvaleurminpercExport; 
	private java.lang.String rctypemercExport;
	private java.lang.String rcautchangeExport;
	private java.lang.String rcsubventionExport; 
	

	List listeRcTarifs = new ArrayList();
	Tarif tarifsvo = new Tarif();
	Produit produitsvo=new Produit();
	ReglementImport reglementimportvo=new ReglementImport();
	ReglementExport reglementexportvo= new ReglementExport();


	/**
	 * variables du Grid 
	 */
	private Integer rows ;
	private Integer page ;
	private String  sord;
	private String  sidx;
	private Integer total;
	private Integer records;
	private String index;
	
	/*** M�thode getNewTARIFSVO () ***/
	public Tarif getNewRcTarifsVO() {
		Tarif tarifsvo = new Tarif();

		tarifsvo.setRcCodeProd(getNumListRcCodeProdOB());
		tarifsvo.setRcCodeTaux(getNumListRcCodeTauxxOB());
		tarifsvo.setRcCodeTaxe(getNumListRcCodeTaxeOB());
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals("")) {
			tarifsvo.setRcDateCloture(new Date(DateUtil.convertStringToDate(getDatRcDateCloture()).getTime()));
		}
		if (getDatRcDateValeurOB()!=null && !getDatRcDateValeurOB().equals("")) {
			tarifsvo.setRcDateValeur(new Date(DateUtil.convertStringToDate(getDatRcDateValeurOB()).getTime()));
		}
		tarifsvo.setRcPrecSenegal(getNumListRcPrecSenegalOB());
		tarifsvo.setRcPrecueMoa(getNumListRcPrecUemoaOB());
		tarifsvo.setRcCodeCimex(getNumRcCodeCimexOB());

		return tarifsvo;
	}
	


	/*** M�thode setTarifs () ***/
	public void setTarifs (Tarif tarifsvo) {

		setNumListRcCodeProdOB (tarifsvo.getRcCodeProd());
		setNumListRcCodeTauxxOB (tarifsvo.getRcCodeTaux());
		setNumListRcCodeTaxeOB (tarifsvo.getRcCodeTaxe());
		if (tarifsvo.getRcDateCloture()!=null) {
			setDatRcDateCloture (DateUtil.getDate(new Date(tarifsvo.getRcDateCloture().getTime())));
		}
		if (tarifsvo.getRcDateValeur()!=null) {
			setDatRcDateValeurOB (DateUtil.getDate(new Date(tarifsvo.getRcDateValeur().getTime())));
		}
		setNumListRcPrecSenegalOB (tarifsvo.getRcPrecSenegal());
		setNumListRcPrecUemoaOB (tarifsvo.getRcPrecueMoa());
		setNumRcCodeCimexOB(tarifsvo.getRcCodeCimex());

	}

	/***M�thode getNewReglementImportVO()***/
	public ReglementImport getNewReglementimportVO() {
		ReglementImport reglementimportVO= new ReglementImport();
	//	System.out.println("ReglementimportVO.getNewReglementImportVO()DEBUT ");
		if(getRcAgrementProd()!=null&&!getRcAgrementProd().equals("")) {
			reglementimportVO.setRcAgrementProd(getRcAgrementProd());
		}
		if(getRcAutChange()!=null&&!getRcAutChange().equals("")) {
			reglementimportVO.setRcAutChange(getRcAutChange());
		}
		if(getRcBaremEmed()!=null&&!getRcBaremEmed().equals("")) {
			reglementimportVO.setRcBaremeMed(new Double(getRcBaremEmed()));
		}
		if(getRcBaremMin()!=null&&!getRcBaremMin().equals("")) {
			reglementimportVO.setRcBaremMin(new Double(getRcBaremMin()));
		}
		if(getRcCategProd()!=null&&!getRcCategProd().equals("")) {
			reglementimportVO.setRcCategProd(getRcCategProd());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()00000");
		if(getRcCircuitVisite()!=null&&!getRcCircuitVisite().equals("")) {
			reglementimportVO.setRcCircuitVisite(getRcCircuitVisite());
		}
		if(getRcCoddeContingent()!=null&&!getRcCoddeContingent().equals("")) {
			reglementimportVO.setRcCodDeContingent(getRcCoddeContingent());
		}
		if(getRcCodeAdmisDep()!=null&&!getRcCodeAdmisDep().equals("")) {
			reglementimportVO.setRcCodeAdmisDep(getRcCodeAdmisDep());
		}
		if(getRcCodeAdmisDes()!=null&&!getRcCodeAdmisDes().equals("")) {
			reglementimportVO.setRcCodeAdmisDes(getRcCodeAdmisDes());
		}
		if(getRcCodeAnnexe4()!=null&&!getRcCodeAnnexe4().equals("")) {
			reglementimportVO.setRcCodeAnnexe4(getRcCodeAnnexe4());
		}
		if(getRcCodeEscort()!=null&&!getRcCodeEscort().equals("")) {
			reglementimportVO.setRcCodeEscort(getRcCodeEscort());
		}
		if(getRcCodeImpOB()!=null&&!getRcCodeImpOB().equals("")) {
			reglementimportVO.setRcCodeImp(getRcCodeImpOB());
		}
		if(getNumListRcCodeProdOB()!=null&&!getNumListRcCodeProdOB().equals("")) {
			reglementimportVO.setRcCodeProd(getNumListRcCodeProdOB());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()1111");
		if (getRcCodeProhibition()!=null && !getRcCodeProhibition().equals("")) {
			reglementimportVO.setRcCodeProhibition(getRcCodeProhibition());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()2222");
		if (getDatRcDateAgrement()!=null && !getDatRcDateAgrement().equals("")) {
			reglementimportVO.setRcDateAgrement(new Date(DateUtil.convertStringToDate(getDatRcDateAgrement()).getTime()));;
		}
			//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getDatRcDateConting()!=null && !getDatRcDateConting().equals("")) {
			reglementimportVO.setRcDateConting(new Date(DateUtil.convertStringToDate(getDatRcDateConting()).getTime()));
		}
			//System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getDatRcDateMerc()!=null && !getDatRcDateMerc().equals("")) {
			reglementimportVO.setRcDateMerc(new Date(DateUtil.convertStringToDate(getDatRcDateMerc()).getTime()));
		}
			//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getRcMtContingent()!=null && !getRcMtContingent().equals("")) {
			reglementimportVO.setRcMtContingent(new Double(getRcMtContingent()));
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getNumListRcPrecSenegalOB()!=null && !getNumListRcPrecSenegalOB().equals("")) {
			reglementimportVO.setRcPrecSenegal(getNumListRcPrecSenegalOB());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getNumListRcPrecUemoaOB()!=null && !getNumListRcPrecUemoaOB().equals("")) {
			reglementimportVO.setRcPrecUemoa(getNumListRcPrecUemoaOB());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getRcRelConting()!=null && !getRcRelConting().equals("")) {
			reglementimportVO.setRcRelConting(new Double(getRcRelConting()));
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()5555");
		if (getRcTypeMerc()!=null && !getRcTypeMerc().equals("")) {
			reglementimportVO.setRcTypeMerc(getRcTypeMerc());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()6666");
		if (getRcUniteMerc()!=null && !getRcUniteMerc().equals("")) {
			reglementimportVO.setRcUniteMerc(getRcUniteMerc());
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()4444"); 
		if (getRcValeurMerc()!=null && !getRcValeurMerc().equals("")) {
			reglementimportVO.setRcValeurMerc(new Double(getRcValeurMerc()));
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()3333");
		if (getRcValeurMinPerc()!=null && !getRcValeurMinPerc().equals("")) {
			reglementimportVO.setRcValeurMinPerc(new Double(getRcValeurMinPerc()));
		}
	//	System.out.println("RcProduitsFB.getNewReglementImportVO()FIN ");
		return reglementimportVO;

	}
	
	/*** M�thode setReglementImport () ***/
	public void setReglementImport(ReglementImport reglementimportVO){
		
			setRcAgrementProd(reglementimportVO.getRcAgrementProd());
			setRcAutChange(reglementimportVO.getRcAutChange());
			setRcBaremEmed(ConvertUtil.converToString(reglementimportVO.getRcBaremeMed()));
			setRcBaremMin(ConvertUtil.converToString(reglementimportVO.getRcBaremMin()));
			setRcCategProd(reglementimportVO.getRcCategProd());
			setRcCircuitVisite(reglementimportVO.getRcCircuitVisite());
			setRcCoddeContingent(reglementimportVO.getRcCodDeContingent());
			setRcCodeAdmisDep(reglementimportVO.getRcCodeAdmisDep());
			setRcCodeAdmisDes(reglementimportVO.getRcCodeAdmisDes());
			setRcCodeAnnexe4(reglementimportVO.getRcCodeAnnexe4());
			setRcCodeEscort(reglementimportVO.getRcCodeEscort());
			setRcCodeImpOB(reglementimportVO.getRcCodeImp());
			setNumListRcCodeProdOB(reglementimportVO.getRcCodeProd());
			setRcCodeProhibition(reglementimportVO.getRcCodeProhibition());
			if (reglementimportVO.getRcDateAgrement()!=null) {
			setDatRcDateAgrement(DateUtil.getDate(new Date(reglementimportVO.getRcDateAgrement().getTime())));
			}
			if (reglementimportVO.getRcDateConting()!=null) {
			setDatRcDateConting(DateUtil.getDate(new Date(reglementimportVO.getRcDateConting().getTime())));
			}
			if (reglementimportVO.getRcDateMerc()!=null) {
			setDatRcDateMerc(DateUtil.getDate(new Date(reglementimportVO.getRcDateMerc().getTime())));
			}
			setRcMtContingent(ConvertUtil.converToString(reglementimportVO.getRcMtContingent()));
			setNumListRcPrecSenegalOB(reglementimportVO.getRcPrecSenegal());
			setNumListRcPrecUemoaOB(reglementimportVO.getRcPrecUemoa());
			setRcRelConting(ConvertUtil.converToString(reglementimportVO.getRcRelConting()));
			setRcTypeMerc(reglementimportVO.getRcTypeMerc());
			setRcUniteMerc(reglementimportVO.getRcUniteMerc());
			setRcValeurMerc(ConvertUtil.converToString(reglementimportVO.getRcValeurMerc()));
			setRcValeurMinPerc(ConvertUtil.converToString(reglementimportVO.getRcValeurMinPerc()));
		}
	
	/***M�thode getNewReglementExportVO()***/
	public ReglementExport getNewReglementexportVO() {
		ReglementExport reglementexportVO= new ReglementExport();
		if(getNumListRcCodeProdOB()!=null && !getNumListRcCodeProdOB().equals("")) {
			reglementexportVO.setRccodeprod(getNumListRcCodeProdOB());
		}
		if (getNumListRcPrecSenegalOB()!=null && !getNumListRcPrecSenegalOB().equals("")) {
			reglementexportVO.setRcprecsenegal(getNumListRcPrecSenegalOB());
		}
		if (getNumListRcPrecUemoaOB()!=null && !getNumListRcPrecUemoaOB().equals("")) {
			reglementexportVO.setRcprecuemoa(getNumListRcPrecUemoaOB());
		}
		if(getRccodeexpOB()!=null&&!getRccodeexpOB().equals("")) {
			reglementexportVO.setRccodeexp(getRccodeexpOB());
		}
		if (getRccodeprohibitionExport()!=null && !getRccodeprohibitionExport().equals("")) {
			reglementexportVO.setRccodeprohibition(getRccodeprohibitionExport());
		}
		if (getRcunitemercExport()!=null && !getRcunitemercExport().equals("")) {
			reglementexportVO.setRcunitemerc(getRcunitemercExport());
		}
		if (getRcvaleurmercExport()!=null && !getRcvaleurmercExport().equals("")) {
			reglementexportVO.setRcvaleurmerc(new Double(getRcvaleurmercExport()));
		}
		if (getDatrcdatemercExport()!=null && !getDatrcdatemercExport().equals("")) {
			reglementexportVO.setRcdatemerc(new Date(DateUtil.convertStringToDate(getDatrcdatemercExport()).getTime()));
		}
		if(getRcbarememedExport()!=null && !getRcbarememedExport().equals("")) {
			reglementexportVO.setRcbarememed(new Double(getRcbarememedExport()));
		}
		if(getRcbaremminExport()!=null && !getRcbaremminExport().equals("")) {
			reglementexportVO.setRcbaremmin(new Double(getRcbaremminExport()));
		}
		if (getRcvaleurminpercExport()!=null && !getRcvaleurminpercExport().equals("")) {
			reglementexportVO.setRcvaleurminperc(new Double(getRcvaleurminpercExport()));
		}
		if (getRctypemercExport()!=null && !getRctypemercExport().equals("")) {
			reglementexportVO.setRctypemerc(getRctypemercExport());
		}
		if(getRcautchangeExport()!=null && !getRcautchangeExport().equals("")) {
			reglementexportVO.setRcautchange(getRcautchangeExport());
		}
		if(getRcsubventionExport()!=null && !getRcsubventionExport().equals("")) {
			reglementexportVO.setRcsubventionexport(getRcsubventionExport()); 
		}
		return reglementexportVO;
	}
	
	/*** M�thode setReglementExport () ***/
	public void setReglementExport(ReglementExport reglementexportVO){
		setRcautchangeExport(ConvertUtil.converToString(reglementexportVO.getRcautchange()));
		setRcbarememedExport(ConvertUtil.converToString(reglementexportVO.getRcbarememed()));
		setRcbaremminExport(ConvertUtil.converToString(reglementexportVO.getRcbaremmin()));
		setRccodeexpOB(reglementexportVO.getRccodeexp());
		setNumListRcCodeProdOB(reglementexportVO.getRccodeprod());
		setRccodeprohibitionExport(reglementexportVO.getRccodeprohibition());
		if (reglementexportVO.getRcdatemerc()!=null) {
		setDatrcdatemercExport(DateUtil.getDate(new Date(reglementexportVO.getRcdatemerc().getTime())));
		}
		setNumListRcPrecSenegalOB(reglementexportVO.getRcprecsenegal());
		setNumListRcPrecUemoaOB(reglementexportVO.getRcprecuemoa());
		setRctypemercExport(reglementexportVO.getRctypemerc());
		setRcunitemercExport(reglementexportVO.getRcunitemerc());
		setRcvaleurmercExport(ConvertUtil.converToString(reglementexportVO.getRcvaleurmerc()));
		setRcvaleurminpercExport(ConvertUtil.converToString(reglementexportVO.getRcvaleurminperc()));	
		setRcsubventionExport(reglementexportVO.getRcsubventionexport());
	}
	
	/*** M�thodes getNewRcProduitVO() ***/
	public Produit getNewRcProduitVO() { 
		Produit produitVO = new Produit();
		//System.out.println("RcProduitsFB.getNewRcProduitVO()DEBUT ");
		if(getNumListRcCodeProdOB()!=null&&!getNumListRcCodeProdOB().equals("")) {
		produitVO.setRccodeprod(getNumListRcCodeProdOB());
		}
		if(getNumListRcPrecUemoaOB()!=null&&!getNumListRcPrecUemoaOB().equals("")) {
		produitVO.setRcprecuemoa(getNumListRcPrecUemoaOB());
		}
		if(getNumListRcPrecSenegalOB()!=null&&!getNumListRcPrecSenegalOB().equals("")) {
		produitVO.setRcprecsenegal(getNumListRcPrecSenegalOB());
		}
		if(getNumRcLibelleTarif()!=null&&!getNumRcLibelleTarif().equals("")) {
		produitVO.setRclibelletarif(getNumRcLibelleTarif());
		}
		if(getNumRcCommProd()!=null&&!getNumRcCommProd().equals("")) {
		produitVO.setRccommprod(getNumRcCommProd());
		}
		//System.out.println("RcProduitsFB.getNewRcProduitVO()00000");
		if(getNumRcCodePerissable()!=null&&!getNumRcCodePerissable().equals("")) {
		produitVO.setRccodeperissable(getNumRcCodePerissable());
		}
		if(getNumRcIndProdPetrolier()!=null&&!getNumRcIndProdPetrolier().equals("")) {
		produitVO.setRcindprodpetrolier(getNumRcIndProdPetrolier());
		}
		if(getNumRcCodeProdCru()!=null&&!getNumRcCodeProdCru().equals("")) {
		produitVO.setRccodeprodcru(getNumRcCodeProdCru());
		}
		if(getNumRcCodeProdArtisanal()!=null&&!getNumRcCodeProdArtisanal().equals("")) {
		produitVO.setRccodeprodartisanal(getNumRcCodeProdArtisanal());
		}
		if(getNumRcUniteComp()!=null&&!getNumRcUniteComp().equals("")) {
		produitVO.setRcunitecomp(getNumRcUniteComp());
		}
		if(getNumRcSectActProd()!=null&&!getNumRcSectActProd().equals("")) {
		produitVO.setRcsectactprod(getNumRcSectActProd());
		}
		if(getNumRcCodeTransit()!=null&&!getNumRcCodeTransit().equals("")) {
		produitVO.setRccodetransit(getNumRcCodeTransit());
		}
		if(getNumRcCodeBienEquip()!=null&&!getNumRcCodeBienEquip().equals("")) {
		produitVO.setRccodebienequip(getNumRcCodeBienEquip());
		}
		//System.out.println("RcProduitsFB.getNewRcProduitVO()1111");
		if (getNumRcValEquipProd()!=null && !getNumRcValEquipProd().equals("")) {
			produitVO.setRcvalequipprod(new Integer(getNumRcValEquipProd()));
		}
		if (getNumRcCodeEntrepot()!=null && !getNumRcCodeEntrepot().equals("")) {
		produitVO.setRccodeentrepot(getNumRcCodeEntrepot());
		}
		if (getNumRcCodeProdSocial()!=null && !getNumRcCodeProdSocial().equals("")) {
		produitVO.setRccodeprodsocial(getNumRcCodeProdSocial());
		}
		if (getNumRcValSpecProd()!=null && !getNumRcValSpecProd().equals("")) {
			produitVO.setRcvalspecprod(new Double(getNumRcValSpecProd()));
		}
		if (getNumListrcValChapitreOB()!=null && !getNumListrcValChapitreOB().equals("")) {
		produitVO.setRcvalchapitre(getNumListrcValChapitreOB());
		}
		if (getNumListRcCodeClasseOB()!=null && !getNumListRcCodeClasseOB().equals("")) {
		produitVO.setRccodeclasse(new Integer(getNumListRcCodeClasseOB()));
		}
		if (getNumRcActif()!=null && !getNumRcActif().equals("")) {
			produitVO.setRcactif(getNumRcActif());
		}
		if (getNumRcExonorePVIOB()!=null && !getNumRcExonorePVIOB().equals("")) {
			produitVO.setRcexonorepvi(getNumRcExonorePVIOB());
		}
		
		//System.out.println("RcProduitsFB.getNewRcProduitVO()FIN ");
		return produitVO;

	}
		
	
	/***M�thode setProduits ***/  
	public void setProduits(Produit produitVO){
	 
		setNumListRcCodeProdOB(produitVO.getRccodeprod());
		setNumListRcPrecUemoaOB(produitVO.getRcprecuemoa());
		setNumListRcPrecSenegalOB(produitVO.getRcprecsenegal());
		setNumRcLibelleTarif(produitVO.getRclibelletarif());
		setNumRcCommProd(produitVO.getRccommprod());
		setNumRcCodePerissable(produitVO.getRccodeperissable());
		setNumRcIndProdPetrolier(produitVO.getRcindprodpetrolier());
		setNumRcCodeProdCru(produitVO.getRccodeprodcru());
		setNumRcCodeProdArtisanal(produitVO.getRccodeprodartisanal());
		setNumRcUniteComp(produitVO.getRcunitecomp());
		setNumRcSectActProd(produitVO.getRcsectactprod());
		setNumRcCodeTransit(produitVO.getRccodetransit());
		setNumRcCodeBienEquip(produitVO.getRccodebienequip());
		setNumRcValEquipProd(ConvertUtil.converToString(produitVO.getRcvalequipprod()));
		setNumRcCodeEntrepot(produitVO.getRccodeentrepot());
		setNumRcCodeProdSocial(produitVO.getRccodeprodsocial());
		setNumRcValSpecProd(ConvertUtil.converToString(produitVO.getRcvalspecprod()));
		setNumListrcValChapitreOB(produitVO.getRcvalchapitre());
		setNumListRcCodeClasseOB(ConvertUtil.converToString(produitVO.getRccodeclasse()));
		setNumRcActif(produitVO.getRcactif());
		setNumRcExonorePVIOB(produitVO.getRcexonorepvi());

	} 
	
	
/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeProdOB="";
		numListRcCodeTauxxOB="";
		numListRcCodeTaxeOB=""; 
		datRcDateCloture="";
		datRcDateValeurOB=""; 
		numListRcPrecSenegalOB=""; 
		numListRcPrecUemoaOB="";

	}
	public void resetChampsRecherche() {
		numListRcCodeProdRech="";
		numListRcCodeTauxRech="";
		numListRcCodeTaxeRech="";
		datRcDateClotureRech="";
		datRcDateValeurRech="";
		numListRcPrecSenegalRech="";
		numListRcPrecUemoaRech="";
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNumListRcCodeProdOB() {
		return numListRcCodeProdOB;
	}

	public void setNumListRcCodeProdOB(String numListRcCodeProdOB) {
		this.numListRcCodeProdOB = numListRcCodeProdOB;
	}

	public String getNumListRcCodeTauxxOB() {
		return numListRcCodeTauxxOB;
	}

	public void setNumListRcCodeTauxxOB(String numListRcCodeTauxxOB) {
		this.numListRcCodeTauxxOB = numListRcCodeTauxxOB;
	}

	public String getNumListRcCodeTaxeOB() {
		return numListRcCodeTaxeOB;
	}

	public void setNumListRcCodeTaxeOB(String numListRcCodeTaxeOB) {
		this.numListRcCodeTaxeOB = numListRcCodeTaxeOB;
	}

	public String getDatRcDateCloture() {
		return datRcDateCloture;
	}

	public void setDatRcDateCloture(String datRcDateCloture) {
		this.datRcDateCloture = datRcDateCloture;
	}

	public String getDatRcDateValeurOB() {
		return datRcDateValeurOB;
	}

	public void setDatRcDateValeurOB(String datRcDateValeurOB) {
		this.datRcDateValeurOB = datRcDateValeurOB;
	}

	public String getNumListRcPrecSenegalOB() {
		return numListRcPrecSenegalOB;
	}

	public void setNumListRcPrecSenegalOB(String numListRcPrecSenegalOB) {
		this.numListRcPrecSenegalOB = numListRcPrecSenegalOB;
	}

	public String getNumListRcPrecUemoaOB() {
		return numListRcPrecUemoaOB;
	}

	public void setNumListRcPrecUemoaOB(String numListRcPrecUemoaOB) {
		this.numListRcPrecUemoaOB = numListRcPrecUemoaOB;
	}

	public String getNumRcCodeCimexOB() {
		return numRcCodeCimexOB;
	}

	public void setNumRcCodeCimexOB(String numRcCodeCimexOB) {
		this.numRcCodeCimexOB = numRcCodeCimexOB;
	}

	public String getNumListRcCodeProdRech() {
		return numListRcCodeProdRech;
	}

	public void setNumListRcCodeProdRech(String numListRcCodeProdRech) {
		this.numListRcCodeProdRech = numListRcCodeProdRech;
	}

	public String getNumListRcCodeTauxRech() {
		return numListRcCodeTauxRech;
	}

	public void setNumListRcCodeTauxRech(String numListRcCodeTauxRech) {
		this.numListRcCodeTauxRech = numListRcCodeTauxRech;
	}

	public String getNumListRcCodeTaxeRech() {
		return numListRcCodeTaxeRech;
	}

	public void setNumListRcCodeTaxeRech(String numListRcCodeTaxeRech) {
		this.numListRcCodeTaxeRech = numListRcCodeTaxeRech;
	}

	public String getDatRcDateClotureRech() {
		return datRcDateClotureRech;
	}

	public void setDatRcDateClotureRech(String datRcDateClotureRech) {
		this.datRcDateClotureRech = datRcDateClotureRech;
	}

	public String getDatRcDateValeurRech() {
		return datRcDateValeurRech;
	}

	public void setDatRcDateValeurRech(String datRcDateValeurRech) {
		this.datRcDateValeurRech = datRcDateValeurRech;
	}

	public String getNumListRcPrecSenegalRech() {
		return numListRcPrecSenegalRech;
	}

	public void setNumListRcPrecSenegalRech(String numListRcPrecSenegalRech) {
		this.numListRcPrecSenegalRech = numListRcPrecSenegalRech;
	}

	public String getNumListRcPrecUemoaRech() {
		return numListRcPrecUemoaRech;
	}

	public void setNumListRcPrecUemoaRech(String numListRcPrecUemoaRech) {
		this.numListRcPrecUemoaRech = numListRcPrecUemoaRech;
	}

	public String getNumRcLibelleTarif() {
		return numRcLibelleTarif;
	}

	public void setNumRcLibelleTarif(String numRcLibelleTarif) {
		this.numRcLibelleTarif = numRcLibelleTarif;
	}

	public String getNumRcCommProd() {
		return numRcCommProd;
	}

	public void setNumRcCommProd(String numRcCommProd) {
		this.numRcCommProd = numRcCommProd;
	}

	public String getNumRcIndProdPetrolier() {
		return numRcIndProdPetrolier;
	}

	public void setNumRcIndProdPetrolier(String numRcIndProdPetrolier) {
		this.numRcIndProdPetrolier = numRcIndProdPetrolier;
	}

	public String getNumRcCodeProdCru() {
		return numRcCodeProdCru;
	}

	public void setNumRcCodeProdCru(String numRcCodeProdCru) {
		this.numRcCodeProdCru = numRcCodeProdCru;
	}

	public String getNumRcCodeProdArtisanal() {
		return numRcCodeProdArtisanal;
	}

	public void setNumRcCodeProdArtisanal(String numRcCodeProdArtisanal) {
		this.numRcCodeProdArtisanal = numRcCodeProdArtisanal;
	}

	public String getNumRcUniteComp() {
		return numRcUniteComp;
	}

	public void setNumRcUniteComp(String numRcUniteComp) {
		this.numRcUniteComp = numRcUniteComp;
	}

	public String getNumRcSectActProd() {
		return numRcSectActProd;
	}

	public void setNumRcSectActProd(String numRcSectActProd) {
		this.numRcSectActProd = numRcSectActProd;
	}

	public String getNumRcCodeTransit() {
		return numRcCodeTransit;
	}

	public void setNumRcCodeTransit(String numRcCodeTransit) {
		this.numRcCodeTransit = numRcCodeTransit;
	}

	public String getNumRcCodeBienEquip() {
		return numRcCodeBienEquip;
	}

	public void setNumRcCodeBienEquip(String numRcCodeBienEquip) {
		this.numRcCodeBienEquip = numRcCodeBienEquip;
	}

	public String getNumRcValEquipProd() {
		return numRcValEquipProd;
	}

	public void setNumRcValEquipProd(String numRcValEquipProd) {
		this.numRcValEquipProd = numRcValEquipProd;
	}

	public String getNumRcCodeEntrepot() {
		return numRcCodeEntrepot;
	}

	public void setNumRcCodeEntrepot(String numRcCodeEntrepot) {
		this.numRcCodeEntrepot = numRcCodeEntrepot;
	}

	public String getNumRcCodeProdSocial() {
		return numRcCodeProdSocial;
	}

	public void setNumRcCodeProdSocial(String numRcCodeProdSocial) {
		this.numRcCodeProdSocial = numRcCodeProdSocial;
	}

	public String getNumRcValSpecProd() {
		return numRcValSpecProd;
	}

	public void setNumRcValSpecProd(String numRcValSpecProd) {
		this.numRcValSpecProd = numRcValSpecProd;
	}

	public String getNumListrcValChapitreOB() {
		return numListrcValChapitreOB;
	}

	public void setNumListrcValChapitreOB(String numListrcValChapitreOB) {
		this.numListrcValChapitreOB = numListrcValChapitreOB;
	}

	public String getNumListRcCodeClasseOB() {
		return numListRcCodeClasseOB;
	}

	public void setNumListRcCodeClasseOB(String numListRcCodeClasseOB) {
		this.numListRcCodeClasseOB = numListRcCodeClasseOB;
	}

	public String getNumRcCodePerissable() {
		return numRcCodePerissable;
	}

	public void setNumRcCodePerissable(String numRcCodePerissable) {
		this.numRcCodePerissable = numRcCodePerissable;
	}

	public String getNumRcActif() {
		return numRcActif;
	}

	public void setNumRcActif(String numRcActif) {
		this.numRcActif = numRcActif;
	}

	public String getNumRcExonorePVIOB() {
		return numRcExonorePVIOB;
	}

	public void setNumRcExonorePVIOB(String numRcExonorePVIOB) {
		this.numRcExonorePVIOB = numRcExonorePVIOB;
	}

	public java.lang.String getRcCodeImpOB() {
		return rcCodeImpOB;
	}

	public void setRcCodeImpOB(java.lang.String rcCodeImpOB) {
		this.rcCodeImpOB = rcCodeImpOB;
	}

	public java.lang.String getRcCircuitVisite() {
		return rcCircuitVisite;
	}

	public void setRcCircuitVisite(java.lang.String rcCircuitVisite) {
		this.rcCircuitVisite = rcCircuitVisite;
	}

	public java.lang.String getRcCodeEscort() {
		return rcCodeEscort;
	}

	public void setRcCodeEscort(java.lang.String rcCodeEscort) {
		this.rcCodeEscort = rcCodeEscort;
	}

	public java.lang.String getRcCodeAdmisDes() {
		return rcCodeAdmisDes;
	}

	public void setRcCodeAdmisDes(java.lang.String rcCodeAdmisDes) {
		this.rcCodeAdmisDes = rcCodeAdmisDes;
	}

	public java.lang.String getRcCodeAdmisDep() {
		return rcCodeAdmisDep;
	}

	public void setRcCodeAdmisDep(java.lang.String rcCodeAdmisDep) {
		this.rcCodeAdmisDep = rcCodeAdmisDep;
	}

	public java.lang.String getRcCodeProhibition() {
		return rcCodeProhibition;
	}

	public void setRcCodeProhibition(java.lang.String rcCodeProhibition) {
		this.rcCodeProhibition = rcCodeProhibition;
	}

	public java.lang.String getRcAgrementProd() {
		return rcAgrementProd;
	}

	public void setRcAgrementProd(java.lang.String rcAgrementProd) {
		this.rcAgrementProd = rcAgrementProd;
	}

	public java.lang.String getDatRcDateAgrement() {
		return datRcDateAgrement;
	}

	public void setDatRcDateAgrement(java.lang.String datRcDateAgrement) {
		this.datRcDateAgrement = datRcDateAgrement;
	}

	public java.lang.String getRcCategProd() {
		return rcCategProd;
	}

	public void setRcCategProd(java.lang.String rcCategProd) {
		this.rcCategProd = rcCategProd;
	}

	public java.lang.String getRcUniteMerc() {
		return rcUniteMerc;
	}

	public void setRcUniteMerc(java.lang.String rcUniteMerc) {
		this.rcUniteMerc = rcUniteMerc;
	}

	public java.lang.String getRcValeurMerc() {
		return rcValeurMerc;
	}

	public void setRcValeurMerc(java.lang.String rcValeurMerc) {
		this.rcValeurMerc = rcValeurMerc;
	}

	public java.lang.String getDatRcDateMerc() {
		return datRcDateMerc;
	}

	public void setDatRcDateMerc(java.lang.String datRcDateMerc) {
		this.datRcDateMerc = datRcDateMerc;
	}

	public java.lang.String getRcBaremMin() {
		return rcBaremMin;
	}

	public void setRcBaremMin(java.lang.String rcBaremMin) {
		this.rcBaremMin = rcBaremMin;
	}

	public java.lang.String getRcBaremEmed() {
		return rcBaremEmed;
	}

	public void setRcBaremEmed(java.lang.String rcBaremEmed) {
		this.rcBaremEmed = rcBaremEmed;
	}

	public java.lang.String getRcValeurMinPerc() {
		return rcValeurMinPerc;
	}

	public void setRcValeurMinPerc(java.lang.String rcValeurMinPerc) {
		this.rcValeurMinPerc = rcValeurMinPerc;
	}

	public java.lang.String getRcCoddeContingent() {
		return rcCoddeContingent;
	}

	public void setRcCoddeContingent(java.lang.String rcCoddeContingent) {
		this.rcCoddeContingent = rcCoddeContingent;
	}

	public java.lang.String getRcMtContingent() {
		return rcMtContingent;
	}

	public void setRcMtContingent(java.lang.String rcMtContingent) {
		this.rcMtContingent = rcMtContingent;
	}

	public java.lang.String getRcRelConting() {
		return rcRelConting;
	}

	public void setRcRelConting(java.lang.String rcRelConting) {
		this.rcRelConting = rcRelConting;
	}

	public java.lang.String getDatRcDateConting() {
		return datRcDateConting;
	}

	public void setDatRcDateConting(java.lang.String datRcDateConting) {
		this.datRcDateConting = datRcDateConting;
	}

	public java.lang.String getRcTypeMerc() {
		return rcTypeMerc;
	}

	public void setRcTypeMerc(java.lang.String rcTypeMerc) {
		this.rcTypeMerc = rcTypeMerc;
	}

	public java.lang.String getRcCodeAnnexe4() {
		return rcCodeAnnexe4;
	}

	public void setRcCodeAnnexe4(java.lang.String rcCodeAnnexe4) {
		this.rcCodeAnnexe4 = rcCodeAnnexe4;
	}

	public java.lang.String getRcAutChange() {
		return rcAutChange;
	}

	public void setRcAutChange(java.lang.String rcAutChange) {
		this.rcAutChange = rcAutChange;
	}

	public java.lang.String getRccodeexpOB() {
		return rccodeexpOB;
	}

	public void setRccodeexpOB(java.lang.String rccodeexpOB) {
		this.rccodeexpOB = rccodeexpOB;
	}

	public java.lang.String getRccodeprohibitionExport() {
		return rccodeprohibitionExport;
	}

	public void setRccodeprohibitionExport(java.lang.String rccodeprohibitionExport) {
		this.rccodeprohibitionExport = rccodeprohibitionExport;
	}

	public java.lang.String getRcunitemercExport() {
		return rcunitemercExport;
	}

	public void setRcunitemercExport(java.lang.String rcunitemercExport) {
		this.rcunitemercExport = rcunitemercExport;
	}

	public java.lang.String getRcvaleurmercExport() {
		return rcvaleurmercExport;
	}

	public void setRcvaleurmercExport(java.lang.String rcvaleurmercExport) {
		this.rcvaleurmercExport = rcvaleurmercExport;
	}

	public java.lang.String getDatrcdatemercExport() {
		return datrcdatemercExport;
	}

	public void setDatrcdatemercExport(java.lang.String datrcdatemercExport) {
		this.datrcdatemercExport = datrcdatemercExport;
	}

	public java.lang.String getRcbaremminExport() {
		return rcbaremminExport;
	}

	public void setRcbaremminExport(java.lang.String rcbaremminExport) {
		this.rcbaremminExport = rcbaremminExport;
	}

	public java.lang.String getRcbarememedExport() {
		return rcbarememedExport;
	}

	public void setRcbarememedExport(java.lang.String rcbarememedExport) {
		this.rcbarememedExport = rcbarememedExport;
	}

	public java.lang.String getRcvaleurminpercExport() {
		return rcvaleurminpercExport;
	}

	public void setRcvaleurminpercExport(java.lang.String rcvaleurminpercExport) {
		this.rcvaleurminpercExport = rcvaleurminpercExport;
	}

	public java.lang.String getRctypemercExport() {
		return rctypemercExport;
	}

	public void setRctypemercExport(java.lang.String rctypemercExport) {
		this.rctypemercExport = rctypemercExport;
	}

	public java.lang.String getRcautchangeExport() {
		return rcautchangeExport;
	}

	public void setRcautchangeExport(java.lang.String rcautchangeExport) {
		this.rcautchangeExport = rcautchangeExport;
	}

	public java.lang.String getRcsubventionExport() {
		return rcsubventionExport;
	}

	public void setRcsubventionExport(java.lang.String rcsubventionExport) {
		this.rcsubventionExport = rcsubventionExport;
	}

	public List getListeRcTarifs() {
		return listeRcTarifs;
	}

	public void setListeRcTarifs(List listeRcTarifs) {
		this.listeRcTarifs = listeRcTarifs;
	}

	public Tarif getTarifsvo() {
		return tarifsvo;
	}

	public void setTarifsvo(Tarif tarifsvo) {
		this.tarifsvo = tarifsvo;
	}

	public Produit getProduitsvo() {
		return produitsvo;
	}

	public void setProduitsvo(Produit produitsvo) {
		this.produitsvo = produitsvo;
	}

	public ReglementImport getReglementimportvo() {
		return reglementimportvo;
	}

	public void setReglementimportvo(ReglementImport reglementimportvo) {
		this.reglementimportvo = reglementimportvo;
	}

	public ReglementExport getReglementexportvo() {
		return reglementexportvo;
	}

	public void setReglementexportvo(ReglementExport reglementexportvo) {
		this.reglementexportvo = reglementexportvo;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}