package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.BureauUemoaDto;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;

public interface IBureauUemoaDao extends IGenericDao<BureauUemoa>{
	
	public List<BureauUemoaDto> rechercheByWhereBureauUemoa(String where) throws RcEjbException;

}
