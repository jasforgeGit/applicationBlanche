package sn.com.douane.ejb.rc.exception;

public class ConstErrCod {
	
public static final String NONUNIQUERESULTEXCEPTION ="error.nonUniqueResultException"; 
	
	public static final String NORESULTEXCEPTION ="error.noResultException";
	
	public static final String DUPKEYINSERT = "error.dupkeyinsert";
	
	public static final String INSERTEXP = "error.insertExp";
	
	public static final String CREATEEXCEPTION = "error.createException";
	
	public static final String EJBEXP = "error.ejbExp";
	
	public final static String createPrevision = "message.creationPrevisionNavire";
    
    public final static String transfertRectification = "message.transfertRectification";
    
	public final static String codeVerif = "error.codeVerificateur";
	
	public final static String erreurcreatePrevision = "error.creationPrevisionNavire";

    public final static String createException = "error.createException";

    public final static String sessionHasExpired = "error.sessionHasExpired";

    public final static String accessDenied = "error.accessDenied";

    public static final String accessDeniedDeclarant = "accessDeniedDeclarant";

    public static final String accessDeniedConsignataire = "accessDeniedConsignataire";

    public static final String accessDeniedNotCreditaire = "accessDeniedNotCreditaire";

    public final static String sessionAlreadyOpen = "sessionAlreadyOpen";

    public final static String transactionFailed = "error.failedTransaction";

    public final static String dupkeyinsert = "error.dupkeyinsert";

    public final static String rowNotFound = "error.rowNotFound";

    public final static String rechCessionSomm = "error.rechCessionSomm";

    public final static String fieldChanged = "error.fieldChanged";

    //exception déclenchée si la valeur de dao et de cmp n'est pas synchronisé

    public final static String namingExp = "error.namingExp";

    //Exception est déclenchée s'ilya eu un problème lié au cmp
    //ou bien un problème de connection à la base

    public final static String insertExp = "error.insertExp";

    //exception déclenché lors d'insertion d'un champs étrangé qui ne
    // correspond pas parent ou lorsque un champs not null n'est pas remplit ou
    // il ya un problème de connexion à la base ou un problème général de la
    // base

    public final static String ejbExp = "error.ejbExp";

    public final static String removeExp = "error.removeExp";

    public final static String remoteExpSB = "error.remoteExpSB";

    public final static String removeExpSB = "error.removeExpSB";

    public final static String PkRequired = "error.PkRequired";

    public final static String succefulEnlevement = "message.succefulEnlevement";

    public final static String succefulCancelEnlevement = "message.succefulCancelEnlevement";

    public final static String succefulInsert = "message.succefulInsert";
    
    public final static String succefulProrogation= "message.insertProrogation";

    public final static String succefulEnreg = "message.succefulEnreg";

    public final static String succefulCopy = "message.succefulCopy";

    public final static String succefulUpdate = "message.succefulUpdate";

    public final static String succefulDelete = "message.succefulDelete";

    public final static String succefulSend = "message.succefulSend";

    public static final String succefullRecevabilite = "message.succefullRecevabilite";

    public static final String successfullValidate = "message.successfullValidate";

    public static final String successfullAccpetation = "message.successfullAccpetation";

    public static final String succefulInsertConvocation = "message.succefulInsertConvocation";
    
    public static final String successfullReject = "message.successfullReject";

    public static final String successfullAttributionBae = "message.successfullAttributionBae";

    public final static String InspecifiedError = "error.InspecifiedError";

    public final static String succefulSave = "message.succefulSave";

    public final static String foreignKey = "error.foreignKey";

    public final static String SQLException = "error.SQLException";

    public final static String loginError = "error.loginError";

    public final static String insuffisantData = "error.insuffisantData";

    public final static String controleOK = "message.controleOK";

    //******************************************************************//
    //						constantes module manifeste //
    //******************************************************************//
    public final static String manifesteEnregistree = "message.manifesteEnregistree";

    public final static String manifesteSupprimee = "message.manifesteSupprimee";

    public final static String articleSupprimee = "message.articleSupprimee";

    public final static String conteneurSupprimee = "message.conteneurSupprimee";

    public final static String conteneurModifiee = "message.conteneurModifiee";

    public final static String fermetureManifComplem = "message.fermetureManifComplem";

    public final static String enregistrementPartielEffectuee = "message.enregistrementPartielEffectuee";
    
    public final static String enregistrementPartielImpossible = "error.enregistrementPartielImpossible";

    public final static String CAPBRUTE = "error.capaciteBrute";

    public static final String conteneurReconditionnementNotFound = "error.conteneurReconditionnementNotFound";

    public static final String DetailNotFound = "error.DetailNotFound";

    public static final String succefulEnvoiFractionneOperation = "message.succefulEnvoiFractionneOperation";

    public static final String invalidSuppActionArtDegroupage = "error.invalidSuppActionArtDegroupage";

    public static final String invalidDegroupageSansCont = "error.invalidDegroupageSansCont";

    public static final String invalidColisDegroupe = "error.invalidColisDegroupe";

    public static final String invalidPoidsDegroupe = "error.invalidPoidsDegroupe";

    public static final String invalidColisDdeDepot = "error.invalidColisDdeDepot";

    public static final String invalidPoidsDdeDepot = "error.invalidPoidsDdeDepot";

	public static final String VerifBureau =  "error.VerifBureau";;

    public static final String invalidePoidsDegZero = "error.invalidePoidsDegZero";

    public static final String invalideNbColisDegZero = "error.invalideNbColisDegZero";

    public static final String invalidDegroupageAction = "error.invalidDegroupageAction";

    public static final String invalidDegroupageActionValueNull = "error.invalidDegroupageActionValueNull";

    public static final String invalidDegroupageActionValueExces = "error.invalidDegroupageActionValueExces";

    public static final String incoherenceDegroupageAction = "error.incoherenceDegroupageAction";

    public static final String degroupagePartielAbouti = "message.degroupagePartielAbouti";

    public static final String degroupageTotalAbouti = "message.degroupageTotalAbouti";

    public static final String articleAlreadyDegrouped = "error.articleAlreadyDegrouped";

    public static final String dupkeyinsertbrouilloncont = "error.dupkeyinsertbrouilloncont";

    public static final String invalidNumConteneur = "error.invalidNumConteneur";

    public static final String invalidNbreConteneur = "error.invalidNbreConteneur";

    public static final String invalidNbreConteneurAmodifier = "error.invalidNbreConteneurAmodifier";

    public static final String sousArticleSupprime = "message.sousArticleSupprime";

    public static final String sousArticleModifie = "message.sousArticleModifie";

    public static final String invalidDegroupeSousArticleAction = "error.invalidDegroupeSousArticleAction";

    public static final String invalidEnregPartielArticle = "error.invalidEnregPartielArticle";

    public static final String invalidRecondSousArticleAction = "error.invalidRecondSousArticleAction";

    public static final String invalidRecondAction = "error.invalidRecondAction";

    public static final String invalidColisDdeRegul = "error.invalidColisDdeRegul";

    public static final String bureauNonTypeAerien = "error.bureauNonTypeAerien";

    public static final String invalidColisRecond = "error.invalideColisRecond";

