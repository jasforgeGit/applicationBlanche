package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class TaxesSuspendusKey implements Serializable{

	private static final long serialVersionUID = 1323777545322262199L;

	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;

	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;

	@Column(name="RCCODETAXE", length=2, nullable=false)
	private String rcCodeTaxe; 
	
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;

	public TaxesSuspendusKey() {
	}

	public TaxesSuspendusKey(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeRegimeFiscal, String rcCodeTaxe,
			String rcCodeIndicateur) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof TaxesSuspendusKey) {
			TaxesSuspendusKey o = (TaxesSuspendusKey) otherKey;
			return ((this.rcTypeRegime.equals(o.rcTypeRegime))
					&& (this.rcCodeRegimeDouanier
							.equals(o.rcCodeRegimeDouanier))
					&& (this.rcCodeRegimeFiscal.equals(o.rcCodeRegimeFiscal))
					&& (this.rcCodeTaxe.equals(o.rcCodeTaxe)) && (this.rcCodeIndicateur
					.equals(o.rcCodeIndicateur)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcTypeRegime.hashCode() + rcCodeRegimeDouanier.hashCode()
				+ rcCodeRegimeFiscal.hashCode()
				+ rcCodeTaxe.hashCode() 
				+ rcCodeIndicateur.hashCode());
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

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	} 
}
