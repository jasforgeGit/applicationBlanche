package sn.com.douane.ejb.rc.model.daoImpl;

import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITaxation2Dao;
import sn.com.douane.ejb.rc.model.entities.Taxation2;

@Stateless(name = "ITaxation2Dao")
public class Taxation2DaoImpl extends GenericDaoImpl<Taxation2> implements
		ITaxation2Dao {

	private String selectProd = "select t from Taxation2 t where  t.rcCodeProd = ?1 and t.rcPrecUemoa = ?2 and t.rcPrecSenegal = ?3";
	private String whereByDateEffet = "select t from Taxation2 t where t.dateEffet = ?1";
	private String whereByrcProdAndDate = whereByDateEffet+" and t.rcCodeProd =?2 and t.rcPrecUemoa = ?3 and t.rcPrecSenegal= ?4";
	

	public boolean presenceProduit(String codeprod, String precuemoa,
			String precSenegal) throws RcEjbException {
		boolean retour = false;
		Query query = entityManager.createQuery(selectProd);
		query.setParameter(1, codeprod);
		query.setParameter(2, precuemoa);
		query.setParameter(3, precSenegal);
		@SuppressWarnings("unchecked")
		List<?> rs = query.getResultList();
		if (!rs.isEmpty()) {
			retour = true;
		}
		return retour;
	}

	public Taxation2 findTaxation2(Date dateEffet, String codeProd,
			String precUemoa, String precSen) throws RcEjbException {

		Taxation2 taxation = null;
		Query query = entityManager.createQuery(whereByrcProdAndDate);
		query.setParameter(1, dateEffet);
		query.setParameter(2, codeProd);
		query.setParameter(3, precUemoa);
		query.setParameter(4, precSen);
		@SuppressWarnings("unchecked")
		List<Taxation2> listTaxation = query.getResultList();
		if(listTaxation!=null && !listTaxation.isEmpty()){
			taxation = listTaxation.get(0);	
		}
		return taxation;
	}
	

	@SuppressWarnings("unchecked")
	public List<Taxation2> getTaxtaionStructure(Date dsql)
			throws RcEjbException {
		Query query = entityManager.createQuery(whereByDateEffet);
		query.setParameter(1, dsql);
		return query.getResultList();
	}

}