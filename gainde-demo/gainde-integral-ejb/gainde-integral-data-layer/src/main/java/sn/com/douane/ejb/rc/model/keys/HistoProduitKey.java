package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;

public class HistoProduitKey implements Serializable{

	private static final long serialVersionUID = -6294014727530279045L;

	@Column(name="RCDATEMAJ", nullable=false)
	private Timestamp rcDateMaj;
	
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd; 
	
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
	private String rcPrecUemoa;
	 
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
	private String rcPrecSenegal;
	 
	@Column(name="RCCODEUSERMAJ", length=8, nullable=false)
	private String rcCodeUserMaj;
	
	@Column(name="RCTERMINALMAJ", length=70, nullable=false)
	private String rcTerminalMaj;	
	
	public HistoProduitKey() {
		
	}

	public HistoProduitKey(Timestamp rcDateMaj, String rcCodeProd,
			String rcPrecUemoa, String rcPrecSenegal, String rcCodeUserMaj,
			String rcTerminalMaj) {
		super();
		this.rcDateMaj = rcDateMaj;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeUserMaj = rcCodeUserMaj;
		this.rcTerminalMaj = rcTerminalMaj;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof HistoProduitKey) {
			HistoProduitKey o = (HistoProduitKey) otherKey;
			return ((this.rcDateMaj.equals(o.rcDateMaj))
					&& (this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa.equals(o.rcPrecUemoa))
					&& (this.rcPrecSenegal.equals(o.rcPrecSenegal))
					&& (this.rcCodeUserMaj.equals(o.rcCodeUserMaj)) 
					&& (this.rcTerminalMaj.equals(o.rcTerminalMaj)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcDateMaj.hashCode() + rcCodeProd.hashCode()
				+ rcPrecUemoa.hashCode() + rcPrecSenegal.hashCode()
				+ rcCodeUserMaj.hashCode() + rcTerminalMaj.hashCode());
	}
	
	public Timestamp getRcDateMaj() {
		return rcDateMaj;
	}

	public void setRcDateMaj(Timestamp rcDateMaj) {
		this.rcDateMaj = rcDateMaj;
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

	public String getRcCodeUserMaj() {
		return rcCodeUserMaj;
	}

	public void setRcCodeUserMaj(String rcCodeUserMaj) {
		this.rcCodeUserMaj = rcCodeUserMaj;
	}

	public String getRcTerminalMaj() {
		return rcTerminalMaj;
	}

	public void setRcTerminalMaj(String rcTerminalMaj) {
		this.rcTerminalMaj = rcTerminalMaj;
	}
	
	
}
