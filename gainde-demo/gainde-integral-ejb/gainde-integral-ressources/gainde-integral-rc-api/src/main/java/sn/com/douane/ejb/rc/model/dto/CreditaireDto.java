package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class CreditaireDto implements Serializable{

	private static final long serialVersionUID = 8986028085003918805L;
	private String rcCodeCreditaire;
	private String rcCodePpm;
	private String rcTypeCreditaire; 
	private BigDecimal rcMontantMini;
	private BigDecimal rcMontantResiduel;
	private Date rcDateCredit;
	private String rcNumSuspension;
	private Date rcDateSuspension;
	private String rcNumeroRetrait;
	private Date rcDateRetrait;
	private String rcCodeSuspension;
	private Date rcDateExtension;
	private String rcEtatCredit;
	private String rcNumeroDossier;
	private BigDecimal rcMontantAvoir;
	private BigDecimal rcBonAvoir;
	private String rcTypeDecision;
	private String rcNumDecision;
	private Date rcDateDecision;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public CreditaireDto() {
		super();
	}
	public String getRcCodeCreditaire() {
		return rcCodeCreditaire;
	}
	public void setRcCodeCreditaire(String rcCodeCreditaire) {
		this.rcCodeCreditaire = rcCodeCreditaire;
	}
	public String getRcCodePpm() {
		return rcCodePpm;
	}
	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}
	public String getRcTypeCreditaire() {
		return rcTypeCreditaire;
	}
	public void setRcTypeCreditaire(String rcTypeCreditaire) {
		this.rcTypeCreditaire = rcTypeCreditaire;
	}
	public BigDecimal getRcMontantMini() {
		return rcMontantMini;
	}
	public void setRcMontantMini(BigDecimal rcMontantMini) {
		this.rcMontantMini = rcMontantMini;
	}
	public BigDecimal getRcMontantResiduel() {
		return rcMontantResiduel;
	}
	public void setRcMontantResiduel(BigDecimal rcMontantResiduel) {
		this.rcMontantResiduel = rcMontantResiduel;
	}
	public Date getRcDateCredit() {
		return rcDateCredit;
	}
	public void setRcDateCredit(Date rcDateCredit) {
		this.rcDateCredit = rcDateCredit;
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
	public String getRcNumeroRetrait() {
		return rcNumeroRetrait;
	}
	public void setRcNumeroRetrait(String rcNumeroRetrait) {
		this.rcNumeroRetrait = rcNumeroRetrait;
	}
	public Date getRcDateRetrait() {
		return rcDateRetrait;
	}
	public void setRcDateRetrait(Date rcDateRetrait) {
		this.rcDateRetrait = rcDateRetrait;
	}
	public String getRcCodeSuspension() {
		return rcCodeSuspension;
	}
	public void setRcCodeSuspension(String rcCodeSuspension) {
		this.rcCodeSuspension = rcCodeSuspension;
	}
	public Date getRcDateExtension() {
		return rcDateExtension;
	}
	public void setRcDateExtension(Date rcDateExtension) {
		this.rcDateExtension = rcDateExtension;
	}
	public String getRcEtatCredit() {
		return rcEtatCredit;
	}
	public void setRcEtatCredit(String rcEtatCredit) {
		this.rcEtatCredit = rcEtatCredit;
	}
	public String getRcNumeroDossier() {
		return rcNumeroDossier;
	}
	public void setRcNumeroDossier(String rcNumeroDossier) {
		this.rcNumeroDossier = rcNumeroDossier;
	}
	public BigDecimal getRcMontantAvoir() {
		return rcMontantAvoir;
	}
	public void setRcMontantAvoir(BigDecimal rcMontantAvoir) {
		this.rcMontantAvoir = rcMontantAvoir;
	}
	public BigDecimal getRcBonAvoir() {
		return rcBonAvoir;
	}
	public void setRcBonAvoir(BigDecimal rcBonAvoir) {
		this.rcBonAvoir = rcBonAvoir;
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
		pk = rcCodeCreditaire;
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
