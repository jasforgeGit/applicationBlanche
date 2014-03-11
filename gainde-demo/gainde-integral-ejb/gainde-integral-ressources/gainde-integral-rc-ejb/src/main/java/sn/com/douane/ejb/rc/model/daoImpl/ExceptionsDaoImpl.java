package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IExceptionsDao;
import sn.com.douane.ejb.rc.model.entities.Exceptions;

@Stateless(name="IExceptionsDao")
public class ExceptionsDaoImpl extends GenericDaoImpl<Exceptions> implements IExceptionsDao{

}
