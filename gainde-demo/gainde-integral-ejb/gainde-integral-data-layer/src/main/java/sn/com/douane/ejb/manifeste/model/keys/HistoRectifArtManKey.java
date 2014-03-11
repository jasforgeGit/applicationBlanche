/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class HistoRectifArtManKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8785133925635497231L;
	
	@Column(name = "MANIFANNEEENREG", length = 4, nullable = false)
	private java.lang.String manifAnneeEnreg;
    
	@Column(name = "MANIFBURMANIF", length = 3, nullable = false)
	private java.lang.String manifBurManif;
    
	@Column(name = "MANIFNUMENREGMANIF", nullable = false)
	private java.lang.Integer manifNumEnregManif;

	@Column(name = "MANIFNUMARTMANIF", nullable = false)
	private java.lang.Integer manifNumArtManif;
    
	@Column(name = "MANIFPRECISARTMANIF", nullable = false)
	private java.lang.Integer manifPrecisArtManif;
    
	@Column(name = "MANIFPRECISARTMANIF2", nullable = false)
	private java.lang.Integer manifPrecisArtManif2;
	
	@Column(name = "MANIFDATEHISTO", nullable = false)
	private java.sql.Timestamp manifDateHisto;

	/**
	 * 
	 */
	public HistoRectifArtManKey() {
		// TODO Auto-generated constructor stub
	}

	public HistoRectifArtManKey(String manifAnneeEnreg, String manifBurManif,
			Integer manifNumEnregManif, Integer manifNumArtManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2,
			Timestamp manifDateHisto) {
		super();
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifBurManif = manifBurManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArtManif = manifNumArtManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifDateHisto = manifDateHisto;
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
	
	

}
