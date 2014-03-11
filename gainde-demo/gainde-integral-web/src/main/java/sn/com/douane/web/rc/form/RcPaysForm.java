package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.utils.DateUtil;




public class RcPaysForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

	private String etat;

	/** * Attributs Table PAYS ** */
	//Champs de saisie
	private String numListRcCircuitVisiteOB;

	private String numListRcCodeDeviseOB;

	private String numListRcCodeLangueOB;

	private String numRcCodeMonnetaire;

	private String numRcCodePaysOB;

	private String numRcCodeProhibition;

	private String datRcDateFiscalite;

	private String datRcDateProhibition;

	private String numRcLibellePaysOB;

	private String numListRcNatureFiscaliteOB;

	private String numRcPaysAlphabetiqueOB;

	//Champs de recherche
	private String numListRcCircuitVisiteRech;

	private String numListRcCodeDeviseRech;

	private String numListRcCodeLangueRech;

	//private String TNUM_RCCODEMONNETAIRERech;
	private String numRcCodePaysRech;

	//private String TNUM_RCCODEPROHIBITIONRech;
	//private String DAT_RCDATEFISCALITERech;
	//private String DAT_RCDATEPROHIBITIONRech;
	private String numRcLibellePaysRech;

	private String numListRcNatureFiscaliteRech;

	List listeRcPays = new ArrayList();

	List listNatureFiscalite = new ArrayList();

	List listCircuitVisite = new ArrayList();

	Pays paysvo = new Pays();

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
	
	/** * M�thode getNewPAYSVO () ** */
	public Pays getNewRcPaysVO() {
		Pays paysvo = new Pays();

		paysvo.setRccircuitvisite(getNumListRcCircuitVisiteOB());
		paysvo.setRccodedevise(getNumListRcCodeDeviseOB());
		paysvo.setRccodelangue(getNumListRcCodeLangueOB());
		paysvo.setRccodemonnetaire(getNumRcCodeMonnetaire());
		paysvo.setRccodepays(getNumRcCodePaysOB());
		paysvo.setRccodeprohibition(getNumRcCodeProhibition());
		if (getDatRcDateFiscalite() != null
				&& !getDatRcDateFiscalite().equals(""))
			paysvo.setRcdatefiscalite(new Date(DateUtil.convertStringToDate(
					getDatRcDateFiscalite()).getTime()));
		if (getDatRcDateProhibition() != null
				&& !getDatRcDateProhibition().equals(""))
			paysvo.setRcdateprohibition(new Date(DateUtil.convertStringToDate(
					getDatRcDateProhibition()).getTime()));
		paysvo.setRclibellepays(getNumRcLibellePaysOB());
		paysvo.setRcnaturefiscalite(getNumListRcNatureFiscaliteOB());
		paysvo.setRcpaysalphabetique(getNumRcPaysAlphabetiqueOB());

		return paysvo;
	}

	/** * M�thode setPays () ** */
	public void setPays(Pays paysvo) {

		setNumListRcCircuitVisiteOB(paysvo.getRccircuitvisite());
		setNumListRcCodeDeviseOB(paysvo.getRccodedevise());
		setNumListRcCodeLangueOB(paysvo.getRccodelangue());
		setNumRcCodeMonnetaire(paysvo.getRccodemonnetaire());
		setNumRcCodePaysOB(paysvo.getRccodepays());
		setNumRcCodeProhibition(paysvo.getRccodeprohibition());
		if (paysvo.getRcdatefiscalite() != null)
			setDatRcDateFiscalite(DateUtil.getDate(new Date(paysvo
					.getRcdatefiscalite().getTime())));
		if (paysvo.getRcdateprohibition() != null)
			setDatRcDateProhibition(DateUtil.getDate(new Date(paysvo
					.getRcdateprohibition().getTime())));
		setNumRcLibellePaysOB(paysvo.getRclibellepays());
		setNumListRcNatureFiscaliteOB(paysvo.getRcnaturefiscalite());
		setNumRcPaysAlphabetiqueOB(paysvo.getRcpaysalphabetique());

	}

	/** * M�thodes reset ** */
	public void reset() {
		numListRcCircuitVisiteOB = "";
		numListRcCodeDeviseOB = "";
		numListRcCodeLangueOB = "";
		numRcCodeMonnetaire = "";
		numRcCodePaysOB = "";
		numRcCodeProhibition = "";
		datRcDateFiscalite = "";
		datRcDateProhibition = "";
		numRcLibellePaysOB = "";
		numListRcNatureFiscaliteOB = "";
		numRcPaysAlphabetiqueOB = "";
	}

	public void resetChampsRecherche() {
		numListRcCircuitVisiteRech = "";
		numListRcCodeDeviseRech = "";
		numListRcCodeLangueRech = "";
		//TNUM_RCCODEMONNETAIRERech="";
		numRcCodePaysRech = "";
		//TNUM_RCCODEPROHIBITIONRech="";
		//DAT_RCDATEFISCALITERech="";
		//DAT_RCDATEPROHIBITIONRech="";
		numRcLibellePaysRech = "";
		numListRcNatureFiscaliteRech = "";
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

	public String getNumListRcCircuitVisiteOB() {
		return numListRcCircuitVisiteOB;
	}

	public void setNumListRcCircuitVisiteOB(String numListRcCircuitVisiteOB) {
		this.numListRcCircuitVisiteOB = numListRcCircuitVisiteOB;
	}

	public String getNumListRcCodeDeviseOB() {
		return numListRcCodeDeviseOB;
	}

	public void setNumListRcCodeDeviseOB(String numListRcCodeDeviseOB) {
		this.numListRcCodeDeviseOB = numListRcCodeDeviseOB;
	}

	public String getNumListRcCodeLangueOB() {
		return numListRcCodeLangueOB;
	}

	public void setNumListRcCodeLangueOB(String numListRcCodeLangueOB) {
		this.numListRcCodeLangueOB = numListRcCodeLangueOB;
	}

	public String getNumRcCodeMonnetaire() {
		return numRcCodeMonnetaire;
	}

	public void setNumRcCodeMonnetaire(String numRcCodeMonnetaire) {
		this.numRcCodeMonnetaire = numRcCodeMonnetaire;
	}

	public String getNumRcCodePaysOB() {
		return numRcCodePaysOB;
	}

	public void setNumRcCodePaysOB(String numRcCodePaysOB) {
		this.numRcCodePaysOB = numRcCodePaysOB;
	}

	public String getNumRcCodeProhibition() {
		return numRcCodeProhibition;
	}

	public void setNumRcCodeProhibition(String numRcCodeProhibition) {
		this.numRcCodeProhibition = numRcCodeProhibition;
	}

	public String getDatRcDateFiscalite() {
		return datRcDateFiscalite;
	}

	public void setDatRcDateFiscalite(String datRcDateFiscalite) {
		this.datRcDateFiscalite = datRcDateFiscalite;
	}

	public String getDatRcDateProhibition() {
		return datRcDateProhibition;
	}

	public void setDatRcDateProhibition(String datRcDateProhibition) {
		this.datRcDateProhibition = datRcDateProhibition;
	}

	public String getNumRcLibellePaysOB() {
		return numRcLibellePaysOB;
	}

	public void setNumRcLibellePaysOB(String numRcLibellePaysOB) {
		this.numRcLibellePaysOB = numRcLibellePaysOB;
	}

	public String getNumListRcNatureFiscaliteOB() {
		return numListRcNatureFiscaliteOB;
	}

	public void setNumListRcNatureFiscaliteOB(String numListRcNatureFiscaliteOB) {
		this.numListRcNatureFiscaliteOB = numListRcNatureFiscaliteOB;
	}

	public String getNumRcPaysAlphabetiqueOB() {
		return numRcPaysAlphabetiqueOB;
	}

	public void setNumRcPaysAlphabetiqueOB(String numRcPaysAlphabetiqueOB) {
		this.numRcPaysAlphabetiqueOB = numRcPaysAlphabetiqueOB;
	}

	public String getNumListRcCircuitVisiteRech() {
		return numListRcCircuitVisiteRech;
	}

	public void setNumListRcCircuitVisiteRech(String numListRcCircuitVisiteRech) {
		this.numListRcCircuitVisiteRech = numListRcCircuitVisiteRech;
	}

	public String getNumListRcCodeDeviseRech() {
		return numListRcCodeDeviseRech;
	}

	public void setNumListRcCodeDeviseRech(String numListRcCodeDeviseRech) {
		this.numListRcCodeDeviseRech = numListRcCodeDeviseRech;
	}

	public String getNumListRcCodeLangueRech() {
		return numListRcCodeLangueRech;
	}

	public void setNumListRcCodeLangueRech(String numListRcCodeLangueRech) {
		this.numListRcCodeLangueRech = numListRcCodeLangueRech;
	}

	public String getNumRcCodePaysRech() {
		return numRcCodePaysRech;
	}

	public void setNumRcCodePaysRech(String numRcCodePaysRech) {
		this.numRcCodePaysRech = numRcCodePaysRech;
	}

	public String getNumRcLibellePaysRech() {
		return numRcLibellePaysRech;
	}

	public void setNumRcLibellePaysRech(String numRcLibellePaysRech) {
		this.numRcLibellePaysRech = numRcLibellePaysRech;
	}

	public String getNumListRcNatureFiscaliteRech() {
		return numListRcNatureFiscaliteRech;
	}

	public void setNumListRcNatureFiscaliteRech(String numListRcNatureFiscaliteRech) {
		this.numListRcNatureFiscaliteRech = numListRcNatureFiscaliteRech;
	}

	public List getListeRcPays() {
		return listeRcPays;
	}

	public void setListeRcPays(List listeRcPays) {
		this.listeRcPays = listeRcPays;
	}

	public List getListNatureFiscalite() {
		return listNatureFiscalite;
	}

	public void setListNatureFiscalite(List listNatureFiscalite) {
		this.listNatureFiscalite = listNatureFiscalite;
	}

	public List getListCircuitVisite() {
		return listCircuitVisite;
	}

	public void setListCircuitVisite(List listCircuitVisite) {
		this.listCircuitVisite = listCircuitVisite;
	}

	public Pays getPaysvo() {
		return paysvo;
	}

	public void setPaysvo(Pays paysvo) {
		this.paysvo = paysvo;
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