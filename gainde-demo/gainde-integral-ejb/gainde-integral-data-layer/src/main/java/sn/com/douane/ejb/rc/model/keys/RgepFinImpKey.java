package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RgepFinImpKey implements Serializable{

	private static final long serialVersionUID = -3730954512548311357L;

	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
	
	@Column(name="RCANNEEREGECO", length=4, nullable=false)
    private String rcAnneeRegEco;
    
	@Column(name="RCNUMREGECO", length=6, nullable=false)
    private String rcNumRegEco;
    
	@Column(name="RCCODEPROD", length=6, nullable=false)
    private String rcCodeProd;
    
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
    
	@Column(name="RCPRECSEN", length=2, nullable=false)
    private String rcPrecSen;
    
	@Column(name="RCNUMEROGAMME", nullable=false)
    private Integer rcNumeroGamme;
	
	@Column(name="RCCODEMATPREM", length=6, nullable=false)
    private String rcCodeMatPrem;
    
	@Column(name="RCPRECUEMOAMATPREM", length=2, nullable=false)
    private String rcPrecUemoAmatPrem;
    
	@Column(name="RCPRECSENMATPREM", length=2, nullable=false)
    private String rcPrecSenMatPrem;

	public RgepFinImpKey() {

	}

	public RgepFinImpKey(String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa,
			String rcPrecSen, Integer rcNumeroGamme, String rcCodeMatPrem, 
			String rcPrecUemoAmatPrem, String rcPrecSenMatPrem) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcAnneeRegEco = rcAnneeRegEco;
		this.rcNumRegEco = rcNumRegEco;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSen = rcPrecSen;
		this.rcNumeroGamme = rcNumeroGamme;
		this.rcCodeMatPrem = rcCodeMatPrem; 
		this.rcPrecUemoAmatPrem = rcPrecUemoAmatPrem; 
		this.rcPrecSenMatPrem = rcPrecSenMatPrem; 
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RgepFinImpKey) {
			RgepFinImpKey o = (RgepFinImpKey) otherKey;
			return ((this.rcCodePpm.equals(o.rcCodePpm))
					&& (this.rcAnneeRegEco.equals(o.rcAnneeRegEco))
					&& (this.rcNumRegEco.equals(o.rcNumRegEco))
					&& (this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa.equals(o.rcPrecUemoa))
					&& (this.rcPrecSen.equals(o.rcPrecSen)) 
					&& (this.rcNumeroGamme.equals(o.rcNumeroGamme))
					&& (this.rcCodeMatPrem.equals(o.rcCodeMatPrem))
					&& (this.rcPrecUemoAmatPrem.equals(o.rcPrecUemoAmatPrem))
					&& (this.rcPrecSenMatPrem.equals(o.rcPrecSenMatPrem)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodePpm.hashCode() + rcAnneeRegEco.hashCode()
				+ rcNumRegEco.hashCode() + rcCodeProd.hashCode()
				+ rcPrecUemoa.hashCode() + rcPrecSen.hashCode() 
				+ rcNumeroGamme.hashCode() + rcCodeMatPrem.hashCode()
				+ rcPrecUemoAmatPrem.hashCode() + rcPrecSenMatPrem.hashCode());
	}

	/**
	 * @return the rcCodeMatPrem
	 */
	public String getRcCodeMatPrem() {
		return rcCodeMatPrem;
	}

	/**
	 * @param rcCodeMatPrem the rcCodeMatPrem to set
	 */
	public void setRcCodeMatPrem(String rcCodeMatPrem) {
		this.rcCodeMatPrem = rcCodeMatPrem;
	}

	/**
	 * @return the rcPrecUemoAmatPrem
	 */
	public String getRcPrecUemoAmatPrem() {
		return rcPrecUemoAmatPrem;
	}

	/**
	 * @param rcPrecUemoAmatPrem the rcPrecUemoAmatPrem to set
	 */
	public void setRcPrecUemoAmatPrem(String rcPrecUemoAmatPrem) {
		this.rcPrecUemoAmatPrem = rcPrecUemoAmatPrem;
	}

	/**
	 * @return the rcPrecSenMatPrem
	 */
	public String getRcPrecSenMatPrem() {
		return rcPrecSenMatPrem;
	}

	/**
	 * @param rcPrecSenMatPrem the rcPrecSenMatPrem to set
	 */
	public void setRcPrecSenMatPrem(String rcPrecSenMatPrem) {
		this.rcPrecSenMatPrem = rcPrecSenMatPrem;
	}
	
	

}
