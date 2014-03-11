package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Dispense;

/**
 * The Class RcDispensesForm.
 * 
 * @author kerfahi ghazi
 */
public class RcDispensesForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pk. */
	private String pk;
	
	/** The etat. */
	private String etat;

	/** * Attributs Table DISPENSES **. */
	//Champs de saisie
	private String numRcCodeDispenseOB;
	
	/** The num list rc code taxe ob. */
	private String numListRcCodeTaxeOB;
	
	/** The num rc des dispense ob. */
	private String numRcDesDispenseOB;

	//Champs de recherche
	/** The num rc code dispense rech. */
	private String numRcCodeDispenseRech;
	
	/** The num list rc code taxe rech. */
	private String numListRcCodeTaxeRech;
	
	/** The num rc des dispense rech. */
	private String numRcDesDispenseRech;

	/** The liste rc dispenses. */
	List listeRcDispenses = new ArrayList();
	
	/** The dispensesvo. */
	Dispense dispensesvo = new Dispense();

	
	/** variables du Grid. */
	private Integer rows ;
	
	/** The page. */
	private Integer page ;
	
	/** The sord. */
	private String  sord;
	
	/** The sidx. */
	private String  sidx;
	
	/** The total. */
	private Integer total;
	
	/** The records. */
	private Integer records;
	
	/** The index. */
	private String index;
	
	
	/**
	 * * M�thode getNewDISPENSESVO () **.
	 *
	 * @return the new rc dispenses vo
	 */
	public Dispense getNewRcDispensesVO() {
		Dispense dispensesvo = new Dispense();

		dispensesvo.setRccodedispense(getNumRcCodeDispenseOB());
		dispensesvo.setRcCodeTaxe(getNumListRcCodeTaxeOB());
		dispensesvo.setRcdesdispense(getNumRcDesDispenseOB());

		return dispensesvo;
	}

	/**
	 * * M�thode setDispenses () **.
	 *
	 * @param dispensesvo the new dispenses
	 */
	public void setDispenses (Dispense dispensesvo) {

		setNumRcCodeDispenseOB(dispensesvo.getRccodedispense());
		setNumListRcCodeTaxeOB(dispensesvo.getRcCodeTaxe());
		setNumRcDesDispenseOB(dispensesvo.getRcdesdispense());
	}

	/**
	 * * M�thodes reset **.
	 */
	public void reset() {
		numRcCodeDispenseOB="";
		numListRcCodeTaxeOB="";
		numRcDesDispenseOB="";
	}
	
	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numRcCodeDispenseRech="";
		numListRcCodeTaxeRech="";
		numRcDesDispenseRech="";
	}

	/**
	 * * M�thodes get et set **.
	 *
	 * @return the pk
	 */


	public String getPk () {
		return pk;
	}

	
	/**
	 * Gets the num rc code dispense ob.
	 *
	 * @return the num rc code dispense ob
	 */
	public String getNumRcCodeDispenseOB() {
		return numRcCodeDispenseOB;
	}

	
	/**
	 * Sets the num rc code dispense ob.
	 *
	 * @param numRcCodeDispenseOB the new num rc code dispense ob
	 */
	public void setNumRcCodeDispenseOB(String numRcCodeDispenseOB) {
		this.numRcCodeDispenseOB = numRcCodeDispenseOB;
	}

	
	/**
	 * Gets the num list rc code taxe ob.
	 *
	 * @return the num list rc code taxe ob
	 */
	public String getNumListRcCodeTaxeOB() {
		return numListRcCodeTaxeOB;
	}

	
	/**
	 * Sets the num list rc code taxe ob.
	 *
	 * @param numListRcCodeTaxeOB the new num list rc code taxe ob
	 */
	public void setNumListRcCodeTaxeOB(String numListRcCodeTaxeOB) {
		this.numListRcCodeTaxeOB = numListRcCodeTaxeOB;
	}

	
	/**
	 * Gets the num rc des dispense ob.
	 *
	 * @return the num rc des dispense ob
	 */
	public String getNumRcDesDispenseOB() {
		return numRcDesDispenseOB;
	}

	
	/**
	 * Sets the num rc des dispense ob.
	 *
	 * @param numRcDesDispenseOB the new num rc des dispense ob
	 */
	public void setNumRcDesDispenseOB(String numRcDesDispenseOB) {
		this.numRcDesDispenseOB = numRcDesDispenseOB;
	}

	
	/**
	 * Gets the num rc code dispense rech.
	 *
	 * @return the num rc code dispense rech
	 */
	public String getNumRcCodeDispenseRech() {
		return numRcCodeDispenseRech;
	}

	
	/**
	 * Sets the num rc code dispense rech.
	 *
	 * @param numRcCodeDispenseRech the new num rc code dispense rech
	 */
	public void setNumRcCodeDispenseRech(String numRcCodeDispenseRech) {
		this.numRcCodeDispenseRech = numRcCodeDispenseRech;
	}

	
	/**
	 * Gets the num list rc code taxe rech.
	 *
	 * @return the num list rc code taxe rech
	 */
	public String getNumListRcCodeTaxeRech() {
		return numListRcCodeTaxeRech;
	}

	
	/**
	 * Sets the num list rc code taxe rech.
	 *
	 * @param numListRcCodeTaxeRech the new num list rc code taxe rech
	 */
	public void setNumListRcCodeTaxeRech(String numListRcCodeTaxeRech) {
		this.numListRcCodeTaxeRech = numListRcCodeTaxeRech;
	}

	
	/**
	 * Gets the num rc des dispense rech.
	 *
	 * @return the num rc des dispense rech
	 */
	public String getNumRcDesDispenseRech() {
		return numRcDesDispenseRech;
	}

	
	/**
	 * Sets the num rc des dispense rech.
	 *
	 * @param numRcDesDispenseRech the new num rc des dispense rech
	 */
	public void setNumRcDesDispenseRech(String numRcDesDispenseRech) {
		this.numRcDesDispenseRech = numRcDesDispenseRech;
	}

	
	/**
	 * Gets the liste rc dispenses.
	 *
	 * @return the liste rc dispenses
	 */
	public List getListeRcDispenses() {
		return listeRcDispenses;
	}

	
	/**
	 * Sets the liste rc dispenses.
	 *
	 * @param listeRcDispenses the new liste rc dispenses
	 */
	public void setListeRcDispenses(List listeRcDispenses) {
		this.listeRcDispenses = listeRcDispenses;
	}

	
	/**
	 * Gets the dispensesvo.
	 *
	 * @return the dispensesvo
	 */
	public Dispense getDispensesvo() {
		return dispensesvo;
	}

	
	/**
	 * Sets the dispensesvo.
	 *
	 * @param dispensesvo the new dispensesvo
	 */
	public void setDispensesvo(Dispense dispensesvo) {
		this.dispensesvo = dispensesvo;
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk the new pk
	 */
	public void setPk (String pk) {
		this.pk = pk;
	}

	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public String getEtat () {
		return etat;
	}

	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat (String etat) {
		this.etat = etat;
	}

	
	/**
	 * Gets the rows.
	 *
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	
	/**
	 * Sets the rows.
	 *
	 * @param rows the new rows
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	
	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	
	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	
	/**
	 * Gets the sord.
	 *
	 * @return the sord
	 */
	public String getSord() {
		return sord;
	}

	
	/**
	 * Sets the sord.
	 *
	 * @param sord the new sord
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	
	/**
	 * Gets the sidx.
	 *
	 * @return the sidx
	 */
	public String getSidx() {
		return sidx;
	}

	
	/**
	 * Sets the sidx.
	 *
	 * @param sidx the new sidx
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	
	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	
	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	
	/**
	 * Gets the records.
	 *
	 * @return the records
	 */
	public Integer getRecords() {
		return records;
	}

	
	/**
	 * Sets the records.
	 *
	 * @param records the new records
	 */
	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	
	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	
	/**
	 * Sets the index.
	 *
	 * @param index the new index
	 */
	public void setIndex(String index) {
		this.index = index;
	}
	
}