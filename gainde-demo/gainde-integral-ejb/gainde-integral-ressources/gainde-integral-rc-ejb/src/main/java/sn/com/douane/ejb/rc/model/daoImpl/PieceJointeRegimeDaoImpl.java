package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IPieceJointeRegimeDao;
import sn.com.douane.ejb.rc.model.entities.PieceJointeRegime;
import sn.com.douane.utils.sysEnv;

@Stateless(name = "IPieceJointeRegimeDao")
public class PieceJointeRegimeDaoImpl extends GenericDaoImpl<PieceJointeRegime>
		implements IPieceJointeRegimeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<PieceJointeRegime> rechercherByRepertoire(String typregime,
			String codregdouan, String decRegFiscal) throws TwreException{
		
		Query query1 = entityManager.createNamedQuery("findByrepertoire");
		query1.setParameter(1, typregime);
		query1.setParameter(2, codregdouan);
		query1.setParameter(3, decRegFiscal);
		query1.setParameter(4, sysEnv.ToDay());
		
		return (List<PieceJointeRegime>) query1.getResultList();

		
	}

}
