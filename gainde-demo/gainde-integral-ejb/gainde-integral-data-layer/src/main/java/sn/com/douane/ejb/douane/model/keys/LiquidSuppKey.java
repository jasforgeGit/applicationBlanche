package sn.com.douane.ejb.douane.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class LiquidSuppKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	@Column(name="VISANNNEDECL", length=4, nullable=false)
	private java.lang.String visAnnneDecl;
	
	
	@Column(name="VISCODEBURDECL", length=3, nullable=false)
    private java.lang.String visCodeBurDecl;
	
	
	@Column(name="VISNUMDECL", nullable=false)
    private java.lang.Integer visNumDecl;
	
	
	@Column(name="VISNUMARTDCL", nullable=false)
    private java.lang.Integer visNumArtDcl;
	
	
	@Column(name="VISCODTTX", length=2, nullable=false)
    private java.lang.String visCodTtx;


	public LiquidSuppKey(String visAnnneDecl, String visCodeBurDecl,
			Integer visNumDecl, Integer visNumArtDcl, String visCodTtx) {
		super();
		this.visAnnneDecl = visAnnneDecl;
		this.visCodeBurDecl = visCodeBurDecl;
		this.visNumDecl = visNumDecl;
		this.visNumArtDcl = visNumArtDcl;
		this.visCodTtx = visCodTtx;
	}


	public LiquidSuppKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.lang.String getVisAnnneDecl() {
		return visAnnneDecl;
	}


	public void setVisAnnneDecl(java.lang.String visAnnneDecl) {
		this.visAnnneDecl = visAnnneDecl;
	}


	public java.lang.String getVisCodeBurDecl() {
		return visCodeBurDecl;
	}


	public void setVisCodeBurDecl(java.lang.String visCodeBurDecl) {
		this.visCodeBurDecl = visCodeBurDecl;
	}


	public java.lang.Integer getVisNumDecl() {
		return visNumDecl;
	}


	public void setVisNumDecl(java.lang.Integer visNumDecl) {
		this.visNumDecl = visNumDecl;
	}


	public java.lang.Integer getVisNumArtDcl() {
		return visNumArtDcl;
	}


	public void setVisNumArtDcl(java.lang.Integer visNumArtDcl) {
		this.visNumArtDcl = visNumArtDcl;
	}


	public java.lang.String getVisCodTtx() {
		return visCodTtx;
	}


	public void setVisCodTtx(java.lang.String visCodTtx) {
		this.visCodTtx = visCodTtx;
	}
	
}
