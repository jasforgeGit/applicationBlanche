package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BaremePK implements Serializable {

	private static final long serialVersionUID = -6821553297404358240L;

	@Column(name = "RCCODEBUREAU", length = 3, nullable = false)
	private String rccodebureau;

	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rccodeprod;

	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcprecuemoa;

	@Column(name = "RCPRECSEN", length = 2, nullable = false)
	private String rcprecsenegal;

	/**
	 * 0-args constructor.
	 */
	public BaremePK() {
		super();
	}

	/**
	 * 4-args Primary key attributes.
	 * 
	 * @param rccodebureau
	 * @param rccodeprod
	 * @param rcprecuemoa
	 * @param rcprecsenegal
	 */
	public BaremePK(String rccodebureau, String rccodeprod, String rcprecuemoa,
			String rcprecsenegal) {
		super();
		this.rccodebureau = rccodebureau;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
	}

	public String getRccodebureau() {
		return rccodebureau;
	}

	public void setRccodebureau(String rccodebureau) {
		this.rccodebureau = rccodebureau;
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
				+ ((rccodebureau == null) ? 0 : rccodebureau.hashCode());
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
		BaremePK other = (BaremePK) obj;
		if (rccodebureau == null) {
			if (other.rccodebureau != null){
				return false;
			}
		} else if (!rccodebureau.equals(other.rccodebureau)){
			return false;
		}
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
