package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class IndicateurDto implements Serializable{


	private static final long serialVersionUID = 1403539986316138736L;

	private String rcCodeIndicateur;

	private String rcLibelleIndicateur;

	private String rcTypeIndicateur;

	private String pk; 
	
	private String editCell; 
	
	private String delCell;
	
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public String getRcLibelleIndicateur() {
		return rcLibelleIndicateur;
	}

	public void setRcLibelleIndicateur(String rcLibelleIndicateur) {
		this.rcLibelleIndicateur = rcLibelleIndicateur;
	}

	public String getRcTypeIndicateur() {
		return rcTypeIndicateur;
	}

	public void setRcTypeIndicateur(String rcTypeIndicateur) {
		this.rcTypeIndicateur = rcTypeIndicateur;
	}

	
	public String getPk() {
		pk = rcCodeIndicateur;
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
