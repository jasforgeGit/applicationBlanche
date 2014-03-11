package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.ComptaBurTaxmKey;

/**
 * Bean implementation class for Enterprise Bean: Comptaburtaxm
 */
@Entity
@IdClass(ComptaBurTaxmKey.class)
@Table(name="COMPTABURTAXM")
public class ComptaBurTaxm implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2978184206186065487L;
	/**
	 * 
	 */
	@Id
	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;

	@Id
	@Column(name="DECMOISEMISSION", length=2, nullable=false)
	private java.lang.String decMoisEmission;

	@Id
	@Column(name="DECANNEEEMISSION", length=4, nullable=false)
	private java.lang.String decAnneeEmission;

	@Id
	@Column(name="DECCODETAXE", length=2 ,nullable=false)
	private java.lang.String  decCodeTaxe;
	
	@Column(name="DECMONTANTCREDIT",columnDefinition="DECIMAL(12 , 0)")
    private java.math.BigDecimal decMontantCredit;
	
	@Column(name="DECMONTANTCPTANT",columnDefinition="DECIMAL(12 , 0)")
    private java.math.BigDecimal decMontantCptant;
	
	@Column(name="DECMONTANTANNULE",columnDefinition="DECIMAL(12 , 0)")
    private java.math.BigDecimal decMontantAnnule;
	
	@Column(name="DECMONTRECOUVRE",columnDefinition="DECIMAL(12 , 0)")
    private java.math.BigDecimal decMontRecouvre;
	
	@Column(name="DECTYPEEMISSION" ,length=1)
    private java.lang.String decTypeEmission;
	
	@Transient
	private String decLibelleTaxe; 

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecMoisEmission() {
		return decMoisEmission;
	}

	public void setDecMoisEmission(java.lang.String decMoisEmission) {
		this.decMoisEmission = decMoisEmission;
	}

	public java.lang.String getDecAnneeEmission() {
		return decAnneeEmission;
	}

	public void setDecAnneeEmission(java.lang.String decAnneeEmission) {
		this.decAnneeEmission = decAnneeEmission;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
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

	public java.math.BigDecimal getDecMontRecouvre() {
		return decMontRecouvre;
	}

	public void setDecMontRecouvre(java.math.BigDecimal decMontRecouvre) {
		this.decMontRecouvre = decMontRecouvre;
	}

	public java.lang.String getDecTypeEmission() {
		return decTypeEmission;
	}

	public void setDecTypeEmission(java.lang.String decTypeEmission) {
		this.decTypeEmission = decTypeEmission;
	}

	public ComptaBurTaxm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDecLibelleTaxe() {
		return decLibelleTaxe;
	}

	public void setDecLibelleTaxe(String decLibelleTaxe) {
		this.decLibelleTaxe = decLibelleTaxe;
	}

    

	
	
}