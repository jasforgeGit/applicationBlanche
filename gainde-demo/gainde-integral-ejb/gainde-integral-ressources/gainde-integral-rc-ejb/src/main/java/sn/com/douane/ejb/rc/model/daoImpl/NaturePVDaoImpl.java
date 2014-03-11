package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.INaturePVDao;
import sn.com.douane.ejb.rc.model.entities.NaturePV;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="INaturePVDao")
public class NaturePVDaoImpl extends GenericDaoImpl<NaturePV> implements INaturePVDao{

	public List<LabelValue> getListNaturePv() throws RcEjbException {
		List<NaturePV> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		try {
			NaturePV naturepvVO = null;
			vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				naturepvVO = (NaturePV) vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(naturepvVO.getRcCodeNaturePV())
						+ " - " + naturepvVO.getLibNaturePV(),
						ConvertUtil.converToString(naturepvVO
								.getRcCodeNaturePV())));
			}
		} catch (Exception e) {

			throw new RcEjbException(e.getMessage());
		}
		return vector2;
	}
}
