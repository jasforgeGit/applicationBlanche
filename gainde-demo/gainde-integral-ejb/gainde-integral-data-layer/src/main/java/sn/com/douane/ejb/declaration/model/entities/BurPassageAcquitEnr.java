package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BurPassageAcquitEnrKey;



@Entity
@IdClass(BurPassageAcquitEnrKey.class)
@Table(name="BURPASSAGEACQUITENR")
public class BurPassageAcquitEnr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;


	@Id
	@Column(name="DECANNEEDECL", length=4, nullable=false)
    private java.lang.String anneeDeclaration;
	
	@Id
	@Column(name="DECBURDECLARATION", length=3, nullable=false)
    private java.lang.String bureauDec;
	
	@Id
	@Column(name="DECNUMDECLARATION", nullable=false)
    private java.lang.Integer numeroDeclaration;
	
	@Id
	@Column(name="DECBURPASSAGE", length=3, nullable=false)
	 private java.lang.String decBurPassage;
	
	
	@Column(name="DECPPDECLARANT", length=5, nullable=false)
    private java.lang.String decPpDeclarant;
	
	
	@Column(name="DECNUMPERTOIRE", length=6, nullable=false)
    private java.lang.String decNumPertoire;
	
	@Column(name="DECDATEPASSAGE")
    private java.sql.Date decDatePassage;
	
	@Column(name="DECCODEAGENT", length=5)
    private java.lang.String decCodeAgent;
	
	@Column(name="DECREGULACQUITPASS", length=255)
    private java.lang.String decRegulAcquitPass;
	
	
	
	@ManyToOne(targetEntity = AcquitEnregistre.class)
	@JoinColumns( value = {
		@JoinColumn(name="DECANNEEDECL", referencedColumnName="ANNEEDECLARATION", insertable=false, updatable=false), 
		@JoinColumn(name="DECBURDECLARATION", referencedColumnName="BUREAUDEC", insertable=false, updatable=false),
		@JoinColumn(name="DECNUMDECLARATION", referencedColumnName="NUMERODECLARATION", insertable=false, updatable=false)
		})  
    private AcquitEnregistre acqPassageEnr;



	public BurPassageAcquitEnr(String anneeDeclaration, String bureauDec,
			Integer numeroDeclaration, String decBurPassage,
			String decPpDeclarant, String decNumPertoire, Date decDatePassage,
			String decCodeAgent, String decRegulAcquitPass,
			AcquitEnregistre acqPassageEnr) {
		super();
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
		this.decBurPassage = decBurPassage;
		this.decPpDeclarant = decPpDeclarant;
		this.decNumPertoire = decNumPertoire;
		this.decDatePassage = decDatePassage;
		this.decCodeAgent = decCodeAgent;
		this.decRegulAcquitPass = decRegulAcquitPass;
		this.acqPassageEnr = acqPassageEnr;
	}



	public BurPassageAcquitEnr() {
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



	public java.lang.String getDecPpDeclarant() {
		return decPpDeclarant;
	}



	public void setDecPpDeclarant(java.lang.String decPpDeclarant) {
		this.decPpDeclarant = decPpDeclarant;
	}



	public java.lang.String getDecNumPertoire() {
		return decNumPertoire;
	}



	public void setDecNumPertoire(java.lang.String decNumPertoire) {
		this.decNumPertoire = decNumPertoire;
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



	public java.lang.String getDecRegulAcquitPass() {
		return decRegulAcquitPass;
	}



	public void setDecRegulAcquitPass(java.lang.String decRegulAcquitPass) {
		this.decRegulAcquitPass = decRegulAcquitPass;
	}



	public AcquitEnregistre getAcqPassageEnr() {
		return acqPassageEnr;
	}



	public void setAcqPassageEnr(AcquitEnregistre acqPassageEnr) {
		this.acqPassageEnr = acqPassageEnr;
	}



}
