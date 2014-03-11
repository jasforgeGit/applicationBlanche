package sn.com.douane.ejb.rc.model.keys;

/**
 * Key class for Entity Bean BureauDouaneTypeManifeste.
 */
public class BureauDouaneTypeManifesteKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;	

	/**
	 * Implementation field for persistent attribute ce_burtypmanbur_rccodeburdouane
	 */
	private String rccodeburdouane;

	/**
	 * Implementation field for persistent attribute:
	 * ce_burdtypmantype_rccodetypemanif
	 */
	private Integer rccodetypemanif;		

	/**
	 * 0-args constructor.
	 */
	public BureauDouaneTypeManifesteKey() {	}

	/**
	 * 2-args constructor.
	 * 
	 * @param rccodeburdouane
	 * @param rccodetypemanif
	 */
	public BureauDouaneTypeManifesteKey(String rccodeburdouane,
			Integer rccodetypemanif) {
		super();
		this.rccodeburdouane = rccodeburdouane;
		this.rccodetypemanif = rccodetypemanif;
	}
	
	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
	}
	
	public Integer getRccodetypemanif() {
		return rccodetypemanif;
	}

	public void setRccodetypemanif(Integer rccodetypemanif) {
		this.rccodetypemanif = rccodetypemanif;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rccodeburdouane == null) ? 0 : rccodeburdouane.hashCode());
		result = prime * result
				+ ((rccodetypemanif == null) ? 0 : rccodetypemanif.hashCode());
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
		BureauDouaneTypeManifesteKey other = (BureauDouaneTypeManifesteKey) obj;
		if (rccodeburdouane == null) {
			if (other.rccodeburdouane != null){
				return false;
			}
		} else if (!rccodeburdouane.equals(other.rccodeburdouane)){
			return false;
		}
		if (rccodetypemanif == null) {
			if (other.rccodetypemanif != null){
				return false;
			}
		} else if (!rccodetypemanif.equals(other.rccodetypemanif)){
			return false;
		}
		return true;
	}	

}