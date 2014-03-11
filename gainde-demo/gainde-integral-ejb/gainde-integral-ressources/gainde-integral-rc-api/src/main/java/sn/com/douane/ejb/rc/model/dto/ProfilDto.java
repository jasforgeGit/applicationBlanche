package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class ProfilDto implements Serializable{

	private static final long serialVersionUID = -6852768166164615479L;
	private String rcCodeProfil;
	private String rcLibelleProfil;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ProfilDto() {
		super();
	}

	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}

	public String getRcLibelleProfil() {
		return rcLibelleProfil;
	}

	public void setRcLibelleProfil(String rcLibelleProfil) {
		this.rcLibelleProfil = rcLibelleProfil;
	}

	public String getPk() {
		pk = rcCodeProfil;
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
