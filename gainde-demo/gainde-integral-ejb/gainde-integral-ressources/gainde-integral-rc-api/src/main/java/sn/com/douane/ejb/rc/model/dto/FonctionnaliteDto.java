package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class FonctionnaliteDto implements Serializable {

	private static final long serialVersionUID = -5080995741619040027L;
	private String rcCodeFonction;
	private String rcLibFonction;
	private String rcDescription;
	private String rcUrlFonction;
	private String rcCodeProfil;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public FonctionnaliteDto() {
		super();
	}

	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	public String getRcLibFonction() {
		return rcCodeFonction+"  "+rcLibFonction;
	}

	public void setRcLibFonction(String rcLibFonction) {
		this.rcLibFonction = rcLibFonction;
	}

	public String getRcDescription() {
		return rcDescription;
	}

	public void setRcDescription(String rcDescription) {
		this.rcDescription = rcDescription;
	}

	public String getRcUrlFonction() {
		return rcUrlFonction;
	}

	public void setRcUrlFonction(String rcUrlFonction) {
		this.rcUrlFonction = rcUrlFonction;
	}

	public String getRcCodeProfil() {
		return rcCodeProfil;
	}

	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}

	public String getPk() {
		pk	= rcCodeFonction;
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
