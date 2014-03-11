package sn.com.douane.utils;

public class ConstRC {


	public static final String SHEMABD = GaindePropertiesReader.getInstance().getProperty("schemaDB").trim()+"."; 
    //------------------------------------------------------------------
    //		 	liste des constantes des listes box
    //------------------------------------------------------------------
    public static final String LISTEMODULE = "listModule";

    public static final String LISTEGROUPEFONC = "listGroupeFonc";

    public static final String LISTEFONCTIONNALITE = "listFonctionnalite";

    public static final String LISTESENSDELEGATION = "listSensDelegation";
    
    public static final String LISTEREGROUPEMENT = "listeRegroupement";

    public static final String ConstantManifeste = "CONS";

    public static final String libelleDelegation = "message.libdelegations";

    public static final String ConstantDeclaration = "TRANS";

    public static final String ConstantDouane = "DOU";

    public static final String ConstantTresor = "TRES";

    public static final String ConstantRC = "DD";

    public static final String typeUserAdmin = "A";

    public static final String typeUserCons = "C";

    public static final String typeUserDecl = "T";

    public static final String typeUserTres = "R";

    public static final String typeUserDoua = "D";

    public static final String LISTENIVEAUEXCEPTION = "listNiveauExcep";

    public static final String BROUDEC = "BROUDEC";

    public static final String SEGGENDEC = "SEGGENDEC";

    public static final String VISITE = "VISITE";

    public static final String libBROUDEC = "Brouillon";

    public static final String libSEGGENDEC = "Enregistrement";

    public static final String libVISITE = "Visite";

    public static final String profilIV = "IV";
    
    public static final String profilCL = "CL";
    public static final String profilCV = "CV";
    public static final String profilVY= "VY";
	/**
	 * @param ce_regfscregime_rccoderegimefiscal
	 * @param ce_regdouregime_rccoderegimedouanier
	 * @param ce_regdouregime_ce_typeregregdou_rctyperegime
	 * @return
	 */
	public static String whereRegimeType(String rccoderegimefiscal,
			String rccoderegimedouanier, String rctyperegime) {
		return " and rccoderegimefiscal='" + rccoderegimefiscal
				+ "' and rccoderegimedouanier='" + rccoderegimedouanier
				+ "' and rctyperegime='" + rctyperegime + "'";
	}
	
	public static String whereRegimeOuvraison(String rccoderegimefiscal,
			String rccoderegimedouanier, String rctyperegime) {
		return " and rccoderegimefiscal='" + rccoderegimefiscal
				+ "' and rccoderegimedouanier='" + rccoderegimedouanier
				+ "' and rccodeindicateur='" +ConstDeclaration.IndicateurOuvraison
				+ "' OR rccodeindicateur='" +ConstDeclaration.IndicateurOuvraisonF
				+ "' and rctyperegime='" + rctyperegime + "'";
	}
	
	public static String whereRegime(String rccoderegimedouanier, String rctyperegime, String indicateur) {
		return "  and rccoderegimedouanier='" + rccoderegimedouanier
				+ "' and rccodeindicateur='" +indicateur
				+ "' and rctyperegime='" + rctyperegime + "'";
	}
	
	public static String whereRegimeIndicateur(String rccoderegimedouanier, String rctyperegime, String rccoderegimefiscal, String indicateur) {
		return "  and rccoderegimedouanier='" + rccoderegimedouanier
				+ "' and rccodeindicateur='" +indicateur
				+ "' and rccoderegimefiscal='" + rccoderegimefiscal
				+ "' and rctyperegime='" + rctyperegime + "'";
	}

    

}