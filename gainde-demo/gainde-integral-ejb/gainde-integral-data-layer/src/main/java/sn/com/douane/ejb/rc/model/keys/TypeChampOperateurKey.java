package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class TypeChampOperateurKey implements Serializable {

	private static final long serialVersionUID = -890793276001427218L;

	@Column(name = "RCTYPECHAMP", length = 20, nullable = false)
	private String rcTypeChamp;

	@Column(name = "RCCODEOERATEUR", length = 20, nullable = false)
	private String rcCodeOperateur;

	public TypeChampOperateurKey() {

	}

	public TypeChampOperateurKey(String rcTypeChamp, String rcCodeOperateur) {
		super();
		this.rcTypeChamp = rcTypeChamp;
		this.rcCodeOperateur = rcCodeOperateur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof TypeChampOperateurKey) {
			TypeChampOperateurKey o = (TypeChampOperateurKey) otherKey;
			return ((this.rcTypeChamp.equals(o.rcTypeChamp)) && (this.rcCodeOperateur
					.equals(o.rcCodeOperateur)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeChamp.hashCode() + rcCodeOperateur.hashCode());
	}

	/**
	 * @return the rcTypeChamp
	 */
	public String getRcTypeChamp() {
		return rcTypeChamp;
	}

	/**
	 * @param rcTypeChamp
	 *            the rcTypeChamp to set
	 */
	public void setRcTypeChamp(String rcTypeChamp) {
		this.rcTypeChamp = rcTypeChamp;
	}

	/**
	 * @return the rcCodeOperateur
	 */
	public String getRcCodeOperateur() {
		return rcCodeOperateur;
	}

	/**
	 * @param rcCodeOperateur
	 *            the rcCodeOperateur to set
	 */
	public void setRcCodeOperateur(String rcCodeOperateur) {
		this.rcCodeOperateur = rcCodeOperateur;
	}
}
