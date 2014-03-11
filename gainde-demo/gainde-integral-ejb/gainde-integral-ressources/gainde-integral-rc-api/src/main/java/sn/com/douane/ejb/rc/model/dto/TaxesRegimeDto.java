package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;
import sn.com.douane.utils.ConstManif;

/**
 * @author kerfahi ghazi
 */
public class TaxesRegimeDto implements Serializable {


	private static final long serialVersionUID = -6826399237106703864L;
	private String rcTypeRegime;
	private String rcCodeRegimeDouanier;
	private String rcRegimeFiscal;
	private String rcCodeTaxes;
	private Date rcDateValeur;
	private Date rcDateCloture;
	private String rcCodeTaux;
	private String pk;
	private String editCell;
	private String delCell;

	public TaxesRegimeDto() {
		super();
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

	public String getRcRegimeFiscal() {
		return rcRegimeFiscal;
	}

	public void setRcRegimeFiscal(String rcRegimeFiscal) {
		this.rcRegimeFiscal = rcRegimeFiscal;
	}

	public String getRcCodeTaxes() {
		return rcCodeTaxes;
	}

	public void setRcCodeTaxes(String rcCodeTaxes) {
		this.rcCodeTaxes = rcCodeTaxes;
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
				rcTypeRegime + ConstManif.TIELD + rcCodeRegimeDouanier + ConstManif.TIELD + rcRegimeFiscal
						+ ConstManif.TIELD + rcCodeTaxes + ConstManif.TIELD + rcDateValeur;
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
