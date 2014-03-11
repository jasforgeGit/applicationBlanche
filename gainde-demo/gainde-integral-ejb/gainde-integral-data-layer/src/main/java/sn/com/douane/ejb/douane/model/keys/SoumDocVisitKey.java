package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


public class SoumDocVisitKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="VISANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String visAnneeDeclaration;
	
	
	@Column(name="VISBUREAUDECLARATION", length=3, nullable=false)
    private java.lang.String visBureauDeclaration;
	
	
	@Column(name="VISNUMDECLARATION", nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	
	@Column(name="VISNUMARTDECL", nullable=false)
    private java.lang.Integer visNumArtDecl;
	
	
	@Column(name="VISCODESOUMDOC", length=2, nullable=false)
    private java.lang.String visCodeSoumDoc;


	public SoumDocVisitKey(String visAnneeDeclaration,
			String visBureauDeclaration, Integer visNumDeclaration,
			Integer visNumArtDecl, String visCodeSoumDoc) {
		super();
		this.visAnneeDeclaration = visAnneeDeclaration;
		this.visBureauDeclaration = visBureauDeclaration;
		this.visNumDeclaration = visNumDeclaration;
		this.visNumArtDecl = visNumArtDecl;
		this.visCodeSoumDoc = visCodeSoumDoc;
	}


	public SoumDocVisitKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getVisAnneeDeclaration() {
		return visAnneeDeclaration;
	}


	public void setVisAnneeDeclaration(java.lang.String visAnneeDeclaration) {
		this.visAnneeDeclaration = visAnneeDeclaration;
	}


	public java.lang.String getVisBureauDeclaration() {
		return visBureauDeclaration;
	}


	public void setVisBureauDeclaration(java.lang.String visBureauDeclaration) {
		this.visBureauDeclaration = visBureauDeclaration;
	}


	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}


	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}


	public java.lang.Integer getVisNumArtDecl() {
		return visNumArtDecl;
	}


	public void setVisNumArtDecl(java.lang.Integer visNumArtDecl) {
		this.visNumArtDecl = visNumArtDecl;
	}


	public java.lang.String getVisCodeSoumDoc() {
		return visCodeSoumDoc;
	}


	public void setVisCodeSoumDoc(java.lang.String visCodeSoumDoc) {
		this.visCodeSoumDoc = visCodeSoumDoc;
	}
	
	
	
}
