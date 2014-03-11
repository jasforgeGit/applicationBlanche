package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;
import sn.com.douane.utils.DateUtil;


/**
 * The Class RcProduitspjtForm.
 * 
 * @author kerfahi ghazi
 */
public class RcProduitspjtForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table PRODUITSPJT ***/
	//Champs de saisie
	private String numListRcCodePieceJointeOB;
	private String numRcCodeProduitOB;
	private String datRcDatePieceJointe;
	private String numRcImportExport;
	private String numRcPrecSenProdOB;
	private String numRcPrecUemoaProdOB;

	//Champs de recherche
	private String numListRcCodePieceJointeRech;
	private String numRcCodeProduitRech;
	private String datRcDatePieceJointeRech;
	private String numRcImportExportRech;
	private String numRcPrecSenProdRech;
	private String numRcPrecUemoaProdRech;

	List listeRcProduitspjt = new ArrayList();
	ProduitPjt produitspjtvo = new ProduitPjt();

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
	
	/*** M�thode getNewPRODUITSPJTVO () ***/
	public ProduitPjt getNewRcProduitspjtVO() {
		ProduitPjt produitspjtvo = new ProduitPjt();

		produitspjtvo.setRccodepiecejointe(getNumListRcCodePieceJointeOB());
		produitspjtvo.setRccodeproduit(getNumRcCodeProduitOB());
		if (getDatRcDatePieceJointe()!=null && !getDatRcDatePieceJointe().equals(""))
			produitspjtvo.setRcdatepiecejointe(new Date(DateUtil.convertStringToDate(getDatRcDatePieceJointe()).getTime()));
		produitspjtvo.setRcimportexport(getNumRcImportExport());
		produitspjtvo.setRcprecsenprod(getNumRcPrecSenProdOB());
		produitspjtvo.setRcprecuemoaprod(getNumRcPrecUemoaProdOB());

		return produitspjtvo;
	}

	/*** M�thode setProduitspjt () ***/
	public void setProduitspjt (ProduitPjt produitspjtvo) {

		setNumListRcCodePieceJointeOB (produitspjtvo.getRccodepiecejointe());
		setNumRcCodeProduitOB (produitspjtvo.getRccodeproduit());
		if (produitspjtvo.getRcdatepiecejointe()!=null)
			setDatRcDatePieceJointe (DateUtil.getDate(new Date(produitspjtvo.getRcdatepiecejointe().getTime())));
		setNumRcImportExport (produitspjtvo.getRcimportexport());
		setNumRcPrecSenProdOB (produitspjtvo.getRcprecsenprod());
		setNumRcPrecUemoaProdOB (produitspjtvo.getRcprecuemoaprod());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodePieceJointeOB="";
		numRcCodeProduitOB="";
		datRcDatePieceJointe="";
		numRcImportExport="";
		numRcPrecSenProdOB="";
		numRcPrecUemoaProdOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodePieceJointeRech="";
		numRcCodeProduitRech="";
		datRcDatePieceJointeRech="";
		numRcImportExportRech="";
		numRcPrecSenProdRech="";
		numRcPrecUemoaProdRech="";
	}

	public String getNumListRcCodePieceJointeOB() {
		return numListRcCodePieceJointeOB;
	}

	public void setNumListRcCodePieceJointeOB(String numListRcCodePieceJointeOB) {
		this.numListRcCodePieceJointeOB = numListRcCodePieceJointeOB;
	}

	public String getNumRcCodeProduitOB() {
		return numRcCodeProduitOB;
	}

	public void setNumRcCodeProduitOB(String numRcCodeProduitOB) {
		this.numRcCodeProduitOB = numRcCodeProduitOB;
	}

	public String getDatRcDatePieceJointe() {
		return datRcDatePieceJointe;
	}

	public void setDatRcDatePieceJointe(String datRcDatePieceJointe) {
		this.datRcDatePieceJointe = datRcDatePieceJointe;
	}

	public String getNumRcImportExport() {
		return numRcImportExport;
	}

	public void setNumRcImportExport(String numRcImportExport) {
		this.numRcImportExport = numRcImportExport;
	}

	public String getNumRcPrecSenProdOB() {
		return numRcPrecSenProdOB;
	}

	public void setNumRcPrecSenProdOB(String numRcPrecSenProdOB) {
		this.numRcPrecSenProdOB = numRcPrecSenProdOB;
	}

	public String getNumRcPrecUemoaProdOB() {
		return numRcPrecUemoaProdOB;
	}

	public void setNumRcPrecUemoaProdOB(String numRcPrecUemoaProdOB) {
		this.numRcPrecUemoaProdOB = numRcPrecUemoaProdOB;
	}

	public String getNumListRcCodePieceJointeRech() {
		return numListRcCodePieceJointeRech;
	}

	public void setNumListRcCodePieceJointeRech(String numListRcCodePieceJointeRech) {
		this.numListRcCodePieceJointeRech = numListRcCodePieceJointeRech;
	}

	public String getNumRcCodeProduitRech() {
		return numRcCodeProduitRech;
	}

	public void setNumRcCodeProduitRech(String numRcCodeProduitRech) {
		this.numRcCodeProduitRech = numRcCodeProduitRech;
	}

	public String getDatRcDatePieceJointeRech() {
		return datRcDatePieceJointeRech;
	}

	public void setDatRcDatePieceJointeRech(String datRcDatePieceJointeRech) {
		this.datRcDatePieceJointeRech = datRcDatePieceJointeRech;
	}

	public String getNumRcImportExportRech() {
		return numRcImportExportRech;
	}

	public void setNumRcImportExportRech(String numRcImportExportRech) {
		this.numRcImportExportRech = numRcImportExportRech;
	}

	public String getNumRcPrecSenProdRech() {
		return numRcPrecSenProdRech;
	}

	public void setNumRcPrecSenProdRech(String numRcPrecSenProdRech) {
		this.numRcPrecSenProdRech = numRcPrecSenProdRech;
	}

	public String getNumRcPrecUemoaProdRech() {
		return numRcPrecUemoaProdRech;
	}

	public void setNumRcPrecUemoaProdRech(String numRcPrecUemoaProdRech) {
		this.numRcPrecUemoaProdRech = numRcPrecUemoaProdRech;
	}

	public List getListeRcProduitspjt() {
		return listeRcProduitspjt;
	}

	public void setListeRcProduitspjt(List listeRcProduitspjt) {
		this.listeRcProduitspjt = listeRcProduitspjt;
	}

	public ProduitPjt getProduitspjtvo() {
		return produitspjtvo;
	}

	public void setProduitspjtvo(ProduitPjt produitspjtvo) {
		this.produitspjtvo = produitspjtvo;
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