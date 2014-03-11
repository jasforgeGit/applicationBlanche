/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class HistoriqueSommierKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3043214181594844736L;
	
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Column(name = "DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDec;
	/**
	 * 
	 */
	public HistoriqueSommierKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 */
	public HistoriqueSommierKey(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
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
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

}
