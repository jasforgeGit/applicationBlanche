package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DossiersPaieAutoKey;



/**
 * @author Taher
 *
 */
@Entity
@Table(name = "DOSSIERSPAIEAUTO")
@IdClass(DossiersPaieAutoKey.class)
public class DossiersPaieAuto implements Serializable {
	
	private static final long serialVersionUID = 4664194032020510776L;
	
	@Id
	@Column(name = "CODCRD", columnDefinition="CHAR(3)", nullable = false)
	private java.lang.String codCrd;

	@Id
	@Column(name = "NODOSSPROVISOIRE", nullable = false)
	private java.lang.Integer noDossProvisoire;

	@Column(name = "NODOSSDEFINITIF")
	private java.lang.Integer noDossDefinitif;

	@Column(name = "CODDEC", columnDefinition="CHAR(5)")
	private java.lang.String codDec;

	@Column(name = "NOMDEC", columnDefinition="CHAR(30)")
	private java.lang.String nomDec;

	@Column(name = "MODPAY", columnDefinition="CHAR(1)")
	private java.lang.String modPay;

	@Column(name = "SURPLUS_TAX", columnDefinition = "DECIMAL(18,2)")
	private java.math.BigDecimal surPlusTax;

	@Column(name = "MONTANTRESOR",  columnDefinition = "DECIMAL(18,2)")
	private java.math.BigDecimal montanTresor;

	@Column(name = "MONTANTPCS", columnDefinition = "DECIMAL(18,2)")
	private java.math.BigDecimal montantPcs;

	@Column(name = "MONTANTPCC", columnDefinition = "DECIMAL(18,2)")
	private java.math.BigDecimal montantPcc;

	@Column(name = "DATECH")
	private java.sql.Timestamp dateCh;

	@Column(name = "STATUT")
	private java.lang.Integer statut;
	
	

	public DossiersPaieAuto() {
		super();
	}

	public java.lang.String getCodCrd() {
		return codCrd;
	}

	public void setCodCrd(java.lang.String codCrd) {
		this.codCrd = codCrd;
	}

	public java.lang.Integer getNoDossProvisoire() {
		return noDossProvisoire;
	}

	public void setNoDossProvisoire(java.lang.Integer noDossProvisoire) {
		this.noDossProvisoire = noDossProvisoire;
	}

	public java.lang.Integer getNoDossDefinitif() {
		return noDossDefinitif;
	}

	public void setNoDossDefinitif(java.lang.Integer noDossDefinitif) {
		this.noDossDefinitif = noDossDefinitif;
	}

	public java.lang.String getCodDec() {
		return codDec;
	}

	public void setCodDec(java.lang.String codDec) {
		this.codDec = codDec;
	}

	public java.lang.String getNomDec() {
		return nomDec;
	}

	public void setNomDec(java.lang.String nomDec) {
		this.nomDec = nomDec;
	}

	public java.lang.String getModPay() {
		return modPay;
	}

	public void setModPay(java.lang.String modPay) {
		this.modPay = modPay;
	}

	public java.math.BigDecimal getSurPlusTax() {
		return surPlusTax;
	}

	public void setSurPlusTax(java.math.BigDecimal surPlusTax) {
		this.surPlusTax = surPlusTax;
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

	public java.sql.Timestamp getDateCh() {
		return dateCh;
	}

	public void setDateCh(java.sql.Timestamp dateCh) {
		this.dateCh = dateCh;
	}

	public java.lang.Integer getStatut() {
		return statut;
	}

	public void setStatut(java.lang.Integer statut) {
		this.statut = statut;
	}
	
	
}
