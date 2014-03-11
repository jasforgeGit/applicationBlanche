package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAutoCreditaireDao;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.AutoCreditaire;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.utils.ConstErrCodTresor;
import sn.com.douane.utils.sysEnv;

@Stateless(name="IAutoCreditaireDao")
public class AutoCreditaireDaoImpl extends GenericDaoImpl<AutoCreditaire> implements IAutoCreditaireDao {
	
	@EJB
	private IPpmDao ppmDao; 
	
	@Override
	public List<AutoCreditaire> findbyPpmautorisantQuery(String ppmAutorisant) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findbyPpmautorisant");
	        qry.setParameter(1, ppmAutorisant);
	        return (List<AutoCreditaire>) qry.getResultList();
	}
	
	public List<AutoCreditaire> getWhereAutorisation(String ppmdestinataire, String ppmdeclarant) {    	
	    Query query = entityManager.createQuery(" from AutoCreditaire where ppmAutorisant= ?1 " +
	    		"and ppmAutorise= ?2 and dateAutorisation<= ?3")	;
		query.setParameter(1, ppmdestinataire); 
		query.setParameter(2, ppmdeclarant);
		query.setParameter(3, sysEnv.ToDay());
		
		return query.getResultList(); 
//	    return " from AutoCreditaire where ppmAutorisant='" + ppmdestinataire
//	    	+ "' and ppmAutorise='" + ppmdeclarant
//	    	+ "' and dateAutorisation<='" + sysEnv.ToDay()
//	    	+ "'";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AutoCreditaire> getVectAutorisation(String condition) throws RcEjbException {
		List<AutoCreditaire> listAuto = null;
		List<AutoCreditaire> listAuto1 = new ArrayList<AutoCreditaire>();
		List<Ppm> vectppm = null;
		Ppm ppmVO = null;
		AutoCreditaire autocreditairesVO = null;
		listAuto = (List<AutoCreditaire>) rechercherByWhere("from AutoCreditaire where 1=1 "
				+ condition);
		for (int i = 0; i < listAuto.size(); i++) {
			autocreditairesVO = (AutoCreditaire) listAuto.get(i);
			vectppm = (List<Ppm>) ppmDao.rechercherByWhere("from Ppm where 1=1 "
					+ ppmDao.getPkPpm(autocreditairesVO.getPpmAutorise()));
			ppmVO = (Ppm) vectppm.get(0);
			String nomppm = ppmVO.getRcnomppm();
			String prenomppm = ppmVO.getRcprenomppm();

			if (ppmVO.getRcnomppm() == null || ppmVO.getRcnomppm().equals("")){
				nomppm = "";
			}
			if (ppmVO.getRcprenomppm() == null || ppmVO.getRcprenomppm().equals("")){
				prenomppm = "";
			}
			autocreditairesVO.setCodeAgree(ppmVO.getRccodecreditaire());
			autocreditairesVO.setNomAgree(prenomppm + " " + nomppm);
			listAuto1.add(autocreditairesVO);
		}
		return listAuto1;
	}

	@Override
	public String getWherePpmAutorisant(String codePpm) {
		return " and ppmAutorisant='"+codePpm+"'"; 
	}

	@Override
	public void insert(AutoCreditaire vo) throws RcEjbException {
		try {
			ctrlInsertUpdate(vo);
			create(vo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCod.dupkeyinsert);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCod.insertExp);
		}
	}
	
	private void ctrlInsertUpdate(AutoCreditaire vo) throws RcEjbException {
		Ppm ppm = null; 
		try {
			if (vo.getPpmAutorise() != null
					&& !vo.getPpmAutorise().trim().equals("")) {

				ppm = ppmDao.findByPrimaryKey(vo.getPpmAutorise());
				if (ppm == null)  {
					throw new RcEjbException(ConstErrCodTresor.ppmautoriseKey);
				}
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodTresor.ppmautoriseKey);
		}
		try {
			if (vo.getPpmAutorisant() != null
					&& !vo.getPpmAutorisant().trim().equals("")) {

				ppm = ppmDao.findByPrimaryKey(vo.getPpmAutorisant());
				if (ppm == null)  {
					throw new RcEjbException(ConstErrCodTresor.ppmautorisantKey);
				}
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodTresor.ppmautorisantKey);
		}
	}
	
	@Override
	public List<AutoCreditaire> rechercherByPpmautorisant(String ppmautorisant) throws RcEjbException {
		List<AutoCreditaire> vectlistAuto1 = new ArrayList<AutoCreditaire>();
		List<Ppm> vectppm = null;
		Ppm ppmVO = null;
		
		try {
			List<AutoCreditaire> col= findbyPpmautorisantQuery(ppmautorisant);
			Iterator<AutoCreditaire> it=col.iterator();
			AutoCreditaire autocreditairesVO = null;
			while (it.hasNext()) {
				autocreditairesVO = (AutoCreditaire) it.next();
					vectppm = (List<Ppm>) ppmDao.rechercherByWhere("from Ppm where 1=1 "
				+ppmDao.getPkPpm(autocreditairesVO.getPpmAutorise()));
					ppmVO =(Ppm)vectppm.get(0);
					String nomppm = ppmVO.getRcnomppm();
					String prenomppm = ppmVO.getRcprenomppm();
					
					if (ppmVO.getRcnomppm() == null
							|| ppmVO.getRcnomppm().equals("")){
						nomppm = "";
					}
					if (ppmVO.getRcprenomppm() == null
							|| ppmVO.getRcprenomppm().equals("")){
						prenomppm = "";
					}
					autocreditairesVO.setCodeAgree(ppmVO.getRccodecreditaire());
					autocreditairesVO.setNomAgree(prenomppm +" "+nomppm);
					vectlistAuto1.add(autocreditairesVO);
			}
			return vectlistAuto1;
		 }catch (Exception e) {
			throw new RcEjbException(ConstErrCodRC.DetailNotFound);
		}
	}
	
}
