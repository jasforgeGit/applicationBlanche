package sn.com.douane.web.rc.form;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.RegimeProduit;


public class RcRegimeproduitForm implements Serializable {
	private String pk;
	private String etat;

	/*** Attributs Table REGIMEPRODUIT ***/
	//Champs de saisie
	private String numListRcCodeProdOB;
	private String numListRcCodeRegimeDouanierOB;
	private String numListRcCodeRegimeFiscalOB;
	private String numListRcPrecSenegalOB;
	private String numListRcPrecUemoaOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeProdRech;
	private String numListRcCodeRegimeDouanierRech;
	private String numListRcCodeRegimeFiscalRech;
	private String numListRcPrecSenegalRech;
	private String numListRcPrecUemoaRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegimeproduit = new ArrayList();
	RegimeProduit regimeproduitvo = new RegimeProduit();

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
	
	/*** M�thode getNewREGIMEPRODUITVO () ***/
	public RegimeProduit getNewRcRegimeproduitVO() {
		RegimeProduit regimeproduitvo = new RegimeProduit();

		regimeproduitvo.setRcCodeProd(getNumListRcCodeProdOB());
		regimeproduitvo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDouanierOB());
		regimeproduitvo.setRcCodeRegimeFiscal(getNumListRcCodeRegimeFiscalOB());
		regimeproduitvo.setRcPrecSenegal(getNumListRcPrecSenegalOB());
		regimeproduitvo.setRcPrecuemoa(getNumListRcPrecUemoaOB());
		regimeproduitvo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimeproduitvo;
	}

	/*** M�thode setRegimeproduit () ***/
	public void setRegimeproduit (RegimeProduit regimeproduitvo) {

		setNumListRcCodeProdOB (regimeproduitvo.getRcCodeProd());
		setNumListRcCodeRegimeDouanierOB (regimeproduitvo.getRcCodeRegimeDouanier());
		setNumListRcCodeRegimeFiscalOB (regimeproduitvo.getRcCodeRegimeFiscal());
		setNumListRcPrecSenegalOB (regimeproduitvo.getRcPrecSenegal());
		setNumListRcPrecUemoaOB (regimeproduitvo.getRcPrecuemoa());
		setNumListRcTypeRegimeOB (regimeproduitvo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeProdOB="";
		numListRcCodeRegimeDouanierOB="";
		numListRcCodeRegimeFiscalOB="";
		numListRcPrecSenegalOB="";
		numListRcPrecUemoaOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeProdRech="";
		numListRcCodeRegimeDouanierRech="";
		numListRcCodeRegimeFiscalRech="";
		numListRcPrecSenegalRech="";
		numListRcPrecUemoaRech="";
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

	
	public String getNumListRcCodeProdOB() {
		return numListRcCodeProdOB;
	}

	
	public void setNumListRcCodeProdOB(String numListRcCodeProdOB) {
		this.numListRcCodeProdOB = numListRcCodeProdOB;
	}

	
	public String getNumListRcCodeRegimeDouanierOB() {
		return numListRcCodeRegimeDouanierOB;
	}

	
	public void setNumListRcCodeRegimeDouanierOB(String numListRcCodeRegimeDouanierOB) {
		this.numListRcCodeRegimeDouanierOB = numListRcCodeRegimeDouanierOB;
	}

	
	public String getNumListRcCodeRegimeFiscalOB() {
		return numListRcCodeRegimeFiscalOB;
	}

	
	public void setNumListRcCodeRegimeFiscalOB(String numListRcCodeRegimeFiscalOB) {
		this.numListRcCodeRegimeFiscalOB = numListRcCodeRegimeFiscalOB;
	}

	
	public String getNumListRcPrecSenegalOB() {
		return numListRcPrecSenegalOB;
	}

	
	public void setNumListRcPrecSenegalOB(String numListRcPrecSenegalOB) {
		this.numListRcPrecSenegalOB = numListRcPrecSenegalOB;
	}

	
	public String getNumListRcPrecUemoaOB() {
		return numListRcPrecUemoaOB;
	}

	
	public void setNumListRcPrecUemoaOB(String numListRcPrecUemoaOB) {
		this.numListRcPrecUemoaOB = numListRcPrecUemoaOB;
	}

	
	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	
	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	
	public String getNumListRcCodeProdRech() {
		return numListRcCodeProdRech;
	}

	
	public void setNumListRcCodeProdRech(String numListRcCodeProdRech) {
		this.numListRcCodeProdRech = numListRcCodeProdRech;
	}

	
	public String getNumListRcCodeRegimeDouanierRech() {
		return numListRcCodeRegimeDouanierRech;
	}

	
	public void setNumListRcCodeRegimeDouanierRech(String numListRcCodeRegimeDouanierRech) {
		this.numListRcCodeRegimeDouanierRech = numListRcCodeRegimeDouanierRech;
	}

	
	public String getNumListRcCodeRegimeFiscalRech() {
		return numListRcCodeRegimeFiscalRech;
	}

	
	public void setNumListRcCodeRegimeFiscalRech(String numListRcCodeRegimeFiscalRech) {
		this.numListRcCodeRegimeFiscalRech = numListRcCodeRegimeFiscalRech;
	}

	
	public String getNumListRcPrecSenegalRech() {
		return numListRcPrecSenegalRech;
	}

	
	public void setNumListRcPrecSenegalRech(String numListRcPrecSenegalRech) {
		this.numListRcPrecSenegalRech = numListRcPrecSenegalRech;
	}

	
	public String getNumListRcPrecUemoaRech() {
		return numListRcPrecUemoaRech;
	}

	
	public void setNumListRcPrecUemoaRech(String numListRcPrecUemoaRech) {
		this.numListRcPrecUemoaRech = numListRcPrecUemoaRech;
	}

	
	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	
	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	
	public List getListeRcRegimeproduit() {
		return listeRcRegimeproduit;
	}

	
	public void setListeRcRegimeproduit(List listeRcRegimeproduit) {
		this.listeRcRegimeproduit = listeRcRegimeproduit;
	}

	
	public RegimeProduit getRegimeproduitvo() {
		return regimeproduitvo;
	}

	
	public void setRegimeproduitvo(RegimeProduit regimeproduitvo) {
		this.regimeproduitvo = regimeproduitvo;
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