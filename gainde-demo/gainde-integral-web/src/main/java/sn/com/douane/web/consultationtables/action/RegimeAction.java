package sn.com.douane.web.consultationtables.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.consultationtables.form.RegimeForm;
import sn.com.douane.web.rc.GeneralDispatchAction;


public class RegimeAction extends GeneralDispatchAction implements ScopedModelDriven<RegimeForm> {

	private static final long serialVersionUID = 1L;
	private RegimeForm regimeForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/***************************************/
	/***           RECHERCHE REGIME      ***/
	/***************************************/
	public String rechercherRegime () {

		HttpServletRequest request = ServletActionContext.getRequest();

		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "rechercheRegime" : request.getParameter(ConstManif.PAGE));
	    String page = request.getParameter(ConstManif.PAGE_CONTEXT);
	    String condition = " ";
		
		//On r�cup�re le contexte menu
		//String ctxmenu = (String) request.getSession().getAttribute(tn.com.tw.java.utils.ConstManif.CTXMENU);
		
		//R�cup�ration des crit�res saisis
		String typeregimecoderegimedouanier = (regimeForm.getNumListRcCodeRegimeDouanierRech() ==null ? "" : regimeForm.getNumListRcCodeRegimeDouanierRech());
		String rctyperegime = (typeregimecoderegimedouanier.length()>0 ? typeregimecoderegimedouanier.charAt(0)+"" :"");
		String rccoderegimedouanier = (typeregimecoderegimedouanier.length()>1 ?typeregimecoderegimedouanier.charAt(1)+"" : "");
		String rccoderegimefiscal = (regimeForm.getNumListRcCodeRegimeFiscalRech() ==null ? "" : regimeForm.getNumListRcCodeRegimeFiscalRech());;
		String rclibelleregime = (regimeForm.getNumRcLibelleRegimeRech() ==null ? "" : regimeForm.getNumRcLibelleRegimeRech());

		//Condition de recherche
		if (!rctyperegime.equals("")) {
	    	condition += " and rcTypeRegime = '"+rctyperegime+"' ";
		}
		if (!rccoderegimedouanier.equals("")) {
	    	condition += " and rcCodeRegimeDouanier = '"+rccoderegimedouanier+"' ";
		}
	    if (!rccoderegimefiscal.equals("")) {
	    	condition += " and rcCodeRegimeFiscal = '"+rccoderegimefiscal+"' ";
	    }
	    if (!rclibelleregime.equals("")) {
	    	condition += " and rcLibelleRegime LIKE '%"+rclibelleregime+"%' ";
	    }
		
		//Rafraichissement de la liste des Regime		
		try {
			List listeRcRegime = null;
			listeRcRegime = gaindeBusinessDelegate.rechercherRegime("from Regime where 1 = 1 " + condition);
			// pour la pagination du grid 
						if (listeRcRegime!=null) {
							regimeForm.setRecords(listeRcRegime.size()); 
							regimeForm.setTotal(
									(int) Math.ceil((double)regimeForm.getRecords() 
											/ (double)regimeForm.getRows())); 
							int to = (regimeForm.getRows() * regimeForm.getPage());
						    int from = to - regimeForm.getRows();
						    if (to > regimeForm.getRecords()) {
						    	to = regimeForm.getRecords();
						    }
						    listeRcRegime = listeRcRegime.subList(from, to);
						}
			regimeForm.setListeRcRegime(listeRcRegime);
			
			if (listeRcRegime != null && listeRcRegime.size()==0) {
				addActionError(getText(ConstErrCodRC.rcRowNotFound));
			}
					
		} catch (Exception e) {
			log.error("Erreur de recherche Regime");
			addActionError(getText(e.getMessage()));

		}	
				
//		forward = page;
//		return forward; 
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}

	
	/*************************************************************/
	/***           LES REGIMES QUE PEUT APURER LE REGIME      ***/
	/************************************************************/
	
	public String apurementRegime () {

		HttpServletRequest request = ServletActionContext.getRequest();
	    String forward = null;
		

		
		//String page = (request.getParameter(ConstManif.PAGE)==null ? "apurementRegime" : request.getParameter(ConstManif.PAGE));
	    String page = request.getParameter(ConstManif.PAGE_CONTEXT);
	    String condition = " ";
		
		
		//R�cup�ration de la cl�
		String pk = request.getParameter(ConstManif.PK);
		
		if (pk != null) {
		String [] pkTab = pk.split(ConstManif.TIELD);

		//R�cup�ration des crit�res saisis
		String rccoderegimedouanier = pkTab[0];
		String rctyperegime = pkTab[1];
//		String rccoderegimefiscal=pkTab[2];
		
		//Condition de recherche
	    condition += " and R.rcRegDouApure = '"+rccoderegimedouanier+"' ";
	    
	   condition += " and R.rcTypeRegApure = '"+rctyperegime+"' ";
	   //Jointure avec la table r�gime pour r�cup�rer le libell� du r�gime
	   
	   
//	   condition += " and rcTypeRegApurant = rcTypeRegime ";
//	   condition += " and rcRegDouApurant = rcCodeRegimeDouanier ";
	   
	   
	  // condition += " and regime.rcCodeRegimeFiscal = '"+rccoderegimedouanier+"' ";
//	   condition += " and RCTYPEREGIME = '"+rctyperegime+"' ";
//	   condition += " and RCCODEREGIMEDOUANIER = '"+rccoderegimedouanier+"' ";
//	   condition += " and RCCODEREGIMEFISCAL = '"+rccoderegimedouanier+"' ";
		}
		//Rafraichissement de la liste des Regime		
		try {	
			
			List listeRcRegime = new ArrayList();
//			listeRcRegime = gaindeBusinessDelegate.rechercheRegimeApurant(condition);
			// pour la pagination du grid 
			if (listeRcRegime!=null) {
				regimeForm.setRecords(listeRcRegime.size()); 
				regimeForm.setTotal(
						(int) Math.ceil((double)regimeForm.getRecords() 
								/ (double)regimeForm.getRows())); 
				int to = (regimeForm.getRows() * regimeForm.getPage());
			    int from = to - regimeForm.getRows();
			    if (to > regimeForm.getRecords()) {
			    	to = regimeForm.getRecords();
			    }
			    listeRcRegime = listeRcRegime.subList(from, to);
			}
			regimeForm.setListeRcRegime(listeRcRegime);
			
			if (listeRcRegime.size()==0) {
				addActionError(getText(ConstErrCodRC.rcRowNotFound));
			}
					
		} catch (Exception e) {
			log.error("Erreur de recherche Regime");
		}	
				
//		forward = page;
//		return forward; 
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}
	@Override
	public RegimeForm getModel() {		
		return regimeForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RegimeForm form) {
		this.regimeForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RegimeForm getRegimeForm() {
		return regimeForm;
	}


	public void setRegimeForm(RegimeForm regimeForm) {
		this.regimeForm = regimeForm;
	}
}
