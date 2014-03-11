package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class PaysDto implements Serializable{


	private static final long serialVersionUID = -2637690416271417544L;
	private String rccodepays;
	private String rcpaysalphabetique;
	private String rclibellepays;
	private String rccodedevise;
	private String rccodelangue;
	private String rccodemonnetaire;
	private String rccodeprohibition;
	private java.sql.Date rcdateprohibition;
	private String rcnaturefiscalite;
	private String rccircuitvisite;
	private java.sql.Date rcdatefiscalite;
	private String pk; 
	private String editCell; 
	private String delCell; 
	
	public PaysDto() {
		super();
	}

	public String getRccodepays() {
		return rccodepays;
	}

	public void setRccodepays(String rccodepays) {
		this.rccodepays = rccodepays;
	}

	public String getRcpaysalphabetique() {
		return rcpaysalphabetique;
	}

	public void setRcpaysalphabetique(String rcpaysalphabetique) {
		this.rcpaysalphabetique = rcpaysalphabetique;
	}

	public String getRclibellepays() {
		return rclibellepays;
	}

	public void setRclibellepays(String rclibellepays) {
		this.rclibellepays = rclibellepays;
	}

	public String getRccodedevise() {
		return rccodedevise;
	}

	public void setRccodedevise(String rccodedevise) {
		this.rccodedevise = rccodedevise;
	}

	public String getRccodelangue() {
		return rccodelangue;
	}

	public void setRccodelangue(String rccodelangue) {
		this.rccodelangue = rccodelangue;
	}

	public String getRccodemonnetaire() {
		return rccodemonnetaire;
	}

	public void setRccodemonnetaire(String rccodemonnetaire) {
		this.rccodemonnetaire = rccodemonnetaire;
	}

	public String getRccodeprohibition() {
		return rccodeprohibition;
	}

	public void setRccodeprohibition(String rccodeprohibition) {
		this.rccodeprohibition = rccodeprohibition;
	}

	public java.sql.Date getRcdateprohibition() {
		return rcdateprohibition;
	}

	public void setRcdateprohibition(java.sql.Date rcdateprohibition) {
		this.rcdateprohibition = rcdateprohibition;
	}

	public String getRcnaturefiscalite() {
		return rcnaturefiscalite;
	}

	public void setRcnaturefiscalite(String rcnaturefiscalite) {
		this.rcnaturefiscalite = rcnaturefiscalite;
	}

	public String getRccircuitvisite() {
		return rccircuitvisite;
	}

	public void setRccircuitvisite(String rccircuitvisite) {
		this.rccircuitvisite = rccircuitvisite;
	}

	public java.sql.Date getRcdatefiscalite() {
		return rcdatefiscalite;
	}

	public void setRcdatefiscalite(java.sql.Date rcdatefiscalite) {
		this.rcdatefiscalite = rcdatefiscalite;
	}

	public String getPk() {
		pk = rccodepays;
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
