package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class HreglementImportKey implements Serializable{


	
	private static final long serialVersionUID = 202533000469517148L;

	@Column(name = "RCCODEPROD",length = 6,nullable = false)
	private String rccodeprod;	
	
	@Column(name = "RCPRECUEMOA",length = 2,nullable = false)
    private String rcprecuemoa;	
	
	@Column(name = "RCPRECSENEGAL",length = 2,nullable = false)
    private String rcprecsenegal;	
	
	@Column(name = "RCCODEIMP",length = 1,nullable = false)
    private String rccodeimp;	
	
	@Column(name = "RCCODEUSERMAJ",length = 8,nullable = false)
    private String rccodeusermaj;	
	
	@Column(name = "RCTERMINALMAJ",length = 70,nullable = false)
    private String rcterminalmaj;	
	
	@Column(name = "RCDATEMAJ",nullable = false)
	private Date rcdatemaj;    
	
	public HreglementImportKey(){
		
	}
	
	public HreglementImportKey(String rccodeprod, String rcprecuemoa,String rcprecsenegal, String rccodeimp,
				String rccodeusermaj, String rcterminalmaj,Date rcdatemaj) {
			super(); 
			this.rccodeprod = rccodeprod;
			this.rcprecuemoa = rcprecuemoa;
			this.rcprecsenegal = rcprecsenegal;
			this.rccodeimp = rccodeimp;
			this.rccodeusermaj = rccodeusermaj;
			this.rcterminalmaj = rcterminalmaj;
			this.rcdatemaj = rcdatemaj;
	 }
    
	public String getRccodeprod() {
		return rccodeprod;
	}
	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}
	public String getRcprecuemoa() {
		return rcprecuemoa;
	}
	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}
	public String getRcprecsenegal() {
		return rcprecsenegal;
	}
	public void setRcprecsenegal(String rcprecsenegal) {
		this.rcprecsenegal = rcprecsenegal;
	}
	public String getRccodeimp() {
		return rccodeimp;
	}
	public void setRccodeimp(String rccodeimp) {
		this.rccodeimp = rccodeimp;
	}
	public String getRccodeusermaj() {
		return rccodeusermaj;
	}
	public void setRccodeusermaj(String rccodeusermaj) {
		this.rccodeusermaj = rccodeusermaj;
	}
	public String getRcterminalmaj() {
		return rcterminalmaj;
	}
	public void setRcterminalmaj(String rcterminalmaj) {
		this.rcterminalmaj = rcterminalmaj;
	}
	public Date getRcdatemaj() {
		return rcdatemaj;
	}
	public void setRcdatemaj(Date rcdatemaj) {
		this.rcdatemaj = rcdatemaj;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rccodeimp == null) ? 0 : rccodeimp.hashCode());
		result = prime * result
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
		result = prime * result
				+ ((rccodeusermaj == null) ? 0 : rccodeusermaj.hashCode());
		result = prime * result
				+ ((rcdatemaj == null) ? 0 : rcdatemaj.hashCode());
		result = prime * result
				+ ((rcprecsenegal == null) ? 0 : rcprecsenegal.hashCode());
		result = prime * result
				+ ((rcprecuemoa == null) ? 0 : rcprecuemoa.hashCode());
		result = prime * result
				+ ((rcterminalmaj == null) ? 0 : rcterminalmaj.hashCode());
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
		HreglementImportKey other = (HreglementImportKey) obj;
		if (rccodeimp == null) {
			if (other.rccodeimp != null){
				return false;
			}
		} else if (!rccodeimp.equals(other.rccodeimp)){
			return false;
		}
		if (rccodeprod == null) {
			if (other.rccodeprod != null){
				return false;
			}
		} else if (!rccodeprod.equals(other.rccodeprod)){
			return false;
		}
		if (rccodeusermaj == null) {
			if (other.rccodeusermaj != null){
				return false;
			}
		} else if (!rccodeusermaj.equals(other.rccodeusermaj)){
			return false;
		}
		if (rcdatemaj == null) {
			if (other.rcdatemaj != null){
				return false;
			}
		} else if (!rcdatemaj.equals(other.rcdatemaj)){
			return false;
		}
		if (rcprecsenegal == null) {
			if (other.rcprecsenegal != null){
				return false;
			}
		} else if (!rcprecsenegal.equals(other.rcprecsenegal)){
			return false;
		}
		if (rcprecuemoa == null) {
			if (other.rcprecuemoa != null){
				return false;
			}
		} else if (!rcprecuemoa.equals(other.rcprecuemoa)){
			return false;
		}
		if (rcterminalmaj == null) {
			if (other.rcterminalmaj != null){
				return false;
			}
		} else if (!rcterminalmaj.equals(other.rcterminalmaj)){
			return false;
		}
		return true;
	}
    
    
    
    
    
	
}
