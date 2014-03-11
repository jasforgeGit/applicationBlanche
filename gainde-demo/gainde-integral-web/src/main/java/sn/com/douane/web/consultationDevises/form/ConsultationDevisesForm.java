/*
 * Cr�� le 2 juin 2006
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package sn.com.douane.web.consultationDevises.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.DateUtil;


public class ConsultationDevisesForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String etat;
	private String pk;
	private String pkSelected;
	
	//Attributs de recherche devise
	private String numRcCodeDeviseRech;
	private String numRcLibelleDeviseRech;
	
	//Attributs de consultation
	private String rccodedevise;
	private String rclibelledevise;
	private String rcdatedevise;
	private String rcqtedevise;
	private String rcqtecfa;
	private String rcprecisiondev;
	private String rccoefficient;
	
	/**
	 * variables du Grid 
	 */
	private Integer rows = 0;
	private Integer page = 0;
	private String  sord;
	private String  sidx;
	private Integer total = 0;
	private Integer records = 0;
	private String index;
	
	List listeDevises = new ArrayList();	
	
	public void setDevises (Devises devisesVO) {

		setRccodedevise(devisesVO.getRccodedevise());
		setRclibelledevise(devisesVO.getRclibelledevise());
		
		if (devisesVO.getRcdatedevise()!=null && !devisesVO.getRcdatedevise().toString().equals(""))
			setRcdatedevise(DateUtil.getDate(new Date(devisesVO.getRcdatedevise().getTime())));
		
		if (devisesVO.getRcqtedevise()!=null)
			setRcqtedevise(ConvertUtil.converToString(devisesVO.getRcqtedevise()));

		if (devisesVO.getRcqtecfa()!=null)
			setRcqtecfa(ConvertUtil.converToString(devisesVO.getRcqtecfa()));

		if (devisesVO.getRccoefficient()!=null)
			setRccoefficient(ConvertUtil.converToString(devisesVO.getRccoefficient()));

		if (devisesVO.getRcprecisiondev()!=null)
			setRcprecisiondev(ConvertUtil.converToString(devisesVO.getRcprecisiondev()));
	}


	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getRccodedevise() {
		return rccodedevise;
	}

	public void setRccodedevise(String rccodedevise) {
		this.rccodedevise = rccodedevise;
	}

	public String getRccoefficient() {
		return rccoefficient;
	}

	public void setRccoefficient(String rccoefficient) {
		this.rccoefficient = rccoefficient;
	}

	public String getRcdatedevise() {
		return rcdatedevise;
	}

	public void setRcdatedevise(String rcdatedevise) {
		this.rcdatedevise = rcdatedevise;
	}

	public String getRclibelledevise() {
		return rclibelledevise;
	}

	public void setRclibelledevise(String rclibelledevise) {
		this.rclibelledevise = rclibelledevise;
	}

	public String getRcprecisiondev() {
		return rcprecisiondev;
	}

	public void setRcprecisiondev(String rcprecisiondev) {
		this.rcprecisiondev = rcprecisiondev;
	}

	public String getRcqtecfa() {
		return rcqtecfa;
	}

	public void setRcqtecfa(String rcqtecfa) {
		this.rcqtecfa = rcqtecfa;
	}

	public String getRcqtedevise() {
		return rcqtedevise;
	}

	public void setRcqtedevise(String rcqtedevise) {
		this.rcqtedevise = rcqtedevise;
	}

	public String getPkSelected() {
		return pkSelected;
	}

	public void setPkSelected(String pkSelected) {
		this.pkSelected = pkSelected;
	}

	public String getNumRcCodeDeviseRech() {
		return numRcCodeDeviseRech;
	}

	public void setNumRcCodeDeviseRech(String numRcCodeDeviseRech) {
		this.numRcCodeDeviseRech = numRcCodeDeviseRech;
	}

	public String getNumRcLibelleDeviseRech() {
		return numRcLibelleDeviseRech;
	}

	public void setNumRcLibelleDeviseRech(String numRcLibelleDeviseRech) {
		this.numRcLibelleDeviseRech = numRcLibelleDeviseRech;
	}

	public List getListeDevises() {
		return listeDevises;
	}

	public void setListeDevises(List listeDevises) {
		this.listeDevises = listeDevises;
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
			this.total = (int) Math.ceil((double) this.records / (double) this.rows);
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
