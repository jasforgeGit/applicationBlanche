package sn.com.douane.ejb.rc.exception;

public class ConstErrCodRC {

	/**
	 * Codes erreurs relatifs aux clés primaires
	 */
	public static final String PROFILKEY = "error.profilKey";	 
	public static final String TYPEUTILISATEURKEY = "error.typeutilsateurKey";
	public static final String GROUPEFONCTIONKEY = "error.groupefonctionKey";
	public static final String FONCTIONNALITESKEY = "error.fonctionnalitesKey";
	public static final String UTILISATEURKEY = "error.utilisateurKey";
	public static final String TYPECREDITKEY = "error.typecreditKey";
	public static final String CREDITAIRESKEY = "error.creditairesKey";
	public static final String INDICATEURKEY ="error.indicateurKey"; 

	/**
	 * Code erreurs relatifs à l'insertion des entites 
	 */
	public static final String DUPKEYINSERT = "error.dupkeyinsert";
	public static final String INSERTEXP = "error.insertExp";
	
	/**
	 * Codes erreurs relatifs à la recherche des entités
	 */
	public static final String DETAILNOTFOUND = "error.DetailNotFound";
	public static final String ROWNOTFOUND = "error.rowNotFound";
	
	/**
	 * Codes erreurs relatifs à la suppression des entités
	 */
	public static final String EJBEXP = "error.ejbExp";
    public static final String REMOVEEXP = "error.removeExp";

	/**
	 * Codes erreurs relatifs a l'entité Utilisateur 
	 */
	public static final String CODUSER_OB = "error.CODUSER_OB";	
	public static final String LOGIN_OB = "error.LOGIN_OB";
	public static final String MOTPASSE_OB = "error.MOTPASSE_OB";
	public static final String NOMUSER_OB = "error.NOMUSER_OB";
	public static final String TYPEUSER_OB = "error.TYPEUSER_OB";
	public static final  String PROFIL_OB = "error.PROFIL_OB";

	/**
	 * Codes erreurs relatifs a l'entité Profil
	 */
	public static final String RCCODEPROFIL_OB = "error.RCCODEPROFIL_OB";
	public static final String RCLIBELLEPROFIL_OB = "error.RCLIBELLEPROFIL_OB";
	
	/**
	 * Codes erreurs relatifs a  l'entité GroupeFonction
	 */
	 public static final String RCCODEGROUPE_OB = "error.RCCODEGROUPE_OB";
	 public static final String RCLIBGROUPE_OB = "error.RCLIBGROUPE_OB";
	 public static final String RCORDREAFFICHAGE_OB = "error.RCORDREAFFICHAGE_OB";
	 
	 /**
	  * Codes erreurs relatifs a  l'entité TypeUtilisateur
	  */
	 public static final String RCLIBELLEUSER_OB = "error.RCLIBELLEUSER_OB";
	 public static final String RCTYPEUSER_OB = "error.RCTYPEUSER_OB";
	 
	 /**
	  * Codes erreurs relatifs a  l'entité RegropupFonctions
	  */
	 public static final String RCCODEFONCTION_OB = "error.RCCODEFONCTION_OB";
	 /**
	  * Codes erreurs relatifs a l'entité Fonctionnalites
	  */
	 public static final String RCLIBFONCTION_OB = "error.RCLIBFONCTION_OB";
	 
	 /**
	  * Codes erreurs relatifs a l'entité Numerotation
	  */
	 public static final String RCOPERATION_OB = "error.RCOPERATION_OB";
	 public static final String VALEURINDICE_OB = "error.VALEURINDICE_OB";
	 /**
	  * Codes erreurs relatifs a l'entite Delegation
	  */
	 public static final String AGENTDESTINATAIRE_OB = "error.AGENTDESTINATAIRE_OB";
	 public static final String AGENTEMETTEUR_OB = "error.AGENTEMETTEUR_OB";
	 public static final String CODEFONCTION_OB = "error.CODEFONCTION_OB";
	 public static final String DATEDEBUT_OB = "error.DATEDEBUT_OB";
	 /**
	  * Codes erreurs relatifs à l'entite PPM
	  */
	 public static final String RCCODEPPM_OB = "error.RCCODEPPM_OB";
	 public static final String PPMKEY = "error.ppmKey";
	 /**
	  * Codes erreurs relatifs à l'entite  Creditaire
	  */
	 public static final String RCCODECREDITAIRE_OB = "error.RCCODECREDITAIRE_OB";
	 /**
	  * Codes erreurs relatifs à l'entite TypeCredit
	  */
	 public static final String RCCODETYPECREDIT_OB = "error.RCCODETYPECREDIT_OB";
	 public static final String RCLIBELLETYPECREDIT_OB = "error.RCLIBELLETYPECREDIT_OB"; 
	 
