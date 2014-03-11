package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IPositionProduitDao;
import sn.com.douane.ejb.rc.model.entities.PositionProduit;

@Stateless(name="IPositionProduitDao")
public class PositionProduitDaoImpl extends GenericDaoImpl<PositionProduit> implements IPositionProduitDao{

}
