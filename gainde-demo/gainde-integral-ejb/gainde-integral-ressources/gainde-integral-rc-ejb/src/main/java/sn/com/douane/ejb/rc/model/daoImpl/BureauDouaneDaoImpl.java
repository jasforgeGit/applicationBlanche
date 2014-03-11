package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IBureauDouaneDao;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.ConvertUtil;

@Stateless(name = "IBureauDouaneDao")
public class BureauDouaneDaoImpl extends GenericDaoImpl<BureauDouane> implements
		IBureauDouaneDao {

	
	public String getBureauDouaneString() throws RcEjbException {
		BureauDouane bureaudouaneVO = null;
		List<BureauDouane> listTypeBurdouane;
		try {
			listTypeBurdouane = findAll();
		} catch (FinderException e) {
			throw new RcEjbException(e);
		}
		String codebur;
		String libelleBur;
		String temp = "";

		for (int i = 0; i < listTypeBurdouane.size(); i++) {
			bureaudouaneVO = listTypeBurdouane.get(i);
			codebur = ConvertUtil.converToString(bureaudouaneVO
					.getRccodeburdouane());
			libelleBur = bureaudouaneVO.getRclibelleburdouane();
			temp += (i == 0) ? (codebur + ConstManif.TIELD + libelleBur)
					: (ConstManif.DIEZ + codebur + ConstManif.TIELD + libelleBur);
		}
		return temp;

	}

	public List<BureauDouane> getListBureauDouane() throws FinderException {

		List<BureauDouane> listBureauDouane = new ArrayList<BureauDouane>();
		listBureauDouane.add(new BureauDouane("", ""));
		listBureauDouane.addAll(1, findAll());

		return listBureauDouane;
	}
}
