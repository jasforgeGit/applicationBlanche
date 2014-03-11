package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IScoreTypeNatCargDao;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeNatCarg;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="IScoreTypeNatCargDao")
public class ScoreTypeNatCargDaoImpl extends GenericDaoImpl<ScoreTypeNatCarg> implements IScoreTypeNatCargDao {

	@Override
	public List<LabelValue> getListNatureCargaison() throws TwreException {
		List<ScoreTypeNatCarg> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		try {
			ScoreTypeNatCarg scoretypenatcargVO = null;
			vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				scoretypenatcargVO =  vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString((scoretypenatcargVO
								.getRccodetypenatcarg()))
						+ " - " + scoretypenatcargVO.getRclibelletypenatcarg(),
						ConvertUtil.converToString((scoretypenatcargVO
								.getRccodetypenatcarg()))));
			}
		} catch (FinderException e) {
			throw new TwreException(e.getMessage());
		}
		return vector2;
	}

	

}
