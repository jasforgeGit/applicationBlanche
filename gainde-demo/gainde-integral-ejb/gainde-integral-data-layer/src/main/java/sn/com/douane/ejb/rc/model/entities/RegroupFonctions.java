package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="REGROUPFONCTIONS")
@IdClass(RegroupFonctionsKey.class)
@javax.persistence.NamedQueries(
		@javax.persistence.NamedQuery(name = "findByCodegroupe", query = "select object(o) from RegroupFonctions o where  o.grpGrpFonct.rcCodeGroupe = ?1 order by  o.rcOrdreAffichage asc"))
public class RegroupFonctions implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RCCODEFONCTION", length=15, nullable=false)
	private String rcCodeFonction;

	@Id
	@Column(name="RCCODEGROUPE", nullable=false)
	private Integer rcCodeGroupe;

	@Column(name="RCORDREAFFICHAGE", nullable=false)
	private Integer rcOrdreAffichage;

	@ManyToOne(targetEntity = Fonctionnalite.class, fetch = FetchType.LAZY)
	@JoinColumn(name="RCCODEFONCTION", insertable=false, updatable=false)
	private Fonctionnalite foncRegpFonc;

	@ManyToOne(targetEntity = GroupeFonction.class, fetch = FetchType.LAZY)
	@JoinColumn(name="RCCODEGROUPE", insertable=false, updatable=false)
	private GroupeFonction grpGrpFonct;


	/**
	 * 0-args constructor
	 */
	public RegroupFonctions() {
	}
	
	/**
	 * 3-args constructors
	 * @param rcCodeFonction
	 * @param rcCodeGroupe
	 * @param rcOrdreAffichage
	 */
	public RegroupFonctions(String rcCodeFonction, Integer rcCodeGroupe,
			Integer rcOrdreAffichage) {
		super();
		this.rcCodeFonction = rcCodeFonction;
		this.rcCodeGroupe = rcCodeGroupe;
		this.rcOrdreAffichage = rcOrdreAffichage;
	}

	/**
	 * Get accessor for persistent attribute: rcCodeFonction
	 * @return
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
	 * Get accessor for persistent attribute: rcOrdreAffichage
	 * @return
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
	 * This method was generated for supporting the relationship role named
	 * @return foncRegpFonc
	 */
	public Fonctionnalite getFoncRegpFonc() {
		return foncRegpFonc;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param foncRegpFonc
	 */
	public void setFoncRegpFonc(Fonctionnalite foncRegpFonc) {
		this.foncRegpFonc = foncRegpFonc;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @return grpGrpFonct
	 */
	public GroupeFonction getGrpGrpFonctt() {
		return grpGrpFonct;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * @param grpGrpFonct
	 */
	public void setGrpGrpFonct(GroupeFonction grpGrpFonct) {
		this.grpGrpFonct = grpGrpFonct;
	}
	
}
