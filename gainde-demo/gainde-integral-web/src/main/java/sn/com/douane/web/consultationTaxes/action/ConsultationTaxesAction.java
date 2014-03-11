package sn.com.douane.web.consultationTaxes.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.web.consultationTaxes.form.ConsultationTaxesForm;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.utils.ConstManif;


public class ConsultationTaxesAction extends GeneralDispatchAction implements ScopedModelDriven<ConsultationTaxesForm> {

	private static final long serialVersionUID = 1L;
	private ConsultationTaxesForm consultationTaxesForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	public String rechercherTaxes() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);

		String rccodetaxe = (consultationTaxesForm.getNumRcCodeTaxeRech()==null ? "" : consultationTaxesForm.getNumRcCodeTaxeRech()); 
		String rclibelletaxe = (consultationTaxesForm.getNumRcLibelleTaxeRech()==null ? "" : consultationTaxesForm.getNumRcLibelleTaxeRech());

		String where = "";
		
		if (!rccodetaxe.equals("")){
			where += " AND rcCodeTaxe = '"+rccodetaxe+"'";
		}
		if (!rclibelletaxe.equals("")){
			where += " AND rcLibelleTaxe LIKE '"+rclibelletaxe+"'";
		}
		try
		{
			List listeTaxes = gaindeBusinessDelegate.rechercherByWherePaysTaxe("from Taxe where 1 = 1 "+where);
			
			consultationTaxesForm.setListeTaxes(listeTaxes);
		}
		catch (Exception e)
		{
			log.error(e.getMessage());
		}
				
		forward = page;
		
		return forward;
	}	


	public String rechercherTaux() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);

		String pk = request.getParameter(ConstManif.PK);
		if (pk!=null){
			consultationTaxesForm.setRccodetaxe(pk);
		}else{
			pk = consultationTaxesForm.getRccodetaxe();
		}
		String rccodetaux = (consultationTaxesForm.getNumRcCodeTauxRech()==null ? "" : consultationTaxesForm.getNumRcCodeTauxRech()); 
		String rclibelletaux = (consultationTaxesForm.getNumRcLibelleTauxRech()==null ? "" : consultationTaxesForm.getNumRcLibelleTauxRech());
		
		String where = "";
		
		where += " AND rcCodeTaxe = '"+pk+"'";

		if (!rccodetaux.equals("")){
			where += " AND rcCodeTaux LIKE '%"+rccodetaux+"%'";
		}
		if (!rclibelletaux.equals("")){
			where += " AND libelleTaux LIKE '%"+rclibelletaux+"%'";
		}
		try
		{
			List listeTaux = gaindeBusinessDelegate.rechercherByWhereTaux("from Taux where 1 = 1 "+where);
			
			consultationTaxesForm.setListeTaux(listeTaux);
		}
		catch (Exception e)
		{	
			log.error(e.getMessage());
		}
				
		forward = page;
		
		return forward;
	}	
	 @Override
		public ConsultationTaxesForm getModel() {		
			return consultationTaxesForm;
		}


		@Override
		public String getScopeKey() {		
			return scopeKey;
		}


		@Override
		public void setModel(ConsultationTaxesForm form) {
			this.consultationTaxesForm = form;
			
		}


		@Override
		public void setScopeKey(String scope) {
			this.scopeKey = scope;
			
		}


		public ConsultationTaxesForm getConsultationTaxesForm() {
			return consultationTaxesForm;
		}


		public void setConsultationTaxesForm(ConsultationTaxesForm consultationTaxesForm) {
			this.consultationTaxesForm = consultationTaxesForm;
		}
}
