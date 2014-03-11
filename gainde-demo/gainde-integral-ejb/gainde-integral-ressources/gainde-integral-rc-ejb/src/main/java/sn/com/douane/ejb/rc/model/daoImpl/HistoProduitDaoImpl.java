package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IHistoProduitDao;
import sn.com.douane.ejb.rc.model.entities.HistoProduit;

@Stateless(name="IHistoProduitDao")
public class HistoProduitDaoImpl extends GenericDaoImpl<HistoProduit> implements IHistoProduitDao{

}
