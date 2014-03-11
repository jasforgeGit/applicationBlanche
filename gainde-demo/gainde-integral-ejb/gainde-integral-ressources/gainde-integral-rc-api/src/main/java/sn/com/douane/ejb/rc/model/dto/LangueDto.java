package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class LangueDto.
 */
public class LangueDto implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 943257948450156407L;

	/** The libellelangue. */
	private String libellelangue;
	
    /** The rccodelangue. */
    private String rccodelangue;

	/** The pk. */
	private String pk;
	
	/** The edit cell. */
	private String editCell;
	
	/** The del cell. */
	private String delCell;

	public String getLibellelangue() {
		return libellelangue;
	}

	public void setLibellelangue(String libellelangue) {
		this.libellelangue = libellelangue;
	}

	public String getRccodelangue() {
		return rccodelangue;
	}

	public void setRccodelangue(String rccodelangue) {
		this.rccodelangue = rccodelangue;
	}

	public String getPk() {
		return rccodelangue;
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
