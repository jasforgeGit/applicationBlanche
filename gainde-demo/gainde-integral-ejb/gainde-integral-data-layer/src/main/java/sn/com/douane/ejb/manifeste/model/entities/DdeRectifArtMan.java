/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

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

import sn.com.douane.ejb.manifeste.model.keys.DdeRectifArtManKey;



/**
 * @author CGPID
 *
 */

@Entity
@IdClass(DdeRectifArtManKey.class)
@Table(name="DDERECTIFARTMAN")
public class DdeRectifArtMan implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1660030534022033735L;

	@Column(name="MANIFNUMREPERTOIRE", length=6)
	private java.lang.String manifNumRepertoire;
	
	@Column(name="MANIFNUMDDESURMANIF")
    private java.lang.Integer manifNumDdeSurManif;
    
	@Column(name="MANIFADRAORDRE")
    private java.lang.String manifAdrAOrdre;
    
	@Column(name="MANIFAGENTCORRECTION", length=5)
    private java.lang.String manifAgentCorrection;
    
	@Column(name="MANIFANNEEDDE", length=4)
    private java.lang.String manifAnneeDde;
    
	@Column(name="MANIFBPDESTINATAIRE", length=5)
    private java.lang.String manifBpDestinataire;
    
	@Column(name="MANIFVILLEDESTDEF", length=50)
    private java.lang.String manifVilleDestDef;
    
	@Column(name="MANIFCODECONSIGNATAIRE", length=3)
    private java.lang.String manifCodeConsignataire;
    
	@Column(name="MANIFCODEDEPOT", length=3)
    private java.lang.String manifCodeDepot;
    
	@Column(name="MANIFCODEDESTINATAIRE", length=5)
    private java.lang.String manifCodeDestinataire;
    
	@Column(name="MANIFCODEAORDREDE", length=5)
    private java.lang.String manifCodeAOrdreDe;
    
	@Column(name="MANIFCODEATTCONT", length=1)
    private java.lang.String manifCodeAttCont;
    
	@Column(name="MANIFDATEEMBARQ")
    private java.sql.Date manifDateEmbarq;
    
	@Column(name="MANIFDESIGCOMM")
    private java.lang.String manifDesigComm;
    
	@Column(name="MANIFDESTDEF", length=20)
    private java.lang.String manifDestDef;
    
	@Column(name="MANIFJULIANDATERECOND")
    private java.lang.Integer manifJulianDateRecond;
    
	@Column(name="MANIFETATARTMANIF", length=2)
    private java.lang.String manifEtatArtManif;
    
	@Column(name="MANIFETATDDESURMANIF", length=1)
    private java.lang.String manifEtatDdeSurManif;
    
	@Column(name="MANIFINDPARTIEL", length=1)
    private java.lang.String manifIndPartiel;
    
	@Column(name="MANIFCODELIEUEMBARQ", length=5)
    private java.lang.String manifCodeLieuEmbarq;
    
	@Column(name="MANIFMARQCOLIS")
    private java.lang.String manifMarqColis;
    
	@Column(name="MANIFMODECOND", length=4)
    private java.lang.String manifModeCond;
    
	@Column(name="MANIFNBRECOLISAPURES")
    private java.lang.Integer manifNbreColisApures;
    
	@Column(name="MANIFNBRECOLISDECLARES")
    private java.lang.Integer manifNbreColisDeclares;
    
	@Column(name="MANIFNBRECOLIS")
    private java.lang.Integer manifNbreColis;
    
	@Column(name="MANIFNBRECOLISRECTIF")
    private java.lang.Integer manifNbreColisRectif;
    
	@Column(name="MANIFNBRECOLISECORES")
    private java.lang.Integer manifNbreColisEcores;
    
	@Column(name="MANIFNUMVOIEDEST", length=5)
    private java.lang.String manifNumVoieDest;
    
	@Column(name="MANIFNINEADEST", length=18)
    private java.lang.String manifNineaDest;
    
	@Column(name="MANIFNOMDESTINATAIRE")
    private java.lang.String manifNomDestinataire;
    
	@Column(name="MANIFNOMEXPEDITEUR")
    private java.lang.String manifNomExpediteur;
    
	@Column(name="MANIFNOMAORDRE")
    private java.lang.String manifNomAOrdre;
    
	@Column(name="MANIFNOMVOIEDEST", length=60)
    private java.lang.String manifNomVoieDest;
    
	@Column(name="MANIFNUMRECOND")
    private java.lang.Integer manifNumRecond;
    
	@Column(name="MANIFNUMRECOND2")
    private java.lang.Integer manifNumRecond2;
    
	@Column(name="MANIFNUMTITRETRANS", length=12)
    private java.lang.String manifNumTitreTrans;
    
	@Column(name="MANIFPOIDSAPUPHYSIQ", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsApuPhysiq;
    
	@Column(name="MANIFPOIDSDECMANIF", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsDecManif;
    
	@Column(name="MANIFPOIDSBRUTCOQ", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsBrutCoq;
    
	@Column(name="MANIFPOIDSBRUTECOR", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsBrutEcor;
    
	@Column(name="MANIFPOIDSBRUTMANIF", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsBrutManif;
    
	@Column(name="MANIFQUARTIERDEST", length=50)
    private java.lang.String manifQuartierDest;
    
	@Column(name="MANIFTYPEVOIEDEST", length=60)
    private java.lang.String manifTypeVoieDest;
    
	@Column(name="MANIFVILLEDEST", length=50)
    private java.lang.String manifVilleDest;
    
	@Column(name="MANIFVOLUME",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifVolume;
    
	@Column(name="MANIFVOLUMEECOR",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifVolumeEcor;
    
	@Column(name="MANIFUSERRECTIFCOQ", length=7)
    private java.lang.String manifUserRectifCoq;
    
	@Column(name="MANIFNUMMESSAGE")
    private java.lang.Integer manifNumMessage;
    
	@Column(name="MANIFNBRECONTENEUR")
    private java.lang.Integer manifNbreConteneur;
    
	@Column(name="MANIFCODEDESTDEF", length=3)
    private java.lang.String manifCodeDestDef;
    
    @Id
    @Column(name="MANIFBURMANIF", length=3, nullable=false)
    private java.lang.String manifBureauEngManif;
    
    @Id
    @Column(name="MANIFANNEEENREG", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
    
    @Id
    @Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
    @Id
    @Column(name="MANIFNUMARTMANIF", nullable=false)
    private java.lang.Integer manifNumArticleManif;
    
    @Id
    @Column(name="MANIFPRECISARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
    @Id
    @Column(name="MANIFPRECISARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
    
    @ManyToOne(targetEntity = ArticleManifeste.class,fetch = FetchType.LAZY)
    @JoinColumns( {
	  @JoinColumn(name="MANIFBURMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
	  @JoinColumn(name="MANIFANNEEENREG", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMARTMANIF", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFPRECISARTMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFPRECISARTMANIF2", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
	  })
     private ArticleManifeste articleManifeste;
    
    @OneToMany(mappedBy = "ddeRectifArtMan", targetEntity = DdeRectifContArt.class,fetch = FetchType.LAZY)
    private List<DdeRectifContArt> ddeRectifContArt = new ArrayList<DdeRectifContArt>();
    /**
	 * 
	 */
	public DdeRectifArtMan() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param manifNumRepertoire
	 * @param manifNumDdeSurManif
	 * @param manifAdrAOrdre
	 * @param manifAgentCorrection
	 * @param manifAnneeDde
	 * @param manifBpDestinataire
	 * @param manifVilleDestDef
	 * @param manifCodeConsignataire
	 * @param manifCodeDepot
	 * @param manifCodeDestinataire
	 * @param manifCodeAOrdreDe
	 * @param manifCodeAttCont
	 * @param manifDateEmbarq
	 * @param manifDesigComm
	 * @param manifDestDef
	 * @param manifJulianDateRecond
	 * @param manifEtatArtManif
	 * @param manifEtatDdeSurManif
	 * @param manifIndPartiel
	 * @param manifCodeLieuEmbarq
	 * @param manifMarqColis
	 * @param manifModeCond
	 * @param manifNbreColisApures
	 * @param manifNbreColisDeclares
	 * @param manifNbreColis
	 * @param manifNbreColisRectif
	 * @param manifNbreColisEcores
	 * @param manifNumVoieDest
	 * @param manifNineaDest
	 * @param manifNomDestinataire
	 * @param manifNomExpediteur
	 * @param manifNomAOrdre
	 * @param manifNomVoieDest
	 * @param manifNumRecond
	 * @param manifNumRecond2
	 * @param manifNumTitreTrans
	 * @param manifPoidsApuPhysiq
	 * @param manifPoidsDecManif
	 * @param manifPoidsBrutCoq
	 * @param manifPoidsBrutEcor
	 * @param manifPoidsBrutManif
	 * @param manifQuartierDest
	 * @param manifTypeVoieDest
	 * @param manifVilleDest
	 * @param manifVolume
	 * @param manifVolumeEcor
	 * @param manifUserRectifCoq
	 * @param manifNumMessage
	 * @param manifNbreConteneur
	 * @param manifCodeDestDef
	 * @param manifBureauEngManif
	 * @param manifAnneeEngManif
	 * @param manifNumEnregManif
	 * @param manifNumArticleManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 * @param articleManifeste
	 */
	public DdeRectifArtMan(String manifNumRepertoire,
			Integer manifNumDdeSurManif, String manifAdrAOrdre,
			String manifAgentCorrection, String manifAnneeDde,
			String manifBpDestinataire, String manifVilleDestDef,
			String manifCodeConsignataire, String manifCodeDepot,
			String manifCodeDestinataire, String manifCodeAOrdreDe,
			String manifCodeAttCont, Date manifDateEmbarq,
			String manifDesigComm, String manifDestDef,
			Integer manifJulianDateRecond, String manifEtatArtManif,
			String manifEtatDdeSurManif, String manifIndPartiel,
			String manifCodeLieuEmbarq, String manifMarqColis,
			String manifModeCond, Integer manifNbreColisApures,
			Integer manifNbreColisDeclares, Integer manifNbreColis,
			Integer manifNbreColisRectif, Integer manifNbreColisEcores,
			String manifNumVoieDest, String manifNineaDest,
			String manifNomDestinataire, String manifNomExpediteur,
			String manifNomAOrdre, String manifNomVoieDest,
			Integer manifNumRecond, Integer manifNumRecond2,
			String manifNumTitreTrans, BigDecimal manifPoidsApuPhysiq,
			BigDecimal manifPoidsDecManif, BigDecimal manifPoidsBrutCoq,
			BigDecimal manifPoidsBrutEcor, BigDecimal manifPoidsBrutManif,
			String manifQuartierDest, String manifTypeVoieDest,
			String manifVilleDest, BigDecimal manifVolume,
			BigDecimal manifVolumeEcor, String manifUserRectifCoq,
			Integer manifNumMessage, Integer manifNbreConteneur,
			String manifCodeDestDef, String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2, ArticleManifeste articleManifeste) {
		super();
		this.manifNumRepertoire = manifNumRepertoire;
		this.manifNumDdeSurManif = manifNumDdeSurManif;
		this.manifAdrAOrdre = manifAdrAOrdre;
		this.manifAgentCorrection = manifAgentCorrection;
		this.manifAnneeDde = manifAnneeDde;
		this.manifBpDestinataire = manifBpDestinataire;
		this.manifVilleDestDef = manifVilleDestDef;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifCodeDepot = manifCodeDepot;
		this.manifCodeDestinataire = manifCodeDestinataire;
		this.manifCodeAOrdreDe = manifCodeAOrdreDe;
		this.manifCodeAttCont = manifCodeAttCont;
		this.manifDateEmbarq = manifDateEmbarq;
		this.manifDesigComm = manifDesigComm;
		this.manifDestDef = manifDestDef;
		this.manifJulianDateRecond = manifJulianDateRecond;
		this.manifEtatArtManif = manifEtatArtManif;
		this.manifEtatDdeSurManif = manifEtatDdeSurManif;
		this.manifIndPartiel = manifIndPartiel;
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
		this.manifMarqColis = manifMarqColis;
		this.manifModeCond = manifModeCond;
		this.manifNbreColisApures = manifNbreColisApures;
		this.manifNbreColisDeclares = manifNbreColisDeclares;
		this.manifNbreColis = manifNbreColis;
		this.manifNbreColisRectif = manifNbreColisRectif;
		this.manifNbreColisEcores = manifNbreColisEcores;
		this.manifNumVoieDest = manifNumVoieDest;
		this.manifNineaDest = manifNineaDest;
		this.manifNomDestinataire = manifNomDestinataire;
		this.manifNomExpediteur = manifNomExpediteur;
		this.manifNomAOrdre = manifNomAOrdre;
		this.manifNomVoieDest = manifNomVoieDest;
		this.manifNumRecond = manifNumRecond;
		this.manifNumRecond2 = manifNumRecond2;
		this.manifNumTitreTrans = manifNumTitreTrans;
		this.manifPoidsApuPhysiq = manifPoidsApuPhysiq;
		this.manifPoidsDecManif = manifPoidsDecManif;
		this.manifPoidsBrutCoq = manifPoidsBrutCoq;
		this.manifPoidsBrutEcor = manifPoidsBrutEcor;
		this.manifPoidsBrutManif = manifPoidsBrutManif;
		this.manifQuartierDest = manifQuartierDest;
		this.manifTypeVoieDest = manifTypeVoieDest;
		this.manifVilleDest = manifVilleDest;
		this.manifVolume = manifVolume;
		this.manifVolumeEcor = manifVolumeEcor;
		this.manifUserRectifCoq = manifUserRectifCoq;
		this.manifNumMessage = manifNumMessage;
		this.manifNbreConteneur = manifNbreConteneur;
		this.manifCodeDestDef = manifCodeDestDef;
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	//	this.articleManifeste = articleManifeste;
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
	 * @return the manifNumDdeSurManif
	 */
	public java.lang.Integer getManifNumDdeSurManif() {
		return manifNumDdeSurManif;
	}

	/**
	 * @param manifNumDdeSurManif the manifNumDdeSurManif to set
	 */
	public void setManifNumDdeSurManif(java.lang.Integer manifNumDdeSurManif) {
		this.manifNumDdeSurManif = manifNumDdeSurManif;
	}

	/**
	 * @return the manifAdrAOrdre
	 */
	public java.lang.String getManifAdrAOrdre() {
		return manifAdrAOrdre;
	}

	/**
	 * @param manifAdrAOrdre the manifAdrAOrdre to set
	 */
	public void setManifAdrAOrdre(java.lang.String manifAdrAOrdre) {
		this.manifAdrAOrdre = manifAdrAOrdre;
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
	 * @return the manifAnneeDde
	 */
	public java.lang.String getManifAnneeDde() {
		return manifAnneeDde;
	}

	/**
	 * @param manifAnneeDde the manifAnneeDde to set
	 */
	public void setManifAnneeDde(java.lang.String manifAnneeDde) {
		this.manifAnneeDde = manifAnneeDde;
	}

	/**
	 * @return the manifBpDestinataire
	 */
	public java.lang.String getManifBpDestinataire() {
		return manifBpDestinataire;
	}

	/**
	 * @param manifBpDestinataire the manifBpDestinataire to set
	 */
	public void setManifBpDestinataire(java.lang.String manifBpDestinataire) {
		this.manifBpDestinataire = manifBpDestinataire;
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
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
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
	 * @return the manifCodeDestinataire
	 */
	public java.lang.String getManifCodeDestinataire() {
		return manifCodeDestinataire;
	}

	/**
	 * @param manifCodeDestinataire the manifCodeDestinataire to set
	 */
	public void setManifCodeDestinataire(java.lang.String manifCodeDestinataire) {
		this.manifCodeDestinataire = manifCodeDestinataire;
	}

	/**
	 * @return the manifCodeAOrdreDe
	 */
	public java.lang.String getManifCodeAOrdreDe() {
		return manifCodeAOrdreDe;
	}

	/**
	 * @param manifCodeAOrdreDe the manifCodeAOrdreDe to set
	 */
	public void setManifCodeAOrdreDe(java.lang.String manifCodeAOrdreDe) {
		this.manifCodeAOrdreDe = manifCodeAOrdreDe;
	}

	/**
	 * @return the manifCodeAttCont
	 */
	public java.lang.String getManifCodeAttCont() {
		return manifCodeAttCont;
	}

	/**
	 * @param manifCodeAttCont the manifCodeAttCont to set
	 */
	public void setManifCodeAttCont(java.lang.String manifCodeAttCont) {
		this.manifCodeAttCont = manifCodeAttCont;
	}

	/**
	 * @return the manifDateEmbarq
	 */
	public java.sql.Date getManifDateEmbarq() {
		return manifDateEmbarq;
	}

	/**
	 * @param manifDateEmbarq the manifDateEmbarq to set
	 */
	public void setManifDateEmbarq(java.sql.Date manifDateEmbarq) {
		this.manifDateEmbarq = manifDateEmbarq;
	}

	/**
	 * @return the manifDesigComm
	 */
	public java.lang.String getManifDesigComm() {
		return manifDesigComm;
	}

	/**
	 * @param manifDesigComm the manifDesigComm to set
	 */
	public void setManifDesigComm(java.lang.String manifDesigComm) {
		this.manifDesigComm = manifDesigComm;
	}

	/**
	 * @return the manifDestDef
	 */
	public java.lang.String getManifDestDef() {
		return manifDestDef;
	}

	/**
	 * @param manifDestDef the manifDestDef to set
	 */
	public void setManifDestDef(java.lang.String manifDestDef) {
		this.manifDestDef = manifDestDef;
	}

	/**
	 * @return the manifJulianDateRecond
	 */
	public java.lang.Integer getManifJulianDateRecond() {
		return manifJulianDateRecond;
	}

	/**
	 * @param manifJulianDateRecond the manifJulianDateRecond to set
	 */
	public void setManifJulianDateRecond(java.lang.Integer manifJulianDateRecond) {
		this.manifJulianDateRecond = manifJulianDateRecond;
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
	 * @return the manifEtatDdeSurManif
	 */
	public java.lang.String getManifEtatDdeSurManif() {
		return manifEtatDdeSurManif;
	}

	/**
	 * @param manifEtatDdeSurManif the manifEtatDdeSurManif to set
	 */
	public void setManifEtatDdeSurManif(java.lang.String manifEtatDdeSurManif) {
		this.manifEtatDdeSurManif = manifEtatDdeSurManif;
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
	 * @return the manifCodeLieuEmbarq
	 */
	public java.lang.String getManifCodeLieuEmbarq() {
		return manifCodeLieuEmbarq;
	}

	/**
	 * @param manifCodeLieuEmbarq the manifCodeLieuEmbarq to set
	 */
	public void setManifCodeLieuEmbarq(java.lang.String manifCodeLieuEmbarq) {
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
	}

	/**
	 * @return the manifMarqColis
	 */
	public java.lang.String getManifMarqColis() {
		return manifMarqColis;
	}

	/**
	 * @param manifMarqColis the manifMarqColis to set
	 */
	public void setManifMarqColis(java.lang.String manifMarqColis) {
		this.manifMarqColis = manifMarqColis;
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
	 * @return the manifNbreColisApures
	 */
	public java.lang.Integer getManifNbreColisApures() {
		return manifNbreColisApures;
	}

	/**
	 * @param manifNbreColisApures the manifNbreColisApures to set
	 */
	public void setManifNbreColisApures(java.lang.Integer manifNbreColisApures) {
		this.manifNbreColisApures = manifNbreColisApures;
	}

	/**
	 * @return the manifNbreColisDeclares
	 */
	public java.lang.Integer getManifNbreColisDeclares() {
		return manifNbreColisDeclares;
	}

	/**
	 * @param manifNbreColisDeclares the manifNbreColisDeclares to set
	 */
	public void setManifNbreColisDeclares(java.lang.Integer manifNbreColisDeclares) {
		this.manifNbreColisDeclares = manifNbreColisDeclares;
	}

	/**
	 * @return the manifNbreColis
	 */
	public java.lang.Integer getManifNbreColis() {
		return manifNbreColis;
	}

	/**
	 * @param manifNbreColis the manifNbreColis to set
	 */
	public void setManifNbreColis(java.lang.Integer manifNbreColis) {
		this.manifNbreColis = manifNbreColis;
	}

	/**
	 * @return the manifNbreColisRectif
	 */
	public java.lang.Integer getManifNbreColisRectif() {
		return manifNbreColisRectif;
	}

	/**
	 * @param manifNbreColisRectif the manifNbreColisRectif to set
	 */
	public void setManifNbreColisRectif(java.lang.Integer manifNbreColisRectif) {
		this.manifNbreColisRectif = manifNbreColisRectif;
	}

	/**
	 * @return the manifNbreColisEcores
	 */
	public java.lang.Integer getManifNbreColisEcores() {
		return manifNbreColisEcores;
	}

	/**
	 * @param manifNbreColisEcores the manifNbreColisEcores to set
	 */
	public void setManifNbreColisEcores(java.lang.Integer manifNbreColisEcores) {
		this.manifNbreColisEcores = manifNbreColisEcores;
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
	 * @return the manifNomAOrdre
	 */
	public java.lang.String getManifNomAOrdre() {
		return manifNomAOrdre;
	}

	/**
	 * @param manifNomAOrdre the manifNomAOrdre to set
	 */
	public void setManifNomAOrdre(java.lang.String manifNomAOrdre) {
		this.manifNomAOrdre = manifNomAOrdre;
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
	 * @return the manifnumtitretrans
	 */
	public java.lang.String getManifnumtitretrans() {
		return manifNumTitreTrans;
	}

	/**
	 * @param manifnumtitretrans the manifnumtitretrans to set
	 */
	public void setManifnumtitretrans(java.lang.String manifnumtitretrans) {
		this.manifNumTitreTrans = manifnumtitretrans;
	}

	/**
	 * @return the manifPoidsApuPhysiq
	 */
	public java.math.BigDecimal getManifPoidsApuPhysiq() {
		return manifPoidsApuPhysiq;
	}

	/**
	 * @param manifPoidsApuPhysiq the manifPoidsApuPhysiq to set
	 */
	public void setManifPoidsApuPhysiq(java.math.BigDecimal manifPoidsApuPhysiq) {
		this.manifPoidsApuPhysiq = manifPoidsApuPhysiq;
	}

	/**
	 * @return the manifPoidsDecManif
	 */
	public java.math.BigDecimal getManifPoidsDecManif() {
		return manifPoidsDecManif;
	}

	/**
	 * @param manifPoidsDecManif the manifPoidsDecManif to set
	 */
	public void setManifPoidsDecManif(java.math.BigDecimal manifPoidsDecManif) {
		this.manifPoidsDecManif = manifPoidsDecManif;
	}

	/**
	 * @return the manifPoidsBrutCoq
	 */
	public java.math.BigDecimal getManifPoidsBrutCoq() {
		return manifPoidsBrutCoq;
	}

	/**
	 * @param manifPoidsBrutCoq the manifPoidsBrutCoq to set
	 */
	public void setManifPoidsBrutCoq(java.math.BigDecimal manifPoidsBrutCoq) {
		this.manifPoidsBrutCoq = manifPoidsBrutCoq;
	}

	/**
	 * @return the manifPoidsBrutEcor
	 */
	public java.math.BigDecimal getManifPoidsBrutEcor() {
		return manifPoidsBrutEcor;
	}

	/**
	 * @param manifPoidsBrutEcor the manifPoidsBrutEcor to set
	 */
	public void setManifPoidsBrutEcor(java.math.BigDecimal manifPoidsBrutEcor) {
		this.manifPoidsBrutEcor = manifPoidsBrutEcor;
	}

	/**
	 * @return the manifPoidsBrutManif
	 */
	public java.math.BigDecimal getManifPoidsBrutManif() {
		return manifPoidsBrutManif;
	}

	/**
	 * @param manifPoidsBrutManif the manifPoidsBrutManif to set
	 */
	public void setManifPoidsBrutManif(java.math.BigDecimal manifPoidsBrutManif) {
		this.manifPoidsBrutManif = manifPoidsBrutManif;
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
	 * @return the manifTypeVoieDest
	 */
	public java.lang.String getManifTypeVoieDest() {
		return manifTypeVoieDest;
	}

	/**
	 * @param manifTypeVoieDest the manifTypeVoieDest to set
	 */
	public void setManifTypeVoieDest(java.lang.String manifTypeVoieDest) {
		this.manifTypeVoieDest = manifTypeVoieDest;
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
	 * @return the manifVolumeEcor
	 */
	public java.math.BigDecimal getManifVolumeEcor() {
		return manifVolumeEcor;
	}

	/**
	 * @param manifVolumeEcor the manifVolumeEcor to set
	 */
	public void setManifVolumeEcor(java.math.BigDecimal manifVolumeEcor) {
		this.manifVolumeEcor = manifVolumeEcor;
	}

	/**
	 * @return the manifUserRectifCoq
	 */
	public java.lang.String getManifUserRectifCoq() {
		return manifUserRectifCoq;
	}

	/**
	 * @param manifUserRectifCoq the manifUserRectifCoq to set
	 */
	public void setManifUserRectifCoq(java.lang.String manifUserRectifCoq) {
		this.manifUserRectifCoq = manifUserRectifCoq;
	}

	/**
	 * @return the manifNumMessage
	 */
	public java.lang.Integer getManifNumMessage() {
		return manifNumMessage;
	}

	/**
	 * @param manifNumMessage the manifNumMessage to set
	 */
	public void setManifNumMessage(java.lang.Integer manifNumMessage) {
		this.manifNumMessage = manifNumMessage;
	}

	/**
	 * @return the manifNbreConteneur
	 */
	public java.lang.Integer getManifNbreConteneur() {
		return manifNbreConteneur;
	}

	/**
	 * @param manifNbreConteneur the manifNbreConteneur to set
	 */
	public void setManifNbreConteneur(java.lang.Integer manifNbreConteneur) {
		this.manifNbreConteneur = manifNbreConteneur;
	}

	/**
	 * @return the manifCodeDestDef
	 */
	public java.lang.String getManifCodeDestDef() {
		return manifCodeDestDef;
	}

	/**
	 * @param manifCodeDestDef the manifCodeDestDef to set
	 */
	public void setManifCodeDestDef(java.lang.String manifCodeDestDef) {
		this.manifCodeDestDef = manifCodeDestDef;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBureauEngManif() {
		return manifBureauEngManif;
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
	 * @return the artdrectifart
	 */


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
	 * @return the dderectifcontart
	 */


	/**
	 * @return the articleManifeste
	 */
	public ArticleManifeste getArticleManifeste() {
		return articleManifeste;
	}


	/**
	 * @param articleManifeste the articleManifeste to set
	 */
	public void setArticleManifeste(ArticleManifeste articleManifeste) {
		this.articleManifeste = articleManifeste;
	}


	/**
	 * @return the ddeRectifContArt
	 */
	public List<DdeRectifContArt> getDdeRectifContArt() {
		return ddeRectifContArt;
	}


	/**
	 * @param ddeRectifContArt the ddeRectifContArt to set
	 */
	public void setDdeRectifContArt(List<DdeRectifContArt> ddeRectifContArt) {
		this.ddeRectifContArt = ddeRectifContArt;
	}
    
    
    
    

}
