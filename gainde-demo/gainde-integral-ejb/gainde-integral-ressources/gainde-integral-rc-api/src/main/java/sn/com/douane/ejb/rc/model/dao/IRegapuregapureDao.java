package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegapuregapureDto;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import sn.com.douane.ejb.rc.model.entities.Regime;

public interface IRegapuregapureDao extends IGenericDao<Regapuregapure> {

	public List<Regime> rechercheRegimeApurant(String where);
	public List<RegapuregapureDto> rechercheByWhereRegapuregapure(String where) throws RcEjbException;
}
