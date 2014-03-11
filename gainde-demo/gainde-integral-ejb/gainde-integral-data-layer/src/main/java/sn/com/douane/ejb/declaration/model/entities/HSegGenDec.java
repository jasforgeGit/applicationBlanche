package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HSegGenDecKey;

/**
 * @author thouraya
 * 
 *         Bean implementation class for Enterprise Bean: Hseggendec
 */

@Entity
@Table(name = "HSEGGENDEC")
@IdClass(HSegGenDecKey.class)
public class HSegGenDec implements Serializable {

	private static final long serialVersionUID = 1487922502971075207L;

	@Id
	@Column(name = "DECDATEARCHIVE", nullable = false)
	private Timestamp decDateArchive;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Column(name = "DECANNEEENREGMANIF", length = 4)
	private String decAnneeEnregManif;

	@Column(name = "DECBURENREGMANIF", length = 3)
	private String decBurEnregManif;

	@Column(name = "DECNUMENREGMANIF")
	private Integer decNumEnregManif;

	@Column(name = "DECTYPEREGIME", length = 1, nullable = false)
	private String decTypeRegime;

	@Column(name = "DECREGDOUANIER", length = 1, nullable = false)
	private String decRegDouanier;

	@Column(name = "DECCODESUBVENTION", length = 1)
	private String decCodeSubvention;

	@Column(name = "DECETATSUBV", length = 1)
	private String decEtatSubv;

	@Column(name = "DECDATEENREGDEC", nullable = false)
	private Date decDateEnregDec;

	@Column(name = "DECCODEAGREE", length = 3, nullable = false)
	private String decCodeAgree;

	@Column(name = "DECNOMVOIEDEST", length = 60)
	private String decNomVoieDest;

	@Column(name = "DECNUMREPERTOIRE", length = 6, nullable = false)
	private String decNumRepertoire;

	@Column(name = "DECBURDOUANE", length = 3, nullable = false)
	private String decBurDouane;

	@Column(name = "DECNBREARTICLES", nullable = false)
	private Integer decNbreArticles;

	@Column(name = "DECCODEPPMDEC", length = 5)
	private String decCodePpmDec;

	@Column(name = "DECCODECREDITAIRE", length = 3)
	private String decCodeCreditaire;

	@Column(name = "DECTITREDECLARANT", length = 6)
	private String decTitreDeclarant;

	@Column(name = "DECNOMDECLARANT", length = 255)
	private String decNomDeclarant;

	@Column(name = "DECTYPEVOIEDECL", length = 25)
	private String decTypeVoieDecl;

	@Column(name = "DECNOMVOIEDECL", length = 50)
	private String decNomVoieDecl;

	@Column(name = "DECNUMVOIEDECL", length = 5)
	private String decNumVoieDecl;

	@Column(name = "DECQUARTIERDECL", length = 50)
	private String decQuartierDecl;

	@Column(name = "DECNOMVOIEDESTINATAIRE", length = 60)
	private String decNomVoieDestinataire;

	@Column(name = "DECVILLEDECL", length = 50)
	private String decVilleDecl;

	@Column(name = "DECBPDECLARANT", length = 5)
	private String decBpDeclarant;

	@Column(name = "DECCODEDESTINATAIRE", length = 5)
	private String decCodeDestinataire;

	@Column(name = "DECNUMCODECONTRIB", length = 7)
	private String decNumCodeContrib;

	@Column(name = "DECTITREDESTINATAIRE", length = 3)
	private String decTitreDestinataire;

	@Column(name = "DECTYPEVOIEDEST", length = 25)
	private String decTypeVoieDest;

	@Column(name = "DECNOMDESTINATAIRE", length = 255)
	private String decNomDestinataire;

	@Column(name = "DECNUMVOIEDEST", length = 5)
	private String decNumVoieDest;

	@Column(name = "DECQUARTIERDEST", length = 50)
	private String decQuartierDest;

	@Column(name = "DECVILLEDESTINATAIRE", length = 50)
	private String decVilleDestinataire;

	@Column(name = "DECBPDESTINATAIRE", length = 50)
	private String decBpDestinataire;

