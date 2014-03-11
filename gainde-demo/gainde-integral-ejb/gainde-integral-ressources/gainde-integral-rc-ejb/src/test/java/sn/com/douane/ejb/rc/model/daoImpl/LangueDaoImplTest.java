package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.Langue;

public class LangueDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws CreateException, FinderException {
		Langue langue = new Langue("L", "langue");
		langues.create(langue);
		Langue langueFound = langues.findByPrimaryKey(langue.getRccodelangue());
		assertNotNull("langue expected to be found",langueFound);		
	}


	@Override
	public void testUpdate() throws EJBException, FinderException {
		
		Langue langue = langues.findByPrimaryKey("L");
		assertNotNull("langue expected to be found",langue);
		langue.setLibellelangue("libelle");
		langues.merge(langue);
		langue = langues.findByPrimaryKey("L");
		assertEquals("libelle", langue.getLibellelangue());
		
	}

	@Override
	public void testDelete() throws  RemoveException, FinderException {		
		langues.remove("L");
		Langue langue = langues.findByPrimaryKey("L");
		assertNull("langue expected to be deleted",langue);
		
	}
	
}
