/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HArtDecPjtKey;

/**
 * @author moussakare
 *
 */
@Entity
@Table(name = "HARTDECPJT")
@IdClass(HArtDecPjtKey.class)
public class HArtDecPjt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8449664888797164627L;
	
	@Id @Column(name = "DECCODEPIECEJT", nullable = false)
	private java.lang.String decCodePieceJt;
	@Id @Column(name = "DECDATEARCHIVE", nullable = false)
    private java.sql.Timestamp decDateArchive;
	@Id @Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Id @Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id @Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id @Column(name = "DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Column(name = "DECDATECREATION")
    private java.sql.Date decDateCreation;
	
	
	@ManyToOne(targetEntity = HSegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECDATEARCHIVE", referencedColumnName = "DECDATEARCHIVE", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false)})
	private HSegArtDec hArtDecPjArt;


	/**
	 * 
	 */
	public HArtDecPjt() {
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
	public HArtDecPjt(String decCodePieceJt, Timestamp decDateArchive,
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


	/**
	 * @return the decDateCreation
	 */
	public java.sql.Date getDecDateCreation() {
		return decDateCreation;
	}


	/**
	 * @param decDateCreation the decDateCreation to set
	 */
	public void setDecDateCreation(java.sql.Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}


	/**
	 * @return the hArtDecPjArt
	 */
	public HSegArtDec gethArtDecPjArt() {
		return hArtDecPjArt;
	}


	/**
	 * @param hArtDecPjArt the hArtDecPjArt to set
	 */
	public void sethArtDecPjArt(HSegArtDec hArtDecPjArt) {
		this.hArtDecPjArt = hArtDecPjArt;
	}
	
	
	

}
