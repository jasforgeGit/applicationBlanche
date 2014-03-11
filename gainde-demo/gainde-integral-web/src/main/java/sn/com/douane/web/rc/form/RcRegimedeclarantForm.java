package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;

/**
 * The Class RcRegimedeclarantForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegimedeclarantForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGIMEDECLARANT ***/
	//Champs de saisie
	private String numListRcCodePpmOB;
	private String numListRcRegimeDouanierOB;
	private String numListRcRegimeFiscalOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodePpmRech;
	private String numListRcRegimeDouanierRech;
	private String numListRcRegimeFiscalRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegimedeclarant = new ArrayList();
	RegimeDeclarant regimedeclarantvo = new RegimeDeclarant();

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
	
	/*** M�thode getNewREGIMEDECLARANTVO () ***/
	public RegimeDeclarant getNewRcRegimedeclarantVO() {
		RegimeDeclarant regimedeclarantvo = new RegimeDeclarant();

		regimedeclarantvo.setRcCodePpm(getNumListRcCodePpmOB());
		regimedeclarantvo.setRcRegimeDouanier(getNumListRcRegimeDouanierOB());
		regimedeclarantvo.setRcRegimeFiscal(getNumListRcRegimeFiscalOB());
		regimedeclarantvo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimedeclarantvo;
	}

	/*** M�thode setRegimedeclarant () ***/
	public void setRegimedeclarant (RegimeDeclarant regimedeclarantvo) {

		setNumListRcCodePpmOB (regimedeclarantvo.getRcCodePpm());
		setNumListRcRegimeDouanierOB (regimedeclarantvo.getRcRegimeDouanier());
		setNumListRcRegimeFiscalOB (regimedeclarantvo.getRcRegimeFiscal());
		setNumListRcTypeRegimeOB (regimedeclarantvo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodePpmOB="";
		numListRcRegimeDouanierOB="";
		numListRcRegimeFiscalOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodePpmRech="";
		numListRcRegimeDouanierRech="";
		numListRcRegimeFiscalRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumListRcCodePpmOB() {
		return numListRcCodePpmOB;
	}

	public void setNumListRcCodePpmOB(String numListRcCodePpmOB) {
		this.numListRcCodePpmOB = numListRcCodePpmOB;
	}

	public String getNumListRcRegimeDouanierOB() {
		return numListRcRegimeDouanierOB;
	}

	public void setNumListRcRegimeDouanierOB(String numListRcRegimeDouanierOB) {
		this.numListRcRegimeDouanierOB = numListRcRegimeDouanierOB;
	}

	public String getNumListRcRegimeFiscalOB() {
		return numListRcRegimeFiscalOB;
	}

	public void setNumListRcRegimeFiscalOB(String numListRcRegimeFiscalOB) {
		this.numListRcRegimeFiscalOB = numListRcRegimeFiscalOB;
	}

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumListRcCodePpmRech() {
		return numListRcCodePpmRech;
	}

	public void setNumListRcCodePpmRech(String numListRcCodePpmRech) {
		this.numListRcCodePpmRech = numListRcCodePpmRech;
	}

	public String getNumListRcRegimeDouanierRech() {
		return numListRcRegimeDouanierRech;
	}

	public void setNumListRcRegimeDouanierRech(String numListRcRegimeDouanierRech) {
		this.numListRcRegimeDouanierRech = numListRcRegimeDouanierRech;
	}

	public String getNumListRcRegimeFiscalRech() {
		return numListRcRegimeFiscalRech;
	}

	public void setNumListRcRegimeFiscalRech(String numListRcRegimeFiscalRech) {
		this.numListRcRegimeFiscalRech = numListRcRegimeFiscalRech;
	}

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcRegimedeclarant() {
		return listeRcRegimedeclarant;
	}

	public void setListeRcRegimedeclarant(List listeRcRegimedeclarant) {
		this.listeRcRegimedeclarant = listeRcRegimedeclarant;
	}

	public RegimeDeclarant getRegimedeclarantvo() {
		return regimedeclarantvo;
	}

	public void setRegimedeclarantvo(RegimeDeclarant regimedeclarantvo) {
		this.regimedeclarantvo = regimedeclarantvo;
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