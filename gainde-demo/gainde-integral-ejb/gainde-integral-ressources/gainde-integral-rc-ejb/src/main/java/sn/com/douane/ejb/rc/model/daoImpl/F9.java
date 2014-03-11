package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.model.dao.IF9;
import sn.com.douane.f9.entities.F9Entity;
import sn.com.douane.f9.entities.FieldsTypes;

@Stateless(name = "IF9")
public class F9 extends GenericDaoImpl<F9Entity> implements IF9{
  	
	private transient final Log log = LogFactory.getLog(getClass());

	  private String col1;
	  private String col2;
	  private String col3;
	  private String col4;
	  private String col5;
	  private String col6;
	  private String col7;
	  private String col8;
	  private String col9;
	  private String col10;
	  private String pk;

	  private String COALESCE = "COALESCE("; 
	  private String FCOALESCE = ",'0')";
	  private String CHAR = "char("; 
	  private String FCHAR = ")";
	  private String VARCHAR_FORMAT = "VARCHAR_FORMAT";

	  public List f9Recherche(String pks, String where, String tableName, List vFieldTyp, String field)
	  {
	    List<F9Entity> v = new ArrayList<F9Entity>();
	   // List v1 = new ArrayList();
	  //  List rsf9 =  new ArrayList();
	    try
	    {
	      String alias = "";
	      int j = 0;
	      String were = "";
	      FieldsTypes ft = new FieldsTypes();
	      for (int i = 0; i < vFieldTyp.size(); i++) {
	        j++;
	        ft = (FieldsTypes)vFieldTyp.get(i);
	        alias = alias + ft.getFIELD() + " AS col" + j + ",";

	        if ((field != null) && (!field.equals(""))) {
	          if (i == vFieldTyp.size() - 1)
	          {
	            if ((ft.getTYPE().equals("Double")) || (ft.getTYPE().equals("Long")) || (ft.getTYPE().equals("Integer"))) {
	              were = were + this.COALESCE + this.CHAR + ft.getFIELD() + this.FCHAR + this.FCOALESCE;
	            }
	            else if (ft.getTYPE().equals("Date")){
	              were = were + this.VARCHAR_FORMAT + "(" + ft.getFIELD() + ",'dd/MM/yyyy')";
	            }else {
	              were = were + this.COALESCE + ft.getFIELD() + this.FCOALESCE;
	            }
	          }
	          else if ((ft.getTYPE() != null) && ((ft.getTYPE().equals("Double")) || (ft.getTYPE().equals("Long")) || (ft.getTYPE().equals("Integer")))) {
	            were = were + this.COALESCE + this.CHAR + ft.getFIELD() + this.FCHAR + this.FCOALESCE + "||";
	          }
	          else if ((ft.getTYPE() != null) && (ft.getTYPE().equals("Date"))){
	            were = were + this.VARCHAR_FORMAT + "(" + ft.getFIELD() + ",'dd/MM/yyyy')" + "||";
	          }else {
	            were = were + this.COALESCE + ft.getFIELD() + this.FCOALESCE + "||";
	          }
	        }
	      }
	      if (alias.indexOf(',') != -1){
	    	  alias = alias.substring(0, alias.lastIndexOf(','));
	      }
	      if ((alias != null) && (alias.equals(""))){
	    	  alias = "*";
	      }
	      String sqlf9 = "";

	      List ar = new ArrayList();
	      String iValue = field;
	      if ((iValue != null) && (!iValue.equals(""))){
	    	  iValue = iValue.toUpperCase();
	      }
	      StringBuffer buffer = new StringBuffer();
	      int i1 = 0;
	      int deb = 0;
	      if (iValue != null) {
	        for (i1 = 0; i1 < iValue.length(); i1++) {
	          if (iValue.charAt(i1) == '\'') {
	            ar.add(iValue.substring(deb, i1) + "''");
	            deb = i1 + 1;
	          }
	        }
	        ar.add(iValue.substring(deb, i1));
	      }
	      i1 = 0;
	      for (i1 = 0; i1 < ar.size(); i1++) {
	        if (ar.get(i1).equals("")){ continue;}
	        buffer.append(ar.get(i1));
	      }
	      field = buffer.toString();

	      if ((field != null) && (!field.equals("")))
	      {
	        sqlf9 = "SELECT " + alias + " FROM " + tableName + " WHERE 1=1 " + " and (" + were + ") like '%" + field + "%' " + where;
	      }
	      else{
	    	  sqlf9 = "SELECT " + alias + " FROM " + tableName + " WHERE 1=1 " + where + " ";
	      }

	      entityManager.getProperties();
	      
	      Query query = entityManager.createQuery(sqlf9);
	      List<Object[]> results = query.setMaxResults(300).getResultList();
	      
	        F9Entity f9 = null;
	        for (Object[] objects : results) {
	    	  f9 = new F9Entity();
  
	        for (int i = 0; i < vFieldTyp.size(); i++) {
	          ft = (FieldsTypes)vFieldTyp.get(i);
	         	          
	          if (ft.getTYPE() == null){
	            ft.setTYPE("");
	          }
	          if (f9.getCol1() == null)
	          { if( objects[0]!=null){
	              f9.setCol1(objects[0].toString());}
	          }
	          else if (f9.getCol2() == null)
	          {if( objects[1]!=null){
	              f9.setCol2(objects[1].toString());}
	          }
	          else if (f9.getCol3() == null)
	          {if( objects[2]!=null){
	              f9.setCol3(objects[2].toString());}
	          }
	          else if (f9.getCol4() == null)
	          {if( objects[3]!=null){
	        	  f9.setCol4(objects[3].toString());}
	          }
	          else if (f9.getCol5() == null)
	          {if( objects[4]!=null){
	        	  f9.setCol5(objects[4].toString());}
	          }
	          else if (f9.getCol6() == null)
	          {if( objects[5]!=null){
	        	  f9.setCol6(objects[5].toString());}
	          }
	          else if (f9.getCol7() == null)
	          {if( objects[6]!=null){
	        	  f9.setCol7(objects[6].toString());}
	          }
	          else if (f9.getCol8() == null)
	          {if( objects[7]!=null){
	        	  f9.setCol8(objects[7].toString());}
	          }
	          else if (f9.getCol9() == null)
	          {if( objects[8]!=null){
	        	  f9.setCol9(objects[8].toString());}
	          }
	          else
	          {
	            if (f9.getCol10() != null) {
	              continue;
	            }if( objects[9]!=null){
	            f9.setCol10(objects[9].toString());}
	          }

	        }

	        if (pks == null){
	        	pks = "f9";
	        }
	        if (f9.getCol1() == null){
	        	f9.setCol1("");
	        }
	        if (f9.getCol2() == null){
	        	f9.setCol2("");
	        }
	        if (f9.getCol3() == null){
	        	f9.setCol3("");
	        }
	        if (f9.getCol4() == null){
	        	f9.setCol4("");
	        }
	        if (f9.getCol5() == null){
	        	f9.setCol5("");
	        }
	        if (f9.getCol6() == null){
	        	f9.setCol6("");
	        }
	        if (f9.getCol7() == null){
	        	f9.setCol7("");
	        }
	        if (f9.getCol8() == null){
	        	f9.setCol8("");
	        }
	        if (f9.getCol9() == null){
	        	f9.setCol9("");
	        }
	        if (f9.getCol10() == null){
	        	f9.setCol10("");
	        }
	        if (pks.equals("f9")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2()));
	        }
	        if (pks.equals("f91")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3()));
	        }
	        if (pks.equals("f92")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3()+ "²" + f9.getCol4()));
	        }
	        if (pks.equals("f93")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5()));
	        }
	        if (pks.equals("f94")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5() + "²" + f9.getCol6()));
	        }
	        if (pks.equals("f95")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5() + "²" + f9.getCol6() + "²" + f9.getCol7()));
	        }
	        if (pks.equals("f96")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5() + "²" + f9.getCol6() + "²" + f9.getCol7() + "²" + f9.getCol8()));
	        }
	        if (pks.equals("f97")){
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5() + "²" + f9.getCol6()+ "²" + f9.getCol7() + "²" + f9.getCol8() + "²" + f9.getCol9()));
	        }
	        if (pks.equals("f98")) {
	          f9.setPk((f9.getCol1() + "²" + f9.getCol2() + "²" + f9.getCol3() + "²" + f9.getCol4() + "²" + f9.getCol5() + "²" + f9.getCol6() + "²" + f9.getCol7() + "²" + f9.getCol8() + "²" + f9.getCol9() + "²" + f9.getCol10()));
	        }
	        v.add(f9);
	      }
	     
	    }
	    catch (Exception e) {
	      log.error("Exception Exception F9.F9Recherche()" + e.getMessage());
	    }

	    return v;
	  }

	  public String getCol1()
	  {
	    return this.col1;
	  }

	  public String getCol10()
	  {
	    return this.col10;
	  }

	  public String getCol2()
	  {
	    return this.col2;
	  }

	  public String getCol3()
	  {
	    return this.col3;
	  }

	  public String getCol4()
	  {
	    return this.col4;
	  }

	  public String getCol5()
	  {
	    return this.col5;
	  }

	  public String getCol6()
	  {
	    return this.col6;
	  }

	  public String getCol7()
	  {
	    return this.col7;
	  }

	  public String getCol8()
	  {
	    return this.col8;
	  }

	  public String getCol9()
	  {
	    return this.col9;
	  }

	  public void setCol1(String string)
	  {
	    this.col1 = string;
	  }

	  public void setCol10(String string)
	  {
	    this.col10 = string;
	  }

	  public void setCol2(String string)
	  {
	    this.col2 = string;
	  }

	  public void setCol3(String string)
	  {
	    this.col3 = string;
	  }

	  public void setCol4(String string)
	  {
	    this.col4 = string;
	  }

	  public void setCol5(String string)
	  {
	    this.col5 = string;
	  }

	  public void setCol6(String string)
	  {
	    this.col6 = string;
	  }

	  public void setCol7(String string)
	  {
	    this.col7 = string;
	  }

	  public void setCol8(String string)
	  {
	    this.col8 = string;
	  }

	  public void setCol9(String string)
	  {
	    this.col9 = string;
	  }

	  public String getPk()
	  {
	    return this.pk;
	  }

	  public void setPk(String string)
	  {
	    this.pk = string;
	  }
}
