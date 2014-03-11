package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

/**
 * @author kerfahi ghazi
 */
public class TypeRegimeDouaneDto implements Serializable{

	private static final long serialVersionUID = -6589088179589694267L;
	private String rcTypeRegime;
	private String rcLibelleRegime;
	private String rcImportExport;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeRegimeDouaneDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcLibelleRegime() {
		return rcLibelleRegime;
	}

	public void setRcLibelleRegime(String rcLibelleRegime) {
		this.rcLibelleRegime = rcLibelleRegime;
	}

	public String getRcImportExport() {
		return rcImportExport;
	}

	public void setRcImportExport(String rcImportExport) {
		this.rcImportExport = rcImportExport;
	}

	public String getPk() {
		pk = rcTypeRegime;
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
