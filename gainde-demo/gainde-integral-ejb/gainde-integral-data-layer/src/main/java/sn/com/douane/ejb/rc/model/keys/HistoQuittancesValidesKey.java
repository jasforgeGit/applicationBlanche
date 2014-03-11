package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class HistoQuittancesValidesKey implements Serializable{

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

	@Id
	@Column(name="DATEARCHIVE", nullable=false)
	private Timestamp dateArchive;
	
	public HistoQuittancesValidesKey(){
		super();
	}
	
	public HistoQuittancesValidesKey(String trancheDebut, String trancheFin, Timestamp dateArchive){
		super();
		this.trancheDebut = trancheDebut;
		this.trancheFin = trancheFin;
		this.dateArchive = dateArchive;
		
	}

	public String getTrancheDebut() {
		return trancheDebut;
	}

	public void setTrancheDebut(String trancheDebut) {
		this.trancheDebut = trancheDebut;
	}

	public String getTrancheFin() {
		return trancheFin;
	}

	public void setTrancheFin(String trancheFin) {
		this.trancheFin = trancheFin;
	}

	public Timestamp getDateArchive() {
		return dateArchive;
	}

	public void setDateArchive(Timestamp dateArchive) {
		this.dateArchive = dateArchive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateArchive == null) ? 0 : dateArchive.hashCode());
		result = prime * result
				+ ((trancheDebut == null) ? 0 : trancheDebut.hashCode());
		result = prime * result
				+ ((trancheFin == null) ? 0 : trancheFin.hashCode());
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
		HistoQuittancesValidesKey other = (HistoQuittancesValidesKey) obj;
		if (dateArchive == null) {
			if (other.dateArchive != null){
				return false;
			}
		} else if (!dateArchive.equals(other.dateArchive)){
			return false;
		}
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
