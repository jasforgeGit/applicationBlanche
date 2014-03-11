package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.keys.ProduitKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcProduitsForm;



public class RcProduitsAction extends GeneralDispatchAction implements ScopedModelDriven<RcProduitsForm> {
		
	private static final long serialVersionUID = 1L;
	private RcProduitsForm rcProduitsForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***         ENREGISTREMENT          ***/
	/***************************************/
	public String enregistrerRcProduits() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		Produit produitvo = null;
		String page = request.getParameter("pageContext");
		
		try 
		{
			produitvo = rcProduitsForm.getNewRcProduitVO();
			gaindeBusinessDelegate.ajouterProduit(produitvo);		
			addActionError(getText(ConstErrCodRC.SUCCESFUL_INSERT));
			rcProduitsForm.reset();
		} 
		catch (Exception e) {
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
	/***         MODIFICATION            ***/
	/***************************************/
	public String modifierRcProduits() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		Produit produitvo = null;
		String page = request.getParameter("pageContext");
		try 
		{
			produitvo = rcProduitsForm.getNewRcProduitVO();
			gaindeBusinessDelegate.modifierProduit(produitvo);
			addActionError(getText(ConstErrCodRC.SUCCESFUL_UPDATE));
						
		} 
		catch (Exception e) {
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
	/***           RECHERCHE             ***/
	/***************************************/
	public String rechercherRcProduits() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
	    String pageResult = request.getParameter("pageContext");
		String ctxmenu = (String) request.getSession().getAttribute(ConstManif.CTXMENU);
		String condition = " ";	
		String num_codeprod = rcProduitsForm.getNumRcCodeProdRech();
		String prec_uemoa = rcProduitsForm.getNumRcPrecUemoaRech();
		String prec_senegal = rcProduitsForm.getNumRcPrecSenegalRech();
		String codeclasse = rcProduitsForm.getNumListRcCodeClasseRech();
		String valchapitre = rcProduitsForm.getNumListRcValChapitreRech();
			
	    if (num_codeprod!=null&&!num_codeprod.equals("")) {
	    	condition += " and rccodeprod='"+num_codeprod+"' ";
	    }
		if (prec_uemoa!=null&&!prec_uemoa.equals("")) {
			condition += " and rcprecuemoa='"+prec_uemoa+"' ";
		}
		if (prec_senegal!=null&&!prec_senegal.equals("")) {
	    	condition += " and rcprecsenegal='"+prec_senegal+"' ";
		}
		if (codeclasse!=null&&!codeclasse.equals("")) {
			condition += " and rccodeclasse ="+sysEnv.strToInteger(codeclasse)+" ";
		}
		if (valchapitre!=null&&!valchapitre.equals("")) {
			condition += " and rcvalchapitre ='"+valchapitre+"' ";
		}
			
		try
		{
//			List listeRcProduits = new ArrayList();	
			List listeRcProduits = gaindeBusinessDelegate.rechercherByWhereProduits("from Produit where 1 = 1 "+condition);
			
			// pour la pagination du grid 
			if (listeRcProduits!=null) {
				rcProduitsForm.setRecords(listeRcProduits.size()); 
				rcProduitsForm.setTotal(
						(int) Math.ceil((double)rcProduitsForm.getRecords() 
								/ (double)rcProduitsForm.getRows())); 
				int to = (rcProduitsForm.getRows() * rcProduitsForm.getPage());
			    int from = to - rcProduitsForm.getRows();
			    if (to > rcProduitsForm.getRecords()) {
			    	to = rcProduitsForm.getRecords();
			    }
			    listeRcProduits = listeRcProduits.subList(from, to);
			}
			
			rcProduitsForm.setListeRcProduits(listeRcProduits);
			
			if (listeRcProduits!=null && listeRcProduits.size() != 0)

			{
				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU,"SM");
				}
			}
			else
			{
				if (ctxmenu.equals("SM"))
				{
					pageResult = "saisieProduits";
					rcProduitsForm.reset();
					request.getSession().setAttribute(ConstManif.CTXMENU,"S");

					if (!num_codeprod.equals("")) {
						rcProduitsForm.setNumRcCodeProdOB(num_codeprod);
					}
					if (!prec_uemoa.equals("")) {
						rcProduitsForm.setNumRcPrecUemoaOB(prec_uemoa);
					}
					if (!prec_senegal.equals("")) {
						rcProduitsForm.setNumRcPrecSenegalOB(prec_senegal);
					}
					if (!codeclasse.equals("")) {
						rcProduitsForm.setNumListRcCodeClasseOB(codeclasse);
					}
					if (!valchapitre.equals("")) {
						rcProduitsForm.setNumListRcValChapitreOB(valchapitre);
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
					rcProduitsForm.resetChampsRecherche();
				}
			
			}
		}
		catch (Exception e)
		{	addActionError(getText(e.getMessage()));
		}
				
		if (pageResult==null) {
			return SUCCESS; 
		} else {
			return pageResult;
		}
	}

	
	/***************************************/
	/***          SUPPRESSION            ***/
	/***************************************/
	public String supprimerRcProduits() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		List listeRcProduits = null;
		String pk = request.getParameter(ConstManif.PK);
		String pkTab[] = pk.split(ConstManif.TIELD);
		String rccodeprod = pkTab[0];
		String rcprecuemoa = pkTab[1];
		String rcprecsenegal = pkTab[2];
		String page = request.getParameter("pageContext");
		
		try 
		{
			ProduitKey produitsKey = new ProduitKey(rccodeprod,rcprecuemoa,rcprecsenegal);
			gaindeBusinessDelegate.supprimerProduit(produitsKey);	
			listeRcProduits = gaindeBusinessDelegate.rechercherByWhereProduits("from Produit where 1 = 1 ");
			rcProduitsForm.setListeRcProduits(listeRcProduits);
			addActionError(getText(ConstErrCodRC.SUCCESFUL_DELETE));
		} 
		catch (Exception e) {
//			if(e.getMessage()!=null&&e.getMessage().equals(ConstErrCodRC.EJBEXP)) {
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
//			} else {
//				addActionError(getText(e.getMessage()));
//			}
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
	/***           AFFICHAGE             ***/
	/***************************************/
	public String afficherRcProduits() throws Exception {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter("pageContext");
		String pkAmbORg = request.getParameter(ConstManif.PK);
		String []pk = pkAmbORg.split(ConstManif.TIELD);
		String rccodeprod = pk[0];
		String rcprecuemoa = pk[1];
		String rcprecsenegal = pk[2];
		ProduitKey produitsKey = new ProduitKey(rccodeprod,rcprecuemoa,rcprecsenegal);
		Produit produitVO = null;
		produitVO = gaindeBusinessDelegate.rechercherProduit(produitsKey);				
		rcProduitsForm.setProduits(produitVO);
		forward = page;
		return forward;	
	}
			
	
	/***************************************/
	/***         INITIALISATION          ***/
	/***************************************/
	public String unspecified()	throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;				
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null) {
			page = request.getParameter("pageContext");
		}		
		
		try {
			rcProduitsForm.reset();
			rcProduitsForm.setListeRcProduits(new ArrayList());
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			
			forward = page;
		}
		return forward;
	}
	@Override
	public RcProduitsForm getModel() {		
		return rcProduitsForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcProduitsForm form) {
		this.rcProduitsForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcProduitsForm getRcProduitsForm() {
		return rcProduitsForm;
	}


	public void setRcProduitsForm(RcProduitsForm rcProduitsForm) {
		this.rcProduitsForm = rcProduitsForm;
	}

}