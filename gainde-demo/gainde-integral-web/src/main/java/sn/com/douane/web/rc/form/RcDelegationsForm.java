package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.DelegationDto;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;


/**
 * The Class RcDelegationsForm.
 * 
 * @author kerfahi ghazi
 */
public class RcDelegationsForm implements Serializable {
	private String pk;

	private String etat;

	/** * Attributs Table DELEGATIONS ** */
	//Champs de saisie
	private String numListAgentDestinataireOB;

	private String numListAgentEmetteurOB;

	private String numCodeGroupeOB;

	private String numCodeFonctionOB;

	private String datDateDebutOB;

	private String datDateFin;

	private String numListSensDelegation;

	private String regroupfonction;

	private String fonctionnalites;

	private String buragent;

	List listeDelegations = new ArrayList();

	List listGroupeFonc = new ArrayList();

	List listFonctionnalite = new ArrayList();

	List listSensDelegation = new ArrayList();

	//Champs de recherche
	private String numListAgentDestinataireRech;

	private String numListAgentEmetteurRech;

	private String numNomAgentDestRech;

	private String numNomAgentEmetRech;

	Delegation delegationsVO = new Delegation();

	Hashtable delegations = new Hashtable();

	public void addNewDelegation() throws Exception {
		DelegationDto delegationsVO = new DelegationDto();
		String key = "";

		String[] listgrp = getNumCodeGroupeOB().trim().split(" - ");
		String codegrp = listgrp[0];
		String libgrp = listgrp[1];

		String[] listfonc = getNumCodeFonctionOB().trim().split(" - ");
		String codefonc = listfonc[0];
		String libfonc = listfonc[1];

		if (getNumListAgentDestinataireOB() != null
				&& !getNumListAgentDestinataireOB().equals("")) {
			key = key + getNumListAgentDestinataireOB();
		}
		if (getNumListAgentEmetteurOB() != null
				&& !getNumListAgentEmetteurOB().equals("")) {
			key = key + ConstManif.TIELD + getNumListAgentEmetteurOB();
		}
		if (getNumCodeGroupeOB() != null
				&& !getNumCodeGroupeOB().equals("")) {
			key = key + ConstManif.TIELD + codegrp;
		}
		if (getNumCodeFonctionOB() != null
				&& !getNumCodeFonctionOB().equals("")) {
			key = key + ConstManif.TIELD + codefonc;
		}
		if (getDatDateDebutOB() != null && !getDatDateDebutOB().equals("")) {
			key = key + ConstManif.TIELD + getDatDateDebutOB();
		}

		if (delegations.containsKey(key)) {
			throw new TwreException(ConstErrCodRC.delegationExistante); 
		} else {

			delegationsVO.setPk(key);
			delegationsVO
					.setAgentDestinataire(getNumListAgentDestinataireOB());
			delegationsVO.setAgentEmetteur(getNumListAgentEmetteurOB());
			delegationsVO.setCodeGroupe(sysEnv.strToInteger(codegrp));
			delegationsVO.setLibgroupe(libgrp);
			delegationsVO.setCodeFonction(codefonc);
			delegationsVO.setLibfonction(libfonc);
			delegationsVO.setDateDebut(sysEnv.strToDate(getDatDateDebutOB()));

			if (getDatDateFin() != null && !getDatDateFin().equals(""))
				delegationsVO.setDateFin(sysEnv.strToDate(getDatDateFin()));

			delegations.put(key, key);
			getListeDelegations().add(delegationsVO);
		}
	}

	public void reset() {
		numListAgentDestinataireOB = "";
		numCodeGroupeOB = "";
		numCodeFonctionOB = "";
		datDateDebutOB = "";
		datDateFin = "";
	}

