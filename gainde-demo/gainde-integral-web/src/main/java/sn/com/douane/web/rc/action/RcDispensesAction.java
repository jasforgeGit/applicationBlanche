package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Dispense;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcDispensesForm;

/**
 * The Class RcDispensesAction.
 * 
 * @author kerfahi ghazi
 */
public class RcDispensesAction extends GeneralDispatchAction implements ScopedModelDriven<RcDispensesForm> {

	private static final long serialVersionUID = 1L;
	private RcDispensesForm rcDispensesForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();

	/***************************************/
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcDispenses() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		// Le VO
		Dispense DispensesVO = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcDispenses" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			DispensesVO = rcDispensesForm.getNewRcDispensesVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterDispense(DispensesVO);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcDispensesForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcDispenses";
		}

		return forward;
	}

	/***************************************/
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcDispenses() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		// Le VO
		Dispense dispensesVO = null;

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcDispenses" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			dispensesVO = rcDispensesForm.getNewRcDispensesVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierDispense(dispensesVO);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));

			// On forward
			forward = "modificationRcDispenses";
		}

		return forward;
	}

	/***************************************/
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcDispenses() {

		HttpServletRequest request = ServletActionContext.getRequest();

		// On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
//		String page =
//				(request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcDispenses" : request
//						.getParameter(ConstManif.PAGE_CONTEXT));
		String condition = " ";

		// R�cup�ration des crit�res saisis
		String rccodedispense =
				(rcDispensesForm.getNumRcCodeDispenseRech() == null ? "" : rcDispensesForm.getNumRcCodeDispenseRech());
		;
		String rccodetaxe =
				(rcDispensesForm.getNumListRcCodeTaxeRech() == null ? "" : rcDispensesForm.getNumListRcCodeTaxeRech());
		String rcdesdispense =
				(rcDispensesForm.getNumRcDesDispenseRech() == null ? "" : rcDispensesForm.getNumRcDesDispenseRech());

		// Condition de recherche
		if (!rccodedispense.equals("")) {
			condition += " and rccodedispense = '" + rccodedispense + "' ";
		}

		if (!rccodetaxe.equals("")) {
			condition += " and rcCodeTaxe = '" + rccodetaxe + "' ";
		}

		if (!rcdesdispense.equals("")) {
			condition += " and rcdesdispense LIKE '%" + rcdesdispense + "%' ";
		}

		// Rafraichissement de la liste des Dispenses
		try {

			List listeRcDispenses = null;
			listeRcDispenses = gaindeBusinessDelegate.rechercherDispense("from Dispense where 1 = 1 " + condition);

			// pour la pagination du grid
			if (listeRcDispenses != null) {
				rcDispensesForm.setRecords(listeRcDispenses.size());
				rcDispensesForm.setTotal((int) Math.ceil((double) rcDispensesForm.getRecords()
						/ (double) rcDispensesForm.getRows()));
				int to = (rcDispensesForm.getRows() * rcDispensesForm.getPage());
				int from = to - rcDispensesForm.getRows();
				if (to > rcDispensesForm.getRecords()) {
					to = rcDispensesForm.getRecords();
				}
				listeRcDispenses = listeRcDispenses.subList(from, to);
			}

			rcDispensesForm.setListeRcDispenses(listeRcDispenses);

			if (listeRcDispenses != null && listeRcDispenses.size() != 0) {
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcDispenses";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodedispense.equals("")) {
						rcDispensesForm.setNumRcCodeDispenseOB(rccodedispense);
					}

					if (!rccodetaxe.equals("")) {
						rcDispensesForm.setNumListRcCodeTaxeOB(rccodetaxe);
					}

					if (!rcdesdispense.equals("")) {
						rcDispensesForm.setNumRcDesDispenseOB(rcdesdispense);
					}

				} else {
					if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}
				}
				if (!ctxmenu.equals("C")) {
					rcDispensesForm.resetChampsRecherche();
				}

			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		// forward = page;
		// return forward;
		if (page == null) {
			return SUCCESS;
		} else {
			return page;
		}
	}

	/***************************************/
	/*** SUPPRESSION ***/
	/***************************************/
	public String supprimerRcDispenses() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcDispenses = null;

		// Le VO
//		Dispense dispensesVO = null;

		// Cl� de l'enregistrement � supprimer
		String rccodedispense = request.getParameter(ConstManif.PK);

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "rechercheRcDispenses" : request
						.getParameter(ConstManif.PAGE));

		try {

//			// On remplit les attributs du VO
//			dispensesVO = rcDispensesForm.getNewRcDispensesVO();

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerDispense(rccodedispense);

			// Raffraichissement de la liste des Dispenses
			listeRcDispenses = gaindeBusinessDelegate.rechercherDispense("from Dispense where 1 = 1 ");
			rcDispensesForm.setListeRcDispenses(listeRcDispenses);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));
			// nouvelle version errors.add("name", new
			// ActionError(ConstErrCodRC.succefulDeleteRC,dispensesVO.getRcdesdispense()));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.info("**************** Suppression  non r�ussie !****************");
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;
	}

	/***************************************/
	/*** AFFICHAGE ***/
	/***************************************/
	public String afficherRcDispenses() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		// Page de redirection
		String forward = null;

		String page =
				(request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcDispenses" : request
						.getParameter(ConstManif.PAGE_CONTEXT));

		// Cl� de recherche
		String rccodedispense = request.getParameter(ConstManif.PK);

		// Objet Dispenses
		Dispense DispensesVO = null;
		DispensesVO = gaindeBusinessDelegate.findDispenseByPrimaryKey(rccodedispense);

		// Affichage dans le formulaire
		rcDispensesForm.setDispenses(DispensesVO);

		// Redirection
		forward = page;

		return forward;
	}

	/***************************************/
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null) {
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}

		try {
			rcDispensesForm.reset();
			rcDispensesForm.setListeRcDispenses(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {

			forward = page;
		}
		return forward;
	}

	@Override
	public RcDispensesForm getModel() {
		return rcDispensesForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcDispensesForm form) {
		this.rcDispensesForm = form;
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcDispensesForm getRcDispensesForm() {
		return rcDispensesForm;
	}

	public void setRcDispensesForm(RcDispensesForm rcDispensesForm) {
		this.rcDispensesForm = rcDispensesForm;
	}
}