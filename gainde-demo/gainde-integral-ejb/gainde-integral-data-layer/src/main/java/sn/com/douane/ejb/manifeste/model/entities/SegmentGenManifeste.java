package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.demat.model.entities.Facture;
import sn.com.douane.ejb.manifeste.model.keys.SegmentGenManifesteKey;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.TypeManifeste;
import sn.com.douane.utils.ConstManif;



/**
 * @author moussakare
 *
 */
@Entity
@IdClass(SegmentGenManifesteKey.class)
@NamedQueries({
	@NamedQuery(name = "findSegmentByAnneeRepConsign", 
			query = "select object(o) from SegmentGenManifeste o where   o.manifAnneeEnregManif = ?1 and o.manifNumRep = ?2 " +
					"and  o.manifCodeConsignataire = ?3"), 
	@NamedQuery(name = "findManifesteByBurAnneeNumEnreg", 
			query = "select object(o) from SegmentGenManifeste o where  o.manifBureauEnregManif = ?1 " +
					"and  o.manifAnneeEnregManif = ?2 and  o.manifNumEnregManif = ?3"), 
	@NamedQuery(name = "findByAnneeBureau", 
			query = "select object(o) from SegmentGenManifeste o where o.manifAnneeEnregManif = ?1 " +
					"and  o.manifBureauEnregManif = ?2")})
@Table(name="SEGMENTGENMANIFESTE")

public class SegmentGenManifeste implements Serializable {

	private static final long serialVersionUID = -5913752277543789222L;

	@Id
	@Column(name="MANIFCODECONSIGNATAIRE", length=3, nullable=false)
	private java.lang.String manifCodeConsignataire;
	
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnregManif;
	
	@Id
	@Column(name="MANIFNUMREP", length=6, nullable=false)
    private java.lang.String manifNumRep;
	
	@Column(name="MANIFBUREAUENREGMANIF", length=3, nullable=false)
    private java.lang.String manifBureauEnregManif;
	
	@Column(name="MANIFBUREAUENTREEMANIF", length=3, nullable=false)
    private java.lang.String manifBureauEntreeManif;
	
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
	
	@Column(name="MANIFTYPEMANIFESTE", nullable=false)
    private java.lang.Integer manifTypeManifeste;
	
	@Column(name="MANIFNBREARTICLEMANIF")
    private java.lang.Integer manifNbreArticleManif;
	
	@Column(name="MANIFMODETRANSPORT")
    private java.lang.Integer manifModeTransport;
	
	@Column(name="MANIFMOYENTRANSPORT", columnDefinition="CHAR(20)")
    private java.lang.String manifMoyenTransport;
	
	@Column(name="MANIFCODEPAYSPROV", length=3)
    private java.lang.String manifCodePaysProv;
	
	@Column(name="MANIFCODEPAYSORIGINE", length=3)
    private java.lang.String manifCodePaysOrigine;
	
	@Column(name="MANIFSENSVOYAGE", nullable=false)
	private Integer manifSensVoyage=1; 
	
	@Column(name="MANIFTONNAGEDEBARQ", columnDefinition="DECIMAL(15 , 0)", nullable=false)
	private java.math.BigDecimal manifTonnageDebarq; 
	
	@Column(name="MANIFNBRECONNAIS", nullable=false)
    private java.lang.Integer manifNbreConnais;
	
	@Column(name="MANIFNATURECARGAIS", nullable=false)
	private java.lang.Integer manifNatureCargais = 1; 

	@Column(name="MANIFTYPENAVIRE")
    private java.lang.Integer manifTypeNavire;
	
	@Column(name="MANIFDESTFISCALE", nullable=false)
	private java.lang.Integer manifDestFiscale = 1; 
	
	@Column(name="MANIFJAUGEBRUTE",  columnDefinition="DECIMAL(15 , 0)")
    private java.math.BigDecimal manifJaugeBrute;
	
	@Column(name="MANIFJAUGENETTE",  columnDefinition="DECIMAL(15 , 0)")
    private java.math.BigDecimal manifJaugeNette;
	
