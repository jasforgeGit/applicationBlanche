package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ApurRepriseSomKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1746072491333127875L;

	
	
	@Column(name="DECANNEESOMAPURE", length=4, nullable=false)
	private java.lang.String decAnneeDec;
	
	
	@Column(name="DECBURSOMAPURE", length=3, nullable=false)
    private java.lang.String decBurEnregDec;
	
	
	@Column(name="DECNUMSOMAPURE", nullable=false)
    private java.lang.Integer decNumDeclaration;
	
	
	@Column(name="DECNUMARTSOMAPURE", nullable=false)
    private java.lang.Integer decNumArtDec;
   	
	
	@Column(name="DECANNEEAPURANT", length=4, nullable=false)
	 private java.lang.String decAnneeApurant;
	
	
	@Column(name="DECBURAPURANT", length=3, nullable=false)
    private java.lang.String decBurApurant;
	
	

	
	@Column(name="DECNUMARTAPURANT", nullable=false)
    private java.lang.Integer decNumArtApurant;
	
	
	@Column(name="DECNUMDECAPURANT", nullable=false)
    private java.lang.Integer decNumDecApurant;


	public ApurRepriseSomKey(String decAnneeDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decAnneeApurant, String decBurApurant,
			Integer decNumArtApurant, Integer decNumDecApurant) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decAnneeApurant = decAnneeApurant;
		this.decBurApurant = decBurApurant;
		this.decNumArtApurant = decNumArtApurant;
		this.decNumDecApurant = decNumDecApurant;
	}


	public ApurRepriseSomKey() {
		super();
		// TODO Auto-generated constructor stub
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


	public java.lang.String getDecAnneeApurant() {
		return decAnneeApurant;
	}


	public void setDecAnneeApurant(java.lang.String decAnneeApurant) {
		this.decAnneeApurant = decAnneeApurant;
	}


	public java.lang.String getDecBurApurant() {
		return decBurApurant;
	}


	public void setDecBurApurant(java.lang.String decBurApurant) {
		this.decBurApurant = decBurApurant;
	}


	public java.lang.Integer getDecNumArtApurant() {
		return decNumArtApurant;
	}


	public void setDecNumArtApurant(java.lang.Integer decNumArtApurant) {
		this.decNumArtApurant = decNumArtApurant;
	}


	public java.lang.Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}


	public void setDecNumDecApurant(java.lang.Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}

	
}
