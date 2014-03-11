package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.acegisecurity.providers.encoding.ShaPasswordEncoder;
import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.Session;
import sn.com.douane.web.rc.form.UtilisateurForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class UtilisateurAction extends GeneralDispatchAction implements ScopedModelDriven<UtilisateurForm>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5457223708364574333L;
	
	private UtilisateurForm utilisateurForm;
	
	private String scopeKey;
	
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	public String unspecified()  throws Exception {        
      
		HttpServletRequest request = ServletActionContext.getRequest();
         List<LabelValue> vtu = null;
         List<LabelValue> vmod = new ArrayList<LabelValue>();	
         String forward = null;
        try {
            
             vtu = gaindeBusinessDelegate.getListTypeUtilisateurs();
             vmod.add(new LabelValue("",""));
             vmod.add(new LabelValue(Session.getMessageProperties("codmodmanif",request.getLocale()), Session.getMessageProperties("codmodmanif",request.getLocale())));
             vmod.add(new LabelValue(Session.getMessageProperties("codmodtresor",request.getLocale()), Session.getMessageProperties("codmodtresor",request.getLocale())));
             vmod.add(new LabelValue(Session.getMessageProperties("codmoddecl",request.getLocale()), Session.getMessageProperties("codmoddecl",request.getLocale())));
             vmod.add(new LabelValue(Session.getMessageProperties("codmodrc",request.getLocale()), Session.getMessageProperties("codmodrc",request.getLocale())));
             vmod.add(new LabelValue(Session.getMessageProperties("codmoddouan",request.getLocale()), Session.getMessageProperties("codmoddouan",request.getLocale())));
            // do something here

        } catch (RcEjbException	e) {
          log.error("UtilisateurACT.unspecified()Exception= "+e.getMessage());
            // Report the error using the appropriate name and ID.
           
          	addActionError(e.getMessage());
        }finally{
        	String page=request.getParameter("page");
        	if(page!=null && page.equals("changePW")) {
        		 forward = "changePW";
        	} else {
        		forward = "user";
        	}
        	request.setAttribute("listtypuser",vtu);
        	request.setAttribute("listmodule",vmod);
        }

        log.info("forward = "+forward);
        return forward;
    }

	 public String changePW()throws Exception {
		 HttpServletRequest request = ServletActionContext.getRequest();
		 String forward = null;
	       	
	        try {
			if (utilisateurForm.getNumPassWordOB() != null
					&& utilisateurForm.getNumPassWordOB().equals(
							utilisateurForm.getNumConfPassWordOB())) {

				String key = Session.getUtilisateurSession(request)
						.getRcCodUser().toString();
				Utilisateur vo = ((Utilisateur) gaindeBusinessDelegate
						.chercherUtilisateurByPrimaryKey(key));
				ShaPasswordEncoder encoder = new ShaPasswordEncoder();
				vo.setRcMotPasse(encoder.encodePassword(utilisateurForm
						.getNumPassWordOB().toUpperCase(), null));
				if (vo.getRcCodUser().trim().toUpperCase() != null
						&& (encoder.encodePassword(vo.getRcCodUser().trim()
								.toUpperCase(), null)
								.equals(encoder.encodePassword(utilisateurForm
												.getNumPassWordOB().toUpperCase(), null)))) {
					throw new TwreException(ConstErrCod.confpwerrPwdEqualCodeUser);
				}
				// vo.setRcmotpasse(utilisateurFB.getTNUM_PassWord_OB());
				//vo.setRcIndconnect(ConstErrCodRC.etatConnected);
				// vo.setRcisadmin(request.getRemoteAddr());
				gaindeBusinessDelegate.modifierUtilisateur(vo);
				addActionError(getText(ConstErrCod.succefulChangePwd));
			} else {
				throw new TwreException(ConstErrCod.confpwerr);
			}
			forward = "index";
	        } catch (Exception e) {
	            // Report the error using the appropriate name and ID.	
	        	forward = "changePW";
	            addActionError(getText(e.getMessage()));
	           
	        }finally{        	
	        	 forward = "changePW";
	        }

	        // If a message is required, save the specified key(s)
	        // into the request for use by the <struts:errors> tag.

	        // Finish with
	        return forward;
	    }
		
	@Override
	public UtilisateurForm getModel() {		
		return utilisateurForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(UtilisateurForm form) {
		this.utilisateurForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public UtilisateurForm getUtilisateurForm() {
		return utilisateurForm;
	}


	public void setUtilisateurForm(UtilisateurForm utilisateurForm) {
		this.utilisateurForm = utilisateurForm;
	}
	

}