	@Column(name="MANIFVALEURAPPROX",  columnDefinition="DECIMAL(15 , 0)")
    private java.math.BigDecimal manifValeurApprox;
	
	@Column(name="MANIFPOIDSTOTALMANIF",  columnDefinition="DECIMAL(15 , 0)")
    private java.math.BigDecimal manifPoidsTotalManif;
	
	@Column(name="MANIFPAVILLONNAVIRE", length=3)
    private java.lang.String manifPavillonNavire;
	
	@Column(name="MANIFINDICATEURPARTIEL", length=1)
    private java.lang.String manifIndicateurPartiel;
	
	@Column(name="MANIFAGENTECOREUR1", length=5)
    private java.lang.String manifAgentEcoreur1;
	
	@Column(name="MANIFAGENTECOREUR2", length=5)
    private java.lang.String manifAgentEcoreur2;
	
	@Column(name="MANIFDATECREATION")
    private java.sql.Date manifDateCreation;
	
	@Column(name="MANIFDATEARRIVEE")
    private java.sql.Date manifDateArrivee;
	
	@Column(name="MANIFDATEENREGMANIF")
    private java.sql.Date manifDateEnregManif;
	
	@Column(name="MANIFDATECONNAISSEMENT")
    private java.sql.Date manifDateConnaissement;
	
	@Column(name="MANIFNUMVOLVOYAGE", length=10)
    private java.lang.String manifNumVolVoyage;
	
	@Column(name="MANIFCODECIEASSISTEE", length=5)
    private java.lang.String manifCodeCieAssistee;
	
	@Column(name="MANIFTYPETRAITEMENT", length=1)
    private java.lang.String manifTypeTraitement;
	
	@Column(name="MANIFCOMPASSISTE")
    private java.lang.Integer manifCompAssiste;
	
	@Column(name="MANIFNUMLTAMEREGRP", length=12)
    private java.lang.String manifNumLtaMereGrp;
	
	@Column(name="MANIFDERNIERARTICLE")
    private java.lang.Integer manifDernierArticle;
	
	@Column(name="MANIFORIGINEMANIFESTE", length=1)
    private java.lang.String manifOrigineManifeste;
	
	@Column(name="IDFACTURE")
    private Long idFacture;
	
	@Column(name="IDOPERATION")
    private Long idOperation;
	
