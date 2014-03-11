package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DecMotifAnnulKey;



@Entity
@IdClass(DecMotifAnnulKey.class)
@Table(name="DECMOTIFANNUL")
public class DecMotifAnnul implements Serializable {

	
	private static final long serialVersionUID = -1621428057599469659L;

	
	@Id
	@Column(name="DECANNEEDECL",length=4, nullable=false)
	private java.lang.String decAnneeDecl;
	
	@Id
	@Column(name="DECBURDECL", length=3, nullable=false)
	private java.lang.String decBurDecl;
	    	
	@Id
	@Column(name="DECNUMDECL", nullable=false)
	private java.lang.Integer decNumDecl;
		
	@Column(name="DECDATEDEM")
	private java.sql.Date decDateDem;
	
	
	@Column(name="DECDATEDECL", nullable=false)
	private java.sql.Date decDateDecl;
	
	
	@Column(name="DECPPMDECLARANT",length=5)
	private java.lang.String decPpmDeclarant;
	

	@Column(name="DECDATEVALID")
	 private java.sql.Date decDateValid;
	
	@Column(name="DECMOTIF", length=255)
	 private java.lang.String decMotif;
	

	@Column(name="DECCODEAGT", length=5)
	 private java.lang.String decCodeAgt;


	public DecMotifAnnul() {
		super();
	}


	public DecMotifAnnul(String decAnneeDecl, String decBurDecl,
			Integer decNumDecl, Date decDateDem, Date decDateDecl,
			String decPpmDeclarant, Date decDateValid, String decMotif,
			String decCodeAgt) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
		this.decDateDem = decDateDem;
		this.decDateDecl = decDateDecl;
		this.decPpmDeclarant = decPpmDeclarant;
		this.decDateValid = decDateValid;
		this.decMotif = decMotif;
		this.decCodeAgt = decCodeAgt;
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


	public java.sql.Date getDecDateDem() {
		return decDateDem;
	}


	public void setDecDateDem(java.sql.Date decDateDem) {
		this.decDateDem = decDateDem;
	}


	public java.sql.Date getDecDateDecl() {
		return decDateDecl;
	}


	public void setDecDateDecl(java.sql.Date decDateDecl) {
		this.decDateDecl = decDateDecl;
	}


	public java.lang.String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}


	public void setDecPpmDeclarant(java.lang.String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}


	public java.sql.Date getDecDateValid() {
		return decDateValid;
	}


	public void setDecDateValid(java.sql.Date decDateValid) {
		this.decDateValid = decDateValid;
	}


	public java.lang.String getDecMotif() {
		return decMotif;
	}


	public void setDecMotif(java.lang.String decMotif) {
		this.decMotif = decMotif;
	}


	public java.lang.String getDecCodeAgt() {
		return decCodeAgt;
	}


	public void setDecCodeAgt(java.lang.String decCodeAgt) {
		this.decCodeAgt = decCodeAgt;
	}

	  
	   
}
