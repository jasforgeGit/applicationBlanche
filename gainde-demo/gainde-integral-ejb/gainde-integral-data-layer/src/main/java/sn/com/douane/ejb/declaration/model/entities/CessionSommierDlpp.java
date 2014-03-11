/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.CessionSommierDlppKey;

/**
 * @author moussakare
 * 
 */
@Entity
@Table(name = "CESSIONSOMMIERDLPP")
@IdClass(CessionSommierDlppKey.class)
@NamedQueries(@NamedQuery(name = "CessionSommierDlpp.findByDest", query = "select object(o) from CessionSommierDlpp o where  "
		+ " decAnneeEnregDec = ?1 and "
		+ " decBurEnregDec = ?2 and  "
		+ " decNumDeclaration = ?3 "
		+ " and decNumArtDecl = ?4 and o.decPpmDestinataire = ?5 "
		+ " and  o.decDateCession >= ?6"))
public class CessionSommierDlpp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7788180784669525335L;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;

	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private java.lang.String decBurEnregDec;

	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private java.lang.Integer decNumDeclaration;

	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private java.lang.Integer decNumArtDecl;

	@Id
	@Column(name = "DECPPMEMETTEUR", length = 5, nullable = false)
	private java.lang.String decPpmEmetteur;

	@Id
	@Column(name = "DECPPMDESTINATAIRE", length = 5, nullable = false)
	private java.lang.String decPpmDestinataire;

	@Id
	@Column(name = "DECDATECESSION", nullable = false)
	private java.sql.Date decDateCession;

	@Column(name = "DECPPMRECEPTEUR", length = 5)
	private java.lang.String decPpmRecepteur;

	@Column(name = "DECCOMMENTAIRE", length = 240)
	private java.lang.String decCommentaire;
	/**
	 * 
	 */

	@ManyToOne(targetEntity = SommiersDlpp.class)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false, nullable = false) })
	private SommiersDlpp sommiersDlpp;

	public CessionSommierDlpp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CessionSommierDlpp(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDecl,
			String decPpmEmetteur, String decPpmDestinataire,
			Date decDateCession) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decPpmEmetteur = decPpmEmetteur;
		this.decPpmDestinataire = decPpmDestinataire;
		this.decDateCession = decDateCession;
	}

	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	/**
	 * @return the decPpmEmetteur
	 */
	public java.lang.String getDecPpmEmetteur() {
		return decPpmEmetteur;
	}

	/**
	 * @param decPpmEmetteur
	 *            the decPpmEmetteur to set
	 */
	public void setDecPpmEmetteur(java.lang.String decPpmEmetteur) {
		this.decPpmEmetteur = decPpmEmetteur;
	}

	/**
	 * @return the decPpmDestinataire
	 */
	public java.lang.String getDecPpmDestinataire() {
		return decPpmDestinataire;
	}

	/**
	 * @param decPpmDestinataire
	 *            the decPpmDestinataire to set
	 */
	public void setDecPpmDestinataire(java.lang.String decPpmDestinataire) {
		this.decPpmDestinataire = decPpmDestinataire;
	}

	/**
	 * @return the decDateCession
	 */
	public java.sql.Date getDecDateCession() {
		return decDateCession;
	}

	/**
	 * @param decDateCession
	 *            the decDateCession to set
	 */
	public void setDecDateCession(java.sql.Date decDateCession) {
		this.decDateCession = decDateCession;
	}

	/**
	 * @return the decPpmRecepteur
	 */
	public java.lang.String getDecPpmRecepteur() {
		return decPpmRecepteur;
	}

	/**
	 * @param decPpmRecepteur
	 *            the decPpmRecepteur to set
	 */
	public void setDecPpmRecepteur(java.lang.String decPpmRecepteur) {
		this.decPpmRecepteur = decPpmRecepteur;
	}

	/**
	 * @return the decCommentaire
	 */
	public java.lang.String getDecCommentaire() {
		return decCommentaire;
	}

	/**
	 * @param decCommentaire
	 *            the decCommentaire to set
	 */
	public void setDecCommentaire(java.lang.String decCommentaire) {
		this.decCommentaire = decCommentaire;
	}

	public SommiersDlpp getSommiersDlpp() {
		return sommiersDlpp;
	}

	public void setSommiersDlpp(SommiersDlpp sommiersDlpp) {
		this.sommiersDlpp = sommiersDlpp;
	}

}
