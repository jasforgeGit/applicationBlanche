package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BrouillonBacArtDlppKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4677702454883193026L;

	
	@Id
	@Column(name="DLPPANNEEDLPP", length=4, nullable=false)
	private java.lang.String dlppAnneeDlpp;
	
	@Id
	@Column(name="DLPPNUMREPERTOIRE", length=6, nullable=false)
	private java.lang.String dlppNumRepertoire;
	
	@Id
	@Column(name="DLPPNUMARTICLE",  nullable=false)
	private java.lang.Integer dlppNumArticle;
	
	@Id
	@Column(name="DLLPPCODEBAC", length=10, nullable=false)
	private java.lang.String dlppCodeBac;
	
	@Column(name="DLPPCODEPPMDECLARANT", length=5, nullable=false )
	private java.lang.String dlppCodePpmDeclarant;


	public BrouillonBacArtDlppKey() {
		super();
		// TODO Auto-generated constructor stub}

	}


	/**
	 * @param dlppAnneeDlpp
	 * @param dlppNumRepertoire
	 * @param dlppNumArticle
	 * @param dlppCodeBac
	 * @param dlppCodePpmDeclarant
	 */
	public BrouillonBacArtDlppKey(String dlppAnneeDlpp,
			String dlppNumRepertoire, Integer dlppNumArticle,
			String dlppCodeBac, String dlppCodePpmDeclarant) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppNumRepertoire = dlppNumRepertoire;
		this.dlppNumArticle = dlppNumArticle;
		this.dlppCodeBac = dlppCodeBac;
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
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
	
	
}
