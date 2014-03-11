package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;


/**
 * @author: issam
 * Key class for Entity Bean: VisitContener
 */

public class VisitContenerKey implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name="DECANNEEENREGDEC", length=4, nullable=false)
    private String decAnneeEnregDec;
	
	@Column(name="DECBURENREGDEC", length=3, nullable=false)
    private String decBurEnregDec;
	
	@Column(name="DECNUMDECLARATION",  nullable=false)
    private Integer decNumDeclaration;
	
	@Column(name="DECNUMARTDEC",  nullable=false)
    private Integer decNumArtDec;
	
	@Column(name="DECNUMARTCONTENEUR", nullable=false)
    private Integer decNumArtConteneur;


	public VisitContenerKey(){
		
	}
	
	public VisitContenerKey(String decAnneeEnregDec,String decBurEnregDec,Integer decNumDeclaration,Integer decNumArtDec,Integer decNumArtConteneur) {
		this.decAnneeEnregDec=decAnneeEnregDec;
		this.decBurEnregDec=decBurEnregDec;
		this.decNumDeclaration=decNumDeclaration;
		this.decNumArtDec=decNumArtDec;
		this.decNumArtConteneur=decNumArtConteneur;
	
	}
	
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof VisitContenerKey) {
			VisitContenerKey o = (VisitContenerKey) otherKey;
			return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decBurEnregDec.equals(o.decBurEnregDec))
					&& (this.decNumDeclaration.equals(o.decNumDeclaration))
					&& (this.decNumArtDec.equals(o.decNumArtDec)) && (this.decNumArtConteneur
					.equals(o.decNumArtConteneur)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decAnneeEnregDec.hashCode() + decBurEnregDec.hashCode()
				+ decNumDeclaration.hashCode() + decNumArtDec.hashCode() + decNumArtConteneur.hashCode());
	}
	
	
}
