package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegroupPays;


/**
 * The Class RcRegrouppaysForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegrouppaysForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGROUPPAYS ***/
	//Champs de saisie
	private String numListRcCodePaysOB;
	private String numListRcCodeRegroupOB;

	//Champs de recherche
	private String numListRcCodePaysRech;
	private String numListRcCodeRegroupRech;

	List listeRcRegrouppays = new ArrayList();
	RegroupPays regrouppaysvo = new RegroupPays();

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
	
	/*** M�thode getNewREGROUPPAYSVO () ***/
	public RegroupPays getNewRcRegrouppaysVO() {
		RegroupPays regrouppaysvo = new RegroupPays();

		regrouppaysvo.setRcCodePays(getNumListRcCodePaysOB());
		regrouppaysvo.setRcCodeRegroup(getNumListRcCodeRegroupOB());

		return regrouppaysvo;
	}

	/*** M�thode setRegrouppays () ***/
	public void setRegrouppays (RegroupPays regrouppaysvo) {

		setNumListRcCodePaysOB (regrouppaysvo.getRcCodePays());
		setNumListRcCodeRegroupOB (regrouppaysvo.getRcCodeRegroup());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodePaysOB="";
		numListRcCodeRegroupOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodePaysRech="";
		numListRcCodeRegroupRech="";
	}

	public String getNumListRcCodePaysOB() {
		return numListRcCodePaysOB;
	}

	public void setNumListRcCodePaysOB(String numListRcCodePaysOB) {
		this.numListRcCodePaysOB = numListRcCodePaysOB;
	}

	public String getNumListRcCodeRegroupOB() {
		return numListRcCodeRegroupOB;
	}

	public void setNumListRcCodeRegroupOB(String numListRcCodeRegroupOB) {
		this.numListRcCodeRegroupOB = numListRcCodeRegroupOB;
	}

	public String getNumListRcCodePaysRech() {
		return numListRcCodePaysRech;
	}

	public void setNumListRcCodePaysRech(String numListRcCodePaysRech) {
		this.numListRcCodePaysRech = numListRcCodePaysRech;
	}

	public String getNumListRcCodeRegroupRech() {
		return numListRcCodeRegroupRech;
	}

	public void setNumListRcCodeRegroupRech(String numListRcCodeRegroupRech) {
		this.numListRcCodeRegroupRech = numListRcCodeRegroupRech;
	}

	public List getListeRcRegrouppays() {
		return listeRcRegrouppays;
	}

	public void setListeRcRegrouppays(List listeRcRegrouppays) {
		this.listeRcRegrouppays = listeRcRegrouppays;
	}

	public RegroupPays getRegrouppaysvo() {
		return regrouppaysvo;
	}

	public void setRegrouppaysvo(RegroupPays regrouppaysvo) {
		this.regrouppaysvo = regrouppaysvo;
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