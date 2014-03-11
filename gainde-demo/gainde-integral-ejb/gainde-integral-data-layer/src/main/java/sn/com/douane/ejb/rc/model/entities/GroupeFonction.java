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

@Entity
@Table(name="GROUPEFONCTION")
@javax.persistence.NamedQueries({
	@javax.persistence.NamedQuery(name = "findCodegroupeOrder", query = "select object(o) from GroupeFonction o where  o.rcCodeGroupe = ?1 order by o.rcOrdreAffichage"),
	@javax.persistence.NamedQuery(name = "findByCodegrpePere", query = "select object(o)  from GroupeFonction o where o.rcCodeGrpPere =?1 order by o.rcOrdreAffichage")})
public class GroupeFonction implements Serializable {

	private static final long serialVersionUID = -6843454541245854702L;

	@Id
	@Column(name="RCCODEGROUPE", nullable=false)
	private Integer rcCodeGroupe;
	
	@Column(name="RCCODEGRPPERE")
	private Integer rcCodeGrpPere;

	@Column(name="RCLIBGROUPE", length=100, nullable=false)
	private String rcLibGroupe;

	@Column(name="RCORDREAFFICHAGE", nullable=false)
	private Integer rcOrdreAffichage;

	@OneToMany(mappedBy = "groupProGrp", targetEntity = ProfilGroupe.class, fetch = FetchType.LAZY)
	private List<ProfilGroupe> profilGroupes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="RCCODEGROUPE", insertable=false, updatable=false)
	private GroupeFonction grpFoncGpFonct;

	@OneToMany(mappedBy = "grpFoncGpFonct", targetEntity = GroupeFonction.class, fetch = FetchType.LAZY)
	private List<GroupeFonction> groupeFonctions;

	@OneToMany(mappedBy = "grpGrpFonct", targetEntity = RegroupFonctions.class, fetch = FetchType.LAZY)
	private List<RegroupFonctions> regroupFonctions;

	@OneToMany(mappedBy = "grpFctDelegation", targetEntity = Delegation.class, fetch = FetchType.LAZY)
	private List<Delegation> delegations;

	/**
	 * 0-args constructor
	 */
	public GroupeFonction() {
	}

	/**
	 * 3-args constructor
	 * @param rcCodeGroupe
	 * @param rcLibGroupe
	 * @param rcOrdreAffichage
	 */
	public GroupeFonction(Integer rcCodeGroupe, String rcLibGroupe, Integer rcOrdreAffichage) {
		super(); 
		this.rcCodeGroupe = rcCodeGroupe; 
		this.rcLibGroupe = rcLibGroupe; 
		this.rcOrdreAffichage = rcOrdreAffichage; 
	}

	/**
	 * Get accessor for persistent attribute: rcCodeGroupe
	 * @return rcCodeGroupe
	 */
	public Integer getRcCodeGroupe() {
		return rcCodeGroupe;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeGroupe
	 * @param rcCodeGroupe
	 */
	public void setRcCodeGroupe(Integer rcCodeGroupe) {
		this.rcCodeGroupe = rcCodeGroupe;
	}

	/**
	 * Get accessor for persistent attribute: rcLibGroupe
	 * @return rcLibGroupe
	 */
	public String getRcLibGroupe() {
		return rcLibGroupe;
	}

	/**
	 * Set accessor for persistent attribute: rcLibGroupe
	 * @param rcLibGroupe
	 */
	public void setRcLibGroupe(String rcLibGroupe) {
		this.rcLibGroupe = rcLibGroupe;
	}

	/**
	 * Get accessor for persistent attribute: rcOrdreAffichage
	 * @return rcOrdreAffichage
	 */
	public Integer getRcOrdreAffichage() {
		return rcOrdreAffichage;
	}

	/**
	 * Set accessor for persistent attribute: rcOrdreAffichage
	 * @param rcOrdreAffichage
	 */
	public void setRcOrdreAffichage(Integer rcOrdreAffichage) {
		this.rcOrdreAffichage = rcOrdreAffichage;
	}

	/**
	 * Get accessor for persistent attribute: rcCodeGrpPere
	 */
	public Integer getRcCodeGrpPere() {
		return rcCodeGrpPere;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeGrpPere
	 * @param rcCodeGrpPere
	 */
	public void setRcCodeGrpPere(Integer rcCodeGrpPere) {
		this.rcCodeGrpPere = rcCodeGrpPere;
	}

	/**
	 * This method was generated for supporting the relationship role named grpFoncGpFonct
	 * @return grpFoncGpFonct
	 */
	public GroupeFonction getGrpFoncGpFonct() {
		return grpFoncGpFonct;
	}

	/**
	 * This method was generated for supporting the relationship role named grpFoncGpFonct
	 * @param grpFoncGpFonct
	 */
	public void setGrpFoncGpFonct(GroupeFonction grpFoncGpFonct) {
		this.grpFoncGpFonct = grpFoncGpFonct;
	}

	/**
	 * This method was generated for supporting the relationship role named groupeFonctions
	 * @return groupeFonctions
	 */
	public List<GroupeFonction> getGroupeFonctions() {
		return groupeFonctions;
	}

	/**
	 * This method was generated for supporting the relationship role named groupeFonctions
	 * @param groupeFonctions
	 */
	public void setGroupeFonctions(List<GroupeFonction> groupeFonctions) {
		this.groupeFonctions = groupeFonctions;
	}

	/**
	 * This method was generated for supporting the relationship role named profilGroupes
	 * @return profilGroupes
	 */ 
	public List<ProfilGroupe> getProfilGroupes() {
		return profilGroupes;
	}

	/**
	 * This method was generated for supporting the relationship role named profilGroupes
	 * @param profilGroupes
	 */
	public void setProfilGroupes(List<ProfilGroupe> profilGroupes) {
		this.profilGroupes = profilGroupes;
	}

	/**
	 * This method was generated for supporting the relationship role named regroupFonctions
	 * @return regroupFonctions
	 */
	public List<RegroupFonctions> getRegroupFonctions() {
		return regroupFonctions;
	}

	/**
	 * This method was generated for supporting the relationship role named regroupFonctions
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

}