    public static final String invalidPoidsRecond = "error.invalidPoidsRecond";

    public static final String NombreColisMustBeLessOrEqual = "error.NombreColisMustBeLessOrEqual";

    public static final String PoidsMustBeLessOrEqual = "error.PoidsMustBeLessOrEqual";

    public static final String duplicateManifesteComplemantaire = "error.duplicateManifesteComplemantaire";

    public static final String InvalidSuppManifesteComplementaire = "error.InvalidSuppManifesteComplementaire";

    public static final String succefulApurementOperation = "message.succefulApurementOperation";

    public static final String duplicateNumRepertoire = "error.duplicateNumRepertoire";

    public static final String chaineKey = "error.chaineKey";

    public static final String invalidLTADdeRegul = "error.invalidLTADdeRegul";

    public static final String invalidREPDdeRegul = "error.invalidREPDdeRegul";

    public static final String insuffisantDataDdeRegul = "error.insuffisantDataDdeRegul";

    public static final String invalidBureauDemandeRegul = "error.invalidBureauDemandeRegul";

    public static final String controleDdeRegulOk = "message.controleDdeRegulOk";

    public static final String manifesteRegulNotFound = "error.manifesteRegulNotFound";

    public static final String manifesteAenregistrerNotFound = "error.manifesteAenregistrerNotFound";

    public static final String articleRegulNotFound = "error.articleRegulNotFound";

    public static final String reglementImportInExist = "error.reglementImportInExist";

    public static final String invalidManifRegulAerien = "error.invalidManifRegulAerien";

    public static final String invalidLTARegulAerien = "error.invalidLTARegulAerien";

    public static final String invalidArtRegulAerien = "error.invalidArtRegulAerien";

    public static final String invalidnumvolregulAerien = "error.invalidnumvolregulAerien";

	public static final String outOfMemory = "error.outofmemory";

    public static final String critereKey = "error.critereKey";

    public static final String invalidDateArriveeRegulAerien = "error.invalidDateArriveeRegulAerien";

    public static final String manifesteAerienNotFound = "error.manifesteAerienNotFound";

    public static final String manifesteGroupageNotFound = "error.manifesteGroupageNotFound";

    public static final String colisAerienNotFound = "error.colisAerienNotFound";

    public static final String histoscoreburNotFound = "error.histoScoreBurNotFound";

    public static final String colisGroupageNotFound = "error.colisGroupageNotFound";

    public static final String ltaAerienNotEquals = "error.ltaAerienNotEquals";

    public static final String invalidnomdestinataireregulAerien = "error.invalidnomdestinataireregulAerien";

    public static final String invalidnbreColisregulAerien = "error.invalidnbreColisregulAerien";

    public static final String invalidpoidregulAerien = "error.invalidpoidregulAerien";

    public static final String cumulPoidsNotCorresponding = "error.cumulPoidsNotCorresponding";

    public static final String cumulColisNotCorresponding = "error.cumulColisNotCorresponding";

    public static final String articleListEmpty = "error.articleListEmpty";

    public static final String articleLtaNotGood = "error.articleLtaNotGood";

    public static final String articleWithoutOptionF = "error.articleWithoutOptionF";

    public static final String confpwerr = "error.confpwerr";
    
    public static final String confpwerrPwdEqualCodeUser = "error.confpwerrPwdEqualCodeUser";

    public static final String articleReceptionNotFound = "error.articleReceptionNotFound";

    public static final String invalidBureauAerien = "error.invalidBureauAerien";

    public static final String noMatchFound = "error.noMatchFound";
    
    public static final String noAgentFound = "error.noAgentFound";

    public static final String foreignKeySegmentgenmanifesteLocal = "error.foreignKeySegmentgenmanifesteLocal";

    public static final String foreignKeyArticlemanifesteLocal = "error.foreignKeyArticlemanifesteLocal";

    public static final String invalidDateArriveeManif = "error.invalidDateArriveeManif";

    public static final String invalidateEnregDefinitif = "error.invalidateEnregDefinitif";

    public static final String NUM_VOL_ERRONEE = "error.NUM_VOL_ERRONEE";

    public static final String DATE_ARRIVEE_ERRONEE = "error.DATE_ARRIVEE_ERRONEE";

    public static final String NumConteneurNbrePositionMinError = "error.NumConteneurNbrePositionMinError";

    public static final String notNumConteneurNbrePositionError = "error.notNumConteneurNbrePositionError";

	public static final String dossierAR = "error.dossierAR";
	
	public static final String dossierAV = "error.dossierAV";
	
	public static final String dossierTR = "error.dossierTR";

    // ************ constante apurement manifeste ********
    public static final String apurementActionGood = "message.apurementActionGood";

    public static final String invalidApurementAction = "error.invalidApurementAction";

    public static final String insuffisantApurmentFields = "error.insuffisantApurmentFields";

    //****************** constantes envoi fractionee *********
    public static final String envoieFractionneeGood = "message.envoieFractionneeGood";

    public static final String BureauAerienIsRequired = "error.bureauAerienIsRequired";

    public static final String nbreArticlesMustBeGreaterThanOne = "error.nbreArticlesMustBeGreaterThanOne";

    //******************************************************************//
    //				constantes ressources module communes //
    //******************************************************************//
    public static final String foreignKeyBureaudouaneLocal = "error.foreignKeyBureaudouaneLocal";

    public static final String foreignKeyTypeconteneurLocal = "error.foreignKeyTypeconteneurLocal";

    public static final String foreignKeyTypevoieLocal = "error.foreignKeyTypevoieLocal";

    public static final String foreignKeyLieuembarquementLocal = "error.foreignKeyLieuembarquementLocal";

    public static final String foreignKeyModeconditionnementLocal = "error.foreignKeyModeconditionnementLocal";

    public static final String foreignKeyConsignatairesLocal = "error.foreignKeyConsignatairesLocal";

    public static final String foreignKeyTypesensvoyLocal = "error.foreignKeyTypesensvoyLocal";

    public static final String foreignKeyTypenavireLocal = "error.foreignKeyTypenavireLocal";

    public static final String foreignKeyTypenaturecargLocal = "error.foreignKeyTypenaturecargLocal";

    public static final String foreignKeyTypemanifesteLocal = "error.foreignKeyTypemanifesteLocal";

    public static final String foreignKeyTypedestfiscalLocal = "error.foreignKeyTypedestfiscalLocal";

    public static final String foreignKeyPaysLocalProv = "error.foreignKeyPaysLocalProv";

    public static final String foreignKeyTypeapurement = "error.foreignKeyTypeapurement";

    public static final String foreignKeyPaysLocalOrigine = "error.foreignKeyPaysLocalOrigine";

    public static final String foreignKeyModetransportLocal = "error.foreignKeyModetransportLocal";

    public static final String foreignKeyCompagnieassisteeLocal = "error.foreignKeyCompagnieassisteeLocal";

    public static final String foreignKeyBrouillonsegartLocal = "error.foreignKeyBrouillonsegartLocal";

    public static final String foreignKeyPpmLocalDestinataire = "error.foreignKeyPpmLocalDestinataire";

