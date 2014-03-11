package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IRcsiteDao;
import sn.com.douane.ejb.rc.model.entities.Rcsite;

@Stateless(name = "IRcsiteDao")
public class RcsiteDaoImpl extends GenericDaoImpl<Rcsite> implements IRcsiteDao {


}
