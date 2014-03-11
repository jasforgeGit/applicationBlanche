package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BrComplementTaxesKey implements Serializable {

	/**
	 * The key class for the entity BrComplementTaxes
	 */
	private static final long serialVersionUID = -4504626697381003286L;
	@Column(name = "DECANNEEDECL", length=4, nullable=false)
	private String decAnneeDecl;
	@Column(name = "DECCODEPPMDECLARANT",length=5, nullable=false)
	private String decCodePpmDeclarant;
	@Column(name = "DECNUMREPERTOIRE",length=6, nullable=false)
	private String decNumRepertoire;
	@Column(name = "DECCODETAXE",length=2, nullable=false)
	private String decCodetaxe;
	
	
	public BrComplementTaxesKey(){
		
	}
	
	public BrComplementTaxesKey(String decAnneeDecl, String decCodePpmDeclarant, String decNumRepertoire, String decCodetaxe){
		super();
		this.decAnneeDecl=decAnneeDecl;
		this.decCodePpmDeclarant=decCodePpmDeclarant;
		this.decNumRepertoire=decNumRepertoire;
		this.decCodetaxe=decCodetaxe;
	}

	/**
	 * @return the decAnneeDecl
	 */
	public String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	/**
	 * @param decAnneeDecl the decAnneeDecl to set
	 */
	public void setDecAnneeDecl(String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	/**
	 * @return the decCodePpmDeclarant
	 */
	public String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	/**
	 * @return the decNumRepertoire
	 */
	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	/**
	 * @param decNumRepertoire the decNumRepertoire to set
	 */
	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	/**
	 * @return the decCodetaxe
	 */
	public String getDecCodetaxe() {
		return decCodetaxe;
	}

	/**
	 * @param decCodetaxe the decCodetaxe to set
	 */
	public void setDecCodetaxe(String decCodetaxe) {
		this.decCodetaxe = decCodetaxe;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeDecl == null) ? 0 : decAnneeDecl.hashCode());
		result = prime * result
				+ ((decCodePpmDeclarant == null) ? 0 : decCodePpmDeclarant.hashCode());
		result = prime * result
				+ ((decNumRepertoire == null) ? 0 : decNumRepertoire.hashCode());
		result = prime
				* result
				+ ((decCodetaxe == null) ? 0 : decCodetaxe
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		BrComplementTaxesKey other = (BrComplementTaxesKey) obj;
		if (decAnneeDecl == null) {
			if (other.decAnneeDecl != null){
				return false;
			}
		} else if (!decAnneeDecl.equals(other.decAnneeDecl)){
			return false;
		}
		if (decCodePpmDeclarant == null) {
			if (other.decCodePpmDeclarant != null){
				return false;
			}
		} else if (!decCodePpmDeclarant.equals(other.decCodePpmDeclarant)){
			return false;
		}
		if (decNumRepertoire == null) {
			if (other.decNumRepertoire != null){
				return false;
			}
		} else if (!decNumRepertoire.equals(other.decNumRepertoire)){
			return false;
		}
		if (decCodetaxe == null) {
			if (other.decCodetaxe != null){
				return false;
			}
		} else if (!decCodetaxe.equals(other.decCodetaxe)){
			return false;
		}
		return true;
	}


}
