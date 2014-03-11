package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Id;

public class ReglementComptantKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	
	@Column(name="TRANNEEDECLARATION", length=4, nullable=false)
	 private java.lang.String trAnneeDeclaration;
	
	
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	    private java.lang.String trBurDeclaration;
	
	
	@Column(name="TRNUMDECLARATION", nullable=false)
	    private java.lang.Integer trNumDeclaration;
	
	
	@Column(name="TRNUMQUITTANCE", length=20, nullable=false)
	    private java.lang.String trNumQuittance;
	
	
	@Column(name="TRMONTANTQUITTANCE",columnDefinition="DECIMAL(18,0)", nullable=false)
	    private java.math.BigDecimal trMontantQuittance;


	public ReglementComptantKey(String trAnneeDeclaration,
			String trBurDeclaration, Integer trNumDeclaration,
			String trNumQuittance, BigDecimal trMontantQuittance) {
		super();
		this.trAnneeDeclaration = trAnneeDeclaration;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trNumQuittance = trNumQuittance;
		this.trMontantQuittance = trMontantQuittance;
	}


	public ReglementComptantKey() {
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


	public java.lang.String getTrNumQuittance() {
		return trNumQuittance;
	}


	public void setTrNumQuittance(java.lang.String trNumQuittance) {
		this.trNumQuittance = trNumQuittance;
	}


	public java.math.BigDecimal getTrMontantQuittance() {
		return trMontantQuittance;
	}


	public void setTrMontantQuittance(java.math.BigDecimal trMontantQuittance) {
		this.trMontantQuittance = trMontantQuittance;
	}
	
	
	

}
