package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SommiersDlppKey;

@Entity
@IdClass(SommiersDlppKey.class)
@Table(name = "SOMMIERSDLPP")
public class SommiersDlpp implements Serializable {

	private static final long serialVersionUID = -1838315878170414946L;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Column(name = "DECANNEEREGECO", length = 4)
	private String decAnneeRegEco;

	@Column(name = "DECCODEAGREE", length = 3, nullable = false)
	private String decCodeAgree;

	@Column(name = "DECCODECREDITAIRE", length = 3, nullable = false)
	private String decCodeCreditaire;

	@Column(name = "DECCODELIEUSTOCKAGE", length = 3)
	private String decCodeLieuStockage;

	@Column(name = "DECPPMDECLARANT", length = 5, nullable = false)
	private String decPpmDeclarant;

	@Column(name = "DECNUMPROD", length = 6, nullable = false)
	private String decNumProd;

	@Column(name = "DECDATEAT")
	private java.sql.Date decDateAt;

	@Column(name = "DECDATEPROROGATION")
	private java.sql.Date decDateProrogation;

	@Column(name = "DECDATEDECISION")
	private java.sql.Date decDateDecision;

	@Column(name = "DECDATEECOR")
	private java.sql.Date decDateEcor;

	@Column(name = "DECDATESOMMIER", nullable = false)
	private java.sql.Date decDateSommier;

	@Column(name = "DECDATEVALIDITESOM")
	private java.sql.Date decDateValiditeSom;

	@Column(name = "DECETATSOMMIER", length = 1)
	private String decEtatSommier;

	@Column(name = "DECIDSOMMIER", columnDefinition = "DECIMAL(18 , 0)")
	private java.math.BigDecimal decIdSommier;

	@Column(name = "DECMUTATIONAT", length = 1)
	private String decMutationAt;

	@Column(name = "DECNBRECOLISCONSSOM")
	private Integer decNbreColisConssom;

	@Column(name = "DECNBRECOLISAPSOM", columnDefinition = "DECIMAL(6,0)")
	private java.math.BigDecimal decNbreColisApsom;

	@Column(name = "DECNBRECOLISDECLARES")
	private Integer decNbreColisDeclares;

	@Column(name = "DECNBRECOLISRESIDUELSOM")
	private Integer decNbreColisResiduelSom;

	@Column(name = "DECNBREMOISINTRETARD")
	private Integer decNbreMoisIntRetard;

	@Column(name = "DECNBREPROROGATION")
	private Integer decNbreProrogation;

	@Column(name = "DECNUMIMPORTEXPORT", length = 10)
	private String decNumImportExport;

	@Column(name = "DECNUMREGECO", length = 6)
	private String decNumRegEco;

	@Column(name = "DECPAYSORIGINE", length = 3, nullable = false)
	private String decPaysOrigine;

	@Column(name = "DECPDAPUREMTSOM", columnDefinition = "DECIMAL(9 , 0)")
	private java.math.BigDecimal decPdApurementSom;

	@Column(name = "DECPDNETCONSSOM")
	private Integer decPdNetConssom;

	@Column(name = "DECPDNETDECLARESOM", columnDefinition = "DECIMAL(13,0)")
	private java.math.BigDecimal decPdNetDeclareSom;

	@Column(name = "DECPDRESTANTSOM")
	private Integer decPdRestantSom;

	@Column(name = "DECPRECSEN", length = 2, nullable = false)
	private String decPrecSen;

	@Column(name = "DECPRECUEMOA", length = 2, nullable = false)
	private String decPrecUemoa;

