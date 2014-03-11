package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

/**
 * @author kerfahi ghazi
 */
public class RegimeFiscalDto implements Serializable{

	private static final long serialVersionUID = -4104932080539303065L;
	private String rcCodeRegimeFiscal;
	private String rcLibelleRegimeFiscal;
	private String indRegExo;
	private String rcIndSuspension;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeFiscalDto() {
		super();
	}

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcLibelleRegimeFiscal() {
		return rcLibelleRegimeFiscal;
	}

	public void setRcLibelleRegimeFiscal(String rcLibelleRegimeFiscal) {
		this.rcLibelleRegimeFiscal = rcLibelleRegimeFiscal;
	}

	public String getIndRegExo() {
		return indRegExo;
	}

	public void setIndRegExo(String indRegExo) {
		this.indRegExo = indRegExo;
	}

	public String getRcIndSuspension() {
		return rcIndSuspension;
	}

	public void setRcIndSuspension(String rcIndSuspension) {
		this.rcIndSuspension = rcIndSuspension;
	}

	public String getPk() {
		pk = rcCodeRegimeFiscal;
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
