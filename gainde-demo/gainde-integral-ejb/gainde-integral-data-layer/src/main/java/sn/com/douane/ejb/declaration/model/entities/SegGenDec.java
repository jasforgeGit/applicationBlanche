package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.SegGenDecKey;
import sn.com.douane.ejb.demat.model.entities.DemandeEscorte;


/**
 * @author: issam Bean implementation class for Enterprise Bean: SegGenDec
 */

@Entity
@Table(name = "SEGGENDEC")
@IdClass(SegGenDecKey.class)
 @javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name ="SegGenDec.findByDossier", query =
 "select object(o) from SegGenDec o where  o.decDossier = ?1"),
 @javax.persistence.NamedQuery(name = "SegGenDec.findById", query =
 "select object(o) from SegGenDec o where  o.decAnneeEnregDec = ?1 and  o.decBurEnregDec = ?2 and  o.decNumDeclaration = ?3"),
 @javax.persistence.NamedQuery(name = "SegGenDec.findByIdLocal", query =
 "select object(o) from SegGenDec o where  o.decAnneeEnregDec = ?1 and  o.decBurEnregDec = ?2 and  o.decNumDeclaration = ?3"),
 @javax.persistence.NamedQuery(name = "SegGenDec.findByREP_ANNEE_PPM", query =
 "select object(o) from SegGenDec o where  o.decAnneeEnregDec = ?1 and  o.decCodePpmDec = ?2 and  o.decNumRepertoire = ?3")})
public class SegGenDec implements Serializable {

	private static final long serialVersionUID = 6170973602396026847L;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	
	@Column(name = "DECANNEEENREGMANIF", length = 4, nullable = false)
	private String decAnneeEnregManif;
	
	@Column(name = "DECBURENREGMANIF", length = 3, nullable = false)
	private String decBurEnregManif;
	
	@Column(name = "DECNUMENREGMANIF", nullable = false)
	private Integer decNumEnregManif;
	
	@Column(name = "DECTYPEREGIME", length = 1, nullable = false)
	private String decTypeRegime;
	
	@Column(name = "DECREGDOUANIER", length = 1, nullable = false)
	private String decRegDouanier;
	
	@Column(name = "DECCODESUBVENTION", length = 1, nullable = false)
	private String decCodeSubvention;
	
	@Column(name = "DECETATSUBV", length = 1)
	private String decEtatSubv;
	
	@Column(name = "DECDATEENREGDEC", nullable = false)
	private Date decDateEnregDec;
	
	@Column(name = "DECCODEAGREE", length = 3, nullable = false)
	private String decCodeAgree;
	
	@Column(name = "DECNUMREPERTOIRE", length = 6, nullable = false)
	private String decNumRepertoire;
	
	@Column(name = "DECBURDOUANE", length = 3, nullable = false)
	private String decBurDouane;
	
	@Column(name = "DECNBREARTICLES", nullable = false)
	private Integer decNbreArticles;
	
	@Column(name = "DECCODEPPMDEC", length = 5, nullable = false)
	private String decCodePpmDec;
	
	@Column(name = "DECCODECREDITAIRE", length = 3)
	private String decCodeCreditaire;
	
	@Column(name = "DECTITREDECLARANT", length = 3)
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
	private BigDecimal decMontCfaFret;
	
