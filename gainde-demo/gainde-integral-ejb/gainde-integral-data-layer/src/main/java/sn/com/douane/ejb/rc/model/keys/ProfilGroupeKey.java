package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ProfilGroupeKey implements Serializable{

	private static final long serialVersionUID = 7215443195308503879L;
	/**
	 * Implementation field for persistent attribute: rcCodeGroupe
	 */
	private Integer rcCodeGroupe;
	/**
	 * Implementation field for persistent attribute: rcCodeProfil
	 */
	@Column(name="RCCODEPROFIL", length=10, nullable=false)
	private String rcCodeProfil;
	
	/**
	 * Creates an empty key for Entity Bean: Profilgroupe
	 */
	public ProfilGroupeKey() {
	}
	
	public ProfilGroupeKey(Integer rcCodeGroupe, String rcCodeProfil) {
		super(); 
		this.rcCodeGroupe = rcCodeGroupe; 
		this.rcCodeProfil = rcCodeProfil; 
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof ProfilGroupeKey) {
			ProfilGroupeKey o = (ProfilGroupeKey) otherKey;
			return ((this.rcCodeProfil
				.equals(o.rcCodeProfil)) && (this.rcCodeGroupe
				.equals(o.rcCodeGroupe)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeProfil.hashCode() + rcCodeGroupe
			.hashCode());
	}

	public Integer getRcCodeGroupe() {
		return rcCodeGroupe;
	}

	public void setRcCodeGroupe(Integer rcCodeGroupe) {
		this.rcCodeGroupe = rcCodeGroupe;
	}

	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}
	
	
}
