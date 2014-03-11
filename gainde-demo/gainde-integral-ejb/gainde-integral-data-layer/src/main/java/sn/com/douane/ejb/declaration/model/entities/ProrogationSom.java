/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ProrogationSomKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(ProrogationSomKey.class)
@Table(name = "PROROGATIONSOM")
public class ProrogationSom implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -6626315549985108173L;
	
	@Id @Column(name = "DECANNEEDECL", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Id @Column(name = "DECBUREAUDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id @Column(name = "DECNUMDECL", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id @Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Id @Column(name = "DECDATEPROROGATION", nullable = false)
    private java.sql.Date decDateProrogation;
	@Column(name = "DECPPMDECLARANT", length = 5)
    private java.lang.String decPpmDeclarant;
	@Column(name = "DECCODEAGREE", length = 3)
    private java.lang.String decCodeAgree;
	@Column(name = "DECDECISIONPROROG", length = 20)
    private java.lang.String decDecisionProrog;
	@Column(name = "DECDATEDECISION")
    private java.sql.Date decDateDecision;
	@Column(name = "DECDUREEPROROG", columnDefinition = "DECIMAL(2,0)")
    private java.math.BigDecimal decDureeProrog;
	@Column(name = "DECCODEAGENT", length = 5)
    private java.lang.String decCodeAgent;
	@Column(name = "DECDATECREATION")
    private java.sql.Date decDateCreation;
		
	@ManyToOne(targetEntity = Sommiers.class)
	@JoinColumns({
		@JoinColumn(name = "DECANNEEDECL", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECBUREAUDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMDECL", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false, nullable = false)
		})
    private Sommiers somProroSomm;

	/**
	 * 
	 */
	public ProrogationSom() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decDateProrogation
	 */
	public ProrogationSom(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			Date decDateProrogation) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decDateProrogation = decDateProrogation;
	}

	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	/**
	 * @return the decDateProrogation
	 */
	public java.sql.Date getDecDateProrogation() {
		return decDateProrogation;
	}

	/**
	 * @param decDateProrogation the decDateProrogation to set
	 */
	public void setDecDateProrogation(java.sql.Date decDateProrogation) {
		this.decDateProrogation = decDateProrogation;
	}

	/**
	 * @return the decPpmDeclarant
	 */
	public java.lang.String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	/**
	 * @param decPpmDeclarant the decPpmDeclarant to set
	 */
	public void setDecPpmDeclarant(java.lang.String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

	/**
	 * @return the decCodeAgree
	 */
	public java.lang.String getDecCodeAgree() {
		return decCodeAgree;
	}

	/**
	 * @param decCodeAgree the decCodeAgree to set
	 */
	public void setDecCodeAgree(java.lang.String decCodeAgree) {
		this.decCodeAgree = decCodeAgree;
	}

	/**
	 * @return the decDecisionProrog
	 */
	public java.lang.String getDecDecisionProrog() {
		return decDecisionProrog;
	}

	/**
	 * @param decDecisionProrog the decDecisionProrog to set
	 */
	public void setDecDecisionProrog(java.lang.String decDecisionProrog) {
		this.decDecisionProrog = decDecisionProrog;
	}

	/**
	 * @return the decDateDecision
	 */
	public java.sql.Date getDecDateDecision() {
		return decDateDecision;
	}

	/**
	 * @param decDateDecision the decDateDecision to set
	 */
	public void setDecDateDecision(java.sql.Date decDateDecision) {
		this.decDateDecision = decDateDecision;
	}

	/**
	 * @return the decDureeProrog
	 */
	public java.math.BigDecimal getDecDureeProrog() {
		return decDureeProrog;
	}

	/**
	 * @param decDureeProrog the decDureeProrog to set
	 */
	public void setDecDureeProrog(java.math.BigDecimal decDureeProrog) {
		this.decDureeProrog = decDureeProrog;
	}

	/**
	 * @return the decCodeAgent
	 */
	public java.lang.String getDecCodeAgent() {
		return decCodeAgent;
	}

	/**
	 * @param decCodeAgent the decCodeAgent to set
	 */
	public void setDecCodeAgent(java.lang.String decCodeAgent) {
		this.decCodeAgent = decCodeAgent;
	}

	/**
	 * @return the decDateCreation
	 */
	public java.sql.Date getDecDateCreation() {
		return decDateCreation;
	}

	/**
	 * @param decDateCreation the decDateCreation to set
	 */
	public void setDecDateCreation(java.sql.Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}

	/**
	 * @return the somProroSomm
	 */
	public Sommiers getSomProroSomm() {
		return somProroSomm;
	}

	/**
	 * @param somProroSomm the somProroSomm to set
	 */
	public void setSomProroSomm(Sommiers somProroSomm) {
		this.somProroSomm = somProroSomm;
	}
	
	

}