	 /**
	  * Codes erreurs relatifs à l'entite SoumissionCreditaire
	  */
	 public static final String RCCODEINDICATEUR_OB = "error.RCCODEINDICATEUR_OB";
	 /**
	  * Codes erreurs relatifs Ã  l'entite CompBureau
	  */
	 public static final String RCCODECOMPETENCE_OB = "error.RCCODECOMPETENCE_OB";
	 public static final String RCDESCOMPETENCES_OB = "error.RCDESCOMPETENCES_OB";
	 
	 /**
	  * code erreurs relatifs à circuitVisite
	  * 
	  */
	 
	 public static final String RCCODECIRCUIT_OB = "error.RCCODECIRCUIT_OB";
	 public static final String RCDESCIRCUITVISITE_OB = "error.RCDESCIRCUITVISITE_OB";
	 
	 public static final String devisesKey = "error.devisesKey";
	 
	 
	 public static final String CODEUSERRECEPTEUR_NOTFOUND ="error.codeUserRecepteurNotFound"; 
	 public static final String NOMATCHPROFILFORTHISFONCTION ="error.noMatchProfilForThisFonction"; 
	 
	 
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

	    public final static String CODEPPM_OB = "error.CODEPPM_OB";

	    public final static String RCCODEAGENT_OB = "error.RCCODEAGENT_OB";

	    public final static String RCINDAUT_OB = "error.RCINDAUT_OB";

	    public final static String RCINDRECEVAB_OB = "error.RCINDRECEVAB_OB";

	    public final static String RCCODEEXCEPTION_OB = "error.RCCODEEXCEPTION_OB";

	    public final static String RCCODECATREGROUP_OB = "error.RCCODECATREGROUP_OB";

	    public final static String RCTERMINALMAJ_OB = "error.RCTERMINALMAJ_OB";

	    public final static String RCDATEMAJ_OB = "error.RCDATEMAJ_OB";

	    public final static String RCCODEUSERMAJ_OB = "error.RCCODEUSERMAJ_OB";

	    public final static String RCCODEMODEDEC_OB = "error.RCCODEMODEDEC_OB";

	    public final static String RCINDICATEURVALEUR_OB = "error.RCINDICATEURVALEUR_OB";

	    public final static String RCNUMREGIMEPREF_OB = "error.RCNUMREGIMEPREF_OB";

	    public final static String RCNUMCARTEAGREE_OB = "error.RCNUMCARTEAGREE_OB";

	    public final static String typemanifesteKey = "error.typemanifesteKey";

	    public final static String RCCOMPETENCE_OB = "error.RCCOMPETENCE_OB";

	    public final static String RCGENREBUR_OB = "error.RCGENREBUR_OB";

	    public final static String RCLIBELLEBURDOUANE_OB = "error.RCLIBELLEBURDOUANE_OB";

	    public final static String RCTYPEBURDOUANE_OB = "error.RCTYPEBURDOUANE_OB";

	    public final static String typebureauKey = "error.typebureauKey";

	    public final static String compbureauKey = "error.compbureauKey";

	    public final static String genrebureauKey = "error.genrebureauKey";

	    public final static String RCLIBELLEBURUEMOA_OB = "error.RCLIBELLEBURUEMOA_OB";

	    public final static String RCLIBELLECHAPITRE_OB = "error.RCLIBELLECHAPITRE_OB";	   

	    public final static String RCLIBELLECLASSE_OB = "error.RCLIBELLECLASSE_OB";

	    public final static String NOMCIEASSISTEE_OB = "error.NOMCIEASSISTEE_OB";
	   
	    public final static String RCCOURSDEVISE_OB = "error.RCCOURSDEVISE_OB";

	    public final static String RCLIBELLEDEVISE_OB = "error.RCLIBELLEDEVISE_OB";
	 
	    public final static String RCDESGENREBUREAU_OB = "error.RCDESGENREBUREAU_OB";

	    public final static String RCCODEPAYS_OB = "error.RCCODEPAYS_OB";

	    public final static String RCTYPELIEUEMB_OB = "error.RCTYPELIEUEMB_OB";

	    public final static String paysKey = "error.paysKey";

	    public final static String typelieuembKey = "error.typelieuembKey";

	    public final static String CODEDESTINATAIRE_OB = "error.CODEDESTINATAIRE_OB";

	    public final static String CODEEMETTEUR_OB = "error.CODEEMETTEUR_OB";

	    public final static String utilisateurKey = "error.utilisateurKey";

	    public final static String RCMESSAGEERREUR_OB = "error.RCMESSAGEERREUR_OB";

	    public final static String RCLIBELLEMODECOND_OB = "error.RCLIBELLEMODECOND_OB";

	    public final static String modedeclarationKey = "error.modedeclarationKey";

	    public final static String RCLIBELLEMODETRANS_OB = "error.RCLIBELLEMODETRANS_OB";

	    public final static String RCDESFISCALITE_OB = "error.RCDESFISCALITE_OB";

	    public final static String RCDDEBUTNBRECONN_OB = "error.RCDDEBUTNBRECONN_OB";

	    public final static String RCINDDEBUTNBRECONN_OB = "error.RCINDDEBUTNBRECONN_OB";

