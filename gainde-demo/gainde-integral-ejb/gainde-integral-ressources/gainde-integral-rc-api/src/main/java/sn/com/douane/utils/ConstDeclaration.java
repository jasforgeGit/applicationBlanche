package sn.com.douane.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Chatbri ALi le 8 juin 2006
 */
public class ConstDeclaration {

    /**
     *  
     */
    public ConstDeclaration() {
        super();
    }

    //*************************************************************************
    // 		constants Type Apurement
    //*************************************************************************
    
    public static final String ConstantTypeApurDepot = "7";
    
    public static final String ConstantTypeApurPassavant = "6";
    
    public static final String ConstantTypeApurManifeste = "1";

    public static final String ConstantTypeApurDepotProv = "2";

    public static final String ConstantTypeApurTitrPrec = "3";

    public static final String ConstantTypeApurAutre = "4";

    public static final String ConstantTypeDLPP = "5";

    public static final String ConstantTypeRegimeSuspensif = "S";

    public static final String ConstantTypeRegimeSuspensifS1 = "S1";

    public static final String ConstantTypeRegimeSuspensifS2 = "S2";

    public static final String ConstantTypeRegimeSuspensifS3 = "S3";

    public static final String ConstantTypeRegimeSuspensifS4 = "S4";

    public static final String ConstantTypeRegimeSuspensifS5 = "S5";

    public static final String ConstantTypeRegimeExport = "E";

    public static final String ConstantTypeRegimeReexport = "R";

    public static final String ConstantTypeRegimeSuspensif1 = "1";

    public static final String ConstantTypeRegimeSuspensif2 = "2";

    public static final String ConstantTypeRegimeSuspensif3 = "3";

    public static final String ConstantTypeRegimeSuspensif4 = "4";

    public static final String ConstantTypeRegimeSuspensif5 = "5";
    
    public static final String ConstantTypeRegimeMiseCons = "C";

    //Num�ro du premier article de la d�claration
    public static final String ConstantNumPremierArt = "1";

    //Controle PVI
    public static final BigDecimal ConstantMontantPVIMin = new BigDecimal(
            1500000);

    public static final BigDecimal ConstantMontantPVIMax = new BigDecimal(
            3000000);

    // Controle Valeur en Douane
    public static final BigDecimal ConstantValEnDouane= new BigDecimal(
            2000000000);
    
    //public static final String[] ConstRegimePVI = {"21","22","23","24","25","26","30","31","32","33",
	//											   "38","39","10","11","12","13","40","80","90"};
	
    //*************************************************************************
    // 		constants module sommier
    //*************************************************************************
    public static final String ctxMenuCreationHistSommier = "creationHistSommier";

    public static final String ctxMenuModificationHistSommier = "modificationHistSommier";

    public static final String ctxMenuConsultationHistSommier = "consultationHistSommier";

    public static final String ctxMenuTransfertHistSommier = "transfertHistSommier";

    public static final String ctxMenuMutationATTransfert = "mutationDeclDemandeTransfertDecl";

    public static final String ctxMenuMutationRecep = "mutationDeclDemandeAcceptDecl";

	public static final String AcceptDdeAnnullSuccess = "message.AcceptDdeAnnullSuccess";
	public static final String RefusDdeAnnullSuccess = "message.RefusDdeAnnullSuccess";

    public static final String ctxMenuCessionSommier = "cessionSommier";

    public static final String ctxMenuConsultationSommier = "consultationSommier";

    public static final String ActionCreate = "creation";

    public static final String ActionEdit = "modification";

    public static final String ActionShow = "consultation";

    public static final String RepriseSommierModedecl = "1";

    public static final String RepriseSommierModePayem = "1";

    public static final String RepriseSommierTypeApurement = "4";

    public static final Date premiumDate = ConvertUtil
            .convertStringToDate("01/01/1901");

    public static final String apurementConstIncendie = "2";

    public static final String apurementConstVol = "1";

    public static final String apurementConstDestruction = "3";

    public static final String apurementLibIncendie = "incendie";

    public static final String apurementLibVol = "vol";

    public static final String apurementLibDestruction = "destruction";

