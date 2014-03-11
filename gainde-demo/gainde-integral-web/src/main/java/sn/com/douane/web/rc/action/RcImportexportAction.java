package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.ImportExportDto;
import sn.com.douane.ejb.rc.model.entities.ImportExport;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcImportexportForm;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;



public class RcImportexportAction extends GeneralDispatchAction implements ScopedModelDriven<RcImportexportForm> {
	
	private static final long serialVersionUID = 1L;
	private RcImportexportForm rcImportexportForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcImportexport() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcImportexport" : request.getParameter(ConstManif.PAGE));

		try {
			ImportExport importexportvo = rcImportexportForm
					.getNewRcImportexportVO();
			int valuePpm = gaindeBusinessDelegate
					.ImpVerifierExistencePpm(importexportvo);
			int valueNinea = gaindeBusinessDelegate
					.ImpVerifierExistenceNinea(importexportvo);
			if (valuePpm == 1) {
				if (valueNinea == 1) {
					gaindeBusinessDelegate.ajouterImportExport(importexportvo);

					if (page.equals("saisieRcPpm")) {
						RcPpmForm rcPpmForm = (RcPpmForm) request.getSession()
								.getAttribute("rcPpmForm");
						rcPpmForm.setNumListRcNumImportExport(importexportvo
								.getRcNumImportExport());

						addActionError(getText(
								ConstErrCodRC.succefulInsertTable,
								" de l'importateur / exportateur "));
					} else {
						addActionError(getText(ConstErrCodRC.succefulInsert));
					}
				} else{
					addActionError(getText(ConstErrCodRC.ppmWithoutNinea));	
				}
			} else{
				addActionError(getText(ConstErrCodRC.PpmDoesNotExist));
			}
			rcImportexportForm.reset();

		} catch (Exception e) {
			if(page.equals("saisieRcPpm")){
				page = "saisieRcImportexportppm";
			}
			addActionError(getText(e.getMessage()));
		}
		return page;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcImportexport() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcImportexport" : request.getParameter(ConstManif.PAGE));

		try {
			ImportExport importexportvo = rcImportexportForm.getNewRcImportexportVO();
            gaindeBusinessDelegate.modifierImportExport(importexportvo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "modificationRcImportexport";
		}

		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcImportexport() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodeppm = (rcImportexportForm.getNumListRcCodePPMRech()==null ? "" : rcImportexportForm.getNumListRcCodePPMRech());
		String rcdatecarte = (rcImportexportForm.getDatRcDateCarteRech()==null ? "" : rcImportexportForm.getDatRcDateCarteRech());
		String rcdateretraitcredit = (rcImportexportForm.getDatRcDateRetraitCreditRech()==null ? "" : rcImportexportForm.getDatRcDateRetraitCreditRech());
		String rcdatesuspension = (rcImportexportForm.getDatRcDateSuspensionRech()==null ? "" : rcImportexportForm.getDatRcDateSuspensionRech());
		String rcnumimportexport = (rcImportexportForm.getNumRcNumImportExportRech()==null ? "" : rcImportexportForm.getNumRcNumImportExportRech());

		if (!rccodeppm.equals("")){
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcdatecarte.equals("")){
			condition += " and rcDateCarte = '"+sysEnv.strToDate(rcdatecarte)+"' ";
		}
		if (!rcdateretraitcredit.equals("")){
			condition += " and rcDateRetraitCredit = '"+sysEnv.strToDate(rcdateretraitcredit)+"' ";
		}
		if (!rcdatesuspension.equals("")){
			condition += " and rcDateSuspension = '"+sysEnv.strToDate(rcdatesuspension)+"' ";
		}
		if (!rcnumimportexport.equals("")){
			condition += " and rcNumImportExport LIKE '%"+rcnumimportexport+"%' ";
		}
		
		try {

			List<ImportExportDto> listeRcImportexport  = gaindeBusinessDelegate.rechercherImportExport("from ImportExport where 1 = 1 "+condition);
			// pour la pagination du grid 
						if (listeRcImportexport!=null) {
							rcImportexportForm.setRecords(listeRcImportexport.size()); 
							rcImportexportForm.setTotal(
									(int) Math.ceil((double)rcImportexportForm.getRecords() 
											/ (double)rcImportexportForm.getRows())); 
							int to = (rcImportexportForm.getRows() * rcImportexportForm.getPage());
						    int from = to - rcImportexportForm.getRows();
						    if (to > rcImportexportForm.getRecords()) {
						    	to = rcImportexportForm.getRecords();
						    }
						    listeRcImportexport = listeRcImportexport.subList(from, to);
						}
			rcImportexportForm.setListeRcImportexport(listeRcImportexport);

			if (listeRcImportexport!=null && listeRcImportexport.size()!=0){
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcImportexport";
					rcImportexportForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeppm.equals("")) {
						rcImportexportForm.setNumListRcCodePPM(rccodeppm);
					}
					if (!rcdatecarte.equals("")) {
						rcImportexportForm.setDatRcDateCarte(rcdatecarte);
					}
					if (!rcdateretraitcredit.equals("")){
						rcImportexportForm.setDatRcDateRetraitCredit(rcdateretraitcredit);
					}
					if (!rcdatesuspension.equals("")) {
						rcImportexportForm.setDatRcDateSuspension(rcdatesuspension);
					}
					if (!rcnumimportexport.equals("")) {
						rcImportexportForm.setNumRcNumImportExportOB(rcnumimportexport);
					}
				} else {
					if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")) {
					rcImportexportForm.resetChampsRecherche ();
				}
			}
		} catch (Exception e){	
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
	public String supprimerRcImportexport() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcImportexport" : request.getParameter(ConstManif.PAGE));

		try {
            gaindeBusinessDelegate.supprimerImportExport(pk);
			List<ImportExportDto> listeRcImportexport = gaindeBusinessDelegate.rechercherImportExport("from ImportExport where 1 = 1");
			rcImportexportForm.setListeRcImportexport(listeRcImportexport);
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
	public String afficherRcImportexport () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcImportexport" : request.getParameter(ConstManif.PAGE));
		String pk = request.getParameter(ConstManif.PK);
		ImportExport importexportvo= gaindeBusinessDelegate.findImportExportByPrimaryKey(pk);
		rcImportexportForm.setImportexport(importexportvo);
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
			rcImportexportForm.reset();
			rcImportexportForm.setListeRcImportexport(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}
	@Override
	public RcImportexportForm getModel() {		
		return rcImportexportForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcImportexportForm form) {
		this.rcImportexportForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcImportexportForm getRcImportexportForm() {
		return rcImportexportForm;
	}


	public void setRcImportexportForm(RcImportexportForm rcImportexportForm) {
		this.rcImportexportForm = rcImportexportForm;
	}

}
