package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Langue;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcLangueForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

// TODO: Auto-generated Javadoc
/**
 * The Class RcLangueAction.
 */
public class RcLangueAction extends GeneralDispatchAction implements
		ScopedModelDriven<RcLangueForm> {

	// Adding a form attribute
	/** The rc langue form. */
	RcLangueForm rcLangueForm;

	// Getting the correspondent business delagate
	/** The gainde business delegate. */
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	// Scope key attribute
	/** The scope key. */
	private String scopeKey;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2518763988314160232L;

	
	
	

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** AFFICHAGE ***/
	/***************************************/

	public String afficherRcLangue() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// The page of Forword
		String pageCotext = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcLangue"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Getting the search key
		String pk = request.getParameter(ConstManif.PK);
		// Call the business delegate method

		Langue languevo = gaindeBusinessDelegate
				.rechercherLangueByPrimaryKey(pk);
		// Setting the correspondent form
		rcLangueForm.setLangue(languevo);

		return pageCotext;

	}
	
	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String pageContext = request.getParameter(ConstManif.PAGE_CONTEXT);
		if (pageContext == null) {
			pageContext = request.getParameter(ConstManif.PAGE_CONTEXT);
		}

		try {
			rcLangueForm.reset();
			rcLangueForm.setListeRcLangue(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = pageContext;
		}
		return forward;
	}
	
	/**
	 * ************************************.
	 *
	 * @return the string
	 */
	/*** SUPPRESSION ***/
	/***************************************/

	public String supprimerLangue() {
		HttpServletRequest request = ServletActionContext.getRequest();

		// Clé de l'enregistrement à supprimer
		String pk = request.getParameter(ConstManif.PK);

		// La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcLangue"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		try {

			// On exécute la commande de suppression
			gaindeBusinessDelegate.supprimerLangue(pk);

			// Raffraichissement de la liste des Langues

			List listeRclanguevo = gaindeBusinessDelegate
					.rechercherLangue();

			rcLangueForm.setListeRcLangue(listeRclanguevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));
		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
		}

		return page;
	}	
	
	
	
	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcLangue() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String pageContext = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "modificationRcLangue"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Le VO
		Langue languevo = null;
		try {
			// Filling the Langue attributes
			languevo = rcLangueForm.getNewRcLangueVO();
			// Executing the Modification method
			gaindeBusinessDelegate.modifierLangue(languevo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			pageContext = "modificationRcLangue";
		}
		return pageContext;
	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcLangue() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "saisieRcLangue"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Filling the Langue attributes
		Langue languevo = rcLangueForm.getNewRcLangueVO();
		try {
			// Executing the add command
			gaindeBusinessDelegate.ajouterRcLangue(languevo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// Reset the input fields to blank
			rcLangueForm.reset();
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "saisieRcLangue";

		}
		return page;
	}
	
	/**
	 * ************************************.
	 *
	 * @return the string
	 */
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcLangue() {

		// Déclarations
		HttpServletRequest request = ServletActionContext.getRequest();
		// Init condition de recherche
		String condition = "  from Langue where 1=1 ";
		// On récupère le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		// Le Form Bean
		String pageContext = request.getParameter(ConstManif.PAGE_CONTEXT);

		// Récupération des critères saisis
		String rccodelangue = (rcLangueForm
				.getNumRcCodelangueRech() == null ? "" : rcLangueForm
				.getNumRcCodelangueRech());
		String libellelangue = (rcLangueForm.getNumLibelleLangueRech() == null ? ""
				: rcLangueForm.getNumLibelleLangueRech());

		// Condition de recherche
		if (!rccodelangue.equals("") )
			condition += " and rccodelangue = '" + rccodelangue
					+ "' ";

		if (!libellelangue.equals(""))
			condition += " and libellelangue LIKE '%" + libellelangue + "%' ";

		// Rafraichissement de la liste des Langues

		try {

			List listeRcLangue = null;
			listeRcLangue = gaindeBusinessDelegate
					.rechercherLangueByWhere(condition);

			// pour la pagination du grid
			if (listeRcLangue != null) {
				rcLangueForm.setRecords(listeRcLangue.size());
				rcLangueForm.setTotal((int) Math
						.ceil((double) rcLangueForm.getRecords()
								/ (double) rcLangueForm.getRows()));
				int to = (rcLangueForm.getRows() * rcLangueForm
						.getPage());
				int from = to - rcLangueForm.getRows();
				if (to > rcLangueForm.getRecords()) {
					to = rcLangueForm.getRecords();
				}
				listeRcLangue = listeRcLangue.subList(from, to);
			}

			rcLangueForm.setListeRcLangue(listeRcLangue);

			if (listeRcLangue != null && listeRcLangue.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					pageContext = "saisieRcLangue";
					rcLangueForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodelangue.equals("")) {
						rcLangueForm
								.setNumRcCodeLangueOB(rccodelangue);
					}

					if (!libellelangue.equals("")) {
						rcLangueForm.setNumLibelleLangueOB(libellelangue);
					}

				} else if (ctxmenu.equals("S")) {

					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {

					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcLangueForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		if (pageContext == null) {
			return SUCCESS;
		} else {
			return pageContext;
		}
	}
	
	
	/* (non-Javadoc)
	 * @see sn.com.douane.web.rc.GeneralDispatchAction#returnPrecedent()
	 */
	public String returnPrecedent() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getParameter(ConstManif.PAGE_CONTEXT);
	}
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public RcLangueForm getModel() {
		return rcLangueForm;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#setModel(java.lang.Object)
	 */
	@Override
	public void setModel(RcLangueForm rcLangueForm) {
		this.rcLangueForm = rcLangueForm;

	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#setScopeKey(java.lang.String)
	 */
	@Override
	public void setScopeKey(String scopeKey) {
		this.scopeKey=scopeKey;

	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#getScopeKey()
	 */
	@Override
	public String getScopeKey() {
		// TODO Auto-generated method stub
		return scopeKey;
	}

}
