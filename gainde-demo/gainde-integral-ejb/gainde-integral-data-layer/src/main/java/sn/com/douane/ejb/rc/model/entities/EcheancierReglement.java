
package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;

/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(EcheancierReglementKey.class)
@Table(name="ECHEANCIERREGLEMENT")
@NamedQueries(
		@NamedQuery(name = "EcheancierReglement.findByNumDoss" , query = "select object(o) from EcheancierReglement o where  o.trNumDossierProv = ?1"))
public class EcheancierReglement implements Serializable{

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
    
	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	private String trCodeCreditaire;  
	   
	@Column(name="TRMONTANTCOMPTANT", columnDefinition="DECIMAL(11 , 0)", nullable=false)
	private BigDecimal trMontantComptant;
	
	@Column(name="TRMONTANTCREDIT", columnDefinition="DECIMAL(11 , 0)", nullable=false)
	private BigDecimal trMontantCredit;
    
	@Column(name="TRDATEBAE", nullable=false)
	private Date trDateBae;
    
	@Column(name="TRETAT", length=1, nullable=false)
	private String trEtat;
	
	@Column(name="TRTVACREDIT", columnDefinition="DECIMAL(11 , 0)", nullable=false)
	private BigDecimal trTvaCredit;
    
	@Column(name="TRDATEREGLEMENT")
	private Date trDateReglement; 
	
	@ManyToOne(targetEntity = EtatDossier.class)
	@JoinColumn(name="TRETAT", updatable=false, insertable=false)
	private EtatDossier etatDossier;
	
	@Transient
	private String trJournalTresor;
	
	@Transient
	private String trDateReglementPrevu;
	
	@Transient
	private BigDecimal trMontantReglement;
	
	@Transient
	private String nomCreditaire;

	/** Liste des taxes à appliquer. */
	@Transient
	private List listeTaxes =new ArrayList();
	
	/** Liste des modes reglement */
	@Transient
	private List listeModeReglement =new ArrayList();

	
	public EcheancierReglement() {	
	}

	
	public EcheancierReglement(String trAnneeDecl, String trBurDeclaration,
			Integer trNumDeclaration) {
		super();
		this.trAnneeDecl = trAnneeDecl;
		this.trBurDeclaration = trBurDeclaration;
		this.trNumDeclaration = trNumDeclaration; 
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


	public EtatDossier getEtatDossier() {
		return etatDossier;
	}


	public void setEtatDossier(EtatDossier etatDossier) {
		this.etatDossier = etatDossier;
	}


	public String getTrJournalTresor() {
		return trJournalTresor;
	}


	public void setTrJournalTresor(String trJournalTresor) {
		this.trJournalTresor = trJournalTresor;
	}


	/**
	 * @return the trDateReglementPrevu
	 */
	public String getTrDateReglementPrevu() {
		return trDateReglementPrevu;
	}


	/**
	 * @param trDateReglementPrevu the trDateReglementPrevu to set
	 */
	public void setTrDateReglementPrevu(String trDateReglementPrevu) {
		this.trDateReglementPrevu = trDateReglementPrevu;
	}


	/**
	 * @return the trMontantReglement
	 */
	public BigDecimal getTrMontantReglement() {
		return trMontantReglement;
	}


	/**
	 * @param trMontantReglement the trMontantReglement to set
	 */
	public void setTrMontantReglement(BigDecimal trMontantReglement) {
		this.trMontantReglement = trMontantReglement;
	}


	/**
	 * @return the listeTaxes
	 */
	public List getListeTaxes() {
		return listeTaxes;
	}


	/**
	 * @param listeTaxes the listeTaxes to set
	 */
	public void setListeTaxes(List listeTaxes) {
		this.listeTaxes = listeTaxes;
	}


	/**
	 * @return the listeModeReglement
	 */
	public List getListeModeReglement() {
		return listeModeReglement;
	}


	/**
	 * @param listeModeReglement the listeModeReglement to set
	 */
	public void setListeModeReglement(List listeModeReglement) {
		this.listeModeReglement = listeModeReglement;
	}
	

	public String getNomCreditaire() {
		return nomCreditaire;
	}


	public void setNomCreditaire(String nomCreditaire) {
		this.nomCreditaire = nomCreditaire;
	}


    
	
	
	
}
