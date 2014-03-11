package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class SoumissionProduitKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1912945047809119976L;

	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd;
    
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
    
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal;
	
	@Column(name="RCCODEINDICATEUR", length=15)
	private String rcCodeIndicateur; 
    
	@Column(name="RCDATEVALIDITE", nullable=false)
	private Date rcDateValidite;

	public SoumissionProduitKey() {
		
	}
	
	public SoumissionProduitKey(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeIndicateur, Date rcDateValidite) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof SoumissionProduitKey) {
			SoumissionProduitKey o = (SoumissionProduitKey) otherKey;
			return ((this.rcDateValidite.equals(o.rcDateValidite))
					&& (this.rcCodeProd
							.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa
							.equals(o.rcPrecUemoa))
					&& (this.rcPrecSenegal
							.equals(o.rcPrecSenegal)) 
					&& (this.rcCodeIndicateur
							.equals(o.rcCodeIndicateur)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcDateValidite.hashCode()
				+ rcCodeProd.hashCode()
				+ rcPrecUemoa.hashCode()
				+ rcPrecSenegal.hashCode() 
				+ rcCodeIndicateur.hashCode());
	}
	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
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
