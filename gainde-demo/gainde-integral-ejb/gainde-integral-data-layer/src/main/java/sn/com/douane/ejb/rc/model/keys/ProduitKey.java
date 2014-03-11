package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Key class for Entity Bean Produit.
 */
public class ProduitKey implements Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: rccodeprod
	 */
	@Column(name = "RCCODEPROD",length = 6,nullable = false)
	private String rccodeprod;

	/**
	 * Implementation field for persistent attribute: rcprecuemoa
	 */
	@Column(name = "RCPRECUEMOA",length = 2,nullable = false)
	private String rcprecuemoa;

	/**
	 * Implementation field for persistent attribute: rcprecsenegal
	 */
	@Column(name = "RCPRECSENEGAL",length = 2,nullable = false)
	private String rcprecsenegal;

	public ProduitKey() {	}

	public ProduitKey(String rccodeprod, String rcprecuemoa,
			String rcprecsenegal) {
		super();
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
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
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
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
		ProduitKey other = (ProduitKey) obj;
		if (rccodeprod == null) {
			if (other.rccodeprod != null){
				return false;
			}
		} else if (!rccodeprod.equals(other.rccodeprod)){
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

	
	
	
}
