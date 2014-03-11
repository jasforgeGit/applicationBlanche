package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class RegimeDeclarantKey implements Serializable{
	
	private static final long serialVersionUID = 8982510727082669580L;

	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;

	@Column(name="RCREGIMEDOUANIER", length=1, nullable=false)
	private String rcRegimeDouanier;
	    
	@Column(name="RCREGIMEFISCAL", length=1, nullable=false)
	private String rcRegimeFiscal;
	
	@Column(name="RCCODEPPM", length=1, nullable=false)
	private String rcCodePpm;

	public RegimeDeclarantKey() {

	}

	public RegimeDeclarantKey(String rcTypeRegime, String rcRegimeDouanier,
			String rcRegimeFiscal, String rcCodePpm) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcRegimeDouanier = rcRegimeDouanier;
		this.rcRegimeFiscal = rcRegimeFiscal;
		this.rcCodePpm = rcCodePpm;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegimeDeclarantKey) {
			RegimeDeclarantKey o = (RegimeDeclarantKey) otherKey;
			return ((this.rcTypeRegime.equals(o.rcTypeRegime))
					&& (this.rcRegimeDouanier.equals(o.rcRegimeDouanier))
					&& (this.rcRegimeFiscal.equals(o.rcRegimeFiscal)) && (this.rcCodePpm
					.equals(o.rcCodePpm)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeRegime.hashCode() + rcRegimeDouanier.hashCode()
				+ rcRegimeFiscal.hashCode() + rcCodePpm
				.hashCode());
	}
	
	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcRegimeDouanier() {
		return rcRegimeDouanier;
	}

	public void setRcRegimeDouanier(String rcRegimeDouanier) {
		this.rcRegimeDouanier = rcRegimeDouanier;
	}

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	} 
	
	
}
