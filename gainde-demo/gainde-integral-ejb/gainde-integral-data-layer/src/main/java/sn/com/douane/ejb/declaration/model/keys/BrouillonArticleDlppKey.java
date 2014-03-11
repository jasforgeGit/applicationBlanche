package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BrouillonArticleDlppKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1892130381570572843L;

	@Column(name = "DLPPANNEEDLPP" , length = 4, nullable = false)
	private String dlppAnneeDlpp;

	@Column(name = "DLPPCODEPPMDECLARANT" , length = 5, nullable = false)
	 private String dlppCodePpmDeclarant;

	@Column(name = "DLPPNUMREPERTOIRE" ,length = 6, nullable = false)
	private String dlppNumRepertoire;
	
	@Column(name = "DLPPNUMARTICLE" , nullable = false)
	private java.lang.Integer dlppNumArticle;

	/**
	 * 
	 */
	public BrouillonArticleDlppKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dlppAnneeDlpp
	 * @param dlppCodePpmDeclarant
	 * @param dlppNumRepertoire
	 * @param dlppNumArticle
	 */
	public BrouillonArticleDlppKey(String dlppAnneeDlpp,
			String dlppCodePpmDeclarant, String dlppNumRepertoire,
			Integer dlppNumArticle) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
		this.dlppNumRepertoire = dlppNumRepertoire;
		this.dlppNumArticle = dlppNumArticle;
	}

	/**
	 * @return the dlppAnneeDlpp
	 */
	public String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}

	/**
	 * @param dlppAnneeDlpp the dlppAnneeDlpp to set
	 */
	public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}

	/**
	 * @return the dlppCodePpmDeclarant
	 */
	public String getDlppCodePpmDeclarant() {
		return dlppCodePpmDeclarant;
	}

	/**
	 * @param dlppCodePpmDeclarant the dlppCodePpmDeclarant to set
	 */
	public void setDlppCodePpmDeclarant(String dlppCodePpmDeclarant) {
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
	}

	/**
	 * @return the dlppNumRepertoire
	 */
	public String getDlppNumRepertoire() {
		return dlppNumRepertoire;
	}

	/**
	 * @param dlppNumRepertoire the dlppNumRepertoire to set
	 */
	public void setDlppNumRepertoire(String dlppNumRepertoire) {
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
	
	
	
}
