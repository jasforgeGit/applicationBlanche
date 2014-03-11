package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegDouModeDecl;
import sn.com.douane.ejb.rc.model.keys.RegdouModeDeclKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegdoumodedeclForm;


public class RcRegdoumodedeclAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegdoumodedeclForm> {

	private static final long serialVersionUID = 1L;
	private RcRegdoumodedeclForm rcRegdoumodedeclForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegdoumodedecl() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		//Le VO
		RegDouModeDecl regdoumodedeclvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegdoumodedecl" : request.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regdoumodedeclvo = rcRegdoumodedeclForm.getNewRcRegdoumodedeclVO();

			// On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegDouModeDecl(regdoumodedeclvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			// On vide les champs du formulaire
			rcRegdoumodedeclForm.reset();

			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegdoumodedecl";
		}

		return forward;
	}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegdoumodedecl() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegDouModeDecl regdoumodedeclvo = null;
		//La page de forward
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegdoumodedecl" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		
		try {
			// On remplit les attributs du VO
			regdoumodedeclvo = rcRegdoumodedeclForm.getNewRcRegdoumodedeclVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegDouModeDecl(regdoumodedeclvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcRegdoumodedecl";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegdoumodedecl() {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegdoumodedecl" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodemodedeclaration = (rcRegdoumodedeclForm.getNumListRcCodeModeDeclarationRech()==null ? "" : rcRegdoumodedeclForm.getNumListRcCodeModeDeclarationRech());
		String rccoderegimedouanier = (rcRegdoumodedeclForm.getNumListRcCodeRegimeDouanierRech()==null ? "" : rcRegdoumodedeclForm.getNumListRcCodeRegimeDouanierRech());
		String rctyperegime = (rcRegdoumodedeclForm.getNumListRcTypeRegimeRech()==null ? "" : rcRegdoumodedeclForm.getNumListRcTypeRegimeRech());

		//Condition de recherche
		if (!rccodemodedeclaration.equals("")) {
			condition += " and rcCodeModeDeclaration LIKE '%"+rccodemodedeclaration+"%' ";
		}
		if (!rccoderegimedouanier.equals("")) {
			condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
		}
		if (!rctyperegime.equals("")) {
			condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		//Rafraichissement de la liste des REGDOUMODEDECL
		try
		{

			List listeRcRegdoumodedecl = null;
			listeRcRegdoumodedecl = gaindeBusinessDelegate.rechercherRegDouModeDecl("from RegDouModeDecl where 1 = 1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegdoumodedecl!=null) {
				rcRegdoumodedeclForm.setRecords(listeRcRegdoumodedecl.size()); 
				rcRegdoumodedeclForm.setTotal(
						(int) Math.ceil((double)rcRegdoumodedeclForm.getRecords() 
								/ (double)rcRegdoumodedeclForm.getRows())); 
				int to = (rcRegdoumodedeclForm.getRows() * rcRegdoumodedeclForm.getPage());
			    int from = to - rcRegdoumodedeclForm.getRows();
			    if (to > rcRegdoumodedeclForm.getRecords()) {
			    	to = rcRegdoumodedeclForm.getRecords();
			    }
			    listeRcRegdoumodedecl = listeRcRegdoumodedecl.subList(from, to);
			}
			rcRegdoumodedeclForm.setListeRcRegdoumodedecl(listeRcRegdoumodedecl);

			if (listeRcRegdoumodedecl != null && listeRcRegdoumodedecl.size()!=0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegdoumodedecl";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodemodedeclaration.equals("")) {
						rcRegdoumodedeclForm.setNumListRcCodeModeDeclarationOB(rccodemodedeclaration);
					}
					if (!rccoderegimedouanier.equals("")) {
						rcRegdoumodedeclForm.setNumListRcCodeRegimeDouanierOB(rccoderegimedouanier);
					}
					if (!rctyperegime.equals("")) {
						rcRegdoumodedeclForm.setNumListRcTypeRegimeOB(rctyperegime);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcRegdoumodedeclForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche REGDOUMODEDECL" + e.getMessage());
		}

//		forward = page;
//		return forward;
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcRegdoumodedecl() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegdoumodedecl = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rccoderegimedouanier=pkTab[1]; 
		String rccodemodedeclaration=pkTab[2];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegdoumodedecl" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			RegdouModeDeclKey regdoumodedeclkey = new RegdouModeDeclKey (rctyperegime, rccoderegimedouanier, rccodemodedeclaration);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegDouModeDecl(regdoumodedeclkey);

			//Raffraichissement de la liste des REGDOUMODEDECL
			listeRcRegdoumodedecl = gaindeBusinessDelegate.rechercherRegDouModeDecl("from RegDouModeDecl where 1 = 1 ");
			rcRegdoumodedeclForm.setListeRcRegdoumodedecl(listeRcRegdoumodedecl);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de REGDOUMODEDECL non r�ussie !****************" + e.getMessage());
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
	public String afficherRcRegdoumodedecl () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegdoumodedecl" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rctyperegime=pkTab[0]; 
		String rccoderegimedouanier=pkTab[1]; 
		String rccodemodedeclaration=pkTab[2];

			//On cr�� la cl�
		RegdouModeDeclKey regdoumodedeclkey = new RegdouModeDeclKey (rctyperegime, rccoderegimedouanier, rccodemodedeclaration);

		//Le VO
			RegDouModeDecl regdoumodedeclvo = null;

		regdoumodedeclvo = gaindeBusinessDelegate.findRegDouModeDeclByPrimaryKey(regdoumodedeclkey);

		//Affichage dans le formulaire
		rcRegdoumodedeclForm.setRegdoumodedecl(regdoumodedeclvo);

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
		String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter(ConstManif.PAGE_CONTEXT);
		}
		try {
			rcRegdoumodedeclForm.reset();
			rcRegdoumodedeclForm.setListeRcRegdoumodedecl(new ArrayList());

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
//private RegdoumodedeclKey createRegdoumodedeclKey (String rctyperegime, String rccoderegimedouanier, String rccodemodedeclaration)
//{
//RegdoumodedeclKey regdoumodedeclkey = new RegdoumodedeclKey (new ModedeclarationKey(rccodemodedeclaration),
//		new RegimedouanierKey(rccoderegimedouanier,new TyperegimedouaneKey(rctyperegime)));
//
//return regdoumodedeclkey;
//}
	@Override
	public RcRegdoumodedeclForm getModel() {		
		return rcRegdoumodedeclForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegdoumodedeclForm form) {
		this.rcRegdoumodedeclForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegdoumodedeclForm getRcRegdoumodedeclForm() {
		return rcRegdoumodedeclForm;
	}


	public void setRcRegdoumodedeclForm(RcRegdoumodedeclForm rcRegdoumodedeclForm) {
		this.rcRegdoumodedeclForm = rcRegdoumodedeclForm;
	}
}