	    public final static String RCINDFINTNBRECONN_OB = "error.RCINDFINTNBRECONN_OB";

	    public static final String supprDetailInterdite = "error.supprDetailInterdite";

	    public final static String RCSCORENBRECONN_OB = "error.RCSCORENBRECONN_OB";
	 
	    public final static String fonctionnalitesKey = "error.fonctionnalitesKey";

	    public static final String rcUnrecordablePpm = "error.rcUnrecordablePpm";

	    public final static String RCCIRCUITVISITE_OB = "error.RCCIRCUITVISITE_OB";

	    public final static String RCCODEDEVISE_OB = "error.RCCODEDEVISE_OB";

	    public final static String RCCODELANGUE_OB = "error.RCCODELANGUE_OB";

	    public final static String RCLIBELLEPAYS_OB = "error.RCLIBELLEPAYS_OB";

	    public final static String RCNATUREFISCALITE_OB = "error.RCNATUREFISCALITE_OB";

	    public final static String RCPAYSALPHABETIQUE_OB = "error.RCPAYSALPHABETIQUE_OB";

	    public final static String circuitvisiteKey = "error.circuitvisiteKey";

	    public final static String naturefiscaliteKey = "error.naturefiscaliteKey";	  

	    public final static String langueKey = "error.langueKey";

	    public final static String agreeKey = "error.agreeKey";

	    public final static String consignatairesKey = "error.consignatairesKey";

	    public final static String creditairesKey = "error.creditairesKey";

	    public final static String importexportKey = "error.importexportKey";

	    public final static String chapitreKey = "error.chapitreKey";

	    public final static String classeKey = "error.classeKey";

	    public final static String RCLIBELLEREGIME_OB = "error.RCLIBELLEREGIME_OB";

	    public final static String RCREGIMETAXABLE_OB = "error.RCREGIMETAXABLE_OB";

	    public final static String regimefiscalKey = "error.regimefiscalKey";

	    public final static String typeregimedouaneKey = "error.typeregimedouaneKey";

	    public final static String RCLIBELLEREGIMEFISCAL_OB = "error.RCLIBELLEREGIMEFISCAL_OB";

	    public final static String RCLIBELLEREGROUP_OB = "error.RCLIBELLEREGROUP_OB";

	    public final static String RCSCORE_OB = "error.RCSCORE_OB";

	    public final static String RCSQLTRAITEMENT_OB = "error.RCSQLTRAITEMENT_OB";

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

	    public final static String RCCODEAGREE_OB = "error.RCCODEAGREE_OB";

	    public final static String RCCODEIMPEXP_OB = "error.RCCODEIMPEXP_OB";

	    public final static String RCCODEREGROUPEMENT_OB = "error.RCCODEREGROUPEMENT_OB";

	    public final static String RCNUMENTREPRISE_OB = "error.RCNUMENTREPRISE_OB";

	    public final static String RCCODETAXEBASE_OB = "error.RCCODETAXEBASE_OB";

	    public final static String DECANNEEDECLARATION_OB = "error.DECANNEEDECLARATION_OB";

	    public final static String DECCODEPPMDECLARANT_OB = "error.DECCODEPPMDECLARANT_OB";

	    public final static String DECNUMARTDECL_OB = "error.DECNUMARTDECL_OB";

	    public final static String DECNUMREPERTOIRE_OB = "error.DECNUMREPERTOIRE_OB";

	    public final static String brouillonartdecKey = "error.brouillonartdecKey";

	    public final static String RCCODEBURDOUANE_OB = "error.RCCODEBURDOUANE_OB";

	    public final static String RCCODEBURFRANCHISE_OB = "error.RCCODEBURFRANCHISE_OB";

	    public final static String RCLIBBURFRANCHISE_OB = "error.RCLIBBURFRANCHISE_OB";

	    public static final String succefulDeleteTable = "message.succefulDeleteTable";

	    public final static String RCCODEBURUEMOA_OB = "error.RCCODEBURUEMOA_OB";

	    public final static String RCCODEBURDECL_OB = "error.RCCODEBURDECL_OB";

	    public final static String RCMODEDECL_OB = "error.RCMODEDECL_OB";

	    public final static String RCLIBCATREGROUP_OB = "error.RCLIBCATREGROUP_OB";

	    public final static String RCCODEPJ_OB = "error.RCCODEPJ_OB";

	    public final static String catregroupKey = "error.catregroupKey";

	    public final static String RCDATEAPPLICATION_OB = "error.RCDATEAPPLICATION_OB";

	    public final static String RCIMPEXP_OB = "error.RCIMPEXP_OB";

	    public final static String RCLIBELLECHAINE_OB = "error.RCLIBELLECHAINE_OB";	   

	    public final static String RCCODECLASSE_OB = "error.RCCODECLASSE_OB";

	    public final static String CODECIEASSISTEE_OB = "error.CODECIEASSISTEE_OB";	

	    public final static String typecreditKey = "error.typecreditKey";

	    public final static String RCLIBELLECRITERE_OB = "error.RCLIBELLECRITERE_OB";

