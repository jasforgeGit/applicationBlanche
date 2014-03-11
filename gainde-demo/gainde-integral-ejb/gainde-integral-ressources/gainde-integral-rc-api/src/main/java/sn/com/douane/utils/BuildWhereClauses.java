package sn.com.douane.utils;

import java.io.Serializable;


/**
 * 
 * @author Mouhamad KAMARA
 * 
 * Cette classe permet de construire des bouts de chaines SQL  utiliser dans
 * les methodes de type 'rechercheByWhereXXXXXXX'. Toutes les methodes de cette
 * classe renvoient des chaines de caracteres du type 'AND <NOMCHAMP>= <VALEUR>
 * AND <NOMCHAMP>= <VALEUR>...' ou de type 'AND <NOMCHAMP>= <VALEUR>OR
 * <NOMCHAMP>= <VALEUR>...'
 *  
 */
public class BuildWhereClauses implements Serializable {

	private static final long serialVersionUID = -5722355779790074561L;

	private static final String fromDemandeRecondArtMan = "from DdeRecondArtMan where 1=1 "; 
	
	private static final String fromConteneurArticle = "from ConteneurArticle where 1=1 "; 
	
	private static final String fromArticleManifeste = "from ArticleManifeste where 1=1 "; 
	
	private static final String fromDdeRecondCont = "from DdeRecondCont where 1=1 "; 
	
	private static final String fromSegmentGenManifeste = "from SegmentGenManifeste where 1=1 "; 
		
    public BuildWhereClauses() {
        super();
    }

    /**
     *  
     */
    public static String getWhereArticlemanifesteOne(String manifanneeengmanif, String manifcodeconsign, String manifnumrepertoire) {
        String where = " AND manifAnneeEngManif='" + manifanneeengmanif + "' " + "AND manifCodeConsign='" + manifcodeconsign + "' "
                + "AND manifNumRepertoire='" + manifnumrepertoire + "' " + "AND (manifTypeTraitement <> 'E' OR manifTypeTraitement IS NULL)";
        return where;
    }

    public static String getWhereArticlemanifesteDR(String manifanneeengmanif,
            String manifcodeconsign, String manifnumrepertoire) {
        String where = " AND manifAnneeEngManif = '" + manifanneeengmanif
                + "' " + "AND manifCodeConsign = '" + manifcodeconsign + "' "
                + "AND manifNumRepertoire = '" + manifnumrepertoire + "' "
                + "AND manifEtatArtManif = 'DR'"
                + "AND manifTypeTraitement = 'D'";
        return where;
    }
    
    public static String getWhereArticlemanifesteConsultationDR(String manifanneeengmanif,
            String manifcodeconsign, String manifnumrepertoire) {
        String where = " AND manifAnneeEngManif = '" + manifanneeengmanif
                + "' " + "AND manifCodeConsign = '" + manifcodeconsign + "' "
                + "AND manifNumRepertoire = '" + manifnumrepertoire + "' "
                + "AND manifEtatArtManif = 'DR'";
        return where;
    }
    /**
     *  
     */
    public static String getWhereDderecondartmanOne(String manifanneeengmanif,
            String manifbureauengmanif, Integer manifnumenregmanif,
            Integer manifnumarticlemanif, Integer manifprecisartmanif) {
        String where = " AND MANIFANNEEENREGMANIF = '" + manifanneeengmanif
                + "' " + " AND MANIFBURENREGMANIF = '" + manifbureauengmanif
                + "' " + " AND MANIFNUMENREGMANIF = " + manifnumenregmanif
                + " " + " AND MANIFNUMARTMANIF = " + manifnumarticlemanif + " "
                + " AND MANIFPRECARTMANIF = " + manifprecisartmanif
                + " FETCH FIRST 21 ROWS ONLY FOR READ ONLY WITH UR ";
        return where;
    }
    
