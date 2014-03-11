package tn.com.tw.java.exception;

/**
 * 
 * 
 */
public class ConstErrCod {
    public static final String CREATEPREVISION = "message.creationPrevisionNavire";
    public static final String TRANSFERTRECTIFICATION = "message.transfertRectification";
	public static final String CODEVERIF = "error.codeVerificateur";
	public static final String ERREURCREATEPREVISION = "error.creationPrevisionNavire";
    public static final String CREATE_EXCEPTION = "error.createException";

    public static final String SESSION_HAS_EXPIRED = "error.sessionHasExpired";

    public static final String ACCES_DENIED = "error.accessDenied";

    public static final String ACCESS_DENIED_DECLARANT = "accessDeniedDeclarant";

    public static final String ACCESS_DENIED_CONSIGNATAIRE = "accessDeniedConsignataire";

    public static final String ACCESS_DENIED_NOT_CREDITAIRE = "accessDeniedNotCreditaire";

    public static final String SESSION_ALREADY_OPEN = "sessionAlreadyOpen";

    public static final String TRANSACTION_FAILED = "error.failedTransaction";

    public static final String DUPKEY_INSERT = "error.dupkeyinsert";

    public static final String ROW_NOTFOUND = "error.rowNotFound";

    public static final String RECH_CESSION_SOMM = "error.rechCessionSomm";

    public static final String FIELD_CHANGED = "error.fieldChanged";

    //exception d�clench�e si la valeur de dao et de cmp n'est pas synchronis�

    public static final String NAMING_EXP = "error.namingExp";

    //Exception est d�clench�e s'ilya eu un probl�me li� au cmp
    //ou bien un probl�me de connection � la base

    public static final String INSERT_EXP = "error.insertExp";

    //exception d�clench� lors d'insertion d'un champs �trang� qui ne
    // correspond pas parent ou lorsque un champs not null n'est pas remplit ou
    // il ya un probl�me de connexion � la base ou un probl�me g�n�ral de la
    // base

    public static final String EJB_EXP = "error.ejbExp";

    public static final String REMOVE_EXP = "error.removeExp";

    public static final String REMOTE_EXPSB = "error.remoteExpSB";

    public static final String REMOVE_EXPSB = "error.removeExpSB";

    public static final String PK_REQUIRED = "error.PkRequired";

    public static final String SUCCESFUL_ENLEVEMENT = "message.succefulEnlevement";

    public static final String SUCCESFUL_CANCEL_ENLEVEMENT = "message.succefulCancelEnlevement";

    public static final String SUCCESFUL_INSERT= "message.succefulInsert";
    
    public static final String SUCCESFUL_PROPAGATION= "message.insertProrogation";

    public static final String SUCCESFUL_ENREG = "message.succefulEnreg";

    public static final String SUCCESFUL_COPY = "message.succefulCopy";

    public static final String SUCCESFUL_UPDATE= "message.succefulUpdate";

    public static final String SUCCESFUL_DELETE = "message.succefulDelete";

    public static final String SUCCESFUL_SEND = "message.succefulSend";

    public static final String SUCCESFUL_RECEVABILITE = "message.succefullRecevabilite";

    public static final String  SUCCESFUL_VALIDATE = "message.successfullValidate";

    public static final String  SUCCESFUL_ACCEPTATION = "message.successfullAccpetation";

    public static final String  SUCCESFUL_CONVOCATION = "message.succefulInsertConvocation";
    
    public static final String  SUCCESFUL_REJECT = "message.successfullReject";

    public static final String  SUCCESFUL_ATTRIBUTION_BAE = "message.successfullAttributionBae";

    public static final String INSPECIFIED_ERROR = "error.InspecifiedError";

    public static final String  SUCCESFUL_SAVE = "message.succefulSave";

    public static final String FOREIGN_KEY = "error.foreignKey";

    public static final String SQLEXCEPTION = "error.SQLException";

    public static final String LOGIN_ERROR = "error.loginError";

    public static final String INSUFFISANT_DATA = "error.insuffisantData";

    public static final String CONTROLE_OK = "message.controleOK";

    //******************************************************************//
    //						constantes module manifeste //
    //******************************************************************//
    public static final String MANIFESTE_ENREGISTREE = "message.manifesteEnregistree";

    public static final String MANIFESTE_SUPPRIMEE = "message.manifesteSupprimee";

    public static final String ARTICLE_SUPPRIMEE = "message.articleSupprimee";

    public static final String CONTENEUR_SUPPRIMEE = "message.conteneurSupprimee";

    public static final String CONTENEUR_MODIFIEE = "message.conteneurModifiee";

    public static final String FERMETURE_MANIF_COMPLEM = "message.fermetureManifComplem";

    public static final String ENREGISTREMENT_PARTIEL_EFFECTUEE = "message.enregistrementPartielEffectuee";
    
    public static final String ENREGISTREMENT_PARTIEL_IMPOSSIBLE = "error.enregistrementPartielImpossible";

    public static final String CAPBRUTE = "error.capaciteBrute";

    public static final String CONTENEUR_RECONDITIONNEMENT_NOTFOUND = "error.conteneurReconditionnementNotFound";

    public static final String DETAILED_NOTFOUND = "error.DetailNotFound";

    public static final String SUCCEFUL_ENVOI_FRACTIONNE_OPERATION = "message.succefulEnvoiFractionneOperation";

    public static final String INVALID_SUPP_ACTION_ART_DEGROUPAGE = "error.invalidSuppActionArtDegroupage";

    public static final String INVALID_DEGROUPAGE_SANSCONT = "error.invalidDegroupageSansCont";

    public static final String INVALID_COLIS_GPE = "error.invalidColisDegroupe";

    public static final String INVALID_POIDS_GPE = "error.invalidPoidsDegroupe";

    public static final String INVALID_COLIS_DEPOT = "error.invalidColisDdeDepot";

    public static final String INVALID_POIDS_DEPOT = "error.invalidPoidsDdeDepot";

	public static final String VERIF_BUREAU =  "error.VerifBureau";;

    public static final String INVALID_POIDS_DEGZERO = "error.invalidePoidsDegZero";

    public static final String INVALID_NbCOLIS_DEGZERO = "error.invalideNbColisDegZero";

    public static final String INVALID_DEGROUPAGE_ACTION= "error.invalidDegroupageAction";

    public static final String INVALID_DEGROUPAGE_ACTION_VALUENULL = "error.invalidDegroupageActionValueNull";

    public static final String INVALID_DEGROUPAGE_ACTION_VALUE_EXCES = "error.invalidDegroupageActionValueExces";

    public static final String INCOHERENCE_DEGROUPAGE_ACTION = "error.incoherenceDegroupageAction";

    public static final String DEGROUPAGE_PARTIEL_ABOUTI = "message.degroupagePartielAbouti";

    public static final String DEGROUPAGE_TOTAL_ABOUTI = "message.degroupageTotalAbouti";

    public static final String ARTICLE_ALREADY_DEGROUPED = "error.articleAlreadyDegrouped";

    public static final String DUPKEY_INSERT_BROUILLON_CONT = "error.dupkeyinsertbrouilloncont";

    public static final String INVALID_NUM_CONTENEUR = "error.invalidNumConteneur";

    public static final String INVALIDE_NBR_CONTENEUR = "error.invalidNbreConteneur";

    public static final String INVALID_NBR_CONTENEUR_AMODIFIER = "error.invalidNbreConteneurAmodifier";

    public static final String SOUSARTICLE_SUPPRIME = "message.sousArticleSupprime";

    public static final String SOUSARTICLE_MODIFIEE = "message.sousArticleModifie";

    public static final String INVALID_DEGROUPE_SOUSARTICLE_ACTION = "error.invalidDegroupeSousArticleAction";

    public static final String INVALID_ENREG_PARTIEL_ARTICLE = "error.invalidEnregPartielArticle";

    public static final String INVALID_RECOND_SOUSARTICLE_ACTION = "error.invalidRecondSousArticleAction";

    public static final String INVALID_RECOND_ACTION = "error.invalidRecondAction";

    public static final String INVALID_COLIS_DDE_REGUL = "error.invalidColisDdeRegul";

    public static final String BUREAU_NONTYPE_AERIEN = "error.bureauNonTypeAerien";

