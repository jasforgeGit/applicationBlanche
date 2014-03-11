package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeEntreeMadDao;
import sn.com.douane.ejb.rc.model.entities.TypeEntreeMad;

@Stateless(name="ITypeEntreeMadDao")
public class TypeEntreeMadDaoImpl extends GenericDaoImpl<TypeEntreeMad> implements ITypeEntreeMadDao{

}
