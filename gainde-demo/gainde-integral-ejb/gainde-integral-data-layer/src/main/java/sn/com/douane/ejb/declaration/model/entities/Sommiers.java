package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.SommiersKey;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.Regime;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;
import sn.com.douane.utils.ConstManif;

/**
 * @author: issam Bean implementation class for Enterprise Bean: Sommiers
 */

@Entity
@Table(name = "SOMMIERS")
@IdClass(SommiersKey.class)
@NamedQuery(name = "Sommiers.findByIdDlpp" , query = "select object(o) from Sommiers o where o.decAnneeEnregDec = ?1 and o.decBurEnregDec = ?2 and o.decNumDeclaration = ?3")
public class Sommiers implements Serializable {

	private static final long serialVersionUID = 3924158698571768069L;
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
	@Column(name = "DECIDSOMMIER", columnDefinition="DECIMAL(18,0)")
	private BigDecimal decIdSommier;
	@Column(name = "DECMUTATIONAT", length = 1)
	private String decMutationAt;
	@Column(name = "DECNBRECOLISCONSSOM")
	private Integer decNbreColisConsSom;
	@Column(name = "DECNBRECOLISAPSOM", columnDefinition="DECIMAL(6,0)")
	private BigDecimal decNbreColisApSom;
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
	@Column(name = "DECPDAPUREMTSOM", columnDefinition="DECIMAL(9,0)")
	private BigDecimal decPdaPureMtSom;
	@Column(name = "DECPDNETCONSSOM")
	private Integer decPdNetConsSom;
	@Column(name = "DECPDNETDECLARESOM", columnDefinition="DECIMAL(13,0)")
	private BigDecimal decPdNetDeclareSom;
	@Column(name = "DECPDRESTANTSOM")
	private Integer decPdRestantSom;
	@Column(name = "DECPRECSEN", length = 2, nullable = false)
	private String decPrecSen;
	@Column(name = "DECPRECUEMOA", length = 2, nullable = false)
	private String decPrecUemoa;
	@Column(name = "DECQTECOMPLEMENTAIRE", columnDefinition="DECIMAL(10,0)")
	private BigDecimal decQteComplementaire;
	@Column(name = "DECQTEMERCRESIDUELLE", columnDefinition="DECIMAL(6,0)")
	private BigDecimal decQteMercResiduelle;
	@Column(name = "DECQTERDSOMMIER", columnDefinition="DECIMAL(10,0)")
	private BigDecimal decQteRdSommier;
	@Column(name = "DECQTECOMPCONSTATE", columnDefinition="DECIMAL(10,0)")
	private BigDecimal decQteCompConstate;
	@Column(name = "DECQTEMERCURIALE", columnDefinition="DECIMAL(11,0)")
	private BigDecimal decQteMercuriale;
	@Column(name = "DECREGDOUANIER", length = 1, nullable = false)
	private String decRegDouanier;
	@Column(name = "DECREGFISCAL", length = 2, nullable = false)
	private String decRegFiscal;
	@Column(name = "DECTYPEREGIME", length = 2, nullable = false)
	private String decTypeRegime;
	@Column(name = "DECUNITECOMPLEMENTAIRE", length = 2)
	private String decUniteComplementaire;
	@Column(name = "DECUNITEMERCURIALE", length = 2)
	private String decUniteMercuriale;
	@Column(name = "DECUSERCONTSOMMIER", length = 8)
	private String decUserContSommier;
	@Column(name = "DECVALEURCAF", columnDefinition="DECIMAL(13,0)")
	private BigDecimal decValeurCaf;
	@Column(name = "DECVALCAFCONSTATE", columnDefinition="DECIMAL(13,0)")
	private BigDecimal decValCafConstate;
	@Column(name = "DECVALRESIDUEL", columnDefinition="DECIMAL(13,0)")
	private BigDecimal decValResiduel;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;
	
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECPRECSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false,nullable = false) })
	private Produit produit;

	@ManyToOne(targetEntity = Agree.class)
	@JoinColumn(name = "DECCODEAGREE", insertable = false, updatable = false,nullable = false)
	private Agree agree;
	
	@ManyToOne(targetEntity = Creditaire.class)
	@JoinColumn(name = "DECCODECREDITAIRE", insertable = false, updatable = false,nullable = false)
	private Creditaire creditaire;
	
	@ManyToOne(targetEntity = RegimeEconomique.class)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEREGECO", referencedColumnName = "RCANNEEREGECO", insertable = false, updatable = false),
			@JoinColumn(name = "DECNUMREGECO", referencedColumnName = "RCNUMREGECO", insertable = false, updatable = false) })
	private RegimeEconomique regimeEconomique;
	
	@ManyToOne(targetEntity = Regime.class)
	@JoinColumns({
			@JoinColumn(name = "DECTYPEREGIME", referencedColumnName = "RCTYPEREGIME", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECREGDOUANIER", referencedColumnName = "RCCODEREGIMEDOUANIER", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECREGFISCAL", referencedColumnName = "RCCODEREGIMEFISCAL", insertable = false, updatable = false,nullable = false) })
	private Regime regime;
	

	 @OneToMany(mappedBy = "sommApurSom" , targetEntity = ApurementSommier.class)
	 private List<ApurementSommier> apurementSommier;
	
	 @OneToMany(mappedBy = "somCesSom" , targetEntity = CessionSommier.class)
	 private List<CessionSommier> cessionSommier;
	
	 @OneToMany(mappedBy = "sommLiqSomm" , targetEntity = LiquidationSommier.class)
	 private List<LiquidationSommier> liquidationSommier;
	
	 @OneToMany(mappedBy = "somProroSomm", targetEntity = ProrogationSom.class)
	 private List<ProrogationSom> prorogationSom;
	 
