package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegimeEconomiqueKey implements Serializable{

	
	private static final long serialVersionUID = -1125465020612145777L;
	
	@Column(name = "RCANNEEREGECO",length = 4,nullable = false)
	private java.lang.String rcanneeregeco;
	
	@Column(name = "RCNUMREGECO",length = 6,nullable = false)
	private java.lang.String rcnumregeco;
	
	public RegimeEconomiqueKey(){
		
	}

	public RegimeEconomiqueKey(String rcanneeregeco, String rcnumregeco) {
		super();
		this.rcanneeregeco = rcanneeregeco;
		this.rcnumregeco = rcnumregeco;
	}

	public java.lang.String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(java.lang.String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public java.lang.String getRcnumregeco() {
		return rcnumregeco;
	}

	public void setRcnumregeco(java.lang.String rcnumregeco) {
		this.rcnumregeco = rcnumregeco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcanneeregeco == null) ? 0 : rcanneeregeco.hashCode());
		result = prime * result
				+ ((rcnumregeco == null) ? 0 : rcnumregeco.hashCode());
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
		RegimeEconomiqueKey other = (RegimeEconomiqueKey) obj;
		if (rcanneeregeco == null) {
			if (other.rcanneeregeco != null){
				return false;
			}
		} else if (!rcanneeregeco.equals(other.rcanneeregeco)){
			return false;
		}
		if (rcnumregeco == null) {
			if (other.rcnumregeco != null){
				return false;
			}
		} else if (!rcnumregeco.equals(other.rcnumregeco)){
			return false;
		}
		return true;
	}
		
	
	

	
	
}
