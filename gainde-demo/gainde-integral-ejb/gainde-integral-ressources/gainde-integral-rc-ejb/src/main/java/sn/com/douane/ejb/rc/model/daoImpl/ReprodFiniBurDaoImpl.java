package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IReprodFiniBurDao;
import sn.com.douane.ejb.rc.model.entities.ReprodFiniBur;

@Stateless(name = "IReprodFiniBurDao")
public class ReprodFiniBurDaoImpl extends GenericDaoImpl<ReprodFiniBur>
		implements IReprodFiniBurDao {

}
