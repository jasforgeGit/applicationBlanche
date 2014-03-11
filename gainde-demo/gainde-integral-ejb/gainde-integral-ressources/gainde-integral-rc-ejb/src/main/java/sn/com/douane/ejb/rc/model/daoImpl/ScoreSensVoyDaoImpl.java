package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IScoreSensVoyDao;
import sn.com.douane.ejb.rc.model.entities.ScoreSensVoy;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="IScoreSensVoyDao")
public class ScoreSensVoyDaoImpl extends GenericDaoImpl<ScoreSensVoy> implements IScoreSensVoyDao {

	@Override
	public List<LabelValue> getListTypeSensVoyage() throws TwreException{
		
		List<ScoreSensVoy> vector2 = null;
		List<LabelValue> vector = new ArrayList<LabelValue>();

		try {
			ScoreSensVoy scoresensvoyVO = null;
			vector2 = findAll(); 
			vector.add(new LabelValue("", ""));
			for (int i = 0; i < vector2.size(); i++) {
				scoresensvoyVO = vector2.get(i);
				vector.add(new LabelValue(ConvertUtil.converToString(scoresensvoyVO.getRccodetypesensvoy())	+ " - " + scoresensvoyVO.getRclibelletypesensvoy(),	ConvertUtil.converToString(scoresensvoyVO.getRccodetypesensvoy())));
			}
		} catch (FinderException e) {
			throw new TwreException(e.getMessage());
		}
		return vector;
	}

	
}
