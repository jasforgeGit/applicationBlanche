/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.LiquidationSommierKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(LiquidationSommierKey.class)
@Table(name = "LIQUIDATIONSOMMIER")
public class LiquidationSommier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6256984836231730275L;
	
	@Id @Column(name = "DECANNEELIQUID", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Id @Column(name = "DECBUREAUENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id @Column(name = "DECNUMDEC", nullable = false)
	private java.lang.Integer decNumDeclaration;
	@Id @Column(name = "DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Id @Column(name = "DECCODETAXE", length = 2, nullable = false)
    private java.lang.String decCodeTaxe;
	@Column(name = "DECCODEPPMDECLARANT", length = 5)
    private java.lang.String decCodePpmDeclarant;
	@Column(name = "DECBASETAXE", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decBaseTaxe;
	@Column(name = "DECQUOTITE",  columnDefinition = "DECIMAL(8,2)")
    private java.math.BigDecimal decQuotite;
	@Column(name = "DECMTTAXE", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decMtTaxe;
	@Column(name = "DECDATELIQUID")
    private java.sql.Date decDateLiquid;
    
    @ManyToOne(targetEntity = Sommiers.class)
	@JoinColumns({
		@JoinColumn(name = "DECANNEELIQUID", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECBUREAUENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMDEC", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false, nullable = false)
		})
    private Sommiers sommLiqSomm;

	/**
	 * 
	 */
	public LiquidationSommier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decCodeTaxe
	 */
	public LiquidationSommier(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec, String decCodeTaxe) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decCodeTaxe = decCodeTaxe;
	}

	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	/**
	 * @return the decCodeTaxe
	 */
	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	/**
	 * @param decCodeTaxe the decCodeTaxe to set
	 */
	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	/**
	 * @return the decCodePpmDeclarant
	 */
	public java.lang.String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(java.lang.String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	/**
	 * @return the decBaseTaxe
	 */
	public java.math.BigDecimal getDecBaseTaxe() {
		return decBaseTaxe;
	}

	/**
	 * @param decBaseTaxe the decBaseTaxe to set
	 */
	public void setDecBaseTaxe(java.math.BigDecimal decBaseTaxe) {
		this.decBaseTaxe = decBaseTaxe;
	}

	/**
	 * @return the decQuotite
	 */
	public java.math.BigDecimal getDecQuotite() {
		return decQuotite;
	}

	/**
	 * @param decQuotite the decQuotite to set
	 */
	public void setDecQuotite(java.math.BigDecimal decQuotite) {
		this.decQuotite = decQuotite;
	}

	/**
	 * @return the decMtTaxe
	 */
	public java.math.BigDecimal getDecMtTaxe() {
		return decMtTaxe;
	}

	/**
	 * @param decMtTaxe the decMtTaxe to set
	 */
	public void setDecMtTaxe(java.math.BigDecimal decMtTaxe) {
		this.decMtTaxe = decMtTaxe;
	}

	/**
	 * @return the decDateLiquid
	 */
	public java.sql.Date getDecDateLiquid() {
		return decDateLiquid;
	}

	/**
	 * @param decDateLiquid the decDateLiquid to set
	 */
	public void setDecDateLiquid(java.sql.Date decDateLiquid) {
		this.decDateLiquid = decDateLiquid;
	}

	/**
	 * @return the sommLiqSomm
	 */
	public Sommiers getSommLiqSomm() {
		return sommLiqSomm;
	}

	/**
	 * @param sommLiqSomm the sommLiqSomm to set
	 */
	public void setSommLiqSomm(Sommiers sommLiqSomm) {
		this.sommLiqSomm = sommLiqSomm;
	}
    
    
    
    

}
