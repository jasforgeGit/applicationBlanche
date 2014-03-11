package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.GroupefonctionDto;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.utils.ListeGroupe;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcProfilForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;



public class RcProfilAction extends GeneralDispatchAction implements ScopedModelDriven<RcProfilForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1410138456120939451L;
	private RcProfilForm rcProfilForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcProfil() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcProfil"
				: request.getParameter(ConstManif.PAGE));

		String[] s2 = rcProfilForm.getIds2();

		List foncList2 = new ArrayList();
		try {

			request.setAttribute("list2", foncList2);
			Profil profilVO = rcProfilForm.getNewRcProfilVO();
			gaindeBusinessDelegate.ajouterProfil(profilVO);

			if (s2.length > 0) {
				for (int i = 0; i < s2.length; i++) {
					String groupe = s2[i];

					ProfilGroupe pgvo = rcProfilForm.getNewRcProfilgroupeVO(
							sysEnv.strToInteger(groupe), profilVO
									.getRcCodeProfil());

					//On ex�cute la commande d'ajout
					gaindeBusinessDelegate.ajouterProfilGroupe(pgvo);
				}
			}

			addActionError(getText(ConstErrCodRC.succefulInsert));
			rcProfilForm.reset();

			List listeRcProfil = gaindeBusinessDelegate.rechercherByWhereProfil("from Profil where 1 = 1");

			rcProfilForm.setListeRcProfil(listeRcProfil);
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcProfil";
		} finally {
			setupProfil("");
		}

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcProfil() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		Profil profilVO = new Profil();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcProfil"
				: request.getParameter(ConstManif.PAGE));

		String[] s2 = rcProfilForm.getIds2();

		try {
			profilVO = rcProfilForm.getNewRcProfilVO();			
			List<ProfilGroupe> vOldPg = gaindeBusinessDelegate.rechercherByCodeProfil(profilVO.getRcCodeProfil());

			if (vOldPg.size() > 0) {
				for (int i = 0; i < vOldPg.size(); i++) {
					ProfilGroupe vo = (ProfilGroupe) vOldPg.get(i);
					gaindeBusinessDelegate.supprimerProfilGroupe(vo.getRcCodeGroupe(), vo.getRcCodeProfil());
				}
			}

			//On ajoute l'ensemble des fonctionnalit�s choisies
			if (s2.length > 0) {
				for (int i = 0; i < s2.length; i++) {
					String groupe = s2[i];

					ProfilGroupe pgvo = rcProfilForm.getNewRcProfilgroupeVO(
							sysEnv.strToInteger(groupe), profilVO
									.getRcCodeProfil());

					gaindeBusinessDelegate.ajouterProfilGroupe(pgvo);
				}
			}

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierProfil(profilVO);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "modificationRcProfil";
		} finally {
			setupProfil(profilVO.getRcCodeProfil());
		}

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcProfil() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();;
		String pageResult = request.getParameter("pageContext");
		String condition = " ";
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		String rccodeprofil = (rcProfilForm.getNumListRcCodeProfilRech() == null ? ""
				: rcProfilForm.getNumListRcCodeProfilRech());

		String rclibprofil = (rcProfilForm.getNumRcLibProfilRech() == null ? ""
				: rcProfilForm.getNumRcLibProfilRech());

		//Condition de recherche
		if (!rccodeprofil.equals("")){
			condition += " and rcCodeProfil = '" + rccodeprofil + "'";
		}
		if (!rclibprofil.equals("")){
			condition += " and rcLibelleProfil LIKE '%" + rclibprofil + "%' ";
		}
		try {

			List listeRcProfil = gaindeBusinessDelegate.rechercherByWhereProfil("from Profil where 1 = 1"+condition);
			// pour la pagination du grid 
			if (listeRcProfil!=null) {
				rcProfilForm.setRecords(listeRcProfil.size()); 
				rcProfilForm.setTotal(
						(int) Math.ceil((double)rcProfilForm.getRecords() 
								/ (double)rcProfilForm.getRows())); 
				int to = (rcProfilForm.getRows() * rcProfilForm.getPage());
			    int from = to - rcProfilForm.getRows();
			    if (to > rcProfilForm.getRecords()) {
			    	to = rcProfilForm.getRecords();
			    }
			    listeRcProfil = listeRcProfil.subList(from, to);
			}
			rcProfilForm.setListeRcProfil(listeRcProfil);

			if (listeRcProfil!=null && listeRcProfil.size() != 0) {
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcProfil";
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodeprofil.equals("")){
						rcProfilForm.setNumRcCodeProfilOB(rccodeprofil);
					}
					if (!rclibprofil.equals("")){
						rcProfilForm.setNumRcLibProfilOB(rclibprofil);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}
				if (!ctxmenu.equals("C")){
					rcProfilForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage()); 
		} finally {
			setupProfil("");
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
	public String supprimerRcProfil() throws Exception {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcProfil"
				: request.getParameter(ConstManif.PAGE));

		try {

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerProfil(pk);

			//Raffraichissement de la liste des Profil
			List listeRcProfil = gaindeBusinessDelegate.rechercherByWhereProfil("from Profil where 1 = 1");
			rcProfilForm.setListeRcProfil(listeRcProfil);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		} 
		catch (EJBTransactionRolledbackException e) {
			addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
		}
		catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			if (page != null) {
				forward = page;
			}
		}
		return forward;
	}

	/** ************************************ */
	/** * AFFICHAGE ** */
	/** ************************************ */
	public String afficherRcProfil() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter("pageContext") == null ? "rechercheRcProfil"
				: request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		Profil profilVO = null;
		profilVO = gaindeBusinessDelegate.findProfilByPrimaryKey(pk);
		rcProfilForm.setProfil(profilVO);
		setupProfil(profilVO.getRcCodeProfil());
		forward = page;
		return forward;

	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified()	throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcProfilForm.reset();
			rcProfilForm.setListeRcProfil(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}


	private void setupProfil(String codegroupe) throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		List<GroupeFonction> listGroupeFinal ;

		List<GroupefonctionDto> list1 = new ArrayList<GroupefonctionDto>();
		List<GroupefonctionDto> list2 = new ArrayList<GroupefonctionDto>();

		ListeGroupe listeGroupe = gaindeBusinessDelegate.getListeGroupe(codegroupe);
		List<GroupeFonction> listGroupeInitial = listeGroupe.getListGroupeInitial();

		for (int i = 0; i < listGroupeInitial.size(); i++) {
			GroupefonctionDto groupefonctionVO = null;
			groupefonctionVO = gaindeBusinessDelegate.getGroupefonctionDto(listGroupeInitial.get(i));
			list1.add(groupefonctionVO);
		}

		if ((codegroupe != null) && (!codegroupe.equals(""))) {
			listGroupeFinal = listeGroupe.getListGroupeFinal();
			for (int i = 0; i < listGroupeFinal.size(); i++) {
				GroupefonctionDto groupefonctionVO = null;
				groupefonctionVO = gaindeBusinessDelegate.getGroupefonctionDto(listGroupeFinal.get(i));
				list2.add(groupefonctionVO);
			}
		}

		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		rcProfilForm.setList1(list1);
		rcProfilForm.setList2(list2);
		rcProfilForm.setIds1(new String[list1.size()]);
		rcProfilForm.setIds2(new String[list1.size()]);

	}
	
	@Override
	public RcProfilForm getModel() {		
		return rcProfilForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcProfilForm form) {
		this.rcProfilForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcProfilForm getRcProfilForm() {
		return rcProfilForm;
	}


	public void setRcProfilForm(RcProfilForm rcProfilForm) {
		this.rcProfilForm = rcProfilForm;
	}
}