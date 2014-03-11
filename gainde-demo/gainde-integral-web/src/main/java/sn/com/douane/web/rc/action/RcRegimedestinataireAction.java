package sn.com.douane.web.rc.action;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;
import sn.com.douane.ejb.rc.model.keys.RegimeDestinataireKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegimedestinataireForm;



public class RcRegimedestinataireAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegimedestinataireForm> {

	private static final long serialVersionUID = 1L;
	private RcRegimedestinataireForm rcRegimedestinataireForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegimedestinataire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDestinataire regimedestinatairevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegimedestinataire" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regimedestinatairevo = rcRegimedestinataireForm.getNewRcRegimedestinataireVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegimeDestinataire(regimedestinatairevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegimedestinataireForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegimedestinataire";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegimedestinataire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegimeDestinataire regimedestinatairevo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegimedestinataire" : request.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regimedestinatairevo = rcRegimedestinataireForm.getNewRcRegimedestinataireVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegimeDestinataire(regimedestinatairevo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcRegimedestinataire";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegimedestinataire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedestinataire" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeppm = (rcRegimedestinataireForm.getNumListRcCodePpmRech()==null ? "" : rcRegimedestinataireForm.getNumListRcCodePpmRech());
		String rccoderegimedouanier = (rcRegimedestinataireForm.getNumListRcCodeRegimeDouanierRech()==null ? "" : rcRegimedestinataireForm.getNumListRcCodeRegimeDouanierRech());
		String rccoderegimefiscal = (rcRegimedestinataireForm.getNumListRcCodeRegimeFiscalRech()==null ? "" : rcRegimedestinataireForm.getNumListRcCodeRegimeFiscalRech());
		String rctyperegime = (rcRegimedestinataireForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegimedestinataireForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccodeppm.equals("")) {
			condition += " and rcCodePpm LIKE '%"+rccodeppm+"%' ";
		}
		if (!rccoderegimedouanier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
		}
		if (!rccoderegimefiscal.equals("")) {
			condition += " and rcCodeRegimeFiscal LIKE '%"+rccoderegimefiscal+"%' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des REGIMEDESTINATAIRE
		try {

			List listeRcRegimedestinataire = null;
			listeRcRegimedestinataire = gaindeBusinessDelegate.rechercherRegimeDestinataire("from RegimeDestinataire where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegimedestinataire!=null) {
				rcRegimedestinataireForm.setRecords(listeRcRegimedestinataire.size()); 
				rcRegimedestinataireForm.setTotal(
						(int) Math.ceil((double)rcRegimedestinataireForm.getRecords() 
								/ (double)rcRegimedestinataireForm.getRows())); 
				int to = (rcRegimedestinataireForm.getRows() * rcRegimedestinataireForm.getPage());
			    int from = to - rcRegimedestinataireForm.getRows();
			    if (to > rcRegimedestinataireForm.getRecords()) {
			    	to = rcRegimedestinataireForm.getRecords();
			    }
			    listeRcRegimedestinataire = listeRcRegimedestinataire.subList(from, to);
			}
			rcRegimedestinataireForm.setListeRcRegimedestinataire(listeRcRegimedestinataire);

			if (listeRcRegimedestinataire != null && listeRcRegimedestinataire.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegimedestinataire";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodeppm.equals("")) {
						rcRegimedestinataireForm.setNumListRcCodePpmOB(rccodeppm);
					}
					if (!rccoderegimedouanier.equals("")) {
						rcRegimedestinataireForm.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					if (!rccoderegimefiscal.equals("")) {
						rcRegimedestinataireForm.setNumListRcCodeRegimeFiscalOB(rccoderegimefiscal);
					}
					if (!rctyperegime.equals("")) {
						rcRegimedestinataireForm.setNumListRcTypeRegimeOB(rctyperegime);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcRegimedestinataireForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche REGIMEDESTINATAIRE" + e.getMessage());
		}

		// forward = page;
		// return forward;
		
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcRegimedestinataire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegimedestinataire = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime= pkTab[0];
		String rccoderegimedouanier= pkTab[1];
		String rccoderegimefiscal= pkTab[2];
		String rccodeppm=pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegimedestinataire" : request.getParameter(ConstManif.PAGE));

		try {

			// On cr�� la cl�
			RegimeDestinataireKey regimedestinatairekey =
					new RegimeDestinataireKey(rctyperegime, rccoderegimedouanier, rccoderegimefiscal, rccodeppm);

			// On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegimeDestinataire(regimedestinatairekey);

			// Raffraichissement de la liste des REGIMEDESTINATAIRE
			listeRcRegimedestinataire = gaindeBusinessDelegate.rechercherRegimeDestinataire("from RegimeDestinataire where 1=1 ");
			rcRegimedestinataireForm.setListeRcRegimedestinataire(listeRcRegimedestinataire);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de REGIMEDESTINATAIRE non r�ussie !****************" + e.getMessage());
		} finally {
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcRegimedestinataire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegimedestinataire" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime= pkTab[0];
		String rccoderegimedouanier= pkTab[1];
		String rccoderegimefiscal= pkTab[2];
		String rccodeppm=pkTab[3];

			//On cr�� la cl�
		RegimeDestinataireKey regimedestinatairekey = new RegimeDestinataireKey (rctyperegime,rccoderegimedouanier,
					rccoderegimefiscal,rccodeppm);

		//Le VO
			RegimeDestinataire regimedestinatairevo = null;

		regimedestinatairevo = gaindeBusinessDelegate.findRegimeDestinataireByPrimaryKey(regimedestinatairekey);

		//Affichage dans le formulaire
		rcRegimedestinataireForm.setRegimedestinataire(regimedestinatairevo);

		//Redirection
		forward = page;
		return forward;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		try {
			rcRegimedestinataireForm.reset();
			rcRegimedestinataireForm.setListeRcRegimedestinataire(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}


//	/***************************************/
//	/***		     CLE PRIMAIRE		    ***/
//	/***************************************/
//private RegimedestinataireKey createRegimedestinataireKey (String rctyperegime, String rccoderegimedouanier,
//		String rccoderegimefiscal, String rccodeppm)
//{
//RegimedestinataireKey regimedestinatairekey = new RegimedestinataireKey (
//		new PpmKey(rccodeppm), new RegimeKey(
//				new RegimefiscalKey(rccoderegimefiscal),
//				new RegimedouanierKey(rccoderegimedouanier,
//						new TyperegimedouaneKey(rctyperegime))));
//
//return regimedestinatairekey;
//}

	@Override
	public RcRegimedestinataireForm getModel() {		
		return rcRegimedestinataireForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcRegimedestinataireForm form) {
		this.rcRegimedestinataireForm = form;

	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcRegimedestinataireForm getRcRegimedestinataireForm() {
		return rcRegimedestinataireForm;
	}

	public void setRcRegimedestinataireForm(RcRegimedestinataireForm rcRegimedestinataireForm) {
		this.rcRegimedestinataireForm = rcRegimedestinataireForm;
	}

}
