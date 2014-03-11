package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArticleDlppKey;

@Entity
@IdClass(ArticleDlppKey.class)
@Table(name = "ARTICLEDLPP")
public class ArticleDlpp implements Serializable {

	private static final long serialVersionUID = 2145000054622085503L;

	@Id
	@Column(name = "DLPPANNEEDLPP", length = 4, nullable = false)
	private String dlppAnneeDlpp;

	@Id
	@Column(name = "DLPPCODEBUREAU", length = 3, nullable = false)
	private String dlppCodeBureau;

	@Id
	@Column(name = "DLPPNUMDLPP", nullable = false)
	private Integer dlppNumDlpp;

	@Id
	@Column(name = "DLPPNUMARTICLE", nullable = false)
	private Integer dlppNumArticle;

	@Column(name = "DLPPCODEPPMDECLARANT", length = 5)
	private String dlppCodePpmDeclarant;

	@Column(name = "DLPPNUMREPERTOIRE", length = 6)
	private String dlppNumRepertoire;

	@Column(name = "DLPPREGFISCAL", length = 2)
	private String dlppRegFiscal;

	@Column(name = "DLPPNUMARTMANIF")
	private Integer dlppNumArtManif;

	@Column(name = "DLPPPRECARTMANIF")
	private Integer dlppPrecArtManif;

	@Column(name = "DLPPPRECARTMANIF2")
	private Integer dlppPrecArtManif2;

	@Column(name = "DLPPCODEPROD", length = 6)
	private String dlppCodeProd;

	@Column(name = "DLPPPRECUEMOA", length = 2)
	private String dlppPrecUemoa;

	@Column(name = "DLPPPRECSENEGAL", length = 2)
	private String dlppPrecSenegal;

