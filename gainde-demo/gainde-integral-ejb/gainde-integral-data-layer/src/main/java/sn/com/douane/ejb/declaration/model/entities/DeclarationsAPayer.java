package sn.com.douane.ejb.declaration.model.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DeclarationsAPayerKey;

@Entity
@IdClass(DeclarationsAPayerKey.class)
@Table(name = "DECLARATIONSAPAYER")
public class DeclarationsAPayer {

	@Id
	@Column(name = "ANDCL", columnDefinition = "CHAR(4)", nullable = false)
	private String anDcl;

	@Id
	@Column(name = "BURDCL", columnDefinition = "CHAR(3)", nullable = false)
	private String burDcl;

	@Id
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;

	@Column(name = "CODAGT", columnDefinition = "CHAR(15)")
	private String codAgt;

	@Column(name = "CODDES", columnDefinition = "CHAR(15)")
	private String codDes;

	@Column(name = "NOMDES")
	private String nomDes;

	@Column(name = "CODDEC", columnDefinition = "CHAR(15)")
	private String codDec;

	@Column(name = "MODPAY", columnDefinition = "CHAR(3)")
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

	@Column(name = "REFERENCE", length = 50)
	private String Reference;

	@Column(name = "DATDCL")
	private Timestamp datDcl;

	@Column(name = "DATEVALIDATIONTRESOR")
	private Timestamp DateValidationTresor;

	@Column(name = "NUMEROAVIS", length = 100)
	private String NumeroAvis;

	public DeclarationsAPayer() {

	}

	public DeclarationsAPayer(String anDcl, String burDcl, Integer numDcl) {
		super();
		this.anDcl = anDcl;
		this.burDcl = burDcl;
		this.numDcl = numDcl;
	}

	/**
	 * @return the anDcl
	 */
	public String getAnDcl() {
		return anDcl;
	}

	/**
	 * @param anDcl the anDcl to set
	 */
	public void setAnDcl(String anDcl) {
		this.anDcl = anDcl;
	}

	/**
	 * @return the burDcl
	 */
	public String getBurDcl() {
		return burDcl;
	}

	/**
	 * @param burDcl the burDcl to set
	 */
	public void setBurDcl(String burDcl) {
		this.burDcl = burDcl;
	}

	/**
	 * @return the numDcl
	 */
	public Integer getNumDcl() {
		return numDcl;
	}

	/**
	 * @param numDcl the numDcl to set
	 */
	public void setNumDcl(Integer numDcl) {
		this.numDcl = numDcl;
	}

	/**
	 * @return the codAgt
	 */
	public String getCodAgt() {
		return codAgt;
	}

	/**
	 * @param codAgt the codAgt to set
	 */
	public void setCodAgt(String codAgt) {
		this.codAgt = codAgt;
	}

	/**
	 * @return the codDes
	 */
	public String getCodDes() {
		return codDes;
	}

	/**
	 * @param codDes the codDes to set
	 */
	public void setCodDes(String codDes) {
		this.codDes = codDes;
	}

	/**
	 * @return the nomDes
	 */
	public String getNomDes() {
		return nomDes;
	}

	/**
	 * @param nomDes the nomDes to set
	 */
	public void setNomDes(String nomDes) {
		this.nomDes = nomDes;
	}

	/**
	 * @return the codDec
	 */
	public String getCodDec() {
		return codDec;
	}

	/**
	 * @param codDec the codDec to set
	 */
	public void setCodDec(String codDec) {
		this.codDec = codDec;
	}

	/**
	 * @return the modPay
	 */
	public String getModPay() {
		return modPay;
	}

	/**
	 * @param modPay the modPay to set
	 */
	public void setModPay(String modPay) {
		this.modPay = modPay;
	}

	/**
	 * @return the montanTresor
	 */
	public java.math.BigDecimal getMontanTresor() {
		return montanTresor;
	}

	/**
	 * @param montanTresor the montanTresor to set
	 */
	public void setMontanTresor(java.math.BigDecimal montanTresor) {
		this.montanTresor = montanTresor;
	}

	/**
	 * @return the montantPcs
	 */
	public java.math.BigDecimal getMontantPcs() {
		return montantPcs;
	}

	/**
	 * @param montantPcs the montantPcs to set
	 */
	public void setMontantPcs(java.math.BigDecimal montantPcs) {
		this.montantPcs = montantPcs;
	}

	/**
	 * @return the montantPcc
	 */
	public java.math.BigDecimal getMontantPcc() {
		return montantPcc;
	}

	/**
	 * @param montantPcc the montantPcc to set
	 */
	public void setMontantPcc(java.math.BigDecimal montantPcc) {
		this.montantPcc = montantPcc;
	}

	/**
	 * @return the valideTresor
	 */
	public Integer getValideTresor() {
		return valideTresor;
	}

	/**
	 * @param valideTresor the valideTresor to set
	 */
	public void setValideTresor(Integer valideTresor) {
		this.valideTresor = valideTresor;
	}

	/**
	 * @return the valideBanque
	 */
	public Integer getValideBanque() {
		return valideBanque;
	}

	/**
	 * @param valideBanque the valideBanque to set
	 */
	public void setValideBanque(Integer valideBanque) {
		this.valideBanque = valideBanque;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return Reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		Reference = reference;
	}

	/**
	 * @return the datDcl
	 */
	public Timestamp getDatDcl() {
		return datDcl;
	}

	/**
	 * @param datDcl the datDcl to set
	 */
	public void setDatDcl(Timestamp datDcl) {
		this.datDcl = datDcl;
	}

	/**
	 * @return the dateValidationTresor
	 */
	public Timestamp getDateValidationTresor() {
		return DateValidationTresor;
	}

	/**
	 * @param dateValidationTresor the dateValidationTresor to set
	 */
	public void setDateValidationTresor(Timestamp dateValidationTresor) {
		DateValidationTresor = dateValidationTresor;
	}

	/**
	 * @return the numeroAvis
	 */
	public String getNumeroAvis() {
		return NumeroAvis;
	}

	/**
	 * @param numeroAvis the numeroAvis to set
	 */
	public void setNumeroAvis(String numeroAvis) {
		NumeroAvis = numeroAvis;
	}
}
