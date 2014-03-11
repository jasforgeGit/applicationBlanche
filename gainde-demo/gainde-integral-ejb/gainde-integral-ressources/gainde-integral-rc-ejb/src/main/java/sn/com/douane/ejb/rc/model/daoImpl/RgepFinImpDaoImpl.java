package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRgepFinImpDao;
import sn.com.douane.ejb.rc.model.entities.RgepFinImp;

@Stateless(name="IRgepFinImpDao")
public class RgepFinImpDaoImpl extends GenericDaoImpl<RgepFinImp> implements IRgepFinImpDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<RgepFinImp> findControlProduitFiniQuery(String rcCodePpm,
			String rcAnneeRegEco, String rcNumRegEco, String rcCodeProd,
			String rcPrecUemoa, String rcPrecSen, Integer rcNumeroGamme)
			throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findControlProduitFini");
	        qry.setParameter(1, rcCodePpm);
	        qry.setParameter(2, rcAnneeRegEco);
	        qry.setParameter(3, rcNumRegEco);
	        qry.setParameter(4, rcCodeProd);
	        qry.setParameter(5, rcPrecUemoa);
	        qry.setParameter(6, rcPrecSen);
	        qry.setParameter(7, rcNumeroGamme);
	        return (List<RgepFinImp>) qry.getResultList();
	}

	
}
