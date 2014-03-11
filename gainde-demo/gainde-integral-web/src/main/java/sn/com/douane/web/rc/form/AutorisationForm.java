package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;

public class AutorisationForm implements Serializable {

	private static final long serialVersionUID = -7205246480851120434L;

	private String pk;

	private String numCodeUser;
	private String numCodePpmOB;
	private String numTypeUserOB;
	private String numIndentificationOB;
	private String numIndEnreg;
	private String numIndPreReg;

	private List<UtilisateurDto> listeAgents = new ArrayList<UtilisateurDto>();
	private String rcCodUser;
	private String rcIdentification;
	private String rcTypeUser;
	
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

	public Utilisateur getNewUtilisateur() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setRcCodUser(getRcCodUser());
		utilisateur.setRcTypeUser("T");
		utilisateur.setRcindEnr(getNumIndEnreg());
		utilisateur.setRcindprereg(getNumIndPreReg());
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		setNumCodeUser(utilisateur.getRcCodUser());
		setNumIndEnreg(utilisateur.getRcIndEnr());
		setNumIndPreReg(utilisateur.getRcIndprereg());
	}

	public void resetChampsRecherche() {
		numCodeUser = "";
		numIndentificationOB = "";
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getNumCodeUser() {
		return numCodeUser;
	}

	public void setNumCodeUser(String numCodeUser) {
		this.numCodeUser = numCodeUser;
	}

	public String getNumCodePpmOB() {
		return numCodePpmOB;
	}

	public void setNumCodePpmOB(String numCodePpmOB) {
		this.numCodePpmOB = numCodePpmOB;
	}

	public String getNumTypeUserOB() {
		return numTypeUserOB;
	}

	public void setNumTypeUserOB(String numTypeUserOB) {
		this.numTypeUserOB = numTypeUserOB;
	}

	public String getNumIndentificationOB() {
		return numIndentificationOB;
	}

	public void setNumIndentificationOB(String numIndentificationOB) {
		this.numIndentificationOB = numIndentificationOB;
	}

	public String getNumIndEnreg() {
		return numIndEnreg;
	}

	public void setNumIndEnreg(String numIndEnreg) {
		this.numIndEnreg = numIndEnreg;
	}

	public String getNumIndPreReg() {
		return numIndPreReg;
	}

	public void setNumIndPreReg(String numIndPreReg) {
		this.numIndPreReg = numIndPreReg;
	}

	public List<UtilisateurDto> getListeAgents() {
		return listeAgents;
	}

	public void setListeAgents(List<UtilisateurDto> listeAgents) {
		this.listeAgents = listeAgents;
	}

	

	public String getRcCodUser() {
		return rcCodUser;
	}

	public void setRcCodUser(String rcCodUser) {
		this.rcCodUser = rcCodUser;
	}

	public String getRcIdentification() {
		return rcIdentification;
	}

	public void setRcIdentification(String rcIdentification) {
		this.rcIdentification = rcIdentification;
	}

	public String getRcTypeUser() {
		return rcTypeUser;
	}

	public void setRcTypeUser(String rcTypeUser) {
		this.rcTypeUser = rcTypeUser;
	}
	
	public void reset() {
		listeAgents=new ArrayList<UtilisateurDto>();
		numCodePpmOB = "";
		numCodeUser = "";
		numIndEnreg = "";
		numIndentificationOB = "";
		numIndPreReg = "";
		numTypeUserOB = "";
		rcCodUser = "";
		rcIdentification = "";
		rcTypeUser = "";
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
