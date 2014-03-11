package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DetailsDosAPayerAutoKey;



/**
 * @author Taher
 *
 */
@Entity
@Table(name = "DETAILSDOSAPAYERAUTO")
@IdClass(DetailsDosAPayerAutoKey.class)
public class DetailsDosAPayerAuto implements Serializable {

	@Id
	@Column(name = "ANDCL", length = 4, nullable = false)
	private java.lang.String anDcl;

	@Id
	@Column(name = "BURDCL", length = 3, nullable = false)
	private java.lang.String burDcl;

	@Id
	@Column(name = "NUMDCL", columnDefinition = "DECIMAL(18,2)", nullable = false)
	private java.math.BigDecimal numDcl;
	
	@Column(name = "CODDEC", length = 15)
    private java.lang.String codDec;
	
	@Column(name = "CODDES", length = 15)
    private java.lang.String codDes;

	@Column(name = "NOMDES", length = 50)
    private java.lang.String nomDes;
	
	@Column(name = "MONTANTRESOR", columnDefinition = "DECIMAL(18,2)")
    private java.math.BigDecimal montanTresor;

	@Column(name = "MONTANTPCS",  columnDefinition = "DECIMAL(18,2)")
    private java.math.BigDecimal montantPcs;

	@Column(name = "MONTANTPCC", columnDefinition = "DECIMAL(18,2)")
    private java.math.BigDecimal montantPcc;

	@Column(name = "MODPAY", columnDefinition ="CHAR(2)")
    private java.lang.String modPay;

	@Column(name = "CODCRD", length = 50)
	private java.lang.String codCrd;

	@Column(name = "DATDCL")
    private java.sql.Timestamp datDcl;

	@Column(name = "NODOSSDEFINITIF")
	private java.lang.Integer noDossDefinitif;

	@Column(name = "NODOSSPROVISOIRE")
	private java.lang.Integer noDossProvisoire;
	
	

	public DetailsDosAPayerAuto() {
		super();
	}
	public java.lang.String getAnDcl() {
		return anDcl;
	}

	public void setAnDcl(java.lang.String anDcl) {
		this.anDcl = anDcl;
	}

	public java.lang.String getBurDcl() {
		return burDcl;
	}

	public void setBurDcl(java.lang.String burDcl) {
		this.burDcl = burDcl;
	}

	public java.math.BigDecimal getNumDcl() {
		return numDcl;
	}

	public void setNumDcl(java.math.BigDecimal numDcl) {
		this.numDcl = numDcl;
	}

	public java.lang.String getCodDec() {
		return codDec;
	}

	public void setCodDec(java.lang.String codDec) {
		this.codDec = codDec;
	}

	public java.lang.String getCodDes() {
		return codDes;
	}

	public void setCodDes(java.lang.String codDes) {
		this.codDes = codDes;
	}

	public java.lang.String getNomDes() {
		return nomDes;
	}

	public void setNomDes(java.lang.String nomDes) {
		this.nomDes = nomDes;
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

	public java.lang.String getModPay() {
		return modPay;
	}

	public void setModPay(java.lang.String modPay) {
		this.modPay = modPay;
	}

	public java.lang.String getCodCrd() {
		return codCrd;
	}

	public void setCodCrd(java.lang.String codCrd) {
		this.codCrd = codCrd;
	}

	public java.sql.Timestamp getDatDcl() {
		return datDcl;
	}

	public void setDatDcl(java.sql.Timestamp datDcl) {
		this.datDcl = datDcl;
	}

	public java.lang.Integer getNoDossDefinitif() {
		return noDossDefinitif;
	}

	public void setNoDossDefinitif(java.lang.Integer noDossDefinitif) {
		this.noDossDefinitif = noDossDefinitif;
	}

	public java.lang.Integer getNoDossProvisoire() {
		return noDossProvisoire;
	}

	public void setNoDossProvisoire(java.lang.Integer noDossProvisoire) {
		this.noDossProvisoire = noDossProvisoire;
	}
	
	
}