    public static final String INVALID_COLIS_RECOND = "error.invalideColisRecond";

    public static final String INVALID_POIDS_RECOND = "error.invalidPoidsRecond";

    public static final String NOMBRE_COLIS_MUST_BELESS_OREQUAL = "error.NombreColisMustBeLessOrEqual";

    public static final String POIDS_MUST_BELESS_OREQUAL  = "error.PoidsMustBeLessOrEqual";

    public static final String DUPLICATE_MANIFESTE_COMPLEMENTAIRE= "error.duplicateManifesteComplemantaire";

    public static final String INVALID_SUPP_MANIFESTE_COMPLEMENTAIRE = "error.InvalidSuppManifesteComplementaire";

    public static final String SUCCESFULL_APUREMENT_OPERATION = "message.succefulApurementOperation";

    public static final String DUPLICATE_NUM_REPEROIRE = "error.duplicateNumRepertoire";

    public static final String CHAINE_KEY = "error.chaineKey";

    public static final String INVALID_LTAD_DEREGUL = "error.invalidLTADdeRegul";

    public static final String INVALID_REPD_DEREGUL = "error.invalidREPDdeRegul";

    public static final String INSUFFISANT_DATA_DDE_REGUL = "error.insuffisantDataDdeRegul";

    public static final String INVALID_BUREAU_DEMANDE_REGUL = "error.invalidBureauDemandeRegul";

    public static final String CONTROL_DE_REGULOK = "message.controleDdeRegulOk";

    public static final String MANIFESTE_REGUL_NOTFOUND = "error.manifesteRegulNotFound";

    public static final String MANIFESTE_ENREGISTRED_NOTFOUND = "error.manifesteAenregistrerNotFound";

    public static final String ARTICLE_REGUL_NOTFOUND = "error.articleRegulNotFound";

    public static final String REGLEMENT_IMPORT_INEXIST = "error.reglementImportInExist";

    public static final String INVALID_MANIF_REGUL_AERIEN = "error.invalidManifRegulAerien";

    public static final String INVALID_LTA_REGUL_AERIEN = "error.invalidLTARegulAerien";

    public static final String INVALID_ART_REGUL_AERIEN = "error.invalidArtRegulAerien";

    public static final String INVALID_NUMVOL_REGUL_AERIEN = "error.invalidnumvolregulAerien";

	public static final String OUT_OF_MEMORY = "error.outofmemory";

    public static final String CRITERE_KEY = "error.critereKey";

    public static final String INVALID_DATE_ARRIVEE_REGUL_AERIEN = "error.invalidDateArriveeRegulAerien";

    public static final String MANIFESTE_AERIEN_NOTFOUND = "error.manifesteAerienNotFound";

    public static final String MANIFESTE_GROUPAGE_NOTFOUND = "error.manifesteGroupageNotFound";

    public static final String COLIS_AERIEN_NOTFOUND = "error.colisAerienNotFound";

    public static final String HISTO_SCORE_BUR_NOTFOUND = "error.histoScoreBurNotFound";

    public static final String COLIS_GROUPAGE_NOTFOUND = "error.colisGroupageNotFound";

    public static final String LTA_AERIEN_NOTEQUALS = "error.ltaAerienNotEquals";

    public static final String invalidnomdestinataireregulAerien = "error.invalidnomdestinataireregulAerien";

    public static final String invalidnbreColisregulAerien = "error.invalidnbreColisregulAerien";

    public static final String invalidpoidregulAerien = "error.invalidpoidregulAerien";

    public static final String cumulPoidsNotCorresponding = "error.cumulPoidsNotCorresponding";

    public static final String cumulColisNotCorresponding = "error.cumulColisNotCorresponding";

    public static final String ARTICLE_LIST_EMPTY = "error.articleListEmpty";

    public static final String articleLtaNotGood = "error.articleLtaNotGood";

    public static final String articleWithoutOptionF = "error.articleWithoutOptionF";

    public static final String CONF_PWERR = "error.confpwerr";
    
    public static final String confpwerrPwdEqualCodeUser = "error.confpwerrPwdEqualCodeUser";

    public static final String articleReceptionNotFound = "error.articleReceptionNotFound";

    public static final String invalidBureauAerien = "error.invalidBureauAerien";

    public static final String NOMATCH_FOUND = "error.noMatchFound";
    
    public static final String NOAGENT_FOUND = "error.noAgentFound";

    public static final String foreignKeySegmentgenmanifesteLocal = "error.foreignKeySegmentgenmanifesteLocal";

    public static final String foreignKeyArticlemanifesteLocal = "error.foreignKeyArticlemanifesteLocal";

    public static final String invalidDateArriveeManif = "error.invalidDateArriveeManif";

    public static final String invalidateEnregDefinitif = "error.invalidateEnregDefinitif";

    public static final String NUM_VOL_ERRONEE = "error.NUM_VOL_ERRONEE";

    public static final String DATE_ARRIVEE_ERRONEE = "error.DATE_ARRIVEE_ERRONEE";

    public static final String NumConteneurNbrePositionMinError = "error.NumConteneurNbrePositionMinError";

    public static final String notNumConteneurNbrePositionError = "error.notNumConteneurNbrePositionError";

	public static final String DOSSIER_AR = "error.dossierAR";
	
	public static final String DOSSIER_AV = "error.dossierAV";
	
	public static final String DOSSIER_TR = "error.dossierTR";
	
	public static final String MANIFESTE_A_ENREGISTRER_NOT_FOUND = "error.manifesteAenregistrerNotFound";
	 
	public static final String JAUGE_BRUT_ERRONE = "error.JAUGE_BRUT_ERRONE";
	public static final String JAUGE_NETTE_ERRONE = "error.JAUGE_NETTE_ERRONE";
	public static final String NUM_VOLUME_ERRONE = "error.NUM_VOLUME_ERRONE";	 
	public static final String POIDS_ERRONE = "error.POIDS_ERRONE";
	public static final String NBRE_COLIS_ERRONE = "error.NBRE_COLIS_ERRONE";
	public static final String NBRE_CONTENEUR_ERRONE = "error.NBRE_CONTENEUR_ERRONE";

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
    public static final String FOREIGNKEY_BUREAUDOUANE_LOCAL = "error.foreignKeyBureaudouaneLocal";

    public static final String FOREIGNKEY_TYPECONTENEUR_LOCAL = "error.foreignKeyTypeconteneurLocal";

    public static final String FOREIGNKEY_KEYTYPE_VOIELOCAL = "error.foreignKeyTypevoieLocal";

    public static final String FOREIGNKEY_LIEUEMBARQUEMENT_LOCAL = "error.foreignKeyLieuembarquementLocal";

    public static final String FOREIGNKEY_MODECONDITIONNEMENT_LOCAL = "error.foreignKeyModeconditionnementLocal";

    public static final String FOREIGNKEY_CONSIGNATAIRE_LOCAL = "error.foreignKeyConsignatairesLocal";

    public static final String FOREIGNKEY_TYPE_SENSVOY_LOCAL = "error.foreignKeyTypesensvoyLocal";

    public static final String FOREIGNKEY_TYPENAVIRE_LOCAL = "error.foreignKeyTypenavireLocal";

    public static final String FOREIGNKEY_TYPENATURECARG_LOCAL= "error.foreignKeyTypenaturecargLocal";

    public static final String FOREIGNKEY_TYPEMANIFESTE_LOCAL = "error.foreignKeyTypemanifesteLocal";

    public static final String FOREIGNKEY_TYPEDESTFISCAL_LOCAL = "error.foreignKeyTypedestfiscalLocal";

    public static final String FOREIGNKEY_PAYSLOCAL_PROV = "error.foreignKeyPaysLocalProv";

    public static final String FOREIGNKEY_TYPE_APUREMENT = "error.foreignKeyTypeapurement";

    public static final String FOREIGNKEY_PAYSLOCAL_ORIGINE = "error.foreignKeyPaysLocalOrigine";

    public static final String FOREIGNKEY_MODETRANSPORT_LOCAL = "error.foreignKeyModetransportLocal";

    public static final String FOREIGNKEY_COMPAGNIE_ASSISTEE_LOCAL = "error.foreignKeyCompagnieassisteeLocal";

