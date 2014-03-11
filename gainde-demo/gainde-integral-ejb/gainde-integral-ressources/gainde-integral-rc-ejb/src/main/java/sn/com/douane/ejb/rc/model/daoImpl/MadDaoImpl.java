package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IMadDao;
import sn.com.douane.ejb.rc.model.entities.Mad;

@Stateless(name="IMadDao")
public class MadDaoImpl extends GenericDaoImpl<Mad> implements IMadDao{

}
