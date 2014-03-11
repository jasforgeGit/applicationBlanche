package sn.com.douane.ejb.declaration.model.entities;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import sn.com.douane.ejb.declaration.model.keys.EcorKey;

/**
 * Bean implementation class for Enterprise Bean: Ecor
 */
@Entity
@Table(name="ECOR")
@IdClass(EcorKey.class)
//	@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findAllByBureau" , query = "select object(o) from Ecor o where  o.ecorcodebureau = ?1"))


public class Ecor implements Serializable {

	private static final long serialVersionUID = -5300814957571412889L;

	@Id @Column(name="ECORANNEE" , length=4 , nullable=false)
	private String ecorAnnee;

	@Id @Column(name="ECORCODEBUREAU" , length=3 , nullable=false)
	private String ecorCodeBureau;

	@Id @Column(name="ECORNUMERO" , nullable=false)
	private Integer ecorNumero;

	@Column(name="ECORNOMVOYAGEUR" , length=100)
	private String ecorNomVoyageur;

	@Column(name="ECORADRESSEVOYAGEUR" , length=100)
	private String ecorAdresseVoyageur;

	@Column(name="ECORMODETRANSPORT" , length=1)
	private String ecorModeTransport;

	@Column(name="ECORMOYENTRANSPORT" , length=100)
	private String ecorMoyenTransport;

	@Column(name="ECORIDMOYENTTRANSPORT" , length=100)
	private String ecorIdMoyentTransport;

	@Column(name="ECORPAYSPROVENANCE" , length=3)
	private String ecorPaysProvenance;

	@Column(name="ECORNBREARTICLE")
	private Integer ecorNbRearticle;

	@Column(name="ECORDATEECOR")
	private Date ecorDateEcor;

	@Column(name="ECORDATETRANSPORT")
	private Date ecorDateTransport;

	@Column(name="ECORTYPEPIECEIDVOYAGEUR" , length=10)
	private String ecorTypePieceIdVoyageur;

	@Column(name="ECORNUMPIECEVOYAGEUR" , length=50)
	private String ecorNumPieceVoyageur;

	@Column(name="ECORDATEEMISSIONPIECE")
	private Date ecorDateEmissionPiece;

	@Column(name="ECORLIEUEMISSIONPIECE" , length=50)
	private String ecorLieueMissionPiece;

	@Column(name="ECORCODEAGENTECOREUR1" , length=5)
	private String ecorCodeAgentEcoreur1;

	@Column(name="ECORCODEAGENTECOREUR2" , length=5)
	private String ecorCodeAgentEcoreur2;

	@Column(name="ECORCODEAGENTVALIDEUR" , length=5)
	private String ecorCodeAgentValideur;

	@Column(name="ECORDATEVALIDATION")
	private Date ecorDateValidation;

	@Column(name="ECORCODEAGENTMAJ" , length=5)
	private String ecorCodeAgentMaj;

	@Column(name="ECORDATEDERNIERMAJ")
	private Date ecorDateDernierMaj;

	@Column(name="ECORMONTANTTOTAL" , columnDefinition="DECIMAL(18,0)")
	private BigDecimal ecorMontantTotal;

	@Column(name="ECORCODEAGENTDEPOTPROV" , length=5)
	private String ecorCodeAgentDepotProv;

	@Column(name="ECORDATEDEPOTPROV")
	private Date ecorDateDepotProv;

	@Column(name="ECORCODEAGENTDEPOTDEF" , length=5)
	private String ecorCodeAgentDepotDef;

	@Column(name="ECORDATEDEPOTDEF")
	private Date ecorDateDepotDef;

	@OneToMany(mappedBy = "articleEcor" , targetEntity = ArticleEcor.class)
	private List<ArticleEcor> articleEcor;
	
	public Ecor() {

	}
	public Ecor(String ecorAnnee , String ecorCodeBureau , Integer ecorNumero) {
		this.ecorAnnee=ecorAnnee;
		this.ecorCodeBureau=ecorCodeBureau;
		this.ecorNumero=ecorNumero;
	}

	public String getEcorAnnee() {
		return ecorAnnee;
	}

	public void setEcorAnnee(String ecorAnnee) {
		this.ecorAnnee = ecorAnnee;
	}

	public String getEcorCodeBureau() {
		return ecorCodeBureau;
	}

	public void setEcorCodeBureau(String ecorCodeBureau) {
		this.ecorCodeBureau = ecorCodeBureau;
	}

	public Integer getEcorNumero() {
		return ecorNumero;
	}

	public void setEcorNumero(Integer ecorNumero) {
		this.ecorNumero = ecorNumero;
	}

	public String getEcorNomVoyageur() {
		return ecorNomVoyageur;
	}

	public void setEcorNomVoyageur(String ecorNomVoyageur) {
		this.ecorNomVoyageur = ecorNomVoyageur;
	}

	public String getEcorAdresseVoyageur() {
		return ecorAdresseVoyageur;
	}

	public void setEcorAdresseVoyageur(String ecorAdresseVoyageur) {
		this.ecorAdresseVoyageur = ecorAdresseVoyageur;
	}

	public String getEcorModeTransport() {
		return ecorModeTransport;
	}

	public void setEcorModeTransport(String ecorModeTransport) {
		this.ecorModeTransport = ecorModeTransport;
	}

	public String getEcorMoyenTransport() {
		return ecorMoyenTransport;
	}

