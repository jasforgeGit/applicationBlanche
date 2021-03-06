package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 
 * @author thouraya
 *
 */
public class HSegContDecKey implements Serializable{

	private static final long serialVersionUID = -5682495215289057039L;

	@Id @Column(name = "DECDATEARCHIVE",nullable = false)
	private Timestamp decDateArchive;

	@Id @Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC",length = 3, nullable = false)
	private String decBurEnregDec;

	@Id @Column(name="DECNUMDECLARATION",nullable=false)
	private Integer decNumDeclaration;

	@Id @Column(name="DECNUMARTDEC",nullable=false)
	private Integer decNumArtDec;

	@Id @Column(name="DECNUMARTCONTENEUR",nullable=false)
	private Integer decNumArtConteneur;
	
	
	public HSegContDecKey(Timestamp decDateArchive, String decAnneeEnregDec, String decBurEnregDec, Integer decNumDeclaration, Integer decNumArtDec, Integer decNumArtConteneur){
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decNumArtConteneur = decNumArtConteneur;
	}


	public HSegContDecKey() {
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


	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}


	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}


	public Integer getDecNumArtConteneur() {
		return decNumArtConteneur;
	}


	public void setDecNumArtConteneur(Integer decNumArtConteneur) {
		this.decNumArtConteneur = decNumArtConteneur;
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
				+ ((decNumArtConteneur == null) ? 0 : decNumArtConteneur
						.hashCode());
		result = prime * result
				+ ((decNumArtDec == null) ? 0 : decNumArtDec.hashCode());
		result = prime
				* result
				+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
						.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
			if (obj instanceof HSegContDecKey) {
				HSegContDecKey o = (HSegContDecKey) obj;
				return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
						&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
						&& (this.decDateArchive.equals(o.decDateArchive)) 
						&& (this.decNumArtConteneur.equals(o.decNumArtConteneur)) 
						&& (this.decNumArtDec.equals(o.decNumArtDec)) 
						&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
			}
			return false;
		}

}
