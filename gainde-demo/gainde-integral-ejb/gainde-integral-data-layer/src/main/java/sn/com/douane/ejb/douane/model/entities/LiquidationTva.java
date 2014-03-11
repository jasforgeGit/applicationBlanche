package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.douane.model.keys.LiquidationTvaKey;
import sn.com.douane.ejb.rc.model.entities.Ppm;

@Entity
@Table(name = "LIQUIDATIONTVA")
@IdClass(LiquidationTvaKey.class)
public class LiquidationTva implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7782749296283873974L;
	@Id
	@Column(name = "ANNEEDECLARATION", columnDefinition = "CHAR(4)", nullable = false)
	private String anneeDeclaration;

	@Id
	@Column(name = "BUREAUDECLARATION", columnDefinition = "CHAR(3)", nullable = false)
	private String bureauDeclaration;

	@Id
	@Column(name = "NUMERODECLARATION", nullable = false)
	private Integer numeroDeclaration;

	@Id
	@Column(name = "CODETAXE", columnDefinition = "CHAR(2)", nullable = false)
	private String codeTaxe;

	@Column(name = "CODEPPMDEST", length = 5)
	private String codePpmDest;

	@Column(name = "CODEPPMDECL", length = 5)
	private String codePpmDecl;

	@Column(name="DATELIQUIDATION")
    private java.sql.Date dateLiquidation;
	
	@Column(name = "BASETAXABLE", columnDefinition = "DECIMAL(15 , 0)")
	private BigDecimal baseTaxable;

	@Column(name = "QUOTITE", columnDefinition = "DECIMAL(9 , 0)")
	private BigDecimal quotite;

	@Column(name = "MONTAXEIQUIDE", columnDefinition = "DECIMAL(15 , 0)")
	private BigDecimal monTaxeLiquide;

	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "CODEPPMDECL", insertable = false, updatable = false)
	private Ppm ppmdecl;

	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "CODEPPMDEST", insertable = false, updatable = false)
	private Ppm ppmDest;

	public LiquidationTva(){
		
	}

	/**
	 * @param anneeDeclaration
	 * @param bureauDeclaration
	 * @param numeroDeclaration
	 * @param codeTaxe
	 * @param codePpmDest
	 * @param codePpmDecl
	 * @param dateLiquidation
	 * @param baseTaxable
	 * @param quotite
	 * @param monTaxeLiquide
	 */
	public LiquidationTva(String anneeDeclaration, String bureauDeclaration,
			Integer numeroDeclaration, String codeTaxe, String codePpmDest,
			String codePpmDecl, Date dateLiquidation, BigDecimal baseTaxable,
			BigDecimal quotite, BigDecimal monTaxeLiquide) {
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDeclaration = bureauDeclaration;
		this.numeroDeclaration = numeroDeclaration;
		this.codeTaxe = codeTaxe;
		this.codePpmDest = codePpmDest;
		this.codePpmDecl = codePpmDecl;
		this.dateLiquidation = dateLiquidation;
		this.baseTaxable = baseTaxable;
		this.quotite = quotite;
		this.monTaxeLiquide = monTaxeLiquide;
	}

	/**
	 * @return the anneeDeclaration
	 */
	public String getAnneeDeclaration() {
		return anneeDeclaration;
	}

	/**
	 * @param anneeDeclaration the anneeDeclaration to set
	 */
	public void setAnneeDeclaration(String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}

	/**
	 * @return the bureauDeclaration
	 */
	public String getBureauDeclaration() {
		return bureauDeclaration;
	}

	/**
	 * @param bureauDeclaration the bureauDeclaration to set
	 */
	public void setBureauDeclaration(String bureauDeclaration) {
		this.bureauDeclaration = bureauDeclaration;
	}

	/**
	 * @return the numeroDeclaration
	 */
	public Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}

	/**
	 * @param numeroDeclaration the numeroDeclaration to set
	 */
	public void setNumeroDeclaration(Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}

	/**
	 * @return the codeTaxe
	 */
	public String getCodeTaxe() {
		return codeTaxe;
	}

	/**
	 * @param codeTaxe the codeTaxe to set
	 */
	public void setCodeTaxe(String codeTaxe) {
		this.codeTaxe = codeTaxe;
	}

	/**
	 * @return the codePpmDest
	 */
	public String getCodePpmDest() {
		return codePpmDest;
	}

	/**
	 * @param codePpmDest the codePpmDest to set
	 */
	public void setCodePpmDest(String codePpmDest) {
		this.codePpmDest = codePpmDest;
	}

	/**
	 * @return the codePpmDecl
	 */
	public String getCodePpmDecl() {
		return codePpmDecl;
	}

	/**
	 * @param codePpmDecl the codePpmDecl to set
	 */
	public void setCodePpmDecl(String codePpmDecl) {
		this.codePpmDecl = codePpmDecl;
	}

	/**
	 * @return the dateLiquidation
	 */
	public java.sql.Date getDateLiquidation() {
		return dateLiquidation;
	}

	/**
	 * @param dateLiquidation the dateLiquidation to set
	 */
	public void setDateLiquidation(java.sql.Date dateLiquidation) {
		this.dateLiquidation = dateLiquidation;
	}

	/**
	 * @return the baseTaxable
	 */
	public BigDecimal getBaseTaxable() {
		return baseTaxable;
	}

	/**
	 * @param baseTaxable the baseTaxable to set
	 */
	public void setBaseTaxable(BigDecimal baseTaxable) {
		this.baseTaxable = baseTaxable;
	}

	/**
	 * @return the quotite
	 */
	public BigDecimal getQuotite() {
		return quotite;
	}

	/**
	 * @param quotite the quotite to set
	 */
	public void setQuotite(BigDecimal quotite) {
		this.quotite = quotite;
	}

	/**
	 * @return the monTaxeLiquide
	 */
	public BigDecimal getMonTaxeLiquide() {
		return monTaxeLiquide;
	}

	/**
	 * @param monTaxeLiquide the monTaxeLiquide to set
	 */
	public void setMonTaxeLiquide(BigDecimal monTaxeLiquide) {
		this.monTaxeLiquide = monTaxeLiquide;
	}

	/**
	 * @return the ppmdecl
	 */
	public Ppm getPpmdecl() {
		return ppmdecl;
	}

	/**
	 * @param ppmdecl the ppmdecl to set
	 */
	public void setPpmdecl(Ppm ppmdecl) {
		this.ppmdecl = ppmdecl;
	}

	/**
	 * @return the ppmDest
	 */
	public Ppm getPpmDest() {
		return ppmDest;
	}

	/**
	 * @param ppmDest the ppmDest to set
	 */
	public void setPpmDest(Ppm ppmDest) {
		this.ppmDest = ppmDest;
	}
}