    public static final String foreignKeyPpmLocalAOrdrede = "error.foreignKeyPpmLocalAOrdrede";

    public static final String foreignKeyPaysLocal = "error.foreignKeyPaysLocal";

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

	public static final String POIDSENLEVE = "error.poidsenleve";

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

    /*
     * public static final String
     * classNotFoundException="error.classNotFoundException"; public static
     * final String nullPointerException="error.nullPointerException";
     */
    public static final String instantiationException = "error.instantiationException";

    public static final String illegalAccessException = "error.illegalAccessException";

    public final static String ManifesteNotFound = "error.manifesteNotFound";

    public final static String ArticleNotFound = "error.articleNotFound";

    public final static String ConteneurNotFound = "error.conteneurNotFound";

    public final static String FonctionnaliteNotFound = "error.FonctionnaliteNotFound";

    public final static String NumConteneurNbrePositionError = "error.numConteneurNbrePositionError";

    public final static String NumConteneurError2 = "error.numConteneurError2";

    public final static String NumConteneurError3 = "error.numConteneurError3";

    public static final String InvalidDateEmbarqArticle = "error.InvalidDateEmbarqArticle";

    public static final String enregistrementAricleDelaiDepassee = "error.enregistrementAricleDelaiDepassee";

    public static final String NumRepertoireInvalid = "error.numRepertoireInvalid";

    public static final String importationImpossible = "error.importationImpossible";

    public static final String ManifesteCompAdded = "message.manifesteCompAdded";

    public final static String articleAdded = "message.articleAdded";

    public final static String ManifesteAdded = "message.manifesteAdded";

    public final static String DemandeDestructionAdded = "message.demandeDestructionAdded";

    public final static String DemandeDestructionDeleted = "message.demandeDestructionDeleted";

    //******************************************************************//
    //					constantes module declaration //
    //******************************************************************//

    public static final String foreignKeybrouillonartdec = "error.foreignKeybrouillonartdec";

    public static final String foreignKeySommiers = "error.foreignKeySommiers";

    public static final String foreignKeyRegimedouanier = "error.foreignKeyRegimedouanier";

    public static final String foreignKeyRegimefiscal = "error.foreignKeyRegimefiscal";

    public static final String foreignKeySegartdec = "error.foreignKeySegartdec";

    public static final String foreignKeybrouillonseggendec = "error.foreignKeybrouillonseggendec";

    public static final String foreignKeyPpm = "error.foreignKeyPpm";

    public static final String foreignKeyPpmEtranger = "error.foreignKeyPpmEtranger";

    public static final String foreignKeyproduitsKey = "error.foreignKeyproduitsKey";

    public static final String foreignKeyAgree = "error.foreignKeyAgree";

    public static final String foreignKeybrouillonsgtrans = "error.foreignKeybrouillonsgtrans";

    public static final String foreignKeyArticlemanifeste = "error.foreignKeyArticlemanifeste";

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

    public static final String insuffisanceDeclEnCoursACompl = "error.insuffisanceDeclEnCoursACompl";

    public static final String insuffisanceDeclEnCours = "error.insuffisanceDeclEnCours";

    public static final String RCORDRECALCUL_OB = "error.RCORDRECALCUL_OB";

    public static final String taxescumulKey = "error.taxescumulKey";

    public static final String taxesrefKey = "error.taxesrefKey";

    public static final String RCCODETAXE_OB = "error.RCCODETAXE_OB";

    public static final String RCDESDISPENSE_OB = "error.RCDESDISPENSE_OB";

    public static final String RCFORMULETAXE_OB = "error.RCFORMULETAXE_OB";

    public static final String RCLIBELLETAXE_OB = "error.RCLIBELLETAXE_OB";

    public static final String RCORDREEVALTAXE_OB = "error.RCORDREEVALTAXE_OB";

    public static final String RCCONDITION_OB = "error.RCCONDITION_OB";

    public static final String RCFORMULE_OB = "error.RCFORMULE_OB";

    public static final String RCDATEPIECEJOINTE_OB = "error.RCDATEPIECEJOINTE_OB";

    public static final String RCDESPIECEJOINTE_OB = "error.RCDESPIECEJOINTE_OB";

    public static final String RCVALEURTAUX_OB = "error.RCVALEURTAUX_OB";

    /* Erreur de primary key */
    public final static String RCCODECONSIGNATAIRE_OB = "error.RCCODECONSIGNATAIRE_OB";

    public final static String RCCODEBURFRANCHISE_OB = "error.RCCODEBURFRANCHISE_OB";

    public final static String RCLIBBURFRANCHISE_OB = "error.RCLIBBURFRANCHISE_OB";

    public final static String RCCODEPPM_OB = "error.RCCODEPPM_OB";

    public final static String RCNUMCARTEAGREE_OB = "error.RCNUMCARTEAGREE_OB";

    public final static String typemanifesteKey = "error.typemanifesteKey";

    public final static String RCCOMPETENCE_OB = "error.RCCOMPETENCE_OB";

    public final static String RCGENREBUR_OB = "error.RCGENREBUR_OB";

    public final static String RCLIBELLEBURDOUANE_OB = "error.RCLIBELLEBURDOUANE_OB";

    public final static String RCTYPEBURDOUANE_OB = "error.RCTYPEBURDOUANE_OB";

    public final static String typebureauKey = "error.typebureauKey";

	public static final String brouillonseggendecKey = "error.BrouillonseggendecKey";

    public final static String compbureauKey = "error.compbureauKey";

    public final static String genrebureauKey = "error.genrebureauKey";

    public final static String RCLIBELLEBURUEMOA_OB = "error.RCLIBELLEBURUEMOA_OB";

    public final static String RCLIBELLECHAPITRE_OB = "error.RCLIBELLECHAPITRE_OB";

    public final static String RCDESCIRCUITVISITE_OB = "error.RCDESCIRCUITVISITE_OB";

    public final static String RCLIBELLECLASSE_OB = "error.RCLIBELLECLASSE_OB";

    public final static String NOMCIEASSISTEE_OB = "error.NOMCIEASSISTEE_OB";

    public final static String RCDESCOMPETENCES_OB = "error.RCDESCOMPETENCES_OB";

    public final static String RCCOURSDEVISE_OB = "error.RCCOURSDEVISE_OB";

    public final static String RCLIBELLEDEVISE_OB = "error.RCLIBELLEDEVISE_OB";

    public final static String RCLIBFONCTION_OB = "error.RCLIBFONCTION_OB";

    public final static String RCORDREAFFICHAGE_OB = "error.RCORDREAFFICHAGE_OB";

    public final static String RCDESGENREBUREAU_OB = "error.RCDESGENREBUREAU_OB";

    public final static String RCCODEPAYS_OB = "error.RCCODEPAYS_OB";

    public final static String RCTYPELIEUEMB_OB = "error.RCTYPELIEUEMB_OB";

    public final static String typelieuembKey = "error.typelieuembKey";

    public final static String CODEDESTINATAIRE_OB = "error.CODEDESTINATAIRE_OB";

    public final static String CODEEMETTEUR_OB = "error.CODEEMETTEUR_OB";

    public final static String utilisateurKey = "error.utilisateurKey";

