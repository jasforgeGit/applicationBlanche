package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.TaxesRegime;
import sn.com.douane.utils.DateUtil;


/**
 * The Class RcTaxesregimeForm.
 * 
 * @author kerfahi ghazi
 */
public class RcTaxesregimeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TAXESREGIME ***/
	//Champs de saisie
	private String numListRcCodeTxOB;
	private String numListRcCodeTaxeOB;
	private String datRcDateCloture;
	private String datRcDateValeurOB;
	private String numListRcRegimeDouanierOB;
	private String numListRcRegimeFiscalOB;
	private String numListRcTypeRegimeDouanierOB;

	//Champs de recherche
	private String numRcCodeTauxRech;
	private String numListRcCodeTaxeRech;
	private String datRcDateClotureRech;
	private String datRcDateValeurRech;
	private String numListRcRegimeDouanierRech;
	private String numListRcRegimeFiscalRech;
	private String numListRcTypeRegimeDouanierRech;

	List listeRcTaxesregime = new ArrayList();
	TaxesRegime taxesregimevo = new TaxesRegime();

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
	
	/*** M�thode getNewTAXESREGIMEVO () ***/
	public TaxesRegime getNewRcTaxesregimeVO() {
		TaxesRegime taxesregimevo = new TaxesRegime();

		taxesregimevo.setRcCodeTaux(getNumListRcCodeTxOB());
		taxesregimevo.setRcCodeTaxes(getNumListRcCodeTaxeOB());
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals(""))
			taxesregimevo.setRcDateCloture(new Date(DateUtil.convertStringToDate(getDatRcDateCloture()).getTime()));
		if (getDatRcDateValeurOB()!=null && !getDatRcDateValeurOB().equals(""))
			taxesregimevo.setRcDateValeur(new Date(DateUtil.convertStringToDate(getDatRcDateValeurOB()).getTime()));
		taxesregimevo.setRcCodeRegimeDouanier(getNumListRcRegimeDouanierOB());
		taxesregimevo.setRcRegimeFiscal(getNumListRcRegimeFiscalOB());
		taxesregimevo.setRcTypeRegime(getNumListRcTypeRegimeDouanierOB());

		return taxesregimevo;
	}

	/*** M�thode setTaxesregime () ***/
	public void setTaxesregime (TaxesRegime taxesregimevo) {

		setNumListRcCodeTxOB (taxesregimevo.getRcCodeTaux());
		setNumListRcCodeTaxeOB (taxesregimevo.getRcCodeTaxes());
		if (taxesregimevo.getRcDateCloture()!=null)
			setDatRcDateCloture (DateUtil.getDate(new Date(taxesregimevo.getRcDateCloture().getTime())));
		if (taxesregimevo.getRcDateValeur()!=null)
			setDatRcDateValeurOB (DateUtil.getDate(new Date(taxesregimevo.getRcDateValeur().getTime())));
		setNumListRcRegimeDouanierOB (taxesregimevo.getRcCodeRegimeDouanier());
		setNumListRcRegimeFiscalOB (taxesregimevo.getRcRegimeFiscal());
		setNumListRcTypeRegimeDouanierOB (taxesregimevo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeTxOB="";
		numListRcCodeTaxeOB="";
		datRcDateCloture="";
		datRcDateValeurOB="";
		numListRcRegimeDouanierOB="";
		numListRcRegimeFiscalOB="";
		numListRcTypeRegimeDouanierOB="";
	}
	public void resetChampsRecherche() {
		numRcCodeTauxRech="";
		numListRcCodeTaxeRech="";
		datRcDateClotureRech="";
		datRcDateValeurRech="";
		numListRcRegimeDouanierRech="";
		numListRcRegimeFiscalRech="";
		numListRcTypeRegimeDouanierRech="";
	}

	public String getNumListRcCodeTxOB() {
		return numListRcCodeTxOB;
	}

	public void setNumListRcCodeTxOB(String numListRcCodeTxOB) {
		this.numListRcCodeTxOB = numListRcCodeTxOB;
	}

	public String getNumListRcCodeTaxeOB() {
		return numListRcCodeTaxeOB;
	}

	public void setNumListRcCodeTaxeOB(String numListRcCodeTaxeOB) {
		this.numListRcCodeTaxeOB = numListRcCodeTaxeOB;
	}

	public String getDatRcDateCloture() {
		return datRcDateCloture;
	}

	public void setDatRcDateCloture(String datRcDateCloture) {
		this.datRcDateCloture = datRcDateCloture;
	}

	public String getDatRcDateValeurOB() {
		return datRcDateValeurOB;
	}

	public void setDatRcDateValeurOB(String datRcDateValeurOB) {
		this.datRcDateValeurOB = datRcDateValeurOB;
	}

	public String getNumListRcRegimeDouanierOB() {
		return numListRcRegimeDouanierOB;
	}

	public void setNumListRcRegimeDouanierOB(String numListRcRegimeDouanierOB) {
		this.numListRcRegimeDouanierOB = numListRcRegimeDouanierOB;
	}

	public String getNumListRcRegimeFiscalOB() {
		return numListRcRegimeFiscalOB;
	}

	public void setNumListRcRegimeFiscalOB(String numListRcRegimeFiscalOB) {
		this.numListRcRegimeFiscalOB = numListRcRegimeFiscalOB;
	}

	public String getNumListRcTypeRegimeDouanierOB() {
		return numListRcTypeRegimeDouanierOB;
	}

	public void setNumListRcTypeRegimeDouanierOB(String numListRcTypeRegimeDouanierOB) {
		this.numListRcTypeRegimeDouanierOB = numListRcTypeRegimeDouanierOB;
	}

	public String getNumRcCodeTauxRech() {
		return numRcCodeTauxRech;
	}

	public void setNumRcCodeTauxRech(String numRcCodeTauxRech) {
		this.numRcCodeTauxRech = numRcCodeTauxRech;
	}

	public String getNumListRcCodeTaxeRech() {
		return numListRcCodeTaxeRech;
	}

	public void setNumListRcCodeTaxeRech(String numListRcCodeTaxeRech) {
		this.numListRcCodeTaxeRech = numListRcCodeTaxeRech;
	}

	public String getDatRcDateClotureRech() {
		return datRcDateClotureRech;
	}

	public void setDatRcDateClotureRech(String datRcDateClotureRech) {
		this.datRcDateClotureRech = datRcDateClotureRech;
	}

	public String getDatRcDateValeurRech() {
		return datRcDateValeurRech;
	}

	public void setDatRcDateValeurRech(String datRcDateValeurRech) {
		this.datRcDateValeurRech = datRcDateValeurRech;
	}

	public String getNumListRcRegimeDouanierRech() {
		return numListRcRegimeDouanierRech;
	}

	public void setNumListRcRegimeDouanierRech(String numListRcRegimeDouanierRech) {
		this.numListRcRegimeDouanierRech = numListRcRegimeDouanierRech;
	}

	public String getNumListRcRegimeFiscalRech() {
		return numListRcRegimeFiscalRech;
	}

	public void setNumListRcRegimeFiscalRech(String numListRcRegimeFiscalRech) {
		this.numListRcRegimeFiscalRech = numListRcRegimeFiscalRech;
	}

	public String getNumListRcTypeRegimeDouanierRech() {
		return numListRcTypeRegimeDouanierRech;
	}

	public void setNumListRcTypeRegimeDouanierRech(String numListRcTypeRegimeDouanierRech) {
		this.numListRcTypeRegimeDouanierRech = numListRcTypeRegimeDouanierRech;
	}

	public List getListeRcTaxesregime() {
		return listeRcTaxesregime;
	}

	public void setListeRcTaxesregime(List listeRcTaxesregime) {
		this.listeRcTaxesregime = listeRcTaxesregime;
	}

	public TaxesRegime getTaxesregimevo() {
		return taxesregimevo;
	}

	public void setTaxesregimevo(TaxesRegime taxesregimevo) {
		this.taxesregimevo = taxesregimevo;
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