package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegroupFonctionsKey implements Serializable {


	private static final long serialVersionUID = 7891747892462711697L;
	
	/**
	 * Implementation field for persistent attribute: rccodefonction
	 */
	@Column(name="RCCODEFONCTION", length=15, nullable=false)
	private String rcCodeFonction;
	
	/**
	 * Implementation field for persistent attribute: rccodegroupe
	 */
	@Column(name="RCCODEGROUPE", nullable=false)
	private Integer rcCodeGroupe;
	
	/**
	 * Creates an empty key for Entity Bean: Regroupfonctions
	 */
	public RegroupFonctionsKey() {
	}

	public RegroupFonctionsKey(String rcCodeFonction, Integer rcCodeGroupe) {
		super();
		this.rcCodeFonction = rcCodeFonction;
		this.rcCodeGroupe = rcCodeGroupe;
	}

	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	public Integer getRcCodeGroupe() {
		return rcCodeGroupe;
	}

	public void setRcCodeGroupe(Integer rcCodeGroupe) {
		this.rcCodeGroupe = rcCodeGroupe;
	}
	    
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegroupFonctionsKey) {
			RegroupFonctionsKey o = (RegroupFonctionsKey) otherKey;
			return ((this.rcCodeFonction
				.equals(o.rcCodeFonction)) && (this.rcCodeGroupe
				.equals(o.rcCodeGroupe)));
		}
		return false;
	}
	
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeFonction.hashCode() + rcCodeGroupe
			.hashCode());
	}

}
