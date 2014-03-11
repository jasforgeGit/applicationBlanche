package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import sn.com.douane.utils.ConstManif;


public class ExceptionsTaxesDto implements Serializable{


	private static final long serialVersionUID = 2078690681332763278L;
	private String rcCodeException;
    private String rcCodeTaxe;
	private java.sql.Date rcDateValeur;	
    private String rcNiveauException;
    private java.sql.Date rcDateCloture;    
    private String rcFormule;
    private String rcCondition;
	private String pk; 
	private String editCell; 
	private String delCell;
	
	public ExceptionsTaxesDto() {
		super();
	}

	public String getRcCodeException() {
		return rcCodeException;
	}

	public void setRcCodeException(String rcCodeException) {
		this.rcCodeException = rcCodeException;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcNiveauException() {
		return rcNiveauException;
	}

	public void setRcNiveauException(String rcNiveauException) {
		this.rcNiveauException = rcNiveauException;
	}

	public java.sql.Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(java.sql.Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getRcFormule() {
		return rcFormule;
	}

	public void setRcFormule(String rcFormule) {
		this.rcFormule = rcFormule;
	}

	public String getRcCondition() {
		return rcCondition;
	}

	public void setRcCondition(String rcCondition) {
		this.rcCondition = rcCondition;
	}

	public String getPk() {
		pk =
				rcCodeException + ConstManif.TIELD + rcCodeTaxe + ConstManif.TIELD + rcDateValeur + ConstManif.TIELD
						+ rcNiveauException;
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
