package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "UTILISATEUR")
@NamedQueries(@NamedQuery(name = "findAllUser", query = "select object(o) from Utilisateur o"))
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 3493665878291238246L;

	@Id
	@Column(name = "RCCODUSER", length = 7, nullable = false)
	private String rcCodUser;

	@Column(name = "RCIDENTIFICATION", length = 255, nullable = false)
	private String rcIdentification;

	@Column(name = "RCCODEPROFIL", length = 10, nullable = false)
	private String rcCodeProfil;

	@Column(name = "RCMOTPASSE", length = 100, nullable = false)
	private String rcMotPasse;

	@Column(name = "RCTYPEUSER", length = 1, nullable = false)
	private String rcTypeUser;

	@Column(name = "RCETATACTIF", length = 1)
	private String rcEtatActif;

	@Column(name = "RCINDCONNECT", length = 1)
	private String rcIndconnect;

	@Column(name = "RCISADMIN", length = 1)
	private String rcIsAdmin;

	@Column(name = "MODULE1", length = 20)
	private String module1;

	@Column(name = "NOMXML", length = 20)
	private String nomXml;

	@Column(name = "RCEMAIL", length = 50)
	private String rcEmail;

	@Column(name = "RCINDENR", length = 1)
	private String rcIndEnr;

	@Column(name = "RCINDPREREG", length = 1)
	private String rcIndprereg;
	
	@Column(name = "RCETATMESSAGE", columnDefinition="CHAR(1)")
	private String rcEtatMessage;

	@ManyToOne(targetEntity = Profil.class)
	@JoinColumn(name = "RCCODEPROFIL", insertable = false, updatable = false)
	private Profil profilUser;

	@ManyToOne(targetEntity = TypeUtilisateur.class)
	@JoinColumn(name = "RCTYPEUSER", insertable = false, updatable = false)
	private TypeUtilisateur typeUser;

	@OneToMany(mappedBy = "destDelegation", targetEntity = Delegation.class)
	private Set<Delegation> delegations;

	@OneToMany(mappedBy = "emetDelegation", targetEntity = Delegation.class)
	private Set<Delegation> delegations1;

	@Transient
	private String codeppm;

	@Transient
	private String xml;

	@Transient
	private String codecreditaire;

	@Transient
	private String codeagree;

	/**
	 * 0-args constructor
	 */
	public Utilisateur() {

	}

	/**
	 * 3-args constructor
	 * 
	 * @param rcCodUser
	 * @param rcIdentification
	 * @param rcMotPasse
	 */
	public Utilisateur(String rcCodUser, String rcIdentification,
			String rcMotPasse) {
		super();
		this.rcCodUser = rcCodUser;
		this.rcIdentification = rcIdentification;
		this.rcMotPasse = rcMotPasse;
	}

	/**
	 * Get accessor for persistent attribute: rcCodUser
	 * 
	 * @return rcCodUser
	 */
	public String getRcCodUser() {
		return rcCodUser;
	}

	/**
	 * Set accessor for persistent attribute: rcCodUser
	 * 
	 * @param rcCodUser
	 */
	public void setRcCodUser(String rcCodUser) {
		this.rcCodUser = rcCodUser;
	}

	public String getCodeppm() {
		return codeppm;
	}

	public void setCodeppm(String codeppm) {
		this.codeppm = codeppm;
	}

	public String getCodecreditaire() {
		return codecreditaire;
	}

	public void setCodecreditaire(String codecreditaire) {
		this.codecreditaire = codecreditaire;
	}

	public String getCodeagree() {
		return codeagree;
	}

	public void setCodeagree(String codeagree) {
		this.codeagree = codeagree;
	}

	/**
	 * Get accessor for persistent attribute: rcMotPasse
	 * 
	 * @return rcMotPasse
	 */
	public String getRcMotPasse() {
		return rcMotPasse;
	}

	/**
	 * Set accessor for persistent attribute: rcMotPasse
	 * 
	 * @param rcMotPasse
	 */
	public void setRcMotPasse(String rcMotPasse) {
		this.rcMotPasse = rcMotPasse;
	}

	/**
	 * Get accessor for persistent attribute: module1
	 * 
	 * @return module1
	 */
	public String getModule1() {
		return module1;
	}

	/**
	 * Set accessor for persistent attribute: module1
	 * 
	 * @param module1
	 */
	public void setModule1(String module1) {
		this.module1 = module1;
	}

	/**
	 * Get accessor for persistent attribute: rcIdentification
	 * 
	 * @return rcIdentification
	 */
	public String getRcIdentification() {
		return rcIdentification;
	}

	/**
	 * Set accessor for persistent attribute: rcIdentification
	 * 
	 * @param rcIdentification
	 */
	public void setRcIdentification(String rcIdentification) {
		this.rcIdentification = rcIdentification;
	}

	/**
	 * Get accessor for persistent attribute: rcIndconnect
	 * 
	 * @return rcIndConnect
	 */
	public String getRcIndconnect() {
		return rcIndconnect;
	}

	/**
	 * Set accessor for persistent attribute: rcIndconnect
	 * 
	 * @param rcIndconnect
	 */
	public void setRcIndconnect(String rcIndconnect) {
		this.rcIndconnect = rcIndconnect;
	}

	/**
	 * Get accessor for persistent attribute: rcIsAdmin
	 * 
	 * @return rcIsAdmin
	 */
	public String getRcIsAdmin() {
		return rcIsAdmin;
	}

	/**
	 * Set accessor for persistent attribute: rcIsAdmin
	 * 
	 * @param rcIsAdmin
	 */
	public void setRcisadmin(String rcIsAdmin) {
		this.rcIsAdmin = rcIsAdmin;
	}

	/**
	 * Get accessor for persistent attribute: nomXml
	 * 
	 * @return
	 */
	public String getNomXml() {
		return nomXml;
	}

	/**
	 * Set accessor for persistent attribute: nomXml
	 * 
	 * @param nomXml
	 */
	public void setNomxml(String nomXml) {
		this.nomXml = nomXml;
	}

	/**
	 * Get accessor for persistent attribute: rcEtatActif
	 * 
	 * @return rcEtatActif
	 */
	public String getRcEtatActif() {
		return rcEtatActif;
	}

	/**
	 * Set accessor for persistent attribute: rcEtatActif
	 * 
	 * @param rcEtatActif
	 */
	public void setRcEtatActif(String rcEtatActif) {
		this.rcEtatActif = rcEtatActif;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * profilUser.
	 * 
	 * @return profilUser
	 */
	public Profil getProfilUser() {
		return profilUser;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * profilUser.
	 * 
	 * @param profilUser
	 */
	public void setProfilUser(Profil profilUser) {
		this.profilUser = profilUser;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * typeUser.
	 * 
	 * @return typeUser
	 */
	public TypeUtilisateur gettypeUser() {
		return typeUser;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * typeUser.
	 * 
	 * @param typeUser
	 */
	public void setTypeUser(TypeUtilisateur typeUser) {
		this.typeUser = typeUser;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * delegations.
	 * 
	 * @return delegations
	 */
	// @JSON(serialize = false)
	public Set<Delegation> getDelegations() {
		return delegations;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * delegations.
	 * 
	 * @param delegations
	 */
	public void setDelegations(Set<Delegation> delegations) {
		this.delegations = delegations;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * delegations1.
	 * 
	 * @return delegations1
	 */
	// @JSON(serialize = false)
	public Set<Delegation> getDelegations1() {
		return delegations1;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * delegations1.
	 * 
	 * @param delegations1
	 */
	public void setDelegations1(Set<Delegation> delegations1) {
		this.delegations1 = delegations1;
	}

	/**
	 * Get accessor for persistent attribute: rcEmail
	 * 
	 * @return rcEmail
	 */
	public String getRcEmail() {
		return rcEmail;
	}

	/**
	 * Set accessor for persistent attribute: rcEmail
	 * 
	 * @param rcEmail
	 */
	public void setRcemail(String rcEmail) {
		this.rcEmail = rcEmail;
	}

	/**
	 * Get accessor for persistent attribute: rcIndEnr
	 * 
	 * @return rcIndEnr
	 */
	public String getRcIndEnr() {
		return rcIndEnr;
	}

	/**
	 * Set accessor for persistent attribute: rcIndEnr
	 * 
	 * @param rcIndEnr
	 */
	public void setRcindEnr(String rcIndEnr) {
		this.rcIndEnr = rcIndEnr;
	}

	/**
	 * Get accessor for persistent attribute: rcIndprereg
	 * 
	 * @return rcIndprereg
	 */
	public String getRcIndprereg() {
		return rcIndprereg;
	}

	/**
	 * Set accessor for persistent attribute: rcIndprereg
	 * 
	 * @param rcIndprereg
	 */
	public void setRcindprereg(String rcIndprereg) {
		this.rcIndprereg = rcIndprereg;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	/**
	 * @return the rcCodeProfil
	 */
	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	/**
	 * @param rcCodeProfil
	 *            the rcCodeProfil to set
	 */
	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}

	/**
	 * @return the rcTypeUser
	 */
	public String getRcTypeUser() {
		return rcTypeUser;
	}

	/**
	 * @param rcTypeUser
	 *            the rcTypeUser to set
	 */
	public void setRcTypeUser(String rcTypeUser) {
		this.rcTypeUser = rcTypeUser;
	}

	public String getRcEtatMessage() {
		return rcEtatMessage;
	}

	public void setRcEtatMessage(String rcEtatMessage) {
		this.rcEtatMessage = rcEtatMessage;
	}

}
