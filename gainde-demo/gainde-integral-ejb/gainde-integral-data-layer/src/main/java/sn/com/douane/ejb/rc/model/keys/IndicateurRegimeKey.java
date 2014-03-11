package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class IndicateurRegimeKey implements Serializable {

	private static final long serialVersionUID = -6306729949686852258L;
	/**
	 * Implementation field for persistent attribute: rcTypeRegime
	 */
	@Column(name="RCTYPEREGIME", length=1)
	private String rcTypeRegime;
	
	/**
	 * Implementation field for persistent attribute: rcCodeRegimeDouanier
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1)
	private String rcCodeRegimeDouanier;
	
	/**
	 * Implementation field for persistent attribute: rcCodeRegimeFiscal
	 */
	@Column(name="RCCODEREGIMEFISCAL", length=2)
	private String rcCodeRegimeFiscal;
	
	/**
	 * Implementation field for persistent attribute: rcCodeIndicateur
	 */
	@Column(name="RCCODEINDICATEUR", length=15)
	private String rcCodeIndicateur;

	/**
	 * Implementation field for persistent attribute: rcDateValidite
	 */
	private Date rcDateValidite;

	/**
	 * Returns the hash code for the key.
	 */
	
	public IndicateurRegimeKey() {

	}	
	
	public IndicateurRegimeKey(String rcTypeRegime,
			String rcCodeRegimeDouanier, String rcCodeRegimeFiscal,
			String rcCodeIndicateur, Date rcDateValidite) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
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

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public Date getRcDateValidite() {
		return rcDateValidite;
	}

	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}

	public int hashCode() {
		return (rcDateValidite.hashCode()
			+ rcCodeIndicateur.hashCode()
			+ rcCodeRegimeFiscal.hashCode()
			+ rcCodeRegimeDouanier.hashCode() 
			+ rcTypeRegime.hashCode());
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof IndicateurRegimeKey) {
			IndicateurRegimeKey o = (IndicateurRegimeKey) otherKey;
			return ((this.rcDateValidite.equals(o.rcDateValidite))
				&& (this.rcCodeIndicateur.equals(o.rcCodeIndicateur))
				&& (this.rcCodeRegimeFiscal.equals(o.rcCodeRegimeFiscal))
				&& (this.rcCodeRegimeDouanier.equals(o.rcCodeRegimeDouanier)) 
				&& (this.rcTypeRegime.equals(o.rcTypeRegime)));
		}
		return false;
	}

}
