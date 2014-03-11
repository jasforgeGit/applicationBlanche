package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author: issam
 * Key class for Entity Bean: Regularisationvaleur
 */

public class RegularisationValeurKey implements Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7403610177442777217L;
	
	@Column(name = "DECANNEEENREGDECL", length = 4, nullable = false)
	private String decAnneeEnregDecl;
	
	@Column(name = "DECBURENREGDECL", length = 3, nullable = false)
	private String decBurEnregDecl;
	
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	
	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;
	
	public RegularisationValeurKey() {
    }
    public RegularisationValeurKey(String decAnneeEnregDec,String decBurEnregDec, Integer decNumDeclaration,
    							Integer decNumArtDec) {
    	this.decAnneeEnregDecl=decAnneeEnregDec;
    	this.decBurEnregDecl=decBurEnregDec;
    	this.decNumDeclaration=decNumDeclaration;
    	this.decNumArtDecl=decNumArtDec;
    }
	
	
	public String getDecAnneeEnregDecl() {
		return decAnneeEnregDecl;
	}
	public void setDecAnneeEnregDecl(String decAnneeEnregDec) {
		this.decAnneeEnregDecl = decAnneeEnregDec;
	}
	public String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}
	public void setDecBurEnregDecl(String decBurEnregDec) {
		this.decBurEnregDecl = decBurEnregDec;
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
	public void setDecNumArtDecl(Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
	}
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RegularisationValeurKey) {
			RegularisationValeurKey o = (RegularisationValeurKey) otherKey;
			return ((this.decNumArtDecl.equals(o.decNumArtDecl))
				&& (this.decAnneeEnregDecl.equals(o.decAnneeEnregDecl))
				&& (this.decBurEnregDecl.equals(o.decBurEnregDecl)) 
				&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decNumArtDecl.hashCode()
			+ decAnneeEnregDecl.hashCode()
			+ decBurEnregDecl.hashCode() 
			+ decNumDeclaration.hashCode());
	}
  
}