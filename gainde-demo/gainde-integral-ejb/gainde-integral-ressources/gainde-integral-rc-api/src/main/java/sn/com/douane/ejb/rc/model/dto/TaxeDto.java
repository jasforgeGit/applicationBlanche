package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class TaxeDto implements Serializable{

	private static final long serialVersionUID = -252819130604683927L;
	private String rcCodeTaxe;
	private String rcLibelleTaxe;
	private String rcCodeImpTresor;
	private String rcCodeImpBudget;
	private String rcUniteLiquidation;
	private java.math.BigDecimal rcMinPerceptionTaxe;
	private String rcBaseTaxe1;
	private String rcNatureTaxe;
	private Integer rcOrdreEvalTaxe;
	private String rcFormuleTaxe;
	private String rcIndComptant;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TaxeDto() {
		super();
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcLibelleTaxe() {
		return rcLibelleTaxe;
	}

	public void setRcLibelleTaxe(String rcLibelleTaxe) {
		this.rcLibelleTaxe = rcLibelleTaxe;
	}

	public String getRcCodeImpTresor() {
		return rcCodeImpTresor;
	}

	public void setRcCodeImpTresor(String rcCodeImpTresor) {
		this.rcCodeImpTresor = rcCodeImpTresor;
	}

	public String getRcCodeImpBudget() {
		return rcCodeImpBudget;
	}

	public void setRcCodeImpBudget(String rcCodeImpBudget) {
		this.rcCodeImpBudget = rcCodeImpBudget;
	}

	public String getRcUniteLiquidation() {
		return rcUniteLiquidation;
	}

	public void setRcUniteLiquidation(String rcUniteLiquidation) {
		this.rcUniteLiquidation = rcUniteLiquidation;
	}

	public java.math.BigDecimal getRcMinPerceptionTaxe() {
		return rcMinPerceptionTaxe;
	}

	public void setRcMinPerceptionTaxe(java.math.BigDecimal rcMinPerceptionTaxe) {
		this.rcMinPerceptionTaxe = rcMinPerceptionTaxe;
	}

	public String getRcBaseTaxe1() {
		return rcBaseTaxe1;
	}

	public void setRcBaseTaxe1(String rcBaseTaxe1) {
		this.rcBaseTaxe1 = rcBaseTaxe1;
	}

	public String getRcNatureTaxe() {
		return rcNatureTaxe;
	}

	public void setRcNatureTaxe(String rcNatureTaxe) {
		this.rcNatureTaxe = rcNatureTaxe;
	}

	public Integer getRcOrdreEvalTaxe() {
		return rcOrdreEvalTaxe;
	}

	public void setRcOrdreEvalTaxe(Integer rcOrdreEvalTaxe) {
		this.rcOrdreEvalTaxe = rcOrdreEvalTaxe;
	}

	public String getRcFormuleTaxe() {
		return rcFormuleTaxe;
	}

	public void setRcFormuleTaxe(String rcFormuleTaxe) {
		this.rcFormuleTaxe = rcFormuleTaxe;
	}

	public String getRcIndComptant() {
		return rcIndComptant;
	}

	public void setRcIndComptant(String rcIndComptant) {
		this.rcIndComptant = rcIndComptant;
	}

	public String getPk() {
		pk = rcCodeTaxe;
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEditCell() {
		return editCell;
	}

	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}

	public String getDelCell() {
		return delCell;
	}

	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}

}
