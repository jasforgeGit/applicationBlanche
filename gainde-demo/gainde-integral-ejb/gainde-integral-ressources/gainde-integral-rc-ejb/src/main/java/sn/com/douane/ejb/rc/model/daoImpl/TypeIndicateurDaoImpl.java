package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITypeIndicateurDao;
import sn.com.douane.ejb.rc.model.entities.TypeIndicateur;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="ITypeIndicateurDao")
public class TypeIndicateurDaoImpl extends GenericDaoImpl<TypeIndicateur> implements ITypeIndicateurDao {

	public List<LabelValue> getListTypeIndicateur() throws RcEjbException {
		List<TypeIndicateur> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		try {
			TypeIndicateur typeindicateurVO = null;
			vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				typeindicateurVO = vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(typeindicateurVO.getRcCodeTypeIndicateur())
						+ " - " + typeindicateurVO.getRclibtypeindicateur(),
						ConvertUtil.converToString(typeindicateurVO
								.getRcCodeTypeIndicateur())));
			}
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
		return vector2;
	}
	
}
