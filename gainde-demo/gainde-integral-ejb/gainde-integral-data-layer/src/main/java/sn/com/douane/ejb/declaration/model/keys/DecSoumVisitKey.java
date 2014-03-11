package sn.com.douane.ejb.declaration.model.keys;


import java.io.Serializable;
import javax.persistence.Column;

/**
 * @author: issam
 * Key class for Entity Bean: DecSoumVisit
 */
public class DecSoumVisitKey implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 89822971920349852L;
	@Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
    private String decAnneeEnregDec;
    @Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private String decBurEnregDec;
    @Column(name = "DECNUMDECLARATION" , nullable = false)
    private Integer decNumDeclaration;
    @Column(name = "DECNUMARTDECL" , nullable = false)
    private Integer decNumArtDecl;
   
	public DecSoumVisitKey() {
	}
	public DecSoumVisitKey(String decAnneeEnregDec,String decBurEnregDec,
							Integer decNumDeclaration,Integer decNumArtDec) {
	   this.decAnneeEnregDec=decAnneeEnregDec;
	   this.decBurEnregDec=decBurEnregDec;
	   this.decNumDeclaration=decNumDeclaration;
	   this.decNumArtDecl=decNumArtDec;
	   
  }

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DecSoumVisitKey) {
			DecSoumVisitKey o = (DecSoumVisitKey) otherKey;
			return ((this.decNumArtDecl.equals(o.decNumArtDecl))
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
		return (decNumArtDecl.hashCode()
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
	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	public void setDecNumArtDecl(Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
	}

}