    public final static String RCMESSAGEERREUR_OB = "error.RCMESSAGEERREUR_OB";

    public final static String RCLIBELLEMODECOND_OB = "error.RCLIBELLEMODECOND_OB";

    public final static String RCLIBELLEMODETRANS_OB = "error.RCLIBELLEMODETRANS_OB";

    public final static String RCDESFISCALITE_OB = "error.RCDESFISCALITE_OB";

    public final static String RCDDEBUTNBRECONN_OB = "error.RCDDEBUTNBRECONN_OB";

    public final static String RCINDDEBUTNBRECONN_OB = "error.RCINDDEBUTNBRECONN_OB";

    public final static String RCINDFINTNBRECONN_OB = "error.RCINDFINTNBRECONN_OB";

    public static final String supprDetailInterdite = "error.supprDetailInterdite";

    public final static String RCSCORENBRECONN_OB = "error.RCSCORENBRECONN_OB";

    public final static String VALEURINDICE_OB = "error.VALEURINDICE_OB";

    public final static String fonctionnalitesKey = "error.fonctionnalitesKey";

    public final static String RCCIRCUITVISITE_OB = "error.RCCIRCUITVISITE_OB";

    public final static String RCCODEDEVISE_OB = "error.RCCODEDEVISE_OB";

    public final static String RCCODELANGUE_OB = "error.RCCODELANGUE_OB";

    public final static String RCLIBELLEPAYS_OB = "error.RCLIBELLEPAYS_OB";

    public final static String RCNATUREFISCALITE_OB = "error.RCNATUREFISCALITE_OB";

    public final static String RCPAYSALPHABETIQUE_OB = "error.RCPAYSALPHABETIQUE_OB";

    public final static String circuitvisiteKey = "error.circuitvisiteKey";

    public final static String naturefiscaliteKey = "error.naturefiscaliteKey";

    public final static String langueKey = "error.langueKey";

    public final static String consignatairesKey = "error.consignatairesKey";

    public final static String importexportKey = "error.importexportKey";

    public final static String chapitreKey = "error.chapitreKey";

    public final static String classeKey = "error.classeKey";

    public final static String RCLIBELLEREGIME_OB = "error.RCLIBELLEREGIME_OB";

    public final static String RCREGIMETAXABLE_OB = "error.RCREGIMETAXABLE_OB";

    public final static String regimefiscalKey = "error.regimefiscalKey";

    public final static String typeregimedouaneKey = "error.typeregimedouaneKey";

    public final static String RCLIBELLEREGIMEFISCAL_OB = "error.RCLIBELLEREGIMEFISCAL_OB";

    public final static String regimeKey = "error.regimeKey";

    public final static String RCLIBELLEREGROUP_OB = "error.RCLIBELLEREGROUP_OB";

    public final static String regroupementKey = "error.regroupementKey";

    public final static String RCSCORE_OB = "error.RCSCORE_OB";

    public final static String indicateurKey = "error.indicateurKey";

    public final static String RCSQLTRAITEMENT_OB = "error.RCSQLTRAITEMENT_OB";

    public final static String RCLIBELLEAPUREMENT_OB = "error.RCLIBELLEAPUREMENT_OB";

    public final static String RCLIBELLETYPEBUR_OB = "error.RCLIBELLETYPEBUR_OB";

    public final static String RCLIBELLETYPECONT_OB = "error.RCLIBELLETYPECONT_OB";

    public final static String LIBELLETYPELIEUEMB_OB = "error.LIBELLETYPELIEUEMB_OB";

    public final static String RCLIBELLETYPEMANIF_OB = "error.RCLIBELLETYPEMANIF_OB";

    public final static String RCLIBELLESOUMISS_OB = "error.RCLIBELLESOUMISS_OB";

    public final static String RCSCORETYPESOUM_OB = "error.RCSCORETYPESOUM_OB";

    public final static String LIBELLETYPEVOIE_OB = "error.LIBELLETYPEVOIE_OB";

    public final static String LOGIN_OB = "error.LOGIN_OB";

    public final static String MOTPASSE_OB = "error.MOTPASSE_OB";

    public final static String NOMUSER_OB = "error.NOMUSER_OB";

    public final static String TYPEUSER_OB = "error.TYPEUSER_OB";

    public final static String RCCODETYPECREDIT_OB = "error.RCCODETYPECREDIT_OB";

    public final static String RCLIBELLETYPECREDIT_OB = "error.RCLIBELLETYPECREDIT_OB";

    public final static String RCCODEMODEREG_OB = "error.RCCODEMODEREG_OB";

    public final static String RCLIBREGLEMENT_OB = "error.RCLIBREGLEMENT_OB";

    public final static String etatmodereglementKey = "error.etatmodereglementKey";

    public final static String RCLIBELLEINDICATEUR_OB = "error.RCLIBELLEINDICATEUR_OB";

    public final static String RCTYPEINDICATEUR_OB = "error.RCTYPEINDICATEUR_OB";

    public final static String RCCODEINDICATEUR_OB = "error.RCCODEINDICATEUR_OB";

    public final static String RCCODETATMODEREGLEMENT_OB = "error.RCCODETATMODEREGLEMENT_OB";

    public final static String RCLIBETATMODEREGLEMENT_OB = "error.RCLIBETATMODEREGLEMENT_OB";

    public final static String RCCODECREDITAIRE_OB = "error.RCCODECREDITAIRE_OB";

    public final static String typecreditKey = "error.typecreditKey";

    public final static String RCCODETYPEDECISION_OB = "error.RCCODETYPEDECISION_OB";

    public final static String RCLIBELLEDECISION_OB = "error.RCLIBELLEDECISION_OB";

    public final static String CODECREDITNONSUSPENDU_OB = "error.CODECREDITNONSUSPENDU_OB";

    public final static String TYPEMERC_OB = "error.TYPEMERC_OB";

    public final static String DECANNEEDECLARATION_OB = "error.DECANNEEDECLARATION_OB";

    public final static String RCCODEDISPENSE_OB = "error.RCCODEDISPENSE_OB";

    public final static String brouillonartdecKey = "error.brouillonartdecKey";

    public final static String RCANNEETITREEXO_OB = "error.RCANNEETITREEXO_OB";

    public final static String RCBURFRANCHISE_OB = "error.RCBURFRANCHISE_OB";

    public final static String RCNBRECOLISINITIAL_OB = "error.RCNBRECOLISINITIAL_OB";

    public final static String RCNUMTITREEXO_OB = "error.RCNUMTITREEXO_OB";

    public final static String RCPDSINITIAL_OB = "error.RCPDSINITIAL_OB";

    public final static String RCQTECOMPLINITIAL_OB = "error.RCQTECOMPLINITIAL_OB";

    public final static String RCVALEURINITIAL_OB = "error.RCVALEURINITIAL_OB";

    public final static String bureaufranchiseKey = "error.bureaufranchiseKey";

    public final static String LIBELLELANGUE_OB = "error.LIBELLELANGUE_OB";

    public final static String RCCODELIEUEMB_OB = "error.RCCODELIEUEMB_OB";

    public final static String CODEPPM_OB = "error.CODEPPM_OB";

