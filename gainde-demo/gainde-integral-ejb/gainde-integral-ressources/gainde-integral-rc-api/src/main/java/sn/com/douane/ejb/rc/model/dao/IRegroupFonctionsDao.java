package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;

@Local
public interface IRegroupFonctionsDao extends IGenericDao<RegroupFonctions> { 	
	
	 void insert(RegroupFonctions objVo) throws RcEjbException; 
	
	 void ctrlInsertUpdate(RegroupFonctions objVo) throws RcEjbException; 
	
	 void update(RegroupFonctions objVo) throws RcEjbException; 
	
	 void delete(RegroupFonctionsKey key) throws RcEjbException; 
	
	List<RegroupFonctions> findByCodegroupeQuery (Integer codeGroupe)  throws RcEjbException;	
	List<RegroupFonctions> rechercherByGroupefonction(Integer rccodegroupe) throws RcEjbException;
	public String getRegroupFoncString() throws RcEjbException, FinderException;
}
