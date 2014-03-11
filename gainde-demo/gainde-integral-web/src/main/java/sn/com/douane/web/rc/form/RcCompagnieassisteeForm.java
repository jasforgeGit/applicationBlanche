package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.dto.CompagnieassisteeDto;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.utils.ConvertUtil;


public class RcCompagnieassisteeForm implements Serializable {

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
	
	/*** Attributs Table COMPAGNIEASSISTEE ***/
	//Champs de saisie
	private String numCodeCieAssisteeOB;
	private String numNomCieAssisteeOB;

	//Champs de recherche
	private String numCodeCieAssisteeRech;
	private String numNomCieAssisteeRech;

	private List listeRcCompagnieAssistee = new ArrayList();
	private CompagnieassisteeDto compagnieassisteevo = new CompagnieassisteeDto();

	/*** M�thode getNewCOMPAGNIEASSISTEEVO () ***/
	public CompagnieassisteeDto getNewRcCompagnieassisteeVO() {
		CompagnieassisteeDto compagnieassisteevo = new CompagnieassisteeDto();

		if (getNumCodeCieAssisteeOB()!=null && !getNumCodeCieAssisteeOB().equals("")){
			compagnieassisteevo.setCodeCieAssistee(Integer.valueOf(getNumCodeCieAssisteeOB()));
		}
		compagnieassisteevo.setNomCieAssistee(getNumNomCieAssisteeOB());

		return compagnieassisteevo;
	}

	/*** M�thode setCompagnieassistee () ***/
	public void setCompagnieassistee (CompagnieAssistee compagnieassisteevo) {

		if (compagnieassisteevo.getCodeCieAssistee()!=null){
			setNumCodeCieAssisteeOB (ConvertUtil.converToString(compagnieassisteevo.getCodeCieAssistee()));
		}
		    setNumNomCieAssisteeOB (compagnieassisteevo.getNomCieAssistee());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numCodeCieAssisteeOB="";
		numNomCieAssisteeOB="";
	}
	public void resetChampsRecherche() {
		numCodeCieAssisteeRech="";
		numNomCieAssisteeRech="";
	}

	public String getNumCodeCieAssisteeOB() {
		return numCodeCieAssisteeOB;
	}

	public void setNumCodeCieAssisteeOB(String numCodeCieAssisteeOB) {
		this.numCodeCieAssisteeOB = numCodeCieAssisteeOB;
	}

	public String getNumNomCieAssisteeOB() {
		return numNomCieAssisteeOB;
	}

	public void setNumNomCieAssisteeOB(String numNomCieAssisteeOB) {
		this.numNomCieAssisteeOB = numNomCieAssisteeOB;
	}

	public String getNumCodeCieAssisteeRech() {
		return numCodeCieAssisteeRech;
	}

	public void setNumCodeCieAssisteeRech(String numCodeCieAssisteeRech) {
		this.numCodeCieAssisteeRech = numCodeCieAssisteeRech;
	}

	public String getNumNomCieAssisteeRech() {
		return numNomCieAssisteeRech;
	}

	public void setNumNomCieAssisteeRech(String numNomCieAssisteeRech) {
		this.numNomCieAssisteeRech = numNomCieAssisteeRech;
	}

	public List getListeRcCompagnieAssistee() {
		return listeRcCompagnieAssistee;
	}

	public void setListeRcCompagnieassistee(List listeRcCompagnieassistee) {
		this.listeRcCompagnieAssistee = listeRcCompagnieassistee;
	}

	public CompagnieassisteeDto getCompagnieassisteeVO () {
		return compagnieassisteevo;
	}

	public void setCompagnieassisteeVO (CompagnieassisteeDto compagnieassisteevo) {
		this.compagnieassisteevo = compagnieassisteevo;
	}

	public String getPk () {
		return pk;
	}

	public void setPk (String pk) {
		this.pk = pk;
	}

	public String getEtat () {
		return etat;
	}

	public void setEtat (String etat) {
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