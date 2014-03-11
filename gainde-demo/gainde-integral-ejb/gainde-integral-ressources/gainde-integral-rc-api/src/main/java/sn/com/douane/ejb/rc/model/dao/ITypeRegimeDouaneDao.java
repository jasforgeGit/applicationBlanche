package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.TypeRegimeDouaneDto;
import sn.com.douane.ejb.rc.model.entities.TypeRegimeDouane;

public interface ITypeRegimeDouaneDao extends IGenericDao<TypeRegimeDouane>{
	
    public String getImpExpRegime(String rctyperegime) throws FinderException;
    public List<TypeRegimeDouaneDto> rechercheByWhereTypeRegimeDouane(String where) throws RcEjbException;

}
