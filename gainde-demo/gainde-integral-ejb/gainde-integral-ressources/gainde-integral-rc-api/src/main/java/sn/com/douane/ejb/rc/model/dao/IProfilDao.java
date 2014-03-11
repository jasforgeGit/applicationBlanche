package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.ProfilDto;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;

public interface IProfilDao extends IGenericDao<Profil> {	

	 void insert(Profil objvo) throws RcEjbException ; 
	
	 void update(Profil objvo) throws RcEjbException; 
	
	 void delete(String objkey) throws RcEjbException; 
	
	 void ctrlInsertUpdate (Profil vo) throws RcEjbException;
	
	 List<ProfilGroupe> rechercherDetailProfilProfilgroupe (String profilkey) throws RcEjbException; 
	 
	 public List<ProfilDto> rechercheByWhereProfil(String where) throws RcEjbException;
	
}
