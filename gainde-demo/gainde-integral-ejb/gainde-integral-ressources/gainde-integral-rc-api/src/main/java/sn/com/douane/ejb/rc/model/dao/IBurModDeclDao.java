package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.BurModDeclDto;
import sn.com.douane.ejb.rc.model.entities.BurModDecl;

public interface IBurModDeclDao extends IGenericDao<BurModDecl>{

	public List<BurModDeclDto> rechercheByWhereBurModDecl(String where) throws RcEjbException ;
}
