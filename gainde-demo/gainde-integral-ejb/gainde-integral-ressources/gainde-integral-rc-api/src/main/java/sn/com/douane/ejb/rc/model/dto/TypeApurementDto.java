package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class TypeApurementDto implements Serializable{


	private static final long serialVersionUID = -8344818921047903108L;
	private String rcCodeApurement;
	private String rcLibelleApurement;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeApurementDto() {
		super();
	}

	public String getRcCodeApurement() {
		return rcCodeApurement;
	}

	public void setRcCodeApurement(String rcCodeApurement) {
		this.rcCodeApurement = rcCodeApurement;
	}

	public String getRcLibelleApurement() {
		return rcLibelleApurement;
	}

	public void setRcLibelleApurement(String rcLibelleApurement) {
		this.rcLibelleApurement = rcLibelleApurement;
	}

	public String getPk() {
		pk = rcCodeApurement;
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
