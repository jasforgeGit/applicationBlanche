package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HistoLiqArtDeclKey;


@Entity
@IdClass(HistoLiqArtDeclKey.class)
@Table(name="HISTOLIQARTDECL")
public class HistoLiqArtDecl implements Serializable {

	
	private static final long serialVersionUID = -8985421316871255953L;
	
	@Id
	@Column(name="DECNUMHISTOLIQ", nullable=false)
	 private java.lang.Integer decNumHistoLiq;
	
	@Id
	@Column(name="DECANNEELIQUID", length=4, nullable=false)
	    private java.lang.String decAnneeLiquid;
	
	@Id
	@Column(name="DECBUREAUENREGDEC", length=3, nullable=false)
	private java.lang.String decBureauEnregDec;
	
	@Id
	@Column(name="DECNUMDEC", nullable=false)
	 private java.lang.Integer decNumDec;
	
	@Id
	@Column(name="DECNUMARTDEC", nullable=false)	
	private java.lang.Integer decNumArtDec;
	
	@Id
	@Column(name="DECCODETAXE",length=2, nullable=false)
	private java.lang.String decCodeTaxe;
	
	@Column(name="DECCODEPPMDECLARANT",length=5, nullable=false)
	 private java.lang.String decCodePpmDeclarant;
	
	@Column(name="DECBASETAXENORM", columnDefinition="DECIMAL(11 , 0)")
	    private java.math.BigDecimal decBaseTaxeNorm;
	
	@Column(name="DECQUOTITENORM",columnDefinition="DECIMAL(9,2)")
	    private java.math.BigDecimal decQuotiteNorm;
	
	@Column(name="DECMTTAXENORM",columnDefinition="DECIMAL(11 , 0)")
	    private java.math.BigDecimal decMtTaxeNorm;
	
	@Column(name="DECBASETAXELIQ",columnDefinition="DECIMAL(11 , 0)")
	    private java.math.BigDecimal decBaseTaxeLiq;
	
	@Column(name="DECQUOTITELIQ",columnDefinition="DECIMAL(9,2)")
	    private java.math.BigDecimal decQuotiteLiq;
	
	@Column(name="DECMTTAXELIQ",columnDefinition="DECIMAL(11 , 0)")
	    private java.math.BigDecimal decMtTaxeLiq;
	
	@Column(name="DECMTTAXESUSPENDU",columnDefinition="DECIMAL(11 , 0)")
	    private java.math.BigDecimal decMtTaxeSuspendu;
	
	@Column(name="DECDATELIQUID", nullable=false)
	    private java.sql.Date decDateLiquid;
	    
	@Column(name="DECTYPETRAITEMENT",length=1, nullable=false)
	    private java.lang.String decTypeTraitement;
	
	@Column(name="DECDATEHISTOLIQ",nullable=false)
	    private java.sql.Date decDateHistoLiq;

	public HistoLiqArtDecl(Integer decNumHistoLiq, String decAnneeLiquid,
			String decBureauEnregDec, Integer decNumDec, Integer decNumArtDec,
			String decCodeTaxe, String decCodePpmDeclarant,
			BigDecimal decBaseTaxeNorm, BigDecimal decQuotiteNorm,
			BigDecimal decMtTaxeNorm, BigDecimal decBaseTaxeLiq,
			BigDecimal decQuotiteLiq, BigDecimal decMtTaxeLiq,
			BigDecimal decMtTaxeSuspendu, Date decDateLiquid,
			String decTypeTraitement, Date decDateHistoLiq) {
		super();
		this.decNumHistoLiq = decNumHistoLiq;
		this.decAnneeLiquid = decAnneeLiquid;
		this.decBureauEnregDec = decBureauEnregDec;
		this.decNumDec = decNumDec;
		this.decNumArtDec = decNumArtDec;
		this.decCodeTaxe = decCodeTaxe;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decBaseTaxeNorm = decBaseTaxeNorm;
		this.decQuotiteNorm = decQuotiteNorm;
		this.decMtTaxeNorm = decMtTaxeNorm;
		this.decBaseTaxeLiq = decBaseTaxeLiq;
		this.decQuotiteLiq = decQuotiteLiq;
		this.decMtTaxeLiq = decMtTaxeLiq;
		this.decMtTaxeSuspendu = decMtTaxeSuspendu;
		this.decDateLiquid = decDateLiquid;
		this.decTypeTraitement = decTypeTraitement;
		this.decDateHistoLiq = decDateHistoLiq;
	}