	@Column(name = "DECQTECOMPLEMENTAIRE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteComplementaire;

	@Column(name = "DECQTEMERCRESIDUELLE", columnDefinition = "DECIMAL(6,0)")
	private java.math.BigDecimal decQteMercResiduelle;

	@Column(name = "DECQTERDSOMMIER", columnDefinition = "DECIMAL(10,0)")
	private java.math.BigDecimal decQteRdSommier;

	@Column(name = "DECQTECOMPCONSTATE", columnDefinition = "DECIMAL(10,0)")
	private java.math.BigDecimal decQteCompConstate;

	@Column(name = "DECQTEMERCURIALE", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal decQteMercuriale;

	@Column(name = "DECREGDOUANIER", length = 1, nullable = false)
	private String decRegDouanier;

	@Column(name = "DECREGFISCAL", length = 2, nullable = false)
	private String decRegFiscal;

	@Column(name = "DECTYPEREGIME", length = 1, nullable = false)
	private String decTypeRegime;

	@Column(name = "DECUNITECOMPLEMENTAIRE", length = 2)
	private String decUniteComplementaire;

	@Column(name = "DECUNITEMERCURIALE", length = 2)
	private String decUniteMercuriale;

	@Column(name = "DECUSERCONTSOMMIER", length = 8)
	private String decUserContSommier;

	@Column(name = "DECVALEURCAF", columnDefinition = "DECIMAL(13,0)")
	private java.math.BigDecimal decValeurCaf;

	@Column(name = "DECVALCAFCONSTATE", columnDefinition = "DECIMAL(13,0)")
	private java.math.BigDecimal decValCafconstate;

	@Column(name = "DECVALRESIDUEL", columnDefinition = "DECIMAL(13,0)")
	private java.math.BigDecimal decValResiduel;

	@ManyToOne(targetEntity = ArticleDlpp.class)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DLPPANNEEDLPP", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DLPPCODEBUREAU", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DLPPNUMDLPP", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DLPPNUMARTICLE", insertable = false, updatable = false, nullable = false) })
	private ArticleDlpp articleDlpp;

	@OneToMany(mappedBy = "sommiersDlpp", targetEntity = CessionSommierDlpp.class)
	private List<CessionSommierDlpp> cessionSommiersDlpp;

	@OneToMany(mappedBy = "sommiersDlpp", targetEntity = ApurementSommierDlpp.class)
	private List<ApurementSommierDlpp> apurementSommiersDlpp;

	public SommiersDlpp() {

	}

	public SommiersDlpp(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDecl) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
	}

	public SommiersDlpp(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDecl,
			String decCodeAgree, String decCodeCreditaire,
			String decPpmDeclarant, String decNumProd, Date decDateSommier,
			String decPaysOrigine, String decPrecSen, String decPrecUemoa,
			String decRegDouanier, String decRegFiscal, String decTypeRegime) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeAgree = decCodeAgree;
		this.decCodeCreditaire = decCodeCreditaire;
		this.decPpmDeclarant = decPpmDeclarant;
		this.decNumProd = decNumProd;
		this.decDateSommier = decDateSommier;
		this.decPaysOrigine = decPaysOrigine;
		this.decPrecSen = decPrecSen;
		this.decPrecUemoa = decPrecUemoa;
		this.decRegDouanier = decRegDouanier;
		this.decRegFiscal = decRegFiscal;
		this.decTypeRegime = decTypeRegime;
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

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}

	public void setDecAnneeRegEco(String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}

	public String getDecCodeAgree() {
		return decCodeAgree;
	}

	public void setDecCodeAgree(String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}

	public String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public String getDecCodeLieuStockage() {
		return decCodeLieuStockage;
	}

	public void setDecCodeLieuStockage(String decCodeLieuStockage) {
		this.decCodeLieuStockage = decCodeLieuStockage;
	}

	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

	public String getDecNumProd() {
		return decNumProd;
	}

	public void setDecNumProd(String decNumProd) {
		this.decNumProd = decNumProd;
	}

	public java.sql.Date getDecDateAt() {
		return decDateAt;
	}

	public void setDecDateAt(java.sql.Date decDateAt) {
		this.decDateAt = decDateAt;
	}

	public java.sql.Date getDecDateProrogation() {
		return decDateProrogation;
	}

	public void setDecDateProrogation(java.sql.Date decDateProrogation) {
		this.decDateProrogation = decDateProrogation;
	}

	public java.sql.Date getDecDateDecision() {
		return decDateDecision;
	}

	public void setDecDateDecision(java.sql.Date decDateDecision) {
		this.decDateDecision = decDateDecision;
	}

	public java.sql.Date getDecDateEcor() {
		return decDateEcor;
	}

	public void setDecDateEcor(java.sql.Date decDateEcor) {
		this.decDateEcor = decDateEcor;
	}

	public java.sql.Date getDecDateSommier() {
		return decDateSommier;
	}

	public void setDecDateSommier(java.sql.Date decDateSommier) {
		this.decDateSommier = decDateSommier;
	}

	public java.sql.Date getDecDateValiditeSom() {
		return decDateValiditeSom;
	}

	public void setDecDateValiditeSom(java.sql.Date decDateValiditeSom) {
		this.decDateValiditeSom = decDateValiditeSom;
	}

	public String getDecEtatSommier() {
		return decEtatSommier;
	}

	public void setDecEtatSommier(String decEtatSommier) {
		this.decEtatSommier = decEtatSommier;
	}

	public java.math.BigDecimal getDecIdSommier() {
		return decIdSommier;
	}

	public void setDecIdSommier(java.math.BigDecimal decIdSommier) {
		this.decIdSommier = decIdSommier;
	}

	public String getDecMutationAt() {
		return decMutationAt;
	}

	public void setDecMutationAt(String decMutationAt) {
		this.decMutationAt = decMutationAt;
	}

	public Integer getDecNbreColisConssom() {
		return decNbreColisConssom;
	}

	public void setDecNbreColisConssom(Integer decNbreColisConssom) {
		this.decNbreColisConssom = decNbreColisConssom;
	}

	public java.math.BigDecimal getDecNbreColisApsom() {
		return decNbreColisApsom;
	}

	public void setDecNbreColisApsom(java.math.BigDecimal decNbreColisApsom) {
		this.decNbreColisApsom = decNbreColisApsom;
	}

	public Integer getDecNbreColisDeclares() {
		return decNbreColisDeclares;
	}

	public void setDecNbreColisDeclares(Integer decNbreColisDeclares) {
		this.decNbreColisDeclares = decNbreColisDeclares;
	}

	public Integer getDecNbreColisResiduelSom() {
		return decNbreColisResiduelSom;
	}

	public void setDecNbreColisResiduelSom(Integer decNbreColisResiduelSom) {
		this.decNbreColisResiduelSom = decNbreColisResiduelSom;
	}

	public Integer getDecNbreMoisIntRetard() {
		return decNbreMoisIntRetard;
	}

	public void setDecNbreMoisIntRetard(Integer decNbreMoisIntRetard) {
		this.decNbreMoisIntRetard = decNbreMoisIntRetard;
	}

	public Integer getDecNbreProrogation() {
		return decNbreProrogation;
	}

	public void setDecNbreProrogation(Integer decNbreProrogation) {
		this.decNbreProrogation = decNbreProrogation;
	}

	public String getDecNumImportExport() {
		return decNumImportExport;
	}

	public void setDecNumImportExport(String decNumImportExport) {
		this.decNumImportExport = decNumImportExport;
	}

	public String getDecNumRegEco() {
		return decNumRegEco;
	}

	public void setDecNumRegEco(String decNumRegEco) {
		this.decNumRegEco = decNumRegEco;
	}

	public String getDecPaysOrigine() {
		return decPaysOrigine;
	}

	public void setDecPaysOrigine(String decPaysOrigine) {
		this.decPaysOrigine = decPaysOrigine;
	}

	public java.math.BigDecimal getDecPdApurementSom() {
		return decPdApurementSom;
	}

	public void setDecPdApurementSom(java.math.BigDecimal decPdApurementSom) {
		this.decPdApurementSom = decPdApurementSom;
	}

	public Integer getDecPdNetConssom() {
		return decPdNetConssom;
	}

	public void setDecPdNetConssom(Integer decPdNetConssom) {
		this.decPdNetConssom = decPdNetConssom;
	}

	public java.math.BigDecimal getDecPdNetDeclareSom() {
		return decPdNetDeclareSom;
	}

	public void setDecPdNetDeclareSom(java.math.BigDecimal decPdNetDeclareSom) {
		this.decPdNetDeclareSom = decPdNetDeclareSom;
	}

	public Integer getDecPdRestantSom() {
		return decPdRestantSom;
	}

	public void setDecPdRestantSom(Integer decPdRestantSom) {
		this.decPdRestantSom = decPdRestantSom;
	}

	public String getDecPrecSen() {
		return decPrecSen;
	}

	public void setDecPrecSen(String decPrecSen) {
		this.decPrecSen = decPrecSen;
	}

	public String getDecPrecUemoa() {
		return decPrecUemoa;
	}

	public void setDecPrecUemoa(String decPrecUemoa) {
		this.decPrecUemoa = decPrecUemoa;
	}

	public java.math.BigDecimal getDecQteComplementaire() {
		return decQteComplementaire;
	}

	public void setDecQteComplementaire(
			java.math.BigDecimal decQteComplementaire) {
		this.decQteComplementaire = decQteComplementaire;
	}

	public java.math.BigDecimal getDecQteMercResiduelle() {
		return decQteMercResiduelle;
	}

	public void setDecQteMercResiduelle(
			java.math.BigDecimal decQteMercResiduelle) {
		this.decQteMercResiduelle = decQteMercResiduelle;
	}

	public java.math.BigDecimal getDecQteRdSommier() {
		return decQteRdSommier;
	}

	public void setDecQteRdSommier(java.math.BigDecimal decQteRdSommier) {
		this.decQteRdSommier = decQteRdSommier;
	}

	public java.math.BigDecimal getDecQteCompConstate() {
		return decQteCompConstate;
	}

	public void setDecQteCompConstate(java.math.BigDecimal decQteCompConstate) {
		this.decQteCompConstate = decQteCompConstate;
	}

	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}

	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}

	public String getDecRegDouanier() {
		return decRegDouanier;
	}

	public void setDecRegDouanier(String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	public String getDecRegFiscal() {
		return decRegFiscal;
	}

	public void setDecRegFiscal(String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecUniteComplementaire() {
		return decUniteComplementaire;
	}

	public void setDecUniteComplementaire(String decUniteComplementaire) {
		this.decUniteComplementaire = decUniteComplementaire;
	}

	public String getDecUniteMercuriale() {
		return decUniteMercuriale;
	}

	public void setDecUniteMercuriale(String decUniteMercuriale) {
		this.decUniteMercuriale = decUniteMercuriale;
	}

	public String getDecUserContSommier() {
		return decUserContSommier;
	}

	public void setDecUserContSommier(String decUserContSommier) {
		this.decUserContSommier = decUserContSommier;
	}

	public java.math.BigDecimal getDecValeurCaf() {
		return decValeurCaf;
	}

	public void setDecValeurCaf(java.math.BigDecimal decValeurCaf) {
		this.decValeurCaf = decValeurCaf;
	}

	public java.math.BigDecimal getDecValCafconstate() {
		return decValCafconstate;
	}

	public void setDecValCafconstate(java.math.BigDecimal decValCafconstate) {
		this.decValCafconstate = decValCafconstate;
	}

	public java.math.BigDecimal getDecValResiduel() {
		return decValResiduel;
	}

	public void setDecValResiduel(java.math.BigDecimal decValResiduel) {
		this.decValResiduel = decValResiduel;
	}

	public ArticleDlpp getArticleDlpp() {
		return articleDlpp;
	}

	public void setArticleDlpp(ArticleDlpp articleDlpp) {
		this.articleDlpp = articleDlpp;
	}

	public List<CessionSommierDlpp> getCessionSommiersDlpp() {
		return cessionSommiersDlpp;
	}

	public void setCessionSommiersDlpp(
			List<CessionSommierDlpp> cessionSommiersDlpp) {
		this.cessionSommiersDlpp = cessionSommiersDlpp;
	}

	public List<ApurementSommierDlpp> getApurementSommiersDlpp() {
		return apurementSommiersDlpp;
	}

	public void setApurementSommiersDlpp(
			List<ApurementSommierDlpp> apurementSommiersDlpp) {
		this.apurementSommiersDlpp = apurementSommiersDlpp;
	}

}