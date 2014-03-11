package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SegGenDlppKey;

/**
 * Bean implementation class for Enterprise Bean: Seggendlpp
 */
@Entity()
@IdClass(SegGenDlppKey.class)
@Table(name = "SEGGENDLPP")
public class SegGenDlpp implements Serializable {
	
	private static final long serialVersionUID = 4294196908950216854L;

	@Id @Column(name = "DLPPANNEEDLPP", length = 4, nullable = false)
    private String dlppAnneeDlpp;
	
	@Id @Column(name = "DLPPCODEBUREAU",length = 3, nullable = false)
    private String dlppCodeBureau;
	
	@Id @Column(name = "DLPPNUMDLPP",nullable = false)
    private Integer dlppNumDlpp;
	
	@Column(name = "DLPPCODEPPMDECLARANT", length = 5, nullable = false)
    private String dlppCodePpmDeclarant;
	
	@Column(name = "DLPPNUMREPERTOIRE", length = 6, nullable = false)
    private String dlppNumRepertoire;
	
	@Column(name = "DLPPANNEEENREGMANIF", length = 4)
    private String dlppAnneeEnregManif;
	
	@Column(name = "DLPPBPDESTINATAIRE", length = 5)
    private String dlppBpDestinataire;
	
	@Column(name = "DLPPBURENREGMANIF", length = 3)
    private String dlppBurEnregManif;
	
	@Column(name = "DLPPCODEAGREE", length = 3)
    private String dlppCodeAgree;
	
	@Column(name = "DLPPCODECONTRIBDEST", length = 7)
    private String dlppCodeContribDest;
	
	@Column(name = "DLPPCODECREDITAIRE", length = 3)
    private String dlppCodeCreditaire;
	
	@Column(name = "DLPPCODEDESTINATAIRE", length = 5)
    private String dlppCodeDestinataire;
	
	@Column(name = "DLPPCODEENTREPOSITAIRE", length = 5)
    private String dlppCodeEntRepositaire;
	
	@Column(name = "DLPPCODELIEUSTOCKAGE", length = 3)
    private String dlppCodeLieuStockage;
	
	@Column(name = "DLPPCODEPAYSPROVENANCE", length = 3)
    private String dlppCodePaysProvenance;
	
	@Column(name = "DLPPCODETRANSPORTEUR", length = 5)
    private String dlppCodeTransporteur;
	
	@Column(name = "DLPPDATEMODIFICATION")
    private Date dlppDateModification;
	
	@Column(name = "DLPPMODEDECLARATION", length = 4)
    private String dlppModeDeclaration;
	
	@Column(name = "DLPPMODETRANSPORT", length = 2)
    private String dlppModeTransport;
	
	@Column(name = "DLPPMOYENTRANSPORT", length = 255)
    private String dlppMoyenTransport;
	
	@Column(name = "DLPPNBREARTICLES")
    private Integer dlppNbreArticles;
	
	@Column(name = "DLPPNOMDECLARANT", length = 255)
    private String dlppNomDeclarant;
	
	@Column(name = "DLPPNOMDESTINATAIRE", length = 255)
    private String dlppNomDestinataire;
	
	@Column(name = "DLPPNOMTRANSPORTEUR", length = 255)
    private String dlppNomTransporteur;
	
	@Column(name = "DLPPNOMENTREPOSITAIRE", length = 255)
    private String dlppNomEntRepositaire;
	
	@Column(name = "DLPPNOMTANKER", length = 255)
    private String dlppNomTanker;
	
	@Column(name = "DLPPNOMVOIEDESTINATAIRE", length = 60)
    private String dlppNomVoieDestinataire;
	
	@Column(name = "DLPPNOMVOIETRANSPORTEUR", length = 60)
    private String dlppNomVoieTransporteur;
	
	@Column(name = "DLPPNUMENREGMANIF")
    private Integer dlppNumEnregManif;
	
	@Column(name = "DLPPNUMVOIEDESTINATAIRE", length = 5)
    private String dlppNumVoieDestinataire;
	
	@Column(name = "DLPPNUMVOIEENTREPOSITAIRE", length = 5)
    private String dlppNumVoieEntRepositaire;
	
