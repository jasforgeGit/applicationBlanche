package sn.com.douane.utils.recevabilite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * @author thouraya
 * 
 */

public class recevabilite {

	private transient final static Log log = LogFactory
			.getLog(recevabilite.class);

	/*
	 * on creer une jsp et dans l'action on forward vers cette page jsp
	 * 
	 * et on appel cette classe sn.com.douane.ejb.rc.utils.recevabilite.
	 */
	/*
	 * par convention si dans la requette il ya des valeurs numeriques comme par
	 * exp 1=1 ou codemanifeste='2' on les met tous au debut de la requete
	 */
	/*
	 * NB:ces paramettres doivent etres stocker tous au debut dans la classe des
	 * constantes pour tous les zones textes pour une page jsp donnee parceque
	 * si on veut ajoute une regle on ajout un paramettre existant pour un
	 * champs existant des le debut donc si au future un on ajout un champs dans
	 * la page et on veut lui correspond un traitement on entre dans .java et on
	 * ajout dans le hashtable le paramettre(apres qu'on l'ajout dans la classe
	 * des constRecevabilite) et le champs fb pour sa valeur parce que dans tous
	 * les cas vous etes oblige de declarer dans le FB.java le champs
	 */
	public static String remplacerRequete(String sql, Map<String, Object> ht) {		
		for (Iterator it = ht.entrySet().iterator(); it.hasNext();) {
			   Map.Entry entry = (Map.Entry) it.next();
			   String enumCle = (String) entry.getKey();
			   sql = sql.replaceAll(enumCle, "" + entry.getValue());
		}		
		return sql;
	}

	private static List<String> split(String chaine, String separator) {
		List<String> vector = new ArrayList<String>();
		int nbreSeperat = 0;
		while (chaine.indexOf(separator) != -1 || nbreSeperat != 0) {
			if (chaine.indexOf(separator) != -1) {
				nbreSeperat++;
				// System.out.println(chaine.substring(0,chaine.indexOf(separator))+"-----");
				vector.add(chaine.substring(0, chaine.indexOf(separator)));
			} else {
				nbreSeperat = 0;
				vector.add(chaine.substring(0, chaine.length()));
			}
			chaine = chaine.substring(
					chaine.indexOf(separator) + separator.length(),
					chaine.length());
		}

		return vector;
	}

