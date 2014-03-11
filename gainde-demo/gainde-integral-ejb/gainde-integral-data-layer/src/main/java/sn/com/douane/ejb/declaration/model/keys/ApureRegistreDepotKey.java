package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ApureRegistreDepotKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="MANIFANNEEREGDEPOT", length=4, nullable=false)
	private java.lang.String manifAnneeRegDepot;
	
	
	@Column(name="MANIFBURREGDEPOT", length=3, nullable=false)
	private java.lang.String manifBurRegDepot;
	
	
	@Column(name="MANIFNUMREGDEPOT", nullable=false)
	private java.lang.Integer manifNumRegDepot;
	
	
	@Column(name="MANIFANNEEDECAPUR", length=4, nullable=false)
	private java.lang.String manifAnneeDecApur;
	
	
	@Column(name="MANIFBUREAUDECAPUR", length=3, nullable=false)
	private java.lang.String manifBureauDecApur;
	
	
	@Column(name="MANIFNUMDECAPUR", nullable=false)
	private java.lang.Integer manifNumDecApur;
	
	
	@Column(name="MANIFARTICLEDECAPUR", nullable=false)
	private java.lang.Integer manifArticleDecApur;
	
	
	@Column(name="MANIFNATUREAPUREMENT", length=1, nullable=false)
	private java.lang.String manifNatureApurement;
	
	
	
	

	
	public ApureRegistreDepotKey() {
		super();
	}

	public ApureRegistreDepotKey(String manifAnneeRegDepot,
			String manifBurRegDepot, Integer manifNumRegDepot,
			String manifAnneeDecApur, String manifBureauDecApur,
			Integer manifNumDecApur, Integer manifArticleDecApur,
			String manifNatureApurement) {
		super();
		this.manifAnneeRegDepot = manifAnneeRegDepot;
		this.manifBurRegDepot = manifBurRegDepot;
		this.manifNumRegDepot = manifNumRegDepot;
		this.manifAnneeDecApur = manifAnneeDecApur;
		this.manifBureauDecApur = manifBureauDecApur;
		this.manifNumDecApur = manifNumDecApur;
		this.manifArticleDecApur = manifArticleDecApur;
		this.manifNatureApurement = manifNatureApurement;
	}

	public java.lang.String getManifAnneeRegDepot() {
		return manifAnneeRegDepot;
	}

	public void setManifAnneeRegDepot(java.lang.String manifAnneeRegDepot) {
		this.manifAnneeRegDepot = manifAnneeRegDepot;
	}

	public java.lang.String getManifBurRegDepot() {
		return manifBurRegDepot;
	}

	public void setManifBurRegDepot(java.lang.String manifBurRegDepot) {
		this.manifBurRegDepot = manifBurRegDepot;
	}

	public java.lang.Integer getManifNumRegDepot() {
		return manifNumRegDepot;
	}

	public void setManifNumRegDepot(java.lang.Integer manifNumRegDepot) {
		this.manifNumRegDepot = manifNumRegDepot;
	}

	public java.lang.String getManifAnneeDecApur() {
		return manifAnneeDecApur;
	}

	public void setManifAnneeDecApur(java.lang.String manifAnneeDecApur) {
		this.manifAnneeDecApur = manifAnneeDecApur;
	}

	public java.lang.String getManifBureauDecApur() {
		return manifBureauDecApur;
	}

	public void setManifBureauDecApur(java.lang.String manifBureauDecApur) {
		this.manifBureauDecApur = manifBureauDecApur;
	}

	public java.lang.Integer getManifNumDecApur() {
		return manifNumDecApur;
	}

	public void setManifNumDecApur(java.lang.Integer manifNumDecApur) {
		this.manifNumDecApur = manifNumDecApur;
	}

	public java.lang.Integer getManifArticleDecApur() {
		return manifArticleDecApur;
	}

	public void setManifArticleDecApur(java.lang.Integer manifArticleDecApur) {
		this.manifArticleDecApur = manifArticleDecApur;
	}

	public java.lang.String getManifNatureApurement() {
		return manifNatureApurement;
	}

	public void setManifNatureApurement(java.lang.String manifNatureApurement) {
		this.manifNatureApurement = manifNatureApurement;
	}


}
