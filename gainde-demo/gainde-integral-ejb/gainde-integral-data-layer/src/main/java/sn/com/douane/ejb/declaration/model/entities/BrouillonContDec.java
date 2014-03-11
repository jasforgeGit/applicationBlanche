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

import sn.com.douane.ejb.declaration.model.keys.BrouillonContDecKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrouillonContDecKey.class)
@Table(name="BROUILLONCONTDEC")
public class BrouillonContDec implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4985832409950979376L;
	
	@Id	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Id	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
    private java.lang.String decCodePpmDeclarant;
	@Id	@Column(name="DECNUMREPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
	@Id	@Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Id	@Column(name="DECNUMARTCONTENEUR", nullable = false)
    private java.lang.Integer decNumArtConteneur;
	@Column(name="DECNUMCONTENEUR", length= 11)
    private java.lang.String decNumConteneur;
	@Column(name="DECNUMPLOMB", length= 8)
    private java.lang.String decNumPlomb;
	@Column(name="DECTYPECONTENEUR", length= 4)
    private java.lang.String decTypeConteneur;
	@Column(name="DECTAILLECONTENEUR", length= 8)
    private java.lang.String decTailleConteneur;
	@Column(name="DECNUMCHASSIS", length= 17)
    private java.lang.String decNumChassis;
	
	
	
	@ManyToOne(targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)	
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false,nullable = false) })
    private BrouillonArtDec brArtCont;



	/**
	 * 
	 */
	public BrouillonContDec() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDeclarant
	 * @param decNumRepertoire
	 * @param decNumArtDecl
	 * @param decNumArtConteneur
	 */
	public BrouillonContDec(String decAnneeDecl, String decCodePpmDeclarant,
			String decNumRepertoire, Integer decNumArtDecl,
			Integer decNumArtConteneur) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.decNumArtConteneur = decNumArtConteneur;
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
	 * @return the decNumArtConteneur
	 */
	public java.lang.Integer getDecNumArtConteneur() {
		return decNumArtConteneur;
	}



	/**
	 * @param decNumArtConteneur the decNumArtConteneur to set
	 */
	public void setDecNumArtConteneur(java.lang.Integer decNumArtConteneur) {
		this.decNumArtConteneur = decNumArtConteneur;
	}



	/**
	 * @return the decNumConteneur
	 */
	public java.lang.String getDecNumConteneur() {
		return decNumConteneur;
	}



	/**
	 * @param decNumConteneur the decNumConteneur to set
	 */
	public void setDecNumConteneur(java.lang.String decNumConteneur) {
		this.decNumConteneur = decNumConteneur;
	}



	/**
	 * @return the decNumPlomb
	 */
	public java.lang.String getDecNumPlomb() {
		return decNumPlomb;
	}



	/**
	 * @param decNumPlomb the decNumPlomb to set
	 */
	public void setDecNumPlomb(java.lang.String decNumPlomb) {
		this.decNumPlomb = decNumPlomb;
	}



	/**
	 * @return the decTypeConteneur
	 */
	public java.lang.String getDecTypeConteneur() {
		return decTypeConteneur;
	}



	/**
	 * @param decTypeConteneur the decTypeConteneur to set
	 */
	public void setDecTypeConteneur(java.lang.String decTypeConteneur) {
		this.decTypeConteneur = decTypeConteneur;
	}



	/**
	 * @return the decTailleConteneur
	 */
	public java.lang.String getDecTailleConteneur() {
		return decTailleConteneur;
	}



	/**
	 * @param decTailleConteneur the decTailleConteneur to set
	 */
	public void setDecTailleConteneur(java.lang.String decTailleConteneur) {
		this.decTailleConteneur = decTailleConteneur;
	}



	/**
	 * @return the decNumChassis
	 */
	public java.lang.String getDecNumChassis() {
		return decNumChassis;
	}



	/**
	 * @param decNumChassis the decNumChassis to set
	 */
	public void setDecNumChassis(java.lang.String decNumChassis) {
		this.decNumChassis = decNumChassis;
	}



	/**
	 * @return the brArtCont
	 */
	public BrouillonArtDec getBrArtCont() {
		return brArtCont;
	}



	/**
	 * @param brArtCont the brArtCont to set
	 */
	public void setBrArtCont(BrouillonArtDec brArtCont) {
		this.brArtCont = brArtCont;
	}
	
	
	
	


}
