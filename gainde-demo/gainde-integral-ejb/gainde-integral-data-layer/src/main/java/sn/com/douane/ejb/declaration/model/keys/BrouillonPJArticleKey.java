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
public class BrouillonPJArticleKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7101066399795911547L;
	
	@Column(name = "DECANNEEDECLARATION", length = 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
    private java.lang.String decCodePpmDeclarant;
    @Column(name="DECNUMREPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
    @Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
    @Column(name="CODEPIECEJOINTE", length = 3, nullable = false)
    private java.lang.String codePieceJointe;
	/**
	 * 
	 */
	public BrouillonPJArticleKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDeclarant
	 * @param decNumRepertoire
	 * @param decNumArtDecl
	 * @param codePieceJointe
	 */
	public BrouillonPJArticleKey(String decAnneeDecl,String decCodePpmDeclarant, String decNumRepertoire, Integer decNumArtDecl, String codePieceJointe) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.codePieceJointe = codePieceJointe;
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
	 * @return the codePieceJointe
	 */
	public java.lang.String getCodePieceJointe() {
		return codePieceJointe;
	}
	/**
	 * @param codePieceJointe the codePieceJointe to set
	 */
	public void setCodePieceJointe(java.lang.String codePieceJointe) {
		this.codePieceJointe = codePieceJointe;
	}
    
    

}
