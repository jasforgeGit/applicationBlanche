package sn.com.douane.ejb.rc.model.dao;


import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;
import javax.ejb.RemoveException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.SaisieTrancheArchivageDto;
import sn.com.douane.ejb.rc.model.dto.SaisieTranchesQuittancesDto;
import sn.com.douane.ejb.rc.model.entities.HistoQuittancesValides;


/**
 * The Interface IHistoQuittancesValidesDao.
 */
@Local
public interface IHistoQuittancesValidesDao extends IGenericDao<HistoQuittancesValides>{
	public SaisieTrancheArchivageDto rechercherTrancheArchivage(
			String tranchedeb, String tranchefin) throws RcEjbException;
	public void insertTrancheArchive(SaisieTrancheArchivageDto objvo) throws RcEjbException, FinderException, RemoveException;
	public List<HistoQuittancesValides> consulterTranchesArchivage();
	public SaisieTranchesQuittancesDto rechercherTrancheDesarchivage(
			String tranchedeb, String tranchefin) throws RcEjbException, FinderException, RemoveException;
}
