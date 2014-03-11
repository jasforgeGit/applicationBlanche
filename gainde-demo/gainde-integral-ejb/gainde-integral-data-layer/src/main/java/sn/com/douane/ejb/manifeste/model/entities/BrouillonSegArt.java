/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
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
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.BrouillonSegArtKey;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.ejb.rc.model.entities.ModeConditionnement;
import sn.com.douane.ejb.rc.model.entities.Pays;

/**
 * @author CGPID
 *
 */

@Entity
@IdClass(BrouillonSegArtKey.class)
@NamedQueries({
	@NamedQuery(name = "findArticlesAEnregistrer", 
			query = "select object(o) from BrouillonSegArt o where o.manifNumRepertoire = ?1 " +
					"and o.manifAnneeEnreg = ?2 and o.manifCodeConsignataire = ?3 " +
					"and o.manifNumArt NOT IN (select c.manifNumArt from BrouillonSegArt c where o.manifIndPrecis = '0' " +
												"and o.manifCodeConsignataire = c.manifCodeConsignataire and o.manifNumRepertoire = c.manifNumRepertoire " +
												"and o.manifAnneeEnreg = c.manifAnneeEnreg and c.manifCodeLieuEmbarq = o.manifCodeLieuEmbarq and c.manifNumArt = o.manifNumArt) " +
					"ORDER BY o.manifNumRepertoire,o.manifNumArt,o.manifPrecArtManif ASC"), 
	@NamedQuery(name = "findArticlesEnCoursDegrp", 
			query = "select object(o) from BrouillonSegArt o where  o.manifCodeConsignataire = ?1 " +
					"and  o.manifAnneeEnreg = ?2 and  o.manifNumRepertoire = ?3  and o.manifIndPrecis = '0' "), 
	@NamedQuery(name = "findArticleOfBrouillonManifeste", 
			query = "select object(o) from BrouillonSegArt o where o.manifNumRepertoire = ?1 and o.manifAnneeEnreg = ?2 " +
					"and o.manifCodeConsignataire = ?3 order by o.manifNumArt,o.manifPrecArtManif ASC")
	})


			
