package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IJournalTresorDao;
import sn.com.douane.ejb.rc.model.entities.JournalTresor;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name = "IJournalTresorDao")
public class JournalTresorDaoImpl extends GenericDaoImpl<JournalTresor>
		implements IJournalTresorDao {

	@Override
	public List<LabelValue> getListeJournaltresor() throws RcEjbException {
		List<JournalTresor> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();
		JournalTresor journaltresorVO = null;
		try {
			vector = findAll();
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCod.rowNotFound);
		}
		for (int i = 0; i < vector.size(); i++) {
			journaltresorVO = (JournalTresor) vector.get(i);
			vector2.add(new LabelValue(ConvertUtil
					.converToString(journaltresorVO.getTrlibellejournal()),
					ConvertUtil.converToString(journaltresorVO
							.getTrCodeJournal())));
		}
		return vector2;
	}
}
