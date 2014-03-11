package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;
import sn.com.douane.utils.ConstManif;

public class TaxesRegDouDto implements Serializable {

	/**
	 * @author kerfahi ghazi
	 */
	private static final long serialVersionUID = 574081812294086788L;
	private String rcCodeTaxe;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private Date rcDateValeur;
	private Date rcDateCloture;
	private String rcCodeTaux;
	private String pk;
	private String editCell;
	private String delCell;

	public TaxesRegDouDto() {
		super();
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}

	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}

	public Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public String getPk() {
		pk =
				rcCodeTaxe + ConstManif.TIELD + rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier
						+ ConstManif.TIELD + rcDateValeur;
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