@Table(name="BROUILLONSEGART")			
public class BrouillonSegArt implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="MANIFCODECONSIG", length=3, nullable=false)
    private java.lang.String manifCodeConsignataire;
    
	@Id
	@Column(name="MANIFANNEEENREG", length=4, nullable=false)
    private java.lang.String manifAnneeEnreg;
    
	@Id
	@Column(name="MANIFNUMREP", length=6, nullable=false)
    private java.lang.String manifNumRepertoire;

	@Id
	@Column(name="MANIFCODELIEUEMBARQ", length=5, nullable=false)
	private java.lang.String manifCodeLieuEmbarq;
	
	@Id
	@Column(name="MANIFNUMART", nullable=false)
    private java.lang.Integer manifNumArt;
    
	@Id
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecArtManif;
    
	@Column(name="MANIFDATEEMBARQ")
    private java.sql.Date manifDateEmbarq;
    
	@Column(name="MANIFNUMTITRETRANSPORT", length=12)
    private java.lang.String manifNumTitreTransport;
    
	@Column(name="MANIFCODEPAYSDEST", length=3)
    private java.lang.String manifCodePaysDest;
    
	@Column(name="MANIFEXPEDITEUR", length=50)
    private java.lang.String manifExpediteur;
    
	@Column(name="MANIFVILLEDESTINATION")
    private java.lang.String manifVilleDestination;
    
	@Column(name="MANIFDESIGCOMM")
    private java.lang.String manifDesigComm;
    
	@Column(name="MANIFTYPEVOIEDESTINATAIRE", length=60)
    private java.lang.String manifTypeVoieDestinataire;
    
	@Column(name="MANIFQUARTDESTINATAIRE", length=50)
    private java.lang.String manifQuartDestinataire;
    
	@Column(name="MANIFNUMVOIEDESTINATAIRE", length=5)
    private java.lang.String manifNumVoieDestinataire;
    
	@Column(name="MANIFNINEADESTINATAIRE", length=18)
    private java.lang.String manifNineaDestinataire;
    
	@Column(name="MANIFCODEDESTINATAIRE", length=5)
    private java.lang.String manifCodeDestinataire;
    
	@Column(name="MANIFNOMVOIEDESTINATAIRE", length=25)
    private java.lang.String manifNomVoieDestinataire;
    
	@Column(name="MANIFBPDESTINATAIRE", length=5)
    private java.lang.String manifBpDestinataire;
    
	@Column(name="MANIFVILLEDESTINATAIRE", length=50)
    private java.lang.String manifVilleDestinataire;
    
	@Column(name="MANIFNOMAORDREDE")
    private java.lang.String manifNomAOrdreDe;
    
	@Column(name="MANIFADRAORDREDE")
    private java.lang.String manifAdrAOrdreDe;
    
	@Column(name="MANIFCODEAORDREDE", length=5)
    private java.lang.String manifCodeAOrdreDe;
    
	@Column(name="MANIFMARQUESCOLIS")
    private java.lang.String manifMarquesColis;
    
	@Column(name="MANIFNBRECOLIS")
    private java.lang.Integer manifNbreColis;
    
	@Column(name="MANIFNBRECONTENEUR")
    private java.lang.Integer manifNbreConteneur;
    
	@Column(name="MANIFPOIDSBRUT", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsBrut;
    
	@Column(name="MANIFVOLUME", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifVolume;
    
	@Column(name="MANIFDESIGNATIONCOLIS")
    private java.lang.String manifDesignationColis;
    
	@Column(name="MANIFMODECONDITION", length=4)
    private java.lang.String manifModeCondition;
    
	@Column(name="MANIFCODERECTIF")
    private java.lang.Integer manifCodeRectif;
    
	@Column(name="MANIFINDPARTIEL", length=1)
    private java.lang.String manifIndPartiel;
    
	@Column(name="MANIFVILLEDESTDEF", length=50)
    private java.lang.String manifVilleDestDef;
    
	@Column(name="MANIFNOMDESTINATAIRE")
    private java.lang.String manifNomDestinataire;
    
	@Column(name="MANIFNOMEXPEDITEUR")
    private java.lang.String manifNomExpediteur;
    
	@Column(name="MANIFENVOIFRACT", length=1)
    private java.lang.String manifEnvoiFract;
    
	@Column(name="MANIFINDPRECIS", length=1)
    private java.lang.String manifIndPrecis;
    
	@Column(name="MANIFUSERCREATEUR", length=7)
    private java.lang.String manifUserCreateur;
    
	@Column(name="MANIFORIGINEMANIFESTE", length=1)
    private java.lang.String manifOrigineManifeste;
    
	@ManyToOne(targetEntity = BrouillonSegenMan.class)
    @JoinColumns( value = {
	  @JoinColumn(name="MANIFCODECONSIG", referencedColumnName="MANIFCODECONSIGNATAIRE", insertable=false, updatable=false), 
	  @JoinColumn(name="MANIFANNEEENREG", referencedColumnName="MANIFANNEEENREG", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMREP", referencedColumnName="MANIFNUMREPERTOIRE", insertable=false, updatable=false)
      })      
    private BrouillonSegenMan brouillonSegenMan;
	
	@ManyToOne(targetEntity = ModeConditionnement.class)	
	@JoinColumn(name = "MANIFMODECONDITION", insertable = false, updatable = false)
	private ModeConditionnement modeConditionnement;
	
	@ManyToOne(targetEntity = Pays.class)	
	@JoinColumn(name = "MANIFCODEPAYSDEST", insertable = false, updatable = false)
	private Pays pays;
    
	@OneToMany(mappedBy = "brouillonSegArt", targetEntity = BrouillonConteneurArt.class)
    private List<BrouillonConteneurArt> brouillonConteneurArts;

	/**
	 * 
	 */
	public BrouillonSegArt() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the manifNumArt
	 */
	public java.lang.Integer getManifNumArt() {
		return manifNumArt;
	}

	/**
	 * @param manifNumArt the manifNumArt to set
	 */
	public void setManifNumArt(java.lang.Integer manifNumArt) {
		this.manifNumArt = manifNumArt;
	}

	/**
	 * @return the manifPrecArtManif
	 */
	public java.lang.Integer getManifPrecArtManif() {
		return manifPrecArtManif;
	}

	/**
	 * @param manifPrecArtManif the manifPrecArtManif to set
	 */
	public void setManifPrecArtManif(java.lang.Integer manifPrecArtManif) {
		this.manifPrecArtManif = manifPrecArtManif;
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
	 * @return the manifNumTitreTransport
	 */
	public java.lang.String getManifNumTitreTransport() {
		return manifNumTitreTransport;
	}

	/**
	 * @param manifNumTitreTransport the manifNumTitreTransport to set
	 */
	public void setManifNumTitreTransport(java.lang.String manifNumTitreTransport) {
		this.manifNumTitreTransport = manifNumTitreTransport;
	}

	/**
	 * @return the manifCodePaysDest
	 */
	public java.lang.String getManifCodePaysDest() {
		return manifCodePaysDest;
	}

	/**
	 * @param manifCodePaysDest the manifCodePaysDest to set
	 */
	public void setManifCodePaysDest(java.lang.String manifCodePaysDest) {
		this.manifCodePaysDest = manifCodePaysDest;
	}

	/**
	 * @return the manifExpediteur
	 */
	public java.lang.String getManifExpediteur() {
		return manifExpediteur;
	}

	/**
	 * @param manifExpediteur the manifExpediteur to set
	 */
	public void setManifExpediteur(java.lang.String manifExpediteur) {
		this.manifExpediteur = manifExpediteur;
	}

	/**
	 * @return the manifVilleDestination
	 */
	public java.lang.String getManifVilleDestination() {
		return manifVilleDestination;
	}

	/**
	 * @param manifVilleDestination the manifVilleDestination to set
	 */
	public void setManifVilleDestination(java.lang.String manifVilleDestination) {
		this.manifVilleDestination = manifVilleDestination;
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
	 * @return the manifTypeVoieDestinataire
	 */
	public java.lang.String getManifTypeVoieDestinataire() {
		return manifTypeVoieDestinataire;
	}

	/**
	 * @param manifTypeVoieDestinataire the manifTypeVoieDestinataire to set
	 */
	public void setManifTypeVoieDestinataire(
			java.lang.String manifTypeVoieDestinataire) {
		this.manifTypeVoieDestinataire = manifTypeVoieDestinataire;
	}

	/**
	 * @return the manifQuartDestinataire
	 */
	public java.lang.String getManifQuartDestinataire() {
		return manifQuartDestinataire;
	}

	/**
	 * @param manifQuartDestinataire the manifQuartDestinataire to set
	 */
	public void setManifQuartDestinataire(java.lang.String manifQuartDestinataire) {
		this.manifQuartDestinataire = manifQuartDestinataire;
	}

	/**
	 * @return the manifNumVoieDestinataire
	 */
	public java.lang.String getManifNumVoieDestinataire() {
		return manifNumVoieDestinataire;
	}

	/**
	 * @param manifNumVoieDestinataire the manifNumVoieDestinataire to set
	 */
	public void setManifNumVoieDestinataire(
			java.lang.String manifNumVoieDestinataire) {
		this.manifNumVoieDestinataire = manifNumVoieDestinataire;
	}

	/**
	 * @return the manifNineaDestinataire
	 */
	public java.lang.String getManifNineaDestinataire() {
		return manifNineaDestinataire;
	}

	/**
	 * @param manifNineaDestinataire the manifNineaDestinataire to set
	 */
	public void setManifNineaDestinataire(java.lang.String manifNineaDestinataire) {
		this.manifNineaDestinataire = manifNineaDestinataire;
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
	 * @return the manifNomVoieDestinataire
	 */
	public java.lang.String getManifNomVoieDestinataire() {
		return manifNomVoieDestinataire;
	}

	/**
	 * @param manifNomVoieDestinataire the manifNomVoieDestinataire to set
	 */
	public void setManifNomVoieDestinataire(
			java.lang.String manifNomVoieDestinataire) {
		this.manifNomVoieDestinataire = manifNomVoieDestinataire;
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
	 * @return the manifVilleDestinataire
	 */
	public java.lang.String getManifVilleDestinataire() {
		return manifVilleDestinataire;
	}

	/**
	 * @param manifVilleDestinataire the manifVilleDestinataire to set
	 */
	public void setManifVilleDestinataire(java.lang.String manifVilleDestinataire) {
		this.manifVilleDestinataire = manifVilleDestinataire;
	}

	/**
	 * @return the manifNomAOrdreDe
	 */
	public java.lang.String getManifNomAOrdreDe() {
		return manifNomAOrdreDe;
	}

	/**
	 * @param manifNomAOrdreDe the manifNomAOrdreDe to set
	 */
	public void setManifNomAOrdreDe(java.lang.String manifNomAOrdreDe) {
		this.manifNomAOrdreDe = manifNomAOrdreDe;
	}

	/**
	 * @return the manifAdrAOrdreDe
	 */
	public java.lang.String getManifAdrAOrdreDe() {
		return manifAdrAOrdreDe;
	}

	/**
	 * @param manifAdrAOrdreDe the manifAdrAOrdreDe to set
	 */
	public void setManifAdrAOrdreDe(java.lang.String manifAdrAOrdreDe) {
		this.manifAdrAOrdreDe = manifAdrAOrdreDe;
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
	 * @return the manifPoidsBrut
	 */
	public java.math.BigDecimal getManifPoidsBrut() {
		return manifPoidsBrut;
	}

	/**
	 * @param manifPoidsBrut the manifPoidsBrut to set
	 */
	public void setManifPoidsBrut(java.math.BigDecimal manifPoidsBrut) {
		this.manifPoidsBrut = manifPoidsBrut;
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
	 * @return the manifDesignationColis
	 */
	public java.lang.String getManifDesignationColis() {
		return manifDesignationColis;
	}

	/**
	 * @param manifDesignationColis the manifDesignationColis to set
	 */
	public void setManifDesignationColis(java.lang.String manifDesignationColis) {
		this.manifDesignationColis = manifDesignationColis;
	}

	/**
	 * @return the manifModeCondition
	 */
	public java.lang.String getManifModeCondition() {
		return manifModeCondition;
	}

	/**
	 * @param manifModeCondition the manifModeCondition to set
	 */
	public void setManifModeCondition(java.lang.String manifModeCondition) {
		this.manifModeCondition = manifModeCondition;
	}

	/**
	 * @return the manifCodeRectif
	 */
	public java.lang.Integer getManifCodeRectif() {
		return manifCodeRectif;
	}

	/**
	 * @param manifCodeRectif the manifCodeRectif to set
	 */
	public void setManifCodeRectif(java.lang.Integer manifCodeRectif) {
		this.manifCodeRectif = manifCodeRectif;
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
	 * @return the manifAnneeEnreg
	 */
	public java.lang.String getManifAnneeEnreg() {
		return manifAnneeEnreg;
	}

	/**
	 * @param manifAnneeEnreg the manifAnneeEnreg to set
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
	 * @param manifNumRepertoire the manifNumRepertoire to set
	 */
	public void setManifNumRepertoire(java.lang.String manifNumRepertoire) {
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifUserCreateur
	 */
	public java.lang.String getManifUserCreateur() {
		return manifUserCreateur;
	}

	/**
	 * @param manifUserCreateur the manifUserCreateur to set
	 */
	public void setManifUserCreateur(java.lang.String manifUserCreateur) {
		this.manifUserCreateur = manifUserCreateur;
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
	 * @return the brouillonSegenMan
	 */
	public BrouillonSegenMan getBrouillonSegenMan() {
		return brouillonSegenMan;
	}

	/**
	 * @param brouillonSegenMan the brouillonSegenMan to set
	 */
	public void setBrouillonSegenMan(BrouillonSegenMan brouillonSegenMan) {
		this.brouillonSegenMan = brouillonSegenMan;
	}

	/**
	 * @return the brouillonConteneurArts
	 */
	public List<BrouillonConteneurArt> getBrouillonConteneurArts() {
		return brouillonConteneurArts;
	}

	/**
	 * @param brouillonConteneurArts the brouillonConteneurArts to set
	 */
	public void setBrouillonConteneurArts(
			List<BrouillonConteneurArt> brouillonConteneurArts) {
		this.brouillonConteneurArts = brouillonConteneurArts;
	}

	public ModeConditionnement getModeConditionnement() {
		return modeConditionnement;
	}

	public void setModeConditionnement(ModeConditionnement modeConditionnement) {
		this.modeConditionnement = modeConditionnement;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}


}
