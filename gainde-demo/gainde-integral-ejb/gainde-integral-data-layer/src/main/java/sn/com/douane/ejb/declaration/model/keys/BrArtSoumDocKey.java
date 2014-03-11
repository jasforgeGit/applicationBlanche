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
public class BrArtSoumDocKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5535227383567130380L;
	
	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Column(name="DECCODEPPMDECLARANT", length= 5)
    private java.lang.String decCodePpmDeclarant;
	@Column(name="DECNUMREPERTOIRE", length= 6, nullable = false)
    private java.lang.String decNumRepertoire;
	@Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Column(name="DECCODESOUMDOC", length= 2, nullable = false)
    private java.lang.String decCodeSoumDoc;
	/**
	 * 
	 */
	public BrArtSoumDocKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDeclarant
	 * @param decNumRepertoire
	 * @param decNumArtDecl
	 * @param decCodeSoumDoc
	 */
	public BrArtSoumDocKey(String decAnneeDecl, String decCodePpmDeclarant,
			String decNumRepertoire, Integer decNumArtDecl,
			String decCodeSoumDoc) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeSoumDoc = decCodeSoumDoc;
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
	 * @return the decCodePpmDeclarant
	 */
	public java.lang.String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}
	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(java.lang.String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
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
	 * @return the decNumArtDecl
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	/**
	 * @param decNumArtDecl the decNumArtDecl to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}
	/**
	 * @return the decCodeSoumDoc
	 */
	public java.lang.String getDecCodeSoumDoc() {
		return decCodeSoumDoc;
	}
	/**
	 * @param decCodeSoumDoc the decCodeSoumDoc to set
	 */
	public void setDecCodeSoumDoc(java.lang.String decCodeSoumDoc) {
		this.decCodeSoumDoc = decCodeSoumDoc;
	}
	
	

}
