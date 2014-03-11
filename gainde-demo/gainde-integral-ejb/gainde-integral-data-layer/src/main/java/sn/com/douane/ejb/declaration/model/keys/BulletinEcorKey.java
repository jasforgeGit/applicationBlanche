/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class BulletinEcorKey implements Serializable {

	private static final long serialVersionUID = -3326788575250502922L;
	
	@Column(name = "ANNEERECEPISSE",  columnDefinition = "CHAR(4)", nullable = false)
	private java.lang.String anneeRecepisse;
	
	@Column(name = "BUREAURECEPISSE", length =  3, nullable = false)
    private java.lang.String bureauRecepisse;
	
	@Column(name = "NUMRECEPISSE", nullable = false)
    private java.lang.Integer numRecepisse;
	
	@Column(name = "NUMBULLETIN", nullable = false)
    private java.lang.Integer numBulletin;

	/**
	 * 
	 */
	public BulletinEcorKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param anneeRecepisse
	 * @param bureauRecepisse
	 * @param numRecepisse
	 * @param numBulletin
	 */
	public BulletinEcorKey(String anneeRecepisse, String bureauRecepisse,
			Integer numRecepisse, Integer numBulletin) {
		super();
		this.anneeRecepisse = anneeRecepisse;
		this.bureauRecepisse = bureauRecepisse;
		this.numRecepisse = numRecepisse;
		this.numBulletin = numBulletin;
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
	
}
