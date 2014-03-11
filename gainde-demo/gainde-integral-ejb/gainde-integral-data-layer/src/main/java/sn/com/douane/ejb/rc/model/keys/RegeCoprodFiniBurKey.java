package sn.com.douane.ejb.rc.model.keys;

import javax.persistence.Column;

/**
 * Key class for Entity Bean : Regecoprodfinibur
 */
public class RegeCoprodFiniBurKey implements java.io.Serializable {

	static final long serialVersionUID = 3206093459760846163L;
	
	@Column(name = "RCANNEEREGECO", length = 4, nullable = false)	
	private String rcanneeregeco;
		
	@Column(name = "RCCODEPPM", length = 5, nullable = false)	
	private String rccodeppm;
	
	@Column(name = "RCCODEREGECO", length = 6, nullable = false)
	private String rccoderegeco;
	
	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rccodeprod;
	
	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcprecuemoa;
	
	@Column(name = "RCCODEBUREAU", length = 3, nullable = false)
	private String rccodeburdouane;
	
	@Column(name = "RCPRECSEN", length = 2, nullable = false)
	private String rcprecsenegal;
	
	/**
	 * 0-args constructor.
	 */
	public RegeCoprodFiniBurKey() {	
		super();
	}
	
	/**
	 * 6-args constructor.
	 * 
	 * @param rcanneeregeco
	 * @param rccoderegeco
	 * @param rccodeburdouane
	 * @param rccodeprod
	 * @param rcprecuemoa
	 * @param rcprecsenegal
	 */
	public RegeCoprodFiniBurKey(String rcanneeregeco, String rccoderegeco,
			String rccodeburdouane, String rccodeprod, String rcprecuemoa,
			String rcprecsenegal, String rccodeppm) {
		super();
		this.rcanneeregeco = rcanneeregeco;
		this.rccoderegeco = rccoderegeco;
		this.rccodeburdouane = rccodeburdouane;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
		this.rccodeppm = rccodeppm;
	}

	public String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(java.lang.String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public String getRccoderegeco() {
		return rccoderegeco;
	}

	public void setRccoderegeco(java.lang.String rccoderegeco) {
		this.rccoderegeco = rccoderegeco;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcanneeregeco == null) ? 0 : rcanneeregeco.hashCode());
		result = prime * result
				+ ((rccodeburdouane == null) ? 0 : rccodeburdouane.hashCode());
		result = prime * result
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
		result = prime * result
				+ ((rccoderegeco == null) ? 0 : rccoderegeco.hashCode());
		result = prime * result
				+ ((rcprecsenegal == null) ? 0 : rcprecsenegal.hashCode());
		result = prime * result
				+ ((rcprecuemoa == null) ? 0 : rcprecuemoa.hashCode());
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
		RegeCoprodFiniBurKey other = (RegeCoprodFiniBurKey) obj;
		if (rcanneeregeco == null) {
			if (other.rcanneeregeco != null){
				return false;
			}
		} else if (!rcanneeregeco.equals(other.rcanneeregeco)){
			return false;
		}
		if (rccodeburdouane == null) {
			if (other.rccodeburdouane != null){
				return false;
			}
		} else if (!rccodeburdouane.equals(other.rccodeburdouane)){
			return false;
		}
		if (rccodeprod == null) {
			if (other.rccodeprod != null){
				return false;
			}
		} else if (!rccodeprod.equals(other.rccodeprod)){
			return false;
		}
		if (rccoderegeco == null) {
			if (other.rccoderegeco != null){
				return false;
			}
		} else if (!rccoderegeco.equals(other.rccoderegeco)){
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
		return true;
	}

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
	}	
}