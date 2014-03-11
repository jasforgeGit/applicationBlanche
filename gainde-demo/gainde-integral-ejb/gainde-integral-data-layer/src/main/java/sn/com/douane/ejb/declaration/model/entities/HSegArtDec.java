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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HSegArtDecKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.BureauFranchise;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Produit;

/**
 * @author thouraya Bean implementation class for Enterprise Bean: Hsegartdec
 */
@Entity()
@IdClass(HSegArtDecKey.class)
@Table(name = "HSEGARTDEC")
public class HSegArtDec implements Serializable {

	private static final long serialVersionUID = 4303029592209142832L;

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

	@Id
	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;

	@Column(name = "DECCODEPROD", length = 6, nullable = false)
	private String decCodeProd;

	@Column(name = "DECPRECUEMOA", length = 2, nullable = false)
	private String decPrecuemoa;

	@Column(name = "DECPRECSEN", length = 2, nullable = false)
	private String decPrecSen;

	@Column(name = "DECNUMARTMANIF")
	private Integer decNumArtManif;

	@Column(name = "DECREGFISCAL", length = 2, nullable = false)
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

	@Column(name = "DECPAYSORIGINE", length = 3, nullable = false)
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
	private BigDecimal decValDevAutreSelt;

	@Column(name = "DECDEVAUTRESELT", length = 3)
	private String decDevAutreSelt;

