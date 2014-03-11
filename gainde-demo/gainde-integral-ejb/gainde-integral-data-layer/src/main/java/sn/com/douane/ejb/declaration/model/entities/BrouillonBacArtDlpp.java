package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrouillonBacArtDlppKey;

@Entity
@IdClass(BrouillonBacArtDlppKey.class)                 
@Table(name="BROUILLONBACARTDLPP")
public class BrouillonBacArtDlpp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2924980270284606112L;

	@Id
	@Column(name="DLPPANNEEDLPP", length=4, nullable = false)
	private java.lang.String dlppAnneeDlpp;
	
	@Id
	@Column(name="DLPPNUMREPERTOIRE", length=6, nullable = false)
	private java.lang.String dlppNumRepertoire;
	
	@Id
	@Column(name="DLPPNUMARTICLE",  nullable = false)
	private java.lang.Integer dlppNumArticle;
	
	@Id
	@Column(name="DLLPPCODEBAC", length=10, nullable = false)
	private java.lang.String dlppCodeBac;
	
	@Id
	@Column(name="DLPPCODEPPMDECLARANT", length=5, nullable = false )
	private java.lang.String dlppCodePpmDeclarant;
	
	@Column(name="DLPPPDBRUT", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal dlppPdBrut;
	
	@Column(name="DLPPVOLAMBIANT", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal dlppVolAmbiant;
	
	@ManyToOne(targetEntity = BrouillonArticleDlpp.class)
	@JoinColumns(value = {
		@JoinColumn(name="DLPPANNEEDLPP", referencedColumnName ="DLPPANNEEDLPP" , insertable = false, updatable = false),
		@JoinColumn(name="DLPPCODEPPMDECLARANT", referencedColumnName ="DLPPCODEPPMDECLARANT" , insertable = false, updatable = false),
		@JoinColumn(name="DLPPNUMREPERTOIRE", referencedColumnName ="DLPPNUMREPERTOIRE" , insertable = false, updatable = false),
		@JoinColumn(name="DLPPNUMARTICLE", referencedColumnName ="DLPPNUMARTICLE" , insertable = false, updatable = false)
	})
	private BrouillonArticleDlpp brouillonArticleDlpp;
	
	public BrouillonBacArtDlpp() {
		super();
		// TODO Auto-generated constructor stub

		
		
	}


	/**
	 * @param dlppAnneeDlpp
	 * @param dlppNumRepertoire
	 * @param dlppNumArticle
	 * @param dlppCodeBac
	 * @param dlppCodePpmDeclarant
	 * @param dlppPdBrut
	 * @param dlppVolAmbiant
	 */
	public BrouillonBacArtDlpp(String dlppAnneeDlpp, String dlppNumRepertoire,
			Integer dlppNumArticle, String dlppCodeBac,
			String dlppCodePpmDeclarant, BigDecimal dlppPdBrut,
			BigDecimal dlppVolAmbiant) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppNumRepertoire = dlppNumRepertoire;
		this.dlppNumArticle = dlppNumArticle;
		this.dlppCodeBac = dlppCodeBac;
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
		this.dlppPdBrut = dlppPdBrut;
		this.dlppVolAmbiant = dlppVolAmbiant;
	}


	/**
	 * @return the dlppAnneeDlpp
	 */
	public java.lang.String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}


	/**
	 * @param dlppAnneeDlpp the dlppAnneeDlpp to set
	 */
	public void setDlppAnneeDlpp(java.lang.String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}


	/**
	 * @return the dlppNumRepertoire
	 */
	public java.lang.String getDlppNumRepertoire() {
		return dlppNumRepertoire;
	}


	/**
	 * @param dlppNumRepertoire the dlppNumRepertoire to set
	 */
	public void setDlppNumRepertoire(java.lang.String dlppNumRepertoire) {
		this.dlppNumRepertoire = dlppNumRepertoire;
	}


	/**
	 * @return the dlppNumArticle
	 */
	public java.lang.Integer getDlppNumArticle() {
		return dlppNumArticle;
	}


	/**
	 * @param dlppNumArticle the dlppNumArticle to set
	 */
	public void setDlppNumArticle(java.lang.Integer dlppNumArticle) {
		this.dlppNumArticle = dlppNumArticle;
	}


	/**
	 * @return the dlppCodeBac
	 */
	public java.lang.String getDlppCodeBac() {
		return dlppCodeBac;
	}


	/**
	 * @param dlppCodeBac the dlppCodeBac to set
	 */
	public void setDlppCodeBac(java.lang.String dlppCodeBac) {
		this.dlppCodeBac = dlppCodeBac;
	}


	/**
	 * @return the dlppCodePpmDeclarant
	 */
	public java.lang.String getDlppCodePpmDeclarant() {
		return dlppCodePpmDeclarant;
	}


	/**
	 * @param dlppCodePpmDeclarant the dlppCodePpmDeclarant to set
	 */
	public void setDlppCodePpmDeclarant(java.lang.String dlppCodePpmDeclarant) {
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
	}


	/**
	 * @return the dlppPdBrut
	 */
	public java.math.BigDecimal getDlppPdBrut() {
		return dlppPdBrut;
	}


	/**
	 * @param dlppPdBrut the dlppPdBrut to set
	 */
	public void setDlppPdBrut(java.math.BigDecimal dlppPdBrut) {
		this.dlppPdBrut = dlppPdBrut;
	}


	/**
	 * @return the dlppVolAmbiant
	 */
	public java.math.BigDecimal getDlppVolAmbiant() {
		return dlppVolAmbiant;
	}


	/**
	 * @param dlppVolAmbiant the dlppVolAmbiant to set
	 */
	public void setDlppVolAmbiant(java.math.BigDecimal dlppVolAmbiant) {
		this.dlppVolAmbiant = dlppVolAmbiant;
	}


	/**
	 * @return the brouillonArticleDlpp
	 */
	public BrouillonArticleDlpp getBrouillonArticleDlpp() {
		return brouillonArticleDlpp;
	}


	/**
	 * @param brouillonArticleDlpp the brouillonArticleDlpp to set
	 */
	public void setBrouillonArticleDlpp(BrouillonArticleDlpp brouillonArticleDlpp) {
		this.brouillonArticleDlpp = brouillonArticleDlpp;
	}


	
}
