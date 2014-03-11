package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import sn.com.douane.ejb.rc.model.entities.BureauDouaneTypeManifeste;
import sn.com.douane.utils.sysEnv;


public class RcBurdouanetypemanForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

	private String etat;
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
	/** * Attributs Table BURDOUANETYPEMAN ** */
	//Champs de saisie
	private String numListRcCodeBurDouaneOB;

	private String numListRcCodeTypeManifOB;

	//Champs de recherche
	private String numListRcCodeBurDouaneRech;

	private String numListRcCodeTypeManifRech;

	private List listTypeManifeste = new ArrayList();

	private List listeRcBurdouanetypeman = new ArrayList();

	private BureauDouaneTypeManifeste burdouanetypemanvo = new BureauDouaneTypeManifeste();

	/** * M�thode getNewBURDOUANETYPEMANVO () ** */
	public BureauDouaneTypeManifeste getNewRcBurdouanetypemanVO() {
		BureauDouaneTypeManifeste burdouanetypemanvo = new BureauDouaneTypeManifeste();

		burdouanetypemanvo
				.setRcCodeBurDouane(getNumListRcCodeBurDouaneOB());
		if (getNumListRcCodeTypeManifOB() != null
				&& !getNumListRcCodeTypeManifOB().equals("")){
			burdouanetypemanvo.setRcCodeTypeManif(Integer.valueOf(
					getNumListRcCodeTypeManifOB()));
		}
		return burdouanetypemanvo;
	}

	/** * M�thode setBurdouanetypeman () ** */
	public void setBurdouanetypeman(BureauDouaneTypeManifeste burdouanetypemanvo) {

		setNumListRcCodeBurDouaneOB(burdouanetypemanvo.getRcCodeBurDouane());
		if (burdouanetypemanvo.getRcCodeTypeManif() != null){
			setNumListRcCodeTypeManifOB(sysEnv.IntegerToStr(burdouanetypemanvo.getRcCodeTypeManif()));
		}
	}

	/** * M�thodes reset ** */
	public void reset() {
		numListRcCodeBurDouaneOB= "";
		numListRcCodeTypeManifOB= "";
	}

	public void resetChampsRecherche() {
		 numListRcCodeBurDouaneRech= "";
		 numListRcCodeTypeManifRech= "";
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

	public String getNumListRcCodeBurDouaneOB() {
		return numListRcCodeBurDouaneOB;
	}

	public void setNumListRcCodeBurDouaneOB(String numListRcCodeBurDouaneOB) {
		this.numListRcCodeBurDouaneOB = numListRcCodeBurDouaneOB;
	}

	public String getNumListRcCodeTypeManifOB() {
		return numListRcCodeTypeManifOB;
	}

	public void setNumListRcCodeTypeManifOB(String numListRcCodeTypeManifOB) {
		this.numListRcCodeTypeManifOB = numListRcCodeTypeManifOB;
	}

	public String getNumListRcCodeBurDouaneRech() {
		return numListRcCodeBurDouaneRech;
	}

	public void setNumListRcCodeBurDouaneRech(String numListRcCodeBurDouaneRech) {
		this.numListRcCodeBurDouaneRech = numListRcCodeBurDouaneRech;
	}

	public String getNumListRcCodeTypeManifRech() {
		return numListRcCodeTypeManifRech;
	}

	public void setNumListRcCodeTypeManifRech(String numListRcCodeTypeManifRech) {
		this.numListRcCodeTypeManifRech = numListRcCodeTypeManifRech;
	}
	@JSON(serialize=false)
	public List getListTypeManifeste() {
		return listTypeManifeste;
	}

	public void setListTypeManifeste(List listTypeManifeste) {
		this.listTypeManifeste = listTypeManifeste;
	}

	public List getListeRcBurdouanetypeman() {
		return listeRcBurdouanetypeman;
	}

	public void setListeRcBurdouanetypeman(List listeRcBurdouanetypeman) {
		this.listeRcBurdouanetypeman = listeRcBurdouanetypeman;
	}

	public BureauDouaneTypeManifeste getBurdouanetypemanvo() {
		return burdouanetypemanvo;
	}

	public void setBurdouanetypemanvo(BureauDouaneTypeManifeste burdouanetypemanvo) {
		this.burdouanetypemanvo = burdouanetypemanvo;
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