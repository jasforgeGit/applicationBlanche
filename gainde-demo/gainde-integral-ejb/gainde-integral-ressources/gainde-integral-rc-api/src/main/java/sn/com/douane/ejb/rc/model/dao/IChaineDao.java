package sn.com.douane.ejb.rc.model.dao;

import java.util.List;


import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Chaine;

public interface IChaineDao extends IGenericDao<Chaine>{
	
	//public List<CritereDisplay> rechercheCriteres(String requete) throws  RcEjbException;
	
	void insert(Chaine vo) throws RcEjbException; 

}
