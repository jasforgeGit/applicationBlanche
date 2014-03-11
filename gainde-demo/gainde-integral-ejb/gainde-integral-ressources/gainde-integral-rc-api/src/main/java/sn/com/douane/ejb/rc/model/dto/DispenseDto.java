package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class DispenseDto implements Serializable{

	private static final long serialVersionUID = -9187660468225298065L;
	private String rccodedispense;
    private String rcdesdispense;    
	private String rcCodeTaxe; 
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public DispenseDto() {
		super();
	}

	
	public String getRccodedispense() {
		return rccodedispense;
	}

	
	public void setRccodedispense(String rccodedispense) {
		this.rccodedispense = rccodedispense;
	}

	
	public String getRcdesdispense() {
		return rcdesdispense;
	}

	
	public void setRcdesdispense(String rcdesdispense) {
		this.rcdesdispense = rcdesdispense;
	}

	
	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	
	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	
	public String getPk() {
		pk = rccodedispense;
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
