package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;

public class RcUtilisateurForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk;

    private String etat;
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
    
    /** * Attributs Table UTILISATEUR ** */
    //Champs de saisie
    private String numListRcCodeProfilOB;

    private String numRcCodUserOB;

    private String numRcEtatActif;

    private String numRcIdentificationOB;

    private String numRcIndConnect;

    private String numRcMotPasseOB;

    private String numRcMotPasse;

    private String numListRcTypeUserOB;

    private String numRcMotPasseBisOB;

    private String numRcMotPasseBis;

    private String numRcMotPasseOld;

    private String numRcMotPasseBD;

    private String numRcModule;

    //Champs de recherche
    private String numListRcCodeProfilRech;

    private String numRcCodUserRech;

    private String numRcEtatActifRech;

    private String numRcIdentificationRech;

    private String numRcIndConnectRech;

    private String numRcMotPasseRech;

    private String numListRcTypeUserRech;

    private List listeRcUtilisateur = new ArrayList();

    private Utilisateur utilisateurvo = new Utilisateur();

    /** * M�thode getNewUTILISATEURVO () ** */
    public Utilisateur getNewRcUtilisateurVO() {
        Utilisateur utilisateurvo = new Utilisateur();

        utilisateurvo.setRcCodeProfil(getNumListRcCodeProfilOB());
        utilisateurvo.setRcCodUser(getNumRcCodUserOB());
        utilisateurvo.setRcEtatActif(getNumRcEtatActif());
        utilisateurvo.setRcIdentification(getNumRcIdentificationOB());
        utilisateurvo.setRcIndconnect(getNumRcIndConnect());
        utilisateurvo.setRcTypeUser(getNumListRcTypeUserOB());
        utilisateurvo.setModule1(getNumRcModule());

        utilisateurvo.setNomxml(getNumListRcCodeProfilOB());
        utilisateurvo.setRcMotPasse(getNumRcCodUserOB());
        
        // Pour le moment le mot de passe est �gal au code profil 30/10/07
        //utilisateurvo.setRcmotpasse(getTNUM_RCMOTPASSE_OB());

        return utilisateurvo;
    }

    /** * M�thode setUtilisateur () ** */
    public void setUtilisateur(Utilisateur utilisateurvo) {

        setNumListRcCodeProfilOB(utilisateurvo.getRcCodeProfil());
        setNumRcCodUserOB(utilisateurvo.getRcCodUser());
        setNumRcEtatActif(utilisateurvo.getRcEtatActif());
        setNumRcIdentificationOB(utilisateurvo.getRcIdentification());
        setNumRcIndConnect(utilisateurvo.getRcIndconnect());
        setNumListRcTypeUserOB(utilisateurvo.getRcTypeUser());
        setNumRcModule(utilisateurvo.getModule1());
        
        //setTNUM_RCMOTPASSE_OB (utilisateurvo.getRcmotpasse());
        //setTNUM_RCMOTPASSE_BD(utilisateurvo.getRcmotpasse());

    }

    /** * M�thodes reset ** */
    public void reset() {
        numListRcCodeProfilOB = "";
        numRcCodUserOB = "";
        numRcEtatActif = "";
        numRcIdentificationOB = "";
        numRcIndConnect = "";
        numListRcTypeUserOB = "";
        numRcModule = "";
        //TNUM_RCMOTPASSE_OB="";
    }

    public void resetChampsRecherche() {
        numListRcCodeProfilRech = "";
        numRcCodUserRech = "";
        numRcEtatActifRech = "";
        numRcIdentificationRech = "";
        numRcIndConnectRech = "";
        numListRcTypeUserRech = "";
        //TNUM_RCMOTPASSERech="";
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

	public String getNumListRcCodeProfilOB() {
		return numListRcCodeProfilOB;
	}

	public void setNumListRcCodeProfilOB(String numListRcCodeProfilOB) {
		this.numListRcCodeProfilOB = numListRcCodeProfilOB;
	}

	public String getNumRcCodUserOB() {
		return numRcCodUserOB;
	}

	public void setNumRcCodUserOB(String numRcCodUserOB) {
		this.numRcCodUserOB = numRcCodUserOB;
	}

	public String getNumRcEtatActif() {
		return numRcEtatActif;
	}

	public void setNumRcEtatActif(String numRcEtatActif) {
		this.numRcEtatActif = numRcEtatActif;
	}

	public String getNumRcIdentificationOB() {
		return numRcIdentificationOB;
	}

	public void setNumRcIdentificationOB(String numRcIdentificationOB) {
		this.numRcIdentificationOB = numRcIdentificationOB;
	}

	public String getNumRcIndConnect() {
		return numRcIndConnect;
	}

	public void setNumRcIndConnect(String numRcIndConnect) {
		this.numRcIndConnect = numRcIndConnect;
	}

	public String getNumRcMotPasseOB() {
		return numRcMotPasseOB;
	}

	public void setNumRcMotPasseOB(String numRcMotPasseOB) {
		this.numRcMotPasseOB = numRcMotPasseOB;
	}

	public String getNumRcMotPasse() {
		return numRcMotPasse;
	}

	public void setNumRcMotPasse(String numRcMotPasse) {
		this.numRcMotPasse = numRcMotPasse;
	}

	public String getNumListRcTypeUserOB() {
		return numListRcTypeUserOB;
	}

	public void setNumListRcTypeUserOB(String numListRcTypeUserOB) {
		this.numListRcTypeUserOB = numListRcTypeUserOB;
	}

	public String getNumRcMotPasseBisOB() {
		return numRcMotPasseBisOB;
	}

	public void setNumRcMotPasseBisOB(String numRcMotPasseBisOB) {
		this.numRcMotPasseBisOB = numRcMotPasseBisOB;
	}

	public String getNumRcMotPasseBis() {
		return numRcMotPasseBis;
	}

	public void setNumRcMotPasseBis(String numRcMotPasseBis) {
		this.numRcMotPasseBis = numRcMotPasseBis;
	}

	public String getNumRcMotPasseOld() {
		return numRcMotPasseOld;
	}

	public void setNumRcMotPasseOld(String numRcMotPasseOld) {
		this.numRcMotPasseOld = numRcMotPasseOld;
	}

	public String getNumRcMotPasseBD() {
		return numRcMotPasseBD;
	}

	public void setNumRcMotPasseBD(String numRcMotPasseBD) {
		this.numRcMotPasseBD = numRcMotPasseBD;
	}

	public String getNumRcModule() {
		return numRcModule;
	}

	public void setNumRcModule(String numRcModule) {
		this.numRcModule = numRcModule;
	}

	public String getNumListRcCodeProfilRech() {
		return numListRcCodeProfilRech;
	}

	public void setNumListRcCodeProfilRech(String numListRcCodeProfilRech) {
		this.numListRcCodeProfilRech = numListRcCodeProfilRech;
	}

	public String getNumRcCodUserRech() {
		return numRcCodUserRech;
	}

	public void setNumRcCodUserRech(String numRcCodUserRech) {
		this.numRcCodUserRech = numRcCodUserRech;
	}

	public String getNumRcEtatActifRech() {
		return numRcEtatActifRech;
	}

	public void setNumRcEtatActifRech(String numRcEtatActifRech) {
		this.numRcEtatActifRech = numRcEtatActifRech;
	}

	public String getNumRcIdentificationRech() {
		return numRcIdentificationRech;
	}

	public void setNumRcIdentificationRech(String numRcIdentificationRech) {
		this.numRcIdentificationRech = numRcIdentificationRech;
	}

	public String getNumRcIndConnectRech() {
		return numRcIndConnectRech;
	}

	public void setNumRcIndConnectRech(String numRcIndConnectRech) {
		this.numRcIndConnectRech = numRcIndConnectRech;
	}

	public String getNumRcMotPasseRech() {
		return numRcMotPasseRech;
	}

	public void setNumRcMotPasseRech(String numRcMotPasseRech) {
		this.numRcMotPasseRech = numRcMotPasseRech;
	}

	public String getNumListRcTypeUserRech() {
		return numListRcTypeUserRech;
	}

	public void setNumListRcTypeUserRech(String numListRcTypeUserRech) {
		this.numListRcTypeUserRech = numListRcTypeUserRech;
	}

	public List getListeRcUtilisateur() {
		return listeRcUtilisateur;
	}

	public void setListeRcUtilisateur(List listeRcUtilisateur) {
		this.listeRcUtilisateur = listeRcUtilisateur;
	}

	public Utilisateur getUtilisateurvo() {
		return utilisateurvo;
	}

	public void setUtilisateurvo(Utilisateur utilisateurvo) {
		this.utilisateurvo = utilisateurvo;
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