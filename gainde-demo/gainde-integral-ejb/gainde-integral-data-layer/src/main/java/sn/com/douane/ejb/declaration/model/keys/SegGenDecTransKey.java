package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class SegGenDecTransKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5461525811310167961L;
	

	
	@Column(name="DECANNEEDEC", length=4, nullable=false)
	 private java.lang.String decAnneeDec;
	


	@Column(name="DECBURENREGTRANS", length=3, nullable=false)
    private java.lang.String decBurEnregTrans;

	
	@Column(name="DECNUMDECTRANS", nullable=false)
	private java.lang.Integer decNumDecTrans;


	public SegGenDecTransKey(String decAnneeDec, String decBurEnregTrans,
			Integer decNumDecTrans) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregTrans = decBurEnregTrans;
		this.decNumDecTrans = decNumDecTrans;
	}


	public SegGenDecTransKey() {
		super();
	}


	public java.lang.String getDecAnneeDec() {
		return decAnneeDec;
	}


	public void setDecAnneeDec(java.lang.String decAnneeDec) {
		this.decAnneeDec = decAnneeDec;
	}


	public java.lang.String getDecBurEnregTrans() {
		return decBurEnregTrans;
	}


	public void setDecBurEnregTrans(java.lang.String decBurEnregTrans) {
		this.decBurEnregTrans = decBurEnregTrans;
	}


	public java.lang.Integer getDecNumDecTrans() {
		return decNumDecTrans;
	}


	public void setDecNumDecTrans(java.lang.Integer decNumDecTrans) {
		this.decNumDecTrans = decNumDecTrans;
	}

	

}
