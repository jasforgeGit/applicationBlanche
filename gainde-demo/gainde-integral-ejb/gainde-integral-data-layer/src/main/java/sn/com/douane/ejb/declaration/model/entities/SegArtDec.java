package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SegArtDecKey;
import sn.com.douane.ejb.rc.model.entities.BureauFranchise;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.ejb.rc.model.entities.ModeConditionnement;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Produit;

/**
 * @author: issam Bean implementation class for Enterprise Bean: Segartdec
 */

@Entity
@IdClass(SegArtDecKey.class)
@Table(name = "SEGARTDEC")
public class SegArtDec implements Serializable {

	private static final long serialVersionUID = 6176761313652094786L;

	@Id
	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;
	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	
	@Column(name = "DECCODEPROD", length = 6, nullable = false)
	private String decCodeProd;
	
	@Column(name = "DECPRECUEMOA", length = 2, nullable = false)
	private String decPrecuemoa;
	
	@Column(name = "DECPRECSEN", length = 2, nullable = false)
	private String decPrecSen;
	
	@Column(name = "DECNUMARTMANIF", length = 4)
	private Integer decNumArtManif;
	
	@Column(name = "DECREGFISCAL", nullable = false)
	private String decRegFiscal;
	
	@Column(name = "DECNBRECOLISDECL", nullable = false)
	private Integer decNbreColisDecl;
	
	@Column(name = "DECPOIDSBRUTDEC", columnDefinition = "DECIMAL(9 , 0)", nullable = false)
	private BigDecimal decPoidsBrutDec;
	
