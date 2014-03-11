package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeImputCreditDao;
import sn.com.douane.ejb.rc.model.entities.TypeImputCredit;

@Stateless(name="ITypeImputCreditDao")
public class TypeImputDaoImpl extends GenericDaoImpl<TypeImputCredit> implements ITypeImputCreditDao{

}
