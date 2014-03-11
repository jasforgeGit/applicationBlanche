package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="QUITTANCESEXCLUES")
public class QuittancesExclues implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2101838228664330164L;

	@Id
	@Column(name="NUMEROQUITTANCE", columnDefinition="CHAR(10)", nullable=false)
	private String numeroQuittance;
	
	@Column(name="DATEAJOUT", nullable=false)
	private Timestamp dateAjout;

	public QuittancesExclues(){
		
	}
	
	public QuittancesExclues(String numeroQuittance, Timestamp dateAjout){
		this.numeroQuittance = numeroQuittance;
		this.dateAjout = dateAjout;
	}

	/**
	 * @return the numeroQuittance
	 */
	public String getNumeroQuittance() {
		return numeroQuittance;
	}

	/**
	 * @param numeroQuittance the numeroQuittance to set
	 */
	public void setNumeroQuittance(String numeroQuittance) {
		this.numeroQuittance = numeroQuittance;
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
