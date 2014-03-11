package sn.com.douane.web.consultationtables.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Regime;

public class RegimeForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

	private String etat;

	private String rccoderegimedouanier;

	private String rccoderegimefiscal;

	/** * Attributs Table REGIME ** */
	//Champs de recherche
	private String numListRcCodeRegimeDouanierRech;

	private String numListRcCodeRegimeFiscalRech;

	private String numRcLibelleRegimeRech;

	List listeRcRegime = new ArrayList();

	Regime regimevo = new Regime();

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
	
	/** * M�thodes reset ** */

	public void resetChampsRecherche() {
		numListRcCodeRegimeDouanierRech = "";
		numListRcCodeRegimeFiscalRech = "";
		numRcLibelleRegimeRech = "";
	}

	/** * M�thodes get et set ** */

	public String getPk() {
		return pk;
	}

	public String getRccoderegimedouanier() {
		return rccoderegimedouanier;
	}

	public void setRccoderegimedouanier(String rccoderegimedouanier) {
		this.rccoderegimedouanier = rccoderegimedouanier;
	}

	public String getRccoderegimefiscal() {
		return rccoderegimefiscal;
	}

	public void setRccoderegimefiscal(String rccoderegimefiscal) {
		this.rccoderegimefiscal = rccoderegimefiscal;
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

	public String getNumRcLibelleRegimeRech() {
		return numRcLibelleRegimeRech;
	}

	public void setNumRcLibelleRegimeRech(String numRcLibelleRegimeRech) {
		this.numRcLibelleRegimeRech = numRcLibelleRegimeRech;
	}

	public List getListeRcRegime() {
		return listeRcRegime;
	}

	public void setListeRcRegime(List listeRcRegime) {
		this.listeRcRegime = listeRcRegime;
	}

	public Regime getRegimevo() {
		return regimevo;
	}

	public void setRegimevo(Regime regimevo) {
		this.regimevo = regimevo;
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