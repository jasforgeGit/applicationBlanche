package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IScoreTypeDestFiscalDao;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeDestFiscal;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="IScoreTypeDestFiscalDao")
public class ScoreTypeDestFiscalDaoImpl extends GenericDaoImpl<ScoreTypeDestFiscal> implements IScoreTypeDestFiscalDao {

	@Override
	public List<LabelValue> getListDestFiscale() throws TwreException {
		List<ScoreTypeDestFiscal> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();
		try {
			ScoreTypeDestFiscal scoretypedestfiscalVO = null;
			vector = findAll();
			for (int i = 0; i < vector.size(); i++) {
				scoretypedestfiscalVO = vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(scoretypedestfiscalVO
								.getCodetypedestfiscal())
						+ " - "
						+ scoretypedestfiscalVO.getRclibelletypedestfiscal(),
						ConvertUtil.converToString(scoretypedestfiscalVO
								.getCodetypedestfiscal())));
			}
		} catch (FinderException e) {
			throw new TwreException(e.getMessage());
		}
		return vector2;
	}

}
