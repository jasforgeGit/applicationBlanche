package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class RegimeProduitDto implements Serializable{

	private static final long serialVersionUID = 3111492169292874578L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private String rcCodeRegimeFiscal;
    private String rcCodeProd;
    private String rcPrecuemoa;
    private String rcPrecSenegal;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeProduitDto() {
		super();
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecuemoa() {
		return rcPrecuemoa;
	}

	public void setRcPrecuemoa(String rcPrecuemoa) {
		this.rcPrecuemoa = rcPrecuemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getPk() {
		pk =
				rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcCodeRegimeFiscal
						+ ConstManif.TIELD + rcCodeProd + ConstManif.TIELD + rcPrecuemoa + ConstManif.TIELD
						+ rcPrecSenegal;
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
