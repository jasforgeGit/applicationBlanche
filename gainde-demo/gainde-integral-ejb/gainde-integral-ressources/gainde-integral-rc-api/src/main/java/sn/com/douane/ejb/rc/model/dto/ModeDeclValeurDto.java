package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ModeDeclValeurDto implements Serializable{

	private static final long serialVersionUID = -1839120927535542255L;
	private String rcCodeModeDec;
	private BigDecimal rcValeurInitiale;
	private BigDecimal rcValeurFinale;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ModeDeclValeurDto() {
		super();
	}

	public String getRcCodeModeDec() {
		return rcCodeModeDec;
	}

	public void setRcCodeModeDec(String rcCodeModeDec) {
		this.rcCodeModeDec = rcCodeModeDec;
	}

	public BigDecimal getRcValeurInitiale() {
		return rcValeurInitiale;
	}

	public void setRcValeurInitiale(BigDecimal rcValeurInitiale) {
		this.rcValeurInitiale = rcValeurInitiale;
	}

	public BigDecimal getRcValeurFinale() {
		return rcValeurFinale;
	}

	public void setRcValeurFinale(BigDecimal rcValeurFinale) {
		this.rcValeurFinale = rcValeurFinale;
	}

	public String getPk() {
		pk = rcCodeModeDec;
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
