/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HSoumDeclarationKey;

/**
 * @author moussakare
 *
 */
@Entity
@Table(name = "HSOUMDECLARATION")
@IdClass(HSoumDeclarationKey.class)
public class HSoumDeclaration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4209197758491545125L;
	@Id	@Column(name = "DECDATEARCHIVE", nullable = false)
    private java.sql.Timestamp decDateArchive;
	@Id	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
    private java.lang.String decAnneeEnregDec;
	@Id	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id	@Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id	@Column(name = "DECNUMARTDEC", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Id	@Column(name = "DECPPMDECLARANT", length = 5, nullable = false)
	private java.lang.String decPpmDeclarant;
	@Column(name = "DECDATEENREGDECL")
    private java.sql.Date decDateEnregDecl;
	@Column(name = "DECTYPEREGIME", length = 1)
    private java.lang.String decTypeRegime;
	@Column(name = "DECREGDOUANIER", length = 1)
    private java.lang.String decRegDouanier;
	@Column(name = "DECCODEVERIFICATEUR", length = 5)
    private java.lang.String decCodeVerificateur;
	@Column(name = "DECDATEBAE")
    private java.sql.Date decDateBae;
	@Column(name = "DECNOMDESTINATAIRE", length = 255)
    private java.lang.String decNomDestinataire;
		
	@ManyToOne(targetEntity = HSegArtDec.class)
		@JoinColumns({
				@JoinColumn(name = "DECDATEARCHIVE", referencedColumnName = "DECDATEARCHIVE", insertable = false, updatable = false, nullable = false),
				@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
				@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
				@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
				@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false)})
	private HSegArtDec hArtDecSoum;

	/**
	 * 
	 */
	public HSoumDeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decDateArchive
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDecl
	 * @param decPpmDeclarant
	 */
	public HSoumDeclaration(Timestamp decDateArchive, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,
			Integer decNumArtDecl, String decPpmDeclarant) {
		super();
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decPpmDeclarant = decPpmDeclarant;
	}

	/**
	 * @return the decDateArchive
	 */
	public java.sql.Timestamp getDecDateArchive() {
		return decDateArchive;
	}

	/**
	 * @param decDateArchive the decDateArchive to set
	 */
	public void setDecDateArchive(java.sql.Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
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
	 * @return the decNumArtDecl
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	/**
	 * @param decNumArtDecl the decNumArtDecl to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	/**
	 * @return the decPpmDeclarant
	 */
	public java.lang.String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	/**
	 * @param decPpmDeclarant the decPpmDeclarant to set
	 */
	public void setDecPpmDeclarant(java.lang.String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

	/**
	 * @return the decDateEnregDecl
	 */
	public java.sql.Date getDecDateEnregDecl() {
		return decDateEnregDecl;
	}

	/**
	 * @param decDateEnregDecl the decDateEnregDecl to set
	 */
	public void setDecDateEnregDecl(java.sql.Date decDateEnregDecl) {
		this.decDateEnregDecl = decDateEnregDecl;
	}

	/**
	 * @return the decTypeRegime
	 */
	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}

	/**
	 * @param decTypeRegime the decTypeRegime to set
	 */
	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	/**
	 * @return the decRegDouanier
	 */
	public java.lang.String getDecRegDouanier() {
		return decRegDouanier;
	}

	/**
	 * @param decRegDouanier the decRegDouanier to set
	 */
	public void setDecRegDouanier(java.lang.String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	/**
	 * @return the decCodeVerificateur
	 */
	public java.lang.String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	/**
	 * @param decCodeVerificateur the decCodeVerificateur to set
	 */
	public void setDecCodeVerificateur(java.lang.String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	/**
	 * @return the decDateBae
	 */
	public java.sql.Date getDecDateBae() {
		return decDateBae;
	}

	/**
	 * @param decDateBae the decDateBae to set
	 */
	public void setDecDateBae(java.sql.Date decDateBae) {
		this.decDateBae = decDateBae;
	}

	/**
	 * @return the decNomDestinataire
	 */
	public java.lang.String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	/**
	 * @param decNomDestinataire the decNomDestinataire to set
	 */
	public void setDecNomDestinataire(java.lang.String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	/**
	 * @return the hArtDecSoum
	 */
	public HSegArtDec gethArtDecSoum() {
		return hArtDecSoum;
	}

	/**
	 * @param hArtDecSoum the hArtDecSoum to set
	 */
	public void sethArtDecSoum(HSegArtDec hArtDecSoum) {
		this.hArtDecSoum = hArtDecSoum;
	}
	
	

}
