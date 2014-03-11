package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegEcoProdFiniDao;
import sn.com.douane.ejb.rc.model.entities.RegEcoProdFini;

@Stateless(name="IRegEcoProdFiniDao")
public class RegEcoProdFiniDaoImpl extends GenericDaoImpl<RegEcoProdFini> implements IRegEcoProdFiniDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<RegEcoProdFini> findByRegimeDlppQuery(String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa, String rcPrecSen) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findByRegimeDlpp");
	        qry.setParameter(1, rcCodePpm);
	        qry.setParameter(2, rcAnneeRegEco);
	        qry.setParameter(3, rcNumRegEco);
	        qry.setParameter(4, rcCodeProd);
	        qry.setParameter(5, rcPrecUemoa);
	        qry.setParameter(6, rcPrecSen);
	        return (List<RegEcoProdFini>) qry.getResultList();
	}

}
