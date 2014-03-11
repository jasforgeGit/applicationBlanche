package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * Key class for Entity Bean PieceJointeRegime.
 */
public class PieceJointeRegimeKey implements Serializable {

	static final long serialVersionUID = 3206093459760846163L;

	@Column(name = "RCTYPEREGIME",length = 1,nullable = false)
	private String rctyperegime;

	@Column(name = "RCCODEREGDOU",length = 1,nullable = false)
	private String rccoderegdou;

	@Column(name = "RCREGFISCAL",length = 2,nullable = false)
	private String rcregfiscal;

	@Column(name = "RCCODEPIECEJ",length = 3,nullable = false)
	private String rccodepiecejointe;

    public PieceJointeRegimeKey() {
		super();
	}

	public PieceJointeRegimeKey(String rctyperegime, String rccoderegdou,
			String rcregfiscal, String rccodepiecejointe) {
		super();
		this.rctyperegime = rctyperegime;
		this.rccoderegdou = rccoderegdou;
		this.rcregfiscal = rcregfiscal;
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public String getRctyperegime() {
		return rctyperegime;
	}

	public void setRctyperegime(java.lang.String rctyperegime) {
		this.rctyperegime = rctyperegime;
	}

	public java.lang.String getRccoderegdou() {
		return rccoderegdou;
	}

	public void setRccoderegdou(java.lang.String rccoderegdou) {
		this.rccoderegdou = rccoderegdou;
	}

	public java.lang.String getRcregfiscal() {
		return rcregfiscal;
	}

	public void setRcregfiscal(java.lang.String rcregfiscal) {
		this.rcregfiscal = rcregfiscal;
	}

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof PieceJointeRegimeKey) {
			PieceJointeRegimeKey o = (PieceJointeRegimeKey) otherKey;
			return ((this.rctyperegime.equals(o.rctyperegime))
					&& (this.rccoderegdou.equals(o.rccoderegdou))
					&& (this.rcregfiscal.equals(o.rcregfiscal)) && (this.rccodepiecejointe
						.equals(o.rccodepiecejointe)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rctyperegime.hashCode() + rccoderegdou.hashCode()
				+ rcregfiscal.hashCode() + rccodepiecejointe.hashCode());
	}
}