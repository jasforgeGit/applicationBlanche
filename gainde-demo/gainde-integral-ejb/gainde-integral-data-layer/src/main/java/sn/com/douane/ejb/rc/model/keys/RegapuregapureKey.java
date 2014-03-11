package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegapuregapureKey implements Serializable {

	private static final long serialVersionUID = -722359106545910744L;

	@Column(name="RCTYPEREGAPURE", length=1, nullable=false)
	private String rcTypeRegApure;
	 
	@Column(name="RCREGDOUAPURE", length=1, nullable=false)
	private String rcRegDouApure; 
	
	@Column(name="RCTYPEREGAPURANT", length=1, nullable=false)
	private String rcTypeRegApurant;
	
	@Column(name="RCREGDOUAPURANT", length=1, nullable=false)
	private String rcRegDouApurant; 

	public RegapuregapureKey() {
	}

	public RegapuregapureKey(String rcTypeRegApure, String rcRegDouApure,
			String rcTypeRegApurant, String rcRegDouApurant) {
		super();
		this.rcTypeRegApure = rcTypeRegApure;
		this.rcRegDouApure = rcRegDouApure;
		this.rcTypeRegApurant = rcTypeRegApurant;
		this.rcRegDouApurant = rcRegDouApurant;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegapuregapureKey) {
			RegapuregapureKey o = (RegapuregapureKey) otherKey;
			return ((this.rcTypeRegApure
					.equals(o.rcTypeRegApure))
					&& (this.rcRegDouApure
							.equals(o.rcRegDouApure))
					&& (this.rcTypeRegApurant
							.equals(o.rcTypeRegApurant)) 
					&& (this.rcRegDouApurant
					.equals(o.rcRegDouApurant)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeRegApure.hashCode()
				+ rcRegDouApure.hashCode()
				+ rcTypeRegApurant.hashCode() 
				+ rcRegDouApurant.hashCode());
	}

	public String getRcTypeRegApure() {
		return rcTypeRegApure;
	}

	public void setRcTypeRegApure(String rcTypeRegApure) {
		this.rcTypeRegApure = rcTypeRegApure;
	}

	public String getRcRegDouApure() {
		return rcRegDouApure;
	}

	public void setRcRegDouApure(String rcRegDouApure) {
		this.rcRegDouApure = rcRegDouApure;
	}

	public String getRcTypeRegApurant() {
		return rcTypeRegApurant;
	}

	public void setRcTypeRegApurant(String rcTypeRegApurant) {
		this.rcTypeRegApurant = rcTypeRegApurant;
	}

	public String getRcRegDouApurant() {
		return rcRegDouApurant;
	}

	public void setRcRegDouApurant(String rcRegDouApurant) {
		this.rcRegDouApurant = rcRegDouApurant;
	}

}
