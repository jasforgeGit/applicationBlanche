package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IHistoQuittancesValidesDao;
import sn.com.douane.ejb.rc.model.dao.IQuittancesValidesDao;
import sn.com.douane.ejb.rc.model.dto.SaisieTrancheArchivageDto;
import sn.com.douane.ejb.rc.model.dto.SaisieTranchesQuittancesDto;
import sn.com.douane.ejb.rc.model.entities.HistoQuittancesValides;
import sn.com.douane.ejb.rc.model.entities.QuittancesValides;
import sn.com.douane.ejb.rc.model.keys.QuittancesValidesKey;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;

/**
 * The Class HistoQuittancesValidesDaoImpl.
 */
@Stateless(name = "IHistoQuittancesValidesDao")
public class HistoQuittancesValidesDaoImpl extends
		GenericDaoImpl<HistoQuittancesValides> implements
		IHistoQuittancesValidesDao {

	@EJB
	private IQuittancesValidesDao quittancesValidesDao;

	public SaisieTrancheArchivageDto rechercherTrancheArchivage(
			String tranchedeb, String tranchefin) throws RcEjbException {

		SaisieTrancheArchivageDto vector = new SaisieTrancheArchivageDto();

		List<QuittancesValides> list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where trancheDebut = '"
				+ tranchedeb + "' and trancheFin = '" + tranchefin + "'");
		for (QuittancesValides quittances : list) {
			vector.setTrArBornInf(quittances.getTrancheDebut());
			vector.setTrArBornSup(quittances.getTrancheFin());
			vector.setTrArTypeTranches(quittances.getTypeQuittance());
			vector.setTrArDateTranches(sysEnv.timestampToStr(quittances
					.getDateAjout()));
		}

		return vector;
	}

	public void insertTrancheArchive(SaisieTrancheArchivageDto objvo)
			throws RcEjbException, FinderException, RemoveException {
		SaisieTrancheArchivageDto vo = (SaisieTrancheArchivageDto) objvo;

		try {
			HistoQuittancesValides quittances = new HistoQuittancesValides();
			quittances.setTrancheDebut(vo.getTrArBornInf());
			quittances.setTrancheFin(vo.getTrArBornSup());
			quittances.setDateArchive(sysEnv.strToTimestamp(vo.getTrArDateTranches()));
			quittances.setTypeQuittance(vo.getTrArTypeTranches());
			quittances.setDateAjout(sysEnv.ToDayTimeStamp());
			create(quittances);

		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
		quittancesValidesDao.remove(new QuittancesValidesKey(vo
				.getTrArBornInf(), vo.getTrArBornSup()));
	}
	
	public List<HistoQuittancesValides> consulterTranchesArchivage() {
	    List<HistoQuittancesValides> list = null;
		list = (List<HistoQuittancesValides>) rechercherByWhere("from HistoQuittancesValides where 1=1 Order by dateArchive desc");
	return list;

	}

	public SaisieTranchesQuittancesDto rechercherTrancheDesarchivage(
			String tranchedeb, String tranchefin) throws RcEjbException, FinderException, RemoveException {
	
		SaisieTranchesQuittancesDto vector = new SaisieTranchesQuittancesDto();

		try {
			List<HistoQuittancesValides> list =  (List<HistoQuittancesValides>) rechercherByWhere("from HistoQuittancesValides where trancheDebut = '"
					+ tranchedeb + "' and trancheFin = '" + tranchefin + "'");
			for (HistoQuittancesValides quittances : list) {
				vector.setTrBornInf(quittances.getTrancheDebut());
				vector.setTrBornSup(quittances.getTrancheFin());
				vector.setTrTypeTranches(quittances.getTypeQuittance());
				vector.setTrDateTranches(sysEnv.timestampToStr(quittances
						.getDateAjout()));
			}
		} catch (Exception e1) {
			throw new RcEjbException();
		}
		supprimerTrancheArchive(tranchedeb, tranchefin);
		return vector;

	}

	public void supprimerTrancheArchive(String trborneinf, String trbornesup)
		 {
			Query query = entityManager.createQuery("delete from HistoQuittancesValides q where q.trancheDebut = '"
					+ trborneinf + "' and q.trancheFin = '" + trbornesup + "'");
			query.executeUpdate();
	}

}
