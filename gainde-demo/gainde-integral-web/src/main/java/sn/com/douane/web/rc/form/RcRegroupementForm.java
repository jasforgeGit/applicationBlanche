package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Regroupement;

/**
 * The Class RcRegroupementForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegroupementForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGROUPEMENT ***/
	//Champs de saisie
	private String numRcCodeRegRoupOB;
	private String numRcLibelleRegRoupOB;

	//Champs de recherche
	private String numRcCodeRegRoupRech;
	private String numRcLibelleRegRoupRech;

	List listeRcRegroupement = new ArrayList();
	Regroupement regroupementvo = new Regroupement();

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
	
	/*** M�thode getNewREGROUPEMENTVO () ***/
	public Regroupement getNewRcRegroupementVO() {
		Regroupement regroupementvo = new Regroupement();

		regroupementvo.setRcCodeRegroup(getNumRcCodeRegRoupOB());
		regroupementvo.setRcLibelleRegroup(getNumRcLibelleRegRoupOB());

		return regroupementvo;
	}

	/*** M�thode setRegroupement () ***/
	public void setRegroupement (Regroupement regroupementvo) {

		setNumRcCodeRegRoupOB (regroupementvo.getRcCodeRegroup());
		setNumRcLibelleRegRoupOB (regroupementvo.getRcLibelleRegroup());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcCodeRegRoupOB="";
		numRcLibelleRegRoupOB="";
	}
	public void resetChampsRecherche() {
		numRcCodeRegRoupRech="";
		numRcLibelleRegRoupRech="";
	}

	public String getNumRcCodeRegRoupOB() {
		return numRcCodeRegRoupOB;
	}

	public void setNumRcCodeRegRoupOB(String numRcCodeRegRoupOB) {
		this.numRcCodeRegRoupOB = numRcCodeRegRoupOB;
	}

	public String getNumRcLibelleRegRoupOB() {
		return numRcLibelleRegRoupOB;
	}

	public void setNumRcLibelleRegRoupOB(String numRcLibelleRegRoupOB) {
		this.numRcLibelleRegRoupOB = numRcLibelleRegRoupOB;
	}

	public String getNumRcCodeRegRoupRech() {
		return numRcCodeRegRoupRech;
	}

	public void setNumRcCodeRegRoupRech(String numRcCodeRegRoupRech) {
		this.numRcCodeRegRoupRech = numRcCodeRegRoupRech;
	}

	public String getNumRcLibelleRegRoupRech() {
		return numRcLibelleRegRoupRech;
	}

	public void setNumRcLibelleRegRoupRech(String numRcLibelleRegRoupRech) {
		this.numRcLibelleRegRoupRech = numRcLibelleRegRoupRech;
	}

	public List getListeRcRegroupement() {
		return listeRcRegroupement;
	}

	public void setListeRcRegroupement(List listeRcRegroupement) {
		this.listeRcRegroupement = listeRcRegroupement;
	}

	public Regroupement getRegroupementvo() {
		return regroupementvo;
	}

	public void setRegroupementvo(Regroupement regroupementvo) {
		this.regroupementvo = regroupementvo;
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