	    public final static String originecritereKey = "error.originecritereKey";

	    public final static String RCCODECHAINE_OB = "error.RCCODECHAINE_OB";

	    public final static String RCCODECRITERE_OB = "error.RCCODECRITERE_OB";

	    public final static String RCCOEFFICIENT_OB = "error.RCCOEFFICIENT_OB";

	    public final static String RCDATEDEVISE_OB = "error.RCDATEDEVISE_OB";

	    public final static String RCPRECISIONDEV_OB = "error.RCPRECISIONDEV_OB";

	    public final static String RCQTECFA_OB = "error.RCQTECFA_OB";

	    public final static String RCQTEDEVISE_OB = "error.RCQTEDEVISE_OB";

	    public final static String RCUSERMODIF_OB = "error.RCUSERMODIF_OB";

	    public final static String RCCODEDISPENSE_OB = "error.RCCODEDISPENSE_OB";

	    public final static String dispensesKey = "error.dispensesKey";

	    public final static String RCCODETATMODEREGLEMENT_OB = "error.RCCODETATMODEREGLEMENT_OB";

	    public final static String RCLIBETATMODEREGLEMENT_OB = "error.RCLIBETATMODEREGLEMENT_OB";

	    public final static String RCLIBELLEEXCEPTION_OB = "error.RCLIBELLEEXCEPTION_OB";

	    public final static String RCGENREBUREAU_OB = "error.RCGENREBUREAU_OB";

	    public final static String positionproduitKey = "error.positionproduitKey";

	    public final static String RCNUMIMPORTEXPORT_OB = "error.RCNUMIMPORTEXPORT_OB";

	    public final static String RCLIBELLEINDICATEUR_OB = "error.RCLIBELLEINDICATEUR_OB";

	    public final static String RCTYPEINDICATEUR_OB = "error.RCTYPEINDICATEUR_OB";

	    public final static String LIBELLELANGUE_OB = "error.LIBELLELANGUE_OB";

	    public final static String RCCODELIEUDEPOT_OB = "error.RCCODELIEUDEPOT_OB";

	    public final static String RCCODELIEUEMB_OB = "error.RCCODELIEUEMB_OB";

	    public final static String NUMMESSAGE_OB = "error.NUMMESSAGE_OB";

	    public final static String RCCODEMSGERREUR_OB = "error.RCCODEMSGERREUR_OB";

	    public final static String RCCODEMODECOND_OB = "error.RCCODEMODECOND_OB";

	    public final static String RCCODEMODEREG_OB = "error.RCCODEMODEREG_OB";

	    public final static String RCLIBREGLEMENT_OB = "error.RCLIBREGLEMENT_OB";

	    public final static String etatmodereglementKey = "error.etatmodereglementKey";

	    public final static String RCCODEMODETRANS_OB = "error.RCCODEMODETRANS_OB";

	    public final static String RCCODENATUREMANIF_OB = "error.RCCODENATUREMANIF_OB";

	    public final static String RCNATUREAPUREMANIF_OB = "error.RCNATUREAPUREMANIF_OB";

	    public final static String RCCODEFISCALITE_OB = "error.RCCODEFISCALITE_OB";

	    public final static String RCLIBPIECEJOINTE_OB = "error.RCLIBPIECEJOINTE_OB";

	    public final static String RCLIBNATREGECO_OB = "error.RCLIBNATREGECO_OB";

	    public final static String RCCODENBRECONN_OB = "error.RCCODENBRECONN_OB";	    

	    public final static String RCLIBELLEOPERATEUR_OB = "error.RCLIBELLEOPERATEUR_OB";

	    public final static String RCSYMBOLEOPERATEUR_OB = "error.RCSYMBOLEOPERATEUR_OB";

	    public final static String RCLIBELLETABLE_OB = "error.RCLIBELLETABLE_OB";

	    public final static String RCNOMTABLE_OB = "error.RCNOMTABLE_OB";

	    public final static String RCDESCRIPTIF_OB = "error.RCDESCRIPTIF_OB";

	    public final static String RCINDICPARAM_OB = "error.RCINDICPARAM_OB";

	    public final static String naturepiecejointeKey = "error.naturepiecejointeKey";

	    public final static String RCCODEPIECEJ_OB = "error.RCCODEPIECEJ_OB";

	    public final static String RCCODEREGDOU_OB = "error.RCCODEREGDOU_OB";

	    public final static String RCDATEPIECEJ_OB = "error.RCDATEPIECEJ_OB";

	    public final static String RCREGFISCAL_OB = "error.RCREGFISCAL_OB";

	    public final static String RCCODECHAPITRE_OB = "error.RCCODECHAPITRE_OB";

	    public final static String RCCODEPOSITION_OB = "error.RCCODEPOSITION_OB";

	    public final static String RCLIBELLEPOSITION_OB = "error.RCLIBELLEPOSITION_OB";

	    public final static String RCCODEPAYSETRANGER_OB = "error.RCCODEPAYSETRANGER_OB";

