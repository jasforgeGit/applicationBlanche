package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeDecisionDao;
import sn.com.douane.ejb.rc.model.entities.TypeDecision;

@Stateless(name="ITypeDecisionDao")
public class TypeDecisionDaoImpl extends GenericDaoImpl<TypeDecision> implements ITypeDecisionDao{

}
