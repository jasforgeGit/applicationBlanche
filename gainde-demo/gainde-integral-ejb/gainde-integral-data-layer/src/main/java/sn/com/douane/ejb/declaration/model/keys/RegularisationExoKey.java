package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class RegularisationExoKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3857817984976215922L;

	
	
	@Column(name="DECANNEEDECLARATION",length=4, nullable=false)
	 private java.lang.String decAnneeDeclaration;

	@Column(name="DECBURENREGDECL",length=3, nullable=false)
	    private java.lang.String decBurEnregDecl;
	
	@Column(name="DECNUMDECLARATION", nullable=false)
	    private java.lang.Integer decNumDeclaration;
	
	@Column(name="DECNUMARTDECL", nullable=false)
	    private java.lang.Integer decNumArtDecl;

	public RegularisationExoKey() {
		super();
	}

	public RegularisationExoKey(String decAnneeDeclaration,
			String decBurEnregDecl, Integer decNumDeclaration,
			Integer decNumArtDecl) {
		super();
		this.decAnneeDeclaration = decAnneeDeclaration;
		this.decBurEnregDecl = decBurEnregDecl;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
	}

	public java.lang.String getDecAnneeDeclaration() {
		return decAnneeDeclaration;
	}

	public void setDecAnneeDeclaration(java.lang.String decAnneeDeclaration) {
		this.decAnneeDeclaration = decAnneeDeclaration;
	}

	public java.lang.String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}

	public void setDecBurEnregDecl(java.lang.String decBurEnregDecl) {
		this.decBurEnregDecl = decBurEnregDecl;
	}

	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}
	
	
	
}
