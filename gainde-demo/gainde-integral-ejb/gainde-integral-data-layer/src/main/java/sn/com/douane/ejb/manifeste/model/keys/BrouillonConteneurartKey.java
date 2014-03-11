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
public class BrouillonConteneurartKey implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4671799409649037128L;

	/**
	 * Implementation field for persistent attribute: manifnumconteneur
	 */
	@Column(name="MANIFNUMCONTENEUR", length=11, nullable=false)
	private java.lang.String manifNumConteneur;

	/**
	 * Implementation field for persistent attribute:
	 * ce_contart_manifcodelieuembarq
	 */
	@Column(name="MANIFCODELIEUEMBARQ", length=5, nullable=false)
	private java.lang.String manifCodeLieuEmbarq;

	/**
	 * Implementation field for persistent attribute: ce_contart_manifnumart
	 */
	@Column(name="MANIFNUMARTMANIFESTE", nullable=false)
	private java.lang.Integer manifNumArt;

	/**
	 * Implementation field for persistent attribute:
	 * ce_contart_manifprecartmanif
	 */
	@Column(name="MANIFPRECISARTBROUMANIF", nullable=false)
	private java.lang.Integer manifPrecArtManif;

	/**
	 * Implementation field for persistent attribute:
	 * ce_contart_ce_brartseggen_manifcodeconsignataire
	 */
	@Column(name="MANIFCODECONSIGNATAIRE", length=3, nullable=false)
	private java.lang.String manifCodeConsignataire;

	/**
	 * Implementation field for persistent attribute:
	 * ce_contart_ce_brartseggen_manifanneeenreg
	 */
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEnreg;

	/**
	 * Implementation field for persistent attribute:
	 * ce_contart_ce_brartseggen_manifnumrepertoire
	 */
	@Column(name="MANIFNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String manifNumRepertoire;

	/**
	 * 
	 */
	public BrouillonConteneurartKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifNumConteneur
	 * @param manifCodeLieuEmbarq
	 * @param manifNumArt
	 * @param manifPrecArtManif
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnreg
	 * @param manifNumRepertoire
	 */
	public BrouillonConteneurartKey(String manifNumConteneur,
			String manifCodeLieuEmbarq, Integer manifNumArt,
			Integer manifPrecArtManif, String manifCodeConsignataire,
			String manifAnneeEnreg, String manifNumRepertoire) {
		super();
		this.manifNumConteneur = manifNumConteneur;
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
		this.manifNumArt = manifNumArt;
		this.manifPrecArtManif = manifPrecArtManif;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifNumRepertoire = manifNumRepertoire;
	}

	/**
	 * @return the manifNumConteneur
	 */
	public java.lang.String getManifNumConteneur() {
		return manifNumConteneur;
	}

	/**
	 * @param manifNumConteneur the manifNumConteneur to set
	 */
	public void setManifNumConteneur(java.lang.String manifNumConteneur) {
		this.manifNumConteneur = manifNumConteneur;
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
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof BrouillonConteneurartKey) {
			BrouillonConteneurartKey o = (BrouillonConteneurartKey) otherKey;
			return ((this.manifNumConteneur.equals(o.manifNumConteneur))
					&& (this.manifCodeLieuEmbarq
							.equals(o.manifCodeLieuEmbarq))
					&& (this.manifNumArt
							.equals(o.manifNumArt))
					&& (this.manifPrecArtManif
							.equals(o.manifPrecArtManif))
					&& (this.manifCodeConsignataire
							.equals(o.manifCodeConsignataire))
					&& (this.manifAnneeEnreg
							.equals(o.manifAnneeEnreg)) && (this.manifNumRepertoire
					.equals(o.manifNumRepertoire)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (manifNumConteneur.hashCode()
				+ manifCodeLieuEmbarq.hashCode()
				+ manifNumArt.hashCode()
				+ manifPrecArtManif.hashCode()
				+ manifCodeConsignataire.hashCode()
				+ manifAnneeEnreg.hashCode() + manifNumRepertoire
				.hashCode());
	}
	
	

}
