package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BrouillonArtDecKey implements Serializable{
	
	private static final long serialVersionUID = -7258989768993141325L;

	@Id @Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Id @Column(name = "DECANNEEDECLARATION",length  = 4, nullable = false)
	private String decAnneeDecl;

	@Id @Column(name = "DECCODEPPMDECLARANT",length  = 5, nullable = false)
	private String decCodePpmDeclarant;
	
	@Id @Column(name = "DECNUMREPERTOIRE", length = 6, nullable = false)
	private String decNumRepertoire;
	
	public BrouillonArtDecKey(Integer decNumArtDecl, String decAnneeDecl, String decCodePpmDeclarant, String decNumRepertoire) {
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
	}
	
	public BrouillonArtDecKey() {
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((decAnneeDecl == null) ? 0 : decAnneeDecl.hashCode());
		result = prime
				* result
				+ ((decCodePpmDeclarant == null) ? 0 : decCodePpmDeclarant
						.hashCode());
		result = prime * result
				+ ((decNumArtDecl == null) ? 0 : decNumArtDecl.hashCode());
		result = prime
				* result
				+ ((decNumRepertoire == null) ? 0 : decNumRepertoire.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BrouillonArtDecKey) {
			BrouillonArtDecKey o = (BrouillonArtDecKey) obj;
			return ((this.decAnneeDecl.equals(o.decAnneeDecl))
				&& (this.decCodePpmDeclarant.equals(o.decCodePpmDeclarant))
				&& (this.decNumArtDecl.equals(o.decNumArtDecl))
				&& (this.decNumRepertoire.equals(o.decNumRepertoire)));
		}
		return false;
		
	}
	
	

}