    public final static String CODUSER_OB = "error.CODUSER_OB";

    public final static String CODETYPEVOIE_OB = "error.CODETYPEVOIE_OB";

    public final static String RCCODECIRCUIT_OB = "error.RCCODECIRCUIT_OB";

    public final static String RCCODECLASSE_OB = "error.RCCODECLASSE_OB";

    public final static String CODETYPELIEUEMB_OB = "error.CODETYPELIEUEMB_OB";

    public final static String RCCODELIEUDEPOT_OB = "error.RCCODELIEUDEPOT_OB";

    public static final String RCINDCOMPTANT_OB = "error.RCINDCOMPTANT_OB";

    public static final String RCLIBELLECritere_OB = "error.RCLIBELLECritere_OB";

    public static final String Rclibelleoperateur_OB = "error.Rclibelleoperateur_OB";

    public static final String Rcsymboleoperateur_OB = "error.Rcsymboleoperateur_OB";

    public static final String RCVALEUR_OB = "error.RCVALEUR_OB";

    public static final String RCCODEOPERATEUR_OB = "error.RCCODEOPERATEUR_OB";

    public static final String operateurKey = "error.operateurKey";

    //******************************************************************//
    //					constantes calcul du crédit //
    //******************************************************************//
    public static final String creditInsuf = "error.creditInsuf";

	public static final String succefulValidation = "message.validVisitenononformSuccess";

    public static final String creditsuspond = "error.creditsuspond";

    public static final String creditNotDisponible = "error.creditNotDisponible";

    public static final String creditNotRenouvler = "error.creditNotRenouvler";

    public static final String creditDestNotAutorise = "error.creditDestNotAutorise";

    public static final String codcrediterr = "error.creditaireInexistant";

    public static final String creditAdministratif = "error.creditAdministratif";

    public static final String ecritureTresorDoitfaitSurModCredit = "error.ecritureTresorDoitfaitSurModCredit";

	public static final String visitConfirme = "message.visiteDeclConfirme";

    public static final String creditErr = "error.creditErr";

    public final static String rcsiteEmpty = "rcsiteEmpty";

    public static final String calculDevisImpossible = "error.calculDevisImpossible";

    public static final String recalculDevis = "error.recalculDevis";

    public static final String calculDevis = "error.calculDevis";

    public static final String imputManifImpossible = "error.imputManifImpossible";

    public static final String imputSomImpossible = "error.imputSomImpossible";

    public static final String imputRegistDepImposs = "error.imputRegistDepImposs";

    public static final String imputTitreExoImpossible = "error.imputTitreExoImpossible";
    
    public static final String imputSomImpossibleSurPoids = "error.imputSomImpossibleSurPoids";
    
    public static final String imputSomImpossibleSurQteCompl = "error.imputSomImpossibleSurQteCompl";
    
    public static final String imputSomImpossibleSurQteMerc = "error.imputSomImpossibleSurQteMerc";

    //Selon type apurement c'est l'articlemanifeste qui doit être imputé et
    // apuré
    public static final String selontypapur_artManifimput = "error.selontypapur_artManifimput";

    public static final String selontypapur_sommierimput = "error.selontypapur_sommierimput";

    public static final String selontypapur_registdepotimput = "error.selontypapur_registdepotimput";

    public static final String sommierErrone = "error.sommierErrone";
    
    public static final String sommierNotOwned = "error.sommierNotOwned";

    public static final String sommierNonValide = "error.sommierNonValide";

    public static final String registreDepotErrone = "error.registreDepotErrone";

    public static final String registreDepotNotFound = "error.registreDepotNotFound";

    public static final String titreExconerErroner = "error.titreExconerErroner";
    public static final String sommierEntamer = "error.sommierEntamer";
    
    public static final String regimeTitreExoInexistant = "error.regimeTitreExoInexistant";
    /**
     * DOUANE MESSAGES DE SUCCES
     */
    public static final String manifesteMisEnDepot = "message.manifesteMisEnDepot";

    public static final String rejetAnnulDeclEffectue = "message.rejetAnnulDeclEffectue";

    /**
     * DOUANE MESSAGES D'ERREURS
     */
    public static final String ddeMiseEnDepotNotFound = "error.ddeMiseEnDepotNotFound";

    public static final String ddeRecondArtManNotFound = "error.ddeRecondArtManNotFound";
    
    public static final String ddeDestructionNotFound = "error.ddeDestructionNotFound";
    
    public static final String ddeRegularisationNotFound = "error.ddeRegularisationNotFound";

    public static final String articleReconditionnementNotFound = "error.articleReconditionnementNotFound";

    public static final String sommierTotalementApure = "error.sommierTotalementApure";

    public static final String enlevementDejaEffectue = "error.enlevementDejaEffectue";

    public final static String DECCODEREGDOU_OB = "error.DECCODEREGDOU_OB";

    public final static String DECCODEVERIFICATEUR_OB = "error.DECCODEVERIFICATEUR_OB";

    public final static String DECDATEBAE_OB = "error.DECDATEBAE_OB";

    public final static String DECNOMDESTINATAIRE_OB = "error.DECNOMDESTINATAIRE_OB";

    public final static String DECNUMARTDECL_OB = "error.DECNUMARTDECL_OB";

    public final static String DECCODEDISPENSE_OB = "error.DECCODEDISPENSE_OB";

    public final static String dispensesKey = "error.dispensesKey";

    public final static String DECCODEPIECEJT_OB = "error.DECCODEPIECEJT_OB";

    public final static String DECCODESOUMDOC_OB = "error.DECCODESOUMDOC_OB";

    public final static String soumissiondocKey = "error.soumissiondocKey";

    public final static String DECANNEELIQUID_OB = "error.DECANNEELIQUID_OB";

    public final static String DECBASETAXELIQ_OB = "error.DECBASETAXELIQ_OB";

    public final static String DECBASETAXENORM_OB = "error.DECBASETAXENORM_OB";

    public final static String DECBUREAUENREGDEC_OB = "error.DECBUREAUENREGDEC_OB";

    public final static String DECCODEPPMDECLARANT_OB = "error.DECCODEPPMDECLARANT_OB";

    public final static String DECCODETAXE_OB = "error.DECCODETAXE_OB";

    public final static String DECDATEHISTOLIQ_OB = "error.DECDATEHISTOLIQ_OB";

    public final static String DECDATELIQUID_OB = "error.DECDATELIQUID_OB";

    public final static String DECMTTAXELIQ_OB = "error.DECMTTAXELIQ_OB";

    public final static String DECMTTAXENORM_OB = "error.DECMTTAXENORM_OB";

    public final static String DECMTTAXESUSPENDU_OB = "error.DECMTTAXESUSPENDU_OB";

    public final static String DECNUMDEC_OB = "error.DECNUMDEC_OB";

    public final static String DECNUMHISTOLIQ_OB = "error.DECNUMHISTOLIQ_OB";

    public final static String DECQUOTITELIQ_OB = "error.DECQUOTITELIQ_OB";

    public final static String DECQUOTITENORM_OB = "error.DECQUOTITENORM_OB";

    public final static String DECTYPETRAITEMENT_OB = "error.DECTYPETRAITEMENT_OB";

