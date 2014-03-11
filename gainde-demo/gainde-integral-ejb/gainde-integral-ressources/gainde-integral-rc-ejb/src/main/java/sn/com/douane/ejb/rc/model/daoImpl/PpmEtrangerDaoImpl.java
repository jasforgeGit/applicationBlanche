package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IPpmEtrangerDao;
import sn.com.douane.ejb.rc.model.entities.PpmEtranger;

@Stateless(name="IPpmEtrangerDao")
public class PpmEtrangerDaoImpl extends GenericDaoImpl<PpmEtranger> implements IPpmEtrangerDao {

	/**
	 * permet de verifier l'existance de l'element passé en paramètre
	 * 
	 * @param key
	 * @return
	 * @throws TwreException
	 */
	public void checkExistance(String codePpmetranger) throws TwreException {
		PpmEtranger ppmEtranger = null;
		try {
			ppmEtranger = findByPrimaryKey(codePpmetranger);
			if(ppmEtranger == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}
		} catch (FinderException e) {
			throw new TwreException(ConstErrCod.foreignKeyPpmEtranger);
		} 
	}

	

}
