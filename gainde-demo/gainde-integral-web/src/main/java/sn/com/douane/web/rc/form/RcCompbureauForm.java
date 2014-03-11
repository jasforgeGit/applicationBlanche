package sn.com.douane.web.rc.form;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.CompBureau;

public class RcCompbureauForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table COMPBUREAU ***/
	//Champs de saisie
	private String numRcCodeCompetenceOB;
	private String numRcDesCompetencesOB;

	//Champs de recherche
	private String numRcCodeCompetenceRech;
	private String numRcDesCompetencesRech;

	List listeRcCompbureau = new ArrayList();
	CompBureau compbureauvo = new CompBureau();

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
	
	/*** M�thode getNewCOMPBUREAUVO () ***/
	public CompBureau getNewRcCompbureauVO() {
		CompBureau compbureauvo = new CompBureau();

		compbureauvo.setRccodecompetence(getNumRcCodeCompetenceOB());
		compbureauvo.setRcdescompetences(getNumRcDesCompetencesOB());

		return compbureauvo;
	}

	/*** M�thode setCompbureau () ***/
	public void setCompbureau (CompBureau compbureauvo) {

		setNumRcCodeCompetenceOB (compbureauvo.getRccodecompetence());
		setNumRcDesCompetencesOB (compbureauvo.getRcdescompetences());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcCodeCompetenceOB="";
		numRcDesCompetencesOB="";
	}
	public void resetChampsRecherche() {
		numRcCodeCompetenceRech="";
		numRcDesCompetencesRech="";
	}

	public String getNumRcCodeCompetenceOB() {
		return numRcCodeCompetenceOB;
	}

	public void setNumRcCodeCompetenceOB(String numRcCodeCompetenceOB) {
		this.numRcCodeCompetenceOB = numRcCodeCompetenceOB;
	}

	public String getNumRcDesCompetencesOB() {
		return numRcDesCompetencesOB;
	}

	public void setNumRcDesCompetencesOB(String numRcDesCompetencesOB) {
		this.numRcDesCompetencesOB = numRcDesCompetencesOB;
	}

	public String getNumRcCodeCompetenceRech() {
		return numRcCodeCompetenceRech;
	}

	public void setNumRcCodeCompetenceRech(String numRcCodeCompetenceRech) {
		this.numRcCodeCompetenceRech = numRcCodeCompetenceRech;
	}

	public String getNumRcDesCompetencesRech() {
		return numRcDesCompetencesRech;
	}

	public void setNumRcDesCompetencesRech(String numRcDesCompetencesRech) {
		this.numRcDesCompetencesRech = numRcDesCompetencesRech;
	}

	public List getListeRcCompbureau() {
		return listeRcCompbureau;
	}

	public void setListeRcCompbureau(List listeRcCompbureau) {
		this.listeRcCompbureau = listeRcCompbureau;
	}

	public CompBureau getCompbureauvo() {
		return compbureauvo;
	}

	public void setCompbureauvo(CompBureau compbureauvo) {
		this.compbureauvo = compbureauvo;
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