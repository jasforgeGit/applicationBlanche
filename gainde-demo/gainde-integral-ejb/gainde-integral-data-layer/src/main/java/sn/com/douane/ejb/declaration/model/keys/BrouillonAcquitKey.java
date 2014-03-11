package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BrouillonAcquitKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1347518379559042638L;

	
	
	@Column(name="DECANNEEDECL", length=4, nullable=false)
	    private java.lang.String decAnneeDecl;
	
	
	@Column(name="DECCODEPPMDECL", length=5, nullable=false)
	    private java.lang.String decCodePpmDecl;
	

	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	    private java.lang.String decNumRepertoire;


	public BrouillonAcquitKey(String decAnneeDecl, String decCodePpmDecl,
			String decNumRepertoire) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
	}


	public BrouillonAcquitKey() {
		super();
	}


	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}


	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}


	public java.lang.String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}


	public void setDecCodePpmDecl(java.lang.String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
	}


	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}


	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	
	
}
