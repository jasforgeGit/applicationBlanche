package sn.com.douane.web.frame.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.FinderException;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.acegisecurity.providers.encoding.ShaPasswordEncoder;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.CtrlUser;
import sn.com.douane.ejb.rc.model.entities.Messages;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.Session;
import sn.com.douane.web.testSession.TestSession;
import tn.com.tw.java.exception.ConstErrCodDECL;
import tn.com.tw.java.exception.TwreException;

/**
 * The Class LoginAction.
 */
public class LoginAction extends GeneralDispatchAction implements SessionAware {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7687224555370759213L;

	/** The session. */
	private Map<String, Object> session = new HashMap<String, Object>();

	/** The area. */
	private String area;

	/** The login. */
	private String login = null;

	/** The password. */
	private String password = null;

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(LoginAction.class);

	/** The gainde business delegate. */
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	/** The test session. */
	TestSession testSession = new TestSession();

	// utilisé pour sauvegarder la valeur du message
	private boolean messageChecked;

	// message à afficher pour etre lu et acccepter
	private String messageToAccept = "message to be replaced from database";

	/**
	 * Login.
	 * 
	 * @return the string
	 * @throws Exception
	 *             the exception
	 */
	public String login() throws Exception {

		if (this.getLogin() != null && this.getLogin().equals("")) {
			addActionError(getText("error.required.login"));
			return "input";
		} else if (this.getPassword() != null && this.getPassword().equals("")) {
			addActionError(getText("error.required.pwd"));
			return "input";
		} else {

			// fin validation couche controleur struts 2
			Utilisateur utilisateurFound = gaindeBusinessDelegate
					.rechercheUtilisateur(getLogin().trim());

			if (utilisateurFound == null) {
				addActionError(getText("error.loginError"));
				return "input";
			} else {
				HttpServletRequest request = ServletActionContext.getRequest();
				Session.setUtilisateurSession(request, utilisateurFound);
				if (getPassword().toUpperCase().equals(
						utilisateurFound.getRcMotPasse())) {
					logger.debug(">>>> user found corectly ");
					setupGaindeSession(request, utilisateurFound);
					logger.debug(">>>> setupGaindeSession corectly");
					return "index";
				} else {
					logger.debug("user found & error password ");
					addActionError(getText("error.errpassword"));
					return "input";
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sn.com.douane.web.rc.GeneralDispatchAction#removeSession(java.lang.String
	 * , javax.servlet.http.HttpServletRequest)
	 */
	protected void removeSession(String ses, HttpServletRequest request) {
		if (ses != null) {
			HttpSession session = request.getSession();
			session.removeAttribute(ses);
		}
	}

	/**
	 * Check.
	 * 
	 * @return true, if successful
	 * @throws TwreException
	 *             the twre exception
	 */
	public boolean check() throws TwreException {
		if (this.getLogin() != null && this.getLogin().equals("")) {
			addActionError(getText("error.required.login"));
			return false;
		}
		if (this.getPassword() != null && this.getPassword().equals("")) {
			addActionError(getText("error.required.pwd"));
			return false;
		}

		return true;
	}
	
	/**
	 * Login1.
	 * 
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ServletException
	 *             the servlet exception
	 */
	public String login2() throws IOException, ServletException {

		HttpServletRequest request = ServletActionContext.getRequest();
		String l_result = "login";
		String RNCODE = "";
		CtrlUser ctrlUserVO = null;
		Utilisateur user = null;

		try {

			check();

			try {
				ctrlUserVO = getCtrlUtilisateur(getLogin().toUpperCase());

				RNCODE = getLogin().toUpperCase();

				if (testSession.find3(RNCODE) == null) {
					request.getSession().setAttribute("RNCODE", RNCODE);
					user = gaindeBusinessDelegate
							.rechercheUtilisateur(getLogin().trim()
									.toUpperCase());
				} else {
					if (testSession.find3(RNCODE).equals(RNCODE)) {
						l_result = "index";
						addActionError(getText(ConstErrCod.errorIP));
					}
				}

			} catch (Exception e) {
				logger.error("login Exception--pour getUtilisateurRemote -"
						+ e.getMessage());
			}

			Session.setUtilisateurSession(request, user);

			ShaPasswordEncoder encoder = new ShaPasswordEncoder();

			if (getLogin().trim().toUpperCase() != null
					&& (user != null)
					&& user.getRcCodUser() != null
					&& getLogin().trim().toUpperCase()
							.equals(user.getRcCodUser().toUpperCase())) {

				if (encoder.encodePassword(getPassword().trim().toUpperCase(),
						null) != null
						&& encoder.encodePassword(
								getPassword().trim().toUpperCase(), null)
								.equals(user.getRcMotPasse())) {
					if (ctrlUserVO == null) {
						addUtilisateur(request, getLogin().toUpperCase());
					}
					testSession.connecterSession(request.getSession(), RNCODE);
					if (user.getRcCodUser() != null
							&& user.getRcCodUser().startsWith("T")
							&& user.getRcCodUser().length() == 7) {
						String ppm = user.getRcCodUser().substring(1, 5);
						List<Creditaire> vector = gaindeBusinessDelegate
								.rechercherCreditaireByWhere(ppm);

						for (int i = 0; i < vector.size(); i++) {
							Creditaire creditairesVO = (Creditaire) vector
									.get(i);
							if (creditairesVO.getRcCodeSuspension() != null
									&& creditairesVO.getRcCodeSuspension()
											.equals("1")) {
								throw new TwreException(
										ConstErrCodDECL.CREDIT_SUSP);
							}
						}
					}

					// Test si login = password on bascule � l'�cran de
					// changement de mot de passe
					if (user.getRcCodUser().trim().toUpperCase() != null
							&& (encoder.encodePassword(user.getRcCodUser()
									.toUpperCase(), null).equals(user
									.getRcMotPasse()))) {
						l_result = "ChangePw";
					} else {
						l_result = "index";
					}

				} else {
					throw new TwreException("error.errpassword");
				}

				setupGaindeSession(request, user);
				logger.info(user.getRcIsAdmin()
						+ "=ur.getRcisadmin() LoginAction.login1() "
						+ request.getRemoteAddr());

			} else {
				throw new TwreException("error.errpassword");
			}

		} catch (TwreException e) {
			logger.error("login Exception---" + e.getMessage());
			l_result = "login";
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCod.sessionAlreadyOpen)) {
				addActionError(e.getMessage());
			} else {
				addActionError(getText(e.getMessage()));
			}
		}

		return l_result;
	}

	private boolean confirmMessage(Utilisateur user) {
		if ((user.getRcEtatMessage() == null) || (user.getRcEtatMessage().compareTo("0") == 0)) {
			return true;
		} else
			return false;
	}

	/**
	 *login1.
	 * 
	 * @return the string
	 * @throws NamingException
	 *             the naming exception
	 */
	public String login1() throws NamingException {

		HttpServletRequest request = ServletActionContext.getRequest();
		String lResult = "login";		
		Utilisateur ur = null;
		try {
			
			check();
			
			CtrlUser ctrlUserVO = null; 
			try {
				
				ctrlUserVO = getCtrlUtilisateur(getLogin()
						.toUpperCase());
				
				if (ctrlUserVO==null || ctrlUserVO.getAbonne() == null) {
					ur = gaindeBusinessDelegate.rechercheUtilisateur(login.trim().toUpperCase());
				} else {
					if(ctrlUserVO.getAbonne().trim().toUpperCase().equals(getLogin().trim().toUpperCase())){
						lResult = "index";
						addActionError(getText(ConstErrCod.errorIP));
					}
				}
			} catch (Exception e) {
				logger.fatal("login Exception--pour getUtilisateurRemote -"
						+ e.getMessage());
			}
			

			Session.setUtilisateurSession(request, ur);
			ShaPasswordEncoder encoder = new ShaPasswordEncoder();

			if ((this.getLogin().trim().toUpperCase() != null)
					&& (ur != null)
					&& (ur.getRcCodUser()) != null
					&& (this.getLogin().trim().toUpperCase().equals(ur
							.getRcCodUser().toUpperCase()))) {

				if (encoder.encodePassword(this.getPassword().trim()
						.toUpperCase(), null) != null
						&& encoder.encodePassword(
								this.getPassword().trim().toUpperCase(), null)
								.equals(ur.getRcMotPasse())) {
					
					if (ctrlUserVO == null) {
						addUtilisateur(request, getLogin().toUpperCase());
					}
					
					if (ur.getRcCodUser() != null
							&& ur.getRcCodUser().startsWith("T")
							&& ur.getRcCodUser().length() == 7) {
						String ppm = ur.getRcCodUser().substring(1, 5);
						List<Creditaire> vector = (List<Creditaire>) gaindeBusinessDelegate
								.rechercherCreditaireByWhere(ppm);
						for (int i = 0; i < vector.size(); i++) {
							Creditaire creditairesVO = (Creditaire) vector
									.get(i);
							if (creditairesVO.getRcCodeSuspension() != null
									&& creditairesVO.getRcCodeSuspension()
											.equals("1")) {
								throw new TwreException(
										ConstErrCodDECL.CREDIT_SUSP);
							}
						}
					}
										
					session.put("login", getLogin());
					session.put("password", getPassword());

					// Test si login = password on bascule à l'écran de
					// changement de mot de passe
					if (ur.getRcCodUser().trim().toUpperCase() != null
							&& (encoder.encodePassword(ur.getRcCodUser()
									.toUpperCase(), null).equals(ur
									.getRcMotPasse()))) {
						lResult = "ChangePw";
					} else {
						lResult = "index";
					}

				} else {
					log.error("Error password ");
					throw new TwreException("error.errpassword");
				}
				setupGaindeSession(request, ur);
				logger.debug(ur.getRcIsAdmin()
						+ "=ur.getRcisadmin() LoginAction.login1() "
						+ request.getRemoteAddr());

			} else {
				log.error("user null --> login : "+this.getLogin());
				throw new TwreException("error.errpassword");
			}

		} catch (TwreException e) {
			logger.fatal("login Exception---" + e.getMessage());
			lResult = "login";
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCod.sessionAlreadyOpen)) {
				addActionError(getText(e.getMessage(), e.getValeurAffiche()));
			} else {
				addActionError(getText(e.getMessage()));
			}
		}
		
