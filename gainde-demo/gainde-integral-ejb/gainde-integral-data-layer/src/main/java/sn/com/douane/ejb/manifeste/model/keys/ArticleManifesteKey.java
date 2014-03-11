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
public class ArticleManifesteKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2691302798604852251L;

	@Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;

    /**
     * Implementation field for persistent attribute: manifanneeengmanif
     */
	@Column(name="MANIFANNEEENGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEngManif;

    /**
     * Implementation field for persistent attribute: manifnumenregmanif
     */
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
	private java.lang.Integer manifNumEnregManif;

    /**
     * Implementation field for persistent attribute: manifnumarticlemanif
     */
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
	private java.lang.Integer manifNumArticleManif;

    /**
     * Implementation field for persistent attribute: manifprecisartmanif
     */
	@Column(name="MANIFPRECISARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif;

    /**
     * Implementation field for persistent attribute: manifprecisartmanif2
     */
	@Column(name="MANIFPRECISARTMANIF2", nullable=false)
	private java.lang.Integer manifPrecisArtManif2;

	/**
	 * 
	 */
	public ArticleManifesteKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifBureauEngManif
	 * @param manifAnneeEngManif
	 * @param manifNumEnregManif
	 * @param manifNumArticleManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 */
	public ArticleManifesteKey(String manifBureauEngManif,	String manifAnneeEngManif, Integer manifNumEnregManif,	Integer manifNumArticleManif, Integer manifPrecisArtManif, Integer manifPrecisArtManif2) {
		super();
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
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

}
