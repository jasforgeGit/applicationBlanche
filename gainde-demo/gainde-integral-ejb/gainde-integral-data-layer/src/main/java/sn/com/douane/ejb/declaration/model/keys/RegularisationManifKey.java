package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 
 * @author thouraya
 *
 */
public class RegularisationManifKey implements Serializable{

	private static final long serialVersionUID = 3395174382658737248L;

	@Id @Column(name = "DECANNEEENREGDECL",length = 4,nullable = false)
	private String decAnneeEnregDecl;

	@Id @Column(name = "DECBURENREGDECL",nullable = false)
	private String decBurEnregDecl;

	@Id @Column(name = "DECNUMDECLARATION",nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDECL",nullable = false)
	private Integer decNumArtDecl;

	public String getDecAnneeEnregDecl() {
		return decAnneeEnregDecl;
	}

	public void setDecAnneeEnregDecl(String decAnneeEnregDecl) {
		this.decAnneeEnregDecl = decAnneeEnregDecl;
	}

	public String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}

	public void setDecBurEnregDecl(String decBurEnregDecl) {
		this.decBurEnregDecl = decBurEnregDecl;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	
	public RegularisationManifKey() {
		super();
	}

	public RegularisationManifKey(String decAnneeEnregDecl,
			String decBurEnregDecl, Integer decNumDeclaration,
			Integer decNumArtDecl) {
		super();
		this.decAnneeEnregDecl = decAnneeEnregDecl;
		this.decBurEnregDecl = decBurEnregDecl;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeEnregDecl == null) ? 0 : decAnneeEnregDecl
						.hashCode());
		result = prime * result
				+ ((decBurEnregDecl == null) ? 0 : decBurEnregDecl.hashCode());
		result = prime * result
				+ ((decNumArtDecl == null) ? 0 : decNumArtDecl.hashCode());
		result = prime
				* result
				+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
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
		RegularisationManifKey other = (RegularisationManifKey) obj;
		if (decAnneeEnregDecl == null) {
			if (other.decAnneeEnregDecl != null){
				return false;
			}
		} else if (!decAnneeEnregDecl.equals(other.decAnneeEnregDecl)){
			return false;
		}
		if (decBurEnregDecl == null) {
			if (other.decBurEnregDecl != null){
				return false;
			}
		} else if (!decBurEnregDecl.equals(other.decBurEnregDecl)){
			return false;
		}
		if (decNumArtDecl == null) {
			if (other.decNumArtDecl != null){
				return false;
			}
		} else if (!decNumArtDecl.equals(other.decNumArtDecl)){
			return false;
		}
		if (decNumDeclaration == null) {
			if (other.decNumDeclaration != null){
				return false;
			}
		} else if (!decNumDeclaration.equals(other.decNumDeclaration)){
			return false;
		}
		return true;
	}
	
	
	
}
