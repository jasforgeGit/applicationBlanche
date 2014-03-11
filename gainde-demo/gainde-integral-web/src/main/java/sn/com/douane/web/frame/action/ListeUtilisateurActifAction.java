package sn.com.douane.web.frame.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.acegisecurity.providers.encoding.ShaPasswordEncoder;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.model.entities.CtrlUser;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.frame.action.manager.ListeUtilisateurActifForm;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.Session;
import sn.com.douane.web.testSession.TestSession;

import sn.com.douane.utils.ConstManif;

public class ListeUtilisateurActifAction extends GeneralDispatchAction implements ScopedModelDriven<ListeUtilisateurActifForm> {

	private static final long serialVersionUID = 7796889427122171847L;
	private ListeUtilisateurActifForm listeUtilisateurActifForm;
    private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	TestSession testSession=new TestSession();
	public ListeUtilisateurActifAction() {
		super();
	}

	private void getListeUser() throws Exception {
		try {
		
		    List<CtrlUser> listeUser = null;
			String where = "";
			if(listeUtilisateurActifForm.getAbonne() != null && !listeUtilisateurActifForm.getAbonne().equalsIgnoreCase("")){
				where = where + " where abonne = '"+listeUtilisateurActifForm.getAbonne()+"' ";
			}
			where = where + " order by abonne ASC";
			listeUser = (List<CtrlUser>) gaindeBusinessDelegate.rechercherListeUtilisateur("from CtrlUser"+where);
			listeUtilisateurActifForm.setListeUser(listeUser);
		} catch (Exception e) {
		}
	}

	public String unspecified()
			throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		try {
			getListeUser();
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(e.getMessage()));
			
		}
		return page;
	}
	
	public String rechercherUser()
			throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		try {
			List<CtrlUser> listeUser = null;
			String where = "";
			if(listeUtilisateurActifForm.getAbonne() != null && !listeUtilisateurActifForm.getAbonne().equalsIgnoreCase("")){
				where = where + " where abonne = '"+listeUtilisateurActifForm.getAbonne()+"' ";
			}
			where = where + " order by abonne ASC";
			listeUser = (List<CtrlUser>) gaindeBusinessDelegate.rechercherListeUtilisateur("from CtrlUser"+where);
			listeUtilisateurActifForm.setListeUser(listeUser);
			if(listeUser == null || listeUser.size()==0){
				addActionError(getText(ConstErrCod.userNonConnecte));
			
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(e.getMessage()));
		}
		return page;
	}

	public String libererSignature() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = "libererSignature";
		try {

			String pk = request.getParameter(ConstManif.PK);
			
			listeUtilisateurActifForm.setPk(pk);
			gaindeBusinessDelegate.libererSignature(pk);
			getListeUser();
			addActionError(getText(
					ConstErrCod.liberationSignatureUser1));
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(
					ConstErrCod.liberationSignatureUser2));
		}
		return page;
	}
	
	public String libererUneSignature() throws Exception {
		String page = "liberationUneSignature";
		try {
			if(listeUtilisateurActifForm.getAbonne() != null && !listeUtilisateurActifForm.getAbonne().equalsIgnoreCase("")){
				String key = listeUtilisateurActifForm.getAbonne();
				CtrlUser ur = null;
				ur = gaindeBusinessDelegate.chercherCtrlUserByPrimaryKey(key);
				if (ur!=null && ur.getAbonne()!= null && !ur.getAbonne().equalsIgnoreCase("")) {
	
					String pk = listeUtilisateurActifForm.getAbonne();					
					gaindeBusinessDelegate.libererSignature(pk);
					addActionError(getText(
							ConstErrCod.liberationSignatureUser1));
				}else{
					addActionError(getText(
							ConstErrCod.reinintPwdUser3));
				}
			}else{
				addActionError(getText(
						ConstErrCod.reinintPwdUser1));			
			}
			
			
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(
					e.getMessage()));
		}
		return page;
	}

	
	public String libererUneSignature2() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = "liberationUneSignature2";
		try {
			if(listeUtilisateurActifForm.getAbonne() != null && !listeUtilisateurActifForm.getAbonne().equalsIgnoreCase("")){
				
				String code=(String)request.getParameter("abonne");
				if (code!= null && testSession.find3(code)!=null) {
//					String cd=(String)request.getSession().getAttribute("RNCODE");
					testSession.libererUneSignature(code);
					addActionError(getText(ConstErrCod.liberationSignatureUser1));
					//if(cd!=null && code!=null && code.equals(cd));
//					if(sysEnv.compare(cd.toString(), code.toString())==true);
//					{
//						page="login";
//					}
//					if(sysEnv.compare(cd.toString(), code.toString())==false);
//					{
						 page = "liberationUneSignature2";
//					}
				}else{
					addActionError(getText(
							ConstErrCod.reinintPwdUser3));
				}
			}else{
				addActionError(getText(
						ConstErrCod.reinintPwdUser1));			
			}
			
			
		} catch (Exception e) {
			addActionError(getText(
					e.getMessage()));
		}

		// Finish with
		return page;
	}
	
	public String libererSignatureAll() throws Exception {
	
		String page = "libererSignature";
		try {
			gaindeBusinessDelegate.libererSignatureAll();
			getListeUser();
			addActionError(getText(
					ConstErrCod.liberationSignatureUser1));
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(
					ConstErrCod.liberationSignatureUser2));
		}
		return page;
	}

	public String reinitialiserPWD() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();	
		String page = "reinitialiserPWD";
		try {
			
			if(listeUtilisateurActifForm.getAbonne() != null && !listeUtilisateurActifForm.getAbonne().equalsIgnoreCase("")){
				String key = listeUtilisateurActifForm.getAbonne();
				Utilisateur ur = null;
				ur = gaindeBusinessDelegate.chercherUtilisateurByPrimaryKey(key);
				if (ur.getRcCodUser()!= null && !ur.getRcCodUser().equalsIgnoreCase("")) {
					ShaPasswordEncoder encoder = new ShaPasswordEncoder();		
					ur.setRcMotPasse(encoder.encodePassword(listeUtilisateurActifForm.getAbonne().trim(),null));
                    gaindeBusinessDelegate.modifierUtilisateur(ur);
					String pk = Session
							.getUtilisateurSession(request).getRcCodUser();
					gaindeBusinessDelegate.libererSignature(pk);
					addActionError(getText(
							ConstErrCod.reinintPwdUser2));
				}else{
					addActionError(getText(
							ConstErrCod.reinintPwdUser3));
				}
			}else{
				addActionError(getText(
						ConstErrCod.reinintPwdUser1));			
			}
			
		} catch (Exception e) {
			addActionError(getText(
					ConstErrCod.rowNotFound));
		}
		return page;
	}

	@Override
	public ListeUtilisateurActifForm getModel() {		
		return listeUtilisateurActifForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(ListeUtilisateurActifForm form) {
		this.listeUtilisateurActifForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public ListeUtilisateurActifForm getListeUtilisateurActifForm() {
		return listeUtilisateurActifForm;
	}


	public void setListeUtilisateurActifForm(ListeUtilisateurActifForm listeUtilisateurActifForm) {
		this.listeUtilisateurActifForm = listeUtilisateurActifForm;
	}
}
