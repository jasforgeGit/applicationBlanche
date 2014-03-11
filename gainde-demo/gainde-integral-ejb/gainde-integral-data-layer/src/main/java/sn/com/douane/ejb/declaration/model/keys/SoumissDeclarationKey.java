package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * 
 * @author thouraya
 *
 */
public class SoumissDeclarationKey implements Serializable{

	private static final long serialVersionUID = -6099632859002699606L;

	@Id @Column(name="DECPPMDECLARANT",length=5, nullable=false)
	private String decPpmDeclarant;

	@Id @Column(name="DECANNEEENREGDEC",length=4, nullable=false)
	private String decAnneeEnregDec;

	@Id @Column(name="DECBURENREGDEC",length=3, nullable=false)
	private String decBurEnregDec;

	@Id @Column(name="DECNUMDECLARATION",nullable=false)
	private Integer decNumDeclaration;

	@Id @Column(name="DECNUMARTDEC",nullable=false)
	private Integer decNumArtDec;


	public SoumissDeclarationKey(String decPpmDeclarant,String decAnneeEnregDec, String decBurEnregDec,Integer decNumDeclaration, Integer decNumArtDec) {
		this.decPpmDeclarant = decPpmDeclarant;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;

	}

	public SoumissDeclarationKey() {
	}

	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
		* result
		+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec.hashCode());
		result = prime * result
		+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime * result
		+ ((decNumArtDec == null) ? 0 : decNumArtDec.hashCode());
		result = prime
		* result
		+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
				.hashCode());
		result = prime * result
		+ ((decPpmDeclarant == null) ? 0 : decPpmDeclarant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SoumissDeclarationKey) {
			SoumissDeclarationKey o = (SoumissDeclarationKey) obj;
			return ((this.decNumArtDec.equals(o.decNumArtDec))
					&& (this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
					&& (this.decPpmDeclarant.equals(o.decPpmDeclarant)) 
					&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		} 
		return false;
	}
}
