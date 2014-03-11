package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcAgreeAction extends GeneralDispatchAction implements ScopedModelDriven<RcAgreeForm> {
	
	private static final long serialVersionUID = 1L;
	private RcAgreeForm rcAgreeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcAgree() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcAgree" : request.getParameter(ConstManif.PAGE));

		try {
			Agree agreevo = rcAgreeForm.getNewRcAgreeVO();
			int valuePpm = gaindeBusinessDelegate
					.AgreeVerifierExistencePpm(agreevo);
			int valueNinea = gaindeBusinessDelegate
					.AgreeVerifierExistenceNinea(agreevo);
			int valueCreditaire = gaindeBusinessDelegate
					.AgreeVerifierExistanceCreditaire(agreevo);
			if (valuePpm == 1) {
				if (valueNinea == 1) {
					if (valueCreditaire == 1) {
						gaindeBusinessDelegate.ajouterAgree(agreevo);
						if (page.equals("saisieRcPpm")) {
							RcPpmForm rcPpmForm = (RcPpmForm) request
									.getSession().getAttribute("rcPpmForm");
							rcPpmForm.setNumListRcCodeAgree(agreevo
									.getRcCodeAgree());

							addActionError(getText(ConstErrCodRC.succefulInsertTable,"de l'agr�� "));
						} else {
							addActionError(getText(ConstErrCodRC.succefulInsert));
						}
					} else {
						addActionError(getText(ConstErrCodRC.ppmWithoutCreditaire));
					}
				} else {
					addActionError(getText(ConstErrCodRC.ppmWithoutNinea));
				}
			} else {
				addActionError(getText(ConstErrCodRC.PpmDoesNotExist));
			}
			rcAgreeForm.reset();
		} catch (Exception e) {
			if (page.equals("saisieRcPpm")) {
				page = "saisieRcAgreeppm";
			}
			addActionError(getText(e.getMessage()));
		}
		return page;
	}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcAgree() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcAgree" : request.getParameter(ConstManif.PAGE));
		try {
			Agree agreevo = rcAgreeForm.getNewRcAgreeVO();
            gaindeBusinessDelegate.modifierAgree(agreevo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));

		} catch (Exception e)	{
			addActionError(getText(e.getMessage()));
			page = "modificationRcAgree";
		}
		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcAgree() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodeagree = (rcAgreeForm.getNumRcCodeAgreeRech()==null ? "" : rcAgreeForm.getNumRcCodeAgreeRech());
		String rccodeppm = (rcAgreeForm.getNumListRcCodePPMRech()==null ? "" : rcAgreeForm.getNumListRcCodePPMRech());
		String rcetatagree = (rcAgreeForm.getNumRcEtatAgreeRech()==null ? "" : rcAgreeForm.getNumRcEtatAgreeRech());

		if (!rccodeagree.equals("")) {
			condition += " and rcCodeAgree LIKE '%"+rccodeagree+"%' ";
		}
		if (!rccodeppm.equals("")){
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcetatagree.equals("")){
			condition += " and rcEtatAgree = '"+rcetatagree+"' ";
		}
		try
		{

			List<AgreeDto> listeRcAgree  = gaindeBusinessDelegate.rechercherAgree("from Agree where 1 = 1 "+condition);
			// pour la pagination du grid 
			if (listeRcAgree!=null) {
				rcAgreeForm.setRecords(listeRcAgree.size()); 
				rcAgreeForm.setTotal(
						(int) Math.ceil((double)rcAgreeForm.getRecords() 
								/ (double)rcAgreeForm.getRows())); 
				int to = (rcAgreeForm.getRows() * rcAgreeForm.getPage());
			    int from = to - rcAgreeForm.getRows();
			    if (to > rcAgreeForm.getRecords()) {
			    	to = rcAgreeForm.getRecords();
			    }
			    listeRcAgree = listeRcAgree.subList(from, to);
			}
			rcAgreeForm.setListeRcAgree(listeRcAgree);

			if (listeRcAgree!=null && listeRcAgree.size()!=0) {

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcAgree";
					rcAgreeForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeagree.equals("")){
						rcAgreeForm.setNumRcCodeAgreeOB(rccodeagree);
					}
					if (!rccodeppm.equals("")){
						rcAgreeForm.setNumListRcCodePPMOB(rccodeppm);
					}
					if (!rcetatagree.equals("")){
						rcAgreeForm.setNumRcEtatAgree(rcetatagree);
					}
				} else {
					if (ctxmenu.equals("S")){
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")){
					rcAgreeForm.resetChampsRecherche ();
				}

			}
		} catch (Exception e){	
			log.error(e.getMessage());
		}

		if (pageResult==null) {
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcAgree() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcAgree" : request.getParameter(ConstManif.PAGE));

		try{
            gaindeBusinessDelegate.supprimerAgree(pk);
            List<AgreeDto> listeRcAgree = gaindeBusinessDelegate.rechercherAgree("from Agree where 1 = 1 ");
			rcAgreeForm.setListeRcAgree(listeRcAgree);
			addActionError(getText(ConstErrCodRC.succefulDelete));
		} catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp)) {
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
	public String afficherRcAgree () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcAgree" : request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		Agree agreevo =  gaindeBusinessDelegate.findAgreeByPrimaryKey(pk);
		rcAgreeForm.setAgree(agreevo);
		return page;
	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcAgreeForm.reset();
			rcAgreeForm.setListeRcAgree(new ArrayList<Agree>());
			String codePpm=(String)request.getAttribute("codePpm");
			rcAgreeForm.setNumListRcCodePPMOB(codePpm);

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}
	@Override
	public RcAgreeForm getModel() {		
		return rcAgreeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcAgreeForm form) {
		this.rcAgreeForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcAgreeForm getRcAgreeForm() {
		return rcAgreeForm;
	}


	public void setRcAgreeForm(RcAgreeForm rcAgreeForm) {
		this.rcAgreeForm = rcAgreeForm;
	}
	
}
