package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;


public class RcSoumissioncreditaireForm implements Serializable {

	private static final long serialVersionUID = 1L;
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
	
	/*** Attributs Table SOUMISSIONCREDITAIRE ***/
	//Champs de saisie
	private String numListRcCodeCreditaireOB;
	private String numListRcCodeIndicateurOB;

	//Champs de recherche
	private String numListRcCodeCreditaireRech;
	private String numListRcCodeIndicateurRech;

	private List listeRcSoumissioncreditaire = new ArrayList();
	private SoumissionCreditaire soumissioncreditairevo = new SoumissionCreditaire();

	/*** M�thode getNewSOUMISSIONCREDITAIREVO () ***/
	public SoumissionCreditaire getNewRcSoumissioncreditaireVO() {
		SoumissionCreditaire soumissioncreditairevo = new SoumissionCreditaire();

		soumissioncreditairevo.setRcCodeCreditaire(getNumListRcCodeCreditaireOB());
		soumissioncreditairevo.setRcCodeIndicateur(getNumListRcCodeIndicateurOB());

		return soumissioncreditairevo;
	}

	/*** M�thode setSoumissioncreditaire () ***/
	public void setSoumissioncreditaire (SoumissionCreditaire soumissioncreditairevo) {

		setNumListRcCodeCreditaireOB (soumissioncreditairevo.getRcCodeCreditaire());
		setNumListRcCodeIndicateurOB (soumissioncreditairevo.getRcCodeIndicateur());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeCreditaireOB="";
		numListRcCodeIndicateurOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeCreditaireRech="";
		numListRcCodeIndicateurRech="";
	}

	public String getNumListRcCodeCreditaireOB() {
		return numListRcCodeCreditaireOB;
	}

	public void setNumListRcCodeCreditaireOB(String numListRcCodeCreditaireOB) {
		this.numListRcCodeCreditaireOB = numListRcCodeCreditaireOB;
	}

	public String getNumListRcCodeIndicateurOB() {
		return numListRcCodeIndicateurOB;
	}

	public void setNumListRcCodeIndicateurOB(String numListRcCodeIndicateurOB) {
		this.numListRcCodeIndicateurOB = numListRcCodeIndicateurOB;
	}

	public String getNumListRcCodeCreditaireRech() {
		return numListRcCodeCreditaireRech;
	}

	public void setNumListRcCodeCreditaireRech(String numListRcCodeCreditaireRech) {
		this.numListRcCodeCreditaireRech = numListRcCodeCreditaireRech;
	}

	public String getNumListRcCodeIndicateurRech() {
		return numListRcCodeIndicateurRech;
	}

	public void setNumListRcCodeIndicateurRech(String numListRcCodeIndicateurRech) {
		this.numListRcCodeIndicateurRech = numListRcCodeIndicateurRech;
	}

	public List getListeRcSoumissioncreditaire() {
		return listeRcSoumissioncreditaire;
	}

	public void setListeRcSoumissioncreditaire(List listeRcSoumissioncreditaire) {
		this.listeRcSoumissioncreditaire = listeRcSoumissioncreditaire;
	}

	public SoumissionCreditaire getSoumissioncreditairevo() {
		return soumissioncreditairevo;
	}

	public void setSoumissioncreditairevo(
			SoumissionCreditaire soumissioncreditairevo) {
		this.soumissioncreditairevo = soumissioncreditairevo;
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