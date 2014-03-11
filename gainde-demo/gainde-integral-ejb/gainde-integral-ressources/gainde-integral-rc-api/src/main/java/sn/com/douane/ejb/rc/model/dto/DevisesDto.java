package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class DevisesDto implements Serializable{

	private static final long serialVersionUID = 2596148856860473525L;
	private java.lang.String rccodedevise;
	private java.sql.Date rcdatedevise;
	private java.lang.String rclibelledevise;
	private java.math.BigDecimal rcqtedevise;
	private java.math.BigDecimal rcqtecfa;
	private java.lang.Integer rccoefficient;
	private java.lang.String rcusermodif;
	private java.lang.Integer rcprecisiondev;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public DevisesDto() {
		super();
	}

	public java.lang.String getRccodedevise() {
		return rccodedevise;
	}

	public void setRccodedevise(java.lang.String rccodedevise) {
		this.rccodedevise = rccodedevise;
	}

	public java.sql.Date getRcdatedevise() {
		return rcdatedevise;
	}

	public void setRcdatedevise(java.sql.Date rcdatedevise) {
		this.rcdatedevise = rcdatedevise;
	}

	public java.lang.String getRclibelledevise() {
		return rclibelledevise;
	}

	public void setRclibelledevise(java.lang.String rclibelledevise) {
		this.rclibelledevise = rclibelledevise;
	}

	public java.math.BigDecimal getRcqtedevise() {
		return rcqtedevise;
	}

	public void setRcqtedevise(java.math.BigDecimal rcqtedevise) {
		this.rcqtedevise = rcqtedevise;
	}

	public java.math.BigDecimal getRcqtecfa() {
		return rcqtecfa;
	}

	public void setRcqtecfa(java.math.BigDecimal rcqtecfa) {
		this.rcqtecfa = rcqtecfa;
	}

	public java.lang.Integer getRccoefficient() {
		return rccoefficient;
	}

	public void setRccoefficient(java.lang.Integer rccoefficient) {
		this.rccoefficient = rccoefficient;
	}

	public java.lang.String getRcusermodif() {
		return rcusermodif;
	}

	public void setRcusermodif(java.lang.String rcusermodif) {
		this.rcusermodif = rcusermodif;
	}

	public java.lang.Integer getRcprecisiondev() {
		return rcprecisiondev;
	}

	public void setRcprecisiondev(java.lang.Integer rcprecisiondev) {
		this.rcprecisiondev = rcprecisiondev;
	}

	public String getPk() {
		pk = rccodedevise;
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
