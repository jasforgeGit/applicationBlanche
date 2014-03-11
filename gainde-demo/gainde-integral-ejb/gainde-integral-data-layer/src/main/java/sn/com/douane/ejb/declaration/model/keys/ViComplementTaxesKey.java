package sn.com.douane.ejb.declaration.model.keys;

import javax.persistence.Column;

/**
 * @author: issam
 * Key class for Entity Bean: Vicomplementtaxes
 */

public class ViComplementTaxesKey implements java.io.Serializable {
	
	@Column(name="DECANNEEENREGDEC",length=4, nullable=false)
    private String decAnneeEnregDec;
	@Column(name="DECBURENREGDEC",length=3, nullable=false)
    private String decBurEnregDec;
	@Column(name="DECNUMDECLARATION",nullable=false)
    private Integer decNumDeclaration;
	@Column(name="DECCODETAXE",length=2, nullable=false)
    private String decCodeTaxe;
	

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: decanneeenregdec
	 */
		/**
	 * Creates an empty key for Entity Bean: Vicomplementtaxes
	 */
	public ViComplementTaxesKey() {
	}

	/**
	 * Creates a key for Entity Bean: Vicomplementtaxes
	 */
	public ViComplementTaxesKey(String decAnneeEnregDec,
			String decBurEnregDec,
			Integer decNumDeclaration, String decCodeTaxe) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decCodeTaxe = decCodeTaxe;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof ViComplementTaxesKey) {
			ViComplementTaxesKey o = (ViComplementTaxesKey) otherKey;
			return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decBurEnregDec.equals(o.decBurEnregDec))
					&& (this.decNumDeclaration.equals(o.decNumDeclaration)) && (this.decCodeTaxe.equals(o.decCodeTaxe)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decAnneeEnregDec.hashCode() + decBurEnregDec.hashCode()
				+ decNumDeclaration.hashCode() + decCodeTaxe.hashCode());
	}
}