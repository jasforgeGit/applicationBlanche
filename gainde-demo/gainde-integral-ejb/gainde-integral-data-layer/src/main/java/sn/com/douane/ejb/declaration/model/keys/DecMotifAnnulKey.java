package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class DecMotifAnnulKey implements Serializable {

	
	private static final long serialVersionUID = -1475656883609887062L;
	

	
	@Column(name="DECANNEEDECL",length=4, nullable=false)
	 private java.lang.String decAnneeDecl;
	
	
	@Column(name="DECBURDECL", length=3, nullable=false)
	private java.lang.String decBurDecl;
	    
	
	
	@Column(name="DECNUMDECL", nullable=false)
	private java.lang.Integer decNumDecl;
		


	public DecMotifAnnulKey() {
		super();
	}


	public DecMotifAnnulKey(String decAnneeDecl, String decBurDecl,
			Integer decNumDecl) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
	}


	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}


	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}


	public java.lang.String getDecBurDecl() {
		return decBurDecl;
	}


	public void setDecBurDecl(java.lang.String decBurDecl) {
		this.decBurDecl = decBurDecl;
	}


	public java.lang.Integer getDecNumDecl() {
		return decNumDecl;
	}


	public void setDecNumDecl(java.lang.Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}

	
}
