package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="AMBASSADEORGANISME")
public class AmbassadeOrganisme implements Serializable{
	
	private static final long serialVersionUID = 494528890694660198L;

	@Id
	@Column(name="RCNUMREGIMEPREF", length=5, nullable=false)
	private String rcNumRegimePref;
    
	@Column(name="RCCODEPPM", length=5)
	private String rcCodePpm;
    
	@Column(name="RCDATEREGIMEPREF")
	private Date rcDateRegimePref;
    
	@Column(name="RCDATESUSPENSION")
	private Date rcDateSuspension;
    
	@Column(name="RSNUMSUSPENSION", length=6)
	private String rsNumSuspension;
    
	@Column(name="RCNATREGIMEPREF", length=1)
	private String rcNatRegimePref;
    
	@Column(name="RCCODESUSPENSION", length=1)
	private String rcCodeSuspension;
    
	@Column(name="RCNUMRETRAIT", length=6)
	private String rcNumRetrait;
    
	@Column(name="RCDATERETRAIT")
	private Date rcDateRetrait;


	public AmbassadeOrganisme() {
		
	}

	public AmbassadeOrganisme(String rcNumRegimePref) {
		super();
		this.rcNumRegimePref = rcNumRegimePref;
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

	
}
