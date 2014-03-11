package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ViComplementTaxesKey;

/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: ViComplementTaxes
 */

@Entity
@Table(name = "VICOMPLEMENTTAXES")
@IdClass(ViComplementTaxesKey.class)

public class ViComplementTaxes implements Serializable {

	private static final long serialVersionUID = -5211805124216855380L;

	@Id @Column(name = "DECANNEEENREGDEC",length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC",length = 3, nullable = false)
	private String decBurEnregDec;

	@Id	@Column(name = "DECNUMDECLARATION",nullable = false)
	private Integer decNumDeclaration;

	@Id	@Column(name = "DECCODETAXE",length = 2, nullable = false)
	private String decCodeTaxe;

	@Column(name = "DECMONTANTCOMP",columnDefinition="DECIMAL(5,0)",nullable = false)
	private BigDecimal decMontantComp;


	public ViComplementTaxes()
	{

	}
	public ViComplementTaxes( String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, String decCodeTaxe) {
		this.decAnneeEnregDec=decAnneeEnregDec;
		this.decBurEnregDec=decBurEnregDec;
		this.decNumDeclaration=decNumDeclaration;
		this.decCodeTaxe=decCodeTaxe;
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

	public void setDecMontantComp(BigDecimal decMontantComp) {
		this.decMontantComp = decMontantComp;
	}

	public BigDecimal getDecMontantComp() {
		return decMontantComp;
	}



}