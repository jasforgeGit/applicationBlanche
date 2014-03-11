package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ApureRegistreDepotKey;




@Entity
@IdClass(ApureRegistreDepotKey.class)
@Table(name="APUREREGISTREDEPOT")
public class ApureRegistreDepot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="MANIFANNEEREGDEPOT", length=4, nullable=false)
	private java.lang.String manifAnneeRegDepot;
	
	@Id
	@Column(name="MANIFBURREGDEPOT", length=3, nullable=false)
	private java.lang.String manifBurRegDepot;
	
	@Id
	@Column(name="MANIFNUMREGDEPOT", nullable=false)
	private java.lang.Integer manifNumRegDepot;
	
	@Id
	@Column(name="MANIFANNEEDECAPUR", length=4, nullable=false)
	private java.lang.String manifAnneeDecApur;
	
	@Id
	@Column(name="MANIFBUREAUDECAPUR", length=3, nullable=false)
	private java.lang.String manifBureauDecApur;
	
	@Id
	@Column(name="MANIFNUMDECAPUR", nullable=false)
	private java.lang.Integer manifNumDecApur;
	
	@Id
	@Column(name="MANIFARTICLEDECAPUR", nullable=false)
	private java.lang.Integer manifArticleDecApur;
	
	@Id
	@Column(name="MANIFNATUREAPUREMENT", length=1, nullable=false)
	private java.lang.String manifNatureApurement;
	
	
	@Column(name="MANIFDATEAPUREMENT", nullable=false)
	private java.sql.Date manifDateApurement;
	
	@Column(name="MANIFNBRCOLIS", columnDefinition="DECIMAL(6,0)")
	private java.math.BigDecimal manifNbrColis;
	
	@Column(name="MANIFPOIDSBRUT", columnDefinition="DECIMAL(9,0)")
	private java.math.BigDecimal manifPoidsBrut;

	
	
	public ApureRegistreDepot() {
		super();
	}

	
	


	public ApureRegistreDepot(String manifAnneeRegDepot,
			String manifBurRegDepot, Integer manifNumRegDepot,
			String manifAnneeDecApur, String manifBureauDecApur,
			Integer manifNumDecApur, Integer manifArticleDecApur,
			String manifNatureApurement, Date manifDateApurement,
			BigDecimal manifNbrColis, BigDecimal manifPoidsBrut) {
		super();
		this.manifAnneeRegDepot = manifAnneeRegDepot;
		this.manifBurRegDepot = manifBurRegDepot;
		this.manifNumRegDepot = manifNumRegDepot;
		this.manifAnneeDecApur = manifAnneeDecApur;
		this.manifBureauDecApur = manifBureauDecApur;
		this.manifNumDecApur = manifNumDecApur;
		this.manifArticleDecApur = manifArticleDecApur;
		this.manifNatureApurement = manifNatureApurement;
		this.manifDateApurement = manifDateApurement;
		this.manifNbrColis = manifNbrColis;
		this.manifPoidsBrut = manifPoidsBrut;
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



	public java.sql.Date getManifDateApurement() {
		return manifDateApurement;
	}



	public void setManifDateApurement(java.sql.Date manifDateApurement) {
		this.manifDateApurement = manifDateApurement;
	}



	public java.math.BigDecimal getManifNbrColis() {
		return manifNbrColis;
	}



	public void setManifNbrColis(java.math.BigDecimal manifNbrColis) {
		this.manifNbrColis = manifNbrColis;
	}



	public java.math.BigDecimal getManifPoidsBrut() {
		return manifPoidsBrut;
	}



	public void setManifPoidsBrut(java.math.BigDecimal manifPoidsBrut) {
		this.manifPoidsBrut = manifPoidsBrut;
	}




   

}
