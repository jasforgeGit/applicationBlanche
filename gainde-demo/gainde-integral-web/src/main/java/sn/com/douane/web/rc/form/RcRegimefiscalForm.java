package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;

/**
 * The Class RcRegimefiscalForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegimefiscalForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGIMEFISCAL ***/
	//Champs de saisie
	private String numIndRegExoOB;
	private String numRcCodeRegimeFiscalOB;
	private String numRcIndSuspensionOB;
	private String numRcLibelleRegimeFiscalOB;

	//Champs de recherche
	private String numIndRegExoRech;
	private String numRcCodeRegimeFiscalRech;
	private String numRcIndSuspensionRech;
	private String numRcLibelleRegimeFiscalRech;

	List listeRcRegimefiscal = new ArrayList();
	RegimeFiscal regimefiscalvo = new RegimeFiscal();

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
	
	/*** M�thode getNewREGIMEFISCALVO () ***/
	public RegimeFiscal getNewRcRegimefiscalVO() {
		RegimeFiscal regimefiscalvo = new RegimeFiscal();

		regimefiscalvo.setIndRegExo(getNumIndRegExoOB());
		regimefiscalvo.setRcCodeRegimeFiscal(getNumRcCodeRegimeFiscalOB());
		regimefiscalvo.setRcIndSuspension(getNumRcIndSuspensionOB());
		regimefiscalvo.setRcLibelleRegimeFiscal(getNumRcLibelleRegimeFiscalOB());

		return regimefiscalvo;
	}

	/*** M�thode setRegimefiscal () ***/
	public void setRegimefiscal (RegimeFiscal regimefiscalvo) {

		setNumIndRegExoOB (regimefiscalvo.getIndRegExo());
		setNumRcCodeRegimeFiscalOB (regimefiscalvo.getRcCodeRegimeFiscal());
		setNumRcIndSuspensionOB (regimefiscalvo.getRcIndSuspension());
		setNumRcLibelleRegimeFiscalOB (regimefiscalvo.getRcLibelleRegimeFiscal());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numIndRegExoOB="";
		numRcCodeRegimeFiscalOB="";
		numRcIndSuspensionOB="";
		numRcLibelleRegimeFiscalOB="";
	}
	public void resetChampsRecherche() {
		numIndRegExoRech="";
		numRcCodeRegimeFiscalRech="";
		numRcIndSuspensionRech="";
		numRcLibelleRegimeFiscalRech="";
	}

	public String getNumIndRegExoOB() {
		return numIndRegExoOB;
	}

	public void setNumIndRegExoOB(String numIndRegExoOB) {
		this.numIndRegExoOB = numIndRegExoOB;
	}

	public String getNumRcCodeRegimeFiscalOB() {
		return numRcCodeRegimeFiscalOB;
	}

	public void setNumRcCodeRegimeFiscalOB(String numRcCodeRegimeFiscalOB) {
		this.numRcCodeRegimeFiscalOB = numRcCodeRegimeFiscalOB;
	}

	public String getNumRcIndSuspensionOB() {
		return numRcIndSuspensionOB;
	}

	public void setNumRcIndSuspensionOB(String numRcIndSuspensionOB) {
		this.numRcIndSuspensionOB = numRcIndSuspensionOB;
	}

	public String getNumRcLibelleRegimeFiscalOB() {
		return numRcLibelleRegimeFiscalOB;
	}

	public void setNumRcLibelleRegimeFiscalOB(String numRcLibelleRegimeFiscalOB) {
		this.numRcLibelleRegimeFiscalOB = numRcLibelleRegimeFiscalOB;
	}

	public String getNumIndRegExoRech() {
		return numIndRegExoRech;
	}

	public void setNumIndRegExoRech(String numIndRegExoRech) {
		this.numIndRegExoRech = numIndRegExoRech;
	}

	public String getNumRcCodeRegimeFiscalRech() {
		return numRcCodeRegimeFiscalRech;
	}

	public void setNumRcCodeRegimeFiscalRech(String numRcCodeRegimeFiscalRech) {
		this.numRcCodeRegimeFiscalRech = numRcCodeRegimeFiscalRech;
	}

	public String getNumRcIndSuspensionRech() {
		return numRcIndSuspensionRech;
	}

	public void setNumRcIndSuspensionRech(String numRcIndSuspensionRech) {
		this.numRcIndSuspensionRech = numRcIndSuspensionRech;
	}

	public String getNumRcLibelleRegimeFiscalRech() {
		return numRcLibelleRegimeFiscalRech;
	}

	public void setNumRcLibelleRegimeFiscalRech(String numRcLibelleRegimeFiscalRech) {
		this.numRcLibelleRegimeFiscalRech = numRcLibelleRegimeFiscalRech;
	}

	public List getListeRcRegimefiscal() {
		return listeRcRegimefiscal;
	}

	public void setListeRcRegimefiscal(List listeRcRegimefiscal) {
		this.listeRcRegimefiscal = listeRcRegimefiscal;
	}

	public RegimeFiscal getRegimefiscalvo() {
		return regimefiscalvo;
	}

	public void setRegimefiscalvo(RegimeFiscal regimefiscalvo) {
		this.regimefiscalvo = regimefiscalvo;
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