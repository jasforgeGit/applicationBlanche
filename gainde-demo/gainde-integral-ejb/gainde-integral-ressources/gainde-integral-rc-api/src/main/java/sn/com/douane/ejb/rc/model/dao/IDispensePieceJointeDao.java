package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.DispensePieceJointeDto;
import sn.com.douane.ejb.rc.model.entities.DispensePieceJointe;

public interface IDispensePieceJointeDao extends IGenericDao<DispensePieceJointe> {

	public List<DispensePieceJointeDto> rechercheByWhereDispensePieceJointe(String where) throws RcEjbException;
	
}