	@Column(name = "DECPDNETDEC", columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decPdNetDec;
	
	@Column(name = "DECQTECOMPLEMENT", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteComplement;
	
	@Column(name = "DECQTEMERC", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteMerc;
	
	@Column(name = "DECNBRECHEVAUX")
	private Integer decNbreChevaux;
	
	@Column(name = "DECMODECOND", length = 4, nullable = false)
	private String decModeCond;
	
	@Column(name = "DECPAYSORIGINE", length = 3)
	private String decPaysOrigine;
	
	@Column(name = "DECVALDEVFACTURE", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValDevFacture;
	
	@Column(name = "DECCODEDEVFACTURE", length = 3)
	private String decCodeDevFacture;
	
	@Column(name = "DECMTFACTURE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtFacture;
	
	@Column(name = "DECVALDEVFOB", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValDevFob;
	
	@Column(name = "DECCODEDEVFOB", length = 3)
	private String decCodeDevFob;
	
	@Column(name = "DECMTCFAFOB", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtCfaFob;
	
	@Column(name = "DECVALDEVFRET", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValDevFret;
	
	@Column(name = "DECDEVISEFRET", length = 3)
	private String decDeviseFret;
	
	@Column(name = "DECMTCFAFRET", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtCfaFret;
	
	@Column(name = "DECVALDEV", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValDev;
	
	@Column(name = "DECDEVISEASSUR", length = 3)
	private String decDeviseAssur;
	
	@Column(name = "DECVALCFAASSUR", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValCfaAssur;
	
	@Column(name = "DECVALDEVAUTRESELT", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValDevAutresElt;
	
	@Column(name = "DECDEVAUTRESELT", length = 3)
	private String decDevAutresElt;
	
	@Column(name = "DECMTCFAAUTRESELT", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtCfaAutresElt;
	
	@Column(name = "DECPAYSFACTURATION", length = 3)
	private String decPaysFacturation;
	
	@Column(name = "DECPAYSFOB", length = 3)
	private String decPaysFob;
	
	@Column(name = "DECPAYSASSUR", length = 3)
	private String decPaysAssur;
	
	@Column(name = "DECPAYSFRET", length = 3)
	private String decPaysFret;
	
	@Column(name = "DECPAYSAUTRESELT", length = 3)
	private String decPaysAutresElt;
	
	@Column(name = "DECVALCAF", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValCaf;
	
	@Column(name = "DECVALMERC", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValMerc;
	
	@Column(name = "DECVALDOUANE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValDouane;
	
	@Column(name = "DECMTLIQUIDART", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtLiquidArt;
	
	@Column(name = "DECANNEESGSDPI", length = 4)
	private String decAnneeSgsDpi;
	
	@Column(name = "DECSGSDPICODEBQUE", length = 30)
	private String decSgsDpiCodeBque;
	
	@Column(name = "DECNUMSGSDPI", length = 7)
	private String decNumSgsDpi;
	
	@Column(name = "DECANNEEAVSGS", length = 4)
	private String decAnneeAvSgs;
	
	@Column(name = "DECNUMAVSGS", length = 6)
	private String decNumAvSgs;
	
	@Column(name = "DECSGSEXEMPTION", length = 10)
	private String decSgsExemption;
	
	@Column(name = "DECTYPEMANIF", length = 1)
	private String decTypeManif;
	
	@Column(name = "DECANNEEENREGMANIF", length = 4)
	private String decAnneeEnregManif;
	
	@Column(name = "DECBURENREGMANIF", length = 3)
	private String decBurEnregManif;
	
	@Column(name = "DECNUMENREGMANIF")
	private Integer decNumEnregManif;
	
	@Column(name = "DECPRECARTMANIF")
	private Integer decPrecArtManif;
	
	@Column(name = "DECPREC2ARTMANIF")
	private Integer decPrec2ArtManif;
	
	@Column(name = "DECMARQCOLIS")
	private String decMarqColis;
	
	@Column(name = "DECDESCOMMERCIALE")
	private String decDesCommerciale;
	
	@Column(name = "DECANNEETITPRECARR", length = 4)
	private String decAnneeTitprecarr;
	
	@Column(name = "DECBURAPURDECL", length = 3)
	private String decBuraPurDecl;
	
	@Column(name = "DECNUMDECLAPURANT")
	private Integer decNumDeclapurant;
	
	@Column(name = "DECNUMARTDECAPURANTE")
	private Integer decNumArtDecapurante;
	
	@Column(name = "DECCODELIEUSTOKAGE", length = 3)
	private String decCodeLieuStokage;
	
	@Column(name = "DECANNEEDEPPROV", length = 4)
	private String decAnneeDepProv;
	
	@Column(name = "DECBURDEPPROV", length = 3)
	private String decBurDepProv;
	
	@Column(name = "DECNUMDEPPROV")
	private Integer decNumDepProv;
	
	@Column(name = "DECANNEEAUTADM", length = 4)
	private String decAnneeAutAdm;
	
	@Column(name = "DECNUMAUTORISATION", length = 6)
	private String decNumAutorisation;
	
	@Column(name = "DECPPMUSERFINAL", length = 5)
	private String decPpmuserFinal;
	
	@Column(name = "DECCATPRODUEMOA", length = 2)
	private String decCatProduemoa;
	
	@Column(name = "DECAGMTENTUEMOA", length = 4)
	private String decAgmtEntuemoa;
	
	@Column(name = "DECBUREXPORT", length = 4)
	private String decBurExport;
	
	@Column(name = "DECREGDOCEXPORT", length = 4)
	private String decRegDocExport;
	
	@Column(name = "DECBURMISECONS", length = 4)
	private String decBurMiseCons;
	
	@Column(name = "DECPAYSMISECONS", length = 3)
	private String decPaysMiseCons;
	
	@Column(name = "DECPAYSDEST", length = 3)
	private String decPaysDest;
	
	@Column(name = "DECNUMDOCEXPORT", length = 7)
	private String decNumDocExport;
	
	@Column(name = "DECNUMDECMISECONS", length = 7)
	private String decNumDecMiseCons;
	
	@Column(name = "DECDATEDOCEXPORT")
	private java.sql.Date decDateDocExport;
	
	@Column(name = "DECDATEMISECONS")
	private java.sql.Date decDateMiseCons;
	
	@Column(name = "DECTYPECONV", length = 1)
	private String decTypeConv;
	
	@Column(name = "DECANNEECONV", length = 4)
	private String decAnneeConv;
	
	@Column(name = "DECNUMCONV", length = 6)
	private String decNumConv;
	
	@Column(name = "DECNBRECOLIS", columnDefinition = "DECIMAL(6 , 0)")
	private BigDecimal decNbreColis;
	
	@Column(name = "DECNBRECOLISENLEVES", columnDefinition = "DECIMAL(6 , 0)")
	private BigDecimal decNbreColisEnleves;
	
	@Column(name = "DECPDBRUTENLARTDECL", columnDefinition = "DECIMAL(9 , 0)")
	private BigDecimal decPdBrutEnlartDecl;
	
	@Column(name = "DECCODESOUMFACT", length = 1)
	private String decCodeSoumFact;
	
	@Column(name = "DECSOUMORIGINE", length = 1)
	private String decSoumOrigine;
	
	@Column(name = "DECCODEEXCLUTRANSIT", length = 1)
	private String decCodeExcluTransit;
	
	@Column(name = "DECCODEPRODCRU", length = 1)
	private String decCodeProdCru;
	
	@Column(name = "DECUNITECOMPLEMENT", length = 2)
	private String decUniteComplement;
	
	@Column(name = "DECUNITEMERCURIALE", length = 2)
	private String decUniteMercuriale;
	
	@Column(name = "DECTYPEMERCURIALE", length = 1)
	private String decTypeMercuriale;
	
	@Column(name = "DECVALMERCURIALE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValMercuriale;
	
	@Column(name = "DECUNITEREGECO", length = 2)
	private String decUniteRegEco;
	
	@Column(name = "DECQTEREGECO", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteRegEco;
	
	@Column(name = "DECTOPMODIFICATION", length = 1)
	private String decTopModification;
	
	@Column(name = "DECAUTOMODIF", length = 1)
	private String decAutoModif;
	
	@Column(name = "DECNUMRECTIFVISITE")
	private Integer decNumRectifVisite;
	
	@Column(name = "DECETATRECTIF", length = 2)
	private String decEtatRectif;
	
	@Column(name = "DECANNEEEXONERATION", length = 4)
	private String decAnneeExoneration;
	
	@Column(name = "DECPIECEFRANCHISE", length = 2)
	private String decPieceFranchise;
	
	@Column(name = "DECNUMEXONERATION", length = 5)
	private String decNumExoneration;
	
	@Column(name = "DECTXTBREDOUPREC")
	private Integer decTxtBreDouPrec;
	
	@Column(name = "DECNUMTITRETRANS", length = 12)
	private String decNumTitreTrans;
	
	@Column(name = "DECINDICATEURSH", length = 1)
	private String decIndicateurSh;
	
	@Column(name = "DECQTEARTCONSTATEE", columnDefinition = "DECIMAL(18 , 0)")
	private BigDecimal decQteArtConstatee;
	
	@Column(name = "DECTYPETRAITEMENT", length = 1)
	private String decTypeTraitement;
	
	@Column(name = "DECDOSSIERTPS", length = 10)
	private String decDossierTps;
	
	@Column(name = "DECBUREXONERATION", length = 3)
	private String decBurExoneration;
	
	@Column(name = "DECNUMARTDEPOT")
	private Integer decNumArtDepot;
	
	@Column(name = "DECAGREEENTCEDEAO", length = 4)
	private String decAgreeEntCedeao;

	@Column(name = "DECOUVRAISON", columnDefinition = "CHAR(1)")
	private String decouvraison;

	@ManyToOne(targetEntity = SegGenDec.class, fetch=FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false) })
	private SegGenDec segGenDec;

	@ManyToOne(targetEntity = Devises.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECDEVISEASSUR", insertable = false, updatable = false)
	private Devises devisesAssur;

	@ManyToOne(targetEntity = Produit.class, fetch=FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECCODEPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECPRECSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false, nullable = false) })
	private Produit produit;

	@ManyToOne(targetEntity = Pays.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECPAYSORIGINE", insertable = false, updatable = false)
	private Pays paysOrigine;

	@ManyToOne(targetEntity = Pays.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECPAYSASSUR", insertable = false, updatable = false)
	private Pays paysAssur;

	@ManyToOne(targetEntity = Pays.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECPAYSFACTURATION", insertable = false, updatable = false)
	private Pays paysFacturation;

	@ManyToOne(targetEntity = Pays.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECPAYSFRET", insertable = false, updatable = false)
	private Pays paysFret;

	@ManyToOne(targetEntity = ModeConditionnement.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECMODECOND", insertable = false, updatable = false, nullable = false)
	private ModeConditionnement modeCondionnement;

	@ManyToOne(targetEntity = BureauFranchise.class, fetch=FetchType.LAZY)
	@JoinColumn(name = "DECBUREXONERATION", insertable = false, updatable = false)
	private BureauFranchise bureauFranchise;

	@OneToMany(mappedBy = "segArtDec", targetEntity = Sommiers.class, fetch=FetchType.LAZY)
	private List<Sommiers> sommiers;

	@OneToMany(mappedBy = "segArtDec", targetEntity = ArtDecPjt.class, fetch=FetchType.LAZY)
	private List<ArtDecPjt> artDecPjt;

	@OneToMany(mappedBy = "segArtDec", targetEntity = ArtDecSoumDoc.class, fetch=FetchType.LAZY)
	private List<ArtDecSoumDoc> artDecSoumDoc;

	@OneToMany(mappedBy = "segArtDec", targetEntity = DdeRectifArtDecl.class, fetch=FetchType.LAZY)
	private List<DdeRectifArtDecl> ddeRectifArtDecl;

	@OneToMany(mappedBy = "segArtDec", targetEntity = DecSoumVisit.class, fetch=FetchType.LAZY)
	private List<DecSoumVisit> decSoumVisit;

	@OneToMany(mappedBy = "segArtDec", targetEntity = DispensesArtDec.class, fetch=FetchType.LAZY)
	private List<DispensesArtDec> dispensesArtDec;

	@OneToMany(mappedBy = "segArtDec", targetEntity = LiquidArtDecl.class, fetch=FetchType.LAZY)
	private List<LiquidArtDecl> liquidArtDecl;

	@OneToMany(mappedBy = "segArtDec", targetEntity = SegContDec.class, fetch=FetchType.LAZY)
	private List<SegContDec> segContDec;

	@OneToMany(mappedBy = "segArtDec", targetEntity = RegularisationManif.class, fetch=FetchType.LAZY)
	private List<RegularisationManif> regularisationManif;

	@OneToMany(mappedBy = "segArtDec", targetEntity = RegularisationValeur.class, fetch=FetchType.LAZY)
	private List<RegularisationValeur> regularisationValeur;

	@OneToMany(mappedBy = "segArtDec", targetEntity = SoumissDeclaration.class, fetch=FetchType.LAZY)
	private List<SoumissDeclaration> soumissDeclaration;

	public SegArtDec() {
	}

	public SegArtDec(Integer decNumArtDec, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			String decCodeProd, String decPrecuemoa, String decPrecSen,
			String decRegFiscal, Integer decNbreColisDecl,
			BigDecimal decPoidsBrutDec, BigDecimal decPdNetDec,
			String decModeCond) {

		this.decNumArtDec = decNumArtDec;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decCodeProd = decCodeProd;
		this.decPrecuemoa = decPrecuemoa;
		this.decPrecSen = decPrecSen;
		this.decRegFiscal = decRegFiscal;
		this.decNbreColisDecl = decNbreColisDecl;
		this.decPoidsBrutDec = decPoidsBrutDec;
		this.decPdNetDec = decPdNetDec;
		this.decModeCond = decModeCond;

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

	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	public String getDecCodeProd() {
		return decCodeProd;
	}

	public void setDecCodeProd(String decCodeProd) {
		this.decCodeProd = decCodeProd;
	}

	public String getDecPrecuemoa() {
		return decPrecuemoa;
	}

	public void setDecPrecuemoa(String decPrecuemoa) {
		this.decPrecuemoa = decPrecuemoa;
	}

	public String getDecPrecSen() {
		return decPrecSen;
	}

	public void setDecPrecSen(String decPrecSen) {
		this.decPrecSen = decPrecSen;
	}

	public Integer getDecNumArtManif() {
		return decNumArtManif;
	}

	public void setDecNumArtManif(Integer decNumArtManif) {
		this.decNumArtManif = decNumArtManif;
	}

	public String getDecRegFiscal() {
		return decRegFiscal;
	}

	public void setDecRegFiscal(String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}

	public Integer getDecNbreColisDecl() {
		return decNbreColisDecl;
	}

	public void setDecNbreColisDecl(Integer decNbreColisDecl) {
		this.decNbreColisDecl = decNbreColisDecl;
	}

	public BigDecimal getDecPoidsBrutDec() {
		return decPoidsBrutDec;
	}

	public void setDecPoidsBrutDec(BigDecimal decPoidsBrutDec) {
		this.decPoidsBrutDec = decPoidsBrutDec;
	}

	public BigDecimal getDecPdNetDec() {
		return decPdNetDec;
	}

	public void setDecPdNetDec(BigDecimal decPdNetDec) {
		this.decPdNetDec = decPdNetDec;
	}

	public BigDecimal getDecQteComplement() {
		return decQteComplement;
	}

	public void setDecQteComplement(BigDecimal decQteComplement) {
		this.decQteComplement = decQteComplement;
	}

	public BigDecimal getDecQteMerc() {
		return decQteMerc;
	}

	public void setDecQteMerc(BigDecimal decQteMerc) {
		this.decQteMerc = decQteMerc;
	}

	public Integer getDecNbreChevaux() {
		return decNbreChevaux;
	}

	public void setDecNbreChevaux(Integer decNbreChevaux) {
		this.decNbreChevaux = decNbreChevaux;
	}

	public String getDecModeCond() {
		return decModeCond;
	}

	public void setDecModeCond(String decModeCond) {
		this.decModeCond = decModeCond;
	}

	public String getDecPaysOrigine() {
		return decPaysOrigine;
	}

	public void setDecPaysOrigine(String decPaysOrigine) {
		this.decPaysOrigine = decPaysOrigine;
	}

	public String getDecCodeDevFacture() {
		return decCodeDevFacture;
	}

	public void setDecCodeDevFacture(String decCodeDevFacture) {
		this.decCodeDevFacture = decCodeDevFacture;
	}

	public BigDecimal getDecMtFacture() {
		return decMtFacture;
	}

	public void setDecMtFacture(BigDecimal decMtFacture) {
		this.decMtFacture = decMtFacture;
	}

	public BigDecimal getDecValDevFob() {
		return decValDevFob;
	}

	public void setDecValDevFob(BigDecimal decValDevFob) {
		this.decValDevFob = decValDevFob;
	}

	public String getDecCodeDevFob() {
		return decCodeDevFob;
	}

	public void setDecCodeDevFob(String decCodeDevFob) {
		this.decCodeDevFob = decCodeDevFob;
	}

	public BigDecimal getDecMtCfaFob() {
		return decMtCfaFob;
	}

	public void setDecMtCfaFob(BigDecimal decMtCfaFob) {
		this.decMtCfaFob = decMtCfaFob;
	}

	public BigDecimal getDecValDevFret() {
		return decValDevFret;
	}

	public void setDecValDevFret(BigDecimal decValDevFret) {
		this.decValDevFret = decValDevFret;
	}

	public String getDecDeviseFret() {
		return decDeviseFret;
	}

	public void setDecDeviseFret(String decDeviseFret) {
		this.decDeviseFret = decDeviseFret;
	}

	public BigDecimal getDecMtCfaFret() {
		return decMtCfaFret;
	}

	public void setDecMtCfaFret(BigDecimal decMtCfaFret) {
		this.decMtCfaFret = decMtCfaFret;
	}

	public BigDecimal getDecValDev() {
		return decValDev;
	}

	public void setDecValDev(BigDecimal decValDev) {
		this.decValDev = decValDev;
	}

	public String getDecDeviseAssur() {
		return decDeviseAssur;
	}

	public void setDecDeviseAssur(String decDeviseAssur) {
		this.decDeviseAssur = decDeviseAssur;
	}

	public BigDecimal getDecValCfaAssur() {
		return decValCfaAssur;
	}

	public void setDecValCfaAssur(BigDecimal decValCfaAssur) {
		this.decValCfaAssur = decValCfaAssur;
	}

	public BigDecimal getDecValDevAutresElt() {
		return decValDevAutresElt;
	}

	public void setDecValDevAutresElt(BigDecimal decValDevAutresElt) {
		this.decValDevAutresElt = decValDevAutresElt;
	}

	public String getDecDevAutresElt() {
		return decDevAutresElt;
	}

	public void setDecDevAutresElt(String decDevAutresElt) {
		this.decDevAutresElt = decDevAutresElt;
	}

	public BigDecimal getDecMtCfaAutresElt() {
		return decMtCfaAutresElt;
	}

	public void setDecMtCfaAutresElt(BigDecimal decMtCfaAutresElt) {
		this.decMtCfaAutresElt = decMtCfaAutresElt;
	}

	public String getDecPaysFacturation() {
		return decPaysFacturation;
	}

	public void setDecPaysFacturation(String decPaysFacturation) {
		this.decPaysFacturation = decPaysFacturation;
	}

	public String getDecPaysFob() {
		return decPaysFob;
	}

	public void setDecPaysFob(String decPaysFob) {
		this.decPaysFob = decPaysFob;
	}

	public String getDecPaysAssur() {
		return decPaysAssur;
	}

	public void setDecPaysAssur(String decPaysAssur) {
		this.decPaysAssur = decPaysAssur;
	}

	public String getDecPaysFret() {
		return decPaysFret;
	}

	public void setDecPaysFret(String decPaysFret) {
		this.decPaysFret = decPaysFret;
	}

	public String getDecPaysAutresElt() {
		return decPaysAutresElt;
	}

	public void setDecPaysAutresElt(String decPaysAutresElt) {
		this.decPaysAutresElt = decPaysAutresElt;
	}

	public BigDecimal getDecValCaf() {
		return decValCaf;
	}

	public void setDecValCaf(BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}

	public BigDecimal getDecValMerc() {
		return decValMerc;
	}

	public void setDecValMerc(BigDecimal decValMerc) {
		this.decValMerc = decValMerc;
	}

	public BigDecimal getDecValDouane() {
		return decValDouane;
	}

	public void setDecValDouane(BigDecimal decValDouane) {
		this.decValDouane = decValDouane;
	}

	public BigDecimal getDecMtLiquidArt() {
		return decMtLiquidArt;
	}

	public void setDecMtLiquidArt(BigDecimal decMtLiquidArt) {
		this.decMtLiquidArt = decMtLiquidArt;
	}

	public String getDecAnneeSgsDpi() {
		return decAnneeSgsDpi;
	}

	public void setDecAnneeSgsDpi(String decAnneeSgsDpi) {
		this.decAnneeSgsDpi = decAnneeSgsDpi;
	}

	public String getDecSgsDpiCodeBque() {
		return decSgsDpiCodeBque;
	}

	public void setDecSgsDpiCodeBque(String decSgsDpiCodeBque) {
		this.decSgsDpiCodeBque = decSgsDpiCodeBque;
	}

	public String getDecNumSgsDpi() {
		return decNumSgsDpi;
	}

	public void setDecNumSgsDpi(String decNumSgsDpi) {
		this.decNumSgsDpi = decNumSgsDpi;
	}

	public String getDecAnneeAvSgs() {
		return decAnneeAvSgs;
	}

	public void setDecAnneeAvSgs(String decAnneeAvSgs) {
		this.decAnneeAvSgs = decAnneeAvSgs;
	}

	public String getDecNumAvSgs() {
		return decNumAvSgs;
	}

	public void setDecNumAvSgs(String decNumAvSgs) {
		this.decNumAvSgs = decNumAvSgs;
	}

	public String getDecSgsExemption() {
		return decSgsExemption;
	}

	public void setDecSgsExemption(String decSgsExemption) {
		this.decSgsExemption = decSgsExemption;
	}

	public String getDecTypeManif() {
		return decTypeManif;
	}

	public void setDecTypeManif(String decTypeManif) {
		this.decTypeManif = decTypeManif;
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

	public Integer getDecPrecArtManif() {
		return decPrecArtManif;
	}

	public void setDecPrecArtManif(Integer decPrecArtManif) {
		this.decPrecArtManif = decPrecArtManif;
	}

	public Integer getDecPrec2ArtManif() {
		return decPrec2ArtManif;
	}

	public void setDecPrec2ArtManif(Integer decPrec2ArtManif) {
		this.decPrec2ArtManif = decPrec2ArtManif;
	}

	public String getDecMarqColis() {
		return decMarqColis;
	}

	public void setDecMarqColis(String decMarqColis) {
		this.decMarqColis = decMarqColis;
	}

	public String getDecDesCommerciale() {
		return decDesCommerciale;
	}

	public void setDecDesCommerciale(String decDesCommerciale) {
		this.decDesCommerciale = decDesCommerciale;
	}

	public String getDecAnneeTitprecarr() {
		return decAnneeTitprecarr;
	}

	public void setDecAnneeTitprecarr(String decAnneeTitprecarr) {
		this.decAnneeTitprecarr = decAnneeTitprecarr;
	}

	public String getDecBuraPurDecl() {
		return decBuraPurDecl;
	}

	public void setDecBuraPurDecl(String decBuraPurDecl) {
		this.decBuraPurDecl = decBuraPurDecl;
	}

	public Integer getDecNumDeclapurant() {
		return decNumDeclapurant;
	}

	public void setDecNumDeclapurant(Integer decNumDeclapurant) {
		this.decNumDeclapurant = decNumDeclapurant;
	}

	public Integer getDecNumArtDecapurante() {
		return decNumArtDecapurante;
	}

	public void setDecNumArtDecapurante(Integer decNumArtDecapurante) {
		this.decNumArtDecapurante = decNumArtDecapurante;
	}

	public String getDecCodeLieuStokage() {
		return decCodeLieuStokage;
	}

	public void setDecCodeLieuStokage(String decCodeLieuStokage) {
		this.decCodeLieuStokage = decCodeLieuStokage;
	}

	public String getDecAnneeDepProv() {
		return decAnneeDepProv;
	}

	public void setDecAnneeDepProv(String decAnneeDepProv) {
		this.decAnneeDepProv = decAnneeDepProv;
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

	public String getDecAnneeAutAdm() {
		return decAnneeAutAdm;
	}

	public void setDecAnneeAutAdm(String decAnneeAutAdm) {
		this.decAnneeAutAdm = decAnneeAutAdm;
	}

	public String getDecNumAutorisation() {
		return decNumAutorisation;
	}

	public void setDecNumAutorisation(String decNumAutorisation) {
		this.decNumAutorisation = decNumAutorisation;
	}

	public String getDecPpmuserFinal() {
		return decPpmuserFinal;
	}

	public void setDecPpmuserFinal(String decPpmuserFinal) {
		this.decPpmuserFinal = decPpmuserFinal;
	}

	public String getDecCatProduemoa() {
		return decCatProduemoa;
	}

	public void setDecCatProduemoa(String decCatProduemoa) {
		this.decCatProduemoa = decCatProduemoa;
	}

	public String getDecAgmtEntuemoa() {
		return decAgmtEntuemoa;
	}

	public void setDecAgmtEntuemoa(String decAgmtEntuemoa) {
		this.decAgmtEntuemoa = decAgmtEntuemoa;
	}

	public String getDecBurExport() {
		return decBurExport;
	}

	public void setDecBurExport(String decBurExport) {
		this.decBurExport = decBurExport;
	}

	public String getDecRegDocExport() {
		return decRegDocExport;
	}

	public void setDecRegDocExport(String decRegDocExport) {
		this.decRegDocExport = decRegDocExport;
	}

	public String getDecBurMiseCons() {
		return decBurMiseCons;
	}

	public void setDecBurMiseCons(String decBurMiseCons) {
		this.decBurMiseCons = decBurMiseCons;
	}

	public String getDecPaysMiseCons() {
		return decPaysMiseCons;
	}

	public void setDecPaysMiseCons(String decPaysMiseCons) {
		this.decPaysMiseCons = decPaysMiseCons;
	}

	public String getDecPaysDest() {
		return decPaysDest;
	}

	public void setDecPaysDest(String decPaysDest) {
		this.decPaysDest = decPaysDest;
	}

	public String getDecNumDocExport() {
		return decNumDocExport;
	}

	public void setDecNumDocExport(String decNumDocExport) {
		this.decNumDocExport = decNumDocExport;
	}

	public String getDecNumDecMiseCons() {
		return decNumDecMiseCons;
	}

	public void setDecNumDecMiseCons(String decNumDecMiseCons) {
		this.decNumDecMiseCons = decNumDecMiseCons;
	}

	public java.sql.Date getDecDateDocExport() {
		return decDateDocExport;
	}

	public void setDecDateDocExport(java.sql.Date decDateDocExport) {
		this.decDateDocExport = decDateDocExport;
	}

	public java.sql.Date getDecDateMiseCons() {
		return decDateMiseCons;
	}

	public void setDecDateMiseCons(java.sql.Date decDateMiseCons) {
		this.decDateMiseCons = decDateMiseCons;
	}

	public String getDecTypeConv() {
		return decTypeConv;
	}

	public void setDecTypeConv(String decTypeConv) {
		this.decTypeConv = decTypeConv;
	}

	public String getDecAnneeConv() {
		return decAnneeConv;
	}

	public void setDecAnneeConv(String decAnneeConv) {
		this.decAnneeConv = decAnneeConv;
	}

	public String getDecNumConv() {
		return decNumConv;
	}

	public void setDecNumConv(String decNumConv) {
		this.decNumConv = decNumConv;
	}

	public BigDecimal getDecNbreColis() {
		return decNbreColis;
	}

	public void setDecNbreColis(BigDecimal decNbreColis) {
		this.decNbreColis = decNbreColis;
	}

	public BigDecimal getDecNbreColisEnleves() {
		return decNbreColisEnleves;
	}

	public void setDecNbreColisEnleves(BigDecimal decNbreColisEnleves) {
		this.decNbreColisEnleves = decNbreColisEnleves;
	}

	public BigDecimal getDecPdBrutEnlartDecl() {
		return decPdBrutEnlartDecl;
	}

	public void setDecPdBrutEnlartDecl(BigDecimal decPdBrutEnlartDecl) {
		this.decPdBrutEnlartDecl = decPdBrutEnlartDecl;
	}

	public String getDecCodeSoumFact() {
		return decCodeSoumFact;
	}

	public void setDecCodeSoumFact(String decCodeSoumFact) {
		this.decCodeSoumFact = decCodeSoumFact;
	}

	public String getDecSoumOrigine() {
		return decSoumOrigine;
	}

	public void setDecSoumOrigine(String decSoumOrigine) {
		this.decSoumOrigine = decSoumOrigine;
	}

	public String getDecCodeExcluTransit() {
		return decCodeExcluTransit;
	}

	public void setDecCodeExcluTransit(String decCodeExcluTransit) {
		this.decCodeExcluTransit = decCodeExcluTransit;
	}

	public String getDecCodeProdCru() {
		return decCodeProdCru;
	}

	public void setDecCodeProdCru(String decCodeProdCru) {
		this.decCodeProdCru = decCodeProdCru;
	}

	public String getDecUniteComplement() {
		return decUniteComplement;
	}

	public void setDecUniteComplement(String decUniteComplement) {
		this.decUniteComplement = decUniteComplement;
	}

	public String getDecUniteMercuriale() {
		return decUniteMercuriale;
	}

	public void setDecUniteMercuriale(String decUniteMercuriale) {
		this.decUniteMercuriale = decUniteMercuriale;
	}

	public String getDecTypeMercuriale() {
		return decTypeMercuriale;
	}

	public void setDecTypeMercuriale(String decTypeMercuriale) {
		this.decTypeMercuriale = decTypeMercuriale;
	}

	public BigDecimal getDecValMercuriale() {
		return decValMercuriale;
	}

	public void setDecValMercuriale(BigDecimal decValMercuriale) {
		this.decValMercuriale = decValMercuriale;
	}

	public String getDecUniteRegEco() {
		return decUniteRegEco;
	}

	public void setDecUniteRegEco(String decUniteRegEco) {
		this.decUniteRegEco = decUniteRegEco;
	}

	public BigDecimal getDecQteRegEco() {
		return decQteRegEco;
	}

	public void setDecQteRegEco(BigDecimal decQteRegEco) {
		this.decQteRegEco = decQteRegEco;
	}

	public String getDecTopModification() {
		return decTopModification;
	}

	public void setDecTopModification(String decTopModification) {
		this.decTopModification = decTopModification;
	}

	public String getDecAutoModif() {
		return decAutoModif;
	}

	public void setDecAutoModif(String decAutoModif) {
		this.decAutoModif = decAutoModif;
	}

	public Integer getDecNumRectifVisite() {
		return decNumRectifVisite;
	}

	public void setDecNumRectifVisite(Integer decNumRectifVisite) {
		this.decNumRectifVisite = decNumRectifVisite;
	}

	public String getDecEtatRectif() {
		return decEtatRectif;
	}

	public void setDecEtatRectif(String decEtatRectif) {
		this.decEtatRectif = decEtatRectif;
	}

	public String getDecAnneeExoneration() {
		return decAnneeExoneration;
	}

	public void setDecAnneeExoneration(String decAnneeExoneration) {
		this.decAnneeExoneration = decAnneeExoneration;
	}

	public String getDecPieceFranchise() {
		return decPieceFranchise;
	}

	public void setDecPieceFranchise(String decPieceFranchise) {
		this.decPieceFranchise = decPieceFranchise;
	}

	public String getDecNumExoneration() {
		return decNumExoneration;
	}

	public void setDecNumExoneration(String decNumExoneration) {
		this.decNumExoneration = decNumExoneration;
	}

	public Integer getDecTxtBreDouPrec() {
		return decTxtBreDouPrec;
	}

	public void setDecTxtBreDouPrec(Integer decTxtBreDouPrec) {
		this.decTxtBreDouPrec = decTxtBreDouPrec;
	}

	public String getDecNumTitreTrans() {
		return decNumTitreTrans;
	}

	public void setDecNumTitreTrans(String decNumTitreTrans) {
		this.decNumTitreTrans = decNumTitreTrans;
	}

	public String getDecIndicateurSh() {
		return decIndicateurSh;
	}

	public void setDecIndicateurSh(String decIndicateurSh) {
		this.decIndicateurSh = decIndicateurSh;
	}

	public BigDecimal getDecQteArtConstatee() {
		return decQteArtConstatee;
	}

	public void setDecQteArtConstatee(BigDecimal decQteArtConstatee) {
		this.decQteArtConstatee = decQteArtConstatee;
	}

	public String getDecTypeTraitement() {
		return decTypeTraitement;
	}

	public void setDecTypeTraitement(String decTypeTraitement) {
		this.decTypeTraitement = decTypeTraitement;
	}

	public String getDecDossierTps() {
		return decDossierTps;
	}

	public void setDecDossierTps(String decDossierTps) {
		this.decDossierTps = decDossierTps;
	}

	public String getDecBurExoneration() {
		return decBurExoneration;
	}

	public void setDecBurExoneration(String decBurExoneration) {
		this.decBurExoneration = decBurExoneration;
	}

	public Integer getDecNumArtDepot() {
		return decNumArtDepot;
	}

	public void setDecNumArtDepot(Integer decNumArtDepot) {
		this.decNumArtDepot = decNumArtDepot;
	}

	public String getDecAgreeEntCedeao() {
		return decAgreeEntCedeao;
	}

	public void setDecAgreeEntCedeao(String decAgreeEntCedeao) {
		this.decAgreeEntCedeao = decAgreeEntCedeao;
	}

	public List<ArtDecSoumDoc> getArtDecSoumDoc() {
		return artDecSoumDoc;
	}

	public void setArtDecSoumDoc(List<ArtDecSoumDoc> artDecSoumDoc) {
		this.artDecSoumDoc = artDecSoumDoc;
	}

	public List<DdeRectifArtDecl> getDdeRectifArtDecl() {
		return ddeRectifArtDecl;
	}

	public void setDdeRectifArtDecl(List<DdeRectifArtDecl> ddeRectifArtDecl) {
		this.ddeRectifArtDecl = ddeRectifArtDecl;
	}

	public List<DecSoumVisit> getDecSoumVisit() {
		return decSoumVisit;
	}

	public void setDecSoumVisit(List<DecSoumVisit> decSoumVisit) {
		this.decSoumVisit = decSoumVisit;
	}

	public List<DispensesArtDec> getDispensesArtDec() {
		return dispensesArtDec;
	}

	public void setDispensesArtDec(List<DispensesArtDec> dispensesArtDec) {
		this.dispensesArtDec = dispensesArtDec;
	}

	public List<LiquidArtDecl> getLiquidArtDecl() {
		return liquidArtDecl;
	}

	public void setLiquidArtDecl(List<LiquidArtDecl> liquidArtDecl) {
		this.liquidArtDecl = liquidArtDecl;
	}

	public List<SegContDec> getSegContDec() {
		return segContDec;
	}

	public void setSegContDec(List<SegContDec> segContDec) {
		this.segContDec = segContDec;
	}

	public List<RegularisationManif> getRegularisationManif() {
		return regularisationManif;
	}

	public void setRegularisationManif(
			List<RegularisationManif> regularisationManif) {
		this.regularisationManif = regularisationManif;
	}

	public List<RegularisationValeur> getRegularisationValeur() {
		return regularisationValeur;
	}

	public void setRegularisationValeur(
			List<RegularisationValeur> regularisationValeur) {
		this.regularisationValeur = regularisationValeur;
	}

	public List<SoumissDeclaration> getSoumissDeclaration() {
		return soumissDeclaration;
	}

	public void setSoumissDeclaration(
			List<SoumissDeclaration> soumissDeclaration) {
		this.soumissDeclaration = soumissDeclaration;
	}

	public List<Sommiers> getSommiers() {
		return sommiers;
	}

	public void setSommiers(List<Sommiers> sommiers) {
		this.sommiers = sommiers;
	}

	public List<ArtDecPjt> getArtDecPjt() {
		return artDecPjt;
	}

	public void setArtDecPjt(List<ArtDecPjt> artDecPjt) {
		this.artDecPjt = artDecPjt;
	}

	public SegGenDec getSegGenDec() {
		return segGenDec;
	}

	public void setSegGenDec(SegGenDec segGenDec) {
		this.segGenDec = segGenDec;
	}

	public String getDecouvraison() {
		return decouvraison;
	}

	public void setDecouvraison(String decouvraison) {
		this.decouvraison = decouvraison;
	}

	public Devises getDevisesAssur() {
		return devisesAssur;
	}

	public void setDevisesAssur(Devises devisesAssur) {
		this.devisesAssur = devisesAssur;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Pays getPaysAssur() {
		return paysAssur;
	}

	public void setPaysAssur(Pays paysAssur) {
		this.paysAssur = paysAssur;
	}

	public Pays getPaysFacturation() {
		return paysFacturation;
	}

	public void setPaysFacturation(Pays paysFacturation) {
		this.paysFacturation = paysFacturation;
	}

	public Pays getPaysFret() {
		return paysFret;
	}

	public void setPaysFret(Pays paysFret) {
		this.paysFret = paysFret;
	}

	public ModeConditionnement getModeCondionnement() {
		return modeCondionnement;
	}

	public void setModeCondionnement(ModeConditionnement modeCondionnement) {
		this.modeCondionnement = modeCondionnement;
	}

	public BureauFranchise getBureauFranchise() {
		return bureauFranchise;
	}

	public void setBureauFranchise(BureauFranchise bureauFranchise) {
		this.bureauFranchise = bureauFranchise;
	}

	public Pays getPaysOrigine() {
		return paysOrigine;
	}

	public void setPaysOrigine(Pays paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public BigDecimal getDecValDevFacture() {
		return decValDevFacture;
	}

	public void setDecValDevFacture(BigDecimal decValDevFacture) {
		this.decValDevFacture = decValDevFacture;
	}

	
}