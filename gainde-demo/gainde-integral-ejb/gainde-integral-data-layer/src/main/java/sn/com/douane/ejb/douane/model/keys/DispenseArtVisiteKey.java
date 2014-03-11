package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class DispenseArtVisiteKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="VISANNEEENREGDEC", length=4, nullable=false)
	 private java.lang.String visAnneeEnregDec;
	
	
	@Column(name="VISBURENREGDEC", length=3, nullable=false)
    private java.lang.String visBurEnregDec;
	
	
	@Column(name="VISNUMDECLARATION",  nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	
	@Column(name="VISNUMARTDEC",  nullable=false)
    private java.lang.Integer visNumArtDec;
	
	
	@Column(name="VISCODEDISPENSE", length=2, nullable=false)
    private java.lang.String visCodeDispense;


	public DispenseArtVisiteKey(String visAnneeEnregDec, String visBurEnregDec,
			Integer visNumDeclaration, Integer visNumArtDec,
			String visCodeDispense) {
		super();
		this.visAnneeEnregDec = visAnneeEnregDec;
		this.visBurEnregDec = visBurEnregDec;
		this.visNumDeclaration = visNumDeclaration;
		this.visNumArtDec = visNumArtDec;
		this.visCodeDispense = visCodeDispense;
	}


	public DispenseArtVisiteKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getVisAnneeEnregDec() {
		return visAnneeEnregDec;
	}


	public void setVisAnneeEnregDec(java.lang.String visAnneeEnregDec) {
		this.visAnneeEnregDec = visAnneeEnregDec;
	}


	public java.lang.String getVisBurEnregDec() {
		return visBurEnregDec;
	}


	public void setVisBurEnregDec(java.lang.String visBurEnregDec) {
		this.visBurEnregDec = visBurEnregDec;
	}


	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}


	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}


	public java.lang.Integer getVisNumArtDec() {
		return visNumArtDec;
	}


	public void setVisNumArtDec(java.lang.Integer visNumArtDec) {
		this.visNumArtDec = visNumArtDec;
	}


	public java.lang.String getVisCodeDispense() {
		return visCodeDispense;
	}


	public void setVisCodeDispense(java.lang.String visCodeDispense) {
		this.visCodeDispense = visCodeDispense;
	}

}
