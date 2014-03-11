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

import sn.com.douane.ejb.declaration.model.keys.HArtDecSoumDocKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(HArtDecSoumDocKey.class)
@Table(name = "HARTDECSOUMDOC")
public class HArtDecSoumDoc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2545083014986054061L;
	
	@Id	@Column(name="DECDATEARCHIVE", nullable = false)
    private java.sql.Timestamp decDateArchive;
	@Id	@Column(name="DECANNEEENREGDEC", length= 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Id	@Column(name="DECBURENREGDEC", length= 3, nullable = false)
    private java.lang.String decBurEnregDec;
    @Id	@Column(name="DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
    @Id	@Column(name="DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDecl;
    @Id	@Column(name="DECCODESOUMDOC", length= 2, nullable = false)
    private java.lang.String decCodeSoumDoc;
    
    @ManyToOne(targetEntity = HSegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECDATEARCHIVE", referencedColumnName = "DECDATEARCHIVE", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false)})
	private HSegArtDec hArtDecSoumDoc;

	/**
	 * 
	 */
	public HArtDecSoumDoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decDateArchive
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDecl
	 * @param decCodeSoumDoc
	
	 */
	public HArtDecSoumDoc(Timestamp decDateArchive, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDecl, String decCodeSoumDoc) {
		super();
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeSoumDoc = decCodeSoumDoc;
				
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
	 * @return the decNumArtDecl
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	/**
	 * @param decNumArtDecl the decNumArtDecl to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	/**
	 * @return the decCodeSoumDoc
	 */
	public java.lang.String getDecCodeSoumDoc() {
		return decCodeSoumDoc;
	}

	/**
	 * @param decCodeSoumDoc the decCodeSoumDoc to set
	 */
	public void setDecCodeSoumDoc(java.lang.String decCodeSoumDoc) {
		this.decCodeSoumDoc = decCodeSoumDoc;
	}

	/**
	 * @return the hArtDecSoumDoc
	 */
	public HSegArtDec gethArtDecSoumDoc() {
		return hArtDecSoumDoc;
	}

	/**
	 * @param hArtDecSoumDoc the hArtDecSoumDoc to set
	 */
	public void sethArtDecSoumDoc(HSegArtDec hArtDecSoumDoc) {
		this.hArtDecSoumDoc = hArtDecSoumDoc;
	}
    
	
    

}
