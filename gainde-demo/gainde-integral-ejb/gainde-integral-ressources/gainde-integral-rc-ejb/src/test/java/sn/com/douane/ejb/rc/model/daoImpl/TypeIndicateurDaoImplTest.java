package sn.com.douane.ejb.rc.model.daoImpl;


import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.TypeIndicateur;


public class TypeIndicateurDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate () throws CreateException {
		 typeIndicateurContext.create(new TypeIndicateur("T00001", "TI01", "Tab1")); 
	     typeIndicateurContext.create(new TypeIndicateur("T00002", "TI02","Tab2")); 
	     typeIndicateurContext.create(new TypeIndicateur("T00003", "TI03","Tab2")); 
	     typeIndicateurContext.create(new TypeIndicateur("T00004", "TY04","Tab2"));  
	}
	
	@Override
	public void testUpdate () throws EJBException, FinderException {
		TypeIndicateur myTypeIndicat = typeIndicateurContext.findByPrimaryKey("T00001"); 
		myTypeIndicat.setRcLibTypeIndicateur("UPDATE"); 
		typeIndicateurContext.merge(myTypeIndicat); 
	}

	@Override
	public void testDelete () throws FinderException, RemoveException {
		typeIndicateurContext.remove("T00001");
	    typeIndicateurContext.remove("T00002");
	    typeIndicateurContext.remove("T00003");
	    typeIndicateurContext.remove("T00004");
	}
}
