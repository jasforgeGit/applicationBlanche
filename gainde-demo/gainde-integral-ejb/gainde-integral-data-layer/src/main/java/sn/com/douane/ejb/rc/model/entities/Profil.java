package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries; 
import javax.persistence.NamedQuery; 
import javax.persistence.OneToMany; 

/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="PROFIL")
@NamedQueries(@NamedQuery(name = "findAllProfils", query = "select object(o) from Profil o"))
public class Profil implements Serializable{

	private static final long serialVersionUID = -3778224886818875347L;

	@Id
	@Column(name="RCCODEPROFIL", length=10, nullable=false)
	private String rcCodeProfil;

	@Column(name="RCLIBELLEPROFIL", length=255, nullable=false)
	private String rcLibelleProfil;

	@OneToMany(mappedBy = "profilProGrp",cascade = CascadeType.REMOVE , targetEntity = ProfilGroupe.class, fetch = FetchType.LAZY)
	private List<ProfilGroupe> profilGroupes;

	@OneToMany(mappedBy = "profilUser", targetEntity = Utilisateur.class, fetch = FetchType.LAZY)
	private List<Utilisateur> utilisateurs;

	@OneToMany(mappedBy = "profilFonct", targetEntity = Fonctionnalite.class, fetch = FetchType.LAZY)
	private List<Fonctionnalite> fonctionnalites;

	/**
	 * 0-args constructors
	 */
	public Profil() {
	}
	

	/**
	 * 2-args constructor
	 * @param rcCodeProfil
	 * @param rcLibelleProfil
	 */
	public Profil(String rcCodeProfil, String rcLibelleProfil) {
		super(); 
		this.rcCodeProfil = rcCodeProfil; 
		this.rcLibelleProfil = rcLibelleProfil; 
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
	 * Get accessor for persistent attribute: rcLibelleProfil
	 * @return rcLibelleProfil
	 */
	public String getRcLibelleProfil() {
		return rcLibelleProfil;
	}

	/**
	 * Set accessor for persistent attribute: rcLibelleProfil
	 * @param rcLibelleProfil
	 */
	public void setRcLibelleProfil(String rcLibelleProfil) {
		this.rcLibelleProfil = rcLibelleProfil;
	}

	/**
	 * This method was generated for supporting the relationship role named profilGroupes. 
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
	 * This method was generated for supporting the relationship role named utilisateurs.
	 * @return utilisateurs
	 */
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * This method was generated for supporting the relationship role named utilisateur.
	 * @param utilisateurs
	 */
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	/**
	 * This method was generated for supporting the relationship role named fonctionnalites.
	 * @return fonctionnalites
	 */
	
	public List<Fonctionnalite> getFonctionnalites() {
		return fonctionnalites;
	}

	/**
	 * This method was generated for supporting the relationship role named fonctionnalites.
	 * @param fonctionnalites
	 */
	public void setFonctionnalites(
			List<Fonctionnalite> fonctionnalites) {
		this.fonctionnalites = fonctionnalites;
	}
}
