package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJBTransactionRolledbackException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.FonctionnaliteDto;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.utils.ConstRC;
import sn.com.douane.utils.ListeFonc;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcGroupefonctionForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import tn.com.tw.java.exception.TwreException;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcGroupefonctionAction extends GeneralDispatchAction implements ScopedModelDriven<RcGroupefonctionForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5098895649601972902L;
	private RcGroupefonctionForm rcGroupefonctionForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcGroupefonction() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = "saisieRcGroupefonction";
		String[] s2 = rcGroupefonctionForm.getIds2();

		ArrayList foncList2 = new ArrayList();
		try {
			request.setAttribute("list2", foncList2);
			GroupeFonction groupefonctionvo = rcGroupefonctionForm.getNewRcGroupefonctionVO();
			gaindeBusinessDelegate.ajouterGroupeFonction(groupefonctionvo);

			if (s2.length > 0) {
				for (int i = 0; i < s2.length; i++) {
					String fonction = s2[i];

					RegroupFonctions rgvo = rcGroupefonctionForm
							.getNewRcRegroupFonctionVO(groupefonctionvo
									.getRcCodeGroupe(), fonction, Integer.valueOf(
									i + 1));
					gaindeBusinessDelegate.ajouterRegroupFonctions(rgvo);
				}
			}

			addActionError(getText(ConstErrCodRC.succefulInsert));
			rcGroupefonctionForm.reset();
			List listeRcGroupefonction = gaindeBusinessDelegate.rechercherGroupefonction("from GroupeFonction");
			rcGroupefonctionForm.setListeRcGroupefonction(listeRcGroupefonction);

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcGroupefonction";
		} finally {
			setupFonctionnalites("");
			setupRechercheFonc();
		}

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcGroupefonction() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		GroupeFonction groupefonctionvo = new GroupeFonction();
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcGroupefonction"
				: request.getParameter(ConstManif.PAGE));

		String[] s2 = rcGroupefonctionForm.getIds2();

		try {
			groupefonctionvo = rcGroupefonctionForm.getNewRcGroupefonctionVO();
			gaindeBusinessDelegate.modifierGroupeFonction(groupefonctionvo);
			List<RegroupFonctions> vOldRgv = gaindeBusinessDelegate.rechercherByCodeGroupe(groupefonctionvo.getRcCodeGroupe());

			if (vOldRgv.size() > 0) {
				for (int i = 0; i < vOldRgv.size(); i++) {
					RegroupFonctions vo = (RegroupFonctions) vOldRgv.get(i);
					gaindeBusinessDelegate.supprimerRegroupFonctions(vo.getRcCodeFonction(), vo.getRcCodeGroupe());
				}
			}

			//On ajoute l'ensemble des fonctionnalit�s choisies
			if (s2.length > 0) {
				for (int i = 0; i < s2.length; i++) {
					String fonction = s2[i];

					RegroupFonctions rgvo = rcGroupefonctionForm
							.getNewRcRegroupFonctionVO(groupefonctionvo
									.getRcCodeGroupe(), fonction, Integer.valueOf(
									i + 1));

					gaindeBusinessDelegate.ajouterRegroupFonctions(rgvo);
				}
			}

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "modificationRcGroupefonction";
		} finally {
			setupFonctionnalites(sysEnv.IntegerToStr(groupefonctionvo.getRcCodeGroupe()));
			setupRechercheFonc();
		}

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcGroupefonction() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";

		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);

		String rccodegroupefonction = (rcGroupefonctionForm
				.getNumRcCodeGroupeRech() == null ? "" : rcGroupefonctionForm
				.getNumRcCodeGroupeRech());

		String rclibgroupefonction = (rcGroupefonctionForm
				.getNumRcLibGroupeRech() == null ? "" : rcGroupefonctionForm
				.getNumRcLibGroupeRech());

		//Condition de recherche
		if (!rccodegroupefonction.equals("")){
			condition += " and rcCodeGroupe = " + rccodegroupefonction;
		}
		if (!rclibgroupefonction.equals("")){
			condition += " and rcLibGroupe LIKE '%" + rclibgroupefonction
					+ "%' ";
		}
		try {

			List listeRcGroupefonction =  gaindeBusinessDelegate.rechercherGroupefonction("from GroupeFonction where 1 = 1 "+condition);
			// pour la pagination du grid 
						if (listeRcGroupefonction!=null) {
							rcGroupefonctionForm.setRecords(listeRcGroupefonction.size()); 
							rcGroupefonctionForm.setTotal(
									(int) Math.ceil((double)rcGroupefonctionForm.getRecords() 
											/ (double)rcGroupefonctionForm.getRows())); 
							int to = (rcGroupefonctionForm.getRows() * rcGroupefonctionForm.getPage());
						    int from = to - rcGroupefonctionForm.getRows();
						    if (to > rcGroupefonctionForm.getRecords()) {
						    	to = rcGroupefonctionForm.getRecords();
						    }
						    listeRcGroupefonction = listeRcGroupefonction.subList(from, to);
						}
			rcGroupefonctionForm.setListeRcGroupefonction(listeRcGroupefonction);

			if (listeRcGroupefonction!=null && listeRcGroupefonction.size() != 0) {
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcGroupefonction";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodegroupefonction.equals("")){
						rcGroupefonctionForm
								.setNumRcCodeGroupeOB(rccodegroupefonction);
					}

					if (!rclibgroupefonction.equals("")){
						rcGroupefonctionForm
								.setNumRcLibGroupeOB(rclibgroupefonction);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")){
					rcGroupefonctionForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage()); 
		} finally {
			setupFonctionnalites("");
			setupRechercheFonc();
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
	public String supprimerRcGroupefonction() throws Exception {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String pk = request.getParameter(ConstManif.PK);
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcGroupefonction"
				: request.getParameter(ConstManif.PAGE));

		try {
			List<RegroupFonctions> vOldRgv = gaindeBusinessDelegate.rechercherByCodeGroupe(sysEnv.strToInteger(pk));

			if (vOldRgv.size() > 0) {
				for (int i = 0; i < vOldRgv.size(); i++) {
					RegroupFonctions vo = (RegroupFonctions) vOldRgv.get(i);
					gaindeBusinessDelegate.supprimerRegroupFonctions(vo.getRcCodeFonction(), vo.getRcCodeGroupe());
				}
			}
			
			gaindeBusinessDelegate.supprimerGroupefonction(sysEnv.strToInteger(pk));
			List listeRcGroupefonction = gaindeBusinessDelegate.rechercherGroupefonction("from GroupeFonction where 1 = 1");
			rcGroupefonctionForm.setListeRcGroupefonction(listeRcGroupefonction);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		} 
		catch (EJBTransactionRolledbackException e) {
			addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
		}
		catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			setupRechercheFonc();
			if (page != null) {
				forward = page;
			}
		}
		return forward;
	}

	/** ************************************ */
	/** * AFFICHAGE ** */
	/** ************************************ */
	public String afficherRcGroupefonction() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter("pageContext") == null ? "rechercheRcGroupefonction"
				: request.getParameter("pageContext"));
		String pk = request.getParameter(ConstManif.PK);
		GroupeFonction groupefonctionvo = gaindeBusinessDelegate
				.findGroupeFonctionByPrimaryKey(sysEnv.strToInteger(pk));

		if ((groupefonctionvo.getRcCodeGrpPere() != null)
				&& !sysEnv.IntegerToStr(groupefonctionvo.getRcCodeGrpPere())
						.equals("")) {
			Integer keyPere = groupefonctionvo.getRcCodeGrpPere();

			GroupeFonction voPere = gaindeBusinessDelegate.findGroupeFonctionByPrimaryKey(keyPere);
			
			rcGroupefonctionForm.setNumRcLibGrpPere(voPere.getRcLibGroupe());
		}
		rcGroupefonctionForm.setGroupefonction(groupefonctionvo);
		setupRechercheFonc();
		setupFonctionnalites(sysEnv.IntegerToStr(groupefonctionvo.getRcCodeGroupe()));
		forward = page;
		return forward;
	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
		try {
			rcGroupefonctionForm.reset();
			rcGroupefonctionForm.setListeRcGroupefonction(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			setupRechercheFonc();
			forward = page;
		}
		return forward;
	}


	/** ************************************ */
	/** * REMPLIR LES ZONES DE LISTES ** */
	/** ************************************ */
	private void setupRechercheFonc() throws TwreException {

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute(ConstRC.LISTEMODULE, rcGroupefonctionForm.getListModule());
	}

	private void setupFonctionnalites(String codegroupe) throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		List<Fonctionnalite> listFoncFinal ;
		List<FonctionnaliteDto> list1 = new ArrayList<FonctionnaliteDto>();
		List<FonctionnaliteDto> list2 = new ArrayList<FonctionnaliteDto>();

		ListeFonc listeFonc = gaindeBusinessDelegate.getListeFonctionnalites(codegroupe);
		List<Fonctionnalite> listFoncInitial = listeFonc.getListFoncInitial();

		for (int i = 0; i < listFoncInitial.size(); i++) {
			FonctionnaliteDto foncvo = null;
			foncvo = gaindeBusinessDelegate.getFonctionnaliteDto(listFoncInitial.get(i));
			list1.add(foncvo);
		}

		if ((codegroupe != null) && (!codegroupe.equals(""))) {
			listFoncFinal = listeFonc.getListFoncFinal();
			for (int i = 0; i < listFoncFinal.size(); i++) {
				FonctionnaliteDto foncvo = null;
				foncvo = gaindeBusinessDelegate.getFonctionnaliteDto(listFoncFinal.get(i));
				list2.add(foncvo);
			}
		}

		request.setAttribute("list1", list1);
		request.setAttribute("list2", list2);
		rcGroupefonctionForm.setList1(list1);
		rcGroupefonctionForm.setList2(list2);
		rcGroupefonctionForm.setIds1(new String[list1.size()]);
		rcGroupefonctionForm.setIds2(new String[list1.size()]);

	}

	@Override
	public RcGroupefonctionForm getModel() {		
		return rcGroupefonctionForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcGroupefonctionForm form) {
		this.rcGroupefonctionForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcGroupefonctionForm getRcGroupefonctionForm() {
		return rcGroupefonctionForm;
	}


	public void setRcGroupefonctionForm(RcGroupefonctionForm rcGroupefonctionForm) {
		this.rcGroupefonctionForm = rcGroupefonctionForm;
	}
}