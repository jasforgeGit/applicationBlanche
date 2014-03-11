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
public class DdeRectifContArtKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7277205106409946185L;

	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
	private java.lang.String manifBurEnregManif;
	
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
    
 	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
	@Column(name="MANIFNUMARTICLEMANIF", nullable=false)
    private java.lang.Integer manifNumArticleManif;
    
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;
	
	@Column(name="MANIFNUMCONTENEUR", length=11, nullable=false)
    private java.lang.String manifNumConteneur;
	

	/**
	 * 
	 */
	public DdeRectifContArtKey() {
	}

	public DdeRectifContArtKey(String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2, String manifNumConteneur) {
		super();
		this.manifBurEnregManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifNumConteneur = manifNumConteneur;
	}


	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBurEnregManif() {
		return manifBurEnregManif;
	}


	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBurEnregManif(java.lang.String manifBureauEngManif) {
		this.manifBurEnregManif = manifBureauEngManif;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
