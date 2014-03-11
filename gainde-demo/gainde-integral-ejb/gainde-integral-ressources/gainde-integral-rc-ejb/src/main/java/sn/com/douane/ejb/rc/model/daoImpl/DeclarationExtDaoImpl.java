package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.rc.model.dao.IDeclarationExtDao;

@Stateless(name = "IDeclarationExtDao")
public class DeclarationExtDaoImpl extends GenericDaoImpl<DeclarationExt> implements IDeclarationExtDao{

}
