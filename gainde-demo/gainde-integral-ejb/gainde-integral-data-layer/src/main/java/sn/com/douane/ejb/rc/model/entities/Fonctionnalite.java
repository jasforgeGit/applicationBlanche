package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="FONCTIONNALITES")
public class Fonctionnalite implements Serializable {

	private static final long serialVersionUID = 3524152086600258083L;

	@Id
	@Column(name="RCCODEFONCTION", length=15, nullable=false)
	private String rcCodeFonction;

	@Column(name="RCLIBFONCTION", length=100, nullable=false)
	private String rcLibFonction;

	@Column(name="RCDESCRIPTION", length=255)
	private String rcDescription;

	@Column(name="RCURLFONCTION", length=255)
	private String rcUrlFonction;

	@Column(name="RCCODEPROFIL", length=10)
	private String rcCodeProfil;

	@OneToMany(mappedBy = "numeroFonctions", targetEntity = Numerotation.class) 
	private List<Numerotation> numerotations;

	@OneToMany(mappedBy = "foncRegpFonc", targetEntity = RegroupFonctions.class)
	private List<RegroupFonctions> regroupFonctions;

	@OneToMany(mappedBy = "foncDelegation", targetEntity = Delegation.class)
	private List<Delegation> delegations;

	@ManyToOne(targetEntity = Profil.class)
	@JoinColumn(name="RCCODEPROFIL", insertable=false, updatable=false)
	private Profil profilFonct;

	/**
	 * 0-args constructor 
	 */
	public Fonctionnalite() {
	}

	/**
	 * 2-args constructor
	 * @param rccodefonction
	 * @param rclibfonction
	 */
	public Fonctionnalite(String rcCodeFonction, String rcLibFonction) {
		super(); 
		this.rcCodeFonction = rcCodeFonction; 
		this.rcLibFonction = rcLibFonction; 
	}

	/**
	 * Get accessor for persistent attribute: rcCodeFonction
	 * @return rcCodeFonction
	 */
	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeFonction
	 * @param rcCodeFonction
	 */
	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	/**
	 * Get accessor for persistent attribute: rcLibFonction
	 * @return rcLibFonction
	 */
	public String getRcLibFonction() {
		return rcLibFonction;
	}

	/**
	 * Set accessor for persistent attribute: rcLibFonction
	 * @param rcLibFonction
	 */
	public void setRcLibFonction(String rcLibFonction) {
		this.rcLibFonction = rcLibFonction;
	}

	/**
	 * Get accessor for persistent attribute: rcDescription
	 * @return rcDescription
	 */
	public String getRcDescription() {
		return rcDescription;
	}

	/**
	 * Set accessor for persistent attribute: rcDescription
	 * @param rcDescription
	 */
	public void setRcdescription(String rcDescription) {
		this.rcDescription = rcDescription;
	}

	/**
	 * Get accessor for persistent attribute: rcUrlFonction
	 * @return rcUrlFonction
	 */
	public String getRcUrlFonction() {
		return rcUrlFonction;
	}

	/**
	 * Set accessor for persistent attribute: rcUrlFonction
	 * @param rcUrlFonction
	 */
	public void setRcurlfonction(String rcUrlFonction) {
		this.rcUrlFonction = rcUrlFonction;
	}

	/**
	 * Get accessor for persistent attribute: rcCodeProfil
	 */
	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeProfil
	 */
	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}

	/**
	 * This method was generated for supporting the relationship role named numerotations. 
	 * @return numerotations
	 */
	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	/**
	 * This method was generated for supporting the relationship role named numerotations
	 * @param numerotation
	 */
	public void setNumerotation(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

	/**
	 * This method was generated for supporting the relationship role named regroupFonctions.
	 * @return regroupFonctions
	 */
	public List<RegroupFonctions> getRegroupFonctions() {
		return regroupFonctions;
	}

	/**
	 * This method was generated for supporting the relationship role named regroupFonctions.
	 * @param regroupFonctions
	 */
	public void setRegroupFonctions(List<RegroupFonctions> regroupFonctions) {
		this.regroupFonctions = regroupFonctions;
	}

	/**
	 * This method was generated for supporting the relationship role named delegations.
	 * @return delegations
	 */
	public List<Delegation> getDelegations() {
		return delegations;
	}

	/**
	 * This method was generated for supporting the relationship role named delegations.
	 * @param delegations
	 */
	public void setDelegations(List<Delegation> delegations) {
		this.delegations = delegations;
	}

	/**
	 * This method was generated for supporting the relationship role named profilFonct.
	 * @return profilFonct
	 */
	public Profil getProfilFonct() {
		return profilFonct;
	}

	/**
	 * This method was generated for supporting the relationship role named profilFonct.
	 * @param profilFonct
	 */
	public void setProfilFonct(Profil profilFonct) {
		this.profilFonct = profilFonct;
	}


}
