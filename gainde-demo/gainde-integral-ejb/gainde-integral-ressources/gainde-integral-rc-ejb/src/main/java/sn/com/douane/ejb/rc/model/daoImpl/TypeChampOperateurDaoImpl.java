package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeChampOperateurDao;
import sn.com.douane.ejb.rc.model.entities.TypeChampOperateur;

@Stateless(name="ITypeChampOperateurDao")
public class TypeChampOperateurDaoImpl extends GenericDaoImpl<TypeChampOperateur> implements ITypeChampOperateurDao{

}
