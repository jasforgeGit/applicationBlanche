package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;


public class RcRegimedouanierForm implements Serializable {
	private String pk;
	private String etat;

	/*** Attributs Table REGIMEDOUANIER ***/
	//Champs de saisie
	private String numRcCodeRegimeDouanierOB;
	private String numRcLibelleRegimeDouanier;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numRcCodeRegimeDouanierRech;
	private String numRcLibelleRegimeDouanierRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegimedouanier = new ArrayList();
	RegimeDouanier regimedouaniervo = new RegimeDouanier();

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
	
	/*** M�thode getNewREGIMEDOUANIERVO () ***/
	public RegimeDouanier getNewRcRegimedouanierVO() {
		RegimeDouanier regimedouaniervo = new RegimeDouanier();

		regimedouaniervo.setRcCodeRegimeDouanier(getNumRcCodeRegimeDouanierOB());
		regimedouaniervo.setRcLibelleRegimeDouanier(getNumRcLibelleRegimeDouanier());
		regimedouaniervo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimedouaniervo;
	}

	/*** M�thode setRegimedouanier () ***/
	public void setRegimedouanier (RegimeDouanier regimedouaniervo) {

		setNumRcCodeRegimeDouanierOB (regimedouaniervo.getRcCodeRegimeDouanier());
		setNumRcLibelleRegimeDouanier (regimedouaniervo.getRcLibelleRegimeDouanier());
		setNumListRcTypeRegimeOB (regimedouaniervo.getRcTypeRegime());

	}

	public void reset() {
		numRcCodeRegimeDouanierOB="";
		numRcLibelleRegimeDouanier="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numRcCodeRegimeDouanierRech="";
		numRcLibelleRegimeDouanierRech="";
		numListRcTypeRegimeRech="";
	}
	
	public String getPk() {
		return pk;
	}

	
	public void setPk(String pk) {
		this.pk = pk;
	}

	
	public String getEtat() {
		return etat;
	}

	
	public void setEtat(String etat) {
		this.etat = etat;
	}

	
	public String getNumRcCodeRegimeDouanierOB() {
		return numRcCodeRegimeDouanierOB;
	}

	
	public void setNumRcCodeRegimeDouanierOB(String numRcCodeRegimeDouanierOB) {
		this.numRcCodeRegimeDouanierOB = numRcCodeRegimeDouanierOB;
	}

	
	public String getNumRcLibelleRegimeDouanier() {
		return numRcLibelleRegimeDouanier;
	}

	
	public void setNumRcLibelleRegimeDouanier(String numRcLibelleRegimeDouanier) {
		this.numRcLibelleRegimeDouanier = numRcLibelleRegimeDouanier;
	}

	
	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	
	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	
	public String getNumRcCodeRegimeDouanierRech() {
		return numRcCodeRegimeDouanierRech;
	}

	
	public void setNumRcCodeRegimeDouanierRech(String numRcCodeRegimeDouanierRech) {
		this.numRcCodeRegimeDouanierRech = numRcCodeRegimeDouanierRech;
	}

	
	public String getNumRcLibelleRegimeDouanierRech() {
		return numRcLibelleRegimeDouanierRech;
	}

	
	public void setNumRcLibelleRegimeDouanierRech(String numRcLibelleRegimeDouanierRech) {
		this.numRcLibelleRegimeDouanierRech = numRcLibelleRegimeDouanierRech;
	}

	
	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	
	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	
	public List getListeRcRegimedouanier() {
		return listeRcRegimedouanier;
	}

	
	public void setListeRcRegimedouanier(List listeRcRegimedouanier) {
		this.listeRcRegimedouanier = listeRcRegimedouanier;
	}

	
	public RegimeDouanier getRegimedouaniervo() {
		return regimedouaniervo;
	}

	
	public void setRegimedouaniervo(RegimeDouanier regimedouaniervo) {
		this.regimedouaniervo = regimedouaniervo;
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