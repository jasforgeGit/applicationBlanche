package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.BasesTaxableDto;
import sn.com.douane.ejb.rc.model.entities.BasesTaxable;

/**
 * The Interface IBasesTaxableDao.
 */
@Local
public interface IBasesTaxableDao extends IGenericDao<BasesTaxable> {

	/**
	 * Recherche by where bases taxable.
	 *
	 * @param where the where
	 * @return the list
	 * @throws RcEjbException the rc ejb exception
	 */
	public List<BasesTaxableDto> rechercheByWhereBasesTaxable(String where) throws RcEjbException;
}
