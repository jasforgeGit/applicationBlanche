package sn.com.douane.ejb.rc.model.dao;

import sn.com.douane.ejb.rc.model.entities.TaxesSuspendus;

public interface ITaxesSuspendusDao extends IGenericDao<TaxesSuspendus>{
	
	public String getWhereByTaxeIndicateur(String condition,String codetaxe,String indicateur );

}
