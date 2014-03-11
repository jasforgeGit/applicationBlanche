package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;


public class AmbassadeOrganismeDto implements Serializable{

	private static final long serialVersionUID = -1082964119167413383L;
	private String rcNumRegimePref;
	private String rcCodePpm;
	private Date rcDateRegimePref;
	private Date rcDateSuspension;
	private String rsNumSuspension;
	private String rcNatRegimePref;
	private String rcCodeSuspension;
	private String rcNumRetrait;
	private Date rcDateRetrait;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public AmbassadeOrganismeDto() {
		super();
	}

	public String getRcNumRegimePref() {
		return rcNumRegimePref;
	}

	public void setRcNumRegimePref(String rcNumRegimePref) {
		this.rcNumRegimePref = rcNumRegimePref;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public Date getRcDateRegimePref() {
		return rcDateRegimePref;
	}

	public void setRcDateRegimePref(Date rcDateRegimePref) {
		this.rcDateRegimePref = rcDateRegimePref;
	}

	public Date getRcDateSuspension() {
		return rcDateSuspension;
	}

	public void setRcDateSuspension(Date rcDateSuspension) {
		this.rcDateSuspension = rcDateSuspension;
	}

	public String getRsNumSuspension() {
		return rsNumSuspension;
	}

	public void setRsNumSuspension(String rsNumSuspension) {
		this.rsNumSuspension = rsNumSuspension;
	}

	public String getRcNatRegimePref() {
		return rcNatRegimePref;
	}

	public void setRcNatRegimePref(String rcNatRegimePref) {
		this.rcNatRegimePref = rcNatRegimePref;
	}

	public String getRcCodeSuspension() {
		return rcCodeSuspension;
	}

	public void setRcCodeSuspension(String rcCodeSuspension) {
		this.rcCodeSuspension = rcCodeSuspension;
	}

	public String getRcNumRetrait() {
		return rcNumRetrait;
	}

	public void setRcNumRetrait(String rcNumRetrait) {
		this.rcNumRetrait = rcNumRetrait;
	}

	public Date getRcDateRetrait() {
		return rcDateRetrait;
	}

	public void setRcDateRetrait(Date rcDateRetrait) {
		this.rcDateRetrait = rcDateRetrait;
	}

	public String getPk() {
		pk = rcNumRegimePref;
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
