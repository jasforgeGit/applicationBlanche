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
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.RegularisationValeurKey;

/**
 * @author: issam Bean implementation class for Enterprise Bean:
 *          RegularisationValeur
 */

@Entity
@Table(name = "REGULARISATIONVALEUR")
@IdClass(RegularisationValeurKey.class)
public class RegularisationValeur implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 3652232808884790029L;

	@Id
	@Column(name = "DECANNEEENREGDECL", length = 4, nullable = false)
	private String decAnneeEnregDecl;
	@Id
	@Column(name = "DECBURENREGDECL", length = 3, nullable = false)
	private String decBurEnregDecl;
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;
	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Column(name = "DECPPMDECLARANT", length = 5, nullable = false)
	private String decPpmDeclarant;
	@Column(name = "DECDATECREATION")
	private Date decDateCreation;
	@Column(name = "DECCODEVERIFICATEUR", length = 5)
	private String decCodeVerificateur;
	@Column(name = "DECCODEVISITE", length = 1)
	private String decCodeVisite;
	@Column(name = "DECDATEECHEANCE")
	private Date decDateEcheance;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDECL", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDECL", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	public RegularisationValeur() {
	}

	public RegularisationValeur(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decPpmDeclarant) {
		this.decAnneeEnregDecl = decAnneeEnregDec;
		this.decBurEnregDecl = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDec;
		this.decPpmDeclarant = decPpmDeclarant;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

	public Date getDecDateCreation() {
		return decDateCreation;
	}

	public void setDecDateCreation(Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public String getDecCodeVisite() {
		return decCodeVisite;
	}

	public void setDecCodeVisite(String decCodeVisite) {
		this.decCodeVisite = decCodeVisite;
	}

	public Date getDecDateEcheance() {
		return decDateEcheance;
	}

	public void setDecDateEcheance(Date decDateEcheance) {
		this.decDateEcheance = decDateEcheance;
	}

	public String getDecAnneeEnregDecl() {
		return decAnneeEnregDecl;
	}

	public void setDecAnneeEnregDecl(String decAnneeEnregDecl) {
		this.decAnneeEnregDecl = decAnneeEnregDecl;
	}

	public String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}

	public void setDecBurEnregDecl(String decBurEnregDecl) {
		this.decBurEnregDecl = decBurEnregDecl;
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

}