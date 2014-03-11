package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import sn.com.douane.ejb.rc.model.entities.JournalTresor;
import sn.com.douane.ejb.tresor.model.keys.ReglementCreditKey;

@Entity
@IdClass(ReglementCreditKey.class)
@javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name = "findByNumeroDossier", query = "select object(o) from ReglementCredit o where  o.trNumDossierDef = ?1"), @javax.persistence.NamedQuery(name = "findByPeriode", query = "select object(o) from ReglementCredit o where  o.trDateReglement >= ?1 and  o.trDateReglement <= ?2"), @javax.persistence.NamedQuery(name = "findByCreditaireAndPeriode", query = "select object(o) from ReglementCredit o where o.trCodeCreditaire = ?1 and o.trDateReglement >= ?2 and  o.trDateReglement <= ?3"), @javax.persistence.NamedQuery(name = "findByEtat", query = "select object(o) from ReglementCredit o where  o.trEtat = ?1")})
@Table(name="REGLEMENTCREDIT")
public class ReglementCredit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	

	
	
	@Id
	@Column(name="TRANNEEDECL", length=4, nullable=false)
    private java.lang.String trAnneeDecl;
	
	@Id
	@Column(name="TRBURDECLARATION", length=3, nullable=false)
    private java.lang.String trBurDeclaration;
	
	@Id
	@Column(name="TRNUMDECLARATION", nullable=false)
    private java.lang.Integer trNumDeclaration;
	
	@Id
	@Column(name="TRNUMDOSSIERDEF", nullable=false)
    private java.lang.Integer trNumDossierDef;
	
	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	private java.lang.String trCodeCreditaire;
	
	@Column(name="TRNUMDOSSIERPROV", nullable=false)
    private java.lang.Integer trNumDossierProv;
	
	@Column(name="TRMONTANTCOMPTANT",columnDefinition="DECIMAL(11,0)", nullable=false)
    private java.math.BigDecimal trMontantComptant;
	
	@Column(name="TRMONTANTCREDIT", columnDefinition="DECIMAL(11,0)", nullable=false)
    private java.math.BigDecimal trMontantCredit;
	
	@Column(name="TRDATEBAE", nullable=false)
    private java.sql.Date trDateBae;
	
	@Column(name="TRETAT", length=1, nullable=false)
    private java.lang.String trEtat;
	
	@Column(name="TRTVACREDIT", columnDefinition="DECIMAL(11,0)")
    private java.math.BigDecimal trTvaCredit;
	
	@Column(name="TRDATEREGLEMENT", nullable=false)
    private java.sql.Date trDateReglement;
	
	@Column(name="TRJOURNALTRESOR", length=10, nullable=false)
    private java.lang.String trJournalTresor;
	
	
	
	@ManyToOne(targetEntity = JournalTresor.class)	
	  @JoinColumn(name="TRJOURNALTRESOR", referencedColumnName="TRCODEJOURNAL", insertable=false, updatable=false)
    private JournalTresor jnrTresRegCre;




	public ReglementCredit(String trAnneeDecl, String trBurDeclaration,
			Integer trNumDeclaration, Integer trNumDossierDef,
			String trCodeCreditaire, Integer trNumDossierProv,
			BigDecimal trMontantComptant, BigDecimal trMontantCredit,
			Date trDateBae, String trEtat, BigDecimal trTvaCredit,
			Date trDateReglement, String trJournalTresor) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration;
		this.trNumDossierDef = trNumDossierDef;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trNumDossierProv = trNumDossierProv;
		this.trMontantComptant = trMontantComptant;
		this.trMontantCredit = trMontantCredit;
		this.trDateBae = trDateBae;
		this.trEtat = trEtat;
		this.trTvaCredit = trTvaCredit;
		this.trDateReglement = trDateReglement;
		this.trJournalTresor = trJournalTresor;
	}




	public ReglementCredit() {
		super();
		// TODO Auto-generated constructor stub
	}




	public java.lang.String getTrAnneeDecl() {
		return trAnneeDecl;
	}




	public void setTrAnneeDecl(java.lang.String trAnneeDecl) {
		this.trAnneeDecl = trAnneeDecl;
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




	public java.lang.Integer getTrNumDossierDef() {
		return trNumDossierDef;
	}




	public void setTrNumDossierDef(java.lang.Integer trNumDossierDef) {
		this.trNumDossierDef = trNumDossierDef;
	}




	public java.lang.String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}




	public void setTrCodeCreditaire(java.lang.String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}




	public java.lang.Integer getTrNumDossierProv() {
		return trNumDossierProv;
	}




	public void setTrNumDossierProv(java.lang.Integer trNumDossierProv) {
		this.trNumDossierProv = trNumDossierProv;
	}




	public java.math.BigDecimal getTrMontantComptant() {
		return trMontantComptant;
	}




	public void setTrMontantComptant(java.math.BigDecimal trMontantComptant) {
		this.trMontantComptant = trMontantComptant;
	}




	public java.math.BigDecimal getTrMontantCredit() {
		return trMontantCredit;
	}




	public void setTrMontantCredit(java.math.BigDecimal trMontantCredit) {
		this.trMontantCredit = trMontantCredit;
	}




	public java.sql.Date getTrDateBae() {
		return trDateBae;
	}




	public void setTrDateBae(java.sql.Date trDateBae) {
		this.trDateBae = trDateBae;
	}




	public java.lang.String getTrEtat() {
		return trEtat;
	}




	public void setTrEtat(java.lang.String trEtat) {
		this.trEtat = trEtat;
	}




	public java.math.BigDecimal getTrTvaCredit() {
		return trTvaCredit;
	}




	public void setTrTvaCredit(java.math.BigDecimal trTvaCredit) {
		this.trTvaCredit = trTvaCredit;
	}




	public java.sql.Date getTrDateReglement() {
		return trDateReglement;
	}




	public void setTrDateReglement(java.sql.Date trDateReglement) {
		this.trDateReglement = trDateReglement;
	}




	public java.lang.String getTrJournalTresor() {
		return trJournalTresor;
	}




	public void setTrJournalTresor(java.lang.String trJournalTresor) {
		this.trJournalTresor = trJournalTresor;
	}




	public JournalTresor getJnrTresRegCre() {
		return jnrTresRegCre;
	}




	public void setJnrTresRegCre(JournalTresor jnrTresRegCre) {
		this.jnrTresRegCre = jnrTresRegCre;
	}




	
	
	
	

}
