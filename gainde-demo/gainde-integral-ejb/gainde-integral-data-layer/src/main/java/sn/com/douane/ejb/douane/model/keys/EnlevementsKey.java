package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class EnlevementsKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="ANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String anneeDeclaration;
	
	
	@Column(name="BURDECLARATION", length=3, nullable=false)
	    private java.lang.String burDeclaration;
	
	
	@Column(name="NUMDECLARATION",  nullable=false)
	    private java.lang.Integer numDeclaration;
	
	
	@Column(name="NUMARTDECL", nullable=false)
	    private java.lang.Integer numArtDecl;

	
	@Column(name="DATEENLEVEMENT", nullable=false)
	    private java.sql.Timestamp dateEnlevement;


	public EnlevementsKey(String anneeDeclaration, String burDeclaration,
			Integer numDeclaration, Integer numArtDecl, Timestamp dateEnlevement) {
		super();
		this.anneeDeclaration = anneeDeclaration;
		this.burDeclaration = burDeclaration;
		this.numDeclaration = numDeclaration;
		this.numArtDecl = numArtDecl;
		this.dateEnlevement = dateEnlevement;
	}


	public EnlevementsKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}


	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}


	public java.lang.String getBurDeclaration() {
		return burDeclaration;
	}


	public void setBurDeclaration(java.lang.String burDeclaration) {
		this.burDeclaration = burDeclaration;
	}


	public java.lang.Integer getNumDeclaration() {
		return numDeclaration;
	}


	public void setNumDeclaration(java.lang.Integer numDeclaration) {
		this.numDeclaration = numDeclaration;
	}


	public java.lang.Integer getNumArtDecl() {
		return numArtDecl;
	}


	public void setNumArtDecl(java.lang.Integer numArtDecl) {
		this.numArtDecl = numArtDecl;
	}


	public java.sql.Timestamp getDateEnlevement() {
		return dateEnlevement;
	}


	public void setDateEnlevement(java.sql.Timestamp dateEnlevement) {
		this.dateEnlevement = dateEnlevement;
	}	
	
	
	
}
