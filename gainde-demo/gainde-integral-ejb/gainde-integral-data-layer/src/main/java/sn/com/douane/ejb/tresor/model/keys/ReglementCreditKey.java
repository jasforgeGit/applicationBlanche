package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class ReglementCreditKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	
	
	@Column(name="TRANNEEDECL", length=4, nullable=false)
    private java.lang.String trAnneeDecl;
	
	
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
    private java.lang.String trBurDeclaration;
	
	
	@Column(name="TRNUMDECLARATION", nullable=false)
    private java.lang.Integer trNumDeclaration;
	
	
	@Column(name="TRNUMDOSSIERDEF", nullable=false)
    private java.lang.Integer trNumDossierDef;


	public ReglementCreditKey(String trAnneeDecl, String trBurDeclaration,
			Integer trNumDeclaration, Integer trNumDossierDef) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trNumDossierDef = trNumDossierDef;
	}


	public ReglementCreditKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getTrAnneeDecl() {
		return trAnneeDecl;
	}


	public void setTrAnneeDecl(java.lang.String trAnneeDecl) {
		this.trAnneeDecl = trAnneeDecl;
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


	public java.lang.Integer getTrNumDossierDef() {
		return trNumDossierDef;
	}


	public void setTrNumDossierDef(java.lang.Integer trNumDossierDef) {
		this.trNumDossierDef = trNumDossierDef;
	}
	
	
	
}
