package  sn.com.douane.ejb.declaration.model.keys;


import java.io.Serializable;
import javax.persistence.Column;

/**
 * @author: issam
 * Key class for Entity Bean: SegArtDec
 */
public class SegArtDecKey implements Serializable {
    
	private static final long serialVersionUID = -215629630722289764L;
	
	@Column(name="DECNUMARTDEC",nullable=false)
	private Integer decNumArtDec;
	@Column(name="DECANNEEENREGDEC",length=4,nullable=false)
	private String decAnneeEnregDec;
	@Column(name="DECBURENREGDEC",length=3,nullable=false)
	private String decBurEnregDec;
	@Column(name="DECNUMDECLARATION",nullable=false)
	private Integer decNumDeclaration;
	

	public SegArtDecKey() { }
	
	public SegArtDecKey(Integer decNumArtDec, String decAnneeEnregDec, String decBurEnregDec, Integer decNumDeclaration)
	{
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decNumArtDec = decNumArtDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
	}
	
	
	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
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
			
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(Object otherKey) {
		if (otherKey instanceof SegArtDecKey) {
			SegArtDecKey o = (SegArtDecKey) otherKey;
			return ((this.decNumArtDec.equals(o.decNumArtDec))
				&& (this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
				&& (this.decBurEnregDec.equals(o.decBurEnregDec)) && (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decNumArtDec.hashCode()
			+ decAnneeEnregDec.hashCode()
			+ decBurEnregDec.hashCode() + decNumDeclaration.hashCode());
	}
	
	
	
}