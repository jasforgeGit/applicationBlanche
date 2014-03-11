package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class ModeDeclarationDto implements Serializable{

	private static final long serialVersionUID = 3108473369754463576L;
	private String rcCodeModeDec;
	private String rcLibelleModeDec;
	private String rcIndicateurValeur;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ModeDeclarationDto() {
		super();
	}

	public String getRcCodeModeDec() {
		return rcCodeModeDec;
	}

	public void setRcCodeModeDec(String rcCodeModeDec) {
		this.rcCodeModeDec = rcCodeModeDec;
	}

	public String getRcLibelleModeDec() {
		return rcLibelleModeDec;
	}

	public void setRcLibelleModeDec(String rcLibelleModeDec) {
		this.rcLibelleModeDec = rcLibelleModeDec;
	}

	public String getRcIndicateurValeur() {
		return rcIndicateurValeur;
	}

	public void setRcIndicateurValeur(String rcIndicateurValeur) {
		this.rcIndicateurValeur = rcIndicateurValeur;
	}

	public String getPk() {
		pk = rcCodeModeDec;
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