	public HistoLiqArtDecl() {
		super();
	}

	public java.lang.Integer getDecNumHistoLiq() {
		return decNumHistoLiq;
	}

	public void setDecNumHistoLiq(java.lang.Integer decNumHistoLiq) {
		this.decNumHistoLiq = decNumHistoLiq;
	}

	public java.lang.String getDecAnneeLiquid() {
		return decAnneeLiquid;
	}

	public void setDecAnneeLiquid(java.lang.String decAnneeLiquid) {
		this.decAnneeLiquid = decAnneeLiquid;
	}

	public java.lang.String getDecBureauEnregDec() {
		return decBureauEnregDec;
	}

	public void setDecBureauEnregDec(java.lang.String decBureauEnregDec) {
		this.decBureauEnregDec = decBureauEnregDec;
	}

	public java.lang.Integer getDecNumDec() {
		return decNumDec;
	}

	public void setDecNumDec(java.lang.Integer decNumDec) {
		this.decNumDec = decNumDec;
	}

	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(java.lang.String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public java.math.BigDecimal getDecBaseTaxeNorm() {
		return decBaseTaxeNorm;
	}

	public void setDecBaseTaxeNorm(java.math.BigDecimal decBaseTaxeNorm) {
		this.decBaseTaxeNorm = decBaseTaxeNorm;
	}

	public java.math.BigDecimal getDecQuotiteNorm() {
		return decQuotiteNorm;
	}

	public void setDecQuotiteNorm(java.math.BigDecimal decQuotiteNorm) {
		this.decQuotiteNorm = decQuotiteNorm;
	}

	public java.math.BigDecimal getDecMtTaxeNorm() {
		return decMtTaxeNorm;
	}

	public void setDecMtTaxeNorm(java.math.BigDecimal decMtTaxeNorm) {
		this.decMtTaxeNorm = decMtTaxeNorm;
	}

	public java.math.BigDecimal getDecBaseTaxeLiq() {
		return decBaseTaxeLiq;
	}

	public void setDecBaseTaxeLiq(java.math.BigDecimal decBaseTaxeLiq) {
		this.decBaseTaxeLiq = decBaseTaxeLiq;
	}

	public java.math.BigDecimal getDecQuotiteLiq() {
		return decQuotiteLiq;
	}

	public void setDecQuotiteLiq(java.math.BigDecimal decQuotiteLiq) {
		this.decQuotiteLiq = decQuotiteLiq;
	}

	public java.math.BigDecimal getDecMtTaxeLiq() {
		return decMtTaxeLiq;
	}

	public void setDecMtTaxeLiq(java.math.BigDecimal decMtTaxeLiq) {
		this.decMtTaxeLiq = decMtTaxeLiq;
	}

	public java.math.BigDecimal getDecMtTaxeSuspendu() {
		return decMtTaxeSuspendu;
	}

	public void setDecMtTaxeSuspendu(java.math.BigDecimal decMtTaxeSuspendu) {
		this.decMtTaxeSuspendu = decMtTaxeSuspendu;
	}

	public java.sql.Date getDecDateLiquid() {
		return decDateLiquid;
	}

	public void setDecDateLiquid(java.sql.Date decDateLiquid) {
		this.decDateLiquid = decDateLiquid;
	}

	public java.lang.String getDecTypeTraitement() {
		return decTypeTraitement;
	}

	public void setDecTypeTraitement(java.lang.String decTypeTraitement) {
		this.decTypeTraitement = decTypeTraitement;
	}

	public java.sql.Date getDecDateHistoLiq() {
		return decDateHistoLiq;
	}

	public void setDecDateHistoLiq(java.sql.Date decDateHistoLiq) {
		this.decDateHistoLiq = decDateHistoLiq;
	}
	
	
	

}
