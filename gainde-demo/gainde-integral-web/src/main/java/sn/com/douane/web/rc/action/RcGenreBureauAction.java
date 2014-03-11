package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import sn.com.douane.web.rc.GeneralDispatchAction;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.GenreBureau;
import sn.com.douane.utils.ConstManif;

import sn.com.douane.web.rc.form.RcGenreBureauForm;


public class RcGenreBureauAction extends GeneralDispatchAction implements
		ScopedModelDriven<RcGenreBureauForm> {

	private static final long serialVersionUID = 1L;

	// Adding a form attribute
	RcGenreBureauForm rcGenreBureauForm;

	// Getting the correspondent business delagate
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	// Scope key attribute
	/** The scope key. */
	private String scopeKey;

	/***************************************/
	/*** AFFICHAGE ***/
	/***************************************/

	public String afficherRcGenrebureau() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// The page of Forword
		String pageCotext = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcGenrebureau"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Getting the search key
		String pk = request.getParameter(ConstManif.PK);
		// Call the business delegate method

		GenreBureau genrebureauvo = gaindeBusinessDelegate
				.rechercherGenreBureauByPrimaryKey(pk);
		// Setting the correspondent form
		rcGenreBureauForm.setGenreBureau(genrebureauvo);

		return pageCotext;

	}

	/***************************************/
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
			rcGenreBureauForm.reset();
			rcGenreBureauForm.setListeRcGenrebureau(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = pageContext;
		}
		return forward;
	}

	/***************************************/
	/*** SUPPRESSION ***/
	/***************************************/

	public String supprimerRcGenrebureau() {
		HttpServletRequest request = ServletActionContext.getRequest();

		// Clé de l'enregistrement à supprimer
		String pk = request.getParameter(ConstManif.PK);

		// La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcGenrebureau"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		try {

			// On exécute la commande de suppression
			gaindeBusinessDelegate.supprimerGenreBureau(pk);

			// Raffraichissement de la liste des Genres Bureau

			List listeRcGenreBureau = gaindeBusinessDelegate
					.rechercherGenreBureau();

			rcGenreBureauForm.setListeRcGenrebureau(listeRcGenreBureau);

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

	/***************************************/
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcGenrebureau() {

		// Déclarations
		HttpServletRequest request = ServletActionContext.getRequest();
		// Init condition de recherche
		String condition = "  from GenreBureau where 1=1 ";
		// On récupère le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		// Le Form Bean
		String pageContext = request.getParameter(ConstManif.PAGE_CONTEXT);

		// Récupération des critères saisis
		String rcdesgenrebureau = (rcGenreBureauForm
				.getNumRcDesGenreBureauRech() == null ? "" : rcGenreBureauForm
				.getNumRcDesGenreBureauRech());
		String rcgenrebureau = (rcGenreBureauForm.getNumRcGenreBureauRech() == null ? ""
				: rcGenreBureauForm.getNumRcGenreBureauRech());

		// Condition de recherche
		if (!rcdesgenrebureau.equals(""))
			condition += " and rcdesgenrebureau LIKE '%" + rcdesgenrebureau
					+ "%' ";

		if (!rcgenrebureau.equals(""))
			condition += " and rcgenrebureau LIKE '%" + rcgenrebureau + "%' ";

		// Rafraichissement de la liste des GENREBUREAU

		try {

			List listeRcGenrebureau = null;
			listeRcGenrebureau = gaindeBusinessDelegate
					.rechercherGenreBureauByWhere(condition);

			// pour la pagination du grid
			if (listeRcGenrebureau != null) {
				rcGenreBureauForm.setRecords(listeRcGenrebureau.size());
				rcGenreBureauForm.setTotal((int) Math
						.ceil((double) rcGenreBureauForm.getRecords()
								/ (double) rcGenreBureauForm.getRows()));
				int to = (rcGenreBureauForm.getRows() * rcGenreBureauForm
						.getPage());
				int from = to - rcGenreBureauForm.getRows();
				if (to > rcGenreBureauForm.getRecords()) {
					to = rcGenreBureauForm.getRecords();
				}
				listeRcGenrebureau = listeRcGenrebureau.subList(from, to);
			}

			rcGenreBureauForm.setListeRcGenrebureau(listeRcGenrebureau);

			if (listeRcGenrebureau != null && listeRcGenrebureau.size() != 0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
			} else {

				if (ctxmenu.equals("SM")) {
					pageContext = "saisieRcGenrebureau";
					rcGenreBureauForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rcdesgenrebureau.equals("")) {
						rcGenreBureauForm
								.setNumRcDesGenreBureauOB(rcdesgenrebureau);
					}

					if (!rcgenrebureau.equals("")) {
						rcGenreBureauForm.setNumRcGenreBureauOB(rcgenrebureau);
					}

				} else if (ctxmenu.equals("S")) {

					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {

					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C"))
					rcGenreBureauForm.resetChampsRecherche();

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

	/***************************************/
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcGenrebureau() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String pageContext = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "modificationRcGenrebureau"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Le VO
		GenreBureau genrebureauvo = null;
		try {
			// Filling the Genre Bureau attributes
			genrebureauvo = rcGenreBureauForm.getNewRcGenreBureauVO();
			// Executing the Modification method
			gaindeBusinessDelegate.modifierGenreBureau(genrebureauvo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			pageContext = "modificationRcGenrebureau";
		}
		return pageContext;
	}

	/***************************************/
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcGenrebureau() throws Exception {
		// Getting the request
		HttpServletRequest request = ServletActionContext.getRequest();
		// The page of forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "saisieRcGenrebureau"
				: request.getParameter(ConstManif.PAGE_CONTEXT));
		// Filling the Genre Bureau attributes
		GenreBureau genreBureauvo = rcGenreBureauForm.getNewRcGenreBureauVO();
		try {
			// Executing the add command
			gaindeBusinessDelegate.ajouterRcGenreBureau(genreBureauvo);
			// Displaying message when update is successfully done
			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// Reset the input fields to blank
			rcGenreBureauForm.reset();
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			page = "saisieRcGenrebureau";

		}
		return page;
	}

	// Les getters et setters

	/**
	 * Gets the gainde business delegate.
	 * 
	 * @return the gainde business delegate
	 */
	public GaindeBusinessDelegate getGaindeBusinessDelegate() {
		return gaindeBusinessDelegate;
	}

	public RcGenreBureauForm getRcGenreBureauForm() {
		return rcGenreBureauForm;
	}

	public void setRcGenreBureauForm(RcGenreBureauForm rcGenreBureauForm) {
		this.rcGenreBureauForm = rcGenreBureauForm;
	}

	public void setGaindeBusinessDelegate(
			GaindeBusinessDelegate gaindeBusinessDelegate) {
		this.gaindeBusinessDelegate = gaindeBusinessDelegate;
	}
	public RcGenreBureauForm getModel() {
		return rcGenreBureauForm;
	}

	public String getScopeKey() {
		return scopeKey;
	}

	public void setModel(RcGenreBureauForm rcGenreBureauForm) {
		this.rcGenreBureauForm = rcGenreBureauForm;

	}

	public void setScopeKey(String scopeKey) {
		this.scopeKey = scopeKey;

	}
	
	public String returnPrecedent() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		return request.getParameter(ConstManif.PAGE_CONTEXT);
	}

}