//	 @OneToOne(mappedBy = "somhistsom" , targetEntity = HistoriqueSommier.class)
//	 private HistoriqueSommier historiqueSommier;
//	 
	 @Transient
	 private String decCodeProduit;

	 @Transient
	 private String decNumeroSommier;
	 
	 @Transient 
	 private String decPpmDestinataire;
	 
	public Sommiers(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decCodeAgree, String decCodeCreditaire,
			String decPpmDeclarant, String decNumProd,
			java.sql.Date decDateSommier, String decPaysOrigine,
			String decPrecSen, String decPrecUemoa, String decRegDouanier,
			String decRegFiscal, String decTypeRegime) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDec;
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

	public Sommiers() {
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

	public void setDecNumArtDecl(Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
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

	public BigDecimal getDecIdSommier() {
		return decIdSommier;
	}

	public void setDecIdSommier(BigDecimal decIdSommier) {
		this.decIdSommier = decIdSommier;
	}

	public String getDecMutationAt() {
		return decMutationAt;
	}

	public void setDecMutationAt(String decMutationAt) {
		this.decMutationAt = decMutationAt;
	}

	public Integer getDecNbreColisConsSom() {
		return decNbreColisConsSom;
	}

	public void setDecNbreColisConsSom(Integer decNbreColisConsSom) {
		this.decNbreColisConsSom = decNbreColisConsSom;
	}

	public BigDecimal getDecNbreColisApSom() {
		return decNbreColisApSom;
	}

	public void setDecNbreColisApSom(BigDecimal decNbreColisApSom) {
		this.decNbreColisApSom = decNbreColisApSom;
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

	public BigDecimal getDecPdaPureMtSom() {
		return decPdaPureMtSom;
	}

	public void setDecPdaPureMtSom(BigDecimal decPdaPureMtSom) {
		this.decPdaPureMtSom = decPdaPureMtSom;
	}

	public Integer getDecPdNetConsSom() {
		return decPdNetConsSom;
	}

	public void setDecPdNetConsSom(Integer decPdNetConsSom) {
		this.decPdNetConsSom = decPdNetConsSom;
	}

	public BigDecimal getDecPdNetDeclareSom() {
		return decPdNetDeclareSom;
	}

	public void setDecPdNetDeclareSom(BigDecimal decPdNetDeclareSom) {
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

	public BigDecimal getDecQteComplementaire() {
		return decQteComplementaire;
	}

	public void setDecQteComplementaire(BigDecimal decQteComplementaire) {
		this.decQteComplementaire = decQteComplementaire;
	}

	public BigDecimal getDecQteMercResiduelle() {
		return decQteMercResiduelle;
	}

	public void setDecQteMercResiduelle(BigDecimal decQteMercResiduelle) {
		this.decQteMercResiduelle = decQteMercResiduelle;
	}

	public BigDecimal getDecQteRdSommier() {
		return decQteRdSommier;
	}

	public void setDecQteRdSommier(BigDecimal decQteRdSommier) {
		this.decQteRdSommier = decQteRdSommier;
	}

	public BigDecimal getDecQteCompConstate() {
		return decQteCompConstate;
	}

	public void setDecQteCompConstate(BigDecimal decQteCompConstate) {
		this.decQteCompConstate = decQteCompConstate;
	}

	public BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}

	public void setDecQteMercuriale(BigDecimal decQteMercuriale) {
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

	public BigDecimal getDecValeurCaf() {
		return decValeurCaf;
	}

	public void setDecValeurCaf(BigDecimal decValeurCaf) {
		this.decValeurCaf = decValeurCaf;
	}

	public BigDecimal getDecValCafConstate() {
		return decValCafConstate;
	}

	public void setDecValCafConstate(BigDecimal decValCafConstate) {
		this.decValCafConstate = decValCafConstate;
	}

	public BigDecimal getDecValResiduel() {
		return decValResiduel;
	}

	public void setDecValResiduel(BigDecimal decValResiduel) {
		this.decValResiduel = decValResiduel;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public RegimeEconomique getRegimeEconomique() {
		return regimeEconomique;
	}

	public void setRegimeEconomique(RegimeEconomique regimeEconomique) {
		this.regimeEconomique = regimeEconomique;
	}

	public Creditaire getCreditaire() {
		return creditaire;
	}

	public void setCreditaire(Creditaire creditaire) {
		this.creditaire = creditaire;
	}

	public Agree getAgree() {
		return agree;
	}

	public void setAgree(Agree agree) {
		this.agree = agree;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public List<ApurementSommier> getApurementSommier() {
		return apurementSommier;
	}

	public void setApurementSommier(List<ApurementSommier> apurementSommier) {
		this.apurementSommier = apurementSommier;
	}

	public List<CessionSommier> getCessionSommier() {
		return cessionSommier;
	}

	public void setCessionSommier(List<CessionSommier> cessionSommier) {
		this.cessionSommier = cessionSommier;
	}

	public List<LiquidationSommier> getLiquidationSommier() {
		return liquidationSommier;
	}

	public void setLiquidationSommier(List<LiquidationSommier> liquidationSommier) {
		this.liquidationSommier = liquidationSommier;
	}

	public List<ProrogationSom> getProrogationSom() {
		return prorogationSom;
	}

	public void setProrogationSom(List<ProrogationSom> prorogationSom) {
		this.prorogationSom = prorogationSom;
	}

	public String getDecNumeroSommier() {
		
		if(decNumArtDecl == null){
			decNumeroSommier = decAnneeEnregDec + ConstManif.SPACE + decBurEnregDec
					+ ConstManif.SPACE + decNumDeclaration ;
		}else{
				decNumeroSommier = decAnneeEnregDec + ConstManif.SPACE + decBurEnregDec
				+ ConstManif.SPACE + decNumDeclaration+ ConstManif.SPACE	+ decNumArtDecl;
		}
		return decNumeroSommier;
	}

	public void setDecNumeroSommier(String decNumeroSommier) {
		this.decNumeroSommier = decNumeroSommier;
	}
	
	public String getDecCodeProduit() {
		this.decCodeProduit = decNumProd + ConstManif.SPACE + decPrecUemoa + ConstManif.SPACE
				+ decPrecSen; 
		return decCodeProduit;
	}

	public void setDecCodeProduit(String decCodeProduit) {
		this.decCodeProduit = decCodeProduit;
	}

//	public HistoriqueSommier getHistoriqueSommier() {
//		return historiqueSommier;
//	}
//
//	public void setHistoriqueSommier(HistoriqueSommier historiqueSommier) {
//		this.historiqueSommier = historiqueSommier;
//	}

	public String getDecPpmDestinataire() {
		return decPpmDestinataire;
	}

	public void setDecPpmDestinataire(String decPpmDestinataire) {
		this.decPpmDestinataire = decPpmDestinataire;
	}
	


}
