package tn.com.tw.java.exception;

/**
 * @author user
 * 
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class ConstErrCodRC {

	public static final String accessdenied = "error.fonctionAccessDenied";
    
	public static final String transactionFailed = "error.failedTransaction";

    public static final String dupkeyinsert = "error.dupkeyinsert";

    public static final String delegationExistante = "error.delegationExistante";

    public static final String delegationSupprimee = "error.delegationSupprimee";

    public static final String rowNotFound = "error.rowNotFound";

    public static final String ppmNotFound = "error.ppmNotFound";

    public static final String agentNotFound = "error.agentNotFound";

    public static final String fieldChanged = "error.fieldChanged";

    public static final String etatConnected = "1";
    
    public static final String keyContraint="error.key";
    public static final String notSuccefulInsert="error.notSuccefulInsert";
    public static final String notSuccefulUpdate="error.notSuccefulUpdate";

    // d�clench�e
    // si la
    // valeur de
    // dao et de
    // cmp n'est
    // pas
    // synchronis�

    public static final String namingExp = "error.namingExp";//Exception est

    // d�clench�e
    // s'ilya eu un
    // probl�me li� au
    // cmp ou bien un
    // probl�me de
    // connection � la
    // base

    public static final String insertExp = "error.insertExp";//exception

    // d�clench� lors
    // d'insertion d'un
    // champs �trang�
    // qui ne
    // correspond pas
    // au parent ou
    // lorsque un
    // champs not null
    // n'est pas
    // remplit ou il ya
    // un probl�me de
    // connexion � la
    // base ou un
    // probl�me g�n�ral
    // de la base

    public static final String ejbExp = "error.ejbExp";

    public static final String removeExp = "error.removeExp";

    public static final String remoteExpSB = "error.remoteExpSB";

    public static final String removeExpSB = "error.removeExpSB";

    public static final String PkRequired = "error.PkRequired";
    
    public static final String succesfullValidate="message.successfullValidate";
    public static final String succefulInsert = "message.succefulInsert";
    public static final String PpmDoesNotExist ="message.PpmDoesNotExist";
    public static final String NumRegPrefDoesNotExist ="message.NumRegPrefDoesNotExist";
    public static final String creditaireExistedeja = "message.creditaireExistedeja";
    public static final String ppmWithoutNinea = "message.ppmWithoutNinea";
    public static final String errorNinea = "message.errorNinea";
    public static final String ppmWithoutCreditaire ="message.ppmWithoutCreditaire";
    public static final String erreurQuittanceexclue = "message.erreurQuittanceexclue";
    public static final String erreurQuittance = "message.erreurQuittance";
    public static final String succefulInsertTrancheQuittance = "message.succefulInsertTrancheQuittance";
    public static final String succefulInsertExclusionQuittance = "message.succefulInsertExclusionQuittance";
    
    
    public static final String succefulInsertArchiveTranche = "message.succefulInsertArchiveTranche";
    public static final String succefulInsertDesrchiveTranche = "message.succefulInsertDesarchiveTranche";
    public static final String erreurTranche = "message.erreurTrancheTranche";
    
    public static final String erreurTrancheborne = "message.erreurTrancheborne";
    public static final String erreurArchiveTranche = "message.erreurArchiveTranche";
    public static final String erreurDesarchiveTranche = "message.erreurDesarchiveTranche";

    public static final String succefulCopy = "message.succefulCopy";

    public static final String succefulUpdate = "message.succefulUpdate";
    
    public static final String produitError = "error.produitError";

    public static final String succefulDelete = "message.succefulDelete";

    public static final String succefullRecevabilite = "message.succefullRecevabilite";

    public static final String InspecifiedError = "error.InspecifiedError";

    public static final String succefulInsertTable = "message.succefulInsertTable";

    public static final String succefulSave = "message.succefulSave";

    public static final String RCSPECIALISATION_OB = "error.RCSPECIALISATION_OB";

    public static final String RCNBREUNITEVISITE_OB = "error.RCNBREUNITEVISITE_OB";

    public static final String foreignKey = "error.foreignKey";

    public static final String SQLException = "error.SQLException";

    public static final String loginError = "error.loginError";

    public static final String radioNotSelected = "S�lectionnez un �lement de la liste !";

    public static final String succefulGenXML = "message.succefulGenXML";

    public static final String fullGenXML = "error.fullGenXML";

    //******************************************************************//
    //				constantes ressources module communes //
    //******************************************************************//
    public static final String DetailNotFound = "error.DetailNotFound";

    public static final String foreignKeyBureaudouaneLocal = "error.foreignKeyBureaudouaneLocal";

    public static final String foreignKeyTypeconteneurLocal = "error.foreignKeyTypeconteneurLocal";

    public static final String foreignKeyTypevoieLocal = "error.foreignKeyTypevoieLocal";

    public static final String foreignKeyLieuembarquementLocal = "error.foreignKeyLieuembarquementLocal";

    public static final String foreignKeyModeconditionnementLocal = "error.foreignKeyModeconditionnementLocal";

    public static final String foreignKeyConsignatairesLocal = "error.foreignKeyConsignatairesLocal";

    public static final String foreignKeyTypesensvoyLocal = "error.foreignKeyTypesensvoyLocal";

    public static final String foreignKeyTypenavireLocal = "error.foreignKeyTypenavireLocal";

    public static final String UnknownHost = "error.UnknownHost";

    public static final String foreignKeyTypenaturecargLocal = "error.foreignKeyTypenaturecargLocal";

    public static final String ioInexist = "error.ioInexist";

    public static final String foreignKeyTypemanifesteLocal = "error.foreignKeyTypemanifesteLocal";

    public static final String foreignKeyTypedestfiscalLocal = "error.foreignKeyTypedestfiscalLocal";

    public static final String foreignKeyPaysLocalProv = "error.foreignKeyPaysLocalProv";

    public static final String foreignKeyTypeapurement = "error.foreignKeyTypeapurement";

    public static final String foreignKeyPaysLocalOrigine = "error.foreignKeyPaysLocalOrigine";

    public static final String foreignKeyModetransportLocal = "error.foreignKeyModetransportLocal";

    public static final String outofmemory = "error.outofmemory";

    public static final String foreignKeyCompagnieassisteeLocal = "error.foreignKeyCompagnieassisteeLocal";

    public static final String foreignKeyBrouillonsegartLocal = "error.foreignKeyBrouillonsegartLocal";

    public static final String foreignKeyPpmLocalDestinataire = "error.foreignKeyPpmLocalDestinataire";

    public static final String foreignKeyPpmLocalAOrdrede = "error.foreignKeyPpmLocalAOrdrede";

    public static final String foreignKeyPaysLocal = "error.foreignKeyPaysLocal";

    public static final String ioMail = "error.ioMail";

    public static final String foreignKeyBrouillonsegenmanLocal = "error.foreignKeyBrouillonsegenmanLocal";

    public static final String foreignKeyPaysLocalPavillon = "error.foreignKeyPaysLocalPavillon";

    public static final String erreurRecherche = "error.recherche";

    public static final String foreignKeyBureaudouaneLocalEntree = "error.foreignKeyBureaudouaneLocalEntree";

    public static final String foreignKeyBureaudouaneLocalEnreg = "error.foreignKeyBureaudouaneLocalEnreg";

    public static final String foreignKeyLieudepotLocal = "error.foreignKeyLieudepotLocal";

    public static final String foreignKeyDderecondartmanLocal = "error.foreignKeyDderecondartmanLocal";

    public static final String foreignKeyDderectifartmanLocal = "error.foreignKeyDderectifartmanLocal";

    public static final String foreignKeyMessagesLocal = "error.foreignKeyMessagesLocal";

    public static final String foreignKeyUtilisateurLocal = "error.foreignKeyUtilisateurLocal";

    public static final String foreignAgreeKey = "error.foreignAgreeKey";

    public static final String foreignBurDepProvKey = "error.foreignBurDepProvKey";

    public static final String foreignBurDestSenKey = "error.foreignBurDestSenKey";

    public static final String foreignBurdestUemoaKey = "error.foreignBurdestUemoaKey";

    public static final String foreignBureauEnregKey = "error.foreignBureauEnregKey";

    public static final String foreignBurEnregManifKey = "error.foreignBurEnregManifKey";

    public static final String foreignBurFrontKey = "error.foreignBurFrontKey";

    public static final String foreignCreditaireKey = "error.foreignCreditaireKey";

    public static final String foreignModeDecKey = "error.foreignModeDecKey";

    public static final String foreignModeTranspKey = "error.foreignModeTranspKey";

    public static final String foreignPaysDestDefKey = "error.foreignPaysDestDefKey";

    public static final String foreignPaysDestKey = "error.foreignPaysDestKey";

    public static final String foreignPaysProvKey = "error.foreignPaysProvKey";

    public static final String foreignPpmDestinataireKey = "error.foreignPpmDestinataireKey";

    public static final String foreignPpmExpediteurKey = "error.foreignPpmExpediteurKey";

    public static final String foreignTypeApurementKey = "error.foreignTypeApurementKey";

    public static final String foreignTypeRegimeKey = "error.foreignTypeRegimeKey";

    public static final String foreignBrouilloneggendecKey = "error.foreignBrouilloneggendecKey";

    public static final String foreignDeviseAssurKey = "error.foreignDeviseAssurKey";

    public static final String foreignDeviseAutreKey = "error.foreignDeviseAutreKey";

    public static final String foreignDeviseFretKey = "error.foreignDeviseFretKey";

    public static final String foreignDeviseFactKey = "error.foreignDeviseFactKey";

    public static final String foreignDeviseFobKey = "error.foreignDeviseFobKey";

    public static final String foreignPpmDeclarantKey = "error.foreignPpmDeclarantKey";

    public static final String foreignProduitsKey = "error.foreignProduitsKey";

    public static final String foreignPRGAssurKey = "error.foreignPRGAssurKey";

    public static final String foreignPRGFactKey = "error.foreignPRGFactKey";

    public static final String foreignPRGFretKey = "error.foreignPRGFretKey";

    public static final String foreignPRGFobKey = "error.foreignPRGFobKey";

    public static final String foreignPRGAutresKey = "error.foreignPRGAutresKey";

    public static final String foreignPaysOrigineKey = "error.foreignPaysOrigineKey";

    public static final String foreignPaysDestinationKey = "error.foreignPaysDestinationKey";

    public static final String foreignPaysDocMisConsKey = "error.foreignPaysDocMisConsKey";

    public static final String foreignRegimeFiscalKey = "error.foreignRegimeFiscalKey";

    public static final String chaineKey = "error.chaineKey";

    public static final String critereKey = "error.critereKey";

    public static final String etatdossierKey = "error.etatdossierKey";

    public static final String rcImpossibleDelete = "error.RcImpossibleDelete";

    public static final String erreurUpdate = "error.erreurUpdate";

    public static final String listeTableBase = "listeTableBase";

    public static final String listeOrigineDeclaration = "listeOrigineDeclaration";

    public static final String listeChampsTable = "listeChampsTable";

    public static final String listeCritere = "listeCritere";

    public static final String listeOperateur = "listeOperateur";

    public static final String listeTypeChamps = "listeTypeChamps";

    public static final String erreurAffichage = "erreurAffichage";

    public static final String isChaineExiste = "existe";

    public static final String CODEPPM_OB = "error.CODEPPM_OB";

    public static final String RCCODEAGENT_OB = "error.RCCODEAGENT_OB";

    public static final String RCINDAUT_OB = "error.RCINDAUT_OB";

    public static final String RCINDRECEVAB_OB = "error.RCINDRECEVAB_OB";

    public static final String RCCODEEXCEPTION_OB = "error.RCCODEEXCEPTION_OB";

    public static final String RCCODECATREGROUP_OB = "error.RCCODECATREGROUP_OB";

    public static final String RCTERMINALMAJ_OB = "error.RCTERMINALMAJ_OB";

    public static final String RCDATEMAJ_OB = "error.RCDATEMAJ_OB";

    public static final String RCCODEUSERMAJ_OB = "error.RCCODEUSERMAJ_OB";

    public static final String RCCODEMODEDEC_OB = "error.RCCODEMODEDEC_OB";

    public static final String RCINDICATEURVALEUR_OB = "error.RCINDICATEURVALEUR_OB";

    public static final String RCNUMREGIMEPREF_OB = "error.RCNUMREGIMEPREF_OB";

    public static final String RCNUMCARTEAGREE_OB = "error.RCNUMCARTEAGREE_OB";

    public static final String typemanifesteKey = "error.typemanifesteKey";

    public static final String RCCOMPETENCE_OB = "error.RCCOMPETENCE_OB";

    public static final String RCGENREBUR_OB = "error.RCGENREBUR_OB";

    public static final String RCLIBELLEBURDOUANE_OB = "error.RCLIBELLEBURDOUANE_OB";

    public static final String RCTYPEBURDOUANE_OB = "error.RCTYPEBURDOUANE_OB";

    public static final String typebureauKey = "error.typebureauKey";

    public static final String compbureauKey = "error.compbureauKey";

    public static final String genrebureauKey = "error.genrebureauKey";

    public static final String RCLIBELLEBURUEMOA_OB = "error.RCLIBELLEBURUEMOA_OB";

    public static final String RCLIBELLECHAPITRE_OB = "error.RCLIBELLECHAPITRE_OB";

    public static final String RCDESCIRCUITVISITE_OB = "error.RCDESCIRCUITVISITE_OB";

    public static final String RCLIBELLECLASSE_OB = "error.RCLIBELLECLASSE_OB";

    public static final String NOMCIEASSISTEE_OB = "error.NOMCIEASSISTEE_OB";

    public static final String RCDESCOMPETENCES_OB = "error.RCDESCOMPETENCES_OB";

    public static final String RCCOURSDEVISE_OB = "error.RCCOURSDEVISE_OB";

    public static final String RCLIBELLEDEVISE_OB = "error.RCLIBELLEDEVISE_OB";

    public static final String RCLIBFONCTION_OB = "error.RCLIBFONCTION_OB";

    public static final String RCORDREAFFICHAGE_OB = "error.RCORDREAFFICHAGE_OB";

    public static final String RCDESGENREBUREAU_OB = "error.RCDESGENREBUREAU_OB";

    public static final String RCCODEPAYS_OB = "error.RCCODEPAYS_OB";

    public static final String RCTYPELIEUEMB_OB = "error.RCTYPELIEUEMB_OB";

    public static final String paysKey = "error.paysKey";

    public static final String typelieuembKey = "error.typelieuembKey";

    public static final String CODEDESTINATAIRE_OB = "error.CODEDESTINATAIRE_OB";

    public static final String CODEEMETTEUR_OB = "error.CODEEMETTEUR_OB";

    public static final String utilisateurKey = "error.utilisateurKey";

    public static final String RCMESSAGEERREUR_OB = "error.RCMESSAGEERREUR_OB";

    public static final String RCLIBELLEMODECOND_OB = "error.RCLIBELLEMODECOND_OB";

    public static final String modedeclarationKey = "error.modedeclarationKey";

    public static final String RCLIBELLEMODETRANS_OB = "error.RCLIBELLEMODETRANS_OB";

    public static final String RCDESFISCALITE_OB = "error.RCDESFISCALITE_OB";

    public static final String RCDDEBUTNBRECONN_OB = "error.RCDDEBUTNBRECONN_OB";

    public static final String RCINDDEBUTNBRECONN_OB = "error.RCINDDEBUTNBRECONN_OB";

    public static final String RCINDFINTNBRECONN_OB = "error.RCINDFINTNBRECONN_OB";

    public static final String supprDetailInterdite = "error.supprDetailInterdite";

    public static final String RCSCORENBRECONN_OB = "error.RCSCORENBRECONN_OB";

    public static final String VALEURINDICE_OB = "error.VALEURINDICE_OB";

    public static final String fonctionnalitesKey = "error.fonctionnalitesKey";

    public static final String rcUnrecordablePpm = "error.rcUnrecordablePpm";

    public static final String RCCIRCUITVISITE_OB = "error.RCCIRCUITVISITE_OB";

    public static final String RCCODEDEVISE_OB = "error.RCCODEDEVISE_OB";

    public static final String RCCODELANGUE_OB = "error.RCCODELANGUE_OB";

    public static final String RCLIBELLEPAYS_OB = "error.RCLIBELLEPAYS_OB";

    public static final String RCNATUREFISCALITE_OB = "error.RCNATUREFISCALITE_OB";

    public static final String RCPAYSALPHABETIQUE_OB = "error.RCPAYSALPHABETIQUE_OB";

    public static final String circuitvisiteKey = "error.circuitvisiteKey";

    public static final String naturefiscaliteKey = "error.naturefiscaliteKey";

    public static final String devisesKey = "error.devisesKey";

    public static final String langueKey = "error.langueKey";

    public static final String agreeKey = "error.agreeKey";

    public static final String consignatairesKey = "error.consignatairesKey";

    public static final String creditairesKey = "error.creditairesKey";

    public static final String importexportKey = "error.importexportKey";

    public static final String chapitreKey = "error.chapitreKey";

    public static final String classeKey = "error.classeKey";

    public static final String RCLIBELLEREGIME_OB = "error.RCLIBELLEREGIME_OB";

    public static final String RCREGIMETAXABLE_OB = "error.RCREGIMETAXABLE_OB";

    public static final String regimefiscalKey = "error.regimefiscalKey";

    public static final String typeregimedouaneKey = "error.typeregimedouaneKey";

    public static final String RCLIBELLEREGIMEFISCAL_OB = "error.RCLIBELLEREGIMEFISCAL_OB";

    public static final String RCLIBELLEREGROUP_OB = "error.RCLIBELLEREGROUP_OB";

    public static final String RCSCORE_OB = "error.RCSCORE_OB";

    public static final String RCSQLTRAITEMENT_OB = "error.RCSQLTRAITEMENT_OB";

    public static final String RCORDRECALCUL_OB = "error.RCORDRECALCUL_OB";

    public static final String taxescumulKey = "error.taxescumulKey";

    public static final String taxesrefKey = "error.taxesrefKey";

    public static final String RCDESDISPENSE_OB = "error.RCDESDISPENSE_OB";

    public static final String RCCONDITION_OB = "error.RCCONDITION_OB";

    public static final String RCFORMULE_OB = "error.RCFORMULE_OB";

    public static final String RCDATEPIECEJOINTE_OB = "error.RCDATEPIECEJOINTE_OB";

    public static final String RCDESPIECEJOINTE_OB = "error.RCDESPIECEJOINTE_OB";

    public static final String RCLIBELLECritere_OB = "error.RCLIBELLECritere_OB";

    public static final String Rclibelleoperateur_OB = "error.Rclibelleoperateur_OB";

    public static final String Rcsymboleoperateur_OB = "error.Rcsymboleoperateur_OB";

    public static final String RCVALEUR_OB = "error.RCVALEUR_OB";

    public static final String RCCODEOPERATEUR_OB = "error.RCCODEOPERATEUR_OB";

    public static final String RCCODEAGREE_OB = "error.RCCODEAGREE_OB";

    public static final String RCCODEIMPEXP_OB = "error.RCCODEIMPEXP_OB";

    public static final String RCCODEREGROUPEMENT_OB = "error.RCCODEREGROUPEMENT_OB";

    public static final String RCNUMENTREPRISE_OB = "error.RCNUMENTREPRISE_OB";

    public static final String RCCODETAXEBASE_OB = "error.RCCODETAXEBASE_OB";

    public static final String DECANNEEDECLARATION_OB = "error.DECANNEEDECLARATION_OB";

    public static final String DECCODEPPMDECLARANT_OB = "error.DECCODEPPMDECLARANT_OB";

    public static final String DECNUMARTDECL_OB = "error.DECNUMARTDECL_OB";

    public static final String DECNUMREPERTOIRE_OB = "error.DECNUMREPERTOIRE_OB";

    public static final String brouillonartdecKey = "error.brouillonartdecKey";

    public static final String RCCODEBURDOUANE_OB = "error.RCCODEBURDOUANE_OB";

    public static final String RCCODEBURFRANCHISE_OB = "error.RCCODEBURFRANCHISE_OB";

    public static final String RCLIBBURFRANCHISE_OB = "error.RCLIBBURFRANCHISE_OB";

    public static final String succefulDeleteTable = "message.succefulDeleteTable";

    public static final String RCCODEBURUEMOA_OB = "error.RCCODEBURUEMOA_OB";

    public static final String RCCODEBURDECL_OB = "error.RCCODEBURDECL_OB";

    public static final String RCMODEDECL_OB = "error.RCMODEDECL_OB";

    public static final String RCLIBCATREGROUP_OB = "error.RCLIBCATREGROUP_OB";

    public static final String RCCODEPJ_OB = "error.RCCODEPJ_OB";

    public static final String catregroupKey = "error.catregroupKey";

    public static final String RCDATEAPPLICATION_OB = "error.RCDATEAPPLICATION_OB";

    public static final String RCIMPEXP_OB = "error.RCIMPEXP_OB";

    public static final String RCLIBELLECHAINE_OB = "error.RCLIBELLECHAINE_OB";

    public static final String RCCODECIRCUIT_OB = "error.RCCODECIRCUIT_OB";

    public static final String RCCODECLASSE_OB = "error.RCCODECLASSE_OB";

    public static final String CODECIEASSISTEE_OB = "error.CODECIEASSISTEE_OB";

    public static final String RCCODECOMPETENCE_OB = "error.RCCODECOMPETENCE_OB";

    public static final String typecreditKey = "error.typecreditKey";

    public static final String RCLIBELLECRITERE_OB = "error.RCLIBELLECRITERE_OB";

    public static final String originecritereKey = "error.originecritereKey";

    public static final String RCCODECHAINE_OB = "error.RCCODECHAINE_OB";

    public static final String RCCODECRITERE_OB = "error.RCCODECRITERE_OB";

    public static final String RCCOEFFICIENT_OB = "error.RCCOEFFICIENT_OB";

    public static final String RCDATEDEVISE_OB = "error.RCDATEDEVISE_OB";

    public static final String RCPRECISIONDEV_OB = "error.RCPRECISIONDEV_OB";

    public static final String RCQTECFA_OB = "error.RCQTECFA_OB";

    public static final String RCQTEDEVISE_OB = "error.RCQTEDEVISE_OB";

    public static final String RCUSERMODIF_OB = "error.RCUSERMODIF_OB";

    public static final String RCCODEDISPENSE_OB = "error.RCCODEDISPENSE_OB";

    public static final String dispensesKey = "error.dispensesKey";

    public static final String RCCODETATMODEREGLEMENT_OB = "error.RCCODETATMODEREGLEMENT_OB";

    public static final String RCLIBETATMODEREGLEMENT_OB = "error.RCLIBETATMODEREGLEMENT_OB";

    public static final String RCLIBELLEEXCEPTION_OB = "error.RCLIBELLEEXCEPTION_OB";

    public static final String RCGENREBUREAU_OB = "error.RCGENREBUREAU_OB";

    public static final String positionproduitKey = "error.positionproduitKey";

    public static final String RCNUMIMPORTEXPORT_OB = "error.RCNUMIMPORTEXPORT_OB";

    public static final String RCLIBELLEINDICATEUR_OB = "error.RCLIBELLEINDICATEUR_OB";

    public static final String RCTYPEINDICATEUR_OB = "error.RCTYPEINDICATEUR_OB";

    public static final String LIBELLELANGUE_OB = "error.LIBELLELANGUE_OB";

    public static final String RCCODELIEUDEPOT_OB = "error.RCCODELIEUDEPOT_OB";

    public static final String RCCODELIEUEMB_OB = "error.RCCODELIEUEMB_OB";

    public static final String NUMMESSAGE_OB = "error.NUMMESSAGE_OB";

    public static final String RCCODEMSGERREUR_OB = "error.RCCODEMSGERREUR_OB";

    public static final String RCCODEMODECOND_OB = "error.RCCODEMODECOND_OB";

    public static final String RCCODEMODEREG_OB = "error.RCCODEMODEREG_OB";

    public static final String RCLIBREGLEMENT_OB = "error.RCLIBREGLEMENT_OB";

    public static final String etatmodereglementKey = "error.etatmodereglementKey";

    public static final String RCCODEMODETRANS_OB = "error.RCCODEMODETRANS_OB";

    public static final String RCCODENATUREMANIF_OB = "error.RCCODENATUREMANIF_OB";

    public static final String RCNATUREAPUREMANIF_OB = "error.RCNATUREAPUREMANIF_OB";

    public static final String RCCODEFISCALITE_OB = "error.RCCODEFISCALITE_OB";

    public static final String RCLIBPIECEJOINTE_OB = "error.RCLIBPIECEJOINTE_OB";

    public static final String RCLIBNATREGECO_OB = "error.RCLIBNATREGECO_OB";

    public static final String RCCODENBRECONN_OB = "error.RCCODENBRECONN_OB";

    public static final String RCCODEFONCTION_OB = "error.RCCODEFONCTION_OB";

    public static final String RCOPERATION_OB = "error.RCOPERATION_OB";

    public static final String RCLIBELLEOPERATEUR_OB = "error.RCLIBELLEOPERATEUR_OB";

    public static final String RCSYMBOLEOPERATEUR_OB = "error.RCSYMBOLEOPERATEUR_OB";

    public static final String RCLIBELLETABLE_OB = "error.RCLIBELLETABLE_OB";

    public static final String RCNOMTABLE_OB = "error.RCNOMTABLE_OB";

    public static final String RCDESCRIPTIF_OB = "error.RCDESCRIPTIF_OB";

    public static final String RCINDICPARAM_OB = "error.RCINDICPARAM_OB";

    public static final String naturepiecejointeKey = "error.naturepiecejointeKey";

    public static final String RCCODEPIECEJ_OB = "error.RCCODEPIECEJ_OB";

    public static final String RCCODEREGDOU_OB = "error.RCCODEREGDOU_OB";

    public static final String RCDATEPIECEJ_OB = "error.RCDATEPIECEJ_OB";

    public static final String RCREGFISCAL_OB = "error.RCREGFISCAL_OB";

    public static final String RCCODECHAPITRE_OB = "error.RCCODECHAPITRE_OB";

    public static final String RCCODEPOSITION_OB = "error.RCCODEPOSITION_OB";

    public static final String RCLIBELLEPOSITION_OB = "error.RCLIBELLEPOSITION_OB";

    public static final String RCCODEPAYSETRANGER_OB = "error.RCCODEPAYSETRANGER_OB";

    public static final String RCCODEPPMETRANGER_OB = "error.RCCODEPPMETRANGER_OB";

    public static final String RCCODEPRODUIT_OB = "error.RCCODEPRODUIT_OB";

    public static final String RCPRECSENPROD_OB = "error.RCPRECSENPROD_OB";

    public static final String RCPRECUEMOAPROD_OB = "error.RCPRECUEMOAPROD_OB";

    public static final String CODECREDITNONSUSPENDU_OB = "error.CODECREDITNONSUSPENDU_OB";

    public static final String TYPEMERC_OB = "error.TYPEMERC_OB";

    public static final String RCREGDOUAPURANT_OB = "error.RCREGDOUAPURANT_OB";

    public static final String RCREGDOUAPURE_OB = "error.RCREGDOUAPURE_OB";

    public static final String SQLSuccess = "message.SQLSuccess";

    public static final String diniedSQL = "error.diniedSQL";

    public static final String RCTYPEREGAPURANT_OB = "error.RCTYPEREGAPURANT_OB";

    public static final String RCTYPEREGAPURE_OB = "error.RCTYPEREGAPURE_OB";

    public static final String RCREGDOUANE_OB = "error.RCREGDOUANE_OB";

    public static final String RCCODEREGIMEDOUANE_OB = "error.RCCODEREGIMEDOUANE_OB";

    public static final String RCDATECLOTURE_OB = "error.RCDATECLOTURE_OB";

    public static final String RCTYPEREGIMEDOUANE_OB = "error.RCTYPEREGIMEDOUANE_OB";

    public static final String RCCODEMODEDECLARATION_OB = "error.RCCODEMODEDECLARATION_OB";

    public static final String RCNUMGAMME_OB = "error.RCNUMGAMME_OB";

    public static final String RCINDICMUTAT_OB = "error.RCINDICMUTAT_OB";

    public static final String RCCODENATREGECO_OB = "error.RCCODENATREGECO_OB";

    public static final String RCDATEDECISIONREGECO_OB = "error.RCDATEDECISIONREGECO_OB";

    public static final String natureregecoKey = "error.natureregecoKey";

    public static final String INDREGEXO_OB = "error.INDREGEXO_OB";

    public static final String RCINDSUSPENSION_OB = "error.RCINDSUSPENSION_OB";

    public static final String RCTYPEREGDOUANIER_OB = "error.RCTYPEREGDOUANIER_OB";

    public static final String RCCODEEXP_OB = "error.RCCODEEXP_OB";

    public static final String RCCODEIMP_OB = "error.RCCODEIMP_OB";

    public static final String RCCODEREGECO_OB = "error.RCCODEREGECO_OB";

    public static final String RCANNEEREGECO_OB = "error.RCANNEEREGECO_OB";

    public static final String RCNUMEROGAMME_OB = "error.RCNUMEROGAMME_OB";

    public static final String RCNUMREGECO_OB = "error.RCNUMREGECO_OB";

    public static final String RCPRECSEN_OB = "error.RCPRECSEN_OB";

    public static final String RCANNEESCORE_OB = "error.RCANNEESCORE_OB";

    public static final String RCCODEBUR_OB = "error.RCCODEBUR_OB";

    public static final String RCCODECONSIGNATAIRE_OB = "error.RCCODECONSIGNATAIRE_OB";

    public static final String RCDATEDEBUT_OB = "error.RCDATEDEBUT_OB";

    public static final String RCDATEFIN_OB = "error.RCDATEFIN_OB";

    public static final String RCSCORECONSIGN_OB = "error.RCSCORECONSIGN_OB";

    public static final String RCCODETYPESENSVOY_OB = "error.RCCODETYPESENSVOY_OB";

    public static final String RCDDEBUTSENSVOY_OB = "error.RCDDEBUTSENSVOY_OB";

    public static final String RCLIBELLETYPESENSVOY_OB = "error.RCLIBELLETYPESENSVOY_OB";

    public static final String RCSCORESENSVOY_OB = "error.RCSCORESENSVOY_OB";

    public static final String RCCODETONNNAGE_OB = "error.RCCODETONNNAGE_OB";

    public static final String RCDATEDEBTONNDEB_OB = "error.RCDATEDEBTONNDEB_OB";

    public static final String RCINDICEDEBTONNDEBARQ_OB = "error.RCINDICEDEBTONNDEBARQ_OB";

    public static final String RCINDICEFINTONNDEBARQ_OB = "error.RCINDICEFINTONNDEBARQ_OB";

    public static final String RCSCORETONNDEB_OB = "error.RCSCORETONNDEB_OB";

    public static final String CODETYPEDESTFISCAL_OB = "error.CODETYPEDESTFISCAL_OB";

    public static final String RCDDEBUTDESTFISC_OB = "error.RCDDEBUTDESTFISC_OB";

    public static final String RCLIBELLETYPEDESTFISCAL_OB = "error.RCLIBELLETYPEDESTFISCAL_OB";

    public static final String RCSCORETYPEFISC_OB = "error.RCSCORETYPEFISC_OB";

    public static final String DDEBUTNATCARG_OB = "error.DDEBUTNATCARG_OB";

    public static final String RCCODETYPENATCARG_OB = "error.RCCODETYPENATCARG_OB";

    public static final String RCLIBELLETYPENATCARG_OB = "error.RCLIBELLETYPENATCARG_OB";

    public static final String RCPOIDSNATCARG_OB = "error.RCPOIDSNATCARG_OB";

    public static final String RCCODETYPENAVIRE_OB = "error.RCCODETYPENAVIRE_OB";

    public static final String RCDDEBUTTYPNAV_OB = "error.RCDDEBUTTYPNAV_OB";

    public static final String RCLIBELLETYPENAVIRE_OB = "error.RCLIBELLETYPENAVIRE_OB";

    public static final String RCSCORETYPENAV_OB = "error.RCSCORETYPENAV_OB";

    public static final String RCCODEROMAINSECTION_OB = "error.RCCODEROMAINSECTION_OB";

    public static final String RCCODESECTION_OB = "error.RCCODESECTION_OB";

    public static final String RCLIBELLESECTION_OB = "error.RCLIBELLESECTION_OB";

    public static final String RCCODECREDITAIRE_OB = "error.RCCODECREDITAIRE_OB";

    public static final String RCCODEPIECEJOINTE_OB = "error.RCCODEPIECEJOINTE_OB";

    public static final String RCCODESOUMDOC_OB = "error.RCCODESOUMDOC_OB";

    public static final String RCLIBELLESOUMDOC_OB = "error.RCLIBELLESOUMDOC_OB";

    public static final String piecesjointesKey = "error.piecesjointesKey";

    public static final String RCCODEPPM_OB = "error.RCCODEPPM_OB";

    public static final String ppmKey = "error.ppmKey";

    public static final String RCDATEVALIDITE_OB = "error.RCDATEVALIDITE_OB";

    public static final String RCCODEPROD_OB = "error.RCCODEPROD_OB";

    public static final String RCPRECSENEGAL_OB = "error.RCPRECSENEGAL_OB";

    public static final String RCPRECUEMOA_OB = "error.RCPRECUEMOA_OB";

    public static final String produitsKey = "error.produitsKey";

    public static final String RCVALEURTAUX_OB = "error.RCVALEURTAUX_OB";

    public static final String RCFORMULETAXE_OB = "error.RCFORMULETAXE_OB";

    public static final String RCINDCOMPTANT_OB = "error.RCINDCOMPTANT_OB";

    public static final String RCLIBELLETAXE_OB = "error.RCLIBELLETAXE_OB";

    public static final String RCORDREEVALTAXE_OB = "error.RCORDREEVALTAXE_OB";

    public static final String RCCODEREGIMEDOUNIER_OB = "error.RCCODEREGIMEDOUNIER_OB";

    public static final String RCREGIMEFISCAL_OB = "error.RCREGIMEFISCAL_OB";

    public static final String RCTYPEREGIMEDOUANIER_OB = "error.RCTYPEREGIMEDOUANIER_OB";

    public static final String regimeKey = "error.regimeKey";

    public static final String RCCODEREGROUP_OB = "error.RCCODEREGROUP_OB";

    public static final String RCTAUX_OB = "error.RCTAUX_OB";

    public static final String regroupementKey = "error.regroupementKey";

    public static final String RCCODEINDICATEUR_OB = "error.RCCODEINDICATEUR_OB";

    public static final String RCCODEREGIMEDOUANIER_OB = "error.RCCODEREGIMEDOUANIER_OB";

    public static final String RCCODEREGIMEFISCAL_OB = "error.RCCODEREGIMEFISCAL_OB";

    public static final String indicateurKey = "error.indicateurKey";

    public static final String RCCODETAUX_OB = "error.RCCODETAUX_OB";

    public static final String RCCODETAXE_OB = "error.RCCODETAXE_OB";

    public static final String RCCODETRANSPORT_OB = "error.RCCODETRANSPORT_OB";

    public static final String RCDATEVALEUR_OB = "error.RCDATEVALEUR_OB";

    public static final String taxesKey = "error.taxesKey";

    public static final String modetransportKey = "error.modetransportKey";

    public static final String RCANNEETITREEXO_OB = "error.RCANNEETITREEXO_OB";

    public static final String RCBURFRANCHISE_OB = "error.RCBURFRANCHISE_OB";

    public static final String RCNBRECOLISINITIAL_OB = "error.RCNBRECOLISINITIAL_OB";

    public static final String RCNUMTITREEXO_OB = "error.RCNUMTITREEXO_OB";

    public static final String RCPDSINITIAL_OB = "error.RCPDSINITIAL_OB";

    public static final String RCQTECOMPLINITIAL_OB = "error.RCQTECOMPLINITIAL_OB";

    public static final String RCVALEURINITIAL_OB = "error.RCVALEURINITIAL_OB";

    public static final String bureaufranchiseKey = "error.bureaufranchiseKey";

    public static final String RCCODEAPUREMENT_OB = "error.RCCODEAPUREMENT_OB";

    public static final String RCLIBELLEAPUREMENT_OB = "error.RCLIBELLEAPUREMENT_OB";

    public static final String RCCODEBUREAU_OB = "error.RCCODEBUREAU_OB";

    public static final String bureaudouaneKey = "error.bureaudouaneKey";

    public static final String RCREGIMEDOUANIER_OB = "error.RCREGIMEDOUANIER_OB";

    public static final String RCTYPEAPUREMENT_OB = "error.RCTYPEAPUREMENT_OB";

    public static final String regimedouanierKey = "error.regimedouanierKey";

    public static final String RCCODETYPEBUR_OB = "error.RCCODETYPEBUR_OB";

    public static final String RCLIBELLETYPEBUR_OB = "error.RCLIBELLETYPEBUR_OB";

    public static final String RCCODEOERATEUR_OB = "error.RCCODEOERATEUR_OB";

    public static final String RCTYPECHAMP_OB = "error.RCTYPECHAMP_OB";

    public static final String operateurKey = "error.operateurKey";

    public static final String RCCODETYPECONT_OB = "error.RCCODETYPECONT_OB";

    public static final String RCLIBELLETYPECONT_OB = "error.RCLIBELLETYPECONT_OB";

    public static final String RCCODETYPECREDIT_OB = "error.RCCODETYPECREDIT_OB";

    public static final String RCLIBELLETYPECREDIT_OB = "error.RCLIBELLETYPECREDIT_OB";

    public static final String RCCODETYPEDECISION_OB = "error.RCCODETYPEDECISION_OB";

    public static final String RCLIBELLEDECISION_OB = "error.RCLIBELLEDECISION_OB";

    public static final String RCCODETYPEIMPUTATION_OB = "error.RCCODETYPEIMPUTATION_OB";

    public static final String RCLIBELLEIMPUTATION_OB = "error.RCLIBELLEIMPUTATION_OB";

    public static final String RCCODETYPEINDICATEUR_OB = "error.RCCODETYPEINDICATEUR_OB";

    public static final String RCLIBTYPEINDICATEUR_OB = "error.RCLIBTYPEINDICATEUR_OB";

    public static final String RCNOMTABLEUTILISEE_OB = "error.RCNOMTABLEUTILISEE_OB";

    public static final String CODETYPELIEUEMB_OB = "error.CODETYPELIEUEMB_OB";

    public static final String LIBELLETYPELIEUEMB_OB = "error.LIBELLETYPELIEUEMB_OB";

    public static final String RCCODETYPELIQUID_OB = "error.RCCODETYPELIQUID_OB";

    public static final String RCLIBELLETYPELIQUID_OB = "error.RCLIBELLETYPELIQUID_OB";

    public static final String RCCODETYPEMANIF_OB = "error.RCCODETYPEMANIF_OB";

    public static final String RCLIBELLETYPEMANIF_OB = "error.RCLIBELLETYPEMANIF_OB";

    public static final String RCCODETYPEMISEDEPOT_OB = "error.RCCODETYPEMISEDEPOT_OB";

    public static final String RCLIBELLETYPEMISEDEPOT_OB = "error.RCLIBELLETYPEMISEDEPOT_OB";

    public static final String RCTYPEREGIME_OB = "error.RCTYPEREGIME_OB";

    public static final String RCINDICATEURSUSP_OB = "error.RCINDICATEURSUSP_OB";

    public static final String RCCODESOUMISS_OB = "error.RCCODESOUMISS_OB";

    public static final String RCLIBELLESOUMISS_OB = "error.RCLIBELLESOUMISS_OB";

    public static final String RCSCORETYPESOUM_OB = "error.RCSCORETYPESOUM_OB";

    public static final String CODETYPEVOIE_OB = "error.CODETYPEVOIE_OB";

    public static final String LIBELLETYPEVOIE_OB = "error.LIBELLETYPEVOIE_OB";

    public static final String CODUSER_OB = "error.CODUSER_OB";

    public static final String LOGIN_OB = "error.LOGIN_OB";

    public static final String MOTPASSE_OB = "error.MOTPASSE_OB";

    public static final String NOMUSER_OB = "error.NOMUSER_OB";

    public static final String TYPEUSER_OB = "error.TYPEUSER_OB";

    public static final String RCCODEETATREGLEMENT_OB = "error.RCCODEETATREGLEMENT_OB";

    public static final String RCLIBETATREGLEMENT_OB = "error.RCLIBETATREGLEMENT_OB";

    public static final String RCCODEETATDOSSIER_OB = "error.RCCODEETATDOSSIER_OB";

    public static final String RCLIBETATDOSSIER_OB = "error.RCLIBETATDOSSIER_OB";

    public static final String TRANNEEDECL_OB = "error.TRANNEEDECL_OB";

    public static final String TRBURDECLARATION_OB = "error.TRBURDECLARATION_OB";

    public static final String TRCODECREDITAIRE_OB = "error.TRCODECREDITAIRE_OB";

    public static final String TRDATEBAE_OB = "error.TRDATEBAE_OB";

    public static final String TRDATEREGLEMENT_OB = "error.TRDATEREGLEMENT_OB";

    public static final String TRETAT_OB = "error.TRETAT_OB";

    public static final String TRJOURNALTRESOR_OB = "error.TRJOURNALTRESOR_OB";

    public static final String TRMONTANTCOMPTANT_OB = "error.TRMONTANTCOMPTANT_OB";

    public static final String TRMONTANTCREDIT_OB = "error.TRMONTANTCREDIT_OB";

    public static final String TRNUMDECLARATION_OB = "error.TRNUMDECLARATION_OB";

    public static final String TRNUMDOSSIERPROV_OB = "error.TRNUMDOSSIERPROV_OB";

    public static final String TRTVACREDIT_OB = "error.TRTVACREDIT_OB";

    public static final String creditaireInexistant = "error.creditaireInexistant";

    public static final String exceptionsKey = "error.exceptionsKey";

    public static final String RCCODETYPELIQSUPP_OB = "error.RCCODETYPELIQSUPP_OB";

    public static final String RCLIBELLELIQSUPP_OB = "error.RCLIBELLELIQSUPP_OB";

    public static final String rcRowNotFound = "error.rcRowNotFound";
    public static final String rcRowAgentNotFound = "error.rcRowAgentNotFound";
    public static final String produitRowNotFound="error.produitRowNotFound";

    public static final String RCIDJRNALREGLEMENT_OB = "error.RCIDJRNALREGLEMENT_OB";

    public static final String journaltresorKey = "error.journaltresorKey";

    public static final String rctypeapurementKey = "error.rctypeapurementKey";

    public static final String regimeeconomiqueKey = "error.regimeeconomiqueKey";

    public static final String RCCODENATUREPV_OB = "error.RCCODENATUREPV_OB";

    public static final String LIBNATUREPV_OB = "error.LIBPIECEJOINTE_OB";

    public static final String MODULE_OB = "error.MODULE_OB";

    public static final String AgentDouaneNotFound = "error.AgentDouaneNotFound";

    public static final String codeUserRecepteurNotFound = "error.codeUserRecepteurNotFound";

    public static final String noMatchProfilForThisFonction = "error.noMatchProfilForThisFonction";

    public static final String ltaIsRequired = "error.ltaIsRequired";

    public static final String RCCODETYPEMAD_OB = "error.RCCODETYPEMAD_OB";

    public static final String RCLIBTYPEMAD_OB = "error.RCLIBTYPEMAD_OB";

    public static final String CODETYPEENTREE_OB = "error.CODETYPEENTREE_OB";

    public static final String LIBELLETYPEENTREE_OB = "error.LIBELLETYPEENTREE_OB";

    public static final String CODEMAD_OB = "error.CODEMAD_OB";

    public static final String CODETYPEMAD_OB = "error.CODETYPEMAD_OB";

    public static final String INDLOTISSEMENT_OB = "error.INDLOTISSEMENT_OB";

    public static final String CODEPPMMAD_OB = "error.CODEPPMMAD_OB";

    public static final String AGREMENTMAD_OB = "error.AGREMENTMAD_OB";

    public static final String typemadKey = "error.typemadKey";

    public static final String RCCODEGROUPE_OB = "error.RCCODEGROUPE_OB";

    public static final String RCCODEPROFIL_OB = "error.RCCODEPROFIL_OB";

    public static final String groupefonctionKey = "error.groupefonctionKey";

    public static final String profilKey = "error.profilKey";

    public static final String AGENTDESTINATAIRE_OB = "error.AGENTDESTINATAIRE_OB";

    public static final String AGENTEMETTEUR_OB = "error.AGENTEMETTEUR_OB";

    public static final String CODEFONCTION_OB = "error.CODEFONCTION_OB";

    public static final String DATEDEBUT_OB = "error.DATEDEBUT_OB";

    public static final String RCLIBGROUPE_OB = "error.RCLIBGROUPE_OB";

    public static final String RCLIBELLEPROFIL_OB = "error.RCLIBELLEPROFIL_OB";

    public static final String RCLIBELLEUSER_OB = "error.RCLIBELLEUSER_OB";

    public static final String RCTYPEUSER_OB = "error.RCTYPEUSER_OB";

    public static final String typeindicateurKey = "error.typeindicateurKey";

    public static final String PROFIL_OB = "error.PROFIL_OB";

    public static final String typeutilsateurKey = "error.typeutilsateurKey";

    public static final String succefulDeleteCond = "message.succefulDeleteCond";

    public static final String RCLIBELLEEXPEDITION_OB = "error.RCLIBELLEEXPEDITION_OB";

    public static final String RCMODEEXPEDITION_OB = "error.RCMODEEXPEDITION_OB";

    public static final String CODE_OB = "error.CODE_OB";

    public static final String LIBELLE_OB = "error.LIBELLE_OB";

    public static final String RBLIBELLEDOC_OB = "error.RBLIBELLEDOC_OB";

    public static final String RCCODEDOCUMENT_OB = "error.RCCODEDOCUMENT_OB";

    public static final String LIBUNITE_OB = "error.LIBUNITE_OB";

    public static final String UNITFAC_OB = "error.UNITFAC_OB";

    public static final String critereslogiquesKey = "error.critereslogiquesKey";

    public static final String RCCODECRITERELOGIQUE_OB = "error.RCCODECRITERELOGIQUE_OB";

    public static final String RCDATEDEBUTCRITERELOGIQUE_OB = "error.RCDATEDEBUTCRITERELOGIQUE_OB";

    public static final String RCLIBELLECRITERELOGIQUE_OB = "error.RCLIBELLECRITERELOGIQUE_OB";

    public static final String RCCODEDETAILCHAINE_OB = "error.RCCODEDETAILCHAINE_OB";

    public static final String RCNIVEAUEXCEPTION_OB = "error.RCNIVEAUEXCEPTION_OB";

    public static final String erreurAncienMotPasse = "error.AncienMotPasse";

    public static final String erreurNouveauMotPasse = "error.NouveauMotPasse";

    public static final String verifNotMatch = "error.verifNotMatch";
    
    public static final String verif1NotMatch = "error.verif1NotMatch";
    
    public static final String verif2NotMatch = "error.verif2NotMatch";

    public static final String profilNotMatch = "error.profilNotMatch";
    
    public static final String errorNewProduits = "error.errorNewProduits";

    public static final String succefulRegularisation = "message.succefulRegularisation";
    public ConstErrCodRC() {
        super();
    }

}