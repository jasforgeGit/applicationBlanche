/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrArtSoumDocKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrArtSoumDocKey.class)
@Table(name = "BRARTSOUMDOC")
public class BrArtSoumDoc implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -546388971960504767L;
	
	@Id	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Id	@Column(name="DECCODEPPMDECLARANT", length= 5)
    private java.lang.String decCodePpmDeclarant;
	@Id	@Column(name="DECNUMREPERTOIRE", length= 6, nullable = false)
    private java.lang.String decNumRepertoire;
	@Id	@Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Id	@Column(name="DECCODESOUMDOC", length= 2, nullable = false)
    private java.lang.String decCodeSoumDoc;
	
	//ce champs est ajouter lors de calcul piece jointe
	private transient String codePieceJointe;

	
    @ManyToOne(targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)	
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false,nullable = false) })
	private BrouillonArtDec brArtSoumDoc;

	/**
	 * 
	 */
	public BrArtSoumDoc() {
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
	public BrArtSoumDoc(String decAnneeDecl, String decCodePpmDeclarant,
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

	/**
	 * @return the brArtSoumDoc
	 */
	public BrouillonArtDec getBrArtSoumDoc() {
		return brArtSoumDoc;
	}

	/**
	 * @param brArtSoumDoc the brArtSoumDoc to set
	 */
	public void setBrArtSoumDoc(BrouillonArtDec brArtSoumDoc) {
		this.brArtSoumDoc = brArtSoumDoc;
	}

	/**
	 * @return the codePieceJointe
	 */
	public String getCodePieceJointe() {
		return codePieceJointe;
	}

	/**
	 * @param codePieceJointe the codePieceJointe to set
	 */
	public void setCodePieceJointe(String codePieceJointe) {
		this.codePieceJointe = codePieceJointe;
	}
	
	
    
    

}
