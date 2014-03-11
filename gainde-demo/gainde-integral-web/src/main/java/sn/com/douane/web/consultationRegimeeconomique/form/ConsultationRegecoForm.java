package sn.com.douane.web.consultationRegimeeconomique.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;
import sn.com.douane.utils.sysEnv;


public class ConsultationRegecoForm implements Serializable {


	private static final long serialVersionUID = 122755940103641654L;
	private String etat;
	private String pk;

	// Attributs de recherche regime economique
	private String numRcAnneeRegEcoRech;
	private String numRcNumRegEcoRech;
	private String numListRcPPMBeneficiaireRech; 

	// private String TNUM_RCRAISONSOCIALERech;
	private String numRcCodeCreditaireRech;
	private String numListRcCodeNatRegEcoRech;
	private String datRcDateValiditeRegEcoRech; 
	private String numRcCodeProdRech;
	private String numRcPrecuemoaRech;
	private String numRcPrecsenRech;

	private String pkSelected;
	private String rcanneeregeco;
	private String rcnumregeco;
	private String rccodeppm;
	private String rccodeprod;
	private String rcprecuemoa;
	private String rcprecsen;

	// champs de saisie

	private String numRcAnneeRegEcoOB; 
	private String numRcNumRegEcoOB;
	private String numRcCodeNatRegEco;
	private String datRcDateDecisionRegEco;
	private String numRcRefJuridiqueRegEco;  
	private Integer numRcNbreProRoRegEco;
	private String datRcDateValiditeRegEco;
	private String datRcDateProRoRegEco;
	private Integer numRcDureeRegEco;
	private Integer numRcDureeProRoRegEco;
	private String numRcPPMBeneficiaire;
	private String numRcModeRegEco;
	private String datRcDateSuspensionRegEco;
	private String numRcEtatRegEco; 
	
	private Integer numRcNbreMatPremieres;
	private String numUniteMesure;
	private String numQteUnitaire;
	private String numNatureRendMT;
	private Integer numRcNumGammeOB;
	private String numPrecisionUemoaOB;
	private String numPrecisionSenOB;
	private String numCodeProduitOB;
	private String numRcPPMBeneficiaireOB;
	private String numTauxDechet;
	private String numRcNatProd ;
	private String numTauxRendMNT ;
	private String numQteImport;
	private String numPrecisionUEMOAMPOB;
	private String numPrecisionSENMPOB;
	private String numCodeMPOB;
	private String numTypeDechet;
	
	private List listeRegimeeconomique = new ArrayList();
	private List listeProduitsfinis = new ArrayList();
	private List listeBureaux = new ArrayList();
	private List listeGammes = new ArrayList();
	private List listeMatierespremieres = new ArrayList();

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

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getNumRcAnneeRegEcoRech() {
		return numRcAnneeRegEcoRech;
	}

	public void setNumRcAnneeRegEcoRech(String numRcAnneeRegEcoRech) {
		this.numRcAnneeRegEcoRech = numRcAnneeRegEcoRech;
	}

	public String getNumRcNumRegEcoRech() {
		return numRcNumRegEcoRech;
	}

	public void setNumRcNumRegEcoRech(String numRcNumRegEcoRech) {
		this.numRcNumRegEcoRech = numRcNumRegEcoRech;
	}

	public String getNumListRcPPMBeneficiaireRech() {
		return numListRcPPMBeneficiaireRech;
	}

	public void setNumListRcPPMBeneficiaireRech(String numListRcPPMBeneficiaireRech) {
		this.numListRcPPMBeneficiaireRech = numListRcPPMBeneficiaireRech;
	}

	public String getNumRcCodeCreditaireRech() {
		return numRcCodeCreditaireRech;
	}

	public void setNumRcCodeCreditaireRech(String numRcCodeCreditaireRech) {
		this.numRcCodeCreditaireRech = numRcCodeCreditaireRech;
	}

	public String getNumListRcCodeNatRegEcoRech() {
		return numListRcCodeNatRegEcoRech;
	}

	public void setNumListRcCodeNatRegEcoRech(String numListRcCodeNatRegEcoRech) {
		this.numListRcCodeNatRegEcoRech = numListRcCodeNatRegEcoRech;
	}

	public String getDatRcDateValiditeRegEcoRech() {
		return datRcDateValiditeRegEcoRech;
	}

	public void setDatRcDateValiditeRegEcoRech(String datRcDateValiditeRegEcoRech) {
		this.datRcDateValiditeRegEcoRech = datRcDateValiditeRegEcoRech;
	}

	public String getNumRcCodeProdRech() {
		return numRcCodeProdRech;
	}

