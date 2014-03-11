package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;

public class IndicateurRegimeDto implements Serializable {

	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private String rcCodeRegimeFiscal;
	private String rcCodeIndicateur;
	private Date rcDateValidite;
	private Date rcDateCloture;
	private String pk;
	private String editCell;
	private String delCell;

	public IndicateurRegimeDto() {
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

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public Date getRcDateValidite() {
		return rcDateValidite;
	}

	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getPk() {
		pk =
				rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcCodeRegimeFiscal
						+ ConstManif.TIELD + rcCodeIndicateur + ConstManif.TIELD + sysEnv.dateToStr(rcDateValidite)
						+ ConstManif.TIELD + sysEnv.dateToStr(rcDateCloture);
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
