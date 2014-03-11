package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BurPassageAcquitEnrKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4255231772562033816L;

	


	@Column(name="DECANNEEDECL", length=4, nullable=false)
    private java.lang.String anneeDeclaration;
	
	@Column(name="DECBURDECLARATION", length=3, nullable=false)
    private java.lang.String bureauDec;
	
	@Column(name="DECNUMDECLARATION", nullable=false)
    private java.lang.Integer numeroDeclaration;
	
	@Column(name="DECBURPASSAGE", length=3, nullable=false)
	 private java.lang.String decBurPassage;




	public BurPassageAcquitEnrKey(String anneeDeclaration, String bureauDec,
			Integer numeroDeclaration, String decBurPassage) {
		super();
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
		this.decBurPassage = decBurPassage;
	}




	public BurPassageAcquitEnrKey() {
		super();
	}




	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}




	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}




	public java.lang.String getBureauDec() {
		return bureauDec;
	}




	public void setBureauDec(java.lang.String bureauDec) {
		this.bureauDec = bureauDec;
	}




	public java.lang.Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}




	public void setNumeroDeclaration(java.lang.Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}




	public java.lang.String getDecBurPassage() {
		return decBurPassage;
	}




	public void setDecBurPassage(java.lang.String decBurPassage) {
		this.decBurPassage = decBurPassage;
	}





}
