package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.LiquidArtVisiteKey;

@Entity
@IdClass(LiquidArtVisiteKey.class)
@Table(name="LIQUIDARTVISITE")
@javax.persistence.NamedQueries({
	@javax.persistence.NamedQuery(name = "LiquidArtVisite.findLiquidArtVisitOfDeclaration", query = "select object(o) from LiquidArtVisite o where o.visAnneeLiquid = ?1 and o.visBureauEnregDec = ?2 and o.visNumDec = ?3"), 
	@javax.persistence.NamedQuery(name = "LiquidArtVisite.findLiquidVisitOfArticleDecl", query = "select object(o) from LiquidArtVisite o where o.visAnneeLiquid = ?1 and o.visBureauEnregDec = ?2 and o.visNumDec = ?3 and o.visNumArtDec = ?4")})

public class LiquidArtVisite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6966333776959519157L;

	@Id
	@Column(name="VISANNEELIQUID", length=4, nullable=false)
	private java.lang.String visAnneeLiquid;

	@Id
	@Column(name="VISBUREAUENREGDEC", length=3, nullable=false)
	private java.lang.String visBureauEnregDec;

	@Id
	@Column(name="VISNUMDEC", nullable=false)
	private java.lang.Integer visNumDec;
	
	@Id
	@Column(name="VISNUMARTDEC", nullable=false)
	private java.lang.Integer visNumArtDec;


	@Id
	@Column(name="VISCODETAXE", length=2, nullable=false)
	private java.lang.String visCodeTaxe;

	@Column(name="VISCODEPPMDECLARANT", length=5, nullable=false)
	private java.lang.String visCodePpmDeclarant;
	
	@Column(name="VISBASETAXENORM", columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal visBaseTaxeNorm;
	
	@Column(name="VISQUOTITENORM", columnDefinition="DECIMAL(9,2)")
	private java.math.BigDecimal visQuotiteNorm;
	
	@Column(name="VISMTTAXENORM", columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal visMtTaxeNorm;

	@Column(name="VISBASETAXELIQ", columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal visBaseTaxeLiq;

	@Column(name="VISQUOTITELIQ", columnDefinition="DECIMAL(9,2)")
	private java.math.BigDecimal visQuotiteLiq;
	
	@Column(name="VISMTTAXELIQ", columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal visMtTaxeLiq;
	
	@Column(name="VISMTTAXESUSPENDU",columnDefinition="DECIMAL(11 , 0)")
	private java.math.BigDecimal visMtTaxeSuspendu;	
	
	@Column(name="VISDATELIQUID", nullable=false)
	private java.sql.Timestamp visDateLiquid;	
	
	@Column(name="VISTYPETRAITEMENT", length=1)
	private java.lang.String visTypeTraitement;
	
	public LiquidArtVisite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LiquidArtVisite(String visAnneeLiquid, String visBureauEnregDec,
			Integer visNumDec, Integer visNumArtDec, String visCodeTaxe,
			String visCodePpmDeclarant) {
		super();
		this.visAnneeLiquid = visAnneeLiquid;
		this.visBureauEnregDec = visBureauEnregDec;
		this.visNumDec = visNumDec;
		this.visNumArtDec = visNumArtDec;
		this.visCodeTaxe = visCodeTaxe;
		this.visCodePpmDeclarant = visCodePpmDeclarant;

	}
	public LiquidArtVisite(String visAnneeLiquid, String visBureauEnregDec,
			Integer visNumDec, Integer visNumArtDec, String visCodeTaxe,
			String visCodePpmDeclarant, BigDecimal visBaseTaxeNorm,
			BigDecimal visQuotiteNorm, BigDecimal visMtTaxeNorm,
			BigDecimal visBaseTaxeLiq, BigDecimal visQuotiteLiq,
			BigDecimal visMtTaxeLiq, BigDecimal visMtTaxeSuspendu,
			Timestamp visDateLiquid, String visTypeTraitement) {
		super();
		this.visAnneeLiquid = visAnneeLiquid;
		this.visBureauEnregDec = visBureauEnregDec;
		this.visNumDec = visNumDec;
		this.visNumArtDec = visNumArtDec;
		this.visCodeTaxe = visCodeTaxe;
		this.visCodePpmDeclarant = visCodePpmDeclarant;
		this.visBaseTaxeNorm = visBaseTaxeNorm;
		this.visQuotiteNorm = visQuotiteNorm;
		this.visMtTaxeNorm = visMtTaxeNorm;
		this.visBaseTaxeLiq = visBaseTaxeLiq;
		this.visQuotiteLiq = visQuotiteLiq;
		this.visMtTaxeLiq = visMtTaxeLiq;
		this.visMtTaxeSuspendu = visMtTaxeSuspendu;
		this.visDateLiquid = visDateLiquid;
		this.visTypeTraitement = visTypeTraitement;
	}

	public java.lang.String getVisAnneeLiquid() {
		return visAnneeLiquid;
	}

	public void setVisAnneeLiquid(java.lang.String visAnneeLiquid) {
		this.visAnneeLiquid = visAnneeLiquid;
	}

	public java.lang.String getVisBureauEnregDec() {
		return visBureauEnregDec;
	}

	public void setVisBureauEnregDec(java.lang.String visBureauEnregDec) {
		this.visBureauEnregDec = visBureauEnregDec;
	}

	public java.lang.Integer getVisNumDec() {
		return visNumDec;
	}

	public void setVisNumDec(java.lang.Integer visNumDec) {
		this.visNumDec = visNumDec;
	}

	public java.lang.Integer getVisNumArtDec() {
		return visNumArtDec;
	}

	public void setVisNumArtDec(java.lang.Integer visNumArtDec) {
		this.visNumArtDec = visNumArtDec;
	}

	public java.lang.String getVisCodeTaxe() {
		return visCodeTaxe;
	}

	public void setVisCodeTaxe(java.lang.String visCodeTaxe) {
		this.visCodeTaxe = visCodeTaxe;
	}

	public java.lang.String getVisCodePpmDeclarant() {
		return visCodePpmDeclarant;
	}

	public void setVisCodePpmDeclarant(java.lang.String visCodePpmDeclarant) {
		this.visCodePpmDeclarant = visCodePpmDeclarant;
	}

	public java.math.BigDecimal getVisBaseTaxeNorm() {
		return visBaseTaxeNorm;
	}

	public void setVisBaseTaxeNorm(java.math.BigDecimal visBaseTaxeNorm) {
		this.visBaseTaxeNorm = visBaseTaxeNorm;
	}

	public java.math.BigDecimal getVisQuotiteNorm() {
		return visQuotiteNorm;
	}

	public void setVisQuotiteNorm(java.math.BigDecimal visQuotiteNorm) {
		this.visQuotiteNorm = visQuotiteNorm;
	}

	public java.math.BigDecimal getVisMtTaxeNorm() {
		return visMtTaxeNorm;
	}

	public void setVisMtTaxeNorm(java.math.BigDecimal visMtTaxeNorm) {
		this.visMtTaxeNorm = visMtTaxeNorm;
	}

	public java.math.BigDecimal getVisBaseTaxeLiq() {
		return visBaseTaxeLiq;
	}

	public void setVisBaseTaxeLiq(java.math.BigDecimal visBaseTaxeLiq) {
		this.visBaseTaxeLiq = visBaseTaxeLiq;
	}

	public java.math.BigDecimal getVisQuotiteLiq() {
		return visQuotiteLiq;
	}

	public void setVisQuotiteLiq(java.math.BigDecimal visQuotiteLiq) {
		this.visQuotiteLiq = visQuotiteLiq;
	}

	public java.math.BigDecimal getVisMtTaxeLiq() {
		return visMtTaxeLiq;
	}

	public void setVisMtTaxeLiq(java.math.BigDecimal visMtTaxeLiq) {
		this.visMtTaxeLiq = visMtTaxeLiq;
	}

	public java.math.BigDecimal getVisMtTaxeSuspendu() {
		return visMtTaxeSuspendu;
	}

	public void setVisMtTaxeSuspendu(java.math.BigDecimal visMtTaxeSuspendu) {
		this.visMtTaxeSuspendu = visMtTaxeSuspendu;
	}

	public java.sql.Timestamp getVisDateLiquid() {
		return visDateLiquid;
	}

	public void setVisDateLiquid(java.sql.Timestamp visDateLiquid) {
		this.visDateLiquid = visDateLiquid;
	}

	public java.lang.String getVisTypeTraitement() {
		return visTypeTraitement;
	}

	public void setVisTypeTraitement(java.lang.String visTypeTraitement) {
		this.visTypeTraitement = visTypeTraitement;
    }

}