    //	*************************************************************************
    // 		constants module decl transbordement
    //*************************************************************************
    public static final String ctxMenuCreationDeclTransb = "creationDeclarationTransb";

    public static final String ctxMenuModificationDeclTransb = "modificationDeclarationTransb";

    public static final String ctxMenuConsultationBrDeclTransb = "consultationDeclarationBrTransb";

    public static final String ctxMenuConsultationDeclTransb = "consultationDeclarationTransb";

    public static final String ctxMenuEnregDeclTransb = "enregistrementDeclarationTransb";

    public static final String listModeTransport = "listModeTransport";

    public static final String listModeTransbordement = "listModeTransbordement";

    public static final String listOuvraison = "listOuvraison";

    public static final String listDispenseCosec = "listDispenseCosec";

    public static final String listeResultatsVisiteVal = "listeResultatsVisiteVal";

    public static final String listeResultatsVisiteEle = "listeResultatsVisiteEle";
    
    public static final String listOuiNon = "listOuiNon";

    //-------------------------------------------------------------------------
    // 		constants module demandes decl
    //-------------------------------------------------------------------------
    public static final String ctxMenuDemandeRectifDeclDetail = "demandeRectificationDeclDetail";

    public static final String ctxMenuDemandeAnnulationDeclDetail = "demandeAnnulationDeclDetail";

    public static final String ctxMenuDemandeRegulDeclDetail = "demandeRegularisationDeclDetail";

    public static final String ConstantYes = "1";

    public static final String ConstantNo = "0";
    
    public static final String ConstantStrYes = "O";

    public static final String ConstantStrNo = "N";

    public static final String ConstantEtatRectif_0 = null;

    public static final String ConstantEtatRectif_1 = "R";

    public static final String ConstantEtatDeclaration_0 = "0";

    public static final String ConstantEtatDeclaration_1 = "1";
    
    //Gestion du circuit ferm�: declaration transmis par le chef de bureau au chef de visite. 
    public static final String ConstantEtatDeclaration_3 = "3";

    //Gestion du circuit ferm�: declaration transmis par le chef de section au chef de bureau.
    public static final String ConstantEtatDeclaration_2 = "2";
    
    //Gestion du circuit ferm�: declaration transmis par le chef de bureau au chef de section.
    public static final String ConstantEtatDeclaration_4 = "4";
    
    public static final String ConstantDdeRectification = "R";

    public static final String ConstantDmdModification = "M";

    /**
     * @author Ahmad@ATD
     * Demande de rectification des conteneurs attach�s
     */
    public static final String ConstantDdeRectifCont = "C";

    public static final String ConstantTypeTraitement = "M";

    public static final String ConstantDdeAnnulation = "A";

    public static final String ConstantDdeEnvoyee = "E";

    public static final String ConstantDdeRegularisation = "G";

    public static final String ConstantDdeRectifDecl_IndCalcul_1 = "1";

    public static final String ConstantDdeRectifDecl_IndConteneur_1 = "1";

    public static final String ConstantDdeRectifDecl_IndCalcul_0 = "0";

    public static final String ConstantDdeRectifDecl_IndConteneur_0 = "0";

    public static final String ConstantModeDeclACompleter = "DEAC";

    public static final String ConstantTypeRegimeSuspensif_S = "S";

    public static final String IndicateurOuvraison = "INDGMP";
    
    public static final String IndicateurOuvraisonF = "INDGMPF";
    
    public static final String IndicateurTransit = "INDTRA";
    
    public static final String IndicateurExo = "YDES83";

    public static final String PPM_SAR = "00706";

    public static final String Pays_SN = "SN";
    
    public static final String Pays_SAR = "SAR";

    public static final String Disp_COSEC = "COSEC";

    public static final String COSEC = "10";

    //-------------------------------------------------------------------------
    //	 LISTES DES DIFFERENTS MODE DE DECLARATION
    //-------------------------------------------------------------------------

    public static final String ModdecDEP = "DEP";

    public static final String ModdecDES = "DES";

    public static final String ModdecAPDE = "APDE";

    public static final String ModdecAPE = "APE";

