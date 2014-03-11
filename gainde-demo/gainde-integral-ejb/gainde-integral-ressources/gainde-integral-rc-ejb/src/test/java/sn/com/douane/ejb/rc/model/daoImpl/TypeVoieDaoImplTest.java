package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import junit.framework.Assert;
import sn.com.douane.ejb.rc.model.entities.TypeVoie;

/**
 * Unit test for TypeVoie entity bean .
 *  
 * @author Wadii
 */
public class TypeVoieDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws CreateException, FinderException {

         TypeVoie typeVoie = new TypeVoie("VOIE1");    
         typeVoie.setLibelletypevoie("VOIE1");
         typeVoieDao.create(typeVoie);
         
         Assert.assertNotNull(typeVoieDao.findByPrimaryKey("VOIE1"));
		
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		
		TypeVoie typeVoieToTest = typeVoieDao.findByPrimaryKey("VOIE1");
		typeVoieToTest.setLibelletypevoie("VOIE1_CHANGED");
		typeVoieDao.merge(typeVoieToTest);
		
	}

	@Override
	public void testDelete() throws FinderException, RemoveException {
		
		typeVoieDao.remove("VOIE1");
		Assert.assertNull(typeVoieDao.findByPrimaryKey("VOIE1"));		
		
	}

}
