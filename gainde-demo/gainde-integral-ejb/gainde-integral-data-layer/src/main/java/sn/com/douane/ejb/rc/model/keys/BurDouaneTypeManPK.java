package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BurDouaneTypeManPK implements Serializable {

	private static final long serialVersionUID = -1077551773872010063L;
	
	
	@Column(name = "RCCODEBURDOUANE", length=3, nullable = false)
	private String rcCodeBurDouane;
	
	
	@Column(name = "RCCODETYPEMANIF", nullable = false)
	private Integer rcCodeTypeManif;
	
	/**
	 * 0-args constructor.
	 */
	public BurDouaneTypeManPK() {
		super();
	}

	public BurDouaneTypeManPK(String rcCodeBurDouane, Integer rcCodeTypeManif) {
		super();
		this.rcCodeBurDouane = rcCodeBurDouane;
		this.rcCodeTypeManif = rcCodeTypeManif;
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}

	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}

	public Integer getRcCodeTypeManif() {
		return rcCodeTypeManif;
	}

	public void setRcCodeTypeManif(Integer rcCodeTypeManif) {
		this.rcCodeTypeManif = rcCodeTypeManif;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeBurDouane == null) ? 0 : rcCodeBurDouane.hashCode());
		result = prime * result
				+ ((rcCodeTypeManif == null) ? 0 : rcCodeTypeManif.hashCode());
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
		BurDouaneTypeManPK other = (BurDouaneTypeManPK) obj;
		if (rcCodeBurDouane == null) {
			if (other.rcCodeBurDouane != null){
				return false;
			}
		} else if (!rcCodeBurDouane.equals(other.rcCodeBurDouane)){
			return false;
		}
		if (rcCodeTypeManif == null) {
			if (other.rcCodeTypeManif != null){
				return false;
			}
		} else if (!rcCodeTypeManif.equals(other.rcCodeTypeManif)){
			return false;
		}
		return true;
	}

	

}