    //-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS TRAITTAXATION
    //-------------------------------------------------------------------------
    public static final String CodDroitDouane = "01";

    public static final String CodDroitFiscal = "02";

    public static final String CodTVA = "05";

    public static final String CodTE = "55";

    public static final String Val1UniteLiq = "1";

    public static final String Val2UniteLiq = "2";

    public static final String Basetaxe1 = "1";

    public static final String TypeMerc = "1";

    public static final String RegNonTaxable = "0";
    public static final String RegTaxable = "1";

    public static final String IndicateurRegNonExo = "0";

    public static final String IndicateurRegExo = "1";

    public static final String IndicateurRegNonSusp = "0";

    public static final String IndicateurRegSusp = "1";

    public static final String IndicateurRegSuspPart = "1";

    public static final String IndicateurRegSuspTot = "2";

    public static final String IndicateurSuspPartiel = "INDSUSPPARTIEL";

    public static final String ValImportExport = "0";

    public static final Integer NbreDecimal = Integer.valueOf(2);

	public static final String codeTaxePCS = "30";
	public static final String codeTaxePCC = "31";

    //-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS TRAIENREGISTREMENT
    //-------------------------------------------------------------------------

    public static final String TypeCreditAdministratif = "1";

    public static final String IndTaxeComptant = "1";

    public static final String Modepaiementcompt = "1";

    public static final String Modepaiementcredit = "2";

    public static final String Modepaiementmixte = "3";

    public static final String libModepaiementcompt = "PAIEMENT COMPTANT";

    public static final String libModepaiementcredit = "PAIEMENT CREDIT";

    public static final String libModepaiementmixte = "PAIEMENT MIXTE";

    public static final String TypeApurTitrPrec = "3";

    public static final String TypeImputation = "1";
    
    public static final String TYPEIMPUTANNULATION = "2";

    public static final String Cirvisitauto = "B";

    public static final String TypeapurManifeste = "1";

    public static final String TypeapurSommier = "4";

    public static final String TypeapurDepotprovis = "2";

    public static final String NatureApurementDeclaration = "5";
    public static final String NatureApurementAnnulationDeclaration = "6";
    public static final String Valregulval = "0";

    public static final String IndSuspension = "1";

    //-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS TRAITDEP
    //-------------------------------------------------------------------------
    public static final String Attentevalidation = "AV";

    public static final String Codetypedecisionsuspension = "S";

    public static final String Attentereglement = "AR";

    public static final String Attentebae = "AB";

    public static final String Traite = "TR";

    //
    //
    public static final String RectificationDone = "message.AcceptDdeRectifSuccess"; 
    
    public static final String RegularisationDone = "message.AcceptDdeRegulSuccess";
    
    public static final String ModificationDone = "message.AccepterModification";

    public static final String RejetRectificationDone = "message.RefusDdeRectifSuccess";

    public static final String MiseDepotDeclarationDone = "Mise en depot effectu�e";

    public static final String RejetMiseDepotDeclarationDone = "Mise en depot rejet�e";

    public static final String LeveeDepotDone = "Levee de depot effectuee";

    //	-------------------------------------------------------------------------
    //	 CONSTANTES POUR DETERMINER LE TYPE DE TAXES
    //-------------------------------------------------------------------------
    public static final String taxeTarifaire = "01";

    public static final String taxePrelevement = "02";
    
    public static final String taxeTresor = "03";
    
    public static final String interetRetard = "09";

    //	-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS MESSAGERIE
    //-------------------------------------------------------------------------
    public static final String ConstImmediat = "I";

    public static final String ConstUtilisateur = "U";

    public static final String ConstSysteme = "S";

    public static final String ConstEmission_1 = "1";

    public static final String ConstEmission_2 = "2";

    public static final String ConstEmission_3 = "3";

    public static final String ConstEmission_4 = "4";

    public static final String ConstEmission_5 = "5";

    public static final String listTypeMessage = "listTypeMessage";

    public static final String listEtatEmission = "listEtatEmission";

    public static final String codeFoncMessagerie = "DEC034";

    public static final String codeFoncDdeRectifAnnulDec = "DEC012";

