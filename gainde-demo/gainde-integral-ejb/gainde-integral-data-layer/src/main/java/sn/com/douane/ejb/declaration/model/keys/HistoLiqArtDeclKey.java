package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class HistoLiqArtDeclKey implements Serializable {

	
	private static final long serialVersionUID = 4173970775329824980L;

	


	@Column(name="DECNUMHISTOLIQ", nullable=false)
	 private java.lang.Integer decNumHistoLiq;
	
	
	@Column(name="DECANNEELIQUID", length=4, nullable=false)
	    private java.lang.String decAnneeLiquid;
	
	
	@Column(name="DECBUREAUENREGDEC", length=3, nullable=false)
	private java.lang.String decBureauEnregDec;
	
	
	@Column(name="DECNUMDEC", nullable=false)
	 private java.lang.Integer decNumDec;
	
	

	@Column(name="DECNUMARTDEC", nullable=false)	
	private java.lang.Integer decNumArtDec;
	
	
	@Column(name="DECCODETAXE",length=2, nullable=false)
	private java.lang.String decCodeTaxe;


	public HistoLiqArtDeclKey(Integer decNumHistoLiq, String decAnneeLiquid,
			String decBureauEnregDec, Integer decNumDec, Integer decNumArtDec,
			String decCodeTaxe) {
		super();
		this.decNumHistoLiq = decNumHistoLiq;
		this.decAnneeLiquid = decAnneeLiquid;
		this.decBureauEnregDec = decBureauEnregDec;
		this.decNumDec = decNumDec;
		this.decNumArtDec = decNumArtDec;
		this.decCodeTaxe = decCodeTaxe;
	}


	public HistoLiqArtDeclKey() {
		super();
	}


	public java.lang.Integer getDecNumHistoLiq() {
		return decNumHistoLiq;
	}


	public void setDecNumHistoLiq(java.lang.Integer decNumHistoLiq) {
		this.decNumHistoLiq = decNumHistoLiq;
	}


	public java.lang.String getDecAnneeLiquid() {
		return decAnneeLiquid;
	}


	public void setDecAnneeLiquid(java.lang.String decAnneeLiquid) {
		this.decAnneeLiquid = decAnneeLiquid;
	}


	public java.lang.String getDecBureauEnregDec() {
		return decBureauEnregDec;
	}


	public void setDecBureauEnregDec(java.lang.String decBureauEnregDec) {
		this.decBureauEnregDec = decBureauEnregDec;
	}


	public java.lang.Integer getDecNumDec() {
		return decNumDec;
	}


	public void setDecNumDec(java.lang.Integer decNumDec) {
		this.decNumDec = decNumDec;
	}


	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}


	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}


	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}


	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}
	
	
	
}
