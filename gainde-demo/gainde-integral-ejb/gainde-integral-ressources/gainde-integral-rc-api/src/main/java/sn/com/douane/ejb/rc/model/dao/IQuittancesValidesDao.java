package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.SaisieTrancheArchivageDto;
import sn.com.douane.ejb.rc.model.dto.SaisieTranchesQuittancesDto;
import sn.com.douane.ejb.rc.model.entities.QuittancesValides;
import sn.com.douane.utils.LabelValue;

/**
 * The Interface IQuittancesValidesDao.
 */
@Local
public interface IQuittancesValidesDao extends IGenericDao<QuittancesValides>{
	public List<LabelValue> getListeTypeQuittance() throws FinderException, RcEjbException;
	public List<QuittancesValides> consulterTranchesQuittances() throws FinderException, RcEjbException;
	public int rechercherExisteBorne(String tranchedeb) throws RcEjbException;
	public int rechercherExisteBorneSup(String tranchefin) throws RcEjbException;
	public void insertTranche(SaisieTranchesQuittancesDto objvo)throws RcEjbException;
	public List<QuittancesValides> getRechercherQuittance(String inf,String sup) throws RcEjbException;
	public boolean exist(int num);
}
