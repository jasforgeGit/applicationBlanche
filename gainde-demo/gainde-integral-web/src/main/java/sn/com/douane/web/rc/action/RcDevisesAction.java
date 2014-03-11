package sn.com.douane.web.rc.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcDevisesForm;
import tn.com.tw.java.exception.ConstErrCodRC;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

/**
 * @author rkhaskhoussy
 * 
 */
public class RcDevisesAction extends GeneralDispatchAction implements
		ScopedModelDriven<RcDevisesForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Adding a form attribute
	RcDevisesForm rcDevisesForm;

	// Getting the correspondent business delagate
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	// Scope key attribute
	private String scopeKey;

	/***************************************/
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcDevises() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "saisieRcDevises"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Filling the DevisesVO attributes
		Devises devisesvo = rcDevisesForm.getNewRcDevisesVO();
		try {
			// Executing the add command
			gaindeBusinessDelegate.ajouterRcDevises(devisesvo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.succefulUpdate));
			// Reset the input fields to blank
			rcDevisesForm.reset();
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "saisieRcDevises";

		}
		return page;
	}

	/***************************************/
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcDevises() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "modificationRcDevises"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Le VO
		Devises devisesvo = null;
		try {
			// Filling the DevisesVO attributes
			devisesvo = rcDevisesForm.getNewRcDevisesVO();
			// Executing the Modification method
			gaindeBusinessDelegate.modifierDevises(devisesvo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.succefulUpdate));
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "modificationRcDevises";
		}
		return page;
	}

	/***************************************/
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcDevises() throws Exception {

		// Déclarations
		HttpServletRequest request = ServletActionContext.getRequest();
		// Init condition de recherche
		String condition = "  from Devises where 1=1 ";
		// On récupère le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		// Le Form Bean

		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		// Récupération des critères saisis
		String rccodedevise = (rcDevisesForm.getNumRcCodeDeviseRech() == null ? ""
				: rcDevisesForm.getNumRcCodeDeviseRech());
		String rccoefficient = (rcDevisesForm.getNumRcCoefficientRech() == null ? ""
				: rcDevisesForm.getNumRcCoefficientRech());
		String rcdatedevise = (rcDevisesForm.getDatRcDateDeviseRech() == null ? ""
				: rcDevisesForm.getDatRcDateDeviseRech());
		String rclibelledevise = (rcDevisesForm.getNumRcLibelleDeviseRech() == null ? ""
				: rcDevisesForm.getNumRcLibelleDeviseRech());
		String rcprecisiondev = (rcDevisesForm.getNumRcPrecisionDevRech() == null ? ""
				: rcDevisesForm.getNumRcPrecisionDevRech());
		String rcqtecfa = (rcDevisesForm.getNumRcQteCFaRech() == null ? ""
				: rcDevisesForm.getNumRcQteCFaRech());
		String rcqtedevise = (rcDevisesForm.getNumRcQteDeviseRech() == null ? ""
				: rcDevisesForm.getNumRcQteDeviseRech());
		String rcusermodif = (rcDevisesForm.getNumRcUserModifRech() == null ? ""
				: rcDevisesForm.getNumRcUserModifRech());

		// Condition de recherche
		if (!rccodedevise.equals(""))
			condition += " and RCCODEDEVISE = '" + rccodedevise + "' ";

		if (!rccoefficient.equals(""))
			condition += " and RCCOEFFICIENT = "
					+ sysEnv.strToInteger(rccoefficient) + " ";

		if (!rcdatedevise.equals(""))
			condition += " and RCDATEDEVISE = '"
					+ new Date(DateUtil.convertStringToDate(rcdatedevise)
							.getTime()) + "' ";

		if (!rclibelledevise.equals(""))
			condition += " and RCLIBELLEDEVISE = '" + rclibelledevise + "' ";

		if (!rcprecisiondev.equals(""))
			condition += " and RCPRECISIONDEV = "
					+ sysEnv.strToInteger(rcprecisiondev) + " ";

		if (!rcqtecfa.equals(""))
			condition += " and RCQTECFA = " + sysEnv.strToBigDecimal(rcqtecfa)
					+ " ";

		if (!rcqtedevise.equals(""))
			condition += " and RCQTEDEVISE = "
					+ sysEnv.strToBigDecimal(rcqtedevise) + " ";

		if (!rcusermodif.equals(""))
			condition += " and RCUSERMODIF = '" + rcusermodif + "' ";

		// Rafraichissement de la liste des DEVISES
		try {

			List listeRcDevises = null;
			listeRcDevises = gaindeBusinessDelegate
					.rechercherDevises(condition);

			// pour la pagination du grid
			if (listeRcDevises != null) {
				rcDevisesForm.setRecords(listeRcDevises.size());
				rcDevisesForm.setTotal((int) Math.ceil((double) rcDevisesForm
						.getRecords() / (double) rcDevisesForm.getRows()));
				int to = (rcDevisesForm.getRows() * rcDevisesForm.getPage());
				int from = to - rcDevisesForm.getRows();
				if (to > rcDevisesForm.getRecords()) {
					to = rcDevisesForm.getRecords();
				}
				listeRcDevises = listeRcDevises.subList(from, to);
			}

			rcDevisesForm.setListeRcDevises(listeRcDevises);

			if (listeRcDevises != null && listeRcDevises.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcDevises";
					rcDevisesForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodedevise.equals("")){
						rcDevisesForm.setNumRcCodeDeviseOB(rccodedevise);
					}
					if (!rccoefficient.equals(""))
						rcDevisesForm.setNumRcCoefficientOB(rccoefficient);

					if (!rcdatedevise.equals(""))
						rcDevisesForm.setDatRcDateDeviseOB(rcdatedevise);

					if (!rclibelledevise.equals(""))
						rcDevisesForm.setNumRcLibelleDeviseOB(rclibelledevise);

					if (!rcprecisiondev.equals(""))
						rcDevisesForm.setNumRcPrecisionDevOB(rcprecisiondev);

					if (!rcqtecfa.equals(""))
						rcDevisesForm.setNumRcQteCFaOB(rcqtecfa);

					if (!rcqtedevise.equals(""))
						rcDevisesForm.setNumRcQteDeviseOB(rcqtedevise);

					if (!rcusermodif.equals(""))
						rcDevisesForm.setNumRcUserModifOB(rcusermodif);

				} else if (ctxmenu.equals("S")) {

					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {

					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcDevisesForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		if (page == null) {
			return SUCCESS;
		} else {
			return page;
		}

	}

	/***************************************/
	/*** SUPPRESSION ***/
	/***************************************/
	public String supprimerRcDevises() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Clé de l'enregistrement à supprimer
		String pk = request.getParameter(ConstManif.PK);

		// La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcDevises"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		try {

			// On exécute la commande de suppression
			gaindeBusinessDelegate.supprimerDevises(pk);

			// Raffraichissement de la liste des DEVISES

			List listeRcDevises = gaindeBusinessDelegate.rechercherDevises("from Devises where 1=1 ");

			rcDevisesForm.setListeRcDevises(listeRcDevises);

			addActionError(getText(ConstErrCodRC.succefulDelete));
		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.ejbExp)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
		}

		return page;

	}

	/***************************************/
	/*** AFFICHAGE ***/
	/***************************************/
	public String afficherRcDevises() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcDevises"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// get the pk
		String pk = request.getParameter(ConstManif.PK);
		// Call the business delegate method
		Devises devisesvo = gaindeBusinessDelegate
				.findDevisesByPrimaryKey(pk);
		// Setting the correspondent form
		rcDevisesForm.setDevises(devisesvo);
		return page;

	}

	/***************************************/
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		if (page == null) {
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}

		try {
			rcDevisesForm.reset();
			rcDevisesForm.setListeRcDevises(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;

	}

	// Overrided Methods
	public RcDevisesForm getModel() {
		return rcDevisesForm;
	}

	public String getScopeKey() {
		return scopeKey;
	}

	public void setModel(RcDevisesForm rcDevisesForm) {
		this.rcDevisesForm = rcDevisesForm;

	}

	public void setScopeKey(String scopeKey) {
		this.scopeKey = scopeKey;

	}

	/**
	 * @return the rcDevisesForm
	 */
	public RcDevisesForm getRcDevisesForm() {
		return rcDevisesForm;
	}

	/**
	 * @param rcDevisesForm
	 *            the rcDevisesForm to set
	 */
	public void setRcDevisesForm(RcDevisesForm rcDevisesForm) {
		this.rcDevisesForm = rcDevisesForm;
	}

	/**
	 * @return the gaindeBusinessDelegate
	 */
	public GaindeBusinessDelegate getGaindeBusinessDelegate() {
		return gaindeBusinessDelegate;
	}

	/**
	 * @param gaindeBusinessDelegate
	 *            the gaindeBusinessDelegate to set
	 */
	public void setGaindeBusinessDelegate(
			GaindeBusinessDelegate gaindeBusinessDelegate) {
		this.gaindeBusinessDelegate = gaindeBusinessDelegate;
	}

	/* (non-Javadoc)
	 * @see sn.com.douane.web.rc.GeneralDispatchAction#returnPrecedent()
	 */
	@Override
    public String returnPrecedent() throws Exception {
    	HttpServletRequest request = ServletActionContext.getRequest();
        return request.getParameter(ConstManif.PAGE_CONTEXT);       
    }
    
   

}