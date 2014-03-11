package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IQuittancesValidesDao;
import sn.com.douane.ejb.rc.model.dto.SaisieTranchesQuittancesDto;
import sn.com.douane.ejb.rc.model.entities.QuittancesValides;
import sn.com.douane.utils.ConstErrCodTresor;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.sysEnv;

/**
 * The Class QuittancesValidesDaoImpl.
 */
@Stateless(name = "IQuittancesValidesDao")
public class QuittancesValidesDaoImpl extends GenericDaoImpl<QuittancesValides>
		implements IQuittancesValidesDao {

	public List<LabelValue> getListeTypeQuittance() throws FinderException,
			RcEjbException {

		List<LabelValue> listeTypeQuittance = new ArrayList<LabelValue>();
		List<String> listModeReglement = null;

		listModeReglement = (List<String>) rechercherByWhere(" select rcCodeModeReg from ModeReglement");
		listeTypeQuittance.add(new LabelValue("", ""));
		for (String reglement : listModeReglement) {
			listeTypeQuittance.add(new LabelValue(reglement, reglement));
		}
		return listeTypeQuittance;
	}

	public List<QuittancesValides> consulterTranchesQuittances()
			throws FinderException, RcEjbException {		
		List<QuittancesValides> list = null;
		list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where 1=1 Order by dateAjout desc");
		return list;

	}

	public int rechercherExisteBorne(String tranchedeb) throws RcEjbException {
		List<QuittancesValides> list = null;
		List vector = new ArrayList();
		int nb = 0;

		list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where trancheDebut = '"
				+ tranchedeb + "'");
		for (QuittancesValides quittances : list) {
			SaisieTranchesQuittancesDto tranchequittance = new SaisieTranchesQuittancesDto();
			tranchequittance.setTrBornInf(quittances.getTrancheDebut());
			vector.add(tranchequittance);
		}

		nb = vector.size();

		return nb;

	}

	public int rechercherExisteBorneSup(String tranchefin)
			throws RcEjbException {
		List<QuittancesValides> list = null;
		List vector = new ArrayList();
		int nb = 0;

		list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where trancheFin = '"
				+ tranchefin + "'");

		for (QuittancesValides quittances : list) {
			SaisieTranchesQuittancesDto tranchequittance = new SaisieTranchesQuittancesDto();
			tranchequittance.setTrBornInf(quittances.getTrancheFin());
			vector.add(tranchequittance);
		}
		nb = vector.size();
		return nb;
	}

	public void insertTranche(SaisieTranchesQuittancesDto objvo)
			throws RcEjbException {
		SaisieTranchesQuittancesDto vo = objvo;

		try {
			ctrlInsertUpdate(vo);
			QuittancesValides quittances = new QuittancesValides();
			quittances.setTrancheDebut(vo.getTrBornInf());
			quittances.setTrancheFin(vo.getTrBornSup());
			quittances.setTypeQuittance(vo.getTrTypeTranches());
			quittances.setDateAjout(sysEnv.strToTimestamp(vo.getTrDateTranches()));
			create(quittances);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
	}

	private void ctrlInsertUpdate(SaisieTranchesQuittancesDto vo)
			throws RcEjbException {

		if (vo.getTrDateTranches() == null){
			throw new RcEjbException(ConstErrCodTresor.TRDATETRANCHES);
		}
		if (vo.getTrTypeTranches() == null){
			throw new RcEjbException(ConstErrCodTresor.TRTYPETRANCHES);
		}
	}

	public List<QuittancesValides> getRechercherQuittance(String inf, String sup)
			throws RcEjbException {

		List rechercheTranche = new ArrayList();
		List<QuittancesValides> list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where trancheDebut = '"
				+ inf + "' and trancheFin = '" + sup + "'");
		for (QuittancesValides quittances : list) {
			SaisieTranchesQuittancesDto vector = new SaisieTranchesQuittancesDto();
			vector.setTrBornInf(quittances.getTrancheDebut());
			vector.setTrBornSup(quittances.getTrancheFin());
			vector.setTrTypeTranches(quittances.getTypeQuittance());
			vector.setTrDateTranches(sysEnv.timestampToStr(quittances.getDateAjout()));
			rechercheTranche.add(vector);
		}
		return rechercheTranche;
	}

	public boolean exist(int num) {
		boolean test = false;

		try {
			List<QuittancesValides> list = (List<QuittancesValides>) rechercherByWhere("from QuittancesValides where trancheDebut <>'SUSPEND' and trancheFin <>'SUSPEND'");
			for (QuittancesValides quittances : list) {
				if (!test) {

					int tinf = sysEnv.strToInteger(
							quittances.getTrancheDebut().trim()).intValue();

					int tsup = sysEnv.strToInteger(
							quittances.getTrancheFin().trim()).intValue();
					if (tinf <= num && tsup >= num) {
						test = true;
					}
				}
			}

		} catch (Exception e1) {
		}

		return test;

	}
}
