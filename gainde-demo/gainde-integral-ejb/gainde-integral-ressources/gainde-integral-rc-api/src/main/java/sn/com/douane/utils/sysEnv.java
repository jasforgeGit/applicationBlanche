package sn.com.douane.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 
 * <p>
 * Copyright: Copyright (c) 2006
 * Mise � jour: 03/12/2010 par Laouini Moez, 
 * </p>
 * <p>
 * Company: Tunisie
 * </p>
 * 
 * @author Laouini Moez
 * @version 1.0
 *  
 */

public class sysEnv {
	
	public static final String MONEY_FORMAT="###,###,### F";

	private static String DayMonthYearSeparator = "/";
	
	//private static String DayMonthYearSeparator = "-";

	private static String HourMinuteSecondeSeparator = ":";
	
	private static String MilliSecondeSeparator = ".";

	private static String DateTimeDelimiter = " ";

	public static String DateFormat = "dd" + DayMonthYearSeparator + "MM"
		+ DayMonthYearSeparator + "yyyy";
	
	/*public static String DateFormat = "yyyy" + DayMonthYearSeparator + "MM"
	+ DayMonthYearSeparator + "dd";*/
	
	//public static String DateFormat = "MM" + DayMonthYearSeparator + "dd"
	//+ DayMonthYearSeparator + "yyyy";

	public static String TimeFormat = "dd" + DayMonthYearSeparator + "MM"
			+ DayMonthYearSeparator + "yyyy" + DateTimeDelimiter + "HH"
			+ HourMinuteSecondeSeparator + "mm" + HourMinuteSecondeSeparator
			+ "ss"+ MilliSecondeSeparator+"SS";

	/**
	 * ToDay
	 * 
	 * @return
	 */
	public static java.sql.Date ToDay() {
		return new java.sql.Date(System.currentTimeMillis());
	}

