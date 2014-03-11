package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;


import sn.com.douane.ejb.tresor.model.keys.DecisionKey;


@Entity
@IdClass(DecisionKey.class)
@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findbyPpmbenef", query = "select object(o) from Decision o where o.ppmBeneficiaire =?1"))
@Table(name="DECISION")
public class Decision implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	
	@Id
	@Column(name="CODETYPEDECISION", length=1, nullable=false)
	private java.lang.String codeTypeDecision;
	
	@Id
	@Column(name="NUMDECISION", length=50, nullable=false)
    private java.lang.String numDecision;
	
	@Id
	@Column(name="PPMBENEFICIAIRE", length=5, nullable=false)
    private java.lang.String ppmBeneficiaire;
	
	@Column(name="DATEDECISION")
    private java.sql.Date dateDecision;
	
	@Column(name="REFERENCEDECISION", length=100)
    private java.lang.String referenceDecision;
	
	@Column(name="USERDECISION", length=7)
    private java.lang.String userDecision;

	@Transient
	private String libelleTypeDecision;
	
	public Decision(String codeTypeDecision, String numDecision,
			String ppmBeneficiaire) {
		super();
		this.codeTypeDecision = codeTypeDecision;
		this.numDecision = numDecision;
		this.ppmBeneficiaire = ppmBeneficiaire;
	}

	public Decision() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getCodeTypeDecision() {
		return codeTypeDecision;
	}

	public void setCodeTypeDecision(java.lang.String codeTypeDecision) {
		this.codeTypeDecision = codeTypeDecision;
	}

	public java.lang.String getNumDecision() {
		return numDecision;
	}

	public void setNumDecision(java.lang.String numDecision) {
		this.numDecision = numDecision;
	}

	public java.lang.String getPpmBeneficiaire() {
		return ppmBeneficiaire;
	}

	public void setPpmBeneficiaire(java.lang.String ppmBeneficiaire) {
		this.ppmBeneficiaire = ppmBeneficiaire;
	}

	public java.sql.Date getDateDecision() {
		return dateDecision;
	}

	public void setDateDecision(java.sql.Date dateDecision) {
		this.dateDecision = dateDecision;
	}

	public java.lang.String getReferenceDecision() {
		return referenceDecision;
	}

	public void setReferenceDecision(java.lang.String referenceDecision) {
		this.referenceDecision = referenceDecision;
	}

	public java.lang.String getUserDecision() {
		return userDecision;
	}

	public void setUserDecision(java.lang.String userDecision) {
		this.userDecision = userDecision;
	}

	public String getLibelleTypeDecision() {
		return libelleTypeDecision;
	}

	public void setLibelleTypeDecision(String libelleTypeDecision) {
		this.libelleTypeDecision = libelleTypeDecision;
	}
    

}