	public void setEcorMoyenTransport(String ecorMoyenTransport) {
		this.ecorMoyenTransport = ecorMoyenTransport;
	}

	public String getEcorIdMoyentTransport() {
		return ecorIdMoyentTransport;
	}

	public void setEcorIdMoyentTransport(String ecorIdMoyentTransport) {
		this.ecorIdMoyentTransport = ecorIdMoyentTransport;
	}

	public String getEcorPaysProvenance() {
		return ecorPaysProvenance;
	}

	public void setEcorPaysProvenance(String ecorPaysProvenance) {
		this.ecorPaysProvenance = ecorPaysProvenance;
	}

	public Integer getEcorNbRearticle() {
		return ecorNbRearticle;
	}

	public void setEcorNbRearticle(Integer ecorNbRearticle) {
		this.ecorNbRearticle = ecorNbRearticle;
	}

	public Date getEcorDateEcor() {
		return ecorDateEcor;
	}

	public void setEcorDateEcor(Date ecorDateEcor) {
		this.ecorDateEcor = ecorDateEcor;
	}

	public Date getEcorDateTransport() {
		return ecorDateTransport;
	}

	public void setEcorDateTransport(Date ecorDateTransport) {
		this.ecorDateTransport = ecorDateTransport;
	}

	public String getEcorTypePieceIdVoyageur() {
		return ecorTypePieceIdVoyageur;
	}

	public void setEcorTypePieceIdVoyageur(String ecorTypePieceIdVoyageur) {
		this.ecorTypePieceIdVoyageur = ecorTypePieceIdVoyageur;
	}

	public String getEcorNumPieceVoyageur() {
		return ecorNumPieceVoyageur;
	}

	public void setEcorNumPieceVoyageur(String ecorNumPieceVoyageur) {
		this.ecorNumPieceVoyageur = ecorNumPieceVoyageur;
	}

	public Date getEcorDateEmissionPiece() {
		return ecorDateEmissionPiece;
	}

	public void setEcorDateEmissionPiece(Date ecorDateEmissionPiece) {
		this.ecorDateEmissionPiece = ecorDateEmissionPiece;
	}

	public String getEcorLieueMissionPiece() {
		return ecorLieueMissionPiece;
	}

	public void setEcorLieueMissionPiece(String ecorLieueMissionPiece) {
		this.ecorLieueMissionPiece = ecorLieueMissionPiece;
	}

	public String getEcorCodeAgentEcoreur1() {
		return ecorCodeAgentEcoreur1;
	}

	public void setEcorCodeAgentEcoreur1(String ecorCodeAgentEcoreur1) {
		this.ecorCodeAgentEcoreur1 = ecorCodeAgentEcoreur1;
	}

	public String getEcorCodeAgentEcoreur2() {
		return ecorCodeAgentEcoreur2;
	}

	public void setEcorCodeAgentEcoreur2(String ecorCodeAgentEcoreur2) {
		this.ecorCodeAgentEcoreur2 = ecorCodeAgentEcoreur2;
	}

	public String getEcorCodeAgentValideur() {
		return ecorCodeAgentValideur;
	}

	public void setEcorCodeAgentValideur(String ecorCodeAgentValideur) {
		this.ecorCodeAgentValideur = ecorCodeAgentValideur;
	}

	public Date getEcorDateValidation() {
		return ecorDateValidation;
	}

	public void setEcorDateValidation(Date ecorDateValidation) {
		this.ecorDateValidation = ecorDateValidation;
	}

	public String getEcorCodeAgentMaj() {
		return ecorCodeAgentMaj;
	}

	public void setEcorCodeAgentMaj(String ecorCodeAgentMaj) {
		this.ecorCodeAgentMaj = ecorCodeAgentMaj;
	}

	public Date getEcorDateDernierMaj() {
		return ecorDateDernierMaj;
	}

	public void setEcorDateDernierMaj(Date ecorDateDernierMaj) {
		this.ecorDateDernierMaj = ecorDateDernierMaj;
	}

	public BigDecimal getEcorMontantTotal() {
		return ecorMontantTotal;
	}

	public void setEcorMontantTotal(BigDecimal ecorMontantTotal) {
		this.ecorMontantTotal = ecorMontantTotal;
	}

	public String getEcorCodeAgentDepotProv() {
		return ecorCodeAgentDepotProv;
	}

	public void setEcorCodeAgentDepotProv(String ecorCodeAgentDepotProv) {
		this.ecorCodeAgentDepotProv = ecorCodeAgentDepotProv;
	}

	public Date getEcorDateDepotProv() {
		return ecorDateDepotProv;
	}

	public void setEcorDateDepotProv(Date ecorDateDepotProv) {
		this.ecorDateDepotProv = ecorDateDepotProv;
	}

	public String getEcorCodeAgentDepotDef() {
		return ecorCodeAgentDepotDef;
	}

	public void setEcorCodeAgentDepotDef(String ecorCodeAgentDepotDef) {
		this.ecorCodeAgentDepotDef = ecorCodeAgentDepotDef;
	}

	public Date getEcorDateDepotDef() {
		return ecorDateDepotDef;
	}

	public void setEcorDateDepotDef(Date ecorDateDepotDef) {
		this.ecorDateDepotDef = ecorDateDepotDef;
	}
	public List<ArticleEcor> getArticleEcor() {
		return articleEcor;
	}
	public void setArticleEcor(List<ArticleEcor> articleEcor) {
		this.articleEcor = articleEcor;
	}
}

