package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegDouModeDecl;


public class RcRegdoumodedeclForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table REGDOUMODEDECL ***/
	//Champs de saisie
	private String numListRcCodeModeDeclarationOB;
	private String numListRcCodeRegimeDouanierOB;
	private String numListRcTypeRegimeOB;

	//Champs de recherche
	private String numListRcCodeModeDeclarationRech;
	private String numListRcCodeRegimeDouanierRech;
	private String numListRcTypeRegimeRech;

	List listeRcRegdoumodedecl = new ArrayList();
	RegDouModeDecl regdoumodedeclvo = new RegDouModeDecl();

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
	
	/*** M�thode getNewREGDOUMODEDECLVO () ***/
	public RegDouModeDecl getNewRcRegdoumodedeclVO() {
		RegDouModeDecl regdoumodedeclvo = new RegDouModeDecl();

		regdoumodedeclvo.setRcCodeModeDeclaration(getNumListRcCodeModeDeclarationOB());
		regdoumodedeclvo.setRcCodeRegimeDouanier(getNumListRcCodeRegimeDouanierOB());
		regdoumodedeclvo.setRcTypeRegime(getNumListRcTypeRegimeOB());

		return regdoumodedeclvo;
	}

	/*** M�thode setRegdoumodedecl () ***/
	public void setRegdoumodedecl (RegDouModeDecl regdoumodedeclvo) {

		setNumListRcCodeModeDeclarationOB (regdoumodedeclvo.getRcCodeModeDeclaration());
		setNumListRcCodeRegimeDouanierOB (regdoumodedeclvo.getRcCodeRegimeDouanier());
		setNumListRcTypeRegimeOB (regdoumodedeclvo.getRcTypeRegime());

	}

	/*** M�thodes reset ***/
	public void reset() {
		numListRcCodeModeDeclarationOB="";
		numListRcCodeRegimeDouanierOB="";
		numListRcTypeRegimeOB="";
	}
	public void resetChampsRecherche() {
		numListRcCodeModeDeclarationRech="";
		numListRcCodeRegimeDouanierRech="";
		numListRcTypeRegimeRech="";
	}

	public String getNumListRcCodeModeDeclarationOB() {
		return numListRcCodeModeDeclarationOB;
	}

	public void setNumListRcCodeModeDeclarationOB(String numListRcCodeModeDeclarationOB) {
		this.numListRcCodeModeDeclarationOB = numListRcCodeModeDeclarationOB;
	}

	public String getNumListRcCodeRegimeDouanierOB() {
		return numListRcCodeRegimeDouanierOB;
	}

	public void setNumListRcCodeRegimeDouanierOB(String numListRcCodeRegimeDouanierOB) {
		this.numListRcCodeRegimeDouanierOB = numListRcCodeRegimeDouanierOB;
	}

	public String getNumListRcTypeRegimeOB() {
		return numListRcTypeRegimeOB;
	}

	public void setNumListRcTypeRegimeOB(String numListRcTypeRegimeOB) {
		this.numListRcTypeRegimeOB = numListRcTypeRegimeOB;
	}

	public String getNumListRcCodeModeDeclarationRech() {
		return numListRcCodeModeDeclarationRech;
	}

	public void setNumListRcCodeModeDeclarationRech(String numListRcCodeModeDeclarationRech) {
		this.numListRcCodeModeDeclarationRech = numListRcCodeModeDeclarationRech;
	}

	public String getNumListRcCodeRegimeDouanierRech() {
		return numListRcCodeRegimeDouanierRech;
	}

	public void setNumListRcCodeRegimeDouanierRech(String numListRcCodeRegimeDouanierRech) {
		this.numListRcCodeRegimeDouanierRech = numListRcCodeRegimeDouanierRech;
	}

	public String getNumListRcTypeRegimeRech() {
		return numListRcTypeRegimeRech;
	}

	public void setNumListRcTypeRegimeRech(String numListRcTypeRegimeRech) {
		this.numListRcTypeRegimeRech = numListRcTypeRegimeRech;
	}

	public List getListeRcRegdoumodedecl() {
		return listeRcRegdoumodedecl;
	}

	public void setListeRcRegdoumodedecl(List listeRcRegdoumodedecl) {
		this.listeRcRegdoumodedecl = listeRcRegdoumodedecl;
	}

	public RegDouModeDecl getRegdoumodedeclvo() {
		return regdoumodedeclvo;
	}

	public void setRegdoumodedeclvo(RegDouModeDecl regdoumodedeclvo) {
		this.regdoumodedeclvo = regdoumodedeclvo;
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