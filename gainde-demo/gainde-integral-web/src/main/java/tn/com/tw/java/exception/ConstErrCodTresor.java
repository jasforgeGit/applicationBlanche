package tn.com.tw.java.exception;

/**
 * 
 * @author Chatbri ALi
 *	le	4 avr. 2006
 */
public class ConstErrCodTresor {
	
    //******************************************************************//
    //				constantes error Cl�s primaires			            //
    //******************************************************************//

	public static final String ppmautorisantKey="error.ppmautorisantKey";
	public static final String ppmautoriseKey="error.ppmautoriseKey";
	public static final String agreeKey="error.agreeKey";
	public static final String creditairesKey="error.creditairesKey";
	public static final String typedecisionKey="error.typedecisionKey";
	public static final String journaltresorKey="error.journaltresorKey";
	public static final String ppmKey="error.ppmKey";
	public static final String typeliquidationKey="error.typeliquidationKey";
	public static final String typeavoirKey="error.typeavoirKey";
    //******************************************************************//
    //				constantes error Champs obligatoires				//
    //******************************************************************//

	public static final String RCLIBELLEDECISION_OB="error.RCLIBELLEDECISION_OB";
	public static final String TRMONTANTPAIEMENT_OB="error.TRMONTANTPAIEMENT_OB";
	public static final String journaltresor_OB="error.journaltresor_OB";
	//public static final String sumCalculNotExist = "error.sumCalculNotExist";
	public static final String TRLIBELLEJOURNAL_OB="error.TRLIBELLEJOURNAL_OB";
	public static final String TRDATEQUITTANCE_OB="error.TRDATEQUITTANCE_OB";
	public static final String TRMONTANTQUITTANCE_OB="error.TRMONTANTQUITTANCE_OB";
	public static final String TRTYPELIQUIDATION_OB="error.TRTYPELIQUIDATION_OB";
	public static final String TRUSERQUITTANCE_OB="error.TRUSERQUITTANCE_OB";
	public static final String CODETYPEDECISION_OB="error.CODETYPEDECISION_OB";
	public static final String NUMDECISION_OB="error.NUMDECISION_OB";
	public static final String PPMBENEFICIAIRE_OB="error.PPMBENEFICIAIRE_OB";
	public static final String TRMODEPAIEMENT_OB="error.TRMODEPAIEMENT_OB";
	public static final String TRNUMDOSRGLTDEF_OB="error.TRNUMDOSRGLTDEF_OB";
	public static final String TRANNEEBL7600_OB = null;
	public static final String TRCODEJOURNAL_OB="error.TRCODEJOURNAL_OB";
	public static final String TRANNEEDECLARATION_OB="error.TRANNEEDECLARATION_OB";
	public static final String TRBURBL7600_OB = null;
	public static final String TRDATEQUITTANCEBL7600_OB = null;
	public static final String TRMONTANTQUITTANCEBL7600_OB = null;
	public static final String TRNUMQUITTANCE_OB="error.TRNUMQUITTANCE_OB";
	public static final String TRNUMBL7600_OB = null;
	public static final String TRANNEEDECL_OB="error.TRANNEEDECL_OB";
	public static final String TRNUMQUITTANCEBL7600_OB = null;
	public static final String TRBURDECLARATION_OB="error.TRBURDECLARATION_OB";
	public static final String TRMODEREGLEMENT_OB = "error.TRMODEREGLEMENT_OB";
	public static final String TRUSERQUITTANCEBL7600_OB = null;
	public static final String TRCODECREDITAIRE_OB="error.TRCODECREDITAIRE_OB";
	public static final String TRDATEBAE_OB="error.TRDATEBAE_OB";
	public static final String TRDATEREGLEMENT_OB="error.TRDATEREGLEMENT_OB";
	public static final String TRETAT_OB="error.TRETAT_OB";
	public static final String TRJOURNALTRESOR_OB="error.TRJOURNALTRESOR_OB";
	public static final String TRMONTANTCOMPTANT_OB="error.TRMONTANTCOMPTANT_OB";
	public static final String TRMONTANTCREDIT_OB="error.TRMONTANTCREDIT_OB";
	public static final String TRNUMDECLARATION_OB="error.TRNUMDECLARATION_OB";
	public static final String TRNUMDOSSIERDEF_OB="error.TRNUMDOSSIERDEF_OB";
	public static final String TRNUMDOSSIERPROV_OB="error.TRNUMDOSSIERPROV_OB";
	public static final String TRTVACREDIT_OB="error.TRTVACREDIT_OB";
	public static final String TRBORNINF = "error.TRBORNINF";
	public static final String DATEAUTORISATION_OB="error.DATEAUTORISATION_OB";
	public static final String TRBORNSUP = "error.TRBORNSUP";
	public static final String TRDATETRANCHES =  "error.TRDATETRANCHES";
	public static final String DATEHISTOAUTO_OB="error.DATEHISTOAUTO_OB";
	public static final String TRTYPETRANCHES = "error.TYPETRANCHES";
	public static final String PPMAUTORISANT_OB="error.PPMAUTORISANT_OB";
	public static final String PPMAUTORISE_OB="error.PPMAUTORISE_OB";
	public static final String REFAUTORISATION_OB="error.REFAUTORISATION_OB";
	public static final String USERAUTORISATION_OB="error.USERAUTORISATION_OB";
	public static final String TRNUMDOSPROV_OB="error.TRNUMDOSPROV_OB";
	public static final String TRDATEAVOIR_OB="error.TRDATEAVOIR_OB";
	public static final String TRMTQUITTANCE_OB="error.TRMTQUITTANCE_OB";
	public static final String TRTYPEAVOIR_OB="error.TRTYPEAVOIR_OB";
	public static final String TRLIBELLEAVOIR_OB="error.TRLIBELLEAVOIR_OB";
	public static final String TRUSERREMB_OB="error.TRUSERREMB_OB";
	public static final String TRDATEREMB_OB="error.TRDATEREMB_OB";
	public static final String TRMONTANTREMB_OB="error.TRMONTANTREMB_OB";
	public static final String modereglementOB = "error.modereglementOB";
	
	
    //******************************************************************//
    //				              messages d'erreurs				    //
    //******************************************************************//