	public void resetChampsRecherche() {
		numListAgentDestinataireRech = "";
		numNomAgentDestRech = "";
		numListAgentEmetteurRech = "";
		numNomAgentEmetRech = "";
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

	
	public String getNumListAgentDestinataireOB() {
		return numListAgentDestinataireOB;
	}

	
	public void setNumListAgentDestinataireOB(String numListAgentDestinataireOB) {
		this.numListAgentDestinataireOB = numListAgentDestinataireOB;
	}

	
	public String getNumListAgentEmetteurOB() {
		return numListAgentEmetteurOB;
	}

	
	public void setNumListAgentEmetteurOB(String numListAgentEmetteurOB) {
		this.numListAgentEmetteurOB = numListAgentEmetteurOB;
	}

	
	public String getNumCodeGroupeOB() {
		return numCodeGroupeOB;
	}

	
	public void setNumCodeGroupeOB(String numCodeGroupeOB) {
		this.numCodeGroupeOB = numCodeGroupeOB;
	}

	
	public String getNumCodeFonctionOB() {
		return numCodeFonctionOB;
	}

	
	public void setNumCodeFonctionOB(String numCodeFonctionOB) {
		this.numCodeFonctionOB = numCodeFonctionOB;
	}

	
	public String getDatDateDebutOB() {
		return datDateDebutOB;
	}

	
	public void setDatDateDebutOB(String datDateDebutOB) {
		this.datDateDebutOB = datDateDebutOB;
	}

	
	public String getDatDateFin() {
		return datDateFin;
	}

	
	public void setDatDateFin(String datDateFin) {
		this.datDateFin = datDateFin;
	}

	
	public String getNumListSensDelegation() {
		return numListSensDelegation;
	}

	
	public void setNumListSensDelegation(String numListSensDelegation) {
		this.numListSensDelegation = numListSensDelegation;
	}

	
	public String getRegroupfonction() {
		return regroupfonction;
	}

	
	public void setRegroupfonction(String regroupfonction) {
		this.regroupfonction = regroupfonction;
	}

	
	public String getFonctionnalites() {
		return fonctionnalites;
	}

	
	public void setFonctionnalites(String fonctionnalites) {
		this.fonctionnalites = fonctionnalites;
	}

	
	public String getBuragent() {
		return buragent;
	}

	
	public void setBuragent(String buragent) {
		this.buragent = buragent;
	}

	
	public List getListeDelegations() {
		return listeDelegations;
	}

	
	public void setListeDelegations(List listeDelegations) {
		this.listeDelegations = listeDelegations;
	}

	
	public List getListGroupeFonc() {
		return listGroupeFonc;
	}

	
	public void setListGroupeFonc(List listGroupeFonc) {
		this.listGroupeFonc = listGroupeFonc;
	}

	
	public List getListFonctionnalite() {
		return listFonctionnalite;
	}

	
	public void setListFonctionnalite(List listFonctionnalite) {
		this.listFonctionnalite = listFonctionnalite;
	}

	
	public List getListSensDelegation() {
		return listSensDelegation;
	}

	
	public void setListSensDelegation(List listSensDelegation) {
		this.listSensDelegation = listSensDelegation;
	}

	
	public Delegation getDelegationsVO() {
		return delegationsVO;
	}

	
	public void setDelegationsVO(Delegation delegationsVO) {
		this.delegationsVO = delegationsVO;
	}

	
	public Hashtable getDelegations() {
		return delegations;
	}

	
	public void setDelegations(Hashtable delegations) {
		this.delegations = delegations;
	}

	
	public String getNumListAgentDestinataireRech() {
		return numListAgentDestinataireRech;
	}

	
	public void setNumListAgentDestinataireRech(String numListAgentDestinataireRech) {
		this.numListAgentDestinataireRech = numListAgentDestinataireRech;
	}

	
	public String getNumListAgentEmetteurRech() {
		return numListAgentEmetteurRech;
	}

	
	public void setNumListAgentEmetteurRech(String numListAgentEmetteurRech) {
		this.numListAgentEmetteurRech = numListAgentEmetteurRech;
	}

	
	public String getNumNomAgentDestRech() {
		return numNomAgentDestRech;
	}

	
	public void setNumNomAgentDestRech(String numNomAgentDestRech) {
		this.numNomAgentDestRech = numNomAgentDestRech;
	}

	
	public String getNumNomAgentEmetRech() {
		return numNomAgentEmetRech;
	}

	
	public void setNumNomAgentEmetRech(String numNomAgentEmetRech) {
		this.numNomAgentEmetRech = numNomAgentEmetRech;
	}
	
}