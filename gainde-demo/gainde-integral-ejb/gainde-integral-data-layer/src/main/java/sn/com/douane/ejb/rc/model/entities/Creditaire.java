package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.Sommiers;
import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.tresor.model.entities.LigneAvoir;
import sn.com.douane.ejb.tresor.model.entities.Decision;

@Entity
@Table(name="CREDITAIRES")
public class Creditaire implements Serializable{

	private static final long serialVersionUID = 4065295304622900189L;

	@Id
	@Column(name="RCCODECREDITAIRE", length=3, nullable=false)
	private String rcCodeCreditaire;
	 
	@Column(name="RCCODEPPM", length=5)
	private String rcCodePpm;
	
	@Column(name="RCTYPECREDITAIRE", length=1)
	private String rcTypeCreditaire; 
	
	@Column(name="RCMONTANTMINI",  columnDefinition="DECIMAL(13, 2)")
	private BigDecimal rcMontantMini;
	 
	@Column(name="RCMONTANTRESIDUEL", columnDefinition="DECIMAL(11,0)")
	private BigDecimal rcMontantResiduel;
	 
	@Column(name="RCDATECREDIT")
	private Date rcDateCredit;
	 
	@Column(name="RCNUMSUSPENSION", length=15)
	private String rcNumSuspension;
	 
	@Column(name="RCDATESUSPENSION")
	private Date rcDateSuspension;
	 
	@Column(name="RCNUMERORETRAIT", length=15)
	private String rcNumeroRetrait;
	 
	@Column(name="RCDATERETRAIT")
	private Date rcDateRetrait;
	 
	@Column(name="RCCODESUSPENSION", length=1)
	private String rcCodeSuspension;
	 
	@Column(name="RCDATEEXTENSION")
	private Date rcDateExtension;
	 
	@Column(name="RCETATCREDIT", length=1)
	private String rcEtatCredit;
	 
	@Column(name="RCNUMERODOSSIER", length=50)
	private String rcNumeroDossier;
	 
	@Column(name="RCMONTANTAVOIR",  columnDefinition="DECIMAL(19, 4)")
	private BigDecimal rcMontantAvoir;
	 
	@Column(name="RCBONAVOIR", columnDefinition="DECIMAL(19, 4)")
	private BigDecimal rcBonAvoir;
	
	@Column(name="RCTYPEDECISION", length=1)
	private String rcTypeDecision;
	
	@Column(name="RCNUMDECISION", length=50)
	private String rcNumDecision;
	
	@Column(name="RCDATEDECISION")
	private Date rcDateDecision;

	@Column(name = "IDCOMPTE")
	private Long idcompte;		
	
	@ManyToOne
	@JoinColumn(name = "IDCOMPTE",referencedColumnName="IDCOMPTE", insertable = false, updatable = false)
	private Compte compte;	
	
	@ManyToOne
	@JoinColumn(name="RCTYPECREDITAIRE", insertable=false, updatable=false)
	private TypeCredit TypeCreditaire;
	