    public static final String codeFoncDdeRegulDec = "DEC007";

    public static final String codeMessagerie = "MESS";

    public static final String codeFoncConvocVisite = "DOU004";

    //-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS SOMMIERS
    //-------------------------------------------------------------------------

    // Mise en d�pot
    public static final String etatSommier_A = "A";

    // Main lev�e d�pot
    public static final String etatSommier_L = "L";

	public static final String etatSommier_S = "S";
	public static final String etatSommier_C = "C";
	public static final String etatSommier_D = "D";

    //	-------------------------------------------------------------------------
    //	 CONSTANTES UTILISEES DANS DLPP
    //-------------------------------------------------------------------------

    // Mise en d�pot
    public static final String ConstantImportationDirecte = "0";

    public static final String ConstantApurementManifeste = "7";

    public static final String ConstantIndProdPetrolier = "1";

    // Main lev�e d�pot
    public static final String ConstantSuiteDepot = "8";

    // Suite d�pot
    public static final String ConstantSuiteOuvraison = "9";
    
    // Main lev�e d�pot
    public static final String MODE_PAYMENT_FCL = "1";

    //	-------------------------------------------------------------------------
    //	 CONTEXTE DANS COMPTABILITE BUREAU
    //-------------------------------------------------------------------------
    public static final String CTXMENUCPTABUR = "ctxcptabur";
    public static final String ctxMenuComptaJrnal = "cptaJrn";
    
    public static final String ctxMenuComptaMens = "cptaMens";
    
    public static final String ctxMenuComptaAn = "cptaAn";
    
    //@Amadou BA
    public static final String bureautest = "99Z";

    //------------------//
    //Constantes pour le champs niveauException de la table ExeptionTaxes
    //------------------//
    public static final String Seggendec="SEGGENDEC";
    public static final String Brseggendec="BRSEGGENDEC";
    public static final String Brsegartdec="BRSEGARTDEC";
    public static final String Segartdec="SEGARTDEC";
    public static final String Dderectifartdecl="DDERECTIFARTDECL";
    public static final String Articlevisite="Articlevisite";

    public static final String typeConvocationVisite="1";
	public static final String EXOAV = "exon�ration av";

	public static final String SuccessRegularisation = "message.SuccessRegularisation";

	public static final String NatureApurementRectifDeclaration = "9";
	
	public static final String NatureApurementRegulDeclaration = "G";

	public static final String TypeapurAutre = "4";
	
	public static final String INDESOU = "INDESOU";
	
	public static final String INDSSOU = "INDSSOU";
	
	// Mois@
	public static final String AcceptDdeRectifContArtDec="message.AcceptDdeRectifContArtDec";
	public static final String RejectDdeRectifContArtDec="message.RejectDdeRectifContArtDec";
	public static final String ErreurDdeRectifContArtDec="message.ErreurDdeRectifContArtDec";
	
	//-----------------------------------------------------------------------------------------------------------------------//
	//------------------------ CONSTANTES POUR LA VALIDATION DU DOSSIER DE REGLEMENT DEFINITIF TRESOR -----------------------//
	//-----------------------------------------------------------------------------------------------------------------------//
	public static final String DECINDQUITTANCE = "1";
	public static final String DECNUMQUITTANCE = "CONTRL";
	
	//-----------------------------------------------------------------------------------------------------------------------//
		//------------------------ CONSTANTES POUR LES BUREAUX SECONDAIRES -----------------------//
		//-----------------------------------------------------------------------------------------------------------------------//
		public static final String[] BUREAU_SECONDAIRE = {"60K","16F","17G","15M","11C"};
		public static final String[] BUREAUX_EXO_PVI = {"60K","16F","17G","15M"};
		
		//------------------------ CONSTANTES POUR CONTROLER PRODUITS ACTIFS -----------------------//
		public static final String PRODACTIF = "O";
		
		//------------------------ CONSTANTES POUR DEMANDES DE MISE EN DEPOT -----------------------//
		public static final String TRAITE_PAR_LE_CSDN = "7";
		public static final String PARTIELLEMNT_APUREE = "10";
		public static final String TOTALEMENT_APUREE = "11";
	
}