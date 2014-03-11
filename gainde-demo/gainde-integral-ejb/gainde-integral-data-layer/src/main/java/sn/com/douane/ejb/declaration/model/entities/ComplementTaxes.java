package sn.com.douane.ejb.declaration.model.entities;

import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;
import sn.com.douane.ejb.declaration.model.keys.ComplementTaxesKey;
import javax.persistence.ManyToOne;

/**
 * @author: issam classe d'implementation de l'Entity: ComplementTaxes
 */
@Entity
@Table(name = "COMPLEMENTTAXES")
@IdClass(ComplementTaxesKey.class)
public class ComplementTaxes implements Serializable {

	private static final long serialVersionUID = 687750957447016257L;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	@Id
	@Column(name = "DECCODETAXE", length = 2, nullable = false)
	private String decCodeTaxe;
	@Column(name = "DECMONTANTCOMP", columnDefinition = "DECIMAL(5 , 0)", nullable = false)
	private BigDecimal decMontantComp;

	@ManyToOne(targetEntity = SegGenDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false) })
	private SegGenDec segGenDec;

	public ComplementTaxes() {
	}

	public ComplementTaxes(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, String decCodeTaxe,
			BigDecimal decMontantComp) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decCodeTaxe = decCodeTaxe;
		this.decMontantComp = decMontantComp;
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public BigDecimal getDecMontantComp() {
		return decMontantComp;
	}

	public void setDecMontantComp(BigDecimal decMontantComp) {
		this.decMontantComp = decMontantComp;
	}

	public SegGenDec getSegGenDec() {
		return segGenDec;
	}

	public void setSegGenDec(SegGenDec segGenDec) {
		this.segGenDec = segGenDec;
	}

	
}