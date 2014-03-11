package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeDouanierDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;

public interface IRegimeDouanierDao extends IGenericDao<RegimeDouanier>{
	
	public List<RegimeDouanier> controleRegimeDouanier(String rcTypeRegime, String rcCodeRegimeDouanier);
	
	 public List<RegimeDouanierDto> rechercheByWhereRegimeDouanier(String where) throws RcEjbException;

}
