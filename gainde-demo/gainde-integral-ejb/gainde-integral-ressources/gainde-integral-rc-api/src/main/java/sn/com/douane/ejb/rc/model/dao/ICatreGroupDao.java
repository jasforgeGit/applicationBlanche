package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.CatreGroupDto;
import sn.com.douane.ejb.rc.model.entities.CatreGroup;

public interface ICatreGroupDao extends IGenericDao<CatreGroup> {
	
	 public List<CatreGroupDto> rechercheByWhereCatreGroup(String where) throws RcEjbException;

}