    public static final String FOREIGNKEY_BROUILLON_SEGART_LOCAL = "error.foreignKeyBrouillonsegartLocal";

    public static final String FOREIGNKEY_PPMLOCAL_DESTINATAIRE = "error.foreignKeyPpmLocalDestinataire";

    public static final String FOREIGNKEY_PPMLOCAL_AORDREDE = "error.foreignKeyPpmLocalAOrdrede";

    public static final String FOREIGNKEY_PYASLOCAL = "error.foreignKeyPaysLocal";

    public static final String FOREIGNKEY_BROUILLON_SEGENMANT_LOCAL = "error.foreignKeyBrouillonsegenmanLocal";

    public static final String FOREIGNKEY_PAYSLOCAL_PAVILLON = "error.foreignKeyPaysLocalPavillon";

    public static final String ERREUR_RECHERCHE = "error.recherche";

    public static final String FOREIGNKEY_BUREAUDOUANE_LOCAL_ENTREE = "error.foreignKeyBureaudouaneLocalEntree";

    public static final String FOREIGNKEY_BUREAUDOUANE_LOCAL_ENREG = "error.foreignKeyBureaudouaneLocalEnreg";

    public static final String FOREIGNKEY_LIEU_DEPOT_LOCAL= "error.foreignKeyLieudepotLocal";

    public static final String FOREIGNKEY_DDERECONDARTMAN_LOCAL = "error.foreignKeyDderecondartmanLocal";

    public static final String FOREIGNKEY_DDERECTIFARTMAN_LOCAL = "error.foreignKeyDderectifartmanLocal";

    public static final String FOREIGNKEY_MEESSAGES_LOCAL = "error.foreignKeyMessagesLocal";

    public static final String FOREIGNKEY_UTILISATEUR_LOCAL = "error.foreignKeyUtilisateurLocal";

    public static final String FOREIGN_AGREE_KEY = "error.foreignAgreeKey";

    public static final String FOREIGN_BUR_DEPPROV_KEY = "error.foreignBurDepProvKey";

    public static final String FOREIGN_BUR_DESTSEN_KEY = "error.foreignBurDestSenKey";

    public static final String fFOREIGN_BUR_DESTUEMOA_KEY = "error.foreignBurdestUemoaKey";

    public static final String FOREIGN_BUR_ENREG_KEY = "error.foreignBureauEnregKey";

    public static final String FOREIGN_BUR_ENREGMANIF_KEY = "error.foreignBurEnregManifKey";

    public static final String FOREIGN_BUR_FRONT_KEY = "error.foreignBurFrontKey";

    public static final String FOREIGN_CREDITAIRE_KEY = "error.foreignCreditaireKey";

    public static final String FOREIGN_MODEDEC_KEY = "error.foreignModeDecKey";

    public static final String FOREIGN_MODETRANS_KEY = "error.foreignModeTranspKey";

    public static final String FOREIGN_PAYSDESTDEF_KEY = "error.foreignPaysDestDefKey";

    public static final String FOREIGN_PAYSDEST_KEY = "error.foreignPaysDestKey";

    public static final String FOREIGN_PAYSPROV_KEY = "error.foreignPaysProvKey";

    public static final String FOREIGN_PPMDESTINATAIRE_KEY = "error.foreignPpmDestinataireKey";

    public static final String FOREIGN_PPM_EXPEDITEUR_KEY = "error.foreignPpmExpediteurKey";

    public static final String FOREIGN_TYPE_APUREMENT_KEY = "error.foreignTypeApurementKey";

    public static final String FOREIGN_TYPEREGIME_KEY = "error.foreignTypeRegimeKey";

	public static final String POIDSENLEVE = "error.poidsenleve";

    public static final String FOREIGN_BROUILLON_EGGENDEKEY = "error.foreignBrouilloneggendecKey";

    public static final String FOREIGN_DEVISEASSURKEY = "error.foreignDeviseAssurKey";

    public static final String FOREIGN_DEVISEAUTREKEY = "error.foreignDeviseAutreKey";

    public static final String FOREIGN_DEVISEFRETKEY = "error.foreignDeviseFretKey";

    public static final String FOREIGN_DEVISEFACTKEY = "error.foreignDeviseFactKey";

    public static final String FOREIGN_DEVISEFOBKEY= "error.foreignDeviseFobKey";

    public static final String FOREIGN_PMP_DECLARANATKEY = "error.foreignPpmDeclarantKey";

    public static final String FOREIGN_PRODUITSKEY = "error.foreignProduitsKey";

    public static final String FOREIGN_PRG_ASSURKEY = "error.foreignPRGAssurKey";

    public static final String FOREIGN_PRG_FACTKEY = "error.foreignPRGFactKey";

    public static final String FOREIGN_PRG_FRETKEY = "error.foreignPRGFretKey";

    public static final String FOREIGN_PRG_FOBKEY = "error.foreignPRGFobKey";

    public static final String FOREIGN_PRG_AUTRESKEY = "error.foreignPRGAutresKey";

    public static final String FOREIGN_PAYS_ORIGINEKEY = "error.foreignPaysOrigineKey";

    public static final String FOREIGN_PAYS_DESTINATAIREKEY = "error.foreignPaysDestinationKey";

    public static final String FOREIGN_PAYS_DOCMISCONSKEY = "error.foreignPaysDocMisConsKey";

    public static final String FOREIGN_REGIMEFISCAL_KEY = "error.foreignRegimeFiscalKey";

    /*
     * public static final String
     * classNotFoundException="error.classNotFoundException"; public static
     * final String nullPointerException="error.nullPointerException";
     */
    public static final String INSTANTIATION_EXCEPTION = "error.instantiationException";

    public static final String ILLEGAL_ACCESS_EXCEPTION = "error.illegalAccessException";

    public static final String MANIFESTE_NOTFOUND = "error.manifesteNotFound";

    public static final String ARTICLE_NOTFOUND = "error.articleNotFound";

    public static final String CONTENEUR_NOTFOUND = "error.conteneurNotFound";

    public static final String FONCTIONNALITE_NOTFOUND = "error.FonctionnaliteNotFound";

    public static final String NUM_CONTENEUR_ERROR_NBRE_POSITION_ERROR = "error.numConteneurNbrePositionError";

    public static final String NUM_CONTENEUR_ERROR2 = "error.numConteneurError2";

    public static final String NUM_CONTENEUR_ERROR3 = "error.numConteneurError3";

    public static final String INVALID_DATE_EMBARQ_ARTICLE = "error.InvalidDateEmbarqArticle";

    public static final String ENREGISTREMENT_ARTICLE_DELAI_DEPASSEE = "error.enregistrementAricleDelaiDepassee";

    public static final String NUM_REPERTOIRE_INVALID = "error.numRepertoireInvalid";

    public static final String IMPORTATION_IMPOSSIBLE = "error.importationImpossible";

    public static final String MANIFESTE_COMP_ADDED = "message.manifesteCompAdded";

    public static final String ARTICLE_ADDED = "message.articleAdded";

    public static final String MANIFESTE_ADDED = "message.manifesteAdded";

    public static final String DEMANDE_DESTRUCTION_ADDED = "message.demandeDestructionAdded";

    public static final String DEMANDE_DESTRUCTION_DELETED = "message.demandeDestructionDeleted";

    //******************************************************************//
    //					constantes module declaration //
    //******************************************************************//

    public static final String FOREIGNKEY_BROUILLON_ARTDEC = "error.foreignKeybrouillonartdec";

    public static final String FOREIGNKEY__SOMMIERS = "error.foreignKeySommiers";

    public static final String FOREIGNKEY__REGIME_DOUANIER = "error.foreignKeyRegimedouanier";

    public static final String FOREIGNKEY__REGIME_FISCAL = "error.foreignKeyRegimefiscal";

    public static final String FOREIGNKEY__DEG_ARTDEC = "error.foreignKeySegartdec";

    public static final String FOREIGNKEY_BROUILLON_SEGGENDEC = "error.foreignKeybrouillonseggendec";

    public static final String FOREIGNKEY_PPM = "error.foreignKeyPpm";

    public static final String FOREIGNKEY_PPM_ETRANGER = "error.foreignKeyPpmEtranger";

    public static final String FOREIGNKEY_PRODUIT_KEY = "error.foreignKeyproduitsKey";

