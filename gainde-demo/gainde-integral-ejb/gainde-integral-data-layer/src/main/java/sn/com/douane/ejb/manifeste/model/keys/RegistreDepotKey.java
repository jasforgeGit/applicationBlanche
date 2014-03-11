/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class RegistreDepotKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -558722983508748641L;
	
	@Column(name ="MANIFANNEEREGDEPOT", length = 4, nullable = false)	
	private java.lang.String manifAnneeRegDepot;
	
	@Column(name = "MANIFBURREGDEPOT" , length = 3 , nullable = false)
    private java.lang.String manifBurRegDepot;
	
	@Column(name = "MANIFNUMREGDEPOT", nullable = false)
    private java.lang.Integer manifNumRegDepot;

	/**
	 * 
	 */
	public RegistreDepotKey() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifAnneeRegDepot
	 * @param manifBurRegDepot
	 * @param manifNumRegDepot
	 */
	public RegistreDepotKey(String manifAnneeRegDepot, String manifBurRegDepot,
			Integer manifNumRegDepot) {
		super();
		this.manifAnneeRegDepot = manifAnneeRegDepot;
		this.manifBurRegDepot = manifBurRegDepot;
		this.manifNumRegDepot = manifNumRegDepot;
	}

	/**
	 * @return the manifAnneeRegDepot
	 */
	public java.lang.String getManifAnneeRegDepot() {
		return manifAnneeRegDepot;
	}

	/**
	 * @param manifAnneeRegDepot the manifAnneeRegDepot to set
	 */
	public void setManifAnneeRegDepot(java.lang.String manifAnneeRegDepot) {
		this.manifAnneeRegDepot = manifAnneeRegDepot;
	}

	/**
	 * @return the manifBurRegDepot
	 */
	public java.lang.String getManifBurRegDepot() {
		return manifBurRegDepot;
	}

	/**
	 * @param manifBurRegDepot the manifBurRegDepot to set
	 */
	public void setManifBurRegDepot(java.lang.String manifBurRegDepot) {
		this.manifBurRegDepot = manifBurRegDepot;
	}

	/**
	 * @return the manifNumRegDepot
	 */
	public java.lang.Integer getManifNumRegDepot() {
		return manifNumRegDepot;
	}

	/**
	 * @param manifNumRegDepot the manifNumRegDepot to set
	 */
	public void setManifNumRegDepot(java.lang.Integer manifNumRegDepot) {
		this.manifNumRegDepot = manifNumRegDepot;
	}
	
	
	

}