	@Column(name = "DLPPNUMVOIETRANSPORTEUR", length = 5)
    private String dlppNumVoieTransporteur;
	
	@Column(name = "DLPPPAYSDESTINATION", length = 3)
    private String dlppPaysDestination;
	
	@Column(name = "DLPPQUARTIERDESTINATAIRE", length = 60)
    private String dlppQuartierDestinataire;
	
	@Column(name = "DLPPQUARTIERENTREPOSITAIRE", length = 50)
    private String dlppQuartierEntRepositaire;
	
	@Column(name = "DLPPQUARTIERTRANSPORTEUR", length = 50)
    private String dlppQuartierTransporteur;
	
	@Column(name = "DLPPREFDECLARANT", length = 30)
    private String dlppRefDeclarant;
	
	@Column(name = "DLPPREGIMEDOUANIER", length = 2)
    private String dlppRegimeDouanier;
	
	@Column(name = "DLPPTITREDECLARANT", length = 3)
    private String dlppTitreDeclarant;
	
	@Column(name = "DLPPTITREDESTINATAIRE", length = 3)
    private String dlppTitreDestinataire;
	
	@Column(name = "DLPPTYPEAPUREMENT", length = 1)
    private String dlppTypeApurement;
	
	@Column(name = "DLPPTYPEREGIME", length = 1)
    private String dlppTypeRegime;
	
	@Column(name = "DLPPTYPEVOIEDECLARANT", length = 5)
    private String dlppTypeVoieDeclarant;
	
	@Column(name = "DLPPTYPEVOIEDESTINATAIRE", length = 5)
    private String dlppTypeVoieDestinataire;
	
	@Column(name = "DLPPTYPEVOIEENTREPOSITAIRE", length = 5)
    private String dlppTypeVoieEntRepositaire;
	
	@Column(name = "DLPPTYPEVOIETRANSPORTEUR", length = 5)
    private String dlppTypeVoieTransporteur;
	
	@Column(name = "DLPPVILLEDECLARANT", length = 50)
    private String dlppVilleDeclarant;
	
	@Column(name = "DLPPVILLEDESTINATAIRE", length = 50)
    private String dlppVilleDestinataire;
	
	@Column(name = "DLPPVILLETRANSPORTEUR", length = 50)
    private String dlppVilleTransporteur;
	
	@Column(name = "DLPPVILLEENTREPOSITAIRE", length = 50)
    private String dlppVilleEntRepositaire;
	
	@Column(name = "DLPPDATECREATION")
    private Date dlppDateCreation;
	
	@Column(name = "DLPPNINEADESTINATAIRE", length = 11)
    private String dlppNineaDestinataire;
	
	@Column(name = "DLPPPPMEXPEDITEUR", length = 5)
    private String dlppPpmExpediteur;
	
	@Column(name = "DLPPDERNIERARTICLE")
    private Integer dlppDernierArticle;
	
	@Column(name = "DLPPIMMATRVEHICULE", length = 17)
    private String dlppImmatrVehicule;
	
	@Column(name = "DLPPMARQUEVEHICULE", length = 20)
    private String dlppMarqueVehicule;
	
	@Column(name = "DLPPCODEAGENT", length = 5)
    private String dlppCodeAgent;
	
	@Column(name = "DLPPDATEVALIDATION")
    private Date dlppDateValidation;
    
    @OneToMany(mappedBy = "segGenDlpp", targetEntity = ArticleDlpp.class)
    private List<ArticleDlpp> articlesDlpp;

    public SegGenDlpp(String dlppAnneeDlpp, String dlppCodeBureau, Integer dlppNumDlpp,String dlppCodePpmDeclarant,  String dlppNumRepertoire) {
    	this.dlppAnneeDlpp = dlppAnneeDlpp;
    	this.dlppCodeBureau = dlppCodeBureau;
    	this.dlppNumDlpp = dlppNumDlpp;
    	this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
    	this.dlppNumRepertoire = dlppNumRepertoire;
    }
    
    public SegGenDlpp() {
    }
    
