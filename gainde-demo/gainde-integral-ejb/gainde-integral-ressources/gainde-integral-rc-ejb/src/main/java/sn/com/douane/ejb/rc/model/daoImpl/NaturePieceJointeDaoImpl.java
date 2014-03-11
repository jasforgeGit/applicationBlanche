package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.INaturePieceJointeDao;
import sn.com.douane.ejb.rc.model.entities.NaturePieceJointe;

@Stateless(name = "INaturePieceJointeDao")
public class NaturePieceJointeDaoImpl extends GenericDaoImpl<NaturePieceJointe> implements INaturePieceJointeDao{

}
