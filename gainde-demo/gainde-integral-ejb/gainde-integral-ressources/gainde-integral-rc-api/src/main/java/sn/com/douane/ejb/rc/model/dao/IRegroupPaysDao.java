package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegroupPaysDto;
import sn.com.douane.ejb.rc.model.entities.RegroupPays;

@Local	
public interface IRegroupPaysDao extends IGenericDao<RegroupPays>{

	public List<RegroupPaysDto> rechercheByWhereRegroupPays(String where) throws RcEjbException;
}
