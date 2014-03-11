package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class BrouillonDevisArtKey implements Serializable{
	
	private static final long serialVersionUID = 3129931495424874072L;
	
	@Id
	@Column(name="DECANNEEDECLARATION", length= 4, nullable = false)
	private String decAnneeDecl;

	@Id
	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
	private String decCodePpmDeclarant;

	@Id
	@Column(name="DECNUMREPERTOIRE", length= 6, nullable = false)
	private String decNumRepertoire;

	@Id
	@Column(name="DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Id
	@Column(name="DECCODETAXE", length= 2, nullable = false)
	private String decCodeTaxe;
	
	public BrouillonDevisArtKey(String decAnneeDecl, String decCodePpmDeclarant, String decNumRepertoire, Integer decNumArtDecl, String decCodeTaxe) {
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeTaxe = decCodeTaxe;
	}

	public BrouillonDevisArtKey() {

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

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecCodeTaxe() {
		return decCodeTaxe;
	}

	public void setDecCodeTaxe(String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
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
		result = prime
				* result
				+ ((decCodeTaxe == null) ? 0 : decCodeTaxe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BrouillonDevisArtKey) {
			BrouillonDevisArtKey o = (BrouillonDevisArtKey) obj;
			return ((this.decAnneeDecl.equals(o.decAnneeDecl))
				&& (this.decCodePpmDeclarant.equals(o.decCodePpmDeclarant))
				&& (this.decNumArtDecl.equals(o.decNumArtDecl))
				&& (this.decNumRepertoire.equals(o.decNumRepertoire))
				&& (this.decCodeTaxe.equals(o.decCodeTaxe)));
		}
		return false;
		
	}
	
	

}
