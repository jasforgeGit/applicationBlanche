package sn.com.douane.web.rc.form;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Regime;
import sn.com.douane.utils.ConvertUtil;

public class RcRegimeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGIME ***/
	//Champs de saisie
	private String numRcCircuitVisiteOB;
	private String numListRcCodeRegimeDouanierOB;
	private String numListRcCodeRegimeFiscalOB;
	private String numRcDureeEntrepot;
	private String numRcIndicMutatOB;
	private String numRcLibelleRegimeOB;
	private String numRcRegimeTaxableOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numRcCircuitVisiteRech;
	private String numListRcCodeRegimeDouanierRech;
	private String numListRcCodeRegimeFiscalRech;
	private String numRcDureeEntrepotRech;
	private String numRcIndicMutatRech;
	private String numRcLibelleRegimeRech;
	private String numRcRegimeTaxableRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegime = new ArrayList();
	Regime regimevo = new Regime();

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
	
	/*** M�thode getNewREGIMEVO () ***/
	public Regime getNewRcRegimeVO() {
		Regime regimevo = new Regime();

		regimevo.setRcCircuitVisite(getNumRcCircuitVisiteOB());
		regimevo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDouanierOB());
		regimevo.setRcCodeRegimeFiscal(getNumListRcCodeRegimeFiscalOB());
		if (getNumRcDureeEntrepot()!=null && !getNumRcDureeEntrepot().equals(""))
			regimevo.setRcDureeEntrepot(new Integer(getNumRcDureeEntrepot()));
		regimevo.setRcIndicMutat(getNumRcIndicMutatOB());
		regimevo.setRcLibelleRegime(getNumRcLibelleRegimeOB());
		regimevo.setRcRegimeTaxable(getNumRcRegimeTaxableOB());
		regimevo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regimevo;
	}

	/*** M�thode setRegime () ***/
	public void setRegime (Regime regimevo) {

		setNumRcCircuitVisiteOB (regimevo.getRcCircuitVisite());
		setNumListRcCodeRegimeDouanierOB (regimevo.getRcCodeRegimeDouanier());
		setNumListRcCodeRegimeFiscalOB (regimevo.getRcCodeRegimeFiscal());
		if (regimevo.getRcDureeEntrepot()!=null)
			setNumRcDureeEntrepot (ConvertUtil.converToString(regimevo.getRcDureeEntrepot()));
		setNumRcIndicMutatOB (regimevo.getRcIndicMutat());
		setNumRcLibelleRegimeOB (regimevo.getRcLibelleRegime());
		setNumRcRegimeTaxableOB (regimevo.getRcRegimeTaxable());
		setNumListRcTypeRegimeOB (regimevo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcCircuitVisiteOB="";
		numListRcCodeRegimeDouanierOB="";
		numListRcCodeRegimeFiscalOB="";
		numRcDureeEntrepot="";
		numRcIndicMutatOB="";
		numRcLibelleRegimeOB="";
		numRcRegimeTaxableOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numRcCircuitVisiteRech="";
		numListRcCodeRegimeDouanierRech="";
		numListRcCodeRegimeFiscalRech="";
		numRcDureeEntrepotRech="";
		numRcIndicMutatRech="";
		numRcLibelleRegimeRech="";
		numRcRegimeTaxableRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumRcCircuitVisiteOB() {
		return numRcCircuitVisiteOB;
	}

	public void setNumRcCircuitVisiteOB(String numRcCircuitVisiteOB) {
		this.numRcCircuitVisiteOB = numRcCircuitVisiteOB;
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

	public String getNumRcDureeEntrepot() {
		return numRcDureeEntrepot;
	}

	public void setNumRcDureeEntrepot(String numRcDureeEntrepot) {
		this.numRcDureeEntrepot = numRcDureeEntrepot;
	}

	public String getNumRcIndicMutatOB() {
		return numRcIndicMutatOB;
	}

	public void setNumRcIndicMutatOB(String numRcIndicMutatOB) {
		this.numRcIndicMutatOB = numRcIndicMutatOB;
	}

	public String getNumRcLibelleRegimeOB() {
		return numRcLibelleRegimeOB;
	}

	public void setNumRcLibelleRegimeOB(String numRcLibelleRegimeOB) {
		this.numRcLibelleRegimeOB = numRcLibelleRegimeOB;
	}

	public String getNumRcRegimeTaxableOB() {
		return numRcRegimeTaxableOB;
	}

	public void setNumRcRegimeTaxableOB(String numRcRegimeTaxableOB) {
		this.numRcRegimeTaxableOB = numRcRegimeTaxableOB;
	}

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumRcCircuitVisiteRech() {
		return numRcCircuitVisiteRech;
	}

	public void setNumRcCircuitVisiteRech(String numRcCircuitVisiteRech) {
		this.numRcCircuitVisiteRech = numRcCircuitVisiteRech;
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

	public String getNumRcDureeEntrepotRech() {
		return numRcDureeEntrepotRech;
	}

	public void setNumRcDureeEntrepotRech(String numRcDureeEntrepotRech) {
		this.numRcDureeEntrepotRech = numRcDureeEntrepotRech;
	}

	public String getNumRcIndicMutatRech() {
		return numRcIndicMutatRech;
	}

	public void setNumRcIndicMutatRech(String numRcIndicMutatRech) {
		this.numRcIndicMutatRech = numRcIndicMutatRech;
	}

	public String getNumRcLibelleRegimeRech() {
		return numRcLibelleRegimeRech;
	}

	public void setNumRcLibelleRegimeRech(String numRcLibelleRegimeRech) {
		this.numRcLibelleRegimeRech = numRcLibelleRegimeRech;
	}

	public String getNumRcRegimeTaxableRech() {
		return numRcRegimeTaxableRech;
	}

	public void setNumRcRegimeTaxableRech(String numRcRegimeTaxableRech) {
		this.numRcRegimeTaxableRech = numRcRegimeTaxableRech;
	}

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcRegime() {
		return listeRcRegime;
	}

	public void setListeRcRegime(List listeRcRegime) {
		this.listeRcRegime = listeRcRegime;
	}

	public Regime getRegimevo() {
		return regimevo;
	}

	public void setRegimevo(Regime regimevo) {
		this.regimevo = regimevo;
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