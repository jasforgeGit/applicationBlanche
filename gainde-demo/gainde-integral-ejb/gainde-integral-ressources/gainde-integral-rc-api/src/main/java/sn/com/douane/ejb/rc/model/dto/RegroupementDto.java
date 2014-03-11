package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

/**
 * @author kerfahi ghazi
 */
public class RegroupementDto implements Serializable {


	private static final long serialVersionUID = -7272716645524106328L;
	private String rcCodeRegroup;
    private String rcLibelleRegroup;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegroupementDto() {
		super();
	}

	public String getRcCodeRegroup() {
		return rcCodeRegroup;
	}

	public void setRcCodeRegroup(String rcCodeRegroup) {
		this.rcCodeRegroup = rcCodeRegroup;
	}

	public String getRcLibelleRegroup() {
		return rcLibelleRegroup;
	}

	public void setRcLibelleRegroup(String rcLibelleRegroup) {
		this.rcLibelleRegroup = rcLibelleRegroup;
	}

	public String getPk() {
		pk = rcCodeRegroup;
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
