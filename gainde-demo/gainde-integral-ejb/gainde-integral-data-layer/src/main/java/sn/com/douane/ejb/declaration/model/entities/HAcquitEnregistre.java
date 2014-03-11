/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HAcquitEnregistreKey;

/**
 * @author moussakare
 *
 */

@Entity
@Table(name = "HACQUITENREGISTRE")
@IdClass(HAcquitEnregistreKey.class)
public class HAcquitEnregistre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1456535313973897143L;

	/**
	 * 
	 */
	
	@Id @Column(name = "DECDATEARCHIVE")	
	private java.sql.Timestamp decDateArchive;
	
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

	@Column(name = "DECDATENAISCONDUCTEUR", length = 20)
	private String decDateNaisConducteur;

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
	
	
	/**
	 * 
	 */
	public HAcquitEnregistre() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decDateArchive
	 * @param anneeDeclaration
	 * @param bureauDec
	 * @param numeroDeclaration
	 * @param decCodePpmDecl
	 * @param decNumRepertoire
	 * @param decBureauDepart
	 * @param decTypeRegime
	 * @param decRegimeDouanier
	 * @param decBurDestination
	 * @param decPaysDestination
	 * @param decDelaiRoute
	 * @param decModeTransport
	 * @param decMoyenTransport
	 * @param decImmatVehicule
	 * @param decMarqueVehicule
	 * @param decPpmTransporteur
	 * @param decNomTransporteur
	 * @param decAgremtTransport
	 * @param decTypeVoieTransport
	 * @param decNomVoieTransport
	 * @param decNumVoieTransport
	 * @param decBpTransporteur
	 * @param decVilleTransporteur
	 * @param decQuartierTransport
	 * @param decNomConducteur
	 * @param decAdreConducteur
	 * @param decDateNaisConducteur
	 * @param decLieuNaisConducteur
	 * @param decNumPieceIdenConduc
	 * @param decTypePieceIndCond
	 * @param decIndictrie
	 * @param decNumeroTriecCiad
	 * @param decagescorteur1
	 * @param decagescorteur2
	 * @param decRefRegularisation
	 * @param decCodeVerificateur
	 * @param decDateEscorte
	 */
	public HAcquitEnregistre(Timestamp decDateArchive, String anneeDeclaration,
			String bureauDec, Integer numeroDeclaration, String decCodePpmDecl,
			String decNumRepertoire, String decBureauDepart,
			String decTypeRegime, String decRegimeDouanier) {
		super();
		this.decDateArchive = decDateArchive;
		this.anneeDeclaration = anneeDeclaration;
		this.bureauDec = bureauDec;
		this.numeroDeclaration = numeroDeclaration;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decBureauDepart = decBureauDepart;
		this.decTypeRegime = decTypeRegime;
		this.decRegimeDouanier = decRegimeDouanier;
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
	 * @return the anneeDeclaration
	 */
	public java.lang.String getAnneeDeclaration() {
		return anneeDeclaration;
	}

	/**
	 * @param anneeDeclaration the anneeDeclaration to set
	 */
	public void setAnneeDeclaration(java.lang.String anneeDeclaration) {
		this.anneeDeclaration = anneeDeclaration;
	}

	/**
	 * @return the bureauDec
	 */
	public String getBureauDec() {
		return bureauDec;
	}

	/**
	 * @param bureauDec the bureauDec to set
	 */
	public void setBureauDec(String bureauDec) {
		this.bureauDec = bureauDec;
	}

	/**
	 * @return the numeroDeclaration
	 */
	public Integer getNumeroDeclaration() {
		return numeroDeclaration;
	}

	/**
	 * @param numeroDeclaration the numeroDeclaration to set
	 */
	public void setNumeroDeclaration(Integer numeroDeclaration) {
		this.numeroDeclaration = numeroDeclaration;
	}

	/**
	 * @return the decCodePpmDecl
	 */
	public String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}

	/**
	 * @param decCodePpmDecl the decCodePpmDecl to set
	 */
	public void setDecCodePpmDecl(String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
	}

	/**
	 * @return the decNumRepertoire
	 */
	public String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	/**
	 * @param decNumRepertoire the decNumRepertoire to set
	 */
	public void setDecNumRepertoire(String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	/**
	 * @return the decBureauDepart
	 */
	public String getDecBureauDepart() {
		return decBureauDepart;
	}

	/**
	 * @param decBureauDepart the decBureauDepart to set
	 */
	public void setDecBureauDepart(String decBureauDepart) {
		this.decBureauDepart = decBureauDepart;
	}

	/**
	 * @return the decTypeRegime
	 */
	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	/**
	 * @param decTypeRegime the decTypeRegime to set
	 */
	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	/**
	 * @return the decRegimeDouanier
	 */
	public String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}

	/**
	 * @param decRegimeDouanier the decRegimeDouanier to set
	 */
	public void setDecRegimeDouanier(String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}

	/**
	 * @return the decBurDestination
	 */
	public String getDecBurDestination() {
		return decBurDestination;
	}

	/**
	 * @param decBurDestination the decBurDestination to set
	 */
	public void setDecBurDestination(String decBurDestination) {
		this.decBurDestination = decBurDestination;
	}

	/**
	 * @return the decPaysDestination
	 */
	public String getDecPaysDestination() {
		return decPaysDestination;
	}

	/**
	 * @param decPaysDestination the decPaysDestination to set
	 */
	public void setDecPaysDestination(String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}

	/**
	 * @return the decDelaiRoute
	 */
	public Integer getDecDelaiRoute() {
		return decDelaiRoute;
	}

	/**
	 * @param decDelaiRoute the decDelaiRoute to set
	 */
	public void setDecDelaiRoute(Integer decDelaiRoute) {
		this.decDelaiRoute = decDelaiRoute;
	}

	/**
	 * @return the decModeTransport
	 */
	public String getDecModeTransport() {
		return decModeTransport;
	}

	/**
	 * @param decModeTransport the decModeTransport to set
	 */
	public void setDecModeTransport(String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}

	/**
	 * @return the decMoyenTransport
	 */
	public String getDecMoyenTransport() {
		return decMoyenTransport;
	}

	/**
	 * @param decMoyenTransport the decMoyenTransport to set
	 */
	public void setDecMoyenTransport(String decMoyenTransport) {
		this.decMoyenTransport = decMoyenTransport;
	}

	/**
	 * @return the decImmatVehicule
	 */
	public String getDecImmatVehicule() {
		return decImmatVehicule;
	}

	/**
	 * @param decImmatVehicule the decImmatVehicule to set
	 */
	public void setDecImmatVehicule(String decImmatVehicule) {
		this.decImmatVehicule = decImmatVehicule;
	}

	/**
	 * @return the decMarqueVehicule
	 */
	public String getDecMarqueVehicule() {
		return decMarqueVehicule;
	}

	/**
	 * @param decMarqueVehicule the decMarqueVehicule to set
	 */
	public void setDecMarqueVehicule(String decMarqueVehicule) {
		this.decMarqueVehicule = decMarqueVehicule;
	}

	/**
	 * @return the decPpmTransporteur
	 */
	public String getDecPpmTransporteur() {
		return decPpmTransporteur;
	}

	/**
	 * @param decPpmTransporteur the decPpmTransporteur to set
	 */
	public void setDecPpmTransporteur(String decPpmTransporteur) {
		this.decPpmTransporteur = decPpmTransporteur;
	}

	/**
	 * @return the decNomTransporteur
	 */
	public String getDecNomTransporteur() {
		return decNomTransporteur;
	}

	/**
	 * @param decNomTransporteur the decNomTransporteur to set
	 */
	public void setDecNomTransporteur(String decNomTransporteur) {
		this.decNomTransporteur = decNomTransporteur;
	}

	/**
	 * @return the decAgremtTransport
	 */
	public String getDecAgremtTransport() {
		return decAgremtTransport;
	}

	/**
	 * @param decAgremtTransport the decAgremtTransport to set
	 */
	public void setDecAgremtTransport(String decAgremtTransport) {
		this.decAgremtTransport = decAgremtTransport;
	}

	/**
	 * @return the decTypeVoieTransport
	 */
	public String getDecTypeVoieTransport() {
		return decTypeVoieTransport;
	}

	/**
	 * @param decTypeVoieTransport the decTypeVoieTransport to set
	 */
	public void setDecTypeVoieTransport(String decTypeVoieTransport) {
		this.decTypeVoieTransport = decTypeVoieTransport;
	}

	/**
	 * @return the decNomVoieTransport
	 */
	public String getDecNomVoieTransport() {
		return decNomVoieTransport;
	}

	/**
	 * @param decNomVoieTransport the decNomVoieTransport to set
	 */
	public void setDecNomVoieTransport(String decNomVoieTransport) {
		this.decNomVoieTransport = decNomVoieTransport;
	}

	/**
	 * @return the decNumVoieTransport
	 */
	public String getDecNumVoieTransport() {
		return decNumVoieTransport;
	}

	/**
	 * @param decNumVoieTransport the decNumVoieTransport to set
	 */
	public void setDecNumVoieTransport(String decNumVoieTransport) {
		this.decNumVoieTransport = decNumVoieTransport;
	}

	/**
	 * @return the decBpTransporteur
	 */
	public String getDecBpTransporteur() {
		return decBpTransporteur;
	}

	/**
	 * @param decBpTransporteur the decBpTransporteur to set
	 */
	public void setDecBpTransporteur(String decBpTransporteur) {
		this.decBpTransporteur = decBpTransporteur;
	}

	/**
	 * @return the decVilleTransporteur
	 */
	public String getDecVilleTransporteur() {
		return decVilleTransporteur;
	}

	/**
	 * @param decVilleTransporteur the decVilleTransporteur to set
	 */
	public void setDecVilleTransporteur(String decVilleTransporteur) {
		this.decVilleTransporteur = decVilleTransporteur;
	}

	/**
	 * @return the decQuartierTransport
	 */
	public String getDecQuartierTransport() {
		return decQuartierTransport;
	}

	/**
	 * @param decQuartierTransport the decQuartierTransport to set
	 */
	public void setDecQuartierTransport(String decQuartierTransport) {
		this.decQuartierTransport = decQuartierTransport;
	}

	/**
	 * @return the decNomConducteur
	 */
	public String getDecNomConducteur() {
		return decNomConducteur;
	}

	/**
	 * @param decNomConducteur the decNomConducteur to set
	 */
	public void setDecNomConducteur(String decNomConducteur) {
		this.decNomConducteur = decNomConducteur;
	}

	/**
	 * @return the decAdreConducteur
	 */
	public String getDecAdreConducteur() {
		return decAdreConducteur;
	}

	/**
	 * @param decAdreConducteur the decAdreConducteur to set
	 */
	public void setDecAdreConducteur(String decAdreConducteur) {
		this.decAdreConducteur = decAdreConducteur;
	}

	/**
	 * @return the decDateNaisConducteur
	 */
	public String getDecDateNaisConducteur() {
		return decDateNaisConducteur;
	}

	/**
	 * @param decDateNaisConducteur the decDateNaisConducteur to set
	 */
	public void setDecDateNaisConducteur(String decDateNaisConducteur) {
		this.decDateNaisConducteur = decDateNaisConducteur;
	}

	/**
	 * @return the decLieuNaisConducteur
	 */
	public String getDecLieuNaisConducteur() {
		return decLieuNaisConducteur;
	}

	/**
	 * @param decLieuNaisConducteur the decLieuNaisConducteur to set
	 */
	public void setDecLieuNaisConducteur(String decLieuNaisConducteur) {
		this.decLieuNaisConducteur = decLieuNaisConducteur;
	}

	/**
	 * @return the decNumPieceIdenConduc
	 */
	public String getDecNumPieceIdenConduc() {
		return decNumPieceIdenConduc;
	}

	/**
	 * @param decNumPieceIdenConduc the decNumPieceIdenConduc to set
	 */
	public void setDecNumPieceIdenConduc(String decNumPieceIdenConduc) {
		this.decNumPieceIdenConduc = decNumPieceIdenConduc;
	}

	/**
	 * @return the decTypePieceIndCond
	 */
	public String getDecTypePieceIndCond() {
		return decTypePieceIndCond;
	}

	/**
	 * @param decTypePieceIndCond the decTypePieceIndCond to set
	 */
	public void setDecTypePieceIndCond(String decTypePieceIndCond) {
		this.decTypePieceIndCond = decTypePieceIndCond;
	}

	/**
	 * @return the decIndictrie
	 */
	public String getDecIndictrie() {
		return decIndictrie;
	}

	/**
	 * @param decIndictrie the decIndictrie to set
	 */
	public void setDecIndictrie(String decIndictrie) {
		this.decIndictrie = decIndictrie;
	}

	/**
	 * @return the decNumeroTriecCiad
	 */
	public String getDecNumeroTriecCiad() {
		return decNumeroTriecCiad;
	}

	/**
	 * @param decNumeroTriecCiad the decNumeroTriecCiad to set
	 */
	public void setDecNumeroTriecCiad(String decNumeroTriecCiad) {
		this.decNumeroTriecCiad = decNumeroTriecCiad;
	}

}
