package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IPieceJointeDao;
import sn.com.douane.ejb.rc.model.entities.PieceJointe;

@Stateless(name ="IPieceJointeDao")
public class PieceJointeDaoImpl extends GenericDaoImpl<PieceJointe> implements IPieceJointeDao {

}
