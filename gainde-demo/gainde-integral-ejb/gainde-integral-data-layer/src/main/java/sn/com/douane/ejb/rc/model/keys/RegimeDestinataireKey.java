package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class RegimeDestinataireKey implements Serializable{

	private static final long serialVersionUID = -5824445399766622800L;

	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;	
	
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	@Column(name="RCCODEREGIMEFISCAL", length=2, nullable=false)
	private String rcCodeRegimeFiscal;
	
	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
	
	public RegimeDestinataireKey() {
	}

	public RegimeDestinataireKey(String rcTypeRegime,
			String rcCodeRegimeDouanier, String rcCodeRegimeFiscal,
			String rcCodePpm) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcCodePpm = rcCodePpm;
	}

	public int hashCode() {

		return ( rcCodePpm.hashCode()
				+rcCodeRegimeFiscal.hashCode()
				+  rcTypeRegime.hashCode());
	}

	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegimeDestinataireKey) {
			RegimeDestinataireKey o = (RegimeDestinataireKey) otherKey;
			return ((this.rcCodePpm
				.equals(o.rcCodePpm))
				&& (this.rcCodeRegimeFiscal
					.equals(o.rcCodeRegimeFiscal))
				&& (this.rcTypeRegime
					.equals(o.rcTypeRegime)) && (this.rcCodeRegimeDouanier
				.equals(o.rcCodeRegimeDouanier)));
		}
		return false;
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

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}
	
}
