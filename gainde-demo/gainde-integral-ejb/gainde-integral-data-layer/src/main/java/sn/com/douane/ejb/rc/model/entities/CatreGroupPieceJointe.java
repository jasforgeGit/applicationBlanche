package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.CatreGroupPieceJointeKey;

/**
 * CatreGroupPieceJointe EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(CatreGroupPieceJointeKey.class)
@Table(name = "CATREGROUPPJ")
public class CatreGroupPieceJointe implements Serializable {

	private static final long serialVersionUID = -3446547765414564686L;
	
	@Id
	@Column(name = "RCCODECATREGROUP", length = 3, nullable = false)
	private String rcCodeCatreGroup;
	
	@Id
	@Column(name = "RCCODEPJ", length = 3, nullable = false)
	private String rcCodePieceJointe;

	@Column(name = "RCDATEPJ")
	private java.sql.Date rcDatePj;
	
	@ManyToOne
	@JoinColumn(name = "RCCODEPJ", insertable = false, updatable = false)
    private PieceJointe pieceJointe;
    
	@ManyToOne
	@JoinColumn(name = "RCCODECATREGROUP", insertable = false, updatable = false)
    private CatreGroup catreGroup;
	
	/**
	 * Enable JPA optimstic lock.
	 */	
//	@Version
//	@Column(nullable = false)
//	private int version;
//	
	/**
	 * 0-args constructor.
	 */
	public CatreGroupPieceJointe() {
		super();
	}

	public CatreGroupPieceJointe(String rccodecatregroup, String rccodepiecejointe) {
		super();
		this.rcCodeCatreGroup = rccodecatregroup;
		this.rcCodePieceJointe = rccodepiecejointe;
	}	

	public CatreGroupPieceJointe(PieceJointe pieceJointe, CatreGroup catreGroup) {
		super();
		this.pieceJointe = pieceJointe;
		this.catreGroup = catreGroup;
	}

	public String getRcCodeCatreGroup() {
		return rcCodeCatreGroup;
	}

	public void setRcCodeCatreGroup(String rcCodeCatreGroup) {
		this.rcCodeCatreGroup = rcCodeCatreGroup;
	}

	public String getRcCodePieceJointe() {
		return rcCodePieceJointe;
	}

	public void setRcCodePieceJointe(String rcCodePieceJointe) {
		this.rcCodePieceJointe = rcCodePieceJointe;
	}

	public java.sql.Date getRcDatePj() {
		return rcDatePj;
	}

	public void setRcDatePj(java.sql.Date rcDatePj) {
		this.rcDatePj = rcDatePj;
	}

	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}

	public CatreGroup getCatreGroup() {
		return catreGroup;
	}

	public void setCatreGroup(CatreGroup catreGroup) {
		this.catreGroup = catreGroup;
	}



	

}

