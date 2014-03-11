package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeBurInterditDto;
import sn.com.douane.ejb.rc.model.entities.RegimeBurInterdit;

public interface IRegimeBurInterditDao extends IGenericDao<RegimeBurInterdit> {

	public List<RegimeBurInterditDto> rechercheByWhereRegimeBurInterdit(String where) throws RcEjbException;
}
