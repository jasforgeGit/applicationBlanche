package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import javax.persistence.Column;

/**
 * Key class for Entity Bean: Dderectifartdecl
 */

public class DdeRectifArtDeclKey implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -7338071095532441583L;
	@Column(name = "DECANNEEENREGDEC", length=4 , nullable = false)
	private String decAnneeEnregDec;
	@Column(name = "DECBURENREGDEC" , length=4 , nullable = false)
	private String decBurEnregDec;
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;
	@Column(name = "DECNUMARTDEC" ,columnDefinition="DECIMAL(18,0)", nullable = false)
	private Integer decNumArtDec;
	
	
	public DdeRectifArtDeclKey(){
	}
	
    public DdeRectifArtDeclKey( String decAnneeEnregDec,  String decBurEnregDec,Integer decNumDeclaration,Integer decNumArtDec) {
    	this.decAnneeEnregDec=decAnneeEnregDec;
    	this.decBurEnregDec=decBurEnregDec;	
    	this.decNumDeclaration=decNumDeclaration;
    	this.decNumArtDec=decNumArtDec;
    }

	
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DdeRectifArtDeclKey) {
			DdeRectifArtDeclKey o = (DdeRectifArtDeclKey) otherKey;
			return ((this.decNumArtDec.equals(o.decNumArtDec))
				&& (this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
				&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
				&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decNumArtDec.hashCode()
			+ decAnneeEnregDec.hashCode()
			+ decBurEnregDec.hashCode() 
			+ decNumDeclaration.hashCode());
	}
	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

}