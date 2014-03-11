package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ejb.EJBTransactionRolledbackException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcCreditairesForm;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;


public class RcCreditairesAction extends GeneralDispatchAction implements SessionAware,ScopedModelDriven<RcCreditairesForm> {

	private static final long serialVersionUID = 1L;
	private RcCreditairesForm rcCreditairesForm;
	private String scopeKey;
	private Map<String, Object> session;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcCreditaires() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcCreditaires" : request.getParameter(ConstManif.PAGE));

		try
		{
			Creditaire creditairesvo = rcCreditairesForm.getNewRcCreditairesVO();
			int value1 = gaindeBusinessDelegate.VerifierExistenceNinea(creditairesvo);
			int value2 = gaindeBusinessDelegate.VerifierExistenceCreditaire(creditairesvo);
			if (value1==1) {
				if (value2==0)	{
					gaindeBusinessDelegate.ajouterCreditaire(creditairesvo);
					if (page.equals("saisieRcPpm")) {
						RcPpmForm rcPpmForm = (RcPpmForm) request.getSession().getAttribute("rcPpmForm");
						rcPpmForm.setNumListRcCodeCreditaire(creditairesvo.getRcCodeCreditaire());
						addActionError(getText(ConstErrCodRC.succefulInsertTable," du creditaire "));
					} else {
						addActionError(getText(ConstErrCodRC.succefulInsert));
					}
				} else {
					addActionError(getText(ConstErrCodRC.creditaireExistedeja));
				}
			} else {
				addActionError(getText(ConstErrCodRC.ppmWithoutNinea));
			}
			rcCreditairesForm.reset();

		} catch (Exception e) {
			if(page.equals("saisieRcPpm")){
				page = "saisieRcCreditairesppm";
			}
			addActionError(getText(e.getMessage()));
		}
		return page;
	}


	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcCreditaires() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcCreditaires" : request.getParameter(ConstManif.PAGE));

		try {
			Creditaire creditairesvo = rcCreditairesForm.getNewRcCreditairesVO();
            gaindeBusinessDelegate.modifierCreditaire(creditairesvo);
            addActionError(getText(ConstErrCodRC.succefulUpdate));

		} catch (Exception e)	{
			addActionError(getText(e.getMessage()));
			page = "modificationRcCreditaires";
		}
		return page;
	}


	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcCreditaires() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodecreditaire = (rcCreditairesForm.getNumRcCodeCreditaireRech()==null ? "" : rcCreditairesForm.getNumRcCodeCreditaireRech());
		String rccodeppm = (rcCreditairesForm.getNumListRcCodePPMRech()==null ? "" : rcCreditairesForm.getNumListRcCodePPMRech());
		String rcdatecredit = (rcCreditairesForm.getDatRcDateCreditRech()==null ? "" : rcCreditairesForm.getDatRcDateCreditRech());
		String rcdateextension = (rcCreditairesForm.getDatRcDateExtensionRech()==null
				? "" : rcCreditairesForm.getDatRcDateExtensionRech());
		String rcdateretrait = (rcCreditairesForm.getDatRcDateRetraitRech()==null ? ""
				: rcCreditairesForm.getDatRcDateRetraitRech());
		String rcdatesuspension =
				(rcCreditairesForm.getDatRcDateSuspensionRech()==null ? "" :
					rcCreditairesForm.getDatRcDateSuspensionRech());

		if (!rccodecreditaire.equals("")){
			condition += " and rcCodeCreditaire LIKE '%"+rccodecreditaire+"%' ";
		}
		if (!rccodeppm.equals("")){
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcdatecredit.equals("")) {
			condition += " and rcDateCredit ='"+sysEnv.strToDate(rcdatecredit)+"' ";
		}
		if (!rcdateextension.equals("")) {
			condition += " and rcDateExtension ='"+sysEnv.strToDate(rcdateextension)+"' ";
		}
		  
		if (!rcdateretrait.equals("")){
			condition += " and rcDateRetrait ='"+sysEnv.strToDate(rcdateretrait)+"' ";
		}
		  
		if (!rcdatesuspension.equals("")){
			condition += " and rcDateSuspension ='"+sysEnv.strToDate(rcdatesuspension)+"' ";
		}
		 
		try {
			List<CreditaireDto> listeRcCreditaires = gaindeBusinessDelegate.rechercherCreditaire("from Creditaire where 1 = 1 "+condition);
			// pour la pagination du grid 
						if (listeRcCreditaires!=null) {
							rcCreditairesForm.setRecords(listeRcCreditaires.size()); 
							rcCreditairesForm.setTotal(
									(int) Math.ceil((double)rcCreditairesForm.getRecords() 
											/ (double)rcCreditairesForm.getRows())); 
							int to = (rcCreditairesForm.getRows() * rcCreditairesForm.getPage());
						    int from = to - rcCreditairesForm.getRows();
						    if (to > rcCreditairesForm.getRecords()) {
						    	to = rcCreditairesForm.getRecords();
						    }
						    listeRcCreditaires = listeRcCreditaires.subList(from, to);
						}
			rcCreditairesForm.setListeRcCreditaires(listeRcCreditaires);

			if (listeRcCreditaires!=null && listeRcCreditaires.size()!=0){
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcCreditaires";
					rcCreditairesForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodecreditaire.equals("")){
						rcCreditairesForm.setNumRcCodeCreditaireOB(rccodecreditaire);
					}
					if (!rccodeppm.equals("")) {
						rcCreditairesForm.setNumListRcCodePPMOB(rccodeppm);
					}
					if (!rcdatecredit.equals("")){
						rcCreditairesForm.setDatRcDateCredit(rcdatecredit);
					}
					if (!rcdateextension.equals("")){
						rcCreditairesForm.setDatRcDateExtension(rcdateextension);
					}
					if (!rcdateretrait.equals("")) {
						rcCreditairesForm.setDatRcDateRetrait(rcdateretrait);
					}
					if (!rcdatesuspension.equals("")){
						rcCreditairesForm.setDatRcDateSuspension(rcdatesuspension);
					}
				} else {
					if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}	else	{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcCreditairesForm.resetChampsRecherche ();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		if (pageResult==null){
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcCreditaires() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCreditaires" : request.getParameter(ConstManif.PAGE));

		try{
			gaindeBusinessDelegate.supprimerCreditaire(pk);
			List<CreditaireDto> listeRcCreditaires = gaindeBusinessDelegate.rechercherCreditaire("from Creditaire where 1 = 1 ");
			rcCreditairesForm.setListeRcCreditaires(listeRcCreditaires);
			addActionError(getText(ConstErrCodRC.succefulDelete));
		} catch (EJBTransactionRolledbackException e) {
			addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
		} catch (Exception e) {
				addActionError(getText(e.getMessage()));
		}
		
		return page;

	}


	/** ************************************ */
	/** * AFFICHAGE ** */
	/** ************************************ */
	public String afficherRcCreditaires () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcCreditaires" : request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		Creditaire creditairesvo  = gaindeBusinessDelegate.findCreditaireByPrimaryKey(pk);
		rcCreditairesForm.setCreditaires(creditairesvo);
		return page;
	}


	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcCreditairesForm.reset();
			rcCreditairesForm.setListeRcCreditaires(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}
		return page;
	}
	@Override
	public RcCreditairesForm getModel() {		
		return rcCreditairesForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcCreditairesForm form) {
		this.rcCreditairesForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcCreditairesForm getRcCreditairesForm() {
		return rcCreditairesForm;
	}


	public void setRcCreditairesForm(RcCreditairesForm rcCreditairesForm) {
		this.rcCreditairesForm = rcCreditairesForm;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
