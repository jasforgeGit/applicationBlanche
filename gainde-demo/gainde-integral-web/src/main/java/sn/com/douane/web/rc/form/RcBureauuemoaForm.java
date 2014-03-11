package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;

/**
 * The Class RcBureauuemoaForm.
 *
 * @author kerfahi ghazi
 */
public class RcBureauuemoaForm implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pk. */
	private String pk;
	
	/** The etat. */
	private String etat;

	/** * Attributs Table BUREAUUEMOA **. */
	//Champs de saisie
	private String numRcCodeBurUemoaOB;
	
	/** The num rc libelle bur uemoa ob. */
	private String numRcLibelleBurUemoaOB;

	//Champs de recherche
	/** The num rc code bur uemoa rech. */
	private String numRcCodeBurUemoaRech;
	
	/** The num rc libelle bur uemoa rech. */
	private String numRcLibelleBurUemoaRech;

	/** The liste rc bureauuemoa. */
	List listeRcBureauuemoa = new ArrayList();
	
	/** The bureauuemoavo. */
	BureauUemoa bureauuemoavo = new BureauUemoa();

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
	 * * M�thode getNewBUREAUUEMOAVO () **.
	 *
	 * @return the new rc bureauuemoa vo
	 */
	public BureauUemoa getNewRcBureauuemoaVO() {
		BureauUemoa bureauuemoavo = new BureauUemoa();

		bureauuemoavo.setRcCodeBurUemoa(getNumRcCodeBurUemoaOB());
		bureauuemoavo.setRcLibelleBurUemoa(getNumRcLibelleBurUemoaOB());

		return bureauuemoavo;
	}

	/**
	 * * M�thode setBureauuemoa () **.
	 *
	 * @param bureauuemoavo the new bureauuemoa
	 */
	public void setBureauuemoa (BureauUemoa bureauuemoavo) {

		setNumRcCodeBurUemoaOB (bureauuemoavo.getRcCodeBurUemoa());
		setNumRcLibelleBurUemoaOB (bureauuemoavo.getRcLibelleBurUemoa());

	}

	/**
	 * * M�thodes reset **.
	 */
	public void reset() {
		numRcCodeBurUemoaOB="";
		numRcLibelleBurUemoaOB="";
	}
	
	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numRcCodeBurUemoaRech="";
		numRcLibelleBurUemoaRech="";
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
	 * Gets the num rc code bur uemoa ob.
	 *
	 * @return the num rc code bur uemoa ob
	 */
	public String getNumRcCodeBurUemoaOB() {
		return numRcCodeBurUemoaOB;
	}

	
	/**
	 * Sets the num rc code bur uemoa ob.
	 *
	 * @param numRcCodeBurUemoaOB the new num rc code bur uemoa ob
	 */
	public void setNumRcCodeBurUemoaOB(String numRcCodeBurUemoaOB) {
		this.numRcCodeBurUemoaOB = numRcCodeBurUemoaOB;
	}

	
	/**
	 * Gets the num rc libelle bur uemoa ob.
	 *
	 * @return the num rc libelle bur uemoa ob
	 */
	public String getNumRcLibelleBurUemoaOB() {
		return numRcLibelleBurUemoaOB;
	}

	
	/**
	 * Sets the num rc libelle bur uemoa ob.
	 *
	 * @param numRcLibelleBurUemoaOB the new num rc libelle bur uemoa ob
	 */
	public void setNumRcLibelleBurUemoaOB(String numRcLibelleBurUemoaOB) {
		this.numRcLibelleBurUemoaOB = numRcLibelleBurUemoaOB;
	}

	
	/**
	 * Gets the num rc code bur uemoa rech.
	 *
	 * @return the num rc code bur uemoa rech
	 */
	public String getNumRcCodeBurUemoaRech() {
		return numRcCodeBurUemoaRech;
	}

	
	/**
	 * Sets the num rc code bur uemoa rech.
	 *
	 * @param numRcCodeBurUemoaRech the new num rc code bur uemoa rech
	 */
	public void setNumRcCodeBurUemoaRech(String numRcCodeBurUemoaRech) {
		this.numRcCodeBurUemoaRech = numRcCodeBurUemoaRech;
	}

	
	/**
	 * Gets the num rc libelle bur uemoa rech.
	 *
	 * @return the num rc libelle bur uemoa rech
	 */
	public String getNumRcLibelleBurUemoaRech() {
		return numRcLibelleBurUemoaRech;
	}

	
	/**
	 * Sets the num rc libelle bur uemoa rech.
	 *
	 * @param numRcLibelleBurUemoaRech the new num rc libelle bur uemoa rech
	 */
	public void setNumRcLibelleBurUemoaRech(String numRcLibelleBurUemoaRech) {
		this.numRcLibelleBurUemoaRech = numRcLibelleBurUemoaRech;
	}

	
	/**
	 * Gets the liste rc bureauuemoa.
	 *
	 * @return the liste rc bureauuemoa
	 */
	public List getListeRcBureauuemoa() {
		return listeRcBureauuemoa;
	}

	
	/**
	 * Sets the liste rc bureauuemoa.
	 *
	 * @param listeRcBureauuemoa the new liste rc bureauuemoa
	 */
	public void setListeRcBureauuemoa(List listeRcBureauuemoa) {
		this.listeRcBureauuemoa = listeRcBureauuemoa;
	}

	
	/**
	 * Gets the bureauuemoavo.
	 *
	 * @return the bureauuemoavo
	 */
	public BureauUemoa getBureauuemoavo() {
		return bureauuemoavo;
	}

	
	/**
	 * Sets the bureauuemoavo.
	 *
	 * @param bureauuemoavo the new bureauuemoavo
	 */
	public void setBureauuemoavo(BureauUemoa bureauuemoavo) {
		this.bureauuemoavo = bureauuemoavo;
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