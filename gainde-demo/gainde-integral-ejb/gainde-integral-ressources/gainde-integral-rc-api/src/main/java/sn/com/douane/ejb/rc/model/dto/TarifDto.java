package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;


public class TarifDto implements Serializable{

	private static final long serialVersionUID = 8005386075447783111L;
	private String rcCodeProd;
	private String rcPrecueMoa;
	private String rcPrecSenegal;
	private String rcCodeTaxe;
	private String rcCodeTaux;
	private java.sql.Date rcDateValeur;
	private java.sql.Date rcDateCloture;
	private String rcCodeCimex;
	private String dateValeurTaux;
	private String libelleTaux;
	private java.math.BigDecimal rcValeurTaux;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TarifDto() {
		super();
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecueMoa() {
		return rcPrecueMoa;
	}

	public void setRcPrecueMoa(String rcPrecueMoa) {
		this.rcPrecueMoa = rcPrecueMoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public java.sql.Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(java.sql.Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getRcCodeCimex() {
		return rcCodeCimex;
	}

	public void setRcCodeCimex(String rcCodeCimex) {
		this.rcCodeCimex = rcCodeCimex;
	}

	public String getDateValeurTaux() {
		return dateValeurTaux;
	}

	public void setDateValeurTaux(String dateValeurTaux) {
		this.dateValeurTaux = dateValeurTaux;
	}

	public String getLibelleTaux() {
		return libelleTaux;
	}

	public void setLibelleTaux(String libelleTaux) {
		this.libelleTaux = libelleTaux;
	}

	public java.math.BigDecimal getRcValeurTaux() {
		return rcValeurTaux;
	}

	public void setRcValeurTaux(java.math.BigDecimal rcValeurTaux) {
		this.rcValeurTaux = rcValeurTaux;
	}

	public String getPk() {
		pk =
				rcCodeProd + ConstManif.TIELD + rcPrecueMoa + ConstManif.TIELD + rcPrecSenegal + ConstManif.TIELD
						+ rcCodeTaxe + ConstManif.TIELD + rcCodeTaux + ConstManif.TIELD
						+ sysEnv.dateToStr(rcDateValeur) + ConstManif.TIELD + rcCodeCimex;
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
