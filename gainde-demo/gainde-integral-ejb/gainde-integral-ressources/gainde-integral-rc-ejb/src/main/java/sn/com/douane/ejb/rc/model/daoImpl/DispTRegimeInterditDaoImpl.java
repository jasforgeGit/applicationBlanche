package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IDispTRegimeInterditDao;
import sn.com.douane.ejb.rc.model.entities.DispTRegimeInterdit;

@Stateless(name="IDispTRegimeInterditDao")
public class DispTRegimeInterditDaoImpl extends GenericDaoImpl<DispTRegimeInterdit> implements IDispTRegimeInterditDao{

}
