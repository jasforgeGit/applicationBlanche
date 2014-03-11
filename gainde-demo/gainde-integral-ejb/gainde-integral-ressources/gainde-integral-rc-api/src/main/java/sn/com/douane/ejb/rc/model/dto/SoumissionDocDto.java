package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


/**
 * @author kerfahi ghazi
 */
public class SoumissionDocDto implements Serializable{


	private static final long serialVersionUID = -3004263476312560850L;
	private String rccodesoumdoc;
    private String rclibellesoumdoc;
	private String rccodepiecejointe;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public SoumissionDocDto() {
		super();
	}

	public String getRccodesoumdoc() {
		return rccodesoumdoc;
	}

	public void setRccodesoumdoc(String rccodesoumdoc) {
		this.rccodesoumdoc = rccodesoumdoc;
	}

	public String getRclibellesoumdoc() {
		return rclibellesoumdoc;
	}

	public void setRclibellesoumdoc(String rclibellesoumdoc) {
		this.rclibellesoumdoc = rclibellesoumdoc;
	}

	public String getRccodepiecejointe() {
		return rccodepiecejointe;
	}

	public void setRccodepiecejointe(String rccodepiecejointe) {
		this.rccodepiecejointe = rccodepiecejointe;
	}

	public String getPk() {
		pk = rccodesoumdoc;
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
