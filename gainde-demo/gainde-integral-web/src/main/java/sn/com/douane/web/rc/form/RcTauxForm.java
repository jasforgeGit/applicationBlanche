package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Taux;
import sn.com.douane.utils.sysEnv;


public class RcTauxForm implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TAUX ***/
	//Champs de saisie
	private String numLibelleTaux;
	private String numRcCodeTauxOB;
	private String numListRcCodeTaxeOB;
	private String datRcDateCloture;
	private String datRcDateValeurOB;
	private String tauxRcValeurTauxOB;

	//Champs de recherche
	private String numLibelleTauxRech;
	private String numRcCodeTauxRech;
	private String numListRcCodeTaxeRech;
	private String datRcDateClotureRech;
	private String datRcDateValeurRech;
	private String numRcValeurTauxRech;

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
	
	private List listeRcTaux = new ArrayList();
	private Taux tauxvo = new Taux();

	private String numRcValeurTauxOB ;
	
	/*** M�thode getNewTAUXVO () ***/
	public Taux getNewRcTauxVO() {
		Taux tauxvo = new Taux();

		tauxvo.setLibelleTaux(getNumLibelleTaux());
		tauxvo.setRcCodeTaux(getNumRcCodeTauxOB());
		tauxvo.setRcCodeTaxe(getNumListRcCodeTaxeOB());
		if (getDatRcDateCloture()!=null && !getDatRcDateCloture().equals("")){
			tauxvo.setRcDateCloture(new Date(sysEnv.strToDate(getDatRcDateCloture()).getTime()));
		}
		if (getDatRcDateValeurOB()!=null && !getDatRcDateValeurOB().equals("")){
			tauxvo.setRcDateValeur(new Date(sysEnv.strToDate(getDatRcDateValeurOB()).getTime()));
		}
		if (getTauxRcValeurTauxOB()!=null && !getTauxRcValeurTauxOB().equals("")){
			tauxvo.setRcValeurTaux(sysEnv.strToBigDecimal(getTauxRcValeurTauxOB()));
		}
		return tauxvo;
	}

	/*** M�thode setTaux () ***/
	public void setTaux (Taux tauxvo) {

		setNumLibelleTaux (tauxvo.getLibelleTaux());
		setNumRcCodeTauxOB (tauxvo.getRcCodeTaux());
		setNumListRcCodeTaxeOB (tauxvo.getRcCodeTaxe());
		if (tauxvo.getRcDateCloture()!=null){
			setDatRcDateCloture (sysEnv.dateToStr(new Date(tauxvo.getRcDateCloture().getTime())));
		}
		if (tauxvo.getRcDateValeur()!=null){
			setDatRcDateValeurOB (sysEnv.dateToStr(new Date(tauxvo.getRcDateValeur().getTime())));
		}
		if (tauxvo.getRcValeurTaux()!=null){
			setTauxRcValeurTauxOB(sysEnv.BigdecimalToStr(tauxvo.getRcValeurTaux()));
		}
	}

	/*** M�thodes reset ***/
	public void reset() {
		 numLibelleTaux ="";
		 numRcCodeTauxOB ="";
		 numListRcCodeTaxeOB ="";
		 datRcDateCloture ="";
		 datRcDateValeurOB ="";
		 tauxRcValeurTauxOB ="";
	}
	public void resetChampsRecherche() {
		 numLibelleTauxRech ="";
		 numRcCodeTauxRech ="";
		 numListRcCodeTaxeRech ="";
		 datRcDateClotureRech ="";
		 datRcDateValeurRech ="";
		 numRcValeurTauxRech ="";
	}

	/*** M�thodes get et set ***/
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

	public String getNumLibelleTaux() {
		return numLibelleTaux;
	}

	public void setNumLibelleTaux(String numLibelleTaux) {
		this.numLibelleTaux = numLibelleTaux;
	}

	public String getNumRcCodeTauxOB() {
		return numRcCodeTauxOB;
	}

	public void setNumRcCodeTauxOB(String numRcCodeTauxOB) {
		this.numRcCodeTauxOB = numRcCodeTauxOB;
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

	public String getTauxRcValeurTauxOB() {
		return tauxRcValeurTauxOB.replaceAll("%","");
	}

	public void setTauxRcValeurTauxOB(String tauxRcValeurTauxOB) {
		this.tauxRcValeurTauxOB = tauxRcValeurTauxOB;
	}

	public String getNumLibelleTauxRech() {
		return numLibelleTauxRech;
	}

	public void setNumLibelleTauxRech(String numLibelleTauxRech) {
		this.numLibelleTauxRech = numLibelleTauxRech;
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

	public String getNumRcValeurTauxRech() {
		return numRcValeurTauxRech;
	}

	public void setNumRcValeurTauxRech(String numRcValeurTauxRech) {
		this.numRcValeurTauxRech = numRcValeurTauxRech;
	}

	public List getListeRcTaux() {
		return listeRcTaux;
	}

	public void setListeRcTaux(List listeRcTaux) {
		this.listeRcTaux = listeRcTaux;
	}

	public Taux getTauxvo() {
		return tauxvo;
	}

	public void setTauxvo(Taux tauxvo) {
		this.tauxvo = tauxvo;
	}

	public String getNumRcValeurTauxOB() {
		return numRcValeurTauxOB;
	}

	public void setNumRcValeurTauxOB(String numRcValeurTauxOB) {
		this.numRcValeurTauxOB = numRcValeurTauxOB;
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