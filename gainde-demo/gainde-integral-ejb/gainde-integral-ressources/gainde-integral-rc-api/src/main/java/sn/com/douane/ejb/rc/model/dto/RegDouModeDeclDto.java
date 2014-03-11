package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class RegDouModeDeclDto implements Serializable{

	private static final long serialVersionUID = 5605918995157971235L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier; 
	private String rcCodeModeDeclaration;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegDouModeDeclDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcCodeModeDeclaration() {
		return rcCodeModeDeclaration;
	}

	public void setRcCodeModeDeclaration(String rcCodeModeDeclaration) {
		this.rcCodeModeDeclaration = rcCodeModeDeclaration;
	}

	public String getPk() {
		pk = rcCodeModeDeclaration + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcTypeRegime;
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
