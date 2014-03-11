package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.model.entities.Devises;

public class DeviseDaoImplTest extends GenericUnitTest{
	

	@Override
	public void testCreate() throws CreateException, FinderException {
		
		Devises devise = new Devises("D");		
		GregorianCalendar calendar = new GregorianCalendar();
		java.util.Date utilDate = calendar.getTime();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		devise.setRcdatedevise(sqlDate);
		devise.setRccoefficient(new Integer(1));
		devise.setRclibelledevise("L");
		devise.setRcprecisiondev(new Integer(2));
		devise.setRcqtecfa(new BigDecimal(3));
		devise.setRcqtedevise(new BigDecimal(2));
		devise.setRcusermodif("U");
		devises.create(devise);
		Devises deviseFound = devises.findByPrimaryKey(devise.getRccodedevise());
		assertNotNull("devise expected to be found",deviseFound);	
		
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		
		Devises devise =  devises.findByPrimaryKey("D");
		assertNotNull("devise expected to be found",devise);
		devise.setRclibelledevise("d");
		devises.merge(devise);
		devise = devises.findByPrimaryKey("D");
		assertEquals("d", devise.getRclibelledevise());
		
	}

	@Override
	public void testDelete() throws RemoveException, FinderException {
		devises.remove("D");
		Devises devise = devises.findByPrimaryKey("D");
		assertNull("devise expected to be deleted",devise);
		
	}
	
}
