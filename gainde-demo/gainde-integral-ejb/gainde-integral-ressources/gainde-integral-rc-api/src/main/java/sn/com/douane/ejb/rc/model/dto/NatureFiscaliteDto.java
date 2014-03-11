package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class NatureFiscaliteDto implements Serializable{
	
	private static final long serialVersionUID = 6299942838316686965L;
	private String rccodefiscalite;
    private String rcdesfiscalite;
	private String pk; 
	private String editCell; 
	private String delCell; 
	
	public NatureFiscaliteDto() {
		super();
	}

	public String getRccodefiscalite() {
		return rccodefiscalite;
	}

	public void setRccodefiscalite(String rccodefiscalite) {
		this.rccodefiscalite = rccodefiscalite;
	}

	public String getRcdesfiscalite() {
		return rcdesfiscalite;
	}

	public void setRcdesfiscalite(String rcdesfiscalite) {
		this.rcdesfiscalite = rcdesfiscalite;
	}

	public String getPk() {
		pk = rccodefiscalite;
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
