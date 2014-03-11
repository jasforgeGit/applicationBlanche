package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IScoreTonnageDebarqueDao;
import sn.com.douane.ejb.rc.model.entities.ScoreTonnageDebarque;

@Stateless(name="IScoreTonnageDebarqueDao")
public class ScoreTonnageDebarqueDaoImpl extends GenericDaoImpl<ScoreTonnageDebarque> implements IScoreTonnageDebarqueDao {

}