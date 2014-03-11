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

import sn.com.douane.ejb.declaration.model.keys.BrouiDispArtDecKey;

/**
 * @author moussakare
 *
 */
@Entity()
@IdClass(BrouiDispArtDecKey.class)
@Table(name = "BROUIDISPARTDEC")
public class BrouiDispArtDec implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8072943118464509631L;
	@Id	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Id	@Column(name="RCCODEDISPENSE", length = 5, nullable = false)
    private java.lang.String rcCodeDispense;
    @Id	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
    private java.lang.String decCodePpmDeclarant;
    @Id	@Column(name="DECNUMREPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
    @Id	@Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
    
    //ce champs est utilise pour calcul piece jointe
    private transient String codePieceJointe;

    
    @ManyToOne(targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)	
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false,nullable = false) })
    private BrouillonArtDec brArtDispArt;

	/**
	 * 
	 */
	public BrouiDispArtDec() {
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
	public BrouiDispArtDec(String decAnneeDecl, String rcCodeDispense,
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

	/**
	 * @return the brArtDispArt
	 */
	public BrouillonArtDec getBrArtDispArt() {
		return brArtDispArt;
	}

	/**
	 * @param brArtDispArt the brArtDispArt to set
	 */
	public void setBrArtDispArt(BrouillonArtDec brArtDispArt) {
		this.brArtDispArt = brArtDispArt;
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
