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
@Table(name="IMPORTEXPORT")
public class ImportExport implements Serializable{

	private static final long serialVersionUID = -8608139557805654781L;

	@Id
	@Column(name="RCNUMIMPORTEXPORT", length=10, nullable=false)
	private String rcNumImportExport;
	
	@Column(name="RCCODEPPM", length=5)
	private String rcCodePpm;
	
	@Column(name="RCDATECARTE")
	private Date rcDateCarte;
	
	@Column(name="RCNUMDECISION", length=50)
	private String rcNumDecision;
	
	@Column(name="RCNUMSUSPENSION", length=15)
	private String rcNumSuspension;
	
	@Column(name="RCDATESUSPENSION")
	private Date rcDateSuspension;
	
	@Column(name="RCNUMCARTEIMPEXP", length=6)
	private String rcNumCarteImpExp;
	
	@Column(name="RCNINEAIMPEXP", length=11)
	private String rcNineaImpExp;
	
	@Column(name="RCDATERETRAITCREDIT")
	private Date rcDateRetraitCredit;

	public ImportExport() {
		
	}
	
	public ImportExport(String rcNumImportExport) {
		super();
		this.rcNumImportExport = rcNumImportExport;
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

}
