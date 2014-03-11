package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.ComptaBurTaxJKey;


@Entity
@IdClass(ComptaBurTaxJKey.class)
@Table(name="COMPTABURTAXJ")
public class ComptaBurTaxJ implements Serializable {

	
	private static final long serialVersionUID = 9165275992282528866L;
	
	
	@Id
	@Column(name="DECCODEBUREAU",length=3, nullable=false)
	 private java.lang.String decCodeBureau;
	
	@Id
	@Column(name="DECDATEEMISSION", nullable=false)
	    private java.sql.Date decDateEmission;
	
	@Id
	@Column(name="DECCODETAXE",length=2, nullable=false)
	    private java.lang.String decCodeTaxe;
	
	@Column(name="DECTYPEEMISSION",length=1)
	    private java.lang.String decTypeEmission;
	
	@Column(name="DECMONTANTCREDIT",columnDefinition="DECIMAL(12 , 0)")
	    private java.math.BigDecimal decMontantCredit;
	
	@Column(name="DECMONTANTCPTANT",columnDefinition="DECIMAL(12 , 0)")
	    private java.math.BigDecimal decMontantCptant;
	
	@Column(name="DECMONTANTANNULE",columnDefinition="DECIMAL(12 , 0)")
	    private java.math.BigDecimal decMontantAnnule;
	
	@Column(name="DECMONTRECOUVRE", columnDefinition="DECIMAL(12 , 0)")
	    private java.math.BigDecimal decMontRecouvre;

	@Transient
	private String decLibelleTaxe;
	
	public ComptaBurTaxJ(String decCodeBureau, Date decDateEmission,
			String decCodeTaxe, String decTypeEmission,
			BigDecimal decMontantCredit, BigDecimal decMontantCptant,
			BigDecimal decMontantAnnule, BigDecimal decMontRecouvre) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decDateEmission = decDateEmission;
		this.decCodeTaxe = decCodeTaxe;
		this.decTypeEmission = decTypeEmission;
		this.decMontantCredit = decMontantCredit;
		this.decMontantCptant = decMontantCptant;
		this.decMontantAnnule = decMontantAnnule;
		this.decMontRecouvre = decMontRecouvre;
	}

	public ComptaBurTaxJ() {
		super();
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.sql.Date getDecDateEmission() {
		return decDateEmission;
	}

	public void setDecDateEmission(java.sql.Date decDateEmission) {
		this.decDateEmission = decDateEmission;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDecTypeEmission() {
		return decTypeEmission;
	}

	public void setDecTypeEmission(java.lang.String decTypeEmission) {
		this.decTypeEmission = decTypeEmission;
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

	public String getDecLibelleTaxe() {
		return decLibelleTaxe;
	}

	public void setDecLibelleTaxe(String decLibelleTaxe) {
		this.decLibelleTaxe = decLibelleTaxe;
	}
	
	

}