    /**
     *  
     */
    public static String getWhereDdeRecondArtMan(String manifanneeengmanif,
            String manifbureauengmanif, Integer manifnumenregmanif,
            Integer manifnumarticlemanif, Integer manifprecisartmanif) {
        String where = " AND manifAnneeEnregManif = '" + manifanneeengmanif
                + "' " + " AND manifBurEnregManif = '" + manifbureauengmanif
                + "' " + " AND manifNumEnregManif = " + manifnumenregmanif
                + " " + " AND manifNumArtManif = " + manifnumarticlemanif; 
               // + " FETCH FIRST 21 ROWS ONLY FOR READ ONLY WITH UR ";        
        return where;
    }

    /**
     *  
     */
    public static String getWhereConteneurArticleOne(
            String manifbureauengmanif, String manifanneeengmanif,
            Integer manifnumenregmanif, Integer manifnumarticlemanif,
            Integer manifprecisartmanif, Integer manifprecis2artmanif) {
        String where = " AND manifBureauEngManif = '" + manifbureauengmanif
                + "' " + "AND manifAnneeEngManif = '" + manifanneeengmanif
                + "' " + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                + "AND manifNumArticleManif = " + manifnumarticlemanif + " "
                + "AND manifPrecisArtManif = " + manifprecisartmanif + " "
                + "AND manifPrecisArtManif2 = 0 AND manifNumConteneurs NOT IN "
                + "(SELECT manifNumCont FROM DdeRecondCont "
                + "WHERE manifAnneeEnregManif = '" + manifanneeengmanif + "' "
                + "AND manifBurEnregManif ='" + manifbureauengmanif + "' "
                + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                + "AND manifNumArtManif = " + manifnumarticlemanif + " "
                + "AND manifPrecArtManif = " + manifprecisartmanif + " "
                + "AND manifPrecArtManif2 = " + manifprecis2artmanif + ") ";
        return where;
    }

    /**
     *  
     */
    public static String getWhereDderecondcontOne(String manifanneeenregmanif,
            String manifburenregmanif, Integer manifnumenregmanif,
            Integer manifnumartmanif, Integer manifprecartmanif,
            Integer manifprecartmanif2) {
        String where = " AND manifAnneeEnregManif = '" + manifanneeenregmanif
                + "' " + "AND manifBurEnregManif = '" + manifburenregmanif
                + "' " + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                + "AND manifNumArtManif = " + manifnumartmanif + " "
                + "AND manifPrecArtManif = " + manifprecartmanif + " "
                + "AND manifPrecArtManif2 = " + manifprecartmanif2 + " ";
        return where;
    }

    /**
     *  
     */
    public static String getWhereDderecondartmanTwo(
            String manifanneeenregmanif, String manifburenregmanif,
            Integer manifnumenregmanif, Integer manifnumartmanif,
            Integer manifprecartmanif) {
        String where = "AND DDERECONDART.manifAnneeEnregManif='"
                + manifanneeenregmanif + "' "
                + "AND DDERECONDART.manifBurEnregManif='" + manifburenregmanif
                + "' " + "AND DDERECONDART.manifNumEnregManif="
                + manifnumenregmanif + " "
                + "AND DDERECONDART.manifNumArtManif=" + manifnumartmanif + " "
                + " " + "AND DDERECONDART.manifPrecArtManif <> 0 ";
        //+ "AND DDERECONDART.MANIFPRECARTMANIF=" + manifprecartmanif
        //				+ "AND MANIFPRECARTMANIF2 <> " + manifprecisartmanif2 + ") ";
        return where;
    }

    
    /**
     *  
     */
    public static String getWhereDderecondartmanThree(
            String manifanneeenregmanif, String manifburenregmanif,
            Integer manifnumenregmanif, Integer manifnumartmanif,
            Integer manifprecartmanif, Integer manifprecartmanif2,
            Integer manifnumrecond, Integer manifnumrecond2) {
        String where = "AND manifAnneeEnregManif='" + manifanneeenregmanif
                + "' " + "AND manifBurEnregManif='" + manifburenregmanif + "' "
                + "AND manifNumEnregManif=" + manifnumenregmanif + " "
                + "AND manifNumArtManif=" + manifnumartmanif + " "
                + "AND manifPrecArtManif=" + manifprecartmanif + " "
                + "AND manifPrecArtManif2=" + manifprecartmanif2 + " "
                + "AND manifNumRecond=" + manifnumrecond + " "
                + "AND manifNumRecond2=" + manifnumrecond2 + " ";
        return where;
    }

