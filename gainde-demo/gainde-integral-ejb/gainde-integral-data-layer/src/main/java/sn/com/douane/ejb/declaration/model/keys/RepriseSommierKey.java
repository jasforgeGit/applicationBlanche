package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RepriseSommierKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5499834381922227741L;
	
	@Column(name="DECANNEEDEC", length=4, nullable=false)
	private java.lang.String decAnneeDec;
	
	
	@Column(name="DECBURENREGDEC", length=3, nullable=false)
	private java.lang.String decBurEnregDec;
	
	
	@Column(name="DECNUMDECLARATION",  nullable=false)
	private java.lang.Integer decNumDeclaration;
	
	
	@Column(name="DECNUMARTDEC",  nullable=false)
	private java.lang.Integer decNumArtDec;
	
	public RepriseSommierKey() {
		super();
		// TODO Auto-generated constructor stub
}

	public RepriseSommierKey(String decAnneeDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
	}

	public java.lang.String getDecAnneeDec() {
		return decAnneeDec;
	}

	public void setDecAnneeDec(java.lang.String decAnneeDec) {
		this.decAnneeDec = decAnneeDec;
	}

	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	

}
	