    public static final String FOREIGNKEY_AGREE = "error.foreignKeyAgree";

    public static final String FOREIGNKEY_BROUILLON_SGTRANS = "error.foreignKeybrouillonsgtrans";

    public static final String FOREIGNKEY_ARTICLE_MANIFESTE = "error.foreignKeyArticlemanifeste";

    public static final String RC_IMPOSSIBLE_DELETE = "error.RcImpossibleDelete";

    public static final String ERREUR_UPDATE = "error.erreurUpdate";

    public static final String LISTE_TABLE_BASE = "listeTableBase";

    public static final String LISTE_ORIGINE_DECLARATION = "listeOrigineDeclaration";

    public static final String LISTE_CHAMPS_TABLE = "listeChampsTable";

    public static final String LISTE_CRITERE = "listeCritere";

    public static final String LISTE_OPERATEUR = "listeOperateur";

    public static final String LISTE_TYPE_CHAMPS = "listeTypeChamps";

    public static final String ERREUR_AFFICHAGE = "erreurAffichage";

    public static final String IS_CHAINE_EXISTE = "existe";

    public static final String INSUFFISANCE_DECL_ENCOURS_ACOMPL = "error.insuffisanceDeclEnCoursACompl";

    public static final String INSUFFISANCE_DECL_ENCOURS = "error.insuffisanceDeclEnCours";

    public static final String RCORDRECALCUL_OB = "error.RCORDRECALCUL_OB";

    public static final String TAXES_CUMUL_KEY = "error.taxescumulKey";

    public static final String TAXES_REF_KEY = "error.taxesrefKey";

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
    public static final String RCCODECONSIGNATAIRE_OB = "error.RCCODECONSIGNATAIRE_OB";

    public static final String RCCODEBURFRANCHISE_OB = "error.RCCODEBURFRANCHISE_OB";

    public static final String RCLIBBURFRANCHISE_OB = "error.RCLIBBURFRANCHISE_OB";

    public static final String RCCODEPPM_OB = "error.RCCODEPPM_OB";

    public static final String RCNUMCARTEAGREE_OB = "error.RCNUMCARTEAGREE_OB";

    public static final String TYPE_MANIFESTE_KEY = "error.typemanifesteKey";

    public static final String RCCOMPETENCE_OB = "error.RCCOMPETENCE_OB";

    public static final String RCGENREBUR_OB = "error.RCGENREBUR_OB";

    public static final String RCLIBELLEBURDOUANE_OB = "error.RCLIBELLEBURDOUANE_OB";

    public static final String RCTYPEBURDOUANE_OB = "error.RCTYPEBURDOUANE_OB";

    public static final String TYPE_BUREAU_KEY = "error.typebureauKey";

	public static final String BROUILLON_SEGGEN_DECKEY = "error.BrouillonseggendecKey";

    public static final String COMP_BUREAU_KEY = "error.compbureauKey";

    public static final String GENRE_BUREAU_KEY = "error.genrebureauKey";

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

    public static final String TYPE_LIEU_EMB_KEY = "error.typelieuembKey";

    public static final String CODEDESTINATAIRE_OB = "error.CODEDESTINATAIRE_OB";

    public static final String CODEEMETTEUR_OB = "error.CODEEMETTEUR_OB";

    public static final String UTILISATEUR_KEY = "error.utilisateurKey";

    public static final String RCMESSAGEERREUR_OB = "error.RCMESSAGEERREUR_OB";

    public static final String RCLIBELLEMODECOND_OB = "error.RCLIBELLEMODECOND_OB";

    public static final String RCLIBELLEMODETRANS_OB = "error.RCLIBELLEMODETRANS_OB";

    public static final String RCDESFISCALITE_OB = "error.RCDESFISCALITE_OB";

    public static final String RCDDEBUTNBRECONN_OB = "error.RCDDEBUTNBRECONN_OB";

    public static final String RCINDDEBUTNBRECONN_OB = "error.RCINDDEBUTNBRECONN_OB";

    public static final String RCINDFINTNBRECONN_OB = "error.RCINDFINTNBRECONN_OB";

    public static final String SUPP_DETAIL_INTERDITE = "error.supprDetailInterdite";

    public static final String RCSCORENBRECONN_OB = "error.RCSCORENBRECONN_OB";

    public static final String VALEURINDICE_OB = "error.VALEURINDICE_OB";

    public static final String FONCTIONNALITES_KEY = "error.fonctionnalitesKey";

    public static final String RCCIRCUITVISITE_OB = "error.RCCIRCUITVISITE_OB";

    public static final String RCCODEDEVISE_OB = "error.RCCODEDEVISE_OB";

    public static final String RCCODELANGUE_OB = "error.RCCODELANGUE_OB";

    public static final String RCLIBELLEPAYS_OB = "error.RCLIBELLEPAYS_OB";

    public static final String RCNATUREFISCALITE_OB = "error.RCNATUREFISCALITE_OB";

    public static final String RCPAYSALPHABETIQUE_OB = "error.RCPAYSALPHABETIQUE_OB";

    public static final String CIRCUIT_VISITE_KEY = "error.circuitvisiteKey";

    public static final String NATURE_FISCAL_KEY = "error.naturefiscaliteKey";

    public static final String LANGUE_KEY = "error.langueKey";

    public static final String CONSIGNATAIRES_KEY = "error.consignatairesKey";

    public static final String IMPORTED_EXPORT_KEY = "error.importexportKey";

    public static final String CHAPITRE_KEY = "error.chapitreKey";

    public static final String CLASSE_KEY = "error.classeKey";

    public static final String RCLIBELLEREGIME_OB = "error.RCLIBELLEREGIME_OB";

    public static final String RCREGIMETAXABLE_OB = "error.RCREGIMETAXABLE_OB";

    public static final String REGIME_FISCAL_KEY = "error.regimefiscalKey";

    public static final String typeregimedouaneKey = "error.typeregimedouaneKey";

    public static final String RCLIBELLEREGIMEFISCAL_OB = "error.RCLIBELLEREGIMEFISCAL_OB";

    public static final String REGIME_KEY = "error.regimeKey";

    public static final String RCLIBELLEREGROUP_OB = "error.RCLIBELLEREGROUP_OB";

    public static final String REGROUPEMENT_KEY = "error.regroupementKey";

    public static final String RCSCORE_OB = "error.RCSCORE_OB";

    public static final String INDICATEUR_KEY = "error.indicateurKey";

    public static final String RCSQLTRAITEMENT_OB = "error.RCSQLTRAITEMENT_OB";

    public static final String RCLIBELLEAPUREMENT_OB = "error.RCLIBELLEAPUREMENT_OB";

    public static final String RCLIBELLETYPEBUR_OB = "error.RCLIBELLETYPEBUR_OB";

    public static final String RCLIBELLETYPECONT_OB = "error.RCLIBELLETYPECONT_OB";

    public static final String LIBELLETYPELIEUEMB_OB = "error.LIBELLETYPELIEUEMB_OB";

    public static final String RCLIBELLETYPEMANIF_OB = "error.RCLIBELLETYPEMANIF_OB";

    public static final String RCLIBELLESOUMISS_OB = "error.RCLIBELLESOUMISS_OB";

    public static final String RCSCORETYPESOUM_OB = "error.RCSCORETYPESOUM_OB";

    public static final String LIBELLETYPEVOIE_OB = "error.LIBELLETYPEVOIE_OB";

    public static final String LOGIN_OB = "error.LOGIN_OB";

    public static final String MOTPASSE_OB = "error.MOTPASSE_OB";

    public static final String NOMUSER_OB = "error.NOMUSER_OB";

    public static final String TYPEUSER_OB = "error.TYPEUSER_OB";

    public static final String RCCODETYPECREDIT_OB = "error.RCCODETYPECREDIT_OB";

    public static final String RCLIBELLETYPECREDIT_OB = "error.RCLIBELLETYPECREDIT_OB";

    public static final String RCCODEMODEREG_OB = "error.RCCODEMODEREG_OB";

    public static final String RCLIBREGLEMENT_OB = "error.RCLIBREGLEMENT_OB";

    public static final String ETAT_MODE_REGLEMENT_KEY = "error.etatmodereglementKey";

