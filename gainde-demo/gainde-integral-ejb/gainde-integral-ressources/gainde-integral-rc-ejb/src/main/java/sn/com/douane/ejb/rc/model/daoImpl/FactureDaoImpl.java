package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.demat.model.entities.Facture;
import sn.com.douane.ejb.rc.model.dao.IFactureDao;

@Stateless(name = "IFactureDao")
public class FactureDaoImpl extends GenericDaoImpl<Facture> implements IFactureDao{

}
