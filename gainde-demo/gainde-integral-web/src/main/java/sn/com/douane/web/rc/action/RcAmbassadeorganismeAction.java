package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.AmbassadeOrganismeDto;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAmbassadeorganismeForm;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;


public class RcAmbassadeorganismeAction extends GeneralDispatchAction implements ScopedModelDriven<RcAmbassadeorganismeForm> {

	
	private static final long serialVersionUID = 1L;
	private RcAmbassadeorganismeForm rcAmbassadeorganismeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcAmbassadeorganisme() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcAmbassadeorganisme" : request.getParameter(ConstManif.PAGE));

		try {
			AmbassadeOrganisme ambassadeorganismevo = rcAmbassadeorganismeForm
					.getNewRcAmbassadeorganismeVO();
			int valuePpm = gaindeBusinessDelegate
					.AmbVerifierExistencePpm(ambassadeorganismevo);
			int valueNinea = gaindeBusinessDelegate
					.AmbVerifierExistenceNinea(ambassadeorganismevo);
			if (valuePpm == 1) {
				if (valueNinea == 1) {
					gaindeBusinessDelegate
							.ajouterAmbassadeOrganisme(ambassadeorganismevo);
					if (page.equals("saisieRcPpm")) {
						RcPpmForm rcPpmForm = (RcPpmForm) request.getSession()
								.getAttribute("rcPpmForm");
						rcPpmForm
								.setNumListRcNumRegPreferentiel(ambassadeorganismevo.getRcNumRegimePref());

						addActionError(getText(
								ConstErrCodRC.succefulInsertTable,"du r�gime pr�f�rentiel "));
					} else {
						addActionError(getText(ConstErrCodRC.succefulInsert));
					}
				} else {
					addActionError(getText(ConstErrCodRC.ppmWithoutNinea));
				}
			} else {
				addActionError(getText(ConstErrCodRC.PpmDoesNotExist));
			}
			rcAmbassadeorganismeForm.reset();

		} catch (Exception e) {
			if(page.equals("saisieRcPpm")){
				page = "saisieRcAmbassadeorganismeppm";	
			}
			addActionError(getText(e.getMessage()));
		}
			return page;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcAmbassadeorganisme() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcAmbassadeorganisme" : request.getParameter(ConstManif.PAGE));

		try
		{
			AmbassadeOrganisme ambassadeorganismevo = rcAmbassadeorganismeForm.getNewRcAmbassadeorganismeVO();
            gaindeBusinessDelegate.modifierAmbassadeOrganisme(ambassadeorganismevo);
			addActionError(getText(ConstErrCodRC.succefulUpdate));
		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			page = "modificationRcAmbassadeorganisme";
		}
		return page;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcAmbassadeorganisme() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodeppm = (rcAmbassadeorganismeForm.getNumListRcCodePPMRech()==null ? "" : rcAmbassadeorganismeForm.getNumListRcCodePPMRech());
		String rcdateregimepref = (rcAmbassadeorganismeForm.getDatRcDateRegimePrefRech()==null ? "" : rcAmbassadeorganismeForm.getDatRcDateRegimePrefRech());
		String rcnatregimepref = (rcAmbassadeorganismeForm.getNumRcNatRegimePrefRech()==null ? "" : rcAmbassadeorganismeForm.getNumRcNatRegimePrefRech());
		String rcnumregimepref = (rcAmbassadeorganismeForm.getNumRcNumRegimePrefRech()==null ? "" : rcAmbassadeorganismeForm.getNumRcNumRegimePrefRech());

		if (!rccodeppm.equals("")){
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rcdateregimepref.equals("")){
			condition += " and rcDateRegimePref = '"+sysEnv.strToDate(rcdateregimepref)+"' ";
		}
		if (!rcnatregimepref.equals("")){
			condition += " and rcNatRegimePref = '"+rcnatregimepref+"' ";
		}
		if (!rcnumregimepref.equals("")){
			condition += " and rcNumRegimePref LIKE '%"+rcnumregimepref+"%' ";
		}
		