	public static final String dejacreditaire = "error.dejacreditaire";
	public static final String creditdejaretire="error.creditdejaretire";
	public static final String creditaireInexistant="error.creditaireInexistant";
	public static final String ppmInexistant="error.ppmInexistant";
	public static final String creditdejasuspendu="error.creditdejasuspendu";
	public static final String creditnonsuspendu="error.creditnonsuspendu";
	public static final String InvalidDateCredit="error.InvalidDateCredit";
	public static final String InvalidDateCreditIsnull="error.InvalidDateCreditIsnull";
	public static final String InvalidDateDecision="error.InvalidDateDecision";
	public static final String InvalidDateLeveeSuspension="error.InvalidDateLeveeSuspension";
	public static final String InvalidMntRenouvellement="error.InvalidMntRenouvellement";
	public static final String InvalidCreditPourAutorisation="error.InvalidCreditPourAutorisation";
	public static final String InvalidMontantAvoir = "error.InvalidMontantAvoir";
	public static final String InvalidDateDebutDateFin = "error.InvalidDateDebutDateFin";
	public static final String InvalidMntCreditInitial = "error.InvalidMntCreditInitial";
	public static final String invalidDateExtension = "error.InvalidDateExtension";
    public static final String creditExistant="error.creditExistant";
	public static final String creditairesInexistants="error.creditairesInexistants";
	public static final String declarationInexistant="error.declarationInexistant";
	public static final String declarationNonReglableAuCptant="error.declarationNonReglableAuCptant";
	public static final String declarationdejareglee="error.declarationdejareglee";
	public static final String numquittanceExistant="error.numquittanceExistant";
	public static final String reglementnonsaisi = "error.reglementnonsaisi";
	public static final String modereglementExistant="error.modereglementExistant";
	public static final String declarationNonEncoreReglee="error.declarationNonEncoreReglee";
	public static final String numdossierErrone = "error.numdossierErrone";
	public static final String InvalidTotalReglement = "error.InvalidTotalReglement";
	public static final String recouvrementParPdeNonTrouve="error.recouvrementParPdeNonTrouve";
	public static final String recouvrementNonTrouve="error.recouvrementNonTrouve";
	public static final String declarationInexistantPourCeCreditaire="error.declarationInexistantPourCeCreditaire";
	public static final String numquittancenonsaisi="error.numquittancenonsaisi";
	public static final String liquidationSuppInexistant="error.liquidationSuppInexistant";
	public static final String liquidationSuppCreditaireInexistant = "error.liquidationSuppCreditaireInexistant";
	public static final String liquidationSuppDejaRegler="error.liquidationSuppDejaRegler";
	public static final String dossierprovisoireInexistant = "error.dossierprovisoireInexistant";
	public static final String taxesDossierInexistant = "error.taxesDossierInexistant";
	public static final  String operationInexistantPourCeJrnl = "error.operationInexistantPourCeJrnl";

	//	******************************************************************//
    //				              messages de succ�s				    //
    //******************************************************************//

	public static final String creditairecreer="message.creditairecreer";
	public static final String retraiteffectue="message.retraiteffectue";
	public static final String suspensioneffectue="message.suspensioneffectue";
	public static final String leveesuspensioneffectue="message.leveesuspensioneffectue";
	public static final String extensioneffectue="message.extensioneffectue";
	public static final String dossierValider =  "message.dossierValider";
	public static final String renouvellementeffectue="message.renouvellementeffectue";
	public static final String autorisationeffectue="message.autorisationeffectue";
	public static final String autorisationmodifiee="message.autorisationmodifiee";
	public static final String autorisationsupprimee="message.autorisationsupprimee";
	public static final String montantLiqNull = "error.montantLiqNull";
	public static final String numquittancesupprime="message.numquittancesupprime";
	public static final String modereglementsupprime="message.modereglementsupprime";
	public static final String reglementeffectue="message.reglementeffectue";
	public static final String reglementComptanteffectue="message.reglementcomptanteffectue"; 
	public static final String consignationeffectue = "message.consignationeffectue";
	public static final String consignationsupprimee = "message.consignationsupprimee";
	public static final String saisieQuittancePCS = "error.saisieQuittancePCS";
	public static final String saisieQuittancePCC = "error.saisieQuittancePCC";
	public static final String saisieQuittancePCSPCC = "error.saisieQuittancePCSPCC";
	public static final String numquittanceNvalid = "error.numquittanceNvalid";
	public static final String saisieReglementPCS = "error.saisieReglementPCS";
	public static final String saisieReglementPCC = "error.saisieReglementPCC";
	
	
	
	
	
	public ConstErrCodTresor() {
		super();
	}

}