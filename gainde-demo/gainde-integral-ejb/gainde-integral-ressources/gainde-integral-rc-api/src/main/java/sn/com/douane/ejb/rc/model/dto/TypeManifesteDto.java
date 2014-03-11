package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class TypeManifesteDto implements Serializable{

	private static final long serialVersionUID = 6595288809643151632L;
	private Integer rccodetypemanif;
    private String rclibelletypemanif;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeManifesteDto() {
		super();
	}

	public Integer getRccodetypemanif() {
		return rccodetypemanif;
	}

	public void setRccodetypemanif(Integer rccodetypemanif) {
		this.rccodetypemanif = rccodetypemanif;
	}

	public String getRclibelletypemanif() {
		return rclibelletypemanif;
	}

	public void setRclibelletypemanif(String rclibelletypemanif) {
		this.rclibelletypemanif = rclibelletypemanif;
	}

	public String getPk() {
		pk = String.valueOf(rccodetypemanif);
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
