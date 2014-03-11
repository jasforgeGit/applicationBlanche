package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.CircuitVisite;

public class RcCircuitVisiteForm implements Serializable {
	
	private static final long serialVersionUID = -1391114967950893859L;
	
	private String pk;
	private String etat;
	
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

	/*** Attributs Table CIRCUITVISITE ***/
	//Champs de saisie
	private String TNUM_RCCODECIRCUIT_OB;
	private String TNUM_RCDESCIRCUITVISITE_OB;

	//Champs de recherche
	private String TNUM_RCCODECIRCUITRech;
	private String TNUM_RCDESCIRCUITVISITERech;

	List listeRcCircuitvisite = new ArrayList();
	CircuitVisite circuitvisitevo = new CircuitVisite();

	/*** Methode getNewCIRCUITVISITEVO () ***/
	public CircuitVisite getNewRcCircuitvisiteVO() {
		CircuitVisite circuitvisitevo = new CircuitVisite();

		circuitvisitevo.setRccodecircuit(getTNUM_RCCODECIRCUIT_OB());
		circuitvisitevo.setRcdescircuitvisite(getTNUM_RCDESCIRCUITVISITE_OB());

		return circuitvisitevo;
	}

	/*** Methode setCircuitvisite () ***/
	public void setCircuitvisite (CircuitVisite circuitvisitevo) {

		setTNUM_RCCODECIRCUIT_OB (circuitvisitevo.getRccodecircuit());
		setTNUM_RCDESCIRCUITVISITE_OB (circuitvisitevo.getRcdescircuitvisite());

	}

	/*** Methodes reset ***/
	public void reset() {
		TNUM_RCCODECIRCUIT_OB="";
		TNUM_RCDESCIRCUITVISITE_OB="";
	}
	public void resetChampsRecherche() {
		TNUM_RCCODECIRCUITRech="";
		TNUM_RCDESCIRCUITVISITERech="";
	}

	/*** Methodes get et set ***/
	public String getTNUM_RCCODECIRCUIT_OB () {
		return TNUM_RCCODECIRCUIT_OB;
	}

	public void setTNUM_RCCODECIRCUIT_OB (String tnum_rccodecircuit_ob) {
		TNUM_RCCODECIRCUIT_OB = tnum_rccodecircuit_ob;
	}

	public String getTNUM_RCDESCIRCUITVISITE_OB () {
		return TNUM_RCDESCIRCUITVISITE_OB;
	}

	public void setTNUM_RCDESCIRCUITVISITE_OB (String tnum_rcdescircuitvisite_ob) {
		TNUM_RCDESCIRCUITVISITE_OB = tnum_rcdescircuitvisite_ob;
	}

	public String getTNUM_RCCODECIRCUITRech () {
		return TNUM_RCCODECIRCUITRech;
	}

	public void setTNUM_RCCODECIRCUITRech (String tnum_rccodecircuitrech) {
		TNUM_RCCODECIRCUITRech = tnum_rccodecircuitrech;
	}

	public String getTNUM_RCDESCIRCUITVISITERech () {
		return TNUM_RCDESCIRCUITVISITERech;
	}

	public void setTNUM_RCDESCIRCUITVISITERech (String tnum_rcdescircuitvisiterech) {
		TNUM_RCDESCIRCUITVISITERech = tnum_rcdescircuitvisiterech;
	}

	public CircuitVisite getCircuitvisiteVO () {
		return circuitvisitevo;
	}

	public void setCircuitvisiteVO (CircuitVisite circuitvisitevo) {
		this.circuitvisitevo = circuitvisitevo;
	}

	public List getListeRcCircuitvisite () {
		return listeRcCircuitvisite;
	}

	public void setListeRcCircuitvisite (List listeRcCircuitvisite) {
		this.listeRcCircuitvisite = listeRcCircuitvisite;
	}

	public String getPk () {
		return pk;
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