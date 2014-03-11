package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ExclusionPpmKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3590236952080149456L;

	@Column(name = "CODEBUREAU", length = 3, nullable = false)
	private String codeBureau;

	@Column(name = "CODEPPM", length = 5, nullable = false)
	private String codePpm;

	public ExclusionPpmKey(String codeBureau, String codePpm) {
		super();
		this.codeBureau = codeBureau;
		this.codePpm = codePpm;
	}

	public ExclusionPpmKey() {
		super();
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodePpm() {
		return codePpm;
	}

	public void setCodePpm(String codePpm) {
		this.codePpm = codePpm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result + ((codePpm == null) ? 0 : codePpm.hashCode());
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
		ExclusionPpmKey other = (ExclusionPpmKey) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codePpm == null) {
			if (other.codePpm != null){
				return false;
			}
		} else if (!codePpm.equals(other.codePpm)){
			return false;
		}
		return true;
	}
	
	

}
