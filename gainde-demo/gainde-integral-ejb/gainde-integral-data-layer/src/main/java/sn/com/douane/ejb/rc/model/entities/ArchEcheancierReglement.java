package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.ArchEcheancierReglementKey;


@Entity
@IdClass(ArchEcheancierReglementKey.class)
@Table(name="ARCHECHEANCIERREGLEMENT")

public class ArchEcheancierReglement implements Serializable{

	private static final long serialVersionUID = -6656176547497658345L;

	@Id
	@Column(name="TRANNEEDECL", length=4, nullable=false)
	private String trAnneeDecl;
    
	@Id
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
	private String trBurDeclaration;
    
	@Id
	@Column(name="TRNUMDECLARATION", nullable=false)
	private Integer trNumDeclaration;
   
	@Column(name="TRNUMDOSSIERPROV")
	private Integer trNumDossierProv;
    
	@Id
	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	private String trCodeCreditaire;  
	   
	@Column(name="TRMONTANTCOMPTANT", columnDefinition="DECIMAL(11 , 0)")
	private BigDecimal trMontantComptant;
	
	@Column(name="TRMONTANTCREDIT", columnDefinition="DECIMAL(11 , 0)")
	private BigDecimal trMontantCredit;
    
	@Column(name="TRDATEBAE")
	private Date trDateBae;
    
	@Column(name="TRETAT", length=1)
	private String trEtat;
	
	@Column(name="TRTVACREDIT", columnDefinition="DECIMAL(11 , 0)")
	private BigDecimal trTvaCredit;
    
	@Column(name="TRDATEREGLEMENT")
	private Date trDateReglement; 
	
	@Id
	@Column(name="TRDATEARCH", nullable=false)
	private Timestamp trDateArch;		

	
	
	public ArchEcheancierReglement() {	
	}
	

	public ArchEcheancierReglement(String trAnneeDecl, String trBurDeclaration,
			Integer trNumDeclaration, String trCodeCreditaire,
			Timestamp trDateArch) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trDateArch = trDateArch;
	}

	public String getTrAnneeDecl() {
		return trAnneeDecl;
	}

	public void setTrAnneeDecl(String trAnneeDecl) {
		this.trAnneeDecl = trAnneeDecl;
	}

	public String getTrBurDeclaration() {
		return trBurDeclaration;
	}

	public void setTrBurDeclaration(String trBurDeclaration) {
		this.trBurDeclaration = trBurDeclaration;
	}

	public Integer getTrNumDeclaration() {
		return trNumDeclaration;
	}

	public void setTrNumDeclaration(Integer trNumDeclaration) {
		this.trNumDeclaration = trNumDeclaration;
	}

	public Integer getTrNumDossierProv() {
		return trNumDossierProv;
	}

	public void setTrNumDossierProv(Integer trNumDossierProv) {
		this.trNumDossierProv = trNumDossierProv;
	}

	public String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}

	public void setTrCodeCreditaire(String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}

	public BigDecimal getTrMontantComptant() {
		return trMontantComptant;
	}

	public void setTrMontantComptant(BigDecimal trMontantComptant) {
		this.trMontantComptant = trMontantComptant;
	}

	public BigDecimal getTrMontantCredit() {
		return trMontantCredit;
	}

	public void setTrMontantCredit(BigDecimal trMontantCredit) {
		this.trMontantCredit = trMontantCredit;
	}

	public Date getTrDateBae() {
		return trDateBae;
	}

	public void setTrDateBae(Date trDateBae) {
		this.trDateBae = trDateBae;
	}

	public String getTrEtat() {
		return trEtat;
	}

	public void setTrEtat(String trEtat) {
		this.trEtat = trEtat;
	}

	public BigDecimal getTrTvaCredit() {
		return trTvaCredit;
	}

	public void setTrTvaCredit(BigDecimal trTvaCredit) {
		this.trTvaCredit = trTvaCredit;
	}

	public Date getTrDateReglement() {
		return trDateReglement;
	}

	public void setTrDateReglement(Date trDateReglement) {
		this.trDateReglement = trDateReglement;
	}	

	public Timestamp getTrDateArch() {
		return trDateArch;
	}


	public void setTrDateArch(Timestamp trDateArch) {
		this.trDateArch = trDateArch;
	}
		
	
}