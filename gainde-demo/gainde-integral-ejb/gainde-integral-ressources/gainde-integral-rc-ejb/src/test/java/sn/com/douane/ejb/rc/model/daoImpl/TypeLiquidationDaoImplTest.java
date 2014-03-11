package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.TypeLiquidation;

/**
 * 
 */
public class TypeLiquidationDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws  CreateException,
			FinderException {
		typeLiquidationContext.create(new TypeLiquidation("T", "TL01"));
		TypeLiquidation typeLiquid = typeLiquidationContext
				.findByPrimaryKey("T");
		assertEquals("TL01", typeLiquid.getRclibelletypeliquid());
		assertNotNull("TypeLiquidation not created ", typeLiquid);
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		TypeLiquidation myTypeLiquid = typeLiquidationContext
				.findByPrimaryKey("T");
		myTypeLiquid.setRclibelletypeliquid("type");
		typeLiquidationContext.merge(myTypeLiquid);
	}

	@Override
	public void testDelete() throws FinderException, RemoveException {
		typeLiquidationContext.remove("T");
	}

}
