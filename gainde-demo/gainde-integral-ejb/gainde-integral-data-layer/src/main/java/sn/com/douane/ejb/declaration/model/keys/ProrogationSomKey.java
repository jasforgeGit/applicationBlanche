/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class ProrogationSomKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1384721814151000125L;
	@Column(name = "DECANNEEDECL", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Column(name = "DECBUREAUDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Column(name = "DECNUMDECL", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Column(name = "DECDATEPROROGATION", nullable = false)
    private java.sql.Date decDateProrogation;
	/**
	 * 
	 */
	public ProrogationSomKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decDateProrogation
	 */
	public ProrogationSomKey(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			Date decDateProrogation) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decDateProrogation = decDateProrogation;
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
	/**
	 * @return the decDateProrogation
	 */
	public java.sql.Date getDecDateProrogation() {
		return decDateProrogation;
	}
	/**
	 * @param decDateProrogation the decDateProrogation to set
	 */
	public void setDecDateProrogation(java.sql.Date decDateProrogation) {
		this.decDateProrogation = decDateProrogation;
	}
	
	

}
