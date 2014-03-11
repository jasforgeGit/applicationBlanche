package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.ModeReglement;

/**
 * Unit test of CRUD operations for ModeReglement entity
 * 
 * @author nesrine
 * 
 */

public class ModeReglementDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws CreateException,
			FinderException {
		modeReglementContext.create(new ModeReglement("1", "Mreg"));
		ModeReglement modeReglementCreated = modeReglementContext
				.findByPrimaryKey("1");
		assertNotNull("ModeReglement not created ", modeReglementCreated);
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		ModeReglement myModReg = modeReglementContext.findByPrimaryKey("1");
		myModReg.setRcLibReglement("lib");
		myModReg.setRcRefReglement("ref");
		modeReglementContext.merge(myModReg);
		assertEquals(myModReg.getRcLibReglement(), "lib");
		assertEquals(myModReg.getRcRefReglement(), "ref");
	}

	@Override
	public void testDelete() throws FinderException, RemoveException {
		modeReglementContext.remove("1");
	}
}
