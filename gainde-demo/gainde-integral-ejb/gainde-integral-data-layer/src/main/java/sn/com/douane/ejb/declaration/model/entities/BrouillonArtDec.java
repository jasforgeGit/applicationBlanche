package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
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
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.BrouillonArtDecKey;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.ejb.rc.model.entities.ModeExpedition;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;

/**
 * @author thouraya Bean implementation class for Enterprise Bean:
 *         Brouillonartdec
 */

@Entity()
@IdClass(BrouillonArtDecKey.class)
@Table(name = "BROUILLONARTDEC")
 @javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name =
 "BrouillonArtDec.findAll", query =
 "select object(o) from BrouillonArtDec o where o.decAnneeDecl = ?1 and o.decCodePpmDeclarant = ?2 and o.decNumRepertoire = ?3 order by o.decNumArtDecl ASC"),
 @javax.persistence.NamedQuery(name = "BrouillonArtDec.findByDpi", query =
 "select object(o) from BrouillonArtDec o where o.decAnneeDecl = ?1 and  o.decCodePpmDeclarant = ?2 and  o.decNumRepertoire = ?3 and o.decNumArtDecl = ?4 and o.decNumSgsDecPrea = ?5"),
 @javax.persistence.NamedQuery(name = "BrouillonArtDec.findByNumApurement", query =
 "select object(o) from BrouillonArtDec o where  o.decAnneeTitrePrecart = ?1 and  o.decBurTitrePrec = ?2 and  o.decNumArtManif = ?3 and  o.decNumArtTitrePrec = ?4")})
public class BrouillonArtDec implements Serializable {

	private static final long serialVersionUID = -488536808676589811L;

	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Id
	@Column(name = "DECANNEEDECLARATION", length = 4, nullable = false)
	private String decAnneeDecl;

	@Id
	@Column(name = "DECCODEPPMDECLARANT", length = 5, nullable = false)
	private String decCodePpmDeclarant;

	@Id
	@Column(name = "DECNUMREPERTOIRE", length = 6, nullable = false)
	private String decNumRepertoire;

	@Column(name = "DECNUMARTMANIF")
	private Integer decNumArtManif;

	@Column(name = "DECPRECARTMANIF")
	private Integer decPrecArtManif;

	@Column(name = "DECPRECARTMANIF2")
	private Integer decPrecArtManif2;

	@Column(name = "DECREGFISCAL", length = 2)
	private String decRegFiscal;

	@Column(name = "DECNBRECOLISDECL")
	private Integer decNbreColisDecl;

	@Column(name = "DECMODECOND", length = 4)
	private String decModeCond;

	@Column(name = "DECIMMVEHIMPORT", length = 10)
	private String decImmVehImport;

	@Column(name = "DECCODEPROD", length = 6)
	private String decCodeProd;

	@Column(name = "DECPRECUEMOA", length = 2)
	private String decPrecuemoa;

	@Column(name = "DECPRECSENEGAL", length = 2)
	private String decPrecSenegal;

	@Column(name = "DECPDBRUTARTDECL", columnDefinition = "DECIMAL(9 , 0)")
	private BigDecimal decPdBrutArtDecl;

