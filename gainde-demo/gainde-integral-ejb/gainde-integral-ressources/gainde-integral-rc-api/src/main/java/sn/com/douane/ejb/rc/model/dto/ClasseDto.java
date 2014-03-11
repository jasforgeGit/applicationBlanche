package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

import sn.com.douane.utils.sysEnv;

/**
 * The Class ClasseDto.
 *
 * @author kerfahi ghazi
 */
public class ClasseDto implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7548830136756821758L;
	
	/** The rccodeclasse. */
	private Integer rccodeclasse;
    
    /** The rclibelleclasse. */
    private String rclibelleclasse;
	
	/** The pk. */
	private String pk; 
	
	/** The edit cell. */
	private String editCell; 
	
	/** The del cell. */
	private String delCell;
	
	/**
	 * Instantiates a new classe dto.
	 */
	public ClasseDto() {
		super();
	}
	
	/**
	 * Gets the rccodeclasse.
	 *
	 * @return the rccodeclasse
	 */
	public Integer getRccodeclasse() {
		return rccodeclasse;
	}

	/**
	 * Sets the rccodeclasse.
	 *
	 * @param rccodeclasse the new rccodeclasse
	 */
	public void setRccodeclasse(Integer rccodeclasse) {
		this.rccodeclasse = rccodeclasse;
	}

	/**
	 * Gets the rclibelleclasse.
	 *
	 * @return the rclibelleclasse
	 */
	public String getRclibelleclasse() {
		return rclibelleclasse;
	}

	/**
	 * Sets the rclibelleclasse.
	 *
	 * @param rclibelleclasse the new rclibelleclasse
	 */
	public void setRclibelleclasse(String rclibelleclasse) {
		this.rclibelleclasse = rclibelleclasse;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		pk	= sysEnv.IntegerToStr(rccodeclasse);
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
