package sn.com.douane.web.testSession;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.jfree.util.Log;

import sn.com.douane.ejb.rc.model.entities.Utilisateur;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Intercepteur permettant de vérifier si la session a expiré ou pas
 * 
 */
public class SessionCheckInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger
			.getLogger(SessionCheckInterceptor.class);

	public void destroy() {
		LOG.debug(" SessionCheckInterceptor destroy() is called...");		
	}

	public void init() {
		LOG.debug(" SessionCheckInterceptor init() is called...");		
	}

	/**
	 * verifier pour toutes les actions si la session n'a pas encore expirée en
	 * verifiant l'attribut user
	 */
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();

		if (request != null && request.getSession() != null) {
			ActionMapping action = (ActionMapping) request
					.getAttribute("struts.actionMapping");
			LOG.info("Session ID $$$ : "+request.getSession().getId());
			// l'action doit etre differente de login.action
			if (action != null && (!action.getName().isEmpty())) {
				Utilisateur userConnected = (Utilisateur) request.getSession()
						.getAttribute("user");
				if (userConnected == null && action.getName().compareTo("login") != 0 
						&& (action.getName().compareTo("logout") != 0)
							&& (action.getName().compareTo("defaultAction") != 0)
							&& (action.getName().compareTo("welcomePage") != 0)
							&& (action.getName().compareTo("redirect") != 0)) {
						LOG.debug("la session a expirée ...");
						return "sessionexpired";
				}
				
			}
			
		}
		
		return actionInvocation.invoke();
	}

}