	@Column(name = "DECPDNETAPURSOMM", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decPdNetApurSomm;

	@Column(name = "DECQTECOMPL", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteCompl;

	@Column(name = "DECQTEMERC", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decQteMerc;

	@Column(name = "DECPAYSORIG", length = 3)
	private String decPaysOrig;

	@Column(name = "DECVALFOB", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValFob;

	@Column(name = "DECDEVISEFOB", length = 3)
	private String decDeviseFob;

	@Column(name = "DECMONTCFAFOB", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontCfaFob;

	@Column(name = "DECVALFRET", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValFret;

	@Column(name = "DECDEVISEFRET", length = 3)
	private String decDeviseFret;

	@Column(name = "DECMONTCFAFRET", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontCfaFret;

	@Column(name = "DECVALASSUR", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValAssur;

	@Column(name = "DECDEVISEASSUR", length = 3)
	private String decDeviseAssur;

	@Column(name = "DECASSURCFA", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decAssurCfa;

	@Column(name = "DECVALELEMENT", columnDefinition = "DECIMAL(13 , 0)")
	private BigDecimal decValElement;

	@Column(name = "DECDEVISEAUTREELEM", length = 3)
	private String decDeviseAutreElem;

	@Column(name = "DECMONTCFAELEM", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontCfaElem;

	@Column(name = "DECVALCAF", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValCaf;

	@Column(name = "DECMONTLIQART", columnDefinition = "DECIMAL(18 , 0)")
	private BigDecimal decMontLiqArt;

	@Column(name = "DECTYPECONVENTION", length = 1)
	private String decTypeConvention;

	@Column(name = "DECNUMCONVENTION", length = 6)
	private String decNumConvention;

	@Column(name = "DECANNEEAUTADMIN", length = 4)
	private String decAnneeAutAdmin;

	@Column(name = "DECNUMAUTORISATION", length = 6)
	private String decNumAutorisation;

	@Column(name = "DECANNEEAUTCHANGE", length = 4)
	private String decAnneeAutChange;

	@Column(name = "DECNUMAUTCHANGE", length = 6)
	private String decNumAutChange;

	@Column(name = "DECSOUMFACTURE", length = 1)
	private String decSoumFacture;

	@Column(name = "DECSOUMORIG", length = 1)
	private String decSoumOrig;

	@Column(name = "DECCODEEXCLUTRANS", length = 1)
	private String decCodeExcluTrans;

	@Column(name = "DECCATPRODUEMOA", length = 2)
	private String decCatProdUemoa;

	@Column(name = "DECAGREEENTUEMOA", length = 4)
	private String decAgreeEntUemoa;

	@Column(name = "DECBUREXPORT", length = 4)
	private String decBurExport;

	@Column(name = "DECREGDOCEXPORT", length = 4)
	private String decRegDocExport;

	@Column(name = "DECBURMISECONS", length = 4)
	private String decBurMiseCons;

	@Column(name = "DECPAYSDOCMISCONS", length = 3)
	private String decPaysDocMisCons;

	@Column(name = "DECPAYSFACTURATION", length = 3)
	private String decPaysFacturation;

	@Column(name = "DECPAYSFOB", length = 3)
	private String decPaysFob;

	@Column(name = "DECPAYSASSUR", length = 3)
	private String decPaysAssur;

	@Column(name = "DECPAYSFRET", length = 3)
	private String decPaysFret;

	@Column(name = "DECPAYSAUTRESELEM", length = 3)
	private String decPaysAutresElem;

	@Column(name = "DECNUMDOCEXPORT", length = 7)
	private String decNumDocExport;

	@Column(name = "DECNUMDECMISCONS", length = 7)
	private String decNumDecMisCons;

	@Column(name = "DECDATEDOCEXPORT")
	private Date decDateDocExport;

	@Column(name = "DECDATEMISCONS")
	private Date decDateMisCons;

	@Column(name = "DECVALENDOUANE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValenDouane;

	@Column(name = "DECNUMTITRETRANS", length = 12)
	private String decNumTitreTrans;

	@Column(name = "DECDEVISEFACT", length = 3)
	private String decDeviseFact;

	@Column(name = "DECVALFACTURE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValFacture;

	@Column(name = "DECMONTFACTURE", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decMontFacture;

	@Column(name = "DECANNEECONVENTION", length = 4)
	private String decAnneeConvention;

	@Column(name = "DECPAYSDESTINATION", length = 4)
	private String decPaysDestination;

	@Column(name = "DECPAYSPRODCRU", length = 1)
	private String decPaysProdCru;

	@Column(name = "DECTYPEMANIF", length = 1)
	private String decTypeManif;

	@Column(name = "DECNUMARTTITREPREC")
	private Integer decNumArtTitrePrec;

	@Column(name = "DECANNEETITREPRECART", length = 4)
	private String decAnneeTitrePrecart;

	@Column(name = "DECBURAPURDECL", length = 3)
	private String decBurApurDecl;

	@Column(name = "DECNUMDECLAPURANT")
	private Integer decNumDeclApurant;

	@Column(name = "DECINDERREUR", length = 1)
	private String decIndErreur;

	@Column(name = "DECINDCONTPAYS", length = 1)
	private String decIndContPays;

	@Column(name = "DECPPMUSERFINAL", length = 5)
	private String decPpmUserFinal;

	@Column(name = "DECMARQCOLIS")
	private String decMarqColis;

	@Column(name = "DECDESIGCOMM")
	private String decDesigComm;

	@Column(name = "DECUNITECOMPL", length = 2)
	private String decUniteCompl;

	@Column(name = "DECTYPEMERC", length = 2)
	private String decTypeMerc;

	@Column(name = "DECUNITREGECON", length = 2)
	private String decUnitRegecon;

	@Column(name = "DECQTEREGECON", columnDefinition = "DECIMAL(8 , 0)")
	private BigDecimal decQteRegecon;

	@Column(name = "DECAUTOMODIF", length = 1)
	private String decAutoModif;

	@Column(name = "DECVALMERC", columnDefinition = "DECIMAL(11 , 0)")
	private BigDecimal decValMerc;

	@Column(name = "DECLIEUSTOCK", length = 3)
	private String decLieuStock;

	@Column(name = "DECNBRECHEVAUX")
	private Integer decNbreChevaux;

	@Column(name = "DECANNEESGSDECPREA", length = 4)
	private String decAnneeSgsDecPrea;

	@Column(name = "DECSGSCODEBANK", length = 30)
	private String decSgsCodeBank;

	@Column(name = "DECNUMSGSDECPREA", length = 7)
	private String decNumSgsDecPrea;

	@Column(name = "DECANNEEAVSGS", length = 4)
	private String decAnneeAvsgs;

	@Column(name = "DECNUMAVSGS", length = 6)
	private String decNumAvsgs;

	@Column(name = "DECPAYAVSGS", length = 3)
	private String decPayAvsgs;

	@Column(name = "DECEXEMPTSGS", length = 10)
	private String decExempTsgs;

	@Column(name = "DECINDTAXEGALISATION", length = 1)
	private String decIndTaxEgalisation;

	@Column(name = "DECANNEETITREEXO", length = 4)
	private String decAnneeTitreExo;

	@Column(name = "DECCODEPIECEEXO", length = 2)
	private String decCodePieceExo;

	@Column(name = "DECNUMTITREEXO", length = 5)
	private String decNumTitreExo;

	@Column(name = "DECSUSPPERCTITREDOUA", length = 1)
	private String decSuspPercTitreDoua;

	@Column(name = "DECTAUT56PRECPAYE")
	private Integer decTaut56PrecPaye;

	@Column(name = "DECLTACONNAISSEMENT", length = 12)
	private String decLtaConnaissement;

	@Column(name = "DECDECLAUTCONVERT", length = 1)
	private String decDeclautConvert;

	@Column(name = "DECDATEMAJ")
	private Date decDateMaj;

	@Column(name = "DECDOSSIERTPS", length = 10)
	private String decDossierTps;

	@Column(name = "DECBNBRECOLISAPURE")
	private Integer decBNbeColisApure;

	@Column(name = "DECBURTITREPREC", length = 3)
	private String decBurTitrePrec;

	@Column(name = "DECPOIDSNET")
	private double decPoidsNet;

	@Column(name = "DECNUMARTMANIFAPURE")
	private Integer decNumArtManifApure;

	@Column(name = "DECOUVRAISON", columnDefinition = "CHAR(1)")
	private String decOuvRaison;

	@Column(name = "DECAGREEENTCEDEAO", length = 4)
	private String decAgreeEntcedeao;

	@Column(name = "DECMODEEXPED", length = 5)
	private String decModeExped;
	
	private transient String modeTransport;

	@ManyToOne(targetEntity = BrouillonSegGenDec.class, fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECL", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false, nullable = false) })
	private BrouillonSegGenDec brouillonSegGenDec;

	@ManyToOne(targetEntity = Devises.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECDEVISEASSUR", insertable = false, updatable = false)
	private Devises devisesAssur;

	@ManyToOne(targetEntity = Devises.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECDEVISEAUTREELEM", insertable = false, updatable = false)
	private Devises devisesAutreeLem;

	@ManyToOne(targetEntity = Devises.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECDEVISEFRET", insertable = false, updatable = false)
	private Devises devisesFret;

	@ManyToOne(targetEntity = Devises.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECDEVISEFOB", insertable = false, updatable = false)
	private Devises devisesFob;

	@ManyToOne(targetEntity = ModeExpedition.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECMODEEXPED", insertable = false, updatable = false)
	private ModeExpedition modeExpedition;

	@ManyToOne(targetEntity = Ppm.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECCODEPPMDECLARANT", insertable = false, updatable = false)
	private Ppm ppmDeclarant;

	@ManyToOne(targetEntity = Produit.class, fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DECCODEPROD", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false),
			@JoinColumn(name = "DECPRECUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false),
			@JoinColumn(name = "DECPRECSENEGAL", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false) })
	private Produit produit;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPAYSDOCMISCONS", insertable = false, updatable = false)
	private Pays paysDoc;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPAYSDESTINATION", insertable = false, updatable = false)
	private Pays paysDestination;

	@ManyToOne(targetEntity = Pays.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECPAYSORIG", insertable = false, updatable = false)
	private Pays paysOrigine;

	@ManyToOne(targetEntity = RegimeFiscal.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "DECREGFISCAL", insertable = false, updatable = false)
	private RegimeFiscal regimeFiscale;
	

	 @OneToMany(mappedBy = "devisArt", targetEntity = BrouillonDevisArt.class, fetch = FetchType.LAZY)
	 private List<BrouillonDevisArt> brouillonDevisArt;

	 @javax.persistence.OneToMany(mappedBy = "brArtSoumDoc", targetEntity =	 BrArtSoumDoc.class, fetch = FetchType.LAZY)
	 private List<BrArtSoumDoc> brArtSoumDoc = new ArrayList<BrArtSoumDoc>();
	
	 @OneToMany(mappedBy = "brArtDispArt", targetEntity = BrouiDispArtDec.class, fetch = FetchType.LAZY)
	 private List<BrouiDispArtDec> brouiDispArtDec = new ArrayList<BrouiDispArtDec>();
	
	 @OneToMany(mappedBy = "brArtCont", targetEntity =	 BrouillonContDec.class, fetch = FetchType.LAZY)
	 private List<BrouillonContDec> brouillonContDec;	
	
	 @OneToMany(mappedBy = "brartPJBrArt", targetEntity =	 BrouillonPJArticle.class, fetch = FetchType.LAZY)
	 private List<BrouillonPJArticle> brouillonPJArticle;
	 
	 public BrouillonArtDec(Integer decNumArtDecl, String decAnneeDecl,
			String decCodePpmDeclarant, String decNumRepertoire) {
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
	}
	
	@Transient
	private String codeCreditaire;
	@Transient
	private String codeRegime;
	@Transient
	private String modeDecl;
	@Transient
	private String typeApurement;
	@Transient
	private String anneeRegimeEco;
	@Transient
	private String numRegimeEco;
	
	/** variable utilisées lors d'enregistrement brouillon article ***** */
	@Transient
	private List<String> listSoumiss;

	@Transient
	private List<String> listDispenses;

	public BrouillonArtDec() {
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	/**
	 * @return the modeTransport
	 */
	public String getModeTransport() {
		return modeTransport;
	}

	/**
	 * @param modeTransport the modeTransport to set
	 */
	public void setModeTransport(String modeTransport) {
		this.modeTransport = modeTransport;
	}

	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public Integer getDecNumArtManif() {
		return decNumArtManif;
	}

	public void setDecNumArtManif(Integer decNumArtManif) {
		this.decNumArtManif = decNumArtManif;
	}

	public Integer getDecPrecArtManif() {
		return decPrecArtManif;
	}

	public void setDecPrecArtManif(Integer decPrecArtManif) {
		this.decPrecArtManif = decPrecArtManif;
	}

	public Integer getDecPrecArtManif2() {
		return decPrecArtManif2;
	}

	public void setDecPrecArtManif2(Integer decPrecArtManif2) {
		this.decPrecArtManif2 = decPrecArtManif2;
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

	public String getDecModeCond() {
		return decModeCond;
	}

	public void setDecModeCond(String decModeCond) {
		this.decModeCond = decModeCond;
	}

	public String getDecImmVehImport() {
		return decImmVehImport;
	}

	public void setDecImmVehImport(String decImmVehImport) {
		this.decImmVehImport = decImmVehImport;
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

	public String getDecPrecSenegal() {
		return decPrecSenegal;
	}

	public void setDecPrecSenegal(String decPrecSenegal) {
		this.decPrecSenegal = decPrecSenegal;
	}

	public BigDecimal getDecPdBrutArtDecl() {
		return decPdBrutArtDecl;
	}

	public void setDecPdBrutArtDecl(BigDecimal decPdBrutArtDecl) {
		this.decPdBrutArtDecl = decPdBrutArtDecl;
	}

	public BigDecimal getDecPdNetApurSomm() {
		return decPdNetApurSomm;
	}

	public void setDecPdNetApurSomm(BigDecimal decPdNetApurSomm) {
		this.decPdNetApurSomm = decPdNetApurSomm;
	}

	public BigDecimal getDecQteCompl() {
		return decQteCompl;
	}

	public void setDecQteCompl(BigDecimal decQteCompl) {
		this.decQteCompl = decQteCompl;
	}

	public BigDecimal getDecQteMerc() {
		return decQteMerc;
	}

	public void setDecQteMerc(BigDecimal decQteMerc) {
		this.decQteMerc = decQteMerc;
	}

	public String getDecPaysOrig() {
		return decPaysOrig;
	}

	public void setDecPaysOrig(String decPaysOrig) {
		this.decPaysOrig = decPaysOrig;
	}

	public BigDecimal getDecValFob() {
		return decValFob;
	}

	public void setDecValFob(BigDecimal decValFob) {
		this.decValFob = decValFob;
	}

	public String getDecDeviseFob() {
		return decDeviseFob;
	}

	public void setDecDeviseFob(String decDeviseFob) {
		this.decDeviseFob = decDeviseFob;
	}

	public BigDecimal getDecMontCfaFob() {
		return decMontCfaFob;
	}

	public void setDecMontCfaFob(BigDecimal decMontCfaFob) {
		this.decMontCfaFob = decMontCfaFob;
	}

	public BigDecimal getDecValFret() {
		return decValFret;
	}

	public void setDecValFret(BigDecimal decValFret) {
		this.decValFret = decValFret;
	}

	public String getDecDeviseFret() {
		return decDeviseFret;
	}

	public void setDecDeviseFret(String decDeviseFret) {
		this.decDeviseFret = decDeviseFret;
	}

	public BigDecimal getDecMontCfaFret() {
		return decMontCfaFret;
	}

	public void setDecMontCfaFret(BigDecimal decMontCfaFret) {
		this.decMontCfaFret = decMontCfaFret;
	}

	public BigDecimal getDecValAssur() {
		return decValAssur;
	}

	public void setDecValAssur(BigDecimal decValAssur) {
		this.decValAssur = decValAssur;
	}

	public String getDecDeviseAssur() {
		return decDeviseAssur;
	}

	public void setDecDeviseAssur(String decDeviseAssur) {
		this.decDeviseAssur = decDeviseAssur;
	}

	public BigDecimal getDecAssurCfa() {
		return decAssurCfa;
	}

	public void setDecAssurCfa(BigDecimal decAssurCfa) {
		this.decAssurCfa = decAssurCfa;
	}

	public BigDecimal getDecValElement() {
		return decValElement;
	}

	public void setDecValElement(BigDecimal decValElement) {
		this.decValElement = decValElement;
	}

	public String getDecDeviseAutreElem() {
		return decDeviseAutreElem;
	}

	public void setDecDeviseAutreElem(String decDeviseAutreElem) {
		this.decDeviseAutreElem = decDeviseAutreElem;
	}

	public BigDecimal getDecMontCfaElem() {
		return decMontCfaElem;
	}

	public void setDecMontCfaElem(BigDecimal decMontCfaElem) {
		this.decMontCfaElem = decMontCfaElem;
	}

	public BigDecimal getDecValCaf() {
		return decValCaf;
	}

	public void setDecValCaf(BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}

	public BigDecimal getDecMontLiqArt() {
		return decMontLiqArt;
	}

	public void setDecMontLiqArt(BigDecimal decMontLiqArt) {
		this.decMontLiqArt = decMontLiqArt;
	}

	public String getDecTypeConvention() {
		return decTypeConvention;
	}

	public void setDecTypeConvention(String decTypeConvention) {
		this.decTypeConvention = decTypeConvention;
	}

	public String getDecNumConvention() {
		return decNumConvention;
	}

	public void setDecNumConvention(String decNumConvention) {
		this.decNumConvention = decNumConvention;
	}

	public String getDecAnneeAutAdmin() {
		return decAnneeAutAdmin;
	}

	public void setDecAnneeAutAdmin(String decAnneeAutAdmin) {
		this.decAnneeAutAdmin = decAnneeAutAdmin;
	}

	public String getDecNumAutorisation() {
		return decNumAutorisation;
	}

	public void setDecNumAutorisation(String decNumAutorisation) {
		this.decNumAutorisation = decNumAutorisation;
	}

	public String getDecAnneeAutChange() {
		return decAnneeAutChange;
	}

	public void setDecAnneeAutChange(String decAnneeAutChange) {
		this.decAnneeAutChange = decAnneeAutChange;
	}

	public String getDecNumAutChange() {
		return decNumAutChange;
	}

	public void setDecNumAutChange(String decNumAutChange) {
		this.decNumAutChange = decNumAutChange;
	}

	public String getDecSoumFacture() {
		return decSoumFacture;
	}

	public void setDecSoumFacture(String decSoumFacture) {
		this.decSoumFacture = decSoumFacture;
	}

	public String getDecSoumOrig() {
		return decSoumOrig;
	}

	public void setDecSoumOrig(String decSoumOrig) {
		this.decSoumOrig = decSoumOrig;
	}

	public String getDecCodeExcluTrans() {
		return decCodeExcluTrans;
	}

	public void setDecCodeExcluTrans(String decCodeExcluTrans) {
		this.decCodeExcluTrans = decCodeExcluTrans;
	}

	public String getDecCatProdUemoa() {
		return decCatProdUemoa;
	}

	public void setDecCatProdUemoa(String decCatProdUemoa) {
		this.decCatProdUemoa = decCatProdUemoa;
	}

	public String getDecAgreeEntUemoa() {
		return decAgreeEntUemoa;
	}

	public void setDecAgreeEntUemoa(String decAgreeEntUemoa) {
		this.decAgreeEntUemoa = decAgreeEntUemoa;
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

	public String getDecPaysDocMisCons() {
		return decPaysDocMisCons;
	}

	public void setDecPaysDocMisCons(String decPaysDocMisCons) {
		this.decPaysDocMisCons = decPaysDocMisCons;
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

	public String getDecPaysAutresElem() {
		return decPaysAutresElem;
	}

	public void setDecPaysAutresElem(String decPaysAutresElem) {
		this.decPaysAutresElem = decPaysAutresElem;
	}

	public String getDecNumDocExport() {
		return decNumDocExport;
	}

	public void setDecNumDocExport(String decNumDocExport) {
		this.decNumDocExport = decNumDocExport;
	}

	public String getDecNumDecMisCons() {
		return decNumDecMisCons;
	}

	public void setDecNumDecMisCons(String decNumDecMisCons) {
		this.decNumDecMisCons = decNumDecMisCons;
	}

	public Date getDecDateDocExport() {
		return decDateDocExport;
	}

	public void setDecDateDocExport(Date decDateDocExport) {
		this.decDateDocExport = decDateDocExport;
	}

	public Date getDecDateMisCons() {
		return decDateMisCons;
	}

	public void setDecDateMisCons(Date decDateMisCons) {
		this.decDateMisCons = decDateMisCons;
	}

	public BigDecimal getDecValenDouane() {
		return decValenDouane;
	}

	public void setDecValenDouane(BigDecimal decValenDouane) {
		this.decValenDouane = decValenDouane;
	}

	public String getDecNumTitreTrans() {
		return decNumTitreTrans;
	}

	public void setDecNumTitreTrans(String decNumTitreTrans) {
		this.decNumTitreTrans = decNumTitreTrans;
	}

	public String getDecDeviseFact() {
		return decDeviseFact;
	}

	public void setDecDeviseFact(String decDeviseFact) {
		this.decDeviseFact = decDeviseFact;
	}

	public BigDecimal getDecValFacture() {
		return decValFacture;
	}

	public void setDecValFacture(BigDecimal decValFacture) {
		this.decValFacture = decValFacture;
	}

	public BigDecimal getDecMontFacture() {
		return decMontFacture;
	}

	public void setDecMontFacture(BigDecimal decMontFacture) {
		this.decMontFacture = decMontFacture;
	}

	public String getDecAnneeConvention() {
		return decAnneeConvention;
	}

	public void setDecAnneeConvention(String decAnneeConvention) {
		this.decAnneeConvention = decAnneeConvention;
	}

	public String getDecPaysDestination() {
		return decPaysDestination;
	}

	public void setDecPaysDestination(String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}

	public String getDecPaysProdCru() {
		return decPaysProdCru;
	}

	public void setDecPaysProdCru(String decPaysProdCru) {
		this.decPaysProdCru = decPaysProdCru;
	}

	public String getDecTypeManif() {
		return decTypeManif;
	}

	public void setDecTypeManif(String decTypeManif) {
		this.decTypeManif = decTypeManif;
	}

	public Integer getDecNumArtTitrePrec() {
		return decNumArtTitrePrec;
	}

	public void setDecNumArtTitrePrec(Integer decNumArtTitrePrec) {
		this.decNumArtTitrePrec = decNumArtTitrePrec;
	}

	public String getDecAnneeTitrePrecart() {
		return decAnneeTitrePrecart;
	}

	public void setDecAnneeTitrePrecart(String decAnneeTitrePrecart) {
		this.decAnneeTitrePrecart = decAnneeTitrePrecart;
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

	public String getDecIndErreur() {
		return decIndErreur;
	}

	public void setDecIndErreur(String decIndErreur) {
		this.decIndErreur = decIndErreur;
	}

	public String getDecIndContPays() {
		return decIndContPays;
	}

	public void setDecIndContPays(String decIndContPays) {
		this.decIndContPays = decIndContPays;
	}

	public String getDecPpmUserFinal() {
		return decPpmUserFinal;
	}

	public void setDecPpmUserFinal(String decPpmUserFinal) {
		this.decPpmUserFinal = decPpmUserFinal;
	}

	public String getDecMarqColis() {
		return decMarqColis;
	}

	public void setDecMarqColis(String decMarqColis) {
		this.decMarqColis = decMarqColis;
	}

	public String getDecDesigComm() {
		return decDesigComm;
	}

	public void setDecDesigComm(String decDesigComm) {
		this.decDesigComm = decDesigComm;
	}

	public String getDecUniteCompl() {
		return decUniteCompl;
	}

	public void setDecUniteCompl(String decUniteCompl) {
		this.decUniteCompl = decUniteCompl;
	}

	public String getDecTypeMerc() {
		return decTypeMerc;
	}

	public void setDecTypeMerc(String decTypeMerc) {
		this.decTypeMerc = decTypeMerc;
	}

	public String getDecUnitRegecon() {
		return decUnitRegecon;
	}

	public void setDecUnitRegecon(String decUnitRegecon) {
		this.decUnitRegecon = decUnitRegecon;
	}

	public BigDecimal getDecQteRegecon() {
		return decQteRegecon;
	}

	public void setDecQteRegecon(BigDecimal decQteRegecon) {
		this.decQteRegecon = decQteRegecon;
	}

	public String getDecAutoModif() {
		return decAutoModif;
	}

	public void setDecAutoModif(String decAutoModif) {
		this.decAutoModif = decAutoModif;
	}

	public BigDecimal getDecValMerc() {
		return decValMerc;
	}

	public void setDecValMerc(BigDecimal decValMerc) {
		this.decValMerc = decValMerc;
	}

	public String getDecLieuStock() {
		return decLieuStock;
	}

	public void setDecLieuStock(String decLieuStock) {
		this.decLieuStock = decLieuStock;
	}

	public Integer getDecNbreChevaux() {
		return decNbreChevaux;
	}

	public void setDecNbreChevaux(Integer decNbreChevaux) {
		this.decNbreChevaux = decNbreChevaux;
	}

	public String getDecAnneeSgsDecPrea() {
		return decAnneeSgsDecPrea;
	}

	public void setDecAnneeSgsDecPrea(String decAnneeSgsDecPrea) {
		this.decAnneeSgsDecPrea = decAnneeSgsDecPrea;
	}

	public String getDecSgsCodeBank() {
		return decSgsCodeBank;
	}

	public void setDecSgsCodeBank(String decSgsCodeBank) {
		this.decSgsCodeBank = decSgsCodeBank;
	}

	public String getDecNumSgsDecPrea() {
		return decNumSgsDecPrea;
	}

	public void setDecNumSgsDecPrea(String decNumSgsDecPrea) {
		this.decNumSgsDecPrea = decNumSgsDecPrea;
	}

	public String getDecAnneeAvsgs() {
		return decAnneeAvsgs;
	}

	public void setDecAnneeAvsgs(String decAnneeAvsgs) {
		this.decAnneeAvsgs = decAnneeAvsgs;
	}

	public String getDecNumAvsgs() {
		return decNumAvsgs;
	}

	public void setDecNumAvsgs(String decNumAvsgs) {
		this.decNumAvsgs = decNumAvsgs;
	}

	public String getDecPayAvsgs() {
		return decPayAvsgs;
	}

	public void setDecPayAvsgs(String decPayAvsgs) {
		this.decPayAvsgs = decPayAvsgs;
	}

	public String getDecExempTsgs() {
		return decExempTsgs;
	}

	public void setDecExempTsgs(String decExempTsgs) {
		this.decExempTsgs = decExempTsgs;
	}

	public String getDecIndTaxEgalisation() {
		return decIndTaxEgalisation;
	}

	public void setDecIndTaxEgalisation(String decIndTaxEgalisation) {
		this.decIndTaxEgalisation = decIndTaxEgalisation;
	}

	public String getDecAnneeTitreExo() {
		return decAnneeTitreExo;
	}

	public void setDecAnneeTitreExo(String decAnneeTitreExo) {
		this.decAnneeTitreExo = decAnneeTitreExo;
	}

	public String getDecCodePieceExo() {
		return decCodePieceExo;
	}

	public void setDecCodePieceExo(String decCodePieceExo) {
		this.decCodePieceExo = decCodePieceExo;
	}

	public String getDecNumTitreExo() {
		return decNumTitreExo;
	}

	public void setDecNumTitreExo(String decNumTitreExo) {
		this.decNumTitreExo = decNumTitreExo;
	}

	public String getDecSuspPercTitreDoua() {
		return decSuspPercTitreDoua;
	}

	public void setDecSuspPercTitreDoua(String decSuspPercTitreDoua) {
		this.decSuspPercTitreDoua = decSuspPercTitreDoua;
	}

	public Integer getDecTaut56PrecPaye() {
		return decTaut56PrecPaye;
	}

	public void setDecTaut56PrecPaye(Integer decTaut56PrecPaye) {
		this.decTaut56PrecPaye = decTaut56PrecPaye;
	}

	public String getDecLtaConnaissement() {
		return decLtaConnaissement;
	}

	public void setDecLtaConnaissement(String decLtaConnaissement) {
		this.decLtaConnaissement = decLtaConnaissement;
	}

	public String getDecDeclautConvert() {
		return decDeclautConvert;
	}

	public void setDecDeclautConvert(String decDeclautConvert) {
		this.decDeclautConvert = decDeclautConvert;
	}

	public Date getDecDateMaj() {
		return decDateMaj;
	}

	public void setDecDateMaj(Date decDateMaj) {
		this.decDateMaj = decDateMaj;
	}

	public String getDecDossierTps() {
		return decDossierTps;
	}

	public void setDecDossierTps(String decDossierTps) {
		this.decDossierTps = decDossierTps;
	}

	public Integer getDecBNbeColisApure() {
		return decBNbeColisApure;
	}

	public void setDecBNbeColisApure(Integer decBNbeColisApure) {
		this.decBNbeColisApure = decBNbeColisApure;
	}

	public String getDecBurTitrePrec() {
		return decBurTitrePrec;
	}

	public void setDecBurTitrePrec(String decBurTitrePrec) {
		this.decBurTitrePrec = decBurTitrePrec;
	}

	public double getDecPoidsNet() {
		return decPoidsNet;
	}

	public void setDecPoidsNet(double decPoidsNet) {
		this.decPoidsNet = decPoidsNet;
	}

	public Integer getDecNumArtManifApure() {
		return decNumArtManifApure;
	}

	public void setDecNumArtManifApure(Integer decNumArtManifApure) {
		this.decNumArtManifApure = decNumArtManifApure;
	}

	public String getDecOuvRaison() {
		return decOuvRaison;
	}

	public void setDecOuvRaison(String decOuvRaison) {
		this.decOuvRaison = decOuvRaison;
	}

	public String getDecAgreeEntcedeao() {
		return decAgreeEntcedeao;
	}

	public void setDecAgreeEntcedeao(String decAgreeEntcedeao) {
		this.decAgreeEntcedeao = decAgreeEntcedeao;
	}

	public String getDecModeExped() {
		return decModeExped;
	}

	public void setDecModeExped(String decModeExped) {
		this.decModeExped = decModeExped;
	}

	public BrouillonSegGenDec getBrouillonSegGenDec() {
		return brouillonSegGenDec;
	}

	public void setBrouillonSegGenDec(BrouillonSegGenDec brouillonSegGenDec) {
		this.brouillonSegGenDec = brouillonSegGenDec;
	}

	public Devises getDevisesAssur() {
		return devisesAssur;
	}

	public void setDevisesAssur(Devises devisesAssur) {
		this.devisesAssur = devisesAssur;
	}

	public Devises getDevisesAutreeLem() {
		return devisesAutreeLem;
	}

	public void setDevisesAutreeLem(Devises devisesAutreeLem) {
		this.devisesAutreeLem = devisesAutreeLem;
	}

	public Devises getDevisesFret() {
		return devisesFret;
	}

	public void setDevisesFret(Devises devisesFret) {
		this.devisesFret = devisesFret;
	}

	public Devises getDevisesFob() {
		return devisesFob;
	}

	public void setDevisesFob(Devises devisesFob) {
		this.devisesFob = devisesFob;
	}

	public ModeExpedition getModeExpedition() {
		return modeExpedition;
	}

	public void setModeExpedition(ModeExpedition modeExpedition) {
		this.modeExpedition = modeExpedition;
	}

	public Ppm getPpmDeclarant() {
		return ppmDeclarant;
	}

	public void setPpmDeclarant(Ppm ppmDeclarant) {
		this.ppmDeclarant = ppmDeclarant;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Pays getPaysDoc() {
		return paysDoc;
	}

	public void setPaysDoc(Pays paysDoc) {
		this.paysDoc = paysDoc;
	}

	public Pays getPaysDestination() {
		return paysDestination;
	}

	public void setPaysDestination(Pays paysDestination) {
		this.paysDestination = paysDestination;
	}

	public Pays getPaysOrigine() {
		return paysOrigine;
	}

	public void setPaysOrigine(Pays paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public RegimeFiscal getRegimeFiscale() {
		return regimeFiscale;
	}

	public void setRegimeFiscale(RegimeFiscal regimeFiscale) {
		this.regimeFiscale = regimeFiscale;
	}

	public String getCodeCreditaire() {
		return codeCreditaire;
	}

	public void setCodeCreditaire(String codeCreditaire) {
		this.codeCreditaire = codeCreditaire;
	}

	public String getCodeRegime() {
		return codeRegime;
	}

	public void setCodeRegime(String codeRegime) {
		this.codeRegime = codeRegime;
	}

	public String getModeDecl() {
		return modeDecl;
	}

	public void setModeDecl(String modeDecl) {
		this.modeDecl = modeDecl;
	}

	public String getTypeApurement() {
		return typeApurement;
	}

	public void setTypeApurement(String typeApurement) {
		this.typeApurement = typeApurement;
	}

	public String getAnneeRegimeEco() {
		return anneeRegimeEco;
	}

	public void setAnneeRegimeEco(String anneeRegimeEco) {
		this.anneeRegimeEco = anneeRegimeEco;
	}

	public String getNumRegimeEco() {
		return numRegimeEco;
	}

	public void setNumRegimeEco(String numRegimeEco) {
		this.numRegimeEco = numRegimeEco;
	}

	public List<BrouillonDevisArt> getBrouillonDevisArt() {
		return brouillonDevisArt;
	}

	public void setBrouillonDevisArt(List<BrouillonDevisArt> brouillonDevisArt) {
		this.brouillonDevisArt = brouillonDevisArt;
	}

	public List<BrArtSoumDoc> getBrArtSoumDoc() {
		return brArtSoumDoc;
	}

	public void setBrArtSoumDoc(List<BrArtSoumDoc> brArtSoumDoc) {
		this.brArtSoumDoc = brArtSoumDoc;
	}

	public List<BrouiDispArtDec> getBrouiDispArtDec() {
		return brouiDispArtDec;
	}

	public void setBrouiDispArtDec(List<BrouiDispArtDec> brouiDispArtDec) {
		this.brouiDispArtDec = brouiDispArtDec;
	}

	public List<BrouillonContDec> getBrouillonContDec() {
		return brouillonContDec;
	}

	public void setBrouillonContDec(List<BrouillonContDec> brouillonContDec) {
		this.brouillonContDec = brouillonContDec;
	}

	public List<BrouillonPJArticle> getBrouillonPJArticle() {
		return brouillonPJArticle;
	}

	public void setBrouillonPJArticle(List<BrouillonPJArticle> brouillonPJArticle) {
		this.brouillonPJArticle = brouillonPJArticle;
	}
	
	public List<String> getListSoumiss() {
		return listSoumiss;
	}

	public void setListSoumiss(List<String> listSoumiss) {
		this.listSoumiss = listSoumiss;
	}

	public List<String> getListDispenses() {
		return listDispenses;
	}

	public void setListDispenses(List<String> listDispenses) {
		this.listDispenses = listDispenses;
	}
	

}