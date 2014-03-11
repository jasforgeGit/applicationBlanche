package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;

/**
 * @author kerfahi ghazi
 */
public class ProduitPjtDto implements Serializable{


	private static final long serialVersionUID = -6129962119588523688L;
	private String rccodeproduit;
	private String rcprecuemoaprod;
	private String rcprecsenprod;
	private String rccodepiecejointe;
	private java.sql.Date rcdatepiecejointe;
	private String rcimportexport;
	private String datePieceJointe;
	private String libellePj;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ProduitPjtDto() {
		super();
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

	public String getPk() {
		pk = rccodeproduit + ConstManif.TIELD + rcprecuemoaprod + ConstManif.TIELD + rcprecsenprod + ConstManif.TIELD + rccodepiecejointe;
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEditCell() {
		return editCell;
	}

	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}

	public String getDelCell() {
		return delCell;
	}

	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}

}
