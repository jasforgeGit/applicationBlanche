package sn.com.douane.web.testSession;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.web.rc.GeneralDispatchAction;
/**
 * Listener permettant de liberer la signature d'un utilisateur 
 * apres un certain timeOut definit dans web.xml (30mn)
 *
 */
public class SessionListener extends GeneralDispatchAction implements HttpSessionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();	

	public void sessionCreated(HttpSessionEvent event) {	
		log.info("Session Created: " + event.getSession().getId());
	}

	public void sessionDestroyed(HttpSessionEvent event) {

 		if(event.getSession()!=null){
 			Utilisateur user = (Utilisateur) event.getSession().getAttribute("user"); 
 	 		if(user!=null){
 	 			try {
 	 				closeAllSession(event.getSession());
 					gaindeBusinessDelegate.libererSignature(user.getRcCodUser());
 					log.info("Session expirée et Signature libérée : "+ user.getRcCodUser());
 				} catch (RcEjbException e) {
 					log.error(e);
 				} 			
 	 		}
 	 		
 		}	
 		
	}

}