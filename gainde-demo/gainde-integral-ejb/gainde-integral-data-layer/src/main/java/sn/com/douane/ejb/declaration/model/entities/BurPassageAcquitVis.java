package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BurPassageAcquitVisKey;



@Entity
@IdClass(BurPassageAcquitVisKey.class)
@Table(name="BURPASSAGEACQUITVIS")
public class BurPassageAcquitVis implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;
	@Id
	@Column(name="DECBURDECLARATION", length=3, nullable=false)
	private java.lang.String decBurDeclaration;
	@Id
	@Column(name="DECNUMDECLARATION", nullable=false)
	private java.lang.Integer decNumDeclaration;
	@Id
	@Column(name="DECANNEEDECL", length=4, nullable=false)
	private java.lang.String decAnneeDecl;
	@Id
	@Column(name="DECBURPASSAGE", length=3 ,nullable=false)
	private java.lang.String  decBurPassage;

	
	@Column(name="DECPPDECLARANT", length=5 ,nullable=false)
	private java.lang.String  decPpDeclarant;
	
	@Column(name="DECNUMPERTOIRE", length=6 ,nullable=false)
	private java.lang.String  decNumRepertoire;
	
	@Column(name="DECDATEPASSAGE")
	private java.sql.Date  decDatePassage;
	
	@Column(name="DECCODEAGENT", length=5)
	private java.lang.String  decCodeAgent;
	
	@Column(name="DECREGULACQUIT", length=255)
	private java.lang.String  decRegulAcquit;
	
	
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

	
	public java.lang.String getDecPpDeclarant() {
		return decPpDeclarant;
	}

	public void setDecPpDeclarant(java.lang.String decPpDeclarant) {
		this.decPpDeclarant = decPpDeclarant;
	}

	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public java.sql.Date getDecDatePassage() {
		return decDatePassage;
	}

	public void setDecDatePassage(java.sql.Date decDatePassage) {
		this.decDatePassage = decDatePassage;
	}

	public java.lang.String getDecCodeAgent() {
		return decCodeAgent;
	}

	public void setDecCodeAgent(java.lang.String decCodeAgent) {
		this.decCodeAgent = decCodeAgent;
	}

	public java.lang.String getDecRegulAcquit() {
		return decRegulAcquit;
	}

	public void setDecRegulAcquit(java.lang.String decRegulAcquit) {
		this.decRegulAcquit = decRegulAcquit;
	}

	public BurPassageAcquitVis() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	
	

	
}