	    public final static String RCCODEPPMETRANGER_OB = "error.RCCODEPPMETRANGER_OB";

	    public final static String RCCODEPRODUIT_OB = "error.RCCODEPRODUIT_OB";

	    public final static String RCPRECSENPROD_OB = "error.RCPRECSENPROD_OB";

	    public final static String RCPRECUEMOAPROD_OB = "error.RCPRECUEMOAPROD_OB";

	    public final static String CODECREDITNONSUSPENDU_OB = "error.CODECREDITNONSUSPENDU_OB";

	    public final static String TYPEMERC_OB = "error.TYPEMERC_OB";

	    public final static String RCREGDOUAPURANT_OB = "error.RCREGDOUAPURANT_OB";

	    public final static String RCREGDOUAPURE_OB = "error.RCREGDOUAPURE_OB";

	    public static final String SQLSuccess = "message.SQLSuccess";

	    public static final String diniedSQL = "error.diniedSQL";

	    public final static String RCTYPEREGAPURANT_OB = "error.RCTYPEREGAPURANT_OB";

	    public final static String RCTYPEREGAPURE_OB = "error.RCTYPEREGAPURE_OB";

	    public final static String RCREGDOUANE_OB = "error.RCREGDOUANE_OB";

	    public final static String RCCODEREGIMEDOUANE_OB = "error.RCCODEREGIMEDOUANE_OB";

	    public final static String RCDATECLOTURE_OB = "error.RCDATECLOTURE_OB";

	    public final static String RCTYPEREGIMEDOUANE_OB = "error.RCTYPEREGIMEDOUANE_OB";

	    public final static String RCCODEMODEDECLARATION_OB = "error.RCCODEMODEDECLARATION_OB";

	    public final static String RCNUMGAMME_OB = "error.RCNUMGAMME_OB";

	    public final static String RCINDICMUTAT_OB = "error.RCINDICMUTAT_OB";

	    public final static String RCCODENATREGECO_OB = "error.RCCODENATREGECO_OB";

	    public final static String RCDATEDECISIONREGECO_OB = "error.RCDATEDECISIONREGECO_OB";

	    public final static String natureregecoKey = "error.natureregecoKey";

	    public final static String INDREGEXO_OB = "error.INDREGEXO_OB";

	    public final static String RCINDSUSPENSION_OB = "error.RCINDSUSPENSION_OB";

	    public final static String RCTYPEREGDOUANIER_OB = "error.RCTYPEREGDOUANIER_OB";

	    public final static String RCCODEEXP_OB = "error.RCCODEEXP_OB";

	    public final static String RCCODEIMP_OB = "error.RCCODEIMP_OB";

	    public final static String RCCODEREGECO_OB = "error.RCCODEREGECO_OB";

	    public final static String RCANNEEREGECO_OB = "error.RCANNEEREGECO_OB";

	    public final static String RCNUMEROGAMME_OB = "error.RCNUMEROGAMME_OB";

	    public final static String RCNUMREGECO_OB = "error.RCNUMREGECO_OB";

	    public final static String RCPRECSEN_OB = "error.RCPRECSEN_OB";

	    public final static String RCANNEESCORE_OB = "error.RCANNEESCORE_OB";

	    public final static String RCCODEBUR_OB = "error.RCCODEBUR_OB";

	    public final static String RCCODECONSIGNATAIRE_OB = "error.RCCODECONSIGNATAIRE_OB";

	    public final static String RCDATEDEBUT_OB = "error.RCDATEDEBUT_OB";

	    public final static String RCDATEFIN_OB = "error.RCDATEFIN_OB";

	    public final static String RCSCORECONSIGN_OB = "error.RCSCORECONSIGN_OB";

	    public final static String RCCODETYPESENSVOY_OB = "error.RCCODETYPESENSVOY_OB";

	    public final static String RCDDEBUTSENSVOY_OB = "error.RCDDEBUTSENSVOY_OB";

	    public final static String RCLIBELLETYPESENSVOY_OB = "error.RCLIBELLETYPESENSVOY_OB";

	    public final static String RCSCORESENSVOY_OB = "error.RCSCORESENSVOY_OB";

	    public final static String RCCODETONNNAGE_OB = "error.RCCODETONNNAGE_OB";

	    public final static String RCDATEDEBTONNDEB_OB = "error.RCDATEDEBTONNDEB_OB";

	    public final static String RCINDICEDEBTONNDEBARQ_OB = "error.RCINDICEDEBTONNDEBARQ_OB";

	    public final static String RCINDICEFINTONNDEBARQ_OB = "error.RCINDICEFINTONNDEBARQ_OB";

	    public final static String RCSCORETONNDEB_OB = "error.RCSCORETONNDEB_OB";

	    public final static String CODETYPEDESTFISCAL_OB = "error.CODETYPEDESTFISCAL_OB";

	    public final static String RCDDEBUTDESTFISC_OB = "error.RCDDEBUTDESTFISC_OB";

	    public final static String RCLIBELLETYPEDESTFISCAL_OB = "error.RCLIBELLETYPEDESTFISCAL_OB";

