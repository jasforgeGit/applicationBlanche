package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class DecisionKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	

	@Column(name="CODETYPEDECISION", length=1, nullable=false)
	private java.lang.String codeTypeDecision;
	
	
	@Column(name="NUMDECISION", length=50, nullable=false)
    private java.lang.String numDecision;
	
	
	@Column(name="PPMBENEFICIAIRE", length=5, nullable=false)
    private java.lang.String ppmBeneficiaire;


	public java.lang.String getCodeTypeDecision() {
		return codeTypeDecision;
	}
	


	
	
	
	
	public DecisionKey(String codeTypeDecision, String numDecision,
			String ppmBeneficiaire) {
		super();
		this.codeTypeDecision = codeTypeDecision;
		this.numDecision = numDecision;
		this.ppmBeneficiaire = ppmBeneficiaire;
	}







	public DecisionKey() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
	
}
