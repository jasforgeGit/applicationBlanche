package  sn.com.douane.ejb.declaration.model.keys;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author thouraya
 * 
 * Key class for Entity Bean: SegArtDec
 */
public class DispensesArtDecKey implements Serializable {

	private static final long serialVersionUID = -215629630722289764L;

	@Id @Column(name = "DECANNEEENREGDEC",length  =  4, nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC",length  =  3, nullable = false)
	private String decBurEnregDec;

	@Id @Column(name = "DECCODEDISPENSE",length = 5, nullable = false)
	private String decCodeDispense;

	@Id @Column(name = "DECNUMDECLARATION",nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDEC",nullable = false)
	private Integer decNumArtDec;


	public DispensesArtDecKey(String decAnneeEnregDec, String decBurEnregDec, String decCodeDispense, Integer decNumDeclaration, Integer decNumArtDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decCodeDispense = decCodeDispense;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;

	}

	public DispensesArtDecKey() {
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

	public String getDecCodeDispense() {
		return decCodeDispense;
	}

	public void setDecCodeDispense(String decCodeDispense) {
		this.decCodeDispense = decCodeDispense;
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
		+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec
				.hashCode());
		result = prime
		* result
		+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime
		* result
		+ ((decCodeDispense == null) ? 0 : decCodeDispense
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
		if (obj instanceof DispensesArtDecKey) {
			DispensesArtDecKey o = (DispensesArtDecKey) obj;
			return ((this.decNumArtDec.equals(o.decNumArtDec))
				&& (this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
				&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
				&& (this.decCodeDispense.equals(o.decCodeDispense)) 
				&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}
}