package sn.com.douane.ejb.rc.model.keys;

import java.sql.Date;

import javax.persistence.Column;

public class TaxesRegroupKey implements java.io.Serializable {
	
	private static final long serialVersionUID = 9062994263901217675L;

	@Column(name = "RCCODETAXE",length = 2,nullable = false)
	private String rcCodeTaxe;	

	@Column(name = "RCCODEREGROUP",length = 10,nullable = false)
	private String rcCodeRegroup;
	
	@Column(name = "RCDATEVALEUR",nullable = false)
	private java.sql.Date rcDateValeur;	

	public TaxesRegroupKey(){
		
	}
	
	public TaxesRegroupKey(String codeTaxe,String codeRegroup,Date dateValeur){		
		this.rcCodeTaxe = codeTaxe;
		this.rcCodeRegroup = codeRegroup;
		this.rcDateValeur = dateValeur;		
	}
	
	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeRegroup() {
		return rcCodeRegroup;
	}

	public void setRcCodeRegroup(String rcCodeRegroup) {
		this.rcCodeRegroup = rcCodeRegroup;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeRegroup == null) ? 0 : rcCodeRegroup.hashCode());
		result = prime * result
				+ ((rcCodeTaxe == null) ? 0 : rcCodeTaxe.hashCode());
		result = prime * result
				+ ((rcDateValeur == null) ? 0 : rcDateValeur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		TaxesRegroupKey other = (TaxesRegroupKey) obj;
		if (rcCodeRegroup == null) {
			if (other.rcCodeRegroup != null){
				return false;
			}
		} else if (!rcCodeRegroup.equals(other.rcCodeRegroup)){
			return false;
		}
		if (rcCodeTaxe == null) {
			if (other.rcCodeTaxe != null){
				return false;
			}
		} else if (!rcCodeTaxe.equals(other.rcCodeTaxe)){
			return false;
		}
		if (rcDateValeur == null) {
			if (other.rcDateValeur != null){
				return false;
			}
		} else if (!rcDateValeur.equals(other.rcDateValeur)){
			return false;
		}
		return true;
	}
	
	
	
	
	
    

}
