package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.utils.sysEnv;


public class RcConsignatairesForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table CONSIGNATAIRES ***/
	//Champs de saisie
	private String numRcCodeConsignataireOB;
	private String numRcCodePartiel;
	private String numListRcCodePPM;
	private String datRcDateCreationConsig;
	private String datRcDateDecision;
	private String datRcDatePartiel;
	private String datRcDateSuspension;
	private String numRcIndSuspensCredit;
	private String numRcNumDecision;
	private String numRcNumRetraitCarteie;
	private String numRcNumSuspension;
	private String datRcRetraitCredit;

	//Champs de recherche
	private String numRcCodeConsignataireRech;
	private String numRcCodePartielRech;
	private String numListRcCodePPMRech;
	private String datRcDateCreationConsigRech;
	private String datRcDateDecisionRech;
	private String datRcDatePartielRech;
	private String datRcDateSuspensionRech;
	private String numRcIndSuspensCreditRech;
	private String numRcNumDecisionRech;
	private String numRcNumRetraitCarteieRech;
	private String numRcNumSuspensionRech;
	private String datRcRetraitCreditRech;
	
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
	
	private List listeRcConsignataires = new ArrayList();
	private Consignataire consignatairesvo = new Consignataire();

	/*** M�thode getNewCONSIGNATAIRESVO () ***/
	public Consignataire getNewRcConsignatairesVO() {
		Consignataire consignatairesvo = new Consignataire();

		consignatairesvo.setRcCodeConsignataire(getNumRcCodeConsignataireOB());
		consignatairesvo.setRcCodePartiel(getNumRcCodePartiel());
		consignatairesvo.setRcCodePpm(getNumListRcCodePPM());
		if (getDatRcDateCreationConsig()!=null && !getDatRcDateCreationConsig().equals("")){
			consignatairesvo.setRcDateCreationConsig(new Date(sysEnv.strToDate(getDatRcDateCreationConsig()).getTime()));
		}
		if (getDatRcDateDecision()!=null && !getDatRcDateDecision().equals("")){
			consignatairesvo.setRcDateDecision(new Date(sysEnv.strToDate(getDatRcDateDecision()).getTime()));
		}
		if (getDatRcDatePartiel()!=null && !getDatRcDatePartiel().equals("")){
			consignatairesvo.setRcDatePartiel(new Date(sysEnv.strToDate(getDatRcDatePartiel()).getTime()));
		}
		if (getDatRcDateSuspension()!=null && !getDatRcDateSuspension().equals("")){
			consignatairesvo.setRcDateSuspension(new Date(sysEnv.strToDate(getDatRcDateSuspension()).getTime()));
		}
		consignatairesvo.setRcIndSuspensCredit(getNumRcIndSuspensCredit());
		consignatairesvo.setRcNumDecision(getNumRcNumDecision());
		consignatairesvo.setRcNumRetraitCarteie(getNumRcNumRetraitCarteie());
		consignatairesvo.setRcNumSuspension(getNumRcNumSuspension());
		if (getDatRcRetraitCredit()!=null && !getDatRcRetraitCredit().equals("")){
			consignatairesvo.setRcRetraitCredit(new Date(sysEnv.strToDate(getDatRcRetraitCredit()).getTime()));
		}
		return consignatairesvo;
	}

	/*** M�thode setConsignataires () ***/
	public void setConsignataires (Consignataire consignatairesvo) {

		setNumRcCodeConsignataireOB (consignatairesvo.getRcCodeConsignataire());
		setNumRcCodePartiel (consignatairesvo.getRcCodePartiel());
		setNumListRcCodePPM (consignatairesvo.getRcCodePpm());
		if (consignatairesvo.getRcDateCreationConsig()!=null){
			setDatRcDateCreationConsig (sysEnv.dateToStr(new Date(consignatairesvo.getRcDateCreationConsig().getTime())));
		}
		if (consignatairesvo.getRcDateDecision()!=null){
			setDatRcDateDecision (sysEnv.dateToStr(new Date(consignatairesvo.getRcDateDecision().getTime())));
		}
		if (consignatairesvo.getRcDatePartiel()!=null){
			setDatRcDatePartiel (sysEnv.dateToStr(new Date(consignatairesvo.getRcDatePartiel().getTime())));
		}
		if (consignatairesvo.getRcDateSuspension()!=null){
			setDatRcDateSuspension (sysEnv.dateToStr(new Date(consignatairesvo.getRcDateSuspension().getTime())));
		}
		setNumRcIndSuspensCredit (consignatairesvo.getRcIndSuspensCredit());
		setNumRcNumDecision (consignatairesvo.getRcNumDecision());
		setNumRcNumRetraitCarteie (consignatairesvo.getRcNumRetraitCarteie());
		setNumRcNumSuspension (consignatairesvo.getRcNumSuspension());
		if (consignatairesvo.getRcRetraitCredit()!=null){
			setDatRcRetraitCredit (sysEnv.dateToStr(new Date(consignatairesvo.getRcRetraitCredit().getTime())));
		}
	}

	/*** M�thodes reset ***/
	public void reset() {
		 numRcCodeConsignataireOB="";
		 numRcCodePartiel="";
		 numListRcCodePPM="";
		 datRcDateCreationConsig="";
		 datRcDateDecision="";
		 datRcDatePartiel="";
		 datRcDateSuspension="";
		 numRcIndSuspensCredit="";
		 numRcNumDecision="";
	     numRcNumRetraitCarteie="";
		 numRcNumSuspension="";
		 datRcRetraitCredit="";
	}
	public void resetChampsRecherche() {	
		 numRcCodeConsignataireRech="";
		 numRcCodePartielRech="";
		 numListRcCodePPMRech="";
		 datRcDateCreationConsigRech="";
		 datRcDateDecisionRech="";
		 datRcDatePartielRech="";
		 datRcDateSuspensionRech="";
		 numRcIndSuspensCreditRech="";
	     numRcNumDecisionRech="";
		 numRcNumRetraitCarteieRech="";
		 numRcNumSuspensionRech="";
		 datRcRetraitCreditRech="";
	}

	/*** M�thodes get et set ***/


	public String getPk () {
		return pk;
	}

	public String getNumRcCodeConsignataireOB() {
		return numRcCodeConsignataireOB;
	}

	public void setNumRcCodeConsignataireOB(String numRcCodeConsignataireOB) {
		this.numRcCodeConsignataireOB = numRcCodeConsignataireOB;
	}

	public String getNumRcCodePartiel() {
		return numRcCodePartiel;
	}

	public void setNumRcCodePartiel(String numRcCodePartiel) {
		this.numRcCodePartiel = numRcCodePartiel;
	}

	public String getNumListRcCodePPM() {
		return numListRcCodePPM;
	}

	public void setNumListRcCodePPM(String numListRcCodePPM) {
		this.numListRcCodePPM = numListRcCodePPM;
	}

	public String getDatRcDateCreationConsig() {
		return datRcDateCreationConsig;
	}

	public void setDatRcDateCreationConsig(String datRcDateCreationConsig) {
		this.datRcDateCreationConsig = datRcDateCreationConsig;
	}

	public String getDatRcDateDecision() {
		return datRcDateDecision;
	}

	public void setDatRcDateDecision(String datRcDateDecision) {
		this.datRcDateDecision = datRcDateDecision;
	}

	public String getDatRcDatePartiel() {
		return datRcDatePartiel;
	}

	public void setDatRcDatePartiel(String datRcDatePartiel) {
		this.datRcDatePartiel = datRcDatePartiel;
	}

	public String getDatRcDateSuspension() {
		return datRcDateSuspension;
	}

	public void setDatRcDateSuspension(String datRcDateSuspension) {
		this.datRcDateSuspension = datRcDateSuspension;
	}

	public String getNumRcIndSuspensCredit() {
		return numRcIndSuspensCredit;
	}

	public void setNumRcIndSuspensCredit(String numRcIndSuspensCredit) {
		this.numRcIndSuspensCredit = numRcIndSuspensCredit;
	}

	public String getNumRcNumDecision() {
		return numRcNumDecision;
	}

	public void setNumRcNumDecision(String numRcNumDecision) {
		this.numRcNumDecision = numRcNumDecision;
	}

	public String getNumRcNumRetraitCarteie() {
		return numRcNumRetraitCarteie;
	}

	public void setNumRcNumRetraitCarteie(String numRcNumRetraitCarteie) {
		this.numRcNumRetraitCarteie = numRcNumRetraitCarteie;
	}

	public String getNumRcNumSuspension() {
		return numRcNumSuspension;
	}

	public void setNumRcNumSuspension(String numRcNumSuspension) {
		this.numRcNumSuspension = numRcNumSuspension;
	}

	public String getDatRcRetraitCredit() {
		return datRcRetraitCredit;
	}

	public void setDatRcRetraitCredit(String datRcRetraitCredit) {
		this.datRcRetraitCredit = datRcRetraitCredit;
	}

	public String getNumRcCodeConsignataireRech() {
		return numRcCodeConsignataireRech;
	}

	public void setNumRcCodeConsignataireRech(String numRcCodeConsignataireRech) {
		this.numRcCodeConsignataireRech = numRcCodeConsignataireRech;
	}

	public String getNumRcCodePartielRech() {
		return numRcCodePartielRech;
	}

	public void setNumRcCodePartielRech(String numRcCodePartielRech) {
		this.numRcCodePartielRech = numRcCodePartielRech;
	}

	public String getNumListRcCodePPMRech() {
		return numListRcCodePPMRech;
	}

	public void setNumListRcCodePPMRech(String numListRcCodePPMRech) {
		this.numListRcCodePPMRech = numListRcCodePPMRech;
	}

	public String getDatRcDateCreationConsigRech() {
		return datRcDateCreationConsigRech;
	}

	public void setDatRcDateCreationConsigRech(String datRcDateCreationConsigRech) {
		this.datRcDateCreationConsigRech = datRcDateCreationConsigRech;
	}

	public String getDatRcDateDecisionRech() {
		return datRcDateDecisionRech;
	}

	public void setDatRcDateDecisionRech(String datRcDateDecisionRech) {
		this.datRcDateDecisionRech = datRcDateDecisionRech;
	}

	public String getDatRcDatePartielRech() {
		return datRcDatePartielRech;
	}

	public void setDatRcDatePartielRech(String datRcDatePartielRech) {
		this.datRcDatePartielRech = datRcDatePartielRech;
	}

	public String getDatRcDateSuspensionRech() {
		return datRcDateSuspensionRech;
	}

	public void setDatRcDateSuspensionRech(String datRcDateSuspensionRech) {
		this.datRcDateSuspensionRech = datRcDateSuspensionRech;
	}

	public String getNumRcIndSuspensCreditRech() {
		return numRcIndSuspensCreditRech;
	}

	public void setNumRcIndSuspensCreditRech(String numRcIndSuspensCreditRech) {
		this.numRcIndSuspensCreditRech = numRcIndSuspensCreditRech;
	}

	public String getNumRcNumDecisionRech() {
		return numRcNumDecisionRech;
	}

	public void setNumRcNumDecisionRech(String numRcNumDecisionRech) {
		this.numRcNumDecisionRech = numRcNumDecisionRech;
	}

	public String getNumRcNumRetraitCarteieRech() {
		return numRcNumRetraitCarteieRech;
	}

	public void setNumRcNumRetraitCarteieRech(String numRcNumRetraitCarteieRech) {
		this.numRcNumRetraitCarteieRech = numRcNumRetraitCarteieRech;
	}

	public String getNumRcNumSuspensionRech() {
		return numRcNumSuspensionRech;
	}

	public void setNumRcNumSuspensionRech(String numRcNumSuspensionRech) {
		this.numRcNumSuspensionRech = numRcNumSuspensionRech;
	}

	public String getDatRcRetraitCreditRech() {
		return datRcRetraitCreditRech;
	}

	public void setDatRcRetraitCreditRech(String datRcRetraitCreditRech) {
		this.datRcRetraitCreditRech = datRcRetraitCreditRech;
	}

	public List getListeRcConsignataires() {
		return listeRcConsignataires;
	}

	public void setListeRcConsignataires(List listeRcConsignataires) {
		this.listeRcConsignataires = listeRcConsignataires;
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