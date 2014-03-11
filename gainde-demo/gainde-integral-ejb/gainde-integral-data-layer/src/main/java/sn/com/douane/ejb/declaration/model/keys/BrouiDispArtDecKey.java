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
public class BrouiDispArtDecKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8815718770719915685L;
	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Column(name="RCCODEDISPENSE", length = 5, nullable = false)
    private java.lang.String rcCodeDispense;
    @Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
    private java.lang.String decCodePpmDeclarant;
    @Column(name="DECNUMREPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
    @Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	/**
	 * 
	 */
	public BrouiDispArtDecKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeDecl
	 * @param rcCodeDispense
	 * @param decCodePpmDeclarant
	 * @param decNumRepertoire
	 * @param decNumArtDecl
	 */
	public BrouiDispArtDecKey(String decAnneeDecl, String rcCodeDispense,
			String decCodePpmDeclarant, String decNumRepertoire,
			Integer decNumArtDecl) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.rcCodeDispense = rcCodeDispense;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
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
	 * @return the rcCodeDispense
	 */
	public java.lang.String getRcCodeDispense() {
		return rcCodeDispense;
	}
	/**
	 * @param rcCodeDispense the rcCodeDispense to set
	 */
	public void setRcCodeDispense(java.lang.String rcCodeDispense) {
		this.rcCodeDispense = rcCodeDispense;
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

}