		return lResult;
	}

	/**
	 * Setup gainde session.
	 * 
	 * @param request
	 *            the request
	 * @param userVO
	 *            the user vo
	 * @throws TwreException
	 *             the twre exception
	 */
	private void setupGaindeSession(HttpServletRequest request,
			Utilisateur userVO) throws TwreException {

		Ppm ppmVO = null;		
		String typeuser = null;

		logger.info("begin setupGaindeSession ...");

		try {

			typeuser = userVO.gettypeUser().getRcTypeUser();
			Session.setUtilisateurConstants(request, userVO);

			if (ConstManif.TYPE_USER_CONSIGNATAIRE.equals(typeuser)) {
				
				ppmVO = gaindeBusinessDelegate.rechercherPpmByWhere(" from Ppm where rccodeppm ='"+userVO
						.getRcCodUser().substring(1, 6)+"'");
				Session.setupConsignataireConstants(request, userVO, ppmVO);
				request.getSession().setAttribute("TYPEUSER",
						ConstManif.TYPE_USER_CONSIGNATAIRE);
			} else if (ConstManif.TYPE_USER_DECLARANT.equals(typeuser)) {
				ppmVO = gaindeBusinessDelegate.rechercherPpmByWhere(" from Ppm where rccodeppm ='"+userVO
						.getRcCodUser().substring(1, 6)+"'");
				Session.setupDeclarantConstants(request, userVO, ppmVO);
				request.getSession().setAttribute("TYPEUSER",
						ConstManif.TYPE_USER_DECLARANT);
			} else if (ConstManif.TYPE_USER_DOUANIER.equals(typeuser)) {
				Session.setupDouanierConstants(request, userVO, null);
				request.getSession().setAttribute("TYPEUSER",
						ConstManif.TYPE_USER_DOUANIER);
			} else if (ConstManif.TYPE_USER_TRESOR.equals(typeuser)) {
				Session.setupTresorConstants(request, userVO, null);
				request.getSession().setAttribute("TYPEUSER",
						ConstManif.TYPE_USER_TRESOR);
			} else {
				ppmVO = gaindeBusinessDelegate.rechercherPpmByWhere(" from Ppm where rccodeppm ='DDDDD'");
				if (ppmVO == null) {
					throw new TwreException(ConstErrCod.ppmKey);
				}
				request.getSession().setAttribute("TYPEUSER",
						ConstManif.TYPE_USER_RC);
			}
			Session.setUtilisateurSession(request, userVO);
			logger.info("End of setup GaindeSession...");
		} catch (TwreException e) {
			throw e;
		} catch (Exception e) {
			throw new TwreException(ConstErrCod.INSPECIFIED_ERROR);
		}

	}

	/**
	 * Logout.
	 * 
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ServletException
	 *             the servlet exception
	 * @throws FinderException
	 *             the finder exception
	 * @throws TwreException
	 *             the twre exception
	 * @throws RcEjbException 
	 */
	public String logout(){

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = "login";
		String key = null;	
		try {
		Utilisateur userConnected  = Session.getUtilisateurSession(request);		
		if(userConnected != null){
			key = userConnected.getRcCodUser();
			log.info("Liberer signature du user : "+key);			
			gaindeBusinessDelegate.libererSignature(key);			
		}
		} catch (RcEjbException e) {
			log.error("erreur au niveau logout : "+e.getMessage());
		} catch (Exception e) {
			log.error("exception inattendu au niveau logout : "+e.getMessage());
		}finally{
			closeAllSession(request);
			session.remove("login");
			session.remove("password");
		}

		return forward;
	}

	/**
	 * Menu.
	 * 
	 * @return the string
	 */
	public String menu() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String ctxmenu = request.getParameter(ConstManif.CTXMENU);
		String lResult = "index";
		String forward = request.getParameter(ConstManif.ACTIONFORWARD);
		String codeFonction = request.getParameter("cft");
		closeSessionFB(request);
		if (ctxmenu != null) {
			request.getSession().setAttribute(ConstManif.CTXMENU, ctxmenu);
			if (codeFonction != null) {
				request.getSession().setAttribute("cft", codeFonction);
			}
			if (forward != null) {
				lResult = forward;
			}
		}
		return lResult;
	}


	/**
	 * Gets the ctrl utilisateur.
	 * 
	 * @param login
	 *            the login
	 * @return the ctrl utilisateur
	 * @throws TwreException
	 *             the twre exception
	 */
	private CtrlUser getCtrlUtilisateur(String login) throws TwreException {
		try {
			CtrlUser data = gaindeBusinessDelegate
					.rechercherCtrlUtilisateur(login);
			return data;
		} catch (Exception e) {

			logger.error("error in getCtrlUtilisateur : " + e.getMessage());
			throw new TwreException(ConstErrCodRC.remoteExpSB);
		}
	}

	/**
	 * Adds the utilisateur.
	 * 
	 * @param req
	 *            the req
	 * @param login
	 *            the login
	 * @throws TwreException
	 *             the twre exception
	 */
	private void addUtilisateur(HttpServletRequest req, String login)
			throws TwreException {

		try {
			String ip = req.getRemoteAddr();
			CtrlUser data = new CtrlUser();
			data.setAbonne(login);
			data.setAdresseIp(ip);
			gaindeBusinessDelegate.insererUtilisateur(data);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new TwreException(ConstErrCodRC.remoteExpSB);
		}
	}

	public String accepterMessage() {

		HttpServletRequest request = ServletActionContext.getRequest();
		Utilisateur user = null;
		String page = "confirmMessage";
		if (isMessageChecked()) {
			user = Session.getUtilisateurSession(request);
			user.setRcEtatMessage("1");
			try {
				gaindeBusinessDelegate.modifierUtilisateur(user);
			} catch (RcEjbException e) {
				logger.error("probléme lors de la mise à jour de l'état du user : "+user.getRcCodUser()+" du à "+e.getMessage());
			}
			page = "index";
		}
		return page;
	}
	
	public String notYetImplemented(){
		addActionError("cette fonctionnalité n'est pas encore implementé");
		return "index";
	}
	
	
	public String redirect(){
	 
		HttpServletRequest request = ServletActionContext.getRequest();
		Utilisateur user = null;
		user = Session.getUtilisateurSession(request);
		if(user != null){
			return "index";
		}else return "login";
		
	}

	/**
	 * Redirect page.
	 * 
	 * @return the string
	 */
	public String redirectPage() {

		return "welcomePage";

	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param value
	 *            the new password
	 */
	public void setPassword(String value) {
		password = value;
	}

	/**
	 * Gets the area.
	 * 
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Sets the area.
	 * 
	 * @param area
	 *            the new area
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Gets the login.
	 * 
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Sets the login.
	 * 
	 * @param login
	 *            the new login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * Gets the session.
	 * 
	 * @return the session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	public String getMessageToAccept() {
		return messageToAccept;
	}

	public void setMessageToAccept(String messageToAccept) {
		this.messageToAccept = messageToAccept;
	}

	public boolean isMessageChecked() {
		return messageChecked;
	}

	public void setMessageChecked(boolean messageChecked) {
		this.messageChecked = messageChecked;
	}
}
