package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.TypeCredit;
import sn.com.douane.utils.LabelValue;

public interface ITypeCreditDao extends IGenericDao<TypeCredit> {

	void insert(TypeCredit objVo) throws RcEjbException; 
	
	void update(TypeCredit objVo) throws RcEjbException; 
	
	void ctrlInsertUpdate(TypeCredit objVo) throws RcEjbException; 
	
	void delete(String key) throws RcEjbException; 
	
	List<Creditaire> rechercherDetailTypecreditCreditaires(String key) throws RcEjbException;
	
	List<LabelValue> getListeTypeCredit() throws RcEjbException; 
}
