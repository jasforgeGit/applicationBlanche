package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;


public class ImportExportDto implements Serializable{


	private static final long serialVersionUID = -7404242328889814642L;
	private String rcNumImportExport;
	private String rcCodePpm;
	private Date rcDateCarte;
	private String rcNumDecision;
	private String rcNumSuspension;
	private Date rcDateSuspension;
	private String rcNumCarteImpExp;
	private String rcNineaImpExp;
	private Date rcDateRetraitCredit;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ImportExportDto() {
		super();
	}

	public String getRcNumImportExport() {
		return rcNumImportExport;
	}

	public void setRcNumImportExport(String rcNumImportExport) {
		this.rcNumImportExport = rcNumImportExport;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public Date getRcDateCarte() {
		return rcDateCarte;
	}

	public void setRcDateCarte(Date rcDateCarte) {
		this.rcDateCarte = rcDateCarte;
	}

	public String getRcNumDecision() {
		return rcNumDecision;
	}

	public void setRcNumDecision(String rcNumDecision) {
		this.rcNumDecision = rcNumDecision;
	}

	public String getRcNumSuspension() {
		return rcNumSuspension;
	}

	public void setRcNumSuspension(String rcNumSuspension) {
		this.rcNumSuspension = rcNumSuspension;
	}

	public Date getRcDateSuspension() {
		return rcDateSuspension;
	}

	public void setRcDateSuspension(Date rcDateSuspension) {
		this.rcDateSuspension = rcDateSuspension;
	}

	public String getRcNumCarteImpExp() {
		return rcNumCarteImpExp;
	}

	public void setRcNumCarteImpExp(String rcNumCarteImpExp) {
		this.rcNumCarteImpExp = rcNumCarteImpExp;
	}

	public String getRcNineaImpExp() {
		return rcNineaImpExp;
	}

	public void setRcNineaImpExp(String rcNineaImpExp) {
		this.rcNineaImpExp = rcNineaImpExp;
	}

	public Date getRcDateRetraitCredit() {
		return rcDateRetraitCredit;
	}

	public void setRcDateRetraitCredit(Date rcDateRetraitCredit) {
		this.rcDateRetraitCredit = rcDateRetraitCredit;
	}

	public String getPk() {
		pk = rcNumImportExport;
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
