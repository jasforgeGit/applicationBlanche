package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.tresor.model.keys.RemboursementKey;




@Entity
@IdClass(RemboursementKey.class)
@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "cherchByCodecreditaire", query = "select object(o) from Remboursement o where  o.trCodeCreditaire = ?1"))
@Table(name="REMBOURSEMENT")
public class Remboursement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	
	@Id
	@Column(name="TRANNEEDECLARATION", length=4, nullable=false)
	 private java.lang.String trAnneeDeclaration;
	
	@Id
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	    private java.lang.String trBurDeclaration;
	
	@Id
	@Column(name="TRNUMDECLARATION", nullable=false)
	    private java.lang.Integer trNumDeclaration;
	
	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	    private java.lang.String trCodeCreditaire;
	
	@Column(name="TRMONTANTREMB", columnDefinition="DECIMAL(18,0)", nullable=false)
	    private java.math.BigDecimal trMontantRemb;
	
	@Column(name="TRDATEREMB",  nullable=false)
	    private java.sql.Date trDateRemb;
	
	@Column(name="TRUSERREMB", length=7, nullable=false)
	    private java.lang.String trUserRemb;
	
	@Column(name="TRINDREMB", length=1)
	    private java.lang.String trIndRemb;

	public Remboursement(String trAnneeDeclaration, String trBurDeclaration,
			Integer trNumDeclaration, String trCodeCreditaire,
			BigDecimal trMontantRemb, Date trDateRemb, String trUserRemb) {
		super();
		this.trAnneeDeclaration = trAnneeDeclaration;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trMontantRemb = trMontantRemb;
		this.trDateRemb = trDateRemb;
		this.trUserRemb = trUserRemb;
	}

	public Remboursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getTrAnneeDeclaration() {
		return trAnneeDeclaration;
	}

	public void setTrAnneeDeclaration(java.lang.String trAnneeDeclaration) {
		this.trAnneeDeclaration = trAnneeDeclaration;
	}

	public java.lang.String getTrBurDeclaration() {
		return trBurDeclaration;
	}

	public void setTrBurDeclaration(java.lang.String trBurDeclaration) {
		this.trBurDeclaration = trBurDeclaration;
	}

	public java.lang.Integer getTrNumDeclaration() {
		return trNumDeclaration;
	}

	public void setTrNumDeclaration(java.lang.Integer trNumDeclaration) {
		this.trNumDeclaration = trNumDeclaration;
	}

	public java.lang.String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}

	public void setTrCodeCreditaire(java.lang.String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}

	public java.math.BigDecimal getTrMontantRemb() {
		return trMontantRemb;
	}

	public void setTrMontantRemb(java.math.BigDecimal trMontantRemb) {
		this.trMontantRemb = trMontantRemb;
	}

	public java.sql.Date getTrDateRemb() {
		return trDateRemb;
	}

	public void setTrDateRemb(java.sql.Date trDateRemb) {
		this.trDateRemb = trDateRemb;
	}

	public java.lang.String getTrUserRemb() {
		return trUserRemb;
	}

	public void setTrUserRemb(java.lang.String trUserRemb) {
		this.trUserRemb = trUserRemb;
	}

	public java.lang.String getTrIndRemb() {
		return trIndRemb;
	}

	public void setTrIndRemb(java.lang.String trIndRemb) {
		this.trIndRemb = trIndRemb;
	}
	
	
	
	
}