    public static final String RCLIBELLEINDICATEUR_OB = "error.RCLIBELLEINDICATEUR_OB";

    public static final String RCTYPEINDICATEUR_OB = "error.RCTYPEINDICATEUR_OB";

    public static final String RCCODEINDICATEUR_OB = "error.RCCODEINDICATEUR_OB";

    public static final String RCCODETATMODEREGLEMENT_OB = "error.RCCODETATMODEREGLEMENT_OB";

    public static final String RCLIBETATMODEREGLEMENT_OB = "error.RCLIBETATMODEREGLEMENT_OB";

    public static final String RCCODECREDITAIRE_OB = "error.RCCODECREDITAIRE_OB";

    public static final String TYPE_CREDIT_KEY = "error.typecreditKey";

    public static final String RCCODETYPEDECISION_OB = "error.RCCODETYPEDECISION_OB";

    public static final String RCLIBELLEDECISION_OB = "error.RCLIBELLEDECISION_OB";

    public static final String CODECREDITNONSUSPENDU_OB = "error.CODECREDITNONSUSPENDU_OB";

    public static final String TYPEMERC_OB = "error.TYPEMERC_OB";

    public static final String DECANNEEDECLARATION_OB = "error.DECANNEEDECLARATION_OB";

    public static final String RCCODEDISPENSE_OB = "error.RCCODEDISPENSE_OB";

    public static final String BROUILLON_ARTDEC_KEY = "error.brouillonartdecKey";

    public static final String RCANNEETITREEXO_OB = "error.RCANNEETITREEXO_OB";

    public static final String RCBURFRANCHISE_OB = "error.RCBURFRANCHISE_OB";

    public static final String RCNBRECOLISINITIAL_OB = "error.RCNBRECOLISINITIAL_OB";

    public static final String RCNUMTITREEXO_OB = "error.RCNUMTITREEXO_OB";

    public static final String RCPDSINITIAL_OB = "error.RCPDSINITIAL_OB";

    public static final String RCQTECOMPLINITIAL_OB = "error.RCQTECOMPLINITIAL_OB";

    public static final String RCVALEURINITIAL_OB = "error.RCVALEURINITIAL_OB";

    public static final String BUREAU_FRANCHISE_KEY = "error.bureaufranchiseKey";

    public static final String LIBELLELANGUE_OB = "error.LIBELLELANGUE_OB";

    public static final String RCCODELIEUEMB_OB = "error.RCCODELIEUEMB_OB";

    public static final String CODEPPM_OB = "error.CODEPPM_OB";

    public static final String CODUSER_OB = "error.CODUSER_OB";

    public static final String CODETYPEVOIE_OB = "error.CODETYPEVOIE_OB";

    public static final String RCCODECIRCUIT_OB = "error.RCCODECIRCUIT_OB";

    public static final String RCCODECLASSE_OB = "error.RCCODECLASSE_OB";

    public static final String CODETYPELIEUEMB_OB = "error.CODETYPELIEUEMB_OB";

    public static final String RCCODELIEUDEPOT_OB = "error.RCCODELIEUDEPOT_OB";

    public static final String RCINDCOMPTANT_OB = "error.RCINDCOMPTANT_OB";

    public static final String RCLIBELLE_CRITERE_OB = "error.RCLIBELLECritere_OB";

    public static final String RCLIBELLE_OPERATEUR_OB = "error.Rclibelleoperateur_OB";

    public static final String RCSYMBOL_OPERATEUR_OB = "error.Rcsymboleoperateur_OB";

    public static final String RCVALEUR_OB = "error.RCVALEUR_OB";

    public static final String RCCODEOPERATEUR_OB = "error.RCCODEOPERATEUR_OB";

    public static final String OPERATUER_KEY = "error.operateurKey";

    //******************************************************************//
    //					constantes calcul du cr�dit //
    //******************************************************************//
    public static final String CREDIT_INSUF = "error.creditInsuf";

	public static final String SUCCESFUL_VALIDATION = "message.validVisitenononformSuccess";

    public static final String CREDIT_SUSPOND = "error.creditsuspond";

    public static final String CREDIT_NON_DISPONIBLE = "error.creditNotDisponible";

    public static final String CREDIT_NON_RENOUVLER = "error.creditNotRenouvler";

    public static final String CREDIT_DEST_NOT_AUTORISE = "error.creditDestNotAutorise";

    public static final String COD_CREDIT_ERR = "error.codcrediterr";

    public static final String CREDIT_ADMINISTRATIF = "error.creditAdministratif";

    public static final String ECRITURE_TRESOR_DOIT_FAIT_SURMOD_CREADIT = "error.ecritureTresorDoitfaitSurModCredit";

	public static final String VISIST_CONFIRME = "message.visiteDeclConfirme";

    public static final String CREDIT_ERR = "error.creditErr";

    public static final String RC_SITE_EMPTY = "rcsiteEmpty";

    public static final String CALCUL_DEVIS_IMPOSSIBLE = "error.calculDevisImpossible";

    public static final String RECALCUL_DEVIS = "error.recalculDevis";

    public static final String CALCUL_DEVIS = "error.calculDevis";

    public static final String imputManifImpossible = "error.imputManifImpossible";

    public static final String imputSomImpossible = "error.imputSomImpossible";

    public static final String imputRegistDepImposs = "error.imputRegistDepImposs";

    public static final String imputTitreExoImpossible = "error.imputTitreExoImpossible";
    
    public static final String imputSomImpossibleSurPoids = "error.imputSomImpossibleSurPoids";
    
    public static final String imputSomImpossibleSurQteCompl = "error.imputSomImpossibleSurQteCompl";
    
    public static final String imputSomImpossibleSurQteMerc = "error.imputSomImpossibleSurQteMerc";

    //Selon type apurement c'est l'articlemanifeste qui doit �tre imput� et
    // apur�
    public static final String SELONTYP_APUR_SELONTYP_APUR_ARTMANIF_IMPUT = "error.selontypapur_artManifimput";

    public static final String SELONTYP_APUR_SOMMIER_IMPUT = "error.selontypapur_sommierimput";

    public static final String SELONTYP_APUR_REGIST_DEPOT_IMPUT = "error.selontypapur_registdepotimput";

    public static final String SOMMIER_ERRONE = "error.sommierErrone";
    
    public static final String SOMMIER_NOT_OWNED = "error.sommierNotOwned";

    public static final String SOMMIER_NONVALIDE = "error.sommierNonValide";

    public static final String REGISTRE_DEPOT_ERRONE = "error.registreDepotErrone";

    public static final String REGISTRE_DEPOT_NOTFOUND = "error.registreDepotNotFound";

    public static final String titreExconerErroner = "error.titreExconerErroner";
    public static final String SOMMIER_ENTAMER = "error.sommierEntamer";
    
    public static final String REGIME_TITRE_EXO_INEXISTANT = "error.regimeTitreExoInexistant";
    /**
     * DOUANE MESSAGES DE SUCCES
     */
    public static final String MANIFESTE_MIS_EN_DEPOT = "message.manifesteMisEnDepot";

    public static final String REJET_ANNUL_DECL_EFFECTUE = "message.rejetAnnulDeclEffectue";

    /**
     * DOUANE MESSAGES D'ERREURS
     */
    public static final String DDE_MISE_ENDEPOT_NOTFOUND = "error.ddeMiseEnDepotNotFound";

    public static final String DDE_RECOND_ARTMAN_NOTFOUND ="error.ddeRecondArtManNotFound";

    public static final String ARTICLE_RECONDITIONNEMENT_NOTFOUND = "error.articleReconditionnementNotFound";

    public static final String SOMMIER_TOTALEMENT_APURE = "error.sommierTotalementApure";

    public static final String ENLEVEMENT_DEJA_EFFECTUE = "error.enlevementDejaEffectue";

    public static final String DECCODEREGDOU_OB = "error.DECCODEREGDOU_OB";

    public static final String DECCODEVERIFICATEUR_OB = "error.DECCODEVERIFICATEUR_OB";

    public static final String DECDATEBAE_OB = "error.DECDATEBAE_OB";

    public static final String DECNOMDESTINATAIRE_OB = "error.DECNOMDESTINATAIRE_OB";

    public static final String DECNUMARTDECL_OB = "error.DECNUMARTDECL_OB";

