package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;


public class TauxDto implements Serializable{
	

	private static final long serialVersionUID = 1228777449975783908L;
	private String rcCodeTaux;
	private String rcCodeTaxe;
	private java.sql.Date rcDateValeur;
	private String libelleTaux;
	private java.sql.Date rcDateCloture;
	private java.math.BigDecimal rcValeurTaux;
	private String pk; 
	private String editCell; 
	private String delCell; 
	
	public TauxDto() {
		super();
	}
	
		public String getRcCodeTaux() {
			return rcCodeTaux;
		}
		public void setRcCodeTaux(String rcCodeTaux) {
			this.rcCodeTaux = rcCodeTaux;
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
		public String getLibelleTaux() {
			return libelleTaux;
		}
		public void setLibelleTaux(String libelleTaux) {
			this.libelleTaux = libelleTaux;
		}
		public java.sql.Date getRcDateCloture() {
			return rcDateCloture;
		}
		public void setRcDateCloture(java.sql.Date rcDateCloture) {
			this.rcDateCloture = rcDateCloture;
		}
		public java.math.BigDecimal getRcValeurTaux() {
			return rcValeurTaux;
		}
		public void setRcValeurTaux(java.math.BigDecimal rcValeurTaux) {
			this.rcValeurTaux = rcValeurTaux;
		}
		public String getPk() {
			pk = rcCodeTaux + ConstManif.TIELD + rcCodeTaxe
					+ ConstManif.TIELD + rcDateValeur;
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
