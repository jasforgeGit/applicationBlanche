/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrouillonPJArticleKey;

/**
 * @author moussakare
 *
 */
@Entity
@Table(name = "BROUILLONPJARTICLE")
@IdClass(BrouillonPJArticleKey.class)
@NamedQueries(@NamedQuery(name = "findByRepertoire", query ="select object(o) from BrouillonPJArticle o where o.decAnneeDecl = ?1 and o.decCodePpmDeclarant = ?2 and o.decNumRepertoire = ?3"))
public class BrouillonPJArticle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7568438769443236362L;
	@Id	@Column(name = "DECANNEEDECLARATION", length = 4, nullable = false)
	private java.lang.String decAnneeDecl;
	@Id	@Column(name="DECCODEPPMDECLARANT", length= 5, nullable = false)
    private java.lang.String decCodePpmDeclarant;
    @Id	@Column(name="DECNUMREPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
    @Id	@Column(name="DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
    @Id	@Column(name="CODEPIECEJOINTE", length = 3, nullable = false)
    private java.lang.String codePieceJointe;
    @Column(name="DATECREATION", nullable = false)
    private java.sql.Date dateCreation;
    
    @ManyToOne(targetEntity = BrouillonArtDec.class, fetch = FetchType.LAZY)	
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECANNEEDECLARATION", referencedColumnName = "DECANNEEDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECCODEPPMDECLARANT", referencedColumnName = "DECCODEPPMDECLARANT", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMREPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false,nullable = false) })
    private BrouillonArtDec brartPJBrArt;

	/**
	 * 
	 */
	public BrouillonPJArticle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDeclarant
	 * @param decNumRepertoire
	 * @param decNumArtDecl
	 * @param codePieceJointe
	 * @param dateCreation
	 */
	public BrouillonPJArticle(String decAnneeDecl, String decCodePpmDeclarant,
			String decNumRepertoire, Integer decNumArtDecl,
			String codePieceJointe, Date dateCreation) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDeclarant = decCodePpmDeclarant;
		this.decNumRepertoire = decNumRepertoire;
		this.decNumArtDecl = decNumArtDecl;
		this.codePieceJointe = codePieceJointe;
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the decAnneeDecl
	 */
	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	/**
	 * @param decAnneeDecl the decAnneeDecl to set
	 */
	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
	}

	/**
	 * @return the decCodePpmDeclarant
	 */
	public java.lang.String getDecCodePpmDeclarant() {
		return decCodePpmDeclarant;
	}

	/**
	 * @param decCodePpmDeclarant the decCodePpmDeclarant to set
	 */
	public void setDecCodePpmDeclarant(java.lang.String decCodePpmDeclarant) {
		this.decCodePpmDeclarant = decCodePpmDeclarant;
	}

	/**
	 * @return the decNumRepertoire
	 */
	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	/**
	 * @param decNumRepertoire the decNumRepertoire to set
	 */
	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
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
	 * @return the codePieceJointe
	 */
	public java.lang.String getCodePieceJointe() {
		return codePieceJointe;
	}

	/**
	 * @param codePieceJointe the codePieceJointe to set
	 */
	public void setCodePieceJointe(java.lang.String codePieceJointe) {
		this.codePieceJointe = codePieceJointe;
	}

	/**
	 * @return the dateCreation
	 */
	public java.sql.Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(java.sql.Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the brartPJBrArt
	 */
	public BrouillonArtDec getBrartPJBrArt() {
		return brartPJBrArt;
	}

	/**
	 * @param brartPJBrArt the brartPJBrArt to set
	 */
	public void setBrartPJBrArt(BrouillonArtDec brartPJBrArt) {
		this.brartPJBrArt = brartPJBrArt;
	}
    
    

}
