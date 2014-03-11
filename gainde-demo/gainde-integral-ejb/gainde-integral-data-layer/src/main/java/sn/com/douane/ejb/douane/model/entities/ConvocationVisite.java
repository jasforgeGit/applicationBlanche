package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity

@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findBySeggendec", query = "select object(o) from ConvocationVisite o where  o.visAnneeDecl = ?1 and o.visBureauDecl=?2 and o.visNumeroDecl=?3"))
@Table(name="CONVOCATIONVISITE")
public class ConvocationVisite implements Serializable  {
	
	
	private static final long serialVersionUID = 2511045752248902433L;
	
	@Id	
	@Column(name="VISNUMCONVOCATION",columnDefinition="DECIMAL(9,0)", nullable=false)
	    private java.math.BigDecimal visNumConvocation;
	
	@Column(name="VISANNEEDECL", length=4, nullable=false)
	    private java.lang.String visAnneeDecl;
	
	@Column(name="VISBUREAUDECL", length=3, nullable=false)
	    private java.lang.String visBureauDecl;
	
	@Column(name="VISNUMERODECL", nullable=false)
	    private java.lang.Integer visNumeroDecl;
	
	@Column(name="VISTITRECONVOCATION", length=100, nullable=false)
	    private java.lang.String visTitreConvocation;
	
	@Column(name="VISDATECONVOCATION", nullable=false)
	    private java.sql.Timestamp visDateConvocation;
	
	@Column(name="VISCORPSCONVOCATION", length=1000, nullable=false)
	    private java.lang.String visCorpsConvocation;
	
	@Column(name="VISDATEEMISSION", nullable=false)
	    private java.sql.Timestamp visDateEmission;
	
	@Column(name="VISTYPECONVOCATION", length=2, nullable=false)
	    private java.lang.String visTypeConvocation;
	
	@Column(name="VISCODEEMETTEUR", length=8, nullable=false)
	    private java.lang.String visCodeEmetteur;
	
	
	
	

	public ConvocationVisite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConvocationVisite(BigDecimal visNumConvocation, String visAnneeDecl,
			String visBureauDecl, Integer visNumeroDecl,
			String visTitreConvocation, Timestamp visDateConvocation,
			String visCorpsConvocation, Timestamp visDateEmission,
			String visTypeConvocation, String visCodeEmetteur) {
		super();
		this.visNumConvocation = visNumConvocation;
		this.visAnneeDecl = visAnneeDecl;
		this.visBureauDecl = visBureauDecl;
		this.visNumeroDecl = visNumeroDecl;
		this.visTitreConvocation = visTitreConvocation;
		this.visDateConvocation = visDateConvocation;
		this.visCorpsConvocation = visCorpsConvocation;
		this.visDateEmission = visDateEmission;
		this.visTypeConvocation = visTypeConvocation;
		this.visCodeEmetteur = visCodeEmetteur;
	}

	public java.math.BigDecimal getVisNumConvocation() {
		return visNumConvocation;
	}

	public void setVisNumConvocation(java.math.BigDecimal visNumConvocation) {
		this.visNumConvocation = visNumConvocation;
	}

	public java.lang.String getVisAnneeDecl() {
		return visAnneeDecl;
	}

	public void setVisAnneeDecl(java.lang.String visAnneeDecl) {
		this.visAnneeDecl = visAnneeDecl;
	}

	public java.lang.String getVisBureauDecl() {
		return visBureauDecl;
	}

	public void setVisBureauDecl(java.lang.String visBureauDecl) {
		this.visBureauDecl = visBureauDecl;
	}

	public java.lang.Integer getVisNumeroDecl() {
		return visNumeroDecl;
	}

	public void setVisNumeroDecl(java.lang.Integer visNumeroDecl) {
		this.visNumeroDecl = visNumeroDecl;
	}

	public java.lang.String getVisTitreConvocation() {
		return visTitreConvocation;
	}

	public void setVisTitreConvocation(java.lang.String visTitreConvocation) {
		this.visTitreConvocation = visTitreConvocation;
	}

	public java.sql.Timestamp getVisDateConvocation() {
		return visDateConvocation;
	}

	public void setVisDateConvocation(java.sql.Timestamp visDateConvocation) {
		this.visDateConvocation = visDateConvocation;
	}

	public java.lang.String getVisCorpsConvocation() {
		return visCorpsConvocation;
	}

	public void setVisCorpsConvocation(java.lang.String visCorpsConvocation) {
		this.visCorpsConvocation = visCorpsConvocation;
	}

	public java.sql.Timestamp getVisDateEmission() {
		return visDateEmission;
	}

	public void setVisDateEmission(java.sql.Timestamp visDateEmission) {
		this.visDateEmission = visDateEmission;
	}

	public java.lang.String getVisTypeConvocation() {
		return visTypeConvocation;
	}

	public void setVisTypeConvocation(java.lang.String visTypeConvocation) {
		this.visTypeConvocation = visTypeConvocation;
	}

	public java.lang.String getVisCodeEmetteur() {
		return visCodeEmetteur;
	}

	public void setVisCodeEmetteur(java.lang.String visCodeEmetteur) {
		this.visCodeEmetteur = visCodeEmetteur;
	}
	
	
}
