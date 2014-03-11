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
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;

/**
 * 
 * @author nesrine
 *
 */
public class RegroupFonctionsDaoImplTest extends GenericUnitTest{

	@Override
	public void testCreate () throws CreateException, FinderException {
		// create fonctionnalites
		fonctionnalitesContext.create(new Fonctionnalite("f1", "LibFct1")); 
		// create GroupeFonction
		groupeFonctionContext.create(new GroupeFonction(10, "grp1", 20)); 
		
		regroupFonctionsContext.create(new RegroupFonctions("f1", 10, 1)); 
		RegroupFonctions regFct = regroupFonctionsContext.findByPrimaryKey(new RegroupFonctionsKey("f1", 10)); 
		assertEquals(regFct.getRcOrdreAffichage(), (Integer) 1); 		
		assertNotNull("RegroupFonctions not created ",regFct); 
	}
	
	@Override
	public void testUpdate () throws EJBException, FinderException {
		RegroupFonctions rgrp = regroupFonctionsContext.findByPrimaryKey(new RegroupFonctionsKey("f1", 10)); 
		rgrp.setRcOrdreAffichage(27); 
		regroupFonctionsContext.merge(rgrp); 
		assertEquals(rgrp.getRcOrdreAffichage(), (Integer) 27); 
	}
	
	
	@Test
	public void testrechercherByGroupefonction () throws RcEjbException, FinderException, RemoveException, CreateException {
		testCreate();
		List<RegroupFonctions> list = regroupFonctionsContext.rechercherByGroupefonction(10); 
		assertEquals(list.size(), 1); 
		testDelete();
	}
	
	@Override
	public void testDelete () throws FinderException,RemoveException {
		regroupFonctionsContext.remove(new RegroupFonctionsKey("f1", 10));
		fonctionnalitesContext.remove("f1"); 
		groupeFonctionContext.remove(10); 
	}

}
