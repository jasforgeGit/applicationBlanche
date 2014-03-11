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
public class BrouillonArtTransbKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6702608119536496619L;
	
	@Column(name = "DECNUMARTDECL", nullable = false)
	private java.lang.Integer decNumArtDecl;
	@Column(name = "DECANNEEDECL", length = 4,nullable = false)
	private java.lang.String decAnneeEnregTrans;
	@Column(name = "DECCODEPPM", length = 5, nullable = false)
	private java.lang.String decPpmDecTrans;
	@Column(name = "DECNUMREPTRANS", length = 6, nullable = false)
	private java.lang.String decRepDecTrans;
	/**
	 * 
	 */
	public BrouillonArtTransbKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decNumArtDecl
	 * @param decAnneeEnregTrans
	 * @param decPpmDecTrans
	 * @param decRepDecTrans
	 */
	public BrouillonArtTransbKey(Integer decNumArtDecl,
			String decAnneeEnregTrans, String decPpmDecTrans,
			String decRepDecTrans) {
		super();
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeEnregTrans = decAnneeEnregTrans;
		this.decPpmDecTrans = decPpmDecTrans;
		this.decRepDecTrans = decRepDecTrans;
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
	 * @return the decAnneeEnregTrans
	 */
	public java.lang.String getDecAnneeEnregTrans() {
		return decAnneeEnregTrans;
	}
	/**
	 * @param decAnneeEnregTrans the decAnneeEnregTrans to set
	 */
	public void setDecAnneeEnregTrans(java.lang.String decAnneeEnregTrans) {
		this.decAnneeEnregTrans = decAnneeEnregTrans;
	}
	/**
	 * @return the decPpmDecTrans
	 */
	public java.lang.String getDecPpmDecTrans() {
		return decPpmDecTrans;
	}
	/**
	 * @param decPpmDecTrans the decPpmDecTrans to set
	 */
	public void setDecPpmDecTrans(java.lang.String decPpmDecTrans) {
		this.decPpmDecTrans = decPpmDecTrans;
	}
	/**
	 * @return the decRepDecTrans
	 */
	public java.lang.String getDecRepDecTrans() {
		return decRepDecTrans;
	}
	/**
	 * @param decRepDecTrans the decRepDecTrans to set
	 */
	public void setDecRepDecTrans(java.lang.String decRepDecTrans) {
		this.decRepDecTrans = decRepDecTrans;
	}
	

}
