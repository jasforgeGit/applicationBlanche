package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;

public interface IProfilGroupeDao extends IGenericDao<ProfilGroupe> {
	
	void insert(ProfilGroupe objVo ) throws RcEjbException; 
	
	void ctrlInsertUpdate (ProfilGroupe objVo) throws RcEjbException; 
	
	void update(ProfilGroupe objVo) throws RcEjbException; 
	
	void delete(ProfilGroupeKey key) throws RcEjbException; 
	
	List<ProfilGroupe> findProfilGroupeQuery (String codeProfil)  throws RcEjbException;
	
	List<ProfilGroupe> rechercherDetailProfilProfilGroupe(String codeProfil) throws RcEjbException;	
}