    public static final String DECCODEDISPENSE_OB = "error.DECCODEDISPENSE_OB";

    public static final String DISPENSES_KEY = "error.dispensesKey";

    public static final String DECCODEPIECEJT_OB = "error.DECCODEPIECEJT_OB";

    public static final String DECCODESOUMDOC_OB = "error.DECCODESOUMDOC_OB";

    public static final String SOUMISSION_DOC_KEY = "error.soumissiondocKey";

    public static final String DECANNEELIQUID_OB = "error.DECANNEELIQUID_OB";

    public static final String DECBASETAXELIQ_OB = "error.DECBASETAXELIQ_OB";

    public static final String DECBASETAXENORM_OB = "error.DECBASETAXENORM_OB";

    public static final String DECBUREAUENREGDEC_OB = "error.DECBUREAUENREGDEC_OB";

    public static final String DECCODEPPMDECLARANT_OB = "error.DECCODEPPMDECLARANT_OB";

    public static final String DECCODETAXE_OB = "error.DECCODETAXE_OB";

    public static final String DECDATEHISTOLIQ_OB = "error.DECDATEHISTOLIQ_OB";

    public static final String DECDATELIQUID_OB = "error.DECDATELIQUID_OB";

    public static final String DECMTTAXELIQ_OB = "error.DECMTTAXELIQ_OB";

    public static final String DECMTTAXENORM_OB = "error.DECMTTAXENORM_OB";

    public static final String DECMTTAXESUSPENDU_OB = "error.DECMTTAXESUSPENDU_OB";

    public static final String DECNUMDEC_OB = "error.DECNUMDEC_OB";

    public static final String DECNUMHISTOLIQ_OB = "error.DECNUMHISTOLIQ_OB";

    public static final String DECQUOTITELIQ_OB = "error.DECQUOTITELIQ_OB";

    public static final String DECQUOTITENORM_OB = "error.DECQUOTITENORM_OB";

    public static final String DECTYPETRAITEMENT_OB = "error.DECTYPETRAITEMENT_OB";

    public static final String DECCODEPROD_OB = "error.DECCODEPROD_OB";

    public static final String DECMODECOND_OB = "error.DECMODECOND_OB";

    public static final String DECNBRECOLISDECL_OB = "error.DECNBRECOLISDECL_OB";

    public static final String DECNUMDECLAPURANT_OB = "error.DECNUMDECLAPURANT_OB";

    public static final String DECPAYSORIGINE_OB = "error.DECPAYSORIGINE_OB";

    public static final String DECPDNETDEC_OB = "error.DECPDNETDEC_OB";

    public static final String DECPOIDSBRUTDEC_OB = "error.DECPOIDSBRUTDEC_OB";

    public static final String DECPRECSEN_OB = "error.DECPRECSEN_OB";

    public static final String DECPRECUEMOA_OB = "error.DECPRECUEMOA_OB";

    public static final String DECREGFISCAL_OB = "error.DECREGFISCAL_OB";

    public static final String HSEGGEN_DEC_KEY = "error.hseggendecKey";

    public static final String DECNUMARTCONTENEUR_OB = "error.DECNUMARTCONTENEUR_OB";

    public static final String DECBURDOUANE_OB = "error.DECBURDOUANE_OB";

    public static final String DECBURFRONTIERE_OB = "error.DECBURFRONTIERE_OB";

    public static final String DECCODEAGREE_OB = "error.DECCODEAGREE_OB";

    public static final String DECDATEENREGDEC_OB = "error.DECDATEENREGDEC_OB";

    public static final String DECNBREARTICLES_OB = "error.DECNBREARTICLES_OB";

    public static final String DECREGDOUANIER_OB = "error.DECREGDOUANIER_OB";

    public static final String BUREAU_DOUANE_KEY = "error.bureaudouaneKey";

    public static final String CREDITAIRE_KEY = "error.creditairesKey";

    public static final String MODE_DECLARATION_KEY = "error.modedeclarationKey";

    public static final String MODE_TRANSPORT_KEY = "error.modetransportKey";

    public static final String REGIME_DOUANIER_KEY = "error.regimedouanierKey";

    public static final String TYPE_APUREMENT_KEY = "error.typeapurementKey";

    public static final String DECANNEEENREGDEC_OB = "error.DECANNEEENREGDEC_OB";

    public static final String DECBURENREGDEC_OB = "error.DECBURENREGDEC_OB";

    public static final String DECDATEARCHIVE_OB = "error.DECDATEARCHIVE_OB";

    public static final String DECNUMARTDEC_OB = "error.DECNUMARTDEC_OB";

    public static final String DECPPMDECLARANT_OB = "error.DECPPMDECLARANT_OB";

    public static final String HSEGART_DEC_KEY = "error.hsegartdecKey";

    public static final String PPM_KEY = "error.ppmKey";

    public static final String NUM_CONTENEUR_OB = "error.NumConteneurOB";

    public static final String ANNEEDECLARATION_OB = "error.ANNEEDECLARATION_OB";

    public static final String NUM_PLOMB_OB = "error.NumPlombOB";

    public static final String BUREAUDEC_OB = "error.BUREAUDEC_OB";

    public static final String TAILLE_OB = "error.TailleOB";

    public static final String DECBUREAUDEPART_OB = "error.DECBUREAUDEPART_OB";

    public static final String TYPECONT_OB = "error.TypeContOB";

    public static final String DECCODEPPMDECL_OB = "error.DECCODEPPMDECL_OB";

    public static final String DECNUMREPERTOIRE_OB = "error.DECNUMREPERTOIRE_OB";

    public static final String DECREGIMEDOUANIER_OB = "error.DECREGIMEDOUANIER_OB";

    public static final String DECTYPEREGIME_OB = "error.DECTYPEREGIME_OB";

    public static final String NUMERODECLARATION_OB = "error.NUMERODECLARATION_OB";

    public static final String VISANNEEENREG_OB = "error.VISANNEEENREG_OB";

    public static final String VISBURENREG_OB = "error.VISBURENREG_OB";

    public static final String VISCODEPROD_OB = "error.VISCODEPROD_OB";

    public static final String VISMODECOND_OB = "error.VISMODECOND_OB";

    public static final String VISNBRECOLISDECL_OB = "error.VISNBRECOLISDECL_OB";

    public static final String VISNUMART_OB = "error.VISNUMART_OB";

    public static final String VISNUMDECLAPURANT_OB = "error.VISNUMDECLAPURANT_OB";

    public static final String VISPAYSORIGINE_OB = "error.VISPAYSORIGINE_OB";

    public static final String VISPDNET_OB = "error.VISPDNET_OB";

    public static final String VISPOIDSBRUT_OB = "error.VISPOIDSBRUT_OB";

    public static final String VISPRECSEN_OB = "error.VISPRECSEN_OB";

    public static final String VISPRECUEMOA_OB = "error.VISPRECUEMOA_OB";

    public static final String VISREGFISCAL_OB = "error.VISREGFISCAL_OB";

    public static final String DEVISES_KEY = "error.devisesKey";

    public static final String PRODUITS_KEY = "error.produitsKey";

    public static final String PAYS_KEY = "error.paysKey";

    public static final String DECANNEEDECL_OB = "error.DECANNEEDECL_OB";

    public static final String DECBURDECLARATION_OB = "error.DECBURDECLARATION_OB";

    public static final String DECBURPASSAGE_OB = "error.DECBURPASSAGE_OB";

    public static final String DECNUMDECLARATION_OB = "error.DECNUMDECLARATION_OB";

    public static final String DECNUMPERTOIRE_OB = "error.DECNUMPERTOIRE_OB";

    public static final String DECPPDECLARANT_OB = "error.DECPPDECLARANT_OB";

    public static final String ACQUIT_VISITE_KEY = "error.acquitvisiteKey";

    public static final String VISANNEEDECL_OB = "error.VISANNEEDECL_OB";

    public static final String VISBUREAUDECL_OB = "error.VISBUREAUDECL_OB";

    public static final String VISCODEEMETTEUR_OB = "error.VISCODEEMETTEUR_OB";

    public static final String VISCORPSCONVOCATION_OB = "error.VISCORPSCONVOCATION_OB";

