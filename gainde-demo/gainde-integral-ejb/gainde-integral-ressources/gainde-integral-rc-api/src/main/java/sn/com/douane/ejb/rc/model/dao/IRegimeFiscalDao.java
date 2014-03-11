package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeFiscalDto;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;

public interface IRegimeFiscalDao extends IGenericDao<RegimeFiscal>{

	public List<RegimeFiscalDto> rechercheByWhereRegimeFiscal(String where) throws RcEjbException;
}
