package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class LiquidArtVisiteKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2839360238920648753L;

	@Column(name="VISANNEELIQUID", length=4, nullable=false)
	private java.lang.String visAnneeLiquid;

	@Column(name="VISBUREAUENREGDEC", length=3, nullable=false)
	private java.lang.String visBureauEnregDec;

	@Column(name="VISNUMDEC", nullable=false)
	private java.lang.Integer visNumDec;
	
	@Column(name="VISNUMARTDEC", nullable=false)
	private java.lang.Integer visNumArtDec;

	@Column(name="VISCODETAXE", length=2, nullable=false)
	private java.lang.String visCodeTaxe;

	public LiquidArtVisiteKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LiquidArtVisiteKey(String visAnneeLiquid, String visBureauEnregDec,
			Integer visNumDec, Integer visNumArtDec, String visCodeTaxe) {
		super();
		this.visAnneeLiquid = visAnneeLiquid;
		this.visBureauEnregDec = visBureauEnregDec;
		this.visNumDec = visNumDec;
		this.visNumArtDec = visNumArtDec;
		this.visCodeTaxe = visCodeTaxe;
	}

	public java.lang.String getVisAnneeLiquid() {
		return visAnneeLiquid;
	}

	public void setVisAnneeLiquid(java.lang.String visAnneeLiquid) {
		this.visAnneeLiquid = visAnneeLiquid;
	}

	public java.lang.String getVisBureauEnregDec() {
		return visBureauEnregDec;
	}

	public void setVisBureauEnregDec(java.lang.String visBureauEnregDec) {
		this.visBureauEnregDec = visBureauEnregDec;
	}

	public java.lang.Integer getVisNumDec() {
		return visNumDec;
	}

	public void setVisNumDec(java.lang.Integer visNumDec) {
		this.visNumDec = visNumDec;
	}

	public java.lang.Integer getVisNumArtDec() {
		return visNumArtDec;
	}

	public void setVisNumArtDec(java.lang.Integer visNumArtDec) {
		this.visNumArtDec = visNumArtDec;
	}

	public java.lang.String getVisCodeTaxe() {
		return visCodeTaxe;
	}

	public void setVisCodeTaxe(java.lang.String visCodeTaxe) {
		this.visCodeTaxe = visCodeTaxe;
	}

}
