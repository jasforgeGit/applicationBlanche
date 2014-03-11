package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.SoumissionDoc;


public class RcSoumissiondocForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table SOUMISSIONDOC ***/
	//Champs de saisie
	private String numListRcCodePieceJointeOB;
	private String numRcCodeSoumDocOB;
	private String numRcLibelleSoumDocOB;

	//Champs de recherche
	private String numListRcCodePieceJointeRech;
	private String numRcCodeSoumDocRech;
	private String numRcLibelleSoumDocRech;

	List listeRcSoumissiondoc = new ArrayList();
	SoumissionDoc soumissiondocvo = new SoumissionDoc();

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
	
	/*** M�thode getNewSOUMISSIONDOCVO () ***/
	public SoumissionDoc getNewRcSoumissiondocVO() {
		SoumissionDoc soumissiondocvo = new SoumissionDoc();

		soumissiondocvo.setRccodepiecejointe(getNumListRcCodePieceJointeOB());
		soumissiondocvo.setRccodesoumdoc(getNumRcCodeSoumDocOB());
		soumissiondocvo.setRclibellesoumdoc(getNumRcLibelleSoumDocOB());

		return soumissiondocvo;
	}

	/*** M�thode setSoumissiondoc () ***/
	public void setSoumissiondoc (SoumissionDoc soumissiondocvo) {

		setNumListRcCodePieceJointeOB (soumissiondocvo.getRccodepiecejointe());
		setNumRcCodeSoumDocOB (soumissiondocvo.getRccodesoumdoc());
		setNumRcLibelleSoumDocOB (soumissiondocvo.getRclibellesoumdoc());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodePieceJointeOB="";
		numRcCodeSoumDocOB="";
		numRcLibelleSoumDocOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodePieceJointeRech="";
		numRcCodeSoumDocRech="";
		numRcLibelleSoumDocRech="";
	}

	public String getNumListRcCodePieceJointeOB() {
		return numListRcCodePieceJointeOB;
	}

	public void setNumListRcCodePieceJointeOB(String numListRcCodePieceJointeOB) {
		this.numListRcCodePieceJointeOB = numListRcCodePieceJointeOB;
	}

	public String getNumRcCodeSoumDocOB() {
		return numRcCodeSoumDocOB;
	}

	public void setNumRcCodeSoumDocOB(String numRcCodeSoumDocOB) {
		this.numRcCodeSoumDocOB = numRcCodeSoumDocOB;
	}

	public String getNumRcLibelleSoumDocOB() {
		return numRcLibelleSoumDocOB;
	}

	public void setNumRcLibelleSoumDocOB(String numRcLibelleSoumDocOB) {
		this.numRcLibelleSoumDocOB = numRcLibelleSoumDocOB;
	}

	public String getNumListRcCodePieceJointeRech() {
		return numListRcCodePieceJointeRech;
	}

	public void setNumListRcCodePieceJointeRech(String numListRcCodePieceJointeRech) {
		this.numListRcCodePieceJointeRech = numListRcCodePieceJointeRech;
	}

	public String getNumRcCodeSoumDocRech() {
		return numRcCodeSoumDocRech;
	}

	public void setNumRcCodeSoumDocRech(String numRcCodeSoumDocRech) {
		this.numRcCodeSoumDocRech = numRcCodeSoumDocRech;
	}

	public String getNumRcLibelleSoumDocRech() {
		return numRcLibelleSoumDocRech;
	}

	public void setNumRcLibelleSoumDocRech(String numRcLibelleSoumDocRech) {
		this.numRcLibelleSoumDocRech = numRcLibelleSoumDocRech;
	}

	public SoumissionDoc getSoumissiondocvo() {
		return soumissiondocvo;
	}

	public void setSoumissiondocvo(SoumissionDoc soumissiondocvo) {
		this.soumissiondocvo = soumissiondocvo;
	}

	public List getListeRcSoumissiondoc() {
		return listeRcSoumissiondoc;
	}

	public void setListeRcSoumissiondoc(List listeRcSoumissiondoc) {
		this.listeRcSoumissiondoc = listeRcSoumissiondoc;
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