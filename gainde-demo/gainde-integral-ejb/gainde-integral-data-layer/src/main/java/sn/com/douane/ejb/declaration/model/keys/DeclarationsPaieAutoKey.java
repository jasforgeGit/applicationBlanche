package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class DeclarationsPaieAutoKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2817378591961561142L;

	@Column(name = "ANDCL", columnDefinition = "CHAR(4)", nullable = false)
	private String anDcl;

	@Column(name = "BURDCL", columnDefinition = "CHAR(3)", nullable = false)
	private String burDcl;

	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;

	
	
	public DeclarationsPaieAutoKey() {
		super();
	}

	public DeclarationsPaieAutoKey(String anDcl, String burDcl, Integer numDcl) {
		super();
		this.anDcl = anDcl;
		this.burDcl = burDcl;
		this.numDcl = numDcl;
	}

	public String getAnDcl() {
		return anDcl;
	}

	public void setAnDcl(String anDcl) {
		this.anDcl = anDcl;
	}

	public String getBurDcl() {
		return burDcl;
	}

	public void setBurDcl(String burDcl) {
		this.burDcl = burDcl;
	}

	public Integer getNumDcl() {
		return numDcl;
	}

	public void setNumDcl(Integer numDcl) {
		this.numDcl = numDcl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anDcl == null) ? 0 : anDcl.hashCode());
		result = prime * result + ((burDcl == null) ? 0 : burDcl.hashCode());
		result = prime * result + ((numDcl == null) ? 0 : numDcl.hashCode());
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
		DeclarationsPaieAutoKey other = (DeclarationsPaieAutoKey) obj;
		if (anDcl == null) {
			if (other.anDcl != null){
				return false;
			}
		} else if (!anDcl.equals(other.anDcl)){
			return false;
		}
		if (burDcl == null) {
			if (other.burDcl != null){
				return false;
			}
		} else if (!burDcl.equals(other.burDcl)){
			return false;
		}
		if (numDcl == null) {
			if (other.numDcl != null){
				return false;
			}
		} else if (!numDcl.equals(other.numDcl)){
			return false;
		}
		return true;
	}
	
	
	
	
	

}
