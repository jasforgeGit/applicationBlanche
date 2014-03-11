package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.TaxesRegDouDto;
import sn.com.douane.ejb.rc.model.entities.TaxesRegDou;

public interface ITaxesRegDouDao extends IGenericDao<TaxesRegDou> {

	 public List<TaxesRegDouDto> rechercheByWhereTaxesRegDou(String where) throws RcEjbException;
}
