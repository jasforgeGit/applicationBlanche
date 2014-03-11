package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import sn.com.douane.ejb.rc.model.entities.BasesTaxable;
import sn.com.douane.utils.ConvertUtil;

/**
 * The Class RcBasestaxablesForm.
 * 
 * @author kerfahi ghazi
 */
public class RcBasestaxablesForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The pk. */
	private String pk;

	/** The etat. */
	private String etat;

	/** * Attributs Table BASESTAXABLES **. */
	// Champs de saisie
	private String numListRcCodeTaxeOB;

	/** The num list rc code taxe base ob. */
	private String numListRcCodeTaxeBaseOB;

	/** The num rc ordre calcul ob. */
	private String numRcOrdreCalculOB;

	// Champs de recherche
	/** The num list rc code taxe rech. */
	private String numListRcCodeTaxeRech;

	/** The num list rc code taxe base rech. */
	private String numListRcCodeTaxeBaseRech;

	/** The num rc ordre calcul rech. */
	private String numRcOrdreCalculRech;

	/** variables du Grid. */
	private Integer rows;

	/** The page. */
	private Integer page;

	/** The sord. */
	private String sord;

	/** The sidx. */
	private String sidx;

	/** The total. */
	private Integer total;

	/** The records. */
	private Integer records;

	/** The index. */
	private String index;

	/** The liste rc basestaxables. */
	List listeRcBasestaxables = new ArrayList();

	/** The basestaxablesvo. */
	BasesTaxable basestaxablesvo = new BasesTaxable();

	/**
	 * * M�thode getNewBASESTAXABLESVO () **.
	 * 
	 * @return the new rc basestaxables vo
	 */
	public BasesTaxable getNewRcBasestaxablesVO() {
		BasesTaxable basestaxablesvo = new BasesTaxable();
		basestaxablesvo.setRcCodeTaxe(getNumListRcCodeTaxeOB());
		basestaxablesvo.setRcCodeTaxeBase(getNumListRcCodeTaxeBaseOB());
		if (getNumRcOrdreCalculOB() != null && !getNumRcOrdreCalculOB().equals("")){
			basestaxablesvo.setRcOrdreCalcul(Integer.valueOf(getNumRcOrdreCalculOB()));
		}
		return basestaxablesvo;
	}

	/**
	 * * M�thode setBasestaxables () **.
	 * 
	 * @param basestaxablesvo
	 *            the new basestaxables
	 */
	public void setBasestaxables(BasesTaxable basestaxablesvo) {
		setNumListRcCodeTaxeOB(basestaxablesvo.getRcCodeTaxe());
		setNumListRcCodeTaxeBaseOB(basestaxablesvo.getRcCodeTaxeBase());
		if (basestaxablesvo.getRcOrdreCalcul() != null){
			setNumRcOrdreCalculOB(ConvertUtil.converToString(basestaxablesvo.getRcOrdreCalcul()));
		}
	}

	/**
	 * * M�thodes reset **.
	 * 
	 * @param arg1
	 *            the arg1
	 */
	public void reset(HttpServletRequest arg1) {
		numListRcCodeTaxeOB = "";
		numListRcCodeTaxeBaseOB = "";
		numRcOrdreCalculOB = "";
	}

	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numListRcCodeTaxeRech = "";
		numListRcCodeTaxeBaseRech = "";
		numRcOrdreCalculRech = "";
	}

	/**
	 * * M�thodes get et set **.
	 * 
	 * @return the num list rc code taxe ob
	 */

	public String getNumListRcCodeTaxeOB() {
		return numListRcCodeTaxeOB;
	}

	/**
	 * Sets the num list rc code taxe ob.
	 * 
	 * @param numListRcCodeTaxeOB
	 *            the new num list rc code taxe ob
	 */
	public void setNumListRcCodeTaxeOB(String numListRcCodeTaxeOB) {
		this.numListRcCodeTaxeOB = numListRcCodeTaxeOB;
	}

	/**
	 * Gets the num list rc code taxe base ob.
	 * 
	 * @return the num list rc code taxe base ob
	 */
	public String getNumListRcCodeTaxeBaseOB() {
		return numListRcCodeTaxeBaseOB;
	}

	/**
	 * Sets the num list rc code taxe base ob.
	 * 
	 * @param numListRcCodeTaxeBaseOB
	 *            the new num list rc code taxe base ob
	 */
	public void setNumListRcCodeTaxeBaseOB(String numListRcCodeTaxeBaseOB) {
		this.numListRcCodeTaxeBaseOB = numListRcCodeTaxeBaseOB;
	}

	/**
	 * Gets the num rc ordre calcul ob.
	 * 
	 * @return the num rc ordre calcul ob
	 */
	public String getNumRcOrdreCalculOB() {
		return numRcOrdreCalculOB;
	}

	/**
	 * Sets the num rc ordre calcul ob.
	 * 
	 * @param numRcOrdreCalculOB
	 *            the new num rc ordre calcul ob
	 */
	public void setNumRcOrdreCalculOB(String numRcOrdreCalculOB) {
		this.numRcOrdreCalculOB = numRcOrdreCalculOB;
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
	 * @param numListRcCodeTaxeRech
	 *            the new num list rc code taxe rech
	 */
	public void setNumListRcCodeTaxeRech(String numListRcCodeTaxeRech) {
		this.numListRcCodeTaxeRech = numListRcCodeTaxeRech;
	}

	/**
	 * Gets the num list rc code taxe base rech.
	 * 
	 * @return the num list rc code taxe base rech
	 */
	public String getNumListRcCodeTaxeBaseRech() {
		return numListRcCodeTaxeBaseRech;
	}

	/**
	 * Sets the num list rc code taxe base rech.
	 * 
	 * @param numListRcCodeTaxeBaseRech
	 *            the new num list rc code taxe base rech
	 */
	public void setNumListRcCodeTaxeBaseRech(String numListRcCodeTaxeBaseRech) {
		this.numListRcCodeTaxeBaseRech = numListRcCodeTaxeBaseRech;
	}

	/**
	 * Gets the num rc ordre calcul rech.
	 * 
	 * @return the num rc ordre calcul rech
	 */
	public String getNumRcOrdreCalculRech() {
		return numRcOrdreCalculRech;
	}

	/**
	 * Sets the num rc ordre calcul rech.
	 * 
	 * @param numRcOrdreCalculRech
	 *            the new num rc ordre calcul rech
	 */
	public void setNumRcOrdreCalculRech(String numRcOrdreCalculRech) {
		this.numRcOrdreCalculRech = numRcOrdreCalculRech;
	}

	/**
	 * Gets the liste rc basestaxables.
	 * 
	 * @return the liste rc basestaxables
	 */
	public List getListeRcBasestaxables() {
		return listeRcBasestaxables;
	}

	/**
	 * Sets the liste rc basestaxables.
	 * 
	 * @param listeRcBasestaxables
	 *            the new liste rc basestaxables
	 */
	public void setListeRcBasestaxables(List listeRcBasestaxables) {
		this.listeRcBasestaxables = listeRcBasestaxables;
	}

	/**
	 * Gets the basestaxablesvo.
	 * 
	 * @return the basestaxablesvo
	 */
	public BasesTaxable getBasestaxablesvo() {
		return basestaxablesvo;
	}

	/**
	 * Sets the basestaxablesvo.
	 * 
	 * @param basestaxablesvo
	 *            the new basestaxablesvo
	 */
	public void setBasestaxablesvo(BasesTaxable basestaxablesvo) {
		this.basestaxablesvo = basestaxablesvo;
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
	 * @param pk
	 *            the new pk
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
	 * @param etat
	 *            the new etat
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
	 * @param rows
	 *            the new rows
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
	 * @param page
	 *            the new page
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
	 * @param sord
	 *            the new sord
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
	 * @param sidx
	 *            the new sidx
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
	 * @param total
	 *            the new total
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
	 * @param records
	 *            the new records
	 */
	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records / (double) this.rows);
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
	 * @param index
	 *            the new index
	 */
	public void setIndex(String index) {
		this.index = index;
	}

}