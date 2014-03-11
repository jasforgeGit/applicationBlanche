package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IOrigineCritereDao;
import sn.com.douane.ejb.rc.model.entities.OrigineCritere;

@Stateless(name="IOrigineCritereDao")
public class OrigineCritereDaoImpl extends GenericDaoImpl<OrigineCritere> implements IOrigineCritereDao{

}
