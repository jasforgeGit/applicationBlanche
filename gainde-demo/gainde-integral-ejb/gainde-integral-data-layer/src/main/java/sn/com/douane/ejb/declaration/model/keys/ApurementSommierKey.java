/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author moussakare
 *
 */
public class ApurementSommierKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5661710311792143627L;
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Column(name = "DECANNEEAPUREMENT", length = 4, nullable = false)
	private java.lang.String decAnneeApurement;
	@Column(name = "DECBURAPURANTDEC", length = 3, nullable = false)
    private java.lang.String decBurApurantDec;
	@Column(name = "DECNUMDECAPURANT", nullable = false)
    private java.lang.Integer decNumDecApurant;
	@Column(name = "DECARTDECAPURANTE", nullable = false)
    private java.lang.Integer decArtDecApurante;
	@Column(name = "DECNATAPUREMENT", length = 1, nullable = false)
	private java.lang.String decNatApurement;
	/**
	 * 
	 */
	public ApurementSommierKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decAnneeApurement
	 * @param decBurApurantDec
	 * @param decNumDecApurant
	 * @param decArtDecApurante
	 * @param decNatApurement
	 */
	public ApurementSommierKey(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decAnneeApurement, String decBurApurantDec,
			Integer decNumDecApurant, Integer decArtDecApurante,
			String decNatApurement) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDec;
		this.decAnneeApurement = decAnneeApurement;
		this.decBurApurantDec = decBurApurantDec;
		this.decNumDecApurant = decNumDecApurant;
		this.decArtDecApurante = decArtDecApurante;
		this.decNatApurement = decNatApurement;
	}
	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
	}
	/**
	 * @return the decAnneeApurement
	 */
	public java.lang.String getDecAnneeApurement() {
		return decAnneeApurement;
	}
	/**
	 * @param decAnneeApurement the decAnneeApurement to set
	 */
	public void setDecAnneeApurement(java.lang.String decAnneeApurement) {
		this.decAnneeApurement = decAnneeApurement;
	}
	/**
	 * @return the decBurApurantDec
	 */
	public java.lang.String getDecBurApurantDec() {
		return decBurApurantDec;
	}
	/**
	 * @param decBurApurantDec the decBurApurantDec to set
	 */
	public void setDecBurApurantDec(java.lang.String decBurApurantDec) {
		this.decBurApurantDec = decBurApurantDec;
	}
	/**
	 * @return the decNumDecApurant
	 */
	public java.lang.Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}
	/**
	 * @param decNumDecApurant the decNumDecApurant to set
	 */
	public void setDecNumDecApurant(java.lang.Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}
	/**
	 * @return the decArtDecApurante
	 */
	public java.lang.Integer getDecArtDecApurante() {
		return decArtDecApurante;
	}
	/**
	 * @param decArtDecApurante the decArtDecApurante to set
	 */
	public void setDecArtDecApurante(java.lang.Integer decArtDecApurante) {
		this.decArtDecApurante = decArtDecApurante;
	}
	/**
	 * @return the decNatApurement
	 */
	public java.lang.String getDecNatApurement() {
		return decNatApurement;
	}
	/**
	 * @param decNatApurement the decNatApurement to set
	 */
	public void setDecNatApurement(java.lang.String decNatApurement) {
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
		ApurementSommierKey other = (ApurementSommierKey) obj;
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
