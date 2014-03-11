package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import javax.persistence.Column;

/**
 * @author: issam
 * Key class for Entity Bean: ArtDecSoumDoc
 */

public class ArtDecSoumDocKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8062599248958263076L;
	@Column(name = "DECANNEEENREGDEC" , length=4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Column(name = "DECCODESOUMDOC" ,length=2, nullable = false)
	private java.lang.String decCodeSoumDoc;
	@Column(name = "DECBURENREGDEC" ,length=3, nullable = false)
	private java.lang.String decBurEnregDec;
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private java.lang.Integer decNumDeclaration;
	@Column(name = "DECNUMARTDEC" , nullable = false)
	private java.lang.Integer decNumArtDec;

	
	public ArtDecSoumDocKey(){
	 }
	 public ArtDecSoumDocKey(String decAnneeEnregDec, String decCodeSoumDoc, String decBurEnregDec, Integer decNumDeclaration,Integer decNumArtDec){
		 this.decAnneeEnregDec=decAnneeEnregDec;
		 this.decCodeSoumDoc=decCodeSoumDoc;
		 this.decBurEnregDec=decBurEnregDec;
		 this.decNumDeclaration=decNumDeclaration;
		 this.decNumArtDec=decNumArtDec;
	 }
	
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	public java.lang.String getDecCodeSoumDoc() {
		return decCodeSoumDoc;
	}
	public void setDecCodeSoumDoc(java.lang.String decCodeSoumDoc) {
		this.decCodeSoumDoc = decCodeSoumDoc;
	}
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

 	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof ArtDecSoumDocKey) {
			ArtDecSoumDocKey o = (ArtDecSoumDocKey) otherKey;
			return ((this.decCodeSoumDoc.equals(o.decCodeSoumDoc))
				&& (this.decNumArtDec.equals(o.decNumArtDec))
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
		return (decCodeSoumDoc.hashCode()
			+ decNumArtDec.hashCode()
			+ decAnneeEnregDec.hashCode()
			+ decBurEnregDec.hashCode() 
			+ decNumDeclaration.hashCode());
	}

}