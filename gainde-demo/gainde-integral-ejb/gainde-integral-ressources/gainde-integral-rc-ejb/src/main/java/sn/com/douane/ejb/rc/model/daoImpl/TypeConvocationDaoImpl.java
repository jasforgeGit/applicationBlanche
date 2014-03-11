package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeConvocationDao;
import sn.com.douane.ejb.rc.model.entities.TypeConvocation;

@Stateless(name="ITypeConvocationDao")
public class TypeConvocationDaoImpl extends GenericDaoImpl<TypeConvocation> implements ITypeConvocationDao{

}
