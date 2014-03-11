package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.TauxDto;
import sn.com.douane.ejb.rc.model.entities.Taux;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcTauxForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcTauxAction extends GeneralDispatchAction implements SessionAware, ScopedModelDriven<RcTauxForm> {

	private static final long serialVersionUID = 1L;
	private RcTauxForm rcTauxForm;
	private String scopeKey;
	private Map<String, Object> session;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcTaux() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcTaux" : request.getParameter(ConstManif.PAGE));

		try {
			Taux tauxvo = rcTauxForm.getNewRcTauxVO();
			gaindeBusinessDelegate.ajouterTaux(tauxvo);
			addActionError(getText(ConstErrCodRC.succefulInsert));
			rcTauxForm.reset();
		}catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "saisieRcTaux";
		}
		return page;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcTaux() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter("pageContext")==null ? "modificationRcTaux" : request.getParameter("pageContext"));

		try
		{
			Taux tauxvo = rcTauxForm.getNewRcTauxVO();
			gaindeBusinessDelegate.modifierTaux(tauxvo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));
			forward = page;
		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "modificationRcTaux";
		}
		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcTaux() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String libelletaux = (rcTauxForm.getNumLibelleTauxRech()==null ? "" : rcTauxForm.getNumLibelleTauxRech());
		String rccodetaux = (rcTauxForm.getNumRcCodeTauxRech()==null ? "" : rcTauxForm.getNumRcCodeTauxRech());
		String rccodetaxe = (rcTauxForm.getNumListRcCodeTaxeRech()==null ? "" : rcTauxForm.getNumListRcCodeTaxeRech());
		String rcdatevaleur = (rcTauxForm.getDatRcDateValeurRech()==null ? "" : rcTauxForm.getDatRcDateValeurRech());

		if (!libelletaux.equals("")) {
			condition += " and libelleTaux LIKE '%"+libelletaux+"%' ";
		}
		if (!rccodetaux.equals("")){
			condition += " and rcCodeTaux LIKE '%"+rccodetaux+"%' ";
		}
		if (!rccodetaxe.equals("")){
			condition += " and rcCodeTaxe LIKE '%"+rccodetaxe+"%' ";
		}
		if (!rcdatevaleur.equals("")){
			condition += " and rcDateValeur = '"+sysEnv.strToDate(rcdatevaleur)+"' ";
		}
		try {
			List<TauxDto> listeRcTaux = gaindeBusinessDelegate.rechercherTaux("from Taux where 1 = 1 "+condition);
			// pour la pagination du grid 
			if (listeRcTaux!=null) {
				rcTauxForm.setRecords(listeRcTaux.size()); 
				rcTauxForm.setTotal(
						(int) Math.ceil((double)rcTauxForm.getRecords() 
								/ (double)rcTauxForm.getRows())); 
				int to = (rcTauxForm.getRows() * rcTauxForm.getPage());
			    int from = to - rcTauxForm.getRows();
			    if (to > rcTauxForm.getRecords()) {
			    	to = rcTauxForm.getRecords();
			    }
			    listeRcTaux = listeRcTaux.subList(from, to);
			}
			rcTauxForm.setListeRcTaux(listeRcTaux);

			if (listeRcTaux!=null && listeRcTaux.size()!=0) {

				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcTaux";
					rcTauxForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!libelletaux.equals("")){
						rcTauxForm.setNumLibelleTaux(libelletaux);
					}
					if (!rccodetaux.equals("")){
						rcTauxForm.setNumRcCodeTauxOB(rccodetaux);
					}
					if (!rccodetaxe.equals("")){
						rcTauxForm.setNumListRcCodeTaxeOB(rccodetaxe);
					}
					if (!rcdatevaleur.equals("")){
						rcTauxForm.setDatRcDateValeurOB(rcdatevaleur);
					}
				} else {
					if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}else{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcTauxForm.resetChampsRecherche ();
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
	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcTaux() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pkTab[] = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rccodetaux = pkTab[0];
		String rccodetaxe = pkTab[1];
		String rcdatevaleur = pkTab[2];
		String page = (request.getParameter("pageContext")==null ? "rechercheRcTaux" : request.getParameter("pageContext"));

		try
		{
			gaindeBusinessDelegate.supprimerTaux(rccodetaux,rccodetaxe,sysEnv.strToDate("yyyy-MM-dd",rcdatevaleur));
			List<TauxDto> listeRcTaux = gaindeBusinessDelegate.rechercherTaux("from Taux where 1 = 1 ");
			rcTauxForm.setListeRcTaux(listeRcTaux);
			addActionError(getText(ConstErrCodRC.succefulDelete));
		} catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp)){
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
		}
		
		return page;
	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcTaux () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcTaux" : request.getParameter("pageContext"));
		String pkTab[] = (request.getParameter(ConstManif.PK)).split(ConstManif.TIELD);
		String rccodetaux = pkTab[0];
		String rccodetaxe = pkTab[1];
		String rcdatevaleur = pkTab[2];
		Taux tauxvo = gaindeBusinessDelegate.findTauxByPrimaryKey(rccodetaux,rccodetaxe,sysEnv.strToDate("yyyy-MM-dd",rcdatevaleur));
		rcTauxForm.setTaux(tauxvo);
		return page;
	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcTauxForm.reset();
			rcTauxForm.setListeRcTaux(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}
      
		return page;
	}
	@Override
	public RcTauxForm getModel() {		
		return rcTauxForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcTauxForm form) {
		this.rcTauxForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcTauxForm getRcTauxForm() {
		return rcTauxForm;
	}


	public void setRcTauxForm(RcTauxForm rcTauxForm) {
		this.rcTauxForm = rcTauxForm;
	}
	
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