    /**
     *  
     */
    public static String getWhereDderecondartmanFour(String manifanneeenregmanif, String manifburenregmanif, Integer manifnumenregmanif, Integer manifnumartmanif, Integer manifprecartmanif, Integer manifprecartmanif2) {
        String where = " AND manifAnneeEnregManif = '" + manifanneeenregmanif + "' " + "AND manifBurEnregManif = '" + manifburenregmanif + "' " + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                		+ "AND manifNumArtManif = " + manifnumartmanif + " " + "AND manifPrecArtManif = " + manifprecartmanif + " " + "AND manifPrecArtManif2 <> " + manifprecartmanif2 + " ";       
        return where;
    }

    /**
     *  
     */
    public static String getWhereSegmentgenmanifesteAerienGroupageOne(
            String manifcodeconsignataire, String manifanneeenregmanif,
            String manifbureauenregmanif, String manifnumenregmanif,
            String maniftypemanifeste) {
        String where = "AND manifCodeConsignataire = '"
                + manifcodeconsignataire + "' "
                + "AND manifAnneeEnregManif = '" + manifanneeenregmanif + "' "
                + "AND manifBureauEnregManif = '" + manifbureauenregmanif
                + "' " + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                + "AND manifTypeManifeste = " + maniftypemanifeste;
        return where;
    }

    /**
     *  
     */
    public static String getWhereArticlemanifesteAerienGroupageOne(
            String manifcodeconsign, String manifanneeengmanif,
            String manifbureauengmanif, String manifnumenregmanif,
            String manifnumrepertoire, String manifnumtitretransp) {
        String where = "AND manifCodeConsign = '" + manifcodeconsign + "' "
                + "AND manifAnneeEngManif = '" + manifanneeengmanif + "' "
                + "AND manifBureauEngManif = '" + manifbureauengmanif + "' "
                + "AND manifNumEnregManif = " + manifnumenregmanif + " "
                + "AND manifNumRepertoire = '" + manifnumrepertoire + "'";
        return where;
    }

    /**
     *  
     */
    public static String getWhereArticleBrouillonOne(String manifcodeconsig,
            String manifanneeenreg, String manifnumrep, Integer manifnumart,
            String manifcodelieuembarq, Integer manifprecartmanif) {
        String where = " AND MANIFCODECONSIG = '" + manifcodeconsig + "' "
                + "AND MANIFANNEEENREG = '" + manifanneeenreg + "' "
                + "AND MANIFNUMREP = '" + manifnumrep + "' "
                + "AND MANIFNUMART = " + manifnumart + " "
                + "AND MANIFCODELIEUEMBARQ = '" + manifcodelieuembarq + "' "
                + "AND (MANIFPRECARTMANIF<>0 AND MANIFPRECARTMANIF<> "
                + manifprecartmanif + ") ";
        return where;
    }

    /**
     *  
     */
    public static String getWhereConteneurBrouillonOne(
            String manifcodeconsignataire, String manifanneeenregmanif,
            String manifnumrepertoire, Integer manifnumartmanifeste,
            String manifcodelieuembarq) {
        String where = " AND MANIFCODECONSIGNATAIRE = '"
                + manifcodeconsignataire
                + "' "
                + "AND MANIFANNEEENREGMANIF = '"
                + manifanneeenregmanif
                + "' "
                + "AND MANIFNUMREPERTOIRE = '"
                + manifnumrepertoire
                + "' "
                + "AND MANIFNUMARTMANIFESTE = "
                + manifnumartmanifeste
                + " "
                + "AND MANIFCODELIEUEMBARQ = '"
                + manifcodelieuembarq
                + "' "
                + "AND MANIFPRECISARTBROUMANIF = 0 AND MANIFNUMCONTENEUR NOT IN "
                + "(SELECT MANIFNUMCONTENEUR FROM "+ConstRC.SHEMABD+"BROUILLONCONTENEURART "
                + "WHERE MANIFCODECONSIGNATAIRE = '" + manifcodeconsignataire
                + "' " + "AND MANIFANNEEENREGMANIF = '" + manifanneeenregmanif
                + "' " + "AND MANIFNUMREPERTOIRE = '" + manifnumrepertoire
                + "' " + "AND MANIFNUMARTMANIFESTE = " + manifnumartmanifeste
                + " " + "AND MANIFCODELIEUEMBARQ = '" + manifcodelieuembarq
                + "' " + "AND MANIFPRECISARTBROUMANIF <> 0) ";
        return where;
    }

