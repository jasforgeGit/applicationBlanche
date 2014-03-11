package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;

/**
 * The Class RcRegimedestinataireForm.
 * 
 * @author kerfahi ghazi
 */
public class RcRegimedestinataireForm implements Serializable {
	
	/** The pk. */
	private String pk;
	
	/** The etat. */
	private String etat;

	/** * Attributs Table REGIMEDESTINATAIRE **. */
	//Champs de saisie
	private String numListRcCodePpmOB;
	
	/** The num list rc code regime douanier ob. */
	private String numListRcCodeRegimeDouanierOB;
	
	/** The num list rc code regime fiscal ob. */
	private String numListRcCodeRegimeFiscalOB;
	
	/** The num list rc type regime ob. */
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	/** The num list rc code ppm rech. */
	private String numListRcCodePpmRech;
	
	/** The num list rc code regime douanier rech. */
	private String numListRcCodeRegimeDouanierRech;
	
	/** The num list rc code regime fiscal rech. */
	private String numListRcCodeRegimeFiscalRech;
	
	/** The num list rc type regime rech. */
	private String numListRcTypeRegimeRech;

	/** The liste rc regimedestinataire. */
	List listeRcRegimedestinataire = new ArrayList();
	
	/** The regimedestinatairevo. */
	RegimeDestinataire regimedestinatairevo = new RegimeDestinataire();

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
	 * * M�thode getNewREGIMEDESTINATAIREVO () **.
	 *
	 * @return the new rc regimedestinataire vo
	 */
	public RegimeDestinataire getNewRcRegimedestinataireVO() {
		RegimeDestinataire regimedestinatairevo = new RegimeDestinataire();

		regimedestinatairevo.setRcCodePpm(getNumListRcCodePpmOB());
		regimedestinatairevo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDouanierOB());
		regimedestinatairevo.setRcCodeRegimeFiscal(getNumListRcCodeRegimeFiscalOB());
		regimedestinatairevo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimedestinatairevo;
	}

	/**
	 * * M�thode setRegimedestinataire () **.
	 *
	 * @param regimedestinatairevo the new regimedestinataire
	 */
	public void setRegimedestinataire (RegimeDestinataire regimedestinatairevo) {

		setNumListRcCodePpmOB (regimedestinatairevo.getRcCodePpm());
		setNumListRcCodeRegimeDouanierOB (regimedestinatairevo.getRcCodeRegimeDouanier());
		setNumListRcCodeRegimeFiscalOB (regimedestinatairevo.getRcCodeRegimeFiscal());
		setNumListRcTypeRegimeOB (regimedestinatairevo.getRcTypeRegime());

	}

	/**
	 * * M�thodes reset **.
	 */
	public void reset() {
		numListRcCodePpmOB="";
		numListRcCodeRegimeDouanierOB="";
		numListRcCodeRegimeFiscalOB="";
		numListRcTypeRegimeOB="";
	}
	
	/**
	 * Reset champs recherche.
	 */
	public void resetChampsRecherche() {
		numListRcCodePpmRech="";
		numListRcCodeRegimeDouanierRech="";
		numListRcCodeRegimeFiscalRech="";
		numListRcTypeRegimeRech="";
	}

	/**
	 * Gets the num list rc code ppm ob.
	 *
	 * @return the num list rc code ppm ob
	 */
	public String getNumListRcCodePpmOB() {
		return numListRcCodePpmOB;
	}

	/**
	 * Sets the num list rc code ppm ob.
	 *
	 * @param numListRcCodePpmOB the new num list rc code ppm ob
	 */
	public void setNumListRcCodePpmOB(String numListRcCodePpmOB) {
		this.numListRcCodePpmOB = numListRcCodePpmOB;
	}

	/**
	 * Gets the num list rc code regime douanier ob.
	 *
	 * @return the num list rc code regime douanier ob
	 */
	public String getNumListRcCodeRegimeDouanierOB() {
		return numListRcCodeRegimeDouanierOB;
	}

	/**
	 * Sets the num list rc code regime douanier ob.
	 *
	 * @param numListRcCodeRegimeDouanierOB the new num list rc code regime douanier ob
	 */
	public void setNumListRcCodeRegimeDouanierOB(String numListRcCodeRegimeDouanierOB) {
		this.numListRcCodeRegimeDouanierOB = numListRcCodeRegimeDouanierOB;
	}

	/**
	 * Gets the num list rc code regime fiscal ob.
	 *
	 * @return the num list rc code regime fiscal ob
	 */
	public String getNumListRcCodeRegimeFiscalOB() {
		return numListRcCodeRegimeFiscalOB;
	}

	/**
	 * Sets the num list rc code regime fiscal ob.
	 *
	 * @param numListRcCodeRegimeFiscalOB the new num list rc code regime fiscal ob
	 */
	public void setNumListRcCodeRegimeFiscalOB(String numListRcCodeRegimeFiscalOB) {
		this.numListRcCodeRegimeFiscalOB = numListRcCodeRegimeFiscalOB;
	}

	/**
	 * Gets the num list rc type regime ob.
	 *
	 * @return the num list rc type regime ob
	 */
	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	/**
	 * Sets the num list rc type regime ob.
	 *
	 * @param numListRcTypeRegimeOB the new num list rc type regime ob
	 */
	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	/**
	 * Gets the num list rc code ppm rech.
	 *
	 * @return the num list rc code ppm rech
	 */
	public String getNumListRcCodePpmRech() {
		return numListRcCodePpmRech;
	}

	/**
	 * Sets the num list rc code ppm rech.
	 *
	 * @param numListRcCodePpmRech the new num list rc code ppm rech
	 */
	public void setNumListRcCodePpmRech(String numListRcCodePpmRech) {
		this.numListRcCodePpmRech = numListRcCodePpmRech;
	}

	/**
	 * Gets the num list rc code regime douanier rech.
	 *
	 * @return the num list rc code regime douanier rech
	 */
	public String getNumListRcCodeRegimeDouanierRech() {
		return numListRcCodeRegimeDouanierRech;
	}

	/**
	 * Sets the num list rc code regime douanier rech.
	 *
	 * @param numListRcCodeRegimeDouanierRech the new num list rc code regime douanier rech
	 */
	public void setNumListRcCodeRegimeDouanierRech(String numListRcCodeRegimeDouanierRech) {
		this.numListRcCodeRegimeDouanierRech = numListRcCodeRegimeDouanierRech;
	}

	/**
	 * Gets the num list rc code regime fiscal rech.
	 *
	 * @return the num list rc code regime fiscal rech
	 */
	public String getNumListRcCodeRegimeFiscalRech() {
		return numListRcCodeRegimeFiscalRech;
	}

	/**
	 * Sets the num list rc code regime fiscal rech.
	 *
	 * @param numListRcCodeRegimeFiscalRech the new num list rc code regime fiscal rech
	 */
	public void setNumListRcCodeRegimeFiscalRech(String numListRcCodeRegimeFiscalRech) {
		this.numListRcCodeRegimeFiscalRech = numListRcCodeRegimeFiscalRech;
	}

	/**
	 * Gets the num list rc type regime rech.
	 *
	 * @return the num list rc type regime rech
	 */
	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	/**
	 * Sets the num list rc type regime rech.
	 *
	 * @param numListRcTypeRegimeRech the new num list rc type regime rech
	 */
	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	/**
	 * Gets the liste rc regimedestinataire.
	 *
	 * @return the liste rc regimedestinataire
	 */
	public List getListeRcRegimedestinataire() {
		return listeRcRegimedestinataire;
	}

	/**
	 * Sets the liste rc regimedestinataire.
	 *
	 * @param listeRcRegimedestinataire the new liste rc regimedestinataire
	 */
	public void setListeRcRegimedestinataire(List listeRcRegimedestinataire) {
		this.listeRcRegimedestinataire = listeRcRegimedestinataire;
	}

	/**
	 * Gets the regimedestinatairevo.
	 *
	 * @return the regimedestinatairevo
	 */
	public RegimeDestinataire getRegimedestinatairevo() {
		return regimedestinatairevo;
	}

	/**
	 * Sets the regimedestinatairevo.
	 *
	 * @param regimedestinatairevo the new regimedestinatairevo
	 */
	public void setRegimedestinatairevo(RegimeDestinataire regimedestinatairevo) {
		this.regimedestinatairevo = regimedestinatairevo;
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