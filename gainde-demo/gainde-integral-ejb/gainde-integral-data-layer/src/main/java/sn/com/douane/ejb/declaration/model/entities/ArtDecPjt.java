package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArtDecPjtKey;

/**
 * @author: issam Bean implementation class for Enterprise Bean: ArtDecPjt
 */

@Entity
@Table(name = "ARTDECPJT")
@IdClass(ArtDecPjtKey.class)
@NamedQueries(@NamedQuery(name = "findPiecesByArticle", query = "select object(o) from ArtDecPjt o where o.decAnneeEnregDec = ?1 and  o.decBurEnregDec = ?2 and  o.decNumDeclaration = ?3 and  o.decNumArtDec = ?4"))
public class ArtDecPjt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6186305570655197217L;
	@Id
	@Column(name = "DECNUMARTDEC", nullable = false)
	private Integer decNumArtDec;
	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	@Id
	@Column(name = "DECCODEPIECEJT", length = 3, nullable = false)
	private String decCodePieceJt;

	@Column(name = "DECDATECREATION")
	private Date decDateCreation;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	public ArtDecPjt() {
	}

	public ArtDecPjt(Integer decNumArtDec, String decAnneeEnregDec,
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

	public Date getDecDateCreation() {
		return decDateCreation;
	}

	public void setDecDateCreation(Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

}