		try {

			List<AmbassadeOrganismeDto> listeRcAmbassadeorganisme = gaindeBusinessDelegate
					.rechercherAmbassadeOrganisme("from AmbassadeOrganisme where 1 = 1"+condition);
			// pour la pagination du grid 
						if (listeRcAmbassadeorganisme!=null) {
							rcAmbassadeorganismeForm.setRecords(listeRcAmbassadeorganisme.size()); 
							rcAmbassadeorganismeForm.setTotal(
									(int) Math.ceil((double)rcAmbassadeorganismeForm.getRecords() 
											/ (double)rcAmbassadeorganismeForm.getRows())); 
							int to = (rcAmbassadeorganismeForm.getRows() * rcAmbassadeorganismeForm.getPage());
						    int from = to - rcAmbassadeorganismeForm.getRows();
						    if (to > rcAmbassadeorganismeForm.getRecords()) {
						    	to = rcAmbassadeorganismeForm.getRecords();
						    }
						    listeRcAmbassadeorganisme = listeRcAmbassadeorganisme.subList(from, to);
						}
			
			rcAmbassadeorganismeForm.setListeRcAmbassadeorganisme(listeRcAmbassadeorganisme);

			if (listeRcAmbassadeorganisme != null
					&& listeRcAmbassadeorganisme.size() != 0) {

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else if (!rcnumregimepref.equals("")) {
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
				addActionError(getText(ConstErrCodRC.NumRegPrefDoesNotExist));
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcAmbassadeorganisme";
					rcAmbassadeorganismeForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodeppm.equals("")){
						rcAmbassadeorganismeForm.setNumListRcCodePPM(rccodeppm);
					}
					if (!rcdateregimepref.equals("")){
						rcAmbassadeorganismeForm
								.setDatRcDateRegimePref(rcdateregimepref);
					}
					if (!rcnatregimepref.equals("")){
						rcAmbassadeorganismeForm
								.setNumRcNatRegimePref(rcnatregimepref);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")){
					rcAmbassadeorganismeForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
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
	public String supprimerRcAmbassadeorganisme() {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcAmbassadeorganisme" : request.getParameter(ConstManif.PAGE));

		try {
            gaindeBusinessDelegate.supprimerAmbassadeOrganisme(pk);
			List<AmbassadeOrganismeDto> listeRcAmbassadeorganisme = gaindeBusinessDelegate.rechercherAmbassadeOrganisme("from AmbassadeOrganisme where 1 = 1");
			rcAmbassadeorganismeForm.setListeRcAmbassadeorganisme(listeRcAmbassadeorganisme);
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
	public String afficherRcAmbassadeorganisme () throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = (request.getParameter("pageContext")==null ? "rechercheRcAmbassadeorganisme" : request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		AmbassadeOrganisme ambassadeorganismevo = gaindeBusinessDelegate.findAmbassadeOrganismeByPrimaryKey(pk);
		rcAmbassadeorganismeForm.setAmbassadeorganisme(ambassadeorganismevo);
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
			rcAmbassadeorganismeForm.reset();
			rcAmbassadeorganismeForm.setListeRcAmbassadeorganisme(new ArrayList());
			String codePpm=(String)request.getAttribute("codePpm");
			rcAmbassadeorganismeForm.setNumListRcCodePPM(codePpm);

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}

		return page;
	}
	@Override
	public RcAmbassadeorganismeForm getModel() {		
		return rcAmbassadeorganismeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcAmbassadeorganismeForm form) {
		this.rcAmbassadeorganismeForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcAmbassadeorganismeForm getRcAmbassadeorganismeForm() {
		return rcAmbassadeorganismeForm;
	}


	public void setRcAmbassadeorganismeForm(RcAmbassadeorganismeForm rcAmbassadeorganismeForm) {
		this.rcAmbassadeorganismeForm = rcAmbassadeorganismeForm;
	}

}
