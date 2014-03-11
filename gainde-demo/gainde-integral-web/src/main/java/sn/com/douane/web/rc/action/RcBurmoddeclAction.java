package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.BurModDecl;
import sn.com.douane.ejb.rc.model.keys.BurModDeclKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcBurmoddeclForm;
import tn.com.tw.java.exception.ConstErrCodRC;


public class RcBurmoddeclAction extends GeneralDispatchAction implements ScopedModelDriven<RcBurmoddeclForm> {

	
	private static final long serialVersionUID = 1L;
	private RcBurmoddeclForm rcBurmoddeclForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcBurmoddecl() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		BurModDecl burmoddeclvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcBurmoddecl" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			burmoddeclvo = rcBurmoddeclForm.getNewRcBurmoddeclVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterBurModDecl(burmoddeclvo);

			addActionError(getText(ConstErrCodRC.succefulInsert));

			//On vide les champs du formulaire
			rcBurmoddeclForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcBurmoddecl";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcBurmoddecl() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		BurModDecl burmoddeclvo = null;

		//On r�cup�re la cl� primaire
//		String rccodeburdecl= rcBurmoddeclForm.getNumListRcCodeBurDeclOB(); 
//		String rcmodedecl= rcBurmoddeclForm.getNumListRcModeDeclOB();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcBurmoddecl" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			burmoddeclvo = rcBurmoddeclForm.getNewRcBurmoddeclVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierBurModDecl(burmoddeclvo);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcBurmoddecl";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcBurmoddecl() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

//		//Le VO
//		BurModDecl burmoddeclvo = new BurModDecl();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcBurmoddecl" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeburdecl = (rcBurmoddeclForm.getNumListRcCodeBurDeclRech()==null ? "" : rcBurmoddeclForm.getNumListRcCodeBurDeclRech());
		String rcmodedecl = (rcBurmoddeclForm.getNumListRcModeDeclRech()==null ? "" : rcBurmoddeclForm.getNumListRcModeDeclRech());

		//Condition de recherche
		if (!rccodeburdecl.equals(""))
			condition += " and rcCodeBurDecl LIKE '%"+rccodeburdecl+"%' ";

		if (!rcmodedecl.equals(""))
			condition += " and rcModeDecl LIKE '%"+rcmodedecl+"%' ";

		//Rafraichissement de la liste des BURMODDECL
		try
		{

			List listeRcBurmoddecl = gaindeBusinessDelegate.rechercherBurModDecl("from BurModDecl where 1 = 1 "+condition);

			// pour la pagination du grid 
			if (listeRcBurmoddecl!=null) {
				rcBurmoddeclForm.setRecords(listeRcBurmoddecl.size()); 
				rcBurmoddeclForm.setTotal(
						(int) Math.ceil((double)rcBurmoddeclForm.getRecords() 
								/ (double)rcBurmoddeclForm.getRows())); 
				int to = (rcBurmoddeclForm.getRows() * rcBurmoddeclForm.getPage());
			    int from = to - rcBurmoddeclForm.getRows();
			    if (to > rcBurmoddeclForm.getRecords()) {
			    	to = rcBurmoddeclForm.getRecords();
			    }
			    listeRcBurmoddecl = listeRcBurmoddecl.subList(from, to);
			}
			
			rcBurmoddeclForm.setListeRcBurmoddecl(listeRcBurmoddecl);

			if (listeRcBurmoddecl!=null && listeRcBurmoddecl.size()!=0)

			{

				if (!ctxmenu.equals("C"))
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcBurmoddecl";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeburdecl.equals("")) {
						rcBurmoddeclForm.setNumListRcCodeBurDeclOB(rccodeburdecl);
					}
					if (!rcmodedecl.equals("")) {
						rcBurmoddeclForm.setNumListRcModeDeclOB(rcmodedecl);
					}
				}
				else
					if (ctxmenu.equals("S"))
					{
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}
					else
					{
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

				if (!ctxmenu.equals("C")) {
					rcBurmoddeclForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche BURMODDECL");
		}

		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcBurmoddecl() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcBurmoddecl = null;

//		//Le VO
//		BurModDecl burmoddeclvo = new BurModDecl();

		//Cl� de l'enregistrement � supprimer
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodeburdecl= pkTab[0]; 
		String rcmodedecl= pkTab[1];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcBurmoddecl" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			BurModDeclKey burmoddeclkey = new BurModDeclKey (rccodeburdecl, rcmodedecl);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerBurModDecl(burmoddeclkey);

			//Raffraichissement de la liste des BURMODDECL
			listeRcBurmoddecl = gaindeBusinessDelegate.rechercherBurModDecl("from BurModDecl where 1 = 1 ");
			rcBurmoddeclForm.setListeRcBurmoddecl(listeRcBurmoddecl);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp))
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			else
				addActionError(getText(e.getMessage()));

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
	public String afficherRcBurmoddecl () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcBurmoddecl" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pkTab[] = request.getParameter(ConstManif.PK).split(ConstManif.TIELD);
		String rccodeburdecl= pkTab[0]; 
		String rcmodedecl= pkTab[1];

			//On cr�� la cl�
		BurModDeclKey burmoddeclkey = new BurModDeclKey (rccodeburdecl, rcmodedecl);

		//Le VO
		BurModDecl burmoddeclvo = null;

		burmoddeclvo = gaindeBusinessDelegate.findBurModDeclByPrimaryKey(burmoddeclkey);


		//Affichage dans le formulaire
		rcBurmoddeclForm.setBurmoddecl(burmoddeclvo);

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
			rcBurmoddeclForm.reset();
			rcBurmoddeclForm.setListeRcBurmoddecl(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}
finally {
			forward = page;
		}
		return forward;
	}


//	/***************************************/
//	/***		     CLE PRIMAIRE		    ***/
//	/***************************************/
//private BurmoddeclKey createBurmoddeclKey (String rccodeburdecl, String rcmodedecl)
//{
//	BurmoddeclKey burmoddeclkey = new BurmoddeclKey (rccodeburdecl, rcmodedecl);
//
//return burmoddeclkey;
//}
	@Override
	public RcBurmoddeclForm getModel() {		
		return rcBurmoddeclForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcBurmoddeclForm form) {
		this.rcBurmoddeclForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcBurmoddeclForm getRcBurmoddeclForm() {
		return rcBurmoddeclForm;
	}


	public void setRcBurmoddeclForm(RcBurmoddeclForm rcBurmoddeclForm) {
		this.rcBurmoddeclForm = rcBurmoddeclForm;
	}
}
