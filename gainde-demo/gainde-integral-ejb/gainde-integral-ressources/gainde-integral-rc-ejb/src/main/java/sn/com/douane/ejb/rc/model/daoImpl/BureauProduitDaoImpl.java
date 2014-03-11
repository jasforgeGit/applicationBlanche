package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IBureauProduitDao;
import sn.com.douane.ejb.rc.model.entities.BureauProduit;

@Stateless(name="IBureauProduitDao")
public class BureauProduitDaoImpl extends GenericDaoImpl<BureauProduit> implements IBureauProduitDao {

}
