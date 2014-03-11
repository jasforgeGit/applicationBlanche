package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.QuittancesValidesKey;

/**
 * The Class QuittancesValides.
 */
@Entity
@Table(name="QUITTANCESVALIDES")
@IdClass(QuittancesValidesKey.class)
public class QuittancesValides implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2232235345809865144L;

	@Id
	@Column(name="TRANCHEDEBUT", columnDefinition="CHAR(10)", nullable=false)
	private String trancheDebut;
	
	@Id
	@Column(name="TRANCHEFIN", columnDefinition="CHAR(10)", nullable=false)
	private String trancheFin;
	
	@Column(name="TYPEQUITTANCE", columnDefinition="CHAR(2)", nullable=false)
	private String typeQuittance;

	@Column(name="DATEAJOUT", nullable=false)
	private Timestamp dateAjout;

	public QuittancesValides(){
		
	}
	
	public QuittancesValides(String trancheDebut, String trancheFin, String typeQuittance, Timestamp dateAjout){
		this.trancheDebut = trancheDebut;
		this.trancheFin = trancheFin;
		this.typeQuittance  = typeQuittance;
		this.dateAjout = dateAjout;
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

	/**
	 * @return the typeQuittance
	 */
	public String getTypeQuittance() {
		return typeQuittance;
	}

	/**
	 * @param typeQuittance the typeQuittance to set
	 */
	public void setTypeQuittance(String typeQuittance) {
		this.typeQuittance = typeQuittance;
	}

	/**
	 * @return the dateAjout
	 */
	public Timestamp getDateAjout() {
		return dateAjout;
	}

	/**
	 * @param dateAjout the dateAjout to set
	 */
	public void setDateAjout(Timestamp dateAjout) {
		this.dateAjout = dateAjout;
	}

}