    public final static String DECCODEPROD_OB = "error.DECCODEPROD_OB";

    public final static String DECMODECOND_OB = "error.DECMODECOND_OB";

    public final static String DECNBRECOLISDECL_OB = "error.DECNBRECOLISDECL_OB";

    public final static String DECNUMDECLAPURANT_OB = "error.DECNUMDECLAPURANT_OB";

    public final static String DECPAYSORIGINE_OB = "error.DECPAYSORIGINE_OB";

    public final static String DECPDNETDEC_OB = "error.DECPDNETDEC_OB";

    public final static String DECPOIDSBRUTDEC_OB = "error.DECPOIDSBRUTDEC_OB";

    public final static String DECPRECSEN_OB = "error.DECPRECSEN_OB";

    public final static String DECPRECUEMOA_OB = "error.DECPRECUEMOA_OB";

    public final static String DECREGFISCAL_OB = "error.DECREGFISCAL_OB";

    public final static String hseggendecKey = "error.hseggendecKey";

    public final static String DECNUMARTCONTENEUR_OB = "error.DECNUMARTCONTENEUR_OB";

    public final static String DECBURDOUANE_OB = "error.DECBURDOUANE_OB";

    public final static String DECBURFRONTIERE_OB = "error.DECBURFRONTIERE_OB";

    public final static String DECCODEAGREE_OB = "error.DECCODEAGREE_OB";

    public final static String DECDATEENREGDEC_OB = "error.DECDATEENREGDEC_OB";

    public final static String DECNBREARTICLES_OB = "error.DECNBREARTICLES_OB";

    public final static String DECREGDOUANIER_OB = "error.DECREGDOUANIER_OB";

    public final static String bureaudouaneKey = "error.bureaudouaneKey";

    public final static String creditairesKey = "error.creditairesKey";

    public final static String modedeclarationKey = "error.modedeclarationKey";

    public final static String modetransportKey = "error.modetransportKey";

    public final static String regimedouanierKey = "error.regimedouanierKey";

    public final static String typeapurementKey = "error.typeapurementKey";

    public final static String DECANNEEENREGDEC_OB = "error.DECANNEEENREGDEC_OB";

    public final static String DECBURENREGDEC_OB = "error.DECBURENREGDEC_OB";

    public final static String DECDATEARCHIVE_OB = "error.DECDATEARCHIVE_OB";

    public final static String DECNUMARTDEC_OB = "error.DECNUMARTDEC_OB";

    public final static String DECPPMDECLARANT_OB = "error.DECPPMDECLARANT_OB";

    public final static String hsegartdecKey = "error.hsegartdecKey";

    public final static String ppmKey = "error.ppmKey";

    public final static String NumConteneurOB = "error.NumConteneurOB";

    public final static String ANNEEDECLARATION_OB = "error.ANNEEDECLARATION_OB";

    public static final String NumPlombOB = "error.NumPlombOB";

    public final static String BUREAUDEC_OB = "error.BUREAUDEC_OB";

    public static final String TailleOB = "error.TailleOB";

    public final static String DECBUREAUDEPART_OB = "error.DECBUREAUDEPART_OB";

    public static final String TypeContOB = "error.TypeContOB";

    public final static String DECCODEPPMDECL_OB = "error.DECCODEPPMDECL_OB";

    public final static String DECNUMREPERTOIRE_OB = "error.DECNUMREPERTOIRE_OB";

    public final static String DECREGIMEDOUANIER_OB = "error.DECREGIMEDOUANIER_OB";

    public final static String DECTYPEREGIME_OB = "error.DECTYPEREGIME_OB";

    public final static String NUMERODECLARATION_OB = "error.NUMERODECLARATION_OB";

    public final static String VISANNEEENREG_OB = "error.VISANNEEENREG_OB";

    public final static String VISBURENREG_OB = "error.VISBURENREG_OB";

    public final static String VISCODEPROD_OB = "error.VISCODEPROD_OB";

    public final static String VISMODECOND_OB = "error.VISMODECOND_OB";

    public final static String VISNBRECOLISDECL_OB = "error.VISNBRECOLISDECL_OB";

    public final static String VISNUMART_OB = "error.VISNUMART_OB";

    public final static String VISNUMDECLAPURANT_OB = "error.VISNUMDECLAPURANT_OB";

    public final static String VISPAYSORIGINE_OB = "error.VISPAYSORIGINE_OB";

    public final static String VISPDNET_OB = "error.VISPDNET_OB";

    public final static String VISPOIDSBRUT_OB = "error.VISPOIDSBRUT_OB";

    public final static String VISPRECSEN_OB = "error.VISPRECSEN_OB";

    public final static String VISPRECUEMOA_OB = "error.VISPRECUEMOA_OB";

    public final static String VISREGFISCAL_OB = "error.VISREGFISCAL_OB";

    public final static String devisesKey = "error.devisesKey";

    public final static String produitsKey = "error.produitsKey";

    public final static String paysKey = "error.paysKey";

    public final static String DECANNEEDECL_OB = "error.DECANNEEDECL_OB";

    public final static String DECBURDECLARATION_OB = "error.DECBURDECLARATION_OB";

    public final static String DECBURPASSAGE_OB = "error.DECBURPASSAGE_OB";

    public final static String DECNUMDECLARATION_OB = "error.DECNUMDECLARATION_OB";

    public final static String DECNUMPERTOIRE_OB = "error.DECNUMPERTOIRE_OB";

    public final static String DECPPDECLARANT_OB = "error.DECPPDECLARANT_OB";

    public final static String acquitvisiteKey = "error.acquitvisiteKey";

    public final static String VISANNEEDECL_OB = "error.VISANNEEDECL_OB";

    public final static String VISBUREAUDECL_OB = "error.VISBUREAUDECL_OB";

    public final static String VISCODEEMETTEUR_OB = "error.VISCODEEMETTEUR_OB";

    public final static String VISCORPSCONVOCATION_OB = "error.VISCORPSCONVOCATION_OB";

    public final static String VISDATECONVOCATION_OB = "error.VISDATECONVOCATION_OB";

    public final static String VISDATEEMISSION_OB = "error.VISDATEEMISSION_OB";

    public final static String VISNUMCONVOCATION_OB = "error.VISNUMCONVOCATION_OB";

    public final static String VISNUMERODECL_OB = "error.VISNUMERODECL_OB";

    public final static String VISTITRECONVOCATION_OB = "error.VISTITRECONVOCATION_OB";

    public final static String VISTYPECONVOCATION_OB = "error.VISTYPECONVOCATION_OB";

    public final static String seggendecKey = "error.seggendecKey";

    public final static String typeconvocationKey = "error.typeconvocationKey";

    public final static String VISCODEDISPENSE_OB = "error.VISCODEDISPENSE_OB";

    public final static String VISANNEELIQUID_OB = "error.VISANNEELIQUID_OB";

    public final static String VISBASETAXELIQ_OB = "error.VISBASETAXELIQ_OB";

    public final static String VISBASETAXENORM_OB = "error.VISBASETAXENORM_OB";

    public final static String VISBUREAUENREGDEC_OB = "error.VISBUREAUENREGDEC_OB";

