/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumns;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.manifeste.model.keys.HistoRectifContManKey;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(HistoRectifContManKey.class)
@Table(name="HISTORECTIFCONTMAN")

public class HistoRectifContMan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4660612384867872331L;
	
	@Id
	@Column(name="MANIFNUMARTCONTENEUR", nullable=false)
	private java.lang.Integer manifNumArtConteneur;
	
	@Column(name="MANIFNUMCONTENEUR", length=11, nullable=false)
    private java.lang.String manifNumConteneur;
	
	@Column(name="MANIFNUMPLOMB", length=8)
    private java.lang.String manifNumPlomb;
	
	@Column(name="MANIFCODETYPECONT", length=4)
    private java.lang.String manifCodeTypeCont;
	
	@Column(name="MANIFTAILLECONT", length=8)
    private java.lang.String manifTailleCont;
	
	@Column(name="MANIFINDCONTENEUR", length=15)
    private java.lang.String manifIndConteneur;
	
	@Column(name="MANIFCHASSIS", length=17)
    private java.lang.String manifChassis;
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnreg;
	@Id
	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
    private java.lang.String manifBurManif;
	@Id
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
	@Id
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
    private java.lang.Integer manifNumArtManif;
	@Id
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
	@Id
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
	@Id
	@Column(name="MANIFDATEHISTO", nullable=false)
    private java.sql.Timestamp manifDateHisto;
	
	@Transient
	private Integer manifNumHisto;
	
	@ManyToOne(targetEntity = HistoRectifArtMan.class)
	@JoinColumns(value = { 
    		@JoinColumn(name= "MANIFANNEEENREGMANIF", referencedColumnName = "MANIFANNEEENREG",  insertable = false, updatable = false),
			@JoinColumn(name= "MANIFBURENREGMANIF", referencedColumnName = "MANIFBURMANIF",insertable = false, updatable = false),
			@JoinColumn(name= "MANIFNUMENREGMANIF", referencedColumnName = "MANIFNUMENREGMANIF",insertable = false, updatable = false),
			@JoinColumn(name= "MANIFNUMARTICLEMANIF", referencedColumnName = "MANIFNUMARTMANIF",insertable = false, updatable = false),
    		@JoinColumn(name= "MANIFPRECARTMANIF", referencedColumnName = "MANIFPRECISARTMANIF",insertable = false, updatable = false),
    		@JoinColumn(name= "MANIFPRECARTMANIF2", referencedColumnName = "MANIFPRECISARTMANIF2",insertable = false, updatable = false),
    		@JoinColumn(name= "MANIFDATEHISTO", referencedColumnName = "MANIFDATEHISTO",insertable = false, updatable = false)
			})
    private HistoRectifArtMan histoRectifArtMan;
	

	/**
	 * 
	 */
	public HistoRectifContMan() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param manifNumArtConteneur
	 * @param manifNumConteneur
	 * @param manifNumPlomb
	 * @param manifCodeTypeCont
	 * @param manifTailleCont
	 * @param manifIndConteneur
	 * @param manifChassis
	 * @param manifAnneeEnreg
	 * @param manifBurManif
	 * @param manifNumEnregManif
	 * @param manifNumArtManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 * @param manifDateHisto
	 * @param histoRectifArtMan
	 */
	public HistoRectifContMan(Integer manifNumArtConteneur,
			String manifNumConteneur, String manifNumPlomb,
			String manifCodeTypeCont, String manifTailleCont,
			String manifIndConteneur, String manifChassis,
			String manifAnneeEnreg, String manifBurManif,
			Integer manifNumEnregManif, Integer manifNumArtManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2,
			Timestamp manifDateHisto, HistoRectifArtMan histoRectifArtMan) {
		super();
		this.manifNumArtConteneur = manifNumArtConteneur;
		this.manifNumConteneur = manifNumConteneur;
		this.manifNumPlomb = manifNumPlomb;
		this.manifCodeTypeCont = manifCodeTypeCont;
		this.manifTailleCont = manifTailleCont;
		this.manifIndConteneur = manifIndConteneur;
		this.manifChassis = manifChassis;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifBurManif = manifBurManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArtManif = manifNumArtManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifDateHisto = manifDateHisto;
		this.histoRectifArtMan = histoRectifArtMan;
	}


	/**
	 * @return the manifNumArtConteneur
	 */
	public java.lang.Integer getManifNumArtConteneur() {
		return manifNumArtConteneur;
	}


	/**
	 * @param manifNumArtConteneur the manifNumArtConteneur to set
	 */
	public void setManifNumArtConteneur(java.lang.Integer manifNumArtConteneur) {
		this.manifNumArtConteneur = manifNumArtConteneur;
	}


	/**
	 * @return the manifNumConteneur
	 */
	public java.lang.String getManifNumConteneur() {
		return manifNumConteneur;
	}


	public Integer getManifNumHisto() {
		return manifNumHisto;
	}


	public void setManifNumHisto(Integer manifNumHisto) {
		this.manifNumHisto = manifNumHisto;
	}


	/**
	 * @param manifNumConteneur the manifNumConteneur to set
	 */
	public void setManifNumConteneur(java.lang.String manifNumConteneur) {
		this.manifNumConteneur = manifNumConteneur;
	}


	/**
	 * @return the manifNumPlomb
	 */
	public java.lang.String getManifNumPlomb() {
		return manifNumPlomb;
	}


	/**
	 * @param manifNumPlomb the manifNumPlomb to set
	 */
	public void setManifNumPlomb(java.lang.String manifNumPlomb) {
		this.manifNumPlomb = manifNumPlomb;
	}


	/**
	 * @return the manifCodeTypeCont
	 */
	public java.lang.String getManifCodeTypeCont() {
		return manifCodeTypeCont;
	}


	/**
	 * @param manifCodeTypeCont the manifCodeTypeCont to set
	 */
	public void setManifCodeTypeCont(java.lang.String manifCodeTypeCont) {
		this.manifCodeTypeCont = manifCodeTypeCont;
	}


	/**
	 * @return the manifTailleCont
	 */
	public java.lang.String getManifTailleCont() {
		return manifTailleCont;
	}


	/**
	 * @param manifTailleCont the manifTailleCont to set
	 */
	public void setManifTailleCont(java.lang.String manifTailleCont) {
		this.manifTailleCont = manifTailleCont;
	}


	/**
	 * @return the manifIndConteneur
	 */
	public java.lang.String getManifIndConteneur() {
		return manifIndConteneur;
	}


	/**
	 * @param manifIndConteneur the manifIndConteneur to set
	 */
	public void setManifIndConteneur(java.lang.String manifIndConteneur) {
		this.manifIndConteneur = manifIndConteneur;
	}


	/**
	 * @return the manifChassis
	 */
	public java.lang.String getManifChassis() {
		return manifChassis;
	}


	/**
	 * @param manifChassis the manifChassis to set
	 */
	public void setManifChassis(java.lang.String manifChassis) {
		this.manifChassis = manifChassis;
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
	 * @return the manifBurManif
	 */
	public java.lang.String getManifBurManif() {
		return manifBurManif;
	}


	/**
	 * @param manifBurManif the manifBurManif to set
	 */
	public void setManifBurManif(java.lang.String manifBurManif) {
		this.manifBurManif = manifBurManif;
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
	 * @return the manifNumArtManif
	 */
	public java.lang.Integer getManifNumArtManif() {
		return manifNumArtManif;
	}


	/**
	 * @param manifNumArtManif the manifNumArtManif to set
	 */
	public void setManifNumArtManif(java.lang.Integer manifNumArtManif) {
		this.manifNumArtManif = manifNumArtManif;
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
	 * @return the manifDateHisto
	 */
	public java.sql.Timestamp getManifDateHisto() {
		return manifDateHisto;
	}


	/**
	 * @param manifDateHisto the manifDateHisto to set
	 */
	public void setManifDateHisto(java.sql.Timestamp manifDateHisto) {
		this.manifDateHisto = manifDateHisto;
	}


	/**
	 * @return the histoRectifArtMan
	 */
	public HistoRectifArtMan getHistoRectifArtMan() {
		return histoRectifArtMan;
	}


	/**
	 * @param histoRectifArtMan the histoRectifArtMan to set
	 */
	public void setHistoRectifArtMan(HistoRectifArtMan histoRectifArtMan) {
		this.histoRectifArtMan = histoRectifArtMan;
	}

	
}
