package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.HistoQuittancesValidesKey;

/**
 * The Class QuittancesValides.
 */
@Entity
@Table(name="HISTOQUITTANCESVALIDES")
@IdClass(HistoQuittancesValidesKey.class)
public class HistoQuittancesValides implements Serializable{

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
	
	@Id
	@Column(name="DATEARCHIVE", nullable=false)
	private Timestamp dateArchive;

	@Column(name="TYPEQUITTANCE", columnDefinition="CHAR(2)", nullable=false)
	private String typeQuittance;
	
	@Column(name="DATEAJOUT", nullable=false)
	private Timestamp dateAjout;

	public HistoQuittancesValides(){
		
	}
	
	public HistoQuittancesValides(String trancheDebut, String trancheFin, 
			Timestamp dateArchive, String typeQuittance, Timestamp dateAjout){
		this.trancheDebut = trancheDebut;
		this.trancheFin = trancheFin;
		this.dateArchive = dateArchive;
		this.typeQuittance  = typeQuittance;
		this.dateAjout = dateAjout;
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

	public String getTypeQuittance() {
		return typeQuittance;
	}

	public void setTypeQuittance(String typeQuittance) {
		this.typeQuittance = typeQuittance;
	}

	public Timestamp getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Timestamp dateAjout) {
		this.dateAjout = dateAjout;
	}
	
}