    public String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}

	public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}

	public String getDlppCodeBureau() {
		return dlppCodeBureau;
	}

	public void setDlppCodeBureau(String dlppCodeBureau) {
		this.dlppCodeBureau = dlppCodeBureau;
	}

	public Integer getDlppNumDlpp() {
		return dlppNumDlpp;
	}

	public void setDlppNumDlpp(Integer dlppNumDlpp) {
		this.dlppNumDlpp = dlppNumDlpp;
	}

	public String getDlppCodePpmDeclarant() {
		return dlppCodePpmDeclarant;
	}

	public void setDlppCodePpmDeclarant(String dlppCodePpmDeclarant) {
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
	}

	public String getDlppNumRepertoire() {
		return dlppNumRepertoire;
	}

	public void setDlppNumRepertoire(String dlppNumRepertoire) {
		this.dlppNumRepertoire = dlppNumRepertoire;
	}

	public String getDlppAnneeEnregManif() {
		return dlppAnneeEnregManif;
	}

	public void setDlppAnneeEnregManif(String dlppAnneeEnregManif) {
		this.dlppAnneeEnregManif = dlppAnneeEnregManif;
	}

	public String getDlppBpDestinataire() {
		return dlppBpDestinataire;
	}

	public void setDlppBpDestinataire(String dlppBpDestinataire) {
		this.dlppBpDestinataire = dlppBpDestinataire;
	}

	public String getDlppBurEnregManif() {
		return dlppBurEnregManif;
	}

	public void setDlppBurEnregManif(String dlppBurEnregManif) {
		this.dlppBurEnregManif = dlppBurEnregManif;
	}

	public String getDlppCodeAgree() {
		return dlppCodeAgree;
	}

	public void setDlppCodeAgree(String dlppCodeAgree) {
		this.dlppCodeAgree = dlppCodeAgree;
	}

	public String getDlppCodeContribDest() {
		return dlppCodeContribDest;
	}

	public void setDlppCodeContribDest(String dlppCodeContribDest) {
		this.dlppCodeContribDest = dlppCodeContribDest;
	}

	public String getDlppCodeCreditaire() {
		return dlppCodeCreditaire;
	}

	public void setDlppCodeCreditaire(String dlppCodeCreditaire) {
		this.dlppCodeCreditaire = dlppCodeCreditaire;
	}

	public String getDlppCodeDestinataire() {
		return dlppCodeDestinataire;
	}

	public void setDlppCodeDestinataire(String dlppCodeDestinataire) {
		this.dlppCodeDestinataire = dlppCodeDestinataire;
	}

	public String getDlppCodeEntRepositaire() {
		return dlppCodeEntRepositaire;
	}

	public void setDlppCodeEntRepositaire(String dlppCodeEntRepositaire) {
		this.dlppCodeEntRepositaire = dlppCodeEntRepositaire;
	}

	public String getDlppCodeLieuStockage() {
		return dlppCodeLieuStockage;
	}

	public void setDlppCodeLieuStockage(String dlppCodeLieuStockage) {
		this.dlppCodeLieuStockage = dlppCodeLieuStockage;
	}

	public String getDlppCodePaysProvenance() {
		return dlppCodePaysProvenance;
	}

	public void setDlppCodePaysProvenance(String dlppCodePaysProvenance) {
		this.dlppCodePaysProvenance = dlppCodePaysProvenance;
	}

	public String getDlppCodeTransporteur() {
		return dlppCodeTransporteur;
	}

	public void setDlppCodeTransporteur(String dlppCodeTransporteur) {
		this.dlppCodeTransporteur = dlppCodeTransporteur;
	}

	public Date getDlppDateModification() {
		return dlppDateModification;
	}

	public void setDlppDateModification(Date dlppDateModification) {
		this.dlppDateModification = dlppDateModification;
	}

	public String getDlppModeDeclaration() {
		return dlppModeDeclaration;
	}

	public void setDlppModeDeclaration(String dlppModeDeclaration) {
		this.dlppModeDeclaration = dlppModeDeclaration;
	}

	public String getDlppModeTransport() {
		return dlppModeTransport;
	}

	public void setDlppModeTransport(String dlppModeTransport) {
		this.dlppModeTransport = dlppModeTransport;
	}

	public String getDlppMoyenTransport() {
		return dlppMoyenTransport;
	}

	public void setDlppMoyenTransport(String dlppMoyenTransport) {
		this.dlppMoyenTransport = dlppMoyenTransport;
	}

	public Integer getDlppNbreArticles() {
		return dlppNbreArticles;
	}

	public void setDlppNbreArticles(Integer dlppNbreArticles) {
		this.dlppNbreArticles = dlppNbreArticles;
	}

	public String getDlppNomDeclarant() {
		return dlppNomDeclarant;
	}

	public void setDlppNomDeclarant(String dlppNomDeclarant) {
		this.dlppNomDeclarant = dlppNomDeclarant;
	}

	public String getDlppNomDestinataire() {
		return dlppNomDestinataire;
	}

	public void setDlppNomDestinataire(String dlppNomDestinataire) {
		this.dlppNomDestinataire = dlppNomDestinataire;
	}

	public String getDlppNomTransporteur() {
		return dlppNomTransporteur;
	}

	public void setDlppNomTransporteur(String dlppNomTransporteur) {
		this.dlppNomTransporteur = dlppNomTransporteur;
	}

	public String getDlppNomEntRepositaire() {
		return dlppNomEntRepositaire;
	}

	public void setDlppNomEntRepositaire(String dlppNomEntRepositaire) {
		this.dlppNomEntRepositaire = dlppNomEntRepositaire;
	}

	public String getDlppNomTanker() {
		return dlppNomTanker;
	}

	public void setDlppNomTanker(String dlppNomTanker) {
		this.dlppNomTanker = dlppNomTanker;
	}

	public String getDlppNomVoieDestinataire() {
		return dlppNomVoieDestinataire;
	}

	public void setDlppNomVoieDestinataire(String dlppNomVoieDestinataire) {
		this.dlppNomVoieDestinataire = dlppNomVoieDestinataire;
	}

	public String getDlppNomVoieTransporteur() {
		return dlppNomVoieTransporteur;
	}

	public void setDlppNomVoieTransporteur(String dlppNomVoieTransporteur) {
		this.dlppNomVoieTransporteur = dlppNomVoieTransporteur;
	}

	public Integer getDlppNumEnregManif() {
		return dlppNumEnregManif;
	}

	public void setDlppNumEnregManif(Integer dlppNumEnregManif) {
		this.dlppNumEnregManif = dlppNumEnregManif;
	}

	public String getDlppNumVoieDestinataire() {
		return dlppNumVoieDestinataire;
	}

	public void setDlppNumVoieDestinataire(String dlppNumVoieDestinataire) {
		this.dlppNumVoieDestinataire = dlppNumVoieDestinataire;
	}

	public String getDlppNumVoieEntRepositaire() {
		return dlppNumVoieEntRepositaire;
	}

	public void setDlppNumVoieEntRepositaire(String dlppNumVoieEntRepositaire) {
		this.dlppNumVoieEntRepositaire = dlppNumVoieEntRepositaire;
	}

	public String getDlppNumVoieTransporteur() {
		return dlppNumVoieTransporteur;
	}

	public void setDlppNumVoieTransporteur(String dlppNumVoieTransporteur) {
		this.dlppNumVoieTransporteur = dlppNumVoieTransporteur;
	}

	public String getDlppPaysDestination() {
		return dlppPaysDestination;
	}

	public void setDlppPaysDestination(String dlppPaysDestination) {
		this.dlppPaysDestination = dlppPaysDestination;
	}

	public String getDlppQuartierDestinataire() {
		return dlppQuartierDestinataire;
	}

	public void setDlppQuartierDestinataire(String dlppQuartierDestinataire) {
		this.dlppQuartierDestinataire = dlppQuartierDestinataire;
	}

	public String getDlppQuartierEntRepositaire() {
		return dlppQuartierEntRepositaire;
	}

	public void setDlppQuartierEntRepositaire(String dlppQuartierEntRepositaire) {
		this.dlppQuartierEntRepositaire = dlppQuartierEntRepositaire;
	}

	public String getDlppQuartierTransporteur() {
		return dlppQuartierTransporteur;
	}

	public void setDlppQuartierTransporteur(String dlppQuartierTransporteur) {
		this.dlppQuartierTransporteur = dlppQuartierTransporteur;
	}

	public String getDlppRefDeclarant() {
		return dlppRefDeclarant;
	}

	public void setDlppRefDeclarant(String dlppRefDeclarant) {
		this.dlppRefDeclarant = dlppRefDeclarant;
	}

	public String getDlppRegimeDouanier() {
		return dlppRegimeDouanier;
	}

	public void setDlppRegimeDouanier(String dlppRegimeDouanier) {
		this.dlppRegimeDouanier = dlppRegimeDouanier;
	}

	public String getDlppTitreDeclarant() {
		return dlppTitreDeclarant;
	}

	public void setDlppTitreDeclarant(String dlppTitreDeclarant) {
		this.dlppTitreDeclarant = dlppTitreDeclarant;
	}

	public String getDlppTitreDestinataire() {
		return dlppTitreDestinataire;
	}

	public void setDlppTitreDestinataire(String dlppTitreDestinataire) {
		this.dlppTitreDestinataire = dlppTitreDestinataire;
	}

	public String getDlppTypeApurement() {
		return dlppTypeApurement;
	}

	public void setDlppTypeApurement(String dlppTypeApurement) {
		this.dlppTypeApurement = dlppTypeApurement;
	}

	public String getDlppTypeRegime() {
		return dlppTypeRegime;
	}

	public void setDlppTypeRegime(String dlppTypeRegime) {
		this.dlppTypeRegime = dlppTypeRegime;
	}

	public String getDlppTypeVoieDeclarant() {
		return dlppTypeVoieDeclarant;
	}

	public void setDlppTypeVoieDeclarant(String dlppTypeVoieDeclarant) {
		this.dlppTypeVoieDeclarant = dlppTypeVoieDeclarant;
	}

	public String getDlppTypeVoieDestinataire() {
		return dlppTypeVoieDestinataire;
	}

	public void setDlppTypeVoieDestinataire(String dlppTypeVoieDestinataire) {
		this.dlppTypeVoieDestinataire = dlppTypeVoieDestinataire;
	}

	public String getDlppTypeVoieEntRepositaire() {
		return dlppTypeVoieEntRepositaire;
	}

	public void setDlppTypeVoieEntRepositaire(String dlppTypeVoieEntRepositaire) {
		this.dlppTypeVoieEntRepositaire = dlppTypeVoieEntRepositaire;
	}

	public String getDlppTypeVoieTransporteur() {
		return dlppTypeVoieTransporteur;
	}

	public void setDlppTypeVoieTransporteur(String dlppTypeVoieTransporteur) {
		this.dlppTypeVoieTransporteur = dlppTypeVoieTransporteur;
	}

	public String getDlppVilleDeclarant() {
		return dlppVilleDeclarant;
	}

	public void setDlppVilleDeclarant(String dlppVilleDeclarant) {
		this.dlppVilleDeclarant = dlppVilleDeclarant;
	}

	public String getDlppVilleDestinataire() {
		return dlppVilleDestinataire;
	}

	public void setDlppVilleDestinataire(String dlppVilleDestinataire) {
		this.dlppVilleDestinataire = dlppVilleDestinataire;
	}

	public String getDlppVilleTransporteur() {
		return dlppVilleTransporteur;
	}

	public void setDlppVilleTransporteur(String dlppVilleTransporteur) {
		this.dlppVilleTransporteur = dlppVilleTransporteur;
	}

	public String getDlppVilleEntRepositaire() {
		return dlppVilleEntRepositaire;
	}

	public void setDlppVilleEntRepositaire(String dlppVilleEntRepositaire) {
		this.dlppVilleEntRepositaire = dlppVilleEntRepositaire;
	}

	public Date getDlppDateCreation() {
		return dlppDateCreation;
	}

	public void setDlppDateCreation(Date dlppDateCreation) {
		this.dlppDateCreation = dlppDateCreation;
	}

	public String getDlppNineaDestinataire() {
		return dlppNineaDestinataire;
	}

	public void setDlppNineaDestinataire(String dlppNineaDestinataire) {
		this.dlppNineaDestinataire = dlppNineaDestinataire;
	}

	public String getDlppPpmExpediteur() {
		return dlppPpmExpediteur;
	}

	public void setDlppPpmExpediteur(String dlppPpmExpediteur) {
		this.dlppPpmExpediteur = dlppPpmExpediteur;
	}

	public Integer getDlppDernierArticle() {
		return dlppDernierArticle;
	}

	public void setDlppDernierArticle(Integer dlppDernierArticle) {
		this.dlppDernierArticle = dlppDernierArticle;
	}

	public String getDlppImmatrVehicule() {
		return dlppImmatrVehicule;
	}

	public void setDlppImmatrVehicule(String dlppImmatrVehicule) {
		this.dlppImmatrVehicule = dlppImmatrVehicule;
	}

	public String getDlppMarqueVehicule() {
		return dlppMarqueVehicule;
	}

	public void setDlppMarqueVehicule(String dlppMarqueVehicule) {
		this.dlppMarqueVehicule = dlppMarqueVehicule;
	}

	public String getDlppCodeAgent() {
		return dlppCodeAgent;
	}

	public void setDlppCodeAgent(String dlppCodeAgent) {
		this.dlppCodeAgent = dlppCodeAgent;
	}

	public Date getDlppDateValidation() {
		return dlppDateValidation;
	}

	public void setDlppDateValidation(Date dlppDateValidation) {
		this.dlppDateValidation = dlppDateValidation;
	}

	public List<ArticleDlpp> getArticlesDlpp() {
		return articlesDlpp;
	}

	public void setArticlesDlpp(List<ArticleDlpp> articlesDlpp) {
		this.articlesDlpp = articlesDlpp;
	}

