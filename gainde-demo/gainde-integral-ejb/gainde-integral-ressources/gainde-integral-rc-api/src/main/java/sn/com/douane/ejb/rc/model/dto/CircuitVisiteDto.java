package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class CircuitVisiteDto implements Serializable{

	private static final long serialVersionUID = -3869085509334070739L;
	private String rccodecircuit;
    private String rcdescircuitvisite;
    private String rccouleur;
    private Integer rcpriorite;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public CircuitVisiteDto() {
		super();
	}

	public String getRccodecircuit() {
		return rccodecircuit;
	}

	public void setRccodecircuit(String rccodecircuit) {
		this.rccodecircuit = rccodecircuit;
	}

	public String getRcdescircuitvisite() {
		return rcdescircuitvisite;
	}

	public void setRcdescircuitvisite(String rcdescircuitvisite) {
		this.rcdescircuitvisite = rcdescircuitvisite;
	}

	public String getRccouleur() {
		return rccouleur;
	}

	public void setRccouleur(String rccouleur) {
		this.rccouleur = rccouleur;
	}

	public Integer getRcpriorite() {
		return rcpriorite;
	}

	public void setRcpriorite(Integer rcpriorite) {
		this.rcpriorite = rcpriorite;
	}

	public String getPk() {
		pk = rccodecircuit;
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
