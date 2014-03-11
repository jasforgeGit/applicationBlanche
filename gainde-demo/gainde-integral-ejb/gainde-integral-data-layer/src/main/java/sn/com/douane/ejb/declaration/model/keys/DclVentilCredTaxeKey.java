package sn.com.douane.ejb.declaration.model.keys;

import javax.persistence.Column;

/**
 * @author: issam Key class for Entity Bean: DclVentilCredTaxe
 */

public class DclVentilCredTaxeKey implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4550274861366436989L;

	@Column(name = "DECCODECREDITAIRE", length = 3, nullable = false)
	private java.lang.String decCodeCreditaire;

	@Column(name = "DECANNEEDECL", length = 4, nullable = false)
	private java.lang.String decAnneeDecl;

	@Column(name = "DECBURDECL", length = 3, nullable = false)
	private java.lang.String decBurDecl;

	@Column(name = "DECNUMDECL", nullable = false)
	private java.lang.Integer decNumDecl;

	@Column(name = "DECCODETAXE", length = 2, nullable = false)
	private java.lang.String decCodeTaxe;

	public DclVentilCredTaxeKey() {
	}

	public DclVentilCredTaxeKey(String decCodeCreditaire, String decAnneeDecl,
			String decBurDecl, Integer decNumDecl, String decCodeTaxe) {
		this.decCodeCreditaire = decCodeCreditaire;
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
		this.decCodeTaxe = decCodeTaxe;
	}

	public java.lang.String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(java.lang.String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public java.lang.String getDecBurDecl() {
		return decBurDecl;
	}

	public void setDecBurDecl(java.lang.String decBurDecl) {
		this.decBurDecl = decBurDecl;
	}

	public java.lang.Integer getDecNumDecl() {
		return decNumDecl;
	}

	public void setDecNumDecl(java.lang.Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}

	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DclVentilCredTaxeKey) {
			DclVentilCredTaxeKey o = (DclVentilCredTaxeKey) otherKey;
			return ((this.decCodeCreditaire.equals(o.decCodeCreditaire))
					&& (this.decCodeTaxe.equals(o.decCodeTaxe))
					&& (this.decAnneeDecl.equals(o.decAnneeDecl))
					&& (this.decBurDecl.equals(o.decBurDecl)) && (this.decNumDecl
						.equals(o.decNumDecl)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decCodeCreditaire.hashCode() + decCodeTaxe.hashCode()
				+ decAnneeDecl.hashCode() + decBurDecl.hashCode() + decNumDecl
					.hashCode());
	}

}