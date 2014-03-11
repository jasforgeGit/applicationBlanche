package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BasesTaxableKey implements Serializable{


	private static final long serialVersionUID = 4364017236356768251L;

	@Column(name = "RCCODETAXE",length = 2,nullable = false)
	private String rcCodeTaxe;
	
	@Column(name = "RCCODETAXEBASE",length = 2,nullable = false)
	private String rcCodeTaxeBase;

	
	public BasesTaxableKey() {
	}

	public BasesTaxableKey(String rcCodeTaxe, String rcCodeTaxeBase) {
		super(); 
		this.rcCodeTaxe = rcCodeTaxe; 
		this.rcCodeTaxeBase = rcCodeTaxeBase; 
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeTaxeBase() {
		return rcCodeTaxeBase;
	}

	public void setRcCodeTaxeBase(String rcCodeTaxeBase) {
		this.rcCodeTaxeBase = rcCodeTaxeBase;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeTaxe == null) ? 0 : rcCodeTaxe.hashCode());
		result = prime * result
				+ ((rcCodeTaxeBase == null) ? 0 : rcCodeTaxeBase.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		BasesTaxableKey other = (BasesTaxableKey) obj;
		if (rcCodeTaxe == null) {
			if (other.rcCodeTaxe != null){
				return false;}
		} else if (!rcCodeTaxe.equals(other.rcCodeTaxe)){
			return false;}
		if (rcCodeTaxeBase == null) {
			if (other.rcCodeTaxeBase != null){
				return false;}
		} else if (!rcCodeTaxeBase.equals(other.rcCodeTaxeBase)){
			return false;}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}