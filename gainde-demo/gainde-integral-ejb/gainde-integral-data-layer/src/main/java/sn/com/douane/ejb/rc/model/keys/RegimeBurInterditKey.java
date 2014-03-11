package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Key class for Entity Bean: Regimeburinterdit
 */
public class RegimeBurInterditKey implements Serializable {
	
	static final long serialVersionUID = 3206093459760846163L;
	
	@Column(name = "RCTYPEREGIME", length=1, nullable=false)	
	private String rcTypeRegime;
	
	@Column(name = "RCCODEBUREAU", length=3, nullable=false)	
	private String rcCodeBurDouane;

	@Column(name = "RCREGIMEDOUANIER", length=1, nullable=false)	
	private String rcCodeRegimeDouanier;	
  
	public RegimeBurInterditKey() {	}
	
	public RegimeBurInterditKey(String rcCodeBurDouane,	String rcCodeRegimeDouanier, String rcTypeRegime) {
		super();
		this.rcCodeBurDouane = rcCodeBurDouane;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}


	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}


	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}


	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(Object otherKey) {
		if (otherKey instanceof RegimeBurInterditKey) {
			RegimeBurInterditKey o = (RegimeBurInterditKey) otherKey;
			return ((this.rcCodeBurDouane
					.equals(o.rcCodeBurDouane))
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
		return (rcCodeBurDouane.hashCode()
				+ rcCodeRegimeDouanier.hashCode() 
				+ rcTypeRegime.hashCode());
	}


	
}