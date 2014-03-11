package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.rc.model.dao.ICompteDao;

@Stateless(name = "ICompteDao")
public class CompteDaoImpl extends GenericDaoImpl<Compte> implements ICompteDao{

}