    public static final String VISDATECONVOCATION_OB = "error.VISDATECONVOCATION_OB";

    public static final String VISDATEEMISSION_OB = "error.VISDATEEMISSION_OB";

    public static final String VISNUMCONVOCATION_OB = "error.VISNUMCONVOCATION_OB";

    public static final String VISNUMERODECL_OB = "error.VISNUMERODECL_OB";

    public static final String VISTITRECONVOCATION_OB = "error.VISTITRECONVOCATION_OB";

    public static final String VISTYPECONVOCATION_OB = "error.VISTYPECONVOCATION_OB";

    public static final String SEGGENDEC_KEY = "error.seggendecKey";

    public static final String typeconvocationKey = "error.typeconvocationKey";

    public static final String VISCODEDISPENSE_OB = "error.VISCODEDISPENSE_OB";

    public static final String VISANNEELIQUID_OB = "error.VISANNEELIQUID_OB";

    public static final String VISBASETAXELIQ_OB = "error.VISBASETAXELIQ_OB";

    public static final String VISBASETAXENORM_OB = "error.VISBASETAXENORM_OB";

    public static final String VISBUREAUENREGDEC_OB = "error.VISBUREAUENREGDEC_OB";

    public static final String VISCODEPPMDECLARANT_OB = "error.VISCODEPPMDECLARANT_OB";

    public static final String VISCODETAXE_OB = "error.VISCODETAXE_OB";

    public static final String VISDATELIQUID_OB = "error.VISDATELIQUID_OB";

    public static final String VISMTTAXELIQ_OB = "error.VISMTTAXELIQ_OB";

    public static final String VISMTTAXENORM_OB = "error.VISMTTAXENORM_OB";

    public static final String VISMTTAXESUSPENDU_OB = "error.VISMTTAXESUSPENDU_OB";

    public static final String VISNUMDEC_OB = "error.VISNUMDEC_OB";

    public static final String VISQUOTITELIQ_OB = "error.VISQUOTITELIQ_OB";

    public static final String VISQUOTITENORM_OB = "error.VISQUOTITENORM_OB";

    public static final String VISTYPETRAITEMENT_OB = "error.VISTYPETRAITEMENT_OB";

    public static final String VISANNNEDECL_OB = "error.VISANNNEDECL_OB";

    public static final String VISCODEBURDECL_OB = "error.VISCODEBURDECL_OB";

    public static final String VISCODTTX_OB = "error.VISCODTTX_OB";

    public static final String VISMNTTXL_OB = "error.VISMNTTXL_OB";

    public static final String VISNUMARTDCL_OB = "error.VISNUMARTDCL_OB";

    public static final String VISNUMDECL_OB = "error.VISNUMDECL_OB";

    public static final String AGREE_KEY = "error.agreeKey";

    public static final String TAXES_KEY = "error.taxesKey";

    public static final String TYPE_LIQUIDATION_SUPPKEY = "error.typeliquidationsuppKey";

    public static final String VISANNEEENREGDEC_OB = "error.VISANNEEENREGDEC_OB";

    public static final String VISBURENREGDEC_OB = "error.VISBURENREGDEC_OB";

    public static final String VISCODEPIECEJT_OB = "error.VISCODEPIECEJT_OB";

    public static final String VISNUMARTDEC_OB = "error.VISNUMARTDEC_OB";

    public static final String VISNUMDECLARATION_OB = "error.VISNUMDECLARATION_OB";

    public static final String SEGART_DECKEY = "error.segartdecKey";

    public static final String PIECES_JOINTE_KEY = "error.piecesjointesKey";

    public static final String ANNEEPV_OB = "error.ANNEEPV_OB";

    public static final String BUREAUPV_OB = "error.BUREAUPV_OB";

    public static final String DATEPV_OB = "error.DATEPV_OB";

    public static final String NATUREMARCHANDISES_OB = "error.NATUREMARCHANDISES_OB";

    public static final String NATUREPV_OB = "error.NATUREPV_OB";

    public static final String NOMBRECONSTATE_OB = "error.NOMBRECONSTATE_OB";

    public static final String NUMEROPV_OB = "error.NUMEROPV_OB";

    public static final String POIDSCONSTATE_OB = "error.POIDSCONSTATE_OB";

    public static final String VALEURCONSTATEE_OB = "error.VALEURCONSTATEE_OB";

    public static final String NATURE_PVKEY = "error.naturepvKey";

    public static final String VISANNEEDECLARATION_OB = "error.VISANNEEDECLARATION_OB";

    public static final String VISBUREAUDECLARATION_OB = "error.VISBUREAUDECLARATION_OB";

    public static final String VISCODESOUMDOC_OB = "error.VISCODESOUMDOC_OB";

    public static final String VISCODEVERIFICATEUR_OB = "error.VISCODEVERIFICATEUR_OB";

    public static final String VISDATEBAE_OB = "error.VISDATEBAE_OB";

    public static final String VISDATEECHEANCESOUM_OB = "error.VISDATEECHEANCESOUM_OB";

    public static final String VISNOMDESTINATAIRE_OB = "error.VISNOMDESTINATAIRE_OB";

    public static final String VISNUMARTDECL_OB = "error.VISNUMARTDECL_OB";

    public static final String VISREGIMEDOUANIER_OB = "error.VISREGIMEDOUANIER_OB";

    public static final String VISTYPEREGIME_OB = "error.VISTYPEREGIME_OB";

    public static final String VISIT_STARTED_CONTACT_INSPECTOR = "error.visitNotStartedContactInspector";

    public static final String DECBURENREGDECL_OB = "error.DECBURENREGDECL_OB";

    public static final String SEG_CONTDEC_KEY = "error.segcontdecKey";

    public static final String TYPE_CONTENEUR_KEY = "error.typeconteneurKey";

    /**
     * 
     *  
     */
    public static final String DECLARATION_DEJA_VALIDEE = "error.DeclarationDejaValidee";

    public static final String VALIDATION_IMPOSSIBLE_MODEPAIEMENT_INCORRECT = "error.ValidationImpossibleModePaiementIncorrect";

    public static final String VALIDATION_IMPOSSIBLE_MODEDECLARATION_INCORRECT = "error.ValidationImpossibleModeDeclarationIncorrect";

    public static final String ETATINCOMPATIBLEAVECDELIVRANCEBAE = "error.EtatIncompatibleAvecDelivranceBAE";

    public static final String RCCODECIMEX_OB = "error.RCCODECIMEX_OB";

    public static final String RCCODEPROD_OB = "error.RCCODEPROD_OB";

    public static final String RCCODETAUX_OB = "error.RCCODETAUX_OB";

    public static final String RCDATEVALEUR_OB = "error.RCDATEVALEUR_OB";

    public static final String RCPRECSENEGAL_OB = "error.RCPRECSENEGAL_OB";

    public static final String RCPRECUEMOA_OB = "error.RCPRECUEMOA_OB";

    /** MODULE DOUANE */
    public static final String SUCCEFULL_ENVOI_CONVOCATION = "message.succefullEnvoiConvocation";

    public static final String CODEMAJ_OB = "error.CODEMAJ_OB";

    public static final String CODEUTILISATEUR_OB = "error.CODEUTILISATEUR_OB";

    public static final String DATEMAJ_OB = "error.DATEMAJ_OB";

    public static final String HEUREMAJ_OB = "error.HEUREMAJ_OB";

    public static final String NUMERODFICHE_OB = "error.NUMERODFICHE_OB";

    public static final String CODEDOCUMENT_OB = "error.CODEDOCUMENT_OB";

    public static final String CODEPRODUIT_OB = "error.CODEPRODUIT_OB";

    public static final String NUMEROGAMME_OB = "error.NUMEROGAMME_OB";

    public static final String PAYSORIGINE_OB = "error.PAYSORIGINE_OB";

    public static final String COMPTEUR_OB = "error.COMPTEUR_OB";

    public static final String NUMEROFICHE_OB = "error.NUMEROFICHE_OB";

    public static final String ORIGINE_OB = "error.ORIGINE_OB";

    public static final String POSITIONTARIFAIRE_OB = "error.POSITIONTARIFAIRE_OB";

    public static final String UNITEMONETAIRECOUT_OB = "error.UNITEMONETAIRECOUT_OB";

