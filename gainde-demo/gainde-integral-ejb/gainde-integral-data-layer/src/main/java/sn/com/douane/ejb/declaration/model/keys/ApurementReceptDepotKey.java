package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;



public class ApurementReceptDepotKey implements Serializable{

	private static final long serialVersionUID = -2874130778683222153L;

	@Column(name="BUREAURECEPISSE", length=3, nullable=false)
	private java.lang.String bureauRecepisse;

	@Column(name="NUMRECEPISSE", nullable=false)
	private java.lang.Integer numRecepisse;

	@Column(name="ANNEERECEPISSE", columnDefinition = "CHAR(4)", nullable=false)
	private java.lang.String anneeRecepisse;

	@Column(name="NUMBULLETIN", nullable=false)
	private java.lang.Integer numBulletin;

	@Column(name="ANNEEFICHE", columnDefinition = "CHAR(4)", nullable=false)
	private java.lang.String anneeFiche;

	@Column(name="BUREAUFICHE", columnDefinition = "CHAR(3)", nullable=false)
	private java.lang.String bureauFiche;

	@Column(name="NUMEROFICHE", nullable=false)
	private java.lang.Integer numeroFiche;
	
	@Column(name="NUMEROARTICLEFICHE", nullable=false)
	private java.lang.Integer numeroArticleFiche;

	@Column(name="TYPEAPUREMENT", columnDefinition = "CHAR(2)", nullable=false)
	private java.lang.String typeApurement;

	
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


	public ApurementReceptDepotKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
