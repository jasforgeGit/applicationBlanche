package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.ITypeVoieDao;
import sn.com.douane.ejb.rc.model.entities.TypeVoie;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;


@Stateless(name="ITypeVoieDao")
public class TypeVoieDaoImpl extends GenericDaoImpl<TypeVoie> implements ITypeVoieDao{

	@Override
	public List<LabelValue> getListTypeVoieDestinataire() throws TwreException, FinderException {
		List<TypeVoie> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		TypeVoie typevoieVO = null;
		vector = findAll();
		vector2.add(new LabelValue("", ""));
		for (int i = 0; i < vector.size(); i++) {
			typevoieVO = vector.get(i);
			vector2.add(new LabelValue(ConvertUtil
					.converToString((typevoieVO.getCodetypevoie()))
					+ " - " + typevoieVO.getLibelletypevoie(), ConvertUtil
					.converToString((typevoieVO.getCodetypevoie()))));
		}
		return vector2;
	}

}
