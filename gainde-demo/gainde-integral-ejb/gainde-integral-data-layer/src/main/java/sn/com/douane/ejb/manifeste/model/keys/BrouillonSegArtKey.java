package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author CGPID
 *
 */
public class BrouillonSegArtKey implements Serializable {
	
	private static final long serialVersionUID = -5894865981831719706L;

	@Column(name="MANIFCODELIEUEMBARQ", length=5, nullable=false)
	private java.lang.String manifCodeLieuEmbarq;

	/**
	 * Implementation field for persistent attribute: manifnumart
	 */
	@Column(name="MANIFNUMART", nullable=false)
	private java.lang.Integer manifNumArt;

	/**
	 * Implementation field for persistent attribute: manifprecartmanif
	 */
	@Column(name="MANIFPRECARTMANIF", nullable=false)
	private java.lang.Integer manifPrecArtManif;

	/**
	 * Implementation field for persistent attribute:
	 * ce_brartseggen_manifcodeconsignataire
	 */
	@Column(name="MANIFCODECONSIG",length=3, nullable=false)
	private java.lang.String manifCodeConsignataire;

	/**
	 * Implementation field for persistent attribute:
	 * ce_brartseggen_manifanneeenreg
	 */
	@Column(name="MANIFANNEEENREG",length=4, nullable=false)
	private java.lang.String manifAnneeEnreg;

	/**
	 * Implementation field for persistent attribute:
	 * ce_brartseggen_manifnumrepertoire
	 */
	@Column(name="MANIFNUMREP",length=6, nullable=false)
	private java.lang.String manifNumRepertoire;

	/**
	 * 
	 */
	public BrouillonSegArtKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifCodeLieuEmbarq
	 * @param manifNumArt
	 * @param manifPrecArtManif
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnreg
	 * @param manifNumRepertoire
	 */
	public BrouillonSegArtKey(String manifCodeLieuEmbarq, Integer manifNumArt,
			Integer manifPrecArtManif, String manifCodeConsignataire,
			String manifAnneeEnreg, String manifNumRepertoire) {
		super();
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
		this.manifNumArt = manifNumArt;
		this.manifPrecArtManif = manifPrecArtManif;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnreg = manifAnneeEnreg;
		this.manifNumRepertoire = manifNumRepertoire;
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
	
	


}