	    public final static String RCSCORETYPEFISC_OB = "error.RCSCORETYPEFISC_OB";

	    public final static String DDEBUTNATCARG_OB = "error.DDEBUTNATCARG_OB";

	    public final static String RCCODETYPENATCARG_OB = "error.RCCODETYPENATCARG_OB";

	    public final static String RCLIBELLETYPENATCARG_OB = "error.RCLIBELLETYPENATCARG_OB";

	    public final static String RCPOIDSNATCARG_OB = "error.RCPOIDSNATCARG_OB";

	    public final static String RCCODETYPENAVIRE_OB = "error.RCCODETYPENAVIRE_OB";

	    public final static String RCDDEBUTTYPNAV_OB = "error.RCDDEBUTTYPNAV_OB";

	    public final static String RCLIBELLETYPENAVIRE_OB = "error.RCLIBELLETYPENAVIRE_OB";

	    public final static String RCSCORETYPENAV_OB = "error.RCSCORETYPENAV_OB";

	    public final static String RCCODEROMAINSECTION_OB = "error.RCCODEROMAINSECTION_OB";

	    public final static String RCCODESECTION_OB = "error.RCCODESECTION_OB";

	    public final static String RCLIBELLESECTION_OB = "error.RCLIBELLESECTION_OB";	   

	    public final static String RCCODEPIECEJOINTE_OB = "error.RCCODEPIECEJOINTE_OB";

	    public final static String RCCODESOUMDOC_OB = "error.RCCODESOUMDOC_OB";

	    public final static String RCLIBELLESOUMDOC_OB = "error.RCLIBELLESOUMDOC_OB";

	    public final static String piecesjointesKey = "error.piecesjointesKey";	  

	    public final static String ppmKey = "error.ppmKey";

	    public final static String RCDATEVALIDITE_OB = "error.RCDATEVALIDITE_OB";

	    public final static String RCCODEPROD_OB = "error.RCCODEPROD_OB";

	    public final static String RCPRECSENEGAL_OB = "error.RCPRECSENEGAL_OB";

	    public final static String RCPRECUEMOA_OB = "error.RCPRECUEMOA_OB";

	    public final static String produitsKey = "error.produitsKey";

	    public final static String RCVALEURTAUX_OB = "error.RCVALEURTAUX_OB";

	    public final static String RCFORMULETAXE_OB = "error.RCFORMULETAXE_OB";

	    public final static String RCINDCOMPTANT_OB = "error.RCINDCOMPTANT_OB";

	    public final static String RCLIBELLETAXE_OB = "error.RCLIBELLETAXE_OB";

	    public final static String RCORDREEVALTAXE_OB = "error.RCORDREEVALTAXE_OB";

	    public final static String RCCODEREGIMEDOUNIER_OB = "error.RCCODEREGIMEDOUNIER_OB";

	    public final static String RCREGIMEFISCAL_OB = "error.RCREGIMEFISCAL_OB";

	    public final static String RCTYPEREGIMEDOUANIER_OB = "error.RCTYPEREGIMEDOUANIER_OB";

	    public final static String regimeKey = "error.regimeKey";

	    public final static String RCCODEREGROUP_OB = "error.RCCODEREGROUP_OB";

	    public final static String RCTAUX_OB = "error.RCTAUX_OB";

	    public final static String regroupementKey = "error.regroupementKey";	  

	    public final static String RCCODEREGIMEDOUANIER_OB = "error.RCCODEREGIMEDOUANIER_OB";

	    public final static String RCCODEREGIMEFISCAL_OB = "error.RCCODEREGIMEFISCAL_OB";

	    public final static String indicateurKey = "error.indicateurKey";

	    public final static String RCCODETAUX_OB = "error.RCCODETAUX_OB";

	    public final static String RCCODETAXE_OB = "error.RCCODETAXE_OB";

	    public final static String RCCODETRANSPORT_OB = "error.RCCODETRANSPORT_OB";

	    public final static String RCDATEVALEUR_OB = "error.RCDATEVALEUR_OB";

	    public final static String taxesKey = "error.taxesKey";

	    public final static String modetransportKey = "error.modetransportKey";

	    public final static String RCANNEETITREEXO_OB = "error.RCANNEETITREEXO_OB";

	    public final static String RCBURFRANCHISE_OB = "error.RCBURFRANCHISE_OB";

	    public final static String RCNBRECOLISINITIAL_OB = "error.RCNBRECOLISINITIAL_OB";

	    public final static String RCNUMTITREEXO_OB = "error.RCNUMTITREEXO_OB";

	    public final static String RCPDSINITIAL_OB = "error.RCPDSINITIAL_OB";

	    public final static String RCQTECOMPLINITIAL_OB = "error.RCQTECOMPLINITIAL_OB";

	    public final static String RCVALEURINITIAL_OB = "error.RCVALEURINITIAL_OB";

	    public final static String bureaufranchiseKey = "error.bureaufranchiseKey";

