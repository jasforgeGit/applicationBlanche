package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeDeclarantDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;

public interface IRegimeDeclarantDao extends IGenericDao<RegimeDeclarant>{

	List<RegimeDeclarant> getRegimeDeclarantByCodePpm(String codePpm); 
	public List<RegimeDeclarantDto> rechercheByWhereRegimeDeclarant(String where) throws RcEjbException;
}
