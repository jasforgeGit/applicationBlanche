package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class TypeApureRegInterditKey implements Serializable{

	private static final long serialVersionUID = 4435680949776680701L;

	@Column(name="RCTYPEAPUREMENT", length=1, nullable=false)
	private String rcTypeApurement;
	
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Column(name="RCREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;

	public TypeApureRegInterditKey() {
	}

	public TypeApureRegInterditKey(String rcTypeApurement, String rcTypeRegime,
			String rcCodeRegimeDouanier) {
		super();
		this.rcTypeApurement = rcTypeApurement;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof TypeApureRegInterditKey) {
			TypeApureRegInterditKey o = (TypeApureRegInterditKey) otherKey;
			return ((this.rcTypeApurement.equals(o.rcTypeApurement))
				&& (this.rcCodeRegimeDouanier
					.equals(o.rcCodeRegimeDouanier)) && (this.rcTypeRegime
				.equals(o.rcTypeRegime)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeApurement.hashCode()
			+ rcCodeRegimeDouanier.hashCode() 
			+ rcTypeRegime.hashCode());
	}


	public String getRcTypeApurement() {
		return rcTypeApurement;
	}

	public void setRcTypeApurement(String rcTypeApurement) {
		this.rcTypeApurement = rcTypeApurement;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

}
