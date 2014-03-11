package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


/**
 * @author kerfahi ghazi
 */
public class RegroupPaysDto implements Serializable{


	private static final long serialVersionUID = -6627635205618332198L;
	private String rcCodeRegroup;
	private String rcCodePays;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegroupPaysDto() {
		super();
	}

	public String getRcCodeRegroup() {
		return rcCodeRegroup;
	}

	public void setRcCodeRegroup(String rcCodeRegroup) {
		this.rcCodeRegroup = rcCodeRegroup;
	}

	public String getRcCodePays() {
		return rcCodePays;
	}

	public void setRcCodePays(String rcCodePays) {
		this.rcCodePays = rcCodePays;
	}

	public String getPk() {
		pk = rcCodeRegroup + ConstManif.TIELD + rcCodePays;
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
