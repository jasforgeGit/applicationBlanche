package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class DdeModifSegartDecKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5073452478089142203L;

	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	/** The dec bur enreg dec. */

	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	/** The dec num declaration. */

	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	/** The dec num art dec. */

	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;

	public DdeModifSegartDecKey(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;

	}

	public DdeModifSegartDecKey() {
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
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DdeModifSegartDecKey) {
			DdeModifSegartDecKey o = (DdeModifSegartDecKey) obj;
			return ((this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
					&& (this.decNumArtDec.equals(o.decNumArtDec))
					&& (this.decNumDeclaration.equals(o.decNumDeclaration)) && (this.decBurEnregDec
						.equals(o.decBurEnregDec)));
		}
		return false;
	}

}
