package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ApurementSommierDlppKey implements Serializable {

	private static final long serialVersionUID = -8839386540147727745L;

	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Column(name = "DECANNEEAPUREMENT", length = 4, nullable = false)
	private String decAnneeApurement;

	@Column(name = "DECBURAPURANTDEC", length = 3, nullable = false)
	private String decBurApurantDec;

	@Column(name = "DECNUMDECAPURANT", nullable = false)
	private Integer decNumDecApurant;

	@Column(name = "DECARTDECAPURANTE", nullable = false)
	private Integer decArtDecApurante;

	@Column(name = "DECNATAPUREMENT", length = 1, nullable = false)
	private String decNatApurement;
	
	

	public ApurementSommierDlppKey() {
		super();
	}

	public ApurementSommierDlppKey(String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDecl, String decAnneeApurement,
			String decBurApurantDec, Integer decNumDecApurant,
			Integer decArtDecApurante, String decNatApurement) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeApurement = decAnneeApurement;
		this.decBurApurantDec = decBurApurantDec;
		this.decNumDecApurant = decNumDecApurant;
		this.decArtDecApurante = decArtDecApurante;
		this.decNatApurement = decNatApurement;
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

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecAnneeApurement() {
		return decAnneeApurement;
	}

	public void setDecAnneeApurement(String decAnneeApurement) {
		this.decAnneeApurement = decAnneeApurement;
	}

	public String getDecBurApurantDec() {
		return decBurApurantDec;
	}

	public void setDecBurApurantDec(String decBurApurantDec) {
		this.decBurApurantDec = decBurApurantDec;
	}

	public Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}

	public void setDecNumDecApurant(Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}

	public Integer getDecArtDecApurante() {
		return decArtDecApurante;
	}

	public void setDecArtDecApurante(Integer decArtDecApurante) {
		this.decArtDecApurante = decArtDecApurante;
	}

	public String getDecNatApurement() {
		return decNatApurement;
	}

	public void setDecNatApurement(String decNatApurement) {
		this.decNatApurement = decNatApurement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeApurement == null) ? 0 : decAnneeApurement
						.hashCode());
		result = prime
				* result
				+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec.hashCode());
		result = prime
				* result
				+ ((decArtDecApurante == null) ? 0 : decArtDecApurante
						.hashCode());
		result = prime
				* result
				+ ((decBurApurantDec == null) ? 0 : decBurApurantDec.hashCode());
		result = prime * result
				+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime * result
				+ ((decNatApurement == null) ? 0 : decNatApurement.hashCode());
		result = prime * result
				+ ((decNumArtDecl == null) ? 0 : decNumArtDecl.hashCode());
		result = prime
				* result
				+ ((decNumDecApurant == null) ? 0 : decNumDecApurant.hashCode());
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
		ApurementSommierDlppKey other = (ApurementSommierDlppKey) obj;
		if (decAnneeApurement == null) {
			if (other.decAnneeApurement != null){
				return false;
			}
		} else if (!decAnneeApurement.equals(other.decAnneeApurement)){
			return false;
		}
		if (decAnneeEnregDec == null) {
			if (other.decAnneeEnregDec != null){
				return false;
			}
		} else if (!decAnneeEnregDec.equals(other.decAnneeEnregDec)){
			return false;
		}
		if (decArtDecApurante == null) {
			if (other.decArtDecApurante != null){
				return false;
			}
		} else if (!decArtDecApurante.equals(other.decArtDecApurante)){
			return false;
		}
		if (decBurApurantDec == null) {
			if (other.decBurApurantDec != null){
				return false;
			}
		} else if (!decBurApurantDec.equals(other.decBurApurantDec)){
			return false;
		}
		if (decBurEnregDec == null) {
			if (other.decBurEnregDec != null){
				return false;
			}
		} else if (!decBurEnregDec.equals(other.decBurEnregDec)){
			return false;
		}
		if (decNatApurement == null) {
			if (other.decNatApurement != null){
				return false;
			}
		} else if (!decNatApurement.equals(other.decNatApurement)){
			return false;
		}
		if (decNumArtDecl == null) {
			if (other.decNumArtDecl != null){
				return false;
			}
		} else if (!decNumArtDecl.equals(other.decNumArtDecl)){
			return false;
		}
		if (decNumDecApurant == null) {
			if (other.decNumDecApurant != null){
				return false;
			}
		} else if (!decNumDecApurant.equals(other.decNumDecApurant)){
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
