package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.utils.ConstManif;


public class RcPpmForm implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;

	/*** Attributs Table PPM ***/
	//Champs de saisie
	private String numRcBoitePostalePPM;
	private String numRcBpEtablsec;
	private String numRcCircuitvisite;
	private String numListRcCodeAgree;
	private String numListRcCodeAmborg;
	private String numListRcCodeConsignataire;
	private String numRcCodeContribuable;
	private String numListRcCodeCreditaire;
	private String numRcCodePPMOB;
	private String datRcDateSuspensionADM;
	private String numRcIndShipSandler;
	private String numRcIndUsineExercee;
	private String numRcIndZoneFrinoust;
	private String numRcNinea;
	private String numRcNomPPM;
	private String numRcNomVoieEtablsec;
	private String numRcNomVoiePPM;
	private String numListRcNumImportExport;
	private String numRcNumPPM;
	private String numListRcNumRegPreferentiel;
	private String numRcNumVoieEtablsec;
	private String numRcPrenomPPM;
	private String numRcQuartierEtablsec;
	private String numRcQuartierPPM;
	private String numRcRaisonSociale;
	private String numRcSuspensionADM;
	private String numRcTitrePPM;
	private String numRcTypeVoieEtablsec;
	private String numRcTypeVoiePPM;
	private String numRcVilleEtablsec;
	private String numRcVillePPM;

	//Champs de recherche
	private String numRcBoitePostalePPMRech;
	private String numRcBpEtablsecRech;
	private String numRcCircuitvisiteRech;
	private String numListRcCodeAgreeRech;
	private String numListRcCodeAmborgRech;
	private String numListRcCodeConsignataireRech;
	private String numRcCodeContribuableRech;
	private String numListRcCodeCreditaireRech;
	private String numRcCodePPMRech;
	private String datRcDateSuspensionADMRech;
	private String numRcIndShipSandlerRech;
	private String numRcIndUsineExerceeRech;
	private String numRcIndZoneFrinoustRech;
	private String numRcNineaRech;
	private String numRcNomPPMRech;
	private String numRcNomVoieEtablsecRech;
	private String numRcNomVoiePPMRech;
	private String numListRcNumImportExportRech;
	private String numRcNumPPMRech;
	private String numListRcNumRegPreferentielRech;
	private String numRcNumVoieEtablsecRech;
	private String numRcPrenomPPMRech;
	private String numRcQuartierEtablsecRech;
	private String numRcQuartierPPMRech;
	private String numRcRaisonSocialeRech;
	private String numRcSuspensionADMRech;
	private String numRcTitrePPMRech;
	private String numRcTypeVoieEtablsecRech;
	private String numRcTypeVoiePPMRech;
	private String numRcVilleEtablsecRech;
	private String numRcVillePPMRech;	
	

	private List listeRcPpm = new ArrayList();
	private Ppm ppmvo = new Ppm();
	
	//Les indicateurs permettant de savoir s'il faut cr��er une entit�
	//(consignataire, cr�ditaire, etc) ou pas
	private boolean agreerACreer=true;
	private boolean consignataireACreer=true;
	private boolean contribuableACreer=true;
	private boolean creditaireACreer=true;
	private boolean importExportACreer=true;
	private boolean nineaACreer = true;
	private boolean regimePreferentielACreer=true;
	
	private String exonorepvi_ob;
	
	/*** M�thode getNewPPMVO () ***/
	public Ppm getNewRcPpmVO() {
		Ppm ppmvo = new Ppm();

		ppmvo.setRcboitepostaleppm(getNumRcBoitePostalePPM());
		ppmvo.setRcbpetablsec(getNumRcBpEtablsec());
		ppmvo.setRccircuitvisite(getNumRcCircuitvisite());
		ppmvo.setRccodeagree(getNumListRcCodeAgree());
		ppmvo.setRccodeamborg(getNumListRcCodeAmborg());
		ppmvo.setRccodeconsignataire(getNumListRcCodeConsignataire());
		ppmvo.setRccodecontribuable(getNumRcCodeContribuable());
		ppmvo.setRccodecreditaire(getNumListRcCodeCreditaire());
		ppmvo.setRccodeppm(getNumRcCodePPMOB());
		if (getDatRcDateSuspensionADM()!=null && !getDatRcDateSuspensionADM().equals("")){
			ppmvo.setRcdatesuspensionadm(new Date(sysEnv.strToDate(getDatRcDateSuspensionADM()).getTime()));
		}
		ppmvo.setRcindshipsandler(getNumRcIndShipSandler());
		ppmvo.setRcindusineexercee(getNumRcIndUsineExercee());
		ppmvo.setRcindzonefrindust(getNumRcIndZoneFrinoust());
		ppmvo.setRcninea(getNumRcNinea());
		ppmvo.setRcnomppm(getNumRcNomPPM());
		ppmvo.setRcnomvoieetablsec(getNumRcNomVoieEtablsec());
		ppmvo.setRcnomvoieppm(getNumRcNomVoiePPM());
		ppmvo.setRcnumimportexport(getNumListRcNumImportExport());
		ppmvo.setRcnumppm(getNumRcNumPPM());
		ppmvo.setRcnumregpreferentiel(getNumListRcNumRegPreferentiel());
		ppmvo.setRcnumvoieetablsec(getNumRcNumVoieEtablsec());
		ppmvo.setRcprenomppm(getNumRcPrenomPPM());
		ppmvo.setRcquartieretablsec(getNumRcQuartierEtablsec());
		ppmvo.setRcquartierppm(getNumRcQuartierPPM());
		ppmvo.setRcraisonsociale(getNumRcRaisonSociale());
		ppmvo.setRcsuspensionadm(getNumRcSuspensionADM());
		ppmvo.setRctitreppm(getNumRcTitrePPM());
		ppmvo.setRctypevoieetablsec(getNumRcTypeVoieEtablsec());
		ppmvo.setRctypevoieppm(getNumRcTypeVoiePPM());
		ppmvo.setRcvilleetablsec(getNumRcVilleEtablsec());
		ppmvo.setRcvilleppm(getNumRcVillePPM());
		if(getExonorepvi_ob()!=null && !getExonorepvi_ob().equals("N")){
		  ppmvo.setRcexonorepvi("O");
		}else{
			ppmvo.setRcexonorepvi("N");
		}

		return ppmvo;
	}

	/*** M�thode setPpm () ***/
	public void setPpm (Ppm ppmvo) {

		setNumRcBoitePostalePPM (ppmvo.getRcboitepostaleppm());
		setNumRcBpEtablsec (ppmvo.getRcbpetablsec());
		setNumRcCircuitvisite (ppmvo.getRccircuitvisite());
		setNumListRcCodeAgree (ppmvo.getRccodeagree());
		setNumListRcCodeAmborg (ppmvo.getRccodeamborg());
		setNumListRcCodeConsignataire (ppmvo.getRccodeconsignataire());
		setNumRcCodeContribuable (ppmvo.getRccodecontribuable());
		setNumListRcCodeCreditaire (ppmvo.getRccodecreditaire());
		setNumRcCodePPMOB (ppmvo.getRccodeppm());
		if (ppmvo.getRcdatesuspensionadm()!=null){
			setDatRcDateSuspensionADM (sysEnv.dateToStr(new Date(ppmvo.getRcdatesuspensionadm().getTime())));
		}
		setNumRcIndShipSandler (ppmvo.getRcindshipsandler());
		setNumRcIndUsineExercee (ppmvo.getRcindusineexercee());
		setNumRcIndZoneFrinoust (ppmvo.getRcindzonefrindust());
		setNumRcNinea (ppmvo.getRcninea());
		setNumRcNomPPM (ppmvo.getRcnomppm());
		setNumRcNomVoieEtablsec (ppmvo.getRcnomvoieetablsec());
		setNumRcNomVoiePPM (ppmvo.getRcnomvoieppm());
		setNumListRcNumImportExport (ppmvo.getRcnumimportexport());
		setNumRcNumPPM (ppmvo.getRcnumppm());
		setNumListRcNumRegPreferentiel (ppmvo.getRcnumregpreferentiel());
		setNumRcNumVoieEtablsec (ppmvo.getRcnumvoieetablsec());
		setNumRcPrenomPPM (ppmvo.getRcprenomppm());
		setNumRcQuartierEtablsec (ppmvo.getRcquartieretablsec());
		setNumRcQuartierPPM (ppmvo.getRcquartierppm());
		setNumRcRaisonSociale (ppmvo.getRcraisonsociale());
		setNumRcSuspensionADM (ppmvo.getRcsuspensionadm());
		setNumRcTitrePPM (ppmvo.getRctitreppm());
		setNumRcTypeVoieEtablsec (ppmvo.getRctypevoieetablsec());
		setNumRcTypeVoiePPM (ppmvo.getRctypevoieppm());
		setNumRcVilleEtablsec (ppmvo.getRcvilleetablsec());
		setNumRcVillePPM (ppmvo.getRcvilleppm());
		setExonorepvi_ob(ppmvo.getRcexonorepvi());

	}

	/*** M�thodes reset ***/
	public void reset() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (!page.equals("saisieRcPpm") && !page.equals("modificationRcPpm")) {
			numRcBoitePostalePPM = "";
			numRcBpEtablsec = "";
			numRcCircuitvisite = "";
			numListRcCodeAgree = "";
			numListRcCodeAmborg = "";
			numListRcCodeConsignataire = "";
			numRcCodeContribuable = "";
			numListRcCodeCreditaire = "";
			numRcCodePPMOB = "";
			datRcDateSuspensionADM = "";
			numRcIndShipSandler = "";
			numRcIndUsineExercee = "";
		    numRcIndZoneFrinoust = "";
			numRcNinea = "";
			numRcNomPPM = "";
			numRcNomVoieEtablsec = "";
			numRcNomVoiePPM = "";
			numListRcNumImportExport = "";
			numRcNumPPM = "";
			numListRcNumRegPreferentiel = "";
			numRcNumVoieEtablsec = "";
			numRcPrenomPPM = "";
			numRcQuartierEtablsec = "";
			numRcQuartierPPM = "";
			numRcRaisonSociale = "";
			numRcSuspensionADM = "";
			numRcTitrePPM = "";
			numRcTypeVoieEtablsec = "";
			numRcTypeVoiePPM = "";
			numRcVilleEtablsec = "";
			numRcVillePPM = "";
			exonorepvi_ob ="";
			numRcNomPPM="";
			numRcPrenomPPM ="";
		}
	}
	public void resetChampsRecherche() {
		numRcBoitePostalePPMRech ="";
		numRcBpEtablsecRech ="";
		numRcCircuitvisiteRech ="";
		numListRcCodeAgreeRech ="";
		numListRcCodeAmborgRech ="";
		numListRcCodeConsignataireRech ="";
		numRcCodeContribuableRech ="";
		numListRcCodeCreditaireRech ="";
		numRcCodePPMRech ="";
		datRcDateSuspensionADMRech ="";
		numRcIndShipSandlerRech ="";
		numRcIndUsineExerceeRech ="";
		numRcIndZoneFrinoustRech ="";
		numRcNineaRech ="";
		numRcNomPPMRech ="";
		numRcNomVoieEtablsecRech ="";
		numRcNomVoiePPMRech ="";
		numListRcNumImportExportRech ="";
		numRcNumPPMRech ="";
		numListRcNumRegPreferentielRech ="";
		numRcNumVoieEtablsecRech ="";
		numRcPrenomPPMRech ="";
	    numRcQuartierEtablsecRech ="";
		numRcQuartierPPMRech ="";
		numRcRaisonSocialeRech ="";
	    numRcSuspensionADMRech ="";
		numRcTitrePPMRech ="";
		numRcTypeVoieEtablsecRech ="";
		numRcTypeVoiePPMRech ="";
		numRcVilleEtablsecRech ="";
		numRcVillePPMRech ="";	
		numRcNomPPM ="";
		numRcPrenomPPM ="";		
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

	public String getNumRcBoitePostalePPM() {
		return numRcBoitePostalePPM;
	}

	public void setNumRcBoitePostalePPM(String numRcBoitePostalePPM) {
		this.numRcBoitePostalePPM = numRcBoitePostalePPM;
	}

	public String getNumRcBpEtablsec() {
		return numRcBpEtablsec;
	}

	public void setNumRcBpEtablsec(String numRcBpEtablsec) {
		this.numRcBpEtablsec = numRcBpEtablsec;
	}

	public String getNumRcCircuitvisite() {
		return numRcCircuitvisite;
	}

	public void setNumRcCircuitvisite(String numRcCircuitvisite) {
		this.numRcCircuitvisite = numRcCircuitvisite;
	}

	public String getNumListRcCodeAgree() {
		return numListRcCodeAgree;
	}

	public void setNumListRcCodeAgree(String numListRcCodeAgree) {
		this.numListRcCodeAgree = numListRcCodeAgree;
	}

	public String getNumListRcCodeAmborg() {
		return numListRcCodeAmborg;
	}

	public void setNumListRcCodeAmborg(String numListRcCodeAmborg) {
		this.numListRcCodeAmborg = numListRcCodeAmborg;
	}

	public String getNumListRcCodeConsignataire() {
		return numListRcCodeConsignataire;
	}

	public void setNumListRcCodeConsignataire(String numListRcCodeConsignataire) {
		this.numListRcCodeConsignataire = numListRcCodeConsignataire;
	}

	public String getNumRcCodeContribuable() {
		return numRcCodeContribuable;
	}

	public void setNumRcCodeContribuable(String numRcCodeContribuable) {
		this.numRcCodeContribuable = numRcCodeContribuable;
	}

	public String getNumListRcCodeCreditaire() {
		return numListRcCodeCreditaire;
	}

	public void setNumListRcCodeCreditaire(String numListRcCodeCreditaire) {
		this.numListRcCodeCreditaire = numListRcCodeCreditaire;
	}

	public String getNumRcCodePPMOB() {
		return numRcCodePPMOB;
	}

	public void setNumRcCodePPMOB(String numRcCodePPMOB) {
		this.numRcCodePPMOB = numRcCodePPMOB;
	}

	public String getDatRcDateSuspensionADM() {
		return datRcDateSuspensionADM;
	}

	public void setDatRcDateSuspensionADM(String datRcDateSuspensionADM) {
		this.datRcDateSuspensionADM = datRcDateSuspensionADM;
	}

	public String getNumRcIndShipSandler() {
		return numRcIndShipSandler;
	}

	public void setNumRcIndShipSandler(String numRcIndShipSandler) {
		this.numRcIndShipSandler = numRcIndShipSandler;
	}

	public String getNumRcIndUsineExercee() {
		return numRcIndUsineExercee;
	}

	public void setNumRcIndUsineExercee(String numRcIndUsineExercee) {
		this.numRcIndUsineExercee = numRcIndUsineExercee;
	}

	public String getNumRcIndZoneFrinoust() {
		return numRcIndZoneFrinoust;
	}

	public void setNumRcIndZoneFrinoust(String numRcIndZoneFrinoust) {
		this.numRcIndZoneFrinoust = numRcIndZoneFrinoust;
	}

	public String getNumRcNinea() {
		return numRcNinea;
	}

	public void setNumRcNinea(String numRcNinea) {
		this.numRcNinea = numRcNinea;
	}

	public String getNumRcNomPPM() {
		return numRcNomPPM;
	}

	public void setNumRcNomPPM(String numRcNomPPM) {
		this.numRcNomPPM = numRcNomPPM;
	}

	public String getNumRcNomVoieEtablsec() {
		return numRcNomVoieEtablsec;
	}

	public void setNumRcNomVoieEtablsec(String numRcNomVoieEtablsec) {
		this.numRcNomVoieEtablsec = numRcNomVoieEtablsec;
	}

	public String getNumRcNomVoiePPM() {
		return numRcNomVoiePPM;
	}

	public void setNumRcNomVoiePPM(String numRcNomVoiePPM) {
		this.numRcNomVoiePPM = numRcNomVoiePPM;
	}

	public String getNumListRcNumImportExport() {
		return numListRcNumImportExport;
	}

	public void setNumListRcNumImportExport(String numListRcNumImportExport) {
		this.numListRcNumImportExport = numListRcNumImportExport;
	}

	public String getNumRcNumPPM() {
		return numRcNumPPM;
	}

	public void setNumRcNumPPM(String numRcNumPPM) {
		this.numRcNumPPM = numRcNumPPM;
	}

	public String getNumListRcNumRegPreferentiel() {
		return numListRcNumRegPreferentiel;
	}

	public void setNumListRcNumRegPreferentiel(String numListRcNumRegPreferentiel) {
		this.numListRcNumRegPreferentiel = numListRcNumRegPreferentiel;
	}

	public String getNumRcNumVoieEtablsec() {
		return numRcNumVoieEtablsec;
	}

	public void setNumRcNumVoieEtablsec(String numRcNumVoieEtablsec) {
		this.numRcNumVoieEtablsec = numRcNumVoieEtablsec;
	}

	public String getNumRcPrenomPPM() {
		return numRcPrenomPPM;
	}

	public void setNumRcPrenomPPM(String numRcPrenomPPM) {
		this.numRcPrenomPPM = numRcPrenomPPM;
	}

	public String getNumRcQuartierEtablsec() {
		return numRcQuartierEtablsec;
	}

	public void setNumRcQuartierEtablsec(String numRcQuartierEtablsec) {
		this.numRcQuartierEtablsec = numRcQuartierEtablsec;
	}

	public String getNumRcQuartierPPM() {
		return numRcQuartierPPM;
	}

	public void setNumRcQuartierPPM(String numRcQuartierPPM) {
		this.numRcQuartierPPM = numRcQuartierPPM;
	}

	public String getNumRcRaisonSociale() {
		return numRcRaisonSociale;
	}

	public void setNumRcRaisonSociale(String numRcRaisonSociale) {
		this.numRcRaisonSociale = numRcRaisonSociale;
	}

	public String getNumRcSuspensionADM() {
		return numRcSuspensionADM;
	}

	public void setNumRcSuspensionADM(String numRcSuspensionADM) {
		this.numRcSuspensionADM = numRcSuspensionADM;
	}

	public String getNumRcTitrePPM() {
		return numRcTitrePPM;
	}

	public void setNumRcTitrePPM(String numRcTitrePPM) {
		this.numRcTitrePPM = numRcTitrePPM;
	}

	public String getNumRcTypeVoieEtablsec() {
		return numRcTypeVoieEtablsec;
	}

	public void setNumRcTypeVoieEtablsec(String numRcTypeVoieEtablsec) {
		this.numRcTypeVoieEtablsec = numRcTypeVoieEtablsec;
	}

	public String getNumRcTypeVoiePPM() {
		return numRcTypeVoiePPM;
	}

	public void setNumRcTypeVoiePPM(String numRcTypeVoiePPM) {
		this.numRcTypeVoiePPM = numRcTypeVoiePPM;
	}

	public String getNumRcVilleEtablsec() {
		return numRcVilleEtablsec;
	}

	public void setNumRcVilleEtablsec(String numRcVilleEtablsec) {
		this.numRcVilleEtablsec = numRcVilleEtablsec;
	}

	public String getNumRcVillePPM() {
		return numRcVillePPM;
	}

	public void setNumRcVillePPM(String numRcVillePPM) {
		this.numRcVillePPM = numRcVillePPM;
	}

	public String getNumRcBoitePostalePPMRech() {
		return numRcBoitePostalePPMRech;
	}

	public void setNumRcBoitePostalePPMRech(String numRcBoitePostalePPMRech) {
		this.numRcBoitePostalePPMRech = numRcBoitePostalePPMRech;
	}

	public String getNumRcBpEtablsecRech() {
		return numRcBpEtablsecRech;
	}

	public void setNumRcBpEtablsecRech(String numRcBpEtablsecRech) {
		this.numRcBpEtablsecRech = numRcBpEtablsecRech;
	}

	public String getNumRcCircuitvisiteRech() {
		return numRcCircuitvisiteRech;
	}

	public void setNumRcCircuitvisiteRech(String numRcCircuitvisiteRech) {
		this.numRcCircuitvisiteRech = numRcCircuitvisiteRech;
	}

	public String getNumListRcCodeAgreeRech() {
		return numListRcCodeAgreeRech;
	}

	public void setNumListRcCodeAgreeRech(String numListRcCodeAgreeRech) {
		this.numListRcCodeAgreeRech = numListRcCodeAgreeRech;
	}

	public String getNumListRcCodeAmborgRech() {
		return numListRcCodeAmborgRech;
	}

	public void setNumListRcCodeAmborgRech(String numListRcCodeAmborgRech) {
		this.numListRcCodeAmborgRech = numListRcCodeAmborgRech;
	}

	public String getNumListRcCodeConsignataireRech() {
		return numListRcCodeConsignataireRech;
	}

	public void setNumListRcCodeConsignataireRech(
			String numListRcCodeConsignataireRech) {
		this.numListRcCodeConsignataireRech = numListRcCodeConsignataireRech;
	}

	public String getNumRcCodeContribuableRech() {
		return numRcCodeContribuableRech;
	}

	public void setNumRcCodeContribuableRech(String numRcCodeContribuableRech) {
		this.numRcCodeContribuableRech = numRcCodeContribuableRech;
	}

	public String getNumListRcCodeCreditaireRech() {
		return numListRcCodeCreditaireRech;
	}

	public void setNumListRcCodeCreditaireRech(String numListRcCodeCreditaireRech) {
		this.numListRcCodeCreditaireRech = numListRcCodeCreditaireRech;
	}

	public String getNumRcCodePPMRech() {
		return numRcCodePPMRech;
	}

	public void setNumRcCodePPMRech(String numRcCodePPMRech) {
		this.numRcCodePPMRech = numRcCodePPMRech;
	}

	public String getDatRcDateSuspensionADMRech() {
		return datRcDateSuspensionADMRech;
	}

	public void setDatRcDateSuspensionADMRech(String datRcDateSuspensionADMRech) {
		this.datRcDateSuspensionADMRech = datRcDateSuspensionADMRech;
	}

	public String getNumRcIndShipSandlerRech() {
		return numRcIndShipSandlerRech;
	}

	public void setNumRcIndShipSandlerRech(String numRcIndShipSandlerRech) {
		this.numRcIndShipSandlerRech = numRcIndShipSandlerRech;
	}

	public String getNumRcIndUsineExerceeRech() {
		return numRcIndUsineExerceeRech;
	}

	public void setNumRcIndUsineExerceeRech(String numRcIndUsineExerceeRech) {
		this.numRcIndUsineExerceeRech = numRcIndUsineExerceeRech;
	}

	public String getNumRcIndZoneFrinoustRech() {
		return numRcIndZoneFrinoustRech;
	}

	public void setNumRcIndZoneFrinoustRech(String numRcIndZoneFrinoustRech) {
		this.numRcIndZoneFrinoustRech = numRcIndZoneFrinoustRech;
	}

	public String getNumRcNineaRech() {
		return numRcNineaRech;
	}

	public void setNumRcNineaRech(String numRcNineaRech) {
		this.numRcNineaRech = numRcNineaRech;
	}

	public String getNumRcNomPPMRech() {
		return numRcNomPPMRech;
	}

	public void setNumRcNomPPMRech(String numRcNomPPMRech) {
		this.numRcNomPPMRech = numRcNomPPMRech;
	}

	public String getNumRcNomVoieEtablsecRech() {
		return numRcNomVoieEtablsecRech;
	}

	public void setNumRcNomVoieEtablsecRech(String numRcNomVoieEtablsecRech) {
		this.numRcNomVoieEtablsecRech = numRcNomVoieEtablsecRech;
	}

	public String getNumRcNomVoiePPMRech() {
		return numRcNomVoiePPMRech;
	}

	public void setNumRcNomVoiePPMRech(String numRcNomVoiePPMRech) {
		this.numRcNomVoiePPMRech = numRcNomVoiePPMRech;
	}

	public String getNumListRcNumImportExportRech() {
		return numListRcNumImportExportRech;
	}

	public void setNumListRcNumImportExportRech(String numListRcNumImportExportRech) {
		this.numListRcNumImportExportRech = numListRcNumImportExportRech;
	}

	public String getNumRcNumPPMRech() {
		return numRcNumPPMRech;
	}

	public void setNumRcNumPPMRech(String numRcNumPPMRech) {
		this.numRcNumPPMRech = numRcNumPPMRech;
	}

	public String getNumListRcNumRegPreferentielRech() {
		return numListRcNumRegPreferentielRech;
	}

	public void setNumListRcNumRegPreferentielRech(
			String numListRcNumRegPreferentielRech) {
		this.numListRcNumRegPreferentielRech = numListRcNumRegPreferentielRech;
	}

	public String getNumRcNumVoieEtablsecRech() {
		return numRcNumVoieEtablsecRech;
	}

	public void setNumRcNumVoieEtablsecRech(String numRcNumVoieEtablsecRech) {
		this.numRcNumVoieEtablsecRech = numRcNumVoieEtablsecRech;
	}

	public String getNumRcPrenomPPMRech() {
		return numRcPrenomPPMRech;
	}

	public void setNumRcPrenomPPMRech(String numRcPrenomPPMRech) {
		this.numRcPrenomPPMRech = numRcPrenomPPMRech;
	}

	public String getNumRcQuartierEtablsecRech() {
		return numRcQuartierEtablsecRech;
	}

	public void setNumRcQuartierEtablsecRech(String numRcQuartierEtablsecRech) {
		this.numRcQuartierEtablsecRech = numRcQuartierEtablsecRech;
	}

	public String getNumRcQuartierPPMRech() {
		return numRcQuartierPPMRech;
	}

	public void setNumRcQuartierPPMRech(String numRcQuartierPPMRech) {
		this.numRcQuartierPPMRech = numRcQuartierPPMRech;
	}

	public String getNumRcRaisonSocialeRech() {
		return numRcRaisonSocialeRech;
	}

	public void setNumRcRaisonSocialeRech(String numRcRaisonSocialeRech) {
		this.numRcRaisonSocialeRech = numRcRaisonSocialeRech;
	}

	public String getNumRcSuspensionADMRech() {
		return numRcSuspensionADMRech;
	}

	public void setNumRcSuspensionADMRech(String numRcSuspensionADMRech) {
		this.numRcSuspensionADMRech = numRcSuspensionADMRech;
	}

	public String getNumRcTitrePPMRech() {
		return numRcTitrePPMRech;
	}

	public void setNumRcTitrePPMRech(String numRcTitrePPMRech) {
		this.numRcTitrePPMRech = numRcTitrePPMRech;
	}

	public String getNumRcTypeVoieEtablsecRech() {
		return numRcTypeVoieEtablsecRech;
	}

	public void setNumRcTypeVoieEtablsecRech(String numRcTypeVoieEtablsecRech) {
		this.numRcTypeVoieEtablsecRech = numRcTypeVoieEtablsecRech;
	}

	public String getNumRcTypeVoiePPMRech() {
		return numRcTypeVoiePPMRech;
	}

	public void setNumRcTypeVoiePPMRech(String numRcTypeVoiePPMRech) {
		this.numRcTypeVoiePPMRech = numRcTypeVoiePPMRech;
	}

	public String getNumRcVilleEtablsecRech() {
		return numRcVilleEtablsecRech;
	}

	public void setNumRcVilleEtablsecRech(String numRcVilleEtablsecRech) {
		this.numRcVilleEtablsecRech = numRcVilleEtablsecRech;
	}

	public String getNumRcVillePPMRech() {
		return numRcVillePPMRech;
	}

	public void setNumRcVillePPMRech(String numRcVillePPMRech) {
		this.numRcVillePPMRech = numRcVillePPMRech;
	}

	public List getListeRcPpm() {
		return listeRcPpm;
	}

	public void setListeRcPpm(List listeRcPpm) {
		this.listeRcPpm = listeRcPpm;
	}

	public Ppm getPpmvo() {
		return ppmvo;
	}

	public void setPpmvo(Ppm ppmvo) {
		this.ppmvo = ppmvo;
	}

	public boolean isAgreerACreer() {
		return agreerACreer;
	}

	public void setAgreerACreer(boolean agreerACreer) {
		this.agreerACreer = agreerACreer;
	}

	public boolean isConsignataireACreer() {
		return consignataireACreer;
	}

	public void setConsignataireACreer(boolean consignataireACreer) {
		this.consignataireACreer = consignataireACreer;
	}

	public boolean isContribuableACreer() {
		return contribuableACreer;
	}

	public void setContribuableACreer(boolean contribuableACreer) {
		this.contribuableACreer = contribuableACreer;
	}

	public boolean isCreditaireACreer() {
		return creditaireACreer;
	}

	public void setCreditaireACreer(boolean creditaireACreer) {
		this.creditaireACreer = creditaireACreer;
	}

	public boolean isImportExportACreer() {
		return importExportACreer;
	}

	public void setImportExportACreer(boolean importExportACreer) {
		this.importExportACreer = importExportACreer;
	}

	public boolean isNineaACreer() {
		return nineaACreer;
	}

	public void setNineaACreer(boolean nineaACreer) {
		this.nineaACreer = nineaACreer;
	}

	public boolean isRegimePreferentielACreer() {
		return regimePreferentielACreer;
	}

	public void setRegimePreferentielACreer(boolean regimePreferentielACreer) {
		this.regimePreferentielACreer = regimePreferentielACreer;
	}

	public String getExonorepvi_ob() {
		return exonorepvi_ob;
	}

	public void setExonorepvi_ob(String exonorepviob) {
		this.exonorepvi_ob = exonorepviob;
	}
}