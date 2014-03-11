package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class CompBureauDto implements Serializable{

	private static final long serialVersionUID = -7919355854336827338L;
	private String rccodecompetence ;
    private String rcdescompetences;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public CompBureauDto() {
		super();
	}

	public String getRccodecompetence() {
		return rccodecompetence;
	}

	public void setRccodecompetence(String rccodecompetence) {
		this.rccodecompetence = rccodecompetence;
	}

	public String getRcdescompetences() {
		return rcdescompetences;
	}

	public void setRcdescompetences(String rcdescompetences) {
		this.rcdescompetences = rcdescompetences;
	}

	public String getPk() {
		pk = rccodecompetence;
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
