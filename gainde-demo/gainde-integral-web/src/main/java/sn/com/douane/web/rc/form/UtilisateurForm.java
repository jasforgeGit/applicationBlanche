package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
        
/**  
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class UtilisateurForm implements Serializable{
	  
	/**
	 * 
	 */
	private static final long serialVersionUID = -4057997697501803376L;
	
	private String cbActif;
	private String numTypUserOB;
	private List listTypUser=new ArrayList(); 
	private List listModule=new ArrayList();
	private String numListAgdouanOB;
	private String numCodPpmOB;
	private String numCodeOB;
	private String txtTitreAbonneOB;
	private String txtEmailOB;
	private String numModuleOB;
	private String txtListProfilOB;
	
    private String numPassWordOB;
    private String numConfPassWordOB;
	public String getCbActif() {
		return cbActif;
	}
	public void setCbActif(String cbActif) {
		this.cbActif = cbActif;
	}
	public String getNumTypUserOB() {
		return numTypUserOB;
	}
	public void setNumTypUserOB(String numTypUserOB) {
		this.numTypUserOB = numTypUserOB;
	}
	public List getListTypUser() {
		return listTypUser;
	}
	public void setListTypUser(List listTypUser) {
		this.listTypUser = listTypUser;
	}
	public List getListModule() {
		return listModule;
	}
	public void setListModule(List listModule) {
		this.listModule = listModule;
	}
	public String getNumListAgdouanOB() {
		return numListAgdouanOB;
	}
	public void setNumListAgdouanOB(String numListAgdouanOB) {
		this.numListAgdouanOB = numListAgdouanOB;
	}
	public String getNumCodPpmOB() {
		return numCodPpmOB;
	}
	public void setNumCodPpmOB(String numCodPpmOB) {
		this.numCodPpmOB = numCodPpmOB;
	}
	public String getNumCodeOB() {
		return numCodeOB;
	}
	public void setNumCodeOB(String numCodeOB) {
		this.numCodeOB = numCodeOB;
	}
	public String getTxtTitreAbonneOB() {
		return txtTitreAbonneOB;
	}
	public void setTxtTitreAbonneOB(String txtTitreAbonneOB) {
		this.txtTitreAbonneOB = txtTitreAbonneOB;
	}
	public String getTxtEmailOB() {
		return txtEmailOB;
	}
	public void setTxtEmailOB(String txtEmailOB) {
		this.txtEmailOB = txtEmailOB;
	}
	public String getNumModuleOB() {
		return numModuleOB;
	}
	public void setNumModuleOB(String numModuleOB) {
		this.numModuleOB = numModuleOB;
	}
	public String getTxtListProfilOB() {
		return txtListProfilOB;
	}
	public void setTxtListProfilOB(String txtListProfilOB) {
		this.txtListProfilOB = txtListProfilOB;
	}
	public String getNumPassWordOB() {
		return numPassWordOB;
	}
	public void setNumPassWordOB(String numPassWordOB) {
		this.numPassWordOB = numPassWordOB;
	}
	public String getNumConfPassWordOB() {
		return numConfPassWordOB;
	}
	public void setNumConfPassWordOB(String numConfPassWordOB) {
		this.numConfPassWordOB = numConfPassWordOB;
	}
        
	
//    public void reset() {
//
//        // Reset field values here.
//
//    }
//
//    public ActionErrors validate() {
//
//        ActionErrors errors = new ActionErrors();
//        // Validate the fields in your form, adding
//        // adding each error to this.errors as found, e.g.
//
//        // if ((field == null) || (field.length() == 0)) {
//        //   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
//        // }
//        return errors;
//
//    }
}
