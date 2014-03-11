package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;



public class ArticleVisiteKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	
	@Column(name="VISANNEEENREG", length=4, nullable=false)
    private java.lang.String visAnneeEnreg;
	
	
	@Column(name="VISBURENREG", length=3, nullable=false)
    private java.lang.String visBurEnreg;
		
	
	@Column(name="VISNUMDECLARATION", nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	
	@Column(name="VISNUMART", nullable=false)
	 private java.lang.Integer visNumArt;

	public ArticleVisiteKey(String visAnneeEnreg, String visBurEnreg,
			Integer visNumDeclaration, Integer visNumArt) {
		super();
		this.visAnneeEnreg = visAnneeEnreg;
		this.visBurEnreg = visBurEnreg;
		this.visNumDeclaration = visNumDeclaration;
		this.visNumArt = visNumArt;
	}

	public ArticleVisiteKey() {
		super();
		
	}

	public java.lang.String getVisAnneeEnreg() {
		return visAnneeEnreg;
	}

	public void setVisAnneeEnreg(java.lang.String visAnneeEnreg) {
		this.visAnneeEnreg = visAnneeEnreg;
	}

	public java.lang.String getVisBurEnreg() {
		return visBurEnreg;
	}

	public void setVisBurEnreg(java.lang.String visBurEnreg) {
		this.visBurEnreg = visBurEnreg;
	}

	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}

	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}

	public Integer getVisNumArt() {
		return visNumArt;
	}

	public void setVisNumArt(Integer visNumArt) {
		this.visNumArt = visNumArt;
	}
	
	
	
	
	
	
}
