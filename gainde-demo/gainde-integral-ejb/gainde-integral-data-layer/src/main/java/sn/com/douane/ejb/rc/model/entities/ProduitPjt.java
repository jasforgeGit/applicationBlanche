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
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.ProduitPjtKey;


@Entity
@IdClass(ProduitPjtKey.class)
@NamedQueries(@javax.persistence.NamedQuery(name = "findByArticle", query = "select object(o) from ProduitPjt o where o.rccodeproduit=?1 and o.rcprecuemoaprod=?2 and o.rcprecsenprod=?3"))
@Table(name="PRODUITSPJT")
public class ProduitPjt implements Serializable {
		
		public ProduitPjt(){
			
		}

	private static final long serialVersionUID = 4597418653800487239L;
	@Id
	@Column(name = "RCCODEPRODUIT", length = 6, nullable = false)
	private String rccodeproduit;

	@Id
	@Column(name = "RCPRECUEMOAPROD", length = 2, nullable = false)
	private String rcprecuemoaprod;

	@Id
	@Column(name = "RCPRECSENPROD", length = 2, nullable = false)
	private String rcprecsenprod;

	@Id
	@Column(name = "RCCODEPIECEJOINTE", length = 3, nullable = false)
	private String rccodepiecejointe;

	@Column(name = "RCDATEPIECEJOINTE")
	private java.sql.Date rcdatepiecejointe;

	@Column(name = "RCIMPORTEXPORT", length = 1)
	private String rcimportexport;

	@ManyToOne(targetEntity = PieceJointe.class)
	@JoinColumn(name = "rccodepiecejointe", insertable = false, updatable = false)
	private PieceJointe pieceJointe;
	
	@Transient
	private String datePieceJointe;
	
	@Transient
	private String libellePj;

	public ProduitPjt(String rccodeproduit, String rcprecuemoaprod,
			String rcprecsenprod, PieceJointe pieceJointe) {
		super();
		this.rccodeproduit=rccodeproduit;
		this.rcprecuemoaprod = rcprecuemoaprod;
		this.rcprecsenprod= rcprecsenprod;
		this.pieceJointe = pieceJointe;
		
	}

	public ProduitPjt(String rccodeproduit, String rcprecuemoaprod,
			String rcprecsenprod, String rccodepiecejointe) {
		super();
		this.rccodeproduit=rccodeproduit;
		this.rcprecuemoaprod = rcprecuemoaprod;
		this.rcprecsenprod= rcprecsenprod;
		this.rccodepiecejointe=rccodepiecejointe;
		
	}

	public String getRccodeproduit() {
		return rccodeproduit;
	}

	public void setRccodeproduit(String rccodeproduit) {
		this.rccodeproduit = rccodeproduit;
	}

	public String getRcprecuemoaprod() {
		return rcprecuemoaprod;
	}

	public void setRcprecuemoaprod(String rcprecuemoaprod) {
		this.rcprecuemoaprod = rcprecuemoaprod;
	}

	public String getRcprecsenprod() {
		return rcprecsenprod;
	}

	public void setRcprecsenprod(String rcprecsenprod) {
		this.rcprecsenprod = rcprecsenprod;
	}

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public java.sql.Date getRcdatepiecejointe() {
		return rcdatepiecejointe;
	}

	public void setRcdatepiecejointe(java.sql.Date rcdatepiecejointe) {
		this.rcdatepiecejointe = rcdatepiecejointe;
	}

	public String getRcimportexport() {
		return rcimportexport;
	}

	public void setRcimportexport(String rcimportexport) {
		this.rcimportexport = rcimportexport;
	}

	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}

	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}

	public String getDatePieceJointe() {
		return datePieceJointe;
	}

	public void setDatePieceJointe(String datePieceJointe) {
		this.datePieceJointe = datePieceJointe;
	}

	public String getLibellePj() {
		return libellePj;
	}

	public void setLibellePj(String libellePj) {
		this.libellePj = libellePj;
	}

}
