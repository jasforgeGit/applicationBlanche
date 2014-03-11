package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.RepriseSommierKey;

@Entity
@IdClass(RepriseSommierKey.class)
@Table(name="REPRISESOMMIER")
public class RepriseSommier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7650505705124181072L;

	@Id
	@Column(name="DECANNEEDEC", length=4, nullable=false)
	private String decAnneeDec;
	
	@Id
	@Column(name="DECBURENREGDEC", length=3, nullable=false)
	private java.lang.String decBurEnregDec;
	
	@Id
	@Column(name="DECNUMDECLARATION",  nullable=false)
	private java.lang.Integer decNumDeclaration;
	
	@Id
	@Column(name="DECNUMARTDEC",  nullable=false)
	private java.lang.Integer decNumArtDec;
	
	
	@Column(name="DECANNEEREGECO", length=4 )
	private java.lang.String decAnneeRegEco;
	
	@Column(name="DECCODEAGREE", length=3 )
	private java.lang.String decCodeAgree;
	
	@Column(name="DECCODECREDITAIRE", length=3 )
	private java.lang.String decCodeCreditaire;
	
	@Column(name="DECCODEPPM", length=5 )
	private java.lang.String decCodePpm;
	
	@Column(name="DECCODELIEUSTOCK", length=3 )
	private java.lang.String decCodeLieuStock;
	
	@Column(name="DECCODEPROD", length=6 )
	private java.lang.String decCodeProd;
	
	@Column(name="DECDATEPRECISION")
	private java.sql.Date decDateprecision;
	
	@Column(name="DECDATEAT")
	private java.sql.Date decDateEtat;
	

	@Column(name="DECDATEECOR")
	private java.sql.Date decDateEcor;

	@Column(name="DECDATESOMMIER" )
	private java.sql.Date decDateSommier;
	
	@Column(name="DECDATEVALIDITESOM")
	private java.sql.Date decDateValiditeSom;
	

	@Column(name="DECDECISIONPROROG", length=20 )
	private java.lang.String decDecisionProrog;
	
	@Column(name="DECDATEPROROG" )
	private java.sql.Date decDateProrog;
	
	@Column(name="DECETATSOMMIER", length=1 )
	private java.lang.String decEtatSommier;
	
	@Column(name="DECMUTATIONAT", length=1 )
	private java.lang.String decMutationAt;
	
	@Column(name="DECNBRECOLISAPRESSOM", columnDefinition = "DECIMAL(6,0)")
	private java.math.BigDecimal decNbreColisApresSom;
	
	@Column(name="DECNBRECOLISCRSOM" )
	private java.lang.Integer decNbreColisCrSom;
	
	@Column(name="DECNBRECOLISDECLARES" )
	private java.lang.Integer decNbreColisDeclares;
	
	@Column(name="DECNBRECOLISRESISOM" )
	private java.lang.Integer decNbreColisResiSom;
	
	@Column(name="DECNBREMOISINTRET4" )
	private java.lang.Integer decNbreMoisInt;
	
	@Column(name="DECNBREPROROG", columnDefinition = "DECIMAL(2,0)")
	private java.math.BigDecimal decNbreProrog;
	
	@Column(name="DECNUMDECHTRANSIT", length=6 )
	private java.lang.String decNumDechTransit;
	
	@Column(name="DECNUMIMPEXP", length=10 )
	private java.lang.String decNumImpExp;
	
	@Column(name="DECNUMREGECO", length=6 )
	private java.lang.String decNumRegEco;
	
	@Column(name="DECPAYSORIG", length=3 )
	private java.lang.String decPaysOrig;
	
	@Column(name="DECPOIDSAPURSOM", columnDefinition = "DECIMAL(9,0)")
	private java.math.BigDecimal decPoidsApurSom;
	
	@Column(name="DECPDNETCONSSOM", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decPdNetConsSom;
	
	@Column(name="DECPDNETDECSOM", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decPdNetDecSom;
	
	@Column(name="DECPDRESTANTSOM", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decPdRestantSom;
	
	@Column(name="DECPRECUEMOA", length=2 )
	private java.lang.String decPrecUemoa;
	
	@Column(name="DECPRECSENEGAL", length=2 )
	private java.lang.String decPrecSenegal;
	
	
	@Column(name="DECQTERESIDUELSOM", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteResiduelSom;
	
	
	@Column(name="DECQTECOMPLEMENTAIRE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteComplementaire;
	
	@Column(name="DECQTECOMPLCONSTATEE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteComplConstatee;
	
	@Column(name="DECQTEMERCURIALE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteMercuriale;
	
	@Column(name="DECQTEMERCRESIDUELLE", columnDefinition = "DECIMAL(6,0)")
	private java.math.BigDecimal decQteMercResiduelle;
	
	@Column(name="DECTYPEREGIME", length=1 )
	private java.lang.String decTypeRegime;
	
	@Column(name="DECREGDOUANIER", length=1 )
	private java.lang.String decRegDouanier;
	
	@Column(name="DECREGFISCAL", length=2 )
	private java.lang.String decRegFiscal;
	
	@Column(name="DECUNITECOMP", length=2 )
	private java.lang.String decUniteComp;
	
	@Column(name="DECUNITEMERCURIALE", length=2 )
	private java.lang.String decUniteMercuriale;
	
	@Column(name="DECUSERRECTIFICATEUR", length=8 )
	private java.lang.String decUserRectificateur;
	
	@Column(name="DECVALCAF", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decValCaf;
	
	@Column(name="DECVALCAFCONSTATEE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decValCafConstatee;
	
	@Column(name="DECVALRESIDUELLE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decValResiduelle;
	
	@Column(name="DECCODEDESTINATAIRE", length=5 )
	private java.lang.String decCodeDestinataire;
	
	@Column(name="DECUSERCREATION", length=8 )
	private java.lang.String decUserCreation;
	
	@Column(name="DECDATECREATION" )
	private java.sql.Date decDateCreation;
	
	@Column(name="DECNOMDESTINATAIRE", length=255 )
	private java.lang.String decNomDestinataire;
	
	
	@Column(name="DECPAYSPROVENANCE", length=3 )
	private java.lang.String decPaysprovenance;
	
	@Column(name="DECANNEECONVENTION", length=4 )
	private java.lang.String decAnneeConvention;
	
	@Column(name="DECNUMCONVENTION", length=6 )
	private java.lang.String decNumConvention;
	
	@Column(name="DECAGREEENTUEMOA", length=4 )
	private java.lang.String decAgreeEntUemoa;
	
	@Column(name="DECBUREXPORTATION", length=4 )
	private java.lang.String decBurExportation;
	
	@Column(name="DECREGDOCEXPORT", length=4 )
	private java.lang.String decRegDocExport;
	
	@Column(name="DECDATEDOCEXPORT" )
	private java.sql.Date decDateDocExport;
	
	@Column(name="DECNUMDOCEXPORT", length=7 )
	private java.lang.String decNumDocExport;
	
	@Column(name="DECBURMISECONS", length=4 )
	private java.lang.String decBurMiseCons;
	
	@Column(name="DECPAYSMISECONS", length=3 )
	private java.lang.String decPaysMiseCons;
	
	@Column(name="DECNUMDECMISECONS", length=7 )
	private java.lang.String decNumDecMiseCons;
	
	@Column(name="DECDATEMISECONS" )
	private java.sql.Date decDateMiseCons;
	
	@Column(name="DECCATPRODUEMOA", length=2 )
	private java.lang.String decCatProdUemoa;
	
	@Column(name="DECCODEPPMFINAL", length=5 )
	private java.lang.String decCodeppmFinal;
	
	@Column(name="DECNBRECHEVAUX" )
	private java.lang.Integer decNbreChevaux;
	
//	@OneToMany(mappedBy = "sRepApurSom", targetEntity = ApurRepriseSom.class) 
//	private List<ApurRepriseSom> listeApurRepriseSom;
//    
	public RepriseSommier() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public RepriseSommier(String decAnneeDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decAnneeRegEco, String decCodeAgree,
			String decCodeCreditaire, String decCodePpm,
			String decCodeLieuStock, String decCodeProd,
			Date decDateprecision, Date decDateEtat,
			Date decDateEcor, Date decDateSommier,
			Date decDateValiditeSom, String decDecisionProrog,
			Date decDateProrog, String decEtatSommier,
			String decMutationAt, BigDecimal decNbreColisApresSom,
			Integer decNbreColisCrSom, Integer decNbreColisDeclares,
			Integer decNbreColisResiSom, Integer decNbreMoisInt,
			BigDecimal decNbreProrog, String decNumDechTransit,
			String decNumImpExp, String decNumRegEco, String decPaysOrig,
			BigDecimal decPoidsApurSom, BigDecimal decPdNetConsSom,
			BigDecimal decPdNetDecSom, BigDecimal decPdRestantSom,
			String decPrecUemoa, String decPrecSenegal,
			BigDecimal decQteResiduelSom, BigDecimal decQteComplementaire,
			BigDecimal decQteComplConstatee, BigDecimal decQteMercuriale,
			BigDecimal decQteMercResiduelle, String decTypeRegime,
			String decRegDouanier, String decRegFiscal, String decUniteComp,
			String decUniteMercuriale, String decUserRectificateur,
			BigDecimal decValCaf, BigDecimal decValCafConstatee,
			BigDecimal decValResiduelle, String decCodeDestinataire,
			String decUserCreation, Date decDateCreation,
			String decNomDestinataire, String decPaysprovenance,
			String decAnneeConvention, String decNumConvention,
			String decAgreeEntUemoa, String decBurExportation,
			String decRegDocExport, Date decDateDocExport,
			String decNumDocExport, String decBurMiseCons,
			String decPaysMiseCons, String decNumDecMiseCons,
			Date decDateMiseCons, String decCatProdUemoa,
			String decCodeppmFinal, Integer decNbreChevaux) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decAnneeRegEco = decAnneeRegEco;
		this.decCodeAgree = decCodeAgree;
		this.decCodeCreditaire = decCodeCreditaire;
		this.decCodePpm = decCodePpm;
		this.decCodeLieuStock = decCodeLieuStock;
		this.decCodeProd = decCodeProd;
		this.decDateprecision = decDateprecision;
		this.decDateEtat = decDateEtat;
		this.decDateEcor = decDateEcor;
		this.decDateSommier = decDateSommier;
		this.decDateValiditeSom = decDateValiditeSom;
		this.decDecisionProrog = decDecisionProrog;
		this.decDateProrog = decDateProrog;
		this.decEtatSommier = decEtatSommier;
		this.decMutationAt = decMutationAt;
		this.decNbreColisApresSom = decNbreColisApresSom;
		this.decNbreColisCrSom = decNbreColisCrSom;
		this.decNbreColisDeclares = decNbreColisDeclares;
		this.decNbreColisResiSom = decNbreColisResiSom;
		this.decNbreMoisInt = decNbreMoisInt;
		this.decNbreProrog = decNbreProrog;
		this.decNumDechTransit = decNumDechTransit;
		this.decNumImpExp = decNumImpExp;
		this.decNumRegEco = decNumRegEco;
		this.decPaysOrig = decPaysOrig;
		this.decPoidsApurSom = decPoidsApurSom;
		this.decPdNetConsSom = decPdNetConsSom;
		this.decPdNetDecSom = decPdNetDecSom;
		this.decPdRestantSom = decPdRestantSom;
		this.decPrecUemoa = decPrecUemoa;
		this.decPrecSenegal = decPrecSenegal;
		this.decQteResiduelSom = decQteResiduelSom;
		this.decQteComplementaire = decQteComplementaire;
		this.decQteComplConstatee = decQteComplConstatee;
		this.decQteMercuriale = decQteMercuriale;
		this.decQteMercResiduelle = decQteMercResiduelle;
		this.decTypeRegime = decTypeRegime;
		this.decRegDouanier = decRegDouanier;
		this.decRegFiscal = decRegFiscal;
		this.decUniteComp = decUniteComp;
		this.decUniteMercuriale = decUniteMercuriale;
		this.decUserRectificateur = decUserRectificateur;
		this.decValCaf = decValCaf;
		this.decValCafConstatee = decValCafConstatee;
		this.decValResiduelle = decValResiduelle;
		this.decCodeDestinataire = decCodeDestinataire;
		this.decUserCreation = decUserCreation;
		this.decDateCreation = decDateCreation;
		this.decNomDestinataire = decNomDestinataire;
		this.decPaysprovenance = decPaysprovenance;
		this.decAnneeConvention = decAnneeConvention;
		this.decNumConvention = decNumConvention;
		this.decAgreeEntUemoa = decAgreeEntUemoa;
		this.decBurExportation = decBurExportation;
		this.decRegDocExport = decRegDocExport;
		this.decDateDocExport = decDateDocExport;
		this.decNumDocExport = decNumDocExport;
		this.decBurMiseCons = decBurMiseCons;
		this.decPaysMiseCons = decPaysMiseCons;
		this.decNumDecMiseCons = decNumDecMiseCons;
		this.decDateMiseCons = decDateMiseCons;
		this.decCatProdUemoa = decCatProdUemoa;
		this.decCodeppmFinal = decCodeppmFinal;
		this.decNbreChevaux = decNbreChevaux;
	}



	public String getDecAnneeDec() {
		return decAnneeDec;
	}



	public void setDecAnneeDec(String decAnneeDec) {
		this.decAnneeDec = decAnneeDec;
	}



	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}



	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}



	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}



	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}



	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}



	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}



	public java.lang.String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}



	public void setDecAnneeRegEco(java.lang.String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}



	public java.lang.String getDecCodeAgree() {
		return decCodeAgree;
	}



	public void setDecCodeAgree(java.lang.String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}



	public java.lang.String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}



	public void setDecCodeCreditaire(java.lang.String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}



	public java.lang.String getDecCodePpm() {
		return decCodePpm;
	}



	public void setDecCodePpm(java.lang.String decCodePpm) {
		this.decCodePpm = decCodePpm;
	}



	public java.lang.String getDecCodeLieuStock() {
		return decCodeLieuStock;
	}



	public void setDecCodeLieuStock(java.lang.String decCodeLieuStock) {
		this.decCodeLieuStock = decCodeLieuStock;
	}



	public java.lang.String getDecCodeProd() {
		return decCodeProd;
	}



	public void setDecCodeProd(java.lang.String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}



	public Date getDecDateprecision() {
		return decDateprecision;
	}



	public void setDecDateprecision(Date decDateprecision) {
		this.decDateprecision = decDateprecision;
	}



	public Date getDecDateEtat() {
		return decDateEtat;
	}



	public void setDecDateEtat(Date decDateEtat) {
		this.decDateEtat = decDateEtat;
	}



	public Date getDecDateEcor() {
		return decDateEcor;
	}



	public void setDecDateEcor(Date decDateEcor) {
		this.decDateEcor = decDateEcor;
	}



	public Date getDecDateSommier() {
		return decDateSommier;
	}



	public void setDecDateSommier(Date decDateSommier) {
		this.decDateSommier = decDateSommier;
	}



	public Date getDecDateValiditeSom() {
		return decDateValiditeSom;
	}



	public void setDecDateValiditeSom(Date decDateValiditeSom) {
		this.decDateValiditeSom = decDateValiditeSom;
	}



	public java.lang.String getDecDecisionProrog() {
		return decDecisionProrog;
	}



	public void setDecDecisionProrog(java.lang.String decDecisionProrog) {
		this.decDecisionProrog = decDecisionProrog;
	}



	public Date getDecDateProrog() {
		return decDateProrog;
	}



	public void setDecDateProrog(Date decDateProrog) {
		this.decDateProrog = decDateProrog;
	}



	public java.lang.String getDecEtatSommier() {
		return decEtatSommier;
	}



	public void setDecEtatSommier(java.lang.String decEtatSommier) {
		this.decEtatSommier = decEtatSommier;
	}



	public java.lang.String getDecMutationAt() {
		return decMutationAt;
	}



	public void setDecMutationAt(java.lang.String decMutationAt) {
		this.decMutationAt = decMutationAt;
	}



	public java.math.BigDecimal getDecNbreColisApresSom() {
		return decNbreColisApresSom;
	}



	public void setDecNbreColisApresSom(java.math.BigDecimal decNbreColisApresSom) {
		this.decNbreColisApresSom = decNbreColisApresSom;
	}



	public java.lang.Integer getDecNbreColisCrSom() {
		return decNbreColisCrSom;
	}



	public void setDecNbreColisCrSom(java.lang.Integer decNbreColisCrSom) {
		this.decNbreColisCrSom = decNbreColisCrSom;
	}



	public java.lang.Integer getDecNbreColisDeclares() {
		return decNbreColisDeclares;
	}



	public void setDecNbreColisDeclares(java.lang.Integer decNbreColisDeclares) {
		this.decNbreColisDeclares = decNbreColisDeclares;
	}



	public java.lang.Integer getDecNbreColisResiSom() {
		return decNbreColisResiSom;
	}



	public void setDecNbreColisResiSom(java.lang.Integer decNbreColisResiSom) {
		this.decNbreColisResiSom = decNbreColisResiSom;
	}



	public java.lang.Integer getDecNbreMoisInt() {
		return decNbreMoisInt;
	}



	public void setDecNbreMoisInt(java.lang.Integer decNbreMoisInt) {
		this.decNbreMoisInt = decNbreMoisInt;
	}



	public java.math.BigDecimal getDecNbreProrog() {
		return decNbreProrog;
	}



	public void setDecNbreProrog(java.math.BigDecimal decNbreProrog) {
		this.decNbreProrog = decNbreProrog;
	}



	public java.lang.String getDecNumDechTransit() {
		return decNumDechTransit;
	}



	public void setDecNumDechTransit(java.lang.String decNumDechTransit) {
		this.decNumDechTransit = decNumDechTransit;
	}



	public java.lang.String getDecNumImpExp() {
		return decNumImpExp;
	}



	public void setDecNumImpExp(java.lang.String decNumImpExp) {
		this.decNumImpExp = decNumImpExp;
	}



	public java.lang.String getDecNumRegEco() {
		return decNumRegEco;
	}



	public void setDecNumRegEco(java.lang.String decNumRegEco) {
		this.decNumRegEco = decNumRegEco;
	}



	public java.lang.String getDecPaysOrig() {
		return decPaysOrig;
	}



	public void setDecPaysOrig(java.lang.String decPaysOrig) {
		this.decPaysOrig = decPaysOrig;
	}



	public java.math.BigDecimal getDecPoidsApurSom() {
		return decPoidsApurSom;
	}



	public void setDecPoidsApurSom(java.math.BigDecimal decPoidsApurSom) {
		this.decPoidsApurSom = decPoidsApurSom;
	}



	public java.math.BigDecimal getDecPdNetConsSom() {
		return decPdNetConsSom;
	}



	public void setDecPdNetConsSom(java.math.BigDecimal decPdNetConsSom) {
		this.decPdNetConsSom = decPdNetConsSom;
	}



	public java.math.BigDecimal getDecPdNetDecSom() {
		return decPdNetDecSom;
	}



	public void setDecPdNetDecSom(java.math.BigDecimal decPdNetDecSom) {
		this.decPdNetDecSom = decPdNetDecSom;
	}



	public java.math.BigDecimal getDecPdRestantSom() {
		return decPdRestantSom;
	}



	public void setDecPdRestantSom(java.math.BigDecimal decPdRestantSom) {
		this.decPdRestantSom = decPdRestantSom;
	}



	public java.lang.String getDecPrecUemoa() {
		return decPrecUemoa;
	}



	public void setDecPrecUemoa(java.lang.String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}



	public java.lang.String getDecPrecSenegal() {
		return decPrecSenegal;
	}



	public void setDecPrecSenegal(java.lang.String decPrecSenegal) {
		this.decPrecSenegal = decPrecSenegal;
	}



	public java.math.BigDecimal getDecQteResiduelSom() {
		return decQteResiduelSom;
	}



	public void setDecQteResiduelSom(java.math.BigDecimal decQteResiduelSom) {
		this.decQteResiduelSom = decQteResiduelSom;
	}



	public java.math.BigDecimal getDecQteComplementaire() {
		return decQteComplementaire;
	}



	public void setDecQteComplementaire(java.math.BigDecimal decQteComplementaire) {
		this.decQteComplementaire = decQteComplementaire;
	}



	public java.math.BigDecimal getDecQteComplConstatee() {
		return decQteComplConstatee;
	}



	public void setDecQteComplConstatee(java.math.BigDecimal decQteComplConstatee) {
		this.decQteComplConstatee = decQteComplConstatee;
	}



	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}



	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}



	public java.math.BigDecimal getDecQteMercResiduelle() {
		return decQteMercResiduelle;
	}



	public void setDecQteMercResiduelle(java.math.BigDecimal decQteMercResiduelle) {
		this.decQteMercResiduelle = decQteMercResiduelle;
	}



	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}



	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}



	public java.lang.String getDecRegDouanier() {
		return decRegDouanier;
	}



	public void setDecRegDouanier(java.lang.String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}



	public java.lang.String getDecRegFiscal() {
		return decRegFiscal;
	}



	public void setDecRegFiscal(java.lang.String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}



	public java.lang.String getDecUniteComp() {
		return decUniteComp;
	}



	public void setDecUniteComp(java.lang.String decUniteComp) {
		this.decUniteComp = decUniteComp;
	}



	public java.lang.String getDecUniteMercuriale() {
		return decUniteMercuriale;
	}



	public void setDecUniteMercuriale(java.lang.String decUniteMercuriale) {
		this.decUniteMercuriale = decUniteMercuriale;
	}



	public java.lang.String getDecUserRectificateur() {
		return decUserRectificateur;
	}



	public void setDecUserRectificateur(java.lang.String decUserRectificateur) {
		this.decUserRectificateur = decUserRectificateur;
	}



	public java.math.BigDecimal getDecValCaf() {
		return decValCaf;
	}



	public void setDecValCaf(java.math.BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}



	public java.math.BigDecimal getDecValCafConstatee() {
		return decValCafConstatee;
	}



	public void setDecValCafConstatee(java.math.BigDecimal decValCafConstatee) {
		this.decValCafConstatee = decValCafConstatee;
	}



	public java.math.BigDecimal getDecValResiduelle() {
		return decValResiduelle;
	}



	public void setDecValResiduelle(java.math.BigDecimal decValResiduelle) {
		this.decValResiduelle = decValResiduelle;
	}



	public java.lang.String getDecCodeDestinataire() {
		return decCodeDestinataire;
	}



	public void setDecCodeDestinataire(java.lang.String decCodeDestinataire) {
		this.decCodeDestinataire = decCodeDestinataire;
	}



	public java.lang.String getDecUserCreation() {
		return decUserCreation;
	}



	public void setDecUserCreation(java.lang.String decUserCreation) {
		this.decUserCreation = decUserCreation;
	}



	public Date getDecDateCreation() {
		return decDateCreation;
	}



	public void setDecDateCreation(Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}



	public java.lang.String getDecNomDestinataire() {
		return decNomDestinataire;
	}



	public void setDecNomDestinataire(java.lang.String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}



	public java.lang.String getDecPaysprovenance() {
		return decPaysprovenance;
	}



	public void setDecPaysprovenance(java.lang.String decPaysprovenance) {
		this.decPaysprovenance = decPaysprovenance;
	}



	public java.lang.String getDecAnneeConvention() {
		return decAnneeConvention;
	}



	public void setDecAnneeConvention(java.lang.String decAnneeConvention) {
		this.decAnneeConvention = decAnneeConvention;
	}



	public java.lang.String getDecNumConvention() {
		return decNumConvention;
	}



	public void setDecNumConvention(java.lang.String decNumConvention) {
		this.decNumConvention = decNumConvention;
	}



	public java.lang.String getDecAgreeEntUemoa() {
		return decAgreeEntUemoa;
	}



	public void setDecAgreeEntUemoa(java.lang.String decAgreeEntUemoa) {
		this.decAgreeEntUemoa = decAgreeEntUemoa;
	}



	public java.lang.String getDecBurExportation() {
		return decBurExportation;
	}



	public void setDecBurExportation(java.lang.String decBurExportation) {
		this.decBurExportation = decBurExportation;
	}



	public java.lang.String getDecRegDocExport() {
		return decRegDocExport;
	}



	public void setDecRegDocExport(java.lang.String decRegDocExport) {
		this.decRegDocExport = decRegDocExport;
	}



	public Date getDecDateDocExport() {
		return decDateDocExport;
	}



	public void setDecDateDocExport(Date decDateDocExport) {
		this.decDateDocExport = decDateDocExport;
	}



	public java.lang.String getDecNumDocExport() {
		return decNumDocExport;
	}



	public void setDecNumDocExport(java.lang.String decNumDocExport) {
		this.decNumDocExport = decNumDocExport;
	}



	public java.lang.String getDecBurMiseCons() {
		return decBurMiseCons;
	}



	public void setDecBurMiseCons(java.lang.String decBurMiseCons) {
		this.decBurMiseCons = decBurMiseCons;
	}



	public java.lang.String getDecPaysMiseCons() {
		return decPaysMiseCons;
	}



	public void setDecPaysMiseCons(java.lang.String decPaysMiseCons) {
		this.decPaysMiseCons = decPaysMiseCons;
	}



	public java.lang.String getDecNumDecMiseCons() {
		return decNumDecMiseCons;
	}



	public void setDecNumDecMiseCons(java.lang.String decNumDecMiseCons) {
		this.decNumDecMiseCons = decNumDecMiseCons;
	}



	public Date getDecDateMiseCons() {
		return decDateMiseCons;
	}



	public void setDecDateMiseCons(Date decDateMiseCons) {
		this.decDateMiseCons = decDateMiseCons;
	}



	public java.lang.String getDecCatProdUemoa() {
		return decCatProdUemoa;
	}



	public void setDecCatProdUemoa(java.lang.String decCatProdUemoa) {
		this.decCatProdUemoa = decCatProdUemoa;
	}



	public java.lang.String getDecCodeppmFinal() {
		return decCodeppmFinal;
	}



	public void setDecCodeppmFinal(java.lang.String decCodeppmFinal) {
		this.decCodeppmFinal = decCodeppmFinal;
	}



	public java.lang.Integer getDecNbreChevaux() {
		return decNbreChevaux;
	}



	public void setDecNbreChevaux(java.lang.Integer decNbreChevaux) {
		this.decNbreChevaux = decNbreChevaux;
	}



	
	
	
	
	
	
	
	
	
	
	
	
}

