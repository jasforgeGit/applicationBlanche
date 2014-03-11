package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;


public class TypeLieuEmbDto implements Serializable{

	private static final long serialVersionUID = -1009227706284882832L;
	private String codetypelieuemb;
    private String libelletypelieuemb;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public TypeLieuEmbDto() {
		super();
	}

	public String getCodetypelieuemb() {
		return codetypelieuemb;
	}

	public void setCodetypelieuemb(String codetypelieuemb) {
		this.codetypelieuemb = codetypelieuemb;
	}

	public String getLibelletypelieuemb() {
		return libelletypelieuemb;
	}

	public void setLibelletypelieuemb(String libelletypelieuemb) {
		this.libelletypelieuemb = libelletypelieuemb;
	}

	public String getPk() {
		pk = codetypelieuemb;
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
