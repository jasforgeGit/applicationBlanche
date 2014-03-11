package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class Taxation2Key implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4392785470617315822L;

	@Column(name = "PRODUIT", length = 100, nullable = false)
	private String produit;
	
	@Column(name = "DATE_EFFET", nullable = false)
	private Date dateEffet;

	public Date getDateEffet() {
		return dateEffet;
	}

	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}
	
	public Taxation2Key(){
		
	}

	public Taxation2Key(String produit, Date dateEffet) {
		super();
		this.produit = produit;
		this.dateEffet = dateEffet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateEffet == null) ? 0 : dateEffet.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
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
		Taxation2Key other = (Taxation2Key) obj;
		if (dateEffet == null) {
			if (other.dateEffet != null){
				return false;
			}
		} else if (!dateEffet.equals(other.dateEffet)){
			return false;
		}
		if (produit == null) {
			if (other.produit != null){
				return false;
			}
		} else if (!produit.equals(other.produit)){
			return false;
		}
		return true;
	}
	
	
	
}