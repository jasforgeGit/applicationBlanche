package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author: issam Key class for Entity Bean: Artdecpjt
 */

public class ArtDecPjtKey implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -573639650231056667L;

	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;

	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Column(name = "DECCODEPIECEJT", length = 3, nullable = false)
	private String decCodePieceJt;

	public ArtDecPjtKey() {
	}

	public ArtDecPjtKey(Integer decNumArtDec, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			String decCodePieceJt) {
		this.decNumArtDec = decNumArtDec;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decCodePieceJt = decCodePieceJt;
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

	public String getDecCodePieceJt() {
		return decCodePieceJt;
	}

	public void setDecCodePieceJt(String decCodePieceJt) {
		this.decCodePieceJt = decCodePieceJt;
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
				+ ((decCodePieceJt == null) ? 0 : decCodePieceJt.hashCode());
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ArtDecPjtKey other = (ArtDecPjtKey) obj;
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
		if (decCodePieceJt == null) {
			if (other.decCodePieceJt != null){
				return false;
			}
		} else if (!decCodePieceJt.equals(other.decCodePieceJt)){
			return false;
		}
		if (decNumArtDec == null) {
			if (other.decNumArtDec != null){
				return false;
			}
		} else if (!decNumArtDec.equals(other.decNumArtDec)){
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