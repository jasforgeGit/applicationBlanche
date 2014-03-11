package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;



public class BurPassageAcquitVisKey implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;

	@Column(name="DECBURDECLARATION", length=3, nullable=false)
	private java.lang.String decBurDeclaration;

	@Column(name="DECNUMDECLARATION", nullable=false)
	private java.lang.Integer decNumDeclaration;

	@Column(name="DECANNEEDECL", length=4, nullable=false)
	private java.lang.String decAnneeDecl;

	@Column(name="DECBURPASSAGE", length=3 ,nullable=false)
	private java.lang.String  decBurPassage;

	public java.lang.String getDecBurDeclaration() {
		return decBurDeclaration;
	}

	public void setDecBurDeclaration(java.lang.String decBurDeclaration) {
		this.decBurDeclaration = decBurDeclaration;
	}

	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public java.lang.String getDecBurPassage() {
		return decBurPassage;
	}

	public void setDecBurPassage(java.lang.String decBurPassage) {
		this.decBurPassage = decBurPassage;
	}

	public BurPassageAcquitVisKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	
	

	
}
