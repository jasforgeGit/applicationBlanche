package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IScoreConsignataireDao;
import sn.com.douane.ejb.rc.model.entities.ScoreConsignataire;

@Stateless(name="IScoreConsignataireDao")
public class ScoreConsignataireDaoImpl extends GenericDaoImpl<ScoreConsignataire> implements IScoreConsignataireDao{

}