	@Column(name = "DECMONTCFAFACTURE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontCfaFacture;

	@Column(name = "DECMONTCFAFRET", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decmontCfaFret;

	@Column(name = "DECASSURCFA", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decAssurCfa;

	@Column(name = "DECMONTASSURCFAELEM", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontAssurcFaElem;

	@Column(name = "DECANNEEDOCJOINT", length = 4)
	private String decAnneeDocJoint;

	@Column(name = "DECNUMDOCJOINT", length = 4)
	private String decNumDocJoint;

	@Column(name = "DECANNEEARTREF", length = 4)
	private String decAnneeArtRef;

	@Column(name = "DECNUMERO", length = 4)
	private String decNumero;

	@Column(name = "DECCIRCUITVISITE", length = 1)
	private String decCircuitVisite;

	@Column(name = "DECCODEVERIFICATEUR", length = 5)
	private String decCodeVerificateur;

	@Column(name = "DECCODERESELECTION", length = 1)
	private String decCodeReSelection;

	@Column(name = "DECDATEVISITE")
	private Date decDateVisite;

	@Column(name = "DECDATEVISITEPREVUE")
	private Date decDateVisitePrevue;

	@Column(name = "DECSUIVIVISITE", length = 1)
	private String decSuiviVisite;

	@Column(name = "DECDATEENLEVEMENT")
	private Date decDateEnlevement;

	@Column(name = "DECBURDESTINATION", length = 4)
	private String decBurDestination;

	@Column(name = "DECREGDESTINATION", length = 4)
	private String decRegDestination;

	@Column(name = "DECNUMRECHARGEDEST", length = 7)
	private String decNumRechargeDest;

	@Column(name = "DECDATEDOCDEST")
	private Date decDateDocDest;

	@Column(name = "DECDATEDOCEXPORT")
	private Date decDateDocExport;

	@Column(name = "DECCODEREGDOU", length = 2)
	private String decCodeRegdou;

	@Column(name = "DECDATEREGULMANIF")
	private Date decDateRegulManif;

	@Column(name = "DECMTDEVISDECL", columnDefinition = "DECIMAL(14 , 0)")
	private BigDecimal decMtDevisDecl;

	@Column(name = "DECMTDROITCOMMUN", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtDroitCommun;

	@Column(name = "DECNUMQUITTANCE", length = 6)
	private String decNumQuittance;

	@Column(name = "DECDATEQUITTANCE")
	private Date decDateQuittance;

	@Column(name = "DECMODEPAIEMENT", length = 2)
	private String decModePaiement;

	@Column(name = "DECMTCOMPTANT", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtComptant;

	@Column(name = "DECMODEDECLARATION", length = 4)
	private String decModeDeclaration;

	@Column(name = "DECNUMIMPEXP", length = 10)
	private String decNumimpexp;

	@Column(name = "DECMODETRANSPORT", length = 2)
	private String decModeTransport;

	@Column(name = "DECMOYENTRANSPORT", length = 255)
	private String decMoyenTransport;

	@Column(name = "DECCODETRANSPORT", length = 4)
	private String decCodeTransport;

	@Column(name = "DECIMMVEHICULE", length = 10)
	private String decImmVehicule;

	@Column(name = "DECPAYSPROVENANCE", length = 3)
	private String decPaysProvenance;

	@Column(name = "DECBURFRONTIERE", length = 3, nullable = false)
	private String decBurFrontiere;

	@Column(name = "DECDELAIROUTETRANSIT")
	private Integer decDelaiRouteTransit;

	@Column(name = "DECPAYSDESTINATION", length = 3)
	private String decPaysDestination;

	@Column(name = "DECPAYSDESTDEF", length = 3)
	private String decPaysDestDef;

	@Column(name = "DECBURDEST", length = 3)
	private String decBurDest;

	@Column(name = "DECBURDEPPROV", length = 3)
	private String decBurDepprov;

	@Column(name = "DECNUMDEPPROV")
	private Integer decNumDepprov;

	@Column(name = "DECTYPEAPUREMENT", length = 1)
	private String decTypeApurement;

	@Column(name = "DECTYPEMANIF", length = 1)
	private String decTypeManif;

	@Column(name = "DECCODELIEUSTOCK", length = 3)
	private String decCodeLieuStock;

	@Column(name = "DECMTDIFFTAXES", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtDiffTaxes;

	@Column(name = "DECUSERENREG", length = 8)
	private String decUserEnreg;

	@Column(name = "DECANNEEDEPPROV", length = 4)
	private String decAnneeDepprov;

	@Column(name = "DECTYPERECTIFVISIT", length = 1)
	private String decTypeRectifVisit;

	@Column(name = "DECNUMRECTIFVISIT")
	private Integer decNumRectifVisit;

	@Column(name = "DECNBRERECTIFAVANTVISIT")
	private Integer decNbreRectifAvantVisit;

	@Column(name = "DECNBRERECTIFAPRESVISIT")
	private Integer decNbreRectifApresVisit;

	@Column(name = "DECUSERRECTIFVISIT", length = 8)
	private String decUserRectifVisit;

	@Column(name = "DECMTLIQSUPPL", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtLiqSuppl;

	@Column(name = "DECNUMGAMME")
	private Integer decNumGamme;

	@Column(name = "DECANNEEREGECO", length = 4)
	private String decAnneeRegeco;

	@Column(name = "DECNUMREGECO", length = 6)
	private String decNumRegeco;

	@Column(name = "DECINDICCONTREVISITE", length = 1)
	private String decIndicContreVisite;

	@Column(name = "DECNUMMESSAGE")
	private Integer decNumMessage;

	@Column(name = "DECTYPEMESSAGE", length = 1)
	private String decTypeMessage;

	@Column(name = "DECDATEBAE")
	private Date decDateBae;

	@Column(name = "DECDELAIREGUL")
	private Integer decDelaiRegul;

	@Column(name = "DECDATERECTIF")
	private Date decDateRectif;

	@Column(name = "DECNUMRECTIFBAE")
	private Integer decNumRectifBae;

	@Column(name = "DECCODEESCORTE", length = 1)
	private String decCodeEscorte;

	@Column(name = "DECINDPLOMBPROD", length = 1)
	private String decIndPlombProd;

	@Column(name = "DECCODEAGENLEVE1", length = 5)
	private String decCodeAgenLeve1;

	@Column(name = "DECCODEAGENLEVE2", length = 5)
	private String decCodeAgenLeve2;

	@Column(name = "DECREFDECL", length = 30)
	private String decRefDecl;

	@Column(name = "DECDOSSIER", length = 3)
	private String decDossier;

	@Column(name = "DECNBREUNITEVISITE")
	private Integer decNbreUniteVisite;

	@Column(name = "DECINDDEPDECL", length = 1)
	private String decIndDepDecl;

	@Column(name = "DECDATEDEPDECL")
	private Date decDateDepDecl;

	@Column(name = "DECDOSSIERTPS", length = 10)
	private String decDossierTps;

	@Column(name = "DECTYPETRAITEMENT", length = 1)
	private String decTypeTraitement;

	@Column(name = "DECINDBAEAUTO", length = 1)
	private String decIndBaeAuto;

	@Column(name = "DECINDREGUL", length = 1)
	private String decIndRegul;

	@Column(name = "DECINDQUITTANCE", length = 10)
	private String decIndQuittance;

	@Column(name = "DECINDLIQUIDSUPP", length = 1)
	private String decIndLiquidSupp;

	@Column(name = "DECINDPAIELIQUIDSUPP", length = 1)
	private String decIndPaieLiquidSupp;

	@Column(name = "DECDATEPAIELIQSUPP")
	private Date decDatepaieLiqSupp;

	@OneToMany(mappedBy = "hSegGenDec", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> hSegArtDec;

	public HSegGenDec(Timestamp decDateArchive, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			String decTypeRegime, String decRegDouanier, Date decDateEnregDec,
			String decCodeAgree, String decNumRepertoire, String decBurDouane,
			Integer decNbreArticles, String decBurFrontiere) {
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decTypeRegime = decTypeRegime;
		this.decRegDouanier = decRegDouanier;
		this.decDateEnregDec = decDateEnregDec;
		this.decCodeAgree = decCodeAgree;
		this.decNumRepertoire = decNumRepertoire;
		this.decBurDouane = decBurDouane;
		this.decNbreArticles = decNbreArticles;
		this.decBurFrontiere = decBurFrontiere;
	}

	public HSegGenDec() {

	}

	public Timestamp getDecDateArchive() {
		return decDateArchive;
	}

	public void setDecDateArchive(Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public String getDecAnneeEnregManif() {
		return decAnneeEnregManif;
	}

	public void setDecAnneeEnregManif(String decAnneeEnregManif) {
		this.decAnneeEnregManif = decAnneeEnregManif;
	}

	public String getDecBurEnregManif() {
		return decBurEnregManif;
	}

	public void setDecBurEnregManif(String decBurEnregManif) {
		this.decBurEnregManif = decBurEnregManif;
	}

	public Integer getDecNumEnregManif() {
		return decNumEnregManif;
	}

	public void setDecNumEnregManif(Integer decNumEnregManif) {
		this.decNumEnregManif = decNumEnregManif;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecRegDouanier() {
		return decRegDouanier;
	}

	public void setDecRegDouanier(String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	public String getDecCodeSubvention() {
		return decCodeSubvention;
	}

	public void setDecCodeSubvention(String decCodeSubvention) {
		this.decCodeSubvention = decCodeSubvention;
	}

	public String getDecEtatSubv() {
		return decEtatSubv;
	}

	public void setDecEtatSubv(String decEtatSubv) {
		this.decEtatSubv = decEtatSubv;
	}

	public Date getDecDateEnregDec() {
		return decDateEnregDec;
	}

	public void setDecDateEnregDec(Date decDateEnregDec) {
		this.decDateEnregDec = decDateEnregDec;
	}

	public String getDecCodeAgree() {
		return decCodeAgree;
	}

	public void setDecCodeAgree(String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}

	public String getDecNomVoieDest() {
		return decNomVoieDest;
	}

	public void setDecNomVoieDest(String decNomVoieDest) {
		this.decNomVoieDest = decNomVoieDest;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public String getDecBurDouane() {
		return decBurDouane;
	}

	public void setDecBurDouane(String decBurDouane) {
		this.decBurDouane = decBurDouane;
	}

	public Integer getDecNbreArticles() {
		return decNbreArticles;
	}

	public void setDecNbreArticles(Integer decNbreArticles) {
		this.decNbreArticles = decNbreArticles;
	}

	public String getDecCodePpmDec() {
		return decCodePpmDec;
	}

	public void setDecCodePpmDec(String decCodePpmDec) {
		this.decCodePpmDec = decCodePpmDec;
	}

	public String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public String getDecTitreDeclarant() {
		return decTitreDeclarant;
	}

	public void setDecTitreDeclarant(String decTitreDeclarant) {
		this.decTitreDeclarant = decTitreDeclarant;
	}

	public String getDecNomDeclarant() {
		return decNomDeclarant;
	}

	public void setDecNomDeclarant(String decNomDeclarant) {
		this.decNomDeclarant = decNomDeclarant;
	}

	public String getDecTypeVoieDecl() {
		return decTypeVoieDecl;
	}

	public void setDecTypeVoieDecl(String decTypeVoieDecl) {
		this.decTypeVoieDecl = decTypeVoieDecl;
	}

	public String getDecNomVoieDecl() {
		return decNomVoieDecl;
	}

	public void setDecNomVoieDecl(String decNomVoieDecl) {
		this.decNomVoieDecl = decNomVoieDecl;
	}

	public String getDecNumVoieDecl() {
		return decNumVoieDecl;
	}

	public void setDecNumVoieDecl(String decNumVoieDecl) {
		this.decNumVoieDecl = decNumVoieDecl;
	}

	public String getDecQuartierDecl() {
		return decQuartierDecl;
	}

	public void setDecQuartierDecl(String decQuartierDecl) {
		this.decQuartierDecl = decQuartierDecl;
	}

	public String getDecNomVoieDestinataire() {
		return decNomVoieDestinataire;
	}

	public void setDecNomVoieDestinataire(String decNomVoieDestinataire) {
		this.decNomVoieDestinataire = decNomVoieDestinataire;
	}

	public String getDecVilleDecl() {
		return decVilleDecl;
	}

	public void setDecVilleDecl(String decVilleDecl) {
		this.decVilleDecl = decVilleDecl;
	}

	public String getDecBpDeclarant() {
		return decBpDeclarant;
	}

	public void setDecBpDeclarant(String decBpDeclarant) {
		this.decBpDeclarant = decBpDeclarant;
	}

	public String getDecCodeDestinataire() {
		return decCodeDestinataire;
	}

	public void setDecCodeDestinataire(String decCodeDestinataire) {
		this.decCodeDestinataire = decCodeDestinataire;
	}

	public String getDecNumCodeContrib() {
		return decNumCodeContrib;
	}

	public void setDecNumCodeContrib(String decNumCodeContrib) {
		this.decNumCodeContrib = decNumCodeContrib;
	}

	public String getDecTitreDestinataire() {
		return decTitreDestinataire;
	}

	public void setDecTitreDestinataire(String decTitreDestinataire) {
		this.decTitreDestinataire = decTitreDestinataire;
	}

	public String getDecTypeVoieDest() {
		return decTypeVoieDest;
	}

	public void setDecTypeVoieDest(String decTypeVoieDest) {
		this.decTypeVoieDest = decTypeVoieDest;
	}

	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	public String getDecNumVoieDest() {
		return decNumVoieDest;
	}

	public void setDecNumVoieDest(String decNumVoieDest) {
		this.decNumVoieDest = decNumVoieDest;
	}

	public String getDecQuartierDest() {
		return decQuartierDest;
	}

	public void setDecQuartierDest(String decQuartierDest) {
		this.decQuartierDest = decQuartierDest;
	}

	public String getDecVilleDestinataire() {
		return decVilleDestinataire;
	}

	public void setDecVilleDestinataire(String decVilleDestinataire) {
		this.decVilleDestinataire = decVilleDestinataire;
	}

	public String getDecBpDestinataire() {
		return decBpDestinataire;
	}

	public void setDecBpDestinataire(String decBpDestinataire) {
		this.decBpDestinataire = decBpDestinataire;
	}

	public BigDecimal getDecMontCfaFacture() {
		return decMontCfaFacture;
	}

	public void setDecMontCfaFacture(BigDecimal decMontCfaFacture) {
		this.decMontCfaFacture = decMontCfaFacture;
	}

	public BigDecimal getDecmontCfaFret() {
		return decmontCfaFret;
	}

	public void setDecmontCfaFret(BigDecimal decmontCfaFret) {
		this.decmontCfaFret = decmontCfaFret;
	}

	public BigDecimal getDecAssurCfa() {
		return decAssurCfa;
	}

	public void setDecAssurCfa(BigDecimal decAssurCfa) {
		this.decAssurCfa = decAssurCfa;
	}

	public BigDecimal getDecMontAssurcFaElem() {
		return decMontAssurcFaElem;
	}

	public void setDecMontAssurcFaElem(BigDecimal decMontAssurcFaElem) {
		this.decMontAssurcFaElem = decMontAssurcFaElem;
	}

	public String getDecAnneeDocJoint() {
		return decAnneeDocJoint;
	}

	public void setDecAnneeDocJoint(String decAnneeDocJoint) {
		this.decAnneeDocJoint = decAnneeDocJoint;
	}

	public String getDecNumDocJoint() {
		return decNumDocJoint;
	}

	public void setDecNumDocJoint(String decNumDocJoint) {
		this.decNumDocJoint = decNumDocJoint;
	}

	public String getDecAnneeArtRef() {
		return decAnneeArtRef;
	}

	public void setDecAnneeArtRef(String decAnneeArtRef) {
		this.decAnneeArtRef = decAnneeArtRef;
	}

	public String getDecNumero() {
		return decNumero;
	}

	public void setDecNumero(String decNumero) {
		this.decNumero = decNumero;
	}

	public String getDecCircuitVisite() {
		return decCircuitVisite;
	}

	public void setDecCircuitVisite(String decCircuitVisite) {
		this.decCircuitVisite = decCircuitVisite;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public String getDecCodeReSelection() {
		return decCodeReSelection;
	}

	public void setDecCodeReSelection(String decCodeReSelection) {
		this.decCodeReSelection = decCodeReSelection;
	}

	public Date getDecDateVisite() {
		return decDateVisite;
	}

	public void setDecDateVisite(Date decDateVisite) {
		this.decDateVisite = decDateVisite;
	}

	public Date getDecDateVisitePrevue() {
		return decDateVisitePrevue;
	}

	public void setDecDateVisitePrevue(Date decDateVisitePrevue) {
		this.decDateVisitePrevue = decDateVisitePrevue;
	}

	public String getDecSuiviVisite() {
		return decSuiviVisite;
	}

	public void setDecSuiviVisite(String decSuiviVisite) {
		this.decSuiviVisite = decSuiviVisite;
	}

	public Date getDecDateEnlevement() {
		return decDateEnlevement;
	}

	public void setDecDateEnlevement(Date decDateEnlevement) {
		this.decDateEnlevement = decDateEnlevement;
	}

	public String getDecBurDestination() {
		return decBurDestination;
	}

	public void setDecBurDestination(String decBurDestination) {
		this.decBurDestination = decBurDestination;
	}

	public String getDecRegDestination() {
		return decRegDestination;
	}

	public void setDecRegDestination(String decRegDestination) {
		this.decRegDestination = decRegDestination;
	}

	public String getDecNumRechargeDest() {
		return decNumRechargeDest;
	}

	public void setDecNumRechargeDest(String decNumRechargeDest) {
		this.decNumRechargeDest = decNumRechargeDest;
	}

	public Date getDecDateDocDest() {
		return decDateDocDest;
	}

	public void setDecDateDocDest(Date decDateDocDest) {
		this.decDateDocDest = decDateDocDest;
	}

	public Date getDecDateDocExport() {
		return decDateDocExport;
	}

	public void setDecDateDocExport(Date decDateDocExport) {
		this.decDateDocExport = decDateDocExport;
	}

	public String getDecCodeRegdou() {
		return decCodeRegdou;
	}

	public void setDecCodeRegdou(String decCodeRegdou) {
		this.decCodeRegdou = decCodeRegdou;
	}

	public Date getDecDateRegulManif() {
		return decDateRegulManif;
	}

	public void setDecDateRegulManif(Date decDateRegulManif) {
		this.decDateRegulManif = decDateRegulManif;
	}

	public BigDecimal getDecMtDevisDecl() {
		return decMtDevisDecl;
	}

	public void setDecMtDevisDecl(BigDecimal decMtDevisDecl) {
		this.decMtDevisDecl = decMtDevisDecl;
	}

	public BigDecimal getDecMtDroitCommun() {
		return decMtDroitCommun;
	}

	public void setDecMtDroitCommun(BigDecimal decMtDroitCommun) {
		this.decMtDroitCommun = decMtDroitCommun;
	}

	public String getDecNumQuittance() {
		return decNumQuittance;
	}

	public void setDecNumQuittance(String decNumQuittance) {
		this.decNumQuittance = decNumQuittance;
	}

	public Date getDecDateQuittance() {
		return decDateQuittance;
	}

	public void setDecDateQuittance(Date decDateQuittance) {
		this.decDateQuittance = decDateQuittance;
	}

	public String getDecModePaiement() {
		return decModePaiement;
	}

	public void setDecModePaiement(String decModePaiement) {
		this.decModePaiement = decModePaiement;
	}

	public BigDecimal getDecMtComptant() {
		return decMtComptant;
	}

	public void setDecMtComptant(BigDecimal decMtComptant) {
		this.decMtComptant = decMtComptant;
	}

	public String getDecModeDeclaration() {
		return decModeDeclaration;
	}

	public void setDecModeDeclaration(String decModeDeclaration) {
		this.decModeDeclaration = decModeDeclaration;
	}

	public String getDecNumimpexp() {
		return decNumimpexp;
	}

	public void setDecNumimpexp(String decNumimpexp) {
		this.decNumimpexp = decNumimpexp;
	}

	public String getDecModeTransport() {
		return decModeTransport;
	}

	public void setDecModeTransport(String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}

	public String getDecMoyenTransport() {
		return decMoyenTransport;
	}

	public void setDecMoyenTransport(String decMoyenTransport) {
		this.decMoyenTransport = decMoyenTransport;
	}

	public String getDecCodeTransport() {
		return decCodeTransport;
	}

	public void setDecCodeTransport(String decCodeTransport) {
		this.decCodeTransport = decCodeTransport;
	}

	public String getDecImmVehicule() {
		return decImmVehicule;
	}

	public void setDecImmVehicule(String decImmVehicule) {
		this.decImmVehicule = decImmVehicule;
	}

	public String getDecPaysProvenance() {
		return decPaysProvenance;
	}

	public void setDecPaysProvenance(String decPaysProvenance) {
		this.decPaysProvenance = decPaysProvenance;
	}

	public String getDecBurFrontiere() {
		return decBurFrontiere;
	}

	public void setDecBurFrontiere(String decBurFrontiere) {
		this.decBurFrontiere = decBurFrontiere;
	}

	public Integer getDecDelaiRouteTransit() {
		return decDelaiRouteTransit;
	}

	public void setDecDelaiRouteTransit(Integer decDelaiRouteTransit) {
		this.decDelaiRouteTransit = decDelaiRouteTransit;
	}

	public String getDecPaysDestination() {
		return decPaysDestination;
	}

	public void setDecPaysDestination(String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}

	public String getDecPaysDestDef() {
		return decPaysDestDef;
	}

	public void setDecPaysDestDef(String decPaysDestDef) {
		this.decPaysDestDef = decPaysDestDef;
	}

	public String getDecBurDest() {
		return decBurDest;
	}

	public void setDecBurDest(String decBurDest) {
		this.decBurDest = decBurDest;
	}

	public String getDecBurDepprov() {
		return decBurDepprov;
	}

	public void setDecBurDepprov(String decBurDepprov) {
		this.decBurDepprov = decBurDepprov;
	}

	public Integer getDecNumDepprov() {
		return decNumDepprov;
	}

	public void setDecNumDepprov(Integer decNumDepprov) {
		this.decNumDepprov = decNumDepprov;
	}

	public String getDecTypeApurement() {
		return decTypeApurement;
	}

	public void setDecTypeApurement(String decTypeApurement) {
		this.decTypeApurement = decTypeApurement;
	}

	public String getDecTypeManif() {
		return decTypeManif;
	}

	public void setDecTypeManif(String decTypeManif) {
		this.decTypeManif = decTypeManif;
	}

	public String getDecCodeLieuStock() {
		return decCodeLieuStock;
	}

	public void setDecCodeLieuStock(String decCodeLieuStock) {
		this.decCodeLieuStock = decCodeLieuStock;
	}

	public BigDecimal getDecMtDiffTaxes() {
		return decMtDiffTaxes;
	}

	public void setDecMtDiffTaxes(BigDecimal decMtDiffTaxes) {
		this.decMtDiffTaxes = decMtDiffTaxes;
	}

	public String getDecUserEnreg() {
		return decUserEnreg;
	}

	public void setDecUserEnreg(String decUserEnreg) {
		this.decUserEnreg = decUserEnreg;
	}

	public String getDecAnneeDepprov() {
		return decAnneeDepprov;
	}

	public void setDecAnneeDepprov(String decAnneeDepprov) {
		this.decAnneeDepprov = decAnneeDepprov;
	}

	public String getDecTypeRectifVisit() {
		return decTypeRectifVisit;
	}

	public void setDecTypeRectifVisit(String decTypeRectifVisit) {
		this.decTypeRectifVisit = decTypeRectifVisit;
	}

	public Integer getDecNumRectifVisit() {
		return decNumRectifVisit;
	}

	public void setDecNumRectifVisit(Integer decNumRectifVisit) {
		this.decNumRectifVisit = decNumRectifVisit;
	}

	public Integer getDecNbreRectifAvantVisit() {
		return decNbreRectifAvantVisit;
	}

	public void setDecNbreRectifAvantVisit(Integer decNbreRectifAvantVisit) {
		this.decNbreRectifAvantVisit = decNbreRectifAvantVisit;
	}

	public Integer getDecNbreRectifApresVisit() {
		return decNbreRectifApresVisit;
	}

	public void setDecNbreRectifApresVisit(Integer decNbreRectifApresVisit) {
		this.decNbreRectifApresVisit = decNbreRectifApresVisit;
	}

	public String getDecUserRectifVisit() {
		return decUserRectifVisit;
	}

	public void setDecUserRectifVisit(String decUserRectifVisit) {
		this.decUserRectifVisit = decUserRectifVisit;
	}

	public BigDecimal getDecMtLiqSuppl() {
		return decMtLiqSuppl;
	}

	public void setDecMtLiqSuppl(BigDecimal decMtLiqSuppl) {
		this.decMtLiqSuppl = decMtLiqSuppl;
	}

	public Integer getDecNumGamme() {
		return decNumGamme;
	}

	public void setDecNumGamme(Integer decNumGamme) {
		this.decNumGamme = decNumGamme;
	}

	public String getDecAnneeRegeco() {
		return decAnneeRegeco;
	}

	public void setDecAnneeRegeco(String decAnneeRegeco) {
		this.decAnneeRegeco = decAnneeRegeco;
	}

	public String getDecNumRegeco() {
		return decNumRegeco;
	}

	public void setDecNumRegeco(String decNumRegeco) {
		this.decNumRegeco = decNumRegeco;
	}

	public String getDecIndicContreVisite() {
		return decIndicContreVisite;
	}

	public void setDecIndicContreVisite(String decIndicContreVisite) {
		this.decIndicContreVisite = decIndicContreVisite;
	}

	public Integer getDecNumMessage() {
		return decNumMessage;
	}

	public void setDecNumMessage(Integer decNumMessage) {
		this.decNumMessage = decNumMessage;
	}

	public String getDecTypeMessage() {
		return decTypeMessage;
	}

	public void setDecTypeMessage(String decTypeMessage) {
		this.decTypeMessage = decTypeMessage;
	}

	public Date getDecDateBae() {
		return decDateBae;
	}

	public void setDecDateBae(Date decDateBae) {
		this.decDateBae = decDateBae;
	}

	public Integer getDecDelaiRegul() {
		return decDelaiRegul;
	}

	public void setDecDelaiRegul(Integer decDelaiRegul) {
		this.decDelaiRegul = decDelaiRegul;
	}

	public Date getDecDateRectif() {
		return decDateRectif;
	}

	public void setDecDateRectif(Date decDateRectif) {
		this.decDateRectif = decDateRectif;
	}

	public Integer getDecNumRectifBae() {
		return decNumRectifBae;
	}

	public void setDecNumRectifBae(Integer decNumRectifBae) {
		this.decNumRectifBae = decNumRectifBae;
	}

	public String getDecCodeEscorte() {
		return decCodeEscorte;
	}

	public void setDecCodeEscorte(String decCodeEscorte) {
		this.decCodeEscorte = decCodeEscorte;
	}

	public String getDecIndPlombProd() {
		return decIndPlombProd;
	}

	public void setDecIndPlombProd(String decIndPlombProd) {
		this.decIndPlombProd = decIndPlombProd;
	}

	public String getDecCodeAgenLeve1() {
		return decCodeAgenLeve1;
	}

	public void setDecCodeAgenLeve1(String decCodeAgenLeve1) {
		this.decCodeAgenLeve1 = decCodeAgenLeve1;
	}

	public String getDecCodeAgenLeve2() {
		return decCodeAgenLeve2;
	}

	public void setDecCodeAgenLeve2(String decCodeAgenLeve2) {
		this.decCodeAgenLeve2 = decCodeAgenLeve2;
	}

	public String getDecRefDecl() {
		return decRefDecl;
	}

	public void setDecRefDecl(String decRefDecl) {
		this.decRefDecl = decRefDecl;
	}

	public String getDecDossier() {
		return decDossier;
	}

	public void setDecDossier(String decDossier) {
		this.decDossier = decDossier;
	}

	public Integer getDecNbreUniteVisite() {
		return decNbreUniteVisite;
	}

	public void setDecNbreUniteVisite(Integer decNbreUniteVisite) {
		this.decNbreUniteVisite = decNbreUniteVisite;
	}

	public String getDecIndDepDecl() {
		return decIndDepDecl;
	}

	public void setDecIndDepDecl(String decIndDepDecl) {
		this.decIndDepDecl = decIndDepDecl;
	}

	public Date getDecDateDepDecl() {
		return decDateDepDecl;
	}

	public void setDecDateDepDecl(Date decDateDepDecl) {
		this.decDateDepDecl = decDateDepDecl;
	}

	public String getDecDossierTps() {
		return decDossierTps;
	}

	public void setDecDossierTps(String decDossierTps) {
		this.decDossierTps = decDossierTps;
	}

	public String getDecTypeTraitement() {
		return decTypeTraitement;
	}

	public void setDecTypeTraitement(String decTypeTraitement) {
		this.decTypeTraitement = decTypeTraitement;
	}

	public String getDecIndBaeAuto() {
		return decIndBaeAuto;
	}

	public void setDecIndBaeAuto(String decIndBaeAuto) {
		this.decIndBaeAuto = decIndBaeAuto;
	}

	public String getDecIndRegul() {
		return decIndRegul;
	}

	public void setDecIndRegul(String decIndRegul) {
		this.decIndRegul = decIndRegul;
	}

	public String getDecIndQuittance() {
		return decIndQuittance;
	}

	public void setDecIndQuittance(String decIndQuittance) {
		this.decIndQuittance = decIndQuittance;
	}

	public String getDecIndLiquidSupp() {
		return decIndLiquidSupp;
	}

	public void setDecIndLiquidSupp(String decIndLiquidSupp) {
		this.decIndLiquidSupp = decIndLiquidSupp;
	}

	public String getDecIndPaieLiquidSupp() {
		return decIndPaieLiquidSupp;
	}

	public void setDecIndPaieLiquidSupp(String decIndPaieLiquidSupp) {
		this.decIndPaieLiquidSupp = decIndPaieLiquidSupp;
	}

	public Date getDecDatepaieLiqSupp() {
		return decDatepaieLiqSupp;
	}

	public void setDecDatepaieLiqSupp(Date decDatepaieLiqSupp) {
		this.decDatepaieLiqSupp = decDatepaieLiqSupp;
	}

	public List<HSegArtDec> getHSegArtDec() {
		return hSegArtDec;
	}

	public void setHSegArtDec(List<HSegArtDec> hSegArtDec) {
		this.hSegArtDec = hSegArtDec;
	}

}