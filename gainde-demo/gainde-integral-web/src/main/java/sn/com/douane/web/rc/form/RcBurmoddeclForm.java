package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.BurModDecl;


public class RcBurmoddeclForm implements Serializable {

	static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table BURMODDECL ***/
	//Champs de saisie
	private String numListRcCodeBurDeclOB;
	private String numListRcModeDeclOB;

	//Champs de recherche
	private String numListRcCodeBurDeclRech;
	private String numListRcModeDeclRech;

	List listeRcBurmoddecl = new ArrayList();
	BurModDecl burmoddeclvo = new BurModDecl();

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
	
	/*** M�thode getNewBURMODDECLVO () ***/
	public BurModDecl getNewRcBurmoddeclVO() {
		BurModDecl burmoddeclvo = new BurModDecl();

		burmoddeclvo.setRcCodeBurDecl(getNumListRcCodeBurDeclOB());
		burmoddeclvo.setRcModeDecl(getNumListRcModeDeclOB());

		return burmoddeclvo;
	}

	/*** M�thode setBurmoddecl () ***/
	public void setBurmoddecl (BurModDecl burmoddeclvo) {

		setNumListRcCodeBurDeclOB (burmoddeclvo.getRcCodeBurDecl());
		setNumListRcModeDeclOB (burmoddeclvo.getRcModeDecl());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeBurDeclOB="";
		numListRcModeDeclOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeBurDeclRech="";
		numListRcModeDeclRech="";
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

	
	public String getNumListRcCodeBurDeclOB() {
		return numListRcCodeBurDeclOB;
	}

	
	public void setNumListRcCodeBurDeclOB(String numListRcCodeBurDeclOB) {
		this.numListRcCodeBurDeclOB = numListRcCodeBurDeclOB;
	}

	
	public String getNumListRcModeDeclOB() {
		return numListRcModeDeclOB;
	}

	
	public void setNumListRcModeDeclOB(String numListRcModeDeclOB) {
		this.numListRcModeDeclOB = numListRcModeDeclOB;
	}

	
	public String getNumListRcCodeBurDeclRech() {
		return numListRcCodeBurDeclRech;
	}

	
	public void setNumListRcCodeBurDeclRech(String numListRcCodeBurDeclRech) {
		this.numListRcCodeBurDeclRech = numListRcCodeBurDeclRech;
	}

	
	public String getNumListRcModeDeclRech() {
		return numListRcModeDeclRech;
	}

	
	public void setNumListRcModeDeclRech(String numListRcModeDeclRech) {
		this.numListRcModeDeclRech = numListRcModeDeclRech;
	}
	
	
	public List getListeRcBurmoddecl() {
		return listeRcBurmoddecl;
	}

	
	public void setListeRcBurmoddecl(List listeRcBurmoddecl) {
		this.listeRcBurmoddecl = listeRcBurmoddecl;
	}

	public BurModDecl getBurmoddeclvo() {
		return burmoddeclvo;
	}

	
	public void setBurmoddeclvo(BurModDecl burmoddeclvo) {
		this.burmoddeclvo = burmoddeclvo;
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