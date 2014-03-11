package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.douane.model.keys.LiquidSuppKey;



@Entity
@IdClass(LiquidSuppKey.class)
@Table(name="LIQUIDSUPP")
public class LiquidSupp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;

	@Id
	@Column(name="VISANNNEDECL", length=4, nullable=false)
	private java.lang.String visAnnneDecl;
	
	@Id
	@Column(name="VISCODEBURDECL", length=3, nullable=false)
    private java.lang.String visCodeBurDecl;
	
	@Id
	@Column(name="VISNUMDECL", nullable=false)
    private java.lang.Integer visNumDecl;
	
	@Id
	@Column(name="VISNUMARTDCL", nullable=false)
    private java.lang.Integer visNumArtDcl;
	
	@Id
	@Column(name="VISCODTTX", length=2, nullable=false)
    private java.lang.String visCodTtx;
	
	@Column(name="VISMNTTXL", columnDefinition="DECIMAL(9,0)", nullable=false)
    private java.math.BigDecimal visMnTtxl;
	
	@Column(name="VISTYPELIQ", length=1)
    private java.lang.String visTypeLiq;
	
	@Column(name="VISDATELIQ")
    private java.sql.Date visDateLiq;
	
	@Column(name="VISCODEAGR", length=3)
    private java.lang.String visCodeAgr;
	
	@Transient
	private java.math.BigDecimal totLiqNorm;
	
	@Transient
	private java.lang.String visNumeroDecl;
	
	@Transient
	private java.lang.String visPpmDeclarant;

	public LiquidSupp(String visAnnneDecl, String visCodeBurDecl,
			Integer visNumDecl, Integer visNumArtDcl, String visCodTtx,
			BigDecimal visMnTtxl) {
		super();
		this.visAnnneDecl = visAnnneDecl;
		this.visCodeBurDecl = visCodeBurDecl;
		this.visNumDecl = visNumDecl;
		this.visNumArtDcl = visNumArtDcl;
		this.visCodTtx = visCodTtx;
		this.visMnTtxl = visMnTtxl;
	}

	public LiquidSupp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getVisAnnneDecl() {
		return visAnnneDecl;
	}

	public void setVisAnnneDecl(java.lang.String visAnnneDecl) {
		this.visAnnneDecl = visAnnneDecl;
	}

	public java.lang.String getVisCodeBurDecl() {
		return visCodeBurDecl;
	}

	public void setVisCodeBurDecl(java.lang.String visCodeBurDecl) {
		this.visCodeBurDecl = visCodeBurDecl;
	}

	public java.lang.Integer getVisNumDecl() {
		return visNumDecl;
	}

	public void setVisNumDecl(java.lang.Integer visNumDecl) {
		this.visNumDecl = visNumDecl;
	}

	public java.lang.Integer getVisNumArtDcl() {
		return visNumArtDcl;
	}

	public void setVisNumArtDcl(java.lang.Integer visNumArtDcl) {
		this.visNumArtDcl = visNumArtDcl;
	}

	public java.lang.String getVisCodTtx() {
		return visCodTtx;
	}

	public void setVisCodTtx(java.lang.String visCodTtx) {
		this.visCodTtx = visCodTtx;
	}

	public java.math.BigDecimal getVisMnTtxl() {
		return visMnTtxl;
	}

	public void setVisMnTtxl(java.math.BigDecimal visMnTtxl) {
		this.visMnTtxl = visMnTtxl;
	}

	public java.lang.String getVisTypeLiq() {
		return visTypeLiq;
	}

	public void setVisTypeLiq(java.lang.String visTypeLiq) {
		this.visTypeLiq = visTypeLiq;
	}

	public java.sql.Date getVisDateLiq() {
		return visDateLiq;
	}

	public void setVisDateLiq(java.sql.Date visDateLiq) {
		this.visDateLiq = visDateLiq;
	}

	public java.lang.String getVisCodeAgr() {
		return visCodeAgr;
	}

	public void setVisCodeAgr(java.lang.String visCodeAgr) {
		this.visCodeAgr = visCodeAgr;
	}

	public java.math.BigDecimal getTotLiqNorm() {
		return totLiqNorm;
	}

	public void setTotLiqNorm(java.math.BigDecimal totLiqNorm) {
		this.totLiqNorm = totLiqNorm;
	}

	public java.lang.String getVisNumeroDecl() {
	 	return visAnnneDecl + " "  + visCodeBurDecl
				+ " "+ visNumDecl;
	}

	public void setVisNumeroDecl(java.lang.String visNumeroDecl) {
		this.visNumeroDecl = visNumeroDecl;
	}

	public java.lang.String getVisPpmDeclarant() {
		return visPpmDeclarant;
	}

	public void setVisPpmDeclarant(java.lang.String visPpmDeclarant) {
		this.visPpmDeclarant = visPpmDeclarant;
	}
	

}
