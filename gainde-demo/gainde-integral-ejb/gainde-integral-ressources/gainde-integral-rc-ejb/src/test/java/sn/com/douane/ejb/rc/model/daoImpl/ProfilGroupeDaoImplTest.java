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
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;

public class ProfilGroupeDaoImplTest extends GenericUnitTest {
	
	@Override
	public void testCreate () throws CreateException, FinderException {
		profilContext.create(new Profil("pr1","LibP")); 	
		groupeFonctionContext.create(new GroupeFonction(1, "grp1", 2)); 
		groupeFonctionContext.create(new GroupeFonction(2, "grp2", 2)); 
		profilGroupeContext.create(new ProfilGroupe ("pr1", 1)); 
		profilGroupeContext.create(new ProfilGroupe ("pr1", 2));
		ProfilGroupe profilGrp = profilGroupeContext.findByPrimaryKey(new ProfilGroupeKey(1, "pr1"));  		
		assertNotNull("ProfilGroupe not created ! ",profilGrp);
	}
	
	@Override
	public void testUpdate () throws EJBException, FinderException {
		Profil profil = profilContext.findByPrimaryKey("pr1"); 
		profil.setRcLibelleProfil("libelle"); 
		profilContext.merge(profil); 
		assertEquals(profil.getRcLibelleProfil(), "libelle"); 
	}
	
	
	@Test
	public void testRechercherDetailProfilProfilgroupe() throws RcEjbException, CreateException, FinderException, RemoveException {
		testCreate();
		List<ProfilGroupe> list = profilGroupeContext.rechercherDetailProfilProfilGroupe("pr1"); 
		assertEquals(list.size(), 2);
		testDelete();
	}
	
	@Override
	public void testDelete () throws FinderException,RemoveException {
		profilGroupeContext.remove(new ProfilGroupeKey(1, "pr1")); 
		profilGroupeContext.remove(new ProfilGroupeKey(2, "pr1")); 
		groupeFonctionContext.remove(1); 
		groupeFonctionContext.remove(2);
		profilContext.remove("pr1"); 
	}
	
	

}
