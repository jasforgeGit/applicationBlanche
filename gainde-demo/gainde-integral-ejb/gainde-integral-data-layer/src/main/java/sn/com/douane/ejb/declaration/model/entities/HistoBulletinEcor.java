/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HistoBulletinEcorKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(HistoBulletinEcorKey.class)
@Table(name = "HISTOBULLETINECOR")
public class HistoBulletinEcor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1410558669877581593L;
	
	@Id
	@Column(name = "ECORANNEE", length = 4, nullable = false)
	private java.lang.String ecorAnnee;
	
	@Id
	@Column(name = "ECORCODEBUREAU", length = 3, nullable = false)
    private java.lang.String ecorCodeBureau;
	
	@Id
	@Column(name = "ECORNUMERO", nullable = false)
    private java.lang.Integer ecorNumero;
	
	@Id
	@Column(name = "ECORDATEDERNIERMAJ", nullable = false)
    private java.sql.Timestamp ecorDateDernierMaj;
	
	@Column(name = "ECORNOMVOYAGEUR", length = 100)
    private java.lang.String ecorNomVoyageur;
	
	@Column(name = "ECORADRESSEVOYAGEUR", length = 100)
    private java.lang.String ecorAdresseVoyageur;
	
	@Column(name = "ECORMODETRANSPORT", length = 1)
    private java.lang.String ecorModeTransport;
	
	@Column(name = "ECORMOYENTRANSPORT", length = 100)
    private java.lang.String ecorMoyenTransport;
	
	@Column(name = "ECORIDMOYENTTRANSPORT", length = 100)
    private java.lang.String ecorIdMoyenTTransport;
	
	@Column(name = "ECORPAYSPROVENANCE", length = 3)
    private java.lang.String ecorPaysProvenance;
	
	@Column(name = "ECORNBREARTICLE")
    private java.lang.Integer ecorNbreArticle;
	
	@Column(name = "ECORDATEECOR")
    private java.sql.Date ecorDateEcor;
	
	@Column(name = "ECORDATETRANSPORT")
    private java.sql.Date ecorDateTransport;
	
	@Column(name = "ECORTYPEPIECEIDVOYAGEUR", length = 10)
    private java.lang.String ecorTypePieceIdVoyageur;
	
	@Column(name = "ECORNUMPIECEVOYAGEUR", length = 50)
    private java.lang.String ecorNumPieceVoyageur;
	
	@Column(name = "ECORDATEEMISSIONPIECE")
    private java.sql.Date ecorDateEmissionPiece;
	
	@Column(name = "ECORLIEUEMISSIONPIECE", length = 50)
    private java.lang.String ecorLieuEmissionPiece;
	
	@Column(name = "ECORCODEAGENTECOREUR1", length = 5)
    private java.lang.String ecorCodeAgentEcoreur1;
	
	@Column(name = "ECORCODEAGENTECOREUR2", length = 5)
    private java.lang.String ecorCodeAgentEcoreur2;
	
	@Column(name = "ECORCODEAGENTVALIDEUR", length = 5)
    private java.lang.String ecorCodeAgentValideur;
	
	@Column(name = "ECORDATEVALIDATION")
    private java.sql.Date ecorDateValidation;
	
	@Column(name = "ECORCODEAGENTMAJ", length = 5)
    private java.lang.String ecorCodeAgentMaj;
	
	@Column(name = "ECORMONTANTTOTAL", columnDefinition = "DECIMAL(18,0)")
    private java.math.BigDecimal ecormontanttotal;
	
	@Column(name = "ECORCODEAGENTDEPOTPROV", length = 5)
    private java.lang.String ecorCodeAgentDepotProv;
	
	@Column(name = "ECORDATEDEPOTPROV")
    private java.sql.Date ecorDateDepotProv;
	
	@Column(name = "ECORCODEAGENTDEPOTDEF", length = 5)
    private java.lang.String ecorCodeAgentDepotDef;
	
	@Column(name = "ECORDATEDEPOTDEF")
    private java.sql.Date ecorDateDepotDef;
	
	@OneToMany(mappedBy = "histoBulletinEcor", targetEntity = HistoArticleEcor.class)
    private List<HistoArticleEcor> histoArticleEcor;
	


	/**
	 * 
	 */
	public HistoBulletinEcor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ecorAnnee
	 * @param ecorCodeBureau
	 * @param ecorNumero
	 * @param ecorDateDernierMaj
	 */
	public HistoBulletinEcor(String ecorAnnee, String ecorCodeBureau,
			Integer ecorNumero, Timestamp ecorDateDernierMaj) {
		super();
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}
	


	/**
	 * @return the ecorAnnee
	 */
	public java.lang.String getEcorAnnee() {
		return ecorAnnee;
	}

	/**
	 * @param ecorAnnee the ecorAnnee to set
	 */
	public void setEcorAnnee(java.lang.String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}

	/**
	 * @return the ecorCodeBureau
	 */
	public java.lang.String getEcorCodeBureau() {
		return ecorCodeBureau;
	}

	/**
	 * @param ecorCodeBureau the ecorCodeBureau to set
	 */
	public void setEcorCodeBureau(java.lang.String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}

	/**
	 * @return the ecorNumero
	 */
	public java.lang.Integer getEcorNumero() {
		return ecorNumero;
	}

	/**
	 * @param ecorNumero the ecorNumero to set
	 */
	public void setEcorNumero(java.lang.Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}

	/**
	 * @return the ecorDateDernierMaj
	 */
	public java.sql.Timestamp getEcorDateDernierMaj() {
		return ecorDateDernierMaj;
	}

	/**
	 * @param ecorDateDernierMaj the ecorDateDernierMaj to set
	 */
	public void setEcorDateDernierMaj(java.sql.Timestamp ecorDateDernierMaj) {
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}

	/**
	 * @return the ecorNomVoyageur
	 */
	public java.lang.String getEcorNomVoyageur() {
		return ecorNomVoyageur;
	}

	/**
	 * @param ecorNomVoyageur the ecorNomVoyageur to set
	 */
	public void setEcorNomVoyageur(java.lang.String ecorNomVoyageur) {
		this.ecorNomVoyageur = ecorNomVoyageur;
	}

	/**
	 * @return the ecorAdresseVoyageur
	 */
	public java.lang.String getEcorAdresseVoyageur() {
		return ecorAdresseVoyageur;
	}

	/**
	 * @param ecorAdresseVoyageur the ecorAdresseVoyageur to set
	 */
	public void setEcorAdresseVoyageur(java.lang.String ecorAdresseVoyageur) {
		this.ecorAdresseVoyageur = ecorAdresseVoyageur;
	}

	/**
	 * @return the ecorModeTransport
	 */
	public java.lang.String getEcorModeTransport() {
		return ecorModeTransport;
	}

	/**
	 * @param ecorModeTransport the ecorModeTransport to set
	 */
	public void setEcorModeTransport(java.lang.String ecorModeTransport) {
		this.ecorModeTransport = ecorModeTransport;
	}

	/**
	 * @return the ecorMoyenTransport
	 */
	public java.lang.String getEcorMoyenTransport() {
		return ecorMoyenTransport;
	}

	/**
	 * @param ecorMoyenTransport the ecorMoyenTransport to set
	 */
	public void setEcorMoyenTransport(java.lang.String ecorMoyenTransport) {
		this.ecorMoyenTransport = ecorMoyenTransport;
	}

	/**
	 * @return the ecorIdMoyenTTransport
	 */
	public java.lang.String getEcorIdMoyenTTransport() {
		return ecorIdMoyenTTransport;
	}

	/**
	 * @param ecorIdMoyenTTransport the ecorIdMoyenTTransport to set
	 */
	public void setEcorIdMoyenTTransport(java.lang.String ecorIdMoyenTTransport) {
		this.ecorIdMoyenTTransport = ecorIdMoyenTTransport;
	}

	/**
	 * @return the ecorPaysProvenance
	 */
	public java.lang.String getEcorPaysProvenance() {
		return ecorPaysProvenance;
	}

	/**
	 * @param ecorPaysProvenance the ecorPaysProvenance to set
	 */
	public void setEcorPaysProvenance(java.lang.String ecorPaysProvenance) {
		this.ecorPaysProvenance = ecorPaysProvenance;
	}

	/**
	 * @return the ecorNbreArticle
	 */
	public java.lang.Integer getEcorNbreArticle() {
		return ecorNbreArticle;
	}

	/**
	 * @param ecorNbreArticle the ecorNbreArticle to set
	 */
	public void setEcorNbreArticle(java.lang.Integer ecorNbreArticle) {
		this.ecorNbreArticle = ecorNbreArticle;
	}

	/**
	 * @return the ecorDateEcor
	 */
	public java.sql.Date getEcorDateEcor() {
		return ecorDateEcor;
	}

	/**
	 * @param ecorDateEcor the ecorDateEcor to set
	 */
	public void setEcorDateEcor(java.sql.Date ecorDateEcor) {
		this.ecorDateEcor = ecorDateEcor;
	}

	/**
	 * @return the ecorDateTransport
	 */
	public java.sql.Date getEcorDateTransport() {
		return ecorDateTransport;
	}

	/**
	 * @param ecorDateTransport the ecorDateTransport to set
	 */
	public void setEcorDateTransport(java.sql.Date ecorDateTransport) {
		this.ecorDateTransport = ecorDateTransport;
	}

	/**
	 * @return the ecorTypePieceIdVoyageur
	 */
	public java.lang.String getEcorTypePieceIdVoyageur() {
		return ecorTypePieceIdVoyageur;
	}

	/**
	 * @param ecorTypePieceIdVoyageur the ecorTypePieceIdVoyageur to set
	 */
	public void setEcorTypePieceIdVoyageur(java.lang.String ecorTypePieceIdVoyageur) {
		this.ecorTypePieceIdVoyageur = ecorTypePieceIdVoyageur;
	}

	/**
	 * @return the ecorNumPieceVoyageur
	 */
	public java.lang.String getEcorNumPieceVoyageur() {
		return ecorNumPieceVoyageur;
	}

	/**
	 * @param ecorNumPieceVoyageur the ecorNumPieceVoyageur to set
	 */
	public void setEcorNumPieceVoyageur(java.lang.String ecorNumPieceVoyageur) {
		this.ecorNumPieceVoyageur = ecorNumPieceVoyageur;
	}

	/**
	 * @return the ecorDateEmissionPiece
	 */
	public java.sql.Date getEcorDateEmissionPiece() {
		return ecorDateEmissionPiece;
	}

	/**
	 * @param ecorDateEmissionPiece the ecorDateEmissionPiece to set
	 */
	public void setEcorDateEmissionPiece(java.sql.Date ecorDateEmissionPiece) {
		this.ecorDateEmissionPiece = ecorDateEmissionPiece;
	}

	/**
	 * @return the ecorLieuEmissionPiece
	 */
	public java.lang.String getEcorLieuEmissionPiece() {
		return ecorLieuEmissionPiece;
	}

	/**
	 * @param ecorLieuEmissionPiece the ecorLieuEmissionPiece to set
	 */
	public void setEcorLieuEmissionPiece(java.lang.String ecorLieuEmissionPiece) {
		this.ecorLieuEmissionPiece = ecorLieuEmissionPiece;
	}

	/**
	 * @return the ecorCodeAgentEcoreur1
	 */
	public java.lang.String getEcorCodeAgentEcoreur1() {
		return ecorCodeAgentEcoreur1;
	}

	/**
	 * @param ecorCodeAgentEcoreur1 the ecorCodeAgentEcoreur1 to set
	 */
	public void setEcorCodeAgentEcoreur1(java.lang.String ecorCodeAgentEcoreur1) {
		this.ecorCodeAgentEcoreur1 = ecorCodeAgentEcoreur1;
	}

	/**
	 * @return the ecorCodeAgentEcoreur2
	 */
	public java.lang.String getEcorCodeAgentEcoreur2() {
		return ecorCodeAgentEcoreur2;
	}

	/**
	 * @param ecorCodeAgentEcoreur2 the ecorCodeAgentEcoreur2 to set
	 */
	public void setEcorCodeAgentEcoreur2(java.lang.String ecorCodeAgentEcoreur2) {
		this.ecorCodeAgentEcoreur2 = ecorCodeAgentEcoreur2;
	}

	/**
	 * @return the ecorCodeAgentValideur
	 */
	public java.lang.String getEcorCodeAgentValideur() {
		return ecorCodeAgentValideur;
	}

	/**
	 * @param ecorCodeAgentValideur the ecorCodeAgentValideur to set
	 */
	public void setEcorCodeAgentValideur(java.lang.String ecorCodeAgentValideur) {
		this.ecorCodeAgentValideur = ecorCodeAgentValideur;
	}

	/**
	 * @return the ecorDateValidation
	 */
	public java.sql.Date getEcorDateValidation() {
		return ecorDateValidation;
	}

	/**
	 * @param ecorDateValidation the ecorDateValidation to set
	 */
	public void setEcorDateValidation(java.sql.Date ecorDateValidation) {
		this.ecorDateValidation = ecorDateValidation;
	}

	/**
	 * @return the ecorCodeAgentMaj
	 */
	public java.lang.String getEcorCodeAgentMaj() {
		return ecorCodeAgentMaj;
	}

	/**
	 * @param ecorCodeAgentMaj the ecorCodeAgentMaj to set
	 */
	public void setEcorCodeAgentMaj(java.lang.String ecorCodeAgentMaj) {
		this.ecorCodeAgentMaj = ecorCodeAgentMaj;
	}

	/**
	 * @return the ecormontanttotal
	 */
	public java.math.BigDecimal getEcormontanttotal() {
		return ecormontanttotal;
	}

	/**
	 * @param ecormontanttotal the ecormontanttotal to set
	 */
	public void setEcormontanttotal(java.math.BigDecimal ecormontanttotal) {
		this.ecormontanttotal = ecormontanttotal;
	}

	/**
	 * @return the ecorCodeAgentDepotProv
	 */
	public java.lang.String getEcorCodeAgentDepotProv() {
		return ecorCodeAgentDepotProv;
	}

	/**
	 * @param ecorCodeAgentDepotProv the ecorCodeAgentDepotProv to set
	 */
	public void setEcorCodeAgentDepotProv(java.lang.String ecorCodeAgentDepotProv) {
		this.ecorCodeAgentDepotProv = ecorCodeAgentDepotProv;
	}

	/**
	 * @return the ecorDateDepotProv
	 */
	public java.sql.Date getEcorDateDepotProv() {
		return ecorDateDepotProv;
	}

	/**
	 * @param ecorDateDepotProv the ecorDateDepotProv to set
	 */
	public void setEcorDateDepotProv(java.sql.Date ecorDateDepotProv) {
		this.ecorDateDepotProv = ecorDateDepotProv;
	}

	/**
	 * @return the ecorCodeAgentDepotDef
	 */
	public java.lang.String getEcorCodeAgentDepotDef() {
		return ecorCodeAgentDepotDef;
	}

	/**
	 * @param ecorCodeAgentDepotDef the ecorCodeAgentDepotDef to set
	 */
	public void setEcorCodeAgentDepotDef(java.lang.String ecorCodeAgentDepotDef) {
		this.ecorCodeAgentDepotDef = ecorCodeAgentDepotDef;
	}

	/**
	 * @return the ecorDateDepotDef
	 */
	public java.sql.Date getEcorDateDepotDef() {
		return ecorDateDepotDef;
	}

	/**
	 * @param ecorDateDepotDef the ecorDateDepotDef to set
	 */
	public void setEcorDateDepotDef(java.sql.Date ecorDateDepotDef) {
		this.ecorDateDepotDef = ecorDateDepotDef;
	}

	/**
	 * @return the histoArticleEcor
	 */
	public List<HistoArticleEcor> getHistoArticleEcor() {
		return histoArticleEcor;
	}

	/**
	 * @param histoArticleEcor the histoArticleEcor to set
	 */
	public void setHistoArticleEcor(List<HistoArticleEcor> histoArticleEcor) {
		this.histoArticleEcor = histoArticleEcor;
	}
	
}
