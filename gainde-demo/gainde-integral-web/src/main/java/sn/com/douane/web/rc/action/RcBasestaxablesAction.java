package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.BasesTaxable;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcBasestaxablesForm;
import tn.com.tw.java.exception.ConstErrCodRC;


/**
 * The Class RcBasestaxablesAction.
 *
 * @author kerfahi ghazi
 */
public class RcBasestaxablesAction extends GeneralDispatchAction implements ScopedModelDriven<RcBasestaxablesForm> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The log. */
	private transient final Log LOG = LogFactory.getLog(getClass());
	
	/** The rc basestaxables form. */
	private RcBasestaxablesForm rcBasestaxablesForm;
	
	/** The scope key. */
	private String scopeKey;
	
	/** The gainde business delegate. */
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcBasestaxables() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		// Le VO
		BasesTaxable basestaxablesvo = null;
		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "saisieRcBasestaxables" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			basestaxablesvo = rcBasestaxablesForm.getNewRcBasestaxablesVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterBasesTaxable(basestaxablesvo);

			addActionError(getText(ConstErrCodRC.succefulInsert));

			// On vide les champs du formulaire
			rcBasestaxablesForm.reset(request);

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//forward = "RcBasestaxables";
			forward = "saisieRcBasestaxables";
		}
		return forward;
	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcBasestaxables() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		// Le VO
		BasesTaxable basestaxablesvo = null;
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "modificationRcBasestaxables" : request
						.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			basestaxablesvo = rcBasestaxablesForm.getNewRcBasestaxablesVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierBasesTaxable(basestaxablesvo);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcBasestaxables";
		}
		return forward;
	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcBasestaxables() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String pageResult = request.getParameter("pageContext");
		String condition = " ";

		// On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);

		// R�cup�ration des crit�res saisis
		String rccodetaxe =
				(rcBasestaxablesForm.getNumListRcCodeTaxeRech() == null ? "" : rcBasestaxablesForm
						.getNumListRcCodeTaxeRech());
		String rccodetaxebase =
				(rcBasestaxablesForm.getNumListRcCodeTaxeBaseRech() == null ? "" : rcBasestaxablesForm
						.getNumListRcCodeTaxeBaseRech());
		String rcordrecalcul =
				(rcBasestaxablesForm.getNumRcOrdreCalculRech() == null ? "" : rcBasestaxablesForm
						.getNumRcOrdreCalculRech());

		// Condition de recherche
		if (!rccodetaxe.equals("")){
			condition += " and rcCodeTaxe = '" + rccodetaxe + "' ";
		}
		if (!rccodetaxebase.equals("")){
			condition += " and rcCodeTaxeBase = '" + rccodetaxebase + "' ";
		}
		if (!rcordrecalcul.equals("")){
			condition += " and rcOrdreCalcul = " + rcordrecalcul + " ";
		}
		// Rafraichissement de la liste des BASESTAXABLES
		try {

			List listeRcBasestaxables = null;
			listeRcBasestaxables =
					gaindeBusinessDelegate.rechercherBasesTaxable("from BasesTaxable where 1 = 1 " + condition);

			// pour la pagination du grid
			if (listeRcBasestaxables != null) {
				rcBasestaxablesForm.setRecords(listeRcBasestaxables.size());
				rcBasestaxablesForm.setTotal((int) Math.ceil((double) rcBasestaxablesForm.getRecords()
						/ (double) rcBasestaxablesForm.getRows()));
				int to = (rcBasestaxablesForm.getRows() * rcBasestaxablesForm.getPage());
				int from = to - rcBasestaxablesForm.getRows();
				if (to > rcBasestaxablesForm.getRecords()) {
					to = rcBasestaxablesForm.getRecords();
				}
				listeRcBasestaxables = listeRcBasestaxables.subList(from, to);
			}
				rcBasestaxablesForm.setListeRcBasestaxables(listeRcBasestaxables);

				if (listeRcBasestaxables != null && listeRcBasestaxables.size() != 0)
				{
					if (!ctxmenu.equals("C")){
						request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
					}
				} else {

					if (ctxmenu.equals("SM")) {
						pageResult = "saisieRcBasestaxables";

						request.getSession().setAttribute(ConstManif.CTXMENU, "S");

						if (!rccodetaxe.equals("")){
							rcBasestaxablesForm.setNumListRcCodeTaxeOB(rccodetaxe);
						}
						if (!rccodetaxebase.equals("")){
							rcBasestaxablesForm.setNumListRcCodeTaxeBaseOB(rccodetaxebase);
						}
						if (!rcordrecalcul.equals("")){
							rcBasestaxablesForm.setNumRcOrdreCalculOB(rcordrecalcul);
						}
					} else if (ctxmenu.equals("S")) {
						request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
					} else {
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

					if (!ctxmenu.equals("C")){
						rcBasestaxablesForm.resetChampsRecherche();
					}
				}		
		} catch (Exception e) {
			LOG.error("Error occurred when trying to find basestaxable");
		}

		if (pageResult == null) {
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** SUPPRESSION ***/
	/***************************************/
	public String supprimerRcBasestaxables() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcBasestaxables = null;
		// Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rccodetaxe = pkTab[0];
		String rccodetaxebase = pkTab[1];

		// La page de forward
		String page =
				(request.getParameter(ConstManif.PAGE) == null ? "rechercheRcBasestaxables" : request
						.getParameter(ConstManif.PAGE));

		try {

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerBasesTaxable(rccodetaxe, rccodetaxebase);

			// Raffraichissement de la liste des BASESTAXABLES
			listeRcBasestaxables = gaindeBusinessDelegate.rechercherBasesTaxable("from BasesTaxable where 1 = 1 ");
			rcBasestaxablesForm.setListeRcBasestaxables(listeRcBasestaxables);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.ejbExp)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** AFFICHAGE ***/
	/***************************************/
	public String afficherRcBasestaxables() throws Exception{

		HttpServletRequest request = ServletActionContext.getRequest();

		// La page de forward
		String page =
				(request.getParameter("pageContext") == null ? "rechercheRcBasestaxables" : request
						.getParameter("pageContext"));

		// Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rccodetaxe = pkTab[0];
		String rccodetaxebase = pkTab[1];
		LOG.info("--------avant recherche rccodetaxe---------" + rccodetaxe);
		LOG.info("--------rccodetaxebase------" + rccodetaxebase);

		// Le VO
		BasesTaxable basestaxablesvo = null;

		basestaxablesvo = gaindeBusinessDelegate.findBasesTaxableByPrimaryKey(rccodetaxe, rccodetaxebase);
		LOG.info("--------apr�s recherche rccodetaxe---------" + basestaxablesvo.getRcCodeTaxe());
		LOG.info("--------rccodetaxebase------" + basestaxablesvo.getRcCodeTaxeBase());

		// Affichage dans le formulaire
		rcBasestaxablesForm.setBasestaxables(basestaxablesvo);
		LOG.info("--------apr�s affectation FB rccodetaxe---------" + basestaxablesvo.getRcCodeTaxe());
		LOG.info("--------rccodetaxebase------" + basestaxablesvo.getRcCodeTaxeBase());

		return page;

	}

	/**
	 * ************************************.
	 *
	 * @return the string
	 * @throws Exception the exception
	 */
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null) {
			page = request.getParameter("pageContext");
		}

		try {
			rcBasestaxablesForm.reset(request);
			rcBasestaxablesForm.setListeRcBasestaxables(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public RcBasestaxablesForm getModel() {
		return rcBasestaxablesForm;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#getScopeKey()
	 */
	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#setModel(java.lang.Object)
	 */
	@Override
	public void setModel(RcBasestaxablesForm form) {
		this.rcBasestaxablesForm = form;

	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.ScopedModelDriven#setScopeKey(java.lang.String)
	 */
	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	/**
	 * Gets the rc basestaxables form.
	 *
	 * @return the rc basestaxables form
	 */
	public RcBasestaxablesForm getRcBasestaxablesForm() {
		return rcBasestaxablesForm;
	}

	/**
	 * Sets the rc basestaxables form.
	 *
	 * @param rcBasestaxablesForm the new rc basestaxables form
	 */
	public void setRcBasestaxablesForm(RcBasestaxablesForm rcBasestaxablesForm) {
		this.rcBasestaxablesForm = rcBasestaxablesForm;
	}
}
