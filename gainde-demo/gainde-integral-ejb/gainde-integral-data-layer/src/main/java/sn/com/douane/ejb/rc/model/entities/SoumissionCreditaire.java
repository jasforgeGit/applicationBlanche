package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery; 
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.SoumissionCreditaireKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="SOUMISSIONCREDITAIRE")
@IdClass(SoumissionCreditaireKey.class)
@NamedQueries(
		@NamedQuery(name = "findByCodecreditaire", 
		query = "select object(o) from SoumissionCreditaire o where  o.rcCodeCreditaire = ?1"))
public class SoumissionCreditaire implements Serializable{

	private static final long serialVersionUID = -9014171287426000561L;

	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;
	
	@Id
	@Column(name="RCCODECREDITAIRE", length=3, nullable=false)
	private String rcCodeCreditaire;

	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="RCCODEINDICATEUR", insertable=false, updatable=false)
	private Indicateur indSoumCred;

	@ManyToOne(targetEntity = Creditaire.class)
	@JoinColumn(name="RCCODECREDITAIRE", insertable=false, updatable=false)
	private Creditaire credSoum;

	@Transient
	private List<String> arrayListIndicateur ;

	@Transient
	private List<Indicateur> listIndicateur;
	
	/**
	 * 0-args constructeurs
	 */
	public SoumissionCreditaire() {
	}
	
	/**
	 * 2-args constructeurs
	 * @param rcCodeCreditaire
	 * @param rcCodeIndicateur
	 */
	public SoumissionCreditaire (String rcCodeCreditaire,String rcCodeIndicateur) {
		this.rcCodeCreditaire=rcCodeCreditaire; 
		this.rcCodeIndicateur=rcCodeIndicateur; 
		return ; 
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * credSoum. 
	 */

	public Creditaire getCredSoum() {
		return credSoum;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * credSoum. 
	 */
	public void setCredSoum(Creditaire credSoum) {
		this.credSoum = credSoum;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * indSoumCred. 
	 */

	public Indicateur getIndSoumCred() {
		return indSoumCred;
	}

	/**
	 * This method was generated for supporting the relationship role named
	 * indSoumCred.
	 */
	public void setIndSoumCred(Indicateur indSoumCred) {
		this.indSoumCred = indSoumCred;
	}

	/**
	 * @return the codeCreditaire
	 */
	public String getRcCodeCreditaire() {
		return rcCodeCreditaire;
	}

	/**
	 * @param codeCreditaire the codeCreditaire to set
	 */
	public void setRcCodeCreditaire(String rcCodeCreditaire) {
		this.rcCodeCreditaire = rcCodeCreditaire;
	}

	/**
	 * @return the codeIndicateur
	 */
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	/**
	 * @param codeIndicateur the codeIndicateur to set
	 */
	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public List<String> getArrayListIndicateur() {
		return arrayListIndicateur;
	}

	public void setArrayListIndicateur(List<String> arrayListIndicateur) {
		this.arrayListIndicateur = arrayListIndicateur;
	}

	public List<Indicateur> getListIndicateur() {
		return listIndicateur;
	}

	public void setListIndicateur(List<Indicateur> listIndicateur) {
		this.listIndicateur = listIndicateur;
	}
}
