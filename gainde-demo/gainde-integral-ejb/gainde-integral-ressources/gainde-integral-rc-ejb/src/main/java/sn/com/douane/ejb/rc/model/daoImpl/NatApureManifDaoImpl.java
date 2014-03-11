package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.INatApureManifDao;
import sn.com.douane.ejb.rc.model.entities.NatApureManif;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="INatApureManifDao")
public class NatApureManifDaoImpl extends GenericDaoImpl<NatApureManif> implements INatApureManifDao{

	
	public List<LabelValue> getListNatApureManif() throws RcEjbException {
		List<NatApureManif> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		try {
			NatApureManif natapuremanifVO = null;
			vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				natapuremanifVO = (NatApureManif) vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(natapuremanifVO.getRcCodeNatureManif())
						+ " - " + natapuremanifVO.getRcNatureApureManif(),
						ConvertUtil.converToString(natapuremanifVO
								.getRcCodeNatureManif())));
			}
		} catch (Exception e) {
			throw new RcEjbException(e.getMessage());
		}
		return vector2;
	}
}
