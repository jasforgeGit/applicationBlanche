package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class ApurementManifesteKey implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;

	@Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;

	@Column(name="MANIFANNEEMANIFESTE", length=4, nullable=false)
	private java.lang.String manifAnneeEngManif;

	@Column(name="MANIFNUMMANIFESTE", nullable=false)
	private java.lang.Integer manifNumEnregManif;

	@Column(name="MANIFARTICLEMANIFESTE", nullable=false)
	private java.lang.Integer manifNumArticleManif;

	@Column(name="MANIFPRECISIONMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif;

	@Column(name="MANIFPRECISION2MANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif2;

	@Column(name="MANIFANNEEDECAPUR", length=4, nullable=false)
	private java.lang.String manifAnneeDecApur;

	@Column(name="MANIFBUREAUDECAPUR", length=3, nullable=false)
	private java.lang.String manifBureauDecApur;

	@Column(name="MANIFNUMDECAPUR", nullable=false)
	private java.lang.Integer manifNumDecApur;

	@Column(name="MANIFARTICLEDECAPUR",  nullable=false)
	private java.lang.Integer manifArticleDecApur;

	@Column(name="MANIFNATUREAPUREMENT", length=1, nullable=false)
	private java.lang.String manifNatureApurement;	
	
	@Column(name="MANIFDATEAPUREMENT")
    private java.sql.Date manifDateApurement;

	public java.sql.Date getManifDateApurement() {
		return manifDateApurement;
	}

	public void setManifDateApurement(java.sql.Date manifDateApurement) {
		this.manifDateApurement = manifDateApurement;
	}

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
	 * @return the manifAnneeDecApur
	 */
	public java.lang.String getManifAnneeDecApur() {
		return manifAnneeDecApur;
	}

	/**
	 * @param manifAnneeDecApur the manifAnneeDecApur to set
	 */
	public void setManifAnneeDecApur(java.lang.String manifAnneeDecApur) {
		this.manifAnneeDecApur = manifAnneeDecApur;
	}

	/**
	 * @return the manifBureauDecApur
	 */
	public java.lang.String getManifBureauDecApur() {
		return manifBureauDecApur;
	}

	/**
	 * @param manifBureauDecApur the manifBureauDecApur to set
	 */
	public void setManifBureauDecApur(java.lang.String manifBureauDecApur) {
		this.manifBureauDecApur = manifBureauDecApur;
	}

	/**
	 * @return the manifNumDecApur
	 */
	public java.lang.Integer getManifNumDecApur() {
		return manifNumDecApur;
	}

	/**
	 * @param manifNumDecApur the manifNumDecApur to set
	 */
	public void setManifNumDecApur(java.lang.Integer manifNumDecApur) {
		this.manifNumDecApur = manifNumDecApur;
	}

	/**
	 * @return the manifArticleDecApur
	 */
	public java.lang.Integer getManifArticleDecApur() {
		return manifArticleDecApur;
	}

	/**
	 * @param manifArticleDecApur the manifArticleDecApur to set
	 */
	public void setManifArticleDecApur(java.lang.Integer manifArticleDecApur) {
		this.manifArticleDecApur = manifArticleDecApur;
	}

	/**
	 * @return the manifNatureApurement
	 */
	public java.lang.String getManifNatureApurement() {
		return manifNatureApurement;
	}

	/**
	 * @param manifNatureApurement the manifNatureApurement to set
	 */
	public void setManifNatureApurement(java.lang.String manifNatureApurement) {
		this.manifNatureApurement = manifNatureApurement;
	}

	/**
	 * 
	 */
	public ApurementManifesteKey() {
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
	 * @param manifAnneeDecApur
	 * @param manifBureauDecApur
	 * @param manifNumDecApur
	 * @param manifArticleDecApur
	 * @param manifNatureApurement
	 */
	public ApurementManifesteKey(String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2, String manifAnneeDecApur,
			String manifBureauDecApur, Integer manifNumDecApur,
			Integer manifArticleDecApur, String manifNatureApurement,
			Date manifDateApurement) {
		super();
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
		this.manifAnneeDecApur = manifAnneeDecApur;
		this.manifBureauDecApur = manifBureauDecApur;
		this.manifNumDecApur = manifNumDecApur;
		this.manifArticleDecApur = manifArticleDecApur;
		this.manifNatureApurement = manifNatureApurement;
		this.manifDateApurement = manifDateApurement;
	}

}
