package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.utils.sysEnv;


public class RcAgreeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table AGREE ***/
	//Champs de saisie
	private String numRcCodeAgreeOB;
	private String numListRcCodePPMOB;
	private String datRcDateDecisionOB;
	private String numRcEtatAgree;
	private String numRcNumDecisionOB;
	private String numRcRetrait;
	private String numRcSuspendu;
	private String numRcTypeDecision;

	//Champs de recherche
	private String numRcCodeAgreeRech;
	private String numListRcCodePPMRech;
	private String datRcDateDecisionRech;
	private String numRcEtatAgreeRech;
	private String numRcNumDecisionRech;
	private String numRcRetraitRech;
	private String numRcSuspenduRech;
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
	
	private List listeRcAgree = new ArrayList();
	private Agree agreevo = new Agree();

	/*** M�thode getNewAGREEVO () ***/
	public Agree getNewRcAgreeVO() {
		Agree agreevo = new Agree();

		agreevo.setRcCodeAgree(getNumRcCodeAgreeOB());
		agreevo.setRcCodePpm(getNumListRcCodePPMOB());
		if (getDatRcDateDecisionOB()!=null && !getDatRcDateDecisionOB().equals("")){
			agreevo.setRcDateDecision(new Date(sysEnv.strToDate(getDatRcDateDecisionOB()).getTime()));
		}
		agreevo.setRcEtatAgree(getNumRcEtatAgree());
		agreevo.setRcNumDecision(getNumRcNumDecisionOB());
		agreevo.setRcRetrait(getNumRcRetrait());
		agreevo.setRcSuspendu(getNumRcSuspendu());
		agreevo.setRcTypeDecision(getNumRcTypeDecision());

		return agreevo;
	}

	/*** M�thode setAgree () ***/
	public void setAgree (Agree agreevo) {

		setNumRcCodeAgreeOB (agreevo.getRcCodeAgree());
		setNumListRcCodePPMOB (agreevo.getRcCodePpm());
		if (agreevo.getRcDateDecision()!=null){
			setDatRcDateDecisionOB (sysEnv.dateToStr(new Date(agreevo.getRcDateDecision().getTime())));
		}
		setNumRcEtatAgree (agreevo.getRcEtatAgree());
		setNumRcNumDecisionOB(agreevo.getRcNumDecision());
		setNumRcRetrait (agreevo.getRcRetrait());
		setNumRcSuspendu (agreevo.getRcSuspendu());
		setNumRcTypeDecision (agreevo.getRcTypeDecision());

	}

	/*** M�thodes reset ***/
	public void reset() {
		 numRcCodeAgreeOB ="";
		 numListRcCodePPMOB ="";
		 datRcDateDecisionOB ="";
		 numRcEtatAgree ="";
		 numRcNumDecisionOB ="";
		 numRcRetrait ="";
		 numRcSuspendu ="";
		 numRcTypeDecision ="";

	}
	public void resetChampsRecherche() {
		 numRcCodeAgreeRech ="";
		 numListRcCodePPMRech ="";
		 datRcDateDecisionRech ="";
		 numRcEtatAgreeRech ="";
		 numRcNumDecisionRech ="";
		 numRcRetraitRech ="";
		 numRcSuspenduRech ="";
		 numRcTypeDecisionRech ="";
		
	}

	/*** M�thodes get et set ***/
	public String getPk () {
		return pk;
	}

	public String getNumRcCodeAgreeOB() {
		return numRcCodeAgreeOB;
	}

	public void setNumRcCodeAgreeOB(String numRcCodeAgreeOB) {
		this.numRcCodeAgreeOB = numRcCodeAgreeOB;
	}

	public String getNumListRcCodePPMOB() {
		return numListRcCodePPMOB;
	}

	public void setNumListRcCodePPMOB(String numListRcCodePPMOB) {
		this.numListRcCodePPMOB = numListRcCodePPMOB;
	}

	public String getDatRcDateDecisionOB() {
		return datRcDateDecisionOB;
	}

	public void setDatRcDateDecisionOB(String datRcDateDecisionOB) {
		this.datRcDateDecisionOB = datRcDateDecisionOB;
	}

	public String getNumRcEtatAgree() {
		return numRcEtatAgree;
	}

	public void setNumRcEtatAgree(String numRcEtatAgree) {
		this.numRcEtatAgree = numRcEtatAgree;
	}

	public String getNumRcNumDecisionOB() {
		return numRcNumDecisionOB;
	}

	public void setNumRcNumDecisionOB(String numRcNumDecisionOB) {
		this.numRcNumDecisionOB = numRcNumDecisionOB;
	}

	public String getNumRcRetrait() {
		return numRcRetrait;
	}

	public void setNumRcRetrait(String numRcRetrait) {
		this.numRcRetrait = numRcRetrait;
	}

	public String getNumRcSuspendu() {
		return numRcSuspendu;
	}

	public void setNumRcSuspendu(String numRcSuspendu) {
		this.numRcSuspendu = numRcSuspendu;
	}

	public String getNumRcTypeDecision() {
		return numRcTypeDecision;
	}

	public void setNumRcTypeDecision(String numRcTypeDecision) {
		this.numRcTypeDecision = numRcTypeDecision;
	}

	public String getNumRcCodeAgreeRech() {
		return numRcCodeAgreeRech;
	}

	public void setNumRcCodeAgreeRech(String numRcCodeAgreeRech) {
		this.numRcCodeAgreeRech = numRcCodeAgreeRech;
	}

	public String getNumListRcCodePPMRech() {
		return numListRcCodePPMRech;
	}

	public void setNumListRcCodePPMRech(String numListRcCodePPMRech) {
		this.numListRcCodePPMRech = numListRcCodePPMRech;
	}

	public String getDatRcDateDecisionRech() {
		return datRcDateDecisionRech;
	}

	public void setDatRcDateDecisionRech(String datRcDateDecisionRech) {
		this.datRcDateDecisionRech = datRcDateDecisionRech;
	}

	public String getNumRcEtatAgreeRech() {
		return numRcEtatAgreeRech;
	}

	public void setNumRcEtatAgreeRech(String numRcEtatAgreeRech) {
		this.numRcEtatAgreeRech = numRcEtatAgreeRech;
	}

	public String getNumRcNumDecisionRech() {
		return numRcNumDecisionRech;
	}

	public void setNumRcNumDecisionRech(String numRcNumDecisionRech) {
		this.numRcNumDecisionRech = numRcNumDecisionRech;
	}

	public String getNumRcRetraitRech() {
		return numRcRetraitRech;
	}

	public void setNumRcRetraitRech(String numRcRetraitRech) {
		this.numRcRetraitRech = numRcRetraitRech;
	}

	public String getNumRcSuspenduRech() {
		return numRcSuspenduRech;
	}

	public void setNumRcSuspenduRech(String numRcSuspenduRech) {
		this.numRcSuspenduRech = numRcSuspenduRech;
	}

	public String getNumRcTypeDecisionRech() {
		return numRcTypeDecisionRech;
	}

	public void setNumRcTypeDecisionRech(String numRcTypeDecisionRech) {
		this.numRcTypeDecisionRech = numRcTypeDecisionRech;
	}

	public List getListeRcAgree() {
		return listeRcAgree;
	}

	public void setListeRcAgree(List listeRcAgree) {
		this.listeRcAgree = listeRcAgree;
	}

	public Agree getAgreevo() {
		return agreevo;
	}

	public void setAgreevo(Agree agreevo) {
		this.agreevo = agreevo;
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