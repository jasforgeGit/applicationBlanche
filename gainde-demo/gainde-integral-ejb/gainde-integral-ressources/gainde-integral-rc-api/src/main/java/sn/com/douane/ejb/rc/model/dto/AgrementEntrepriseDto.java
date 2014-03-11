package sn.com.douane.ejb.rc.model.dto;

import java.sql.Timestamp;
import sn.com.douane.utils.ConstManif;

public class AgrementEntrepriseDto {
	
	private String rcAgrent;     
	private String rcRgrPays;  
	private String rcCodPays;   
	private String rcTitreEnt;   
	private String rcrSocialeCent;   
	private String rcAdresseEnt;
	private Timestamp rcDateAgrement;
	private Timestamp rcDatCloture;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public AgrementEntrepriseDto() {
		super();
	}

	public String getRcAgrent() {
		return rcAgrent;
	}

	public void setRcAgrent(String rcAgrent) {
		this.rcAgrent = rcAgrent;
	}

	public String getRcRgrPays() {
		return rcRgrPays;
	}

	public void setRcRgrPays(String rcRgrPays) {
		this.rcRgrPays = rcRgrPays;
	}

	public String getRcCodPays() {
		return rcCodPays;
	}

	public void setRcCodPays(String rcCodPays) {
		this.rcCodPays = rcCodPays;
	}

	public String getRcTitreEnt() {
		return rcTitreEnt;
	}

	public void setRcTitreEnt(String rcTitreEnt) {
		this.rcTitreEnt = rcTitreEnt;
	}

	public String getRcrSocialeCent() {
		return rcrSocialeCent;
	}

	public void setRcrSocialeCent(String rcrSocialeCent) {
		this.rcrSocialeCent = rcrSocialeCent;
	}

	public String getRcAdresseEnt() {
		return rcAdresseEnt;
	}

	public void setRcAdresseEnt(String rcAdresseEnt) {
		this.rcAdresseEnt = rcAdresseEnt;
	}

	public Timestamp getRcDateAgrement() {
		return rcDateAgrement;
	}

	public void setRcDateAgrement(Timestamp rcDateAgrement) {
		this.rcDateAgrement = rcDateAgrement;
	}

	public Timestamp getRcDatCloture() {
		return rcDatCloture;
	}

	public void setRcDatCloture(Timestamp rcDatCloture) {
		this.rcDatCloture = rcDatCloture;
	}

	public String getPk() {
		pk = rcAgrent + ConstManif.TIELD + rcRgrPays
				+ ConstManif.TIELD + rcCodPays;
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
