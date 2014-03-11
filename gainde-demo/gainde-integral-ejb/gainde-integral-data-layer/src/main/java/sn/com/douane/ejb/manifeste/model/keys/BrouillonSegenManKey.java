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
public class BrouillonSegenManKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6089060572164915865L;

	@Column(name = "MANIFCODECONSIGNATAIRE", length = 3, nullable = false)
	private java.lang.String manifCodeConsignataire;

	@Column(name = "MANIFANNEEENREG", length = 4, nullable = false)
	private java.lang.String manifAnneeEnreg;

	@Column(name = "MANIFNUMREPERTOIRE", length = 6, nullable = false)
	private java.lang.String manifNumRepertoire;

	/**
	 * 
	 */
	public BrouillonSegenManKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnreg
	 * @param manifNumRepertoire
	 */
	public BrouillonSegenManKey(String manifCodeConsignataire,
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

}
