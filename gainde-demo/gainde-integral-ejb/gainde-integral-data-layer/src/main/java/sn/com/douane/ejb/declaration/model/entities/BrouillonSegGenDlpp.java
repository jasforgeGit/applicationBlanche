/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import sn.com.douane.ejb.declaration.model.keys.BrouillonSegGenDlppKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(BrouillonSegGenDlppKey.class)
@Table(name = "BROUILLONSEGGENDLPP")
@NamedQueries({
	@NamedQuery(name = "findAllByPpmAndAnnee", 
			query = "select object(o) from BrouillonSegGenDlpp o where  o.dlppCodePpmDeclarant = ?1 and  o.dlppAnneeDlpp = ?2")
})

public class BrouillonSegGenDlpp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4484325327677296807L;

	@Id
	@Column(name = "DLPPANNEEDLPP" ,length = 4, nullable = false)
	private java.lang.String dlppAnneeDlpp;
	@Id
	@Column(name = "DLPPCODEPPMDECLARANT" ,length = 5, nullable = false)
    private java.lang.String dlppCodePpmDeclarant;
	@Id
	@Column(name = "DLPPNUMREPERTOIRE" ,length = 6, nullable = false)
    private java.lang.String dlppNumRepertoire;
	@Column(name = "DLPPANNEEENREGMANIF" ,length = 4)
    private java.lang.String dlppAnneeEnregManif;
	@Column(name = "DLPPBPDESTINATAIRE" ,length = 5)
    private java.lang.String dlppPpDestinataire;
	@Column(name = "DLPPBURENREGMANIF" ,length = 3)
    private java.lang.String dlppBurEnregManif;
	@Column(name = "DLPPCODEAGREE" ,length = 3)
    private java.lang.String dlppCodeAgree;
	@Column(name = "DLPPCODEBUREAU" ,length = 3)
    private java.lang.String dlppCodeBureau;
	@Column(name = "DLPPCODECONTRIBDEST" ,length = 7)
    private java.lang.String dlppCodeContribDest;
	@Column(name = "DLPPCODECREDITAIRE" ,length = 3)
    private java.lang.String dlppCodeCreditaire;
	@Column(name = "DLPPCODEDESTINATAIRE" ,length = 5)
    private java.lang.String dlppCodeDestinataire;
	@Column(name = "DLPPCODEENTREPOSITAIRE" ,length = 5)
    private java.lang.String dlppCodeEntrepositaire;
	@Column(name = "DLPPCODELIEUSTOCKAGE" ,length = 3)
    private java.lang.String dlppCodeLieuStockage;
	@Column(name = "DLPPCODEPAYSPROVENANCE" ,length = 3)
    private java.lang.String dlppPodepPaysProvenance;
	@Column(name = "DLPPCODETRANSPORTEUR" ,length = 5)
    private java.lang.String dlppCodeTransporteur;
	@Column(name = "DLPPDATEMODIFICATION")
	private java.sql.Date dlppDateModification;
	@Column(name = "DLPPMODEDECLARATION" ,length = 4)
    private java.lang.String dlppModeDeclaration;
	@Column(name = "DLPPMODETRANSPORT" ,length = 2)
    private java.lang.String dlppModeTransport;
	@Column(name = "DLPPMOYENTRANSPORT" ,length = 255)
    private java.lang.String dlppMoyenTransport;
	@Column(name = "DLPPNBREARTICLES")
    private java.lang.Integer dlppNbreArticles;
	@Column(name = "DLPPNOMDECLARANT" ,length = 255)
    private java.lang.String dlppNomDeclarant;
	@Column(name = "DLPPNOMDESTINATAIRE" ,length = 255)
    private java.lang.String dlppNomDestinataire;
	@Column(name = "DLPPNOMTRANSPORTEUR" ,length = 255)
    private java.lang.String dlppNomTransporteur;
	@Column(name = "DLPPNOMENTREPOSITAIRE" ,length = 255)
    private java.lang.String dlppNomEntrepositaire;
	@Column(name = "DLPPNOMTANKER" ,length = 255)
    private java.lang.String dlppNomTanker;
	@Column(name = "DLPPNOMVOIEDESTINATAIRE" ,length = 60)
    private java.lang.String dlppNomVoieDestinataire;
	@Column(name = "DLPPNOMVOIETRANSPORTEUR" ,length = 60)
    private java.lang.String dlppNomVoieTransporteur;
	@Column(name = "DLPPNUMENREGMANIF")
    private java.lang.Integer dlppNumEnregManif;
	@Column(name = "DLPPNUMVOIEDESTINATAIRE" ,length = 25)
    private java.lang.String dlppNumVoieDestinataire;
	@Column(name = "DLPPNUMVOIEENTREPOSITAIRE" ,length = 5)
    private java.lang.String dlppNumVoieEntrepositaire;
	@Column(name = "DLPPNUMVOIETRANSPORTEUR" ,length = 5)
    private java.lang.String dlppNumVoieTransporteur;
	@Column(name = "DLPPPAYSDESTINATION" ,length = 3)
    private java.lang.String dlppPaysDestination;
	@Column(name = "DLPPQUARTIERDESTINATAIRE" ,length = 60)
    private java.lang.String dlppQuartierDestinataire;
	@Column(name = "DLPPQUARTIERENTREPOSITAIRE" ,length = 50)
    private java.lang.String dlppQuartierEntrepositaire;
	@Column(name = "DLPPREFDECLARANT" ,length = 30)
    private java.lang.String dlppRefDeclarant;
	@Column(name = "DLPPREGIMEDOUANIER" ,length = 2)
    private java.lang.String dlppRegimeDouanier;
	@Column(name = "DLPPTITREDECLARANT" ,length = 3)
    private java.lang.String dlppTitreDeclarant;
	@Column(name = "DLPPTITREDESTINATAIRE" ,length = 3)
    private java.lang.String dlppTitreDestinataire;
	@Column(name = "DLPPTYPEAPUREMENT" ,length = 1)
    private java.lang.String dlppTypeApurement;
	@Column(name = "DLPPTYPEREGIME" ,length = 1)
    private java.lang.String dlppTypeRegime;
	@Column(name = "DLPPTYPEVOIEDECLARANT" ,length = 5)
    private java.lang.String dlppTypeVoieDeclarant;
	@Column(name = "DLPPTYPEVOIEDESTINATAIRE" ,length = 5)
    private java.lang.String dlppTypeVoieDestinataire;
	@Column(name = "DLPPTYPEVOIEENTREPOSITAIRE" ,length = 5)
    private java.lang.String dlppTypeVoieEntrepositaire;
	@Column(name = "DLPPTYPEVOIETRANSPORTEUR" ,length = 5)
    private java.lang.String dlppTypeVoieTransporteur;
	@Column(name = "DLPPVILLEDECLARANT" ,length = 50)
    private java.lang.String dlppVilleDeclarant;
	@Column(name = "DLPPVILLEDESTINATAIRE" ,length = 50)
    private java.lang.String dlppVilleDestinataire;
	@Column(name = "DLPPVILLETRANSPORTEUR" ,length = 50)
    private java.lang.String dlppVilleTransporteur;
	@Column(name = "DLPPVILLEENTREPOSITAIRE" ,length = 50)
    private java.lang.String dlppVilleEntrepositaire;
	@Column(name = "DLPPDATECREATION")
    private java.sql.Date dlppDateCreation;
	@Column(name = "DLPPNINEADESTINATAIRE" ,length = 11)
    private java.lang.String dlppNineaDestinataire;
	@Column(name = "DLPPPPMEXPEDITEUR" ,length = 5)
    private java.lang.String dlppPpmExpediteur;
	@Column(name = "DLPPDERNIERARTICLE")
    private java.lang.Integer dlppDernierArticle;
	@Column(name = "DLPPCODEDEPOT" ,length = 10)
    private java.lang.String dlppCodeDepot;
	@Column(name = "DLLPPDATELIVRAISON")
    private java.sql.Date dllppDateLivraison;
	@Column(name = "DLPPDELAILIVRAISON")
    private java.lang.Integer dlppDelaiLivraison;
	@Column(name = "DLLPPCODEBAC" ,length = 10)
    private java.lang.String dllppCodeBac;
	@Column(name = "DLPPIMMATRVEHICULE" ,length = 17)
    private java.lang.String dlppImmatrVehicule;
	@Column(name = "DLPPMARQUEVEHICULE" ,length = 20)
    private java.lang.String dlppMarqueVehicule;
	@Column(name = "DLPPCODECONTRENTREPOSITAIRE" ,length = 7)
    private java.lang.String dlppCodeContrEntrepositaire;
	@Column(name = "DLPPBPENTREPOSOTAIRE" ,length = 5)
    private java.lang.String dlppBpeEntreposotaire;
	@Column(name = "DLPPNOMVOIEENTREPOSITAIRE" ,length = 255)
    private java.lang.String dlppNomVoieEntrepositaire;
	@Column(name = "DLPPNINEAENTREPOSITAIRE" ,length = 11)
    private java.lang.String dlppNineaEntrepositaire;
	@Column(name = "DLPPNINEATRANSPORTEUR" ,length = 11)
	private java.lang.String dlppNineaTransporteur;
	@Column(name = "DLPPBPDECLARANT" ,length = 5)
    private java.lang.String dlppBpDeclarant;
	@Column(name = "DLPPQUARTIERDECLARANT" ,length = 50)
    private java.lang.String dlppQuartierDeclarant;
	@Column(name = "DLPPNOMVOIEDECLARANT" ,length = 60)
    private java.lang.String dlppNomVoieDeclarant;
	
    @OneToMany(targetEntity = BrouillonArticleDlpp.class, mappedBy = "brouillonSegGenDlpp")
    private List<BrouillonArticleDlpp> listeBrouillonArticleDlpp;
	/**
	 * 
	 */
	public BrouillonSegGenDlpp() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param dlppAnneeDlpp
	 * @param dlppCodePpmDeclarant
	 * @param dlppNumRepertoire
	 */
	public BrouillonSegGenDlpp(String dlppAnneeDlpp,
			String dlppCodePpmDeclarant, String dlppNumRepertoire) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
		this.dlppNumRepertoire = dlppNumRepertoire;
	}
	/**
	 * @return the dlppAnneeDlpp
	 */
	public java.lang.String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}
	/**
	 * @param dlppAnneeDlpp the dlppAnneeDlpp to set
	 */
	public void setDlppAnneeDlpp(java.lang.String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}
	/**
	 * @return the dlppCodePpmDeclarant
	 */
	public java.lang.String getDlppCodePpmDeclarant() {
		return dlppCodePpmDeclarant;
	}
	/**
	 * @param dlppCodePpmDeclarant the dlppCodePpmDeclarant to set
	 */
	public void setDlppCodePpmDeclarant(java.lang.String dlppCodePpmDeclarant) {
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
	}
	/**
	 * @return the dlppNumRepertoire
	 */
	public java.lang.String getDlppNumRepertoire() {
		return dlppNumRepertoire;
	}
	/**
	 * @param dlppNumRepertoire the dlppNumRepertoire to set
	 */
	public void setDlppNumRepertoire(java.lang.String dlppNumRepertoire) {
		this.dlppNumRepertoire = dlppNumRepertoire;
	}
	/**
	 * @return the dlppAnneeEnregManif
	 */
	public java.lang.String getDlppAnneeEnregManif() {
		return dlppAnneeEnregManif;
	}
	/**
	 * @param dlppAnneeEnregManif the dlppAnneeEnregManif to set
	 */
	public void setDlppAnneeEnregManif(java.lang.String dlppAnneeEnregManif) {
		this.dlppAnneeEnregManif = dlppAnneeEnregManif;
	}
	/**
	 * @return the dlppPpDestinataire
	 */
	public java.lang.String getDlppPpDestinataire() {
		return dlppPpDestinataire;
	}
	/**
	 * @param dlppPpDestinataire the dlppPpDestinataire to set
	 */
	public void setDlppPpDestinataire(java.lang.String dlppPpDestinataire) {
		this.dlppPpDestinataire = dlppPpDestinataire;
	}
	/**
	 * @return the dlppBurEnregManif
	 */
	public java.lang.String getDlppBurEnregManif() {
		return dlppBurEnregManif;
	}
	/**
	 * @param dlppBurEnregManif the dlppBurEnregManif to set
	 */
	public void setDlppBurEnregManif(java.lang.String dlppBurEnregManif) {
		this.dlppBurEnregManif = dlppBurEnregManif;
	}
	/**
	 * @return the dlppCodeAgree
	 */
	public java.lang.String getDlppCodeAgree() {
		return dlppCodeAgree;
	}
	/**
	 * @param dlppCodeAgree the dlppCodeAgree to set
	 */
	public void setDlppCodeAgree(java.lang.String dlppCodeAgree) {
		this.dlppCodeAgree = dlppCodeAgree;
	}
	/**
	 * @return the dlppCodeBureau
	 */
	public java.lang.String getDlppCodeBureau() {
		return dlppCodeBureau;
	}
	/**
	 * @param dlppCodeBureau the dlppCodeBureau to set
	 */
	public void setDlppCodeBureau(java.lang.String dlppCodeBureau) {
		this.dlppCodeBureau = dlppCodeBureau;
	}
	/**
	 * @return the dlppCodeContribDest
	 */
	public java.lang.String getDlppCodeContribDest() {
		return dlppCodeContribDest;
	}
	/**
	 * @param dlppCodeContribDest the dlppCodeContribDest to set
	 */
	public void setDlppCodeContribDest(java.lang.String dlppCodeContribDest) {
		this.dlppCodeContribDest = dlppCodeContribDest;
	}
	/**
	 * @return the dlppCodeCreditaire
	 */
	public java.lang.String getDlppCodeCreditaire() {
		return dlppCodeCreditaire;
	}
	/**
	 * @param dlppCodeCreditaire the dlppCodeCreditaire to set
	 */
	public void setDlppCodeCreditaire(java.lang.String dlppCodeCreditaire) {
		this.dlppCodeCreditaire = dlppCodeCreditaire;
	}
	/**
	 * @return the dlppCodeDestinataire
	 */
	public java.lang.String getDlppCodeDestinataire() {
		return dlppCodeDestinataire;
	}
	/**
	 * @param dlppCodeDestinataire the dlppCodeDestinataire to set
	 */
	public void setDlppCodeDestinataire(java.lang.String dlppCodeDestinataire) {
		this.dlppCodeDestinataire = dlppCodeDestinataire;
	}
	/**
	 * @return the dlppCodeEntrepositaire
	 */
	public java.lang.String getDlppCodeEntrepositaire() {
		return dlppCodeEntrepositaire;
	}
	/**
	 * @param dlppCodeEntrepositaire the dlppCodeEntrepositaire to set
	 */
	public void setDlppCodeEntrepositaire(java.lang.String dlppCodeEntrepositaire) {
		this.dlppCodeEntrepositaire = dlppCodeEntrepositaire;
	}
	/**
	 * @return the dlppCodeLieuStockage
	 */
	public java.lang.String getDlppCodeLieuStockage() {
		return dlppCodeLieuStockage;
	}
	/**
	 * @param dlppCodeLieuStockage the dlppCodeLieuStockage to set
	 */
	public void setDlppCodeLieuStockage(java.lang.String dlppCodeLieuStockage) {
		this.dlppCodeLieuStockage = dlppCodeLieuStockage;
	}
	/**
	 * @return the dlppPodepPaysProvenance
	 */
	public java.lang.String getDlppPodepPaysProvenance() {
		return dlppPodepPaysProvenance;
	}
	/**
	 * @param dlppPodepPaysProvenance the dlppPodepPaysProvenance to set
	 */
	public void setDlppPodepPaysProvenance(java.lang.String dlppPodepPaysProvenance) {
		this.dlppPodepPaysProvenance = dlppPodepPaysProvenance;
	}
	/**
	 * @return the dlppCodeTransporteur
	 */
	public java.lang.String getDlppCodeTransporteur() {
		return dlppCodeTransporteur;
	}
	/**
	 * @param dlppCodeTransporteur the dlppCodeTransporteur to set
	 */
	public void setDlppCodeTransporteur(java.lang.String dlppCodeTransporteur) {
		this.dlppCodeTransporteur = dlppCodeTransporteur;
	}
	/**
	 * @return the dlppDateModification
	 */
	public java.sql.Date getDlppDateModification() {
		return dlppDateModification;
	}
	/**
	 * @param dlppDateModification the dlppDateModification to set
	 */
	public void setDlppDateModification(java.sql.Date dlppDateModification) {
		this.dlppDateModification = dlppDateModification;
	}
	/**
	 * @return the dlppModeDeclaration
	 */
	public java.lang.String getDlppModeDeclaration() {
		return dlppModeDeclaration;
	}
	/**
	 * @param dlppModeDeclaration the dlppModeDeclaration to set
	 */
	public void setDlppModeDeclaration(java.lang.String dlppModeDeclaration) {
		this.dlppModeDeclaration = dlppModeDeclaration;
	}
	/**
	 * @return the dlppModeTransport
	 */
	public java.lang.String getDlppModeTransport() {
		return dlppModeTransport;
	}
	/**
	 * @param dlppModeTransport the dlppModeTransport to set
	 */
	public void setDlppModeTransport(java.lang.String dlppModeTransport) {
		this.dlppModeTransport = dlppModeTransport;
	}
	/**
	 * @return the dlppMoyenTransport
	 */
	public java.lang.String getDlppMoyenTransport() {
		return dlppMoyenTransport;
	}
	/**
	 * @param dlppMoyenTransport the dlppMoyenTransport to set
	 */
	public void setDlppMoyenTransport(java.lang.String dlppMoyenTransport) {
		this.dlppMoyenTransport = dlppMoyenTransport;
	}
	/**
	 * @return the dlppNbreArticles
	 */
	public java.lang.Integer getDlppNbreArticles() {
		return dlppNbreArticles;
	}
	/**
	 * @param dlppNbreArticles the dlppNbreArticles to set
	 */
	public void setDlppNbreArticles(java.lang.Integer dlppNbreArticles) {
		this.dlppNbreArticles = dlppNbreArticles;
	}
	/**
	 * @return the dlppNomDeclarant
	 */
	public java.lang.String getDlppNomDeclarant() {
		return dlppNomDeclarant;
	}
	/**
	 * @param dlppNomDeclarant the dlppNomDeclarant to set
	 */
	public void setDlppNomDeclarant(java.lang.String dlppNomDeclarant) {
		this.dlppNomDeclarant = dlppNomDeclarant;
	}
	/**
	 * @return the dlppNomDestinataire
	 */
	public java.lang.String getDlppNomDestinataire() {
		return dlppNomDestinataire;
	}
	/**
	 * @param dlppNomDestinataire the dlppNomDestinataire to set
	 */
	public void setDlppNomDestinataire(java.lang.String dlppNomDestinataire) {
		this.dlppNomDestinataire = dlppNomDestinataire;
	}
	/**
	 * @return the dlppNomTransporteur
	 */
	public java.lang.String getDlppNomTransporteur() {
		return dlppNomTransporteur;
	}
	/**
	 * @param dlppNomTransporteur the dlppNomTransporteur to set
	 */
	public void setDlppNomTransporteur(java.lang.String dlppNomTransporteur) {
		this.dlppNomTransporteur = dlppNomTransporteur;
	}
	/**
	 * @return the dlppNomEntrepositaire
	 */
	public java.lang.String getDlppNomEntrepositaire() {
		return dlppNomEntrepositaire;
	}
	/**
	 * @param dlppNomEntrepositaire the dlppNomEntrepositaire to set
	 */
	public void setDlppNomEntrepositaire(java.lang.String dlppNomEntrepositaire) {
		this.dlppNomEntrepositaire = dlppNomEntrepositaire;
	}
	/**
	 * @return the dlppNomTanker
	 */
	public java.lang.String getDlppNomTanker() {
		return dlppNomTanker;
	}
	/**
	 * @param dlppNomTanker the dlppNomTanker to set
	 */
	public void setDlppNomTanker(java.lang.String dlppNomTanker) {
		this.dlppNomTanker = dlppNomTanker;
	}
	/**
	 * @return the dlppNomVoieDestinataire
	 */
	public java.lang.String getDlppNomVoieDestinataire() {
		return dlppNomVoieDestinataire;
	}
	/**
	 * @param dlppNomVoieDestinataire the dlppNomVoieDestinataire to set
	 */
	public void setDlppNomVoieDestinataire(java.lang.String dlppNomVoieDestinataire) {
		this.dlppNomVoieDestinataire = dlppNomVoieDestinataire;
	}
	/**
	 * @return the dlppNomVoieTransporteur
	 */
	public java.lang.String getDlppNomVoieTransporteur() {
		return dlppNomVoieTransporteur;
	}
	/**
	 * @param dlppNomVoieTransporteur the dlppNomVoieTransporteur to set
	 */
	public void setDlppNomVoieTransporteur(java.lang.String dlppNomVoieTransporteur) {
		this.dlppNomVoieTransporteur = dlppNomVoieTransporteur;
	}
	/**
	 * @return the dlppNumEnregManif
	 */
	public java.lang.Integer getDlppNumEnregManif() {
		return dlppNumEnregManif;
	}
	/**
	 * @param dlppNumEnregManif the dlppNumEnregManif to set
	 */
	public void setDlppNumEnregManif(java.lang.Integer dlppNumEnregManif) {
		this.dlppNumEnregManif = dlppNumEnregManif;
	}
	/**
	 * @return the dlppNumVoieDestinataire
	 */
	public java.lang.String getDlppNumVoieDestinataire() {
		return dlppNumVoieDestinataire;
	}
	/**
	 * @param dlppNumVoieDestinataire the dlppNumVoieDestinataire to set
	 */
	public void setDlppNumVoieDestinataire(java.lang.String dlppNumVoieDestinataire) {
		this.dlppNumVoieDestinataire = dlppNumVoieDestinataire;
	}
	/**
	 * @return the dlppNumVoieEntrepositaire
	 */
	public java.lang.String getDlppNumVoieEntrepositaire() {
		return dlppNumVoieEntrepositaire;
	}
	/**
	 * @param dlppNumVoieEntrepositaire the dlppNumVoieEntrepositaire to set
	 */
	public void setDlppNumVoieEntrepositaire(
			java.lang.String dlppNumVoieEntrepositaire) {
		this.dlppNumVoieEntrepositaire = dlppNumVoieEntrepositaire;
	}
	/**
	 * @return the dlppNumVoieTransporteur
	 */
	public java.lang.String getDlppNumVoieTransporteur() {
		return dlppNumVoieTransporteur;
	}
	/**
	 * @param dlppNumVoieTransporteur the dlppNumVoieTransporteur to set
	 */
	public void setDlppNumVoieTransporteur(java.lang.String dlppNumVoieTransporteur) {
		this.dlppNumVoieTransporteur = dlppNumVoieTransporteur;
	}
	/**
	 * @return the dlppPaysDestination
	 */
	public java.lang.String getDlppPaysDestination() {
		return dlppPaysDestination;
	}
	/**
	 * @param dlppPaysDestination the dlppPaysDestination to set
	 */
	public void setDlppPaysDestination(java.lang.String dlppPaysDestination) {
		this.dlppPaysDestination = dlppPaysDestination;
	}
	/**
	 * @return the dlppQuartierDestinataire
	 */
	public java.lang.String getDlppQuartierDestinataire() {
		return dlppQuartierDestinataire;
	}
	/**
	 * @param dlppQuartierDestinataire the dlppQuartierDestinataire to set
	 */
	public void setDlppQuartierDestinataire(
			java.lang.String dlppQuartierDestinataire) {
		this.dlppQuartierDestinataire = dlppQuartierDestinataire;
	}
	/**
	 * @return the dlppQuartierEntrepositaire
	 */
	public java.lang.String getDlppQuartierEntrepositaire() {
		return dlppQuartierEntrepositaire;
	}
	/**
	 * @param dlppQuartierEntrepositaire the dlppQuartierEntrepositaire to set
	 */
	public void setDlppQuartierEntrepositaire(
			java.lang.String dlppQuartierEntrepositaire) {
		this.dlppQuartierEntrepositaire = dlppQuartierEntrepositaire;
	}
	/**
	 * @return the dlppRefDeclarant
	 */
	public java.lang.String getDlppRefDeclarant() {
		return dlppRefDeclarant;
	}
	/**
	 * @param dlppRefDeclarant the dlppRefDeclarant to set
	 */
	public void setDlppRefDeclarant(java.lang.String dlppRefDeclarant) {
		this.dlppRefDeclarant = dlppRefDeclarant;
	}
	/**
	 * @return the dlppRegimeDouanier
	 */
	public java.lang.String getDlppRegimeDouanier() {
		return dlppRegimeDouanier;
	}
	/**
	 * @param dlppRegimeDouanier the dlppRegimeDouanier to set
	 */
	public void setDlppRegimeDouanier(java.lang.String dlppRegimeDouanier) {
		this.dlppRegimeDouanier = dlppRegimeDouanier;
	}
	/**
	 * @return the dlppTitreDeclarant
	 */
	public java.lang.String getDlppTitreDeclarant() {
		return dlppTitreDeclarant;
	}
	/**
	 * @param dlppTitreDeclarant the dlppTitreDeclarant to set
	 */
	public void setDlppTitreDeclarant(java.lang.String dlppTitreDeclarant) {
		this.dlppTitreDeclarant = dlppTitreDeclarant;
	}
	/**
	 * @return the dlppTitreDestinataire
	 */
	public java.lang.String getDlppTitreDestinataire() {
		return dlppTitreDestinataire;
	}
	/**
	 * @param dlppTitreDestinataire the dlppTitreDestinataire to set
	 */
	public void setDlppTitreDestinataire(java.lang.String dlppTitreDestinataire) {
		this.dlppTitreDestinataire = dlppTitreDestinataire;
	}
	/**
	 * @return the dlppTypeApurement
	 */
	public java.lang.String getDlppTypeApurement() {
		return dlppTypeApurement;
	}
	/**
	 * @param dlppTypeApurement the dlppTypeApurement to set
	 */
	public void setDlppTypeApurement(java.lang.String dlppTypeApurement) {
		this.dlppTypeApurement = dlppTypeApurement;
	}
	/**
	 * @return the dlppTypeRegime
	 */
	public java.lang.String getDlppTypeRegime() {
		return dlppTypeRegime;
	}
	/**
	 * @param dlppTypeRegime the dlppTypeRegime to set
	 */
	public void setDlppTypeRegime(java.lang.String dlppTypeRegime) {
		this.dlppTypeRegime = dlppTypeRegime;
	}
	/**
	 * @return the dlppTypeVoieDeclarant
	 */
	public java.lang.String getDlppTypeVoieDeclarant() {
		return dlppTypeVoieDeclarant;
	}
	/**
	 * @param dlppTypeVoieDeclarant the dlppTypeVoieDeclarant to set
	 */
	public void setDlppTypeVoieDeclarant(java.lang.String dlppTypeVoieDeclarant) {
		this.dlppTypeVoieDeclarant = dlppTypeVoieDeclarant;
	}
	/**
	 * @return the dlppTypeVoieDestinataire
	 */
	public java.lang.String getDlppTypeVoieDestinataire() {
		return dlppTypeVoieDestinataire;
	}
	/**
	 * @param dlppTypeVoieDestinataire the dlppTypeVoieDestinataire to set
	 */
	public void setDlppTypeVoieDestinataire(
			java.lang.String dlppTypeVoieDestinataire) {
		this.dlppTypeVoieDestinataire = dlppTypeVoieDestinataire;
	}
	/**
	 * @return the dlppTypeVoieEntrepositaire
	 */
	public java.lang.String getDlppTypeVoieEntrepositaire() {
		return dlppTypeVoieEntrepositaire;
	}
	/**
	 * @param dlppTypeVoieEntrepositaire the dlppTypeVoieEntrepositaire to set
	 */
	public void setDlppTypeVoieEntrepositaire(
			java.lang.String dlppTypeVoieEntrepositaire) {
		this.dlppTypeVoieEntrepositaire = dlppTypeVoieEntrepositaire;
	}
	/**
	 * @return the dlppTypeVoieTransporteur
	 */
	public java.lang.String getDlppTypeVoieTransporteur() {
		return dlppTypeVoieTransporteur;
	}
	/**
	 * @param dlppTypeVoieTransporteur the dlppTypeVoieTransporteur to set
	 */
	public void setDlppTypeVoieTransporteur(
			java.lang.String dlppTypeVoieTransporteur) {
		this.dlppTypeVoieTransporteur = dlppTypeVoieTransporteur;
	}
	/**
	 * @return the dlppVilleDeclarant
	 */
	public java.lang.String getDlppVilleDeclarant() {
		return dlppVilleDeclarant;
	}
	/**
	 * @param dlppVilleDeclarant the dlppVilleDeclarant to set
	 */
	public void setDlppVilleDeclarant(java.lang.String dlppVilleDeclarant) {
		this.dlppVilleDeclarant = dlppVilleDeclarant;
	}
	/**
	 * @return the dlppVilleDestinataire
	 */
	public java.lang.String getDlppVilleDestinataire() {
		return dlppVilleDestinataire;
	}
	/**
	 * @param dlppVilleDestinataire the dlppVilleDestinataire to set
	 */
	public void setDlppVilleDestinataire(java.lang.String dlppVilleDestinataire) {
		this.dlppVilleDestinataire = dlppVilleDestinataire;
	}
	/**
	 * @return the dlppVilleTransporteur
	 */
	public java.lang.String getDlppVilleTransporteur() {
		return dlppVilleTransporteur;
	}
	/**
	 * @param dlppVilleTransporteur the dlppVilleTransporteur to set
	 */
	public void setDlppVilleTransporteur(java.lang.String dlppVilleTransporteur) {
		this.dlppVilleTransporteur = dlppVilleTransporteur;
	}
	/**
	 * @return the dlppVilleEntrepositaire
	 */
	public java.lang.String getDlppVilleEntrepositaire() {
		return dlppVilleEntrepositaire;
	}
	/**
	 * @param dlppVilleEntrepositaire the dlppVilleEntrepositaire to set
	 */
	public void setDlppVilleEntrepositaire(java.lang.String dlppVilleEntrepositaire) {
		this.dlppVilleEntrepositaire = dlppVilleEntrepositaire;
	}
	/**
	 * @return the dlppDateCreation
	 */
	public java.sql.Date getDlppDateCreation() {
		return dlppDateCreation;
	}
	/**
	 * @param dlppDateCreation the dlppDateCreation to set
	 */
	public void setDlppDateCreation(java.sql.Date dlppDateCreation) {
		this.dlppDateCreation = dlppDateCreation;
	}
	/**
	 * @return the dlppNineaDestinataire
	 */
	public java.lang.String getDlppNineaDestinataire() {
		return dlppNineaDestinataire;
	}
	/**
	 * @param dlppNineaDestinataire the dlppNineaDestinataire to set
	 */
	public void setDlppNineaDestinataire(java.lang.String dlppNineaDestinataire) {
		this.dlppNineaDestinataire = dlppNineaDestinataire;
	}
	/**
	 * @return the dlppPpmExpediteur
	 */
	public java.lang.String getDlppPpmExpediteur() {
		return dlppPpmExpediteur;
	}
	/**
	 * @param dlppPpmExpediteur the dlppPpmExpediteur to set
	 */
	public void setDlppPpmExpediteur(java.lang.String dlppPpmExpediteur) {
		this.dlppPpmExpediteur = dlppPpmExpediteur;
	}
	/**
	 * @return the dlppDernierArticle
	 */
	public java.lang.Integer getDlppDernierArticle() {
		return dlppDernierArticle;
	}
	/**
	 * @param dlppDernierArticle the dlppDernierArticle to set
	 */
	public void setDlppDernierArticle(java.lang.Integer dlppDernierArticle) {
		this.dlppDernierArticle = dlppDernierArticle;
	}
	/**
	 * @return the dlppCodeDepot
	 */
	public java.lang.String getDlppCodeDepot() {
		return dlppCodeDepot;
	}
	/**
	 * @param dlppCodeDepot the dlppCodeDepot to set
	 */
	public void setDlppCodeDepot(java.lang.String dlppCodeDepot) {
		this.dlppCodeDepot = dlppCodeDepot;
	}
	/**
	 * @return the dllppDateLivraison
	 */
	public java.sql.Date getDllppDateLivraison() {
		return dllppDateLivraison;
	}
	/**
	 * @param dllppDateLivraison the dllppDateLivraison to set
	 */
	public void setDllppDateLivraison(java.sql.Date dllppDateLivraison) {
		this.dllppDateLivraison = dllppDateLivraison;
	}
	/**
	 * @return the dlppDelaiLivraison
	 */
	public java.lang.Integer getDlppDelaiLivraison() {
		return dlppDelaiLivraison;
	}
	/**
	 * @param dlppDelaiLivraison the dlppDelaiLivraison to set
	 */
	public void setDlppDelaiLivraison(java.lang.Integer dlppDelaiLivraison) {
		this.dlppDelaiLivraison = dlppDelaiLivraison;
	}
	/**
	 * @return the dllppCodeBac
	 */
	public java.lang.String getDllppCodeBac() {
		return dllppCodeBac;
	}
	/**
	 * @param dllppCodeBac the dllppCodeBac to set
	 */
	public void setDllppCodeBac(java.lang.String dllppCodeBac) {
		this.dllppCodeBac = dllppCodeBac;
	}
	/**
	 * @return the dlppImmatrVehicule
	 */
	public java.lang.String getDlppImmatrVehicule() {
		return dlppImmatrVehicule;
	}
	/**
	 * @param dlppImmatrVehicule the dlppImmatrVehicule to set
	 */
	public void setDlppImmatrVehicule(java.lang.String dlppImmatrVehicule) {
		this.dlppImmatrVehicule = dlppImmatrVehicule;
	}
	/**
	 * @return the dlppMarqueVehicule
	 */
	public java.lang.String getDlppMarqueVehicule() {
		return dlppMarqueVehicule;
	}
	/**
	 * @param dlppMarqueVehicule the dlppMarqueVehicule to set
	 */
	public void setDlppMarqueVehicule(java.lang.String dlppMarqueVehicule) {
		this.dlppMarqueVehicule = dlppMarqueVehicule;
	}
	/**
	 * @return the dlppCodeContrEntrepositaire
	 */
	public java.lang.String getDlppCodeContrEntrepositaire() {
		return dlppCodeContrEntrepositaire;
	}
	/**
	 * @param dlppCodeContrEntrepositaire the dlppCodeContrEntrepositaire to set
	 */
	public void setDlppCodeContrEntrepositaire(
			java.lang.String dlppCodeContrEntrepositaire) {
		this.dlppCodeContrEntrepositaire = dlppCodeContrEntrepositaire;
	}
	/**
	 * @return the dlppBpeEntreposotaire
	 */
	public java.lang.String getDlppBpeEntreposotaire() {
		return dlppBpeEntreposotaire;
	}
	/**
	 * @param dlppBpeEntreposotaire the dlppBpeEntreposotaire to set
	 */
	public void setDlppBpeEntreposotaire(java.lang.String dlppBpeEntreposotaire) {
		this.dlppBpeEntreposotaire = dlppBpeEntreposotaire;
	}
	/**
	 * @return the dlppNomVoieEntrepositaire
	 */
	public java.lang.String getDlppNomVoieEntrepositaire() {
		return dlppNomVoieEntrepositaire;
	}
	/**
	 * @param dlppNomVoieEntrepositaire the dlppNomVoieEntrepositaire to set
	 */
	public void setDlppNomVoieEntrepositaire(
			java.lang.String dlppNomVoieEntrepositaire) {
		this.dlppNomVoieEntrepositaire = dlppNomVoieEntrepositaire;
	}
	/**
	 * @return the dlppNineaEntrepositaire
	 */
	public java.lang.String getDlppNineaEntrepositaire() {
		return dlppNineaEntrepositaire;
	}
	/**
	 * @param dlppNineaEntrepositaire the dlppNineaEntrepositaire to set
	 */
	public void setDlppNineaEntrepositaire(java.lang.String dlppNineaEntrepositaire) {
		this.dlppNineaEntrepositaire = dlppNineaEntrepositaire;
	}
	/**
	 * @return the dlppNineaTransporteur
	 */
	public java.lang.String getDlppNineaTransporteur() {
		return dlppNineaTransporteur;
	}
	/**
	 * @param dlppNineaTransporteur the dlppNineaTransporteur to set
	 */
	public void setDlppNineaTransporteur(java.lang.String dlppNineaTransporteur) {
		this.dlppNineaTransporteur = dlppNineaTransporteur;
	}
	/**
	 * @return the dlppBpDeclarant
	 */
	public java.lang.String getDlppBpDeclarant() {
		return dlppBpDeclarant;
	}
	/**
	 * @param dlppBpDeclarant the dlppBpDeclarant to set
	 */
	public void setDlppBpDeclarant(java.lang.String dlppBpDeclarant) {
		this.dlppBpDeclarant = dlppBpDeclarant;
	}
	/**
	 * @return the dlppQuartierDeclarant
	 */
	public java.lang.String getDlppQuartierDeclarant() {
		return dlppQuartierDeclarant;
	}
	/**
	 * @param dlppQuartierDeclarant the dlppQuartierDeclarant to set
	 */
	public void setDlppQuartierDeclarant(java.lang.String dlppQuartierDeclarant) {
		this.dlppQuartierDeclarant = dlppQuartierDeclarant;
	}
	/**
	 * @return the dlppNomVoieDeclarant
	 */
	public java.lang.String getDlppNomVoieDeclarant() {
		return dlppNomVoieDeclarant;
	}
	/**
	 * @param dlppNomVoieDeclarant the dlppNomVoieDeclarant to set
	 */
	public void setDlppNomVoieDeclarant(java.lang.String dlppNomVoieDeclarant) {
		this.dlppNomVoieDeclarant = dlppNomVoieDeclarant;
	}
	/**
	 * @return the listeBrouillonArticleDlpp
	 */
	public List<BrouillonArticleDlpp> getListeBrouillonArticleDlpp() {
		return listeBrouillonArticleDlpp;
	}
	/**
	 * @param listeBrouillonArticleDlpp the listeBrouillonArticleDlpp to set
	 */
	public void setListeBrouillonArticleDlpp(
			List<BrouillonArticleDlpp> listeBrouillonArticleDlpp) {
		this.listeBrouillonArticleDlpp = listeBrouillonArticleDlpp;
	}
	
    
    
}
