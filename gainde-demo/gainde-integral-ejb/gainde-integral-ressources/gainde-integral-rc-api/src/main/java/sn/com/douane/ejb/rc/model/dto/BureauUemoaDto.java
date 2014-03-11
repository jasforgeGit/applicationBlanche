package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

/**
 *
 * @author kerfahi ghazi
 */
public class BureauUemoaDto implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -25418989438556718L;
	
	/** The rc code bur uemoa. */
	private String rcCodeBurUemoa;
	
	/** The rc libelle bur uemoa. */
	private String rcLibelleBurUemoa;
	
	/** The pk. */
	private String pk; 
	
	/** The edit cell. */
	private String editCell; 
	
	/** The del cell. */
	private String delCell;
	
	/**
	 * Instantiates a new bureau uemoa dto.
	 */
	public BureauUemoaDto() {
		super();
	}

	/**
	 * Gets the rc code bur uemoa.
	 *
	 * @return the rc code bur uemoa
	 */
	public String getRcCodeBurUemoa() {
		return rcCodeBurUemoa;
	}
	
	/**
	 * Sets the rc code bur uemoa.
	 *
	 * @param rcCodeBurUemoa the new rc code bur uemoa
	 */
	public void setRcCodeBurUemoa(String rcCodeBurUemoa) {
		this.rcCodeBurUemoa = rcCodeBurUemoa;
	}

	/**
	 * Gets the rc libelle bur uemoa.
	 *
	 * @return the rc libelle bur uemoa
	 */
	public String getRcLibelleBurUemoa() {
		return rcLibelleBurUemoa;
	}
	
	/**
	 * Sets the rc libelle bur uemoa.
	 *
	 * @param rcLibelleBurUemoa the new rc libelle bur uemoa
	 */
	public void setRcLibelleBurUemoa(String rcLibelleBurUemoa) {
		this.rcLibelleBurUemoa = rcLibelleBurUemoa;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		pk	= rcCodeBurUemoa;
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
