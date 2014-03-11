package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.AcquitEnregistreKey;

/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: AcquitEnregistre
*/

@Entity
@Table(name = "ACQUITENREGISTRE")
@IdClass(AcquitEnregistreKey.class)
public class AcquitEnregistre implements Serializable {

	private static final long serialVersionUID = 1043438509952553462L;

	@Id @Column(name = "ANNEEDECLARATION" ,  length = 4 ,  nullable = false)
	private java.lang.String anneeDeclaration;

	@Id @Column(name = "BUREAUDEC" ,  length = 3 ,  nullable = false)
	private String bureauDec;

	@Id @Column(name = "NUMERODECLARATION" , nullable = false)
	private Integer numeroDeclaration;

	@Column(name = "DECCODEPPMDECL" , length = 5  ,  nullable = false)
	private String decCodePpmDecl;

	@Column(name = "DECNUMREPERTOIRE" , length = 6  ,  nullable = false)
	private String decNumRepertoire;

	@Column(name = "DECBUREAUDEPART" , length = 3  ,  nullable = false)
	private String decBureauDepart;

	@Column(name = "DECTYPEREGIME" , length = 1  ,  nullable = false)
	private String decTypeRegime;

	@Column(name = "DECREGIMEDOUANIER" , length = 1  ,  nullable = false)
	private String decRegimeDouanier;

	@Column(name = "DECBURDESTINATION" , length = 4)
	private String decBurDestination;

	@Column(name = "DECPAYSDESTINATION" , length = 3)
	private String decPaysDestination;

	@Column(name = "DECDELAIROUTE")
	private Integer decDelaiRoute;

	@Column(name = "DECMODETRANSPORT" , length = 2)
	private String decModeTransport;

	@Column(name = "DECMOYENTRANSPORT" , length = 255)
	private String decMoyenTransport;

	@Column(name = "DECIMMATVEHICULE" , length = 20)
	private String decImmatVehicule;

	@Column(name = "DECMARQUEVEHICULE" , length = 20)
	private String decMarqueVehicule;

	@Column(name = "DECPPMTRANSPORTEUR" , length = 5)
	private String decPpmTransporteur;

	@Column(name = "DECNOMTRANSPORTEUR" , length = 30)
	private String decNomTransporteur;

	@Column(name = "DECAGREMTTRANSPORT" , length = 20)
	private String decAgremtTransport;

	@Column(name = "DECTYPEVOIETRANSPORT" , length = 5)
	private String decTypeVoieTransport;

	@Column(name = "DECNOMVOIETRANSPORT" , length = 25)
	private String decNomVoieTransport;

	@Column(name = "DECNUMVOIETRANSPORT" , length = 5)
	private String decNumVoieTransport;

	@Column(name = "DECBPTRANSPORTEUR" , length = 5)
	private String decBpTransporteur;

	@Column(name = "DECVILLETRANSPORTEUR" , length = 20)
	private String decVilleTransporteur;

	@Column(name = "DECQUARTIERTRANSPORT" , length = 20)
	private String decQuartierTransport;

	@Column(name = "DECNOMCONDUCTEUR" , length = 20)
	private String decNomConducteur;

	@Column(name = "DECADRECONDUCTEUR" , length = 100)
	private String decAdreConducteur;

	@Column(name = "DECDATENAISCONDUCTEUR")
	private Date decDateNaisConducteur;

	@Column(name = "DECLIEUNAISCONDUCTEUR" , length = 20)
	private String decLieuNaisConducteur;

	@Column(name = "DECNUMPIECEIDENCONDUC" , length = 20)
	private String decNumPieceIdenConduc;

	@Column(name = "DECTYPEPIECEINDCOND" , length = 1)
	private String decTypePieceIndCond;

	@Column(name = "DECINDICTRIE" , length = 1)
	private String decIndictrie;

	@Column(name = "DECNUMEROTRIECCIAD" , length = 20)
	private String decNumeroTriecCiad;
	
	@Column(name = "DECAGESCORTEUR1" , length = 4)
	private String decagescorteur1;
	
	@Column(name = "DECAGESCORTEUR2" , length = 4)
	private String decagescorteur2;
	
	@Column(name= "DECREFREGULARISATION", length = 100)
	private String decRefRegularisation;
	
