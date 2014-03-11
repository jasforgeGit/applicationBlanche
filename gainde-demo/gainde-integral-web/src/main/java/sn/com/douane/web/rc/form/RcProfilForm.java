package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;

public class RcProfilForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

	private String etat;

	/** Partie SWAP ** */
	private String[] ids1;

	private String[] ids2;

	private String rcCodeGroupe;

	private List list1 = new ArrayList();

	private List list2 = new ArrayList();

	/** * Attributs Table FONCTIONNALITES ** */
	//Champs de saisie
	private String numRcCodeProfilOB;

	private String numRcLibProfilOB;

	//Champs de recherche
	private String numListRcCodeProfilRech;

	private String numRcLibProfilRech;

	private List listeRcProfil = new ArrayList();

	private Profil profilVO = new Profil();

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
	
	/** * M�thode getNewGroupefonctionVO () ** */
	public Profil getNewRcProfilVO() {
		Profil profilVO = new Profil();

		profilVO.setRcCodeProfil(getNumRcCodeProfilOB());
		profilVO.setRcLibelleProfil(getNumRcLibProfilOB());

		return profilVO;
	}

	/** * M�thode getNewRcRegroupFonctionVO () ** */
	public ProfilGroupe getNewRcProfilgroupeVO(Integer codegroupe,
			String codeprofil) {
		ProfilGroupe profilgroupeVO = new ProfilGroupe();

		profilgroupeVO.setRcCodeGroupe(codegroupe);
		profilgroupeVO.setRcCodeProfil(codeprofil);

		return profilgroupeVO;
	}

	/** * M�thode setGroupefonction () ** */
	public void setProfil(Profil profilVO) {

		setNumRcCodeProfilOB(profilVO.getRcCodeProfil());
		setNumRcLibProfilOB(profilVO.getRcLibelleProfil());

	}

	/** * M�thodes reset ** */
	public void reset() {
		numRcCodeProfilOB = "";
		numRcLibProfilOB = "";
	}

	public void resetChampsRecherche() {
		numListRcCodeProfilRech = "";
		numRcLibProfilRech = "";
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

	public String getRcCodeGroupe() {
		return rcCodeGroupe;
	}

	public void setRcCodeGroupe(String rcCodeGroupe) {
		this.rcCodeGroupe = rcCodeGroupe;
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

	public String getNumRcCodeProfilOB() {
		return numRcCodeProfilOB;
	}

	public void setNumRcCodeProfilOB(String numRcCodeProfilOB) {
		this.numRcCodeProfilOB = numRcCodeProfilOB;
	}

	public String getNumRcLibProfilOB() {
		return numRcLibProfilOB;
	}

	public void setNumRcLibProfilOB(String numRcLibProfilOB) {
		this.numRcLibProfilOB = numRcLibProfilOB;
	}

	public String getNumListRcCodeProfilRech() {
		return numListRcCodeProfilRech;
	}

	public void setNumListRcCodeProfilRech(String numRcCodeProfilRech) {
		this.numListRcCodeProfilRech = numRcCodeProfilRech;
	}

	public String getNumRcLibProfilRech() {
		return numRcLibProfilRech;
	}

	public void setNumRcLibProfilRech(String numRcLibProfilRech) {
		this.numRcLibProfilRech = numRcLibProfilRech;
	}

	public List getListeRcProfil() {
		return listeRcProfil;
	}

	public void setListeRcProfil(List listeRcProfil) {
		this.listeRcProfil = listeRcProfil;
	}

	public Profil getProfilVO() {
		return profilVO;
	}

	public void setProfilVO(Profil profilVO) {
		this.profilVO = profilVO;
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