    /**
     *  
     */
    public static String getWhereSegmentgenmanifeste(String manifcodeconsignataire, String manifanneeenregmanif, 
    		Integer manifnumenregmanif, String manifbureauenregmanif) {
        String where =" AND manifCodeConsignataire='"+manifcodeconsignataire+"'"
        			+" AND manifAnneeEnregManif='"+manifanneeenregmanif +"'"
        			+" AND manifNumEnregManif="+manifnumenregmanif +""
        			+" AND manifBureauEnregManif='"+manifbureauenregmanif+"'";
        return where;
    }
    
    public static String getWhereAutosation(String ppmdestinataire, String ppmdeclarant) {    	
    	return " and ppmAutorisant='" + ppmdestinataire
    	+ "' and ppmAutorise='" + ppmdeclarant
    	+ "' and dateAutorisation<='" + sysEnv.ToDay()
    	+ "'";
    }
    
    public static String whereTarifJoinTaux(String dateCalcul) {
		return "select tr from Tarif tr,Taux tx where 1=1 " +
				"and tr.rcCodeTaxe = tx.rcCodeTaxe " +
				"and tr.rcCodeTaux = tx.rcCodeTaux " +
				"and (tr.rcDateValeur <= " + dateCalcul + " " +
				"and (" + dateCalcul + " <= tr.rcDateCloture or tr.rcDateCloture is null)) " +
				"and (tx.rcDateValeur <= tr.rcDateValeur " +
				"and (tr.rcDateValeur <= tx.rcDateCloture or tx.rcDateCloture is null)) ";  
	}
    
    public static String whereIsNormal(String codprod, String precmuoa, String impexp) {
		return "and tr.rcCodeProd='" + codprod + "' and tr.rcPrecueMoa='"
				+ precmuoa + "' and tr.rcPrecSenegal='00' " +
				" and tr.rcCodeCimex = '" + impexp + "'" ;
	}
    
    public static String whereNotNormal(String codprod, String precmuoa,
			String precsenegal, String impexp) {
		return "and tr.rcCodeProd='" + codprod + "' and tr.rcPrecueMoa='"
				+ precmuoa + "' and tr.rcPrecSenegal='" + precsenegal + "'" +
				" and tr.rcCodeCimex = '" + impexp + "'" ;
	}
    
    public static String getOrderByTaxeAndTarif(){
    	
    	return " order by tr.rcCodeTaxe asc, tr.rcDateValeur desc, tx.rcDateValeur desc ";
    	
    }
    
    public static String wherepkDate(String codtaux, String rccodetaxe,
			String conditionDate) {
		return " and rcCodeTaux='"
				+ codtaux
				+ "' and rcCodeTaxe='"
				+ rccodetaxe
				+ "' "
				+ "AND rcDateValeur=(select max(rcDateValeur) from Taux "
				+ "where rcCodeTaxe='" + rccodetaxe + "' and rcCodeTaux='"
				+ codtaux + "')" + conditionDate;
	}
    
    public static String getConditionDate(){
    	
    	return  " and (rcDateValeur<= CURRENT DATE and (CURRENT DATE <=rcDateCloture or rcDateCloture is null)) ";
    }
    
    public static String whereTaxOrder() {
		return " rcCodeTaxe =?1  order by rcOrdreCalcul";
	}

	public static String getFromdemanderecondartman() {
		return fromDemandeRecondArtMan;
	}

	public static String getFromconteneurarticle() {
		return fromConteneurArticle;
	}

	public static String getFromarticlemanifeste() {
		return fromArticleManifeste;
	}

	public static String getFromdderecondcont() {
		return fromDdeRecondCont;
	}

	public static String getFromsegmentgenmanifeste() {
		return fromSegmentGenManifeste;
	}
    
    
      
}