package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DeclarationsPaieAutoKey;

@Entity
@IdClass(DeclarationsPaieAutoKey.class)
@Table(name = "DECLARATIONSPAIEAUTO")
public class DeclarationsPaieAuto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -286552466232188211L;

	@Id
	@Column(name = "ANDCL", columnDefinition = "CHAR(4)", nullable = false)
	private String anDcl;

	@Id
	@Column(name = "BURDCL", columnDefinition = "CHAR(3)", nullable = false)
	private String burDcl;

	@Id
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;

	@Column(name = "CODDES", columnDefinition = "CHAR(5)")
	private String codDes;

	@Column(name = "NOMDES")
	private String nomDes;

	@Column(name = "CODDEC", columnDefinition = "CHAR(5)")
	private String codDec;

	@Column(name = "NOMDEC", columnDefinition = "CHAR(50)")
	private String nomDec;

	@Column(name = "MODPAY", columnDefinition = "CHAR(1)")
	private String modPay;

	@Column(name = "MONTANTRESOR", columnDefinition = "DECIMAL(18 , 2)")
	private java.math.BigDecimal montanTresor;

	@Column(name = "MONTANTPCS", columnDefinition = "DECIMAL(18 , 2)")
	private java.math.BigDecimal montantPcs;

	@Column(name = "MONTANTPCC", columnDefinition = "DECIMAL(18 , 2)")
	private java.math.BigDecimal montantPcc;

	@Column(name = "VALIDETRESOR")
	private Integer valideTresor;

	@Column(name = "VALIDEBANQUE")
	private Integer valideBanque;

	
	@Column(name = "DATDCL")
	private java.sql.Timestamp datDcl;

	
	@Column(name = "STATUT")
	private Integer statut;


	public DeclarationsPaieAuto() {
		super();
	}


	public DeclarationsPaieAuto(String anDcl, String burDcl, Integer numDcl) {
		super();
		this.anDcl = anDcl;
		this.burDcl = burDcl;
		this.numDcl = numDcl;
	}
	
	

	public String getAnDcl() {
		return anDcl;
	}


	public void setAnDcl(String anDcl) {
		this.anDcl = anDcl;
	}


	public String getBurDcl() {
		return burDcl;
	}


	public void setBurDcl(String burDcl) {
		this.burDcl = burDcl;
	}


	public Integer getNumDcl() {
		return numDcl;
	}


	public void setNumDcl(Integer numDcl) {
		this.numDcl = numDcl;
	}


	public String getCodDes() {
		return codDes;
	}


	public void setCodDes(String codDes) {
		this.codDes = codDes;
	}


	public String getNomDes() {
		return nomDes;
	}


	public void setNomDes(String nomDes) {
		this.nomDes = nomDes;
	}


	public String getCodDec() {
		return codDec;
	}


	public void setCodDec(String codDec) {
		this.codDec = codDec;
	}


	public String getNomDec() {
		return nomDec;
	}


	public void setNomDec(String nomDec) {
		this.nomDec = nomDec;
	}


	public String getModPay() {
		return modPay;
	}


	public void setModPay(String modPay) {
		this.modPay = modPay;
	}


	public java.math.BigDecimal getMontanTresor() {
		return montanTresor;
	}


	public void setMontanTresor(java.math.BigDecimal montanTresor) {
		this.montanTresor = montanTresor;
	}


	public java.math.BigDecimal getMontantPcs() {
		return montantPcs;
	}


	public void setMontantPcs(java.math.BigDecimal montantPcs) {
		this.montantPcs = montantPcs;
	}


	public java.math.BigDecimal getMontantPcc() {
		return montantPcc;
	}


	public void setMontantPcc(java.math.BigDecimal montantPcc) {
		this.montantPcc = montantPcc;
	}


	public Integer getValideTresor() {
		return valideTresor;
	}


	public void setValideTresor(Integer valideTresor) {
		this.valideTresor = valideTresor;
	}


	public Integer getValideBanque() {
		return valideBanque;
	}


	public void setValideBanque(Integer valideBanque) {
		this.valideBanque = valideBanque;
	}


	public java.sql.Timestamp getDatDcl() {
		return datDcl;
	}


	public void setDatDcl(java.sql.Timestamp datDcl) {
		this.datDcl = datDcl;
	}


	public Integer getStatut() {
		return statut;
	}


	public void setStatut(Integer statut) {
		this.statut = statut;
	}
	
	

}
