/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.manifeste.model.keys.ArticleManifesteKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.LieuEmbarquement;
import sn.com.douane.ejb.rc.model.entities.Mad;
import sn.com.douane.ejb.rc.model.entities.ModeConditionnement;
import sn.com.douane.utils.ConstManif;



/**
 * @author CGPID
 *
 */
@Entity
@IdClass(ArticleManifesteKey.class)
@NamedQueries({
	@NamedQuery(name = "findArticleOfManifeste", 
			query = "select object(o) from ArticleManifeste o where o.manifAnneeEngManif = ?1 and o.manifBureauEngManif = ?2 " +
					"and o.manifNumEnregManif = ?3 order by o.manifNumArticleManif,o.manifPrecisArtManif,o.manifPrecisArtManif2 asc"), 
	@NamedQuery(name = "findArticleManifesteByLTA", 
			query = "select object(o) from ArticleManifeste o where  o.manifNumTitreTransp = ?1"), 
	@NamedQuery(name = "findArticlesByDestination", 
			query = "select object(o) from ArticleManifeste o where o.manifAnneeEngManif = ?1 and o.manifBureauEngManif = ?2 " +
					"and o.manifNumEnregManif = ?3 and o.manifDestinationDef = ?4 and o.manifDestinationDef <> ?5")
	})
			
@Table(name="ARTICLEMANIFESTE")		
public class ArticleManifeste implements Serializable{
	
	private static final long serialVersionUID = -940461312326978221L;

	@Id
	@Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;
	
