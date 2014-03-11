package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.manifeste.model.keys.ApurementManifesteKey;




@Entity
@IdClass(ApurementManifesteKey.class)
@Table(name="APUREMENTMANIFESTE")
public class ApurementManifeste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4907114282384231212L;

	@Id
	@Column(name="MANIFNATUREAPUREMENT", length=1, nullable=false)
	private java.lang.String manifNatureApurement;
	
	@Column(name="MANIFNBRCOLIS", columnDefinition="DECIMAL(6 , 0)")
    private java.math.BigDecimal manifNbrColis;
	
	@Column(name="MANIFPOIDSBRUT", columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsBrut;
	
	@Id
	@Column(name="MANIFDATEAPUREMENT")
    private java.sql.Date manifDateApurement;
    
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
    @Column(name="MANIFARTICLEDECAPUR",  nullable=false)
    private java.lang.Integer manifArticleDecApur;
    
    @Column(name="MANIFNUMTITRETRANSP", length=12)
    private java.lang.String manifNumTitreTransp;
    
    @Column(name="MANIFLIEUEMB", length=5)
    private java.lang.String manifLieuEmb;
    
    @Column(name="MANIFNBRCOLENLEVPHYS",columnDefinition="DECIMAL(6 , 0)")
    private java.math.BigDecimal manifNbrColEnlevPhys;
    
    @Column(name="MANIFPOIDSENLEVPHYS",columnDefinition="DECIMAL(9 , 0)")
    private java.math.BigDecimal manifPoidsEnlevPhys;
    
    @Column(name="MANIFDATEENLEVPHYS")
    private java.sql.Date manifDateEnlevPhys;
    
    @Id
    @Column(name="MANIFBUREAUENGMANIF", length=3, nullable=false)
    private java.lang.String manifBureauEngManif;
    
    @Id
    @Column(name="MANIFANNEEMANIFESTE", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
    
    @Id
    @Column(name="MANIFNUMMANIFESTE", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
    @Id
    @Column(name="MANIFARTICLEMANIFESTE", nullable=false)
    private java.lang.Integer manifNumArticleManif;
    
    @Id
    @Column(name="MANIFPRECISIONMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
    @Id
    @Column(name="MANIFPRECISION2MANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;

    
	@ManyToOne(targetEntity = ArticleManifeste.class)
	@JoinColumns( value = {
		@JoinColumn(name="MANIFBUREAUENGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
		@JoinColumn(name="MANIFANNEEMANIFESTE", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
		@JoinColumn(name="MANIFNUMMANIFESTE", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
		@JoinColumn(name="MANIFARTICLEMANIFESTE", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
		@JoinColumn(name="MANIFPRECISIONMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
		@JoinColumn(name="MANIFPRECISION2MANIF", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
		})  
	private ArticleManifeste articleManifeste;	

	/**
	 * @return the manifNatureApurement
	 */
	public java.lang.String getManifNatureApurement() {
		return manifNatureApurement;
	}

	/**
	 * 
	 */
	public ApurementManifeste() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifNatureApurement the manifNatureApurement to set
	 */
	public void setManifNatureApurement(java.lang.String manifNatureApurement) {
		this.manifNatureApurement = manifNatureApurement;
	}

	/**
	 * @return the manifNbrColis
	 */
	public java.math.BigDecimal getManifNbrColis() {
		return manifNbrColis;
	}

	/**
	 * @param manifNbrColis the manifNbrColis to set
	 */
	public void setManifNbrColis(java.math.BigDecimal manifNbrColis) {
		this.manifNbrColis = manifNbrColis;
	}

	/**
	 * @return the manifPoidsBrut
	 */
	public java.math.BigDecimal getManifPoidsBrut() {
		return manifPoidsBrut;
	}

	/**
	 * @param manifPoidsBrut the manifPoidsBrut to set
	 */
	public void setManifPoidsBrut(java.math.BigDecimal manifPoidsBrut) {
		this.manifPoidsBrut = manifPoidsBrut;
	}

	/**
	 * @return the manifDateApurement
	 */
	public java.sql.Date getManifDateApurement() {
		return manifDateApurement;
	}

	/**
	 * @param manifDateApurement the manifDateApurement to set
	 */
	public void setManifDateApurement(java.sql.Date manifDateApurement) {
		this.manifDateApurement = manifDateApurement;
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
	 * @return the manifNumTitreTransp
	 */
	public java.lang.String getManifNumTitreTransp() {
		return manifNumTitreTransp;
	}

	/**
	 * @param manifNumTitreTransp the manifNumTitreTransp to set
	 */
	public void setManifNumTitreTransp(java.lang.String manifNumTitreTransp) {
		this.manifNumTitreTransp = manifNumTitreTransp;
	}

	/**
	 * @return the manifLieuEmb
	 */
	public java.lang.String getManifLieuEmb() {
		return manifLieuEmb;
	}

	/**
	 * @param manifLieuEmb the manifLieuEmb to set
	 */
	public void setManifLieuEmb(java.lang.String manifLieuEmb) {
		this.manifLieuEmb = manifLieuEmb;
	}

	/**
	 * @return the manifNbrColEnlevPhys
	 */
	public java.math.BigDecimal getManifNbrColEnlevPhys() {
		return manifNbrColEnlevPhys;
	}

	/**
	 * @param manifNbrColEnlevPhys the manifNbrColEnlevPhys to set
	 */
	public void setManifNbrColEnlevPhys(java.math.BigDecimal manifNbrColEnlevPhys) {
		this.manifNbrColEnlevPhys = manifNbrColEnlevPhys;
	}

	/**
	 * @return the manifPoidsEnlevPhys
	 */
	public java.math.BigDecimal getManifPoidsEnlevPhys() {
		return manifPoidsEnlevPhys;
	}

	/**
	 * @param manifPoidsEnlevPhys the manifPoidsEnlevPhys to set
	 */
	public void setManifPoidsEnlevPhys(java.math.BigDecimal manifPoidsEnlevPhys) {
		this.manifPoidsEnlevPhys = manifPoidsEnlevPhys;
	}

	/**
	 * @return the manifDateEnlevPhys
	 */
	public java.sql.Date getManifDateEnlevPhys() {
		return manifDateEnlevPhys;
	}

	/**
	 * @param manifDateEnlevPhys the manifDateEnlevPhys to set
	 */
	public void setManifDateEnlevPhys(java.sql.Date manifDateEnlevPhys) {
		this.manifDateEnlevPhys = manifDateEnlevPhys;
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
	 * @return the articleManifeste
	 */
	public ArticleManifeste getArticleManifeste() {
		return articleManifeste;
	}

	/**
	 * @param articleManifeste the articleManifeste to set
	 */
	public void setArticleManifeste(ArticleManifeste articleManifeste) {
		this.articleManifeste = articleManifeste;
	}

    
    
    
}