    public final static String VISCODEPPMDECLARANT_OB = "error.VISCODEPPMDECLARANT_OB";

    public final static String VISCODETAXE_OB = "error.VISCODETAXE_OB";

    public final static String VISDATELIQUID_OB = "error.VISDATELIQUID_OB";

    public final static String VISMTTAXELIQ_OB = "error.VISMTTAXELIQ_OB";

    public final static String VISMTTAXENORM_OB = "error.VISMTTAXENORM_OB";

    public final static String VISMTTAXESUSPENDU_OB = "error.VISMTTAXESUSPENDU_OB";

    public final static String VISNUMDEC_OB = "error.VISNUMDEC_OB";

    public final static String VISQUOTITELIQ_OB = "error.VISQUOTITELIQ_OB";

    public final static String VISQUOTITENORM_OB = "error.VISQUOTITENORM_OB";

    public final static String VISTYPETRAITEMENT_OB = "error.VISTYPETRAITEMENT_OB";

    public final static String VISANNNEDECL_OB = "error.VISANNNEDECL_OB";

    public final static String VISCODEBURDECL_OB = "error.VISCODEBURDECL_OB";

    public final static String VISCODTTX_OB = "error.VISCODTTX_OB";

    public final static String VISMNTTXL_OB = "error.VISMNTTXL_OB";

    public final static String VISNUMARTDCL_OB = "error.VISNUMARTDCL_OB";

    public final static String VISNUMDECL_OB = "error.VISNUMDECL_OB";

    public final static String agreeKey = "error.agreeKey";

    public final static String taxesKey = "error.taxesKey";

    public final static String typeliquidationsuppKey = "error.typeliquidationsuppKey";

    public final static String VISANNEEENREGDEC_OB = "error.VISANNEEENREGDEC_OB";

    public final static String VISBURENREGDEC_OB = "error.VISBURENREGDEC_OB";

    public final static String VISCODEPIECEJT_OB = "error.VISCODEPIECEJT_OB";

    public final static String VISNUMARTDEC_OB = "error.VISNUMARTDEC_OB";

    public final static String VISNUMDECLARATION_OB = "error.VISNUMDECLARATION_OB";

    public final static String segartdecKey = "error.segartdecKey";

    public final static String piecesjointesKey = "error.piecesjointesKey";

    public final static String ANNEEPV_OB = "error.ANNEEPV_OB";

    public final static String BUREAUPV_OB = "error.BUREAUPV_OB";

    public final static String DATEPV_OB = "error.DATEPV_OB";

    public final static String NATUREMARCHANDISES_OB = "error.NATUREMARCHANDISES_OB";

    public final static String NATUREPV_OB = "error.NATUREPV_OB";

    public final static String NOMBRECONSTATE_OB = "error.NOMBRECONSTATE_OB";

    public final static String NUMEROPV_OB = "error.NUMEROPV_OB";

    public final static String POIDSCONSTATE_OB = "error.POIDSCONSTATE_OB";

    public final static String VALEURCONSTATEE_OB = "error.VALEURCONSTATEE_OB";

    public final static String naturepvKey = "error.naturepvKey";

    public final static String VISANNEEDECLARATION_OB = "error.VISANNEEDECLARATION_OB";

    public final static String VISBUREAUDECLARATION_OB = "error.VISBUREAUDECLARATION_OB";

    public final static String VISCODESOUMDOC_OB = "error.VISCODESOUMDOC_OB";

    public final static String VISCODEVERIFICATEUR_OB = "error.VISCODEVERIFICATEUR_OB";

    public final static String VISDATEBAE_OB = "error.VISDATEBAE_OB";

    public final static String VISDATEECHEANCESOUM_OB = "error.VISDATEECHEANCESOUM_OB";

    public final static String VISNOMDESTINATAIRE_OB = "error.VISNOMDESTINATAIRE_OB";

    public final static String VISNUMARTDECL_OB = "error.VISNUMARTDECL_OB";

    public final static String VISREGIMEDOUANIER_OB = "error.VISREGIMEDOUANIER_OB";

    public final static String VISTYPEREGIME_OB = "error.VISTYPEREGIME_OB";

    public final static String visitStartedContactInspector = "error.visitNotStartedContactInspector";

    public final static String DECBURENREGDECL_OB = "error.DECBURENREGDECL_OB";

    public final static String segcontdecKey = "error.segcontdecKey";

    public final static String typeconteneurKey = "error.typeconteneurKey";

    public static final String DECLARATIONDEJAVALIDEE = "error.DeclarationDejaValidee";

    public static final String VALIDATIONIMPOSSIBLEMODEPAIEMENTINCORRECT = "error.ValidationImpossibleModePaiementIncorrect";

    public static final String VALIDATIONIMPOSSIBLEMODEDECLARATIONINCORRECT = "error.ValidationImpossibleModeDeclarationIncorrect";

    public static final String ETATINCOMPATIBLEAVECDELIVRANCEBAE = "error.EtatIncompatibleAvecDelivranceBAE";

    public final static String RCCODECIMEX_OB = "error.RCCODECIMEX_OB";

    public final static String RCCODEPROD_OB = "error.RCCODEPROD_OB";

    public final static String RCCODETAUX_OB = "error.RCCODETAUX_OB";

    public final static String RCDATEVALEUR_OB = "error.RCDATEVALEUR_OB";

    public final static String RCPRECSENEGAL_OB = "error.RCPRECSENEGAL_OB";

    public final static String RCPRECUEMOA_OB = "error.RCPRECUEMOA_OB";

    /** MODULE DOUANE */
    public final static String succefullEnvoiConvocation = "message.succefullEnvoiConvocation";

    public final static String CODEMAJ_OB = "error.CODEMAJ_OB";

    public final static String CODEUTILISATEUR_OB = "error.CODEUTILISATEUR_OB";

    public final static String DATEMAJ_OB = "error.DATEMAJ_OB";

    public final static String HEUREMAJ_OB = "error.HEUREMAJ_OB";

    public final static String NUMERODFICHE_OB = "error.NUMERODFICHE_OB";

    public final static String CODEDOCUMENT_OB = "error.CODEDOCUMENT_OB";

    public final static String CODEPRODUIT_OB = "error.CODEPRODUIT_OB";

    public final static String NUMEROGAMME_OB = "error.NUMEROGAMME_OB";

    public final static String PAYSORIGINE_OB = "error.PAYSORIGINE_OB";

    public final static String COMPTEUR_OB = "error.COMPTEUR_OB";

    public final static String NUMEROFICHE_OB = "error.NUMEROFICHE_OB";

    public final static String ORIGINE_OB = "error.ORIGINE_OB";

    public final static String POSITIONTARIFAIRE_OB = "error.POSITIONTARIFAIRE_OB";

    public final static String UNITEMONETAIRECOUT_OB = "error.UNITEMONETAIRECOUT_OB";

    public final static String documentKey = "error.documentKey";

    public final static String mainLeveeDepotSuccess = "error.mainLeveeDepotSuccess";
    public final static String reeditionSuccess = "error.reeditionBaeSuccess";
    public final static String reeditionFailed = "error.reeditionBaeFailed";
    public final static String reeditionRefuser = "error.reeditionBaeRefuser";