	@Id
	@Column(name="MANIFANNEEENGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
	
	@Id
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
	
	@Id
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
    private java.lang.Integer manifNumArticleManif;

	@Id
	@Column(name="MANIFPRECISARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
	@Id
	@Column(name="MANIFPRECISARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
    
	@Column(name="MANIFCODECONSIGN", length=3, nullable=false)
    private java.lang.String manifCodeConsign;
	
	@Column(name="MANIFNUMREPERTOIRE", length=6, nullable=false)
    private java.lang.String manifNumRepertoire;
	
	@Column(name="MANIFCODELIEUEMB", length=5, nullable=false)
    private java.lang.String manifCodeLieuEmb;
    
	@Column(name="MANIFNBRCOLIS")
    private java.lang.Integer manifNbrColis;
    
	@Column(name="MANIFMODECOND", length=4)
    private java.lang.String manifModeCond;
    
	@Column(name="MANIFCODEDEST", length=5)
    private java.lang.String manifCodeDest;
    
	@Column(name="MANIFTYPEVOIXDEST", length=60)
    private java.lang.String manifTypeVoixDest;
    
	@Column(name="MANIFNOMVOIEDEST", length=60)
    private java.lang.String manifNomVoieDest;
    
	@Column(name="MANIFNINEADEST", length=18)
    private java.lang.String manifNineaDest;
    
	@Column(name="MANIFNUMVOIEDEST", length=5)
    private java.lang.String manifNumVoieDest;
    
	@Column(name="MANIFQUARTIERDEST", length=50)
    private java.lang.String manifQuartierDest;
    
	@Column(name="MANIFVILLEDEST", length=50)
    private java.lang.String manifVilleDest;
    
	@Column(name="MANIFBPDEST", length=50)
    private java.lang.String manifBpDest;
    
	@Column(name="MANIFVILLEDESTDEF", length=50)
    private java.lang.String manifVilleDestDef;
    
	@Column(name="MANIFNUMTITRETRANSP", length=12)
    private java.lang.String manifNumTitreTransp;
    
	@Column(name="MANIFMARQUESCOLIS")
    private java.lang.String manifMarquesColis;
    
	@Column(name="MANIFDESIGNATIONCOM")
    private java.lang.String manifDesignationCom;
    
	@Column(name="MANIFPDSBRUTMANIF", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdsBrutManif;
    
	@Column(name="MANIFVOLUME", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifVolume;
    
	@Column(name="MANIFNBRCOLISRECTIF")
    private java.lang.Integer manifNbrColisRectif;
    
	@Column(name="MANIFPDSBRUTCOQUILLE", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdsBrutCoquille;
    
	@Column(name="MANIFVOLUMEECORE",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifVolumeEcore;
    
	@Column(name="MANIFAGENTCORRECTION", length=5)
    private java.lang.String manifAgentCorrection;
    
	@Column(name="MANIFNBRCOLISECORES")
    private java.lang.Integer manifNbrColisEcores;
    
	@Column(name="MANIFPDSBRUTECORE",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdsBrutEcore;
    
	@Column(name="MANIFNBRCOLISDECLARE")
    private java.lang.Integer manifNbrColisDeclare;
    
	@Column(name="MANIFPDSDECLAREMANIF", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdsDeclareManif;
    
	@Column(name="MANIFNBRCOLISAPURES")
    private java.lang.Integer manifNbrColisApures;
    
	@Column(name="MANIFPDSAPURPHYMANIF",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPdsApurPhyManif;
    
	@Column(name="MANIFDATEEMB")
    private java.sql.Date manifDateEmb;
    
	@Column(name="MANIFINDPARTIEL", length=1)
    private java.lang.String manifIndPartiel;
    
	@Column(name="MANIFNOMDESTINATAIRE")
    private java.lang.String manifNomDestinataire;
    
	@Column(name="MANIFNOMEXPEDITEUR")
    private java.lang.String manifNomExpediteur;
    
	@Column(name="MANIFJULIANDATEEMB")
    private java.lang.Integer manifJulianDateEmb;
    
	@Column(name="MANIFNUMRECOND")
    private java.lang.Integer manifNumRecond;
    
	@Column(name="MANIFNUMRECOND2")
    private java.lang.Integer manifNumRecond2;
    
	@Column(name="MANIFETATARTMANIF", length=2)  
    private java.lang.String manifEtatArtManif;
    
	@Column(name="MANIFETATDMDSURMANIF", length=1)
    private java.lang.String manifEtatDmdSurManif;
    
	@Column(name="MANIFNUMDMDSURMANIF")
    private java.lang.Integer manifNumDmdSurManif;
    
	@Column(name="MANIFANNEEDMD", length=4)
    private java.lang.String manifAnneeDmd;
    
	@Column(name="MANIFCODEDEPOT", length=3)
    private java.lang.String manifCodeDepot;
    
	@Column(name="MANIFCODEORDRE", length=5)
    private java.lang.String manifCodeOrdre;
    
	@Column(name="MANIFNOMORDRE")
    private java.lang.String manifNomOrdre;
    
	@Column(name="MANIFADRESSEORDRE")
    private java.lang.String manifAdresseOrdre;
    
	@Column(name="MANIFCODEATTACHE", length=1)
    private java.lang.String manifCodeAttache;
    
	@Column(name="MANIFNBRCONTENEUR")
    private java.lang.Integer manifNbrConteneur;
    
	@Column(name="MANIFDESTINATIONDEF", length=3)
    private java.lang.String manifDestinationDef;
    
	@Column(name="MANIFARTINDVALID", length=1)
    private java.lang.String manifArtIndvalid;
    
	@Column(name="MANIFDATEVALIDART")
    private java.sql.Date manifDateValidArt;
    
	@Column(name="MANIFDATECREATIONART")
    private java.sql.Date manifDateCreationArt;
    
	@Column(name="MANIFDATEMAJARTICLE")
    private java.sql.Date manifDateMajArticle;
    
	@Column(name="MANIFCODEHDARTICLE", length=1)
    private java.lang.String manifCodeHdArticle;
    
	@Column(name="MANIFIDPVECOR",columnDefinition="DECIMAL(18 , 0)")
    private java.math.BigDecimal manifIdPvEcor;
    
	@Column(name="MANIFIDLIEUSTOCKAGE", length=3)
    private java.lang.String manifIdLieuStockage;
    
	@Column(name="MANIFARTPPMDEST", length=100)
    private java.lang.String manifArtPpmDest;
    
	@Column(name="MANIFINDCIBLAGE", length=1)
    private java.lang.String manifIndCiblage;
    
	@Column(name="MANIFTYPETRAITEMENT", length=1)
    private java.lang.String manifTypeTraitement;
    
	@Column(name="MANIFINDPRECIS", length=1)
    private java.lang.String manifIndPrecis;
    
	@Column(name="MANIFINDPRECIS2", length=1)
    private java.lang.String manifIndPrecis2;
    
	@Column(name="MANIFENVOIFRACT", length=1)
    private java.lang.String manifEnvoiFract;
    
	@Column(name="MANIFINDTRSFRTTRANSB", length=1)
    private java.lang.String manifIndTrsFrtTransb;
    
	@Column(name="MANIFNBRECONTECORE")
    private java.lang.Integer manifNbreContEcore;
    
	@Column(name="MANIFORIGINEMANIFESTE",columnDefinition="VARCHAR(1)")
    private java.lang.String manifOrigineManifeste;
	
	@Column(name="MANIFTRSFTTRANSB",columnDefinition="VARCHAR(1)",nullable = false)
	private String manifTrsftTransb;
	
	@Column(name="IDDECLTRANSFERT")
	private Long idDeclTransfert;
	
	@OneToOne(mappedBy="articleManifeste")
	private DeclarationExt declarationExt;
	
	@ManyToOne
	@JoinColumn(name = "MANIFMODECOND",referencedColumnName="RCCODEMODECOND", insertable = false, updatable = false)
	private ModeConditionnement modeConditionnement;
	
	@ManyToOne
	@JoinColumn(name = "MANIFCODELIEUEMB",referencedColumnName="RCCODELIEUEMB", insertable = false, updatable = false)
	private LieuEmbarquement lieuEmbarquement;
	
	@ManyToOne
	@JoinColumn(name = "MANIFBUREAUENGMANIF",referencedColumnName="RCCODEBURDOUANE", insertable = false, updatable = false)
	private BureauDouane bureauDaoune;
	
	@ManyToOne
	@JoinColumn(name = "MANIFCODECONSIGN",referencedColumnName="RCCODECONSIGNATAIRE", insertable = false, updatable = false)
	private Consignataire consignataire;

	@OneToMany(mappedBy = "articleManifeste", targetEntity = ApurementManifeste.class) 
	private List<ApurementManifeste> apurementManifestes = new ArrayList<ApurementManifeste>();
    
	@OneToMany(mappedBy = "articleManifeste", targetEntity = ConteneurArticle.class)
    private List<ConteneurArticle> conteneurArticles = new ArrayList<ConteneurArticle>();
    
    @OneToMany(mappedBy = "articleManifeste", targetEntity = DdeDestArtMan.class,fetch = FetchType.LAZY)
    private List<DdeDestArtMan> ddeDestArtMans = new ArrayList<DdeDestArtMan>();
   
    @OneToMany(mappedBy = "articleManifeste", targetEntity = DdeRectifArtMan.class,fetch = FetchType.LAZY)
    private List<DdeRectifArtMan> ddeRectifArtMans = new ArrayList<DdeRectifArtMan>();
   
    @OneToMany(mappedBy = "articleManifeste", targetEntity = DdeRegularisation.class)
    private List<DdeRegularisation> ddeRegularisations = new ArrayList<DdeRegularisation>();
    
    @OneToMany(mappedBy = "articleManifeste", targetEntity = DdeMiseDepot.class)
    private List<DdeMiseDepot> ddeMiseDepots = new ArrayList<DdeMiseDepot>(); 
    
    @OneToMany(mappedBy = "articleManifeste", targetEntity = DeclarationExt.class)
    private List<DeclarationExt> listeDeclarationExt = new ArrayList<DeclarationExt>(); 
    
		
	@Transient
	private String libelleLieuEmbarq;
	
	@Transient
	private String libellelPaysDestination;
	
	@Transient
	private String libManifTypeTraitement;
	
	@Transient
	private String libelleModeCond;

	/**
	 * @return the libelleModeCond
	 */
	public String getLibelleModeCond() {
		return libelleModeCond;
	}

	/**
	 * @param libelleModeCond the libelleModeCond to set
	 */
	public void setLibelleModeCond(String libelleModeCond) {
		this.libelleModeCond = libelleModeCond;
	}

	public ArticleManifeste() {
		super();		
	}
	
	/**
	 * @param libelleLieuEmbarq the libelleLieuEmbarq to set
	 */
	public void setLibelleLieuEmbarq(String libelleLieuEmbarq) {
		this.libelleLieuEmbarq = libelleLieuEmbarq;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBureauEngManif() {
		return manifBureauEngManif;
	}

	/**
	 * @return the apurementManifestes
	 */
	public List<ApurementManifeste> getApurementManifestes() {
		return apurementManifestes;
	}

	/**
	 * @param apurementManifestes the apurementManifestes to set
	 */
	public void setApurementManifestes(List<ApurementManifeste> apurementManifestes) {
		this.apurementManifestes = apurementManifestes;
	}

	/**
	 * @return the conteneurArticles
	 */
	public List<ConteneurArticle> getConteneurArticles() {
		return conteneurArticles;
	}

	/**
	 * @param conteneurArticles the conteneurArticles to set
	 */
	public void setConteneurArticles(List<ConteneurArticle> conteneurArticles) {
		this.conteneurArticles = conteneurArticles;
	}

	/**
	 * @return the ddeDestArtMans
	 */
	public List<DdeDestArtMan> getDdeDestArtMans() {
		return ddeDestArtMans;
	}

	/**
	 * @param ddeDestArtMans the ddeDestArtMans to set
	 */
	public void setDdeDestArtMans(List<DdeDestArtMan> ddeDestArtMans) {
		this.ddeDestArtMans = ddeDestArtMans;
	}

	/**
	 * @return the ddeRectifArtMans
	 */
	public List<DdeRectifArtMan> getDdeRectifArtMans() {
		return ddeRectifArtMans;
	}

	/**
	 * @param ddeRectifArtMans the ddeRectifArtMans to set
	 */
	public void setDdeRectifArtMans(List<DdeRectifArtMan> ddeRectifArtMans) {
		this.ddeRectifArtMans = ddeRectifArtMans;
	}

	/**
	 * @return the ddeRegularisations
	 */
	public List<DdeRegularisation> getDdeRegularisations() {
		return ddeRegularisations;
	}

	/**
	 * @param ddeRegularisations the ddeRegularisations to set
	 */
	public void setDdeRegularisations(List<DdeRegularisation> ddeRegularisations) {
		this.ddeRegularisations = ddeRegularisations;
	}

	/**
	 * @return the ddeMiseDepots
	 */
	public List<DdeMiseDepot> getDdeMiseDepots() {
		return ddeMiseDepots;
	}

	/**
	 * @param ddeMiseDepots the ddeMiseDepots to set
	 */
	public void setDdeMiseDepots(List<DdeMiseDepot> ddeMiseDepots) {
		this.ddeMiseDepots = ddeMiseDepots;
	}

	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBureauEngManif(java.lang.String manifBureauEngManif) {
		this.manifBureauEngManif = manifBureauEngManif;
	}

	/**
	 * @return the manifAnneeEngManif
	 */
	public java.lang.String getManifAnneeEngManif() {
		return manifAnneeEngManif;
	}

	/**
	 * @param manifAnneeEngManif the manifAnneeEngManif to set
	 */
	public void setManifAnneeEngManif(java.lang.String manifAnneeEngManif) {
		this.manifAnneeEngManif = manifAnneeEngManif;
	}

	/**
	 * @return the manifNumEnregManif
	 */
	public java.lang.Integer getManifNumEnregManif() {
		return manifNumEnregManif;
	}

	/**
	 * @param manifNumEnregManif the manifNumEnregManif to set
	 */
	public void setManifNumEnregManif(java.lang.Integer manifNumEnregManif) {
		this.manifNumEnregManif = manifNumEnregManif;
	}

	/**
	 * @return the manifCodeConsign
	 */
	public java.lang.String getManifCodeConsign() {
		return manifCodeConsign;
	}

	/**
	 * @param manifCodeConsign the manifCodeConsign to set
	 */
	public void setManifCodeConsign(java.lang.String manifCodeConsign) {
		this.manifCodeConsign = manifCodeConsign;
	}

	/**
	 * @return the manifNumRepertoire
	 */
	public java.lang.String getManifNumRepertoire() {
		return manifNumRepertoire;
	}

	/**
	 * @param manifNumRepertoire the manifNumRepertoire to set
	 */
	public void setManifNumRepertoire(java.lang.String manifNumRepertoire) {
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifCodeLieuEmb
	 */
	public java.lang.String getManifCodeLieuEmb() {
		return manifCodeLieuEmb;
	}

	/**
	 * @param manifCodeLieuEmb the manifCodeLieuEmb to set
	 */
	public void setManifCodeLieuEmb(java.lang.String manifCodeLieuEmb) {
		this.manifCodeLieuEmb = manifCodeLieuEmb;
	}

	/**
	 * @return the manifNumArticleManif
	 */
	public java.lang.Integer getManifNumArticleManif() {
		return manifNumArticleManif;
	}

	/**
	 * @param manifNumArticleManif the manifNumArticleManif to set
	 */
	public void setManifNumArticleManif(java.lang.Integer manifNumArticleManif) {
		this.manifNumArticleManif = manifNumArticleManif;
	}

	/**
	 * @return the manifPrecisArtManif
	 */
	public java.lang.Integer getManifPrecisArtManif() {
		return manifPrecisArtManif;
	}

	/**
	 * @param manifPrecisArtManif the manifPrecisArtManif to set
	 */
	public void setManifPrecisArtManif(java.lang.Integer manifPrecisArtManif) {
		this.manifPrecisArtManif = manifPrecisArtManif;
	}

	/**
	 * @return the manifPrecisArtManif2
	 */
	public java.lang.Integer getManifPrecisArtManif2() {
		return manifPrecisArtManif2;
	}

	/**
	 * @param manifPrecisArtManif2 the manifPrecisArtManif2 to set
	 */
	public void setManifPrecisArtManif2(java.lang.Integer manifPrecisArtManif2) {
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	}

	/**
	 * @return the manifNbrColis
	 */
	public java.lang.Integer getManifNbrColis() {
		return manifNbrColis;
	}

	/**
	 * @param manifNbrColis the manifNbrColis to set
	 */
	public void setManifNbrColis(java.lang.Integer manifNbrColis) {
		this.manifNbrColis = manifNbrColis;
	}

	/**
	 * @return the manifModeCond
	 */
	public java.lang.String getManifModeCond() {
		return manifModeCond;
	}

	/**
	 * @param manifModeCond the manifModeCond to set
	 */
	public void setManifModeCond(java.lang.String manifModeCond) {
		this.manifModeCond = manifModeCond;
	}

	/**
	 * @return the manifCodeDest
	 */
	public java.lang.String getManifCodeDest() {
		return manifCodeDest;
	}

	/**
	 * @param manifCodeDest the manifCodeDest to set
	 */
	public void setManifCodeDest(java.lang.String manifCodeDest) {
		this.manifCodeDest = manifCodeDest;
	}

	/**
	 * @return the manifTypeVoixDest
	 */
	public java.lang.String getManifTypeVoixDest() {
		return manifTypeVoixDest;
	}

	/**
	 * @param manifTypeVoixDest the manifTypeVoixDest to set
	 */
	public void setManifTypeVoixDest(java.lang.String manifTypeVoixDest) {
		this.manifTypeVoixDest = manifTypeVoixDest;
	}

	/**
	 * @return the manifNomVoieDest
	 */
	public java.lang.String getManifNomVoieDest() {
		return manifNomVoieDest;
	}

	/**
	 * @param manifNomVoieDest the manifNomVoieDest to set
	 */
	public void setManifNomVoieDest(java.lang.String manifNomVoieDest) {
		this.manifNomVoieDest = manifNomVoieDest;
	}

	/**
	 * @return the manifNineaDest
	 */
	public java.lang.String getManifNineaDest() {
		return manifNineaDest;
	}

	/**
	 * @param manifNineaDest the manifNineaDest to set
	 */
	public void setManifNineaDest(java.lang.String manifNineaDest) {
		this.manifNineaDest = manifNineaDest;
	}

	/**
	 * @return the manifNumVoieDest
	 */
	public java.lang.String getManifNumVoieDest() {
		return manifNumVoieDest;
	}

	/**
	 * @param manifNumVoieDest the manifNumVoieDest to set
	 */
	public void setManifNumVoieDest(java.lang.String manifNumVoieDest) {
		this.manifNumVoieDest = manifNumVoieDest;
	}

	/**
	 * @return the manifQuartierDest
	 */
	public java.lang.String getManifQuartierDest() {
		return manifQuartierDest;
	}

	/**
	 * @param manifQuartierDest the manifQuartierDest to set
	 */
	public void setManifQuartierDest(java.lang.String manifQuartierDest) {
		this.manifQuartierDest = manifQuartierDest;
	}

	/**
	 * @return the manifVilleDest
	 */
	public java.lang.String getManifVilleDest() {
		return manifVilleDest;
	}

	/**
	 * @param manifVilleDest the manifVilleDest to set
	 */
	public void setManifVilleDest(java.lang.String manifVilleDest) {
		this.manifVilleDest = manifVilleDest;
	}

	/**
	 * @return the manifBpDest
	 */
	public java.lang.String getManifBpDest() {
		return manifBpDest;
	}

	/**
	 * @param manifBpDest the manifBpDest to set
	 */
	public void setManifBpDest(java.lang.String manifBpDest) {
		this.manifBpDest = manifBpDest;
	}

	/**
	 * @return the manifVilleDestDef
	 */
	public java.lang.String getManifVilleDestDef() {
		return manifVilleDestDef;
	}

	/**
	 * @param manifVilleDestDef the manifVilleDestDef to set
	 */
	public void setManifVilleDestDef(java.lang.String manifVilleDestDef) {
		this.manifVilleDestDef = manifVilleDestDef;
	}

	/**
	 * @return the manifNumTitreTransp
	 */
	public java.lang.String getManifNumTitreTransp() {
		return manifNumTitreTransp;
	}

	/**
	 * @param manifNumTitreTransp the manifNumTitreTransp to set
	 */
	public void setManifNumTitreTransp(java.lang.String manifNumTitreTransp) {
		this.manifNumTitreTransp = manifNumTitreTransp;
	}

	/**
	 * @return the manifMarquesColis
	 */
	public java.lang.String getManifMarquesColis() {
		return manifMarquesColis;
	}

	/**
	 * @param manifMarquesColis the manifMarquesColis to set
	 */
	public void setManifMarquesColis(java.lang.String manifMarquesColis) {
		this.manifMarquesColis = manifMarquesColis;
	}

	/**
	 * @return the manifDesignationCom
	 */
	public java.lang.String getManifDesignationCom() {
		return manifDesignationCom;
	}

	/**
	 * @param manifDesignationCom the manifDesignationCom to set
	 */
	public void setManifDesignationCom(java.lang.String manifDesignationCom) {
		this.manifDesignationCom = manifDesignationCom;
	}

	/**
	 * @return the manifPdsBrutManif
	 */
	public java.math.BigDecimal getManifPdsBrutManif() {
		return manifPdsBrutManif;
	}

	/**
	 * @param manifPdsBrutManif the manifPdsBrutManif to set
	 */
	public void setManifPdsBrutManif(java.math.BigDecimal manifPdsBrutManif) {
		this.manifPdsBrutManif = manifPdsBrutManif;
	}

	/**
	 * @return the manifVolume
	 */
	public java.math.BigDecimal getManifVolume() {
		return manifVolume;
	}

	/**
	 * @param manifVolume the manifVolume to set
	 */
	public void setManifVolume(java.math.BigDecimal manifVolume) {
		this.manifVolume = manifVolume;
	}

	/**
	 * @return the manifNbrColisRectif
	 */
	public java.lang.Integer getManifNbrColisRectif() {
		return manifNbrColisRectif;
	}

	/**
	 * @param manifNbrColisRectif the manifNbrColisRectif to set
	 */
	public void setManifNbrColisRectif(java.lang.Integer manifNbrColisRectif) {
		this.manifNbrColisRectif = manifNbrColisRectif;
	}

	/**
	 * @return the manifPdsBrutCoquille
	 */
	public java.math.BigDecimal getManifPdsBrutCoquille() {
		return manifPdsBrutCoquille;
	}

	/**
	 * @param manifPdsBrutCoquille the manifPdsBrutCoquille to set
	 */
	public void setManifPdsBrutCoquille(java.math.BigDecimal manifPdsBrutCoquille) {
		this.manifPdsBrutCoquille = manifPdsBrutCoquille;
	}

	/**
	 * @return the manifVolumeEcore
	 */
	public java.math.BigDecimal getManifVolumeEcore() {
		return manifVolumeEcore;
	}

	/**
	 * @param manifVolumeEcore the manifVolumeEcore to set
	 */
	public void setManifVolumeEcore(java.math.BigDecimal manifVolumeEcore) {
		this.manifVolumeEcore = manifVolumeEcore;
	}

	/**
	 * @return the manifAgentCorrection
	 */
	public java.lang.String getManifAgentCorrection() {
		return manifAgentCorrection;
	}

	/**
	 * @param manifAgentCorrection the manifAgentCorrection to set
	 */
	public void setManifAgentCorrection(java.lang.String manifAgentCorrection) {
		this.manifAgentCorrection = manifAgentCorrection;
	}

	/**
	 * @return the manifNbrColisEcores
	 */
	public java.lang.Integer getManifNbrColisEcores() {
		return manifNbrColisEcores;
	}

	/**
	 * @param manifNbrColisEcores the manifNbrColisEcores to set
	 */
	public void setManifNbrColisEcores(java.lang.Integer manifNbrColisEcores) {
		this.manifNbrColisEcores = manifNbrColisEcores;
	}

	/**
	 * @return the manifPdsBrutEcore
	 */
	public java.math.BigDecimal getManifPdsBrutEcore() {
		return manifPdsBrutEcore;
	}

	/**
	 * @param manifPdsBrutEcore the manifPdsBrutEcore to set
	 */
	public void setManifPdsBrutEcore(java.math.BigDecimal manifPdsBrutEcore) {
		this.manifPdsBrutEcore = manifPdsBrutEcore;
	}

	/**
	 * @return the manifNbrColisDeclare
	 */
	public java.lang.Integer getManifNbrColisDeclare() {
		return manifNbrColisDeclare;
	}

	/**
	 * @param manifNbrColisDeclare the manifNbrColisDeclare to set
	 */
	public void setManifNbrColisDeclare(java.lang.Integer manifNbrColisDeclare) {
		this.manifNbrColisDeclare = manifNbrColisDeclare;
	}

	/**
	 * @return the manifPdsDeclareManif
	 */
	public java.math.BigDecimal getManifPdsDeclareManif() {
		return manifPdsDeclareManif;
	}

	/**
	 * @param manifPdsDeclareManif the manifPdsDeclareManif to set
	 */
	public void setManifPdsDeclareManif(java.math.BigDecimal manifPdsDeclareManif) {
		this.manifPdsDeclareManif = manifPdsDeclareManif;
	}

	/**
	 * @return the manifNbrColisApures
	 */
	public java.lang.Integer getManifNbrColisApures() {
		return manifNbrColisApures;
	}

	/**
	 * @param manifNbrColisApures the manifNbrColisApures to set
	 */
	public void setManifNbrColisApures(java.lang.Integer manifNbrColisApures) {
		this.manifNbrColisApures = manifNbrColisApures;
	}

	/**
	 * @return the manifPdsApurPhyManif
	 */
	public java.math.BigDecimal getManifPdsApurPhyManif() {
		return manifPdsApurPhyManif;
	}

	/**
	 * @param manifPdsApurPhyManif the manifPdsApurPhyManif to set
	 */
	public void setManifPdsApurPhyManif(java.math.BigDecimal manifPdsApurPhyManif) {
		this.manifPdsApurPhyManif = manifPdsApurPhyManif;
	}

	/**
	 * @return the manifDateEmb
	 */
	public java.sql.Date getManifDateEmb() {
		return manifDateEmb;
	}

	/**
	 * @param manifDateEmb the manifDateEmb to set
	 */
	public void setManifDateEmb(java.sql.Date manifDateEmb) {
		this.manifDateEmb = manifDateEmb;
	}

	/**
	 * @return the manifIndPartiel
	 */
	public java.lang.String getManifIndPartiel() {
		return manifIndPartiel;
	}

	/**
	 * @param manifIndPartiel the manifIndPartiel to set
	 */
	public void setManifIndPartiel(java.lang.String manifIndPartiel) {
		this.manifIndPartiel = manifIndPartiel;
	}

	/**
	 * @return the manifNomDestinataire
	 */
	public java.lang.String getManifNomDestinataire() {
		return manifNomDestinataire;
	}

	/**
	 * @param manifNomDestinataire the manifNomDestinataire to set
	 */
	public void setManifNomDestinataire(java.lang.String manifNomDestinataire) {
		this.manifNomDestinataire = manifNomDestinataire;
	}

	/**
	 * @return the manifNomExpediteur
	 */
	public java.lang.String getManifNomExpediteur() {
		return manifNomExpediteur;
	}

	/**
	 * @param manifNomExpediteur the manifNomExpediteur to set
	 */
	public void setManifNomExpediteur(java.lang.String manifNomExpediteur) {
		this.manifNomExpediteur = manifNomExpediteur;
	}

	/**
	 * @return the manifJulianDateEmb
	 */
	public java.lang.Integer getManifJulianDateEmb() {
		return manifJulianDateEmb;
	}

	/**
	 * @param manifJulianDateEmb the manifJulianDateEmb to set
	 */
	public void setManifJulianDateEmb(java.lang.Integer manifJulianDateEmb) {
		this.manifJulianDateEmb = manifJulianDateEmb;
	}

	/**
	 * @return the manifNumRecond
	 */
	public java.lang.Integer getManifNumRecond() {
		return manifNumRecond;
	}

	/**
	 * @param manifNumRecond the manifNumRecond to set
	 */
	public void setManifNumRecond(java.lang.Integer manifNumRecond) {
		this.manifNumRecond = manifNumRecond;
	}

	/**
	 * @return the manifNumRecond2
	 */
	public java.lang.Integer getManifNumRecond2() {
		return manifNumRecond2;
	}

	/**
	 * @param manifNumRecond2 the manifNumRecond2 to set
	 */
	public void setManifNumRecond2(java.lang.Integer manifNumRecond2) {
		this.manifNumRecond2 = manifNumRecond2;
	}

	/**
	 * @return the manifEtatArtManif
	 */
	public java.lang.String getManifEtatArtManif() {
		return manifEtatArtManif;
	}

	/**
	 * @param manifEtatArtManif the manifEtatArtManif to set
	 */
	public void setManifEtatArtManif(java.lang.String manifEtatArtManif) {
		this.manifEtatArtManif = manifEtatArtManif;
	}

	/**
	 * @return the manifEtatDmdSurManif
	 */
	public java.lang.String getManifEtatDmdSurManif() {
		return manifEtatDmdSurManif;
	}

	/**
	 * @param manifEtatDmdSurManif the manifEtatDmdSurManif to set
	 */
	public void setManifEtatDmdSurManif(java.lang.String manifEtatDmdSurManif) {
		this.manifEtatDmdSurManif = manifEtatDmdSurManif;
	}

	/**
	 * @return the manifNumDmdSurManif
	 */
	public java.lang.Integer getManifNumDmdSurManif() {
		return manifNumDmdSurManif;
	}

	/**
	 * @param manifNumDmdSurManif the manifNumDmdSurManif to set
	 */
	public void setManifNumDmdSurManif(java.lang.Integer manifNumDmdSurManif) {
		this.manifNumDmdSurManif = manifNumDmdSurManif;
	}

	/**
	 * @return the manifAnneeDmd
	 */
	public java.lang.String getManifAnneeDmd() {
		return manifAnneeDmd;
	}

	/**
	 * @param manifAnneeDmd the manifAnneeDmd to set
	 */
	public void setManifAnneeDmd(java.lang.String manifAnneeDmd) {
		this.manifAnneeDmd = manifAnneeDmd;
	}

	/**
	 * @return the manifCodeDepot
	 */
	public java.lang.String getManifCodeDepot() {
		return manifCodeDepot;
	}

	/**
	 * @param manifCodeDepot the manifCodeDepot to set
	 */
	public void setManifCodeDepot(java.lang.String manifCodeDepot) {
		this.manifCodeDepot = manifCodeDepot;
	}

	/**
	 * @return the manifCodeOrdre
	 */
	public java.lang.String getManifCodeOrdre() {
		return manifCodeOrdre;
	}

	/**
	 * @param manifCodeOrdre the manifCodeOrdre to set
	 */
	public void setManifCodeOrdre(java.lang.String manifCodeOrdre) {
		this.manifCodeOrdre = manifCodeOrdre;
	}

	/**
	 * @return the manifNomOrdre
	 */
	public java.lang.String getManifNomOrdre() {
		return manifNomOrdre;
	}

	/**
	 * @param manifNomOrdre the manifNomOrdre to set
	 */
	public void setManifNomOrdre(java.lang.String manifNomOrdre) {
		this.manifNomOrdre = manifNomOrdre;
	}

	/**
	 * @return the manifAdresseOrdre
	 */
	public java.lang.String getManifAdresseOrdre() {
		return manifAdresseOrdre;
	}

	/**
	 * @param manifAdresseOrdre the manifAdresseOrdre to set
	 */
	public void setManifAdresseOrdre(java.lang.String manifAdresseOrdre) {
		this.manifAdresseOrdre = manifAdresseOrdre;
	}

	/**
	 * @return the manifCodeAttache
	 */
	public java.lang.String getManifCodeAttache() {
		return manifCodeAttache;
	}

	/**
	 * @param manifCodeAttache the manifCodeAttache to set
	 */
	public void setManifCodeAttache(java.lang.String manifCodeAttache) {
		this.manifCodeAttache = manifCodeAttache;
	}

	/**
	 * @return the manifNbrConteneur
	 */
	public java.lang.Integer getManifNbrConteneur() {
		return manifNbrConteneur;
	}

	/**
	 * @param manifNbrConteneur the manifNbrConteneur to set
	 */
	public void setManifNbrConteneur(java.lang.Integer manifNbrConteneur) {
		this.manifNbrConteneur = manifNbrConteneur;
	}

	/**
	 * @return the manifDestinationDef
	 */
	public java.lang.String getManifDestinationDef() {
		return manifDestinationDef;
	}

	/**
	 * @param manifDestinationDef the manifDestinationDef to set
	 */
	public void setManifDestinationDef(java.lang.String manifDestinationDef) {
		this.manifDestinationDef = manifDestinationDef;
	}

	/**
	 * @return the manifArtIndvalid
	 */
	public java.lang.String getManifArtIndvalid() {
		return manifArtIndvalid;
	}

	/**
	 * @param manifArtIndvalid the manifArtIndvalid to set
	 */
	public void setManifArtIndvalid(java.lang.String manifArtIndvalid) {
		this.manifArtIndvalid = manifArtIndvalid;
	}

	/**
	 * @return the manifDateValidArt
	 */
	public java.sql.Date getManifDateValidArt() {
		return manifDateValidArt;
	}

	/**
	 * @param manifDateValidArt the manifDateValidArt to set
	 */
	public void setManifDateValidArt(java.sql.Date manifDateValidArt) {
		this.manifDateValidArt = manifDateValidArt;
	}

	/**
	 * @return the manifDateCreationArt
	 */
	public java.sql.Date getManifDateCreationArt() {
		return manifDateCreationArt;
	}

	/**
	 * @param manifDateCreationArt the manifDateCreationArt to set
	 */
	public void setManifDateCreationArt(java.sql.Date manifDateCreationArt) {
		this.manifDateCreationArt = manifDateCreationArt;
	}

	/**
	 * @return the manifDateMajArticle
	 */
	public java.sql.Date getManifDateMajArticle() {
		return manifDateMajArticle;
	}

	/**
	 * @param manifDateMajArticle the manifDateMajArticle to set
	 */
	public void setManifDateMajArticle(java.sql.Date manifDateMajArticle) {
		this.manifDateMajArticle = manifDateMajArticle;
	}

	/**
	 * @return the manifCodeHdArticle
	 */
	public java.lang.String getManifCodeHdArticle() {
		return manifCodeHdArticle;
	}

	/**
	 * @param manifCodeHdArticle the manifCodeHdArticle to set
	 */
	public void setManifCodeHdArticle(java.lang.String manifCodeHdArticle) {
		this.manifCodeHdArticle = manifCodeHdArticle;
	}

	/**
	 * @return the manifIdPvEcor
	 */
	public java.math.BigDecimal getManifIdPvEcor() {
		return manifIdPvEcor;
	}

	/**
	 * @param manifIdPvEcor the manifIdPvEcor to set
	 */
	public void setManifIdPvEcor(java.math.BigDecimal manifIdPvEcor) {
		this.manifIdPvEcor = manifIdPvEcor;
	}

	/**
	 * @return the manifIdLieuStockage
	 */
	public java.lang.String getManifIdLieuStockage() {
		return manifIdLieuStockage;
	}

	/**
	 * @param manifIdLieuStockage the manifIdLieuStockage to set
	 */
	public void setManifIdLieuStockage(java.lang.String manifIdLieuStockage) {
		this.manifIdLieuStockage = manifIdLieuStockage;
	}

	/**
	 * @return the manifArtPpmDest
	 */
	public java.lang.String getManifArtPpmDest() {
		return manifArtPpmDest;
	}

	/**
	 * @param manifArtPpmDest the manifArtPpmDest to set
	 */
	public void setManifArtPpmDest(java.lang.String manifArtPpmDest) {
		this.manifArtPpmDest = manifArtPpmDest;
	}

	/**
	 * @return the manifIndCiblage
	 */
	public java.lang.String getManifIndCiblage() {
		return manifIndCiblage;
	}

	/**
	 * @param manifIndCiblage the manifIndCiblage to set
	 */
	public void setManifIndCiblage(java.lang.String manifIndCiblage) {
		this.manifIndCiblage = manifIndCiblage;
	}

	/**
	 * @return the manifTypeTraitement
	 */
	public java.lang.String getManifTypeTraitement() {
		return manifTypeTraitement;
	}

	/**
	 * @param manifTypeTraitement the manifTypeTraitement to set
	 */
	public void setManifTypeTraitement(java.lang.String manifTypeTraitement) {
		this.manifTypeTraitement = manifTypeTraitement;
	}

	/**
	 * @return the manifIndPrecis
	 */
	public java.lang.String getManifIndPrecis() {
		return manifIndPrecis;
	}

	/**
	 * @param manifIndPrecis the manifIndPrecis to set
	 */
	public void setManifIndPrecis(java.lang.String manifIndPrecis) {
		this.manifIndPrecis = manifIndPrecis;
	}

	/**
	 * @return the manifIndPrecis2
	 */
	public java.lang.String getManifIndPrecis2() {
		return manifIndPrecis2;
	}

	/**
	 * @param manifIndPrecis2 the manifIndPrecis2 to set
	 */
	public void setManifIndPrecis2(java.lang.String manifIndPrecis2) {
		this.manifIndPrecis2 = manifIndPrecis2;
	}

	/**
	 * @return the manifEnvoiFract
	 */
	public java.lang.String getManifEnvoiFract() {
		return manifEnvoiFract;
	}

	/**
	 * @param manifEnvoiFract the manifEnvoiFract to set
	 */
	public void setManifEnvoiFract(java.lang.String manifEnvoiFract) {
		this.manifEnvoiFract = manifEnvoiFract;
	}

	/**
	 * @return the manifIndTrsFrtTransb
	 */
	public java.lang.String getManifIndTrsFrtTransb() {
		return manifIndTrsFrtTransb;
	}

	/**
	 * @param manifIndTrsFrtTransb the manifIndTrsFrtTransb to set
	 */
	public void setManifIndTrsFrtTransb(java.lang.String manifIndTrsFrtTransb) {
		this.manifIndTrsFrtTransb = manifIndTrsFrtTransb;
	}

	/**
	 * @return the manifNbreContEcore
	 */
	public java.lang.Integer getManifNbreContEcore() {
		return manifNbreContEcore;
	}

	/**
	 * @param manifNbreContEcore the manifNbreContEcore to set
	 */
	public void setManifNbreContEcore(java.lang.Integer manifNbreContEcore) {
		this.manifNbreContEcore = manifNbreContEcore;
	}

	/**
	 * @return the manifOrigineManifeste
	 */
	public java.lang.String getManifOrigineManifeste() {
		return manifOrigineManifeste;
	}

	/**
	 * @param manifOrigineManifeste the manifOrigineManifeste to set
	 */
	public void setManifOrigineManifeste(java.lang.String manifOrigineManifeste) {
		this.manifOrigineManifeste = manifOrigineManifeste;
	}
			
	/**
	 * @return the libelleLieuEmbarq
	 */
	public String getLibelleLieuEmbarq() {
		return libelleLieuEmbarq;
	}

	public String getManifTrsftTransb() {
		return manifTrsftTransb;
	}

	public void setManifTrsftTransb(String manifTrsftTransb) {
		this.manifTrsftTransb = manifTrsftTransb;
	}	

	/**
	 * @return the libellelPaysDestination
	 */
	public String getLibellelPaysDestination() {
		return libellelPaysDestination;
	}

	/**
	 * @param libellelPaysDestination the libellelPaysDestination to set
	 */
	public void setLibellelPaysDestination(String libellelPaysDestination) {
		this.libellelPaysDestination = libellelPaysDestination;
	}

	public String getLibManifTypeTraitement() {
		
		if (manifTypeTraitement != null && manifTypeTraitement.equals(ConstManif.TYPETRAITEMENT)) {
			libManifTypeTraitement = ConstManif.LIB_TYPETRAITEMENT;
		} else if (manifTypeTraitement != null && manifTypeTraitement.equals(ConstManif.TYPETRAITEMENT_ENVOI_DMD)) {
			libManifTypeTraitement = ConstManif.LIB_TYPETRAITEMENT_ENVOI_DMD;
		} else {
			libManifTypeTraitement = manifTypeTraitement;
		}
        	
        return libManifTypeTraitement;
	}

	public void setLibManifTypeTraitement(String libManifTypeTraitement) {
		this.libManifTypeTraitement = libManifTypeTraitement;
	}	

	public List<DeclarationExt> getListeDeclarationExt() {
		return listeDeclarationExt;
	}

	public void setListeDeclarationExt(List<DeclarationExt> listeDeclarationExt) {
		this.listeDeclarationExt = listeDeclarationExt;
	}

	public DeclarationExt getDeclarationExt() {
		return declarationExt;
	}

	public void setDeclarationExt(DeclarationExt declarationExt) {
		this.declarationExt = declarationExt;
	}

	public ModeConditionnement getModeConditionnement() {
		return modeConditionnement;
	}

	public void setModeConditionnement(ModeConditionnement modeConditionnement) {
		this.modeConditionnement = modeConditionnement;
	}

	public LieuEmbarquement getLieuEmbarquement() {
		return lieuEmbarquement;
	}

	public void setLieuEmbarquement(LieuEmbarquement lieuEmbarquement) {
		this.lieuEmbarquement = lieuEmbarquement;
	}

	public BureauDouane getBureauDaoune() {
		return bureauDaoune;
	}

	public void setBureauDaoune(BureauDouane bureauDaoune) {
		this.bureauDaoune = bureauDaoune;
	}

	public Consignataire getConsignataire() {
		return consignataire;
	}

	public void setConsignataire(Consignataire consignataire) {
		this.consignataire = consignataire;
	}

	public Long getIdDeclTransfert() {
		return idDeclTransfert;
	}

	public void setIdDeclTransfert(Long idDeclTransfert) {
		this.idDeclTransfert = idDeclTransfert;
	}	

	
}