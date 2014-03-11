package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.SoumissionDoc;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcSoumissiondocForm;



public class RcSoumissiondocAction extends GeneralDispatchAction implements ScopedModelDriven<RcSoumissiondocForm> {

	private static final long serialVersionUID = 1L;
	private RcSoumissiondocForm rcSoumissiondocForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcSoumissiondoc() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		SoumissionDoc soumissiondocvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcSoumissiondoc" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			soumissiondocvo = rcSoumissiondocForm.getNewRcSoumissiondocVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterSoumissionDoc(soumissiondocvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcSoumissiondocForm.reset();

			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcSoumissiondoc";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcSoumissiondoc() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		SoumissionDoc soumissiondocvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcSoumissiondoc" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			soumissiondocvo = rcSoumissiondocForm.getNewRcSoumissiondocVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierSoumissionDoc(soumissiondocvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcSoumissiondoc";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcSoumissiondoc() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcSoumissiondoc" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodepiecejointe = (rcSoumissiondocForm.getNumListRcCodePieceJointeRech()==null ? "" : rcSoumissiondocForm.getNumListRcCodePieceJointeRech());
		String rccodesoumdoc = (rcSoumissiondocForm.getNumRcCodeSoumDocRech()==null ? "" : rcSoumissiondocForm.getNumRcCodeSoumDocRech());
		String rclibellesoumdoc = (rcSoumissiondocForm.getNumRcLibelleSoumDocRech()==null ? "" : rcSoumissiondocForm.getNumRcLibelleSoumDocRech());

		//Condition de recherche
		if (!rccodepiecejointe.equals("")) {
			condition += " and rccodepiecejointe LIKE '%"+rccodepiecejointe+"%' ";
		}
		if (!rccodesoumdoc.equals("")) {
			condition += " and rccodesoumdoc LIKE '%"+rccodesoumdoc+"%' ";
		}
		if (!rclibellesoumdoc.equals("")) {
			condition += " and rclibellesoumdoc LIKE '%"+rclibellesoumdoc+"%' ";
		}
		//Rafraichissement de la liste des SOUMISSIONDOC
		try
		{

			List listeRcSoumissiondoc = null;
			listeRcSoumissiondoc = gaindeBusinessDelegate.rechercherSoumissionDoc("from SoumissionDoc where 1=1 " + condition);
			// pour la pagination du grid 
			if (listeRcSoumissiondoc!=null) {
				rcSoumissiondocForm.setRecords(listeRcSoumissiondoc.size()); 
				rcSoumissiondocForm.setTotal(
						(int) Math.ceil((double)rcSoumissiondocForm.getRecords() 
								/ (double)rcSoumissiondocForm.getRows())); 
				int to = (rcSoumissiondocForm.getRows() * rcSoumissiondocForm.getPage());
			    int from = to - rcSoumissiondocForm.getRows();
			    if (to > rcSoumissiondocForm.getRecords()) {
			    	to = rcSoumissiondocForm.getRecords();
			    }
			    listeRcSoumissiondoc = listeRcSoumissiondoc.subList(from, to);
			}
			rcSoumissiondocForm.setListeRcSoumissiondoc(listeRcSoumissiondoc);

			if (listeRcSoumissiondoc != null && listeRcSoumissiondoc.size()!=0)

			{

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcSoumissiondoc";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodepiecejointe.equals("")) {
						rcSoumissiondocForm.setNumListRcCodePieceJointeOB(rccodepiecejointe);
					}
					if (!rccodesoumdoc.equals("")) {
						rcSoumissiondocForm.setNumRcCodeSoumDocOB(rccodesoumdoc);
					}
					if (!rclibellesoumdoc.equals("")) {
						rcSoumissiondocForm.setNumRcLibelleSoumDocOB(rclibellesoumdoc);
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
					rcSoumissiondocForm.resetChampsRecherche ();
				}

			}
		}
		catch (Exception e)
		{	log.error ("Erreur de recherche SOUMISSIONDOC"+ e.getMessage());
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
	public String supprimerRcSoumissiondoc() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcSoumissiondoc = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcSoumissiondoc" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerSoumissionDoc(pk);

			//Raffraichissement de la liste des SOUMISSIONDOC
			listeRcSoumissiondoc = gaindeBusinessDelegate.rechercherSoumissionDoc("from SoumissionDoc where 1=1 ");
			rcSoumissiondocForm.setListeRcSoumissiondoc(listeRcSoumissiondoc);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		}
		catch (Exception e) {
			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error ("**** Suppression de SOUMISSIONDOC non r�ussie !****************"+ e.getMessage());
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
	public String afficherRcSoumissiondoc () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcSoumissiondoc" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		SoumissionDoc soumissiondocvo = null;

		soumissiondocvo = gaindeBusinessDelegate.findSoumissionDocByPrimaryKey(pk);

		//Affichage dans le formulaire
		rcSoumissiondocForm.setSoumissiondoc(soumissiondocvo);

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
			rcSoumissiondocForm.reset();
			rcSoumissiondocForm.setListeRcSoumissiondoc(new ArrayList());

		} catch (Exception e) {
			addActionError(e.getMessage());
		} finally {
			forward = page;
		}
		return forward;
	}

	@Override
	public RcSoumissiondocForm getModel() {
		return rcSoumissiondocForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcSoumissiondocForm form) {
		this.rcSoumissiondocForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcSoumissiondocForm getRcSoumissiondocForm() {
		return rcSoumissiondocForm;
	}


	public void setRcSoumissiondocForm(RcSoumissiondocForm rcSoumissiondocForm) {
		this.rcSoumissiondocForm = rcSoumissiondocForm;
	}

}
