package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class UtilisateurDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5740651009584190857L;


	//  Autorisations
	private String rcindenr;
	
	private String rcindprereg;
	//fin autorisation
	private String rccoduser;

	private String rcidentification;

	private String rcmotpasse;

	private String rctypeuser;

	private String rccodeprofil;

	private String rcetatactif;

	private String rcindconnect;

	private String rcisadmin;

	private String nomxml;

	private String module1;
	
	private String rcemail;	

	private String codeppm;

	private String codecreditaire;

	private String codeagree;

	private String codeFonction;

	private String xml;
	
	private String pk;
	private String editCell; 
	private String delCell;

	/**
	 * @return Renvoie rcindenr.
	 */
	public String getRcindenr() {
		return rcindenr;
	}
	/**
	 * @param rcindenr
	 */
	public void setRcindenr(String rcindenr) {
		this.rcindenr = rcindenr;
	}
	/**
	 * @return Renvoie rcindprereg.
	 */
	public String getRcindprereg() {
		return rcindprereg;
	}
	/**
	 * @param rcindprereg
	 */
	public void setRcindprereg(String rcindprereg) {
		this.rcindprereg = rcindprereg;
	}
	/**
	 * @return Renvoie xml.
	 */
	public String getXml() {
		return xml;
	}
	/**
	 * @param xml.
	 */
	public void setXml(String xml) {
		this.xml = xml;
	}

	

	/**
	 *  
	 */
	public UtilisateurDto() {
		super();
	}

	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		pk=rccoduser;
		return pk;
	}

	/**
	 * @param pk
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * @return Renvoie nomxml.
	 */
	public String getNomxml() {
		return nomxml;
	}

	/**
	 * @param nomxml
	 */
	public void setNomxml(String nomxml) {
		this.nomxml = nomxml;
	}

	/**
	 * @return Renvoie rccodeprofil.
	 */
	public String getRccodeprofil() {
		return rccodeprofil;
	}

	/**
	 * @param rccodeprofil
	 */
	public void setRccodeprofil(String rccodeprofil) {
		this.rccodeprofil = rccodeprofil;
	}

	/**
	 * @return Renvoie rccoduser.
	 */
	public String getRccoduser() {
		return rccoduser;
	}

	/**
	 * @param rccoduser
	 */
	public void setRccoduser(String rccoduser) {
		this.rccoduser = rccoduser;
	}

	/**
	 * @return Renvoie rcetatactif.
	 */
	public String getRcetatactif() {
		return rcetatactif;
	}

	/**
	 * @param rcetatactif
	 */
	public void setRcetatactif(String rcetatactif) {
		this.rcetatactif = rcetatactif;
	}

	/**
	 * @return Renvoie rcidentification.
	 */
	public String getRcidentification() {
		return rcidentification;
	}

	/**
	 * @param rcidentification
	 */
	public void setRcidentification(String rcidentification) {
		this.rcidentification = rcidentification;
	}

	/**
	 * @return Renvoie rcindconnect.
	 */
	public String getRcindconnect() {
		return rcindconnect;
	}

	/**
	 * @param rcindconnect
	 */
	public void setRcindconnect(String rcindconnect) {
		this.rcindconnect = rcindconnect;
	}

	/**
	 * @return Renvoie rcisadmin.
	 */
	public String getRcisadmin() {
		return rcisadmin;
	}

	/**
	 * @param rcisadmin
	 */
	public void setRcisadmin(String rcisadmin) {
		this.rcisadmin = rcisadmin;
	}

	/**
	 * @return Renvoie rcmotpasse.
	 */
	public String getRcmotpasse() {
		return rcmotpasse;
	}

	/**
	 * @param rcmotpasse
	 */
	public void setRcmotpasse(String rcmotpasse) {
		this.rcmotpasse = rcmotpasse;
	}

	/**
	 * @return Renvoie rctypeuser.
	 */
	public String getRctypeuser() {
		return rctypeuser;
	}

	/**
	 * @param rctypeuser
	 */
	public void setRctypeuser(String rctypeuser) {
		this.rctypeuser = rctypeuser;
	}

	public String getModule1() {
		return module1;
	}

	public void setModule1(String module1) {
		this.module1 = module1;
	}

	public String getCodeppm() {
		return codeppm;
	}

	public void setCodeppm(String codeppm) {
		this.codeppm = codeppm;
	}

	/**
	 * @return Renvoie codeagree.
	 */
	public String getCodeagree() {
		return codeagree;
	}

	/**
	 * @param codeagree
	 */
	public void setCodeagree(String codeagree) {
		this.codeagree = codeagree;
	}

	/**
	 * @return Renvoie codecreditaire.
	 */
	public String getCodecreditaire() {
		return codecreditaire;
	}

	/**
	 * @param codecreditaire
	 */
	public void setCodecreditaire(String codecreditaire) {
		this.codecreditaire = codecreditaire;
	}

	/**
	 * @return Renvoie codeFonction.
	 */
	public String getCodeFonction() {
		return codeFonction;
	}
	/**
	 * @param codeFonction
	 */
	
	 public void setCodeFonction(String codeFonction) {
	 	this.codeFonction =	 codeFonction; 
	 }
	 
	public String getRcemail() {
		return rcemail;
	}
	public void setRcemail(String rcemail) {
		this.rcemail = rcemail;
	}
	public String getEditCell() {
		return editCell;
	}
	public void setEditCell(String editCell) {
		this.editCell = editCell;
	}
	public String getDelCell() {
		return delCell;
	}
	public void setDelCell(String delCell) {
		this.delCell = delCell;
	}
}
