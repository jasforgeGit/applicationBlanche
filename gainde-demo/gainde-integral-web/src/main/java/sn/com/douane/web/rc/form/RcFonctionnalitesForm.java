package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;

public class RcFonctionnalitesForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table FONCTIONNALITES ***/
	//Champs de saisie
	private String numRcCodeFonctionOB;
	private String numListRcCodeProfil;
	private String numRcDescription;
	private String numRcLibFonctionOB;
	private String numRcOrdreAffichageOB;
	private String numRcUrlFonction;

	//Champs de recherche
	private String numRcCodeFonctionRech;
	private String numListRcCodeProfilRech;
	private String numRcDescriptionRech;
	private String numRcLibFonctionRech;
	private String numRcOrdreAffichageRech;
	private String numRcUrlFonctionRech;

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
	
	private List listeRcFonctionnalites = new ArrayList();
	private Fonctionnalite fonctionnalitesvo = new Fonctionnalite();

	/*** M�thode getNewFONCTIONNALITESVO () ***/
	public Fonctionnalite getNewRcFonctionnalitesVO() {
		Fonctionnalite fonctionnalitesvo = new Fonctionnalite();

		fonctionnalitesvo.setRcCodeFonction(getNumRcCodeFonctionOB());
		fonctionnalitesvo.setRcCodeProfil(getNumListRcCodeProfil());
		fonctionnalitesvo.setRcdescription(getNumRcDescription());
		fonctionnalitesvo.setRcLibFonction(getNumRcLibFonctionOB());
		fonctionnalitesvo.setRcurlfonction(getNumRcUrlFonction());
		return fonctionnalitesvo;
	}

	/*** M�thode setFonctionnalites () ***/
	public void setFonctionnalites (Fonctionnalite fonctionnalitesvo) {

		setNumRcCodeFonctionOB (fonctionnalitesvo.getRcCodeFonction());
		setNumListRcCodeProfil (fonctionnalitesvo.getRcCodeProfil());
		setNumRcDescription (fonctionnalitesvo.getRcDescription());
		setNumRcLibFonctionOB (fonctionnalitesvo.getRcLibFonction());
		setNumRcUrlFonction (fonctionnalitesvo.getRcUrlFonction());

	}

	/*** M�thodes reset ***/
	public void reset() {
		this.setNumRcCodeFonctionOB("");
		this.setNumListRcCodeProfil("");
		this.setNumRcDescription("");
		this.setNumRcLibFonctionOB("");
		this.setNumRcOrdreAffichageOB("");
		this.setNumRcUrlFonction("");
	}
	public void resetChampsRecherche() {
		 this.setNumRcCodeFonctionRech("");
		 this.setNumListRcCodeProfilRech("");
		 this.setNumRcDescriptionRech("");
		 this.setNumRcLibFonctionRech("");
		 this.setNumRcOrdreAffichageRech("");
		 this.setNumRcUrlFonctionRech("");
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

	public String getNumRcCodeFonctionOB() {
		return numRcCodeFonctionOB;
	}

	public void setNumRcCodeFonctionOB(String numRcCodeFonctionOB) {
		this.numRcCodeFonctionOB = numRcCodeFonctionOB;
	}

	public String getNumListRcCodeProfil() {
		return numListRcCodeProfil;
	}

	public void setNumListRcCodeProfil(String numListRcCodeProfil) {
		this.numListRcCodeProfil = numListRcCodeProfil;
	}

	public String getNumRcDescription() {
		return numRcDescription;
	}

	public void setNumRcDescription(String numRcDescription) {
		this.numRcDescription = numRcDescription;
	}

	public String getNumRcLibFonctionOB() {
		return numRcLibFonctionOB;
	}

	public void setNumRcLibFonctionOB(String numRcLibFonctionOB) {
		this.numRcLibFonctionOB = numRcLibFonctionOB;
	}

	public String getNumRcOrdreAffichageOB() {
		return numRcOrdreAffichageOB;
	}

	public void setNumRcOrdreAffichageOB(String numRcOrdreAffichageOB) {
		this.numRcOrdreAffichageOB = numRcOrdreAffichageOB;
	}

	public String getNumRcUrlFonction() {
		return numRcUrlFonction;
	}

	public void setNumRcUrlFonction(String numRcUrlFonction) {
		this.numRcUrlFonction = numRcUrlFonction;
	}

	public String getNumRcCodeFonctionRech() {
		return numRcCodeFonctionRech;
	}

	public void setNumRcCodeFonctionRech(String numRcCodeFonctionRech) {
		this.numRcCodeFonctionRech = numRcCodeFonctionRech;
	}

	public String getNumListRcCodeProfilRech() {
		return numListRcCodeProfilRech;
	}

	public void setNumListRcCodeProfilRech(String numListRcCodeProfilRech) {
		this.numListRcCodeProfilRech = numListRcCodeProfilRech;
	}

	public String getNumRcDescriptionRech() {
		return numRcDescriptionRech;
	}

	public void setNumRcDescriptionRech(String numRcDescriptionRech) {
		this.numRcDescriptionRech = numRcDescriptionRech;
	}

	public String getNumRcLibFonctionRech() {
		return numRcLibFonctionRech;
	}

	public void setNumRcLibFonctionRech(String numRcLibFonctionRech) {
		this.numRcLibFonctionRech = numRcLibFonctionRech;
	}

	public String getNumRcOrdreAffichageRech() {
		return numRcOrdreAffichageRech;
	}

	public void setNumRcOrdreAffichageRech(String numRcOrdreAffichageRech) {
		this.numRcOrdreAffichageRech = numRcOrdreAffichageRech;
	}

	public String getNumRcUrlFonctionRech() {
		return numRcUrlFonctionRech;
	}

	public void setNumRcUrlFonctionRech(String numRcUrlFonctionRech) {
		this.numRcUrlFonctionRech = numRcUrlFonctionRech;
	}

	public List getListeRcFonctionnalites() {
		return listeRcFonctionnalites;
	}

	public void setListeRcFonctionnalites(List listeRcFonctionnalites) {
		this.listeRcFonctionnalites = listeRcFonctionnalites;
	}

	public Fonctionnalite getFonctionnalitesvo() {
		return fonctionnalitesvo;
	}

	public void setFonctionnalitesvo(Fonctionnalite fonctionnalitesvo) {
		this.fonctionnalitesvo = fonctionnalitesvo;
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