    public static final String DOCUMENT_KEY = "error.documentKey";

    public static final String MAINLEVEE_DEPOT_SUCCESS = "error.mainLeveeDepotSuccess";
    public static final String REEDITION_SUCCESS = "error.reeditionBaeSuccess";
    public static final String REEDITION_FAILED = "error.reeditionBaeFailed";
    public static final String REEDITION_REFUSER = "error.reeditionBaeRefuser";

    public static final String MISE_DEPOT_SUCCESS = "error.miseDepotSuccess";
    public static final String REFUS_MISE_DEPOT_SUCCESS = "error.refusMiseDepotSuccess";

    /// PARTIE DOUANE ENLEVEMENTS
    public static final String BURDECLARATION_OB = "error.BURDECLARATION_OB";

    public static final String DATEENLEVEMENT_OB = "error.DATEENLEVEMENT_OB";

    public static final String NBRECOLISENLEVE_OB = "error.NBRECOLISENLEVE_OB";

    public static final String NUMARTDECL_OB = "error.NUMARTDECL_OB";

    public static final String NUMDECLARATION_OB = "error.NUMDECLARATION_OB";

    public static final String POIDSENLEVE_OB = "error.POIDSENLEVE_OB";

    public static final String ERROR_COLIS_ENLEVE = "error.errorColisEnleve";

    public static final String ERROR_POIDS_ENLEVE = "error.errorPoidsEnleve";

    //DLPP
    public static final String DLPPANNEEDLPP_OB = "error.DLPPANNEEDLPP_OB";

    public static final String DLPPCODEPPMDECLARANT_OB = "error.DLPPCODEPPMDECLARANT_OB";

    public static final String DLPPNUMARTICLE_OB = "error.DLPPNUMARTICLE_OB";

    public static final String DLPPNUMREPERTOIRE_OB = "error.DLPPNUMREPERTOIRE_OB";

    public static final String BROUILLON_SEGGEND_DLPPKEY = "error.brouillonseggendlppKey";

    public static final String RCCODEMODEDECDLPP_OB = "error.RCCODEMODEDECDLPP_OB";

    public static final String RCLIBELLEMODEDECDLPP_OB = "error.RCCODEMODEDECDLPP_OB";

    public static final String DLPPCODEBUREAU_OB = "error.DLPPCODEBUREAU_OB";

    public static final String DLPPNUMDLPP_OB = "error.DLPPNUMDLPP_OB";

    public static final String DLPPCODEBAC_OB = "error.DLPPCODEBAC_OB";

    public static final String BROUILLON_ARTICLE_DLPPKEY = "error.brouillonarticledlppKey";

    public static final String ARTICLE_DLPPKEY  = "error.articledlppKey";

    public static final String SEGGEN_DLPPKEY = "error.seggendlppKey";

    public static final String SUCCESFUL_VALIDATE_DLPP = "message.successfulValidateDlpp";

    public static final String SUCCESFUL_CANCEL_DLPP = "message.successfulAnnulerDlpp";

    public static final String SUCCESFUL_DELETEARTICLE_DLPP = "message.succefulDeleteArticleDlpp";

    public static final String SUCCESFUL_VALECOR = "message.successfulValEcor";

    //DEPOTPETROLIER
    public static final String RCCODEDEPOT_OB = "error.RCCODEDEPOT_OB";

    //ECOR
    public static final String ECORANNEE_OB = "error.ECORANNEE_OB";

    public static final String ECORCODEBUREAU_OB = "error.ECORCODEBUREAU_OB";

    public static final String ECORNUMERO_OB = "error.ECORNUMERO_OB";

    public static final String ECORNUMART_OB = "error.ECORNUMART_OB";

    public static final String ECORCODEPRODUIT_OB = "error.ECORCODEPRODUIT_OB";

    public static final String ECORPRECSENEGAL_OB = "error.ECORPRECSENEGAL_OB";

    public static final String ECORPRECUEMOA_OB = "error.ECORPRECUEMOA_OB";

    public static final String ECORVALEURPROD_OB = "error.ECORVALEURPROD_OB";

    public static final String ARTICLE_ECOR_KEY = "error.articleecorKey";

    public static final String ECOR_KEY = "error.ecorKey";

    public static final String SUCCESFUL_DELETE_ECOR = "message.successfulDeleteEcor";

    public static final String SUCCESFUL_DELETE_ARTICLE_ECOR = "message.successfulDeleteArticleEcor";

    public static final String SUCCESFUL_INSERT_PROD = "message.succefulInsertProd";

    public static final String SUCCESFUL_EVALUATION_ECOR = "message.successfulEvaluationEcor";

    /** *TYPEIDENTIFICATION* */
    public static final String RCCODETYPIECE_OB = "error.RCCODETYPIECE_OB";

    public static final String RCLIBELLETYPEPIECE_OB = "error.RCLIBELLETYPEPIECE_OB";

    /** **BAREME******** */
    public static final String RCCODEBUREAU_OB = "error.RCCODEBUREAU_OB";

    public static final String RCPRECSEN_OB = "error.RCPRECSEN_OB";

    public static final String RCVALEURUNITAIRE_OB = "error.RCVALEURUNITAIRE_OB";

    /** fiche de dedouanement**** */
    public static final String FICHE_DOUANEMENT_KEY = "error.fichededouanementKey";

    public static final String HIST_TO_BULLETIN_ECORKEY = "error.histobulletinecorKey";

    public static final String ECORDATEDERNIERMAJ_OB = "error.ECORDATEDERNIERMAJ_OB";

    public static final String PRODUIT_NON_ACTIF = "error.produitNonActif";

    public static final String BAC_DEPOT_EXISTANT = "error.bacDepotExistant";

    public static final String BAC_DEPOT_SUPPRIME = "error.bacdepotsupprime";

    public static final String REGE_COOBLIG_DLPP = "error.regecoobligdlpp";

    public static final String REGE_COINCOMP_DLPP ="error.regecoincompdlpp";
    
    public static final String BUREAU_NOT13L = "error.bureauNot13L";
    
    public static final String SUCCESFULL_CHANGE_PWD = "message.succefulChangePwd";
    
    public static final String SOMMIER_DEJA_SOLDE = "error.sommierDejaSolde";
    
    public static final String SOMMIER_DEPOT = "error.sommierDepot";
    
	public static final String DECBURDECL_OB="error.DECBURDECL_OB";
	public static final String DECDATECREATIONBAE_OB="error.DECDATECREATIONBAE_OB";
	public static final String DECNUMDECL_OB="error.DECNUMDECL_OB";
	
	public static final String DATEAJOUT_OB="error.DATEAJOUT_OB";
	public static final String NUMEROQUITTANCE_OB="error.NUMEROQUITTANCE_OB";

	public static final String TRANCHEDEBUT_OB="error.TRANCHEDEBUT_OB";
	public static final String TRANCHEFIN_OB="error.TRANCHEFIN_OB";
	public static final String TYPEQUITTANCE_OB="error.TYPEQUITTANCE_OB";
	
	public static final String DECCODEAGT_OB="error.DECCODEAGT_OB";
	public static final String DECDATEDECL_OB="error.DECDATEDECL_OB";
	

	public static final String ERROR_IP = "error.adresseIp";
	public static final String LIBERATION_SIGNATURE_USER1 = "message.liberationSignatureUser";
	public static final String LIBERATION_SIGNATURE_USER2 = "error.liberationSignatureUser";
	public static final String REININT_PWD_USER1 = "error.reinintPwdUser1";
	public static final String REININT_PWD_USER2 = "message.reinintPwdUser2";
	public static final String REININT_PWD_USER3 = "message.reinintPwdUser3";
	public static final String USER_NON_CONNECTE = "message.userNonConnecte";
	
    	//Blocage/Deblocage Declarations
	public static final String BLOCAGE_SUCCESS = "error.blocageSuccess";
	public static final String DEBLOCAGE_SUCCESS  = "error.deblocageSuccess";
	
	public static final String INVALID_CONTENEUR = "error.invalidConteneur";
	public static final String accessDeniedDeclarantRegime = "error.accessDenied";
	public static final String propositionmiseDepotSuccess  = "error.propositionmiseDepotSuccess";
	
	
    public ConstErrCod() {
        super();
    }

}