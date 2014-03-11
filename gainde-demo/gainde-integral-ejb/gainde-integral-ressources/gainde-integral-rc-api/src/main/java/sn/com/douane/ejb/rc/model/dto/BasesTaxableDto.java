package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;

/**
 * @author kerfahi ghazi
 */
public class BasesTaxableDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2518038178570028636L;
	
	/** The rc code taxe. */
	private String rcCodeTaxe;
	
	/** The rc code taxe base. */
	private String rcCodeTaxeBase;
	
	/** The rc ordre calcul. */
	private Integer rcOrdreCalcul;
	
	/** The pk. */
	private String pk;
	
	/** The edit cell. */
	private String editCell;
	
	/** The del cell. */
	private String delCell;

	/**
	 * Instantiates a new bases taxable dto.
	 */
	public BasesTaxableDto() {
		super();
	}

	/**
	 * Gets the rc code taxe.
	 *
	 * @return the rc code taxe
	 */
	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	/**
	 * Sets the rc code taxe.
	 *
	 * @param rcCodeTaxe the new rc code taxe
	 */
	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	/**
	 * Gets the rc code taxe base.
	 *
	 * @return the rc code taxe base
	 */
	public String getRcCodeTaxeBase() {
		return rcCodeTaxeBase;
	}

	/**
	 * Sets the rc code taxe base.
	 *
	 * @param rcCodeTaxeBase the new rc code taxe base
	 */
	public void setRcCodeTaxeBase(String rcCodeTaxeBase) {
		this.rcCodeTaxeBase = rcCodeTaxeBase;
	}

	/**
	 * Gets the rc ordre calcul.
	 *
	 * @return the rc ordre calcul
	 */
	public Integer getRcOrdreCalcul() {
		return rcOrdreCalcul;
	}

	/**
	 * Sets the rc ordre calcul.
	 *
	 * @param rcOrdreCalcul the new rc ordre calcul
	 */
	public void setRcOrdreCalcul(Integer rcOrdreCalcul) {
		this.rcOrdreCalcul = rcOrdreCalcul;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		pk = rcCodeTaxe+ConstManif.TIELD+rcCodeTaxeBase;
		return pk;
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk the new pk
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * Gets the edits the cell.
	 *
	 * @return the edits the cell
	 */
	public String getEditCell() {
		return editCell;
	}

	/**
	 * Sets the edits the cell.
	 *
	 * @param editCell the new edits the cell
	 */
	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}

	/**
	 * Gets the del cell.
	 *
	 * @return the del cell
	 */
	public String getDelCell() {
		return delCell;
	}

	/**
	 * Sets the del cell.
	 *
	 * @param delCell the new del cell
	 */
	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}

}
