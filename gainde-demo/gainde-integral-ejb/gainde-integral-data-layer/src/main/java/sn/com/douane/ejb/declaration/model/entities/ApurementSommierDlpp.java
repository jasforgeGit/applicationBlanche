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

import sn.com.douane.ejb.declaration.model.keys.ApurementSommierDlppKey;

@Entity
@IdClass(ApurementSommierDlppKey.class)
@Table(name = "APUREMENTSOMMIERDLPP")
public class ApurementSommierDlpp implements Serializable {

	private static final long serialVersionUID = 4866865184107783121L;

	@Id
	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id
	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Id
	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Id
	@Column(name = "DECNUMARTDECL", nullable = false)
	private Integer decNumArtDecl;

	@Id
	@Column(name = "DECANNEEAPUREMENT", length = 4, nullable = false)
	private String decAnneeApurement;

	@Id
	@Column(name = "DECBURAPURANTDEC", length = 3, nullable = false)
	private String decBurApurantDec;

	@Id
	@Column(name = "DECNUMDECAPURANT", nullable = false)
	private Integer decNumDecApurant;

	@Id
	@Column(name = "DECARTDECAPURANTE", nullable = false)
	private Integer decArtDecApurante;

	@Id
	@Column(name = "DECNATAPUREMENT", length = 1, nullable = false)
	private String decNatApurement;

	@Column(name = "DECNBRECOLISDEC")
	private Integer decNbreColisDec;

