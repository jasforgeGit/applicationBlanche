package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class LieuDepotDto implements Serializable {

	private static final long serialVersionUID = -950732458960420622L;
	private String rcCodeLieuDepot;
	private String rcLibelleLieuDepot;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public LieuDepotDto() {
		super();
	}

	public String getRcCodeLieuDepot() {
		return rcCodeLieuDepot;
	}

	public void setRcCodeLieuDepot(String rcCodeLieuDepot) {
		this.rcCodeLieuDepot = rcCodeLieuDepot;
	}

	public String getRcLibelleLieuDepot() {
		return rcLibelleLieuDepot;
	}

	public void setRcLibelleLieuDepot(String rcLibelleLieuDepot) {
		this.rcLibelleLieuDepot = rcLibelleLieuDepot;
	}

	public String getPk() {
		pk = rcCodeLieuDepot;
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