	@Column(name = "DLPPPDBRUT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppPdBrut;

	@Column(name = "DLPPPDNET", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppPdNet;

	@Column(name = "DLPPQTECOMPL", length = 3)
	private String dlppQteCompl;

	@Column(name = "DLPPUNITECOMPL", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppUniteCompl;

	@Column(name = "DLPPPAYSORIG", length = 3)
	private String dlppPaysOrig;

	@Column(name = "DLPPVALDOUA", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppValDoua;

	@Column(name = "DLPPTICKETCPTEUR", length = 10)
	private String dlppTicketCpteur;

	@Column(name = "DLPPTPSAMBIANT", length = 3)
	private String dlppTpsAmbiant;

	@Column(name = "DLPPVOLAMBIANT", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppVolAmbiant;

	@Column(name = "DLPPVOLA15", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppVola15;

	@Column(name = "DLPPMASSVOL15", columnDefinition = "DECIMAL(11 , 0)")
	private java.math.BigDecimal dlppMassVol15;

	@Column(name = "DLPPCODEDEPOT", length = 10)
	private String dlppCodeDepot;

	@Column(name = "DLLPPDATELIVRAISON")
	private java.sql.Date dllppDateLivraison;

	@Column(name = "DLPPDELAILIVRAISON")
	private Integer dlppDelaiLivraison;

	@Column(name = "DLLPPCODEBAC", length = 10)
	private String dllppCodeBac;

	@OneToMany(mappedBy = "articleDlpp", targetEntity = SommiersDlpp.class)
	private List<SommiersDlpp> sommiersDlpp;

	@ManyToOne(targetEntity = SegGenDlpp.class)
	@JoinColumns({
			@JoinColumn(name = "DLPPANNEEDLPP", referencedColumnName = "DLPPANNEEDLPP", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DLPPCODEBUREAU", referencedColumnName = "DLPPCODEBUREAU", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DLPPNUMDLPP", referencedColumnName = "DLPPNUMDLPP", insertable = false, updatable = false, nullable = false) })
	private SegGenDlpp segGenDlpp;

	@OneToMany(mappedBy = "articleDlpp", targetEntity = BacArtDlpp.class)
	private List<BacArtDlpp> bacArtDlpps;

	public ArticleDlpp() {
		super();
	}

	public ArticleDlpp(String dlppAnneeDlpp, String dlppCodeBureau,
			Integer dlppNumDlpp, Integer dlppNumArticle) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodeBureau = dlppCodeBureau;
		this.dlppNumDlpp = dlppNumDlpp;
		this.dlppNumArticle = dlppNumArticle;
	}

	public String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}

	public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}

	public String getDlppCodeBureau() {
		return dlppCodeBureau;
	}

	public void setDlppCodeBureau(String dlppCodeBureau) {
		this.dlppCodeBureau = dlppCodeBureau;
	}

	public Integer getDlppNumDlpp() {
		return dlppNumDlpp;
	}

	public void setDlppNumDlpp(Integer dlppNumDlpp) {
		this.dlppNumDlpp = dlppNumDlpp;
	}

	public Integer getDlppNumArticle() {
		return dlppNumArticle;
	}

	public void setDlppNumArticle(Integer dlppNumArticle) {
		this.dlppNumArticle = dlppNumArticle;
	}

	public String getDlppCodePpmDeclarant() {
		return dlppCodePpmDeclarant;
	}

	public void setDlppCodePpmDeclarant(String dlppCodePpmDeclarant) {
		this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
	}

	public String getDlppNumRepertoire() {
		return dlppNumRepertoire;
	}

	public void setDlppNumRepertoire(String dlppNumRepertoire) {
		this.dlppNumRepertoire = dlppNumRepertoire;
	}

	public String getDlppRegFiscal() {
		return dlppRegFiscal;
	}

	public void setDlppRegFiscal(String dlppRegFiscal) {
		this.dlppRegFiscal = dlppRegFiscal;
	}

	public Integer getDlppNumArtManif() {
		return dlppNumArtManif;
	}

	public void setDlppNumArtManif(Integer dlppNumArtManif) {
		this.dlppNumArtManif = dlppNumArtManif;
	}

	public Integer getDlppPrecArtManif() {
		return dlppPrecArtManif;
	}

	public void setDlppPrecArtManif(Integer dlppPrecArtManif) {
		this.dlppPrecArtManif = dlppPrecArtManif;
	}

	public Integer getDlppPrecArtManif2() {
		return dlppPrecArtManif2;
	}

	public void setDlppPrecArtManif2(Integer dlppPrecArtManif2) {
		this.dlppPrecArtManif2 = dlppPrecArtManif2;
	}

	public String getDlppCodeProd() {
		return dlppCodeProd;
	}

	public void setDlppCodeProd(String dlppCodeProd) {
		this.dlppCodeProd = dlppCodeProd;
	}

	public String getDlppPrecUemoa() {
		return dlppPrecUemoa;
	}

	public void setDlppPrecUemoa(String dlppPrecUemoa) {
		this.dlppPrecUemoa = dlppPrecUemoa;
	}

	public String getDlppPrecSenegal() {
		return dlppPrecSenegal;
	}

	public void setDlppPrecSenegal(String dlppPrecSenegal) {
		this.dlppPrecSenegal = dlppPrecSenegal;
	}

	public java.math.BigDecimal getDlppPdBrut() {
		return dlppPdBrut;
	}

	public void setDlppPdBrut(java.math.BigDecimal dlppPdBrut) {
		this.dlppPdBrut = dlppPdBrut;
	}

	public java.math.BigDecimal getDlppPdNet() {
		return dlppPdNet;
	}

	public void setDlppPdNet(java.math.BigDecimal dlppPdNet) {
		this.dlppPdNet = dlppPdNet;
	}

	public String getDlppQteCompl() {
		return dlppQteCompl;
	}

	public void setDlppQteCompl(String dlppQteCompl) {
		this.dlppQteCompl = dlppQteCompl;
	}

	public java.math.BigDecimal getDlppUniteCompl() {
		return dlppUniteCompl;
	}

	public void setDlppUniteCompl(java.math.BigDecimal dlppUniteCompl) {
		this.dlppUniteCompl = dlppUniteCompl;
	}

	public String getDlppPaysOrig() {
		return dlppPaysOrig;
	}

	public void setDlppPaysOrig(String dlppPaysOrig) {
		this.dlppPaysOrig = dlppPaysOrig;
	}

	public java.math.BigDecimal getDlppValDoua() {
		return dlppValDoua;
	}

	public void setDlppValDoua(java.math.BigDecimal dlppValDoua) {
		this.dlppValDoua = dlppValDoua;
	}

	public String getDlppTicketCpteur() {
		return dlppTicketCpteur;
	}

	public void setDlppTicketCpteur(String dlppTicketCpteur) {
		this.dlppTicketCpteur = dlppTicketCpteur;
	}

	public String getDlppTpsAmbiant() {
		return dlppTpsAmbiant;
	}

	public void setDlppTpsAmbiant(String dlppTpsAmbiant) {
		this.dlppTpsAmbiant = dlppTpsAmbiant;
	}

	public java.math.BigDecimal getDlppVolAmbiant() {
		return dlppVolAmbiant;
	}

	public void setDlppVolAmbiant(java.math.BigDecimal dlppVolAmbiant) {
		this.dlppVolAmbiant = dlppVolAmbiant;
	}

	public java.math.BigDecimal getDlppVola15() {
		return dlppVola15;
	}

	public void setDlppVola15(java.math.BigDecimal dlppVola15) {
		this.dlppVola15 = dlppVola15;
	}

	public java.math.BigDecimal getDlppMassVol15() {
		return dlppMassVol15;
	}

	public void setDlppMassVol15(java.math.BigDecimal dlppMassVol15) {
		this.dlppMassVol15 = dlppMassVol15;
	}

	public String getDlppCodeDepot() {
		return dlppCodeDepot;
	}

	public void setDlppCodeDepot(String dlppCodeDepot) {
		this.dlppCodeDepot = dlppCodeDepot;
	}

	public java.sql.Date getDllppDateLivraison() {
		return dllppDateLivraison;
	}

	public void setDllppDateLivraison(java.sql.Date dllppDateLivraison) {
		this.dllppDateLivraison = dllppDateLivraison;
	}

	public Integer getDlppDelaiLivraison() {
		return dlppDelaiLivraison;
	}

	public void setDlppDelaiLivraison(Integer dlppDelaiLivraison) {
		this.dlppDelaiLivraison = dlppDelaiLivraison;
	}

	public String getDllppCodeBac() {
		return dllppCodeBac;
	}

	public void setDllppCodeBac(String dllppCodeBac) {
		this.dllppCodeBac = dllppCodeBac;
	}

	public List<SommiersDlpp> getSommiersDlpp() {
		return sommiersDlpp;
	}

	public void setSommiersDlpp(List<SommiersDlpp> sommiersDlpp) {
		this.sommiersDlpp = sommiersDlpp;
	}

	public SegGenDlpp getSegGenDlpp() {
		return segGenDlpp;
	}

	public void setSegGenDlpp(SegGenDlpp segGenDlpp) {
		this.segGenDlpp = segGenDlpp;
	}

	public List<BacArtDlpp> getBacArtDlpps() {
		return bacArtDlpps;
	}

	public void setBacArtDlpps(List<BacArtDlpp> bacArtDlpps) {
		this.bacArtDlpps = bacArtDlpps;
	}

}
