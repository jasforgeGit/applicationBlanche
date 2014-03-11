package sn.com.douane.web.consultationDevises.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.consultationDevises.form.ConsultationDevisesForm;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgreeForm;



public class ConsultationDevisesAction extends GeneralDispatchAction implements ScopedModelDriven<ConsultationDevisesForm> {

	private static final long serialVersionUID = 1L;
	private ConsultationDevisesForm consultationDevisesForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	//Fonction qui permet de rechercher les devises
	public String rechercherDevises() {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		//Page de forward
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);
		
		//Champs de recherche
		String rccodedevise = (consultationDevisesForm.getNumRcCodeDeviseRech()==null ? "" : consultationDevisesForm.getNumRcCodeDeviseRech()); 
		String rclibelleDevise = (consultationDevisesForm.getNumRcLibelleDeviseRech()==null ? "" : consultationDevisesForm.getNumRcLibelleDeviseRech());
		
		//Condition de recherche
		String where = "";
		
		if (!rccodedevise.equals("")) {
			where += " AND rccodedevise = '"+rccodedevise+"'";
		}
		if (!rclibelleDevise.equals("")) {
			where += " AND rclibelledevise LIKE '"+rclibelleDevise+"'";
		}

		try {
			List listeDevise = null;
			listeDevise = gaindeBusinessDelegate.rechercherDevises("from Devises where 1 = 1 " + where);
			// pour la pagination du grid 
			if (listeDevise!=null) {
				consultationDevisesForm.setRecords(listeDevise.size()); 
				consultationDevisesForm.setTotal(
						(int) Math.ceil((double)consultationDevisesForm.getRecords() 
								/ (double)consultationDevisesForm.getRows())); 
				int to = (consultationDevisesForm.getRows() * consultationDevisesForm.getPage());
			    int from = to - consultationDevisesForm.getRows();
			    if (to > consultationDevisesForm.getRecords()) {
			    	to = consultationDevisesForm.getRecords();
			    }
			    listeDevise = listeDevise.subList(from, to);
			}
			consultationDevisesForm.setListeDevises(listeDevise);
		} catch (Exception e) {
			log.error("Erreur de recherche Devise");

		}
				
//		forward = page;
//		return forward;
		if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
	}	

	//Fonction qui permet d'afficher la liste des historiques 
	public String afficherHistorique () {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//Page de forward
		String page = request.getParameter(ConstManif.PAGE_CONTEXT);

		//Cl� de recherche
		String pk = consultationDevisesForm.getPkSelected();

		try {
			Devises devisesVO = null;
			devisesVO = gaindeBusinessDelegate.findDevisesByPrimaryKey(pk);
			
			consultationDevisesForm.setDevises(devisesVO);
		} catch (Exception e) {
			log.error("Erreur de affichage historique");
		}
				
		forward = page;
		
		return forward;
	}
	@Override
	public ConsultationDevisesForm getModel() {		
		return consultationDevisesForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(ConsultationDevisesForm form) {
		this.consultationDevisesForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public ConsultationDevisesForm getConsultationDevisesForm() {
		return consultationDevisesForm;
	}


	public void setConsultationDevisesForm(ConsultationDevisesForm consultationDevisesForm) {
		this.consultationDevisesForm = consultationDevisesForm;
	}
}
