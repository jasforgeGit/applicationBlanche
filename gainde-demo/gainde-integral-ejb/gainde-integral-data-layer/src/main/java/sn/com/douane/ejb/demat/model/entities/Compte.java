package sn.com.douane.ejb.demat.model.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;



@Entity
@Table(name = "COMPTE")
public class Compte implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8747321693949639932L;

	@Id
	@Column(name = "IDCOMPTE", nullable=false)
	private Long idCompte;
	
	@Column(name = "VERSION", nullable=false)
	private Integer version;
	
	@Column(name = "NUMEROCOMPTE", length = 20)
	private String numeroCompte;
	
	@Column(name = "LIBCOMPTE", length = 100)
	private String libCompte;
	
	@Column(name = "SOLDECOMPTE")
	private Double soldeCompte;
	
	@OneToMany(mappedBy = "compte")
	private List<BureauDouane> listBureauDouane = new ArrayList<BureauDouane>();
	
	@OneToMany(mappedBy = "compte")
	private List<Agree> listAgree = new ArrayList<Agree>();	
	
	@OneToMany(mappedBy = "compte")
	private List<Creditaire> listCreditaire = new ArrayList<Creditaire>();
	
	@OneToMany(mappedBy = "compte")
	private List<Consignataire> listConsignataire = new ArrayList<Consignataire>();
	
	
	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return this.numeroCompte;
	}

	/**
	 * @param numeroCompte
	 *            the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the libCompte
	 */
	public String getLibCompte() {
		return this.libCompte;
	}

	/**
	 * @param libCompte
	 *            the libCompte to set
	 */
	public void setLibCompte(String libCompte) {
		this.libCompte = libCompte;
	}

	/**
	 * @return the soldeCompte
	 */
	public Double getSoldeCompte() {
		return this.soldeCompte;
	}

	/**
	 * @param soldeCompte
	 *            the soldeCompte to set
	 */
	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public List<BureauDouane> getListBureauDouane() {
		return listBureauDouane;
	}

	public void setListBureauDouane(List<BureauDouane> listBureauDouane) {
		this.listBureauDouane = listBureauDouane;
	}

	public List<Agree> getListAgree() {
		return listAgree;
	}

	public void setListAgree(List<Agree> listAgree) {
		this.listAgree = listAgree;
	}

	public List<Creditaire> getListCreditaire() {
		return listCreditaire;
	}

	public void setListCreditaire(List<Creditaire> listCreditaire) {
		this.listCreditaire = listCreditaire;
	}

	public List<Consignataire> getListConsignataire() {
		return listConsignataire;
	}

	public void setListConsignataire(List<Consignataire> listConsignataire) {
		this.listConsignataire = listConsignataire;
	}
	

}
