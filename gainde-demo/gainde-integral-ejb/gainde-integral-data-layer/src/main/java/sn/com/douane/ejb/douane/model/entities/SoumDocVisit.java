package sn.com.douane.ejb.douane.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.douane.model.keys.SoumDocVisitKey;





@Entity
@IdClass(SoumDocVisitKey.class)
@Table(name="SOUMDOCVISIT")
public class SoumDocVisit implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;

	
	
	@Id
	@Column(name="VISANNEEDECLARATION", length=4, nullable=false)
	private java.lang.String visAnneeDeclaration;
	
	@Id
	@Column(name="VISBUREAUDECLARATION", length=3, nullable=false)
    private java.lang.String visBureauDeclaration;
	
	@Id
	@Column(name="VISNUMDECLARATION", nullable=false)
    private java.lang.Integer visNumDeclaration;
	
	@Id
	@Column(name="VISNUMARTDECL", nullable=false)
    private java.lang.Integer visNumArtDecl;
	
	@Id
	@Column(name="VISCODESOUMDOC", length=2, nullable=false)
    private java.lang.String visCodeSoumDoc;
	
	@Column(name="VISCODEVERIFICATEUR", length=5, nullable=false)
    private java.lang.String visCodeVerificateur;
	
	@Column(name="VISCODEPPMDECLARANT", length=5, nullable=false)
    private java.lang.String visCodePpmDeclarant;
	
	@Column(name="VISNOMDESTINATAIRE", length=100, nullable=false)
    private java.lang.String visNomDestinataire;
	
	@Column(name="VISTYPEREGIME", length=1, nullable=false)
    private java.lang.String visTypeRegime;
	
	@Column(name="VISREGIMEDOUANIER", length=1, nullable=false)
    private java.lang.String visRegimeDouanier;
	
	@Column(name="VISDATEBAE", nullable=false)
    private java.sql.Timestamp visDateAe;
	
	@Column(name="VISDATEECHEANCESOUM", nullable=false)
    private java.sql.Timestamp visDateEcheanceSoum;
	
	@Column(name="VISDATELEVEESOUM")
    private java.sql.Timestamp visDateLeveeSoum;

	public SoumDocVisit(String visAnneeDeclaration,
			String visBureauDeclaration, Integer visNumDeclaration,
			Integer visNumArtDecl, String visCodeSoumDoc,
			String visCodeVerificateur, String visCodePpmDeclarant,
			String visNomDestinataire, String visTypeRegime,
			String visRegimeDouanier, Timestamp visDateAe,
			Timestamp visDateEcheanceSoum) {
		super();
		this.visAnneeDeclaration = visAnneeDeclaration;
		this.visBureauDeclaration = visBureauDeclaration;
		this.visNumDeclaration = visNumDeclaration;
		this.visNumArtDecl = visNumArtDecl;
		this.visCodeSoumDoc = visCodeSoumDoc;
		this.visCodeVerificateur = visCodeVerificateur;
		this.visCodePpmDeclarant = visCodePpmDeclarant;
		this.visNomDestinataire = visNomDestinataire;
		this.visTypeRegime = visTypeRegime;
		this.visRegimeDouanier = visRegimeDouanier;
		this.visDateAe = visDateAe;
		this.visDateEcheanceSoum = visDateEcheanceSoum;
	}

	public SoumDocVisit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getVisAnneeDeclaration() {
		return visAnneeDeclaration;
	}

	public void setVisAnneeDeclaration(java.lang.String visAnneeDeclaration) {
		this.visAnneeDeclaration = visAnneeDeclaration;
	}

	public java.lang.String getVisBureauDeclaration() {
		return visBureauDeclaration;
	}

	public void setVisBureauDeclaration(java.lang.String visBureauDeclaration) {
		this.visBureauDeclaration = visBureauDeclaration;
	}

	public java.lang.Integer getVisNumDeclaration() {
		return visNumDeclaration;
	}

	public void setVisNumDeclaration(java.lang.Integer visNumDeclaration) {
		this.visNumDeclaration = visNumDeclaration;
	}

	public java.lang.Integer getVisNumArtDecl() {
		return visNumArtDecl;
	}

	public void setVisNumArtDecl(java.lang.Integer visNumArtDecl) {
		this.visNumArtDecl = visNumArtDecl;
	}

	public java.lang.String getVisCodeSoumDoc() {
		return visCodeSoumDoc;
	}

	public void setVisCodeSoumDoc(java.lang.String visCodeSoumDoc) {
		this.visCodeSoumDoc = visCodeSoumDoc;
	}

	public java.lang.String getVisCodeVerificateur() {
		return visCodeVerificateur;
	}

	public void setVisCodeVerificateur(java.lang.String visCodeVerificateur) {
		this.visCodeVerificateur = visCodeVerificateur;
	}

	public java.lang.String getVisCodePpmDeclarant() {
		return visCodePpmDeclarant;
	}

	public void setVisCodePpmDeclarant(java.lang.String visCodePpmDeclarant) {
		this.visCodePpmDeclarant = visCodePpmDeclarant;
	}

	public java.lang.String getVisNomDestinataire() {
		return visNomDestinataire;
	}

	public void setVisNomDestinataire(java.lang.String visNomDestinataire) {
		this.visNomDestinataire = visNomDestinataire;
	}

	public java.lang.String getVisTypeRegime() {
		return visTypeRegime;
	}

	public void setVisTypeRegime(java.lang.String visTypeRegime) {
		this.visTypeRegime = visTypeRegime;
	}

	public java.lang.String getVisRegimeDouanier() {
		return visRegimeDouanier;
	}

	public void setVisRegimeDouanier(java.lang.String visRegimeDouanier) {
		this.visRegimeDouanier = visRegimeDouanier;
	}

	public java.sql.Timestamp getVisDateAe() {
		return visDateAe;
	}

	public void setVisDateAe(java.sql.Timestamp visDateAe) {
		this.visDateAe = visDateAe;
	}

	public java.sql.Timestamp getVisDateEcheanceSoum() {
		return visDateEcheanceSoum;
	}

	public void setVisDateEcheanceSoum(java.sql.Timestamp visDateEcheanceSoum) {
		this.visDateEcheanceSoum = visDateEcheanceSoum;
	}

	public java.sql.Timestamp getVisDateLeveeSoum() {
		return visDateLeveeSoum;
	}

	public void setVisDateLeveeSoum(java.sql.Timestamp visDateLeveeSoum) {
		this.visDateLeveeSoum = visDateLeveeSoum;
	}
	
	

}
