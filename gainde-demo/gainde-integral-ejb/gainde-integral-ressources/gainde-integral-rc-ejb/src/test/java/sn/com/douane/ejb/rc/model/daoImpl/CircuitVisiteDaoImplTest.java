package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.CircuitVisite;


public class CircuitVisiteDaoImplTest extends GenericUnitTest{

	@Override
	public void testCreate() throws CreateException, FinderException {

		CircuitVisite circuit = new CircuitVisite("C","c");
		circuitVisiteDao.create(circuit);
		CircuitVisite circuitFound = circuitVisiteDao.findByPrimaryKey(circuit.getRccodecircuit());
		assertNotNull("circuit expected to be found",circuitFound);
	
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		
		CircuitVisite circuit = circuitVisiteDao.findByPrimaryKey("C");
		assertNotNull("circuit expected to be found",circuit);
		circuit.setRccouleur("R");
		circuitVisiteDao.merge(circuit);
		circuit = circuitVisiteDao.findByPrimaryKey("C");
		assertEquals("R", circuit.getRccouleur());
		
	}

	@Override
	public void testDelete() throws FinderException, RemoveException, FinderException {		
		circuitVisiteDao.remove("C");
		CircuitVisite circuit = circuitVisiteDao.findByPrimaryKey("C");
		assertNull("circuit expected to be deleted",circuit);

		
		
	}
	
	
	
	
	
}