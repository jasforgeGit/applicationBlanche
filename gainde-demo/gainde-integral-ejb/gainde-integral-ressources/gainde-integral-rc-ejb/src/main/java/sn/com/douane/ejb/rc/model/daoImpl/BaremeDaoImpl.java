package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IBaremeDao;
import sn.com.douane.ejb.rc.model.entities.Bareme;

@Stateless(name = "IBaremeDao")
public class BaremeDaoImpl extends GenericDaoImpl<Bareme> implements IBaremeDao {

}
