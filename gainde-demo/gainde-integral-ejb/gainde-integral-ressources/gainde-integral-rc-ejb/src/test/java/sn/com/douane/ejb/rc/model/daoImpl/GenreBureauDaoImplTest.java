package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import org.junit.Assert;

import sn.com.douane.ejb.rc.model.entities.GenreBureau;

/**
 * Unit test class for CRUD operations on GenreBureau entity bean.
 * 
 * @author Wadii 
 */
public class GenreBureauDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws CreateException, FinderException {
		genreBureauDao.create(new GenreBureau("GENRE_BUR", "DESCRIPTION_GENRE_BUR"));
		Assert.assertNotNull(genreBureauDao.findByPrimaryKey("GENRE_BUR"));
	}
	
	@Override
	public void testUpdate() throws EJBException, FinderException {
		GenreBureau genreBureauToUpdate = genreBureauDao.findByPrimaryKey("GENRE_BUR");
		Assert.assertNotNull(genreBureauToUpdate);
		genreBureauToUpdate.setRcdesgenrebureau("DESCRIPTION_GENRE_BUREAU_TEST");
		genreBureauDao.merge(genreBureauToUpdate);
		GenreBureau compBureauUpdated = genreBureauDao.findByPrimaryKey("GENRE_BUR");
		Assert.assertEquals("DESCRIPTION_GENRE_BUREAU_TEST", compBureauUpdated.getRcdesgenrebureau());
	}

	@Override
	public void testDelete() throws RemoveException, FinderException {		
		genreBureauDao.remove("GENRE_BUR");
		GenreBureau deletedGenreBureau = genreBureauDao.findByPrimaryKey("GENRE_BUR");
		Assert.assertNull(deletedGenreBureau);
	}
	
}
