package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.SegArtDec;
import sn.com.douane.ejb.douane.model.keys.EnlevementsKey;






@Entity
@IdClass(EnlevementsKey.class)
@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findByEncoursDeclaration", query = "select object(o) from Enlevements o where  o.anneeDeclaration = ?1 and  o.burDeclaration = ?2 and  o.numDeclaration = ?3"))
@Table(name="ENLEVEMENTS")
public class Enlevements implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	@Id
	@Column(name="ANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String anneeDeclaration;
	
	@Id
	@Column(name="BURDECLARATION", length=3, nullable=false)
	    private java.lang.String burDeclaration;
	
	@Id
	@Column(name="NUMDECLARATION",  nullable=false)
	    private java.lang.Integer numDeclaration;
	
	@Id
	@Column(name="NUMARTDECL", nullable=false)
	    private java.lang.Integer numArtDecl;
	
	@Id
	@Column(name="DATEENLEVEMENT", nullable=false)
	    private java.sql.Timestamp dateEnlevement;	
	
	@Column(name="POIDSENLEVE", columnDefinition="DECIMAL(9,0)", nullable=false)
	    private java.math.BigDecimal poidsEnleve;
	
	@Column(name="NBRECOLISENLEVE", columnDefinition="DECIMAL(9,2)", nullable=false)
	    private java.math.BigDecimal nbreColisEnleve;
	
	@Column(name="DATEDECL")
	    private java.sql.Date dateDecl;
	
	@Column(name="NOMDECLARANT", length=50)
	    private java.lang.String nomDeclarant;
	
	@Column(name="ADRDECLARANT", length=100)
	    private java.lang.String adrDeclarant;
	
	@Column(name="NUMEROBL", length=25)
	    private java.lang.String numeroBl;
	
	@Column(name="NUMVEHICULE", length=25)
	    private java.lang.String numVehicule;
	
	@Column(name="TYPEVEHICULE", length=25)
	    private java.lang.String typeVehicule;
	
	@Column(name="TYPESORTIE", length=100)
	    private java.lang.String typeSortie;
	
	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "ANNEEDECLARATION", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "BURDECLARATION", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "NUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false,nullable = false), 
			@JoinColumn(name = "NUMARTDECL", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false,nullable = false)})
	private SegArtDec segArtDec;
	
	
	
	

	public Enlevements(String anneeDeclaration, String burDeclaration,
			Integer numDeclaration, Integer numArtDecl,
			Timestamp dateEnlevement, BigDecimal poidsEnleve,
			BigDecimal nbreColisEnleve) {
		super();
		this.anneeDeclaration = anneeDeclaration;
		this.burDeclaration = burDeclaration;
		this.numDeclaration = numDeclaration;
		this.numArtDecl = numArtDecl;
		this.dateEnlevement = dateEnlevement;
		this.poidsEnleve = poidsEnleve;
		this.nbreColisEnleve = nbreColisEnleve;
	}
	

	public Enlevements() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SegArtDec getSegArtDec() {
		return segArtDec;
	}


	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
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

	public java.math.BigDecimal getPoidsEnleve() {
		return poidsEnleve;
	}

	public void setPoidsEnleve(java.math.BigDecimal poidsEnleve) {
		this.poidsEnleve = poidsEnleve;
	}

	public java.math.BigDecimal getNbreColisEnleve() {
		return nbreColisEnleve;
	}

	public void setNbreColisEnleve(java.math.BigDecimal nbreColisEnleve) {
		this.nbreColisEnleve = nbreColisEnleve;
	}

	public java.sql.Date getDateDecl() {
		return dateDecl;
	}

	public void setDateDecl(java.sql.Date dateDecl) {
		this.dateDecl = dateDecl;
	}

	public java.lang.String getNomDeclarant() {
		return nomDeclarant;
	}

	public void setNomDeclarant(java.lang.String nomDeclarant) {
		this.nomDeclarant = nomDeclarant;
	}

	public java.lang.String getAdrDeclarant() {
		return adrDeclarant;
	}

	public void setAdrDeclarant(java.lang.String adrDeclarant) {
		this.adrDeclarant = adrDeclarant;
	}

	public java.lang.String getNumeroBl() {
		return numeroBl;
	}

	public void setNumeroBl(java.lang.String numeroBl) {
		this.numeroBl = numeroBl;
	}

	public java.lang.String getNumVehicule() {
		return numVehicule;
	}

	public void setNumVehicule(java.lang.String numVehicule) {
		this.numVehicule = numVehicule;
	}

	public java.lang.String getTypeVehicule() {
		return typeVehicule;
	}

	public void setTypeVehicule(java.lang.String typeVehicule) {
		this.typeVehicule = typeVehicule;
	}

	public java.lang.String getTypeSortie() {
		return typeSortie;
	}

	public void setTypeSortie(java.lang.String typeSortie) {
		this.typeSortie = typeSortie;
	}
	
	

}
