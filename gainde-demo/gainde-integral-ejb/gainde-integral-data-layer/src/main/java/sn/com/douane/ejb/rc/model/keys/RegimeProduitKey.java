package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegimeProduitKey implements Serializable {

	private static final long serialVersionUID = 1509953691357126445L;

	/**
	 * Implementation field for persistent attribute: 
	 */
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	
	/**
	 * Implementation field for persistent attribute: 
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	/**
	 * Implementation field for persistent attribute: 
	 */
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;
	
	/**
	 * Implementation field for persistent attribute: 
	 */
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd;

	/**
	 * Implementation field for persistent attribute: rcPrecuemoa
	 */
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
	private String rcPrecuemoa;

	/**
	 * Implementation field for persistent attribute:
	 */
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
	private String rcPrecSenegal;
	
	
	/**
	 * Creates an empty key for Entity Bean: Regimeproduit
	 */
	public RegimeProduitKey() {
	}
	
	/**
	 * 
	 * @param rcCodeProd
	 * @param rcPrecuemoa
	 * @param rcPrecSenegal
	 * @param rcCodeRegimeFiscal
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 */
	public RegimeProduitKey(String rcCodeProd, String rcPrecuemoa,
			String rcPrecSenegal, String rcCodeRegimeFiscal,
			String rcTypeRegime, String rcCodeRegimeDouanier) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecuemoa = rcPrecuemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}



	public String getRcCodeProd() {
		return rcCodeProd;
	}
	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}
	public String getRcPrecuemoa() {
		return rcPrecuemoa;
	}
	public void setRcPrecuemoa(String rcPrecuemoa) {
		this.rcPrecuemoa = rcPrecuemoa;
	}
	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}
	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}
	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}
	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
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
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegimeProduitKey) {
			RegimeProduitKey o = (RegimeProduitKey) otherKey;
			return ((this.rcCodeProd
				.equals(o.rcCodeProd))
				&& (this.rcPrecuemoa
					.equals(o.rcPrecuemoa))
				&& (this.rcPrecSenegal
					.equals(o.rcPrecSenegal))
				&& (this.rcCodeRegimeFiscal
					.equals(o.rcCodeRegimeFiscal))
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
		return (rcCodeProd.hashCode()
			+ rcPrecuemoa.hashCode()
			+ rcPrecSenegal.hashCode()
			+ rcCodeRegimeFiscal.hashCode()
			+ rcCodeRegimeDouanier.hashCode()
			+ rcTypeRegime
			.hashCode());
	}
	
}
