package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;

public class RegimeDeclarantDto implements Serializable {

	private String rcTypeRegime;
	private String rcRegimeDouanier;
	private String rcRegimeFiscal;
	private String rcCodePpm;
	private String pk;
	private String editCell;
	private String delCell;

	public RegimeDeclarantDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcRegimeDouanier() {
		return rcRegimeDouanier;
	}

	public void setRcRegimeDouanier(String rcRegimeDouanier) {
		this.rcRegimeDouanier = rcRegimeDouanier;
	}

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getPk() {
		pk =
				rcTypeRegime + ConstManif.TIELD + rcRegimeDouanier + ConstManif.TIELD + rcRegimeFiscal
						+ ConstManif.TIELD + rcCodePpm;
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