	@OneToMany(mappedBy = "credSoum", targetEntity = SoumissionCreditaire.class)
	private List<SoumissionCreditaire> soumissioncreditaire;

	
	@OneToMany(mappedBy = "creditaire", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonSegGenDec;
	
	@OneToMany(mappedBy = "creditaire", targetEntity = Sommiers.class)
	private List<Sommiers> listCreditaire;
	
	@Transient
	private String nomPrenomPpm;
	
	@Transient
	private List<LigneAvoir> listeAvoir=new ArrayList<LigneAvoir>();

	@Transient
	private String libTypeDecision;
	
	@Transient
	private List<Decision> listDecision = new ArrayList<Decision>(); 
	
	@Transient
	private List<AutoCreditaire> listAutorisation=new ArrayList<AutoCreditaire>();

	/**
	 * 0-args constructeur
	 */
	public Creditaire() {
		
	}
	
	/**
	 * 1-args constructeur
	 * @param codeCreditaire
	 */
	public Creditaire(String rcCodeCreditaire) {
		super();
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	public String getRcCodeCreditaire() {
		return rcCodeCreditaire;
	}

	public void setRcCodeCreditaire(String rcCodeCreditaire) {
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public BigDecimal getRcMontantMini() {
		return rcMontantMini;
	}

	public void setRcMontantMini(BigDecimal rcMontantMini) {
		this.rcMontantMini = rcMontantMini;
	}

	public BigDecimal getRcMontantResiduel() {
		return rcMontantResiduel;
	}

	public void setRcMontantResiduel(BigDecimal rcMontantResiduel) {
		this.rcMontantResiduel = rcMontantResiduel;
	}

	public Date getRcDateCredit() {
		return rcDateCredit;
	}

	public void setRcDateCredit(Date rcDateCredit) {
		this.rcDateCredit = rcDateCredit;
	}

	public String getRcNumSuspension() {
		return rcNumSuspension;
	}

	public void setRcNumSuspension(String rcNumSuspension) {
		this.rcNumSuspension = rcNumSuspension;
	}

	public Date getRcDateSuspension() {
		return rcDateSuspension;
	}

	public void setRcDateSuspension(Date rcDateSuspension) {
		this.rcDateSuspension = rcDateSuspension;
	}

	public String getRcNumeroRetrait() {
		return rcNumeroRetrait;
	}

	public void setRcNumeroRetrait(String rcNumeroRetrait) {
		this.rcNumeroRetrait = rcNumeroRetrait;
	}

	public Date getRcDateRetrait() {
		return rcDateRetrait;
	}

	public void setRcDateRetrait(Date rcDateRetrait) {
		this.rcDateRetrait = rcDateRetrait;
	}

	public String getRcCodeSuspension() {
		return rcCodeSuspension;
	}

	public void setRcCodeSuspension(String rcCodeSuspension) {
		this.rcCodeSuspension = rcCodeSuspension;
	}

	public Date getRcDateExtension() {
		return rcDateExtension;
	}

	public void setRcDateExtension(Date rcDateExtension) {
		this.rcDateExtension = rcDateExtension;
	}

	public String getRcEtatCredit() {
		return rcEtatCredit;
	}

	public void setRcEtatCredit(String rcEtatCredit) {
		this.rcEtatCredit = rcEtatCredit;
	}

	public String getRcNumeroDossier() {
		return rcNumeroDossier;
	}

	public void setRcNumeroDossier(String rcNumeroDossier) {
		this.rcNumeroDossier = rcNumeroDossier;
	}

	public BigDecimal getRcMontantAvoir() {
		return rcMontantAvoir;
	}

	public void setRcMontantAvoir(BigDecimal rcMontantAvoir) {
		this.rcMontantAvoir = rcMontantAvoir;
	}

	public BigDecimal getRcBonAvoir() {
		return rcBonAvoir;
	}

	public void setRcBonAvoir(BigDecimal rcBonAvoir) {
		this.rcBonAvoir = rcBonAvoir;
	}

	public List<SoumissionCreditaire> getSoumissioncreditaire() {
		return soumissioncreditaire;
	}

	public void setSoumissioncreditaire(List<SoumissionCreditaire> soumissioncreditaire) {
		this.soumissioncreditaire = soumissioncreditaire;
	}

	/**
	 * @return the typeCreditaire
	 */
	public TypeCredit getTypeCreditaire() {
		return TypeCreditaire;
	}

	/**
	 * @param typeCreditaire the typeCreditaire to set
	 */
	public void setTypeCreditaire(TypeCredit typeCreditaire) {
		TypeCreditaire = typeCreditaire;
	}

	/**
	 * @return the rcTypeCreditaire
	 */
	public String getRcTypeCreditaire() {
		return rcTypeCreditaire;
	}

	/**
	 * @param rcTypeCreditaire the rcTypeCreditaire to set
	 */
	public void setRcTypeCreditaire(String rcTypeCreditaire) {
		this.rcTypeCreditaire = rcTypeCreditaire;
	}

	/**
	 * @return the rcTypeDecision
	 */
	public String getRcTypeDecision() {
		return rcTypeDecision;
	}

	/**
	 * @param rcTypeDecision the rcTypeDecision to set
	 */
	public void setRcTypeDecision(String rcTypeDecision) {
		this.rcTypeDecision = rcTypeDecision;
	}

	/**
	 * @return the rcNumDecision
	 */
	public String getRcNumDecision() {
		return rcNumDecision;
	}

	/**
	 * @param rcNumDecision the rcNumDecision to set
	 */
	public void setRcNumDecision(String rcNumDecision) {
		this.rcNumDecision = rcNumDecision;
	}

	/**
	 * @return the rcDateDecision
	 */
	public Date getRcDateDecision() {
		return rcDateDecision;
	}

	/**
	 * @param rcDateDecision the rcDateDecision to set
	 */
	public void setRcDateDecision(Date rcDateDecision) {
		this.rcDateDecision = rcDateDecision;
	}

	public List<BrouillonSegGenDec> getListBrouillonSegGenDec() {
		return listBrouillonSegGenDec;
	}

	public void setListBrouillonSegGenDec(List<BrouillonSegGenDec> listBrouillonSegGenDec) {
		this.listBrouillonSegGenDec = listBrouillonSegGenDec;
	}

	public List<Sommiers> getListCreditaire() {
		return listCreditaire;
	}

	public void setListCreditaire(List<Sommiers> listCreditaire) {
		this.listCreditaire = listCreditaire;
	}

	public String getNomPrenomPpm() {
		return nomPrenomPpm;
	}

	public void setNomPrenomPpm(String nomPrenomPpm) {
		this.nomPrenomPpm = nomPrenomPpm;
	}

	/**
	 * @return the listeAvoir
	 */
	public List<LigneAvoir> getListeAvoir() {
		return listeAvoir;
	}

	/**
	 * @param listeAvoir the listeAvoir to set
	 */
	public void setListeAvoir(List<LigneAvoir> listeAvoir) {
		this.listeAvoir = listeAvoir;
	}

	public String getLibTypeDecision() {
		return libTypeDecision;
	}

	public void setLibTypeDecision(String libTypeDecision) {
		this.libTypeDecision = libTypeDecision;
	}

	public List<Decision> getListDecision() {
		return listDecision;
	}

	public void setListDecision(List<Decision> listDecision) {
		this.listDecision = listDecision;
	}

	public List<AutoCreditaire> getListAutorisation() {
		return listAutorisation;
	}

	public void setListAutorisation(List<AutoCreditaire> listAutorisation) {
		this.listAutorisation = listAutorisation;
	}

	public Long getIdcompte() {
		return idcompte;
	}

	public void setIdcompte(Long idcompte) {
		this.idcompte = idcompte;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
	 
}
