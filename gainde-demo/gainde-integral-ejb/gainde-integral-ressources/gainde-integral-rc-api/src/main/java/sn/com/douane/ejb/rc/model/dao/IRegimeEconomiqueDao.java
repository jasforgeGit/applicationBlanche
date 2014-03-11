package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeEconomiqueDto;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;

@Local
public interface IRegimeEconomiqueDao extends IGenericDao<RegimeEconomique>{
	
	public List<RegimeEconomique> findByAnneeNumero(String numeroReg, String anneeReg);
	public List<RegimeEconomiqueDto> rechercheByWhereRegimeEconomique(String where) throws RcEjbException;

}
