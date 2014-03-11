package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RegimeBurInterditPK implements Serializable {
		
	private static final long serialVersionUID = 372169572131885716L;

	@Column(name = "RCTYPEREGIME", nullable=false, length = 1)	
	private String rcTypeRegime;
	
	@Column(name = "RCCODEBUREAU", nullable=false, length = 3)	
	private String rcCodeBurDouane;

	@Column(name = "RCREGIMEDOUANIER", nullable=false, length = 1)	
	private String rcCodeRegimeDouanier;

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}

	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public RegimeBurInterditPK(String rcTypeRegime, String rcCodeBurDouane,
			String rcCodeRegimeDouanier) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeBurDouane = rcCodeBurDouane;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeBurDouane == null) ? 0 : rcCodeBurDouane.hashCode());
		result = prime
				* result
				+ ((rcCodeRegimeDouanier == null) ? 0 : rcCodeRegimeDouanier
						.hashCode());
		result = prime * result
				+ ((rcTypeRegime == null) ? 0 : rcTypeRegime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		RegimeBurInterditPK other = (RegimeBurInterditPK) obj;
		if (rcCodeBurDouane == null) {
			if (other.rcCodeBurDouane != null){
				return false;
			}
		} else if (!rcCodeBurDouane.equals(other.rcCodeBurDouane)){
			return false;
		}
		if (rcCodeRegimeDouanier == null) {
			if (other.rcCodeRegimeDouanier != null){
				return false;
			}
		} else if (!rcCodeRegimeDouanier.equals(other.rcCodeRegimeDouanier)){
			return false;
		}
		if (rcTypeRegime == null) {
			if (other.rcTypeRegime != null){
				return false;
			}
		} else if (!rcTypeRegime.equals(other.rcTypeRegime)){
			return false;
		}
		return true;
	}
	
	

}