	@Column(name = "DECCODEVERIFICATEUR",length=5)
	private String decCodeVerificateur;
	
	@Column(name= "DECDATEESCORTE")
	private Timestamp decDateEscorte;	
	
	@OneToMany(mappedBy = "acqPassageEnr" ,  targetEntity = BurPassageAcquitEnr.class)
	private List<BurPassageAcquitEnr> burPassageAcquitenr;


	public AcquitEnregistre(String anneeDeclaration ,  String bureauDec , Integer numeroDeclaration , 
							String decCodePpmDecl ,  String decNumRepertoire ,  String decBureauDepart ,  String decTypeRegime , String decRegimeDouanier) {
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decBureauDepart = decBureauDepart;
		this.decTypeRegime = decTypeRegime;
		this.decRegimeDouanier = decRegimeDouanier;	
}

	public AcquitEnregistre() {
	}


	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}


	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}


	public java.lang.String getBureauDec() {
		return bureauDec;
	}


	public void setBureauDec(java.lang.String bureauDec) {
		this.bureauDec = bureauDec;
	}


	public java.lang.Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}


	public void setNumeroDeclaration(java.lang.Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}


	public java.lang.String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}


	public void setDecCodePpmDecl(java.lang.String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
	}


	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}


	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}


	public java.lang.String getDecBureauDepart() {
		return decBureauDepart;
	}


	public void setDecBureauDepart(java.lang.String decBureauDepart) {
		this.decBureauDepart = decBureauDepart;
	}


	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}


	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}


	public java.lang.String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}


	public void setDecRegimeDouanier(java.lang.String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}


	public java.lang.String getDecBurDestination() {
		return decBurDestination;
	}


	public void setDecBurDestination(java.lang.String decBurDestination) {
		this.decBurDestination = decBurDestination;
	}


	public java.lang.String getDecPaysDestination() {
		return decPaysDestination;
	}


	public void setDecPaysDestination(java.lang.String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}


	public java.lang.Integer getDecDelaiRoute() {
		return decDelaiRoute;
	}


	public void setDecDelaiRoute(java.lang.Integer decDelaiRoute) {
		this.decDelaiRoute = decDelaiRoute;
	}


	public java.lang.String getDecModeTransport() {
		return decModeTransport;
	}


	public void setDecModeTransport(java.lang.String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}


	public java.lang.String getDecMoyenTransport() {
		return decMoyenTransport;
	}


	public void setDecMoyenTransport(java.lang.String decMoyenTransport) {
		this.decMoyenTransport = decMoyenTransport;
	}


	public java.lang.String getDecImmatVehicule() {
		return decImmatVehicule;
	}


	public void setDecImmatVehicule(java.lang.String decImmatVehicule) {
		this.decImmatVehicule = decImmatVehicule;
	}


	public java.lang.String getDecMarqueVehicule() {
		return decMarqueVehicule;
	}


	public void setDecMarqueVehicule(java.lang.String decMarqueVehicule) {
		this.decMarqueVehicule = decMarqueVehicule;
	}


	public java.lang.String getDecPpmTransporteur() {
		return decPpmTransporteur;
	}


	public void setDecPpmTransporteur(java.lang.String decPpmTransporteur) {
		this.decPpmTransporteur = decPpmTransporteur;
	}


	public java.lang.String getDecNomTransporteur() {
		return decNomTransporteur;
	}


	public void setDecNomTransporteur(java.lang.String decNomTransporteur) {
		this.decNomTransporteur = decNomTransporteur;
	}


	public java.lang.String getDecAgremtTransport() {
		return decAgremtTransport;
	}


	public void setDecAgremtTransport(java.lang.String decAgremtTransport) {
		this.decAgremtTransport = decAgremtTransport;
	}


	public java.lang.String getDecTypeVoieTransport() {
		return decTypeVoieTransport;
	}


	public void setDecTypeVoieTransport(java.lang.String decTypeVoieTransport) {
		this.decTypeVoieTransport = decTypeVoieTransport;
	}


	public java.lang.String getDecNomVoieTransport() {
		return decNomVoieTransport;
	}


	public void setDecNomVoieTransport(java.lang.String decNomVoieTransport) {
		this.decNomVoieTransport = decNomVoieTransport;
	}


	public java.lang.String getDecNumVoieTransport() {
		return decNumVoieTransport;
	}


	public void setDecNumVoieTransport(java.lang.String decNumVoieTransport) {
		this.decNumVoieTransport = decNumVoieTransport;
	}


	public java.lang.String getDecBpTransporteur() {
		return decBpTransporteur;
	}


	public void setDecBpTransporteur(java.lang.String decBpTransporteur) {
		this.decBpTransporteur = decBpTransporteur;
	}


	public java.lang.String getDecVilleTransporteur() {
		return decVilleTransporteur;
	}


	public void setDecVilleTransporteur(java.lang.String decVilleTransporteur) {
		this.decVilleTransporteur = decVilleTransporteur;
	}


	public java.lang.String getDecQuartierTransport() {
		return decQuartierTransport;
	}


	public void setDecQuartierTransport(java.lang.String decQuartierTransport) {
		this.decQuartierTransport = decQuartierTransport;
	}


	public java.lang.String getDecNomConducteur() {
		return decNomConducteur;
	}


	public void setDecNomConducteur(java.lang.String decNomConducteur) {
		this.decNomConducteur = decNomConducteur;
	}


	public java.lang.String getDecAdreConducteur() {
		return decAdreConducteur;
	}


	public void setDecAdreConducteur(java.lang.String decAdreConducteur) {
		this.decAdreConducteur = decAdreConducteur;
	}


	public java.lang.String getDecLieuNaisConducteur() {
		return decLieuNaisConducteur;
	}


	public void setDecLieuNaisConducteur(java.lang.String decLieuNaisConducteur) {
		this.decLieuNaisConducteur = decLieuNaisConducteur;
	}


	public java.lang.String getDecNumPieceIdenConduc() {
		return decNumPieceIdenConduc;
	}


	public void setDecNumPieceIdenConduc(java.lang.String decNumPieceIdenConduc) {
		this.decNumPieceIdenConduc = decNumPieceIdenConduc;
	}


	public java.lang.String getDecTypePieceIndCond() {
		return decTypePieceIndCond;
	}


	public void setDecTypePieceIndCond(java.lang.String decTypePieceIndCond) {
		this.decTypePieceIndCond = decTypePieceIndCond;
	}


	public java.lang.String getDecIndictrie() {
		return decIndictrie;
	}


	public void setDecIndictrie(java.lang.String decIndictrie) {
		this.decIndictrie = decIndictrie;
	}


	public java.lang.String getDecNumeroTriecCiad() {
		return decNumeroTriecCiad;
	}


	public void setDecNumeroTriecCiad(java.lang.String decNumeroTriecCiad) {
		this.decNumeroTriecCiad = decNumeroTriecCiad;
	}

	public Date getDecDateNaisConducteur() {
		return decDateNaisConducteur;
	}

	public void setDecDateNaisConducteur(Date decDateNaisConducteur) {
		this.decDateNaisConducteur = decDateNaisConducteur;
	}

	public String getDecagescorteur1() {
		return decagescorteur1;
	}

	public void setDecagescorteur1(String decagescorteur1) {
		this.decagescorteur1 = decagescorteur1;
	}

	public String getDecagescorteur2() {
		return decagescorteur2;
	}

	public void setDecagescorteur2(String decagescorteur2) {
		this.decagescorteur2 = decagescorteur2;
	}

	public String getDecRefRegularisation() {
		return decRefRegularisation;
	}

	public void setDecRefRegularisation(String decRefRegularisation) {
		this.decRefRegularisation = decRefRegularisation;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public Timestamp getDecDateEscorte() {
		return decDateEscorte;
	}

	public void setDecDateEscorte(Timestamp decDateEscorte) {
		this.decDateEscorte = decDateEscorte;
	}

	/**
	 * @return the burPassageAcquitenr
	 */
	public List<BurPassageAcquitEnr> getBurPassageAcquitenr() {
		return burPassageAcquitenr;
	}

	/**
	 * @param burPassageAcquitenr the burPassageAcquitenr to set
	 */
	public void setBurPassageAcquitenr(List<BurPassageAcquitEnr> burPassageAcquitenr) {
		this.burPassageAcquitenr = burPassageAcquitenr;
	}
	
	
	
}