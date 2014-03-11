package sn.com.douane.ejb.rc.model.dao;

import java.sql.Date;
import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Taxation2;

public interface ITaxation2Dao extends IGenericDao<Taxation2> {
	
	public boolean presenceProduit(String codeprod,String precuemoa,String precSenegal) throws RcEjbException;
	public Taxation2 findTaxation2(Date dateEffet, String codeProd,
			String precUemoa, String precSen) throws RcEjbException;
	
	List<Taxation2> getTaxtaionStructure(Date dsql) throws RcEjbException;
	

}
