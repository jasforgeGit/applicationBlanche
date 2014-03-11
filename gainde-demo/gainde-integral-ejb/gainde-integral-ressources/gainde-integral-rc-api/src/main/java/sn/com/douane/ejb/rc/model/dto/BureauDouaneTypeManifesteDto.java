package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class BureauDouaneTypeManifesteDto implements Serializable{

	private static final long serialVersionUID = 2214835134575976179L;
	private String rcCodeBurDouane;
	private Integer rcCodeTypeManif;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public BureauDouaneTypeManifesteDto() {
		super();
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}

	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}

	public Integer getRcCodeTypeManif() {
		return rcCodeTypeManif;
	}

	public void setRcCodeTypeManif(Integer rcCodeTypeManif) {
		this.rcCodeTypeManif = rcCodeTypeManif;
	}

	public String getPk() {
		pk = rcCodeTypeManif+ConstManif.TIELD+rcCodeBurDouane;
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