	public static boolean valueOfCondition(String value, Map<String, Object> ht) {
		boolean res = false;
		int k = 0, j = 0, i = 0;
		List<String> ousplit = split(value.toUpperCase(), "_OR");
		List<String> etsplit = split(value.toUpperCase(), "_AND");
		List<String> etsplitTab = new ArrayList<String>();
		List<String> egalsplit = new ArrayList<String>();
		List<String> diffsplit = new ArrayList<String>();

		boolean isou = false;

		for (i = 0; i < (ousplit == null ? 0 : ousplit.size()); i++) {
			isou = true;
			if (ousplit.get(i).toString().indexOf("_AND") == -1) {
				// s'il ya que de separateurs or
				diffsplit = split(ousplit.get(i).toString(), "!=");
				if (diffsplit.size() != 0) {
					log.debug("recevabilite.DIFF que des OR()VAL 1 = "
							+ ht.get(diffsplit.get(0).toString().trim()));
					log.debug("recevabilite.DIFF que des OR()VAL 2 = "
							+ diffsplit.get(1).toString().trim());

					// Comparaison entre deux parametres
					if (ht.containsKey(diffsplit.get(0).toString().trim())
							&& ht.get(diffsplit.get(0).toString().trim()) != null
							&& ht.containsKey(diffsplit.get(1).toString()
									.trim())
							&& ht.get(diffsplit.get(1).toString().trim()) != null
							&& !ht.get(diffsplit.get(0).toString().trim())
									.equals(ht.get(diffsplit.get(1).toString()
											.trim()))) {
						res = true;
						break;
					} else {
						// Comparaison entre un parametre et une valeur
						if (null != diffsplit.get(1).toString().trim()
								.replaceAll("'", "")
								&& !ht.containsKey(diffsplit.get(1).toString()
										.trim())) {
							if (ht.containsKey(diffsplit.get(0).toString()
									.trim())
									&& ht.get(diffsplit.get(0).toString()
											.trim()) != null
									&& !ht.get(
											diffsplit.get(0).toString().trim())
											.equals(diffsplit.get(1).toString()
													.trim().replaceAll("'", ""))) {
								res = true;
								break;
							}
						}
					}
				} else {
					egalsplit = split(ousplit.get(i).toString(), "=");
					if (egalsplit.size() != 0) {
						// Comparaison entre deux parametres
						if (ht.containsKey(egalsplit.get(0).toString().trim())
								&& ht.get(egalsplit.get(0).toString().trim()) != null
								&& ht.containsKey(egalsplit.get(1).toString()
										.trim())
								&& ht.get(egalsplit.get(1).toString().trim()) != null
								&& ht.get(egalsplit.get(0).toString().trim())
										.equals(ht.get(egalsplit.get(1)
												.toString().trim()))) {
							res = true;
							break;
						} else {
							// Comparaison entre un parametre et une valeur
							if (null != egalsplit.get(1).toString().trim()
									.replaceAll("'", "")
									&& !ht.containsKey(egalsplit.get(1)
											.toString().trim())) {
								if (ht.containsKey(egalsplit.get(0).toString()
										.trim())
										&& ht.get(egalsplit.get(0).toString()
												.trim()) != null
										&& ht.get(
												egalsplit.get(0).toString()
														.trim()).equals(
												egalsplit.get(1).toString()
														.trim()
														.replaceAll("'", ""))) {
									res = true;
									break;
								}
							}
						}
					}
				}
			} else {// s'il ya de separateurs and et or
				etsplitTab = split(ousplit.get(i).toString(), "_AND");
				for (j = 0; j < etsplitTab.size(); j++) {
					diffsplit = split(etsplitTab.get(j).toString(), "!=");
					if (diffsplit.size() != 0) {
						log.debug("recevabilite.AND DIFF()VAL 1 = "
								+ ht.get(diffsplit.get(0).toString().trim()));
						log.debug("recevabilite. AND DIFF()VAL 2 = "
								+ diffsplit.get(1).toString().trim());

						// Comparaison entre deux parametres
						if (ht.containsKey(diffsplit.get(0).toString().trim())
								&& ht.get(diffsplit.get(0).toString().trim()) != null
								&& ht.containsKey(diffsplit.get(1).toString()
										.trim())
								&& ht.get(diffsplit.get(1).toString().trim()) != null
								&& !ht.get(diffsplit.get(0).toString().trim())
										.equals(ht.get(diffsplit.get(1)
												.toString().trim()))) {
							log.debug("valueOfCondition DIFFERENCE DEUX PARAMETRES ");
							k++;
						} else {
							// Comparaison entre un parametre et une valeur
							if (null != diffsplit.get(1).toString().trim()
									.replaceAll("'", "")
									&& !ht.containsKey(diffsplit.get(1)
											.toString().trim())) {
								if (ht.containsKey(diffsplit.get(0).toString()
										.trim())
										&& ht.get(diffsplit.get(0).toString()
												.trim()) != null
										&& !ht.get(
												diffsplit.get(0).toString()
														.trim()).equals(
												diffsplit.get(1).toString()
														.trim()
														.replaceAll("'", ""))) {
									log.debug("valueOfCondition DIFFERENCE PARAMETRE ET VALEUR ");
									k++;
								}
							}
						}
					} else {
						egalsplit = split(etsplitTab.get(j).toString(), "=");
						if (egalsplit.size() != 0) {
							// Comparaison entre deux parametres
							if (ht.containsKey(egalsplit.get(0).toString()
									.trim())
									&& ht.get(egalsplit.get(0).toString()
											.trim()) != null
									&& ht.containsKey(egalsplit.get(1)
											.toString().trim())
									&& ht.get(egalsplit.get(1).toString()
											.trim()) != null
									&& ht.get(
											egalsplit.get(0).toString().trim())
											.equals(ht.get(egalsplit.get(1)
													.toString().trim()))) {
								k++;
							} else {
								// Comparaison entre un parametre et une valeur
								if (null != egalsplit.get(1).toString().trim()
										.replaceAll("'", "")
										&& !ht.containsKey(egalsplit.get(1)
												.toString().trim())) {
									if (ht.containsKey(egalsplit.get(0)
											.toString().trim())
											&& ht.get(egalsplit.get(0)
													.toString().trim()) != null
											&& ht.get(
													egalsplit.get(0).toString()
															.trim())
													.equals(egalsplit
															.get(1)
															.toString()
															.trim()
															.replaceAll("'", ""))) {
										k++;
									}
								}
							}
						}
					}
				}
				// si tous les conditions and sont verifies true
				if (k == j) {
					res = true;
					break;
				}
			}
		}
		// si pas de separateur or
		k = 0;
		if (!isou) {
			if (etsplit != null && etsplit.size() != 0) {
				// s'il ya que de separateurs and
				for (j = 0; j < etsplit.size(); j++) {
					diffsplit = split(etsplit.get(j).toString(), "!=");
					if (diffsplit.size() != 0) {
						// Comparaison entre deux parametres
						if (ht.containsKey(diffsplit.get(0).toString().trim())
								&& ht.get(diffsplit.get(0).toString().trim()) != null
								&& ht.containsKey(diffsplit.get(1).toString()
										.trim())
								&& ht.get(diffsplit.get(1).toString().trim()) != null
								&& !ht.get(diffsplit.get(0).toString().trim())
										.equals(ht.get(diffsplit.get(1)
												.toString().trim()))) {
							k++;
						} else {
							// Comparaison entre un parametre et une valeur
							if (null != diffsplit.get(1).toString().trim()
									.replaceAll("'", "")
									&& !ht.containsKey(diffsplit.get(1)
											.toString().trim())) {
								if (ht.containsKey(diffsplit.get(0).toString()
										.trim())
										&& ht.get(diffsplit.get(0).toString()
												.trim()) != null
										&& !ht.get(
												diffsplit.get(0).toString()
														.trim()).equals(
												diffsplit.get(1).toString()
														.trim()
														.replaceAll("'", ""))) {
									k++;
								}
							}
						}
					} else {
						egalsplit = split(etsplit.get(j).toString(), "=");
						if (egalsplit.size() != 0) {
							// Comparaison entre deux parametres
							if (ht.containsKey(egalsplit.get(0).toString()
									.trim())
									&& ht.get(egalsplit.get(0).toString()
											.trim()) != null
									&& ht.containsKey(egalsplit.get(1)
											.toString().trim())
									&& ht.get(egalsplit.get(1).toString()
											.trim()) != null
									&& ht.get(
											egalsplit.get(0).toString().trim())
											.equals(ht.get(egalsplit.get(1)
													.toString().trim()))) {
								k++;
							} else {
								// Comparaison entre un parametre et une valeur
								if (null != egalsplit.get(1).toString().trim()
										.replaceAll("'", "")
										&& !ht.containsKey(egalsplit.get(1)
												.toString().trim())) {
									if (ht.containsKey(egalsplit.get(0)
											.toString().trim())
											&& ht.get(egalsplit.get(0)
													.toString().trim()) != null
											&& ht.get(
													egalsplit.get(0).toString()
															.trim())
													.equals(egalsplit
															.get(1)
															.toString()
															.trim()
															.replaceAll("'", ""))) {
										k++;
									}
								}
							}
						}
					}
				}
				if (k == j) {
					res = true;
				} else {
					res = false;
				}
			} else {// s'il n'ya ni separateurs and ni or
				diffsplit = split(value, "!=");
				if (diffsplit.size() != 0) {
					// Comparaison entre deux parametres
					if (ht.containsKey(diffsplit.get(0).toString().trim())
							&& ht.get(diffsplit.get(0).toString().trim()) != null
							&& ht.containsKey(diffsplit.get(1).toString()
									.trim())
							&& ht.get(diffsplit.get(1).toString().trim()) != null
							&& !ht.get(diffsplit.get(0).toString().trim())
									.equals(ht.get(diffsplit.get(1).toString()
											.trim()))) {
						res = true;
					} else {
						// Comparaison entre un parametre et une valeur
						if (null != diffsplit.get(1).toString().trim()
								.replaceAll("'", "")
								&& !ht.containsKey(diffsplit.get(1).toString()
										.trim())) {
							if (ht.containsKey(diffsplit.get(0).toString()
									.trim())
									&& ht.get(diffsplit.get(0).toString()
											.trim()) != null
									&& !ht.get(
											diffsplit.get(0).toString().trim())
											.equals(diffsplit.get(1).toString()
													.trim().replaceAll("'", ""))) {
								res = true;
							}
						}
					}
				} else {
					egalsplit = split(value, "=");
					if (egalsplit.size() != 0) {
						// Comparaison entre deux parametres
						if (ht.containsKey(egalsplit.get(0).toString().trim())
								&& ht.get(egalsplit.get(0).toString().trim()) != null
								&& ht.containsKey(egalsplit.get(1).toString()
										.trim())
								&& ht.get(egalsplit.get(1).toString().trim()) != null
								&& ht.get(egalsplit.get(0).toString().trim())
										.equals(ht.get(egalsplit.get(1)
												.toString().trim()))) {
							res = true;
						} else {
							// Comparaison entre un parametre et une valeur
							if (null != egalsplit.get(1).toString().trim()
									.replaceAll("'", "")
									&& !ht.containsKey(egalsplit.get(1)
											.toString().trim())) {
								if (ht.containsKey(egalsplit.get(0).toString()
										.trim())
										&& ht.get(egalsplit.get(0).toString()
												.trim()) != null
										&& ht.get(
												egalsplit.get(0).toString()
														.trim()).equals(
												egalsplit.get(1).toString()
														.trim()
														.replaceAll("'", ""))) {
									res = true;
								}
							}
						}
					}
				}
			}
		}
		return res;
	}

	public static boolean isNumber(String car) {
		String tab[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		boolean res = false;
		if (car != null && car.length() == 1) {
			for (int i = 0; i < tab.length; i++) {
				if ( car.indexOf(tab[i]) != -1) {
					res = true;
					break;
				}
			}
		}

		return res;
	}

}