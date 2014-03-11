package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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

import sn.com.douane.ejb.declaration.model.keys.BulletinEcorKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BulletinEcorKey.class)
@Table(name = "BULLETINECOR")
public class BulletinEcor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1510645713154765841L;
	
	@Id
	@Column(name = "ANNEERECEPISSE", columnDefinition = "CHAR(4)", nullable = false)
	private java.lang.String anneeRecepisse;
	
	@Id
	@Column(name = "BUREAURECEPISSE", length =  3, nullable = false)
    private java.lang.String bureauRecepisse;
	
	@Id
	@Column(name = "NUMRECEPISSE", nullable = false)
    private java.lang.Integer numRecepisse;
	
	@Id
	@Column(name = "NUMBULLETIN", nullable = false)
    private java.lang.Integer numBulletin;
	
	@Column(name = "NATUREMARCHANDISE", length = 100, nullable = false)
    private java.lang.String natureMarchandise;
	
	@Column(name = "NBRECOLIS", nullable = false)
    private java.lang.Integer nbreColis;
	
	@Column(name = "NBRECOLISAPURE", nullable = false)
    private java.lang.Integer nbreColisApure;
	
	@Column(name = "POIDS", columnDefinition = "DECIMAL(18,0)", nullable = false)
    private java.math.BigDecimal poids;
	
	@Column(name = "POIDSAPURE",  columnDefinition = "DECIMAL(18,0)", nullable = false)
    private java.math.BigDecimal poidsApure;
	
	@Column(name = "VOLUME",  columnDefinition = "DECIMAL(18,0)", nullable = false)
    private java.math.BigDecimal volume;
	
	@Column(name = "METRAGE", columnDefinition = "DECIMAL(18,0)", nullable = false)
    private java.math.BigDecimal metrage;
	
	@Column(name = "DATEBULLETIN", nullable = false)
    private java.sql.Date dateBulletin;
	
	@Column(name = "MODECONDITIONEMENT", length = 4, nullable = false)
    private java.lang.String modeConditionement;
	
	@Column(name = "MATRICULEAGENTECOREUR", columnDefinition = "CHAR(7)", nullable = false)
    private java.lang.String matriculeAgentEcoreur;
	
	@OneToMany(targetEntity = ApurementReceptDepot.class, mappedBy = "bulletinEcor")
    private List<ApurementReceptDepot> apurementReceptDepots;
	
	@ManyToOne(targetEntity = RecepisseDepot.class)
	@JoinColumns(value = {
			@JoinColumn(name="ANNEERECEPISSE", referencedColumnName = "ANNEERECEPISSE", insertable=false, updatable=false),
			@JoinColumn(name="BUREAURECEPISSE", referencedColumnName = "BUREAURECEPISSE", insertable=false, updatable=false),
			@JoinColumn(name="NUMRECEPISSE", referencedColumnName = "NUMRECEPISSE", insertable=false, updatable=false)
		})
    private RecepisseDepot recepisseDepot;
	
	/**
	 * 
	 */
	public BulletinEcor() {
		super();		
	}

	/**
	 * @param anneeRecepisse
	 * @param bureauRecepisse
	 * @param numRecepisse
	 * @param numBulletin
	 * @param natureMarchandise
	 * @param nbreColis
	 * @param nbreColisApure
	 * @param poids
	 * @param poidsApure
	 * @param volume
	 * @param metrage
	 * @param dateBulletin
	 * @param modeConditionement
	 * @param matriculeAgentEcoreur
	 */
	public BulletinEcor(String anneeRecepisse, String bureauRecepisse,
			Integer numRecepisse, Integer numBulletin,
			String natureMarchandise, Integer nbreColis,
			Integer nbreColisApure, BigDecimal poids, BigDecimal poidsApure,
			BigDecimal volume, BigDecimal metrage, Date dateBulletin,
			String modeConditionement, String matriculeAgentEcoreur) {
		super();
		this.anneeRecepisse = anneeRecepisse;
		this.bureauRecepisse = bureauRecepisse;
		this.numRecepisse = numRecepisse;
		this.numBulletin = numBulletin;
		this.natureMarchandise = natureMarchandise;
		this.nbreColis = nbreColis;
		this.nbreColisApure = nbreColisApure;
		this.poids = poids;
		this.poidsApure = poidsApure;
		this.volume = volume;
		this.metrage = metrage;
		this.dateBulletin = dateBulletin;
		this.modeConditionement = modeConditionement;
		this.matriculeAgentEcoreur = matriculeAgentEcoreur;
	}

	/**
	 * @return the anneeRecepisse
	 */
	public java.lang.String getAnneeRecepisse() {
		return anneeRecepisse;
	}

	/**
	 * @param anneeRecepisse the anneeRecepisse to set
	 */
	public void setAnneeRecepisse(java.lang.String anneeRecepisse) {
		this.anneeRecepisse = anneeRecepisse;
	}

	/**
	 * @return the bureauRecepisse
	 */
	public java.lang.String getBureauRecepisse() {
		return bureauRecepisse;
	}

	/**
	 * @param bureauRecepisse the bureauRecepisse to set
	 */
	public void setBureauRecepisse(java.lang.String bureauRecepisse) {
		this.bureauRecepisse = bureauRecepisse;
	}

	/**
	 * @return the numRecepisse
	 */
	public java.lang.Integer getNumRecepisse() {
		return numRecepisse;
	}

	/**
	 * @param numRecepisse the numRecepisse to set
	 */
	public void setNumRecepisse(java.lang.Integer numRecepisse) {
		this.numRecepisse = numRecepisse;
	}

	/**
	 * @return the numBulletin
	 */
	public java.lang.Integer getNumBulletin() {
		return numBulletin;
	}

	/**
	 * @param numBulletin the numBulletin to set
	 */
	public void setNumBulletin(java.lang.Integer numBulletin) {
		this.numBulletin = numBulletin;
	}

	/**
	 * @return the natureMarchandise
	 */
	public java.lang.String getNatureMarchandise() {
		return natureMarchandise;
	}

	/**
	 * @param natureMarchandise the natureMarchandise to set
	 */
	public void setNatureMarchandise(java.lang.String natureMarchandise) {
		this.natureMarchandise = natureMarchandise;
	}

	/**
	 * @return the nbreColis
	 */
	public java.lang.Integer getNbreColis() {
		return nbreColis;
	}

	/**
	 * @param nbreColis the nbreColis to set
	 */
	public void setNbreColis(java.lang.Integer nbreColis) {
		this.nbreColis = nbreColis;
	}

	/**
	 * @return the nbreColisApure
	 */
	public java.lang.Integer getNbreColisApure() {
		return nbreColisApure;
	}

	/**
	 * @param nbreColisApure the nbreColisApure to set
	 */
	public void setNbreColisApure(java.lang.Integer nbreColisApure) {
		this.nbreColisApure = nbreColisApure;
	}

	/**
	 * @return the poids
	 */
	public java.math.BigDecimal getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(java.math.BigDecimal poids) {
		this.poids = poids;
	}

	/**
	 * @return the poidsApure
	 */
	public java.math.BigDecimal getPoidsApure() {
		return poidsApure;
	}

	/**
	 * @param poidsApure the poidsApure to set
	 */
	public void setPoidsApure(java.math.BigDecimal poidsApure) {
		this.poidsApure = poidsApure;
	}

	/**
	 * @return the volume
	 */
	public java.math.BigDecimal getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(java.math.BigDecimal volume) {
		this.volume = volume;
	}

	/**
	 * @return the metrage
	 */
	public java.math.BigDecimal getMetrage() {
		return metrage;
	}

	/**
	 * @param metrage the metrage to set
	 */
	public void setMetrage(java.math.BigDecimal metrage) {
		this.metrage = metrage;
	}

	/**
	 * @return the dateBulletin
	 */
	public java.sql.Date getDateBulletin() {
		return dateBulletin;
	}

	/**
	 * @param dateBulletin the dateBulletin to set
	 */
	public void setDateBulletin(java.sql.Date dateBulletin) {
		this.dateBulletin = dateBulletin;
	}

	/**
	 * @return the modeConditionement
	 */
	public java.lang.String getModeConditionement() {
		return modeConditionement;
	}

	/**
	 * @param modeConditionement the modeConditionement to set
	 */
	public void setModeConditionement(java.lang.String modeConditionement) {
		this.modeConditionement = modeConditionement;
	}

	/**
	 * @return the matriculeAgentEcoreur
	 */
	public java.lang.String getMatriculeAgentEcoreur() {
		return matriculeAgentEcoreur;
	}

	/**
	 * @param matriculeAgentEcoreur the matriculeAgentEcoreur to set
	 */
	public void setMatriculeAgentEcoreur(java.lang.String matriculeAgentEcoreur) {
		this.matriculeAgentEcoreur = matriculeAgentEcoreur;
	}

	/**
	 * @return the apurerementReceptDepot
	 */
	public List<ApurementReceptDepot> getApurementReceptDepots() {
		return apurementReceptDepots;
	}

	/**
	 * @param apurerementReceptDepot the apurerementReceptDepot to set
	 */
	public void setApurerementReceptDepots(List<ApurementReceptDepot> apurementReceptDepots) {
		this.apurementReceptDepots = apurementReceptDepots;
	}

	public RecepisseDepot getRecepisseDepot() {
		return recepisseDepot;
	}

	public void setRecepisseDepot(RecepisseDepot recepisseDepot) {
		this.recepisseDepot = recepisseDepot;
	}

}
