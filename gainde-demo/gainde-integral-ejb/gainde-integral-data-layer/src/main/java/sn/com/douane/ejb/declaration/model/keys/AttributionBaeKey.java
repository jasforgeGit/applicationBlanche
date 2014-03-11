package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class AttributionBaeKey implements Serializable{


	private static final long serialVersionUID = -2478171976502344988L;


	@Column(name = "DECANNEEDECL", length = 4,nullable = false)
	private String decAnneeDecl;
	
	
	@Column(name = "DECBURDECL", length = 3,nullable = false)
	private String decBurDecl;
	
	
	@Column(name = "DECNUMDECL",nullable = false)
	private Integer decNumDecl;


	public AttributionBaeKey(String decAnneeDecl, String decBurDecl,
			Integer decNumDecl) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decBurDecl = decBurDecl;
		this.decNumDecl = decNumDecl;
	}


	public AttributionBaeKey() {
		super();
	}


	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}


	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}


	public String getDecBurDecl() {
		return decBurDecl;
	}


	public void setDecBurDecl(String decBurDecl) {
		this.decBurDecl = decBurDecl;
	}


	public Integer getDecNumDecl() {
		return decNumDecl;
	}


	public void setDecNumDecl(Integer decNumDecl) {
		this.decNumDecl = decNumDecl;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((decAnneeDecl == null) ? 0 : decAnneeDecl.hashCode());
		result = prime * result
				+ ((decBurDecl == null) ? 0 : decBurDecl.hashCode());
		result = prime * result
				+ ((decNumDecl == null) ? 0 : decNumDecl.hashCode());
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
		AttributionBaeKey other = (AttributionBaeKey) obj;
		if (decAnneeDecl == null) {
			if (other.decAnneeDecl != null){
				return false;
			}
		} else if (!decAnneeDecl.equals(other.decAnneeDecl)){
			return false;
		}
		if (decBurDecl == null) {
			if (other.decBurDecl != null){
				return false;
			}
		} else if (!decBurDecl.equals(other.decBurDecl)){
			return false;
		}
		if (decNumDecl == null) {
			if (other.decNumDecl != null){
				return false;
			}
		} else if (!decNumDecl.equals(other.decNumDecl)){
			return false;
		}
		return true;
	}
	
	
	
	
	
	
	
}
