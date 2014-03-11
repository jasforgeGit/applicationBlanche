package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ISectionProduitDao;
import sn.com.douane.ejb.rc.model.entities.SectionProduit;

@Stateless(name="ISectionProduitDao")
public class SectionProduitDaoImpl extends GenericDaoImpl<SectionProduit> implements ISectionProduitDao {

}
