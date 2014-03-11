package sn.com.douane.utils;

import java.io.Serializable;

public class CritereRechercheDepDouane implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par défaut
	 */
	private CritereRechercheDepDouane() {
		super();
	}

	/**
	 * isNullOrEmpty
	 */
	private static boolean isNullOrEmpty(String string) {
		//
		boolean isNulOrEmpty = false;
		//
		if (string == null) {
			isNulOrEmpty = true;
		} else if (string.length() <= 0) {
			isNulOrEmpty = true;
		}
		//
		return isNulOrEmpty;
	}

	/**
	 * getClauseWhereForRechercheDep
	 */
	public static String getSqlWhereForRechercheDepDes(String annee,
			String bureau, String numero, String circuit, String ppm,
			String context) {
		//
		String string = "SELECT E FROM EncoursDeclaration  E WHERE 1 = 1 ";
		//
		if (!isNullOrEmpty(annee)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "DECANNEEENREGDEC = '" + annee + "' ";
//			} else {
				string += "AND DECANNEEENREGDEC = '" + annee + "' ";
//			}
		}
		if (!isNullOrEmpty(bureau)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "DECBURENREGDEC = '" + bureau + "' ";
//			} else {
				string += "AND DECBURENREGDEC = '" + bureau + "' ";
//			}
		}
		if (!isNullOrEmpty(numero)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "DECNUMDECLARATION = " + numero + " ";
//			} else {
				string += "AND DECNUMDECLARATION = " + numero + " ";
//			}
		}
		if (!isNullOrEmpty(circuit)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "DECCIRCUITVISITE = '" + circuit + "' ";
//			} else {
				string += "AND DECCIRCUITVISITE = '" + circuit + "' ";
//			}
		}
		if (!isNullOrEmpty(ppm)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "DECCODEPPMDEC = '" + ppm + "' ";
//			} else {
				string += "AND DECCODEPPMDEC = '" + ppm + "' ";
//			}
		}
		if (!isNullOrEmpty(context)) {
			if (context.equals(ConstManif.CTXMENUTRAITDES)) {
//				if (string.toUpperCase().endsWith("WHERE ")) {
//					string += "DECMODEDECLARATION = 'DES' ";
//				} else {
					string += "AND DECMODEDECLARATION = 'DES' ";
//				}
			}else
				if (context.equals(ConstManif.CTXMENUDEP) || context.equals(ConstManif.CTXMENUDEPNONTAXABLE) || context.equals(ConstManif.CTXMENUDEPTAXABLE)) {
//					if (string.toUpperCase().endsWith("WHERE ")) {
//						string += "DECMODEDECLARATION = 'DEP' ";
//					} else {
						string += "AND DECMODEDECLARATION = 'DEP' ";
//					}
				}
		}
//		log.info("req="+string);
		//
		return string;
	}

	/**
	 * getClauseWhereForRechercheDep
	 */
	public static String getSqlWhereForRechercheRegulExo(String annee,
			String codeBureau, String numero, String circuit, String ppm) {
				
		String string ="SELECT  RX.decAnneeDeclaration,RX.decBurEnregDecl," +
				"RX.decNumDeclaration,RX.decCodeVerificateur," +
				"RX.decDateDeclaration,RX.decDateEcheance," +
				"RX.decIndicVisite,SUM(RX.decMontSuspendu) AS DECMONTSUSPENDU," +
				"RX.decPpmDeclarant FROM RegularisationExo  AS RX,  SegArtDec AS SAD,  SegGenDec AS SEG,Regime AS REG WHERE " +
				"SAD.decAnneeEnregDec = RX.decAnneeDeclaration AND " +
				"SAD.decBurEnregDec = RX.decBurEnregDecl AND " +
				"SAD.decNumDeclaration = RX.decNumDeclaration AND " +
				"SAD.decNumArtDec = RX.decNumArtDecl AND " +
				"SEG.decAnneeEnregDec = SAD.decAnneeEnregDec AND " +
				"SEG.decBurEnregDec = SAD.decBurEnregDec AND " +
				"SEG.decNumDeclaration = SAD.decNumDeclaration AND " +
				"REG.rcTypeRegime=SEG.decTypeRegime  AND " +
				"REG.rcCodeRegimeDouanier=SEG.decRegDouanier  AND " +
				"REG.rcCodeRegimeFiscal=SAD.decRegFiscal  AND " +
				"REG.rcIndicateurSusp='"+ConstDeclaration.IndicateurRegSuspTot+"' AND REG.rcIndicateurExo='0' " ;
		//
		if (!isNullOrEmpty(annee)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "RX.DECANNEEDECLARATION = '"
//						+ annee + "' ";
//			} else {
				string += "AND RX.decAnneeDeclaration= '"+ annee + "' ";
//			}
		}
		if (!isNullOrEmpty(numero)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "RX.DECNUMDECLARATION = "
//						+ numero + " ";
//			} else {
				string += "AND RX.decNumDeclaration = "
						+ numero + " ";
//			}
		}
		if (!isNullOrEmpty(ppm)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += "RX.DECPPMDECLARANT = '"
//						+ ppm + "' ";
//			} else {
				string += "AND RX.decPpmDeclarant = '"
						+ ppm + "' ";
//			}
		}
		if (!isNullOrEmpty(circuit)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += ""+ConstRC.SHEMABD+"SEGGENDEC.DECCIRCUITVISITE = '"
//						+ circuit + "' ";
//			} else {
				string += "AND RX.decIndicVisite = '"
						+ circuit + "' ";
//			}
		}
		if (!isNullOrEmpty(codeBureau)) {
//			if (string.toUpperCase().endsWith("WHERE ")) {
//				string += ""+ConstRC.SHEMABD+"SEGGENDEC.DECBURENREGDEC = '"
//						+ codeBureau + "' ";
//			} else {
				string += "AND RX.decBurEnregDecl = '"
						+ codeBureau + "' ";
//			}
		}
		string += "GROUP BY  RX.decAnneeDeclaration,RX.decBurEnregDecl,RX.decNumDeclaration,RX.decCodeVerificateur,RX.decDateDeclaration,RX.decDateEcheance,RX.decIndicVisite,RX.decPpmDeclarant ";
		//
		return string;
	}

	/**
	 * getSqlWhereForRechercheRegulVal
	 */
	public static String getSqlWhereForRechercheRegulVal(String annee,
			String verificateur, String numero, String circuit, String ppm) {
		//

		String string = "SELECT REG FROM RegularisationValeur AS REG, " +
				"SegArtDec AS SAD,SegGenDec AS SEG  WHERE  " +
				"SAD.decAnneeEnregDec = REG.decAnneeEnregDecl AND " +
				"SAD.decBurEnregDec = REG.decBurEnregDecl AND " +
				"SAD.decNumDeclaration = REG.decNumDeclaration AND " +
				"SAD.decNumArtDec = REG.decNumArtDecl AND " +
				"SEG.decAnneeEnregDec = SAD.decAnneeEnregDec AND " +
				"SEG.decBurEnregDec = SAD.decBurEnregDec AND " +
				"SEG.decNumDeclaration = SAD.decNumDeclaration  " ;
		//
		if (!isNullOrEmpty(annee)) {
				string += "AND REG.decAnneeEnregDecl = '"
						+ annee + "' ";
		}
		if (!isNullOrEmpty(numero)) {
				string += "AND REG.decNumDeclaration = "
						+ numero + " ";
		}
		if (!isNullOrEmpty(ppm)) {
			string += "AND REG.decPpmDeclarant = '"
						+ ppm + "' ";
		}
		if (!isNullOrEmpty(circuit)) {
				string += "AND SEG.decCircuitVisite = '"
						+ circuit + "' ";
		}
		if (!isNullOrEmpty(verificateur)) {
				string += "AND REG.decCodeVerificateur = '"
						+ verificateur + "' ";
		}
		//
		return string;
	}
}
