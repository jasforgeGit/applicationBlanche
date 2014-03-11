package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Taxe;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.sysEnv;

public class RcTaxesForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table TAXES ***/
	//Champs de saisie
	private String numRcBaseTaxe1;
	private String numRcCodeImpBudget;
	private String numRcCodeImpTresor;
	private String numRcCodeTaxeOB;
	private String numRcFormuleTaxeOB;
	private String numRcIndComptantOB;
	private String numRcLibelleTaxeOB;
	private String numRcMinPerceptionTaxe;
	private String numRcNatureTaxe;
	private String numRcOrdreEvalTaxeOB;
	private String numRcUniteLiquidation;

	//Champs de recherche
	private String numRcCodeTaxeRech;
	private String numRcLibelleTaxeRech;
	private String numRcNatureTaxeRech;

	List listeRcTaxes = new ArrayList();
	Taxe taxesvo = new Taxe();

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
	
	/*** M�thode getNewTAXESVO () ***/
	public Taxe getNewRcTaxesVO() {
		Taxe taxesvo = new Taxe();

		taxesvo.setRcBaseTaxe1(getNumRcBaseTaxe1());
		taxesvo.setRcCodeImpBudget(getNumRcCodeImpBudget());
		taxesvo.setRcCodeImpTresor(getNumRcCodeImpTresor());
		taxesvo.setRcCodeTaxe(getNumRcCodeTaxeOB());
		taxesvo.setRcFormuleTaxe(getNumRcFormuleTaxeOB());
		taxesvo.setRcIndComptant(getNumRcIndComptantOB());
		taxesvo.setRcLibelleTaxe(getNumRcLibelleTaxeOB());
		if (getNumRcMinPerceptionTaxe()!=null && !getNumRcMinPerceptionTaxe().equals(""))
			taxesvo.setRcMinPerceptionTaxe(sysEnv.strToBigDecimal(getNumRcMinPerceptionTaxe()));
		taxesvo.setRcNatureTaxe(getNumRcNatureTaxe());
		if (getNumRcOrdreEvalTaxeOB()!=null && !getNumRcOrdreEvalTaxeOB().equals(""))
			taxesvo.setRcOrdreEvalTaxe(new Integer(getNumRcOrdreEvalTaxeOB()));
		taxesvo.setRcUniteLiquidation(getNumRcUniteLiquidation());

		return taxesvo;
	}

	/*** M�thode setTaxes () ***/
	public void setTaxes (Taxe taxesvo) {

		setNumRcBaseTaxe1 (taxesvo.getRcBaseTaxe1());
		setNumRcCodeImpBudget (taxesvo.getRcCodeImpBudget());
		setNumRcCodeImpTresor (taxesvo.getRcCodeImpTresor());
		setNumRcCodeTaxeOB (taxesvo.getRcCodeTaxe());
		setNumRcFormuleTaxeOB (taxesvo.getRcFormuleTaxe());
		setNumRcIndComptantOB (taxesvo.getRcIndComptant());
		setNumRcLibelleTaxeOB (taxesvo.getRcLibelleTaxe());
		if (taxesvo.getRcMinPerceptionTaxe()!=null)
			setNumRcMinPerceptionTaxe (ConvertUtil.converToString(taxesvo.getRcMinPerceptionTaxe()));
		setNumRcNatureTaxe (taxesvo.getRcNatureTaxe());
		if (taxesvo.getRcOrdreEvalTaxe()!=null)
			setNumRcOrdreEvalTaxeOB (ConvertUtil.converToString(taxesvo.getRcOrdreEvalTaxe()));
		setNumRcUniteLiquidation (taxesvo.getRcUniteLiquidation());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numRcBaseTaxe1="";
		numRcCodeImpBudget="";
		numRcCodeImpTresor="";
		numRcCodeTaxeOB="";
		numRcFormuleTaxeOB="";
		numRcIndComptantOB="";
		numRcLibelleTaxeOB="";
		numRcMinPerceptionTaxe="";
		numRcNatureTaxe="";
		numRcOrdreEvalTaxeOB="";
		numRcUniteLiquidation="";
	}
	public void resetChampsRecherche() {
		numRcCodeTaxeRech="";
		numRcLibelleTaxeRech="";
		numRcNatureTaxeRech="";
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

	
	public String getNumRcBaseTaxe1() {
		return numRcBaseTaxe1;
	}

	
	public void setNumRcBaseTaxe1(String numRcBaseTaxe1) {
		this.numRcBaseTaxe1 = numRcBaseTaxe1;
	}

	
	public String getNumRcCodeImpBudget() {
		return numRcCodeImpBudget;
	}

	
	public void setNumRcCodeImpBudget(String numRcCodeImpBudget) {
		this.numRcCodeImpBudget = numRcCodeImpBudget;
	}

	
	public String getNumRcCodeImpTresor() {
		return numRcCodeImpTresor;
	}

	
	public void setNumRcCodeImpTresor(String numRcCodeImpTresor) {
		this.numRcCodeImpTresor = numRcCodeImpTresor;
	}

	
	public String getNumRcCodeTaxeOB() {
		return numRcCodeTaxeOB;
	}

	
	public void setNumRcCodeTaxeOB(String numRcCodeTaxeOB) {
		this.numRcCodeTaxeOB = numRcCodeTaxeOB;
	}

	
	public String getNumRcFormuleTaxeOB() {
		return numRcFormuleTaxeOB;
	}

	
	public void setNumRcFormuleTaxeOB(String numRcFormuleTaxeOB) {
		this.numRcFormuleTaxeOB = numRcFormuleTaxeOB;
	}

	
	public String getNumRcIndComptantOB() {
		return numRcIndComptantOB;
	}

	
	public void setNumRcIndComptantOB(String numRcIndComptantOB) {
		this.numRcIndComptantOB = numRcIndComptantOB;
	}

	
	public String getNumRcLibelleTaxeOB() {
		return numRcLibelleTaxeOB;
	}

	
	public void setNumRcLibelleTaxeOB(String numRcLibelleTaxeOB) {
		this.numRcLibelleTaxeOB = numRcLibelleTaxeOB;
	}

	
	public String getNumRcMinPerceptionTaxe() {
		return numRcMinPerceptionTaxe;
	}

	
	public void setNumRcMinPerceptionTaxe(String numRcMinPerceptionTaxe) {
		this.numRcMinPerceptionTaxe = numRcMinPerceptionTaxe;
	}

	
	public String getNumRcNatureTaxe() {
		return numRcNatureTaxe;
	}

	
	public void setNumRcNatureTaxe(String numRcNatureTaxe) {
		this.numRcNatureTaxe = numRcNatureTaxe;
	}

	
	public String getNumRcOrdreEvalTaxeOB() {
		return numRcOrdreEvalTaxeOB;
	}

	
	public void setNumRcOrdreEvalTaxeOB(String numRcOrdreEvalTaxeOB) {
		this.numRcOrdreEvalTaxeOB = numRcOrdreEvalTaxeOB;
	}

	
	public String getNumRcUniteLiquidation() {
		return numRcUniteLiquidation;
	}

	
	public void setNumRcUniteLiquidation(String numRcUniteLiquidation) {
		this.numRcUniteLiquidation = numRcUniteLiquidation;
	}

	
	public String getNumRcCodeTaxeRech() {
		return numRcCodeTaxeRech;
	}

	
	public void setNumRcCodeTaxeRech(String numRcCodeTaxeRech) {
		this.numRcCodeTaxeRech = numRcCodeTaxeRech;
	}

	
	public String getNumRcLibelleTaxeRech() {
		return numRcLibelleTaxeRech;
	}

	
	public void setNumRcLibelleTaxeRech(String numRcLibelleTaxeRech) {
		this.numRcLibelleTaxeRech = numRcLibelleTaxeRech;
	}

	
	public String getNumRcNatureTaxeRech() {
		return numRcNatureTaxeRech;
	}

	
	public void setNumRcNatureTaxeRech(String numRcNatureTaxeRech) {
		this.numRcNatureTaxeRech = numRcNatureTaxeRech;
	}

	
	public List getListeRcTaxes() {
		return listeRcTaxes;
	}

	
	public void setListeRcTaxes(List listeRcTaxes) {
		this.listeRcTaxes = listeRcTaxes;
	}

	
	public Taxe getTaxesvo() {
		return taxesvo;
	}

	
	public void setTaxesvo(Taxe taxesvo) {
		this.taxesvo = taxesvo;
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