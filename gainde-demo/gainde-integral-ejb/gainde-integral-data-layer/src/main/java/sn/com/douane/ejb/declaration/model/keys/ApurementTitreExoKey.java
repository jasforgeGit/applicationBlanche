package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ApurementTitreExoKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6587093288424145468L;


	
	@Column(name="TITEXOANNEETITEXOESTE",length=4, nullable=false)
	 private java.lang.String titExoAnneeTitExoEste;
	
	
	@Column(name="TITEXOBUREAUFRANTITEXO",length=2, nullable=false)
	    private java.lang.String titExoBureauFranTitExo;
	
	
	@Column(name="TITEXONUMTITEXOESTE", nullable=false)
	    private java.lang.Integer titExoNumTitExoEste;
	
	
	@Column(name="TITEXOANNEEDECAPUR",length=4, nullable=false)
	    private java.lang.String titExoAnneeDecApur;
	
	
	@Column(name="TITEXOBUREAUDECAPUR",length=3, nullable=false)
	    private java.lang.String titExoBureauDecApur;
	
	
	@Column(name="TITEXONUMDECAPUR", nullable=false)
	    private java.lang.Integer titExoNumDecApur;
	
	
	@Column(name="TITEXOARTICLEDECAPUR", nullable=false)
	    private java.lang.Integer titExoArticleDecApur;
	
	
	@Column(name="TITEXONATUREAPUREMENT",length=1, nullable=false)
	    private java.lang.String titExoNatureApurement;


	public ApurementTitreExoKey(String titExoAnneeTitExoEste,
			String titExoBureauFranTitExo, Integer titExoNumTitExoEste,
			String titExoAnneeDecApur, String titExoBureauDecApur,
			Integer titExoNumDecApur, Integer titExoArticleDecApur,
			String titExoNatureApurement) {
		super();
		this.titExoAnneeTitExoEste = titExoAnneeTitExoEste;
		this.titExoBureauFranTitExo = titExoBureauFranTitExo;
		this.titExoNumTitExoEste = titExoNumTitExoEste;
		this.titExoAnneeDecApur = titExoAnneeDecApur;
		this.titExoBureauDecApur = titExoBureauDecApur;
		this.titExoNumDecApur = titExoNumDecApur;
		this.titExoArticleDecApur = titExoArticleDecApur;
		this.titExoNatureApurement = titExoNatureApurement;
	}


	public ApurementTitreExoKey() {
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
	
	
	
}
