package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BacArtDlppKey;

@Entity
@IdClass(BacArtDlppKey.class)
@Table(name = "BACARTDLPP")
public class BacArtDlpp implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 8748868316991476563L;

	@Id
	@Column(name = "DLPPANNEEDLPP", length = 4, nullable = false)
	private String dlppAnneeDlpp;

	@Id
	@Column(name = "DLPPCODEBUREAU", length = 3, nullable = false)
	private String dlppCodeBureau;

	@Id
	@Column(name = "DLPPNUMDLPP", nullable = false)
	private Integer dlppNumDlpp;

	@Id
	@Column(name = "DLPPNUMARTICLE", nullable = false)
	private Integer dlppNumArticle;

	@Column(name = "DLLPPCODEBAC", length = 10, nullable = false)
	private String dllppCodeBac;

	@Column(name = "DLPPPDBRUT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppPdBrut;

	@Column(name = "DLPPVOLAMBIANT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppVolAmbiant;

	@ManyToOne(targetEntity = ArticleDlpp.class)
	@JoinColumns({
			@JoinColumn(name = "DLPPANNEEDLPP", referencedColumnName = "DLPPANNEEDLPP", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DLPPCODEBUREAU", referencedColumnName = "DLPPCODEBUREAU", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DLPPNUMDLPP", referencedColumnName = "DLPPNUMDLPP", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DLPPNUMARTICLE", referencedColumnName = "DLPPNUMARTICLE", insertable = false, updatable = false, nullable = false) })
	private ArticleDlpp articleDlpp;

	public BacArtDlpp() {
		super();
	}

	public BacArtDlpp(String dlppAnneeDlpp, String dlppCodeBureau,
			Integer dlppNumDlpp, Integer dlppNumArticle) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodeBureau = dlppCodeBureau;
		this.dlppNumDlpp = dlppNumDlpp;
		this.dlppNumArticle = dlppNumArticle;
	}
	
	

	public BacArtDlpp(String dlppAnneeDlpp, String dlppCodeBureau,
			Integer dlppNumDlpp, Integer dlppNumArticle, String dllppCodeBac) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodeBureau = dlppCodeBureau;
		this.dlppNumDlpp = dlppNumDlpp;
		this.dlppNumArticle = dlppNumArticle;
		this.dllppCodeBac = dllppCodeBac;
	}

	public String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}

	public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}

	public String getDlppCodeBureau() {
		return dlppCodeBureau;
	}

	public void setDlppCodeBureau(String dlppCodeBureau) {
		this.dlppCodeBureau = dlppCodeBureau;
	}

	public Integer getDlppNumDlpp() {
		return dlppNumDlpp;
	}

	public void setDlppNumDlpp(Integer dlppNumDlpp) {
		this.dlppNumDlpp = dlppNumDlpp;
	}

	public Integer getDlppNumArticle() {
		return dlppNumArticle;
	}

	public void setDlppNumArticle(Integer dlppNumArticle) {
		this.dlppNumArticle = dlppNumArticle;
	}

	public String getDllppCodeBac() {
		return dllppCodeBac;
	}

	public void setDllppCodeBac(String dllppCodeBac) {
		this.dllppCodeBac = dllppCodeBac;
	}

	public java.math.BigDecimal getDlppPdBrut() {
		return dlppPdBrut;
	}

	public void setDlppPdBrut(java.math.BigDecimal dlppPdBrut) {
		this.dlppPdBrut = dlppPdBrut;
	}

	public java.math.BigDecimal getDlppVolAmbiant() {
		return dlppVolAmbiant;
	}

	public void setDlppVolAmbiant(java.math.BigDecimal dlppVolAmbiant) {
		this.dlppVolAmbiant = dlppVolAmbiant;
	}

	public ArticleDlpp getArticleDlpp() {
		return articleDlpp;
	}

	public void setArticleDlpp(ArticleDlpp articleDlpp) {
		this.articleDlpp = articleDlpp;
	}

}
