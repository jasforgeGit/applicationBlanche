package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

import sn.com.douane.utils.ConstManif;

/**
 * @author kerfahi ghazi
 */
public class RegimeDouanierDto implements Serializable{

	private static final long serialVersionUID = -1169121046069063618L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private String rcLibelleRegimeDouanier;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeDouanierDto() {
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

	public String getRcLibelleRegimeDouanier() {
		return rcLibelleRegimeDouanier;
	}

	public void setRcLibelleRegimeDouanier(String rcLibelleRegimeDouanier) {
		this.rcLibelleRegimeDouanier = rcLibelleRegimeDouanier;
	}

	public String getPk() {
		pk = rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier;
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
