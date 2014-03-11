package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import sn.com.douane.utils.ConstManif;


public class RegimeEconomiqueDto implements Serializable{

	private String rcanneeregeco;
    private String rcnumregeco;
	private String rccodenatregeco;		
    private java.sql.Date rcdatedecisionregeco;
    private String rcrefjuridiqueregeco;
    private Integer rcnbreprororegeco;
    private java.sql.Date rcdatevaliditeregeco;
    private java.sql.Date rcdateprororegeco;		
    private Integer rcdureeregeco;
    private Integer rcdureeprororegeco;
    private String rcppmbeneficiaire;
    private String rcmoderegeco;
    private java.sql.Date rcdatesuspensionregeco;
    private String rcetatregeco;	    
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public RegimeEconomiqueDto() {
		super();
	}

	public String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public String getRcnumregeco() {
		return rcnumregeco;
	}

	public void setRcnumregeco(String rcnumregeco) {
		this.rcnumregeco = rcnumregeco;
	}

	public String getRccodenatregeco() {
		return rccodenatregeco;
	}

	public void setRccodenatregeco(String rccodenatregeco) {
		this.rccodenatregeco = rccodenatregeco;
	}

	public java.sql.Date getRcdatedecisionregeco() {
		return rcdatedecisionregeco;
	}

	public void setRcdatedecisionregeco(java.sql.Date rcdatedecisionregeco) {
		this.rcdatedecisionregeco = rcdatedecisionregeco;
	}

	public String getRcrefjuridiqueregeco() {
		return rcrefjuridiqueregeco;
	}

	public void setRcrefjuridiqueregeco(String rcrefjuridiqueregeco) {
		this.rcrefjuridiqueregeco = rcrefjuridiqueregeco;
	}

	public Integer getRcnbreprororegeco() {
		return rcnbreprororegeco;
	}

	public void setRcnbreprororegeco(Integer rcnbreprororegeco) {
		this.rcnbreprororegeco = rcnbreprororegeco;
	}

	public java.sql.Date getRcdatevaliditeregeco() {
		return rcdatevaliditeregeco;
	}

	public void setRcdatevaliditeregeco(java.sql.Date rcdatevaliditeregeco) {
		this.rcdatevaliditeregeco = rcdatevaliditeregeco;
	}

	public java.sql.Date getRcdateprororegeco() {
		return rcdateprororegeco;
	}

	public void setRcdateprororegeco(java.sql.Date rcdateprororegeco) {
		this.rcdateprororegeco = rcdateprororegeco;
	}

	public Integer getRcdureeregeco() {
		return rcdureeregeco;
	}

	public void setRcdureeregeco(Integer rcdureeregeco) {
		this.rcdureeregeco = rcdureeregeco;
	}

	public Integer getRcdureeprororegeco() {
		return rcdureeprororegeco;
	}

	public void setRcdureeprororegeco(Integer rcdureeprororegeco) {
		this.rcdureeprororegeco = rcdureeprororegeco;
	}

	public String getRcppmbeneficiaire() {
		return rcppmbeneficiaire;
	}

	public void setRcppmbeneficiaire(String rcppmbeneficiaire) {
		this.rcppmbeneficiaire = rcppmbeneficiaire;
	}

	public String getRcmoderegeco() {
		return rcmoderegeco;
	}

	public void setRcmoderegeco(String rcmoderegeco) {
		this.rcmoderegeco = rcmoderegeco;
	}

	public java.sql.Date getRcdatesuspensionregeco() {
		return rcdatesuspensionregeco;
	}

	public void setRcdatesuspensionregeco(java.sql.Date rcdatesuspensionregeco) {
		this.rcdatesuspensionregeco = rcdatesuspensionregeco;
	}

	public String getRcetatregeco() {
		return rcetatregeco;
	}

	public void setRcetatregeco(String rcetatregeco) {
		this.rcetatregeco = rcetatregeco;
	}

	public String getPk() {
		pk = rcanneeregeco + ConstManif.TIELD + rcnumregeco;
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
