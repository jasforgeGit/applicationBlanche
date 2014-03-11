package sn.com.douane.web.testSession;

import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
import org.apache.log4j.Logger;


/**
 * The Class TestSession.
 */
public class TestSession implements HttpSessionListener {

	/** The Constant logger. */
	private static final Logger LOGGER = Logger.getLogger(TestSession.class);
	/** The Constant sessions. */
	private static final ArrayList sessions = new ArrayList();
	
	/** The active sessions. */
	private static int activeSessions = 0;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionCreated(javax.servlet.http.HttpSessionEvent)
	 */
	public void sessionCreated(HttpSessionEvent se) {
		activeSessions++;
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionListener#sessionDestroyed(javax.servlet.http.HttpSessionEvent)
	 */
	public void sessionDestroyed(HttpSessionEvent se) {
		if (activeSessions > 0) {
			activeSessions--;
		}

		String sess = find2((String) se.getSession().getAttribute("RNCODE"));
		if (sess != null) {
			sessions.remove(se.getSession().getAttribute("RNCODE"));
		}
		se.getSession().invalidate();
	}

	/**
	 * Find2.
	 *
	 * @param codeUser the code user
	 * @return the string
	 */
	public static String find2(String codeUser) {
		String ses = null;
		if (codeUser != null) {
			try {
				if (sessions.contains(codeUser) == true) {
					ses = codeUser;
				}
			} catch (Exception e) {
				LOGGER.error("Error ocurred when trying to find2 codeuser in session");
			}
		}
		return ses;
	}

	/**
	 * Find3.
	 *
	 * @param codeUser the code user
	 * @return the string
	 */
	public String find3(String codeUser) {
		String code = null;
		try {
			if (sessions.contains(codeUser) == true) {
				code = codeUser;
			}
		} catch (Exception e) {
			LOGGER.error("Error ocurred when trying to find3 codeuser in session");
		}
		return code;
	}

	/**
	 * Liberer une signature.
	 *
	 * @param codeUser the code user
	 */
	public void libererUneSignature(String codeUser) {
		String signature = find2(codeUser);
		if (signature != null) {
			sessions.remove(codeUser);
		}
	}

	/**
	 * Liberer all signature.
	 *
	 * @param chaine the chaine
	 */
	public void libererAllSignature(String chaine) {
		StringTokenizer st = new StringTokenizer(chaine, ":");
		while (st.hasMoreTokens()) {
			String codeUser = st.nextToken();
			libererUneSignature(codeUser);
		}
	}

//	public static String listeUtilisateurs() {
//		String ret = "";
//		Iterator itr = sessions.iterator();
//		while (itr.hasNext()) {
//			String key = (String) itr.next();
//
//			ret = ret + ";" + key;
//		}
//		return ret;
//	}

	/**
	 * Gets the active sessions.
	 *
	 * @return the active sessions
	 */
	public static int getActiveSessions() {

		return sessions.size();
	}

	// public static int TailleSession(Object o){
	// ByteArrayOutputStream baOS;
	// ObjectOutputStream objOS;
	// int size=0;
	// try {
	// baOS = new ByteArrayOutputStream();
	// objOS = new ObjectOutputStream(baOS);
	// objOS.writeObject(o);
	// baOS.close();
	// objOS.close();
	// size = baOS.size();
	// } catch (IOException e) {
	// } finally{
	// baOS=null;
	// objOS=null;
	// }
	// return size;
	// }
	// public static int TailleTotalSession(HttpSession ses)
	// {
	// int taille=0;
	// for (Enumeration names = ses.getAttributeNames(); names.hasMoreElements();)
	// {
	// Object obj=names.nextElement();
	//
	// taille=taille+TailleSession(obj);
	//
	// }
	// return taille;
	// }
	/**
	 * Deconnecter session.
	 *
	 * @param ses the ses
	 * @param code the code
	 */
	public void deconnecterSession(HttpSession ses, String code) {
		String sess = find2(code);
		if (sess != null) {
			sessions.remove(code);
		}
		for (Enumeration names = ses.getAttributeNames(); names.hasMoreElements();) {
			String key = (String) names.nextElement();
			ses.removeAttribute(key);
		}
		ses.invalidate();
	}

	/**
	 * Connecter session.
	 *
	 * @param ses the ses
	 * @param cd the cd
	 */
	public void connecterSession(HttpSession ses, String cd) {
		if (cd != null) {
			sessions.add(cd);
		}

	}
	// public Vector listeUtilisateurs(String chaine)
	// {
	// Vector listeUtil=new Vector();
	// Utilisateur user=null;
	// if(chaine!=null)
	// {
	//
	// Iterator iter2=sessions.iterator();
	// while(iter2.hasNext())
	// {
	//
	// String obj=(String)iter2.next();
	// if(obj.contains(chaine)==true)
	// {
	// user=new Utilisateur();
	// user.setRcCodUser(obj);
	// user.setPk(obj);
	// listeUtil.add(user);
	// //System.out.println("UTILISATEUR pk:"+user.getPk());
	// }
	//
	// }
	// }
	// return listeUtil;
	// }
}
