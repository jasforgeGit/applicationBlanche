package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class RegapuregapureDto implements Serializable{


	private static final long serialVersionUID = 5162521776100369014L;
	private String rcTypeRegApure;
	private String rcRegDouApure; 
	private String rcTypeRegApurant;
	private String rcRegDouApurant; 
	private String pk; 
	private String editCell; 
	private String delCell;

	public RegapuregapureDto() {
		super();
	}

	public String getRcTypeRegApure() {
		return rcTypeRegApure;
	}

	public void setRcTypeRegApure(String rcTypeRegApure) {
		this.rcTypeRegApure = rcTypeRegApure;
	}

	public String getRcRegDouApure() {
		return rcRegDouApure;
	}

	public void setRcRegDouApure(String rcRegDouApure) {
		this.rcRegDouApure = rcRegDouApure;
	}

	public String getRcTypeRegApurant() {
		return rcTypeRegApurant;
	}

	public void setRcTypeRegApurant(String rcTypeRegApurant) {
		this.rcTypeRegApurant = rcTypeRegApurant;
	}

	public String getRcRegDouApurant() {
		return rcRegDouApurant;
	}

	public void setRcRegDouApurant(String rcRegDouApurant) {
		this.rcRegDouApurant = rcRegDouApurant;
	}

	public String getPk() {
		pk =
				rcTypeRegApure + ConstManif.TIELD + rcRegDouApure + ConstManif.TIELD + rcTypeRegApurant
						+ ConstManif.TIELD + rcRegDouApurant;
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
