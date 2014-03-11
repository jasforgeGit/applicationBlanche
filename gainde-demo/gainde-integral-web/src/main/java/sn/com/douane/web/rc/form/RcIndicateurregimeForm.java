package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegime;
import sn.com.douane.utils.DateUtil;



public class RcIndicateurregimeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table INDICATEURREGIME ***/
	//Champs de saisie
	private String numListRcCodeIndicateurOB;
	private String numListRcCodeRegimeDouanierOB;
	private String numListRcCodeRegimeFiscalOB;
	private String datRcDateCloture;
	private String datRcDateValiditeOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeIndicateurRech;
	private String numListRcCodeRegimeDouanierRech;
	private String numListRcCodeRegimeFiscalRech;
	private String datRcDateClotureRech;
	private String datRcDateValiditeRech;
	private String numListRcTypeRegimeRech;

	List listeRcIndicateurregime = new ArrayList();
	IndicateurRegime indicateurregimevo = new IndicateurRegime();

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
	
	/*** M�thode getNewINDICATEURREGIMEVO () ***/
	public IndicateurRegime getNewRcIndicateurregimeVO() {
		IndicateurRegime indicateurregimevo = new IndicateurRegime();

		indicateurregimevo.setRcCodeIndicateur(getNumListRcCodeIndicateurOB());
		indicateurregimevo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDouanierOB());
		indicateurregimevo.setRcCodeRegimeFiscal(getNumListRcCodeRegimeFiscalOB());
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals("")) {
			indicateurregimevo.setRcDateCloture(new Date(DateUtil.convertStringToDate(getDatRcDateCloture()).getTime()));
		}
		if (getDatRcDateValiditeOB()!=null && !getDatRcDateValiditeOB().equals("")) {
			indicateurregimevo.setRcDateValidite(new Date(DateUtil.convertStringToDate(getDatRcDateValiditeOB()).getTime()));
		}
		indicateurregimevo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return indicateurregimevo;
	}

	/*** M�thode setIndicateurregime () ***/
	public void setIndicateurregime (IndicateurRegime indicateurregimevo) {

		setNumListRcCodeIndicateurOB (indicateurregimevo.getRcCodeIndicateur());
		setNumListRcCodeRegimeDouanierOB (indicateurregimevo.getRcCodeRegimeDouanier());
		setNumListRcCodeRegimeFiscalOB (indicateurregimevo.getRcCodeRegimeFiscal());
		if (indicateurregimevo.getRcDateCloture()!=null) {
			setDatRcDateCloture (DateUtil.getDate(new Date(indicateurregimevo.getRcDateCloture().getTime())));
		}
		if (indicateurregimevo.getRcDateValidite()!=null) {
			setDatRcDateValiditeOB (DateUtil.getDate(new Date(indicateurregimevo.getRcDateValidite().getTime())));
		}
		setNumListRcTypeRegimeOB (indicateurregimevo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeIndicateurOB="";
		numListRcCodeRegimeDouanierOB="";
		numListRcCodeRegimeFiscalOB="";
		datRcDateCloture="";
		datRcDateValiditeOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeIndicateurRech="";
		numListRcCodeRegimeDouanierRech="";
		numListRcCodeRegimeFiscalRech="";
		datRcDateClotureRech="";
		datRcDateValiditeRech="";
		numListRcTypeRegimeRech="";
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

	
	public String getNumListRcCodeIndicateurOB() {
		return numListRcCodeIndicateurOB;
	}

	
	public void setNumListRcCodeIndicateurOB(String numListRcCodeIndicateurOB) {
		this.numListRcCodeIndicateurOB = numListRcCodeIndicateurOB;
	}

	
	public String getNumListRcCodeRegimeDouanierOB() {
		return numListRcCodeRegimeDouanierOB;
	}

	
	public void setNumListRcCodeRegimeDouanierOB(String numListRcCodeRegimeDouanierOB) {
		this.numListRcCodeRegimeDouanierOB = numListRcCodeRegimeDouanierOB;
	}

	
	public String getNumListRcCodeRegimeFiscalOB() {
		return numListRcCodeRegimeFiscalOB;
	}

	
	public void setNumListRcCodeRegimeFiscalOB(String numListRcCodeRegimeFiscalOB) {
		this.numListRcCodeRegimeFiscalOB = numListRcCodeRegimeFiscalOB;
	}

	
	public String getDatRcDateCloture() {
		return datRcDateCloture;
	}

	
	public void setDatRcDateCloture(String datRcDateCloture) {
		this.datRcDateCloture = datRcDateCloture;
	}

	
	public String getDatRcDateValiditeOB() {
		return datRcDateValiditeOB;
	}

	
	public void setDatRcDateValiditeOB(String datRcDateValiditeOB) {
		this.datRcDateValiditeOB = datRcDateValiditeOB;
	}

	
	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	
	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	
	public String getNumListRcCodeIndicateurRech() {
		return numListRcCodeIndicateurRech;
	}

	
	public void setNumListRcCodeIndicateurRech(String numListRcCodeIndicateurRech) {
		this.numListRcCodeIndicateurRech = numListRcCodeIndicateurRech;
	}

	
	public String getNumListRcCodeRegimeDouanierRech() {
		return numListRcCodeRegimeDouanierRech;
	}

	
	public void setNumListRcCodeRegimeDouanierRech(String numListRcCodeRegimeDouanierRech) {
		this.numListRcCodeRegimeDouanierRech = numListRcCodeRegimeDouanierRech;
	}

	
	public String getNumListRcCodeRegimeFiscalRech() {
		return numListRcCodeRegimeFiscalRech;
	}

	
	public void setNumListRcCodeRegimeFiscalRech(String numListRcCodeRegimeFiscalRech) {
		this.numListRcCodeRegimeFiscalRech = numListRcCodeRegimeFiscalRech;
	}

	
	public String getDatRcDateClotureRech() {
		return datRcDateClotureRech;
	}

	
	public void setDatRcDateClotureRech(String datRcDateClotureRech) {
		this.datRcDateClotureRech = datRcDateClotureRech;
	}

	
	public String getDatRcDateValiditeRech() {
		return datRcDateValiditeRech;
	}

	
	public void setDatRcDateValiditeRech(String datRcDateValiditeRech) {
		this.datRcDateValiditeRech = datRcDateValiditeRech;
	}

	
	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	
	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	
	public List getListeRcIndicateurregime() {
		return listeRcIndicateurregime;
	}

	
	public void setListeRcIndicateurregime(List listeRcIndicateurregime) {
		this.listeRcIndicateurregime = listeRcIndicateurregime;
	}

	
	public IndicateurRegime getIndicateurregimevo() {
		return indicateurregimevo;
	}

	
	public void setIndicateurregimevo(IndicateurRegime indicateurregimevo) {
		this.indicateurregimevo = indicateurregimevo;
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