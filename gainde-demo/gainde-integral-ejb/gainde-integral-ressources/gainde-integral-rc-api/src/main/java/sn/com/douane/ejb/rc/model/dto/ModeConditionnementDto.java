package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class ModeConditionnementDto implements Serializable{

	private static final long serialVersionUID = 5175695978038680560L;
	private String rcCodeModeCond;
	private String rcLibelleModeCond;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ModeConditionnementDto() {
		super();
	}

	public String getRcCodeModeCond() {
		return rcCodeModeCond;
	}

	public void setRcCodeModeCond(String rcCodeModeCond) {
		this.rcCodeModeCond = rcCodeModeCond;
	}

	public String getRcLibelleModeCond() {
		return rcLibelleModeCond;
	}

	public void setRcLibelleModeCond(String rcLibelleModeCond) {
		this.rcLibelleModeCond = rcLibelleModeCond;
	}

	public String getPk() {
		pk = rcCodeModeCond;
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
