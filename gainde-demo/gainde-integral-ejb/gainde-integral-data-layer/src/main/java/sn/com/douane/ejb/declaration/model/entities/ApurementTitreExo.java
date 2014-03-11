package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ApurementTitreExoKey;




@Entity
@IdClass(ApurementTitreExoKey.class)
@Table(name="APUREMENTTITREEXO")
public class ApurementTitreExo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5695873424993599934L;

	
	@Id
	@Column(name="TITEXOANNEETITEXOESTE",length=4, nullable=false)
	 private java.lang.String titExoAnneeTitExoEste;
	
	@Id
	@Column(name="TITEXOBUREAUFRANTITEXO",length=2, nullable=false)
	    private java.lang.String titExoBureauFranTitExo;
	
	@Id
	@Column(name="TITEXONUMTITEXOESTE", nullable=false)
	    private java.lang.Integer titExoNumTitExoEste;
	
	@Id
	@Column(name="TITEXOANNEEDECAPUR",length=4, nullable=false)
	    private java.lang.String titExoAnneeDecApur;
	
	@Id
	@Column(name="TITEXOBUREAUDECAPUR",length=3, nullable=false)
	    private java.lang.String titExoBureauDecApur;
	
	@Id
	@Column(name="TITEXONUMDECAPUR", nullable=false)
	    private java.lang.Integer titExoNumDecApur;
	
	@Id
	@Column(name="TITEXOARTICLEDECAPUR", nullable=false)
	    private java.lang.Integer titExoArticleDecApur;
	
	@Id
	@Column(name="TITEXONATUREAPUREMENT",length=1, nullable=false)
	    private java.lang.String titExoNatureApurement;
	
	@Column(name="TITEXONBRCOLIS",columnDefinition="DECIMAL(6,0)")
	    private java.math.BigDecimal titExoNbrColis;
	
	@Column(name="TITEXOPOIDSBRUT",columnDefinition="DECIMAL(9,0)")
	    private java.math.BigDecimal titExoPoidsBrut;
	
	@Column(name="TITEXOQTECOMPL",columnDefinition="DECIMAL(6,0)")
	    private java.math.BigDecimal titExoQteCompl;
	
	@Column(name="TITEXOVALEUR",columnDefinition="DECIMAL(15,0)")
	    private java.math.BigDecimal titExoValeur;
	
	@Column(name="TITEXODATEAPUREMENT")
	    private java.sql.Date titExoDateApurement;

	public ApurementTitreExo(String titExoAnneeTitExoEste,
			String titExoBureauFranTitExo, Integer titExoNumTitExoEste,
			String titExoAnneeDecApur, String titExoBureauDecApur,
			Integer titExoNumDecApur, Integer titExoArticleDecApur,
			String titExoNatureApurement, BigDecimal titExoNbrColis,
			BigDecimal titExoPoidsBrut, BigDecimal titExoQteCompl,
			BigDecimal titExoValeur, Date titExoDateApurement) {
		super();
		this.titExoAnneeTitExoEste = titExoAnneeTitExoEste;
		this.titExoBureauFranTitExo = titExoBureauFranTitExo;
		this.titExoNumTitExoEste = titExoNumTitExoEste;
		this.titExoAnneeDecApur = titExoAnneeDecApur;
		this.titExoBureauDecApur = titExoBureauDecApur;
		this.titExoNumDecApur = titExoNumDecApur;
		this.titExoArticleDecApur = titExoArticleDecApur;
		this.titExoNatureApurement = titExoNatureApurement;
		this.titExoNbrColis = titExoNbrColis;
		this.titExoPoidsBrut = titExoPoidsBrut;
		this.titExoQteCompl = titExoQteCompl;
		this.titExoValeur = titExoValeur;
		this.titExoDateApurement = titExoDateApurement;
	}

	public ApurementTitreExo() {
		super();
	}

	public java.lang.String getTitExoAnneeTitExoEste() {
		return titExoAnneeTitExoEste;
	}

	public void setTitExoAnneeTitExoEste(java.lang.String titExoAnneeTitExoEste) {
		this.titExoAnneeTitExoEste = titExoAnneeTitExoEste;
	}

	public java.lang.String getTitExoBureauFranTitExo() {
		return titExoBureauFranTitExo;
	}

	public void setTitExoBureauFranTitExo(java.lang.String titExoBureauFranTitExo) {
		this.titExoBureauFranTitExo = titExoBureauFranTitExo;
	}

	public java.lang.Integer getTitExoNumTitExoEste() {
		return titExoNumTitExoEste;
	}

	public void setTitExoNumTitExoEste(java.lang.Integer titExoNumTitExoEste) {
		this.titExoNumTitExoEste = titExoNumTitExoEste;
	}

	public java.lang.String getTitExoAnneeDecApur() {
		return titExoAnneeDecApur;
	}

	public void setTitExoAnneeDecApur(java.lang.String titExoAnneeDecApur) {
		this.titExoAnneeDecApur = titExoAnneeDecApur;
	}

	public java.lang.String getTitExoBureauDecApur() {
		return titExoBureauDecApur;
	}

	public void setTitExoBureauDecApur(java.lang.String titExoBureauDecApur) {
		this.titExoBureauDecApur = titExoBureauDecApur;
	}

	public java.lang.Integer getTitExoNumDecApur() {
		return titExoNumDecApur;
	}

	public void setTitExoNumDecApur(java.lang.Integer titExoNumDecApur) {
		this.titExoNumDecApur = titExoNumDecApur;
	}

	public java.lang.Integer getTitExoArticleDecApur() {
		return titExoArticleDecApur;
	}

	public void setTitExoArticleDecApur(java.lang.Integer titExoArticleDecApur) {
		this.titExoArticleDecApur = titExoArticleDecApur;
	}

	public java.lang.String getTitExoNatureApurement() {
		return titExoNatureApurement;
	}

	public void setTitExoNatureApurement(java.lang.String titExoNatureApurement) {
		this.titExoNatureApurement = titExoNatureApurement;
	}

	public java.math.BigDecimal getTitExoNbrColis() {
		return titExoNbrColis;
	}

	public void setTitExoNbrColis(java.math.BigDecimal titExoNbrColis) {
		this.titExoNbrColis = titExoNbrColis;
	}

	public java.math.BigDecimal getTitExoPoidsBrut() {
		return titExoPoidsBrut;
	}

	public void setTitExoPoidsBrut(java.math.BigDecimal titExoPoidsBrut) {
		this.titExoPoidsBrut = titExoPoidsBrut;
	}

	public java.math.BigDecimal getTitExoQteCompl() {
		return titExoQteCompl;
	}

	public void setTitExoQteCompl(java.math.BigDecimal titExoQteCompl) {
		this.titExoQteCompl = titExoQteCompl;
	}

	public java.math.BigDecimal getTitExoValeur() {
		return titExoValeur;
	}

	public void setTitExoValeur(java.math.BigDecimal titExoValeur) {
		this.titExoValeur = titExoValeur;
	}

	public java.sql.Date getTitExoDateApurement() {
		return titExoDateApurement;
	}

	public void setTitExoDateApurement(java.sql.Date titExoDateApurement) {
		this.titExoDateApurement = titExoDateApurement;
	}
	
	
}
