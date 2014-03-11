package sn.com.douane.web.rc.action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;
import sn.com.douane.ejb.rc.model.keys.ProduitPjtKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcProduitspjtForm;



public class RcProduitspjtAction extends GeneralDispatchAction implements ScopedModelDriven<RcProduitspjtForm> {

	private static final long serialVersionUID = 1L;
	private RcProduitspjtForm rcProduitspjtForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcProduitspjt() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		ProduitPjt produitspjtvo = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "saisieRcProduitspjt" : request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			produitspjtvo = rcProduitspjtForm.getNewRcProduitspjtVO();

			//On ex�cute la commande d'ajout
			gaindeBusinessDelegate.ajouterProduitPjt(produitspjtvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));

			//On vide les champs du formulaire
			rcProduitspjtForm.reset();

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcProduitspjt";
		}

		return forward;
		}


	/***************************************/
	/***          MODIFICATION           ***/
	/***************************************/
	public String modifierRcProduitspjt() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Le VO
		ProduitPjt produitspjtvo = null;
		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "modificationRcProduitspjt" : request.getParameter(ConstManif.PAGE));

		try
		{
			//On remplit les attributs du VO
			produitspjtvo = rcProduitspjtForm.getNewRcProduitspjtVO();

			//On ex�cute la commande de modification
			gaindeBusinessDelegate.modifierProduitPjt(produitspjtvo);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			// On forward
			forward = "modificationRcProduitspjt";
		}

		return forward;
	}


	/***************************************/
	/***            RECHERCHE            ***/
	/***************************************/
	public String rechercherRcProduitspjt() {

		HttpServletRequest request = ServletActionContext.getRequest();

		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcProduitspjt" : request.getParameter(ConstManif.PAGE));
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		String condition = " ";

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodepiecejointe = (rcProduitspjtForm.getNumListRcCodePieceJointeRech()==null ? "" : rcProduitspjtForm.getNumListRcCodePieceJointeRech());
		String rccodeproduit = (rcProduitspjtForm.getNumRcCodeProduitRech()==null ? "" : rcProduitspjtForm.getNumRcCodeProduitRech());
		String rcdatepiecejointe = (rcProduitspjtForm.getDatRcDatePieceJointeRech()==null ? "" : rcProduitspjtForm.getDatRcDatePieceJointeRech());
		//String rcimportexport = (rcproduitspjtfb.getTNUM_RCIMPORTEXPORTRech()==null ? "" : rcproduitspjtfb.getTNUM_RCIMPORTEXPORTRech());
		String rcprecsenprod = (rcProduitspjtForm.getNumRcPrecSenProdRech()==null ? "" : rcProduitspjtForm.getNumRcPrecSenProdRech());
		String rcprecuemoaprod = (rcProduitspjtForm.getNumRcPrecUemoaProdRech()==null ? "" : rcProduitspjtForm.getNumRcPrecUemoaProdRech());

		//Condition de recherche
		if (!rccodepiecejointe.equals("")) {
			condition += " and rccodepiecejointe = '"+rccodepiecejointe+"' ";
		}
		if (!rccodeproduit.equals("")) {
			condition += " and rccodeproduit = '"+rccodeproduit+"' ";
		}
		if (!rcdatepiecejointe.equals("")) {
			condition += " and rcdatepiecejointe = '"+new Date(DateUtil.convertStringToDate(rcdatepiecejointe).getTime())+"' ";
		}
//		if (!rcimportexport.equals(""))
//			condition += " and RCIMPORTEXPORT = '"+rcimportexport+"' ";

		if (!rcprecsenprod.equals("")) {
			condition += " and rcprecsenprod = '"+rcprecsenprod+"' ";
		}
		if (!rcprecuemoaprod.equals("")) {
			condition += " and rcprecuemoaprod = '"+rcprecuemoaprod+"' ";
		}
		//Rafraichissement de la liste des PRODUITSPJT
		try
		{

			List listeRcProduitspjt = null;
			listeRcProduitspjt = gaindeBusinessDelegate.rechercherProduitPjt("from ProduitPjt where 1 = 1 " + condition);
			// pour la pagination du grid 
			if (listeRcProduitspjt!=null) {
				rcProduitspjtForm.setRecords(listeRcProduitspjt.size()); 
				rcProduitspjtForm.setTotal(
						(int) Math.ceil((double)rcProduitspjtForm.getRecords() 
								/ (double)rcProduitspjtForm.getRows())); 
				int to = (rcProduitspjtForm.getRows() * rcProduitspjtForm.getPage());
			    int from = to - rcProduitspjtForm.getRows();
			    if (to > rcProduitspjtForm.getRecords()) {
			    	to = rcProduitspjtForm.getRecords();
			    }
			    listeRcProduitspjt = listeRcProduitspjt.subList(from, to);
			}
			rcProduitspjtForm.setListeRcProduitspjt(listeRcProduitspjt);

			if (listeRcProduitspjt != null && listeRcProduitspjt.size() != 0) {

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {

				if (ctxmenu.equals("SM"))
				{
					page = "saisieRcProduitspjt";

					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!rccodepiecejointe.equals("")) {
						rcProduitspjtForm.setNumListRcCodePieceJointeOB(rccodepiecejointe);
					}
					if (!rccodeproduit.equals("")) {
						rcProduitspjtForm.setNumRcCodeProduitOB(rccodeproduit);
					}
					if (!rcdatepiecejointe.equals("")) {
						rcProduitspjtForm.setDatRcDatePieceJointe(rcdatepiecejointe);
					}
//					if (!rcimportexport.equals(""))
//						rcproduitspjtfb.setTNUM_RCIMPORTEXPORT(rcimportexport);

					if (!rcprecsenprod.equals("")) {
						rcProduitspjtForm.setNumRcPrecSenProdOB(rcprecsenprod);
					}
					if (!rcprecuemoaprod.equals("")) {
						rcProduitspjtForm.setNumRcPrecUemoaProdOB(rcprecuemoaprod);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcProduitspjtForm.resetChampsRecherche();
				}
			}
		}
		catch (Exception e)
		{	log.error("Erreur de recherche PRODUITSPJT");
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
	public String supprimerRcProduitspjt() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcProduitspjt = null;

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rccodeproduit = pkTab[0];
		String rcprecuemoaprod = pkTab[1];
		String rcprecsenprod = pkTab[2];
		String rccodepiecejointe = pkTab[3];

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRcProduitspjt" : request.getParameter(ConstManif.PAGE));

		try
		{

			//On cr�� la cl�
			ProduitPjtKey produitspjtkey = new ProduitPjtKey(rccodeproduit,rcprecuemoaprod,rcprecsenprod,rccodepiecejointe);

			//On ex�cute la commande de suppression
			gaindeBusinessDelegate.supprimerProduitPjt(produitspjtkey);

			//Raffraichissement de la liste des PRODUITSPJT
			listeRcProduitspjt = gaindeBusinessDelegate.rechercherProduitPjt("from ProduitPjt where 1 = 1 ");
			rcProduitspjtForm.setListeRcProduitspjt(listeRcProduitspjt);

			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));

		} catch (Exception e) {
			if (e.getMessage() != null && e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			} else {
				addActionError(getText(e.getMessage()));
			}
			log.error("**** Suppression de PRODUITSPJT non r�ussie !****************");
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
	public String afficherRcProduitspjt () throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de redirection
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE_CONTEXT)==null ? "rechercheRcProduitspjt" : request.getParameter(ConstManif.PAGE_CONTEXT));

		//Cl� de recherche
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rccodeproduit = pkTab[0];
		String rcprecuemoaprod = pkTab[1];
		String rcprecsenprod = pkTab[2];
		String rccodepiecejointe = pkTab[3];

			//On cr�� la cl�
		ProduitPjtKey produitspjtkey = new ProduitPjtKey(rccodeproduit,rcprecuemoaprod,rcprecsenprod,rccodepiecejointe);

		//Le VO
			ProduitPjt produitspjtvo = null;

		produitspjtvo = gaindeBusinessDelegate.findProduitPjtByPrimaryKey(produitspjtkey);


		//Affichage dans le formulaire
		rcProduitspjtForm.setProduitspjt(produitspjtvo);

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
			rcProduitspjtForm.reset();
			rcProduitspjtForm.setListeRcProduitspjt(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}

	@Override
	public RcProduitspjtForm getModel() {		
		return rcProduitspjtForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcProduitspjtForm form) {
		this.rcProduitspjtForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcProduitspjtForm getRcProduitspjtForm() {
		return rcProduitspjtForm;
	}


	public void setRcProduitspjtForm(RcProduitspjtForm rcProduitspjtForm) {
		this.rcProduitspjtForm = rcProduitspjtForm;
	}
	
}
