package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class QuittancesValidesKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1346484343267826653L;

	@Id
	@Column(name="TRANCHEDEBUT", columnDefinition="CHAR(10)", nullable=false)
	private String trancheDebut;
	
	@Id
	@Column(name="TRANCHEFIN", columnDefinition="CHAR(10)", nullable=false)
	private String trancheFin;

	public QuittancesValidesKey(){
		super();
	}
	
	public QuittancesValidesKey(String trancheDebut, String trancheFin){
		super();
		this.trancheDebut = trancheDebut;
		this.trancheFin = trancheFin;
		
	}

	/**
	 * @return the trancheDebut
	 */
	public String getTrancheDebut() {
		return trancheDebut;
	}

	/**
	 * @param trancheDebut the trancheDebut to set
	 */
	public void setTrancheDebut(String trancheDebut) {
		this.trancheDebut = trancheDebut;
	}

	/**
	 * @return the trancheFin
	 */
	public String getTrancheFin() {
		return trancheFin;
	}

	/**
	 * @param trancheFin the trancheFin to set
	 */
	public void setTrancheFin(String trancheFin) {
		this.trancheFin = trancheFin;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((trancheDebut == null) ? 0 : trancheDebut.hashCode());
		result = prime
				* result
				+ ((trancheFin == null) ? 0 : trancheFin
						.hashCode());
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
		QuittancesValidesKey other = (QuittancesValidesKey) obj;
		if (trancheDebut == null) {
			if (other.trancheDebut != null){
				return false;
			}
		} else if (!trancheDebut.equals(other.trancheDebut)){
			return false;
		}
		if (trancheFin == null) {
			if (other.trancheFin != null){
				return false;
			}
		} else if (!trancheFin.equals(other.trancheFin)){
			return false;
		}
		return true;
	}
}
