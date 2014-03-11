package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class SoumissionCreditaireKey implements Serializable{


	private static final long serialVersionUID = -2362522156550773920L;

	/**
	 * Implementation field for persistent attribute:
	 * codeIndicateur
	 */
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;
	
	/**
	 * Implementation field for persistent attribute:
	 * codeCreditaire
	 */
	@Column(name="RCCODECREDITAIRE", length=3, nullable=false)
	private String rcCodeCreditaire;

	public SoumissionCreditaireKey() {
	}

	public SoumissionCreditaireKey(String rcCodeIndicateur,
			String rcCodeCreditaire) {
		super();
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	/**
	 * @return the codeCreditaire
	 */
	public String getRcCodeCreditaire() {
		return rcCodeCreditaire;
	}

	/**
	 * @param codeCreditaire the codeCreditaire to set
	 */
	public void setRcCodeCreditaire(String rcCodeCreditaire) {
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	/**
	 * @return the codeIndicateur
	 */
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	/**
	 * @param codeIndicateur the codeIndicateur to set
	 */
	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof SoumissionCreditaireKey) {
		SoumissionCreditaireKey o = (SoumissionCreditaireKey) otherKey;
			return ((this.rcCodeIndicateur
					.equals(o.rcCodeIndicateur)) && (this.rcCodeCreditaire
					.equals(o.rcCodeCreditaire)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeIndicateur.hashCode() + 
				rcCodeCreditaire.hashCode());
	}

}
