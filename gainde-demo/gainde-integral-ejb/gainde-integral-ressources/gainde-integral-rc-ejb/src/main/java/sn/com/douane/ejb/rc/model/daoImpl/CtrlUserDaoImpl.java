package sn.com.douane.ejb.rc.model.daoImpl;


import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.model.dao.ICtrlUserDao;
import sn.com.douane.ejb.rc.model.entities.CtrlUser;



@Stateless(name="ICtrlUserDao")
public class CtrlUserDaoImpl extends GenericDaoImpl<CtrlUser> implements ICtrlUserDao {

		public void deleteAllUser()  {
	
	        	Query query = entityManager.createQuery("delete From CtrlUser");
	        	query.executeUpdate();
	
	}	
	

       
   



}
