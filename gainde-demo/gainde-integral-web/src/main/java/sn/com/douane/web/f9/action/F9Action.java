package sn.com.douane.web.f9.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.f9.entities.FieldsTypes;
import sn.com.douane.web.f9.form.F9Form;
import sn.com.douane.web.rc.GeneralDispatchAction;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class F9Action extends GeneralDispatchAction implements ScopedModelDriven<F9Form>{

	private static final long serialVersionUID = 1L;
	private F9Form f9Form;
	private String scopeKey;	
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	public String execute()
		    throws Exception
		  {
	    	HttpServletRequest request = ServletActionContext.getRequest();
		    String forward = null;
		    String f9forward = "";
		    try {
		      if (request.getParameter("Forward") == null) {
		        try {

		          List v = gaindeBusinessDelegate.F9Recherche(f9Form.getF9forward(), f9Form.getWhere(), f9Form.getTableName(), f9Form.getVFieldTyp(), f9Form.getFinder());

		          f9Form.setListF9Grid(v);		          
		   
		        } catch (Exception e) {
		        	log.error("Error Error Error F9ACT.second execute()F9::" + e.getMessage());

		          addActionError(e.getMessage());
		        }

		        f9forward = f9Form.getF9forward();
		      }
		      else
		      {
		        String where = ""; String where1 = "";
		        f9forward = request.getParameter("Forward");
		        try {
		          if (f9forward == null){
		        	  f9forward = "";
		          }

		          List vFieldTyp = new ArrayList();
		          where1 = request.getParameter("where");
		          String lib = request.getParameter("lib");
		          String[] libs = new String[10]; String[] libes = new String[10];

		          f9Form.setTitre1(request.getParameter("titre"));

		          f9Form.setLibm1(request.getParameter("txtboxname0"));

		          f9Form.setLibm2(request.getParameter("txtboxname1"));

		          f9Form.setLibm3(request.getParameter("txtboxname2"));

		          f9Form.setLibm4(request.getParameter("txtboxname3"));

		          f9Form.setLibm5(request.getParameter("txtboxname4"));

		          f9Form.setLibm6(request.getParameter("txtboxname5"));

		          f9Form.setLibm7(request.getParameter("txtboxname6"));

		          f9Form.setLibm8(request.getParameter("txtboxname7"));

		          f9Form.setLibm9(request.getParameter("txtboxname8"));

		          f9Form.setLibm10(request.getParameter("txtboxname9"));
		          String fieldstyps = request.getParameter("FieldsTypes"); String fieldstyps1 = ""; String fieldstyps2 = "";
		          fieldstyps1 = fieldstyps;
		          int i = 1;  int l = 0;
		          while (fieldstyps.indexOf('-') != -1) {
		            i++;
		            fieldstyps = fieldstyps.substring(fieldstyps.indexOf('-') + 1, fieldstyps.length());
		          }
		          for (int kk = 0; kk < 10; kk++) {
		            libs[kk] = request.getParameter("txtbox" + kk);
		          }

		          while (lib.indexOf('-') != -1) {
		            //k++;
		            libes[l] = lib.substring(0, lib.indexOf('-'));

		            lib = lib.substring(lib.indexOf('-') + 1, lib.length());

		            l++;
		            if (lib.indexOf('-') == -1) {
		              libes[l] = lib.substring(lib.indexOf('-') + 1, lib.length());
		            }
		          }

		          f9Form.setLib1(libes[0]);
		          f9Form.setLib2(libes[1]);
		          f9Form.setLib3(libes[2]);
		          f9Form.setLib4(libes[3]);
		          f9Form.setLib5(libes[4]);
		          f9Form.setLib6(libes[5]);
		          f9Form.setLib7(libes[6]);
		          f9Form.setLib8(libes[7]);
		          f9Form.setLib9(libes[8]);
		          f9Form.setLib10(libes[9]);
		          FieldsTypes ft;
		          for (int j = 0; j < i; j++) {
		            ft = new FieldsTypes();
		            if (j != i - 1) {
		              fieldstyps2 = fieldstyps1.substring(0, fieldstyps1.indexOf('-'));
		              ft.setFIELD(fieldstyps2.substring(0, fieldstyps2.indexOf('*')));

		              String typ = fieldstyps2.substring(fieldstyps2.indexOf('*') + 1, fieldstyps2.length());

		              if ((typ != null) && (typ.equals("Long"))) {
		                ft.setTYPE("Long");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("Double"))) {
		                ft.setTYPE("Double");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("Integer"))) {
		                ft.setTYPE("Integer");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("String"))) {
		                ft.setTYPE("String");
		                if ((libs[j] != null) && (!libs[j].equals(""))) {
		                  if (libs[j].indexOf('%') != -1){
		                    where = where + " and " + ft.getFIELD() + " like'" + libs[j] + "'";
		                  }else{
		                    where = where + " and " + ft.getFIELD() + " ='" + libs[j] + "'";
		                  }
		                }
		              }
		              if ((typ != null) && (typ.equals("Date"))) {
		                ft.setTYPE("Date");
		                if ((libs[j] != null) && (!libs[j].equals(""))) {
		                  where = where + " and " + ft.getFIELD() + "=to_date('" + libs[j] + "','yyyy/MM/dd')";
		                }
		              }
		              fieldstyps1 = fieldstyps1.substring(fieldstyps1.indexOf('-') + 1, fieldstyps1.length());
		            }
		            else {
		              fieldstyps2 = fieldstyps1.substring(0, fieldstyps1.length());
		              ft.setFIELD(fieldstyps2.substring(0, fieldstyps2.indexOf('*')));
		              String typ = fieldstyps2.substring(fieldstyps2.indexOf('*') + 1, fieldstyps2.length());

		              if ((typ != null) && (typ.equals("Long"))) {
		                ft.setTYPE("Long");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("Double"))) {
		                ft.setTYPE("Double");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("Integer"))) {
		                ft.setTYPE("Integer");
		                if ((libs[j] != null) && (!libs[j].equals(""))){
		                  where = where + " and " + ft.getFIELD() + "=" + libs[j];
		                }
		              }
		              if ((typ != null) && (typ.equals("String"))) {
		                ft.setTYPE("String");
		                if ((libs[j] != null) && (!libs[j].equals(""))) {
		                  if (libs[j].indexOf('%') != -1){
		                    where = where + " and " + ft.getFIELD() + " like'" + libs[j] + "'";
		                  }else{
		                    where = where + " and " + ft.getFIELD() + " ='" + libs[j] + "'";
		                  }
		                }
		              }
		              if ((typ != null) && (typ.equals("Date"))) {
		                ft.setTYPE("Date");
		                if ((libs[j] != null) && (!libs[j].equals(""))) {
		                  if ((libs[j].indexOf('/') == 4) || (libs[j].indexOf('-') == 4)){
		                    where = where + " and " + ft.getFIELD() + "=to_date('" + libs[j] + "','yyyy/MM/dd')";
		                  }else {
		                    where = where + " and " + ft.getFIELD() + "=to_date('" + libs[j] + "','dd/MM/yyyy')";
		                  }
		                }
		              }
		            }

		            vFieldTyp.add(ft);
		          }

		          for (int k1 = 0; k1 < i; k1++) {
		            ft = (FieldsTypes)vFieldTyp.get(k1);
		          }

		          if (request.getParameter("TableName") == null)
		          {
		            if (vFieldTyp.size() == 0){
		            	log.info(" execute   les champs ne sont pas précisés dans f9");
		            }
		          }

		          where = where + where1;
		          f9Form.reset();
		          List v1 = gaindeBusinessDelegate.F9Recherche(f9forward, where, request.getParameter("TableName"), vFieldTyp, f9Form.getFinder());

		          f9Form.setTableName(request.getParameter("TableName"));
		          f9Form.setWhere(where);
		          f9Form.setF9forward(request.getParameter("Forward"));
		          f9Form.setVFieldTyp(vFieldTyp);		         
		          f9Form.setListF9Grid(v1);		          
		    
		        }
		        catch (Exception e) {
		        	log.error("Error Error Error F9ACT.first execute()F9::" + e.getMessage());

		          addActionError(e.getMessage());
		        }
		        finally {
		          forward = f9forward;
		        }
		      }
		    } catch (Exception e) {
		    	log.error(" execute  F9 exception=  " + e.getMessage());
		    } finally {
		          forward = f9forward;
		        }

		    return forward;
		  }
	
	public String gridF9() throws Exception{
		List<?> listF9Dto=f9Form.getListF9Grid();
		   //pour la pagination des grid
					if (listF9Dto!=null) {
						f9Form.setRecords(listF9Dto.size()); 
						f9Form.setTotal(
								(int) Math.ceil((double)f9Form.getRecords() 
										/ (double)f9Form.getRows())); 
						int to = (f9Form.getRows() * f9Form.getPage());
					    int from = to - f9Form.getRows();
					    if (to > f9Form.getRecords()) {
					    	to = f9Form.getRecords();
					    }
					    listF9Dto = listF9Dto.subList(from, to);
					}
					
			        
					f9Form.setVf9(listF9Dto);
	
		return SUCCESS;
	}
	
	@Override
	public F9Form getModel() {		
		return f9Form;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(F9Form form) {
		this.f9Form = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public F9Form getF9Form() {
		return f9Form;
	}


	public void setF9Form(F9Form f9Form) {
		this.f9Form = f9Form;
	}
}
