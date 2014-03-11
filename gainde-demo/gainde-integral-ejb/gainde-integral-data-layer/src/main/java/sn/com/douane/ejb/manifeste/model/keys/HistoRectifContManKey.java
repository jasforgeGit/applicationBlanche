/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author moussakare
 *
 */
public class HistoRectifContManKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2641652146993349114L;
	
	
	@Column(name="MANIFNUMARTCONTENEUR", nullable=false)
	private java.lang.Integer manifNumArtConteneur;
	
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnreg;
	
	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
    private java.lang.String manifBurManif;
	
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
	
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
    private java.lang.Integer manifNumArtManif;
	
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
	
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
	
	@Column(name="MANIFDATEHISTO", nullable=false)
    private java.sql.Timestamp manifDateHisto;

	/**
	 * 
	 */
	public HistoRectifContManKey() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifAnneeEnreg
	 * @param manifBurManif
	 * @param manifNumEnregManif
	 * @param manifNumArtManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 */
	public HistoRectifContManKey(Integer manifNumArtConteneur,String manifAnneeEnreg, String manifBurManif,
			Integer manifNumEnregManif, Integer manifNumArtManif,
			Integer manifPrecisArtManif, Integer manifPrecisArtManif2,Timestamp manifDateHisto) {
		super();
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifBurManif = manifBurManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArtManif = manifNumArtManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifNumArtConteneur=manifNumArtConteneur;
		this.manifDateHisto=manifDateHisto;
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

	public java.lang.Integer getManifNumArtConteneur() {
		return manifNumArtConteneur;
	}

	public void setManifNumArtConteneur(java.lang.Integer manifNumArtConteneur) {
		this.manifNumArtConteneur = manifNumArtConteneur;
	}

	public java.sql.Timestamp getManifDateHisto() {
		return manifDateHisto;
	}

	public void setManifDateHisto(java.sql.Timestamp manifDateHisto) {
		this.manifDateHisto = manifDateHisto;
	}
	
	

}
