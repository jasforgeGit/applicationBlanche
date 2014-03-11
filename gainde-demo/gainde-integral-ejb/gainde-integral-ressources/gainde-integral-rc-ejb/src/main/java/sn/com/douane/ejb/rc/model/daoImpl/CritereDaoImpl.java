package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ICritereDao;
import sn.com.douane.ejb.rc.model.entities.Critere;

@Stateless(name="ICritereDao")
public class CritereDaoImpl extends GenericDaoImpl<Critere> implements ICritereDao{

}
