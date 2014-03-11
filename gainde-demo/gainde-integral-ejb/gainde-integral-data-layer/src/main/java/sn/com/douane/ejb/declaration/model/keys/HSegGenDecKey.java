package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.sound.midi.SysexMessage;

/**
 * 
 * @author thouraya
 *
 */
public class HSegGenDecKey implements Serializable{

	private static final long serialVersionUID = 4627375503094552221L;
	
	@Id @Column(name = "DECDATEARCHIVE", nullable = false)
    private Timestamp decDateArchive;
	
	@Id @Column(name="DECANNEEENREGDEC",length=4, nullable=false)
    private String decAnneeEnregDec;
	
	@Id @Column(name="DECBURENREGDEC",length=3, nullable=false)
    private String decBurEnregDec;
	
	@Id @Column(name="DECNUMDECLARATION", nullable=false)
    private Integer decNumDeclaration;
	
	public HSegGenDecKey(Timestamp decDateArchive, String decAnneeEnregDec, String decBurEnregDec, Integer decNumDeclaration){
       this.decDateArchive = decDateArchive;
       this.decAnneeEnregDec = decAnneeEnregDec;
       this.decBurEnregDec = decBurEnregDec;
       this.decNumDeclaration = decNumDeclaration;
     
    }


    public HSegGenDecKey() {
    	
    }


	public Timestamp getDecDateArchive() {
		return decDateArchive;
	}


	public void setDecDateArchive(Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
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
		result = prime * result
				+ ((decDateArchive == null) ? 0 : decDateArchive.hashCode());
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
		HSegGenDecKey other = (HSegGenDecKey) obj;
		if (decAnneeEnregDec == null) {
			if (other.decAnneeEnregDec != null){
				return false;
			}
		} else if (decAnneeEnregDec.compareTo(other.decAnneeEnregDec) != 0){
			return false;
		}
		if (decBurEnregDec == null) {
			if (other.decBurEnregDec != null){
				return false;
			}
		} else if (decBurEnregDec.compareTo(other.decBurEnregDec) != 0){
			return false;
		}
		if (decDateArchive == null) {
			if (other.decDateArchive != null){
				return false;
			}
		} else if (!decDateArchive.equals(other.decDateArchive)){
			return false;
		}
		if (decNumDeclaration == null) {
			if (other.decNumDeclaration != null){
				return false;
			}
		} else if (decNumDeclaration.toString().compareTo(other.decNumDeclaration.toString()) != 0){
			return false;
		}
		return true;
	}


	


	

}
