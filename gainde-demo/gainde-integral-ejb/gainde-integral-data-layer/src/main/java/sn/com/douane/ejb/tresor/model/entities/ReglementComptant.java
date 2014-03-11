package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.tresor.model.keys.ReglementComptantKey;

@Entity
@IdClass(ReglementComptantKey.class)
@javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name = "findByPeriod", query = "select object(o) from ReglementComptant o where  o.trDateQuittance>=?1 and o.trDateQuittance<=?2"), @javax.persistence.NamedQuery(name = "findByDeclaration", query = "select object(o) from ReglementComptant o where  o.trAnneeDeclaration = ?1 and  o.trBurDeclaration = ?2 and  o.trNumDeclaration = ?3"), @javax.persistence.NamedQuery(name = "ejbSelectSumMontantByPeriode", query = "select sum (o.trMontantQuittance) from ReglementComptant o where  o.modeReglement = ?1 and  o.trDateQuittance >= ?2 and  o.trDateQuittance <= ?3 GROUP BY o.modeReglement"), @javax.persistence.NamedQuery(name = "findCptantCreditByModereglement", query = "select object(o) from ReglementComptant o, ReglementCredit p where  o.trAnneeDeclaration =  p.trAnneeDecl and  o.trBurDeclaration = p.trBurDeclaration and  o.trNumDeclaration =p.trNumDeclaration  and  o.modeReglement = ?1 and p.trDateReglement >= ?2 and p.trDateReglement <= ?3  and o.trDateQuittance >= ?2 and o.trDateQuittance<= ?3")})
@Table(name="REGLEMENTCOMPTANT")
public class ReglementComptant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	
	@Id
	@Column(name="TRANNEEDECLARATION", length=4, nullable=false)
	 private java.lang.String trAnneeDeclaration;
	
	@Id
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	    private java.lang.String trBurDeclaration;
	
	@Id
	@Column(name="TRNUMDECLARATION", nullable=false)
	    private java.lang.Integer trNumDeclaration;
	
	@Id
	@Column(name="TRNUMQUITTANCE", length=20, nullable=false)
	    private java.lang.String trNumQuittance;
	
	@Id
	@Column(name="TRMONTANTQUITTANCE",columnDefinition="DECIMAL(18,0)", nullable=false)
	    private java.math.BigDecimal trMontantQuittance;
	
	
	@Column(name="TRDATEQUITTANCE", nullable=false)
	    private java.sql.Date trDateQuittance;
	
	@Column(name="TRUSERQUITTANCE", length=8, nullable=false)
	    private java.lang.String trUserQuittance;
	
	@Column(name="TRTYPELIQUIDATION", length=1, nullable=false)
	    private java.lang.String trTypeLiquidation;
	
	@Column(name="MODEREGLEMENT", length=2, nullable=false)
	    private java.lang.String modeReglement;

	public ReglementComptant(String trAnneeDeclaration,
			String trBurDeclaration, Integer trNumDeclaration,
			String trNumQuittance, BigDecimal trMontantQuittance,
			Date trDateQuittance, String trUserQuittance,
			String trTypeLiquidation, String modeReglement) {
		super();
		this.trAnneeDeclaration = trAnneeDeclaration;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trNumQuittance = trNumQuittance;
		this.trMontantQuittance = trMontantQuittance;
		this.trDateQuittance = trDateQuittance;
		this.trUserQuittance = trUserQuittance;
		this.trTypeLiquidation = trTypeLiquidation;
		this.modeReglement = modeReglement;
	}

	public ReglementComptant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getTrAnneeDeclaration() {
		return trAnneeDeclaration;
	}

	public void setTrAnneeDeclaration(java.lang.String trAnneeDeclaration) {
		this.trAnneeDeclaration = trAnneeDeclaration;
	}

	public java.lang.String getTrBurDeclaration() {
		return trBurDeclaration;
	}

	public void setTrBurDeclaration(java.lang.String trBurDeclaration) {
		this.trBurDeclaration = trBurDeclaration;
	}

	public java.lang.Integer getTrNumDeclaration() {
		return trNumDeclaration;
	}

	public void setTrNumDeclaration(java.lang.Integer trNumDeclaration) {
		this.trNumDeclaration = trNumDeclaration;
	}

	public java.lang.String getTrNumQuittance() {
		return trNumQuittance;
	}

	public void setTrNumQuittance(java.lang.String trNumQuittance) {
		this.trNumQuittance = trNumQuittance;
	}

	public java.math.BigDecimal getTrMontantQuittance() {
		return trMontantQuittance;
	}

	public void setTrMontantQuittance(java.math.BigDecimal trMontantQuittance) {
		this.trMontantQuittance = trMontantQuittance;
	}

	public java.sql.Date getTrDateQuittance() {
		return trDateQuittance;
	}

	public void setTrDateQuittance(java.sql.Date trDateQuittance) {
		this.trDateQuittance = trDateQuittance;
	}

	public java.lang.String getTrUserQuittance() {
		return trUserQuittance;
	}

	public void setTrUserQuittance(java.lang.String trUserQuittance) {
		this.trUserQuittance = trUserQuittance;
	}

	public java.lang.String getTrTypeLiquidation() {
		return trTypeLiquidation;
	}

	public void setTrTypeLiquidation(java.lang.String trTypeLiquidation) {
		this.trTypeLiquidation = trTypeLiquidation;
	}

	public java.lang.String getModeReglement() {
		return modeReglement;
	}

	public void setModeReglement(java.lang.String modeReglement) {
		this.modeReglement = modeReglement;
	}
	
	

}
