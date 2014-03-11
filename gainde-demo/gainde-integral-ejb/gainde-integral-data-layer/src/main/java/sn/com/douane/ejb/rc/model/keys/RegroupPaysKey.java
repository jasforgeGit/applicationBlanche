package sn.com.douane.ejb.rc.model.keys;

import javax.persistence.Column;

public class RegroupPaysKey implements java.io.Serializable {


	private static final long serialVersionUID = 6366447268144208061L;
	
	@Column(name = "RCCODEREGROUP",length = 10,nullable = false)
	private String rcCodeRegroup;	
	
	@Column(name = "RCCODEPAYS",length = 3,nullable = false)
	private String rcCodePays;
	
	public RegroupPaysKey(){
		
	}
	
	
	public RegroupPaysKey(String rcCodeRegroup,String rcCodePays){
		super();
		this.rcCodeRegroup=rcCodeRegroup;
		this.rcCodePays=rcCodePays;
		
	}
	
	public String getRcCodeRegroup() {
		return rcCodeRegroup;
	}


	public void setRcCodeRegroup(String rcCodeRegroup) {
		this.rcCodeRegroup = rcCodeRegroup;
	}


	public String getRcCodePays() {
		return rcCodePays;
	}


	public void setRcCodePays(String rcCodePays) {
		this.rcCodePays = rcCodePays;
	}
	
	public boolean equals(Object key) {
		if (key instanceof RegroupPaysKey) {
			RegroupPaysKey o = (RegroupPaysKey) key;
			return ((this.rcCodeRegroup.equals(o.rcCodeRegroup)) 
			&& (this.rcCodePays.equals(o.rcCodePays)));
		}
		return false;
	}
	
	public int hashCode() {
		return (rcCodePays.hashCode() + rcCodeRegroup.hashCode());
	}

}