	@ManyToOne(targetEntity = Facture.class)
	@JoinColumn(name="IDFACTURE",referencedColumnName="IDFACTURE",insertable = false, updatable = false)
	private Facture facture;
		
	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name="MANIFCODEPAYSPROV",insertable = false, updatable = false)
	private Pays pays;
	
	@ManyToOne(targetEntity = TypeManifeste.class)
	@JoinColumn(name="MANIFTYPEMANIFESTE",insertable = false, updatable = false)
	private TypeManifeste typeManifeste;
	
	@Transient
	private String manifNumManifeste;

	/**
	 * 
	 */
	public SegmentGenManifeste() {
		// TODO Auto-generated constructor stub
	}

	public SegmentGenManifeste(String manifCodeConsignataire,
			String manifAnneeEnregManif, String manifNumRep,
			String manifBureauEnregManif, String manifBureauEntreeManif,
			Integer manifNumEnregManif, Integer manifTypeManifeste,
			Integer manifNbreArticleManif, Integer manifModeTransport,
			String manifMoyenTransport, String manifCodePaysProv,
			String manifCodePaysOrigine, Integer manifNbreConnais,
			Integer manifTypeNavire, BigDecimal manifJaugeBrute,
			BigDecimal manifJaugeNette, BigDecimal manifValeurApprox,
			BigDecimal manifPoidsTotalManif, String manifPavillonNavire,
			String manifIndicateurPartiel, String manifAgentEcoreur1,
			String manifAgentEcoreur2, Date manifDateCreation,
			Date manifDateArrivee, Date manifDateEnregManif,
			Date manifDateConnaissement, String manifNumVolVoyage,
			String manifCodeCieAssistee, String manifTypeTraitement,
			Integer manifCompAssiste, String manifNumLtaMereGrp,
			Integer manifDernierArticle, String manifOrigineManifeste,
			OrienterBurMan orienterBurMan) {
		super();
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnregManif = manifAnneeEnregManif;
		this.manifNumRep = manifNumRep;
		this.manifBureauEnregManif = manifBureauEnregManif;
		this.manifBureauEntreeManif = manifBureauEntreeManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifTypeManifeste = manifTypeManifeste;
		this.manifNbreArticleManif = manifNbreArticleManif;
		this.manifModeTransport = manifModeTransport;
		this.manifMoyenTransport = manifMoyenTransport;
		this.manifCodePaysProv = manifCodePaysProv;
		this.manifCodePaysOrigine = manifCodePaysOrigine;
		this.manifNbreConnais = manifNbreConnais;
		this.manifTypeNavire = manifTypeNavire;
		this.manifJaugeBrute = manifJaugeBrute;
		this.manifJaugeNette = manifJaugeNette;
		this.manifValeurApprox = manifValeurApprox;
		this.manifPoidsTotalManif = manifPoidsTotalManif;
		this.manifPavillonNavire = manifPavillonNavire;
		this.manifIndicateurPartiel = manifIndicateurPartiel;
		this.manifAgentEcoreur1 = manifAgentEcoreur1;
		this.manifAgentEcoreur2 = manifAgentEcoreur2;
		this.manifDateCreation = manifDateCreation;
		this.manifDateArrivee = manifDateArrivee;
		this.manifDateEnregManif = manifDateEnregManif;
		this.manifDateConnaissement = manifDateConnaissement;
		this.manifNumVolVoyage = manifNumVolVoyage;
		this.manifCodeCieAssistee = manifCodeCieAssistee;
		this.manifTypeTraitement = manifTypeTraitement;
		this.manifCompAssiste = manifCompAssiste;
		this.manifNumLtaMereGrp = manifNumLtaMereGrp;
		this.manifDernierArticle = manifDernierArticle;
		this.manifOrigineManifeste = manifOrigineManifeste;
//		this.orienterBurMan = orienterBurMan;
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
	 * @return the manifAnneeEnregManif
	 */
	public java.lang.String getManifAnneeEnregManif() {
		return manifAnneeEnregManif;
	}

	/**
	 * @param manifAnneeEnregManif the manifAnneeEnregManif to set
	 */
	public void setManifAnneeEnregManif(java.lang.String manifAnneeEnregManif) {
		this.manifAnneeEnregManif = manifAnneeEnregManif;
	}

	/**
	 * @return the manifNumRep
	 */
	public java.lang.String getManifNumRep() {
		return manifNumRep;
	}

	/**
	 * @param manifNumRep the manifNumRep to set
	 */
	public void setManifNumRep(java.lang.String manifNumRep) {
		this.manifNumRep = manifNumRep;
	}

	/**
	 * @return the manifBureauEnregManif
	 */
	public java.lang.String getManifBureauEnregManif() {
		return manifBureauEnregManif;
	}

	/**
	 * @param manifBureauEnregManif the manifBureauEnregManif to set
	 */
	public void setManifBureauEnregManif(java.lang.String manifBureauEnregManif) {
		this.manifBureauEnregManif = manifBureauEnregManif;
	}

	/**
	 * @return the manifBureauEntreeManif
	 */
	public java.lang.String getManifBureauEntreeManif() {
		return manifBureauEntreeManif;
	}

	/**
	 * @param manifBureauEntreeManif the manifBureauEntreeManif to set
	 */
	public void setManifBureauEntreeManif(java.lang.String manifBureauEntreeManif) {
		this.manifBureauEntreeManif = manifBureauEntreeManif;
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
	 * @return the manifTypeManifeste
	 */
	public java.lang.Integer getManifTypeManifeste() {
		return manifTypeManifeste;
	}

	/**
	 * @param manifTypeManifeste the manifTypeManifeste to set
	 */
	public void setManifTypeManifeste(java.lang.Integer manifTypeManifeste) {
		this.manifTypeManifeste = manifTypeManifeste;
	}

	/**
	 * @return the manifNbreArticleManif
	 */
	public java.lang.Integer getManifNbreArticleManif() {
		return manifNbreArticleManif;
	}

	/**
	 * @param manifNbreArticleManif the manifNbreArticleManif to set
	 */
	public void setManifNbreArticleManif(java.lang.Integer manifNbreArticleManif) {
		this.manifNbreArticleManif = manifNbreArticleManif;
	}

	/**
	 * @return the manifModeTransport
	 */
	public java.lang.Integer getManifModeTransport() {
		return manifModeTransport;
	}

	/**
	 * @param manifModeTransport the manifModeTransport to set
	 */
	public void setManifModeTransport(java.lang.Integer manifModeTransport) {
		this.manifModeTransport = manifModeTransport;
	}

	/**
	 * @return the manifMoyenTransport
	 */
	public java.lang.String getManifMoyenTransport() {
		return manifMoyenTransport;
	}

	/**
	 * @param manifMoyenTransport the manifMoyenTransport to set
	 */
	public void setManifMoyenTransport(java.lang.String manifMoyenTransport) {
		this.manifMoyenTransport = manifMoyenTransport;
	}

	/**
	 * @return the manifCodePaysProv
	 */
	public java.lang.String getManifCodePaysProv() {
		return manifCodePaysProv;
	}

	/**
	 * @param manifCodePaysProv the manifCodePaysProv to set
	 */
	public void setManifCodePaysProv(java.lang.String manifCodePaysProv) {
		this.manifCodePaysProv = manifCodePaysProv;
	}

	/**
	 * @return the manifCodePaysOrigine
	 */
	public java.lang.String getManifCodePaysOrigine() {
		return manifCodePaysOrigine;
	}

	/**
	 * @param manifCodePaysOrigine the manifCodePaysOrigine to set
	 */
	public void setManifCodePaysOrigine(java.lang.String manifCodePaysOrigine) {
		this.manifCodePaysOrigine = manifCodePaysOrigine;
	}

	/**
	 * @return the manifNbreConnais
	 */
	public java.lang.Integer getManifNbreConnais() {
		return manifNbreConnais;
	}

	/**
	 * @param manifNbreConnais the manifNbreConnais to set
	 */
	public void setManifNbreConnais(java.lang.Integer manifNbreConnais) {
		this.manifNbreConnais = manifNbreConnais;
	}

	/**
	 * @return the manifTypeNavire
	 */
	public java.lang.Integer getManifTypeNavire() {
		return manifTypeNavire;
	}

	/**
	 * @param manifTypeNavire the manifTypeNavire to set
	 */
	public void setManifTypeNavire(java.lang.Integer manifTypeNavire) {
		this.manifTypeNavire = manifTypeNavire;
	}

	/**
	 * @return the manifJaugeBrute
	 */
	public java.math.BigDecimal getManifJaugeBrute() {
		return manifJaugeBrute;
	}

	/**
	 * @param manifJaugeBrute the manifJaugeBrute to set
	 */
	public void setManifJaugeBrute(java.math.BigDecimal manifJaugeBrute) {
		this.manifJaugeBrute = manifJaugeBrute;
	}

	/**
	 * @return the manifJaugeNette
	 */
	public java.math.BigDecimal getManifJaugeNette() {
		return manifJaugeNette;
	}

	/**
	 * @param manifJaugeNette the manifJaugeNette to set
	 */
	public void setManifJaugeNette(java.math.BigDecimal manifJaugeNette) {
		this.manifJaugeNette = manifJaugeNette;
	}

	/**
	 * @return the manifValeurApprox
	 */
	public java.math.BigDecimal getManifValeurApprox() {
		return manifValeurApprox;
	}

	/**
	 * @param manifValeurApprox the manifValeurApprox to set
	 */
	public void setManifValeurApprox(java.math.BigDecimal manifValeurApprox) {
		this.manifValeurApprox = manifValeurApprox;
	}

	/**
	 * @return the manifPoidsTotalManif
	 */
	public java.math.BigDecimal getManifPoidsTotalManif() {
		return manifPoidsTotalManif;
	}

	/**
	 * @param manifPoidsTotalManif the manifPoidsTotalManif to set
	 */
	public void setManifPoidsTotalManif(java.math.BigDecimal manifPoidsTotalManif) {
		this.manifPoidsTotalManif = manifPoidsTotalManif;
	}

	/**
	 * @return the manifPavillonNavire
	 */
	public java.lang.String getManifPavillonNavire() {
		return manifPavillonNavire;
	}

	/**
	 * @param manifPavillonNavire the manifPavillonNavire to set
	 */
	public void setManifPavillonNavire(java.lang.String manifPavillonNavire) {
		this.manifPavillonNavire = manifPavillonNavire;
	}

	/**
	 * @return the manifIndicateurPartiel
	 */
	public java.lang.String getManifIndicateurPartiel() {
		return manifIndicateurPartiel;
	}

	/**
	 * @param manifIndicateurPartiel the manifIndicateurPartiel to set
	 */
	public void setManifIndicateurPartiel(java.lang.String manifIndicateurPartiel) {
		this.manifIndicateurPartiel = manifIndicateurPartiel;
	}

	/**
	 * @return the manifAgentEcoreur1
	 */
	public java.lang.String getManifAgentEcoreur1() {
		return manifAgentEcoreur1;
	}

	/**
	 * @param manifAgentEcoreur1 the manifAgentEcoreur1 to set
	 */
	public void setManifAgentEcoreur1(java.lang.String manifAgentEcoreur1) {
		this.manifAgentEcoreur1 = manifAgentEcoreur1;
	}

	/**
	 * @return the manifAgentEcoreur2
	 */
	public java.lang.String getManifAgentEcoreur2() {
		return manifAgentEcoreur2;
	}

	/**
	 * @param manifAgentEcoreur2 the manifAgentEcoreur2 to set
	 */
	public void setManifAgentEcoreur2(java.lang.String manifAgentEcoreur2) {
		this.manifAgentEcoreur2 = manifAgentEcoreur2;
	}

	/**
	 * @return the manifDateCreation
	 */
	public java.sql.Date getManifDateCreation() {
		return manifDateCreation;
	}

	/**
	 * @param manifDateCreation the manifDateCreation to set
	 */
	public void setManifDateCreation(java.sql.Date manifDateCreation) {
		this.manifDateCreation = manifDateCreation;
	}

	/**
	 * @return the manifDateArrivee
	 */
	public java.sql.Date getManifDateArrivee() {
		return manifDateArrivee;
	}

	/**
	 * @param manifDateArrivee the manifDateArrivee to set
	 */
	public void setManifDateArrivee(java.sql.Date manifDateArrivee) {
		this.manifDateArrivee = manifDateArrivee;
	}

	/**
	 * @return the manifDateEnregManif
	 */
	public java.sql.Date getManifDateEnregManif() {
		return manifDateEnregManif;
	}

	/**
	 * @param manifDateEnregManif the manifDateEnregManif to set
	 */
	public void setManifDateEnregManif(java.sql.Date manifDateEnregManif) {
		this.manifDateEnregManif = manifDateEnregManif;
	}

	/**
	 * @return the manifDateConnaissement
	 */
	public java.sql.Date getManifDateConnaissement() {
		return manifDateConnaissement;
	}

	/**
	 * @param manifDateConnaissement the manifDateConnaissement to set
	 */
	public void setManifDateConnaissement(java.sql.Date manifDateConnaissement) {
		this.manifDateConnaissement = manifDateConnaissement;
	}

	/**
	 * @return the manifNumVolVoyage
	 */
	public java.lang.String getManifNumVolVoyage() {
		return manifNumVolVoyage;
	}

	/**
	 * @param manifNumVolVoyage the manifNumVolVoyage to set
	 */
	public void setManifNumVolVoyage(java.lang.String manifNumVolVoyage) {
		this.manifNumVolVoyage = manifNumVolVoyage;
	}

	/**
	 * @return the manifCodeCieAssistee
	 */
	public java.lang.String getManifCodeCieAssistee() {
		return manifCodeCieAssistee;
	}

	/**
	 * @param manifCodeCieAssistee the manifCodeCieAssistee to set
	 */
	public void setManifCodeCieAssistee(java.lang.String manifCodeCieAssistee) {
		this.manifCodeCieAssistee = manifCodeCieAssistee;
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
	 * @return the manifCompAssiste
	 */
	public java.lang.Integer getManifCompAssiste() {
		return manifCompAssiste;
	}

	/**
	 * @param manifCompAssiste the manifCompAssiste to set
	 */
	public void setManifCompAssiste(java.lang.Integer manifCompAssiste) {
		this.manifCompAssiste = manifCompAssiste;
	}

	/**
	 * @return the manifNumLtaMereGrp
	 */
	public java.lang.String getManifNumLtaMereGrp() {
		return manifNumLtaMereGrp;
	}

	/**
	 * @param manifNumLtaMereGrp the manifNumLtaMereGrp to set
	 */
	public void setManifNumLtaMereGrp(java.lang.String manifNumLtaMereGrp) {
		this.manifNumLtaMereGrp = manifNumLtaMereGrp;
	}

	/**
	 * @return the manifDernierArticle
	 */
	public java.lang.Integer getManifDernierArticle() {
		return manifDernierArticle;
	}

	/**
	 * @param manifDernierArticle the manifDernierArticle to set
	 */
	public void setManifDernierArticle(java.lang.Integer manifDernierArticle) {
		this.manifDernierArticle = manifDernierArticle;
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

	public Integer getManifSensVoyage() {
		return manifSensVoyage;
	}

	public void setManifSensVoyage(Integer manifSensVoyage) {
		this.manifSensVoyage = manifSensVoyage;
	}

	public java.math.BigDecimal getManifTonnageDebarq() {
		return manifTonnageDebarq;
	}

	public void setManifTonnageDebarq(java.math.BigDecimal manifTonnageDebarq) {
		this.manifTonnageDebarq = manifTonnageDebarq;
	}

	public java.lang.Integer getManifNatureCargais() {
		return manifNatureCargais;
	}

	public void setManifNatureCargais(java.lang.Integer manifNatureCargais) {
		this.manifNatureCargais = manifNatureCargais;
	}

	public java.lang.Integer getManifDestFiscale() {
		return manifDestFiscale;
	}

	public void setManifDestFiscale(java.lang.Integer manifDestFiscale) {
		this.manifDestFiscale = manifDestFiscale;
	}
	
	public String getManifNumManifeste() {
		manifNumManifeste = manifAnneeEnregManif + ConstManif.SLASH
				+ manifBureauEnregManif + ConstManif.SLASH + manifNumEnregManif;
		return manifNumManifeste;
	}

	public void setManifNumManifeste(String manifNumManifeste) {
		this.manifNumManifeste = manifNumManifeste;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public TypeManifeste getTypeManifeste() {
		return typeManifeste;
	}

	public void setTypeManifeste(TypeManifeste typeManifeste) {
		this.typeManifeste = typeManifeste;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((manifAnneeEnregManif == null) ? 0 : manifAnneeEnregManif
						.hashCode());
		result = prime
				* result
				+ ((manifCodeConsignataire == null) ? 0
						: manifCodeConsignataire.hashCode());
		result = prime * result
				+ ((manifNumRep == null) ? 0 : manifNumRep.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		SegmentGenManifeste other = (SegmentGenManifeste) obj;
		if (manifAnneeEnregManif == null) {
			if (other.manifAnneeEnregManif != null){
				return false;
			}
		} else if (!manifAnneeEnregManif.equals(other.manifAnneeEnregManif)){
			return false;
		}
		if (manifCodeConsignataire == null) {
			if (other.manifCodeConsignataire != null){
				return false;
			}
		} else if (!manifCodeConsignataire.equals(other.manifCodeConsignataire)){
			return false;
		}
		if (manifNumRep == null) {
			if (other.manifNumRep != null){
				return false;
			}
		} else if (!manifNumRep.equals(other.manifNumRep)){
			return false;
		}
		return true;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	
	
}
