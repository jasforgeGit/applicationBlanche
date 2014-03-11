package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class CatreGroupDto implements Serializable{

	private static final long serialVersionUID = 1992282548302496659L;
	private String rcCodeCatreGroup;	
    private String rcLibCatreGroup; 
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public CatreGroupDto() {
		super();
	}

	public String getRcCodeCatreGroup() {
		return rcCodeCatreGroup;
	}

	public void setRcCodeCatreGroup(String rcCodeCatreGroup) {
		this.rcCodeCatreGroup = rcCodeCatreGroup;
	}

	public String getRcLibCatreGroup() {
		return rcLibCatreGroup;
	}

	public void setRcLibCatreGroup(String rcLibCatreGroup) {
		this.rcLibCatreGroup = rcLibCatreGroup;
	}

	public String getPk() {
		pk	= rcCodeCatreGroup;
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
