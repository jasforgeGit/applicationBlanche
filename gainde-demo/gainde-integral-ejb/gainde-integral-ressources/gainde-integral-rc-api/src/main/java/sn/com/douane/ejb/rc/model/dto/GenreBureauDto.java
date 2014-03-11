package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * Added by rkhaskhoussy
 * The Class GenreBureauDto.
 */
public class GenreBureauDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7789312532871608321L;

	/** The rcgenrebureau. */
	private String rcgenrebureau;

	/** The rcdesgenrebureau. */
	private String rcdesgenrebureau;

	/** The pk. */
	private String pk;
	
	/** The edit cell. */
	private String editCell;
	
	/** The del cell. */
	private String delCell;
	
	/**
	 * Gets the rcgenrebureau.
	 *
	 * @return the rcgenrebureau
	 */
	public String getRcgenrebureau() {
		return rcgenrebureau;
	}
	
	/**
	 * Sets the rcgenrebureau.
	 *
	 * @param rcgenrebureau the new rcgenrebureau
	 */
	public void setRcgenrebureau(String rcgenrebureau) {
		this.rcgenrebureau = rcgenrebureau;
	}
	
	/**
	 * Gets the rcdesgenrebureau.
	 *
	 * @return the rcdesgenrebureau
	 */
	public String getRcdesgenrebureau() {
		return rcdesgenrebureau;
	}
	
	/**
	 * Sets the rcdesgenrebureau.
	 *
	 * @param rcdesgenrebureau the new rcdesgenrebureau
	 */
	public void setRcdesgenrebureau(String rcdesgenrebureau) {
		this.rcdesgenrebureau = rcdesgenrebureau;
	}
	
	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		return rcgenrebureau;
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
