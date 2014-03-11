/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.DdeRegularisationKey;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(DdeRegularisationKey.class)
@Table(name="DDEREGULARISATION")

public class DdeRegularisation implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4318690915108258789L;
	
	@Column(name="MANIFANNEEENREGLTAMERE", length=4)
	private java.lang.String manifAnneeEnregLtaMere;
	
	@Column(name="MANIFBUREAUENREGLTAMERE", length=3)
	private java.lang.String manifBureauEnregLtaMere;
	
	@Column(name="MANIFNUMENREGLTAGRP")
	private java.lang.Integer manifNumEnregLtaGrp;
	
	@Column(name="MANIFNUMARTICLELTAMERE")
	private java.lang.Integer manifNumArticleLtaMere;
	
	@Column(name="MANIFPRECISREGULART")
	private java.lang.Integer manifPrecisRegulArt;
	
	@Column(name="MANIFCODECONSIGNATAIRE", length=5)
	private java.lang.String manifCodeConsignataire;
	
	@Column(name="MANIFETATARTICLEMANIF", length=2)
	private java.lang.String manifEtatArticleManif;
	
	@Column(name="MANIFETATDEMANDESURMANIF", length=1)
	private java.lang.String manifEtatDemandeSurManif;
	
	@Column(name="MANIFCODELIEUEMBARQ", length=5)
	private java.lang.String manifCodeLieuEmbarq;
	
	@Column(name="MANIFNBRECOLIS")
	private java.lang.Integer manifNbreColis;
	
	@Column(name="MANIFNUMREP", length=6)
	private java.lang.String manifNumRep;
	
	@Column(name="MANIFNUMTITRETRANSPORT", length=12)
	private java.lang.String manifNumTitreTransport;
	
	@Column(name="MANIFPOIDSBRUTMANIF", columnDefinition="DECIMAL(9 , 0)")
	private java.math.BigDecimal manifPoidsBrutManif;
	
	@Column(name="MANIFUTILISATEURRECTIFCOQ", length=7)
	private java.lang.String manifUtilisateurRectifCoq;
	
	@Column(name="MANIFNUMMESSAGE")
	private java.lang.Integer manifNumMessage;
	
	@Column(name="MANIFDATECREATION")
	private java.sql.Date manifDateCreation;
	
	@Id
	@Column(name="MANIFBUREAUENREGMANIF", length=3, nullable=false)
	private java.lang.String manifBureauEngManif;
	
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
	private java.lang.String manifAnneeEngManif;
	
	@Id
	@Column(name="MANIFNUMEROENREGMANIF", nullable=false)
	private java.lang.Integer manifNumEnregManif;
	
	@Id
	@Column(name="MANIFNUMEROARTMANIF", nullable=false)
	private java.lang.Integer manifNumArticleManif;
	
	@Id
	@Column(name="MANIFPRECISIONARTMANIF", nullable=false)
	private java.lang.Integer manifPrecisArtManif;
	
	@Id
	@Column(name="MANIFPRECISIONARTMANIF2", nullable=false)
	private java.lang.Integer manifPrecisArtManif2;
	
	@ManyToOne(targetEntity = ArticleManifeste.class)
    @JoinColumns(value = { 
    	  @JoinColumn(name="MANIFBUREAUENREGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
		  @JoinColumn(name="MANIFANNEEENREGMANIF", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="MANIFNUMEROENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="MANIFNUMEROARTMANIF", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="MANIFPRECISIONARTMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
		  @JoinColumn(name="MANIFPRECISIONARTMANIF2", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
		  })
    private ArticleManifeste articleManifeste;

	/**
	 * 
	 */
	public DdeRegularisation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param manifAnneeEnregLtaMere
	 * @param manifBureauEnregLtaMere
	 * @param manifNumEnregLtaGrp
	 * @param manifNumArticleLtaMere
	 * @param manifPrecisRegulArt
	 * @param manifCodeConsignataire
	 * @param manifEtatArticleManif
	 * @param manifEtatDemandeSurManif
	 * @param manifCodeLieuEmbarq
	 * @param manifNbreColis
	 * @param manifNumRep
	 * @param manifNumTitreTransport
	 * @param manifPoidsBrutManif
	 * @param manifUtilisateurRectifCoq
	 * @param manifNumMessage
	 * @param manifDateCreation
	 * @param manifBureauEngManif
	 * @param manifAnneeEngManif
	 * @param manifNumEnregManif
	 * @param manifNumArticleManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 * @param ddeRectifArtMan
	 */
	public DdeRegularisation(String manifAnneeEnregLtaMere,
			String manifBureauEnregLtaMere, Integer manifNumEnregLtaGrp,
			Integer manifNumArticleLtaMere, Integer manifPrecisRegulArt,
			String manifCodeConsignataire, String manifEtatArticleManif,
			String manifEtatDemandeSurManif, String manifCodeLieuEmbarq,
			Integer manifNbreColis, String manifNumRep,
			String manifNumTitreTransport, BigDecimal manifPoidsBrutManif,
			String manifUtilisateurRectifCoq, Integer manifNumMessage,
			Date manifDateCreation, String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2) {
		super();
		this.manifAnneeEnregLtaMere = manifAnneeEnregLtaMere;
		this.manifBureauEnregLtaMere = manifBureauEnregLtaMere;
		this.manifNumEnregLtaGrp = manifNumEnregLtaGrp;
		this.manifNumArticleLtaMere = manifNumArticleLtaMere;
		this.manifPrecisRegulArt = manifPrecisRegulArt;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifEtatArticleManif = manifEtatArticleManif;
		this.manifEtatDemandeSurManif = manifEtatDemandeSurManif;
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
		this.manifNbreColis = manifNbreColis;
		this.manifNumRep = manifNumRep;
		this.manifNumTitreTransport = manifNumTitreTransport;
		this.manifPoidsBrutManif = manifPoidsBrutManif;
		this.manifUtilisateurRectifCoq = manifUtilisateurRectifCoq;
		this.manifNumMessage = manifNumMessage;
		this.manifDateCreation = manifDateCreation;
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	//	this.ddeRectifArtMan = ddeRectifArtMan;
	}

	/**
	 * @return the manifAnneeEnregLtaMere
	 */
	public java.lang.String getManifAnneeEnregLtaMere() {
		return manifAnneeEnregLtaMere;
	}

	/**
	 * @param manifAnneeEnregLtaMere the manifAnneeEnregLtaMere to set
	 */
	public void setManifAnneeEnregLtaMere(java.lang.String manifAnneeEnregLtaMere) {
		this.manifAnneeEnregLtaMere = manifAnneeEnregLtaMere;
	}

	/**
	 * @return the manifBureauEnregLtaMere
	 */
	public java.lang.String getManifBureauEnregLtaMere() {
		return manifBureauEnregLtaMere;
	}

	/**
	 * @param manifBureauEnregLtaMere the manifBureauEnregLtaMere to set
	 */
	public void setManifBureauEnregLtaMere(java.lang.String manifBureauEnregLtaMere) {
		this.manifBureauEnregLtaMere = manifBureauEnregLtaMere;
	}

	/**
	 * @return the manifNumEnregLtaGrp
	 */
	public java.lang.Integer getManifNumEnregLtaGrp() {
		return manifNumEnregLtaGrp;
	}

	/**
	 * @param manifNumEnregLtaGrp the manifNumEnregLtaGrp to set
	 */
	public void setManifNumEnregLtaGrp(java.lang.Integer manifNumEnregLtaGrp) {
		this.manifNumEnregLtaGrp = manifNumEnregLtaGrp;
	}

	/**
	 * @return the manifNumArticleLtaMere
	 */
	public java.lang.Integer getManifNumArticleLtaMere() {
		return manifNumArticleLtaMere;
	}

	/**
	 * @param manifNumArticleLtaMere the manifNumArticleLtaMere to set
	 */
	public void setManifNumArticleLtaMere(java.lang.Integer manifNumArticleLtaMere) {
		this.manifNumArticleLtaMere = manifNumArticleLtaMere;
	}

	/**
	 * @return the manifPrecisRegulArt
	 */
	public java.lang.Integer getManifPrecisRegulArt() {
		return manifPrecisRegulArt;
	}

	/**
	 * @param manifPrecisRegulArt the manifPrecisRegulArt to set
	 */
	public void setManifPrecisRegulArt(java.lang.Integer manifPrecisRegulArt) {
		this.manifPrecisRegulArt = manifPrecisRegulArt;
	}

	/**
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
	}

	/**
	 * @return the manifEtatArticleManif
	 */
	public java.lang.String getManifEtatArticleManif() {
		return manifEtatArticleManif;
	}

	/**
	 * @param manifEtatArticleManif the manifEtatArticleManif to set
	 */
	public void setManifEtatArticleManif(java.lang.String manifEtatArticleManif) {
		this.manifEtatArticleManif = manifEtatArticleManif;
	}

	/**
	 * @return the manifEtatDemandeSurManif
	 */
	public java.lang.String getManifEtatDemandeSurManif() {
		return manifEtatDemandeSurManif;
	}

	/**
	 * @param manifEtatDemandeSurManif the manifEtatDemandeSurManif to set
	 */
	public void setManifEtatDemandeSurManif(
			java.lang.String manifEtatDemandeSurManif) {
		this.manifEtatDemandeSurManif = manifEtatDemandeSurManif;
	}

	/**
	 * @return the manifCodeLieuEmbarq
	 */
	public java.lang.String getManifCodeLieuEmbarq() {
		return manifCodeLieuEmbarq;
	}

	/**
	 * @param manifCodeLieuEmbarq the manifCodeLieuEmbarq to set
	 */
	public void setManifCodeLieuEmbarq(java.lang.String manifCodeLieuEmbarq) {
		this.manifCodeLieuEmbarq = manifCodeLieuEmbarq;
	}

	/**
	 * @return the manifNbreColis
	 */
	public java.lang.Integer getManifNbreColis() {
		return manifNbreColis;
	}

	/**
	 * @param manifNbreColis the manifNbreColis to set
	 */
	public void setManifNbreColis(java.lang.Integer manifNbreColis) {
		this.manifNbreColis = manifNbreColis;
	}

	/**
	 * @return the manifNumRep
	 */
	public java.lang.String getManifNumRep() {
		return manifNumRep;
	}

	/**
	 * @param manifNumRep the manifNumRep to set
	 */
	public void setManifNumRep(java.lang.String manifNumRep) {
		this.manifNumRep = manifNumRep;
	}

	/**
	 * @return the manifNumTitreTransport
	 */
	public java.lang.String getManifNumTitreTransport() {
		return manifNumTitreTransport;
	}

	/**
	 * @param manifNumTitreTransport the manifNumTitreTransport to set
	 */
	public void setManifNumTitreTransport(java.lang.String manifNumTitreTransport) {
		this.manifNumTitreTransport = manifNumTitreTransport;
	}

	/**
	 * @return the manifPoidsBrutManif
	 */
	public java.math.BigDecimal getManifPoidsBrutManif() {
		return manifPoidsBrutManif;
	}

	/**
	 * @param manifPoidsBrutManif the manifPoidsBrutManif to set
	 */
	public void setManifPoidsBrutManif(java.math.BigDecimal manifPoidsBrutManif) {
		this.manifPoidsBrutManif = manifPoidsBrutManif;
	}

	/**
	 * @return the manifUtilisateurRectifCoq
	 */
	public java.lang.String getManifUtilisateurRectifCoq() {
		return manifUtilisateurRectifCoq;
	}

	/**
	 * @param manifUtilisateurRectifCoq the manifUtilisateurRectifCoq to set
	 */
	public void setManifUtilisateurRectifCoq(
			java.lang.String manifUtilisateurRectifCoq) {
		this.manifUtilisateurRectifCoq = manifUtilisateurRectifCoq;
	}

	/**
	 * @return the manifNumMessage
	 */
	public java.lang.Integer getManifNumMessage() {
		return manifNumMessage;
	}

	/**
	 * @param manifNumMessage the manifNumMessage to set
	 */
	public void setManifNumMessage(java.lang.Integer manifNumMessage) {
		this.manifNumMessage = manifNumMessage;
	}

	/**
	 * @return the manifDateCreation
	 */
	public java.sql.Date getManifDateCreation() {
		return manifDateCreation;
	}

	/**
	 * @param manifDateCreation the manifDateCreation to set
	 */
	public void setManifDateCreation(java.sql.Date manifDateCreation) {
		this.manifDateCreation = manifDateCreation;
	}

	/**
	 * @return the manifBureauEngManif
	 */
	public java.lang.String getManifBureauEngManif() {
		return manifBureauEngManif;
	}

	/**
	 * @param manifBureauEngManif the manifBureauEngManif to set
	 */
	public void setManifBureauEngManif(java.lang.String manifBureauEngManif) {
		this.manifBureauEngManif = manifBureauEngManif;
	}

	/**
	 * @return the manifAnneeEngManif
	 */
	public java.lang.String getManifAnneeEngManif() {
		return manifAnneeEngManif;
	}

	/**
	 * @param manifAnneeEngManif the manifAnneeEngManif to set
	 */
	public void setManifAnneeEngManif(java.lang.String manifAnneeEngManif) {
		this.manifAnneeEngManif = manifAnneeEngManif;
	}

	/**
	 * @return the manifNumEnregManif
	 */
	public java.lang.Integer getManifNumEnregManif() {
		return manifNumEnregManif;
	}

	/**
	 * @param manifNumEnregManif the manifNumEnregManif to set
	 */
	public void setManifNumEnregManif(java.lang.Integer manifNumEnregManif) {
		this.manifNumEnregManif = manifNumEnregManif;
	}

	/**
	 * @return the manifNumArticleManif
	 */
	public java.lang.Integer getManifNumArticleManif() {
		return manifNumArticleManif;
	}

	/**
	 * @param manifNumArticleManif the manifNumArticleManif to set
	 */
	public void setManifNumArticleManif(java.lang.Integer manifNumArticleManif) {
		this.manifNumArticleManif = manifNumArticleManif;
	}

	/**
	 * @return the manifPrecisArtManif
	 */
	public java.lang.Integer getManifPrecisArtManif() {
		return manifPrecisArtManif;
	}

	/**
	 * @param manifPrecisArtManif the manifPrecisArtManif to set
	 */
	public void setManifPrecisArtManif(java.lang.Integer manifPrecisArtManif) {
		this.manifPrecisArtManif = manifPrecisArtManif;
	}

	/**
	 * @return the manifPrecisArtManif2
	 */
	public java.lang.Integer getManifPrecisArtManif2() {
		return manifPrecisArtManif2;
	}

	/**
	 * @param manifPrecisArtManif2 the manifPrecisArtManif2 to set
	 */
	public void setManifPrecisArtManif2(java.lang.Integer manifPrecisArtManif2) {
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	}

	/**
	 * @return the articleManifeste
	 */
	public ArticleManifeste getArticleManifeste() {
		return articleManifeste;
	}

	/**
	 * @param articleManifeste the articleManifeste to set
	 */
	public void setArticleManifeste(ArticleManifeste articleManifeste) {
		this.articleManifeste = articleManifeste;
	}

//	/**
//	 * @return the ddeRectifArtMan
//	 */
//	public DdeRectifArtMan getDdeRectifArtMan() {
//		return ddeRectifArtMan;
//	}
//
//	/**
//	 * @param ddeRectifArtMan the ddeRectifArtMan to set
//	 */
//	public void setDdeRectifArtMan(DdeRectifArtMan ddeRectifArtMan) {
//		this.ddeRectifArtMan = ddeRectifArtMan;
//	}

	
}