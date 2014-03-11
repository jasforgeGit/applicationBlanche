package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.CircuitVisite;
import sn.com.douane.ejb.rc.model.entities.UniteVisite;
import sn.com.douane.ejb.rc.model.keys.UniteVisiteKey;

public class UniteVisiteDaoImplTest extends GenericUnitTest { 


	@Override
	public void testCreate() throws CreateException, FinderException {
		
		CircuitVisite circuit = new CircuitVisite("C","c");
		circuitVisiteDao.create(circuit);
		UniteVisite unite = new UniteVisite();
		unite.setRccodecircuit("C");
		unite.setRcnbreunitevisite(new Integer(1));
		unite.setRcspecialisation("S");
		uniteVisteContext.create(unite);
		UniteVisiteKey key = new UniteVisiteKey("C","S");
		UniteVisite uniteFound = uniteVisteContext.findByPrimaryKey(key);
		assertNotNull("Pays expected to be found",uniteFound);		
		
	}
	
	@Override
	public void testUpdate() throws EJBException, FinderException {
		UniteVisiteKey key = new UniteVisiteKey("C","S");
		UniteVisite unite = uniteVisteContext.findByPrimaryKey(key);
		assertNotNull("uniteViste expected to be found",unite);
		unite.setRcnbreunitevisite(new Integer(3));
		uniteVisteContext.merge(unite);		
		unite = uniteVisteContext.findByPrimaryKey(key);
		assertEquals(3, unite.getRcnbreunitevisite().intValue());
	}

	@Override
	public void testDelete() throws RemoveException, FinderException {
		
		UniteVisiteKey key = new UniteVisiteKey("C","S");
		uniteVisteContext.remove(key);
		UniteVisite unite = uniteVisteContext.findByPrimaryKey(key);
		assertNull("unite expected to be deleted",unite);
		CircuitVisite circuit = circuitVisiteDao.findByPrimaryKey("C");
		circuitVisiteDao.remove("C");
		circuit = circuitVisiteDao.findByPrimaryKey("C");
		assertNull("circuit expected to be deleted",circuit);
	}
	
	
	
}