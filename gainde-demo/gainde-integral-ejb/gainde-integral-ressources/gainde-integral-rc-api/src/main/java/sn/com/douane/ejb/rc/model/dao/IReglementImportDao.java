package sn.com.douane.ejb.rc.model.dao;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;

public interface IReglementImportDao extends IGenericDao<ReglementImport> {
	
	
	
	public String findCvByReglementImport(String codeProduit,String precisionMoa,
			String precisionSen,String codeImp) ;

}