	/**
	 * ToDayTimeStamp
	 * 
	 * @return
	 */
	public static Timestamp ToDayTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}

	/**
	 * TIME
	 * 
	 * @return
	 */
	public static java.sql.Time TIME() {
		return new java.sql.Time(System.currentTimeMillis());
	}

	/**
	 * 
	 *  
	 */
	public sysEnv() {
	}

	/**
	 * YEAR
	 * 
	 * @return
	 */
	public static String YEAR() {
		return ToDay().toString().substring(0, 4);
	}

	/**
	 * MONTH
	 * 
	 * @return
	 */
	public static String MONTH() {
		return ToDay().toString().substring(5, 7);
	}

	/**
	 * DAY
	 * 
	 * @return
	 */
	public static String DAY() {
		return ToDay().toString().substring(8, 10);
	}

	/***************************************************************************
	 * 
	 * @param value
	 * @return
	 */
	public static java.lang.String strToStr(String value) {
		if (value == null){
			value = "";
		}
		return value;
	}

	/**
	 * strToDate
	 * 
	 * @param value
	 * @return
	 */
	public static java.sql.Date strToDate(String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(DateFormat);
			df.setLenient(false);

			return new java.sql.Date(df.parse(value).getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * strToDate
	 * 
	 * @param value
	 * @return
	 */
	public static java.sql.Date strToDate(String aMask, String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(aMask);
			df.setLenient(false);

			return new java.sql.Date(df.parse(value).getTime());
		} catch (Exception e) {
			return null;
		}
	}

	public static Timestamp strToTimestamp(String aMask, String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(aMask);
			df.setLenient(false);
			return  new Timestamp(df.parse(value).getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * dateToStr
	 * 
	 * @param value
	 * @return
	 */
	public static String dateToStr(java.sql.Date value) {
		String d = "";
		String m = "";
		if (value == null) {
			return "";
		} else {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new java.util.Date(value.getTime()));
			d = String.valueOf(gc.get(Calendar.DATE));
			m = String.valueOf(gc.get(Calendar.MONTH) + 1);
			if (d.length() == 1) {
				d = "0" + d;
			}
			if (m.length() == 1) {
				m = "0" + m;
			}
			//return d + DayMonthYearSeparator + m + DayMonthYearSeparator
					//+ String.valueOf(gc.get(Calendar.YEAR));
			
			return d + DayMonthYearSeparator + m + DayMonthYearSeparator
			+ String.valueOf(gc.get(Calendar.YEAR));
			
            /*return String.valueOf(gc.get(Calendar.YEAR))+ DayMonthYearSeparator + d + DayMonthYearSeparator + m 
			;*/
			
			
			
			
			
		}
	}

	/**
	 * strToTime
	 * 
	 * @param value
	 * @return
	 */
	public static Time strToTime(String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(TimeFormat);
			return new java.sql.Time(df.parse(value).getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * timeToStr
	 * 
	 * @param value
	 * @return
	 */
	public static String timeToStr(Time value) {
		if (value == null) {
			return "";
		} else {
			GregorianCalendar gc = new GregorianCalendar(TimeZone
					.getTimeZone("GMT"));
			gc.setTime(new java.util.Date(value.getTime()));
			return String.valueOf(gc.get(Calendar.DATE))
					+ DayMonthYearSeparator
					+ String.valueOf(gc.get(Calendar.MONTH) + 1)
					+ DayMonthYearSeparator
					+ String.valueOf(gc.get(Calendar.YEAR)) + DateTimeDelimiter
					+ String.valueOf(gc.get(Calendar.HOUR_OF_DAY))
					+ HourMinuteSecondeSeparator
					+ String.valueOf(gc.get(Calendar.MINUTE))
					+ HourMinuteSecondeSeparator
					+ String.valueOf(gc.get(Calendar.SECOND));
		}
	}

	/**
	 * split
	 * 
	 * @param chaine
	 * @param separator
	 * @return
	 */
	public static List split(String chaine, String separator) {
		List vector = new ArrayList();
		int nbreSeperat = 0;
		while (chaine.indexOf(separator) != -1 || nbreSeperat != 0) {
			if (chaine.indexOf(separator) != -1) {
				nbreSeperat++;
				//System.out.println(chaine.substring(0,chaine.indexOf(separator))+"-----");
				vector.add(chaine.substring(0, chaine.indexOf(separator)));
			} else {
				nbreSeperat = 0;
				vector.add(chaine.substring(0, chaine.length()));
			}
			chaine = chaine.substring(chaine.indexOf(separator)
					+ separator.length(), chaine.length());
		}

		return vector;
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Timestamp strToTimestamp(String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(TimeFormat);
			return new java.sql.Timestamp(df.parse(value+" 00:00:00.0").getTime());
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String timestampToStr(Timestamp value) {
		if (value == null) {
			return "";
		} else {
			GregorianCalendar gc = new GregorianCalendar(TimeZone
					.getTimeZone("GMT"));
			gc.setTime(new java.util.Date(value.getTime()));
			return String.valueOf(gc.get(Calendar.DATE))
					+ DayMonthYearSeparator
					+ String.valueOf(gc.get(Calendar.MONTH) + 1)
					+ DayMonthYearSeparator
					+ String.valueOf(gc.get(Calendar.YEAR)) + DateTimeDelimiter
					+ String.valueOf(gc.get(Calendar.HOUR_OF_DAY))
					+ HourMinuteSecondeSeparator
					+ String.valueOf(gc.get(Calendar.MINUTE))
					+ HourMinuteSecondeSeparator
					+ String.valueOf(gc.get(Calendar.SECOND))
					+ MilliSecondeSeparator
					+ String.valueOf(gc.get(Calendar.MILLISECOND));
		}
	}
	
	/**
	 * 
	 * @param value
	 * @return
	 */
	public static String timestampToStrWithoutTime(Timestamp value) {
		String d = "";
		String m = "";
		if (value == null) {
			return "";
		} else {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new java.util.Date(value.getTime()));
			d = String.valueOf(gc.get(Calendar.DATE));
			m = String.valueOf(gc.get(Calendar.MONTH) + 1);
			if (d.length() == 1) {
				d = "0" + d;
			}
			if (m.length() == 1) {
				m = "0" + m;
			}
			return d + DayMonthYearSeparator + m + DayMonthYearSeparator
					+ String.valueOf(gc.get(Calendar.YEAR));
		}
	}

	/**
	 * fonction qui recup�re une valeur correspond � un key dans le fichier
	 * propertie gainde2005web.config.resources.Applicationresources
	 * 
	 * @param key
	 * @return
	 */
	public static final String getvalFromProperties(String key, Locale locale) {
		ResourceBundle bundle = ResourceBundle.getBundle(
				"gainde2005web.config.resources.Applicationresources", locale);
		return bundle.getString(key);
	}

	/**
	 * fonction qui recup�re une valeur correspond � un key dans le fichier
	 * propertie gainde2005web.config.resources.Applicationresources
	 * 
	 * @param key
	 * @return
	 */
	public static final String getvalFromProperties(String key) {
		ResourceBundle bundle = ResourceBundle
				.getBundle("gainde2005web.config.resources.Applicationresources");
		return bundle.getString(key);
	}

	/**
	 * fonction qui recup�re une valeur correspond � un key dans un fichier
	 * properties il faut preciser le chemin de fichier properties
	 * 
	 * @param pathProperties
	 * @param key
	 * @return
	 */
	public static final String getvalFromProperties(String pathProperties,
			String key) {
		ResourceBundle bundle = ResourceBundle.getBundle(pathProperties);
		return bundle.getString(key);
	}

	/**
	 * fonction permet d'ajouter nombre de jours dans une date
	 * 
	 * @param date
	 * @param nbrjours
	 * @return
	 */
	public static final Date addDays(java.sql.Date date, int nbrjours) {
		long jour = 1000 * 60 * 60 * 24;
		long dat = date.getTime();
		long som = dat + (jour * nbrjours);
		java.util.Date date2 = new java.util.Date();
		date2.setTime(som);
		return utilDateToSqlDate(date2);
	}

	/**
	 * fonction qui retourne l'ann�e dans une date
	 * 
	 * @param date
	 * @return
	 */
	public static final int getYearFomDate(Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * fonction qui retourne le mois dans une date
	 * 
	 * @param date
	 * @return
	 */
	public static final int getMonthFomDate(Date date) {
		GregorianCalendar gc = new GregorianCalendar(TimeZone
				.getTimeZone("GMT"));
		gc.setTime(sqlDateToUtilDate(date));
		return gc.get(GregorianCalendar.MONTH);

	}

	/**
	 * fonction permet de comparer deux dates en fesant la diff�rence en ann�e
	 * et mois
	 * 
	 * @param dat1
	 * @param dat2
	 * @return
	 */
	public static final int diffDateByMonth(Date dat1, Date dat2) {
		return differenceFrom2Date(dat2,dat1)/30;
	}

	/**
	 * fonction qui retourne le jour dans une date
	 * 
	 * @param date
	 * @return
	 */
	public static final int getDayFomDate(Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * fonction permet de comparer deux dates en fesant la diff�rence en nombre
	 * de jours
	 * 
	 * @param dat1
	 * @param dat2
	 * @return
	 */
	public static final int differenceFrom2Date(Date dat1, Date dat2) {
		long day = 1000 * 60 * 60 * 24;
		if (dat1 != null && dat2 != null) {
			long diff = (dat1.getTime() / day) - (dat2.getTime() / day);
			return Long.valueOf(diff).intValue();
		} else{
			return 0;
		}
	}

	/**
	 * fonction qui retourne un decimal en introduisant nbre de chiffre apr�s la
	 * virgule
	 * 
	 * @param value
	 * @param scale
	 * @return
	 */

	public static String NumberToStr(Number value, int scale) throws Exception{
		DecimalFormat nbrF = new DecimalFormat("#0");
		nbrF.setMinimumFractionDigits(scale);
		if (value == null) {
			return "";
		} else {
			return replace(nbrF.format( Double.valueOf(value.doubleValue())), ",",
					".");
		}
	}

	public static String BigdecimalToStr(BigDecimal value) {
		if (value == null) {
			return "";
		} else {
			return value.toString();
		}
	}

	public static String IntegerToStr(Integer value) {
		if (value == null) {
			return "";
		} else {
			return value.toString();
		}
	}

	public static BigDecimal NumberToBigDecimal(Number value, int scale) {
		DecimalFormat nbrF = new DecimalFormat("#0");
		nbrF.setMinimumFractionDigits(scale);
		if (value == null) {
			value = BigDecimal.ZERO;
		}
		return new BigDecimal(replace(nbrF.format( Double.valueOf(value
				.doubleValue())), ",", "."));

	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Float strToFloat(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {
			return new Float(value);
		}
	}

	/**
	 * fonction qui retourne l'oppos� d'un double
	 * 
	 * @param value
	 * @return
	 */
	public static Double opposeOfDouble(Double value) {
		Long val = null;
		Double val1 = null;
		if (value == null) {
			return ( Double.valueOf(0));
		} else {
			val1 =  Double.valueOf(value.doubleValue() * 1000);
			val = Long.valueOf((-1) * val1.longValue());
			return ( Double.valueOf(val.doubleValue() / 1000));
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static BigDecimal integerToBigDecimal(Integer value) {
		if (value == null) {
			return BigDecimal.ZERO;
		} else {
			return new BigDecimal(value.doubleValue());
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static BigDecimal strToBigDecimal(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {

			try {
				String t[] = value.split(" ");
				StringBuffer buffer = new StringBuffer();
				for (int i = 0; i < t.length; i++){
					buffer.append(t[i]);
				}
				if (buffer.toString().compareTo("") != 0){
					value = buffer.toString();
				}else{
						return null;
					}
				return NumberToBigDecimal(new BigDecimal(value),0);
			} catch (Exception e) {
				return null;
			}
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Double strToDouble(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {
			String t[] = value.split(" ");
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < t.length; i++){
				buffer.append(t[i]);
			}
			if (buffer.toString().compareTo("") != 0){
				value = buffer.toString();
			}
			return new Double(value);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Integer strToInteger(String value) {
		if (value == null) {
			return Integer.valueOf(0);
		} else if (value.trim().equals("")) {
			return Integer.valueOf(0);
		} else {
			return Integer.valueOf(value);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Long strToLong(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {
			return new Long(value);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static Short strToShort(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {
			return new Short(value);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public static BigInteger strToBigInteger(String value) {
		if (value == null) {
			return null;
		} else if (value.trim().equals("")) {
			return null;
		} else {
			return new BigInteger(value);
		}
	}

	/**
	 * convertir une date java.util.date en java.sql.date
	 * 
	 * @param date
	 * @return
	 */
	public static java.sql.Date utilDateToSqlDate(java.util.Date date) {
		return new java.sql.Date(date.getTime());
	}

	/**
	 * convertir une date java.sql.date en java.util.date
	 * 
	 * @param date
	 * @return
	 */

	public static java.util.Date sqlDateToUtilDate(java.sql.Date date) {
		return new java.util.Date(date.getTime());
	}

	/**
	 * ajout nbre de jour dans une date
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static java.sql.Date addJour(java.sql.Date date, int n) {
		GregorianCalendar gc = new GregorianCalendar(TimeZone
				.getTimeZone("GMT"));
		gc.setTime(sqlDateToUtilDate(date));
		gc.add(GregorianCalendar.DAY_OF_MONTH, n);
		return (utilDateToSqlDate(gc.getTime()));
	}

	/**
	 * ajout nbre de jour dans une date
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static java.sql.Date addYear(java.sql.Date date, int n) {
		GregorianCalendar gc = new GregorianCalendar(TimeZone
				.getTimeZone("GMT"));
		gc.setTime(sqlDateToUtilDate(date));
		gc.add(GregorianCalendar.YEAR, n);
		return (utilDateToSqlDate(gc.getTime()));
	}
	/**
	 * ajout nbre de mois dans une date
	 * 
	 * @param date
	 * @param m
	 * @return
	 */
	public static java.sql.Date addMonth(java.sql.Date date, int m) {
		GregorianCalendar gc = new GregorianCalendar(TimeZone
				.getTimeZone("GMT"));
		gc.setTime(sqlDateToUtilDate(date));
		gc.add(GregorianCalendar.MONTH, m);
		return (utilDateToSqlDate(gc.getTime()));
	}

	/**
	 * augmenter une date par nbre de jour
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static java.sql.Date CalcDatePlus(java.sql.Date date, int n) {
		return addJour(date, n);
	}

	/**
	 * diminuer une date d'un nbre de jour
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static java.sql.Date CalcDateMoins(java.sql.Date date, int n) {
		return addJour(date, -n);
	}

	/*
	 * public static int getDay(java.sql.Date date){ GregorianCalendar gc=new
	 * GregorianCalendar(TimeZone.getTimeZone("GMT"));
	 * gc.setTime(sqlDateToUtilDate(date)); return
	 * gc.get(GregorianCalendar.DATE); }
	 */
	/**
	 *  
	 */
	public static java.sql.Date getDate(int day, int month, int year) {
		GregorianCalendar gc = new GregorianCalendar(TimeZone
				.getTimeZone("GMT"));
		gc.set(year, month, day);
		return utilDateToSqlDate(gc.getTime());
	}

	/**
	 * convertir une date en une format fran�aise
	 * 
	 * @param value
	 * @return
	 */
	public static java.text.DateFormat strToDateFr(String value) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(DateFormat);
			df.setLenient(false);
			return SimpleDateFormat.getDateInstance(2, new Locale("fr", ""));
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 
	 * @param value
	 * @param ancien
	 * @param nouveau
	 * @return
	 */

	public static String replace(String value, String ancien, String nouveau)  {
		try{
		if (value == null){
			return null;
		}else if (value.equals("")) {
			return "";
		} else if (value.toLowerCase().indexOf(ancien) == -1) {
			return value;
		} else {
			return value.substring(0, value.toLowerCase().indexOf(
					ancien.toLowerCase()))
					+ nouveau
					+ replace(value.substring(value.toLowerCase().indexOf(
							ancien.toLowerCase())
							+ ancien.length(), value.length()), ancien, nouveau);
		}
		
		}catch (Exception e) {
			return null;
		}
		
	}

	/**
	 * 
	 * @param value
	 * @param delimiter
	 * @return
	 */

	public static String[] splitString(String value, String delimiter) {
		StringTokenizer strTake = new StringTokenizer(value, delimiter);
		String[] result = new String[strTake.countTokens()];
		int i = 0;
		while (strTake.hasMoreTokens()) {
			result[i] = strTake.nextToken();
			i++;
		}
		return result;
	}

	/**
	 * si null elle met vide
	 * 
	 * @param value
	 * @return
	 */
	public static String emptyIfNull(String value) {
		if (value == null){
			return "";
		}else{
			return value;
		}
	}

	/**
	 * verifier si vide
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		return (value == null) || (value.trim().equals(""));
	}

	public static String onlyFirstIsUpper(String nom) {
		if (nom == null){
			nom = "";
		}
		nom = nom.toLowerCase();
		return nom.replaceFirst("" + nom.charAt(0), String.valueOf(""+ nom.charAt(0)).toUpperCase());
	}

	public static BigDecimal add(BigDecimal val1, BigDecimal val2){
		if(val1==null){
			val1=BigDecimal.ZERO;
		}
		if(val2==null){
			val2=BigDecimal.ZERO;
		}
		if (val1 != null && val2 != null) {
			val1 = val1.add(val2);
			val1 = NumberToBigDecimal(val1, BigDecimal.ROUND_UP);
		}
		return val1;
	}

	public static Integer add(Integer val1, Integer val2) {
		if (val1 != null && val2 != null) {
			val1 = Integer.valueOf(val1.intValue() + (val2.intValue()));
		}
		return val1;
	}

	public static BigDecimal soustract(BigDecimal val1, BigDecimal val2) {
		if(val1==null){
			val1= BigDecimal.ZERO;
		}
		if(val2==null){
			val2= BigDecimal.ZERO;
		}
		
		if (val1 != null && val2 != null) {
			val1 = val1.subtract(val2);
			val1 = NumberToBigDecimal(val1, BigDecimal.ROUND_CEILING);
		}
		return val1;
	}

	public static BigInteger soustract(BigInteger val1, BigInteger val2) {
		if (val1 != null && val2 != null){
			val1 = val1.subtract(val2);
		}
		return val1;
	}

	public static Integer soustract(Integer val1, Integer val2) {
		if (val1 != null && val2 != null){
			val1 = Integer.valueOf(val1.intValue() - val2.intValue());
		}
		return val1;
	}

	public static Double soustract(Double val1, Double val2) {
		if (val1 != null && val2 != null){
			val1 =  Double.valueOf(val1.doubleValue() - val2.doubleValue());
		}
		return val1;
	}

	/**
	 * fonction qui donne la valeur la plus grande d'une liste des valeurs
	 * 
	 * @param listvaleur
	 * @return
	 */
	public static Object returnBigValue(List listvaleur) {
		Collections.sort(listvaleur);
		if (listvaleur.size() != 0){
			return listvaleur.get(listvaleur.size() - 1);
		}else{
			return null;
		}
	}

	/**
	 * @param i
	 * @return
	 */
	public static Integer int2Integer(int i) {
		return Integer.valueOf(i);
	}

	/**
	 * @param car
	 * @return
	 */
	public static boolean isNumber(String car) {
		String tab[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		boolean res = false;
		for (int i = 0; i < car.length(); i++) {
			for (int j = 0; j < tab.length; j++) {
				String ca = "" + car.charAt(i);
				if (ca.indexOf(tab[j]) != -1) {
					res = true;
					break;
				}
			}
		}

		return res;
	}

	/**
	 * cette fonction permet de remplacer les caractere speciaux par la format
	 * html elle est utilis�e pour la recevabilite si jamais on voudra ajouter
	 * un autre caractere on suive le m�me principe chaine.replaceAll(caractere
	 * special,format html);
	 * 
	 * @param chaine
	 * @return
	 */
	public static String replaceSpecialCaractere(String chaine) throws Exception{
		//chaine=chaine.toLowerCase();
		chaine = replace(chaine, "�", "&deg;");
		chaine = replace(chaine, "�", "&eacute;");
		chaine = replace(chaine, "�", "&ecirc;");
		chaine = replace(chaine, "�", "&egrave;");
		chaine = replace(chaine, "�", "&agrave;");
		chaine = replace(chaine, ">", "&gt;");
		chaine = replace(chaine, "<", "&lt;");
		chaine = replace(chaine, "�", "&icirc;");
		chaine = replace(chaine, "�", "&ccedil;");
		return chaine;
	}

	/**
	 * 
	 * /** Remove the obsolete form bean
	 * 
	 * @param sesFB
	 * @param request
	 */
	public static void removeSession(String sesFB, HttpServletRequest request) {
		if (sesFB != null) {
			HttpSession session = request.getSession();
			session.removeAttribute(sesFB);
		}
	}
    public static BigDecimal arrondirCentiemeMinimum(BigDecimal value,BigDecimal minValue ){
    	if(value.intValue()>0){
	    	BigDecimal value3 = value.divide(new BigDecimal(100), BigDecimal.ROUND_DOWN);
	     	if(value.intValue()%100==0){
	     		return MinimumValue(value,minValue);
	     	} else {
	     		return MinimumValue(integerToBigDecimal(Integer.valueOf((value3.intValue()+1)*100)),minValue);
	     	}
    	}else {
    		return value;
    	}
     }
    public static BigDecimal MinimumValue(BigDecimal value, BigDecimal minValue ){
     	if(value.intValue() < minValue.intValue()){
     		return minValue;
     	} else {
     		return value;
     	}
     }
	/**
	 * fonction permet de comparer deux dates en fesant la diff�rence en nombre
	 * de secondes
	 * 
	 * @param dat1
	 * @param dat2
	 * @return
	 */
	public static final long differenceFrom2DateSS(Timestamp dat1, Timestamp dat2) {
		long day = 1000 ;
		if (dat1 != null && dat2 != null) {
			return (dat1.getTime() / day) - (dat2.getTime() / day);
		} else {
			return 0;
		}
	}
	public static Double add(Double val1, Double val2){
		if(val1==null){
			val1= Double.valueOf(0);
		}
		if(val2==null){
			val2= Double.valueOf(0);
		}
		if (val1 != null && val2 != null) {
			val1 =  Double.valueOf(val1.doubleValue()+ val2.doubleValue());
		}
		return val1;
	}
	
	/**
	 *  
	 */
	public static boolean compare(String str1, String str2) {
		if ((str1 == null) && (str2 == null)) {
			return true;
		} else if ((str1 != null) && (str2 != null)) {
			return str1.compareTo(str2) == 0;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param integer1
	 * @param integer2
	 * @return
	 */
	public static boolean compare(Integer integer1, Integer integer2) {
		if ((integer1 == null) && (integer2 == null)) {
			return true;
		} else if ((integer1 != null) && (integer2 != null)) {
			return integer1.intValue() == integer2.intValue();
		} else {
			return false;
		}
	}
	
	/**
	 * Testing if a common used object is null or empty.
	 * 
	 * @param object
	 *            object to validate
	 * @return Boolean value indicates if any object is null and if a string, a
	 *         map or a collection is empty
	 */
	@SuppressWarnings("rawtypes")
	public static Boolean isNullOrEmpty(Object object) {
		if (object == null) {
			return Boolean.TRUE;
		}
		if (object instanceof String) {
			return "".equals(((String) object).trim());
		}
		if (object instanceof Map) {
			return ((Map) object).isEmpty();
		}
		if (object instanceof Collection) {
			return ((Collection) object).isEmpty();
		}
		return Boolean.FALSE;
	}
}