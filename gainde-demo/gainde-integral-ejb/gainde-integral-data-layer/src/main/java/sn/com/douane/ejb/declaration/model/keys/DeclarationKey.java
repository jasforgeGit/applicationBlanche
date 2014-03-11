package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class DeclarationKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6315549980200101686L;
	
	
	
	@Column(name = "ANDCL", columnDefinition = "CHAR(4)", nullable = false)
	private String anDcl;
	
	@Column(name = "BUR", columnDefinition = "CHAR(3)", nullable = false)
	private String bur;
	
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;	
	

	public DeclarationKey() {
		super();
	}

	public DeclarationKey(String anDcl, String bur, Integer numDcl) {
		super();
		this.anDcl = anDcl;
		this.bur = bur;
		this.numDcl = numDcl;
	}

	public String getAnDcl() {
		return anDcl;
	}

	public void setAnDcl(String anDcl) {
		this.anDcl = anDcl;
	}

	public String getBur() {
		return bur;
	}

	public void setBur(String bur) {
		this.bur = bur;
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
		result = prime * result + ((bur == null) ? 0 : bur.hashCode());
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
		DeclarationKey other = (DeclarationKey) obj;
		if (anDcl == null) {
			if (other.anDcl != null){
				return false;
			}
		} else if (!anDcl.equals(other.anDcl)){
			return false;
		}
		if (bur == null) {
			if (other.bur != null){
				return false;
			}
		} else if (!bur.equals(other.bur)){
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
