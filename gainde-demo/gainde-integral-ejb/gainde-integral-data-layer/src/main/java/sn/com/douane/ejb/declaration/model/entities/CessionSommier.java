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

import sn.com.douane.ejb.declaration.model.keys.CessionSommierKey;

/**
 * @author moussakare
 *
 */
@Entity
@Table(name = "CESSIONSOMMIER")
@IdClass(CessionSommierKey.class)
@NamedQueries(@NamedQuery(name = "CessionSommier.findByDest", 
query = "select object(o) from CessionSommier o where  o.decAnneeEnregDec = ?1 and  o.decBurEnregDec = ?2 and " +
		" 									  o.decNumDeclaration = ?3 and  o.decNumArtDec = ?4 and  " +
		"									  o.decPpmDestinataire = ?5 and  o.decDateCession <= ?6"))
public class CessionSommier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1800399249036448068L;
	
	@Id	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Id	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id	@Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDec;
	@Id	@Column(name = "DECPPMEMETTEUR", length = 5, nullable = false)
    private java.lang.String decPpmEmetteur;
	@Id	@Column(name = "DECPPMDESTINATAIRE", length = 5, nullable = false)
    private java.lang.String decPpmDestinataire;
	@Id	@Column(name = "DECDATECESSION", nullable = false)
    private java.sql.Date decDateCession;
	@Column(name = "DECPPMRECEPTEUR", length = 5)
    private java.lang.String decPpmRecepteur;
	@Column(name = "DECCOMMENTAIRE", length = 240)
    private java.lang.String decCommentaire;
	
	@ManyToOne(targetEntity = Sommiers.class)
	@JoinColumns({
		@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false, nullable = false)
		})
    private Sommiers somCesSom;

	/**
	 * 
	 */
	public CessionSommier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decPpmEmetteur
	 * @param decPpmDestinataire
	 * @param decDateCession
	 */
	public CessionSommier(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decPpmEmetteur, String decPpmDestinataire,
			Date decDateCession) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decPpmEmetteur = decPpmEmetteur;
		this.decPpmDestinataire = decPpmDestinataire;
		this.decDateCession = decDateCession;
	}

	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	/**
	 * @return the decPpmEmetteur
	 */
	public java.lang.String getDecPpmEmetteur() {
		return decPpmEmetteur;
	}

	/**
	 * @param decPpmEmetteur the decPpmEmetteur to set
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
	 * @param decPpmDestinataire the decPpmDestinataire to set
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
	 * @param decDateCession the decDateCession to set
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
	 * @param decPpmRecepteur the decPpmRecepteur to set
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
	 * @param decCommentaire the decCommentaire to set
	 */
	public void setDecCommentaire(java.lang.String decCommentaire) {
		this.decCommentaire = decCommentaire;
	}

	/**
	 * @return the somCesSom
	 */
	public Sommiers getSomCesSom() {
		return somCesSom;
	}

	/**
	 * @param somCesSom the somCesSom to set
	 */
	public void setSomCesSom(Sommiers somCesSom) {
		this.somCesSom = somCesSom;
	}
	
	

}
