package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class DelegationKey implements Serializable{

	private static final long serialVersionUID = -2937880688654039381L;

	/**
	 * Implementation field for persistent attribute: agentDestinataire
	 */
	@Column(name="AGENTDESTINATAIRE", length=7, nullable=false)
	private String agentDestinataire;
	
	/**
	 * Implementation field for persistent attribute: agentEmetteur
	 */
	@Column(name="AGENTEMETTEUR", length=7, nullable=false)
	private String agentEmetteur;
	/**
	 * Implementation field for persistent attribute: codeGroupe
	 */
	private Integer codeGroupe;
	/**
	 * Implementation field for persistent attribute: codeFonction
	 */
	@Column(name="CODEFONCTION", length=15, nullable=false)
	private String codeFonction;
	/**
	 * Implementation field for persistent attribute: datedebut
	 */
	private java.sql.Date dateDebut;
	
	
	/**
	 * Creates an empty key for Entity Bean: Delegations
	 */
	public DelegationKey() {
	}
	
	public DelegationKey(Date dateDebut, String agentEmetteur, String agentDestinataire,
		String codeFonction, Integer codeGroupe) {
		super();
		this.dateDebut = dateDebut;
		this.agentDestinataire = agentDestinataire;
		this.agentEmetteur = agentEmetteur;
		this.codeFonction = codeFonction;
		this.codeGroupe = codeGroupe;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof DelegationKey) {
			DelegationKey o = (DelegationKey) otherKey;
			return ((this.dateDebut.equals(o.dateDebut))
				&& (this.agentDestinataire
					.equals(o.agentDestinataire))
				&& (this.agentEmetteur
					.equals(o.agentEmetteur))
				&& (this.codeFonction
					.equals(o.codeFonction)) && (this.codeGroupe
				.equals(o.codeGroupe)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (dateDebut.hashCode()
			+ agentDestinataire.hashCode()
			+ agentEmetteur.hashCode()
			+ codeFonction.hashCode() 
			+ codeGroupe.hashCode());
	}

	public java.sql.Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(java.sql.Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getAgentDestinataire() {
		return agentDestinataire;
	}

	public void setAgentDestinataire(String agentDestinataire) {
		this.agentDestinataire = agentDestinataire;
	}

	public String getAgentEmetteur() {
		return agentEmetteur;
	}

	public void setAgentEmetteur(String agentEmetteur) {
		this.agentEmetteur = agentEmetteur;
	}

	public String getCodeFonction() {
		return codeFonction;
	}

	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}

	public Integer getCodeGroupe() {
		return codeGroupe;
	}

	public void setCodeGroupe(Integer codeGroupe) {
		this.codeGroupe = codeGroupe;
	}
	
}
