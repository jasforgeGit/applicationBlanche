package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class TitreExonerationKey implements Serializable {

	private static final long serialVersionUID = -4253280583625327772L;

	@Column(name = "RCANNEETITREEXO", length = 4, nullable = false)
	private String rcAnneeTitreExo;

	@Column(name = "RCBURFRANCHISE", length = 2, nullable = false)
	private String rcBurFranchise;

	@Column(name = "RCNUMTITREEXO", nullable = false)
	private Integer rcNumTitreExo;

	public TitreExonerationKey() {

	}

	public TitreExonerationKey(String rcAnneeTitreExo, String rcBurFranchise,
			Integer rcNumTitreExo) {
		super();
		this.rcAnneeTitreExo = rcAnneeTitreExo;
		this.rcBurFranchise = rcBurFranchise;
		this.rcNumTitreExo = rcNumTitreExo;
	}

	public String getRcAnneeTitreExo() {
		return rcAnneeTitreExo;
	}

	public void setRcAnneeTitreExo(String rcAnneeTitreExo) {
		this.rcAnneeTitreExo = rcAnneeTitreExo;
	}

	public String getRcBurFranchise() {
		return rcBurFranchise;
	}

	public void setRcBurFranchise(String rcBurFranchise) {
		this.rcBurFranchise = rcBurFranchise;
	}

	public Integer getRcNumTitreExo() {
		return rcNumTitreExo;
	}

	public void setRcNumTitreExo(Integer rcNumTitreExo) {
		this.rcNumTitreExo = rcNumTitreExo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcAnneeTitreExo == null) ? 0 : rcAnneeTitreExo.hashCode());
		result = prime * result
				+ ((rcBurFranchise == null) ? 0 : rcBurFranchise.hashCode());
		result = prime * result
				+ ((rcNumTitreExo == null) ? 0 : rcNumTitreExo.hashCode());
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
		TitreExonerationKey other = (TitreExonerationKey) obj;
		if (rcAnneeTitreExo == null) {
			if (other.rcAnneeTitreExo != null){
				return false;
			}
		} else if (!rcAnneeTitreExo.equals(other.rcAnneeTitreExo)){
			return false;
		}
		if (rcBurFranchise == null) {
			if (other.rcBurFranchise != null){
				return false;
			}
		} else if (!rcBurFranchise.equals(other.rcBurFranchise)){
			return false;
		}
		if (rcNumTitreExo == null) {
			if (other.rcNumTitreExo != null){
				return false;
			}
		} else if (!rcNumTitreExo.equals(other.rcNumTitreExo)){
			return false;
		}
		return true;
	}

}
