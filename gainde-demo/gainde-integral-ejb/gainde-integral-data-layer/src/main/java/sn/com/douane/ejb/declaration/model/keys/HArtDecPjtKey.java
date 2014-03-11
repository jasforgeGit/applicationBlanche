/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class HArtDecPjtKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8621274868521882640L;
	
	@Column(name = "DECCODEPIECEJT", nullable = false)
	private java.lang.String decCodePieceJt;
	@Column(name = "DECDATEARCHIVE", nullable = false)
    private java.sql.Timestamp decDateArchive;
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
	public HArtDecPjtKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param decCodePieceJt
	 * @param decDateArchive
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 */
	public HArtDecPjtKey(String decCodePieceJt, Timestamp decDateArchive,
			String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec) {
		super();
		this.decCodePieceJt = decCodePieceJt;
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
	}
	/**
	 * @return the decCodePieceJt
	 */
	public java.lang.String getDecCodePieceJt() {
		return decCodePieceJt;
	}
	/**
	 * @param decCodePieceJt the decCodePieceJt to set
	 */
	public void setDecCodePieceJt(java.lang.String decCodePieceJt) {
		this.decCodePieceJt = decCodePieceJt;
	}
	/**
	 * @return the decDateArchive
	 */
	public java.sql.Timestamp getDecDateArchive() {
		return decDateArchive;
	}
	/**
	 * @param decDateArchive the decDateArchive to set
	 */
	public void setDecDateArchive(java.sql.Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
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