	    public final static String RCCODEAPUREMENT_OB = "error.RCCODEAPUREMENT_OB";

	    public final static String RCLIBELLEAPUREMENT_OB = "error.RCLIBELLEAPUREMENT_OB";

	    public final static String RCCODEBUREAU_OB = "error.RCCODEBUREAU_OB";

	    public final static String bureaudouaneKey = "error.bureaudouaneKey";

	    public final static String RCREGIMEDOUANIER_OB = "error.RCREGIMEDOUANIER_OB";

	    public final static String RCTYPEAPUREMENT_OB = "error.RCTYPEAPUREMENT_OB";

	    public final static String regimedouanierKey = "error.regimedouanierKey";

	    public final static String RCCODETYPEBUR_OB = "error.RCCODETYPEBUR_OB";

	    public final static String RCLIBELLETYPEBUR_OB = "error.RCLIBELLETYPEBUR_OB";

	    public final static String RCCODEOERATEUR_OB = "error.RCCODEOERATEUR_OB";

	    public final static String RCTYPECHAMP_OB = "error.RCTYPECHAMP_OB";

	    public final static String operateurKey = "error.operateurKey";

	    public final static String RCCODETYPECONT_OB = "error.RCCODETYPECONT_OB";

	    public final static String RCLIBELLETYPECONT_OB = "error.RCLIBELLETYPECONT_OB";	 

	    public final static String RCCODETYPEDECISION_OB = "error.RCCODETYPEDECISION_OB";

	    public final static String RCLIBELLEDECISION_OB = "error.RCLIBELLEDECISION_OB";

	    public final static String RCCODETYPEIMPUTATION_OB = "error.RCCODETYPEIMPUTATION_OB";

	    public final static String RCLIBELLEIMPUTATION_OB = "error.RCLIBELLEIMPUTATION_OB";

	    public final static String RCCODETYPEINDICATEUR_OB = "error.RCCODETYPEINDICATEUR_OB";

	    public final static String RCLIBTYPEINDICATEUR_OB = "error.RCLIBTYPEINDICATEUR_OB";

	    public final static String RCNOMTABLEUTILISEE_OB = "error.RCNOMTABLEUTILISEE_OB";

	    public final static String CODETYPELIEUEMB_OB = "error.CODETYPELIEUEMB_OB";

	    public final static String LIBELLETYPELIEUEMB_OB = "error.LIBELLETYPELIEUEMB_OB";

	    public final static String RCCODETYPELIQUID_OB = "error.RCCODETYPELIQUID_OB";

	    public final static String RCLIBELLETYPELIQUID_OB = "error.RCLIBELLETYPELIQUID_OB";

	    public final static String RCCODETYPEMANIF_OB = "error.RCCODETYPEMANIF_OB";

	    public final static String RCLIBELLETYPEMANIF_OB = "error.RCLIBELLETYPEMANIF_OB";

	    public final static String RCCODETYPEMISEDEPOT_OB = "error.RCCODETYPEMISEDEPOT_OB";

	    public final static String RCLIBELLETYPEMISEDEPOT_OB = "error.RCLIBELLETYPEMISEDEPOT_OB";

	    public final static String RCTYPEREGIME_OB = "error.RCTYPEREGIME_OB";

	    public final static String RCINDICATEURSUSP_OB = "error.RCINDICATEURSUSP_OB";

	    public final static String RCCODESOUMISS_OB = "error.RCCODESOUMISS_OB";

	    public final static String RCLIBELLESOUMISS_OB = "error.RCLIBELLESOUMISS_OB";

	    public final static String RCSCORETYPESOUM_OB = "error.RCSCORETYPESOUM_OB";

	    public final static String CODETYPEVOIE_OB = "error.CODETYPEVOIE_OB";

	    public final static String LIBELLETYPEVOIE_OB = "error.LIBELLETYPEVOIE_OB";
	   
	    public final static String RCCODEETATREGLEMENT_OB = "error.RCCODEETATREGLEMENT_OB";

	    public final static String RCLIBETATREGLEMENT_OB = "error.RCLIBETATREGLEMENT_OB";

	    public final static String RCCODEETATDOSSIER_OB = "error.RCCODEETATDOSSIER_OB";

	    public final static String RCLIBETATDOSSIER_OB = "error.RCLIBETATDOSSIER_OB";

	    public final static String TRANNEEDECL_OB = "error.TRANNEEDECL_OB";

	    public final static String TRBURDECLARATION_OB = "error.TRBURDECLARATION_OB";

	    public final static String TRCODECREDITAIRE_OB = "error.TRCODECREDITAIRE_OB";

	    public final static String TRDATEBAE_OB = "error.TRDATEBAE_OB";

	    public final static String TRDATEREGLEMENT_OB = "error.TRDATEREGLEMENT_OB";

	    public final static String TRETAT_OB = "error.TRETAT_OB";

	    public final static String TRJOURNALTRESOR_OB = "error.TRJOURNALTRESOR_OB";

	    public final static String TRMONTANTCOMPTANT_OB = "error.TRMONTANTCOMPTANT_OB";

