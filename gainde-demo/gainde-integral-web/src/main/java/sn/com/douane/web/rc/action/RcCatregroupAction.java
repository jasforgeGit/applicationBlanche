package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.CatreGroup;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;
import sn.com.douane.web.rc.form.RcCatregroupForm;
import tn.com.tw.java.exception.ConstErrCodRC;


public class RcCatregroupAction extends GeneralDispatchAction implements ScopedModelDriven<RcCatregroupForm> {
		
	private static final long serialVersionUID = 1L;
	private RcCatregroupForm rcCatregroupForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
//	/***************************************/
//	/***         ENREGISTREMENT          ***/
//	/***************************************/
//	public ActionForward enregistrerRcCatregroup(ActionMapping mapping,
//			ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//
//		ActionErrors errors = new ActionErrors();
//		ActionForward forward = new ActionForward(); // return value
//		
//		//La classe des commandes 
//		ReferencesCommunsCmd referencesCommunsCmd = new ReferencesCommunsCmd();
//		
//		//Le Form Bean  
//		RcCatregroupForm rcCatregroupFB = (RcCatregroupForm) form;
//		
//		//Le VO
//		CatregroupVO CatregroupVO = new CatregroupVO();
//		
//		//La page de forward
//		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcCatregroup" : request.getParameter(ConstManif.PAGE));
//		
//		try 
//		{	
//			//On remplit les attributs du VO
//			CatregroupVO = rcCatregroupFB.getNewRcCatregroupVO();
//					
//			//On ex�cute la commande d'ajout
//			referencesCommunsCmd.ajouter(CatregroupVO);
//				
//			errors.add("name", new ActionError(ConstErrCodRC.succefulInsert));
//				
//			//On vide les champs du formulaire
//			rcCatregroupFB.reset(mapping,request);
//			
//			//On forward si succes
//			forward = mapping.findForward(page);
//			
//		} 
//		catch (Exception e) 
//		{
//			errors.add("name", new ActionError(e.getMessage()));	
//			forward = mapping.findForward("saisieRcCatregroup");
//		}
//		finally
//		{			
//			if (!errors.isEmpty()) {
//				saveErrors(request, errors);
//			}
//		}	
//		
//		return forward;
//	}	
//
//	/***************************************/
//	/***          MODIFICATION           ***/
//	/***************************************/
//	public ActionForward modifierRcCatregroup(ActionMapping mapping,
//			ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//
//		ActionErrors errors = new ActionErrors();
//		ActionForward forward = new ActionForward(); // return value
//		
//		//La classe des commandes 
//		ReferencesCommunsCmd referencesCommunsCmd = new ReferencesCommunsCmd();
//		
//		//Le Form Bean  
//		RcCatregroupForm rcCatregroupFB = (RcCatregroupForm) form;
//		
//		//Le VO
//		CatregroupVO CatregroupVO = new CatregroupVO();
//		
//		//On r�cup�re la cl� primaire
//		String rccodeburfranchise = rcCatregroupFB.getTNUM_RCCODECATREGROUP_OB();
//		
//		//La page de forward
//		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcCatregroup" : request.getParameter(ConstManif.PAGE));
//		
//		try 
//		{	
//			//On remplit les attributs du VO
//			CatregroupVO = rcCatregroupFB.getNewRcCatregroupVO();
//			
//			//On cr�� la cl�
//			CatregroupKey CatregroupKey = createCatregroupKey (rccodeburfranchise);
//			
//			//On ex�cute la commande de modification				
//			referencesCommunsCmd.modifier(CatregroupVO,CatregroupKey);
//			
//			errors.add("name", new ActionError(ConstErrCodRC.succefulUpdate));
//			
//			//On forward si succes
//			forward = mapping.findForward(page);
//
//		} 
//		catch (Exception e) 
//		{
//			errors.add("name", new ActionError(e.getMessage()));
//			
//			//On forward
//			forward = mapping.findForward("modificationRcCatregroup");			
//		}
//		finally
//		{									
//			if (!errors.isEmpty()) {
//				saveErrors(request, errors);
//			}
//		}	
//		
//		return forward;
//	}	
	

	/***************************************/
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcCatregroup () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
	    String forward = null;
		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCatregroup" : request.getParameter(ConstManif.PAGE));
	    String page = request.getParameter(ConstManif.PAGE_CONTEXT);
	    String condition = " ";
		
		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String rccodecatregroup = (rcCatregroupForm.getNumRcCodeCatRegroupRech()==null ? "" : rcCatregroupForm.getNumRcCodeCatRegroupRech());;
		String rclibcatregroup = (rcCatregroupForm.getNumRcLibCatRegroupRech()==null ? "" : rcCatregroupForm.getNumRcLibCatRegroupRech());

		//Condition de recherche
	    if (!rccodecatregroup.equals(""))
	    	condition += " and rcCodeCatreGroup = '"+rccodecatregroup+"' ";
	    
