package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class LieuEmbarquementDto implements Serializable{

	private static final long serialVersionUID = -2308625624231349236L;
	private String rccodelieuemb;
    private String rclibellelieuemb;
    private String rccodepays;
    private String rctypelieuemb;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public LieuEmbarquementDto() {
		super();
	}

	public String getRccodelieuemb() {
		return rccodelieuemb;
	}

	public void setRccodelieuemb(String rccodelieuemb) {
		this.rccodelieuemb = rccodelieuemb;
	}

	public String getRclibellelieuemb() {
		return rclibellelieuemb;
	}

	public void setRclibellelieuemb(String rclibellelieuemb) {
		this.rclibellelieuemb = rclibellelieuemb;
	}

	public String getRccodepays() {
		return rccodepays;
	}

	public void setRccodepays(String rccodepays) {
		this.rccodepays = rccodepays;
	}

	public String getRctypelieuemb() {
		return rctypelieuemb;
	}

	public void setRctypelieuemb(String rctypelieuemb) {
		this.rctypelieuemb = rctypelieuemb;
	}

	public String getPk() {
		pk = rccodelieuemb;
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
