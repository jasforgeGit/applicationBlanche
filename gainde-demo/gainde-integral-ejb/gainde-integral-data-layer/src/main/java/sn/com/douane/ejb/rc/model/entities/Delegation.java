package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

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

import sn.com.douane.ejb.rc.model.keys.DelegationKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="DELEGATIONS")
@IdClass(DelegationKey.class)
@NamedQueries({
	@NamedQuery(name = "findfctdelegue", 
			query = "select object(o) from Delegation o where  o.dateDebut <= ?1 and (o.dateFin >=?1 or o.dateFin is null) and  o.agentDestinataire = ?2"), 
	@NamedQuery(name = "finddelegue", 
			query = "select DISTINCT object(o)  from Delegation o where o.dateDebut <= ?1 and (o.dateFin >= ?1 or o.dateFin is null)"),
			@NamedQuery(name = "supfctdelegant", 
			query = "select object(o) from Delegation o where  o.dateDebut <= ?1 and (o.dateFin >=?1 or o.dateFin is null) and  o.agentEmetteur = ?2")})
public class Delegation implements Serializable{

	private static final long serialVersionUID = -6018257989147150052L;
	
	@Id
	@Column(name="AGENTDESTINATAIRE", length=7, nullable=false)
	private String agentDestinataire;

	@Id 
	@Column(name="AGENTEMETTEUR", length=7, nullable=false)
	private String agentEmetteur;
	
	@Id 
	@Column(name="CODEGROUPE")
	private Integer codeGroupe;
	
	@Id
	@Column(name="CODEFONCTION", length=15, nullable=false)
	private String codeFonction;
	
	@Id
	@Column(name="DATEDEBUT", nullable=false)
	private Date dateDebut;

	@Column(name="DATEFIN")
	private Date dateFin;

	@Column(name="SENSDELEGATION", length=1)
	private String sensDelegation;

	@ManyToOne(targetEntity = Utilisateur.class)
	@JoinColumn(name="AGENTDESTINATAIRE", insertable=false, updatable=false)
	private Utilisateur destDelegation;

	@ManyToOne(targetEntity = Utilisateur.class)
	@JoinColumn(name="AGENTEMETTEUR", insertable=false, updatable=false)
	private Utilisateur emetDelegation;

	@ManyToOne(targetEntity = Fonctionnalite.class)
	@JoinColumn(name="CODEFONCTION",  insertable=false, updatable=false)
	private Fonctionnalite foncDelegation;

	@ManyToOne(targetEntity = GroupeFonction.class)
	@JoinColumn(name="CODEGROUPE", insertable=false, updatable=false)
	private GroupeFonction grpFctDelegation;
	
    @Transient
	private String codeProfil;
	

	/**
	 * 0-args constructor
	 */
	public Delegation() {
	}
	
	/**
	 * 5-args constructor
	 * @param dateDebut
	 * @param codeFonction
	 * @param codeGroupe
	 * @param agentEmetteur
	 * @param agentDestinataire
	 */
	public Delegation(
			Date dateDebut,
			String codeFonction,
			Integer codeGroupe,
			String agentEmetteur,
			String agentDestinataire) {
		super(); 
		this.dateDebut = dateDebut; 
		this.codeFonction = codeFonction; 
		this.codeGroupe = codeGroupe; 
		this.agentEmetteur= agentEmetteur; 
		this.agentDestinataire = agentDestinataire; 
	}

	/**
	 * Get accessor for persistent attribute: agentDestinataire
	 * @return agentDestinataire
	 */
	public String getAgentDestinataire() {
		return agentDestinataire;
	}

	/**
	 * Set accessor for persistent attribute
	 * @param agentDestinataire
	 */
	public void setAgentDestinataire(String agentDestinataire) {
		this.agentDestinataire = agentDestinataire;
	}

	/**
	 * Get accessor for persistent attribute: agentEmetteur
	 * @return agentEmetteur
	 */
	public String getAgentEmetteur() {
		return agentEmetteur;
	}

	/**
	 * Set accessor for persistent attribute agentEmetteur
	 * @param agentEmetteur
	 */
	public void setAgentEmetteur(String agentEmetteur) {
		this.agentEmetteur = agentEmetteur;
	}
	
	/**
	 * Get accessor for persistent attribute: dateDebut
	 * @return dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Set accessor for persistent attribute: dateDebut
	 * @param dateDebut
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Get accessor for persistent attribute: dateFin
	 * @return dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Set accessor for persistent attribute: dateFin
	 * @param dateFin
	 */
	public void setDatefin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Get accessor for persistent attribute: sensDelegation
	 * @return
	 */
	public String getSensDelegation() {
		return sensDelegation;
	}

	/**
	 * Set accessor for persistent attribute: sensDelegation
	 * @param sensDelegation
	 */
	public void setSensDelegation(String sensDelegation) {
		this.sensDelegation = sensDelegation;
	}

	/**
	 * Get accessor for persistent attribute: codeFonction
	 * @return codeFonction
	 */
	public String getCodeFonction() {
		return codeFonction;
	}

	/**
	 * Set accessor for persistent attribute: codeFonction
	 * @param codeFonction
	 */
	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}

	/**
	 * Get accessor for persistent attribute: codeGroupe
	 * @return codeGroupe
	 */
	public Integer getCodeGroupe() {
		return codeGroupe;
	}

	/**
	 * Set accessor for persistent attribute: codeGroupe
	 * @param codeGroupe
	 */
	public void setCodeGroupe(Integer codeGroupe) {
		this.codeGroupe =codeGroupe;
	}

	/**
	 * This method was generated for supporting the relationship role named foncDelegation
	 * @return foncDelegation
	 */
	public Fonctionnalite getFoncDelegation() {
		return foncDelegation;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param foncDelegation
	 */
	public void setFoncDelegation(Fonctionnalite foncDelegation) {
		this.foncDelegation = foncDelegation;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @return grpFctDelegation
	 */
	public GroupeFonction getGrpfctDelegation() {
		return grpFctDelegation;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param grpFctDelegation
	 */
	public void setGrpfctDelegation(GroupeFonction grpFctDelegation) {
		this.grpFctDelegation = grpFctDelegation;
	}


	/**
	 * This method was generated for supporting the relationship role named
	 * @return destDelegation
	 */
	public Utilisateur getDestDelegation() {
		return destDelegation;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param destDelegation
	 */
	public void setDestdelegation(Utilisateur destDelegation) {
		this.destDelegation = destDelegation;
	}


	/**
	 * This method was generated for supporting the relationship role named
	 * @return emetDelegation
	 */
	public Utilisateur getEmetDelegation() {
		return emetDelegation;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param emetDelegation
	 */
	public void setEmetDelegation(Utilisateur emetDelegation) {
		this.emetDelegation = emetDelegation;
	}

	/**
	 * @return the codeProfil
	 */
	public String getCodeProfil() {
		return codeProfil;
	}

	/**
	 * @param codeProfil the codeProfil to set
	 */
	public void setCodeProfil(String codeProfil) {
		this.codeProfil = codeProfil;
	}

}
