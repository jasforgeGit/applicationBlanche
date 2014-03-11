package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

import sn.com.douane.utils.ConstManif;


public class SoumissionCreditaireDto implements Serializable{


	private static final long serialVersionUID = -7770493416084253114L;
	private String rcCodeIndicateur;
	private String rcCodeCreditaire;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public SoumissionCreditaireDto() {
		super();
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public String getRcCodeCreditaire() {
		return rcCodeCreditaire;
	}

	public void setRcCodeCreditaire(String rcCodeCreditaire) {
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	public String getPk() {
		pk = rcCodeIndicateur+ConstManif.TIELD+rcCodeCreditaire;
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
