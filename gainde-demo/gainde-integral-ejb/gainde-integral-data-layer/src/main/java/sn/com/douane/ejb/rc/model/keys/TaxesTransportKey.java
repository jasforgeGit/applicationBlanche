package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class TaxesTransportKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5231381327873429306L;
	
	
	
	@Column(name = "RCCODETRANSPORT",length = 2,nullable = false)
	private String rcCodeTransport;	
	
	@Column(name = "RCCODETAXE",length = 2,nullable = false)
	private String rcCodeTaxe;		
	
	@Column(name = "RCDATEVALEUR",nullable = false)
    private java.sql.Date rcDateValeur;
	
	public TaxesTransportKey(){
		
	}

	public TaxesTransportKey(String rcCodeTransport, String rcCodeTaxe,
			Date rcDateValeur) {
		super();
		this.rcCodeTransport = rcCodeTransport;
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcCodeTransport() {
		return rcCodeTransport;
	}

	public void setRcCodeTransport(String rcCodeTransport) {
		this.rcCodeTransport = rcCodeTransport;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeTaxe == null) ? 0 : rcCodeTaxe.hashCode());
		result = prime * result
				+ ((rcCodeTransport == null) ? 0 : rcCodeTransport.hashCode());
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
		TaxesTransportKey other = (TaxesTransportKey) obj;
		if (rcCodeTaxe == null) {
			if (other.rcCodeTaxe != null){
				return false;
			}
		} else if (!rcCodeTaxe.equals(other.rcCodeTaxe)){
			return false;
		}
		if (rcCodeTransport == null) {
			if (other.rcCodeTransport != null){
				return false;
			}
		} else if (!rcCodeTransport.equals(other.rcCodeTransport)){
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