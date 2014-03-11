package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;
import sn.com.douane.utils.ConstManif;

public class IndicateurRegdouDto implements Serializable{

	private static final long serialVersionUID = -8500827894766585949L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier; 
	private String rcCodeIndicateur;
	private Date rcDateValidite;
	private Date rcDateCloture;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public IndicateurRegdouDto() {
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
				rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcCodeIndicateur
						+ ConstManif.TIELD + rcDateValidite;
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
