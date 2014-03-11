package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


/**
 * The Class DispensePieceJointeDto.
 * 
 * @author kerfahi ghazi
 */
public class DispensePieceJointeDto implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6699502511114285953L;
	
	/** The rccodedispense. */
	private String rccodedispense;
	
	/** The rccodepiecejointe. */
	private String rccodepiecejointe;
	
	/** The pk. */
	private String pk; 
	
	/** The edit cell. */
	private String editCell; 
	
	/** The del cell. */
	private String delCell;
	
	/**
	 * Instantiates a new dispense piece jointe dto.
	 */
	public DispensePieceJointeDto() {
		super();
	}

	/**
	 * Gets the rccodedispense.
	 *
	 * @return the rccodedispense
	 */
	public String getRccodedispense() {
		return rccodedispense;
	}

	/**
	 * Sets the rccodedispense.
	 *
	 * @param rccodedispense the new rccodedispense
	 */
	public void setRccodedispense(String rccodedispense) {
		this.rccodedispense = rccodedispense;
	}

	/**
	 * Gets the rccodepiecejointe.
	 *
	 * @return the rccodepiecejointe
	 */
	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	/**
	 * Sets the rccodepiecejointe.
	 *
	 * @param rccodepiecejointe the new rccodepiecejointe
	 */
	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		pk	= rccodedispense + ConstManif.TIELD + rccodepiecejointe;
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
