/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

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

import sn.com.douane.ejb.manifeste.model.keys.BrouillonSegenManKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.TypeManifeste;

/**
 * @author CGPID
 * 
 */
@Entity
@IdClass(BrouillonSegenManKey.class)
@Table(name = "BROUILLONSEGENMAN")
public class BrouillonSegenMan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5508266247568740225L;

	@Id
	@Column(name = "MANIFCODECONSIGNATAIRE", length = 3, nullable = false)
	private java.lang.String manifCodeConsignataire;

	@Id
	@Column(name = "MANIFANNEEENREG", length = 4, nullable = false)
	private java.lang.String manifAnneeEnreg;

	@Id
	@Column(name = "MANIFNUMREPERTOIRE", length = 6, nullable = false)
	private java.lang.String manifNumRepertoire;

	@Column(name = "MANIFBURENREG", length = 3, nullable = false)
	private java.lang.String manifBurEnreg;

	@Column(name = "MANIFBURENTREE", length = 3, nullable = false)
	private java.lang.String manifBurEntree;

	@Column(name = "MANIFTYPEMANIFESTE", nullable = false)
	private java.lang.Integer manifTypeManifeste;

	@Column(name = "MANIFNBREARTMANIFESTE", nullable = false)
	private java.lang.Integer manifNbreArtManifeste;

	@Column(name = "MANIFMOYENTRANSPORT", length = 20, nullable = false)
	private java.lang.String manifMoyenTransport;

	@Column(name = "MANIFCODEPAYSPROV", length = 3, nullable = false)
	private java.lang.String manifCodePaysProv;

	@Column(name = "MANIFDATECREATION", nullable = false)
	private java.sql.Date manifDateCreation;

	@Column(name = "MANIFDATEARRIVEE", nullable = false)
	private java.sql.Date manifDateArrivee;

	@Column(name = "MANIFNBRECONNAIS", nullable = false)
	private java.lang.Integer manifNbreConnais;

	@Column(name = "MANIFTYPENAVIRE")
	private java.lang.Integer manifTypeNavire;

	@Column(name = "MANIFMODETRANSPORT")
	private java.lang.Integer manifModeTransport;

	@Column(name = "MANIFNUMVOYAGE", length = 10)
	private java.lang.String manifNumVoyage;

	@Column(name = "MANIFJAUGEBRUTE", columnDefinition = "DECIMAL(15 , 0)")
	private java.math.BigDecimal manifJaugeBrute;

	@Column(name = "MANIFJAUGENETTE", columnDefinition = "DECIMAL(15 , 0)")
	private java.math.BigDecimal manifJaugeNette;

	@Column(name = "MANIFVALAPPROX", columnDefinition = "DECIMAL(15 , 0)")
	private java.math.BigDecimal manifValApprox;

	@Column(name = "MANIFPOIDSTOTALMANIF", columnDefinition = "DECIMAL(15 , 0)")
	private java.math.BigDecimal manifPoidsTotalManif;

	@Column(name = "MANIFPAVILLONNAVIRE", length = 3)
	private java.lang.String manifPavillonNavire;

	@Column(name = "MANIFINDPARTIEL", length = 1)
	private java.lang.String manifIndPartiel;

	@Column(name = "MANIFDERNIERARTICLE")
	private java.lang.Integer manifDernierArticle;

	@Column(name = "MANIFINDENREGENCOURS", length = 1)
	private java.lang.String manifIndEnregEnCours;

	@Column(name = "MANIFNUMLTAMEREGRP", length = 12)
	private java.lang.String manifNumLtaMereGrp;

	@Column(name = "MANIFCOMPASSIST")
	private java.lang.Integer manifCompAssist;

	@Column(name = "MANIFORIGINEMANIFESTE", length = 12)
	private java.lang.String manifOrigineManifeste;

	@Column(name = "MANIFSENSVOYAGE", nullable = false)
	private java.lang.Integer manifSensVoyage;

	@Column(name = "MANIFTONNAGEDEBARQ", columnDefinition = "DECIMAL(15 , 0)", nullable = false)
	private java.math.BigDecimal manifTonnageDebarq;

	@Column(name = "MANIFNATURECARGAIS")
	private java.lang.Integer manifNatureCargais;

	@Column(name = "MANIFDESTFISCALE", nullable = false)
	private java.lang.Integer manifDestFiscale;

	@ManyToOne(targetEntity = TypeManifeste.class)
	@JoinColumn(name = "MANIFTYPEMANIFESTE", insertable = false, updatable = false)
	private TypeManifeste typeManifeste;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "MANIFBURENREG", insertable = false, updatable = false)
	private BureauDouane bureauEnreg;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "MANIFBURENTREE", insertable = false, updatable = false)
	private BureauDouane bureauEntree;

	@ManyToOne(targetEntity = CompagnieAssistee.class)
	@JoinColumn(name = "MANIFCOMPASSIST", insertable = false, updatable = false)
	private CompagnieAssistee compagnieAssistee;

	@ManyToOne(targetEntity = Consignataire.class)
	@JoinColumn(name = "MANIFCODECONSIGNATAIRE", insertable = false, updatable = false)
	private Consignataire consignataire;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "MANIFCODEPAYSPROV", insertable = false, updatable = false)
	private Pays paysProvenance;

	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "MANIFPAVILLONNAVIRE", insertable = false, updatable = false)
	private Pays paysPavillon;

	@OneToMany(mappedBy = "brouillonSegenMan", targetEntity = BrouillonSegArt.class)
	private List<BrouillonSegArt> brouillonSegArts;

	/**
	 * 
	 */
	public BrouillonSegenMan() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnreg
	 * @param manifNumRepertoire
	 * @param manifBurEnreg
	 * @param manifBurEntree
	 * @param manifTypeManifeste
	 * @param manifNbreArtManifeste
	 * @param manifMoyenTransport
	 * @param manifCodePaysProv
	 * @param manifDateCreation
	 * @param manifDateArrivee
	 * @param manifNbreConnais
	 * @param manifTypeNavire
	 * @param manifModeTransport
	 * @param manifNumVoyage
	 * @param manifJaugeBrute
	 * @param manifJaugeNette
	 * @param manifValApprox
	 * @param manifPoidsTotalManif
	 * @param manifPavillonNavire
	 * @param manifIndPartiel
	 * @param manifDernierArticle
	 * @param manifIndEnregEnCours
	 * @param manifNumLtaMereGrp
	 * @param manifCompAssist
	 * @param manifOrigineManifeste
	 * @param brouillonSegArts
	 */
	public BrouillonSegenMan(String manifCodeConsignataire,
			String manifAnneeEnreg, String manifNumRepertoire,
			String manifBurEnreg, String manifBurEntree,
			Integer manifTypeManifeste, Integer manifNbreArtManifeste,
			String manifMoyenTransport, String manifCodePaysProv,
			Date manifDateCreation, Date manifDateArrivee,
			Integer manifNbreConnais, Integer manifTypeNavire,
			Integer manifModeTransport, String manifNumVoyage,
			BigDecimal manifJaugeBrute, BigDecimal manifJaugeNette,
			BigDecimal manifValApprox, BigDecimal manifPoidsTotalManif,
			String manifPavillonNavire, String manifIndPartiel,
			Integer manifDernierArticle, String manifIndEnregEnCours,
			String manifNumLtaMereGrp, Integer manifCompAssist,
			String manifOrigineManifeste, List<BrouillonSegArt> brouillonSegArts) {
		super();
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifNumRepertoire = manifNumRepertoire;
		this.manifBurEnreg = manifBurEnreg;
		this.manifBurEntree = manifBurEntree;
		this.manifTypeManifeste = manifTypeManifeste;
		this.manifNbreArtManifeste = manifNbreArtManifeste;
		this.manifMoyenTransport = manifMoyenTransport;
		this.manifCodePaysProv = manifCodePaysProv;
		this.manifDateCreation = manifDateCreation;
		this.manifDateArrivee = manifDateArrivee;
		this.manifNbreConnais = manifNbreConnais;
		this.manifTypeNavire = manifTypeNavire;
		this.manifModeTransport = manifModeTransport;
		this.manifNumVoyage = manifNumVoyage;
		this.manifJaugeBrute = manifJaugeBrute;
		this.manifJaugeNette = manifJaugeNette;
		this.manifValApprox = manifValApprox;
		this.manifPoidsTotalManif = manifPoidsTotalManif;
		this.manifPavillonNavire = manifPavillonNavire;
		this.manifIndPartiel = manifIndPartiel;
		this.manifDernierArticle = manifDernierArticle;
		this.manifIndEnregEnCours = manifIndEnregEnCours;
		this.manifNumLtaMereGrp = manifNumLtaMereGrp;
		this.manifCompAssist = manifCompAssist;
		this.manifOrigineManifeste = manifOrigineManifeste;
		this.brouillonSegArts = brouillonSegArts;
	}

	public BrouillonSegenMan(String manifCodeConsignataire,
			String manifAnneeEnreg, String manifNumRepertoire) {
		super();
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire
	 *            the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(
			java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
	}

	/**
	 * @return the manifAnneeEnreg
	 */
	public java.lang.String getManifAnneeEnreg() {
		return manifAnneeEnreg;
	}

	/**
	 * @param manifAnneeEnreg
	 *            the manifAnneeEnreg to set
	 */
	public void setManifAnneeEnreg(java.lang.String manifAnneeEnreg) {
		this.manifAnneeEnreg = manifAnneeEnreg;
	}

	/**
	 * @return the manifNumRepertoire
	 */
	public java.lang.String getManifNumRepertoire() {
		return manifNumRepertoire;
	}

	/**
	 * @param manifNumRepertoire
	 *            the manifNumRepertoire to set
	 */
	public void setManifNumRepertoire(java.lang.String manifNumRepertoire) {
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifBurEnreg
	 */
	public java.lang.String getManifBurEnreg() {
		return manifBurEnreg;
	}

	/**
	 * @param manifBurEnreg
	 *            the manifBurEnreg to set
	 */
	public void setManifBurEnreg(java.lang.String manifBurEnreg) {
		this.manifBurEnreg = manifBurEnreg;
	}

	/**
	 * @return the manifBurEntree
	 */
	public java.lang.String getManifBurEntree() {
		return manifBurEntree;
	}

	/**
	 * @param manifBurEntree
	 *            the manifBurEntree to set
	 */
	public void setManifBurEntree(java.lang.String manifBurEntree) {
		this.manifBurEntree = manifBurEntree;
	}

	/**
	 * @return the manifTypeManifeste
	 */
	public java.lang.Integer getManifTypeManifeste() {
		return manifTypeManifeste;
	}

	/**
	 * @param manifTypeManifeste
	 *            the manifTypeManifeste to set
	 */
	public void setManifTypeManifeste(java.lang.Integer manifTypeManifeste) {
		this.manifTypeManifeste = manifTypeManifeste;
	}

	/**
	 * @return the manifNbreArtManifeste
	 */
	public java.lang.Integer getManifNbreArtManifeste() {
		return manifNbreArtManifeste;
	}

	/**
	 * @param manifNbreArtManifeste
	 *            the manifNbreArtManifeste to set
	 */
	public void setManifNbreArtManifeste(java.lang.Integer manifNbreArtManifeste) {
		this.manifNbreArtManifeste = manifNbreArtManifeste;
	}

	/**
	 * @return the manifMoyenTransport
	 */
	public java.lang.String getManifMoyenTransport() {
		return manifMoyenTransport;
	}

	/**
	 * @param manifMoyenTransport
	 *            the manifMoyenTransport to set
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
	 * @param manifCodePaysProv
	 *            the manifCodePaysProv to set
	 */
	public void setManifCodePaysProv(java.lang.String manifCodePaysProv) {
		this.manifCodePaysProv = manifCodePaysProv;
	}

	/**
	 * @return the manifDateCreation
	 */
	public java.sql.Date getManifDateCreation() {
		return manifDateCreation;
	}

	/**
	 * @param manifDateCreation
	 *            the manifDateCreation to set
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
	 * @param manifDateArrivee
	 *            the manifDateArrivee to set
	 */
	public void setManifDateArrivee(java.sql.Date manifDateArrivee) {
		this.manifDateArrivee = manifDateArrivee;
	}

	/**
	 * @return the manifNbreConnais
	 */
	public java.lang.Integer getManifNbreConnais() {
		return manifNbreConnais;
	}

	/**
	 * @param manifNbreConnais
	 *            the manifNbreConnais to set
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
	 * @param manifTypeNavire
	 *            the manifTypeNavire to set
	 */
	public void setManifTypeNavire(java.lang.Integer manifTypeNavire) {
		this.manifTypeNavire = manifTypeNavire;
	}

	/**
	 * @return the manifModeTransport
	 */
	public java.lang.Integer getManifModeTransport() {
		return manifModeTransport;
	}

	/**
	 * @param manifModeTransport
	 *            the manifModeTransport to set
	 */
	public void setManifModeTransport(java.lang.Integer manifModeTransport) {
		this.manifModeTransport = manifModeTransport;
	}

	/**
	 * @return the manifNumVoyage
	 */
	public java.lang.String getManifNumVoyage() {
		return manifNumVoyage;
	}

	/**
	 * @param manifNumVoyage
	 *            the manifNumVoyage to set
	 */
	public void setManifNumVoyage(java.lang.String manifNumVoyage) {
		this.manifNumVoyage = manifNumVoyage;
	}

	/**
	 * @return the manifJaugeBrute
	 */
	public java.math.BigDecimal getManifJaugeBrute() {
		return manifJaugeBrute;
	}

	/**
	 * @param manifJaugeBrute
	 *            the manifJaugeBrute to set
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
	 * @param manifJaugeNette
	 *            the manifJaugeNette to set
	 */
	public void setManifJaugeNette(java.math.BigDecimal manifJaugeNette) {
		this.manifJaugeNette = manifJaugeNette;
	}

	/**
	 * @return the manifValApprox
	 */
	public java.math.BigDecimal getManifValApprox() {
		return manifValApprox;
	}

	/**
	 * @param manifValApprox
	 *            the manifValApprox to set
	 */
	public void setManifValApprox(java.math.BigDecimal manifValApprox) {
		this.manifValApprox = manifValApprox;
	}

	/**
	 * @return the manifPoidsTotalManif
	 */
	public java.math.BigDecimal getManifPoidsTotalManif() {
		return manifPoidsTotalManif;
	}

	/**
	 * @param manifPoidsTotalManif
	 *            the manifPoidsTotalManif to set
	 */
	public void setManifPoidsTotalManif(
			java.math.BigDecimal manifPoidsTotalManif) {
		this.manifPoidsTotalManif = manifPoidsTotalManif;
	}

	/**
	 * @return the manifPavillonNavire
	 */
	public java.lang.String getManifPavillonNavire() {
		return manifPavillonNavire;
	}

	/**
	 * @param manifPavillonNavire
	 *            the manifPavillonNavire to set
	 */
	public void setManifPavillonNavire(java.lang.String manifPavillonNavire) {
		this.manifPavillonNavire = manifPavillonNavire;
	}

	/**
	 * @return the manifIndPartiel
	 */
	public java.lang.String getManifIndPartiel() {
		return manifIndPartiel;
	}

	/**
	 * @param manifIndPartiel
	 *            the manifIndPartiel to set
	 */
	public void setManifIndPartiel(java.lang.String manifIndPartiel) {
		this.manifIndPartiel = manifIndPartiel;
	}

	/**
	 * @return the manifDernierArticle
	 */
	public java.lang.Integer getManifDernierArticle() {
		return manifDernierArticle;
	}

	/**
	 * @param manifDernierArticle
	 *            the manifDernierArticle to set
	 */
	public void setManifDernierArticle(java.lang.Integer manifDernierArticle) {
		this.manifDernierArticle = manifDernierArticle;
	}

	/**
	 * @return the manifIndEnregEnCours
	 */
	public java.lang.String getManifIndEnregEnCours() {
		return manifIndEnregEnCours;
	}

	/**
	 * @param manifIndEnregEnCours
	 *            the manifIndEnregEnCours to set
	 */
	public void setManifIndEnregEnCours(java.lang.String manifIndEnregEnCours) {
		this.manifIndEnregEnCours = manifIndEnregEnCours;
	}

	/**
	 * @return the manifNumLtaMereGrp
	 */
	public java.lang.String getManifNumLtaMereGrp() {
		return manifNumLtaMereGrp;
	}

	/**
	 * @param manifNumLtaMereGrp
	 *            the manifNumLtaMereGrp to set
	 */
	public void setManifNumLtaMereGrp(java.lang.String manifNumLtaMereGrp) {
		this.manifNumLtaMereGrp = manifNumLtaMereGrp;
	}

	/**
	 * @return the manifCompAssist
	 */
	public java.lang.Integer getManifCompAssist() {
		return manifCompAssist;
	}

	/**
	 * @param manifCompAssist
	 *            the manifCompAssist to set
	 */
	public void setManifCompAssist(java.lang.Integer manifCompAssist) {
		this.manifCompAssist = manifCompAssist;
	}

	/**
	 * @return the manifOrigineManifeste
	 */
	public java.lang.String getManifOrigineManifeste() {
		return manifOrigineManifeste;
	}

	/**
	 * @param manifOrigineManifeste
	 *            the manifOrigineManifeste to set
	 */
	public void setManifOrigineManifeste(java.lang.String manifOrigineManifeste) {
		this.manifOrigineManifeste = manifOrigineManifeste;
	}

	/**
	 * @return the brouillonSegArts
	 */
	public List<BrouillonSegArt> getBrouillonSegArts() {
		return brouillonSegArts;
	}

	/**
	 * @param brouillonSegArts
	 *            the brouillonSegArts to set
	 */
	public void setBrouillonSegArts(List<BrouillonSegArt> brouillonSegArts) {
		this.brouillonSegArts = brouillonSegArts;
	}

	public java.lang.Integer getManifSensVoyage() {
		return manifSensVoyage;
	}

	public void setManifSensVoyage(java.lang.Integer manifSensVoyage) {
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

	public TypeManifeste getTypeManifeste() {
		return typeManifeste;
	}

	public void setTypeManifeste(TypeManifeste typeManifeste) {
		this.typeManifeste = typeManifeste;
	}

	public BureauDouane getBureauEnreg() {
		return bureauEnreg;
	}

	public void setBureauEnreg(BureauDouane bureauEnreg) {
		this.bureauEnreg = bureauEnreg;
	}

	public BureauDouane getBureauEntree() {
		return bureauEntree;
	}

	public void setBureauEntree(BureauDouane bureauEntree) {
		this.bureauEntree = bureauEntree;
	}

	public CompagnieAssistee getCompagnieAssistee() {
		return compagnieAssistee;
	}

	public void setCompagnieAssistee(CompagnieAssistee compagnieAssistee) {
		this.compagnieAssistee = compagnieAssistee;
	}

	public Consignataire getConsignataire() {
		return consignataire;
	}

	public void setConsignataire(Consignataire consignataire) {
		this.consignataire = consignataire;
	}

	public Pays getPaysProvenance() {
		return paysProvenance;
	}

	public void setPaysProvenance(Pays paysProvenance) {
		this.paysProvenance = paysProvenance;
	}

	public Pays getPaysPavillon() {
		return paysPavillon;
	}

	public void setPaysPavillon(Pays paysPavillon) {
		this.paysPavillon = paysPavillon;
	}

}
