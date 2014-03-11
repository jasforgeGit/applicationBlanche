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
public class ConteneurArticleKey implements Serializable{

	private static final long serialVersionUID = -675288969032955635L;

	@Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;
	
	@Column(name="MANIFANNEEENGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEngManif;
	
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
	private java.lang.Integer manifNumEnregManif;
	
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
	private java.lang.Integer manifNumArticleManif;
	
	@Column(name="MANIFPRECISARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif;
	
	@Column(name="MANIFPRECIS2ARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif2;

	@Column(name="MANIFNUMCONTENEURS", length=11, nullable=false)
	private java.lang.String manifNumConteneurs;

	/**
	 * 
	 */
	public ConteneurArticleKey() {
	}

	public ConteneurArticleKey(String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2, String manifNumConteneurs) {
		super();
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifNumConteneurs = manifNumConteneurs;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBureauEngManif() {
		return manifBureauEngManif;
	}

	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBureauEngManif(java.lang.String manifBureauEngManif) {
		this.manifBureauEngManif = manifBureauEngManif;
	}

	/**
	 * @return the manifAnneeEngManif
	 */
	public java.lang.String getManifAnneeEngManif() {
		return manifAnneeEngManif;
	}

	/**
	 * @param manifAnneeEngManif the manifAnneeEngManif to set
	 */
	public void setManifAnneeEngManif(java.lang.String manifAnneeEngManif) {
		this.manifAnneeEngManif = manifAnneeEngManif;
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
	 * @return the manifNumArticleManif
	 */
	public java.lang.Integer getManifNumArticleManif() {
		return manifNumArticleManif;
	}

	/**
	 * @param manifNumArticleManif the manifNumArticleManif to set
	 */
	public void setManifNumArticleManif(java.lang.Integer manifNumArticleManif) {
		this.manifNumArticleManif = manifNumArticleManif;
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
	 * @return the manifNumConteneurs
	 */
	public java.lang.String getManifNumConteneurs() {
		return manifNumConteneurs;
	}

	/**
	 * @param manifNumConteneurs the manifNumConteneurs to set
	 */
	public void setManifNumConteneurs(java.lang.String manifNumConteneurs) {
		this.manifNumConteneurs = manifNumConteneurs;
	}
	
	
	
}
