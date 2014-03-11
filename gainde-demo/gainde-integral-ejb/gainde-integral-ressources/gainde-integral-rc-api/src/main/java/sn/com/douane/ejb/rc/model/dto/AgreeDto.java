package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;


public class AgreeDto implements Serializable{


	private static final long serialVersionUID = -3837370045238821419L;
	private String rcCodeAgree;
	private String rcCodePpm; 
	private String rcSuspendu;
	private String rcRetrait;
	private String rcEtatAgree;
	private String rcTypeDecision;
	private String rcNumDecision;
	private Date rcDateDecision;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public AgreeDto() {
		super();
	}

	public String getRcCodeAgree() {
		return rcCodeAgree;
	}

	public void setRcCodeAgree(String rcCodeAgree) {
		this.rcCodeAgree = rcCodeAgree;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcSuspendu() {
		return rcSuspendu;
	}

	public void setRcSuspendu(String rcSuspendu) {
		this.rcSuspendu = rcSuspendu;
	}

	public String getRcRetrait() {
		return rcRetrait;
	}

	public void setRcRetrait(String rcRetrait) {
		this.rcRetrait = rcRetrait;
	}

	public String getRcEtatAgree() {
		return rcEtatAgree;
	}

	public void setRcEtatAgree(String rcEtatAgree) {
		this.rcEtatAgree = rcEtatAgree;
	}

	public String getRcTypeDecision() {
		return rcTypeDecision;
	}

	public void setRcTypeDecision(String rcTypeDecision) {
		this.rcTypeDecision = rcTypeDecision;
	}

	public String getRcNumDecision() {
		return rcNumDecision;
	}

	public void setRcNumDecision(String rcNumDecision) {
		this.rcNumDecision = rcNumDecision;
	}

	public Date getRcDateDecision() {
		return rcDateDecision;
	}

	public void setRcDateDecision(Date rcDateDecision) {
		this.rcDateDecision = rcDateDecision;
	}

	public String getPk() {
		pk	= rcCodeAgree;
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
