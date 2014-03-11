package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IOperateurDao;
import sn.com.douane.ejb.rc.model.entities.Operateur;

@Stateless(name="IOperateurDao")
public class OperateurDaoImpl extends GenericDaoImpl<Operateur> implements IOperateurDao{

}
