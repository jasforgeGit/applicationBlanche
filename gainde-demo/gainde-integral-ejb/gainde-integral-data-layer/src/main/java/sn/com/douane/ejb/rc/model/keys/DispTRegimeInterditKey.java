package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class DispTRegimeInterditKey implements Serializable {

	private static final long serialVersionUID = 3205761247417597729L;
	
	@Column(name="RCCODEDISPENSE", length=5, nullable=false)
	private String rcCodeDispense;
	
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	 
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;

	
	public DispTRegimeInterditKey() {
	}

	
	public DispTRegimeInterditKey(String rcCodeDispense, String rcTypeRegime,
			Date rcDateValeur) {
		super();
		this.rcCodeDispense = rcCodeDispense;
		this.rcTypeRegime = rcTypeRegime;
		this.rcDateValeur = rcDateValeur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DispTRegimeInterditKey) {
			DispTRegimeInterditKey o = (DispTRegimeInterditKey) otherKey;
			return ((this.rcDateValeur.equals(o.rcDateValeur))
					&& (this.rcCodeDispense.equals(o.rcCodeDispense)) 
					&& (this.rcTypeRegime.equals(o.rcTypeRegime)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcDateValeur.hashCode()
				+ rcCodeDispense.hashCode() 
				+ rcTypeRegime.hashCode());
	}
	
	
	public String getRcCodeDispense() {
		return rcCodeDispense;
	}

	public void setRcCodeDispense(String rcCodeDispense) {
		this.rcCodeDispense = rcCodeDispense;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

}
