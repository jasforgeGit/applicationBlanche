package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.ImportExport;
import sn.com.douane.utils.sysEnv;


public class RcImportexportForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table IMPORTEXPORT ***/
	//Champs de saisie
	private String numListRcCodePPM;
	private String datRcDateCarte;
	private String datRcDateRetraitCredit;
	private String datRcDateSuspension;
	private String numRcNineaImpExp;
	private String numRcNumCarteImpExp;
	private String numRcNumDecision;
	private String numRcNumImportExportOB;
	private String numRcNumSuspension;

	//Champs de recherche
	private String numListRcCodePPMRech;
	private String datRcDateCarteRech;
	private String datRcDateRetraitCreditRech;
	private String datRcDateSuspensionRech;
	private String numRcNineaImpExpRech;
	private String numRcNumCarteImpExpRech;
	private String numRcNumDecisionRech;
	private String numRcNumImportExportRech;
	private String numRcNumSuspensionRech;
	
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
	
	private List listeRcImportexport = new ArrayList();
	private ImportExport importexportvo = new ImportExport();

	/*** M�thode getNewIMPORTEXPORTVO () ***/
	public ImportExport getNewRcImportexportVO() {
		ImportExport importexportvo = new ImportExport();

		importexportvo.setRcCodePpm(getNumListRcCodePPM());
		if (getDatRcDateCarte()!=null && !getDatRcDateCarte().equals("")){
			importexportvo.setRcDateCarte(new Date(sysEnv.strToDate(getDatRcDateCarte()).getTime()));
		}
		if (getDatRcDateRetraitCredit()!=null && !getDatRcDateRetraitCredit().equals("")){
			importexportvo.setRcDateRetraitCredit(new Date(sysEnv.strToDate(getDatRcDateRetraitCredit()).getTime()));
		}
		if (getDatRcDateSuspension()!=null && !getDatRcDateSuspension().equals("")){
			importexportvo.setRcDateSuspension(new Date(sysEnv.strToDate(getDatRcDateSuspension()).getTime()));
		}
		importexportvo.setRcNineaImpExp(getNumRcNineaImpExp());
		importexportvo.setRcNumCarteImpExp(getNumRcNumCarteImpExp());
		importexportvo.setRcNumDecision(getNumRcNumDecision());
		importexportvo.setRcNumImportExport(getNumRcNumImportExportOB());
		importexportvo.setRcNumSuspension(getNumRcNumSuspension());

		return importexportvo;
	}

	/*** M�thode setImportexport () ***/
	public void setImportexport (ImportExport importexportvo) {

		setNumListRcCodePPM (importexportvo.getRcCodePpm());
		if (importexportvo.getRcDateCarte()!=null){
			setDatRcDateCarte (sysEnv.dateToStr(new Date(importexportvo.getRcDateCarte().getTime())));
		}
		if (importexportvo.getRcDateRetraitCredit()!=null){
			setDatRcDateRetraitCredit (sysEnv.dateToStr(new Date(importexportvo.getRcDateRetraitCredit().getTime())));
		}
		if (importexportvo.getRcDateSuspension()!=null){
			setDatRcDateSuspension (sysEnv.dateToStr(new Date(importexportvo.getRcDateSuspension().getTime())));
		}
		setNumRcNineaImpExp (importexportvo.getRcNineaImpExp());
		setNumRcNumCarteImpExp (importexportvo.getRcNumCarteImpExp());
		setNumRcNumDecision (importexportvo.getRcNumDecision());
		setNumRcNumImportExportOB (importexportvo.getRcNumImportExport());
		setNumRcNumSuspension (importexportvo.getRcNumSuspension());

	}

	/*** M�thodes reset ***/
	public void reset() {
		 numListRcCodePPM ="";
		 datRcDateCarte ="";
		 datRcDateRetraitCredit ="";
		 datRcDateSuspension ="";
		 numRcNineaImpExp ="";
		 numRcNumCarteImpExp ="";
		 numRcNumDecision ="";
		 numRcNumImportExportOB ="";
		 numRcNumSuspension ="";
	}
	public void resetChampsRecherche() {
		 numListRcCodePPMRech ="";
		 datRcDateCarteRech ="";
		 datRcDateRetraitCreditRech ="";
		 datRcDateSuspensionRech ="";
		 numRcNineaImpExpRech ="";
		 numRcNumCarteImpExpRech ="";
		 numRcNumDecisionRech ="";
		 numRcNumImportExportRech ="";
		 numRcNumSuspensionRech ="";
	}

	/*** M�thodes get et set ***/
	public String getPk () {
		return pk;
	}

	public String getNumListRcCodePPM() {
		return numListRcCodePPM;
	}

	public void setNumListRcCodePPM(String numListRcCodePPM) {
		this.numListRcCodePPM = numListRcCodePPM;
	}

	public String getDatRcDateCarte() {
		return datRcDateCarte;
	}

	public void setDatRcDateCarte(String datRcDateCarte) {
		this.datRcDateCarte = datRcDateCarte;
	}

	public String getDatRcDateRetraitCredit() {
		return datRcDateRetraitCredit;
	}

	public void setDatRcDateRetraitCredit(String datRcDateRetraitCredit) {
		this.datRcDateRetraitCredit = datRcDateRetraitCredit;
	}

	public String getDatRcDateSuspension() {
		return datRcDateSuspension;
	}

	public void setDatRcDateSuspension(String datRcDateSuspension) {
		this.datRcDateSuspension = datRcDateSuspension;
	}

	public String getNumRcNineaImpExp() {
		return numRcNineaImpExp;
	}

	public void setNumRcNineaImpExp(String numRcNineaImpExp) {
		this.numRcNineaImpExp = numRcNineaImpExp;
	}

	public String getNumRcNumCarteImpExp() {
		return numRcNumCarteImpExp;
	}

	public void setNumRcNumCarteImpExp(String numRcNumCarteImpExp) {
		this.numRcNumCarteImpExp = numRcNumCarteImpExp;
	}

	public String getNumRcNumDecision() {
		return numRcNumDecision;
	}

	public void setNumRcNumDecision(String numRcNumDecision) {
		this.numRcNumDecision = numRcNumDecision;
	}

	public String getNumRcNumImportExportOB() {
		return numRcNumImportExportOB;
	}

	public void setNumRcNumImportExportOB(String numRcNumImportExportOB) {
		this.numRcNumImportExportOB = numRcNumImportExportOB;
	}

	public String getNumRcNumSuspension() {
		return numRcNumSuspension;
	}

	public void setNumRcNumSuspension(String numRcNumSuspension) {
		this.numRcNumSuspension = numRcNumSuspension;
	}

	public String getNumListRcCodePPMRech() {
		return numListRcCodePPMRech;
	}

	public void setNumListRcCodePPMRech(String numListRcCodePPMRech) {
		this.numListRcCodePPMRech = numListRcCodePPMRech;
	}

	public String getDatRcDateCarteRech() {
		return datRcDateCarteRech;
	}

	public void setDatRcDateCarteRech(String datRcDateCarteRech) {
		this.datRcDateCarteRech = datRcDateCarteRech;
	}

	public String getDatRcDateRetraitCreditRech() {
		return datRcDateRetraitCreditRech;
	}

	public void setDatRcDateRetraitCreditRech(String datRcDateRetraitCreditRech) {
		this.datRcDateRetraitCreditRech = datRcDateRetraitCreditRech;
	}

	public String getDatRcDateSuspensionRech() {
		return datRcDateSuspensionRech;
	}

	public void setDatRcDateSuspensionRech(String datRcDateSuspensionRech) {
		this.datRcDateSuspensionRech = datRcDateSuspensionRech;
	}

	public String getNumRcNineaImpExpRech() {
		return numRcNineaImpExpRech;
	}

	public void setNumRcNineaImpExpRech(String numRcNineaImpExpRech) {
		this.numRcNineaImpExpRech = numRcNineaImpExpRech;
	}

	public String getNumRcNumCarteImpExpRech() {
		return numRcNumCarteImpExpRech;
	}

	public void setNumRcNumCarteImpExpRech(String numRcNumCarteImpExpRech) {
		this.numRcNumCarteImpExpRech = numRcNumCarteImpExpRech;
	}

	public String getNumRcNumDecisionRech() {
		return numRcNumDecisionRech;
	}

	public void setNumRcNumDecisionRech(String numRcNumDecisionRech) {
		this.numRcNumDecisionRech = numRcNumDecisionRech;
	}

	public String getNumRcNumImportExportRech() {
		return numRcNumImportExportRech;
	}

	public void setNumRcNumImportExportRech(String numRcNumImportExportRech) {
		this.numRcNumImportExportRech = numRcNumImportExportRech;
	}

	public String getNumRcNumSuspensionRech() {
		return numRcNumSuspensionRech;
	}

	public void setNumRcNumSuspensionRech(String numRcNumSuspensionRech) {
		this.numRcNumSuspensionRech = numRcNumSuspensionRech;
	}

	public List getListeRcImportexport() {
		return listeRcImportexport;
	}

	public void setListeRcImportexport(List listeRcImportexport) {
		this.listeRcImportexport = listeRcImportexport;
	}

	public ImportExport getImportexportvo() {
		return importexportvo;
	}

	public void setImportexportvo(ImportExport importexportvo) {
		this.importexportvo = importexportvo;
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