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

import sn.com.douane.ejb.declaration.model.keys.SegGenDecTransKey;



@Entity
@IdClass(SegGenDecTransKey.class)
@Table(name="SEGGENDECTRANS")
public class SegGenDecTrans implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7368259337617245764L;

	

	@Id
	@Column(name="DECANNEEDEC", length=4, nullable=false)
	private java.lang.String decAnneeDec;
	
	@Id
	@Column(name="DECBURENREGTRANS", length=3, nullable=false)
    private java.lang.String decBurEnregTrans;

	@Id
	@Column(name="DECNUMDECTRANS", nullable=false)
	private java.lang.Integer decNumDecTrans;
	
	@Column(name="DECANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String decAnneeEnregManif;
	
	@Column(name="DECBURMANIF", length=3)
    private java.lang.String decBurManif;
	
	@Column(name="DECNUMENREGMANIF")
    private java.lang.Integer decNumEnregManif;
	
	@Column(name="DECCODEPPMDECL", length=5)
    private java.lang.String decCodePpmDecl;
	
	@Column(name="DECCODEAGREEDECL", length=3, nullable=false)
    private java.lang.String decCodeAgreeDecl;
	
	@Column(name="DECNUMREPERTOIRE", length=6, nullable=false)
    private java.lang.String decNumRepertoire;
	
	@Column(name="DECCODEPAYSPROV", length=3, nullable=false)
    private java.lang.String decCodePaysProv;
	
	@Column(name="DECMODETRANSPORT", length=2)
    private java.lang.String decModeTransport;
	
	@Column(name="DECMOYENTRANS", length=20)
    private java.lang.String decMoyenTrans;
	
	@Column(name="DECCODECREDITAIRE", length=3)
    private java.lang.String decCodeCreditaire;
	
	@Column(name="DECDATECREATION")
    private java.sql.Date decDateCreation;
	
	@Column(name="DECDATEENREG")
    private java.sql.Date decDateEnreg;
	
	@Column(name="DECCODEPAYSDEST", length=3)
    private java.lang.String decCodePaysDest;
	
	@Column(name="DECNUMARTDECL")
    private java.lang.Integer decNumArtDecl;
	
	@Column(name="DECTYPEMESSAGE", length=1)
    private java.lang.String decTypeMessage;
	
	@Column(name="DECETATDECL", length=1)
    private java.lang.String decEtatDecl;
	
	@Column(name="DECNUMMESSAGE")
    private java.lang.Integer decNumMessage;
	
	@Column(name="DECAGRECTIFVISITE", length=8)
    private java.lang.String decAgreCtifVisite;
	
	@Column(name="DECDATEENLEVEMENT")
    private java.sql.Date decDateEnlevement;
	
	@OneToMany(mappedBy = "segGenDectrans", targetEntity = SegArtDecTransb.class) 
	private List<SegArtDec> segArtDecTransb;

	public SegGenDecTrans(String decAnneeDec, String decBurEnregTrans,
			Integer decNumDecTrans, String decAnneeEnregManif,
			String decBurManif, Integer decNumEnregManif,
			String decCodePpmDecl, String decCodeAgreeDecl,
			String decNumRepertoire, String decCodePaysProv,
			String decModeTransport, String decMoyenTrans,
			String decCodeCreditaire, Date decDateCreation, Date decDateEnreg,
			String decCodePaysDest, Integer decNumArtDecl,
			String decTypeMessage, String decEtatDecl, Integer decNumMessage,
			String decAgreCtifVisite, Date decDateEnlevement) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregTrans = decBurEnregTrans;
		this.decNumDecTrans = decNumDecTrans;
		this.decAnneeEnregManif = decAnneeEnregManif;
		this.decBurManif = decBurManif;
		this.decNumEnregManif = decNumEnregManif;
		this.decCodePpmDecl = decCodePpmDecl;
		this.decCodeAgreeDecl = decCodeAgreeDecl;
		this.decNumRepertoire = decNumRepertoire;
		this.decCodePaysProv = decCodePaysProv;
		this.decModeTransport = decModeTransport;
		this.decMoyenTrans = decMoyenTrans;
		this.decCodeCreditaire = decCodeCreditaire;
		this.decDateCreation = decDateCreation;
		this.decDateEnreg = decDateEnreg;
		this.decCodePaysDest = decCodePaysDest;
		this.decNumArtDecl = decNumArtDecl;
		this.decTypeMessage = decTypeMessage;
		this.decEtatDecl = decEtatDecl;
		this.decNumMessage = decNumMessage;
		this.decAgreCtifVisite = decAgreCtifVisite;
		this.decDateEnlevement = decDateEnlevement;
	}

	public SegGenDecTrans() {
		super();
	}

	public java.lang.String getDecAnneeDec() {
		return decAnneeDec;
	}

	public void setDecAnneeDec(java.lang.String decAnneeDec) {
		this.decAnneeDec = decAnneeDec;
	}

	public java.lang.String getDecBurEnregTrans() {
		return decBurEnregTrans;
	}

	public void setDecBurEnregTrans(java.lang.String decBurEnregTrans) {
		this.decBurEnregTrans = decBurEnregTrans;
	}

	public java.lang.Integer getDecNumDecTrans() {
		return decNumDecTrans;
	}

	public void setDecNumDecTrans(java.lang.Integer decNumDecTrans) {
		this.decNumDecTrans = decNumDecTrans;
	}

	public java.lang.String getDecAnneeEnregManif() {
		return decAnneeEnregManif;
	}

	public void setDecAnneeEnregManif(java.lang.String decAnneeEnregManif) {
		this.decAnneeEnregManif = decAnneeEnregManif;
	}

	public java.lang.String getDecBurManif() {
		return decBurManif;
	}

	public void setDecBurManif(java.lang.String decBurManif) {
		this.decBurManif = decBurManif;
	}

	public java.lang.Integer getDecNumEnregManif() {
		return decNumEnregManif;
	}

	public void setDecNumEnregManif(java.lang.Integer decNumEnregManif) {
		this.decNumEnregManif = decNumEnregManif;
	}

	public java.lang.String getDecCodePpmDecl() {
		return decCodePpmDecl;
	}

	public void setDecCodePpmDecl(java.lang.String decCodePpmDecl) {
		this.decCodePpmDecl = decCodePpmDecl;
	}

	public java.lang.String getDecCodeAgreeDecl() {
		return decCodeAgreeDecl;
	}

	public void setDecCodeAgreeDecl(java.lang.String decCodeAgreeDecl) {
		this.decCodeAgreeDecl = decCodeAgreeDecl;
	}

	public java.lang.String getDecNumRepertoire() {
		return decNumRepertoire;
	}

	public void setDecNumRepertoire(java.lang.String decNumRepertoire) {
		this.decNumRepertoire = decNumRepertoire;
	}

	public java.lang.String getDecCodePaysProv() {
		return decCodePaysProv;
	}

	public void setDecCodePaysProv(java.lang.String decCodePaysProv) {
		this.decCodePaysProv = decCodePaysProv;
	}

	public java.lang.String getDecModeTransport() {
		return decModeTransport;
	}

	public void setDecModeTransport(java.lang.String decModeTransport) {
		this.decModeTransport = decModeTransport;
	}

	public java.lang.String getDecMoyenTrans() {
		return decMoyenTrans;
	}

	public void setDecMoyenTrans(java.lang.String decMoyenTrans) {
		this.decMoyenTrans = decMoyenTrans;
	}

	public java.lang.String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(java.lang.String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public java.sql.Date getDecDateCreation() {
		return decDateCreation;
	}

	public void setDecDateCreation(java.sql.Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}

	public java.sql.Date getDecDateEnreg() {
		return decDateEnreg;
	}

	public void setDecDateEnreg(java.sql.Date decDateEnreg) {
		this.decDateEnreg = decDateEnreg;
	}

	public java.lang.String getDecCodePaysDest() {
		return decCodePaysDest;
	}

	public void setDecCodePaysDest(java.lang.String decCodePaysDest) {
		this.decCodePaysDest = decCodePaysDest;
	}

	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(java.lang.Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public java.lang.String getDecTypeMessage() {
		return decTypeMessage;
	}

	public void setDecTypeMessage(java.lang.String decTypeMessage) {
		this.decTypeMessage = decTypeMessage;
	}

	public java.lang.String getDecEtatDecl() {
		return decEtatDecl;
	}

	public void setDecEtatDecl(java.lang.String decEtatDecl) {
		this.decEtatDecl = decEtatDecl;
	}

	public java.lang.Integer getDecNumMessage() {
		return decNumMessage;
	}

	public void setDecNumMessage(java.lang.Integer decNumMessage) {
		this.decNumMessage = decNumMessage;
	}

	public java.lang.String getDecAgreCtifVisite() {
		return decAgreCtifVisite;
	}

	public void setDecAgreCtifVisite(java.lang.String decAgreCtifVisite) {
		this.decAgreCtifVisite = decAgreCtifVisite;
	}

	public java.sql.Date getDecDateEnlevement() {
		return decDateEnlevement;
	}

	public void setDecDateEnlevement(java.sql.Date decDateEnlevement) {
		this.decDateEnlevement = decDateEnlevement;
	}
	
	public List<SegArtDec> getSegArtDecTransb() {
		return segArtDecTransb;
	}

	public void setSegArtDecTransb(List<SegArtDec> segArtDecTransb) {
		this.segArtDecTransb = segArtDecTransb;
	}
	 
}
