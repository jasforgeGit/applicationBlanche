package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumns;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ApurementReceptDepotKey;



@Entity
@IdClass(ApurementReceptDepotKey.class)
@Table(name="APUREREMENTRECEPDEPOT")
public class ApurementReceptDepot implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;
	@Id
	@Column(name="BUREAURECEPISSE", length=3, nullable=false)
	private java.lang.String bureauRecepisse;
	@Id
	@Column(name="NUMRECEPISSE", nullable=false)
	private java.lang.Integer numRecepisse;
	@Id
	@Column(name="ANNEERECEPISSE", columnDefinition = "CHAR(4)", nullable=false)
	private java.lang.String anneeRecepisse;
	@Id
	@Column(name="NUMBULLETIN", nullable=false)
	private java.lang.Integer numBulletin;
	@Id
	@Column(name="ANNEEFICHE", columnDefinition = "CHAR(4)", nullable = false)
	private java.lang.String anneeFiche;
	@Id
	@Column(name="BUREAUFICHE", columnDefinition = "CHAR(3)", nullable=false)
	private java.lang.String bureauFiche;
	@Id
	@Column(name="NUMEROFICHE", nullable=false)
	private java.lang.Integer numeroFiche;
	@Id
	@Column(name="NUMEROARTICLEFICHE", nullable=false)
	private java.lang.Integer numeroArticleFiche;
	@Id
	@Column(name="TYPEAPUREMENT", columnDefinition = "CHAR(2)", nullable=false)
	private java.lang.String typeApurement;
	
	@Column(name="DATEAPUREMENT")
	private java.sql.Date dateApurement;
	
	@Column(name="NBRECOLIS")
	private java.lang.Integer nbreColis;
	
	@Column(name="POIDS", columnDefinition = "DECIMAL(18,0)")
	private java.math.BigDecimal poids;
	
	@ManyToOne(targetEntity = BulletinEcor.class)
	@JoinColumns(value = {
		@JoinColumn(name="ANNEERECEPISSE", referencedColumnName = "ANNEERECEPISSE", insertable=false, updatable=false),
		@JoinColumn(name="BUREAURECEPISSE", referencedColumnName = "BUREAURECEPISSE", insertable=false, updatable=false),
		@JoinColumn(name="NUMRECEPISSE", referencedColumnName = "NUMRECEPISSE", insertable=false, updatable=false),
		@JoinColumn(name="NUMBULLETIN", referencedColumnName = "NUMBULLETIN", insertable=false, updatable=false)
	})
	private BulletinEcor bulletinEcor;
	
	public java.lang.String getBureauRecepisse() {
		return bureauRecepisse;
	}


	public void setBureauRecepisse(java.lang.String bureauRecepisse) {
		this.bureauRecepisse = bureauRecepisse;
	}


	public java.lang.Integer getNumRecepisse() {
		return numRecepisse;
	}


	public void setNumRecepisse(java.lang.Integer numRecepisse) {
		this.numRecepisse = numRecepisse;
	}


	public java.lang.String getAnneeRecepisse() {
		return anneeRecepisse;
	}


	public void setAnneeRecepisse(java.lang.String anneeRecepisse) {
		this.anneeRecepisse = anneeRecepisse;
	}


	public java.lang.Integer getNumBulletin() {
		return numBulletin;
	}


	public void setNumBulletin(java.lang.Integer numBulletin) {
		this.numBulletin = numBulletin;
	}


	public java.lang.String getAnneeFiche() {
		return anneeFiche;
	}


	public void setAnneeFiche(java.lang.String anneeFiche) {
		this.anneeFiche = anneeFiche;
	}


	public java.lang.String getBureauFiche() {
		return bureauFiche;
	}


	public void setBureauFiche(java.lang.String bureauFiche) {
		this.bureauFiche = bureauFiche;
	}


	public java.lang.Integer getNumeroFiche() {
		return numeroFiche;
	}


	public void setNumeroFiche(java.lang.Integer numeroFiche) {
		this.numeroFiche = numeroFiche;
	}


	public java.lang.Integer getNumeroArticleFiche() {
		return numeroArticleFiche;
	}


	public void setNumeroArticleFiche(java.lang.Integer numeroArticleFiche) {
		this.numeroArticleFiche = numeroArticleFiche;
	}


	public java.lang.String getTypeApurement() {
		return typeApurement;
	}


	public void setTypeApurement(java.lang.String typeApurement) {
		this.typeApurement = typeApurement;
	}

    
	public java.sql.Date getDateApurement() {
		return dateApurement;
	}


	public void setDateApurement(java.sql.Date dateApurement) {
		this.dateApurement = dateApurement;
	}


	public java.lang.Integer getNbreColis() {
		return nbreColis;
	}


	public void setNbreColis(java.lang.Integer nbreColis) {
		this.nbreColis = nbreColis;
	}


	public java.math.BigDecimal getPoids() {
		return poids;
	}


	public void setPoids(java.math.BigDecimal poids) {
		this.poids = poids;
	}

	

	public BulletinEcor getBulletinEcor() {
		return bulletinEcor;
	}


	public void setBulletinEcor(BulletinEcor bulletinEcor) {
		this.bulletinEcor = bulletinEcor;
	}


	public ApurementReceptDepot() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	
	

	
}
