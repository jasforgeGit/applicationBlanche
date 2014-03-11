package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegimeBurInterdit;


/**
 * The Class RcRegimeburinterditForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegimeburinterditForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGIMEBURINTERDIT ***/
	//Champs de saisie
	private String numListRcCodeBureauOB;
	private String numListRcRegimeDouanierOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeBureauRech;
	private String numListRcRegimeDouanierRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegimeburinterdit = new ArrayList();
	RegimeBurInterdit regimeburinterditvo = new RegimeBurInterdit();

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
	
	/*** M�thode getNewREGIMEBURINTERDITVO () ***/
	public RegimeBurInterdit getNewRcRegimeburinterditVO() {
		RegimeBurInterdit regimeburinterditvo = new RegimeBurInterdit();

		regimeburinterditvo.setRcCodeBurDouane(getNumListRcCodeBureauOB());
		regimeburinterditvo.setRcCodeRegimeDouanier(getNumListRcRegimeDouanierOB());
		regimeburinterditvo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimeburinterditvo;
	}

	/*** M�thode setRegimeburinterdit () ***/
	public void setRegimeburinterdit (RegimeBurInterdit regimeburinterditvo) {

		setNumListRcCodeBureauOB (regimeburinterditvo.getRcCodeBurDouane());
		setNumListRcRegimeDouanierOB (regimeburinterditvo.getRcCodeRegimeDouanier());
		setNumListRcTypeRegimeOB (regimeburinterditvo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeBureauOB="";
		numListRcRegimeDouanierOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeBureauRech="";
		numListRcRegimeDouanierRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumListRcCodeBureauOB() {
		return numListRcCodeBureauOB;
	}

	public void setNumListRcCodeBureauOB(String numListRcCodeBureauOB) {
		this.numListRcCodeBureauOB = numListRcCodeBureauOB;
	}

	public String getNumListRcRegimeDouanierOB() {
		return numListRcRegimeDouanierOB;
	}

	public void setNumListRcRegimeDouanierOB(String numListRcRegimeDouanierOB) {
		this.numListRcRegimeDouanierOB = numListRcRegimeDouanierOB;
	}

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumListRcCodeBureauRech() {
		return numListRcCodeBureauRech;
	}

	public void setNumListRcCodeBureauRech(String numListRcCodeBureauRech) {
		this.numListRcCodeBureauRech = numListRcCodeBureauRech;
	}

	public String getNumListRcRegimeDouanierRech() {
		return numListRcRegimeDouanierRech;
	}

	public void setNumListRcRegimeDouanierRech(String numListRcRegimeDouanierRech) {
		this.numListRcRegimeDouanierRech = numListRcRegimeDouanierRech;
	}

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcRegimeburinterdit() {
		return listeRcRegimeburinterdit;
	}

	public void setListeRcRegimeburinterdit(List listeRcRegimeburinterdit) {
		this.listeRcRegimeburinterdit = listeRcRegimeburinterdit;
	}

	public RegimeBurInterdit getRegimeburinterditvo() {
		return regimeburinterditvo;
	}

	public void setRegimeburinterditvo(RegimeBurInterdit regimeburinterditvo) {
		this.regimeburinterditvo = regimeburinterditvo;
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