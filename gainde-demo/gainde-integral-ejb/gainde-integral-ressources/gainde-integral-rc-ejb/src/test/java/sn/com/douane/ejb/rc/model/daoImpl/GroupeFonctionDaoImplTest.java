package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import org.junit.Ignore;
import org.junit.Test;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;
import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;

/**
 * Unit test of CRUD operations for GroupeFonction entity
 * @author nesrine
 *
 */
public class GroupeFonctionDaoImplTest  extends GenericUnitTest{

	@Override
	public void testCreate() throws CreateException, FinderException {
		profilContext.create(new Profil("pr1","LibP")); 	
		
		groupeFonctionContext.create(new GroupeFonction(1, "grp1", 2)); 
		groupeFonctionContext.create(new GroupeFonction(2, "grp2", 2)); 
		
		profilGroupeContext.create(new ProfilGroupe ("pr1", 1)); 
		profilGroupeContext.create(new ProfilGroupe ("pr1", 2));
		 
		fonctionnalitesContext.create(new Fonctionnalite("f1", "LibFct1"));
		regroupFonctionsContext.create(new RegroupFonctions("f1", 1, 1)); 
		
		GroupeFonction grp = groupeFonctionContext.findByPrimaryKey(1); 
		assertNotNull("GroupeFonction not created ", grp); 
	}

	
	@Override
	public void testUpdate() throws EJBException, FinderException {
			
	}
	
	
	@Test 
	public void testRechercherByCodeFonctionInOrder() throws RcEjbException, CreateException, FinderException, RemoveException {
		testCreate();
		GroupeFonction grp = groupeFonctionContext.rechercherByCodeFonctionInOrder(1);
		assertNotNull("GroupeFonction not found ", grp);
		testDelete();
	}
	
	@Test 
	public void testRechercherDetailGroupefonctionGroupefonction () throws RcEjbException, CreateException, FinderException, RemoveException {
		testCreate();
		List<GroupeFonction> listG = groupeFonctionContext.rechercherDetailGroupefonctionGroupefonction(1); 
		assertEquals(listG.size(), 1);
		testDelete();
	}

	
	@Test
	public void testRechercherDetailGroupefonctionProfilgroupe () throws RcEjbException, CreateException, FinderException, RemoveException {
		testCreate();
		List<ProfilGroupe> listP = groupeFonctionContext.rechercherDetailGroupefonctionProfilgroupe(1); 
		assertEquals(listP.size(),1);
		testDelete();
	}
	
	
	@Test
	public void testRechercherDetailGroupefonctionRegroupfonctions () throws RcEjbException, CreateException, FinderException, RemoveException {
		testCreate();
		List<RegroupFonctions> listR = groupeFonctionContext.rechercherDetailGroupefonctionRegroupfonctions(1); 
		assertEquals(listR.size(), 1); 
		testDelete();
	}
	
	
	@Override
	public void testDelete() throws FinderException,RemoveException {
	
		profilGroupeContext.remove(new ProfilGroupeKey(1, "pr1")); 
		profilGroupeContext.remove(new ProfilGroupeKey(2, "pr1")); 
		
		regroupFonctionsContext.remove(new RegroupFonctionsKey("f1", 1));
		fonctionnalitesContext.remove("f1"); 
		
		groupeFonctionContext.remove(1); 
		groupeFonctionContext.remove(2);
		
		profilContext.remove("pr1");
		
	}

}
