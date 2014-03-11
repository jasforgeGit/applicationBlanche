package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import sn.com.douane.ejb.rc.model.entities.DispensePieceJointe;


/**
 * The Class RcDispensespjForm.
 * 
 * @author kerfahi ghazi
 */
public class RcDispensespjForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The pk. */
	private String pk;

	/** The etat. */
	private String etat;

	/** * Attributs Table DISPENSESPJ **. */
	//Champs de saisie
	private String numListRcCodeDispenseOB;

	/** The num list rc code piece jointe ob. */
	private String numListRcCodePieceJointeOB;

	//Champs de recherche
	/** The num list rc code dispense rech. */
	private String numListRcCodeDispenseRech;

	/** The num list rc code piece jointe rech. */
	private String numListRcCodePieceJointeRech;

	/** The liste rc dispensespj. */
	List listeRcDispensespj = new ArrayList();

	/** The list dispenses. */
	List listDispenses = new ArrayList();

	/** The dispensespjvo. */
	DispensePieceJointe dispensespjvo = new DispensePieceJointe();

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
	 * * M�thode getNewDISPENSESPJVO () **.
	 *
	 * @return the new rc dispensespj vo
	 */
	public DispensePieceJointe getNewRcDispensespjVO() {
		DispensePieceJointe dispensespjvo = new DispensePieceJointe();

		dispensespjvo.setRccodedispense(getNumListRcCodeDispenseOB());
		dispensespjvo.setRccodepiecejointe(getNumListRcCodePieceJointeOB());

		return dispensespjvo;
	}

	/**
	 * * M�thode setDispensespj () **.
	 *
	 * @param dispensespjvo the new dispensespj
	 */
	public void setDispensespj(DispensePieceJointe dispensespjvo) {

		setNumListRcCodeDispenseOB(dispensespjvo.getRccodedispense());
		setNumListRcCodePieceJointeOB(dispensespjvo.getRccodepiecejointe());

	}

	/**
	 * * M�thodes reset **.
	 */
	public void reset() {
		numListRcCodeDispenseOB = "";
		numListRcCodePieceJointeOB = "";
	}

	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numListRcCodeDispenseRech = "";
		numListRcCodePieceJointeRech = "";
	}

	/**
	 * * M�thodes get et set **.
	 *
	 * @return the num list rc code dispense ob
	 */

	
	public String getNumListRcCodeDispenseOB() {
		return numListRcCodeDispenseOB;
	}

	
	/**
	 * Sets the num list rc code dispense ob.
	 *
	 * @param numListRcCodeDispenseOB the new num list rc code dispense ob
	 */
	public void setNumListRcCodeDispenseOB(String numListRcCodeDispenseOB) {
		this.numListRcCodeDispenseOB = numListRcCodeDispenseOB;
	}

	
	/**
	 * Gets the num list rc code piece jointe ob.
	 *
	 * @return the num list rc code piece jointe ob
	 */
	public String getNumListRcCodePieceJointeOB() {
		return numListRcCodePieceJointeOB;
	}

	
	/**
	 * Sets the num list rc code piece jointe ob.
	 *
	 * @param numListRcCodePieceJointeOB the new num list rc code piece jointe ob
	 */
	public void setNumListRcCodePieceJointeOB(String numListRcCodePieceJointeOB) {
		this.numListRcCodePieceJointeOB = numListRcCodePieceJointeOB;
	}

	
	/**
	 * Gets the num list rc code dispense rech.
	 *
	 * @return the num list rc code dispense rech
	 */
	public String getNumListRcCodeDispenseRech() {
		return numListRcCodeDispenseRech;
	}

	
	/**
	 * Sets the num list rc code dispense rech.
	 *
	 * @param numListRcCodeDispenseRech the new num list rc code dispense rech
	 */
	public void setNumListRcCodeDispenseRech(String numListRcCodeDispenseRech) {
		this.numListRcCodeDispenseRech = numListRcCodeDispenseRech;
	}

	
	/**
	 * Gets the num list rc code piece jointe rech.
	 *
	 * @return the num list rc code piece jointe rech
	 */
	public String getNumListRcCodePieceJointeRech() {
		return numListRcCodePieceJointeRech;
	}

	
	/**
	 * Sets the num list rc code piece jointe rech.
	 *
	 * @param numListRcCodePieceJointeRech the new num list rc code piece jointe rech
	 */
	public void setNumListRcCodePieceJointeRech(String numListRcCodePieceJointeRech) {
		this.numListRcCodePieceJointeRech = numListRcCodePieceJointeRech;
	}

	
	/**
	 * Gets the liste rc dispensespj.
	 *
	 * @return the liste rc dispensespj
	 */
	public List getListeRcDispensespj() {
		return listeRcDispensespj;
	}

	
	/**
	 * Sets the liste rc dispensespj.
	 *
	 * @param listeRcDispensespj the new liste rc dispensespj
	 */
	public void setListeRcDispensespj(List listeRcDispensespj) {
		this.listeRcDispensespj = listeRcDispensespj;
	}

	
	/**
	 * Gets the dispensespjvo.
	 *
	 * @return the dispensespjvo
	 */
	public DispensePieceJointe getDispensespjvo() {
		return dispensespjvo;
	}

	
	/**
	 * Sets the dispensespjvo.
	 *
	 * @param dispensespjvo the new dispensespjvo
	 */
	public void setDispensespjvo(DispensePieceJointe dispensespjvo) {
		this.dispensespjvo = dispensespjvo;
	}

	/**
	 * Gets the list dispenses.
	 *
	 * @return the list dispenses
	 */
	@JSON(serialize=false)
	public List getListDispenses() {
		return listDispenses;
	}
	
	/**
	 * Sets the list dispenses.
	 *
	 * @param listDispenses the new list dispenses
	 */
	public void setListDispenses(List listDispenses) {
		this.listDispenses = listDispenses;
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		return pk;
	}
	
	/**
	 * Sets the pk.
	 *
	 * @param pk the new pk
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat(String etat) {
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