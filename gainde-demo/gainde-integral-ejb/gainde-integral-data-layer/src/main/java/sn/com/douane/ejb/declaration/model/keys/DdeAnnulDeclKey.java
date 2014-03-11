package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author: issam
 * Key class for Entity Bean: DdeAnnulDecl
 */


public class DdeAnnulDeclKey implements Serializable {
      

	private static final long serialVersionUID = 8378156363053778672L;
	
	@Column(name="DECANNEEENREGDEC",length=4,nullable=false)
    private String decAnneeEnregDec;
	
	@Column(name="DECBURENREGDEC",length=3,nullable=false)
    private String decBurEnregDec;
	
	@Column(name="DECNUMDECLARATION",nullable=false)
    private Integer decNumDeclaration;	
	
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
	
	public DdeAnnulDeclKey() {
		
    }
	
	public DdeAnnulDeclKey(String decAnneeEnregDec,String decBurEnregDec, Integer decNumDeclaration)
	{
		this.decAnneeEnregDec=decAnneeEnregDec;
		this.decBurEnregDec= decBurEnregDec;
		this.decNumDeclaration=  decNumDeclaration;			
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		DdeAnnulDeclKey other = (DdeAnnulDeclKey) obj;
		if (decAnneeEnregDec == null) {
			if (other.decAnneeEnregDec != null){
				return false;
			}
		} else if (!decAnneeEnregDec.equals(other.decAnneeEnregDec)){
			return false;
		}
		if (decBurEnregDec == null) {
			if (other.decBurEnregDec != null){
				return false;
			}
		} else if (!decBurEnregDec.equals(other.decBurEnregDec)){
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