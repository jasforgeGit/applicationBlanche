package sn.com.douane.web.rc;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.ejb.FinderException;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.struts2.json.annotations.JSON;
import org.jfree.util.Log;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.ConstManif;
import tn.com.tw.java.exception.ConstErrCod;
import tn.com.tw.java.exception.TwreException;

public class Session {

	private static GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();

	private static final Logger logger = Logger.getLogger(Session.class); 	

	public static final String CODEUSER = "Codeuser";

	public static final String CODEPPM = "Codeppm";

	public static final String NOMPPM = "Nomppm";

	public static final String NOMUSER = "Nomuser";

	public static final String PNOMPPM = "Pnomppm";

	public static final String MODULE = "Module";

	public static final String CODECREDITAIRE = "codecreditaire";

	public static final String CODEAGREE = "codeagree";

	public static final String INDCONNECT = "indconnect";

	// Variables recupï¿½rï¿½es ï¿½ la connexion d'un agent de la douane

	public static final String CODEAGENT = "codeagent";

	public static final String BUREAUACT = "bureauact";

	public static final String NOMAGENT = "nomagent";

	public static final String PRENOMAGENT = "prenomagent";

	public static final String RCCODEUSER = "rccodeuser";

	public static final String CODEPROFIL = "codeprofil";

	public static final String LIBELLEPROFIL = "libelleprofil";

	public static final String CODE_CONSIGNATAIRE = "codeconsignataire";
	
	private static Utilisateur user;
	public Session() {
		super();
	}

	public static void setUtilisateurSession(HttpServletRequest request1,
			Utilisateur utilisateur) {
		request1.getSession().setAttribute("user", utilisateur);
	}

	
	public static Utilisateur getUtilisateurSession(HttpServletRequest arg0) {	
		long debut = System.currentTimeMillis();
		user = (Utilisateur) arg0.getSession().getAttribute("user");
		long fin = System.currentTimeMillis();
		Log.info("temps prendre un user de la session depuis getUtilisateurSession :"+
		(fin-debut));
		return user;
	}

	public static final String getMessageProperties(String keyMessage) {
		String message = null;
		ResourceBundle bundle = ResourceBundle.getBundle("ApplicationResources");
		if (bundle != null) {
			message = bundle.getString(keyMessage);
		}
		return message;
	}

	public static final String getMessageProperties(String keyMessage,	Locale local) {
		String message = null;
		ResourceBundle bundle = ResourceBundle.getBundle(
				"ApplicationResources", local);

		if (bundle != null) {
			message = bundle.getString(keyMessage);

		}
		return message;
	}

	/**
	 * methode appelï¿½e aprï¿½s la connexion de d'un utilisateur quelconque,
	 * qui sert a mettre en place les variables de l'application par type
	 * utilisateur
	 * 
	 * @param request
	 * @param userVO
	 * @param Ppm
	 * @throws RcEjbException
	 * @throws NamingException
	 */
	public static void setUtilisateurConstants(HttpServletRequest request,
			Utilisateur userVO) throws RemoteException, RcEjbException,
			NamingException {		
		request.getSession().setAttribute(CODEUSER, userVO.getRcCodUser());
		request.getSession().setAttribute(CODEPPM, userVO.getCodeppm());
		request.getSession()
				.setAttribute(NOMUSER, userVO.getRcIdentification());
		request.getSession().setAttribute(MODULE, userVO.getModule1());
		request.getSession().setAttribute(INDCONNECT, userVO.getRcIndconnect());
		request.getSession().setAttribute(LIBELLEPROFIL,
				userVO.getProfilUser().getRcLibelleProfil());

	}

