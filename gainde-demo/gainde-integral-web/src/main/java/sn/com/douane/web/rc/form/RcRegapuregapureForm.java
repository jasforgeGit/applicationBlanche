package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import tn.com.tw.java.exception.ConstErrCodRC;
import tn.com.tw.java.exception.TwreException;


public class RcRegapuregapureForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGAPUREGAPURE ***/
	//Champs de saisie
	private String numListRcRegDouApurantOB;
	private String numListRcRegDouApureOB;
	private String numListRcTypeRegApurantOB;
	private String numListRcTypeRegApureOB;

	//Champs de recherche
	private String numListRcRegDouApurantRech;
	private String numListRcRegDouApureRech;
	private String numListRcTypeRegApurantRech;
	private String numListRcTypeRegApureRech;

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
	
	List listeRcRegapuregapure = new ArrayList();
	Regapuregapure regapuregapurevo = new Regapuregapure();

	/*** M�thode getNewREGAPUREGAPUREVO () **
	 * @throws TwreException*/
	public Regapuregapure getNewRcRegapuregapureVO() throws TwreException {
		Regapuregapure regapuregapurevo = new Regapuregapure();
		
		String regapure=getNumListRcRegDouApureOB();
		String regapurant=getNumListRcRegDouApurantOB();
		if(regapure!=null&&regapure.length()==2){
		  regapuregapurevo.setRcRegDouApure(regapure.substring(1));
		  regapuregapurevo.setRcTypeRegApure(regapure.substring(0,1));
		}else
			throw new TwreException(ConstErrCodRC.regimedouanierKey);
		if(regapurant!=null&&regapurant.length()==2){
		  regapuregapurevo.setRcRegDouApurant(regapurant.substring(1));		
		  regapuregapurevo.setRcTypeRegApurant(regapurant.substring(0,1));
		}else
			throw new TwreException(ConstErrCodRC.regimedouanierKey);
		
		return regapuregapurevo;
	}

	/*** M�thode setRegapuregapure () ***/
	public void setRegapuregapure (Regapuregapure regapuregapurevo) {
		setNumListRcRegDouApurantOB (regapuregapurevo.getRcTypeRegApurant()+regapuregapurevo.getRcRegDouApurant());
		setNumListRcRegDouApureOB (regapuregapurevo.getRcTypeRegApure()+regapuregapurevo.getRcRegDouApure());
	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcRegDouApurantOB="";
		numListRcRegDouApureOB="";
		numListRcTypeRegApurantOB="";
		numListRcTypeRegApureOB="";
	}
	public void resetChampsRecherche() {
		numListRcRegDouApurantRech="";
		numListRcRegDouApureRech="";
		numListRcTypeRegApurantRech="";
		numListRcTypeRegApureRech="";
	}
	
	public String getNumListRcRegDouApurantOB() {
		return numListRcRegDouApurantOB;
	}

	
	public void setNumListRcRegDouApurantOB(String numListRcRegDouApurantOB) {
		this.numListRcRegDouApurantOB = numListRcRegDouApurantOB;
	}

	
	public String getNumListRcRegDouApureOB() {
		return numListRcRegDouApureOB;
	}

	
	public void setNumListRcRegDouApureOB(String numListRcRegDouApureOB) {
		this.numListRcRegDouApureOB = numListRcRegDouApureOB;
	}

	
	public String getNumListRcTypeRegApurantOB() {
		return numListRcTypeRegApurantOB;
	}

	
	public void setNumListRcTypeRegApurantOB(String numListRcTypeRegApurantOB) {
		this.numListRcTypeRegApurantOB = numListRcTypeRegApurantOB;
	}

	
	public String getNumListRcTypeRegApureOB() {
		return numListRcTypeRegApureOB;
	}

	
	public void setNumListRcTypeRegApureOB(String numListRcTypeRegApureOB) {
		this.numListRcTypeRegApureOB = numListRcTypeRegApureOB;
	}

	
	public String getNumListRcRegDouApurantRech() {
		return numListRcRegDouApurantRech;
	}

	
	public void setNumListRcRegDouApurantRech(String numListRcRegDouApurantRech) {
		this.numListRcRegDouApurantRech = numListRcRegDouApurantRech;
	}

	
	public String getNumListRcRegDouApureRech() {
		return numListRcRegDouApureRech;
	}

	
	public void setNumListRcRegDouApureRech(String numListRcRegDouApureRech) {
		this.numListRcRegDouApureRech = numListRcRegDouApureRech;
	}

	
	public String getNumListRcTypeRegApurantRech() {
		return numListRcTypeRegApurantRech;
	}

	
	public void setNumListRcTypeRegApurantRech(String numListRcTypeRegApurantRech) {
		this.numListRcTypeRegApurantRech = numListRcTypeRegApurantRech;
	}

	public String getNumListRcTypeRegApureRech() {
		return numListRcTypeRegApureRech;
	}

	public void setNumListRcTypeRegApureRech(String numListRcTypeRegApureRech) {
		this.numListRcTypeRegApureRech = numListRcTypeRegApureRech;
	}

	public List getListeRcRegapuregapure() {
		return listeRcRegapuregapure;
	}

	public void setListeRcRegapuregapure(List listeRcRegapuregapure) {
		this.listeRcRegapuregapure = listeRcRegapuregapure;
	}

	public Regapuregapure getRegapuregapurevo() {
		return regapuregapurevo;
	}

	public void setRegapuregapurevo(Regapuregapure regapuregapurevo) {
		this.regapuregapurevo = regapuregapurevo;
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