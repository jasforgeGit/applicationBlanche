package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;


public class ConsignataireDto implements Serializable{


	private static final long serialVersionUID = -1055441696768131760L;
	private String rcCodeConsignataire;
	private String rcCodePpm;
	private Date rcDateCreationConsig;
	private String rcCodePartiel;
	private Date rcDatePartiel;
	private String rcNumSuspension;
	private String rcNumRetraitCarteie;
	private Date rcRetraitCredit;
	private Date rcDateSuspension;
	private String rcIndSuspensCredit;
	private String rcNumDecision;
	private Date rcDateDecision;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ConsignataireDto() {
		super();
	}

	public String getRcCodeConsignataire() {
		return rcCodeConsignataire;
	}

	public void setRcCodeConsignataire(String rcCodeConsignataire) {
		this.rcCodeConsignataire = rcCodeConsignataire;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public Date getRcDateCreationConsig() {
		return rcDateCreationConsig;
	}

	public void setRcDateCreationConsig(Date rcDateCreationConsig) {
		this.rcDateCreationConsig = rcDateCreationConsig;
	}

	public String getRcCodePartiel() {
		return rcCodePartiel;
	}

	public void setRcCodePartiel(String rcCodePartiel) {
		this.rcCodePartiel = rcCodePartiel;
	}

	public Date getRcDatePartiel() {
		return rcDatePartiel;
	}

	public void setRcDatePartiel(Date rcDatePartiel) {
		this.rcDatePartiel = rcDatePartiel;
	}

	public String getRcNumSuspension() {
		return rcNumSuspension;
	}

	public void setRcNumSuspension(String rcNumSuspension) {
		this.rcNumSuspension = rcNumSuspension;
	}

	public String getRcNumRetraitCarteie() {
		return rcNumRetraitCarteie;
	}

	public void setRcNumRetraitCarteie(String rcNumRetraitCarteie) {
		this.rcNumRetraitCarteie = rcNumRetraitCarteie;
	}

	public Date getRcRetraitCredit() {
		return rcRetraitCredit;
	}

	public void setRcRetraitCredit(Date rcRetraitCredit) {
		this.rcRetraitCredit = rcRetraitCredit;
	}

	public Date getRcDateSuspension() {
		return rcDateSuspension;
	}

	public void setRcDateSuspension(Date rcDateSuspension) {
		this.rcDateSuspension = rcDateSuspension;
	}

	public String getRcIndSuspensCredit() {
		return rcIndSuspensCredit;
	}

	public void setRcIndSuspensCredit(String rcIndSuspensCredit) {
		this.rcIndSuspensCredit = rcIndSuspensCredit;
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
		pk = rcCodeConsignataire;
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
