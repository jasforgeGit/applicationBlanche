package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class TaxesRegimeKey implements Serializable{

	private static final long serialVersionUID = -7716020222845023398L;

	@Column(name="RCTYPEREGIMEDOUANIER", length=1, nullable=false)
	private String rcTypeRegime;
	
	@Column(name="RCREGIMEDOUANIER" , length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Column(name="RCREGIMEFISCAL" , length=2, nullable=false)
	private String rcRegimeFiscal; 
	
	@Column(name="RCCODETAXE", length=2, nullable=false)
	private String rcCodeTaxes; 
	
	@Column(name="RCDATEVALEUR", nullable=false)
	private Date rcDateValeur;
	
	/**
	 * Creates an empty key for Entity Bean: Taxesregime
	 */
	public TaxesRegimeKey() {
	}

	public TaxesRegimeKey(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcRegimeFiscal, String rcCodeTaxes, Date rcDateValeur) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcRegimeFiscal = rcRegimeFiscal;
		this.rcCodeTaxes = rcCodeTaxes;
		this.rcDateValeur = rcDateValeur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof TaxesRegimeKey) {
			TaxesRegimeKey o = (TaxesRegimeKey) otherKey;
			return ((this.rcTypeRegime.equals(o.rcTypeRegime))
				&& (this.rcCodeRegimeDouanier
					.equals(o.rcCodeRegimeDouanier))
				&& (this.rcRegimeFiscal
					.equals(o.rcRegimeFiscal))
				&& (this.rcCodeTaxes
					.equals(o.rcCodeTaxes))
				&& (this.rcDateValeur
						.equals(o.rcDateValeur)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeRegime.hashCode()
			+ rcCodeRegimeDouanier.hashCode()
			+ rcRegimeFiscal.hashCode()
			+ rcCodeTaxes.hashCode() 
			+ rcDateValeur.hashCode());
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

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public String getRcCodeTaxes() {
		return rcCodeTaxes;
	}

	public void setRcCodeTaxes(String rcCodeTaxes) {
		this.rcCodeTaxes = rcCodeTaxes;
	}

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}


}
