package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegimeDouanierKey implements Serializable {

	private static final long serialVersionUID = -3602024881705410273L;
	
	
	/**
	 * Implementation field for persistent attribute: rcTypeRegime
	 */
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;

	/**
	 * Implementation field for persistent attribute: rcCodeRegimeDouanier
	 */
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier;
	
	public RegimeDouanierKey() {
		
	}
	
	public RegimeDouanierKey( String rcTypeRegime,String rcCodeRegimeDouanier) {
		super();
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}
	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}
	public String getRcTypeRegime() {
		return rcTypeRegime;
	}
	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}
}
