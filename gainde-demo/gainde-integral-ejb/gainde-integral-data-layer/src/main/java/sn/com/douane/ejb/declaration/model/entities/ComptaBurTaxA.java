package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.ComptaBurTaxAKey;

@Entity
@IdClass(ComptaBurTaxAKey.class)
@Table(name="COMPTABURTAXA")
public class ComptaBurTaxA implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2671703898525094213L;
	
	@Id
	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;

	@Id
	@Column(name="DECANNEEEMISSION", length=4, nullable=false)
	private java.lang.String decAnneeeMission;

	@Id
	@Column(name="DECCODETAXE",length=2 ,nullable=false)
	private java.lang.String decCodeTaxe;
	
	@Column(name="DECTYPEEMISSION",length=1)
	private java.lang.String dectypeemission;
	
	@Column(name="DECMONTANTCREDIT", columnDefinition="DECIMAL(12 , 0)")
	private java.math.BigDecimal decMontantCredit;
	
	@Column(name="DECMONTANTCPTANT", columnDefinition="DECIMAL(12 , 0)")
	private java.math.BigDecimal decMontantCptant;

	@Column(name="DECMONTANTANNULE", columnDefinition="DECIMAL(12 , 0)")
	private java.math.BigDecimal decMontantAnnule;
	
	@Column(name="DECMONTRECOUVRE", columnDefinition="DECIMAL(12 , 0)")
	private java.math.BigDecimal decMontreCouvre;

	@Transient
	private String decLibelleTaxe;
	
	public ComptaBurTaxA() {
		super();
	}

	public ComptaBurTaxA(String decCodeBureau, String decAnneeeMission,
			String decCodeTaxe, String dectypeemission,
			BigDecimal decMontantCredit, BigDecimal decMontantCptant,
			BigDecimal decMontantAnnule, BigDecimal decMontreCouvre) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decAnneeeMission = decAnneeeMission;
		this.decCodeTaxe = decCodeTaxe;
		this.dectypeemission = dectypeemission;
		this.decMontantCredit = decMontantCredit;
		this.decMontantCptant = decMontantCptant;
		this.decMontantAnnule = decMontantAnnule;
		this.decMontreCouvre = decMontreCouvre;
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecAnneeeMission() {
		return decAnneeeMission;
	}

	public void setDecAnneeeMission(java.lang.String decAnneeeMission) {
		this.decAnneeeMission = decAnneeeMission;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDectypeemission() {
		return dectypeemission;
	}

	public void setDectypeemission(java.lang.String dectypeemission) {
		this.dectypeemission = dectypeemission;
	}

	public java.math.BigDecimal getDecMontantCredit() {
		return decMontantCredit;
	}

	public void setDecMontantCredit(java.math.BigDecimal decMontantCredit) {
		this.decMontantCredit = decMontantCredit;
	}

	public java.math.BigDecimal getDecMontantCptant() {
		return decMontantCptant;
	}

	public void setDecMontantCptant(java.math.BigDecimal decMontantCptant) {
		this.decMontantCptant = decMontantCptant;
	}

	public java.math.BigDecimal getDecMontantAnnule() {
		return decMontantAnnule;
	}

	public void setDecMontantAnnule(java.math.BigDecimal decMontantAnnule) {
		this.decMontantAnnule = decMontantAnnule;
	}

	public java.math.BigDecimal getDecMontreCouvre() {
		return decMontreCouvre;
	}

	public void setDecMontreCouvre(java.math.BigDecimal decMontreCouvre) {
		this.decMontreCouvre = decMontreCouvre;
	}

	public String getDecLibelleTaxe() {
		return decLibelleTaxe;
	}

	public void setDecLibelleTaxe(String decLibelleTaxe) {
		this.decLibelleTaxe = decLibelleTaxe;
	}

}