	@Column(name = "DECPDNETAPUREMENT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal decPdNetApurement;

	@Column(name = "DECTYEPREGIME", length = 1)
	private String decTypeRegime;

	@Column(name = "DECREGDOU", length = 1)
	private String decRegDou;

	@Column(name = "DECDATEAPUREMENT")
	private java.sql.Date decDateApurement;

	@Column(name = "DECREGFISCAL", length = 2)
	private String decRegFiscal;

	@Column(name = "DECCODEVERIFICATEUR", length = 5)
	private String decCodeVerificateur;

	@Column(name = "DECQTECOMPLEMENT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal decQteComplement;

	@Column(name = "DECQTEMERCURIALE", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal decQteMercuriale;

	@Column(name = "DECVALCAF", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal decValCaf;

	@Column(name = "DECNUMDECISION", length = 6)
	private String decNumDecision;

	@Column(name = "DECDATEENREGTRANS")
	private java.sql.Date decDateEnregTrans;

	@Column(name = "DECDATEENLEVEMENT")
	private java.sql.Date decDateEnlevement;

	@Column(name = "DECCODEVERIFICATEUR2", length = 5)
	private String decCodeVerificateur2;

	@Column(name = "DECANNEEREGECO", length = 4)
	private String decAnneeRegEco;

	@Column(name = "DECBURREGECO", length = 6)
	private String decBurRegEco;

	@Column(name = "DECLIEUSTOCKAGE", length = 3)
	private String decLieuStockage;
	
	@ManyToOne(targetEntity = SommiersDlpp.class)	
	@JoinColumns({
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false,nullable = false),
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDECL", insertable = false, updatable = false,nullable = false)
			})
	private SommiersDlpp sommiersDlpp;

	public ApurementSommierDlpp() {
		super();
	}

	public ApurementSommierDlpp(String decAnneeEnregDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDecl,
			String decAnneeApurement, String decBurApurantDec,
			Integer decNumDecApurant, Integer decArtDecApurante,
			String decNatApurement) {
		super();
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decAnneeApurement = decAnneeApurement;
		this.decBurApurantDec = decBurApurantDec;
		this.decNumDecApurant = decNumDecApurant;
		this.decArtDecApurante = decArtDecApurante;
		this.decNatApurement = decNatApurement;
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}

	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}

	public String getDecAnneeApurement() {
		return decAnneeApurement;
	}

	public void setDecAnneeApurement(String decAnneeApurement) {
		this.decAnneeApurement = decAnneeApurement;
	}

	public String getDecBurApurantDec() {
		return decBurApurantDec;
	}

	public void setDecBurApurantDec(String decBurApurantDec) {
		this.decBurApurantDec = decBurApurantDec;
	}

	public Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}

	public void setDecNumDecApurant(Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}

	public Integer getDecArtDecApurante() {
		return decArtDecApurante;
	}

	public void setDecArtDecApurante(Integer decArtDecApurante) {
		this.decArtDecApurante = decArtDecApurante;
	}

	public String getDecNatApurement() {
		return decNatApurement;
	}

	public void setDecNatApurement(String decNatApurement) {
		this.decNatApurement = decNatApurement;
	}

	public Integer getDecNbreColisDec() {
		return decNbreColisDec;
	}

	public void setDecNbreColisDec(Integer decNbreColisDec) {
		this.decNbreColisDec = decNbreColisDec;
	}

	public java.math.BigDecimal getDecPdNetApurement() {
		return decPdNetApurement;
	}

	public void setDecPdNetApurement(java.math.BigDecimal decPdNetApurement) {
		this.decPdNetApurement = decPdNetApurement;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecRegDou() {
		return decRegDou;
	}

	public void setDecRegDou(String decRegDou) {
		this.decRegDou = decRegDou;
	}

	public java.sql.Date getDecDateApurement() {
		return decDateApurement;
	}

	public void setDecDateApurement(java.sql.Date decDateApurement) {
		this.decDateApurement = decDateApurement;
	}

	public String getDecRegFiscal() {
		return decRegFiscal;
	}

	public void setDecRegFiscal(String decRegFiscal) {
		this.decRegFiscal = decRegFiscal;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public java.math.BigDecimal getDecQteComplement() {
		return decQteComplement;
	}

	public void setDecQteComplement(java.math.BigDecimal decQteComplement) {
		this.decQteComplement = decQteComplement;
	}

	public java.math.BigDecimal getDecQteMercuriale() {
		return decQteMercuriale;
	}

	public void setDecQteMercuriale(java.math.BigDecimal decQteMercuriale) {
		this.decQteMercuriale = decQteMercuriale;
	}

	public java.math.BigDecimal getDecValCaf() {
		return decValCaf;
	}

	public void setDecValCaf(java.math.BigDecimal decValCaf) {
		this.decValCaf = decValCaf;
	}

	public String getDecNumDecision() {
		return decNumDecision;
	}

	public void setDecNumDecision(String decNumDecision) {
		this.decNumDecision = decNumDecision;
	}

	public java.sql.Date getDecDateEnregTrans() {
		return decDateEnregTrans;
	}

	public void setDecDateEnregTrans(java.sql.Date decDateEnregTrans) {
		this.decDateEnregTrans = decDateEnregTrans;
	}

	public java.sql.Date getDecDateEnlevement() {
		return decDateEnlevement;
	}

	public void setDecDateEnlevement(java.sql.Date decDateEnlevement) {
		this.decDateEnlevement = decDateEnlevement;
	}

	public String getDecCodeVerificateur2() {
		return decCodeVerificateur2;
	}

	public void setDecCodeVerificateur2(String decCodeVerificateur2) {
		this.decCodeVerificateur2 = decCodeVerificateur2;
	}

	public String getDecAnneeRegEco() {
		return decAnneeRegEco;
	}

	public void setDecAnneeRegEco(String decAnneeRegEco) {
		this.decAnneeRegEco = decAnneeRegEco;
	}

	public String getDecBurRegEco() {
		return decBurRegEco;
	}

	public void setDecBurRegEco(String decBurRegEco) {
		this.decBurRegEco = decBurRegEco;
	}

	public String getDecLieuStockage() {
		return decLieuStockage;
	}

	public void setDecLieuStockage(String decLieuStockage) {
		this.decLieuStockage = decLieuStockage;
	}

	public SommiersDlpp getSommiersDlpp() {
		return sommiersDlpp;
	}

	public void setSommiersDlpp(SommiersDlpp sommiersDlpp) {
		this.sommiersDlpp = sommiersDlpp;
	}

	
}
