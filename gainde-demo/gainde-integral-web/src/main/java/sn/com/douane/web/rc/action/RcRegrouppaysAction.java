package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.RegroupPays;
import sn.com.douane.ejb.rc.model.keys.RegroupPaysKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcRegrouppaysForm;


public class RcRegrouppaysAction extends GeneralDispatchAction implements ScopedModelDriven<RcRegrouppaysForm> {

	
	private static final long serialVersionUID = 1L;
	private RcRegrouppaysForm rcRegrouppaysForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcRegrouppays() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegroupPays regrouppaysvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcRegrouppays" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			regrouppaysvo = rcRegrouppaysForm.getNewRcRegrouppaysVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterRegroupPays(regrouppaysvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcRegrouppaysForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcRegrouppays";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcRegrouppays() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		RegroupPays regrouppaysvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcRegrouppays" : request.getParameter(ConstManif.PAGE));

		try {
			// On remplit les attributs du VO
			regrouppaysvo = rcRegrouppaysForm.getNewRcRegrouppaysVO();

			// On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierRegroupPays(regrouppaysvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			// On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcRegrouppays";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcRegrouppays() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegrouppays" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodepays = (rcRegrouppaysForm.getNumListRcCodePaysRech()==null ? "" : rcRegrouppaysForm.getNumListRcCodePaysRech());
		String rccoderegroup = (rcRegrouppaysForm.getNumListRcCodeRegroupRech()==null ? "" : rcRegrouppaysForm.getNumListRcCodeRegroupRech());

		//Condition de recherche
		if (!rccodepays.equals("")) {
			condition += " and rcCodePays LIKE '%"+rccodepays+"%' ";
		}
		if (!rccoderegroup.equals("")) {
			condition += " and rcCodeRegroup LIKE '%"+rccoderegroup+"%' ";
		}
		//Rafraichissement de la liste des REGROUPPAYS
		try
		{

			List listeRcRegrouppays = null;
			listeRcRegrouppays = gaindeBusinessDelegate.rechercherRegroupPays("from RegroupPays where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcRegrouppays!=null) {
				rcRegrouppaysForm.setRecords(listeRcRegrouppays.size()); 
				rcRegrouppaysForm.setTotal(
						(int) Math.ceil((double)rcRegrouppaysForm.getRecords() 
								/ (double)rcRegrouppaysForm.getRows())); 
				int to = (rcRegrouppaysForm.getRows() * rcRegrouppaysForm.getPage());
			    int from = to - rcRegrouppaysForm.getRows();
			    if (to > rcRegrouppaysForm.getRecords()) {
			    	to = rcRegrouppaysForm.getRecords();
			    }
			    listeRcRegrouppays = listeRcRegrouppays.subList(from, to);
			}
			rcRegrouppaysForm.setListeRcRegrouppays(listeRcRegrouppays);

			if (listeRcRegrouppays != null && listeRcRegrouppays.size() != 0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM")) {
					page = "saisieRcRegrouppays";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!rccodepays.equals("")) {
						rcRegrouppaysForm.setNumListRcCodePaysOB(rccodepays);
					}
					if (!rccoderegroup.equals("")) {
						rcRegrouppaysForm.setNumListRcCodeRegroupOB(rccoderegroup);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcRegrouppaysForm.resetChampsRecherche();
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche REGROUPPAYS" + e.getMessage());
		}
		if (page == null) {
			return SUCCESS;
		} else {
			return page;
		}

	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcRegrouppays() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcRegrouppays = null;

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccoderegroup=pkTab[0]; 
		String rccodepays=pkTab[1]; 

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcRegrouppays" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			RegroupPaysKey regrouppayskey = new RegroupPaysKey (rccoderegroup,rccodepays);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerRegroupPays(regrouppayskey);

			//Raffraichissement de la liste des REGROUPPAYS
			listeRcRegrouppays = gaindeBusinessDelegate.rechercherRegroupPays("from RegroupPays where 1=1 ");
			rcRegrouppaysForm.setListeRcRegrouppays(listeRcRegrouppays);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de REGROUPPAYS non r�ussie !****************"+ e.getMessage());
		}
		finally
		{
			if (page != null) {
				forward = page;
			}
		}

		return forward;

	}


	/***************************************/
	/***            AFFICHAGE            ***/
	/***************************************/
	public String afficherRcRegrouppays () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcRegrouppays" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccoderegroup=pkTab[0]; 
		String rccodepays=pkTab[1]; 

			//On cr�� la cl�
		RegroupPaysKey regrouppayskey = new RegroupPaysKey (rccoderegroup,rccodepays);

		//Le VO
			RegroupPays regrouppaysvo = null;

		regrouppaysvo = gaindeBusinessDelegate.findAgreeByPrimaryKey(regrouppayskey);


		//Affichage dans le formulaire
		rcRegrouppaysForm.setRegrouppays(regrouppaysvo);

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
			rcRegrouppaysForm.reset();
			rcRegrouppaysForm.setListeRcRegrouppays(new ArrayList());

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
//private RegrouppaysKey createRegrouppaysKey (String rccoderegroup, String rccodepays)
//{
//RegrouppaysKey regrouppayskey = new RegrouppaysKey (new PaysKey(rccodepays),new RegroupementKey(rccoderegroup));
//
//return regrouppayskey;
//}
	@Override
	public RcRegrouppaysForm getModel() {		
		return rcRegrouppaysForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcRegrouppaysForm form) {
		this.rcRegrouppaysForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcRegrouppaysForm getRcRegrouppaysForm() {
		return rcRegrouppaysForm;
	}


	public void setRcRegrouppaysForm(RcRegrouppaysForm rcRegrouppaysForm) {
		this.rcRegrouppaysForm = rcRegrouppaysForm;
	}
	
}
