package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;

public class EcheancierReglementDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1306476680099570857L;

	private String tranneedecl;

	private String trburdeclaration;

	private String trcodecreditaire;

	private Date trdatebae;

	private Date trdatereglement;

	private String tretat;

	private String trjournaltresor;

	private BigDecimal trmontantcomptant;

	private BigDecimal trmontantcredit;

	private Integer trnumdeclaration;

	private Integer trnumdossierprov;

	private BigDecimal trtvacredit;

	private String pk;

	/* Champs ajoutés */
	private java.lang.String numDeclaration;

	private java.lang.String numDecDateEcheance;
	
	private java.lang.String nomCreditaire;

	private java.lang.String trdatebaecheance;

	private java.lang.String trdatereglementstring;

	private Integer retard;

	private List listeDossier = new ArrayList();

	private String codecredsupp;

	private java.lang.String trdatebaestring;

	private BigDecimal trmontantliquid;

	private Integer trInteret;

	private BigDecimal trtotal;

	private java.lang.String libelleetat;

	private Date dateDossier;
	private String dateDossierString;

	private String trdateReglementPrevu;
	private BigDecimal trMontantReglement;
	private BigDecimal retardsReglement;
	/*
	 * Liste des taxes à appliquées
	 */
	private List listetaxes = new ArrayList();
	/*
	 * Liste des taxes à appliquées
	 */
	private List listeModeReglement = new ArrayList();

	public String getPk() {
		return tranneedecl + ConstManif.TIELD + trburdeclaration
				+ ConstManif.TIELD + trnumdeclaration;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getTranneedecl() {
		return tranneedecl;
	}

	public void setTranneedecl(String tranneedecl) {
		this.tranneedecl = tranneedecl;
	}

	public String getTrburdeclaration() {
		return trburdeclaration;
	}

	public void setTrburdeclaration(String trburdeclaration) {
		this.trburdeclaration = trburdeclaration;
	}

	public String getTrcodecreditaire() {
		return trcodecreditaire;
	}

	public void setTrcodecreditaire(String trcodecreditaire) {
		this.trcodecreditaire = trcodecreditaire;
	}

	public Date getTrdatebae() {
		return trdatebae;
	}

	public void setTrdatebae(Date trdatebae) {
		this.trdatebae = trdatebae;
	}

	public Date getTrdatereglement() {
		return trdatereglement;
	}

	public void setTrdatereglement(Date trdatereglement) {
		this.trdatereglement = trdatereglement;
	}

	public String getTretat() {
		return tretat;
	}

	public void setTretat(String tretat) {
		this.tretat = tretat;
	}

	public String getTrjournaltresor() {
		return trjournaltresor;
	}

	public void setTrjournaltresor(String trjournaltresor) {
		this.trjournaltresor = trjournaltresor;
	}

	public BigDecimal getTrmontantcomptant() {
		return trmontantcomptant;
	}

	public void setTrmontantcomptant(BigDecimal trmontantcomptant) {
		this.trmontantcomptant = trmontantcomptant;
	}

	public BigDecimal getTrmontantcredit() {
		return trmontantcredit;
	}

	public void setTrmontantcredit(BigDecimal trmontantcredit) {
		this.trmontantcredit = trmontantcredit;
	}

	public Integer getTrnumdeclaration() {
		return trnumdeclaration;
	}

	public void setTrnumdeclaration(Integer trnumdeclaration) {
		this.trnumdeclaration = trnumdeclaration;
	}

	public Integer getTrnumdossierprov() {
		return trnumdossierprov;
	}

	public void setTrnumdossierprov(Integer trnumdossierprov) {
		this.trnumdossierprov = trnumdossierprov;
	}

	public BigDecimal getTrtvacredit() {
		return trtvacredit;
	}

	public void setTrtvacredit(BigDecimal trtvacredit) {
		this.trtvacredit = trtvacredit;
	}

	public Integer getRetard() {
		return sysEnv.int2Integer(sysEnv.differenceFrom2Date(sysEnv.ToDay(),
				trdatebae));
	}

	public void setRetard(Integer retard) {
		this.retard = retard;
	}

	public String getCodecredsupp() {
		return codecredsupp;
	}

	public void setCodecredsupp(String codecredsupp) {
		this.codecredsupp = codecredsupp;
	}

	public java.lang.String getNumDeclaration() {
		return tranneedecl + ConstManif.SPACE + trburdeclaration
				+ ConstManif.SPACE + trnumdeclaration;
	}

	public void setNumDeclaration(java.lang.String numDeclaration) {
		this.numDeclaration = numDeclaration;
	}

	public List getListeDossier() {
		return listeDossier;
	}

	public void setListeDossier(List listeDossier) {
		this.listeDossier = listeDossier;
	}

	public java.lang.String getTrdatereglementstring() {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"dd/MM/yyyy");
		return sdf.format(trdatereglement);
	}

	public void setTrdatereglementstring(java.lang.String trdatereglementstring) {
		this.trdatereglementstring = trdatereglementstring;
	}

	public java.lang.String getNomCreditaire() {
		return nomCreditaire;
	}

	public void setNomCreditaire(java.lang.String nomCreditaire) {
		this.nomCreditaire = nomCreditaire;
	}

	public java.lang.String getTrdatebaestring() {
		// return sysEnv.dateToStr(trdatebae);
		return DateUtil.getDate(getTrdatebae());
	}

	public void setTrdatebaestring(java.lang.String trdatebaestring) {
		this.trdatebaestring = trdatebaestring;
	}

	public java.lang.String getTrdatebaecheance() {
		return DateUtil.getDate(sysEnv.addDays(trdatebae, 15));
	}

	public void setTrdatebaecheance(java.lang.String trdatebaecheance) {
		this.trdatebaecheance = trdatebaecheance;
	}

	public BigDecimal getTrmontantliquid() {
		return trmontantliquid;
	}

	public void setTrmontantliquid(BigDecimal trmontantliquid) {
		this.trmontantliquid = trmontantliquid;
	}

	public BigDecimal getTrtotal() throws RcEjbException {
		return sysEnv.add(trmontantliquid, trmontantcredit);
	}

	public void setTrtotal(BigDecimal trtotal) {
		this.trtotal = trtotal;
	}

	public Integer getTrInteret() {
		return trInteret;
	}

	public void setTrInteret(Integer trInteret) {
		this.trInteret = trInteret;
	}

	public java.lang.String getLibelleetat() {
		return libelleetat;
	}

	public void setLibelleetat(java.lang.String libelleetat) {
		this.libelleetat = libelleetat;
	}

	/**
	 * @return Renvoie listeModeReglement.
	 */
	public List getListeModeReglement() {
		return listeModeReglement;
	}

	/**
	 * @param listeModeReglement
	 *            listeModeReglement à définir.
	 */
	public void setListeModeReglement(List listeModeReglement) {
		this.listeModeReglement = listeModeReglement;
	}

	/**
	 * @return Renvoie listetaxes.
	 */
	public List getListetaxes() {
		return listetaxes;
	}

	/**
	 * @param listetaxes
	 *            listetaxes à définir.
	 */
	public void setListetaxes(List listetaxes) {
		this.listetaxes = listetaxes;
	}

	/**
	 * @return Renvoie dateDossier.
	 */
	public Date getDateDossier() {
		return dateDossier;
	}

	/**
	 * @param dateDossier
	 *            dateDossier à définir.
	 */
	public void setDateDossier(Date dateDossier) {
		this.dateDossier = dateDossier;
	}

	/**
	 * @return Renvoie dateDossierString.
	 */
	public String getDateDossierString() {
		return sysEnv.dateToStr(dateDossier);
	}

	/**
	 * @param dateDossierString
	 *            dateDossierString à définir.
	 */
	public void setDateDossierString(String dateDossierString) {
		this.dateDossierString = dateDossierString;
	}

	public String getTrdateReglementPrevu() {
		return trdateReglementPrevu;
	}

	public void setTrdateReglementPrevu(String trdateReglementPrevu) {
		this.trdateReglementPrevu = trdateReglementPrevu;
	}

	public BigDecimal getTrMontantReglement() {
		return trMontantReglement;
	}

	public void setTrMontantReglement(BigDecimal trMontantReglement) {
		this.trMontantReglement = trMontantReglement;
	}

	public BigDecimal getRetardsReglement() {
		return retardsReglement;
	}

	public void setRetardsReglement(BigDecimal retardsReglement) {
		this.retardsReglement = retardsReglement;
	}

	public java.lang.String getNumDecDateEcheance() {
		numDecDateEcheance = getNumDeclaration()+"   |   "+getTrdatebaecheance()+"   |   "+getTrmontantcredit();
		return numDecDateEcheance;
	}

	public void setNumDecDateEcheance(java.lang.String numDecDateEcheance) {
		this.numDecDateEcheance = numDecDateEcheance;
	}

}