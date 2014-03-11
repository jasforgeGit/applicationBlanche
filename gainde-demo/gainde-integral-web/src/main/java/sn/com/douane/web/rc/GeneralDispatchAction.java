package sn.com.douane.web.rc;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.ActionSupport;

/**
 * DispacthAction fix for stack overflow problem.
 * 
 * @author Moez
 */
public class GeneralDispatchAction extends ActionSupport {

  	private static final long serialVersionUID = 78451258963L;
  	
	protected transient final Log log = LogFactory.getLog(getClass());

    protected void removeSession(String ses, HttpServletRequest request) {
        if (ses != null) {
            HttpSession session = request.getSession();
            session.removeAttribute(ses);
        }
    }
    
    protected void removeSession(String ses, HttpSession session) {
        if (ses != null) {           
            session.removeAttribute(ses);
        }
    }

    public void closeSessionFB(HttpServletRequest request) {
        Enumeration names = request.getSession().getAttributeNames();
        while (names.hasMoreElements()) {
            String element = (String) names.nextElement();
            if (element.endsWith("Form")){
                removeSession(element, request);
            }
        }

    }
    
    public void closeAllSession(HttpServletRequest request) {    	
        Enumeration names = request.getSession().getAttributeNames();
        while (names.hasMoreElements()) {
            String element = (String) names.nextElement();
            removeSession(element, request);
        }        
    }

    public void closeAllSession(HttpSession session) {    	
        Enumeration names = session.getAttributeNames();
        while (names.hasMoreElements()) {
            String element = (String) names.nextElement();
            removeSession(element, session);
        }        
    }
    
    public String returnPrecedent() throws Exception {
    	HttpServletRequest request = ServletActionContext.getRequest();
        return request.getParameter(ConstManif.PAGE);       
    }
    
   
    
    
   
   
}
