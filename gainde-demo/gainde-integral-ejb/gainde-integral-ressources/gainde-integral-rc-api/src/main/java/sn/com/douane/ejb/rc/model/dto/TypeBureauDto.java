package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class TypeBureauDto implements Serializable{

	private static final long serialVersionUID = -4285194309529885113L;
	private Integer rccodetypebur;
    private String rclibelletypebur;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeBureauDto() {
		super();
	}

	public Integer getRccodetypebur() {
		return rccodetypebur;
	}

	public void setRccodetypebur(Integer rccodetypebur) {
		this.rccodetypebur = rccodetypebur;
	}

	public String getRclibelletypebur() {
		return rclibelletypebur;
	}

	public void setRclibelletypebur(String rclibelletypebur) {
		this.rclibelletypebur = rclibelletypebur;
	}

	public String getPk() {
		pk = String.valueOf(rccodetypebur);
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
