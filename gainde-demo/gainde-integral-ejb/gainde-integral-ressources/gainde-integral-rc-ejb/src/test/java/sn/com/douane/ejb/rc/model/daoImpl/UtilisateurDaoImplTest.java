package sn.com.douane.ejb.rc.model.daoImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

import org.junit.Ignore;
import org.junit.Test;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.TypeUtilisateur;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;

public class UtilisateurDaoImplTest extends GenericUnitTest{

	@Override
	public void testCreate () throws CreateException, FinderException {
		profilContext.create(new Profil("pr1","LibP")); 
		profilContext.create(new Profil("pr2","LibP")); 
		typeUtilisateurContext.create(new TypeUtilisateur("1", "T1")); 
		
		Utilisateur user = new Utilisateur("user1","ident",  "pwd"); 
		user.setRcCodeProfil("pr1"); 
		user.setRcTypeUser("1"); 
		
		utilisateurContext.create(user);
		
		Utilisateur user2 = utilisateurContext.findByPrimaryKey("user1");  		
		assertNotNull("Utilisateur not created ! ",user2); 
		assertEquals("pwd",user2.getRcMotPasse());
	}
	
	@Override
	public void testUpdate () throws FinderException, EJBException {
		
	}
	
	
	@Test
	public void testGetUtilisateurByLoginPwd () throws RcEjbException, RemoveException, FinderException, CreateException {
		testCreate();
		Utilisateur user = utilisateurContext.getUtilisateurByLoginPwd("user1", "pwd");
		assertEquals(user.getRcMotPasse(), "pwd");
		assertNotNull("User not found ", user);
		testDelete();
	}
	
	@Override
	public void testDelete () throws RemoveException, FinderException {
		utilisateurContext.remove("user1");
		profilContext.remove("pr1");
		profilContext.remove("pr2");
		typeUtilisateurContext.remove("1");
	}

}
