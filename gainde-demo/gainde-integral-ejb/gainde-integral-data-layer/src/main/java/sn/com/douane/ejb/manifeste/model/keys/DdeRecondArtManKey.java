/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author CGPID
 *
 */

public class DdeRecondArtManKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3155019810431037523L;

	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEnregManif;
	
	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
	private java.lang.String manifBurEnregManif;
	
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
	private java.lang.Integer manifNumEnregManif;
	
	@Column(name="MANIFNUMARTMANIF", nullable=false)
	private java.lang.Integer manifNumArtManif;
	
	@Column(name="MANIFPRECARTMANIF", nullable=false)
	private java.lang.Integer manifPrecArtManif;
	
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
	private java.lang.Integer manifPrecArtManif2;
	
	@Column(name="MANIFNUMRECOND", nullable=false)
	private java.lang.Integer manifNumRecond;
	
	@Column(name="MANIFNUMRECOND2", nullable=false)
	private java.lang.Integer manifNumRecond2;

	/**
	 * 
	 */
	public DdeRecondArtManKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifAnneeEnregManif
	 * @param manifBurEnregManif
	 * @param manifNumEnregManif
	 * @param manifNumArtManif
	 * @param manifPrecArtManif
	 * @param manifPrecArtManif2
	 * @param manifNumRecond
	 * @param manifNumRecond2
	 */
	public DdeRecondArtManKey(String manifAnneeEnregManif,
			String manifBurEnregManif, Integer manifNumEnregManif,
			Integer manifNumArtManif, Integer manifPrecArtManif,
			Integer manifPrecArtManif2, Integer manifNumRecond,
			Integer manifNumRecond2) {
		super();
		this.manifAnneeEnregManif = manifAnneeEnregManif;
		this.manifBurEnregManif = manifBurEnregManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArtManif = manifNumArtManif;
		this.manifPrecArtManif = manifPrecArtManif;
		this.manifPrecArtManif2 = manifPrecArtManif2;
		this.manifNumRecond = manifNumRecond;
		this.manifNumRecond2 = manifNumRecond2;
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
	 * @return the manifBurEnregManif
	 */
	public java.lang.String getManifBurEnregManif() {
		return manifBurEnregManif;
	}

	/**
	 * @param manifBurEnregManif the manifBurEnregManif to set
	 */
	public void setManifBurEnregManif(java.lang.String manifBurEnregManif) {
		this.manifBurEnregManif = manifBurEnregManif;
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
	 * @return the manifPrecArtManif2
	 */
	public java.lang.Integer getManifPrecArtManif2() {
		return manifPrecArtManif2;
	}

	/**
	 * @param manifPrecArtManif2 the manifPrecArtManif2 to set
	 */
	public void setManifPrecArtManif2(java.lang.Integer manifPrecArtManif2) {
		this.manifPrecArtManif2 = manifPrecArtManif2;
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
	
	
}
