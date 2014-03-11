package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ProcesVerbalKey;



@Entity
@IdClass(ProcesVerbalKey.class)
@Table(name="PROCESVERBAL")
public class ProcesVerbal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -498502007510352502L;
	@Id
	@javax.persistence.Column(name="ANNEEPV", length=4, nullable=false)
	private java.lang.String anneepv;
	
	@Id
	@javax.persistence.Column(name="BUREAUPV", length=3, nullable=false)
	private java.lang.String bureaupv;
	
	@Id
	@javax.persistence.Column(name="NUMEROPV", length=25, nullable=false)
	private java.lang.String numeropv;
	
	@javax.persistence.Column(name="DATEPV", nullable=false)
	private java.sql.Date datepv;
	
	@javax.persistence.Column(name="NATUREPV", length=2, nullable=false)
	private java.lang.String naturepv;

	@javax.persistence.Column(name="NATUREMARCHANDISES", length=100, nullable=false)
	private java.lang.String natureMarchandises;
	
	@javax.persistence.Column(name="NOMBRECONSTATE", nullable=false)
	private java.lang.Integer nombreConstate;
	
	@javax.persistence.Column(name="POIDSCONSTATE",columnDefinition="DECIMAL(18 , 0)", nullable=false)
	private BigDecimal poidsConstate;
	
	@javax.persistence.Column(name="VALEURCONSTATEE",columnDefinition="DECIMAL(18 , 0)", nullable=false)
	private BigDecimal valeurConstatee;
	
	@javax.persistence.Column(name="TYPEAPUREMENT", length=1, nullable=true)
	private java.lang.String typeApurement;
	
	@javax.persistence.Column(name="ANNEETITREAPURE", length=4, nullable=true)
	private java.lang.String anneeTitreApure;
	
	@javax.persistence.Column(name="BURTITREAPURE", length=3, nullable=true)
	private java.lang.String burTitreApure;
	
	@javax.persistence.Column(name="NUMTITREAPURE")
	private java.lang.Integer numTitreApure;
	
	@javax.persistence.Column(name="ARTICLETITREAPURE")
	private java.lang.Integer articleTitreApure;
	
	@javax.persistence.Column(name="CODEAGENT1", length=5, nullable=true)
	private java.lang.String codeAgent1;
	
	@javax.persistence.Column(name="CODEAGENT2", length=5, nullable=true)
	private java.lang.String codeAgent2;
	
	@ManyToOne(targetEntity=NaturePv.class)
	@JoinColumn(name="NATUREPV", insertable=false, updatable=false,nullable = false)
	private NaturePv naturePv;
	

	public java.lang.String getAnneepv() {
		return anneepv;
	}

	public void setAnneepv(java.lang.String anneepv) {
		this.anneepv = anneepv;
	}

	public java.lang.String getBureaupv() {
		return bureaupv;
	}

	public void setBureaupv(java.lang.String bureaupv) {
		this.bureaupv = bureaupv;
	}

	public java.lang.String getNumeropv() {
		return numeropv;
	}

	public void setNumeropv(java.lang.String numeropv) {
		this.numeropv = numeropv;
	}

	public java.sql.Date getDatepv() {
		return datepv;
	}

	public void setDatepv(java.sql.Date datepv) {
		this.datepv = datepv;
	}

	public java.lang.String getNaturepv() {
		return naturepv;
	}

	public void setNaturepv(java.lang.String naturepv) {
		this.naturepv = naturepv;
	}

	public java.lang.String getNatureMarchandises() {
		return natureMarchandises;
	}

	public void setNatureMarchandises(java.lang.String natureMarchandises) {
		this.natureMarchandises = natureMarchandises;
	}

	public java.lang.Integer getNombreConstate() {
		return nombreConstate;
	}

	public void setNombreConstate(java.lang.Integer nombreConstate) {
		this.nombreConstate = nombreConstate;
	}


	public java.lang.String getTypeApurement() {
		return typeApurement;
	}

	public void setTypeApurement(java.lang.String typeApurement) {
		this.typeApurement = typeApurement;
	}

	public java.lang.String getAnneeTitreApure() {
		return anneeTitreApure;
	}

	public void setAnneeTitreApure(java.lang.String anneeTitreApure) {
		this.anneeTitreApure = anneeTitreApure;
	}

	public java.lang.String getBurTitreApure() {
		return burTitreApure;
	}

	public void setBurTitreApure(java.lang.String burTitreApure) {
		this.burTitreApure = burTitreApure;
	}

	public java.lang.Integer getNumTitreApure() {
		return numTitreApure;
	}

	public void setNumTitreApure(java.lang.Integer numTitreApure) {
		this.numTitreApure = numTitreApure;
	}

	public java.lang.Integer getArticleTitreApure() {
		return articleTitreApure;
	}

	public void setArticleTitreApure(java.lang.Integer articleTitreApure) {
		this.articleTitreApure = articleTitreApure;
	}

	public java.lang.String getCodeAgent1() {
		return codeAgent1;
	}

	public void setCodeAgent1(java.lang.String codeAgent1) {
		this.codeAgent1 = codeAgent1;
	}

	public java.lang.String getCodeAgent2() {
		return codeAgent2;
	}

	public void setCodeAgent2(java.lang.String codeAgent2) {
		this.codeAgent2 = codeAgent2;
	}

	public ProcesVerbal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NaturePv getNaturePv() {
		return naturePv;
	}

	public void setNaturePv(NaturePv naturePv) {
		this.naturePv = naturePv;
	}

	public BigDecimal getPoidsConstate() {
		return poidsConstate;
	}

	public void setPoidsConstate(BigDecimal poidsConstate) {
		this.poidsConstate = poidsConstate;
	}

	public BigDecimal getValeurConstatee() {
		return valeurConstatee;
	}

	public void setValeurConstatee(BigDecimal valeurConstatee) {
		this.valeurConstatee = valeurConstatee;
	}
	
	
}
