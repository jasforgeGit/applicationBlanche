package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

/**
 * 
 * @author nesrine
 *
 */
public class IndicateurRegdouKey implements Serializable {

	private static final long serialVersionUID = 1311975124485376022L;
	
	/**
	 * Implementation field for persistent attribute: rcTypeRegime
	 */
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	/**
	 * Implementation field for persistent attribute:rcCodeRegimeDouanier
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	/**
	 * Implementation field for persistent attribute: rcCodeIndicateur
	 */
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;
	
	/**
	 * Implementation field for persistent attribute: rcDateValidite
	 */
	private Date rcDateValidite;
	
	public IndicateurRegdouKey() {
		
	}

	public IndicateurRegdouKey(Date rcDateValidite, String rcCodeIndicateur,
			String rcCodeRegimeDouanier, String rcTypeRegime) {
		super();
		this.rcDateValidite = rcDateValidite;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcTypeRegime = rcTypeRegime;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof IndicateurRegdouKey) {
			IndicateurRegdouKey o = (IndicateurRegdouKey) otherKey;
			return ((this.rcDateValidite.equals(o.rcDateValidite))
					&& (this.rcCodeIndicateur
							.equals(o.rcCodeIndicateur))
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
		return (rcDateValidite.hashCode()
				+ rcCodeIndicateur.hashCode()
				+ rcCodeRegimeDouanier.hashCode() + rcTypeRegime
				.hashCode());
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
	
}
