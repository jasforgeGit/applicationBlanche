package sn.com.douane.ejb.rc.model.daoImpl;

import sn.com.douane.ejb.rc.model.dao.IScoreBureauDao;
import sn.com.douane.ejb.rc.model.entities.ScoreBureau;
import javax.ejb.Stateless;

@Stateless(name = "IScoreBureauDao")
public class ScoreBureauDaoImpl extends GenericDaoImpl<ScoreBureau> implements
		IScoreBureauDao {

}
