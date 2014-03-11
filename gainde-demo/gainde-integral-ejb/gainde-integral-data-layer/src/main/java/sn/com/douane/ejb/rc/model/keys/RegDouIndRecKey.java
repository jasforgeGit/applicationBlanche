package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class RegDouIndRecKey implements Serializable {

	private static final long serialVersionUID = 1587464814675218214L;

	@Column(name="RCTYPEREGIMEDOUANE", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Column(name="RCCODEREGIMEDOUANE", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Column(name="RCINDRECEVAB", length=15, nullable=false)
	private String rcIndRecevab;
	
	@Column(name="RCDATEVALEUR", nullable=false)
    private Date rcDateValeur;

	public RegDouIndRecKey() {
		
	}
	
	public RegDouIndRecKey(String rcTypeRegime,String rcCodeRegimeDouanier,  String rcIndRecevab,
			Date rcDateValeur) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier= rcCodeRegimeDouanier; 
		this.rcIndRecevab = rcIndRecevab;
		this.rcDateValeur = rcDateValeur;
	}
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegDouIndRecKey) {
			RegDouIndRecKey o = (RegDouIndRecKey) otherKey;
			return ((this.rcIndRecevab.equals(o.rcIndRecevab))
					&& (this.rcDateValeur.equals(o.rcDateValeur))
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
		return (rcIndRecevab.hashCode() + rcDateValeur.hashCode()
				+ rcCodeRegimeDouanier.hashCode() 
				+ rcTypeRegime.hashCode());
	}
	

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcIndRecevab() {
		return rcIndRecevab;
	}

	public void setRcIndRecevab(String rcIndRecevab) {
		this.rcIndRecevab = rcIndRecevab;
	}

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
	
}
