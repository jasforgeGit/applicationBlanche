package sn.com.douane.ejb.declaration.model.entities;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import sn.com.douane.ejb.declaration.model.keys.DclVentilCredTaxeKey;

import java.io.Serializable;

/**
 * @author: issam Bean implementation class for Enterprise Bean:
 *          DclVentilCredTaxe
 */

@Entity
@Table(name = "DCLVENTILCREDTAXE")
@IdClass(DclVentilCredTaxeKey.class)
public class DclVentilCredTaxe implements Serializable {

	private static final long serialVersionUID = 4512216125418506151L;

	@Id
	@Column(name = "DECCODECREDITAIRE", length = 3, nullable = false)
	private java.lang.String decCodeCreditaire;
	@Id
	@Column(name = "DECANNEEDECL", length = 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Id
	@Column(name = "DECBURDECL", length = 3, nullable = false)
	private java.lang.String decBurDecl;
	@Id
	@Column(name = "DECNUMDECL", nullable = false)
	private java.lang.Integer decNumDecl;
	@Id
	@Column(name = "DECCODETAXE", length = 2, nullable = false)
	private java.lang.String decCodeTaxe;
	@Column(name = "DECMONTCREDIT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal decMontCredit;
	@Column(name = "DECIMPTRESOR", length = 8)
	private java.lang.String decImpTresor;
	@Column(name = "DECIMPBUDGET", length = 8)
	private java.lang.String decImpBudget;

	@ManyToOne(targetEntity = SegGenDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMDECL", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEDECL", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURDECL", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false) })
	private SegGenDec segGenDec;

	public DclVentilCredTaxe() {
	}

	public DclVentilCredTaxe(String decCodeCreditaire, String decAnneeDecl,
			String decBurDecl, Integer decNumDecl, String decCodeTaxe) {
		this.decCodeCreditaire = decCodeCreditaire;
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(java.lang.String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public java.lang.String getDecBurDecl() {
		return decBurDecl;
	}

	public void setDecBurDecl(java.lang.String decBurDecl) {
		this.decBurDecl = decBurDecl;
	}

	public java.lang.Integer getDecNumDecl() {
		return decNumDecl;
	}

	public void setDecNumDecl(java.lang.Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.math.BigDecimal getDecMontCredit() {
		return decMontCredit;
	}

	public void setDecMontCredit(java.math.BigDecimal decMontCredit) {
		this.decMontCredit = decMontCredit;
	}

	public java.lang.String getDecImpTresor() {
		return decImpTresor;
	}

	public void setDecImpTresor(java.lang.String decImpTresor) {
		this.decImpTresor = decImpTresor;
	}

	public java.lang.String getDecImpBudget() {
		return decImpBudget;
	}

	public void setDecImpBudget(java.lang.String decImpBudget) {
		this.decImpBudget = decImpBudget;
	}

	public SegGenDec getSegGenDec() {
		return segGenDec;
	}

	public void setSegGenDec(SegGenDec segGenDec) {
		this.segGenDec = segGenDec;
	}
}