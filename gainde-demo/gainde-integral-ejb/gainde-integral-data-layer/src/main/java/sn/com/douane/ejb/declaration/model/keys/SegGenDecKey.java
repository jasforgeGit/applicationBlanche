package  sn.com.douane.ejb.declaration.model.keys;


import java.io.Serializable;
import javax.persistence.Column;


/**
 * @author: issam
 * Key class for Entity Bean: SegGenDec
 */
public class SegGenDecKey implements Serializable {
   
	 	static final long serialVersionUID = 3206093459760846163L;


	 	@Column(name="DECANNEEENREGDEC",length=4, nullable=false)
	    private String decAnneeEnregDec;
		@Column(name="DECBURENREGDEC",length=3, nullable=false)
	    private String decBurEnregDec;
		@Column(name="DECNUMDECLARATION",nullable=false)
	    private Integer decNumDeclaration;
	 
	 
		public SegGenDecKey() {
		}

		/**
		 * Creates a key for Entity Bean: Seggendec
		 */
		public SegGenDecKey(String decAnneeEnregDec, String decBurEnregDec, Integer decNumDeclaration) {
			this.decAnneeEnregDec = decAnneeEnregDec;
			this.decBurEnregDec = decBurEnregDec;
			this.decNumDeclaration = decNumDeclaration;
		}

	
	

   
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof SegGenDecKey) {
			SegGenDecKey o = (SegGenDecKey) otherKey;
			return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
					&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decAnneeEnregDec.hashCode() + decBurEnregDec.hashCode() + decNumDeclaration.hashCode());
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
	
	
}