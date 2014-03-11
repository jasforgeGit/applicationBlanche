package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class BurModDeclDto implements Serializable{


	private static final long serialVersionUID = 1310377760777614864L;
	private String rcCodeBurDecl;
	private String rcModeDecl;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public BurModDeclDto() {
		super();
	}

	
	public String getRcCodeBurDecl() {
		return rcCodeBurDecl;
	}

	
	public void setRcCodeBurDecl(String rcCodeBurDecl) {
		this.rcCodeBurDecl = rcCodeBurDecl;
	}

	
	public String getRcModeDecl() {
		return rcModeDecl;
	}

	
	public void setRcModeDecl(String rcModeDecl) {
		this.rcModeDecl = rcModeDecl;
	}


	public String getPk() {
		pk	= rcCodeBurDecl + ConstManif.TIELD + rcModeDecl;
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
