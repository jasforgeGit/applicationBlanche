package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.entities.JournalTresor;
import sn.com.douane.ejb.rc.model.entities.ModeReglement;
import sn.com.douane.ejb.tresor.model.keys.DosReglementProvKey;

@Entity
@IdClass(DosReglementProvKey.class)
@javax.persistence.NamedQueries({
		@javax.persistence.NamedQuery(name = "findByDossierProv", query = "select object(o) from DosReglementProv o where  o.trNumDosProv = ?1"),
		@javax.persistence.NamedQuery(name = "findByCodeCredit", query = "select object(o) from DosReglementProv o where  o.trCodeCreditaire = ?1") })
@Table(name = "DOSREGLEMENTPROV")
public class DosReglementProv implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;

	@Id
	@Column(name = "TRNUMDOSPROV", nullable = false)
	private java.lang.Integer trNumDosProv;

	@Id
	@Column(name = "TRMODEREGLEMENT", length = 2, nullable = false)
	private java.lang.String trModeReglement;

	@Column(name = "TRCODECREDITAIRE", length = 3, nullable = false)
	private java.lang.String trCodeCreditaire;

	@Column(name = "TRNUMQUITTANCE", length = 20)
	private java.lang.String trNumQuittance;

	@Column(name = "TRMONTANTPAIEMENT", columnDefinition = "DECIMAL(11,0)", nullable = false)
	private java.math.BigDecimal trMontantPaiement;

	@Column(name = "TRAVOIRPAIEMENT", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal trAvoirPaiement;

	@Column(name = "TRREJPAIEMENT", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal trRejPaiement;

	@Column(name = "TRRDGEN", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal trRdgen;

	@Column(name = "TRAVGEN", columnDefinition = "DECIMAL(11,0)")
	private java.math.BigDecimal trAvgen;

	@Column(name = "TRJOURNALTRESOR", length = 10)
	private java.lang.String trJournalTresor;

	@Column(name = "TRNUMFICHE", length = 10)
	private java.lang.String trNumFiche;

	@Column(name = "TRDATEDOSSIER", length = 10)
	private java.sql.Date trDateDossier;

	@ManyToOne(targetEntity = JournalTresor.class)
	@JoinColumn(name = "TRJOURNALTRESOR", referencedColumnName = "TRCODEJOURNAL", insertable = false, updatable = false)
	private JournalTresor jrnTreDosPaieProv;

	@Transient
	private String trLibModeReglement;

	public java.lang.Integer getTrNumDosProv() {
		return trNumDosProv;
	}

	public void setTrNumDosProv(java.lang.Integer trNumDosProv) {
		this.trNumDosProv = trNumDosProv;
	}

	public java.lang.String getTrModeReglement() {
		return trModeReglement;
	}

	public void setTrModeReglement(java.lang.String trModeReglement) {
		this.trModeReglement = trModeReglement;
	}

	public java.lang.String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}

	public void setTrCodeCreditaire(java.lang.String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}

	public java.lang.String getTrNumQuittance() {
		return trNumQuittance;
	}

	public void setTrNumQuittance(java.lang.String trNumQuittance) {
		this.trNumQuittance = trNumQuittance;
	}

	public java.math.BigDecimal getTrMontantPaiement() {
		return trMontantPaiement;
	}

	public void setTrMontantPaiement(java.math.BigDecimal trMontantPaiement) {
		this.trMontantPaiement = trMontantPaiement;
	}

	public java.math.BigDecimal getTrAvoirPaiement() {
		return trAvoirPaiement;
	}

	public void setTrAvoirPaiement(java.math.BigDecimal trAvoirPaiement) {
		this.trAvoirPaiement = trAvoirPaiement;
	}

	public java.math.BigDecimal getTrRejPaiement() {
		return trRejPaiement;
	}

	public void setTrRejPaiement(java.math.BigDecimal trRejPaiement) {
		this.trRejPaiement = trRejPaiement;
	}

	public java.math.BigDecimal getTrRdgen() {
		return trRdgen;
	}

	public void setTrRdgen(java.math.BigDecimal trRdgen) {
		this.trRdgen = trRdgen;
	}

	public java.math.BigDecimal getTrAvgen() {
		return trAvgen;
	}

	public void setTrAvgen(java.math.BigDecimal trAvgen) {
		this.trAvgen = trAvgen;
	}

	public java.lang.String getTrJournalTresor() {
		return trJournalTresor;
	}

	public void setTrJournalTresor(java.lang.String trJournalTresor) {
		this.trJournalTresor = trJournalTresor;
	}

	public java.lang.String getTrNumFiche() {
		return trNumFiche;
	}

	public void setTrNumFiche(java.lang.String trNumFiche) {
		this.trNumFiche = trNumFiche;
	}

	public java.sql.Date getTrDateDossier() {
		return trDateDossier;
	}

	public void setTrDateDossier(java.sql.Date trDateDossier) {
		this.trDateDossier = trDateDossier;
	}

	public JournalTresor getJrnTreDosPaieProv() {
		return jrnTreDosPaieProv;
	}

	public void setJrnTreDosPaieProv(JournalTresor jrnTreDosPaieProv) {
		this.jrnTreDosPaieProv = jrnTreDosPaieProv;
	}

	public DosReglementProv(Integer trNumDosProv, String trModeReglement,
			String trCodeCreditaire, BigDecimal trMontantPaiement) {
		super();
		this.trNumDosProv = trNumDosProv;
		this.trModeReglement = trModeReglement;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trMontantPaiement = trMontantPaiement;
	}

	public DosReglementProv() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the trLibModeReglement
	 */
	public String getTrLibModeReglement() {
		return trLibModeReglement;
	}

	/**
	 * @param trLibModeReglement
	 *            the trLibModeReglement to set
	 */
	public void setTrLibModeReglement(String trLibModeReglement) {
		this.trLibModeReglement = trLibModeReglement;
	}

}