	@Column(name = "DECASSURCFA", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decAssurCfa;
	
	@Column(name = "DECMONTASSURCFAELEM", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontAssurCfaElem;
	
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
	private String decCodeReselection;
	
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
	private String decCodeRegDou;
	
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
	private String decNumImpExp;
	
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
	
	@Column(name = "DECBURFRONTIERE", length = 3)
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
	private String decBurDepProv;
	
	@Column(name = "DECNUMDEPPROV")
	private Integer decNumDepProv;
	
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
	private String decAnneeDepProv;
	
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
	private String decAnneeRegEco;
	
	@Column(name = "DECNUMREGECO", length = 6)
	private String decNumRegEco;
	
	@Column(name = "DECINDICCONTREVISITE", length = 1)
	private String decIndicContrevisite;
	
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
	
	@Column(name = "DECINDLIQUIDSUPP", length = 10)
	private String decIndLiquidSupp;
	
	@Column(name = "DECINDQUITTANCE", length = 1)
	private String decIndQuittance;
	
	@Column(name = "DECINDPAIELIQUIDSUPP", length = 1)
	private String decIndPaieLiquidSupp;
	
	@Column(name = "DECDATEPAIELIQSUPP")
	private Date decDatePaieLiqSupp;
	
	@Column(name = "DECETATDECL", length = 2)
	private String decEtatDecl;
	
	@Column(name = "DECETATTRAITEMENTDEP", length = 1)
	private String decEtatTraitementDep;	
		
	@Column(name = "IDDEMESCORTE")
	private Long idDemEscorte;
	
	@Column(name = "IDFACTURE")
	private Long idFacture;
	
	@Column(name = "IDOPERATION")
	private Long idOperation;
	
	@Column(name = "IDXDEMESCORTE")
	private Integer idXdemEscorte;

	@Transient
	private List<?> listTypeApurement = null;
	@Transient
    private List<?> listModeDeclaration = null;
	
	@Transient
	private List<SegArtDec> listeArticle = null;
	
	  /** Champ utilisé pour récupérer les libellés */
	@Transient
    private String libCircuitVisite;
	
	@Transient
	private String libModePaiement;
	
	@Transient
	private String nineaDest;
	
	@Transient
	private List<?> listLiquidArt;

	@ManyToOne
	@JoinColumn(name = "IDDEMESCORTE",referencedColumnName="IDDEMESCORTE", insertable = false, updatable = false)
	private DemandeEscorte demandeEscorte;	
	
	@OneToMany(mappedBy = "segGenDec", targetEntity = SegArtDec.class)
	private List<SegArtDec> segArtDecSegGenDec;

	@OneToMany(mappedBy = "segGenDec", targetEntity = EncoursDeclaration.class)
	private List<EncoursDeclaration> encoursDeclarationSegGenDec;

	@OneToMany(mappedBy = "segGenDec", targetEntity = ComplementTaxes.class)
	private List<ComplementTaxes> complementTaxesSegGenDec;

	@OneToMany(mappedBy = "segGenDec", targetEntity = DclVentilCredTaxe.class)
	private List<DclVentilCredTaxe> dclVentilCredTaxeSegGenDec;

	@OneToMany(mappedBy = "segGenDec", targetEntity = DdeAnnulDecl.class)
	private List<DdeAnnulDecl> ddeAnnulDeclSegGenDec;
	
	public static final String MODE_PAIEMENT_COMPT= "1";

    public static final String MODE_PAIEMENT_CREDIT= "2";

    public static final String MODE_PAIEMENT_MIXTE = "3";

    public static final String LIB_MODE_PAIEMENT_COMPT = "PAIEMENT COMPTANT";

    public static final String LIB_MODE_PAIEMENT_CREDIT = "PAIEMENT CREDIT";

    public static final String LIB_MODE_PAIEMENT_MIXTE = "PAIEMENT MIXTE";

	public SegGenDec() {

	}

	public SegGenDec(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, String decAnneeEnregManif,
			String decBurEnregManif, Integer decNumEnregManif,
			String decTypeRegime, String decRegDouanier,
			String decCodeSubvention, String decEtatSubv, Date decDateEnregDec,
			String decCodeAgree, String decNumRepertoire, String decBurDouane,
			Integer decNbreArticles, String decCodePpmDec) {

		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decAnneeEnregManif = decAnneeEnregManif;
		this.decBurEnregManif = decBurEnregManif;
		this.decNumEnregManif = decNumEnregManif;
		this.decTypeRegime = decTypeRegime;
		this.decRegDouanier = decRegDouanier;
		this.decCodeSubvention = decCodeSubvention;
		this.decEtatSubv = decEtatSubv;
		this.decDateEnregDec = decDateEnregDec;
		this.decCodeAgree = decCodeAgree;
		this.decNumRepertoire = decNumRepertoire;
		this.decBurDouane = decBurDouane;
		this.decNbreArticles = decNbreArticles;
		this.decCodePpmDec = decCodePpmDec;

		return;
	}

	
	
	public String getLibCircuitVisite() {
		return libCircuitVisite;
	}

	public void setLibCircuitVisite(String libCircuitVisite) {
		this.libCircuitVisite = libCircuitVisite;
	}

	public String getLibModePaiement() {
		String libModePaiement = "";
        if (MODE_PAIEMENT_COMPT.equals(decModePaiement)) {
        	libModePaiement = LIB_MODE_PAIEMENT_COMPT;
        } else if (MODE_PAIEMENT_CREDIT.equals(decModePaiement)) {
        	libModePaiement = LIB_MODE_PAIEMENT_CREDIT;
        } else if (MODE_PAIEMENT_MIXTE.equals(decModePaiement)) {
        	libModePaiement = LIB_MODE_PAIEMENT_MIXTE;
        }
		return libModePaiement;
	}

	public void setLibModePaiement(String libModePaiement) {
		this.libModePaiement = libModePaiement;
	}

	public List<SegArtDec> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(List<SegArtDec> list) {
		this.listeArticle = list;
	}

	public List<?> getListTypeApurement() {
		return listTypeApurement;
	}

	public void setListTypeApurement(List<?> list) {
		this.listTypeApurement = list;
	}

	public List<?> getListModeDeclaration() {
		return listModeDeclaration;
	}

	public void setListModeDeclaration(List<?> list) {
		this.listModeDeclaration = list;
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

	public BigDecimal getDecMontCfaFret() {
		return decMontCfaFret;
	}

	public void setDecMontCfaFret(BigDecimal decMontCfaFret) {
		this.decMontCfaFret = decMontCfaFret;
	}

	public BigDecimal getDecAssurCfa() {
		return decAssurCfa;
	}

	public void setDecAssurCfa(BigDecimal decAssurCfa) {
		this.decAssurCfa = decAssurCfa;
	}

	public BigDecimal getDecMontAssurCfaElem() {
		return decMontAssurCfaElem;
	}

	public void setDecMontAssurCfaElem(BigDecimal decMontAssurCfaElem) {
		this.decMontAssurCfaElem = decMontAssurCfaElem;
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

	public String getDecCodeReselection() {
		return decCodeReselection;
	}

	public void setDecCodeReselection(String decCodeReselection) {
		this.decCodeReselection = decCodeReselection;
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

	public String getDecCodeRegDou() {
		 
		 decCodeRegDou=decTypeRegime + decRegDouanier;
		 return decCodeRegDou;
	}

	public void setDecCodeRegDou(String decCodeRegDou) {
		this.decCodeRegDou = decCodeRegDou;
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

	public String getDecNumImpExp() {
		return decNumImpExp;
	}

	public void setDecNumImpExp(String decNumImpExp) {
		this.decNumImpExp = decNumImpExp;
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

	public String getDecBurDepProv() {
		return decBurDepProv;
	}

	public void setDecBurDepProv(String decBurDepProv) {
		this.decBurDepProv = decBurDepProv;
	}

	public Integer getDecNumDepProv() {
		return decNumDepProv;
	}

	public void setDecNumDepProv(Integer decNumDepProv) {
		this.decNumDepProv = decNumDepProv;
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

	public String getDecAnneeDepProv() {
		return decAnneeDepProv;
	}

	public void setDecAnneeDepProv(String decAnneeDepProv) {
		this.decAnneeDepProv = decAnneeDepProv;
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

	public String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}

	public void setDecAnneeRegEco(String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}

	public String getDecNumRegEco() {
		return decNumRegEco;
	}

	public void setDecNumRegEco(String decNumRegEco) {
		this.decNumRegEco = decNumRegEco;
	}

	public String getDecIndicContrevisite() {
		return decIndicContrevisite;
	}

	public void setDecIndicContrevisite(String decIndicContrevisite) {
		this.decIndicContrevisite = decIndicContrevisite;
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

	public String getDecIndLiquidSupp() {
		return decIndLiquidSupp;
	}

	public void setDecIndLiquidSupp(String decIndLiquidSupp) {
		this.decIndLiquidSupp = decIndLiquidSupp;
	}

	public String getDecIndQuittance() {
		return decIndQuittance;
	}

	public void setDecIndQuittance(String decIndQuittance) {
		this.decIndQuittance = decIndQuittance;
	}

	public String getDecIndPaieLiquidSupp() {
		return decIndPaieLiquidSupp;
	}

	public void setDecIndPaieLiquidSupp(String decIndPaieLiquidSupp) {
		this.decIndPaieLiquidSupp = decIndPaieLiquidSupp;
	}

	public Date getDecDatePaieLiqSupp() {
		return decDatePaieLiqSupp;
	}

	public void setDecDatePaieLiqSupp(Date decDatePaieLiqSupp) {
		this.decDatePaieLiqSupp = decDatePaieLiqSupp;
	}

	public String getDecEtatDecl() {
		return decEtatDecl;
	}

	public void setDecEtatDecl(String decEtatDecl) {
		this.decEtatDecl = decEtatDecl;
	}

	public String getDecEtatTraitementDep() {
		return decEtatTraitementDep;
	}

	public void setDecEtatTraitementDep(String decEtatTraitementDep) {
		this.decEtatTraitementDep = decEtatTraitementDep;
	}

	public List<SegArtDec> getSegArtDecSegGenDec() {
		return segArtDecSegGenDec;
	}

	public void setSegArtDecSegGenDec(List<SegArtDec> segArtDecSegGenDec) {
		this.segArtDecSegGenDec = segArtDecSegGenDec;
	}

	public List<EncoursDeclaration> getEncoursDeclarationSegGenDec() {
		return encoursDeclarationSegGenDec;
	}

	public void setEncoursDeclarationSegGenDec(
			List<EncoursDeclaration> encoursDeclarationSegGenDec) {
		this.encoursDeclarationSegGenDec = encoursDeclarationSegGenDec;
	}

	public List<ComplementTaxes> getComplementTaxesSegGenDec() {
		return complementTaxesSegGenDec;
	}

	public void setComplementTaxesSegGenDec(
			List<ComplementTaxes> complementTaxesSegGenDec) {
		this.complementTaxesSegGenDec = complementTaxesSegGenDec;
	}

	public List<DclVentilCredTaxe> getDclVentilCredTaxeSegGenDec() {
		return dclVentilCredTaxeSegGenDec;
	}

	public void setDclVentilCredTaxeSegGenDec(
			List<DclVentilCredTaxe> dclVentilCredTaxeSegGenDec) {
		this.dclVentilCredTaxeSegGenDec = dclVentilCredTaxeSegGenDec;
	}

	public List<DdeAnnulDecl> getDdeAnnulDeclSegGenDec() {
		return ddeAnnulDeclSegGenDec;
	}

	public void setDdeAnnulDeclSegGenDec(
			List<DdeAnnulDecl> ddeAnnulDeclSegGenDec) {
		this.ddeAnnulDeclSegGenDec = ddeAnnulDeclSegGenDec;
	}

    /**
     * @return regime douane.
     */
    public String getRegimeDouane() {
        return decTypeRegime + decRegDouanier;
    }

	public String getNineaDest() {
		return nineaDest;
	}

	public void setNineaDest(String nineaDest) {
		this.nineaDest = nineaDest;
	}

	public Long getIdDemEscorte() {
		return idDemEscorte;
	}

	public void setIdDemEscorte(Long idDemEscorte) {
		this.idDemEscorte = idDemEscorte;
	}

	public long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public Integer getIdXdemEscorte() {
		return idXdemEscorte;
	}

	public void setIdXdemEscorte(Integer idXdemEscorte) {
		this.idXdemEscorte = idXdemEscorte;
	}

	public DemandeEscorte getDemandeEscorte() {
		return demandeEscorte;
	}

	public void setDemandeEscorte(DemandeEscorte demandeEscorte) {
		this.demandeEscorte = demandeEscorte;
	}

	public void setListLiquidArt(List<?> vect) {
		this.listLiquidArt = vect;		
	}
	
	public List<?> getListLiquidArt() {
		return listLiquidArt;
	}
	

}