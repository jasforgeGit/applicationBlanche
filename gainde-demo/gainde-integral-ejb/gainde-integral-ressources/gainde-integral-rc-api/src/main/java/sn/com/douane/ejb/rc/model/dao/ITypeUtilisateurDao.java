package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.TypeUtilisateur;
import sn.com.douane.utils.LabelValue;

public interface ITypeUtilisateurDao extends IGenericDao<TypeUtilisateur> {
	
	 void insert(TypeUtilisateur objVo) throws RcEjbException; 
	
	 void update(TypeUtilisateur objVo) throws RcEjbException;
	
	 void ctrlInsertUpdate(TypeUtilisateur objVo) throws RcEjbException;
	
	 void delete(String key) throws RcEjbException;
	
	 List<LabelValue> getListTypeUtilisateur() throws RcEjbException; 
}
