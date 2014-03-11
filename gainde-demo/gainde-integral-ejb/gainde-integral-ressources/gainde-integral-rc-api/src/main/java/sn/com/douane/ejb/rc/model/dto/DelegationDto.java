package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;
import java.sql.Date;

import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;


public class DelegationDto implements Serializable{


	private static final long serialVersionUID = -7860396455605178340L;

	private String agentDestinataire;

	private String agentEmetteur;

	private String codeFonction;

	private Date dateDebut;

	private String datedebutformat;

	private Date dateFin;

	private String datefinformat;

	private Integer codeGroupe;

	private String sensDelegation;

	private String libfonction;

	private String libgroupe;

	private String nomuser;

	private String pk;
	
	private String codeProfil;

	
	public DelegationDto() {
		super();
	}


	
	public String getAgentDestinataire() {
		return agentDestinataire;
	}


	
	public void setAgentDestinataire(String agentDestinataire) {
		this.agentDestinataire = agentDestinataire;
	}


	
	public String getAgentEmetteur() {
		return agentEmetteur;
	}


	
	public void setAgentEmetteur(String agentEmetteur) {
		this.agentEmetteur = agentEmetteur;
	}


	
	public String getCodeFonction() {
		return codeFonction;
	}


	
	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}


	
	public Date getDateDebut() {
		return dateDebut;
	}


	
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	
	public String getDatedebutformat() {
		return sysEnv.dateToStr(dateDebut);
	}


	
	public void setDatedebutformat(String datedebutformat) {
		this.datedebutformat = datedebutformat;
	}


	
	public Date getDateFin() {
		return dateFin;
	}


	
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	
	public String getDatefinformat() {
		return sysEnv.dateToStr(dateFin);
	}


	
	public void setDatefinformat(String datefinformat) {
		this.datefinformat = datefinformat;
	}


	
	public Integer getCodeGroupe() {
		return codeGroupe;
	}


	
	public void setCodeGroupe(Integer codeGroupe) {
		this.codeGroupe = codeGroupe;
	}


	
	public String getSensDelegation() {
		return sensDelegation;
	}


	
	public void setSensDelegation(String sensDelegation) {
		this.sensDelegation = sensDelegation;
	}


	
	public String getLibfonction() {
		return libfonction;
	}


	
	public void setLibfonction(String libfonction) {
		this.libfonction = libfonction;
	}


	
	public String getLibgroupe() {
		return libgroupe;
	}


	
	public void setLibgroupe(String libgroupe) {
		this.libgroupe = libgroupe;
	}


	
	public String getNomuser() {
		return nomuser;
	}


	
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}


	
	public String getPk() {
		return agentDestinataire + ConstManif.TIELD + agentEmetteur
				+ ConstManif.TIELD + codeGroupe + ConstManif.TIELD
				+ codeFonction + ConstManif.TIELD + sysEnv.dateToStr(dateDebut);
	}


	
	public void setPk(String pk) {
		this.pk = pk;
	}


	
	public String getCodeProfil() {
		return codeProfil;
	}


	
	public void setCodeProfil(String codeProfil) {
		this.codeProfil = codeProfil;
	}

	
}
