/*
 * Created on 01/04/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package sn.com.douane.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author odrira
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class NumberUtil {
	private static String numberPattern = "###,###,###,###";

	public static final String convertIntegerToString(Integer aInteger) {
		int length = aInteger.toString().length();
		String initial = aInteger.toString();
		String subInitial = "";		
		StringBuffer buffer = new StringBuffer();

		if ((length % 3) == 0) {
			subInitial = initial;
		} else if ((length % 3) == 1) {
			buffer.append(String.valueOf(initial.charAt(0)) + " ");
			subInitial = initial.substring(1);
		} else 
		{
			buffer.append(initial.substring(0, 1) + " ");
			subInitial = initial.substring(2);
		}

		for (int i = 1; i <= subInitial.length(); i++) {
			buffer.append(subInitial.charAt(i));

			if ((i % 3) == 0) {
				buffer.append(" ");
			}
		}

		return buffer.toString();
	}

	public static String format(Object value) {
		DecimalFormat formatter = new DecimalFormat(numberPattern);
		String formatValue = "";

		if ((value != null) && !"".equals(value)) {
			if (value instanceof String) {
				formatValue = formatter.format(Double.valueOf((String) value));
			} else {
				formatValue = formatter.format(value);
			}
		}

		return formatValue;
	}
	
	 public static String formatNumber(BigDecimal bd) {
	        DecimalFormat df = new DecimalFormat("###,###,###,###");
	        if(bd!=null){
	        	return (df.format(bd.doubleValue())).replaceAll(",", " ");
	        }else{ 
	        	return ""; 
	        }
	  }
	 
	public static String format(Object value, String pattern) {
		DecimalFormat formatter = new DecimalFormat(pattern);
		String formatValue = "";

		if ((value != null) && !"".equals(value)) {
			if (value instanceof String) {
				formatValue = formatter.format(Double.valueOf((String) value));
			} else {
				formatValue = formatter.format(value);
			}
		}

		return formatValue;
	}

	/**
	 * contr�le si la chaine est un nombre
	 * 
	 * @param manifNumCont
	 * @return
	 */
	public static boolean isNumber(String nombre) {
		String chiffre = "0123456789";

		for (int i = 0; i < nombre.length(); i++) {
			if (chiffre.indexOf(nombre.charAt(i)) == -1){
				return false;
			}
		}
		return true;

	}

	/**
	 * contr�le si le caract�re est un chiffre
	 * 
	 * @param manifNumCont
	 * @return
	 */
	public static boolean isNumber(char chiffre) {
		String chiffres = "0123456789";

		if (chiffres.indexOf(chiffre) == -1){
			return false;
		}
		return true;

	}

	/**
	 * contr�le si la chaine ne contient que des caract�res
	 * 
	 * @param manifNumCont
	 * @return
	 */
	public static boolean isString(String chaine) {
		String lettres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < chaine.length(); i++) {
			if (lettres.indexOf(chaine.charAt(i)) == -1){
				return false;			
			}
		}
		return true;

	}

	/**
	 * contr�le si la chaine ne contient que des caract�res
	 * 
	 * @param manifNumCont
	 * @return
	 */
	public static boolean isChar(char caractere) {
		String lettres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (lettres.indexOf(caractere) == -1){
			return false;
		}
		return true;

	}
}