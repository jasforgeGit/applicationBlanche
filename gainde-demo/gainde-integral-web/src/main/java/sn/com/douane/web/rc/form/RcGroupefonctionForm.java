package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.utils.ConstRC;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.sysEnv;



public class RcGroupefonctionForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

	private String etat;

	/** Partie SWAP ** */
	private String[] ids1;

	private String[] ids2;

	private String rcCodeFonction;

	private List list1 = new ArrayList();

	private List list2 = new ArrayList();

	/** * Attributs Table FONCTIONNALITES ** */
	//Champs de saisie
	private String numRcCodeGroupeOB;

	private String numRcLibGroupeOB;

	private String numListRcModule;

	private String numListRcCodeGrpPere;

	private String numRcOrdreAffichageOB;

	private String numRcLibGrpPere;

	//Champs de recherche
	private String numRcCodeGroupeRech;

	private String numRcLibGroupeRech;
	
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

	private List listeRcGroupefonction = new ArrayList();

	private List listModule = new ArrayList();

	private GroupeFonction groupefonctionvo = new GroupeFonction();

	private Fonctionnalite fonctionnalitesVO = new Fonctionnalite();

	/** * M�thode getNewGroupefonctionVO () ** */
	public GroupeFonction getNewRcGroupefonctionVO() {
		GroupeFonction groupefonctionvo = new GroupeFonction();

		groupefonctionvo.setRcCodeGroupe(sysEnv.strToInteger(getNumRcCodeGroupeOB()));
		int val = sysEnv.strToInteger(getNumListRcCodeGrpPere()).intValue();
		if (val !=0)
			{
		groupefonctionvo.setRcCodeGrpPere(sysEnv
				.strToInteger(getNumListRcCodeGrpPere()));
			}
		groupefonctionvo.setRcLibGroupe(getNumRcLibGroupeOB());
		groupefonctionvo.setRcOrdreAffichage(sysEnv
				.strToInteger(getNumRcOrdreAffichageOB()));
		return groupefonctionvo;
	}

	/** * M�thode getNewRcRegroupFonctionVO () ** */
	public RegroupFonctions getNewRcRegroupFonctionVO(Integer codegroupe,
			String codefonction, Integer ordreaff) {
		RegroupFonctions regroupfonctionsVO = new RegroupFonctions();

		regroupfonctionsVO.setRcCodeGroupe(codegroupe);
		regroupfonctionsVO.setRcCodeFonction(codefonction);
		regroupfonctionsVO.setRcOrdreAffichage(ordreaff);

		return regroupfonctionsVO;
	}

	/** * M�thode setGroupefonction () ** */
	public void setGroupefonction(GroupeFonction groupefonctionvo) {

		setNumRcCodeGroupeOB(sysEnv.IntegerToStr(groupefonctionvo
				.getRcCodeGroupe()));
		setNumRcLibGroupeOB(groupefonctionvo.getRcLibGroupe());
		setNumListRcCodeGrpPere(sysEnv.IntegerToStr(groupefonctionvo
				.getRcCodeGrpPere()));
		setNumRcOrdreAffichageOB(sysEnv.IntegerToStr(groupefonctionvo
				.getRcOrdreAffichage()));

	}

	/** * M�thodes reset ** */
	public void reset() {
		 numRcCodeGroupeOB = "";
		 numRcLibGroupeOB = "";
		 numListRcModule = "";
		 numListRcCodeGrpPere = "";
		 numRcOrdreAffichageOB = "";
		 numRcLibGrpPere = "";
	}

	public void resetChampsRecherche() {
		 numRcCodeGroupeRech = "";
		 numRcLibGroupeRech = "";
	}

	public List<LabelValue> getListModule() {
		List<LabelValue> vector = new ArrayList<LabelValue>();
		vector.add(new LabelValue("Manifeste", ConstRC.ConstantManifeste));
		vector.add(new LabelValue("Déclaration", ConstRC.ConstantDeclaration));
		vector.add(new LabelValue("Douane", ConstRC.ConstantDouane));
		vector.add(new LabelValue("Trésor", ConstRC.ConstantTresor));
		vector.add(new LabelValue("Ressources communes", ConstRC.ConstantRC));
		return vector;
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

	public String[] getIds1() {
		return ids1;
	}

	public void setIds1(String[] ids1) {
			this.ids1 = ids1.clone();
	}

	public String[] getIds2() {
		return ids2;
	}

	public void setIds2(String[] ids2) {	
			this.ids2 = ids2.clone();
	}

	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	public List getList1() {
		return list1;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public List getList2() {
		return list2;
	}

	public void setList2(List list2) {
		this.list2 = list2;
	}

	public String getNumRcCodeGroupeOB() {
		return numRcCodeGroupeOB;
	}

	public void setNumRcCodeGroupeOB(String numRcCodeGroupeOB) {
		this.numRcCodeGroupeOB = numRcCodeGroupeOB;
	}

	public String getNumRcLibGroupeOB() {
		return numRcLibGroupeOB;
	}

	public void setNumRcLibGroupeOB(String numRcLibGroupeOB) {
		this.numRcLibGroupeOB = numRcLibGroupeOB;
	}

	public String getNumListRcModule() {
		return numListRcModule;
	}

	public void setNumListRcModule(String numListRcModule) {
		this.numListRcModule = numListRcModule;
	}

	public String getNumListRcCodeGrpPere() {
		return numListRcCodeGrpPere;
	}

	public void setNumListRcCodeGrpPere(String numListRcCodeGrpPere) {
		this.numListRcCodeGrpPere = numListRcCodeGrpPere;
	}

	public String getNumRcOrdreAffichageOB() {
		return numRcOrdreAffichageOB;
	}

	public void setNumRcOrdreAffichageOB(String numRcOrdreAffichageOB) {
		this.numRcOrdreAffichageOB = numRcOrdreAffichageOB;
	}

	public String getNumRcLibGrpPere() {
		return numRcLibGrpPere;
	}

	public void setNumRcLibGrpPere(String numRcLibGrpPere) {
		this.numRcLibGrpPere = numRcLibGrpPere;
	}

	public String getNumRcCodeGroupeRech() {
		return numRcCodeGroupeRech;
	}

	public void setNumRcCodeGroupeRech(String numRcCodeGroupeRech) {
		this.numRcCodeGroupeRech = numRcCodeGroupeRech;
	}

	public String getNumRcLibGroupeRech() {
		return numRcLibGroupeRech;
	}

	public void setNumRcLibGroupeRech(String numRcLibGroupeRech) {
		this.numRcLibGroupeRech = numRcLibGroupeRech;
	}

	public List getListeRcGroupefonction() {
		return listeRcGroupefonction;
	}

	public void setListeRcGroupefonction(List listeRcGroupefonction) {
		this.listeRcGroupefonction = listeRcGroupefonction;
	}

	public GroupeFonction getGroupefonctionvo() {
		return groupefonctionvo;
	}

	public void setGroupefonctionvo(GroupeFonction groupefonctionvo) {
		this.groupefonctionvo = groupefonctionvo;
	}

	public Fonctionnalite getFonctionnalitesVO() {
		return fonctionnalitesVO;
	}

	public void setFonctionnalitesVO(Fonctionnalite fonctionnalitesVO) {
		this.fonctionnalitesVO = fonctionnalitesVO;
	}

	public void setListModule(List listModule) {
		this.listModule = listModule;
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