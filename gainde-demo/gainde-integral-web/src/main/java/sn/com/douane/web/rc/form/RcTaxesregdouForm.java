package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.TaxesRegDou;
import sn.com.douane.utils.DateUtil;


/**
 * The Class RcTaxesregdouForm.
 * 
 * @author kerfahi ghazi
 */
public class RcTaxesregdouForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TAXESREGDOU ***/
	//Champs de saisie
	private String numListRcCodeRegimeDounierOB;
	private String numListRcCodeTxOB;
	private String numListRcCodeTaxeOB;
	private String datRcDateCloture;
	private String datRcDateValeurOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeRegimeDounierRech;
	private String numListRcCodeTauxRech;
	private String numListRcCodeTaxeRech;
	private String datRcDateClotureRech;
	private String datRcDateValeurRech;
	private String numListRcTypeRegimeRech;

	List listeRcTaxesregdou = new ArrayList();
	TaxesRegDou taxesregdouvo = new TaxesRegDou();

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
	
	/*** M�thode getNewTAXESREGDOUVO () ***/
	public TaxesRegDou getNewRcTaxesregdouVO() {
		TaxesRegDou taxesregdouvo = new TaxesRegDou();

		taxesregdouvo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDounierOB());
		taxesregdouvo.setRcCodeTaux(getNumListRcCodeTxOB());
		taxesregdouvo.setRcCodeTaxe(getNumListRcCodeTaxeOB());
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals(""))
			taxesregdouvo.setRcDateCloture(new Date(DateUtil.convertStringToDate(getDatRcDateCloture()).getTime()));
		if (getDatRcDateValeurOB()!=null && !getDatRcDateValeurOB().equals(""))
			taxesregdouvo.setRcDateValeur(new Date(DateUtil.convertStringToDate(getDatRcDateValeurOB()).getTime()));
		taxesregdouvo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return taxesregdouvo;
	}

	/*** M�thode setTaxesregdou () ***/
	public void setTaxesregdou (TaxesRegDou taxesregdouvo) {

		setNumListRcCodeRegimeDounierOB (taxesregdouvo.getRcCodeRegimeDouanier());
		setNumListRcCodeTxOB (taxesregdouvo.getRcCodeTaux());
		setNumListRcCodeTaxeOB (taxesregdouvo.getRcCodeTaxe());
		if (taxesregdouvo.getRcDateCloture()!=null)
			setDatRcDateCloture (DateUtil.getDate(new Date(taxesregdouvo.getRcDateCloture().getTime())));
		if (taxesregdouvo.getRcDateValeur()!=null)
			setDatRcDateValeurOB (DateUtil.getDate(new Date(taxesregdouvo.getRcDateValeur().getTime())));
		setNumListRcTypeRegimeOB (taxesregdouvo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeRegimeDounierOB="";
		numListRcCodeTxOB="";
		numListRcCodeTaxeOB="";
		datRcDateCloture="";
		datRcDateValeurOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeRegimeDounierRech="";
		numListRcCodeTauxRech="";
		numListRcCodeTaxeRech="";
		datRcDateClotureRech="";
		datRcDateValeurRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumListRcCodeRegimeDounierOB() {
		return numListRcCodeRegimeDounierOB;
	}

	public void setNumListRcCodeRegimeDounierOB(String numListRcCodeRegimeDounierOB) {
		this.numListRcCodeRegimeDounierOB = numListRcCodeRegimeDounierOB;
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

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumListRcCodeRegimeDounierRech() {
		return numListRcCodeRegimeDounierRech;
	}

	public void setNumListRcCodeRegimeDounierRech(String numListRcCodeRegimeDounierRech) {
		this.numListRcCodeRegimeDounierRech = numListRcCodeRegimeDounierRech;
	}

	public String getNumListRcCodeTauxRech() {
		return numListRcCodeTauxRech;
	}

	public void setNumListRcCodeTauxRech(String numListRcCodeTauxRech) {
		this.numListRcCodeTauxRech = numListRcCodeTauxRech;
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

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcTaxesregdou() {
		return listeRcTaxesregdou;
	}

	public void setListeRcTaxesregdou(List listeRcTaxesregdou) {
		this.listeRcTaxesregdou = listeRcTaxesregdou;
	}

	public TaxesRegDou getTaxesregdouvo() {
		return taxesregdouvo;
	}

	public void setTaxesregdouvo(TaxesRegDou taxesregdouvo) {
		this.taxesregdouvo = taxesregdouvo;
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