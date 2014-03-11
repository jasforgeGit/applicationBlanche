package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class DdeModifSegenDecKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8429357108999887899L;

	@Id @Column(name = "DECANNEEENREGDEC",length = 4,nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC",nullable = false)
	private String decBurEnregDec;

	@Id @Column(name = "DECNUMDECLARATION",nullable = false)
	private Integer decNumDeclaration;

	public DdeModifSegenDecKey(String decAnneeEnregDec, String decBurEnregDec, Integer decNumDeclaration){
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
					
	}

	public DdeModifSegenDecKey() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec.hashCode());
		result = prime * result
				+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime
				* result
				+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
			if (obj instanceof DdeModifSegenDecKey) {
				DdeModifSegenDecKey o = (DdeModifSegenDecKey) obj;
				return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decNumDeclaration.equals(o.decNumDeclaration))
					&& (this.decBurEnregDec.equals(o.decBurEnregDec)));
			}
			return false;
		}


}
