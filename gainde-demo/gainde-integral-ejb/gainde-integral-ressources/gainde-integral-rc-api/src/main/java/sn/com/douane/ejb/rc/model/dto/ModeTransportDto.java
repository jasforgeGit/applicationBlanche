package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class ModeTransportDto implements Serializable{

	private static final long serialVersionUID = -8905294308016822750L;
	private String rcCodeModeTrans;
	private String rcLibelleModeTrans;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ModeTransportDto() {
		super();
	}

	public String getRcCodeModeTrans() {
		return rcCodeModeTrans;
	}

	public void setRcCodeModeTrans(String rcCodeModeTrans) {
		this.rcCodeModeTrans = rcCodeModeTrans;
	}

	public String getRcLibelleModeTrans() {
		return rcLibelleModeTrans;
	}

	public void setRcLibelleModeTrans(String rcLibelleModeTrans) {
		this.rcLibelleModeTrans = rcLibelleModeTrans;
	}

	public String getPk() {
		pk = rcCodeModeTrans;
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
