package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class RegimeBurInterditDto implements Serializable{

	private static final long serialVersionUID = 3564663817130362816L;
	private String rcTypeRegime;
	private String rcCodeBurDouane;	
	private String rcCodeRegimeDouanier;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeBurInterditDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}

	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getPk() {
		pk = rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcCodeBurDouane ;
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