	    if (!rclibcatregroup.equals(""))
	    	condition += " and rcLibCatreGroup LIKE '"+rclibcatregroup+"' ";
        
		
		//Rafraichissement de la liste des Catregroup		
		try {

			List listeRcCatregroup = null;
			listeRcCatregroup = gaindeBusinessDelegate.rechercherCatreGroup("from CatreGroup where 1 = 1 " + condition);
			// pour la pagination du grid
			if (listeRcCatregroup != null) {
				rcCatregroupForm.setRecords(listeRcCatregroup.size());
				rcCatregroupForm
						.setTotal((int) Math.ceil((double) rcCatregroupForm.getRecords() / (double) rcCatregroupForm.getRows()));
				int to = (rcCatregroupForm.getRows() * rcCatregroupForm.getPage());
				int from = to - rcCatregroupForm.getRows();
				if (to > rcCatregroupForm.getRecords()) {
					to = rcCatregroupForm.getRecords();
				}
				listeRcCatregroup = listeRcCatregroup.subList(from, to);
			}
			
			rcCatregroupForm.setListeRcCatregroup(listeRcCatregroup);
			
			if (listeRcCatregroup != null && listeRcCatregroup.size()!=0)
			{		
			    if (!ctxmenu.equals("C"))
			    	request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
			}	
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcCatregroup";
	
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");
												
					if (!rccodecatregroup.equals(""))
						rcCatregroupForm.setNumRcCodeCatRegroupOB(rccodecatregroup);
					
				    if (!rclibcatregroup.equals(""))
				    	rcCatregroupForm.setNumRcLibCatRegroupOB(rclibcatregroup);
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
				if (!ctxmenu.equals("C"))
					rcCatregroupForm.resetChampsRecherche ();
			
			}
		}
		catch (Exception e)
		{	System.out.println ("Erreur de recherche Catregroup");
			e.printStackTrace();
		}	
				
//		forward = page;
//		return forward; 
		if (page == null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	
//	/***************************************/
//	/***          SUPPRESSION            ***/
//	/***************************************/
//	public ActionForward supprimerRcCatregroup(ActionMapping mapping,
//			ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		ActionErrors errors = new ActionErrors();
//		ActionForward forward = new ActionForward(); // return value
//		Vector listeRcCatregroup = new Vector();
//		
//		//La Catregroup des commandes 
//		ReferencesCommunsCmd referencesCommunsCmd = new ReferencesCommunsCmd();
//		
//		//Le Form Bean  
//		RcCatregroupForm rcCatregroupFB = (RcCatregroupForm) form;		   
//
//		//Le VO
//		CatregroupVO CatregroupVO = new CatregroupVO();
//		
//		//Cl� de l'enregistrement � supprimer
//		String rccodecatregroup = request.getParameter(ConstManif.PK);
//
//		//La page de forward
//		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcCatregroup" : request.getParameter(ConstManif.PAGE));
//		
//		try 
//		{
//			//On cr�� la cl�
//			CatregroupKey CatregroupKey = createCatregroupKey (rccodecatregroup);
//
//			//On remplit les attributs du VO
//			CatregroupVO = rcCatregroupFB.getNewRcCatregroupVO();
//			
//			//On ex�cute la commande de suppression
//			referencesCommunsCmd.supprimer(CatregroupKey);	
//			
//			//Raffraichissement de la liste des Catregroup
//			listeRcCatregroup = referencesCommunsCmd.rechercherByWhere(CatregroupVO,"");
//			rcCatregroupFB.setListeRcCatregroup(listeRcCatregroup);
//	
//			errors.add("name", new ActionError(ConstErrCodRC.succefulDelete));		
//			
//		} 
//		catch (Exception e) {
//			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.ejbExp))			
//				errors.add("name", new ActionError(ConstErrCodRC.rcImpossibleDelete));			
//			else
//				errors.add("name", new ActionError(e.getMessage()));
//			   
//			System.out.println ("**************** Suppression  non r�ussie !****************");		
//		}
//		finally
//		{
//			if (page != null) {
//				forward = mapping.findForward(page);
//			}
//			
//			if (!errors.isEmpty()) 
//				saveErrors(request, errors);
//		}	
//		
//		
//		return forward;
//	}
	

	/***************************************/
	/***           AFFICHAGE             ***/
	/***************************************/
	public String afficherRcCatregroup () throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;
		
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcCatregroup" : request.getParameter(ConstManif.PAGE_CONTEXT));
		
		//Cl� de recherche
		String rccodecatregroup = request.getParameter(ConstManif.PK);
		
		//Objet Catregroup
		CatreGroup CatregroupVO = null;
		CatregroupVO = gaindeBusinessDelegate.findCatreGroupByPrimaryKey(rccodecatregroup);
		
		
		//Affichage dans le formulaire				
		rcCatregroupForm.setCatregroup(CatregroupVO);
		
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
			rcCatregroupForm.reset();
			rcCatregroupForm.setListeRcCatregroup(new ArrayList());
			
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			
			forward = page;
		}
		return forward;
	}

	
//	/***************************************/
//	/***		    CLE PRIMAIRE		 ***/
//	/***************************************/
//	private CatregroupKey createCatregroupKey (String rccodecatregroup)
//	{
//		CatregroupKey CatregroupKey = new CatregroupKey (rccodecatregroup);
//		
//		return CatregroupKey;
//	}
	
	@Override
	public RcCatregroupForm getModel() {		
		return rcCatregroupForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcCatregroupForm form) {
		this.rcCatregroupForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcCatregroupForm getRcCatregroupForm() {
		return rcCatregroupForm;
	}


	public void setRcCatregroupForm(RcCatregroupForm rcCatregroupForm) {
		this.rcCatregroupForm = rcCatregroupForm;
	}
}