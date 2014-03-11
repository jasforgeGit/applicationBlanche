package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import org.junit.Ignore;
import org.junit.Test;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.TypeUtilisateur;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.ejb.rc.model.keys.DelegationKey;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;

/**
 * Unit test of CRUD operations for Delegation entity
 * 
 * @author nesrine
 * 
 */
public class DelegationDaoImplTest extends GenericUnitTest {

	@Override
	public void testCreate() throws CreateException, FinderException {
		try {
			profilContext.insert(new Profil("pr1", "LibP"));
		} catch (RcEjbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			typeUtilisateurContext.insert(new TypeUtilisateur("1", "T1"));
		} catch (RcEjbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// create user
		Utilisateur user1 = new Utilisateur("cod1", "ident", "pwd");
		user1.setRcCodeProfil("pr1");
		user1.setRcTypeUser("1");
		Utilisateur user2 = new Utilisateur("cod2", "ident2", "pwd2");
		user2.setRcCodeProfil("pr1");
		user2.setRcTypeUser("1");
		utilisateurContext.create(user1);
		utilisateurContext.create(user2);
		// create fonctionnalites
		fonctionnalitesContext.create(new Fonctionnalite("1", "LibFct1"));
		// create groupe
		groupeFonctionContext.create(new GroupeFonction(11, "libGrp", 5));
		// create delegations
		Delegation delegation = new Delegation(Date.valueOf("2012-02-02"), "1",
				11, "cod1", "cod2");
		Delegation delegation1 = new Delegation(Date.valueOf("2012-02-02"),
				"1", 11, "cod2", "cod2");
		
		delegationContext.create(delegation);
		delegationContext.create(delegation1);

		Delegation deleg = delegationContext
				.findByPrimaryKey(new DelegationKey(Date.valueOf("2012-02-02"),
						"cod1", "cod2", "1", 11));
		assertEquals("1", deleg.getCodeFonction());
		assertNotNull("Delegations not created ", deleg);
	}

	@Override
	public void testUpdate() throws EJBException, FinderException {
		Delegation deleg = delegationContext
				.findByPrimaryKey(new DelegationKey(Date.valueOf("2012-02-02"),
						"cod1", "cod2", "1", 11));
		deleg.setDatefin(Date.valueOf("2012-02-12"));
		delegationContext.merge(deleg);
		assertEquals(deleg.getDateFin(), Date.valueOf("2012-02-12"));
	}

	@Test
	public void testNamedQuery() throws RcEjbException, FinderException,
			RemoveException, CreateException {
		testCreate();
		List<Delegation> listfctDelegue = delegationContext
				.findfctdelegueQuery(Date.valueOf("2012-02-02"), "cod2");
		assertEquals(listfctDelegue.size(), 2);
		List<Delegation> listDeleg = delegationContext.finddelegueQuery(Date
				.valueOf("2012-02-02"));
		assertEquals(listDeleg.size(), 2);
		testDelete();
	}

	@Override
	public void testDelete() throws FinderException, RemoveException {
		delegationContext.remove(new DelegationKey(Date.valueOf("2012-02-02"),
				"cod1", "cod2", "1", 11));
		delegationContext.remove(new DelegationKey(Date.valueOf("2012-02-02"),
				"cod2", "cod2", "1", 11));
		groupeFonctionContext.remove(11);
		fonctionnalitesContext.remove("1");
		utilisateurContext.remove("cod1");
		utilisateurContext.remove("cod2");
		typeUtilisateurContext.remove("1");
		profilContext.remove("pr1");
		
	}

}
