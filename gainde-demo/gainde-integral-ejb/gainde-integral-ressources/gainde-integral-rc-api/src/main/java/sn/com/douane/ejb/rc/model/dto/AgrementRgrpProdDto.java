package sn.com.douane.ejb.rc.model.dto;

import java.math.BigDecimal;
import java.sql.Date;
import sn.com.douane.utils.ConstManif;

public class AgrementRgrpProdDto {


	private String rcCodePays;
    private String rcNumEntreprise;
    private String rcCodeProd;
    private String rcPrecUemoaProd;
    private String rcPrecSenProd;
    private String rcCodeImpExp;
    private String rcCodeRegroupement;
    private String rcCodeTaxe;
    private Date rcDateApplication;
    private String rcCodeTaux;
    private BigDecimal rcValQuotite;
    private Date rcDateCloture;
    private String libelle;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public AgrementRgrpProdDto() {
		super();
	}

	public String getRcCodePays() {
		return rcCodePays;
	}

	public void setRcCodePays(String rcCodePays) {
		this.rcCodePays = rcCodePays;
	}

	public String getRcNumEntreprise() {
		return rcNumEntreprise;
	}

	public void setRcNumEntreprise(String rcNumEntreprise) {
		this.rcNumEntreprise = rcNumEntreprise;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecUemoaProd() {
		return rcPrecUemoaProd;
	}

	public void setRcPrecUemoaProd(String rcPrecUemoaProd) {
		this.rcPrecUemoaProd = rcPrecUemoaProd;
	}

	public String getRcPrecSenProd() {
		return rcPrecSenProd;
	}

	public void setRcPrecSenProd(String rcPrecSenProd) {
		this.rcPrecSenProd = rcPrecSenProd;
	}

	public String getRcCodeImpExp() {
		return rcCodeImpExp;
	}

	public void setRcCodeImpExp(String rcCodeImpExp) {
		this.rcCodeImpExp = rcCodeImpExp;
	}

	public String getRcCodeRegroupement() {
		return rcCodeRegroupement;
	}

	public void setRcCodeRegroupement(String rcCodeRegroupement) {
		this.rcCodeRegroupement = rcCodeRegroupement;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public Date getRcDateApplication() {
		return rcDateApplication;
	}

	public void setRcDateApplication(Date rcDateApplication) {
		this.rcDateApplication = rcDateApplication;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public BigDecimal getRcValQuotite() {
		return rcValQuotite;
	}

	public void setRcValQuotite(BigDecimal rcValQuotite) {
		this.rcValQuotite = rcValQuotite;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getPk() {
		pk =  rcCodePays + ConstManif.TIELD + rcNumEntreprise
				+ ConstManif.TIELD + rcCodeProd+ ConstManif.TIELD + rcPrecUemoaProd
				+ ConstManif.TIELD + rcPrecSenProd+ ConstManif.TIELD + rcCodeImpExp
				+ ConstManif.TIELD + rcCodeRegroupement;
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

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
}
