package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGES")
public class Messages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NUMMESSAGE", nullable = false)
	private java.lang.Integer nummessage;
	@Column(name = "PRIORITE", length = 1)
	private java.lang.String priorite;
	@Column(name = "CODETYPEMESSAGE", length = 1)
	private java.lang.String codetypemessage;
	@Column(name = "DATEEMISSION")
	private java.sql.Date dateemission;
	@Column(name = "ETATEMISSION", length = 1)
	private java.lang.String etatemission;
	@Column(name = "ETATRECEPTION", length = 1)
	private java.lang.String etatreception;
	@Column(name = "TITREMESSAGE", length = 200)
	private java.lang.String titremessage;
	@Column(name = "CORPSMESSAGE", length = 1000)
	private java.lang.String corpsmessage;
	@Column(name = "MOTPASSEEMETTEUR", length = 100)
	private java.lang.String motpasseemetteur;
	@Column(name = "MOTPASSEDEST", length = 100)
	private java.lang.String motpassedest;
	@Column(name = "CODEEMETTEUR", length = 7, nullable = false)
	private java.lang.String codeemetteur;
	@Column(name = "CODEDESTINATAIRE", length = 7, nullable = false)
	private java.lang.String codedestinataire;

	public Messages(java.lang.Integer nummessage) {
		super();
		this.nummessage = nummessage;
	}

	public Messages(Integer nummessage, String codeemetteur,
			String codedestinataire) {
		super();
		this.nummessage = nummessage;
		this.codeemetteur = codeemetteur;
		this.codedestinataire = codedestinataire;
	}

	/**
	 * Get accessor for persistent attribute: nummessage
	 */

	public java.lang.Integer getNummessage() {
		return nummessage;
	}

	/**
	 * Set accessor for persistent attribute: nummessage
	 */
	public void setNummessage(java.lang.Integer nummessage) {
		this.nummessage = nummessage;
	}

	/**
	 * Get accessor for persistent attribute: priorite
	 */

	public java.lang.String getPriorite() {
		return priorite;
	}

	/**
	 * Set accessor for persistent attribute: priorite
	 */
	public void setPriorite(java.lang.String priorite) {
		this.priorite = priorite;
	}

	/**
	 * Get accessor for persistent attribute: codetypemessage
	 */

	public java.lang.String getCodetypemessage() {
		return codetypemessage;
	}

	/**
	 * Set accessor for persistent attribute: codetypemessage
	 */
	public void setCodetypemessage(java.lang.String codetypemessage) {
		this.codetypemessage = codetypemessage;
	}

	/**
	 * Get accessor for persistent attribute: dateemission
	 */

	public java.sql.Date getDateemission() {
		return dateemission;
	}

	/**
	 * Set accessor for persistent attribute: dateemission
	 */
	public void setDateemission(java.sql.Date dateemission) {
		this.dateemission = dateemission;
	}

	/**
	 * Get accessor for persistent attribute: etatemission
	 */

	public java.lang.String getEtatemission() {
		return etatemission;
	}

	/**
	 * Set accessor for persistent attribute: etatemission
	 */
	public void setEtatemission(java.lang.String etatemission) {
		this.etatemission = etatemission;
	}

	/**
	 * Get accessor for persistent attribute: etatreception
	 */

	public java.lang.String getEtatreception() {
		return etatreception;
	}

	/**
	 * Set accessor for persistent attribute: etatreception
	 */
	public void setEtatreception(java.lang.String etatreception) {
		this.etatreception = etatreception;
	}

	/**
	 * Get accessor for persistent attribute: titremessage
	 */

	public java.lang.String getTitremessage() {
		return titremessage;
	}

	/**
	 * Set accessor for persistent attribute: titremessage
	 */
	public void setTitremessage(java.lang.String titremessage) {
		this.titremessage = titremessage;
	}

	/**
	 * Get accessor for persistent attribute: corpsmessage
	 */

	public java.lang.String getCorpsmessage() {
		return corpsmessage;
	}

	/**
	 * Set accessor for persistent attribute: corpsmessage
	 */
	public void setCorpsmessage(java.lang.String corpsmessage) {
		this.corpsmessage = corpsmessage;
	}

	/**
	 * Get accessor for persistent attribute: motpasseemetteur
	 */

	public java.lang.String getMotpasseemetteur() {
		return motpasseemetteur;
	}

	/**
	 * Set accessor for persistent attribute: motpasseemetteur
	 */
	public void setMotpasseemetteur(java.lang.String motpasseemetteur) {
		this.motpasseemetteur = motpasseemetteur;
	}

	/**
	 * Get accessor for persistent attribute: motpassedest
	 */

	public java.lang.String getMotpassedest() {
		return motpassedest;
	}

	/**
	 * Set accessor for persistent attribute: motpassedest
	 */
	public void setMotpassedest(java.lang.String motpassedest) {
		this.motpassedest = motpassedest;
	}

	/**
	 * Get accessor for persistent attribute: codeemetteur
	 */

	public java.lang.String getCodeemetteur() {
		return codeemetteur;
	}

	/**
	 * Set accessor for persistent attribute: codeemetteur
	 */
	public void setCodeemetteur(java.lang.String codeemetteur) {
		this.codeemetteur = codeemetteur;
	}

	/**
	 * Get accessor for persistent attribute: codedestinataire
	 */

	public java.lang.String getCodedestinataire() {
		return codedestinataire;
	}

	/**
	 * Set accessor for persistent attribute: codedestinataire
	 */
	public void setCodedestinataire(java.lang.String codedestinataire) {
		this.codedestinataire = codedestinataire;
	}

	public Messages() {
	}
}
