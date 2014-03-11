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

import sn.com.douane.ejb.declaration.model.keys.BrBurPassageAcquitKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrBurPassageAcquitKey.class)
@Table(name = "BRBURPASSAGEACQUIT")
public class BrBurPassageAcquit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4543750558871564470L;
	
	@Id @Column(name = "DECANNEEACQUIT", length = 4, nullable = false)
    private java.lang.String decAnneeDecl;
	@Id @Column(name = "DECPPDECLARANT", length = 5, nullable = false)
    private java.lang.String decCodePpmDecl;
	@Id @Column(name = "DECNUMPERTOIRE", length = 6, nullable = false)
    private java.lang.String decNumRepertoire;
	@Id @Column(name = "DECBURPASSAGE", length = 3, nullable = false)
	private java.lang.String decBurPassage;
	@Column(name = "DECDATEPASSAGE", nullable = false)
    private java.sql.Timestamp decDatePassage;
	
	@ManyToOne(targetEntity = BrouillonAcquit.class)
	@JoinColumns({
		@JoinColumn(name = "DECANNEEACQUIT", referencedColumnName = "DECANNEEDECL", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECPPDECLARANT", referencedColumnName = "DECCODEPPMDECL", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "DECNUMPERTOIRE", referencedColumnName = "DECNUMREPERTOIRE", insertable = false, updatable = false, nullable = false)	
	})
    private BrouillonAcquit brAcqPassage;
	
	/**
	 * 
	 */
	public BrBurPassageAcquit() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @param decAnneeDecl
	 * @param decCodePpmDecl
	 * @param decNumRepertoire
	 * @param decBurPassage
	 * @param decDatePassage
	 */
	public BrBurPassageAcquit(String decAnneeDecl, String decCodePpmDecl,
			String decNumRepertoire, String decBurPassage,
			Timestamp decDatePassage) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decBurPassage = decBurPassage;
		this.decDatePassage = decDatePassage;
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
	 * @return the decCodePpmDecl
	 */
	public java.lang.String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}

	/**
	 * @param decCodePpmDecl the decCodePpmDecl to set
	 */
	public void setDecCodePpmDecl(java.lang.String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
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
	 * @return the decBurPassage
	 */
	public java.lang.String getDecBurPassage() {
		return decBurPassage;
	}

	/**
	 * @param decBurPassage the decBurPassage to set
	 */
	public void setDecBurPassage(java.lang.String decBurPassage) {
		this.decBurPassage = decBurPassage;
	}

	/**
	 * @return the decDatePassage
	 */
	public java.sql.Timestamp getDecDatePassage() {
		return decDatePassage;
	}

	/**
	 * @param decDatePassage the decDatePassage to set
	 */
	public void setDecDatePassage(java.sql.Timestamp decDatePassage) {
		this.decDatePassage = decDatePassage;
	}

	/**
	 * @return the brAcqPassage
	 */
	public BrouillonAcquit getBrAcqPassage() {
		return brAcqPassage;
	}

	/**
	 * @param brAcqPassage the brAcqPassage to set
	 */
	public void setBrAcqPassage(BrouillonAcquit brAcqPassage) {
		this.brAcqPassage = brAcqPassage;
	}

	
	
	

}
