package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.CatreGroup;

public class RcCatregroupForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table CATREGROUP ***/
	//Champs de saisie
	private String numRcCodeCatRegroupOB;
	private String numRcLibCatRegroupOB;

	//Champs de recherche
	private String numRcCodeCatRegroupRech;
	private String numRcLibCatRegroupRech;

	List listeRcCatregroup = new ArrayList();
	CatreGroup catregroupvo = new CatreGroup();

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
	
	/*** M�thode getNewCATREGROUPVO () ***/
	public CatreGroup getNewRcCatregroupVO() {
		CatreGroup catregroupvo = new CatreGroup();

		catregroupvo.setRcCodeCatreGroup(getNumRcCodeCatRegroupOB());
		catregroupvo.setRcLibCatreGroup(getNumRcLibCatRegroupOB());

		return catregroupvo;
	}

	/*** M�thode setCatregroup () ***/
	public void setCatregroup (CatreGroup catregroupvo) {

		setNumRcCodeCatRegroupOB(catregroupvo.getRcCodeCatreGroup());
		setNumRcLibCatRegroupOB(catregroupvo.getRcLibCatreGroup());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcCodeCatRegroupOB="";
		numRcLibCatRegroupOB="";
	}
	public void resetChampsRecherche() {
		numRcCodeCatRegroupRech="";
		numRcLibCatRegroupRech="";
	}

	/*** M�thodes get et set ***/

	public String getNumRcCodeCatRegroupOB() {
		return numRcCodeCatRegroupOB;
	}

	
	public void setNumRcCodeCatRegroupOB(String numRcCodeCatRegroupOB) {
		this.numRcCodeCatRegroupOB = numRcCodeCatRegroupOB;
	}

	
	public String getNumRcLibCatRegroupOB() {
		return numRcLibCatRegroupOB;
	}

	
	public void setNumRcLibCatRegroupOB(String numRcLibCatRegroupOB) {
		this.numRcLibCatRegroupOB = numRcLibCatRegroupOB;
	}

	
	public String getNumRcCodeCatRegroupRech() {
		return numRcCodeCatRegroupRech;
	}

	
	public void setNumRcCodeCatRegroupRech(String numRcCodeCatRegroupRech) {
		this.numRcCodeCatRegroupRech = numRcCodeCatRegroupRech;
	}

	
	public String getNumRcLibCatRegroupRech() {
		return numRcLibCatRegroupRech;
	}

	
	public void setNumRcLibCatRegroupRech(String numRcLibCatRegroupRech) {
		this.numRcLibCatRegroupRech = numRcLibCatRegroupRech;
	}

	
	public List getListeRcCatregroup() {
		return listeRcCatregroup;
	}

	
	public void setListeRcCatregroup(List listeRcCatregroup) {
		this.listeRcCatregroup = listeRcCatregroup;
	}

	
	public CatreGroup getCatregroupvo() {
		return catregroupvo;
	}

	
	public void setCatregroupvo(CatreGroup catregroupvo) {
		this.catregroupvo = catregroupvo;
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