package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegimeKey implements Serializable{

	private static final long serialVersionUID = 3068293972188177462L;

	/**
	 * Implementation field for persistent attribute: rcTypeRegime
	 */
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	/**
	 * Implementation field for persistent attribute: rcCodeRegimeDouanier
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;

	/**
	 * Implementation field for persistent attribute: rcCodeRegimeFiscal
	 */
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;

	/**
	 * Creates an empty key for Entity Bean: Regime
	 */
	public RegimeKey() {
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

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	/**
	 * 
	 * 
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 * @param rcCodeRegimeFiscal
	 */
	public RegimeKey( String rcTypeRegime,String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal) {
		super();
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}


	public RegimeKey(String decRegFiscal) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegimeKey) {
			RegimeKey o = (RegimeKey) otherKey;
			return ((this.rcCodeRegimeFiscal
					.equals(o.rcCodeRegimeFiscal))
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
		return (rcCodeRegimeFiscal.hashCode()
				+ rcCodeRegimeDouanier.hashCode() 
				+ rcTypeRegime.hashCode());
	}
}
