package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeDto;
import sn.com.douane.ejb.rc.model.entities.Regime;

public interface IRegimeDao extends IGenericDao<Regime> {
	
	public String findCvByRegime(String typeRegime,String codeRegimeDouanier,String codeRegimeFiscal);
	public List<RegimeDto> rechercheByWhereRegime(String where) throws RcEjbException;
}
