package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


/**
 * Key class for Entity Bean: Reprodfinibur
 */
public class ReprodFiniBurKey implements Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	@Column(name = "RCCODEPPM", nullable = false, length = 5)
	private String rccodeppm;
	
	@Column(name = "RCANNEEREGECO", nullable = false, length = 4)
    private String rcanneeregeco;
  
	@Column(name = "RCCODEREGECO", nullable = false, length = 6)
    private String rccoderegeco;
   
	@Column(name = "RCCODEPROD", nullable = false, length = 6)
    private String rccodeprod;
   
	@Column(name = "RCPRECUEMOA", nullable = false, length = 2)
    private String rcprecuemoa;
 
	@Column(name = "RCPRECSEN", nullable = false, length = 2)
    private String rcprecsen;
	
	@Column(name="RCCODEBUREAU", nullable = false, length = 3)
	private String rccodeburdouane;
	
	/**
	 * Creates an empty key for Entity Bean : Reprodfinibur
	 */
	public ReprodFiniBurKey() { 
		super(); 
	}

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
	}

	public String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public String getRccoderegeco() {
		return rccoderegeco;
	}

	public void setRccoderegeco(String rccoderegeco) {
		this.rccoderegeco = rccoderegeco;
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

	public String getRcprecsen() {
		return rcprecsen;
	}

	public void setRcprecsen(String rcprecsen) {
		this.rcprecsen = rcprecsen;
	}
    
	/**
	 * 7-args constructor.
	 * 
	 * @param rccodeppm
	 * @param rcanneeregeco
	 * @param rccoderegeco
	 * @param rccodeprod
	 * @param rcprecuemoa
	 * @param rcprecsen
	 * @param rccodeburdouane
	 */
    public ReprodFiniBurKey(String rccodeppm, String rcanneeregeco,
			String rccoderegeco, String rccodeprod, String rcprecuemoa,
			String rcprecsen, String rccodeburdouane) {
		super();
		this.rccodeppm = rccodeppm;
		this.rcanneeregeco = rcanneeregeco;
		this.rccoderegeco = rccoderegeco;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsen = rcprecsen;
		this.rccodeburdouane = rccodeburdouane;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
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
				+ ((rccodeppm == null) ? 0 : rccodeppm.hashCode());
		result = prime * result
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
		result = prime * result
				+ ((rccoderegeco == null) ? 0 : rccoderegeco.hashCode());
		result = prime * result
				+ ((rcprecsen == null) ? 0 : rcprecsen.hashCode());
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
		ReprodFiniBurKey other = (ReprodFiniBurKey) obj;
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
		if (rccodeppm == null) {
			if (other.rccodeppm != null){
				return false;
			}
		} else if (!rccodeppm.equals(other.rccodeppm)){
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
		if (rcprecsen == null) {
			if (other.rcprecsen != null){
				return false;
			}
		} else if (!rcprecsen.equals(other.rcprecsen)){
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
	
}