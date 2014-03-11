package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class TaxesRegDouKey implements Serializable{
	
	private static final long serialVersionUID = -8919141635419675254L;

	@Column(name="RCCODETAXE", length=2, nullable=false)
	private  String rcCodeTaxe; 
	
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Column(name="RCCODEREGIMEDOUNIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;
	
	public TaxesRegDouKey() {
		
	}

	public TaxesRegDouKey(String rcCodeTaxe, String rcTypeRegime,
			String rcCodeRegimeDouanier, Date rcDateValeur) {
		super();
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcDateValeur = rcDateValeur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof TaxesRegDouKey) {
			TaxesRegDouKey o = (TaxesRegDouKey) otherKey;
			return ((this.rcDateValeur.equals(o.rcDateValeur))
					&& (this.rcCodeTaxe
							.equals(o.rcCodeTaxe))
					&& (this.rcTypeRegime
							.equals(o.rcTypeRegime)) && (this.rcCodeRegimeDouanier
					.equals(o.rcCodeRegimeDouanier)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcDateValeur.hashCode() + rcCodeTaxe.hashCode()
				+ rcCodeRegimeDouanier.hashCode() + rcTypeRegime
				.hashCode());
	}


	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
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

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}
	
	

}
