package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ISoumissionProduitDao;
import sn.com.douane.ejb.rc.model.entities.SoumissionProduit;

@Stateless(name="ISoumissionProduitDao")
public class SoumissionProduitDaoImpl extends GenericDaoImpl<SoumissionProduit> implements ISoumissionProduitDao{

}
