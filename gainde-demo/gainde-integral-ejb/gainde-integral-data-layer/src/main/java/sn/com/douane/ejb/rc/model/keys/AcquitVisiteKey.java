package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class AcquitVisiteKey implements Serializable {

	private static final long serialVersionUID = -1954295418165838646L;	
	
	@Column(name="ANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String anneeDeclaration;	
	
	@Column(name="BUREAUDEC", length=3, nullable=false)
    private java.lang.String bureauDec;	

	@Column(name="NUMERODECLARATION", nullable=false)
    private java.lang.Integer numeroDeclaration;

	public AcquitVisiteKey(String anneeDeclaration, String bureauDec, Integer numeroDeclaration) {
		super();
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
	}

	public AcquitVisiteKey() {
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

	
}
