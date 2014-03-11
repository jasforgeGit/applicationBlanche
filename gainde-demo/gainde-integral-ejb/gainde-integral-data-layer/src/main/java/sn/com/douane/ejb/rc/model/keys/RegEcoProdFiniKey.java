package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegEcoProdFiniKey implements Serializable{

	private static final long serialVersionUID = -6093502924714989434L;
	
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
    
	@Column(name="RCNUMGAMME", nullable=false)
    private Integer rcNumGamme;

	
	public RegEcoProdFiniKey() {

	}

	public RegEcoProdFiniKey(String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa,
			String rcPrecSen, Integer rcNumGamme) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcAnneeRegEco = rcAnneeRegEco;
		this.rcNumRegEco = rcNumRegEco;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSen = rcPrecSen;
		this.rcNumGamme = rcNumGamme;
	}
	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegEcoProdFiniKey) {
			RegEcoProdFiniKey o = (RegEcoProdFiniKey) otherKey;
			return ((this.rcCodePpm.equals(o.rcCodePpm))
					&& (this.rcAnneeRegEco.equals(o.rcAnneeRegEco))
					&& (this.rcNumRegEco.equals(o.rcNumRegEco))
					&& (this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa.equals(o.rcPrecUemoa))
					&& (this.rcPrecSen.equals(o.rcPrecSen)) 
					&& (this.rcNumGamme.equals(o.rcNumGamme)));
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
				+ rcNumGamme.hashCode());
	}
	
	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcAnneeRegEco() {
		return rcAnneeRegEco;
	}

	public void setRcAnneeRegEco(String rcAnneeRegEco) {
		this.rcAnneeRegEco = rcAnneeRegEco;
	}

	public String getRcNumRegEco() {
		return rcNumRegEco;
	}

	public void setRcNumRegEco(String rcNumRegEco) {
		this.rcNumRegEco = rcNumRegEco;
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

	public String getRcPrecSen() {
		return rcPrecSen;
	}

	public void setRcPrecSen(String rcPrecSen) {
		this.rcPrecSen = rcPrecSen;
	}

	public Integer getRcNumGamme() {
		return rcNumGamme;
	}

	public void setRcNumGamme(Integer rcNumGamme) {
		this.rcNumGamme = rcNumGamme;
	}
	
}
