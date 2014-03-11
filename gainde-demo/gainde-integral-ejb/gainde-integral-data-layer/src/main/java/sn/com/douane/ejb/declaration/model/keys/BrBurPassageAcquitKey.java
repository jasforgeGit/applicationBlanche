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
public class BrBurPassageAcquitKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8407004985036831205L;
	@Column(name = "DECANNEEACQUIT", length = 4, nullable = false)
    private java.lang.String decAnneeDecl;
	@Column(name = "DECPPDECLARANT", length = 5, nullable = false)
    private java.lang.String decCodePpmDecl;
	@Column(name = "DECNUMPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
	@Column(name = "DECBURPASSAGE", length = 3, nullable = false)
	private java.lang.String decBurPassage;
	/**
	 * 
	 */
	public BrBurPassageAcquitKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDecl
	 * @param decNumRepertoire
	 * @param decBurPassage
	 */
	public BrBurPassageAcquitKey(String decAnneeDecl, String decCodePpmDecl,
			String decNumRepertoire, String decBurPassage) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decBurPassage = decBurPassage;
	}
	/**
	 * @return the decAnneeDecl
	 */
	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}
	/**
	 * @param decAnneeDecl the decAnneeDecl to set
	 */
	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}
	/**
	 * @return the decCodePpmDecl
	 */
	public java.lang.String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}
	/**
	 * @param decCodePpmDecl the decCodePpmDecl to set
	 */
	public void setDecCodePpmDecl(java.lang.String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
	}
	/**
	 * @return the decNumRepertoire
	 */
	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}
	/**
	 * @param decNumRepertoire the decNumRepertoire to set
	 */
	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}
	/**
	 * @return the decBurPassage
	 */
	public java.lang.String getDecBurPassage() {
		return decBurPassage;
	}
	/**
	 * @param decBurPassage the decBurPassage to set
	 */
	public void setDecBurPassage(java.lang.String decBurPassage) {
		this.decBurPassage = decBurPassage;
	}
	

}
