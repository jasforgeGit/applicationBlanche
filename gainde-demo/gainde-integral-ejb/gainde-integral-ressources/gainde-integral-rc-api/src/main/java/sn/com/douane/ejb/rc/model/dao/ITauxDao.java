package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.TauxDto;
import sn.com.douane.ejb.rc.model.entities.Taux;

@Local
public interface ITauxDao extends IGenericDao<Taux> {
	
	public double quotite(String codetaux, String codetaxe)	throws RcEjbException;
	
	 public String getWherepkDate(String codtaux, String rccodetaxe,
				String conditionDate);
	 
	 public String getConditionDate();
	 public List<TauxDto> rechercheByWhere(String where) throws RcEjbException;
}
