package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.SaisieQuittanceExclueDto;
import sn.com.douane.ejb.rc.model.entities.QuittancesExclues;

/**
 * The Interface IQuittancesExcluesDao.
 */
@Local
public interface IQuittancesExcluesDao extends IGenericDao<QuittancesExclues>{
	public boolean existQuittanceexclue(String numquitt);
	public void insertQuittanceExclue(SaisieQuittanceExclueDto objvo)
			throws RcEjbException;
	public boolean supprimerQuittanceExclue(String num);

}
