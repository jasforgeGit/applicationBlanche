package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ICatreGroupPieceJointeDao;
import sn.com.douane.ejb.rc.model.entities.CatreGroupPieceJointe;

@Stateless(name = "ICatreGroupPieceJointeDao")
public class CatreGroupPieceJointeDaoImpl extends
		GenericDaoImpl<CatreGroupPieceJointe> implements
		ICatreGroupPieceJointeDao {

}
