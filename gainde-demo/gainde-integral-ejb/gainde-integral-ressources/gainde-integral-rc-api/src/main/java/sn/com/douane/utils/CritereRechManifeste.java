package sn.com.douane.utils;

import java.io.Serializable;
import java.sql.Date;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.TwreException;

public class CritereRechManifeste implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3793660538821704112L;

	private String manifNumSeq;

	private String manifAnnee;

	private String manifCodeBur;

	private String manifNumRep;

	private String manifBurEnregManif;

	private String manifTypeManifeste;

	private String manifDateArrivee;

	private String manifDateEnreg;

	private String manifTitreTransp;

	private String manifNumVolVoy;

	private String artLieuEmbarq;

	private String numArticle;

	private String artPrecision1;

	private String artPrecision2;

	private String manifDateDebut;

	private String manifDateFin;

	private String selectManifeste = "from  SegmentGenManifeste SM";

	private String selectArticleManifeste = " select SM.manifNumEnregManif,SM.manifAnneeEnregManif,SM.manifBureauEnregManif, SM.manifCodePaysProv,"
			+ " AM.manifNumArticleManif,AM.manifCodeLieuEmb, AM.manifCodeDest, AM.manifModeCond, AM.manifDesignationCom, AM.manifPrecisArtManif,"
			+ " AM.manifPrecisArtManif2, AM.manifIndCiblage, AM.manifNomExpediteur,AM.manifNumTitreTransp,AM.manifNbrColis,AM.manifPdsBrutManif"
			+ " from SegmentGenManifeste SM, ArticleManifeste AM ";
	
	private String selectBrouillonManifeste = "from BrouillonSegenMan m";

	private String selectBrouillonManifesteArticle = "from BrouillonSegenMan m, BrouillonSegArt a";

	private String selectManifesteArticle = "from SegmentGenManifeste SM, ArticleManifeste AM";

	private String selectManifesteArticleDistinct = "select distinct SM from SegmentGenManifeste SM, ArticleManifeste AM";

	private String selectManifesteArticleRecond_2 = "select distinct SM from SegmentGenManifeste SM, ArticleManifeste AM, DdeRecondArtMan DR ";

	private String selectManifesteArticleRecondDistinct = "select distinct DR from SegmentGenManifeste SM, ArticleManifeste AM, DdeRecondArtMan DR";

	private String selectManifesteArticleRecond = "select DR from SegmentGenManifeste SM, ArticleManifeste AM, DdeRecondArtMan DR ";

	private String jointureManifesteBrouillonArticleBrouillon = " AND m.manifCodeConsignataire= a.manifCodeConsignataire"
			+ " AND m.manifAnneeEnreg=a.manifAnneeEnreg"
			+ " AND m.manifNumRepertoire=a.manifNumRepertoire";

	private String jointureManifesteArticle = " AND SM.manifCodeConsignataire=AM.manifCodeConsign"
			+ " AND SM.manifAnneeEnregManif=AM.manifAnneeEngManif"
			+ " AND SM.manifNumRep=AM.manifNumRepertoire";

	private String selectManifesteArticleRegistreDepot = "select distinct AM from SegmentGenManifeste SM , ArticleManifeste AM, RegistreDepot RD";

	private String jointureArticleManifesteSegmentManifeste = " AND  SM.manifBureauEnregManif = AM.manifBureauEngManif AND SM.manifAnneeEnregManif = AM.manifAnneeEngManif "
			+ "AND SM.manifNumEnregManif = AM.manifNumEnregManif ";

	private String orderByManif = "ORDER BY SM.manifNumEnregManif,SM.manifAnneeEnregManif,AM.manifNumArticleManif ASC ";

	private String groupByManif = "GROUP BY SM.manifBureauEnregManif, SM.manifAnneeEnregManif, SM.manifNumEnregManif, "
			+ "SM.manifCodePaysProv, AM.manifCodeLieuEmb, AM.manifCodeDest, AM.manifModeCond, AM.manifDesignationCom, AM.manifPrecisArtManif, "
			+ "AM.manifPrecisArtManif2, AM.manifIndCiblage, AM.manifNumArticleManif, AM.manifNomExpediteur,AM.manifNumTitreTransp,AM.manifNbrColis,AM.manifPdsBrutManif ";

	private String jointureManifesteArticleRegistreDepot = " AND AM.manifBureauEngManif=RD.manifBurEnregManif"
			+ " AND AM.manifAnneeEngManif = RD.manifAnneeEnregManif"
			+ " AND AM.manifNumEnregManif = RD.manifNumEnregManif"
			+ " AND AM.manifNumArticleManif = RD.manifNumArtManif"
			+ " AND AM.manifPrecisArtManif = RD.manifPrecArtManif"
			+ " AND AM.manifPrecisArtManif2 = RD.manifPrec2ArtManif"
			+ " AND AM.manifBureauEngManif = SM.manifBureauEnregManif"
			+ " AND AM.manifAnneeEngManif = SM.manifAnneeEnregManif"
			+ " AND AM.manifNumEnregManif = SM.manifNumEnregManif";

	private String jointureManifesteArticleRecond = " AND SM.manifCodeConsignataire=AM.manifCodeConsign"
			+ " AND SM.manifAnneeEnregManif=AM.manifAnneeEngManif"
			+ " AND SM.manifNumRep=AM.manifNumRepertoire"
			+ " AND DR.manifAnneeEnregManif=AM.manifAnneeEngManif"
			+ " AND DR.manifBurEnregManif=AM.manifBureauEngManif"
			+ " AND DR.manifNumEnregManif=AM.manifNumEnregManif"
			+ " AND DR.manifNumArtManif=AM.manifNumArticleManif";

	private String wherearticle = "select art, sg.manifNumVolVoyage, sg.manifDateArrivee " +
			"FROM ArticleManifeste art, SegmentGenManifeste sg " +
			"where sg.manifCodeConsignataire = art.manifCodeConsign " +
			"and sg.manifAnneeEnregManif = art.manifAnneeEngManif " +
			"and sg.manifNumRep = art.manifNumRepertoire ";
	
	public String getSQLManifesteAConsulterOuModifier(String codeConsignataire,
			String precision) {
		return precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectBrouillonManifeste()
				+ getSQLWhereManifesteBrouillon(codeConsignataire, precision)
				: getSelectBrouillonManifesteArticle()
						+ getSQLWhereManifesteBrouillon(codeConsignataire,
								precision)
						+ jointureManifesteBrouillonArticleBrouillon
						+ " Order By m.manifNumRepertoire ASC";
	}

	public String getSQLArticleAConsulterOuModifier(String codeConsignataire,
			String precision, String codeuser) {
		return precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectBrouillonManifeste()
				+ getSQLWhereManifesteBrouillon(codeConsignataire, precision)
				: getSelectBrouillonManifesteArticle()
						+ getSQLWhereManifesteBrouillon(codeConsignataire,
								precision)
						+ jointureManifesteBrouillonArticleBrouillon
						+ " Order By m.manifNumRepertoire ASC";
	}

	public String getClauseWhereManifComplemAFermer(String codeConsignataire,
			String precision) {
		String whereManifeste = "";
		whereManifeste = getSelectBrouillonManifeste()
				+ getSQLWhereManifesteBrouillon(codeConsignataire,
						ConstManif.IndPrecRechArticle)
				+ " and m.manifIndPartiel = 'C' ";
		return whereManifeste + " Order By m.manifNumRepertoire ASC";
	}

	public String getSQLWhereManifesteBrouillon(String codeConsignataire,
			String precision) {
		String whereManifeste = " WHERE ";
		String whereArticle = " ";
		whereManifeste += " m.manifCodeConsignataire = '" + codeConsignataire
				+ "'";
		if (getManifNumRep() != null && !getManifNumRep().trim().equals("")){
			whereManifeste += " and m.manifNumRepertoire LIKE '"
					+ getManifNumRep() + "%'";
		}
		if (getManifAnnee() != null && !getManifAnnee().trim().equals("")){
			whereManifeste += " and m.manifAnneeEnreg = '" + getManifAnnee()
					+ "'";
		}
		if (getManifBurEnregManif() != null
				&& !getManifBurEnregManif().trim().equals("")){
			whereManifeste += " and m.manifBurEnreg='"
					+ getManifBurEnregManif() + "'";
		}
		if (getManifTypeManifeste() != null
				&& !getManifTypeManifeste().trim().equals("")){
			whereManifeste += " and m.manifTypeManifeste="
					+ getManifTypeManifeste();
		}
		if (getManifDateArrivee() != null
				&& !getManifDateArrivee().trim().equals("")) {
			Date dateArrDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateArrivee()).getTime());
			// Date dateArrFin = new Date(ConvertUtil.convertStringToDate(
			// getManifDateArrivee()).getTime() + 86400000);
			whereManifeste += " and m.manifDateArrivee = '" + dateArrDebut
					+ "'";
		}
		if (getManifDateEnreg() != null
				&& !getManifDateEnreg().trim().equals("")) {
			Date dateEnregDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateEnreg()).getTime());
			// Date dateEnregFin = new Date(ConvertUtil.convertStringToDate(
			// getManifDateEnreg()).getTime() + 86400000);
			whereManifeste += " and  m.manifDateCreation = '" + dateEnregDebut
					+ "' ";
		}
		if (getManifNumVolVoy() != null
				&& !getManifNumVolVoy().trim().equals("")) {
			whereManifeste += " and m.manifNumVoyage='" + getManifNumVolVoy()
					+ "'";
		}

		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutCreation = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinCreation = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());

			whereManifeste += " and  m.manifDateCreation >= '"
					+ dateDebutCreation + "' and  m.manifDateCreation <= '"
					+ dateFinCreation + "'";
		}

		whereManifeste += " and (m.manifIndPartiel <> '"
				+ ConstManif.INDPARTIELMANIFCOMPLFERME + "'";

		whereManifeste += " or m.manifIndPartiel IS NULL ";

		whereManifeste += " or m.manifIndPartiel = '')";

		if (getArtLieuEmbarq() != null && !getArtLieuEmbarq().trim().equals("")) {
			whereArticle += " and a.manifCodeLieuEmbarq='" + getArtLieuEmbarq()
					+ "'";
		}
		if (getNumArticle() != null && !getNumArticle().trim().equals("")) {
			whereArticle += " and a.manifNumArt=" + getNumArticle();
		}
		if (getArtPrecision1() != null && !getArtPrecision1().trim().equals("")) {
			whereArticle += " and a.manifPrecArtManif=" + getArtPrecision1();
		}
		if (getManifTitreTransp() != null
				&& !getManifTitreTransp().trim().equals("")) {
			whereArticle += " and a.manifNumTitreTransport='"
					+ getManifTitreTransp() + "'";
		}

		if (precision.equals(ConstManif.IndPrecRechManifeste)) {
			return whereManifeste;
		} else {
			return whereManifeste + whereArticle;
		}

	}
	
	 public static String getClauseWhereDemandeRecondOfArticle(String anneeenreg, Integer numenreg, Integer numart, Integer precisart, String codebureau) {
	        String where = " AND manifAnneeEnregManif='" + anneeenreg + "' AND manifNumEnregManif=" + numenreg + " AND manifNumArtManif=" + numart + " AND manifPrecArtManif<>0" 
						   + " AND manifBurEnregManif='" + codebureau + "' ";
	        return where;
     }

	public String getSQLWhereRegistreDepotAConsulter(String codeConsignataire,
			String precision) {
		String whereManifesteArticle = "";
		whereManifesteArticle = getSQLWhereManifesteEnreg(codeConsignataire,
				ConstManif.IndPrecRechArticle);
		return (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
				: getSelectManifesteArticleRegistreDepot())
				+ whereManifesteArticle
				+ jointureManifesteArticleRegistreDepot
				+ " Order By AM.manifNumRepertoire ASC";
	}

	public String getClauseWhereManifComplementaire(String codeConsignataire,
			String precision) {
		String whereManifeste = "";
		whereManifeste = getSelectManifeste()
				+ getSQLWhereManifesteEnreg(codeConsignataire,
						ConstManif.IndPrecRechManifeste)
				+ " AND (SM.manifIndicateurPartiel = ''"
				+ " OR SM.manifIndicateurPartiel IS NULL)";
		return whereManifeste + " Order By SM.manifNumRep ASC";
	}

	public String getSQLManifesteEnregistre(String codeConsignataire,
			String precision) {
		return getSelectManifeste()
				+ getSQLWhereManifesteEnreg(codeConsignataire, precision);
	}

	public String getSQLWhereManifesteEnreg2(String precision) {
		String whereManifeste = " WHERE ";
		if (whereManifeste.toUpperCase().endsWith("WHERE ")) {
			whereManifeste += "manifAnneeEnregManif='" + getManifAnnee() + "'"
					+ " and " + "manifBureauEnregManif='" + getManifCodeBur()
					+ "'" + " and " + "manifNumEnregManif=" + getManifNumSeq();
		} else {
			whereManifeste += " and " + "manifAnneeEnregManif='"
					+ getManifAnnee() + "'" + " and "
					+ "manifBureauEnregManif='" + getManifCodeBur() + "'"
					+ " and " + "manifNumEnregManif=" + getManifNumSeq();
		}

		return (getSelectManifeste()).concat(whereManifeste);
	}

	public String getSQLArticleEnregAConsulter(String codeConsignataire,
			String precision) {
		String whereArticle = "";
		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateEnregManif >= '" + dateDebutEnreg
						+ "' and  SM.manifDateEnregManif <= '" + dateFinEnreg
						+ "' ";

			}else{
				whereArticle += " and  SM.manifDateEnregManif >= '"
						+ dateDebutEnreg + "' and  SM.manifDateEnregManif <= '"
						+ dateFinEnreg + "' ";
			}
		}

		if (getManifCodeBur() != null && !getManifCodeBur().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.MANIFBUREAUENGMANIF='" + getManifCodeBur()
						+ "'";
			}else{
				whereArticle += " and AM.manifBureauEngManif='"
						+ getManifCodeBur() + "'";
			}
		}
		if (getManifAnnee() != null && !getManifAnnee().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifAnneeEngManif='" + getManifAnnee()
						+ "'";
			}else{
				whereArticle += " and AM.manifAnneeEngManif='"
						+ getManifAnnee() + "'";
			}
		}
		if (getManifDateEnreg() != null
				&& !getManifDateEnreg().trim().equals("")) {

			Date dateEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateEnreg()).getTime());

			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateEnregManif='" + dateEnreg + "'";
			}else{
				whereArticle += " and SM.manifDateEnregManif='" + dateEnreg
						+ "'";
			}
		}

		if (getManifDateArrivee() != null
				&& !getManifDateArrivee().trim().equals("")) {
			Date dateArr = new Date(ConvertUtil.convertStringToDate(
					getManifDateArrivee()).getTime());
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateArrivee = '" + dateArr + "'";
			}else{
				whereArticle += " and SM.manifDateArrivee = '" + dateArr + "'";
			}
		}
		if (getManifNumSeq() != null && !getManifNumSeq().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumEnregManif=" + getManifNumSeq();
			}else{
				whereArticle += " and AM.manifNumEnregManif="
						+ getManifNumSeq();
			}
		}
		if (getArtLieuEmbarq() != null && !getArtLieuEmbarq().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifCodeLieuEmb='" + getArtLieuEmbarq()
						+ "'";
			}else{
				whereArticle += " and AM.manifCodeLieuEmb='"
						+ getArtLieuEmbarq() + "'";
			}
		}
		if (getNumArticle() != null && !getNumArticle().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumArticleManif=" + getNumArticle();
			}else{
				whereArticle += " and AM.manifNumArticleManif="
						+ getNumArticle();
			}
		}
		if (getArtPrecision1() != null && !getArtPrecision1().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif=" + getArtPrecision1();
			}else{
				whereArticle += " and AM.manifPrecisArtManif="
						+ getArtPrecision1();
			}
		}
		if (getArtPrecision2() != null && !getArtPrecision2().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}else{
				whereArticle += " and AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}
		}
		if (getManifTitreTransp() != null
				&& !getManifTitreTransp().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}else{
				whereArticle += " and AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}
		}
		return whereArticle;
	}

	public String getSQLArticleEnregAConsulter2(String precision) {
		String whereArticle = " WHERE ";
		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateEnregManif >= '" + dateDebutEnreg
						+ "' and  SM.manifDateEnregManif <= '" + dateFinEnreg
						+ "' ";

			}else{
				whereArticle += " and  SM.manifDateEnregManif >= '"
						+ dateDebutEnreg + "' and  SM.manifDateEnregManif <= '"
						+ dateFinEnreg + "' ";
			}
		}

		if (getManifCodeBur() != null && !getManifCodeBur().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifBureauEngManif='" + getManifCodeBur()
						+ "'";
			}else{
				whereArticle += " and AM.manifBureauEngManif='"
						+ getManifCodeBur() + "'";
			}
		}
		if (getManifAnnee() != null && !getManifAnnee().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifAnneeEngManif='" + getManifAnnee()
						+ "'";
			}else{
				whereArticle += " and AM.manifAnneeEngManif='"
						+ getManifAnnee() + "'";
			}
		}
		if (getManifDateEnreg() != null
				&& !getManifDateEnreg().trim().equals("")) {

			Date dateEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateEnreg()).getTime());

			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateEnregManif='" + dateEnreg + "'";
			}else{
				whereArticle += " and SM.manifDateEnregManif='" + dateEnreg
						+ "'";
			}
		}

		if (getManifDateArrivee() != null
				&& !getManifDateArrivee().trim().equals("")) {
			Date dateArr = new Date(ConvertUtil.convertStringToDate(
					getManifDateArrivee()).getTime());
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " SM.manifDateArrivee = '" + dateArr + "'";
			}else{
				whereArticle += " and SM.manifDateArrivee = '" + dateArr + "'";
			}
		}
		if (getManifNumSeq() != null && !getManifNumSeq().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumEnregManif=" + getManifNumSeq();
			}else{
				whereArticle += " and AM.manifNumEnregManif="
						+ getManifNumSeq();
			}
		}
		if (getArtLieuEmbarq() != null && !getArtLieuEmbarq().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifCodeLieuEmb='" + getArtLieuEmbarq()
						+ "'";
			}else{
				whereArticle += " and AM.manifCodeLieuEmb='"
						+ getArtLieuEmbarq() + "'";
			}
		}
		if (getNumArticle() != null && !getNumArticle().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumArticleManif=" + getNumArticle();
			}else{
				whereArticle += " and AM.manifNumArticleManif="
						+ getNumArticle();
			}
		}
		if (getArtPrecision1() != null && !getArtPrecision1().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif=" + getArtPrecision1();
			}else{
				whereArticle += " and AM.manifPrecisArtManif="
						+ getArtPrecision1();
			}
		}
		if (getArtPrecision2() != null && !getArtPrecision2().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}else{
				whereArticle += " and AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}
		}
		if (getManifTitreTransp() != null
				&& !getManifTitreTransp().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}else{
				whereArticle += " and AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}
		}
		return whereArticle;
	}

	public String getSQLWhereManifesteEnreg(String codeConsignataire,
			String precision) {
		String whereManifeste = " WHERE ";
		String whereArticle = " ";
		if (codeConsignataire != null && !codeConsignataire.trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifCodeConsignataire='"
						+ codeConsignataire + "'";
			}
		}
		if (getManifNumRep() != null && !getManifNumRep().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifNumRep LIKE '" + getManifNumRep()
						+ "%'";
			}else{
				whereManifeste += " and SM.manifNumRep LIKE '"
						+ getManifNumRep() + "%'";
			}
		}
		if (getManifAnnee() != null && !getManifAnnee().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifAnneeEnregManif='"
						+ getManifAnnee() + "'";
			}else{
				whereManifeste += " and SM.manifAnneeEnregManif='"
						+ getManifAnnee() + "'";
			}
		}
		if (getManifBurEnregManif() != null
				&& !getManifBurEnregManif().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifBureauEnregManif='"
						+ getManifBurEnregManif() + "'";
			}else{
				whereManifeste += " and SM.manifBureauEnregManif='"
						+ getManifBurEnregManif() + "'";
			}
		}
		if (getManifTypeManifeste() != null
				&& !getManifTypeManifeste().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifTypeManifeste="
						+ getManifTypeManifeste();
			}else{
				whereManifeste += " and SM.manifTypeManifeste="
						+ getManifTypeManifeste();
			}
		}
		if (getManifDateArrivee() != null
				&& !getManifDateArrivee().trim().equals("")) {
			Date dateArrDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateArrivee()).getTime());
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifDateArrivee = '" + dateArrDebut
						+ "'";
			}else{
				whereManifeste += " and SM.manifDateArrivee = '" + dateArrDebut
						+ "'";
			}
		}

		if (getManifDateEnreg() != null
				&& !getManifDateEnreg().trim().equals("")) {
			Date dateEnregDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateEnreg()).getTime());
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifDateEnregManif = '"
						+ dateEnregDebut + "' ";
			}else{
				whereManifeste += " and SM.manifDateEnregManif = '"
						+ dateEnregDebut + "' ";
			}
		}

		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinEnreg = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifDateEnregManif >= '"
						+ dateDebutEnreg + "' and  SM.manifDateEnregManif <= '"
						+ dateFinEnreg + "' ";

			}else{
				whereManifeste += " and  SM.manifDateEnregManif >= '"
						+ dateDebutEnreg + "' and  SM.manifDateEnregManif <= '"
						+ dateFinEnreg + "' ";
			}
		}

		if (getManifCodeBur() != null && !getManifCodeBur().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifBureauEnregManif='"
						+ getManifCodeBur() + "'";
			}else{
				whereManifeste += " and SM.manifBureauEnregManif='"
						+ getManifCodeBur() + "'";
			}
		}
		if (getManifNumSeq() != null && !getManifNumSeq().trim().equals("")) {
			if (whereManifeste.toUpperCase().endsWith("WHERE ")){
				whereManifeste += " SM.manifNumEnregManif=" + getManifNumSeq();
			}else{
				whereManifeste += " and SM.manifNumEnregManif="
						+ getManifNumSeq();
			}

		}
		if (getManifNumVolVoy() != null
				&& !getManifNumVolVoy().trim().equals("")) {
				whereManifeste += " SM.manifNumVolVoyage='"
						+ getManifNumVolVoy() + "'";

		}

		if (getArtLieuEmbarq() != null && !getArtLieuEmbarq().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifCodeLieuEmb='" + getArtLieuEmbarq()
						+ "'";
			}else{
				whereArticle += " and AM.manifCodeLieuEmb='"
						+ getArtLieuEmbarq() + "'";
			}
		}
		if (getNumArticle() != null && !getNumArticle().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumArticleManif=" + getNumArticle();
			}else{
				whereArticle += " and AM.manifNumArticleManif="
						+ getNumArticle();
			}
		}
		if (getArtPrecision1() != null && !getArtPrecision1().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif=" + getArtPrecision1();
			}else{
				whereArticle += " and AM.manifPrecisArtManif="
						+ getArtPrecision1();
			}
		}
		if (getArtPrecision2() != null && !getArtPrecision2().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}else{
				whereArticle += " and AM.manifPrecisArtManif2="
						+ getArtPrecision2();
			}
		}
		if (getManifTitreTransp() != null
				&& !getManifTitreTransp().trim().equals("")) {
			if (whereArticle.toUpperCase().endsWith("WHERE ")){
				whereArticle += " AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}else{
				whereArticle += " and AM.manifNumTitreTransp LIKE '%"
						+ getManifTitreTransp() + "%'";
			}
		}
		if (precision.equals(ConstManif.IndPrecRechManifeste)) {
			return whereManifeste;
		} else {
			return whereManifeste + whereArticle;
		}
	}

	public String getSQLWhereManifEnregDemande(String codeConsignataire,
			String precision, String constDemande) {
		String whereManifestearticle = "";
		whereManifestearticle = getSQLWhereManifesteEnreg(codeConsignataire,
				ConstManif.IndPrecRechArticle)
				+ " and (SM.manifIndicateurPartiel IS NULL"
				+ " OR (SM.manifIndicateurPartiel <> '"
				+ ConstManif.INDPARTIELMANIFCOMPLEM
				+ "'"
				+ " and SM.manifIndicateurPartiel <> '"
				+ ConstManif.INDPARTIELMANIFCOMPLFERME
				+ "'))"
				+ " and (AM.manifTypeTraitement IS NULL "
				+ "and AM.manifEtatArtManif IS NULL)";
		return (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
				: getSelectManifesteArticle())
				+ whereManifestearticle
				+ jointureManifesteArticle
				+ " Order By SM.manifNumRep ASC";
	}

	public String getConstDemande(String ctxmenu) {
		if (ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEMISEENDEPOT)
				|| ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDEMISEENDEPOT)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERREGISTREDEPOT)
				|| ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDEDEPOT)){
			return ConstManif.TYPETRAITEMENTDDEMISEENDEPOT;
		}else if (ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDERECTIF)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDERECTIF)
				|| ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDERECTIF)){
			return ConstManif.TYPETRAITEMENTDDERECTIF;
		}else if (ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDERECOND)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDERECOND)
				|| ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDERECOND)){
			return ConstManif.TYPETRAITEMENTDDERECOND;
		}else if (ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDEDEST)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEDEST)
				|| ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDEDEST)){
			return ConstManif.TYPETRAITEMENTDDEDEST;
		}else if (ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDEREGUL)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEREGUL)
				|| ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDEREGUL)){
			return ConstManif.TYPETRAITEMENTDDEREGUL;
		}
		return "";

	}

	public static String getClauseWhereArticleDemande(String ctxmenu,
			String typetraitement, String annee, String numRep,
			String codeConsign) {
		String where = " from ArticleManifeste where manifAnneeEngManif='"
				+ annee + "' AND manifCodeConsign='" + codeConsign
				+ "' AND manifNumRepertoire='" + numRep + "'";
		if (ctxmenu != null
				&& (ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDEDEST)
						|| ctxmenu
								.equals(ConstManif.CTXMENUSAISIEDEMANDEMISEENDEPOT)
						|| ctxmenu.equals(ConstManif.CTXMENUSAISIEDEMANDEREGUL) || ctxmenu
							.equals(ConstManif.CTXMENUSAISIEDEMANDERECTIF))) {
			return where
					+ " AND manifTypeTraitement IS NULL AND manifEtatArtManif IS NULL";
		} else if (ctxmenu != null
				&& (ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEDEST)
						|| ctxmenu
								.equals(ConstManif.CTXMENUCONSULTERDEMANDEMISEENDEPOT)
						|| ctxmenu
								.equals(ConstManif.CTXMENUCONSULTERDEMANDEREGUL) || ctxmenu
							.equals(ConstManif.CTXMENUCONSULTERDEMANDERECTIF))) {
			return where
					+ " AND (manifTypeTraitement ='D' OR manifTypeTraitement ='E') AND manifEtatArtManif ='"
					+ typetraitement + "'";
		} else if (ctxmenu != null
				&& (ctxmenu.equals(ConstManif.CTXMENUMODIFIERDEMANDEDEPOT)
						|| ctxmenu
								.equals(ConstManif.CTXMENUMODIFIERDEMANDERECTIF)
						|| ctxmenu
								.equals(ConstManif.CTXMENUMODIFIERDEMANDEDEST) || ctxmenu
							.equals(ConstManif.CTXMENUMODIFIERDEMANDEREGUL))) {
			return where
					+ " AND manifTypeTraitement ='D' AND manifEtatArtManif ='"
					+ typetraitement + "'";
		}
		return where;
	}

	public String getSQLWhereDemandeAConsulter2(String codeConsignataire,
			String precision, String constDemande) {
		//
		String whereManifestearticle = "";
		//
		whereManifestearticle = getSQLWhereManifesteEnreg(codeConsignataire,
				ConstManif.IndPrecRechArticle)
				+ " AND (AM.manifTypeTraitement = 'D'"
				+ " AND AM.manifEtatArtManif = '" + constDemande + "')";
		String string = null;
		if (constDemande.equals(ConstManif.TYPETRAITEMENTDDERECOND)) {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleRecond_2()
					+ whereManifestearticle + jointureManifesteArticleRecond
					: getSelectManifesteArticleRecondDistinct()
							+ whereManifestearticle
							+ jointureManifesteArticleRecond);
					

		} else {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
					: getSelectManifesteArticle())
					+ whereManifestearticle
					+ jointureManifesteArticle
					+ " ORDER BY SM.manifNumRep ASC";
		}
		//
		return string;
	}

	public String getSQLWhereDemandeAConsulter(String codeConsignataire,
			String precision, String constDemande, String ctxmenu) {
		//
		String whereManifestearticle = "";
		//
		if ((ctxmenu != null)
				&& (ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEDEST)
				|| ctxmenu
						.equals(ConstManif.CTXMENUCONSULTERDEMANDEMISEENDEPOT)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEREGUL)
				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDERECTIF))) {
			whereManifestearticle = getSQLWhereManifesteEnreg(
					codeConsignataire, ConstManif.IndPrecRechArticle)
					+ " AND (AM.manifTypeTraitement = 'D'"
					+ " OR AM.manifTypeTraitement = 'E')  AND AM.manifEtatArtManif = '"
					+ constDemande + "'";
		} else {
			whereManifestearticle = getSQLWhereManifesteEnreg(
					codeConsignataire, ConstManif.IndPrecRechArticle)
					+ " AND (AM.manifTypeTraitement = 'D'"
					+ " AND AM.manifEtatArtManif = '" + constDemande + "')";
		}
		String string = null;
		if ((constDemande != null)&&(constDemande.equals(ConstManif.TYPETRAITEMENTDDERECOND))) {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleRecond_2()
					+ whereManifestearticle + jointureManifesteArticleRecond
					: getSelectManifesteArticleRecond() + whereManifestearticle
							+ jointureManifesteArticleRecond)
					+ " ORDER BY SM.manifNumRep ASC";

		} else if ((constDemande != null)&&(constDemande.equals(ConstManif.TYPETRAITEMENTDDEREGUL))) {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
					: getSelectManifesteArticle())
					+ whereManifestearticle
					+ jointureManifesteArticle
					+ " and (SM.manifTypeManifeste <> 2 "
					+ " and SM.manifTypeManifeste <> 5)"
					+ " ORDER BY SM.manifNumRep ASC";

		} else {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
					: getSelectManifesteArticle())
					+ whereManifestearticle
					+ jointureManifesteArticle
					+ " ORDER BY SM.manifNumRep ASC";
		}
		
		return string;
	}

	public String getSQLWhereDemandePourConsultation(String codeConsignataire,
			String precision, String constDemande, String ctxmenu) {
		
		String whereManifestearticle = "";
		
//		if ((ctxmenu != null)
//				&& (ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEDEST)
//				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEMISEENDEPOT)
//				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDEREGUL)
//				|| ctxmenu.equals(ConstManif.CTXMENUCONSULTERDEMANDERECTIF))) {
//			whereManifestearticle = getSQLWhereManifesteEnreg(
//					codeConsignataire, ConstManif.IndPrecRechArticle)
//					+ " AND AM.manifEtatArtManif = '" + constDemande + "'";
//		} else {
			whereManifestearticle = getSQLWhereManifesteEnreg(
					codeConsignataire, ConstManif.IndPrecRechArticle)
					+ " AND AM.manifEtatArtManif = '" + constDemande + "'";
//		}
		String string = null;
		if ((constDemande != null)&&(constDemande.equals(ConstManif.TYPETRAITEMENTDDERECOND))) {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleRecond_2()
					+ whereManifestearticle + jointureManifesteArticleRecond
					: getSelectManifesteArticleRecond() + whereManifestearticle
							+ jointureManifesteArticleRecond);
					

		} else if ((constDemande != null)&&(constDemande.equals(ConstManif.TYPETRAITEMENTDDEREGUL))) {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
					: getSelectManifesteArticle())
					+ whereManifestearticle
					+ jointureManifesteArticle
					+ " and (SM.manifTypeManifeste = 2 "
					+ " OR SM.manifTypeManifeste = 5)"
					+ " ORDER BY SM.manifNumRep ASC";

		} else {
			string = (precision.equals(ConstManif.IndPrecRechManifeste) ? getSelectManifesteArticleDistinct()
					: getSelectManifesteArticle())
					+ whereManifestearticle
					+ jointureManifesteArticle
					+ " ORDER BY SM.manifNumRep ASC";
		}
		
		return string;
	}

	public String getSQLManifesteAEnregistrer(String codeConsignataire,
			String precision) {
	
		String whereManifeste = " WHERE ";
		String whereArticle = " ";
		whereManifeste += " " +"m.manifCodeConsignataire = '"
				+ codeConsignataire + "'";
		if (getManifNumRep() != null && !getManifNumRep().trim().equals("")){
			whereManifeste += " and "
					+ "m.manifNumRepertoire LIKE '"
					+ getManifNumRep() + "%'";
		}
		if (getManifAnnee() != null && !getManifAnnee().trim().equals("")){
			whereManifeste += " and " 
					+ "m.manifAnneeEnreg = '" + getManifAnnee()
					+ "'";
		}
		if (getManifBurEnregManif() != null
				&& !getManifBurEnregManif().trim().equals("")){
			whereManifeste += " and "
					+ "m.manifBurEnreg='"
					+ getManifBurEnregManif() + "'";
		}
		if (getManifTypeManifeste() != null
				&& !getManifTypeManifeste().trim().equals("")){
			whereManifeste += " and "
					+ "m.manifTypeManifeste="
					+ getManifTypeManifeste();
		}
		if (getManifDateArrivee() != null
				&& !getManifDateArrivee().trim().equals("")) {
			Date dateArrDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateArrivee()).getTime());
			whereManifeste += " and " 
					+ "m.manifDateArrivee = '" + dateArrDebut
					+ "'";
		}
		if (getManifDateEnreg() != null
				&& !getManifDateEnreg().trim().equals("")) {
			Date dateEnregDebut = new Date(ConvertUtil.convertStringToDate(
					getManifDateEnreg()).getTime());
			whereManifeste += " and  " 
					+ "m.manifDateCreation = '"
					+ dateEnregDebut + "' ";
		}
		if (getManifNumVolVoy() != null
				&& !getManifNumVolVoy().trim().equals("")) {
			whereManifeste += " and " 
					+ "m.manifNumVoyage='"
					+ getManifNumVolVoy() + "'";
		}

		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutCreation = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinCreation = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());

			whereManifeste += " and  "
					+ "m.manifDateCreation >= '"
					+ dateDebutCreation + "' and  "
					+ "m.manifDateCreation <= '"
					+ dateFinCreation + "'";
		}

		whereManifeste += " AND ("
				+ "m.manifIndPartiel IS NULL ";

		whereManifeste += " or " 
				+ "m.manifIndPartiel = '"
				+ ConstManif.INDPARTIELMANIFCOMPLFERME + "' ";

		whereManifeste += " or "
				+ "m.manifIndPartiel = '"
				+ ConstManif.IndEnregPartiel + "' ";

		whereManifeste += " or "
				+ "m.manifIndPartiel = '')";

		if (getArtLieuEmbarq() != null && !getArtLieuEmbarq().trim().equals("")) {
			whereArticle += " and "
					+ "a.manifCodeLieuEmbarq='"
					+ getArtLieuEmbarq() + "'";
		}
		if (getNumArticle() != null && !getNumArticle().trim().equals("")) {
			whereArticle += " and "
					+ "a.manifNumArt=" + getNumArticle();
		}
		if (getArtPrecision1() != null && !getArtPrecision1().trim().equals("")) {
			whereArticle += " and "
					+ "a.manifPrecArtManif=" + getArtPrecision1();
		}
		if (getManifTitreTransp() != null
				&& !getManifTitreTransp().trim().equals("")) {
			whereArticle += " and "
					+ "a.manifNumTitreTransport='"
					+ getManifTitreTransp() + "'";
		}
		if (precision.equals(ConstManif.IndPrecRechManifeste)) {
			return getSelectBrouillonManifeste() + whereManifeste
					+ " ORDER By "
					+ "m.manifNumRepertoire ASC";
		} else {
			return getSelectBrouillonManifesteArticle()
					+ jointureManifesteBrouillonArticleBrouillon
					+ whereManifeste + whereArticle + " ORDER By "
					+ "m.manifNumRepertoire ASC";
		}		
	}
	
	
	public String getSQLArticleFractionnee() throws TwreException {

		
		if (!sysEnv.compare(this.manifCodeBur, ConstManif.BureauAerien)){
			throw new TwreException(ConstErrCod.BureauAerienIsRequired);
		}
		if (!isNullOrEmpty(this.manifTitreTransp)){
			wherearticle += " and art.manifNumTitreTransp='"
					+ this.manifTitreTransp + "'";
		}
		if (!isNullOrEmpty(this.manifNumRep)){
			wherearticle += " and art.manifNumRepertoire = '"
					+ this.manifNumRep + "'";
		}
		if (!isNullOrEmpty(this.manifAnnee)){
			wherearticle += " and art.manifAnneeEngManif='" + this.manifAnnee
					+ "'";
		}
		if (!isNullOrEmpty(this.manifCodeBur)){
			wherearticle += " and art.manifBureauEngManif='"
					+ this.manifCodeBur + "'";
		}
		if (!isNullOrEmpty(this.manifNumSeq)){
			wherearticle += " and art.manifNumEnregManif=" + this.manifNumSeq;
		}
		if (!isNullOrEmpty(this.artLieuEmbarq)){
			wherearticle += " and art.manifCodeLieuEmb='" + this.artLieuEmbarq
					+ "'";
		}
		if (!isNullOrEmpty(this.manifNumVolVoy)){
			wherearticle += " and sg.manifNumVolVoyage='"
					+ this.manifNumVolVoy + "'";
		}
		if (!isNullOrEmpty(this.numArticle)){
			wherearticle += " and art.manifNumArticleManif=" + this.numArticle;
		}
		if (!isNullOrEmpty(this.artPrecision1)){
			wherearticle += " and art.manifPrecisArtManif="
					+ this.artPrecision1;
		}
		if (!isNullOrEmpty(this.artPrecision2)){
			wherearticle += " and art.manifPrecisArtManif2="
					+ getArtPrecision2();
		}
		if (getManifDateDebut() != null
				&& !getManifDateDebut().trim().equals("")
				&& getManifDateFin() != null
				&& !getManifDateFin().trim().equals("")) {
			Date dateDebutEmb = new Date(ConvertUtil.convertStringToDate(
					getManifDateDebut()).getTime());
			Date dateFinEmb = new Date(ConvertUtil.convertStringToDate(
					getManifDateFin()).getTime());

			wherearticle += " and art.manifDateEmb >= '" + dateDebutEmb
					+ "' and art.manifDateEmb <= '" + dateFinEmb + "' ";
		}
		return wherearticle + " and art.manifEnvoiFract='"
				+ ConstManif.ENVOIEFRANCTIONNEOUIVALUE + "'";
	}
	
	/**
	 * 
	 * @param string
	 * @return
	 */
	private boolean isNullOrEmpty(String string) {
		boolean isNulOrEmpty = false;
		if (string == null) {
			isNulOrEmpty = true;
		} else if (string.trim().length() <= 0) {
			isNulOrEmpty = true;
		}
		return isNulOrEmpty;
	}
	
	public String getManifNumSeq() {
		return manifNumSeq;
	}

	public void setManifNumSeq(String manifNumSeq) {
		this.manifNumSeq = manifNumSeq;
	}

	public String getManifAnnee() {
		return manifAnnee;
	}

	public void setManifAnnee(String manifAnnee) {
		this.manifAnnee = manifAnnee;
	}

	public String getManifCodeBur() {
		return manifCodeBur;
	}

	public void setManifCodeBur(String manifCodeBur) {
		this.manifCodeBur = manifCodeBur;
	}

	public String getManifNumRep() {
		return manifNumRep;
	}

	public void setManifNumRep(String manifNumRep) {
		this.manifNumRep = manifNumRep;
	}

	public String getManifBurEnregManif() {
		return manifBurEnregManif;
	}

	public void setManifBurEnregManif(String manifBurEnregManif) {
		this.manifBurEnregManif = manifBurEnregManif;
	}

	public String getManifTypeManifeste() {
		return manifTypeManifeste;
	}

	public void setManifTypeManifeste(String manifTypeManifeste) {
		this.manifTypeManifeste = manifTypeManifeste;
	}

	public String getManifDateArrivee() {
		return manifDateArrivee;
	}

	public void setManifDateArrivee(String manifDateArrivee) {
		this.manifDateArrivee = manifDateArrivee;
	}

	public String getManifDateEnreg() {
		return manifDateEnreg;
	}

	public void setManifDateEnreg(String manifDateEnreg) {
		this.manifDateEnreg = manifDateEnreg;
	}

	public String getManifTitreTransp() {
		return manifTitreTransp;
	}

	public void setManifTitreTransp(String manifTitreTransp) {
		this.manifTitreTransp = manifTitreTransp;
	}

	public String getManifNumVolVoy() {
		return manifNumVolVoy;
	}

	public void setManifNumVolVoy(String manifNumVolVoy) {
		this.manifNumVolVoy = manifNumVolVoy;
	}

	public String getArtLieuEmbarq() {
		return artLieuEmbarq;
	}

	public void setArtLieuEmbarq(String artLieuEmbarq) {
		this.artLieuEmbarq = artLieuEmbarq;
	}

	public String getNumArticle() {
		return numArticle;
	}

	public void setNumArticle(String numArticle) {
		this.numArticle = numArticle;
	}

	public String getArtPrecision1() {
		return artPrecision1;
	}

	public void setArtPrecision1(String artPrecision1) {
		this.artPrecision1 = artPrecision1;
	}

	public String getArtPrecision2() {
		return artPrecision2;
	}

	public void setArtPrecision2(String artPrecision2) {
		this.artPrecision2 = artPrecision2;
	}

	public String getManifDateDebut() {
		return manifDateDebut;
	}

	public void setManifDateDebut(String manifDateDebut) {
		this.manifDateDebut = manifDateDebut;
	}

	public String getManifDateFin() {
		return manifDateFin;
	}

	public void setManifDateFin(String manifDateFin) {
		this.manifDateFin = manifDateFin;
	}

	public String getSelectBrouillonManifeste() {
		return selectBrouillonManifeste;
	}

	public void setSelectBrouillonManifeste(String selectBrouillonManifeste) {
		this.selectBrouillonManifeste = selectBrouillonManifeste;
	}

	public String getSelectBrouillonManifesteArticle() {
		return selectBrouillonManifesteArticle;
	}

	public void setSelectBrouillonManifesteArticle(
			String selectBrouillonManifesteArticle) {
		this.selectBrouillonManifesteArticle = selectBrouillonManifesteArticle;
	}

	public String getSelectManifeste() {
		return selectManifeste;
	}

	public void setSelectManifeste(String selectManifeste) {
		this.selectManifeste = selectManifeste;
	}

	public String getSQLArticleEnregConsultation(String precision) {
		return getSelectArticleManifeste()
				+ getSQLArticleEnregAConsulter2(precision)
				+ getJointureArticleManifesteSegmentManifeste()
				+ getGroupByManif()+getOrderByManif();
	}

	public String getSelectArticleManifeste() {
		return selectArticleManifeste;
	}

	public void setSelectArticleManifeste(String selectArticleManifeste) {
		this.selectArticleManifeste = selectArticleManifeste;
	}

	public String getJointureManifesteBrouillonArticleBrouillon() {
		return jointureManifesteBrouillonArticleBrouillon;
	}

	public void setJointureManifesteBrouillonArticleBrouillon(
			String jointureManifesteBrouillonArticleBrouillon) {
		this.jointureManifesteBrouillonArticleBrouillon = jointureManifesteBrouillonArticleBrouillon;
	}

	public String getJointureArticleManifesteSegmentManifeste() {
		return jointureArticleManifesteSegmentManifeste;
	}

	public void setJointureArticleManifesteSegmentManifeste(
			String jointureArticleManifesteSegmentManifeste) {
		this.jointureArticleManifesteSegmentManifeste = jointureArticleManifesteSegmentManifeste;
	}

	public String getOrderByManif() {
		return orderByManif;
	}

	public void setOrderByManif(String orderByManif) {
		this.orderByManif = orderByManif;
	}

	public String getGroupByManif() {
		return groupByManif;
	}

	public void setGroupByManif(String groupByManif) {
		this.groupByManif = groupByManif;
	}

	public String getSelectManifesteArticleDistinct() {
		return selectManifesteArticleDistinct;
	}

	public void setSelectManifesteArticleDistinct(
			String selectManifesteArticleDistinct) {
		this.selectManifesteArticleDistinct = selectManifesteArticleDistinct;
	}

	public String getSelectManifesteArticle() {
		return selectManifesteArticle;
	}

	public void setSelectManifesteArticle(String selectManifesteArticle) {
		this.selectManifesteArticle = selectManifesteArticle;
	}

	public String getSelectManifesteArticleRegistreDepot() {
		return selectManifesteArticleRegistreDepot;
	}

	public void setSelectManifesteArticleRegistreDepot(
			String selectManifesteArticleRegistreDepot) {
		this.selectManifesteArticleRegistreDepot = selectManifesteArticleRegistreDepot;
	}

	public String getSelectManifesteArticleRecond_2() {
		return selectManifesteArticleRecond_2;
	}

	public void setSelectManifesteArticleRecond_2(
			String selectManifesteArticleRecond2) {
		this.selectManifesteArticleRecond_2 = selectManifesteArticleRecond2;
	}

	public String getSelectManifesteArticleRecondDistinct() {
		return selectManifesteArticleRecondDistinct;
	}

	public void setSelectManifesteArticleRecondDistinct(
			String selectManifesteArticleRecondDistinct) {
		this.selectManifesteArticleRecondDistinct = selectManifesteArticleRecondDistinct;
	}

	public String getSelectManifesteArticleRecond() {
		return selectManifesteArticleRecond;
	}

	public void setSelectManifesteArticleRecond(
			String selectManifesteArticleRecond) {
		this.selectManifesteArticleRecond = selectManifesteArticleRecond;
	}

}
