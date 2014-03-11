package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.PieceJointeRegimeKey;

// import tn.com.tw.java.exception.TwreException;

/**
 * Bean implementation class for Enterprise Bean: Pjtregimes
 */
@Entity
@IdClass(PieceJointeRegimeKey.class)
 @NamedQueries(@javax.persistence.NamedQuery(name = "findByrepertoire", query =
 "select object(o) from PieceJointeRegime o where o.rctyperegime=?1 and o.rccoderegdou=?2 and o.rcregfiscal=?3 and o.rcdatepiecej>=?4"))
@Table(name = "PJTREGIMES")
public class PieceJointeRegime implements Serializable {

	private static final long serialVersionUID = -3554677681182977332L;

	@Id
	@Column(name = "RCTYPEREGIME",length = 1,nullable = false)
	private String rctyperegime;

	@Id
	@Column(name = "RCCODEREGDOU",length = 1,nullable = false)
	private String rccoderegdou;

	@Id
	@Column(name = "RCREGFISCAL",length = 2,nullable = false)
	private String rcregfiscal;

	@Id
	@Column(name = "RCCODEPIECEJ",length = 3,nullable = false)
	private String rccodepiecejointe;

	@Column(name = "RCDATEPIECEJ",nullable = false)
	private java.sql.Date rcdatepiecej;

	@ManyToOne
	@JoinColumn(name = "RCCODEPIECEJ",insertable = false,updatable = false)
	private PieceJointe pieceJointe;
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;
	
	/**
	 * 0-args constructor.
	 */
	public PieceJointeRegime() {
		super();
	}

	/**
	 * 4-args constructor.
	 * 
	 * @param rctyperegime
	 * @param rccoderegdou
	 * @param rcregfiscal
	 * @param rccodepiecejointe
	 */
	public PieceJointeRegime(String rctyperegime, String rccoderegdou,
			String rcregfiscal, String rccodepiecejointe) {
		super();
		this.rctyperegime = rctyperegime;
		this.rccoderegdou = rccoderegdou;
		this.rcregfiscal = rcregfiscal;
		this.rccodepiecejointe = rccodepiecejointe;
	}

	/**
	 * Get accessor for persistent attribute: rctyperegime
	 */
	public String getRctyperegime() {
		return rctyperegime;
	}

	/**
	 * Set accessor for persistent attribute: rctyperegime
	 */
	public void setRctyperegime(String rctyperegime) {
		this.rctyperegime = rctyperegime;
	}

	/**
	 * Get accessor for persistent attribute: rccoderegdou
	 */
	public String getRccoderegdou() {
		return rccoderegdou;
	}

	/**
	 * Set accessor for persistent attribute: rccoderegdou
	 */
	public void setRccoderegdou(String rccoderegdou) {
		this.rccoderegdou = rccoderegdou;
	}

	/**
	 * Get accessor for persistent attribute: rcregfiscal
	 */
	public String getRcregfiscal() {
		return rcregfiscal;
	}

	/**
	 * Set accessor for persistent attribute: rcregfiscal
	 */
	public void setRcregfiscal(String rcregfiscal) {
		this.rcregfiscal = rcregfiscal;
	}

	/**
	 * Get accessor for persistent attribute: rcdatepiecej
	 */
	public java.sql.Date getRcdatepiecej() {
		return rcdatepiecej;
	}

	/**
	 * Set accessor for persistent attribute: rcdatepiecej
	 */
	public void setRcdatepiecej(java.sql.Date rcdatepiecej) {
		this.rcdatepiecej = rcdatepiecej;
	}

	
	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}


	

}
