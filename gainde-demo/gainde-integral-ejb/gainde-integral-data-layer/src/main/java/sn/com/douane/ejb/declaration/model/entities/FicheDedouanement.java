package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.FicheDedouanementKey;



@Entity
@IdClass(FicheDedouanementKey.class)
@Table(name="FICHEDEDOUANEMENT")
public class FicheDedouanement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4962492536375664055L;

	@Id
	@Column(name="ECORANNEE", length=4, nullable=false)
	 private java.lang.String ecorAnnee;
	
	@Id
	@Column(name="ECORCODEBUREAU", length=3, nullable=false)
	    private java.lang.String ecorCodeBureau;
	
	@Id
	@Column(name="ECORNUMERO", nullable=false)
	    private java.lang.Integer ecorNumero;
	
	@Column(name="ECORNOMVOYAGEUR", length=100)
	    private java.lang.String ecorNomVoyageur;
	
	@Column(name="ECORADRESSEVOYAGEUR", length=100)
	    private java.lang.String ecorAdresseVoyageur;
	
	@Column(name="ECORMODETRANSPORT", length=1)
	    private java.lang.String ecorModeTransport;
	
	@Column(name="ECORMOYENTRANSPORT", length=100)
	    private java.lang.String ecorMoyenTransport;
	
	@Column(name="ECORIDMOYENTTRANSPORT", length=100)
	    private java.lang.String ecorIdMoyenTTransport;
	
	@Column(name="ECORPAYSPROVENANCE", length=3)
	    private java.lang.String ecorPaysProvenance;
	
	@Column(name="ECORNBREARTICLE")
	    private java.lang.Integer ecorNbreArticle;
	
	@Column(name="ECORDATEECOR")
	    private java.sql.Date ecorDateEcor;
	
	@Column(name="ECORDATETRANSPORT")
	    private java.sql.Date ecorDateTransport;
	
	@Column(name="ECORTYPEPIECEIDVOYAGEUR", length=10)
	    private java.lang.String ecorTypePieceIdVoyageur;
	
	@Column(name="ECORNUMPIECEVOYAGEUR", length=50)
	    private java.lang.String ecorNumPieceVoyageur;
	
	@Column(name="ECORDATEEMISSIONPIECE")
	    private java.sql.Date ecorDateEmissionPiece;
	
	@Column(name="ECORLIEUEMISSIONPIECE", length=50)
	    private java.lang.String ecorLieuEmissionPiece;
	
	@Column(name="ECORCODEAGENTECOREUR1", length=5)
	    private java.lang.String ecorCodeAgentEcoreur1;
	
	@Column(name="ECORCODEAGENTECOREUR2", length=5)
	    private java.lang.String ecorCodeAgentEcoreur2;
	
	@Column(name="ECORCODEAGENTVALIDEUR", length=5)
	    private java.lang.String ecorCodeAgentValideur;
	
	@Column(name="ECORDATEVALIDATION")
	    private java.sql.Date ecorDateValidation;
	
	@Column(name="ECORCODEAGENTMAJ", length=5)
	    private java.lang.String ecorCodeAgentMaj;
	
	@Column(name="ECORDATEDERNIERMAJ")
	    private java.sql.Date ecorDateDernierMaj;
	
	@Column(name="ECORMONTANTTOTAL", columnDefinition = "DECIMAL(18,0)")
	    private java.math.BigDecimal ecorMontantTotal;
	
	@Column(name="ECORCODEAGENTDEPOTPROV", length=5)
	    private java.lang.String ecorCodeAgentDepotProv;
	
	@Column(name="ECORDATEDEPOTPROV")
	    private java.sql.Date ecorDateDepotProv;
	
	@Column(name="ECORCODEAGENTDEPOTDEF", length=5)
	    private java.lang.String ecorCodeAgentDepotDef;
	
	@Column(name="ECORDATEDEPOTDEF")
	    private java.sql.Date ecorDateDepotDef;
	
	@Column(name="ECORDATECREATIONFICHE")
	    private java.sql.Date ecorDateCreationFiche;
	
	@Column(name="ECORMNTDEVIS", columnDefinition = "DECIMAL(18,0)")
	    private java.math.BigDecimal ecorMntDevis;
	
	@Column(name="ECORMNTDROITCOMMUN", columnDefinition = "DECIMAL(18,0)")
	    private java.math.BigDecimal ecorMntDroitCommun;
	
	@Column(name="ECORDATEBAE")
	    private java.sql.Date ecorDateBae;
	
	@Column(name="ECORCODEAGENTBAE")
	private Date ecorCodeAgentBae;
	
	@OneToMany(targetEntity = ArticleFicheDedouanement.class, mappedBy = "artFiche")
	private List<ArticleFicheDedouanement> articleFicheDedouanement;

	public FicheDedouanement(String ecorAnnee, String ecorCodeBureau,
			Integer ecorNumero, String ecorNomVoyageur,
			String ecorAdresseVoyageur, String ecorModeTransport,
			String ecorMoyenTransport, String ecorIdMoyenTTransport,
			String ecorPaysProvenance, Integer ecorNbreArticle,
			Date ecorDateEcor, Date ecorDateTransport,
			String ecorTypePieceIdVoyageur, String ecorNumPieceVoyageur,
			Date ecorDateEmissionPiece, String ecorLieuEmissionPiece,
			String ecorCodeAgentEcoreur1, String ecorCodeAgentEcoreur2,
			String ecorCodeAgentValideur, Date ecorDateValidation,
			String ecorCodeAgentMaj, Date ecorDateDernierMaj,
			BigDecimal ecorMontantTotal, String ecorCodeAgentDepotProv,
			Date ecorDateDepotProv, String ecorCodeAgentDepotDef,
			Date ecorDateDepotDef, Date ecorDateCreationFiche,
			BigDecimal ecorMntDevis, BigDecimal ecorMntDroitCommun,
			Date ecorDateBae, Date ecorCodeAgentBae) {
		super();
		this.ecorAnnee = ecorAnnee;
		this.ecorCodeBureau = ecorCodeBureau;
		this.ecorNumero = ecorNumero;
		this.ecorNomVoyageur = ecorNomVoyageur;
		this.ecorAdresseVoyageur = ecorAdresseVoyageur;
		this.ecorModeTransport = ecorModeTransport;
		this.ecorMoyenTransport = ecorMoyenTransport;
		this.ecorIdMoyenTTransport = ecorIdMoyenTTransport;
		this.ecorPaysProvenance = ecorPaysProvenance;
		this.ecorNbreArticle = ecorNbreArticle;
		this.ecorDateEcor = ecorDateEcor;
		this.ecorDateTransport = ecorDateTransport;
		this.ecorTypePieceIdVoyageur = ecorTypePieceIdVoyageur;
		this.ecorNumPieceVoyageur = ecorNumPieceVoyageur;
		this.ecorDateEmissionPiece = ecorDateEmissionPiece;
		this.ecorLieuEmissionPiece = ecorLieuEmissionPiece;
		this.ecorCodeAgentEcoreur1 = ecorCodeAgentEcoreur1;
		this.ecorCodeAgentEcoreur2 = ecorCodeAgentEcoreur2;
		this.ecorCodeAgentValideur = ecorCodeAgentValideur;
		this.ecorDateValidation = ecorDateValidation;
		this.ecorCodeAgentMaj = ecorCodeAgentMaj;
		this.ecorDateDernierMaj = ecorDateDernierMaj;
		this.ecorMontantTotal = ecorMontantTotal;
		this.ecorCodeAgentDepotProv = ecorCodeAgentDepotProv;
		this.ecorDateDepotProv = ecorDateDepotProv;
		this.ecorCodeAgentDepotDef = ecorCodeAgentDepotDef;
		this.ecorDateDepotDef = ecorDateDepotDef;
		this.ecorDateCreationFiche = ecorDateCreationFiche;
		this.ecorMntDevis = ecorMntDevis;
		this.ecorMntDroitCommun = ecorMntDroitCommun;
		this.ecorDateBae = ecorDateBae;
		this.ecorCodeAgentBae = ecorCodeAgentBae;
	}

	public FicheDedouanement() {
		super();
	}

	public java.lang.String getEcorAnnee() {
		return ecorAnnee;
	}

	public void setEcorAnnee(java.lang.String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}

	public java.lang.String getEcorCodeBureau() {
		return ecorCodeBureau;
	}

	public void setEcorCodeBureau(java.lang.String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}

	public java.lang.Integer getEcorNumero() {
		return ecorNumero;
	}

	public void setEcorNumero(java.lang.Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}

	public java.lang.String getEcorNomVoyageur() {
		return ecorNomVoyageur;
	}

	public void setEcorNomVoyageur(java.lang.String ecorNomVoyageur) {
		this.ecorNomVoyageur = ecorNomVoyageur;
	}

	public java.lang.String getEcorAdresseVoyageur() {
		return ecorAdresseVoyageur;
	}

	public void setEcorAdresseVoyageur(java.lang.String ecorAdresseVoyageur) {
		this.ecorAdresseVoyageur = ecorAdresseVoyageur;
	}

	public java.lang.String getEcorModeTransport() {
		return ecorModeTransport;
	}

	public void setEcorModeTransport(java.lang.String ecorModeTransport) {
		this.ecorModeTransport = ecorModeTransport;
	}

	public java.lang.String getEcorMoyenTransport() {
		return ecorMoyenTransport;
	}

	public void setEcorMoyenTransport(java.lang.String ecorMoyenTransport) {
		this.ecorMoyenTransport = ecorMoyenTransport;
	}

	public java.lang.String getEcorIdMoyenTTransport() {
		return ecorIdMoyenTTransport;
	}

	public void setEcorIdMoyenTTransport(java.lang.String ecorIdMoyenTTransport) {
		this.ecorIdMoyenTTransport = ecorIdMoyenTTransport;
	}

	public java.lang.String getEcorPaysProvenance() {
		return ecorPaysProvenance;
	}

	public void setEcorPaysProvenance(java.lang.String ecorPaysProvenance) {
		this.ecorPaysProvenance = ecorPaysProvenance;
	}

	public java.lang.Integer getEcorNbreArticle() {
		return ecorNbreArticle;
	}

	public void setEcorNbreArticle(java.lang.Integer ecorNbreArticle) {
		this.ecorNbreArticle = ecorNbreArticle;
	}

	public java.sql.Date getEcorDateEcor() {
		return ecorDateEcor;
	}

	public void setEcorDateEcor(java.sql.Date ecorDateEcor) {
		this.ecorDateEcor = ecorDateEcor;
	}

	public java.sql.Date getEcorDateTransport() {
		return ecorDateTransport;
	}

	public void setEcorDateTransport(java.sql.Date ecorDateTransport) {
		this.ecorDateTransport = ecorDateTransport;
	}

	public java.lang.String getEcorTypePieceIdVoyageur() {
		return ecorTypePieceIdVoyageur;
	}

	public void setEcorTypePieceIdVoyageur(java.lang.String ecorTypePieceIdVoyageur) {
		this.ecorTypePieceIdVoyageur = ecorTypePieceIdVoyageur;
	}

	public java.lang.String getEcorNumPieceVoyageur() {
		return ecorNumPieceVoyageur;
	}

	public void setEcorNumPieceVoyageur(java.lang.String ecorNumPieceVoyageur) {
		this.ecorNumPieceVoyageur = ecorNumPieceVoyageur;
	}

	public java.sql.Date getEcorDateEmissionPiece() {
		return ecorDateEmissionPiece;
	}

	public void setEcorDateEmissionPiece(java.sql.Date ecorDateEmissionPiece) {
		this.ecorDateEmissionPiece = ecorDateEmissionPiece;
	}

	public java.lang.String getEcorLieuEmissionPiece() {
		return ecorLieuEmissionPiece;
	}

	public void setEcorLieuEmissionPiece(java.lang.String ecorLieuEmissionPiece) {
		this.ecorLieuEmissionPiece = ecorLieuEmissionPiece;
	}

	public java.lang.String getEcorCodeAgentEcoreur1() {
		return ecorCodeAgentEcoreur1;
	}

	public void setEcorCodeAgentEcoreur1(java.lang.String ecorCodeAgentEcoreur1) {
		this.ecorCodeAgentEcoreur1 = ecorCodeAgentEcoreur1;
	}

	public java.lang.String getEcorCodeAgentEcoreur2() {
		return ecorCodeAgentEcoreur2;
	}

	public void setEcorCodeAgentEcoreur2(java.lang.String ecorCodeAgentEcoreur2) {
		this.ecorCodeAgentEcoreur2 = ecorCodeAgentEcoreur2;
	}

	public java.lang.String getEcorCodeAgentValideur() {
		return ecorCodeAgentValideur;
	}

	public void setEcorCodeAgentValideur(java.lang.String ecorCodeAgentValideur) {
		this.ecorCodeAgentValideur = ecorCodeAgentValideur;
	}

	public java.sql.Date getEcorDateValidation() {
		return ecorDateValidation;
	}

	public void setEcorDateValidation(java.sql.Date ecorDateValidation) {
		this.ecorDateValidation = ecorDateValidation;
	}

	public java.lang.String getEcorCodeAgentMaj() {
		return ecorCodeAgentMaj;
	}

	public void setEcorCodeAgentMaj(java.lang.String ecorCodeAgentMaj) {
		this.ecorCodeAgentMaj = ecorCodeAgentMaj;
	}

	public java.sql.Date getEcorDateDernierMaj() {
		return ecorDateDernierMaj;
	}

	public void setEcorDateDernierMaj(java.sql.Date ecorDateDernierMaj) {
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}

	public java.math.BigDecimal getEcorMontantTotal() {
		return ecorMontantTotal;
	}

	public void setEcorMontantTotal(java.math.BigDecimal ecorMontantTotal) {
		this.ecorMontantTotal = ecorMontantTotal;
	}

	public java.lang.String getEcorCodeAgentDepotProv() {
		return ecorCodeAgentDepotProv;
	}

	public void setEcorCodeAgentDepotProv(java.lang.String ecorCodeAgentDepotProv) {
		this.ecorCodeAgentDepotProv = ecorCodeAgentDepotProv;
	}

	public java.sql.Date getEcorDateDepotProv() {
		return ecorDateDepotProv;
	}

	public void setEcorDateDepotProv(java.sql.Date ecorDateDepotProv) {
		this.ecorDateDepotProv = ecorDateDepotProv;
	}

	public java.lang.String getEcorCodeAgentDepotDef() {
		return ecorCodeAgentDepotDef;
	}

	public void setEcorCodeAgentDepotDef(java.lang.String ecorCodeAgentDepotDef) {
		this.ecorCodeAgentDepotDef = ecorCodeAgentDepotDef;
	}

	public java.sql.Date getEcorDateDepotDef() {
		return ecorDateDepotDef;
	}

	public void setEcorDateDepotDef(java.sql.Date ecorDateDepotDef) {
		this.ecorDateDepotDef = ecorDateDepotDef;
	}

	public java.sql.Date getEcorDateCreationFiche() {
		return ecorDateCreationFiche;
	}

	public void setEcorDateCreationFiche(java.sql.Date ecorDateCreationFiche) {
		this.ecorDateCreationFiche = ecorDateCreationFiche;
	}

	public java.math.BigDecimal getEcorMntDevis() {
		return ecorMntDevis;
	}

	public void setEcorMntDevis(java.math.BigDecimal ecorMntDevis) {
		this.ecorMntDevis = ecorMntDevis;
	}

	public java.math.BigDecimal getEcorMntDroitCommun() {
		return ecorMntDroitCommun;
	}

	public void setEcorMntDroitCommun(java.math.BigDecimal ecorMntDroitCommun) {
		this.ecorMntDroitCommun = ecorMntDroitCommun;
	}

	public java.sql.Date getEcorDateBae() {
		return ecorDateBae;
	}

	public void setEcorDateBae(java.sql.Date ecorDateBae) {
		this.ecorDateBae = ecorDateBae;
	}

	public Date getEcorCodeAgentBae() {
		return ecorCodeAgentBae;
	}

	public void setEcorCodeAgentBae(Date ecorCodeAgentBae) {
		this.ecorCodeAgentBae = ecorCodeAgentBae;
	}

	/**
	 * @return the articleFicheDedouanement
	 */
	public List<ArticleFicheDedouanement> getArticleFicheDedouanement() {
		return articleFicheDedouanement;
	}

	/**
	 * @param articleFicheDedouanement the articleFicheDedouanement to set
	 */
	public void setArticleFicheDedouanement(List<ArticleFicheDedouanement> articleFicheDedouanement) {
		this.articleFicheDedouanement = articleFicheDedouanement;
	}
	    
	    //private java.util.Collection articlefichededouanement;

	
}
