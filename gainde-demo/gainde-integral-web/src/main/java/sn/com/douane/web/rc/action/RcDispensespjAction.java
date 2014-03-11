package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.FinderException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.DispensePieceJointe;
import sn.com.douane.ejb.rc.model.keys.DispensePieceJointeKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcDispensespjForm;



public class RcDispensespjAction extends GeneralDispatchAction implements ScopedModelDriven<RcDispensespjForm> {

	private static final long serialVersionUID = 1L;
	private RcDispensespjForm rcDispensespjForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate.getBusinessDelegate();
	
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcDispensespj() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		DispensePieceJointe dispensespjvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcDispensespj"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			dispensespjvo = rcDispensespjForm.getNewRcDispensespjVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterDispensePieceJointe(dispensespjvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcDispensespjForm.reset();

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcDispensespj";
		} finally {
			setupRechercheBureauDouane(rcDispensespjForm);
		}

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcDispensespj() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		DispensePieceJointe dispensespjvo = null;

		//On r�cup�re la cl� primaire
//		String rccodedispense = rcDispensespjForm
//				.getNumListRcCodeDispenseOB();
//		String rccodepiecejointe = rcDispensespjForm
//				.getNumListRcCodePieceJointeOB();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcDispensespj"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			dispensespjvo = rcDispensespjForm.getNewRcDispensespjVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierDispensePieceJointe(dispensespjvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcDispensespj";
		} finally {
			setupRechercheBureauDouane(rcDispensespjForm);
		}

		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcDispensespj() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

//		//Le VO
//		DispensePieceJointe dispensespjvo = new DispensePieceJointe();

//		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcDispensespj"
//				: request.getParameter(ConstManif.PAGE));
		String page = request.getParameter("pageContext");
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodedispense = (rcDispensespjForm
				.getNumListRcCodeDispenseRech() == null ? ""
				: rcDispensespjForm.getNumListRcCodeDispenseRech());
		String rccodepiecejointe = (rcDispensespjForm
				.getNumListRcCodePieceJointeRech() == null ? ""
				: rcDispensespjForm.getNumListRcCodePieceJointeRech());

		//Condition de recherche
		if (!rccodedispense.equals(""))
			condition += " and rccodedispense = '" + rccodedispense + "' ";

		if (!rccodepiecejointe.equals(""))
			condition += " and rccodepiecejointe = '" + rccodepiecejointe
					+ "' ";

		//Rafraichissement de la liste des DISPENSESPJ
		try {

			List listeRcDispensespj = null;
			listeRcDispensespj = gaindeBusinessDelegate.rechercherDispensePieceJointe("from DispensePieceJointe where 1 = 1 " + condition);
			// pour la pagination du grid 
						if (listeRcDispensespj!=null) {
							rcDispensespjForm.setRecords(listeRcDispensespj.size()); 
							rcDispensespjForm.setTotal(
									(int) Math.ceil((double)rcDispensespjForm.getRecords() 
											/ (double)rcDispensespjForm.getRows())); 
							int to = (rcDispensespjForm.getRows() * rcDispensespjForm.getPage());
						    int from = to - rcDispensespjForm.getRows();
						    if (to > rcDispensespjForm.getRecords()) {
						    	to = rcDispensespjForm.getRecords();
						    }
						    listeRcDispensespj = listeRcDispensespj.subList(from, to);
						}
			rcDispensespjForm.setListeRcDispensespj(listeRcDispensespj);

			if (listeRcDispensespj != null && listeRcDispensespj.size() != 0)

			{
				//page = "rechercheRcDispensespj";

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcDispensespj";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodedispense.equals(""))
						rcDispensespjForm
								.setNumListRcCodeDispenseOB(rccodedispense);

					if (!rccodepiecejointe.equals(""))
						rcDispensespjForm
								.setNumListRcCodePieceJointeOB(rccodepiecejointe);

				} else if (ctxmenu.equals("S")) {
					//page = "rechercheRcDispensespj";
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					//page = "rechercheRcDispensespj";
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C"))
					rcDispensespjForm.resetChampsRecherche();

			}
		} catch (Exception e) {
			log.error("Erreur de recherche DISPENSESPJ");
		} finally {
			setupRechercheBureauDouane(rcDispensespjForm);
		}

