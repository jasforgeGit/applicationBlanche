package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.DdeModifSegenDecKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.ModeTransport;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.Ppm;

/**
 * @author: ahmed The Entity Bean DdeModifSegenDec.
 */
@Entity
@Table(name = "DDEMODIFSEGENDEC")
@IdClass(DdeModifSegenDecKey.class)
public class DdeModifSegenDec implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -968295650418084276L;

	/** The dec annee enreg dec. */
	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	/** The dec bur enreg dec. */
	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	/** The dec num declaration. */
	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	/** The dec code destinataire. */
	@Column(name = "DECCODEDESTINATAIRE", length = 5)
	private String decCodeDestinataire;

	/** The dec nom destinataire. */
	@Column(name = "DECNOMDESTINATAIRE")
	private String decNomDestinataire;

	/** The dectype voie dest. */
	@Column(name = "DECTYPEVOIEDEST", length = 25)
	private String dectypeVoieDest;

	/** The dec num code contrib. */
	@Column(name = "DECNUMCODECONTRIB", length = 7)
	private String decNumCodeContrib;

	/** The dec titre destinataire. */
	@Column(name = "DECTITREDESTINATAIRE", length = 3)
	private String decTitreDestinataire;

	/** The dec num voie dest. */
	@Column(name = "DECNUMVOIEDEST", length = 5)
	private String decNumVoieDest;

	/** The dec quartier dest. */
	@Column(name = "DECQUARTIERDEST", length = 50)
	private String decQuartierDest;

	/** The dec ville destinataire. */
	@Column(name = "DECVILLEDESTINATAIRE", length = 50)
	private String decVilleDestinataire;

	/** The dec bp destinataire. */
	@Column(name = "DECBPDESTINATAIRE", length = 50)
	private String decBpDestinataire;

	/** The dec mode transport. */
	@Column(name = "DECMODETRANSPORT", length = 2)
	private String decModeTransport;

	/** The dec moyen transport. */
	@Column(name = "DECMOYENTRANSPORT", length = 255)
	private String decMoyenTransport;

	/** The dec ref decl. */
	@Column(name = "DECREFDECL", length = 30)
	private String decRefDecl;

	/** The dec pays destination. */
	@Column(name = "DECPAYSDESTINATION", length = 3)
	private String decPaysDestination;

	/** The dec bur dest. */
	@Column(name = "DECBURDEST", length = 3)
	private String decBurDest;

	/** The dec bur frontiere. */
	@Column(name = "DECBURFRONTIERE", length = 3)
	private String decBurFrontiere;

	/** The dec date dde modif. */
	@Column(name = "DECDATEDDEMODIF", length = 4)
	private Date decDateDdeModif;

	/** The dec num message. */
	@Column(name = "DECNUMMESSAGE", length = 4)
	private Integer decNumMessage;

	/** The dec type message. */
	@Column(name = "DECTYPEMESSAGE", length = 1)
	private String decTypeMessage;

	/** The dec nom voie dest. */
	@Column(name = "DECNOMVOIEDEST", length = 60)
	private String decNomVoieDest;

	/** The Bureau douane dde modif segen dec. */
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "DECBURFRONTIERE", insertable = false, updatable = false)
	private BureauDouane bureauDouane;

	/** The ppm dde modif segen dec. */
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "DECCODEDESTINATAIRE", insertable = false, updatable = false)
	private Ppm ppm;

	/** The pays dde modif segen dec. */
	@ManyToOne(targetEntity = Pays.class)
	@JoinColumn(name = "DECPAYSDESTINATION", insertable = false, updatable = false)
	private Pays pays;

	/** The Mode transport dde modif segen dec. */
	@ManyToOne(targetEntity = ModeTransport.class)
	@JoinColumn(name = "DECMODETRANSPORT", insertable = false, updatable = false)
	private ModeTransport modeTransport;
	
	@Transient
	private String decRegimeDouanier;
	
	@Transient
	private String decTypeRegime;
	
	@Transient
	private String declNumNineaDestinataire;

	/**
	 * Instantiates a new dde modif segen dec.
	 * 
	 * @param decAnneeEnregDec
	 *            the dec annee enreg dec
	 * @param decBurEnregDec
	 *            the dec bur enreg dec
	 * @param decNumDeclaration
	 *            the dec num declaration
	 */
	public DdeModifSegenDec(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;

	}

	/**
	 * Instantiates a new dde modif segen dec.
	 */
	public DdeModifSegenDec() {

	}

	/**
	 * Gets the dec annee enreg dec.
	 * 
	 * @return the decAnneeEnregDec
	 */
	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * Sets the dec annee enreg dec.
	 * 
	 * @param decAnneeEnregDec
	 *            the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * Gets the dec bur enreg dec.
	 * 
	 * @return the decBurEnregDec
	 */
	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * Sets the dec bur enreg dec.
	 * 
	 * @param decBurEnregDec
	 *            the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * Gets the dec num declaration.
	 * 
	 * @return the decNumDeclaration
	 */
	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * Sets the dec num declaration.
	 * 
	 * @param decNumDeclaration
	 *            the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * Gets the dec code destinataire.
	 * 
	 * @return the decCodeDestinataire
	 */
	public String getDecCodeDestinataire() {
		return decCodeDestinataire;
	}

	/**
	 * Sets the dec code destinataire.
	 * 
	 * @param decCodeDestinataire
	 *            the decCodeDestinataire to set
	 */
	public void setDecCodeDestinataire(String decCodeDestinataire) {
		this.decCodeDestinataire = decCodeDestinataire;
	}

	/**
	 * Gets the dec nom destinataire.
	 * 
	 * @return the decNomDestinataire
	 */
	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	/**
	 * Sets the dec nom destinataire.
	 * 
	 * @param decNomDestinataire
	 *            the decNomDestinataire to set
	 */
	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	/**
	 * Gets the dectype voie dest.
	 * 
	 * @return the dectypeVoieDest
	 */
	public String getDectypeVoieDest() {
		return dectypeVoieDest;
	}

	/**
	 * Sets the dectype voie dest.
	 * 
	 * @param dectypeVoieDest
	 *            the dectypeVoieDest to set
	 */
	public void setDectypeVoieDest(String dectypeVoieDest) {
		this.dectypeVoieDest = dectypeVoieDest;
	}

	/**
	 * Gets the dec num code contrib.
	 * 
	 * @return the decNumCodeContrib
	 */
	public String getDecNumCodeContrib() {
		return decNumCodeContrib;
	}

	/**
	 * Sets the dec num code contrib.
	 * 
	 * @param decNumCodeContrib
	 *            the decNumCodeContrib to set
	 */
	public void setDecNumCodeContrib(String decNumCodeContrib) {
		this.decNumCodeContrib = decNumCodeContrib;
	}

	/**
	 * Gets the dec titre destinataire.
	 * 
	 * @return the decTitreDestinataire
	 */
	public String getDecTitreDestinataire() {
		return decTitreDestinataire;
	}

	/**
	 * Sets the dec titre destinataire.
	 * 
	 * @param decTitreDestinataire
	 *            the decTitreDestinataire to set
	 */
	public void setDecTitreDestinataire(String decTitreDestinataire) {
		this.decTitreDestinataire = decTitreDestinataire;
	}

	/**
	 * Gets the dec num voie dest.
	 * 
	 * @return the decNumVoieDest
	 */
	public String getDecNumVoieDest() {
		return decNumVoieDest;
	}

	/**
	 * Sets the dec num voie dest.
	 * 
	 * @param decNumVoieDest
	 *            the decNumVoieDest to set
	 */
	public void setDecNumVoieDest(String decNumVoieDest) {
		this.decNumVoieDest = decNumVoieDest;
	}

	/**
	 * Gets the dec quartier dest.
	 * 
	 * @return the decQuartierDest
	 */
	public String getDecQuartierDest() {
		return decQuartierDest;
	}

	/**
	 * Sets the dec quartier dest.
	 * 
	 * @param decQuartierDest
	 *            the decQuartierDest to set
	 */
	public void setDecQuartierDest(String decQuartierDest) {
		this.decQuartierDest = decQuartierDest;
	}

	/**
	 * Gets the dec ville destinataire.
	 * 
	 * @return the decVilleDestinataire
	 */
	public String getDecVilleDestinataire() {
		return decVilleDestinataire;
	}

	/**
	 * Sets the dec ville destinataire.
	 * 
	 * @param decVilleDestinataire
	 *            the decVilleDestinataire to set
	 */
	public void setDecVilleDestinataire(String decVilleDestinataire) {
		this.decVilleDestinataire = decVilleDestinataire;
	}

	/**
	 * Gets the dec bp destinataire.
	 * 
	 * @return the decBpDestinataire
	 */
	public String getDecBpDestinataire() {
		return decBpDestinataire;
	}

	/**
	 * Sets the dec bp destinataire.
	 * 
	 * @param decBpDestinataire
	 *            the decBpDestinataire to set
	 */
	public void setDecBpDestinataire(String decBpDestinataire) {
		this.decBpDestinataire = decBpDestinataire;
	}

	/**
	 * Gets the dec mode transport.
	 * 
	 * @return the decModeTransport
	 */
	public String getDecModeTransport() {
		return decModeTransport;
	}

	/**
	 * Sets the dec mode transport.
	 * 
	 * @param decModeTransport
	 *            the decModeTransport to set
	 */
	public void setDecModeTransport(String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}

	/**
	 * Gets the dec moyen transport.
	 * 
	 * @return the decMoyenTransport
	 */
	public String getDecMoyenTransport() {
		return decMoyenTransport;
	}

	/**
	 * Sets the dec moyen transport.
	 * 
	 * @param decMoyenTransport
	 *            the decMoyenTransport to set
	 */
	public void setDecMoyenTransport(String decMoyenTransport) {
		this.decMoyenTransport = decMoyenTransport;
	}

	/**
	 * Gets the dec ref decl.
	 * 
	 * @return the decRefDecl
	 */
	public String getDecRefDecl() {
		return decRefDecl;
	}

	/**
	 * Sets the dec ref decl.
	 * 
	 * @param decRefDecl
	 *            the decRefDecl to set
	 */
	public void setDecRefDecl(String decRefDecl) {
		this.decRefDecl = decRefDecl;
	}

	/**
	 * Gets the dec pays destination.
	 * 
	 * @return the decPaysDestination
	 */
	public String getDecPaysDestination() {
		return decPaysDestination;
	}

	/**
	 * Sets the dec pays destination.
	 * 
	 * @param decPaysDestination
	 *            the decPaysDestination to set
	 */
	public void setDecPaysDestination(String decPaysDestination) {
		this.decPaysDestination = decPaysDestination;
	}

	/**
	 * Gets the dec bur dest.
	 * 
	 * @return the decBurDest
	 */
	public String getDecBurDest() {
		return decBurDest;
	}

	/**
	 * Sets the dec bur dest.
	 * 
	 * @param decBurDest
	 *            the decBurDest to set
	 */
	public void setDecBurDest(String decBurDest) {
		this.decBurDest = decBurDest;
	}

	/**
	 * Gets the dec bur frontiere.
	 * 
	 * @return the decBurFrontiere
	 */
	public String getDecBurFrontiere() {
		return decBurFrontiere;
	}

	/**
	 * Sets the dec bur frontiere.
	 * 
	 * @param decBurFrontiere
	 *            the decBurFrontiere to set
	 */
	public void setDecBurFrontiere(String decBurFrontiere) {
		this.decBurFrontiere = decBurFrontiere;
	}

	/**
	 * Gets the dec date dde modif.
	 * 
	 * @return the decDateDdeModif
	 */
	public Date getDecDateDdeModif() {
		return decDateDdeModif;
	}

	/**
	 * Sets the dec date dde modif.
	 * 
	 * @param decDateDdeModif
	 *            the decDateDdeModif to set
	 */
	public void setDecDateDdeModif(Date decDateDdeModif) {
		this.decDateDdeModif = decDateDdeModif;
	}

	/**
	 * Gets the dec num message.
	 * 
	 * @return the decNumMessage
	 */
	public Integer getDecNumMessage() {
		return decNumMessage;
	}

	/**
	 * Sets the dec num message.
	 * 
	 * @param decNumMessage
	 *            the decNumMessage to set
	 */
	public void setDecNumMessage(Integer decNumMessage) {
		this.decNumMessage = decNumMessage;
	}

	/**
	 * Gets the dec type message.
	 * 
	 * @return the decTypeMessage
	 */
	public String getDecTypeMessage() {
		return decTypeMessage;
	}

	/**
	 * Sets the dec type message.
	 * 
	 * @param decTypeMessage
	 *            the decTypeMessage to set
	 */
	public void setDecTypeMessage(String decTypeMessage) {
		this.decTypeMessage = decTypeMessage;
	}

	/**
	 * Gets the dec nom voie dest.
	 * 
	 * @return the decNomVoieDest
	 */
	public String getDecNomVoieDest() {
		return decNomVoieDest;
	}

	/**
	 * Sets the dec nom voie dest.
	 * 
	 * @param decNomVoieDest
	 *            the decNomVoieDest to set
	 */
	public void setDecNomVoieDest(String decNomVoieDest) {
		this.decNomVoieDest = decNomVoieDest;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public ModeTransport getModeTransport() {
		return modeTransport;
	}

	public void setModeTransport(ModeTransport modeTransport) {
		this.modeTransport = modeTransport;
	}

	public String getDecRegimeDouanier() {
		return decRegimeDouanier;
	}

	public void setDecRegimeDouanier(String decRegimeDouanier) {
		this.decRegimeDouanier = decRegimeDouanier;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDeclNumNineaDestinataire() {
		return declNumNineaDestinataire;
	}

	public void setDeclNumNineaDestinataire(String declNumNineaDestinataire) {
		this.declNumNineaDestinataire = declNumNineaDestinataire;
	}
	
	

}
