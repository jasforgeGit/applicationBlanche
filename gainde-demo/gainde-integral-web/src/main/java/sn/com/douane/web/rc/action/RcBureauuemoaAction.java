package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.BureauUemoaDto;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcBureauuemoaForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

/**
*
* @author kerfahi ghazi
*/
public class RcBureauuemoaAction extends GeneralDispatchAction implements ScopedModelDriven<RcBureauuemoaForm> {

	private static final long serialVersionUID = 1L;
	private transient final Log LOG = LogFactory.getLog(getClass());
	private RcBureauuemoaForm rcBureauuemoaForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcBureauuemoa() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null; // return value
		//Le VO
		BureauUemoa bureauuemoavo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcBureauuemoa" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			bureauuemoavo = rcBureauuemoaForm.getNewRcBureauuemoaVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterBureauUemoa(bureauuemoavo);

			addActionError(getText(ConstErrCodRC.succefulInsert));

			//On vide les champs du formulaire
			rcBureauuemoaForm.reset();

			//On forward si succes
			forward = page;
		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			forward = "saisieRcBureauuemoa";
		}
		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcBureauuemoa() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null; // return value
		//Le VO
		BureauUemoa bureauuemoavo = null;

		//On r�cup�re la cl� primaire
//		String pk = rcBureauuemoaForm.getPk();
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcBureauuemoa" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			bureauuemoavo = rcBureauuemoaForm.getNewRcBureauuemoaVO();

			//On cr�� la cl�
//			BureauuemoaKey bureauuemoakey = createBureauuemoaKey (pk);

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierBureauUemoa(bureauuemoavo);

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			//On forward si succes
			forward = page;

		}
		catch (Exception e)
		{
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "modificationRcBureauuemoa";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcBureauuemoa() {

		HttpServletRequest request = ServletActionContext.getRequest();

//		String pageResult = (request.getParameter("pageContext")==null ? "rechercheRcBureauuemoa" : request.getParameter("pageContext"));
		String pageResult = request.getParameter("pageContext");
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeburuemoa = (rcBureauuemoaForm.getNumRcCodeBurUemoaRech() == null ? "" : rcBureauuemoaForm.getNumRcCodeBurUemoaRech());
		String rclibelleburuemoa = (rcBureauuemoaForm.getNumRcLibelleBurUemoaRech() == null ? "" : rcBureauuemoaForm.getNumRcLibelleBurUemoaRech());

		//Condition de recherche
		if (!rccodeburuemoa.equals("")) {
			condition += " and rcCodeBurUemoa LIKE '%" + rccodeburuemoa + "%' ";
		}

		if (!rclibelleburuemoa.equals("")) {
			condition += " and rcLibelleBurUemoa LIKE '%" + rclibelleburuemoa + "%' ";
		}

		//Rafraichissement de la liste des BUREAUUEMOA
		try
		{

//			List<BureauUemoaDto> listeRcBureauuemoa = null;
			List<BureauUemoaDto> listeRcBureauuemoa = gaindeBusinessDelegate.rechercherBureauUemoa("from BureauUemoa where 1 = 1 " + condition);
			// pour la pagination du grid
			if (listeRcBureauuemoa != null) {
				rcBureauuemoaForm.setRecords(listeRcBureauuemoa.size());
				rcBureauuemoaForm
						.setTotal((int) Math.ceil((double) rcBureauuemoaForm.getRecords() / (double) rcBureauuemoaForm.getRows()));
				int to = (rcBureauuemoaForm.getRows() * rcBureauuemoaForm.getPage());
				int from = to - rcBureauuemoaForm.getRows();
				if (to > rcBureauuemoaForm.getRecords()) {
					to = rcBureauuemoaForm.getRecords();
				}
				listeRcBureauuemoa = listeRcBureauuemoa.subList(from, to);
			}
			rcBureauuemoaForm.setListeRcBureauuemoa(listeRcBureauuemoa);

			if (listeRcBureauuemoa!=null && listeRcBureauuemoa.size() != 0)

			{
				//pageResult = "rechercheRcBureauuemoa";

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{

				if (ctxmenu.equals("SM"))
				{
					pageResult = "saisieRcBureauuemoa";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodeburuemoa.equals("")) {
						rcBureauuemoaForm.setNumRcCodeBurUemoaOB(rccodeburuemoa);
					}

					if (!rclibelleburuemoa.equals("")) {
						rcBureauuemoaForm.setNumRcLibelleBurUemoaOB(rclibelleburuemoa);
					}

				}
				else
					if (ctxmenu.equals("S"))
					{
						//pageResult = "rechercheRcBureauuemoa";
						request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
					}
					else
					{
						//pageResult = "rechercheRcBureauuemoa";
						addActionError(getText(ConstErrCodRC.rcRowNotFound));
					}

				if (!ctxmenu.equals("C")) {
					rcBureauuemoaForm.resetChampsRecherche ();
				}
			}
		}
		catch (Exception e)
		{
			LOG.error(e.getMessage());
		}
		if (pageResult==null) {
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}


	/***************************************/
	/***           SUPPRESSION           ***/
	/***************************************/
	public String supprimerRcBureauuemoa() {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null; // return value
		List listeRcBureauuemoa = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcBureauuemoa" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerBureauUemoa(pk);

			//Raffraichissement de la liste des BUREAUUEMOA
			listeRcBureauuemoa = gaindeBusinessDelegate.rechercherBureauUemoa("from BureauUemoa where 1 = 1 ");
			rcBureauuemoaForm.setListeRcBureauuemoa(listeRcBureauuemoa);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		}
		catch (Exception e) {
			if(e.getMessage()!=null && e.getMessage().equals(ConstErrCodRC.ejbExp)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			LOG.info("**** Suppression de BUREAUUEMOA non r�ussie !****************");
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
	public String afficherRcBureauuemoa () throws Exception{
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = (request.getParameter("pageContext") == null ? "rechercheRcBureauuemoa" : request.getParameter("pageContext"));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);

		//Le VO
		BureauUemoa bureauuemoavo = null;

		bureauuemoavo = gaindeBusinessDelegate.findBureauUemoaByPrimaryKey(pk);

		//Affichage dans le formulaire
		rcBureauuemoaForm.setBureauuemoa(bureauuemoavo);

		//Redirection
		forward = page;
		return forward;

	}


	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null; // return value
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null){
			page = request.getParameter("pageContext");
		}
		try {
			rcBureauuemoaForm.reset();
			rcBureauuemoaForm.setListeRcBureauuemoa(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}
        finally {
			forward = page;
		}
		return forward;
	}

	public RcBureauuemoaForm getModel() {		
		return rcBureauuemoaForm;
	}


	public String getScopeKey() {		
		return scopeKey;
	}

	public void setModel(RcBureauuemoaForm form) {
		this.rcBureauuemoaForm = form;
		
	}

	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}

	public RcBureauuemoaForm getRcBureauuemoaForm() {
		return rcBureauuemoaForm;
	}

	public void setRcBureauuemoaForm(RcBureauuemoaForm rcBureauuemoaForm) {
		this.rcBureauuemoaForm = rcBureauuemoaForm;
	}

}