    public final static String miseDepotSuccess = "error.miseDepotSuccess";
    public final static String RefusMiseDepotSuccess = "error.refusMiseDepotSuccess";

    /// PARTIE DOUANE ENLEVEMENTS
    public final static String BURDECLARATION_OB = "error.BURDECLARATION_OB";

    public final static String DATEENLEVEMENT_OB = "error.DATEENLEVEMENT_OB";

    public final static String NBRECOLISENLEVE_OB = "error.NBRECOLISENLEVE_OB";

    public final static String NUMARTDECL_OB = "error.NUMARTDECL_OB";

    public final static String NUMDECLARATION_OB = "error.NUMDECLARATION_OB";

    public final static String POIDSENLEVE_OB = "error.POIDSENLEVE_OB";

    public final static String errorColisEnleve = "error.errorColisEnleve";

    public final static String errorPoidsEnleve = "error.errorPoidsEnleve";

    //DLPP
    public final static String DLPPANNEEDLPP_OB = "error.DLPPANNEEDLPP_OB";

    public final static String DLPPCODEPPMDECLARANT_OB = "error.DLPPCODEPPMDECLARANT_OB";

    public final static String DLPPNUMARTICLE_OB = "error.DLPPNUMARTICLE_OB";

    public final static String DLPPNUMREPERTOIRE_OB = "error.DLPPNUMREPERTOIRE_OB";

    public final static String brouillonseggendlppKey = "error.brouillonseggendlppKey";

    public final static String RCCODEMODEDECDLPP_OB = "error.RCCODEMODEDECDLPP_OB";

    public final static String RCLIBELLEMODEDECDLPP_OB = "error.RCCODEMODEDECDLPP_OB";

    public final static String DLPPCODEBUREAU_OB = "error.DLPPCODEBUREAU_OB";

    public final static String DLPPNUMDLPP_OB = "error.DLPPNUMDLPP_OB";

    public final static String DLPPCODEBAC_OB = "error.DLPPCODEBAC_OB";

    public final static String brouillonarticledlppKey = "error.brouillonarticledlppKey";

    public final static String articledlppKey = "error.articledlppKey";

    public final static String seggendlppKey = "error.seggendlppKey";

    public final static String successfulValidateDlpp = "message.successfulValidateDlpp";

    public final static String successfulAnnulerDlpp = "message.successfulAnnulerDlpp";

    public final static String succefulDeleteArticleDlpp = "message.succefulDeleteArticleDlpp";

    public final static String successfulValEcor = "message.successfulValEcor";

    //DEPOTPETROLIER
    public final static String RCCODEDEPOT_OB = "error.RCCODEDEPOT_OB";

    //ECOR
    public final static String ECORANNEE_OB = "error.ECORANNEE_OB";

    public final static String ECORCODEBUREAU_OB = "error.ECORCODEBUREAU_OB";

    public final static String ECORNUMERO_OB = "error.ECORNUMERO_OB";

    public final static String ECORNUMART_OB = "error.ECORNUMART_OB";

    public final static String ECORCODEPRODUIT_OB = "error.ECORCODEPRODUIT_OB";

    public final static String ECORPRECSENEGAL_OB = "error.ECORPRECSENEGAL_OB";

    public final static String ECORPRECUEMOA_OB = "error.ECORPRECUEMOA_OB";

    public final static String ECORVALEURPROD_OB = "error.ECORVALEURPROD_OB";

    public final static String articleecorKey = "error.articleecorKey";

    public final static String ecorKey = "error.ecorKey";

    public final static String successfulDeleteEcor = "message.successfulDeleteEcor";

    public final static String successfulDeleteArticleEcor = "message.successfulDeleteArticleEcor";

    public final static String succefulInsertProd = "message.succefulInsertProd";

    public final static String successfulEvaluationEcor = "message.successfulEvaluationEcor";

    /** *TYPEIDENTIFICATION* */
    public final static String RCCODETYPIECE_OB = "error.RCCODETYPIECE_OB";

    public final static String RCLIBELLETYPEPIECE_OB = "error.RCLIBELLETYPEPIECE_OB";

    /** **BAREME******** */
    public final static String RCCODEBUREAU_OB = "error.RCCODEBUREAU_OB";

    public final static String RCPRECSEN_OB = "error.RCPRECSEN_OB";

    public final static String RCVALEURUNITAIRE_OB = "error.RCVALEURUNITAIRE_OB";

    /** fiche de dedouanement**** */
    public final static String fichededouanementKey = "error.fichededouanementKey";

    public final static String histobulletinecorKey = "error.histobulletinecorKey";

    public final static String ECORDATEDERNIERMAJ_OB = "error.ECORDATEDERNIERMAJ_OB";

    public final static String produitNonActif = "error.produitNonActif";

    public final static String bacDepotExistant = "error.bacDepotExistant";

    public final static String bacdepotsupprime = "error.bacdepotsupprime";

    public final static String regecoobligdlpp = "error.regecoobligdlpp";

    public final static String regecoincompdlpp = "error.regecoincompdlpp";
    
    public static final String bureauNot13L = "error.bureauNot13L";
    
    public static final String succefulChangePwd = "message.succefulChangePwd";
    
    public static final String sommierDejaSolde = "error.sommierDejaSolde";
    
    public static final String sommierDepot = "error.sommierDepot";
    
	public final static String DECBURDECL_OB="error.DECBURDECL_OB";
	public final static String DECDATECREATIONBAE_OB="error.DECDATECREATIONBAE_OB";
	public final static String DECNUMDECL_OB="error.DECNUMDECL_OB";
	
	public final static String DATEAJOUT_OB="error.DATEAJOUT_OB";
	public final static String NUMEROQUITTANCE_OB="error.NUMEROQUITTANCE_OB";

	public final static String TRANCHEDEBUT_OB="error.TRANCHEDEBUT_OB";
	public final static String TRANCHEFIN_OB="error.TRANCHEFIN_OB";
	public final static String TYPEQUITTANCE_OB="error.TYPEQUITTANCE_OB";
	
	public final static String DECCODEAGT_OB="error.DECCODEAGT_OB";
	public final static String DECDATEDECL_OB="error.DECDATEDECL_OB";
	

	public final static String errorIP = "error.adresseIp";
	public final static String liberationSignatureUser1 = "message.liberationSignatureUser";
	public final static String liberationSignatureUser2 = "error.liberationSignatureUser";
	public final static String reinintPwdUser1 = "error.reinintPwdUser1";
	public final static String reinintPwdUser2 = "message.reinintPwdUser2";
	public final static String reinintPwdUser3 = "message.reinintPwdUser3";
	public final static String userNonConnecte = "message.userNonConnecte";
	
    	//Blocage/Deblocage Declarations
	public final static String blocageSuccess = "error.blocageSuccess";
	public final static String deblocageSuccess = "error.deblocageSuccess";
	public static final String INSPECIFIED_ERROR = "error.InspecifiedError";
	public final static String rechCessionSommFaillite = "error.rechCessionSommFaillite";
	
    public ConstErrCod() {
        super();
    }

}
