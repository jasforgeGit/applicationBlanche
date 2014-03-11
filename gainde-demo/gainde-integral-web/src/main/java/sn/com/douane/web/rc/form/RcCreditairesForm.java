package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;


public class RcCreditairesForm  implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table CREDITAIRES ***/
	//Champs de saisie
	private String numRcBonAvoir;
	private String numRcCodeCreditaireOB;
	private String numListRcCodePPMOB;
	private String numRcCodeSuspension;
	private String datRcDateCredit;
	private String datRcDateDecision;
	private String datRcDateExtension;
	private String datRcDateRetrait;
	private String datRcDateSuspension;
	private String numRcEtatCredit;
	private String numRcMontantAvoir;
	private String numRcMontantMiniOB;
	private String numRcMontantResiduel;
	private String numRcNumDecision;
	private String numRcNumeroDossier;
	private String numRcNumeroRetrait;
	private String numRcNumSuspension;
	private String numListRcTypeCreditaire;
	private String numRcTypeDecision;

	//Champs de recherche
	private String numRcBonAvoirRech;
	private String numRcCodeCreditaireRech;
	private String numListRcCodePPMRech;
	private String numRcCodeSuspensionRech;
	private String datRcDateCreditRech;
	private String datRcDateDecisionRech;
	private String datRcDateExtensionRech;
	private String datRcDateRetraitRech;
	private String datRcDateSuspensionRech;
	private String numRcEtatCreditRech;
	private String numRcMontantAvoirRech;
	private String numRcMontantMiniRech;
	private String numRcMontantResiduelRech;
	private String numRcNumDecisionRech;
	private String numRcNumeroDossierRech;
	private String numRcNumeroRetraitRech;
	private String numRcNumSuspensionRech;
	private String numListRcTypeCreditaireRech;
	private String numRcTypeDecisionRech;

	/**
	 * variables du Grid 
	 */
	private Integer rows ;
	private Integer page ;
	private String  sord;
	private String  sidx;
	private Integer total;
	private Integer records;
	private String index;
	
	private List listeRcCreditaires = new ArrayList();
	private Creditaire creditairesvo = new Creditaire();

	/*** M�thode getNewCREDITAIRESVO () ***/
	public Creditaire getNewRcCreditairesVO() {
		Creditaire creditairesvo = new Creditaire();

		if (getNumRcBonAvoir()!=null && !getNumRcBonAvoir().equals("")){
			creditairesvo.setRcBonAvoir(sysEnv.strToBigDecimal(getNumRcBonAvoir()));
		}
		creditairesvo.setRcCodeCreditaire(getNumRcCodeCreditaireOB());
		creditairesvo.setRcCodePpm(getNumListRcCodePPMOB());
		creditairesvo.setRcCodeSuspension(getNumRcCodeSuspension());
		if (getDatRcDateCredit()!=null && !getDatRcDateCredit().equals("")){
			creditairesvo.setRcDateCredit(new Date(sysEnv.strToDate(getDatRcDateCredit()).getTime()));
		}
		if (getDatRcDateDecision()!=null && !getDatRcDateDecision().equals("")){
			creditairesvo.setRcDateDecision(new Date(sysEnv.strToDate(getDatRcDateDecision()).getTime()));
		}
		if (getDatRcDateExtension()!=null && !getDatRcDateExtension().equals("")){
			creditairesvo.setRcDateExtension(new Date(sysEnv.strToDate(getDatRcDateExtension()).getTime()));
		}
		if (getDatRcDateRetrait()!=null && !getDatRcDateRetrait().equals("")){
			creditairesvo.setRcDateRetrait(new Date(sysEnv.strToDate(getDatRcDateRetrait()).getTime()));
		}
		if (getDatRcDateSuspension()!=null && !getDatRcDateSuspension().equals("")){
			creditairesvo.setRcDateSuspension(new Date(sysEnv.strToDate(getDatRcDateSuspension()).getTime()));
		}
		creditairesvo.setRcEtatCredit(getNumRcEtatCredit());
		if (getNumRcMontantAvoir()!=null && !getNumRcMontantAvoir().equals("")){
			creditairesvo.setRcMontantAvoir(sysEnv.strToBigDecimal(getNumRcMontantAvoir()));
		}
		if (getNumRcMontantMiniOB()!=null && !getNumRcMontantMiniOB().equals("")){
			creditairesvo.setRcMontantMini(sysEnv.strToBigDecimal(getNumRcMontantMiniOB()));
		}
		if (getNumRcMontantResiduel()!=null && !getNumRcMontantResiduel().equals("")){
			creditairesvo.setRcMontantResiduel(sysEnv.strToBigDecimal(getNumRcMontantResiduel()));
		}
		creditairesvo.setRcNumDecision(getNumRcNumDecision());
		creditairesvo.setRcNumeroDossier(getNumRcNumeroDossier());
		creditairesvo.setRcNumeroRetrait(getNumRcNumeroRetrait());
		creditairesvo.setRcNumSuspension(getNumRcNumSuspension());
		creditairesvo.setRcTypeCreditaire(getNumListRcTypeCreditaire());
		creditairesvo.setRcTypeDecision(getNumRcTypeDecision());

		return creditairesvo;
	}

	/*** M�thode setCreditaires () ***/
	public void setCreditaires (Creditaire creditairesvo) {

		if (creditairesvo.getRcBonAvoir()!=null){
			setNumRcBonAvoir (ConvertUtil.converToString(creditairesvo.getRcBonAvoir()));
		}
		setNumRcCodeCreditaireOB (creditairesvo.getRcCodeCreditaire());
		setNumListRcCodePPMOB (creditairesvo.getRcCodePpm());
		setNumRcCodeSuspension (creditairesvo.getRcCodeSuspension());
		if (creditairesvo.getRcDateCredit()!=null){
			setDatRcDateCredit (DateUtil.getDate(new Date(creditairesvo.getRcDateCredit().getTime())));
		}
		if (creditairesvo.getRcDateDecision()!=null){
			setDatRcDateDecision (DateUtil.getDate(new Date(creditairesvo.getRcDateDecision().getTime())));
		}
		if (creditairesvo.getRcDateExtension()!=null){
			setDatRcDateExtension (DateUtil.getDate(new Date(creditairesvo.getRcDateExtension().getTime())));
		}
		if (creditairesvo.getRcDateRetrait()!=null){
			setDatRcDateRetrait (DateUtil.getDate(new Date(creditairesvo.getRcDateRetrait().getTime())));
		}
		if (creditairesvo.getRcDateSuspension()!=null){
			setDatRcDateSuspension (DateUtil.getDate(new Date(creditairesvo.getRcDateSuspension().getTime())));
		}
		setNumRcEtatCredit (creditairesvo.getRcEtatCredit());
		if (creditairesvo.getRcMontantAvoir()!=null){
			setNumRcMontantAvoir (ConvertUtil.converToString(creditairesvo.getRcMontantAvoir()));
		}
		if (creditairesvo.getRcMontantMini()!=null){
			setNumRcMontantMiniOB (ConvertUtil.converToString(creditairesvo.getRcMontantMini()));
		}
		if (creditairesvo.getRcMontantResiduel()!=null){
			setNumRcMontantResiduel (ConvertUtil.converToString(creditairesvo.getRcMontantResiduel()));
		}
		setNumRcNumDecision (creditairesvo.getRcNumDecision());
		setNumRcNumeroDossier (creditairesvo.getRcNumeroDossier());
		setNumRcNumeroRetrait (creditairesvo.getRcNumeroRetrait());
		setNumRcNumSuspension (creditairesvo.getRcNumSuspension());
		setNumListRcTypeCreditaire (creditairesvo.getRcTypeCreditaire());
		setNumRcTypeDecision (creditairesvo.getRcTypeDecision());

	}

	/*** M�thodes reset ***/
	public void reset() {
	 numRcBonAvoir="";
	 numRcCodeCreditaireOB="";
	 numListRcCodePPMOB="";
     numRcCodeSuspension="";
     datRcDateCredit="";
     datRcDateDecision="";
     datRcDateExtension="";
     datRcDateRetrait="";
     datRcDateSuspension="";
     numRcEtatCredit="";
     numRcMontantAvoir="";
     numRcMontantMiniOB="";
     numRcMontantResiduel="";
     numRcNumDecision="";
     numRcNumeroDossier="";
     numRcNumeroRetrait="";
     numRcNumSuspension="";
     numListRcTypeCreditaire="";
     numRcTypeDecision="";	
	}
	public void resetChampsRecherche() {
	  numRcBonAvoirRech="";
	  numRcCodeCreditaireRech="";
	  numListRcCodePPMRech="";
	  numRcCodeSuspensionRech="";
	  datRcDateCreditRech="";
	  datRcDateDecisionRech="";
	  datRcDateExtensionRech="";
	  datRcDateRetraitRech="";
	  datRcDateSuspensionRech="";
	  numRcEtatCreditRech="";
	  numRcMontantAvoirRech="";
	  numRcMontantMiniRech="";
	  numRcMontantResiduelRech="";
	  numRcNumDecisionRech="";
	  numRcNumeroDossierRech="";
	  numRcNumeroRetraitRech="";
	  numRcNumSuspensionRech="";
	  numListRcTypeCreditaireRech="";
	  numRcTypeDecisionRech="";
	}

	/*** M�thodes get et set ***/
	public String getPk () {
		return pk;
	}

	public String getNumRcBonAvoir() {
		return numRcBonAvoir;
	}

	public void setNumRcBonAvoir(String numRcBonAvoir) {
		this.numRcBonAvoir = numRcBonAvoir;
	}

	public String getNumRcCodeCreditaireOB() {
		return numRcCodeCreditaireOB;
	}

	public void setNumRcCodeCreditaireOB(String numRcCodeCreditaireOB) {
		this.numRcCodeCreditaireOB = numRcCodeCreditaireOB;
	}

	public String getNumListRcCodePPMOB() {
		return numListRcCodePPMOB;
	}

	public void setNumListRcCodePPMOB(String numListRcCodePPMOB) {
		this.numListRcCodePPMOB = numListRcCodePPMOB;
	}

	public String getNumRcCodeSuspension() {
		return numRcCodeSuspension;
	}

	public void setNumRcCodeSuspension(String numRcCodeSuspension) {
		this.numRcCodeSuspension = numRcCodeSuspension;
	}

	public String getDatRcDateCredit() {
		return datRcDateCredit;
	}

	public void setDatRcDateCredit(String datRcDateCredit) {
		this.datRcDateCredit = datRcDateCredit;
	}

	public String getDatRcDateDecision() {
		return datRcDateDecision;
	}

	public void setDatRcDateDecision(String datRcDateDecision) {
		this.datRcDateDecision = datRcDateDecision;
	}

	public String getDatRcDateExtension() {
		return datRcDateExtension;
	}

	public void setDatRcDateExtension(String datRcDateExtension) {
		this.datRcDateExtension = datRcDateExtension;
	}

	public String getDatRcDateRetrait() {
		return datRcDateRetrait;
	}

	public void setDatRcDateRetrait(String datRcDateRetrait) {
		this.datRcDateRetrait = datRcDateRetrait;
	}

	public String getDatRcDateSuspension() {
		return datRcDateSuspension;
	}

	public void setDatRcDateSuspension(String datRcDateSuspension) {
		this.datRcDateSuspension = datRcDateSuspension;
	}

	public String getNumRcEtatCredit() {
		return numRcEtatCredit;
	}

	public void setNumRcEtatCredit(String numRcEtatCredit) {
		this.numRcEtatCredit = numRcEtatCredit;
	}

	public String getNumRcMontantAvoir() {
		return numRcMontantAvoir;
	}

	public void setNumRcMontantAvoir(String numRcMontantAvoir) {
		this.numRcMontantAvoir = numRcMontantAvoir;
	}

	public String getNumRcMontantMiniOB() {
		return numRcMontantMiniOB;
	}

	public void setNumRcMontantMiniOB(String numRcMontantMiniOB) {
		this.numRcMontantMiniOB = numRcMontantMiniOB;
	}

	public String getNumRcMontantResiduel() {
		return numRcMontantResiduel;
	}

	public void setNumRcMontantResiduel(String numRcMontantResiduel) {
		this.numRcMontantResiduel = numRcMontantResiduel;
	}

	public String getNumRcNumDecision() {
		return numRcNumDecision;
	}

	public void setNumRcNumDecision(String numRcNumDecision) {
		this.numRcNumDecision = numRcNumDecision;
	}

	public String getNumRcNumeroDossier() {
		return numRcNumeroDossier;
	}

	public void setNumRcNumeroDossier(String numRcNumeroDossier) {
		this.numRcNumeroDossier = numRcNumeroDossier;
	}

	public String getNumRcNumeroRetrait() {
		return numRcNumeroRetrait;
	}

	public void setNumRcNumeroRetrait(String numRcNumeroRetrait) {
		this.numRcNumeroRetrait = numRcNumeroRetrait;
	}

	public String getNumRcNumSuspension() {
		return numRcNumSuspension;
	}

	public void setNumRcNumSuspension(String numRcNumSuspension) {
		this.numRcNumSuspension = numRcNumSuspension;
	}

	public String getNumListRcTypeCreditaire() {
		return numListRcTypeCreditaire;
	}

	public void setNumListRcTypeCreditaire(String numListRcTypeCreditaire) {
		this.numListRcTypeCreditaire = numListRcTypeCreditaire;
	}

	public String getNumRcTypeDecision() {
		return numRcTypeDecision;
	}

	public void setNumRcTypeDecision(String numRcTypeDecision) {
		this.numRcTypeDecision = numRcTypeDecision;
	}

	public String getNumRcBonAvoirRech() {
		return numRcBonAvoirRech;
	}

	public void setNumRcBonAvoirRech(String numRcBonAvoirRech) {
		this.numRcBonAvoirRech = numRcBonAvoirRech;
	}

	public String getNumRcCodeCreditaireRech() {
		return numRcCodeCreditaireRech;
	}

	public void setNumRcCodeCreditaireRech(String numRcCodeCreditaireRech) {
		this.numRcCodeCreditaireRech = numRcCodeCreditaireRech;
	}

	public String getNumListRcCodePPMRech() {
		return numListRcCodePPMRech;
	}

	public void setNumListRcCodePPMRech(String numListRcCodePPMRech) {
		this.numListRcCodePPMRech = numListRcCodePPMRech;
	}

	public String getNumRcCodeSuspensionRech() {
		return numRcCodeSuspensionRech;
	}

	public void setNumRcCodeSuspensionRech(String numRcCodeSuspensionRech) {
		this.numRcCodeSuspensionRech = numRcCodeSuspensionRech;
	}

	public String getDatRcDateCreditRech() {
		return datRcDateCreditRech;
	}

	public void setDatRcDateCreditRech(String datRcDateCreditRech) {
		this.datRcDateCreditRech = datRcDateCreditRech;
	}

	public String getDatRcDateDecisionRech() {
		return datRcDateDecisionRech;
	}

	public void setDatRcDateDecisionRech(String datRcDateDecisionRech) {
		this.datRcDateDecisionRech = datRcDateDecisionRech;
	}

	public String getDatRcDateExtensionRech() {
		return datRcDateExtensionRech;
	}

	public void setDatRcDateExtensionRech(String datRcDateExtensionRech) {
		this.datRcDateExtensionRech = datRcDateExtensionRech;
	}

	public String getDatRcDateRetraitRech() {
		return datRcDateRetraitRech;
	}

	public void setDatRcDateRetraitRech(String datRcDateRetraitRech) {
		this.datRcDateRetraitRech = datRcDateRetraitRech;
	}

	public String getDatRcDateSuspensionRech() {
		return datRcDateSuspensionRech;
	}

	public void setDatRcDateSuspensionRech(String datRcDateSuspensionRech) {
		this.datRcDateSuspensionRech = datRcDateSuspensionRech;
	}

	public String getNumRcEtatCreditRech() {
		return numRcEtatCreditRech;
	}

	public void setNumRcEtatCreditRech(String numRcEtatCreditRech) {
		this.numRcEtatCreditRech = numRcEtatCreditRech;
	}

	public String getNumRcMontantAvoirRech() {
		return numRcMontantAvoirRech;
	}

	public void setNumRcMontantAvoirRech(String numRcMontantAvoirRech) {
		this.numRcMontantAvoirRech = numRcMontantAvoirRech;
	}

	public String getNumRcMontantMiniRech() {
		return numRcMontantMiniRech;
	}

	public void setNumRcMontantMiniRech(String numRcMontantMiniRech) {
		this.numRcMontantMiniRech = numRcMontantMiniRech;
	}

	public String getNumRcMontantResiduelRech() {
		return numRcMontantResiduelRech;
	}

	public void setNumRcMontantResiduelRech(String numRcMontantResiduelRech) {
		this.numRcMontantResiduelRech = numRcMontantResiduelRech;
	}

	public String getNumRcNumDecisionRech() {
		return numRcNumDecisionRech;
	}

	public void setNumRcNumDecisionRech(String numRcNumDecisionRech) {
		this.numRcNumDecisionRech = numRcNumDecisionRech;
	}

	public String getNumRcNumeroDossierRech() {
		return numRcNumeroDossierRech;
	}

	public void setNumRcNumeroDossierRech(String numRcNumeroDossierRech) {
		this.numRcNumeroDossierRech = numRcNumeroDossierRech;
	}

	public String getNumRcNumeroRetraitRech() {
		return numRcNumeroRetraitRech;
	}

	public void setNumRcNumeroRetraitRech(String numRcNumeroRetraitRech) {
		this.numRcNumeroRetraitRech = numRcNumeroRetraitRech;
	}

	public String getNumRcNumSuspensionRech() {
		return numRcNumSuspensionRech;
	}

	public void setNumRcNumSuspensionRech(String numRcNumSuspensionRech) {
		this.numRcNumSuspensionRech = numRcNumSuspensionRech;
	}

	public String getNumListRcTypeCreditaireRech() {
		return numListRcTypeCreditaireRech;
	}

	public void setNumListRcTypeCreditaireRech(String numListRcTypeCreditaireRech) {
		this.numListRcTypeCreditaireRech = numListRcTypeCreditaireRech;
	}

	public String getNumRcTypeDecisionRech() {
		return numRcTypeDecisionRech;
	}

	public void setNumRcTypeDecisionRech(String numRcTypeDecisionRech) {
		this.numRcTypeDecisionRech = numRcTypeDecisionRech;
	}

	public List getListeRcCreditaires() {
		return listeRcCreditaires;
	}

	public void setListeRcCreditaires(List listeRcCreditaires) {
		this.listeRcCreditaires = listeRcCreditaires;
	}

	public Creditaire getCreditairesvo() {
		return creditairesvo;
	}

	public void setCreditairesvo(Creditaire creditairesvo) {
		this.creditairesvo = creditairesvo;
	}

	public void setPk (String pk) {
		this.pk = pk;
	}

	public String getEtat () {
		return etat;
	}

	public void setEtat (String etat) {
		this.etat = etat;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
}