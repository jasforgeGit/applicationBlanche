package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.TaxesRegimeDto;
import sn.com.douane.ejb.rc.model.entities.TaxesRegime;

public interface ITaxesRegimeDao extends IGenericDao<TaxesRegime>{

	public List<TaxesRegimeDto> rechercheByWhereTaxesRegime(String where) throws RcEjbException;
}