	public void setNumRcCodeProdRech(String numRcCodeProdRech) {
		this.numRcCodeProdRech = numRcCodeProdRech;
	}

	public String getNumRcPrecuemoaRech() {
		return numRcPrecuemoaRech;
	}

	public void setNumRcPrecuemoaRech(String numRcPrecuemoaRech) {
		this.numRcPrecuemoaRech = numRcPrecuemoaRech;
	}

	public String getNumRcPrecsenRech() {
		return numRcPrecsenRech;
	}

	public void setNumRcPrecsenRech(String numRcPrecsenRech) {
		this.numRcPrecsenRech = numRcPrecsenRech;
	}

	public String getPkSelected() {
		return pkSelected;
	}

	public void setPkSelected(String pkSelected) {
		this.pkSelected = pkSelected;
	}

	public String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public String getRcnumregeco() {
		return rcnumregeco;
	}

	public void setRcnumregeco(String rcnumregeco) {
		this.rcnumregeco = rcnumregeco;
	}

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
	}

	public String getRccodeprod() {
		return rccodeprod;
	}

	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}

	public String getRcprecuemoa() {
		return rcprecuemoa;
	}

	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}

	public String getRcprecsen() {
		return rcprecsen;
	}

	public void setRcprecsen(String rcprecsen) {
		this.rcprecsen = rcprecsen;
	}

	public String getNumRcAnneeRegEcoOB() {
		return numRcAnneeRegEcoOB;
	}

	public void setNumRcAnneeRegEcoOB(String numRcAnneeRegEcoOB) {
		this.numRcAnneeRegEcoOB = numRcAnneeRegEcoOB;
	}

	public String getNumRcNumRegEcoOB() {
		return numRcNumRegEcoOB;
	}

	public void setNumRcNumRegEcoOB(String numRcNumRegEcoOB) {
		this.numRcNumRegEcoOB = numRcNumRegEcoOB;
	}

	public String getNumRcCodeNatRegEco() {
		return numRcCodeNatRegEco;
	}

	public void setNumRcCodeNatRegEco(String numRcCodeNatRegEco) {
		this.numRcCodeNatRegEco = numRcCodeNatRegEco;
	}

	public String getDatRcDateDecisionRegEco() {
		return datRcDateDecisionRegEco;
	}

	public void setDatRcDateDecisionRegEco(String datRcDateDecisionRegEco) {
		this.datRcDateDecisionRegEco = datRcDateDecisionRegEco;
	}

	public String getNumRcRefJuridiqueRegEco() {
		return numRcRefJuridiqueRegEco;
	}

	public void setNumRcRefJuridiqueRegEco(String numRcRefJuridiqueRegEco) {
		this.numRcRefJuridiqueRegEco = numRcRefJuridiqueRegEco;
	}

	public Integer getNumRcNbreProRoRegEco() {
		return numRcNbreProRoRegEco;
	}

	public void setNumRcNbreProRoRegEco(Integer numRcNbreProRoRegEco) {
		this.numRcNbreProRoRegEco = numRcNbreProRoRegEco;
	}

	public String getDatRcDateValiditeRegEco() {
		return datRcDateValiditeRegEco;
	}

	public void setDatRcDateValiditeRegEco(String datRcDateValiditeRegEco) {
		this.datRcDateValiditeRegEco = datRcDateValiditeRegEco;
	}

	public String getDatRcDateProRoRegEco() {
		return datRcDateProRoRegEco;
	}

	public void setDatRcDateProRoRegEco(String datRcDateProRoRegEco) {
		this.datRcDateProRoRegEco = datRcDateProRoRegEco;
	}

	public Integer getNumRcDureeRegEco() {
		return numRcDureeRegEco;
	}

	public void setNumRcDureeRegEco(Integer numRcDureeRegEco) {
		this.numRcDureeRegEco = numRcDureeRegEco;
	}

	public Integer getNumRcDureeProRoRegEco() {
		return numRcDureeProRoRegEco;
	}

	public void setNumRcDureeProRoRegEco(Integer numRcDureeProRoRegEco) {
		this.numRcDureeProRoRegEco = numRcDureeProRoRegEco;
	}

	public String getNumRcPPMBeneficiaire() {
		return numRcPPMBeneficiaire;
	}

	public void setNumRcPPMBeneficiaire(String numRcPPMBeneficiaire) {
		this.numRcPPMBeneficiaire = numRcPPMBeneficiaire;
	}

	public String getNumRcModeRegEco() {
		return numRcModeRegEco;
	}

	public void setNumRcModeRegEco(String numRcModeRegEco) {
		this.numRcModeRegEco = numRcModeRegEco;
	}

	public String getDatRcDateSuspensionRegEco() {
		return datRcDateSuspensionRegEco;
	}

	public void setDatRcDateSuspensionRegEco(String datRcDateSuspensionRegEco) {
		this.datRcDateSuspensionRegEco = datRcDateSuspensionRegEco;
	}

	public String getNumRcEtatRegEco() {
		return numRcEtatRegEco;
	}

	public void setNumRcEtatRegEco(String numRcEtatRegEco) {
		this.numRcEtatRegEco = numRcEtatRegEco;
	}

	public Integer getNumRcNbreMatPremieres() {
		return numRcNbreMatPremieres;
	}

	public void setNumRcNbreMatPremieres(Integer numRcNbreMatPremieres) {
		this.numRcNbreMatPremieres = numRcNbreMatPremieres;
	}

	public String getNumUniteMesure() {
		return numUniteMesure;
	}

	public void setNumUniteMesure(String numUniteMesure) {
		this.numUniteMesure = numUniteMesure;
	}

	public String getNumQteUnitaire() {
		return numQteUnitaire;
	}

	public void setNumQteUnitaire(String numQteUnitaire) {
		this.numQteUnitaire = numQteUnitaire;
	}

	public String getNumNatureRendMT() {
		return numNatureRendMT;
	}

	public void setNumNatureRendMT(String numNatureRendMT) {
		this.numNatureRendMT = numNatureRendMT;
	}

	public Integer getNumRcNumGammeOB() {
		return numRcNumGammeOB;
	}

	public void setNumRcNumGammeOB(Integer numRcNumGammeOB) {
		this.numRcNumGammeOB = numRcNumGammeOB;
	}

	public String getNumPrecisionUemoaOB() {
		return numPrecisionUemoaOB;
	}

	public void setNumPrecisionUemoaOB(String numPrecisionUemoaOB) {
		this.numPrecisionUemoaOB = numPrecisionUemoaOB;
	}

	public String getNumPrecisionSenOB() {
		return numPrecisionSenOB;
	}

	public void setNumPrecisionSenOB(String numPrecisionSenOB) {
		this.numPrecisionSenOB = numPrecisionSenOB;
	}

	public String getNumCodeProduitOB() {
		return numCodeProduitOB;
	}

	public void setNumCodeProduitOB(String numCodeProduitOB) {
		this.numCodeProduitOB = numCodeProduitOB;
	}

	public String getNumRcPPMBeneficiaireOB() {
		return numRcPPMBeneficiaireOB;
	}

	public void setNumRcPPMBeneficiaireOB(String numRcPPMBeneficiaireOB) {
		this.numRcPPMBeneficiaireOB = numRcPPMBeneficiaireOB;
	}

	public String getNumTauxDechet() {
		return numTauxDechet;
	}

	public void setNumTauxDechet(String numTauxDechet) {
		this.numTauxDechet = numTauxDechet;
	}

	public String getNumRcNatProd() {
		return numRcNatProd;
	}

	public void setNumRcNatProd(String numRcNatProd) {
		this.numRcNatProd = numRcNatProd;
	}

	public String getNumTauxRendMNT() {
		return numTauxRendMNT;
	}

	public void setNumTauxRendMNT(String numTauxRendMNT) {
		this.numTauxRendMNT = numTauxRendMNT;
	}

	public String getNumQteImport() {
		return numQteImport;
	}

	public void setNumQteImport(String numQteImport) {
		this.numQteImport = numQteImport;
	}

	public String getNumPrecisionUEMOAMPOB() {
		return numPrecisionUEMOAMPOB;
	}

	public void setNumPrecisionUEMOAMPOB(String numPrecisionUEMOAMPOB) {
		this.numPrecisionUEMOAMPOB = numPrecisionUEMOAMPOB;
	}

	public String getNumPrecisionSENMPOB() {
		return numPrecisionSENMPOB;
	}

	public void setNumPrecisionSENMPOB(String numPrecisionSENMPOB) {
		this.numPrecisionSENMPOB = numPrecisionSENMPOB;
	}

	public String getNumCodeMPOB() {
		return numCodeMPOB;
	}

	public void setNumCodeMPOB(String numCodeMPOB) {
		this.numCodeMPOB = numCodeMPOB;
	}

	public String getNumTypeDechet() {
		return numTypeDechet;
	}

	public void setNumTypeDechet(String numTypeDechet) {
		this.numTypeDechet = numTypeDechet;
	}

	public List getListeRegimeeconomique() {
		return listeRegimeeconomique;
	}

	public void setListeRegimeeconomique(List listeRegimeeconomique) {
		this.listeRegimeeconomique = listeRegimeeconomique;
	}

	public List getListeProduitsfinis() {
		return listeProduitsfinis;
	}

	public void setListeProduitsfinis(List listeProduitsfinis) {
		this.listeProduitsfinis = listeProduitsfinis;
	}

	public List getListeBureaux() {
		return listeBureaux;
	}

	public void setListeBureaux(List listeBureaux) {
		this.listeBureaux = listeBureaux;
	}

	public List getListeGammes() {
		return listeGammes;
	}

	public void setListeGammes(List listeGammes) {
		this.listeGammes = listeGammes;
	}

	public List getListeMatierespremieres() {
		return listeMatierespremieres;
	}

	public void setListeMatierespremieres(List listeMatierespremieres) {
		this.listeMatierespremieres = listeMatierespremieres;
	}

	public void setRegimeEconomique(RegimeEconomique regVo) {
		setNumRcAnneeRegEcoOB(regVo.getRcanneeregeco());
		setNumRcCodeNatRegEco(regVo.getRccodenatregeco());
		setNumRcEtatRegEco(regVo.getRcetatregeco());
		setNumRcModeRegEco(regVo.getRcmoderegeco());
		setNumRcNumRegEcoOB(regVo.getRcnumregeco());
		setNumRcPPMBeneficiaire(regVo.getRcppmbeneficiaire());
		setNumRcRefJuridiqueRegEco(regVo.getRcrefjuridiqueregeco());
		setDatRcDateDecisionRegEco(sysEnv.dateToStr(regVo.getRcdatedecisionregeco()));
		setDatRcDateProRoRegEco(sysEnv.dateToStr(regVo.getRcdateprororegeco()));
		setDatRcDateValiditeRegEco(sysEnv.dateToStr(regVo.getRcdatevaliditeregeco()));
		setNumRcDureeProRoRegEco(regVo.getRcdureeprororegeco());
		setNumRcDureeRegEco(regVo.getRcdureeregeco());
		setNumRcNbreProRoRegEco(regVo.getRcnbreprororegeco());

	}

	public RegimeEconomique getNewRegimeRconomique() {
		RegimeEconomique regVo = new RegimeEconomique();
		regVo.setRcanneeregeco(getNumRcAnneeRegEcoOB());
		regVo.setRccodenatregeco(getNumRcCodeNatRegEco());
		regVo.setRcdatedecisionregeco(sysEnv.strToDate(getDatRcDateDecisionRegEco()));
		regVo.setRcdateprororegeco(sysEnv.strToDate(getDatRcDateProRoRegEco()));
		regVo.setRcdatesuspensionregeco(sysEnv.strToDate(getDatRcDateSuspensionRegEco()));
		regVo.setRcdatevaliditeregeco(sysEnv.strToDate(getDatRcDateValiditeRegEco()));
		regVo.setRcdureeprororegeco(getNumRcDureeProRoRegEco());
		regVo.setRcdureeregeco(getNumRcDureeRegEco());
		regVo.setRcetatregeco(getNumRcEtatRegEco());
		regVo.setRcmoderegeco(getNumRcModeRegEco());
		regVo.setRcnbreprororegeco(getNumRcNbreProRoRegEco());
		regVo.setRcnumregeco(getNumRcNumRegEcoOB());
		regVo.setRcppmbeneficiaire(getNumRcPPMBeneficiaire());
		regVo.setRcrefjuridiqueregeco(getNumRcRefJuridiqueRegEco());
		return regVo;
	}

	public void resetChampDeSaisie() {
		this.numRcAnneeRegEcoOB = null;
		this.numRcNumRegEcoOB = null;
		this.numRcCodeNatRegEco = null;
		this.datRcDateDecisionRegEco = null;
		this.numRcRefJuridiqueRegEco = null;
		this.numRcNbreProRoRegEco = null;
		this.datRcDateValiditeRegEco = null;
		this.datRcDateProRoRegEco = null;
		this.numRcDureeRegEco = null;
		this.numRcDureeProRoRegEco = null;
		this.numRcPPMBeneficiaire= null;
		this.numRcModeRegEco = null;
		this.datRcDateSuspensionRegEco = null;
		this.numRcEtatRegEco = null;

	}

	public void resetChampDeRecherche() {
		this.numRcCodeCreditaireRech = null;
		this.numListRcCodeNatRegEcoRech = null;
		this.datRcDateValiditeRegEcoRech = null;
		this.numRcCodeProdRech = null;
		this.numRcPrecuemoaRech = null;
		this.numRcPrecsenRech = null;
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
