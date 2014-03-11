package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ReglementImportKey implements Serializable{

	private static final long serialVersionUID = 1145518601571862984L;
	
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd;
	
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa;
	
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal;
	
	@Column(name="RCCODEIMP", length=1, nullable=false)
    private String rcCodeImp;

	public ReglementImportKey() {

	}

	public ReglementImportKey(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeImp) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeImp = rcCodeImp;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof ReglementImportKey) {
			ReglementImportKey o = (ReglementImportKey) otherKey;
			return ((this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa.equals(o.rcPrecUemoa))
					&& (this.rcPrecSenegal.equals(o.rcPrecSenegal))
					&& (this.rcCodeImp.equals(o.rcCodeImp)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeProd.hashCode() + rcPrecUemoa.hashCode()
				+ rcPrecSenegal.hashCode() + rcCodeImp.hashCode());
	}
	
	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeImp() {
		return rcCodeImp;
	}

	public void setRcCodeImp(String rcCodeImp) {
		this.rcCodeImp = rcCodeImp;
	}
	
	

}
