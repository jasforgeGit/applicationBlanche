package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.BrouillonAcquitKey;


@Entity
@IdClass(BrouillonAcquitKey.class)
@Table(name="BROUILLONACQUIT")
public class BrouillonAcquit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4473712346442621169L;

	@Id
	@Column(name="DECANNEEDECL", length=4, nullable=false)
	    private java.lang.String decAnneeDecl;
	
	@Id
	@Column(name="DECCODEPPMDECL", length=5, nullable=false)
	    private java.lang.String decCodePpmDecl;
	
	@Id
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
	    private java.lang.String decNumRepertoire;
	
	@Column(name="DECBUREAUDEPART", length=3, nullable=false)
	    private java.lang.String decBureauDepart;
	
	@Column(name="DECTYPEREGIME", length=1, nullable=false)
	    private java.lang.String decTypeRegime;
	
	@Column(name="DECREGIMEDOUANIER", length=1, nullable=false)
	    private java.lang.String decRegimeDouanier;
	
	@Column(name="DECBURDESTINATION", length=4)
	    private java.lang.String decBurDestination;
	
	@Column(name="DECPAYSDESTINATION", length=3)
	    private java.lang.String decPaysDestination;
	
	@Column(name="DECDELAIROUTE")
	    private java.lang.Integer decDelaiRoute;
	
	@Column(name="DECMODETRANSPORT", length=2)
	    private java.lang.String decModeTransport;
	
	@Column(name="DECMOYENTRANSPORT", length=255)
	    private java.lang.String decMoyenTransport;
	
	@Column(name="DECIMMATVEHICULE", length=20)
	    private java.lang.String decImmatVehicule;
	
	@Column(name="DECMARQUEVEHICULE", length=20)
	    private java.lang.String decMarqueVehicule;
	
	@Column(name="DECPPMTRANSPORTEUR", length=5)
	    private java.lang.String decPpmTransporteur;
	
	@Column(name="DECNOMTRANSPORTEUR", length=30)
	    private java.lang.String decNomTransporteur;
	
	@Column(name="DECAGREMTTRANSPORT", length=20)
	    private java.lang.String decAgremtTransport;
	
	@Column(name="DECTYPEVOIETRANSPORT", length=5)
	    private java.lang.String decTypeVoieTransport;
	
	@Column(name="DECNOMVOIETRANSPORT", length=25)
	    private java.lang.String decNomVoieTransport;
	
	@Column(name="DECNUMVOIETRANSPORT", length=5)
	    private java.lang.String decNumVoieTransport;
	

	@Column(name="DECBPTRANSPORTEUR", length=5)
    private java.lang.String decBpTransporteur;
	
	@Column(name="DECVILLETRANSPORTEUR", length=20)
    private java.lang.String decVilleTransporteur;
	
	@Column(name="DECQUARTIERTRANSPORT", length=20)
    private java.lang.String decQuartierTransport;
	
	@Column(name="DECNOMCONDUCTEUR", length=20)
    private java.lang.String decNomConducteur;
	
	@Column(name="DECADRECONDUCTEUR", length=100)
    private java.lang.String deCadreConducteur;
	
	@Column(name="DECDATENAISCONDUCTEUR", length=20)
    private  java.lang.String decDateNaisConducteur;
	
	@Column(name="DECLIEUNAISCONDUCTEUR", length=20)
    private java.lang.String decLieuNaisConducteur;
	
	@Column(name="DECNUMPIECEIDENCONDUC", length=20)
    private java.lang.String decNumPieceIdenConduc;
	
	@Column(name="DECTYPEPIECEINDCOND", length=1)
    private java.lang.String decTypePieceIndCond;
	
	@Column(name="DECINDICTRIE", length=1)
    private java.lang.String decIndicTrie;
	
	@Column(name="DECNUMEROTRIECCIAD", length=20)
    private java.lang.String decNumeroTrieCciad;
	
	@OneToMany(targetEntity = BrBurPassageAcquit.class, mappedBy = "brAcqPassage")
	private List<BrBurPassageAcquit> brBurPassageAcquit;

	public BrouillonAcquit(String decAnneeDecl, String decCodePpmDecl,
			String decNumRepertoire, String decBureauDepart,
			String decTypeRegime, String decRegimeDouanier,
			String decBurDestination, String decPaysDestination,
			Integer decDelaiRoute, String decModeTransport,
			String decMoyenTransport, String decImmatVehicule,
			String decMarqueVehicule, String decPpmTransporteur,
			String decNomTransporteur, String decAgremtTransport,
			String decTypeVoieTransport, String decNomVoieTransport,
			String decNumVoieTransport, String decBpTransporteur,
			String decVilleTransporteur, String decQuartierTransport,
			String decNomConducteur, String deCadreConducteur,
			String decDateNaisConducteur, String decLieuNaisConducteur,
			String decNumPieceIdenConduc, String decTypePieceIndCond,
			String decIndicTrie, String decNumeroTrieCciad) {
		super();
		this.decAnneeDecl = decAnneeDecl;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decBureauDepart = decBureauDepart;
		this.decTypeRegime = decTypeRegime;
		this.decRegimeDouanier = decRegimeDouanier;
		this.decBurDestination = decBurDestination;
		this.decPaysDestination = decPaysDestination;
		this.decDelaiRoute = decDelaiRoute;
		this.decModeTransport = decModeTransport;
		this.decMoyenTransport = decMoyenTransport;
		this.decImmatVehicule = decImmatVehicule;
		this.decMarqueVehicule = decMarqueVehicule;
		this.decPpmTransporteur = decPpmTransporteur;
		this.decNomTransporteur = decNomTransporteur;
		this.decAgremtTransport = decAgremtTransport;
		this.decTypeVoieTransport = decTypeVoieTransport;
		this.decNomVoieTransport = decNomVoieTransport;
		this.decNumVoieTransport = decNumVoieTransport;
		this.decBpTransporteur = decBpTransporteur;
		this.decVilleTransporteur = decVilleTransporteur;
		this.decQuartierTransport = decQuartierTransport;
		this.decNomConducteur = decNomConducteur;
		this.deCadreConducteur = deCadreConducteur;
		this.decDateNaisConducteur = decDateNaisConducteur;
		this.decLieuNaisConducteur = decLieuNaisConducteur;
		this.decNumPieceIdenConduc = decNumPieceIdenConduc;
		this.decTypePieceIndCond = decTypePieceIndCond;
		this.decIndicTrie = decIndicTrie;
		this.decNumeroTrieCciad = decNumeroTrieCciad;
	}

	public BrouillonAcquit() {
		super();
	}

	public java.lang.String getDecAnneeDecl() {
		return decAnneeDecl;
	}

	public void setDecAnneeDecl(java.lang.String decAnneeDecl) {
		this.decAnneeDecl = decAnneeDecl;
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

	public java.lang.String getDeCadreConducteur() {
		return deCadreConducteur;
	}

	public void setDeCadreConducteur(java.lang.String deCadreConducteur) {
		this.deCadreConducteur = deCadreConducteur;
	}

	public java.lang.String getDecDateNaisConducteur() {
		return decDateNaisConducteur;
	}

	public void setDecDateNaisConducteur(java.lang.String decDateNaisConducteur) {
		this.decDateNaisConducteur = decDateNaisConducteur;
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

	public java.lang.String getDecIndicTrie() {
		return decIndicTrie;
	}

	public void setDecIndicTrie(java.lang.String decIndicTrie) {
		this.decIndicTrie = decIndicTrie;
	}

	public java.lang.String getDecNumeroTrieCciad() {
		return decNumeroTrieCciad;
	}

	public void setDecNumeroTrieCciad(java.lang.String decNumeroTrieCciad) {
		this.decNumeroTrieCciad = decNumeroTrieCciad;
	}

	public List<BrBurPassageAcquit> getBrBurPassageAcquit() {
		return brBurPassageAcquit;
	}

	public void setBrBurPassageAcquit(List<BrBurPassageAcquit> brBurPassageAcquit) {
		this.brBurPassageAcquit = brBurPassageAcquit;
	}	
	

}
