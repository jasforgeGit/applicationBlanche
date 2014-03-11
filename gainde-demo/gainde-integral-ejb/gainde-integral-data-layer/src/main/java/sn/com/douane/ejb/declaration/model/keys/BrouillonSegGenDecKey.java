package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BrouillonSegGenDecKey implements Serializable{

	private static final long serialVersionUID = -5911296803477542736L;

	@Id @Column(name = "DECANNEEDECL",length  = 4, nullable = false)
	private String decAnneeDecl;

	@Id @Column(name = "DECCODEPPMDECLARANT",length = 5, nullable = false)
	private String decCodePpmDeclarant;

	@Id @Column(name = "DECNUMREPERTOIRE",length = 6, nullable = false)
	private String decNumRepertoire;

	public BrouillonSegGenDecKey(String decAnneeDecl,String decCodePpmDeclarant, String decNumRepertoire ) {
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
	}

	public BrouillonSegGenDecKey() {
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
		result = prime
				* result
				+ ((decNumRepertoire == null) ? 0 : decNumRepertoire.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BrouillonSegGenDecKey) {
			BrouillonSegGenDecKey o = (BrouillonSegGenDecKey) obj;
			return ((this.decAnneeDecl.equals(o.decAnneeDecl))
				&& (this.decCodePpmDeclarant.equals(o.decCodePpmDeclarant))
				&& (this.decNumRepertoire.equals(o.decNumRepertoire)));
		}
		return false;
	}

	
}