	@Column(name = "DECMTCFAAUTRESELT", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtCfaAutreSelt;

	@Column(name = "DECPAYSFACTURATION", length = 3)
	private String decPaysFacturation;

	@Column(name = "DECPAYSFOB", length = 3)
	private String decPaysFob;

	@Column(name = "DECPAYSASSUR", length = 3)
	private String decPaysAssur;

	@Column(name = "DECPAYSFRET", length = 3)
	private String decPaysFret;

	@Column(name = "DECPAYSAUTRESELT", length = 3)
	private String decPaysAutreSelt;

	@Column(name = "DECVALCAF", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValCaf;

	@Column(name = "DECVALMERC", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValMerc;

	@Column(name = "DECVALDOUANE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValDouane;

	@Column(name = "DECMTLIQUIDART", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMtLiquidArt;

	@Column(name = "DECANNEESGSDPI", length = 4)
	private String decAnneesGsDpi;

	@Column(name = "DECSGSDPICODEBQUE", length = 30)
	private String decSgsDpiCodeBque;

	@Column(name = "DECNUMSGSDPI", length = 7)
	private String decNumSgSdpi;

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
	private Integer decPreCartManif;

	@Column(name = "DECPREC2ARTMANIF")
	private Integer decPrec2ArtManif;

	@Column(name = "DECMARQCOLIS", length = 60)
	private String decMarqColis;

	@Column(name = "DECDESCOMMERCIALE", length = 60)
	private String decDesCommerciale;

	@Column(name = "DECANNEETITPRECARR", length = 4)
	private String decAnneeTitPreCarr;

	@Column(name = "DECBURAPURDECL", length = 3)
	private String decBurApurDecl;

	@Column(name = "DECNUMDECLAPURANT")
	private Integer decNumDeclApurant;

	@Column(name = "DECNUMARTDECAPURANTE")
	private Integer decNumArtDecApurante;

	@Column(name = "DECCODELIEUSTOKAGE", length = 3)
	private String decCodeLieuStokage;

	@Column(name = "DECANNEEDEPPROV", length = 4)
	private String decAnneeDepprov;

	@Column(name = "DECBURDEPPROV", length = 3)
	private String decBurDepprov;

	@Column(name = "DECNUMDEPPROV")
	private Integer decNumDepprov;

	@Column(name = "DECANNEEAUTADM", length = 4)
	private String decAnneeAutadm;

	@Column(name = "DECNUMAUTORISATION", length = 6)
	private String decNumAutorisation;

	@Column(name = "DECPPMUSERFINAL", length = 5)
	private String decPpmUserFinal;

	@Column(name = "DECCATPRODUEMOA", length = 2)
	private String decCatProdUemoa;

	@Column(name = "DECAGMTENTUEMOA", length = 4)
	private String decAgmtentUemoa;

	@Column(name = "DECBUREXPORT", length = 4)
	private String decBurExport;

	@Column(name = "DECREGDOCEXPORT", length = 4)
	private String decRegDocExport;

	@Column(name = "DECBURMISECONS", length = 4)
	private String decBurMisecons;

	@Column(name = "DECPAYSMISECONS", length = 3)
	private String decPaysMisecons;

	@Column(name = "DECPAYSDEST", length = 3)
	private String decPaysDest;

	@Column(name = "DECNUMDOCEXPORT", length = 7)
	private String decNumDocExport;

	@Column(name = "DECNUMDECMISECONS", length = 7)
	private String decNumDecMisecons;

	@Column(name = "DECDATEDOCEXPORT")
	private Date decDateDocExport;

	@Column(name = "DECDATEMISECONS")
	private Date decDateMisecons;

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

	@Column(name = "DECPDBRUTENLARTDECL", columnDefinition = "DECIMAL(6 , 0)")
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
	private String decUniteRegeco;

	@Column(name = "DECQTEREGECO", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteRegeco;

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
	private Integer decTxtBredouprec;

	@Column(name = "DECNUMTITRETRANS", length = 12)
	private String decNumTitreTrans;

	@Column(name = "DECINDICATEURSH", length = 1)
	private String decIndicateurSh;

	@Column(name = "DECQTEARTCONSTATEE", columnDefinition = "DECIMAL(18 , 0)")
	private BigDecimal decQteartConstatee;

	@Column(name = "DECTYPETRAITEMENT", length = 1)
	private String decTypeTraitement;

	@Column(name = "DECDOSSIERTPS", length = 10)
	private String decDossierTps;

	@Column(name = "DECNUMARTDEPOT")
	private Integer decNumArtDepot;

	@ManyToOne(targetEntity = HSegGenDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECDATEARCHIVE", referencedColumnName = "DECDATEARCHIVE", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private HSegGenDec hSegGenDec;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "DECBURENREGMANIF", insertable = false, updatable = false)
	private BureauDouane bureauEnreg;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "DECBURDEPPROV", insertable = false, updatable = false)
	private BureauDouane bureauProvenance;

	@ManyToOne(targetEntity = Devises.class)
	@JoinColumn(name = "DECDEVISEASSUR", insertable = false, updatable = false)
	private Devises devise;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "DECPAYSORIGINE", insertable = false, updatable = false, nullable = false)
	private Pays paysOrigine;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "DECPAYSASSUR", insertable = false, updatable = false)
	private Pays paysAssur;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "DECPAYSFACTURATION", insertable = false, updatable = false)
	private Pays paysFacturation;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "DECPAYSFRET", insertable = false, updatable = false)
	private Pays paysFret;

	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "DECCODEPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECPRECSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false, nullable = false) })
	private Produit produit;

	@OneToMany(mappedBy = "hSegArtDec", targetEntity = HSegContDec.class)
	private List<HSegContDec> hsegcontdec;

	@OneToMany(mappedBy = "hArtDecPjArt", targetEntity = HArtDecPjt.class)
	private List<HArtDecPjt> hArtDecPjt;

	@OneToMany(mappedBy = "hArtDecSoumDoc", targetEntity = HArtDecSoumDoc.class)
	private List<HArtDecSoumDoc> hArtDecSoumDoc;

	@OneToMany(mappedBy = "hArtDecSoum", targetEntity = HSoumDeclaration.class)
	private List<HSoumDeclaration> hSoumDeclaration;

	public HSegArtDec(Timestamp decDateArchive, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDec, String decCodeProd, String decPrecuemoa,
			String decPrecSen, String decRegFiscal, Integer decNbreColisDecl,
			BigDecimal decPoidsBrutDec, BigDecimal decPdNetDec,
			String decModeCond, String decPaysOrigine) {
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decCodeProd = decCodeProd;
		this.decPrecuemoa = decPrecuemoa;
		this.decPrecSen = decPrecSen;
		this.decRegFiscal = decRegFiscal;
		this.decNbreColisDecl = decNbreColisDecl;
		this.decPoidsBrutDec = decPoidsBrutDec;
		this.decPdNetDec = decPdNetDec;
		this.decModeCond = decModeCond;
		this.decPaysOrigine = decPaysOrigine;

	}

	public HSegArtDec() {
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

	public BigDecimal getDecValDevFacture() {
		return decValDevFacture;
	}

	public void setDecValDevFacture(BigDecimal decValDevFacture) {
		this.decValDevFacture = decValDevFacture;
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

	public BigDecimal getDecValDevAutreSelt() {
		return decValDevAutreSelt;
	}

	public void setDecValDevAutreSelt(BigDecimal decValDevAutreSelt) {
		this.decValDevAutreSelt = decValDevAutreSelt;
	}

	public String getDecDevAutreSelt() {
		return decDevAutreSelt;
	}

	public void setDecDevAutreSelt(String decDevAutreSelt) {
		this.decDevAutreSelt = decDevAutreSelt;
	}

	public BigDecimal getDecMtCfaAutreSelt() {
		return decMtCfaAutreSelt;
	}

	public void setDecMtCfaAutreSelt(BigDecimal decMtCfaAutreSelt) {
		this.decMtCfaAutreSelt = decMtCfaAutreSelt;
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

	public String getDecPaysAutreSelt() {
		return decPaysAutreSelt;
	}

	public void setDecPaysAutreSelt(String decPaysAutreSelt) {
		this.decPaysAutreSelt = decPaysAutreSelt;
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

	public String getDecAnneesGsDpi() {
		return decAnneesGsDpi;
	}

	public void setDecAnneesGsDpi(String decAnneesGsDpi) {
		this.decAnneesGsDpi = decAnneesGsDpi;
	}

	public String getDecSgsDpiCodeBque() {
		return decSgsDpiCodeBque;
	}

	public void setDecSgsDpiCodeBque(String decSgsDpiCodeBque) {
		this.decSgsDpiCodeBque = decSgsDpiCodeBque;
	}

	public String getDecNumSgSdpi() {
		return decNumSgSdpi;
	}

	public void setDecNumSgSdpi(String decNumSgSdpi) {
		this.decNumSgSdpi = decNumSgSdpi;
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

	public Integer getDecPreCartManif() {
		return decPreCartManif;
	}

	public void setDecPreCartManif(Integer decPreCartManif) {
		this.decPreCartManif = decPreCartManif;
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

	public String getDecAnneeTitPreCarr() {
		return decAnneeTitPreCarr;
	}

	public void setDecAnneeTitPreCarr(String decAnneeTitPreCarr) {
		this.decAnneeTitPreCarr = decAnneeTitPreCarr;
	}

	public String getDecBurApurDecl() {
		return decBurApurDecl;
	}

	public void setDecBurApurDecl(String decBurApurDecl) {
		this.decBurApurDecl = decBurApurDecl;
	}

	public Integer getDecNumDeclApurant() {
		return decNumDeclApurant;
	}

	public void setDecNumDeclApurant(Integer decNumDeclApurant) {
		this.decNumDeclApurant = decNumDeclApurant;
	}

	public Integer getDecNumArtDecApurante() {
		return decNumArtDecApurante;
	}

	public void setDecNumArtDecApurante(Integer decNumArtDecApurante) {
		this.decNumArtDecApurante = decNumArtDecApurante;
	}

	public String getDecCodeLieuStokage() {
		return decCodeLieuStokage;
	}

	public void setDecCodeLieuStokage(String decCodeLieuStokage) {
		this.decCodeLieuStokage = decCodeLieuStokage;
	}

	public String getDecAnneeDepprov() {
		return decAnneeDepprov;
	}

	public void setDecAnneeDepprov(String decAnneeDepprov) {
		this.decAnneeDepprov = decAnneeDepprov;
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

	public String getDecAnneeAutadm() {
		return decAnneeAutadm;
	}

	public void setDecAnneeAutadm(String decAnneeAutadm) {
		this.decAnneeAutadm = decAnneeAutadm;
	}

	public String getDecNumAutorisation() {
		return decNumAutorisation;
	}

	public void setDecNumAutorisation(String decNumAutorisation) {
		this.decNumAutorisation = decNumAutorisation;
	}

	public String getDecPpmUserFinal() {
		return decPpmUserFinal;
	}

	public void setDecPpmUserFinal(String decPpmUserFinal) {
		this.decPpmUserFinal = decPpmUserFinal;
	}

	public String getDecCatProdUemoa() {
		return decCatProdUemoa;
	}

	public void setDecCatProdUemoa(String decCatProdUemoa) {
		this.decCatProdUemoa = decCatProdUemoa;
	}

	public String getDecAgmtentUemoa() {
		return decAgmtentUemoa;
	}

	public void setDecAgmtentUemoa(String decAgmtentUemoa) {
		this.decAgmtentUemoa = decAgmtentUemoa;
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

	public String getDecBurMisecons() {
		return decBurMisecons;
	}

	public void setDecBurMisecons(String decBurMisecons) {
		this.decBurMisecons = decBurMisecons;
	}

	public String getDecPaysMisecons() {
		return decPaysMisecons;
	}

	public void setDecPaysMisecons(String decPaysMisecons) {
		this.decPaysMisecons = decPaysMisecons;
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

	public String getDecNumDecMisecons() {
		return decNumDecMisecons;
	}

	public void setDecNumDecMisecons(String decNumDecMisecons) {
		this.decNumDecMisecons = decNumDecMisecons;
	}

	public Date getDecDateDocExport() {
		return decDateDocExport;
	}

	public void setDecDateDocExport(Date decDateDocExport) {
		this.decDateDocExport = decDateDocExport;
	}

	public Date getDecDateMisecons() {
		return decDateMisecons;
	}

	public void setDecDateMisecons(Date decDateMisecons) {
		this.decDateMisecons = decDateMisecons;
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

	public String getDecUniteRegeco() {
		return decUniteRegeco;
	}

	public void setDecUniteRegeco(String decUniteRegeco) {
		this.decUniteRegeco = decUniteRegeco;
	}

	public BigDecimal getDecQteRegeco() {
		return decQteRegeco;
	}

	public void setDecQteRegeco(BigDecimal decQteRegeco) {
		this.decQteRegeco = decQteRegeco;
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

	public Integer getDecTxtBredouprec() {
		return decTxtBredouprec;
	}

	public void setDecTxtBredouprec(Integer decTxtBredouprec) {
		this.decTxtBredouprec = decTxtBredouprec;
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

	public BigDecimal getDecQteartConstatee() {
		return decQteartConstatee;
	}

	public void setDecQteartConstatee(BigDecimal decQteartConstatee) {
		this.decQteartConstatee = decQteartConstatee;
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

	public Integer getDecNumArtDepot() {
		return decNumArtDepot;
	}

	public void setDecNumArtDepot(Integer decNumArtDepot) {
		this.decNumArtDepot = decNumArtDepot;
	}

	public HSegGenDec gethSegGenDec() {
		return hSegGenDec;
	}

	public void sethSegGenDec(HSegGenDec hSegGenDec) {
		this.hSegGenDec = hSegGenDec;
	}

	public List<HSegContDec> getHsegcontdec() {
		return hsegcontdec;
	}

	public void setHsegcontdec(List<HSegContDec> hsegcontdec) {
		this.hsegcontdec = hsegcontdec;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Pays getPaysFret() {
		return paysFret;
	}

	public void setPaysFret(Pays paysFret) {
		this.paysFret = paysFret;
	}

	public Pays getPaysFacturation() {
		return paysFacturation;
	}

	public void setPaysFacturation(Pays paysFacturation) {
		this.paysFacturation = paysFacturation;
	}

	public Pays getPaysAssur() {
		return paysAssur;
	}

	public void setPaysAssur(Pays paysAssur) {
		this.paysAssur = paysAssur;
	}

	public Pays getPaysOrigine() {
		return paysOrigine;
	}

	public void setPaysOrigine(Pays paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public Devises getDevise() {
		return devise;
	}

	public void setDevise(Devises devise) {
		this.devise = devise;
	}

	public BureauDouane getBureauProvenance() {
		return bureauProvenance;
	}

	public void setBureauProvenance(BureauDouane bureauProvenance) {
		this.bureauProvenance = bureauProvenance;
	}

	public BureauDouane getBureauEnreg() {
		return bureauEnreg;
	}

	public void setBureauEnreg(BureauDouane bureauEnreg) {
		this.bureauEnreg = bureauEnreg;
	}

	public List<HArtDecPjt> gethArtDecPjt() {
		return hArtDecPjt;
	}

	public void sethArtDecPjt(List<HArtDecPjt> hArtDecPjt) {
		this.hArtDecPjt = hArtDecPjt;
	}

	public List<HArtDecSoumDoc> gethArtDecSoumDoc() {
		return hArtDecSoumDoc;
	}

	public void sethArtDecSoumDoc(List<HArtDecSoumDoc> hArtDecSoumDoc) {
		this.hArtDecSoumDoc = hArtDecSoumDoc;
	}

	public List<HSoumDeclaration> gethSoumDeclaration() {
		return hSoumDeclaration;
	}

	public void sethSoumDeclaration(List<HSoumDeclaration> hSoumDeclaration) {
		this.hSoumDeclaration = hSoumDeclaration;
	}

}