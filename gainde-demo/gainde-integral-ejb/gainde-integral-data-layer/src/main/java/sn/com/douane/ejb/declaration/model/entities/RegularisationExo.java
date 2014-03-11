package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.RegularisationExoKey;



@Entity
@IdClass(RegularisationExoKey.class)
@Table(name="REGULARISATIONEXO")
public class RegularisationExo implements Serializable {

	private static final long serialVersionUID = -3101144451803895895L;
	
	@Id
	@Column(name="DECANNEEDECLARATION",length=4, nullable=false)
	 private java.lang.String decAnneeDeclaration;
	
	@Id
	@Column(name="DECBURENREGDECL",length=3, nullable=false)
	    private java.lang.String decBurEnregDecl;
	
	@Id
	@Column(name="DECNUMDECLARATION", nullable=false)
	    private java.lang.Integer decNumDeclaration;
	
	@Id
	@Column(name="DECNUMARTDECL", nullable=false)
	    private java.lang.Integer decNumArtDecl;
	
	@Column(name="DECCODEVERIFICATEUR",length=5)
	    private java.lang.String decCodeVerificateur;
	
	@Column(name="DECDATEDECLARATION")
	    private java.sql.Date decDateDeclaration;
	
	@Column(name="DECDATEECHEANCE")
	    private java.sql.Date decDateEcheance;
	
	@Column(name="DECINDICVISITE",length=1)
	    private java.lang.String decIndicVisite;
	
	@Column(name="DECMONTSUSPENDU",columnDefinition="DECIMAL(18,0)")
	    private java.math.BigDecimal decMontSuspendu;
	
	@Column(name="DECPPMDECLARANT",length=5)
	    private java.lang.String decPpmDeclarant;

	public RegularisationExo() {
		super();
	}

	public RegularisationExo(String decAnneeDeclaration,
			String decBurEnregDecl, Integer decNumDeclaration,
			Integer decNumArtDecl, String decCodeVerificateur,
			Date decDateDeclaration, Date decDateEcheance,
			String decIndicVisite, BigDecimal decMontSuspendu,
			String decPpmDeclarant) {
		super();
		this.decAnneeDeclaration = decAnneeDeclaration;
		this.decBurEnregDecl = decBurEnregDecl;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decCodeVerificateur = decCodeVerificateur;
		this.decDateDeclaration = decDateDeclaration;
		this.decDateEcheance = decDateEcheance;
		this.decIndicVisite = decIndicVisite;
		this.decMontSuspendu = decMontSuspendu;
		this.decPpmDeclarant = decPpmDeclarant;
	}

	public java.lang.String getDecAnneeDeclaration() {
		return decAnneeDeclaration;
	}

	public void setDecAnneeDeclaration(java.lang.String decAnneeDeclaration) {
		this.decAnneeDeclaration = decAnneeDeclaration;
	}

	public java.lang.String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}

	public void setDecBurEnregDecl(java.lang.String decBurEnregDecl) {
		this.decBurEnregDecl = decBurEnregDecl;
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

	public java.lang.String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(java.lang.String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public java.sql.Date getDecDateDeclaration() {
		return decDateDeclaration;
	}

	public void setDecDateDeclaration(java.sql.Date decDateDeclaration) {
		this.decDateDeclaration = decDateDeclaration;
	}

	public java.sql.Date getDecDateEcheance() {
		return decDateEcheance;
	}

	public void setDecDateEcheance(java.sql.Date decDateEcheance) {
		this.decDateEcheance = decDateEcheance;
	}

	public java.lang.String getDecIndicVisite() {
		return decIndicVisite;
	}

	public void setDecIndicVisite(java.lang.String decIndicVisite) {
		this.decIndicVisite = decIndicVisite;
	}

	public java.math.BigDecimal getDecMontSuspendu() {
		return decMontSuspendu;
	}

	public void setDecMontSuspendu(java.math.BigDecimal decMontSuspendu) {
		this.decMontSuspendu = decMontSuspendu;
	}

	public java.lang.String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(java.lang.String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

}
