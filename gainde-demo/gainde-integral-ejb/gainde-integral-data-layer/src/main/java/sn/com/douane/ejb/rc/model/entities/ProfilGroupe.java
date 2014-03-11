package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.JoinColumn; 

import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="PROFILGROUPE")
@IdClass(ProfilGroupeKey.class)
@javax.persistence.NamedQueries(
		@javax.persistence.NamedQuery(name = "findProfilgroupe", query = "select object(o) from ProfilGroupe o where o.profilProGrp.rcCodeProfil = ?1 order by o.groupProGrp.rcCodeGroupe asc"))
public class ProfilGroupe implements Serializable {

	private static final long serialVersionUID = -6972504483875535038L;

	@Id
	@Column(name="RCCODEGROUPE", nullable=false)
	private Integer rcCodeGroupe;
	
	@Id
	@Column(name="RCCODEPROFIL", length=10, nullable=false)
	private String rcCodeProfil;

	@ManyToOne(targetEntity = Profil.class, fetch = FetchType.LAZY)
	@JoinColumn(name="RCCODEPROFIL", insertable=false, updatable=false)
	private Profil profilProGrp;

	@ManyToOne(targetEntity = GroupeFonction.class, fetch = FetchType.LAZY)
	@JoinColumn(name="RCCODEGROUPE" , insertable=false, updatable=false)
	private GroupeFonction groupProGrp;

	/**
	 * 0-args constructor
	 */
	public ProfilGroupe() {
	}

	/**
	 * 2-args constructor
	 * @param rccodeprofil
	 * @param rccodegroupe
	 */
	public ProfilGroupe(String rcCodeProfil,Integer rcCodeGroupe) {
		super(); 
		this.rcCodeProfil = rcCodeProfil; 
		this.rcCodeGroupe = rcCodeGroupe; 
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
	 * Get accessor for persistent attribute: rcCodeProfil
	 * @return rcCodeProfil
	 */
	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeProfil
	 * @param rcCodeProfil
	 */
	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}

	/**
	 * This method was generated for supporting the relationship role name
	 * @return groupProGrp
	 */
	public GroupeFonction getGroupProGrp() {
		return groupProGrp;
	}

	/**
	 * This method was generated for supporting the relationship role named groupProGrp.
	 * @param groupProGrp
	 */
	public void setGroupProGrp(GroupeFonction groupProGrp) {
		this.groupProGrp = groupProGrp;
	}

	/**
	 * This method was generated for supporting the relationship role named profilProGrp
	 * @return profilProGrp
	 */
	public Profil getProfilProGrp() {
		return profilProGrp;
	}

	/**
	 * This method was generated for supporting the relationship role named profilProGrp
	 * @param profilProGrp
	 */
	public void setProfilProGrp(Profil profilProGrp) {
		this.profilProGrp = profilProGrp;
	}


}
