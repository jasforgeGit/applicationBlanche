package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.TypeRegimeDouane;

/**
 * The Class RcTyperegimedouaneForm.
 * 
 * @author kerfahi ghazi
 */
public class RcTyperegimedouaneForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TYPEREGIMEDOUANE ***/
	//Champs de saisie
	private String numRcImportExport;
	private String numRcLibelleRegime;
	private String numRcTypeRegimeOB;

	//Champs de recherche
	private String numRcImportExportRech;
	private String numRcLibelleRegimeRech;
	private String numRcTypeRegimeRech;

	List listeRcTyperegimedouane = new ArrayList();
	TypeRegimeDouane typeregimedouanevo = new TypeRegimeDouane();

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
	
	/*** M�thode getNewTYPEREGIMEDOUANEVO () ***/
	public TypeRegimeDouane getNewRcTyperegimedouaneVO() {
		TypeRegimeDouane typeregimedouanevo = new TypeRegimeDouane();

		typeregimedouanevo.setRcImportExport(getNumRcImportExport());
		typeregimedouanevo.setRcLibelleRegime(getNumRcLibelleRegime());
		typeregimedouanevo.setRcTypeRegime(getNumRcTypeRegimeOB());

		return typeregimedouanevo;
	}

	/*** M�thode setTyperegimedouane () ***/
	public void setTyperegimedouane (TypeRegimeDouane typeregimedouanevo) {

		setNumRcImportExport (typeregimedouanevo.getRcImportExport());
		setNumRcLibelleRegime (typeregimedouanevo.getRcLibelleRegime());
		setNumRcTypeRegimeOB (typeregimedouanevo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcImportExport="";
		numRcLibelleRegime="";
		numRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numRcImportExportRech="";
		numRcLibelleRegimeRech="";
		numRcTypeRegimeRech = "";
	}

	public String getNumRcImportExport() {
		return numRcImportExport;
	}

	public void setNumRcImportExport(String numRcImportExport) {
		this.numRcImportExport = numRcImportExport;
	}

	public String getNumRcLibelleRegime() {
		return numRcLibelleRegime;
	}

	public void setNumRcLibelleRegime(String numRcLibelleRegime) {
		this.numRcLibelleRegime = numRcLibelleRegime;
	}

	public String getNumRcTypeRegimeOB() {
		return numRcTypeRegimeOB;
	}

	public void setNumRcTypeRegimeOB(String numRcTypeRegimeOB) {
		this.numRcTypeRegimeOB = numRcTypeRegimeOB;
	}

	public String getNumRcImportExportRech() {
		return numRcImportExportRech;
	}

	public void setNumRcImportExportRech(String numRcImportExportRech) {
		this.numRcImportExportRech = numRcImportExportRech;
	}

	public String getNumRcLibelleRegimeRech() {
		return numRcLibelleRegimeRech;
	}

	public void setNumRcLibelleRegimeRech(String numRcLibelleRegimeRech) {
		this.numRcLibelleRegimeRech = numRcLibelleRegimeRech;
	}

	public String getNumRcTypeRegimeRech() {
		return numRcTypeRegimeRech;
	}

	public void setNumRcTypeRegimeRech(String numRcTypeRegimeRech) {
		this.numRcTypeRegimeRech = numRcTypeRegimeRech;
	}

	public List getListeRcTyperegimedouane() {
		return listeRcTyperegimedouane;
	}

	public void setListeRcTyperegimedouane(List listeRcTyperegimedouane) {
		this.listeRcTyperegimedouane = listeRcTyperegimedouane;
	}

	public TypeRegimeDouane getTyperegimedouanevo() {
		return typeregimedouanevo;
	}

	public void setTyperegimedouanevo(TypeRegimeDouane typeregimedouanevo) {
		this.typeregimedouanevo = typeregimedouanevo;
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