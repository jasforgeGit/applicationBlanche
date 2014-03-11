package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class SaisieTranchesQuittancesDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7487069055215448590L;
	private String trBornInf;
	private String trBornSup;
	private java.lang.String trTypeTranches;
	private String trDateTranches;
	private String pk;
	private List listeTypeQuittance = new ArrayList();
	private List listeArchive= new  ArrayList();

	public SaisieTranchesQuittancesDto() {
		super();
	}
	
	public List getListeTypeQuittance() {
		return listeTypeQuittance;
	}
	public void setListeTypeQuittance(List listeTypeQuittance) {
		this.listeTypeQuittance = listeTypeQuittance;
	}
	public String getTrBornInf() {
		return trBornInf;
	}
	public void setTrBornInf(String trBornInf) {
		this.trBornInf = trBornInf;
	}
	public String getTrBornSup() {
		return trBornSup;
	}
	public void setTrBornSup(String trBornSup) {
		this.trBornSup = trBornSup;
	}

public List getListeArchive() {
	return listeArchive;
}
public void setListeArchive(List listeArchive) {
	this.listeArchive = listeArchive;
}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public java.lang.String getTrTypeTranches() {
		return trTypeTranches;
	}
	public void setTrTypeTranches(java.lang.String trTypeTranches) {
		this.trTypeTranches = trTypeTranches;
	}
	public String getTrDateTranches() {
		return trDateTranches;
	}
	public void setTrDateTranches(String trDateTranches) {
		this.trDateTranches = trDateTranches;
	}
}
