package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class RemboursementKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;

	
	

	@Column(name="TRANNEEDECLARATION", length=4, nullable=false)
	 private java.lang.String trAnneeDeclaration;
	
	
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	    private java.lang.String trBurDeclaration;
	
	
	@Column(name="TRNUMDECLARATION", nullable=false)
	    private java.lang.Integer trNumDeclaration;


	public RemboursementKey(String trAnneeDeclaration, String trBurDeclaration,
			Integer trNumDeclaration) {
		super();
		this.trAnneeDeclaration = trAnneeDeclaration;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
	}


	public RemboursementKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getTrAnneeDeclaration() {
		return trAnneeDeclaration;
	}


	public void setTrAnneeDeclaration(java.lang.String trAnneeDeclaration) {
		this.trAnneeDeclaration = trAnneeDeclaration;
	}


	public java.lang.String getTrBurDeclaration() {
		return trBurDeclaration;
	}


	public void setTrBurDeclaration(java.lang.String trBurDeclaration) {
		this.trBurDeclaration = trBurDeclaration;
	}


	public java.lang.Integer getTrNumDeclaration() {
		return trNumDeclaration;
	}


	public void setTrNumDeclaration(java.lang.Integer trNumDeclaration) {
		this.trNumDeclaration = trNumDeclaration;
	}
	
	
}
