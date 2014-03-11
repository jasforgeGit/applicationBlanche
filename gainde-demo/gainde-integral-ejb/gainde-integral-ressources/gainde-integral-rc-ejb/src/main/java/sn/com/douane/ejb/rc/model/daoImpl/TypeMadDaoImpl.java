package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeMadDao;
import sn.com.douane.ejb.rc.model.entities.TypeMad;

@Stateless(name="ITypeMadDao")
public class TypeMadDaoImpl extends GenericDaoImpl<TypeMad> implements ITypeMadDao{

}
