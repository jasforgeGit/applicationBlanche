package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IRegeCoprodFiniBurDao;
import sn.com.douane.ejb.rc.model.entities.RegeCoprodFiniBur;

@Stateless(name = "IRegeCoprodFiniBurDao")
public class RegeCoprodFiniBurDaoImpl extends GenericDaoImpl<RegeCoprodFiniBur>
		implements IRegeCoprodFiniBurDao {

}