//	/**
//	 * setSeggendlppVO
//	 */
//	public void setSeggendlppVO(SegGenDlppDto vo){
//		setDlppAnneeDlpp(vo.getDlppAnneeDlpp()); 
//		setDlppAnneeEnregManif(vo.getDlppAnneeEnregManif()); 
//		setDlppBpDestinataire(vo.getDlppBpDestinataire()); 
//		setDlppBurEnregManif(vo.getDlppBurEnregManif()); 
//		setDlppCodeAgree(vo.getDlppCodeAgree()); 
//		setDlppCodeBureau(vo.getDlppCodeBureau()); 
//		setDlppCodeContribDest(vo.getDlppCodeContribDest()); 
//		setDlppCodeCreditaire(vo.getDlppCodeCreditaire()); 
//		setDlppCodeDestinataire(vo.getDlppCodeDestinataire()); 
//		setDlppCodeEntRepositaire(vo.getDlppCodeEntRepositaire()); 
//		setDlppCodeLieuStockage(vo.getDlppCodeLieuStockage()); 
//		setDlppCodePaysProvenance(vo.getDlppCodePaysProvenance()); 
//		setDlppCodePpmDeclarant(vo.getDlppCodePpmDeclarant()); 
//		setDlppCodeTransporteur(vo.getDlppCodeTransporteur()); 
//		setDlppDateCreation(vo.getDlppDateCreation()); 
//		setDlppDateModification(vo.getDlppDateModification()); 
//		setDlppDernierArticle(vo.getDlppDernierArticle()); 
//		setDlppImmatrVehicule(vo.getDlppImmatrVehicule()); 
//		setDlppMarqueVehicule(vo.getDlppMarqueVehicule()); 
//		setDlppModeDeclaration(vo.getDlppModeDeclaration()); 
//		setDlppModeTransport(vo.getDlppModeTransport()); 
//		setDlppMoyenTransport(vo.getDlppMoyenTransport()); 
//		setDlppNbreArticles(vo.getDlppNbreArticles()); 
//		setDlppNineaDestinataire(vo.getDlppNineaDestinataire()); 
//		setDlppNomDeclarant(vo.getDlppNomDeclarant()); 
//		setDlppNomDestinataire(vo.getDlppNomDestinataire()); 
//		setDlppNomEntRepositaire(vo.getDlppNomEntRepositaire()); 
//		setDlppNomTanker(vo.getDlppNomTanker()); 
//		setDlppNomTransporteur(vo.getDlppNomTransporteur()); 
//		setDlppNomVoieDestinataire(vo.getDlppNomVoieDestinataire()); 
//		setDlppNomVoieTransporteur(vo.getDlppNomVoieTransporteur()); 
//		setDlppNumDlpp(vo.getDlppNumDlpp()); 
//		setDlppNumEnregManif(vo.getDlppNumEnregManif()); 
//		setDlppNumRepertoire(vo.getDlppNumRepertoire()); 
//		setDlppNumVoieDestinataire(vo.getDlppNumVoieDestinataire()); 
//		setDlppNumVoieEntRepositaire(vo.getDlppNumVoieEntRepositaire()); 
//		setDlppNumVoieTransporteur(vo.getDlppNumVoieTransporteur()); 
//		setDlppPaysDestination(vo.getDlppPaysDestination()); 
//		setDlppPpmExpediteur(vo.getDlppPpmExpediteur()); 
//		setDlppQuartierDestinataire(vo.getDlppQuartierDestinataire()); 
//		setDlppQuartierEntRepositaire(vo.getDlppQuartierEntRepositaire()); 
//		setDlppQuartierTransporteur(vo.getDlppQuartierTransporteur()); 
//		setDlppRefDeclarant(vo.getDlppRefDeclarant()); 
//		setDlppRegimeDouanier(vo.getDlppRegimeDouanier()); 
//		setDlppTitreDeclarant(vo.getDlppTitreDeclarant()); 
//		setDlppTitreDestinataire(vo.getDlppTitreDestinataire()); 
//		setDlppTypeApurement(vo.getDlppTypeApurement()); 
//		setDlppTypeRegime(vo.getDlppTypeRegime()); 
//		setDlppTypeVoieDeclarant(vo.getDlppTypeVoieDeclarant()); 
//		setDlppTypeVoieDestinataire(vo.getDlppTypeVoieDestinataire()); 
//		setDlppTypeVoieEntRepositaire(vo.getDlppTypeVoieEntRepositaire()); 
//		setDlppTypeVoieTransporteur(vo.getDlppTypeVoieTransporteur()); 
//		setDlppVilleDeclarant(vo.getDlppVilleDeclarant()); 
//		setDlppVilleDestinataire(vo.getDlppVilleDestinataire()); 
//		setDlppVilleEntRepositaire(vo.getDlppVilleEntRepositaire()); 
//		setDlppVilleTransporteur(vo.getDlppVilleTransporteur()); 
//		setDlppCodeAgent(vo.getDlppCodeAgent());
//		setDlppDateValidation(vo.getDlppDateValidation());
//	}
//
//	public SegGenDlppDto getSeggendlppVO(){
//	 	SegGenDlppDto vo=new SegGenDlppDto();
//	 vo.setDlppAnneeDlpp(getDlppAnneeDlpp());
//	 vo.setDlppCodeBureau(getDlppCodeBureau());
//	 vo.setDlppNumDlpp(getDlppNumDlpp());
//	 	vo.setDlppAnneeDlpp(getDlppAnneeDlpp());
//	 	vo.setDlppAnneeEnregManif(getDlppAnneeEnregManif());
//	 	vo.setDlppBpDestinataire(getDlppBpDestinataire());
//	 	vo.setDlppBurEnregManif(getDlppBurEnregManif());
//	 	vo.setDlppCodeAgree(getDlppCodeAgree());
//	 	vo.setDlppCodeBureau(getDlppCodeBureau());
//	 	vo.setDlppCodeContribDest(getDlppCodeContribDest());
//	 	vo.setDlppCodeCreditaire(getDlppCodeCreditaire());
//	 	vo.setDlppCodeDestinataire(getDlppCodeDestinataire());
//	 	vo.setDlppCodeEntRepositaire(getDlppCodeEntRepositaire());
//	 	vo.setDlppCodeLieuStockage(getDlppCodeLieuStockage());
//	 	vo.setDlppCodePaysProvenance(getDlppCodePaysProvenance());
//	 	vo.setDlppCodePpmDeclarant(getDlppCodePpmDeclarant());
//	 	vo.setDlppCodeTransporteur(getDlppCodeTransporteur());
//	 	vo.setDlppDateCreation(getDlppDateCreation());
//	 	vo.setDlppDateModification(getDlppDateModification());
//	 	vo.setDlppDernierArticle(getDlppDernierArticle());
//	 	vo.setDlppImmatrVehicule(getDlppImmatrVehicule());
//	 	vo.setDlppMarqueVehicule(getDlppMarqueVehicule());
//	 	vo.setDlppModeDeclaration(getDlppModeDeclaration());
//	 	vo.setDlppModeTransport(getDlppModeTransport());
//	 	vo.setDlppMoyenTransport(getDlppMoyenTransport());
//	 	vo.setDlppNbreArticles(getDlppNbreArticles());
//	 	vo.setDlppNineaDestinataire(getDlppNineaDestinataire());
//	 	vo.setDlppNomDeclarant(getDlppNomDeclarant());
//	 	vo.setDlppNomDestinataire(getDlppNomDestinataire());
//	 	vo.setDlppNomEntRepositaire(getDlppNomEntRepositaire());
//	 	vo.setDlppNomTanker(getDlppNomTanker());
//	 	vo.setDlppNomTransporteur(getDlppNomTransporteur());
//	 	vo.setDlppNomVoieDestinataire(getDlppNomVoieDestinataire());
//	 	vo.setDlppNomVoieTransporteur(getDlppNomVoieTransporteur());
//	 	vo.setDlppNumDlpp(getDlppNumDlpp());
//	 	vo.setDlppNumEnregManif(getDlppNumEnregManif());
//	 	vo.setDlppNumRepertoire(getDlppNumRepertoire());
//	 	vo.setDlppNumVoieDestinataire(getDlppNumVoieDestinataire());
//	 	vo.setDlppNumVoieEntRepositaire(getDlppNumVoieEntRepositaire());
//	 	vo.setDlppNumVoieTransporteur(getDlppNumVoieTransporteur());
//	 	vo.setDlppPaysDestination(getDlppPaysDestination());
//	 	vo.setDlppPpmExpediteur(getDlppPpmExpediteur());
//	 	vo.setDlppQuartierDestinataire(getDlppQuartierDestinataire());
//	 	vo.setDlppQuartierEntRepositaire(getDlppQuartierEntRepositaire());
//	 	vo.setDlppQuartierTransporteur(getDlppQuartierTransporteur());
//	 	vo.setDlppRefDeclarant(getDlppRefDeclarant());
//	 	vo.setDlppRegimeDouanier(getDlppRegimeDouanier());
//	 	vo.setDlppTitreDeclarant(getDlppTitreDeclarant());
//	 	vo.setDlppTitreDestinataire(getDlppTitreDestinataire());
//	 	vo.setDlppTypeApurement(getDlppTypeApurement());
//	 	vo.setDlppTypeRegime(getDlppTypeRegime());
//	 	vo.setDlppTypeVoieDeclarant(getDlppTypeVoieDeclarant());
//	 	vo.setDlppTypeVoieDestinataire(getDlppTypeVoieDestinataire());
//	 	vo.setDlppTypeVoieEntRepositaire(getDlppTypeVoieEntRepositaire());
//	 	vo.setDlppTypeVoieTransporteur(getDlppTypeVoieTransporteur());
//	 	vo.setDlppVilleDeclarant(getDlppVilleDeclarant());
//	 	vo.setDlppVilleDestinataire(getDlppVilleDestinataire());
//	 	vo.setDlppVilleEntRepositaire(getDlppVilleEntRepositaire());
//	 	vo.setDlppVilleTransporteur(getDlppVilleTransporteur());
//	 	vo.setDlppDateValidation(getDlppDateValidation());
//		return vo;
//	 }
}