	/**
	 * methode appelï¿½e apï¿½s la connexion de l'utilisateur(Declarant), qui
	 * sert a mettre en place les variables de l'application par type
	 * utilisateur
	 * 
	 * @param request
	 * @param userVO
	 * @param Ppm
	 * @throws RcEjbException
	 * @throws NamingException
	 * @throws FinderException
	 * @throws TwreException
	 * 
	 */
	public static void setupDeclarantConstants(HttpServletRequest request,
			Utilisateur userVO, Ppm ppm) throws RcEjbException,
			NamingException, FinderException, TwreException {

		try {

			if (ppm != null) {
				// Vérifier si le déclarant est créditaire ou Ambassade
				AmbassadeOrganisme ambassadeorganismeVO = null;

				List<Creditaire> vectcrd = gaindeBusinessDelegate.rechercherCreditaireByWhere(ppm.getRccodeppm());

				if (vectcrd.size() == 0) {

					if (ppm.getRcnumregpreferentiel() == null
							|| ppm.getRcnumregpreferentiel().equals("")) {
						throw new TwreException(
								ConstErrCod.ACCESS_DENIED_DECLARANT);
					} else {
						ambassadeorganismeVO =  gaindeBusinessDelegate
								.getAmbassadeOrganisme(ppm.getRcnumregpreferentiel());
						if(ambassadeorganismeVO==null){
							throw new TwreException(ConstErrCod.ROW_NOTFOUND);
						}
						
	                      List<RegimeDeclarant> vectrd= gaindeBusinessDelegate.rechercheByWhereRegimeDeclarant(ppm.getRccodeppm());
	                       if(vectrd.size() ==0){
	                    	   throw new TwreException(
	                                   ConstErrCod.accessDeniedDeclarantRegime);
	                       }
	                       
					}
				}

				request.getSession().setAttribute(NOMPPM, ppm.getNomPrenom());
				request.getSession().setAttribute(CODEAGREE,
						userVO.getCodeagree());
				request.getSession().setAttribute(CODE_CONSIGNATAIRE,
						ppm.getRccodeconsignataire());
				request.getSession().setAttribute(CODECREDITAIRE,
						ppm.getRccodecreditaire());

				/**
				 * request.getSession().setAttribute(CODECREDITAIRE,
				 * Creditaire.getRccodecreditaire());
				 */

			}
		} catch (TwreException e) {
			logger.error("Session.setupDeclarantConstants()"
					+ e.getMessage());
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCod.ROW_NOTFOUND)) {
				throw new TwreException(ConstErrCod.ACCESS_DENIED_DECLARANT);
			} else {
				throw new TwreException(e.getMessage());
			}

		}
	}

	/**
	 * methode appelï¿½e apï¿½s la connexion de l'utilisateur(Consignataire),
	 * qui sert a mettre en place les variables de l'application par type
	 * utilisateur
	 * 
	 * @param request
	 * @param userVO
	 * @param Ppm
	 * @throws NamingException
	 * @throws TwreException
	 */
	public static void setupConsignataireConstants(HttpServletRequest request,
			Utilisateur userVO, Ppm ppm) throws NamingException, TwreException {

		logger.debug("Session.setupConsignataireConstants()"
				+ userVO.getRcCodUser());

		try {

			if (ppm != null) {
				Creditaire creditaire = null;
				List<Creditaire> vectcrd =  gaindeBusinessDelegate.rechercherCreditaireByWhere(ppm.getRccodeppm());
								
				if ((vectcrd != null)&&(vectcrd.size() == 0)) {
					logger.debug("vectrd.size=0");
					throw new TwreException(ConstErrCod.ACCESS_DENIED_DECLARANT);
				} else if ((vectcrd != null)&&(vectcrd.size()>0)){
					creditaire = (Creditaire) vectcrd.get(0);
					logger.debug("creditaire:" + creditaire);
				}
				List<SoumissionCreditaire> soumcons = null;
				String rcCodeCreditaire = null;
				if(creditaire != null){
					rcCodeCreditaire = creditaire.getRcCodeCreditaire();
				}
				
				soumcons = (List<SoumissionCreditaire>) gaindeBusinessDelegate
						.getWhereSoumissionConsignation(rcCodeCreditaire,
								ConstManif.SOUMISSIONCONSIGNATION);

				if (soumcons.size() == 0) {
					throw new TwreException(
							ConstErrCod.ACCESS_DENIED_CONSIGNATAIRE);
				} else {
					logger.debug("soumCredWhere" + soumcons.size());
					request.getSession().setAttribute(NOMPPM,
							ppm.getNomPrenom());
					Consignataire consignatairesVO = null;
					List<Consignataire> listConignataire = (List<Consignataire>) 
							gaindeBusinessDelegate.getConsignataires(ppm.getRccodeppm());

					if (listConignataire.size() == 0) {
						throw new TwreException(
								ConstErrCod.ACCESS_DENIED_CONSIGNATAIRE);
					} else {

						consignatairesVO = (Consignataire) listConignataire
								.get(0);
					}

					request.getSession().setAttribute(CODE_CONSIGNATAIRE,
							consignatairesVO.getRcCodeConsignataire());
					request.getSession().setAttribute(CODECREDITAIRE,
							creditaire.getRcCodeCreditaire());

				}
			}

		} catch (Exception e) {

			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCod.ROW_NOTFOUND)) {
				throw new TwreException(
						ConstErrCod.ACCESS_DENIED_NOT_CREDITAIRE);
			} else {
				throw new TwreException(e.getMessage());
			}

		}
	}

	/**
	 * methode appelï¿½e apï¿½s la connexion de l'utilisateur(DOUANIER), qui
	 * sert a mettre en place les variables de l'application par type
	 * utilisateur
	 * 
	 * @param request
	 * @param userVO
	 * @param Ppm
	 * @throws NamingException
	 */
	public static void setupDouanierConstants(HttpServletRequest request, Utilisateur userVO, Ppm ppm) throws TwreException, NamingException {

		AgentDouane agentdouaneVO = null;

		try {

				List<AgentDouane> vagent = gaindeBusinessDelegate.getAgentDouanes(userVO.getRcCodUser());
			    agentdouaneVO = (AgentDouane) vagent.get(0);
				
				request.getSession().setAttribute(CODEAGENT,
						agentdouaneVO.getRcCodeAgent());
				request.getSession().setAttribute(BUREAUACT,
						agentdouaneVO.getRcCodeBurAct());
				request.getSession().setAttribute(NOMAGENT,
						agentdouaneVO.getRcCodeBurAff());
				request.getSession().setAttribute(PRENOMAGENT,
						agentdouaneVO.getRcCodeMad());
				request.getSession().setAttribute(RCCODEUSER,
						agentdouaneVO.getRcCodeUser());
				request.getSession().setAttribute(CODEPROFIL,
						userVO.getRcCodeProfil());

		} catch (Exception e) {
			throw new TwreException(ConstErrCod.ACCES_DENIED);
		}

	}

	protected void removeSession(String ses, HttpServletRequest request) {		
		if (ses != null) {
			HttpSession session = request.getSession();
			session.removeAttribute(ses);		
		}
	}

	/**
	 * methode appelï¿½e apï¿½s la connexion de l'utilisateur(Tresor), qui sert
	 * a mettre en place les variables de l'application par type utilisateur
	 * 
	 * @param request
	 * @param userVO
	 * @param Ppm
	 */
	public static void setupTresorConstants(HttpServletRequest request,
			Utilisateur userVO, Ppm ppm) {
		request.getSession().setAttribute(CODEUSER, userVO.getRcCodUser());
		request.getSession().setAttribute(CODEPPM,
				userVO.getRcCodUser().substring(0, 6));
		request.getSession()
				.setAttribute(NOMUSER, userVO.getRcIdentification());
		request.getSession().setAttribute(MODULE, userVO.getModule1());

		if (ppm != null) {
			request.getSession().setAttribute(NOMPPM, ppm.getRcnomppm());
			userVO.setCodeppm(ppm.getRccodeppm());
			userVO.setCodeagree(ppm.getRccodeagree());
			userVO.setCodecreditaire(ppm.getRccodecreditaire());
		}
	}

	/**
	 * methode qui retourne le code utilisateur connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeuser(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODEUSER);
	}

	/**
	 * methode qui retourne le code ppm de l'utilisateur connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeppm(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODEPPM);
	}

	/**
	 * methode qui retourne le nom de l'utilisateur connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getNomuser(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(NOMUSER);
	}

	/**
	 * methode qui retourne le nom ppm de l'utilisateur connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getNomppm(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(NOMPPM);
	}

	/**
	 * methode qui retourne le module sur lequel l'utilisateur est connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getModule(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(MODULE);
	}

	/**
	 * methode qui retourne le code consignataire connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeConsignataire(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODE_CONSIGNATAIRE);
	}

	/**
	 * methode qui retourne le code creditaire connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeCreditaire(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODECREDITAIRE);
	}

	/**
	 * @return Renvoie pNOMPPM.
	 */
	public static String getPNOMPPM(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(PNOMPPM);
	}

	/**
	 * methode qui retourne le code agent douane connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeagent(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODEAGENT);
	}

	/**
	 * methode qui retourne le code bureau activitï¿½ de l'agent douane
	 * connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getCodeBurAct(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(BUREAUACT);
	}

	/**
	 * methode qui retourne le libelle du profil de l'agent douane connectï¿½
	 * 
	 * @param request
	 * @return
	 */
	public static String getlibelleprofil(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(LIBELLEPROFIL);
	}

	public static String getCodeprofil(HttpServletRequest request) {
		return (String) request.getSession().getAttribute(CODEPROFIL);
	}

	@JSON(serialize = false)
	public Utilisateur getUser() {
		return user;
	}
	


}