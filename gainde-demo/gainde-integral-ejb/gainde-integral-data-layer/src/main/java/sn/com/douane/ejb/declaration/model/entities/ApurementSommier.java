/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ApurementSommierKey;

/**
 * @author moussakare
 *
 */
@Entity
@Table(name = "APUREMENTSOMMIER")
@IdClass(ApurementSommierKey.class)
//@javax.persistence.NamedQueries({@javax.persistence.NamedQuery(name = "findById", query = "select object(o) from Sommiers o where o.ce_sgartsommier.ce_sgenartdec.decanneeenregdec = ?1 and  o.ce_sgartsommier.ce_sgenartdec.decburenregdec = ?2 and  o.ce_sgartsommier.ce_sgenartdec.decnumdeclaration = ?3 and  o.ce_sgartsommier.decnumartdec = ?4"), @javax.persistence.NamedQuery(name = "findByIdDlpp", query = "select object(o) from Sommiers o where  o.ce_sgartsommier.ce_sgenartdec.decanneeenregdec = ?1 and  o.ce_sgartsommier.ce_sgenartdec.decburenregdec = ?2 and  o.ce_sgartsommier.ce_sgenartdec.decnumdeclaration = ?3")})
public class ApurementSommier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 306945664221926378L;
	
	@Id @Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private java.lang.String decAnneeEnregDec;
	@Id @Column(name = "DECBURENREGDEC", length = 3, nullable = false)
    private java.lang.String decBurEnregDec;
	@Id @Column(name = "DECNUMDECLARATION", nullable = false)
    private java.lang.Integer decNumDeclaration;
	@Id @Column(name = "DECNUMARTDECL", nullable = false)
    private java.lang.Integer decNumArtDecl;
	@Id @Column(name = "DECANNEEAPUREMENT", length = 4, nullable = false)
	private java.lang.String decAnneeApurement;
	@Id @Column(name = "DECBURAPURANTDEC", length = 3, nullable = false)
    private java.lang.String decBurApurantDec;
	@Id @Column(name = "DECNUMDECAPURANT", nullable = false)
    private java.lang.Integer decNumDecApurant;
	@Id @Column(name = "DECARTDECAPURANTE", nullable = false)
    private java.lang.Integer decArtDecApurante;
	@Id @Column(name = "DECNATAPUREMENT", length = 1, nullable = false)
	private java.lang.String decNatApurement;
	@Column(name = "DECNBRECOLISDEC")
    private java.lang.Integer decNbreColisDec;
	@Column(name = "DECPDNETAPUREMENT", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decPdNetApurement;
	@Column(name = "DECTYEPREGIME", length = 1)
    private java.lang.String decTypeRegime;
	@Column(name = "DECREGDOU", length = 1)
    private java.lang.String decRegDou;
	@Column(name = "DECDATEAPUREMENT")
    private java.sql.Date decDateApurement;
	@Column(name = "DECREGFISCAL", length = 2)
    private java.lang.String decRegFiscal;
	@Column(name = "DECCODEVERIFICATEUR", length = 5)
	private java.lang.String decCodeVerificateur;
	@Column(name = "DECQTECOMPLEMENT", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decQteComplement;
	@Column(name = "DECQTEMERCURIALE", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decQteMercuriale;
	@Column(name = "DECVALCAF", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decValCaf;
	@Column(name = "DECNUMDECISION", length = 6)
    private java.lang.String decNumDecision;
	@Column(name = "DECDATEENREGTRANS")
    private java.sql.Date decDateEnregTrans;
	@Column(name = "DECDATEENLEVEMENT")
    private java.sql.Date decDateEnlevement;
	@Column(name = "DECCODEVERIFICATEUR2", length = 5)
    private java.lang.String decCodeVerificateur2;
	@Column(name = "DECANNEEREGECO", length = 4)
    private java.lang.String decAnneeRegEco;
	@Column(name = "DECNUMREGECO", length = 6)
    private java.lang.String decNumRegEco;
	@Column(name = "DECBURREGECO", length = 6)
    private java.lang.String decBurRegEco;
	@Column(name = "DECLIEUSTOCKAGE", length = 3)
    private java.lang.String decLieuStockage;
    
	@ManyToOne(targetEntity = Sommiers.class)
	@JoinColumns({
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false)
			})
    private Sommiers sommApurSom;

	/**
	 * 
	 */
	public ApurementSommier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param decAnneeEnregDec
	 * @param decBurEnregDec
	 * @param decNumDeclaration
	 * @param decNumArtDec
	 * @param decAnneeApurement
	 * @param decBurApurantDec
	 * @param decNumDecApurant
	 * @param decArtDecApurante
	 * @param decNatApurement
	 */
	public ApurementSommier(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decAnneeApurement, String decBurApurantDec,
			Integer decNumDecApurant, Integer decArtDecApurante,
			String decNatApurement) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDec;
		this.decAnneeApurement = decAnneeApurement;
		this.decBurApurantDec = decBurApurantDec;
		this.decNumDecApurant = decNumDecApurant;
		this.decArtDecApurante = decArtDecApurante;
		this.decNatApurement = decNatApurement;
	}

	/**
	 * @return the decAnneeEnregDec
	 */
	public java.lang.String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	/**
	 * @param decAnneeEnregDec the decAnneeEnregDec to set
	 */
	public void setDecAnneeEnregDec(java.lang.String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	/**
	 * @return the decBurEnregDec
	 */
	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	/**
	 * @param decBurEnregDec the decBurEnregDec to set
	 */
	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	/**
	 * @return the decNumDeclaration
	 */
	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	/**
	 * @param decNumDeclaration the decNumDeclaration to set
	 */
	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	/**
	 * @return the decNumArtDec
	 */
	public java.lang.Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	/**
	 * @param decNumArtDec the decNumArtDec to set
	 */
	public void setDecNumArtDecl(java.lang.Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
	}

	/**
	 * @return the decAnneeApurement
	 */
	public java.lang.String getDecAnneeApurement() {
		return decAnneeApurement;
	}

	/**
	 * @param decAnneeApurement the decAnneeApurement to set
	 */
	public void setDecAnneeApurement(java.lang.String decAnneeApurement) {
		this.decAnneeApurement = decAnneeApurement;
	}

	/**
	 * @return the decBurApurantDec
	 */
	public java.lang.String getDecBurApurantDec() {
		return decBurApurantDec;
	}

	/**
	 * @param decBurApurantDec the decBurApurantDec to set
	 */
	public void setDecBurApurantDec(java.lang.String decBurApurantDec) {
		this.decBurApurantDec = decBurApurantDec;
	}

	/**
	 * @return the decNumDecApurant
	 */
	public java.lang.Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}

	/**
	 * @param decNumDecApurant the decNumDecApurant to set
	 */
	public void setDecNumDecApurant(java.lang.Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}

	/**
	 * @return the decArtDecApurante
	 */
	public java.lang.Integer getDecArtDecApurante() {
		return decArtDecApurante;
	}

	/**
	 * @param decArtDecApurante the decArtDecApurante to set
	 */
	public void setDecArtDecApurante(java.lang.Integer decArtDecApurante) {
		this.decArtDecApurante = decArtDecApurante;
	}

	/**
	 * @return the decNatApurement
	 */
	public java.lang.String getDecNatApurement() {
		return decNatApurement;
	}

	/**
	 * @param decNatApurement the decNatApurement to set
	 */
	public void setDecNatApurement(java.lang.String decNatApurement) {
		this.decNatApurement = decNatApurement;
	}

	/**
	 * @return the decNbreColisDec
	 */
	public java.lang.Integer getDecNbreColisDec() {
		return decNbreColisDec;
	}

	/**
	 * @param decNbreColisDec the decNbreColisDec to set
	 */
	public void setDecNbreColisDec(java.lang.Integer decNbreColisDec) {
		this.decNbreColisDec = decNbreColisDec;
	}

	/**
	 * @return the decPdNetApurement
	 */
	public java.math.BigDecimal getDecPdNetApurement() {
		return decPdNetApurement;
	}

	/**
	 * @param decPdNetApurement the decPdNetApurement to set
	 */
	public void setDecPdNetApurement(java.math.BigDecimal decPdNetApurement) {
		this.decPdNetApurement = decPdNetApurement;
	}

	/**
	 * @return the decTypeRegime
	 */
	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}

	/**
	 * @param decTypeRegime the decTypeRegime to set
	 */
	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	/**
	 * @return the decRegDou
	 */
	public java.lang.String getDecRegDou() {
		return decRegDou;
	}

	/**
	 * @param decRegDou the decRegDou to set
	 */
	public void setDecRegDou(java.lang.String decRegDou) {
		this.decRegDou = decRegDou;
	}

	/**
	 * @return the decDateApurement
	 */
	public java.sql.Date getDecDateApurement() {
		return decDateApurement;
	}

	/**
	 * @param decDateApurement the decDateApurement to set
	 */
	public void setDecDateApurement(java.sql.Date decDateApurement) {
		this.decDateApurement = decDateApurement;
	}

	/**
	 * @return the decRegFiscal
	 */
	public java.lang.String getDecRegFiscal() {
		return decRegFiscal;
	}

	/**
	 * @param decRegFiscal the decRegFiscal to set
	 */
	public void setDecRegFiscal(java.lang.String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}

	/**
	 * @return the decCodeVerificateur
	 */
	public java.lang.String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	/**
	 * @param decCodeVerificateur the decCodeVerificateur to set
	 */
	public void setDecCodeVerificateur(java.lang.String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	/**
	 * @return the decQteComplement
	 */
	public java.math.BigDecimal getDecQteComplement() {
		return decQteComplement;
	}

	/**
	 * @param decQteComplement the decQteComplement to set
	 */
	public void setDecQteComplement(java.math.BigDecimal decQteComplement) {
		this.decQteComplement = decQteComplement;
	}

	/**
	 * @return the decQteMercuriale
	 */
	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}

	/**
	 * @param decQteMercuriale the decQteMercuriale to set
	 */
	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}

	/**
	 * @return the decValCaf
	 */
	public java.math.BigDecimal getDecValCaf() {
		return decValCaf;
	}

	/**
	 * @param decValCaf the decValCaf to set
	 */
	public void setDecValCaf(java.math.BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}

	/**
	 * @return the decNumDecision
	 */
	public java.lang.String getDecNumDecision() {
		return decNumDecision;
	}

	/**
	 * @param decNumDecision the decNumDecision to set
	 */
	public void setDecNumDecision(java.lang.String decNumDecision) {
		this.decNumDecision = decNumDecision;
	}

	/**
	 * @return the decDateEnregTrans
	 */
	public java.sql.Date getDecDateEnregTrans() {
		return decDateEnregTrans;
	}

	/**
	 * @param decDateEnregTrans the decDateEnregTrans to set
	 */
	public void setDecDateEnregTrans(java.sql.Date decDateEnregTrans) {
		this.decDateEnregTrans = decDateEnregTrans;
	}

	/**
	 * @return the decDateEnlevement
	 */
	public java.sql.Date getDecDateEnlevement() {
		return decDateEnlevement;
	}

	/**
	 * @param decDateEnlevement the decDateEnlevement to set
	 */
	public void setDecDateEnlevement(java.sql.Date decDateEnlevement) {
		this.decDateEnlevement = decDateEnlevement;
	}

	/**
	 * @return the decCodeVerificateur2
	 */
	public java.lang.String getDecCodeVerificateur2() {
		return decCodeVerificateur2;
	}

	/**
	 * @param decCodeVerificateur2 the decCodeVerificateur2 to set
	 */
	public void setDecCodeVerificateur2(java.lang.String decCodeVerificateur2) {
		this.decCodeVerificateur2 = decCodeVerificateur2;
	}

	/**
	 * @return the decAnneeRegEco
	 */
	public java.lang.String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}

	/**
	 * @param decAnneeRegEco the decAnneeRegEco to set
	 */
	public void setDecAnneeRegEco(java.lang.String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}

	/**
	 * @return the decNumRegEco
	 */
	public java.lang.String getDecNumRegEco() {
		return decNumRegEco;
	}

	/**
	 * @param decNumRegEco the decNumRegEco to set
	 */
	public void setDecNumRegEco(java.lang.String decNumRegEco) {
		this.decNumRegEco = decNumRegEco;
	}

	/**
	 * @return the decBurRegEco
	 */
	public java.lang.String getDecBurRegEco() {
		return decBurRegEco;
	}

	/**
	 * @param decBurRegEco the decBurRegEco to set
	 */
	public void setDecBurRegEco(java.lang.String decBurRegEco) {
		this.decBurRegEco = decBurRegEco;
	}

	/**
	 * @return the decLieuStockage
	 */
	public java.lang.String getDecLieuStockage() {
		return decLieuStockage;
	}

	/**
	 * @param decLieuStockage the decLieuStockage to set
	 */
	public void setDecLieuStockage(java.lang.String decLieuStockage) {
		this.decLieuStockage = decLieuStockage;
	}

	/**
	 * @return the sommApurSom
	 */
	public Sommiers getSommApurSom() {
		return sommApurSom;
	}

	/**
	 * @param sommApurSom the sommApurSom to set
	 */
	public void setSommApurSom(Sommiers sommApurSom) {
		this.sommApurSom = sommApurSom;
	}
	
	

}
