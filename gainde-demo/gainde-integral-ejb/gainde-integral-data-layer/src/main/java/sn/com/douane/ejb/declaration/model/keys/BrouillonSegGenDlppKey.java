/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class BrouillonSegGenDlppKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6611698437582736819L;
	
	@Column(name = "DLPPANNEEDLPP" ,length = 4, nullable = false)
	private java.lang.String dlppAnneeDlpp;
	@Column(name = "DLPPCODEPPMDECLARANT" ,length = 5, nullable = false)
    private java.lang.String dlppCodePpmDeclarant;
	@Column(name = "DLPPNUMREPERTOIRE" ,length = 6, nullable = false)
	private java.lang.String dlppNumRepertoire;
	/**
	 * 
	 */
	public BrouillonSegGenDlppKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dlppAnneeDlpp
	 * @param dlppCodePpmDeclarant
	 * @param dlppNumRepertoire
	 */
	public BrouillonSegGenDlppKey(String dlppAnneeDlpp,
			String dlppCodePpmDeclarant, String dlppNumRepertoire) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
		this.dlppNumRepertoire = dlppNumRepertoire;
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
	
	

}
