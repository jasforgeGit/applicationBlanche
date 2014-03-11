package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class TypeConteneurDto implements Serializable{

	private static final long serialVersionUID = 7035777710978037634L;
	private String rcCodeTypeCont;
	private String rcLibelleTypeCont;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeConteneurDto() {
		super();
	}

	public String getRcCodeTypeCont() {
		return rcCodeTypeCont;
	}

	public void setRcCodeTypeCont(String rcCodeTypeCont) {
		this.rcCodeTypeCont = rcCodeTypeCont;
	}

	public String getRcLibelleTypeCont() {
		return rcLibelleTypeCont;
	}

	public void setRcLibelleTypeCont(String rcLibelleTypeCont) {
		this.rcLibelleTypeCont = rcLibelleTypeCont;
	}

	public String getPk() {
		pk = rcCodeTypeCont;
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
