package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.CompagnieassisteeDto;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcCompagnieassisteeForm;
import tn.com.tw.java.exception.ConstErrCodRC;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcCompagnieassisteeAction extends GeneralDispatchAction implements SessionAware,ScopedModelDriven<RcCompagnieassisteeForm> {

	private static final long serialVersionUID = 14125487852451L;
    private RcCompagnieassisteeForm rcCompagnieassisteeForm;
    private String scopeKey;
    private Map<String, Object> session;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();
	
	// Champs de saisie
	private Integer codeCompagnieAssistee;
	private String nomCompagnieAssistee;	
	
	private List<CompagnieAssistee> listeRcCompagnieassistee = new ArrayList<CompagnieAssistee>();
	private CompagnieAssistee compagnieAssistee = new CompagnieAssistee();

	/**
	 * Creates and stores a entity "CompagnieAssistee" in the datasource.
	 * 
	 * @param request
	 * @param response
	 * @return result
	 * @throws Exception
	 */
	public String enregistrerRcCompagnieassistee() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcCompagnieassistee" : request.getParameter(ConstManif.PAGE));

		try{			
			CompagnieAssistee compagnieAssistee = new CompagnieAssistee(codeCompagnieAssistee, nomCompagnieAssistee);			
			gaindeBusinessDelegate.ajouterCompagnieAssistee(compagnieAssistee);
			addActionError(getText(ConstErrCodRC.succefulInsert));				
	    } catch (Exception e){	
	    	addActionError(getText(e.getMessage()));	    	
		}
		
		return page;    		
	}

    /**
     * Updates an entity "CompagnieAssistee".
     * 
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	public String modifierRcCompagnieassistee() throws Exception {
		 HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcCompagnieassistee" : request.getParameter(ConstManif.PAGE));

		try {
			CompagnieAssistee compagnieAssistee = new CompagnieAssistee(codeCompagnieAssistee, nomCompagnieAssistee);
			gaindeBusinessDelegate.modifierCompagnieAssistee(compagnieAssistee);
			addActionError(ConstErrCodRC.succefulUpdate);
		}catch (Exception e)	{
			addActionError(e.getMessage());	
			page = "modificationRcCompagnieassistee";
		}
		return page;
	}

    /**
     * Searches an entity "CompagnieAssistee" from datasource.
     * 
     * @param mapping
     * @param form
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

	public String rechercherRcCompagnieassistee() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		 String codecieassistee = (rcCompagnieassisteeForm.getNumCodeCieAssisteeRech()==null ? "" : rcCompagnieassisteeForm.getNumCodeCieAssisteeRech());
		 String nomcieassistee = (rcCompagnieassisteeForm.getNumNomCieAssisteeRech()==null ? "" : rcCompagnieassisteeForm.getNumNomCieAssisteeRech());
		if (!codecieassistee.equals("")) {
			condition += " and codeCieAssistee = "+sysEnv.strToInteger(codecieassistee)+" ";
		}			

		if (!nomcieassistee.equals("")) {
			condition += " and nomCieAssistee LIKE '%"+nomcieassistee+"%' ";
		}

		try
		{
			List<CompagnieassisteeDto> listeRcCompagnieassistee  = gaindeBusinessDelegate.rechercherCompagnieAssistee("from CompagnieAssistee where 1 = 1 "+condition);
			// pour la pagination du grid 
			if (listeRcCompagnieassistee!=null) {
				rcCompagnieassisteeForm.setRecords(listeRcCompagnieassistee.size()); 
				rcCompagnieassisteeForm.setTotal(
						(int) Math.ceil((double)rcCompagnieassisteeForm.getRecords() 
								/ (double)rcCompagnieassisteeForm.getRows())); 
				int to = (rcCompagnieassisteeForm.getRows() * rcCompagnieassisteeForm.getPage());
			    int from = to - rcCompagnieassisteeForm.getRows();
			    if (to > rcCompagnieassisteeForm.getRecords()) {
			    	to = rcCompagnieassisteeForm.getRecords();
			    }
			    listeRcCompagnieassistee = listeRcCompagnieassistee.subList(from, to);
			}
			rcCompagnieassisteeForm.setListeRcCompagnieassistee(listeRcCompagnieassistee);

			if (listeRcCompagnieassistee!=null && listeRcCompagnieassistee.size()!=0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}	
			} else {

				if (ctxmenu.equals("SM")){
					pageResult = "saisieRcCompagnieassistee";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!codecieassistee.equals("")) {
						rcCompagnieassisteeForm.setNumCodeCieAssisteeOB(codecieassistee);				
					}						

					if (!nomcieassistee.equals("")) {
						rcCompagnieassisteeForm.setNumNomCieAssisteeOB(nomcieassistee);					
					}	
				}
				
				else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
				else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

			}
		}catch (Exception e){	
			log.error(e.getMessage());
		}

		if (pageResult==null){
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/**
	 * Removes an entity "CompagnieAssistee" from the datasource.
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */

	public String supprimerRcCompagnieassistee() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer pk = Integer.parseInt(request.getParameter(ConstManif.PK));
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCompagnieassistee" : request.getParameter(ConstManif.PAGE));

		try
		{
            CompagnieAssistee compagnie = new CompagnieAssistee(pk);
            gaindeBusinessDelegate.supprimerCompagnieAssistee(compagnie);
            List<CompagnieAssistee> listeRcCompagnieassistee = (List<CompagnieAssistee>) gaindeBusinessDelegate.getListCompagnieassistee();
            setListeRcCompagnieassistee(listeRcCompagnieassistee);
            addActionError(ConstErrCodRC.succefulDelete);

		} catch (Exception e) {
			
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(e.getMessage());
			}
		}
		
		 return page;
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String afficherRcCompagnieassistee () throws Exception{
		 HttpServletRequest request = ServletActionContext.getRequest();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcCompagnieassistee" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cle de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		CompagnieAssistee compagnieAssistee = (CompagnieAssistee) gaindeBusinessDelegate.rechercherCompagnieAssistee(sysEnv.strToInteger(pk));

		//Affichage dans le formulaire
		rcCompagnieassisteeForm.setCompagnieassistee(compagnieAssistee);

		return page;
		
	}

    /**
     * Iniitializes an entity "CompagnieAssistee".
     * 
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
	
	public String unspecified()	throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			setListeRcCompagnieassistee(new ArrayList<CompagnieAssistee>());

		} catch (Exception e) {
			addActionError(e.getMessage());

		} 
		return page;
	}

	public List<CompagnieAssistee> getListeRcCompagnieassistee() {
		return listeRcCompagnieassistee;
	}

	public void setListeRcCompagnieassistee(List<CompagnieAssistee> listeRcCompagnieassistee) {
		this.listeRcCompagnieassistee = listeRcCompagnieassistee;
	}

	public CompagnieAssistee getCompagnieAssistee() {
		return compagnieAssistee;
	}

	public void setCompagnieAssistee(CompagnieAssistee compagnieAssistee) {
		this.compagnieAssistee = compagnieAssistee;
	}


	public String getNomCompagnieAssistee() {
		return nomCompagnieAssistee;
	}


	public void setNomCompagnieAssistee(String nomCompagnieAssistee) {
		this.nomCompagnieAssistee = nomCompagnieAssistee;
	}
	
	public Integer getCodeCompagnieAssistee() {
		return codeCompagnieAssistee;
	}


	public void setCodeCompagnieAssistee(Integer codeCompagnieAssistee) {
		this.codeCompagnieAssistee = codeCompagnieAssistee;
	}
	
	@Override
	public RcCompagnieassisteeForm getModel() {		
		return rcCompagnieassisteeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcCompagnieassisteeForm form) {
		this.rcCompagnieassisteeForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcCompagnieassisteeForm getRcCompagnieassisteeForm() {
		return rcCompagnieassisteeForm;
	}


	public void setRcCompagnieassisteeForm(RcCompagnieassisteeForm rcCompagnieassisteeForm) {
		this.rcCompagnieassisteeForm = rcCompagnieassisteeForm;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