//		forward = page;
//		return forward;
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcDispensespj() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcDispensespj = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);
		String[] pkTab = pk.split(ConstManif.TIELD);
		String rccodedispense = pkTab[0];
		String rccodepiecejointe = pkTab[1];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcDispensespj"
				: request.getParameter(ConstManif.PAGE));

		try {

			//On cr�� la cl�
			DispensePieceJointeKey dispensespjkey = new DispensePieceJointeKey(
					rccodedispense, rccodepiecejointe);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerDispensePieceJointe(dispensespjkey);

			//Raffraichissement de la liste des DISPENSESPJ
			listeRcDispensespj = gaindeBusinessDelegate.rechercherDispensePieceJointe("from DispensePieceJointe where 1 = 1 ");
			rcDispensespjForm.setListeRcDispensespj(listeRcDispensespj);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.EJBEXP))
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			else
				addActionError(getText(e.getMessage()));

			log.error("**** Suppression de DISPENSESPJ non r�ussie !****************");
		} finally {
			if (page != null) {
				forward = page;
			}
			setupRechercheBureauDouane(rcDispensespjForm);
		}

		return forward;

	}

	/** ************************************ */
	/** * AFFICHAGE ** */
	/** ************************************ */
	public String afficherRcDispensespj() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT) == null ? "rechercheRcDispensespj"
				: request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);
		String[] pkTab = pk.split(ConstManif.TIELD);
		String rccodedispense = pkTab[0];
		String rccodepiecejointe = pkTab[1];

		//On cr�� la cl�
		DispensePieceJointeKey dispensespjkey = new DispensePieceJointeKey(rccodedispense,
				rccodepiecejointe);

		//Le VO
		DispensePieceJointe dispensespjvo = null;

		dispensespjvo = gaindeBusinessDelegate.findDispensePieceJointeByPrimaryKey(dispensespjkey);

		//Affichage dans le formulaire
		rcDispensespjForm.setDispensespj(dispensespjvo);

		setupRechercheBureauDouane(rcDispensespjForm);
		//Redirection
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
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}
		try {
			rcDispensespjForm.reset();
			rcDispensespjForm.setListeRcDispensespj(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
			setupRechercheBureauDouane(rcDispensespjForm);
		}
		return forward;
	}

//	/** ************************************ */
//	/** * CLE PRIMAIRE ** */
//	/** ************************************ */
//	private DispensespjKey createDispensespjKey(String rccodedispense,
//			String rccodepiecejointe) {
//		DispensesKey dispensesKey = new DispensesKey(rccodedispense);
//		PiecesjointesKey piecesjointesKey = new PiecesjointesKey(
//				rccodepiecejointe);
//		DispensespjKey dispensespjkey = new DispensespjKey(dispensesKey,
//				piecesjointesKey);
//
//		return dispensespjkey;
//	}

	/** ************************************ */
	/** * REMPLIR LES ZONES DE LISTES ** */
	/** ************************************ 
	 * @throws FinderException */
	private void setupRechercheBureauDouane(RcDispensespjForm rcdispensespjfb) throws TwreException, FinderException {
		HttpServletRequest request = ServletActionContext.getRequest();
		rcDispensespjForm.setListDispenses(gaindeBusinessDelegate
				.getListDispenses());
		request.setAttribute(ConstManif.listDispenses, gaindeBusinessDelegate
				.getListDispenses());
	}

	@Override
	public RcDispensespjForm getModel() {
		return rcDispensespjForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcDispensespjForm form) {
		this.rcDispensespjForm = form;
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcDispensespjForm getRcDispensespjForm() {
		return rcDispensespjForm;
	}

	public void setRcDispensespjForm(RcDispensespjForm rcDispensespjForm) {
		this.rcDispensespjForm = rcDispensespjForm;
	}
	
}