package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

public class NumerotationKey implements Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: rcOperation
	 */
	private String rcOperation;

	/**
	 * Implementation field for persistent attribute: rcCodeFonction
	 */
	private String rcCodeFonction;

	/**
	 * Creates an empty key for Entity Bean: Numerotation
	 */
	public NumerotationKey() {
	}

	public NumerotationKey(String rcCodeFonction, String rcOperation) {
		super();
		this.rcOperation = rcOperation;
		this.rcCodeFonction = rcCodeFonction;
	}

	public String getRcOperation() {
		return rcOperation;
	}

	public void setRcOperation(String rcOperation) {
		this.rcOperation = rcOperation;
	}

	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	public void setRccodefonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}	    

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof NumerotationKey) {
			NumerotationKey o = (NumerotationKey) otherKey;
			return ((this.rcOperation.equals(o.rcOperation)) && (this.rcCodeFonction
					.equals(o.rcCodeFonction)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcOperation.hashCode() + rcCodeFonction
				.hashCode());
	}

}