	    public final static String TRMONTANTCREDIT_OB = "error.TRMONTANTCREDIT_OB";

	    public final static String TRNUMDECLARATION_OB = "error.TRNUMDECLARATION_OB";

	    public final static String TRNUMDOSSIERPROV_OB = "error.TRNUMDOSSIERPROV_OB";

	    public final static String TRTVACREDIT_OB = "error.TRTVACREDIT_OB";

	    public final static String creditaireInexistant = "error.creditaireInexistant";

	    public static final String exceptionsKey = "error.exceptionsKey";

	    public final static String RCCODETYPELIQSUPP_OB = "error.RCCODETYPELIQSUPP_OB";

	    public final static String RCLIBELLELIQSUPP_OB = "error.RCLIBELLELIQSUPP_OB";

	    public final static String rcRowNotFound = "error.rcRowNotFound";
	    public final static String rcRowAgentNotFound = "error.rcRowAgentNotFound";
	    public final static String produitRowNotFound="error.produitRowNotFound";

	    public final static String RCIDJRNALREGLEMENT_OB = "error.RCIDJRNALREGLEMENT_OB";

	    public final static String journaltresorKey = "error.journaltresorKey";

	    public final static String rctypeapurementKey = "error.rctypeapurementKey";

	    public final static String regimeeconomiqueKey = "error.regimeeconomiqueKey";

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

	    public static final String groupefonctionKey = "error.groupefonctionKey";

	    public static final String profilKey = "error.profilKey";	  

	    public static final String typeindicateurKey = "error.typeindicateurKey";	  

	    public static final String typeutilsateurKey = "error.typeutilsateurKey";

	    public static final String succefulDeleteCond = "message.succefulDeleteCond";

	    public final static String RCLIBELLEEXPEDITION_OB = "error.RCLIBELLEEXPEDITION_OB";

	    public final static String RCMODEEXPEDITION_OB = "error.RCMODEEXPEDITION_OB";

	    public final static String CODE_OB = "error.CODE_OB";

	    public final static String LIBELLE_OB = "error.LIBELLE_OB";

	    public final static String RBLIBELLEDOC_OB = "error.RBLIBELLEDOC_OB";

	    public final static String RCCODEDOCUMENT_OB = "error.RCCODEDOCUMENT_OB";

	    public final static String LIBUNITE_OB = "error.LIBUNITE_OB";

	    public final static String UNITFAC_OB = "error.UNITFAC_OB";

	    public final static String critereslogiquesKey = "error.critereslogiquesKey";

	    public final static String RCCODECRITERELOGIQUE_OB = "error.RCCODECRITERELOGIQUE_OB";

	    public final static String RCDATEDEBUTCRITERELOGIQUE_OB = "error.RCDATEDEBUTCRITERELOGIQUE_OB";

	    public final static String RCLIBELLECRITERELOGIQUE_OB = "error.RCLIBELLECRITERELOGIQUE_OB";

	    public final static String RCCODEDETAILCHAINE_OB = "error.RCCODEDETAILCHAINE_OB";

	    public final static String RCNIVEAUEXCEPTION_OB = "error.RCNIVEAUEXCEPTION_OB";

	    public static final String erreurAncienMotPasse = "error.AncienMotPasse";

	    public static final String erreurNouveauMotPasse = "error.NouveauMotPasse";

	    public static final String verifNotMatch = "error.verifNotMatch";
	    
	    public static final String verif1NotMatch = "error.verif1NotMatch";
	    
	    public static final String verif2NotMatch = "error.verif2NotMatch";

	    public static final String profilNotMatch = "error.profilNotMatch";
	    
	    public static final String errorNewProduits = "error.errorNewProduits";
	    
	    public final static String ppmNotFound = "error.ppmNotFound";
	    public final static String etatConnected = "1";
	    public final static String erreurTrancheborne = "message.erreurTrancheborne";
	    public final static String erreurTranche = "message.erreurTrancheTranche";
	    public final static String succefulInsertTrancheQuittance = "message.succefulInsertTrancheQuittance";
	    public final static String erreurArchiveTranche = "message.erreurArchiveTranche";
	    public final static String succefulInsertArchiveTranche = "message.succefulInsertArchiveTranche";
	    
	    public final static String SUCCESFUL_INSERT = "message.succefulInsert";
	    public final static String SUCCESFUL_UPDATE = "message.succefulUpdate";
	    public final static String SUCCESFUL_DELETE = "message.succefulDelete";
	    public final static String agentNotFound = "error.agentNotFound";
	    
	    public static final String remoteExpSB = "error.remoteExpSB";
	    public final static String delegationExistante = "error.delegationExistante";
	    public final static String delegationSupprimee = "error.delegationSupprimee";
	    public final static String succesfullValidate="message.successfullValidate";
	    public final static String burDelegationIncompatible = "RcDelegationsFB.compatibiliteBureau";
	    public final static String succesDelegation="listeDelegations.successDelegation";
	    
	    public static final String produitError = "error.produitError";
	    
}
