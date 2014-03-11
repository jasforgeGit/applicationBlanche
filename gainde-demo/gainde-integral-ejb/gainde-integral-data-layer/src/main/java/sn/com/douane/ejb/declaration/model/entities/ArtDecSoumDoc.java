package sn.com.douane.ejb.declaration.model.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArtDecSoumDocKey;

/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: ArtDecSoumDoc
 */
@Entity
@Table(name = "ARTDECSOUMDOC")
@IdClass(ArtDecSoumDocKey.class)

public class ArtDecSoumDoc implements Serializable {

	private static final long serialVersionUID = -8447627675440111721L;
	@Id
	@Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Id
	@Column(name = "DECCODESOUMDOC" , length = 2 , nullable = false)
	private java.lang.String decCodeSoumDoc;
	@Id
	@Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private java.lang.String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private java.lang.Integer decNumDeclaration;
	@Id
	@Column(name = "DECNUMARTDEC" , nullable = false)
	private java.lang.Integer decNumArtDec;
	
    /***ce champs est ajoute pour calcul pieces jointes ***/
	private transient String decCodePieceJointe;
	

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false)})
	private SegArtDec segArtDec;
	

	public ArtDecSoumDoc(){
	}
	public ArtDecSoumDoc(String decAnneeEnregDec , String decCodeSoumDoc , String decBurEnregDec , Integer decNumDeclaration , Integer decNumArtDec){
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decCodeSoumDoc = decCodeSoumDoc;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
	}
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}
	public java.lang.String getDecCodeSoumDoc() {
		return decCodeSoumDoc;
	}
	public void setDecCodeSoumDoc(java.lang.String decCodeSoumDoc) {
		this.decCodeSoumDoc = decCodeSoumDoc;
	}
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	public SegArtDec getSegArtDec() {
		return segArtDec;
	}
	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}
	
	/**
	 * @return the decCodePieceJointe
	 */
	public String getDecCodePieceJointe() {
		return decCodePieceJointe;
	}
	
	/**
	 * @param decCodePieceJointe the decCodePieceJointe to set
	 */
	public void setDecCodePieceJointe(String decCodePieceJointe) {
		this.decCodePieceJointe = decCodePieceJointe;
	}
	


}