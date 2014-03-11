package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import sn.com.douane.utils.ConstManif;


public class NumerotationDto implements Serializable{

	private static final long serialVersionUID = 2685336309027662430L;
	private String rcCodeFonction;
	private String rcOperation;
	private BigDecimal valeurIndice;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public NumerotationDto() {
		super();
	}

	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	public String getRcOperation() {
		return rcOperation;
	}

	public void setRcOperation(String rcOperation) {
		this.rcOperation = rcOperation;
	}

	public String getPk() {
		pk = rcCodeFonction + ConstManif.TIELD + rcOperation;
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

	
	public BigDecimal getValeurIndice() {
		return valeurIndice;
	}

	
	public void setValeurIndice(BigDecimal valeurIndice) {
		this.valeurIndice = valeurIndice;
	}

}
