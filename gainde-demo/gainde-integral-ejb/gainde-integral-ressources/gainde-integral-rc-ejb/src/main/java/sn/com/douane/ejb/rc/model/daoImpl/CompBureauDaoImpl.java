package sn.com.douane.ejb.rc.model.daoImpl;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.ICompBureauDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.CompBureauDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.CompBureau;


@Stateless(name="ICompBureauDao")
public class CompBureauDaoImpl extends GenericDaoImpl<CompBureau> implements ICompBureauDao {

	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ICompBureauDao#insert(sn.com.douane.ejb.rc.model.entities.CompBureau)
	 */
	@Override
	public void insert(CompBureau vo) throws TwreException {
		try {
			ctrlInsertUpdate(vo);
			create(vo);
		} catch (DuplicateKeyException e1) {
			throw new TwreException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new TwreException(ConstErrCodRC.INSERTEXP);
		}		
	}

	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ICompBureauDao#ctrlInsertUpdate(java.lang.String)
	 */
	@Override
	public void ctrlInsertUpdate(CompBureau vo) throws TwreException {
		if (vo.getRccodecompetence() == null
				|| vo.getRccodecompetence().trim().equals("")) {
			throw new TwreException(ConstErrCodRC.RCCODECOMPETENCE_OB);
		}
		if (vo.getRcdescompetences() == null
				|| vo.getRcdescompetences().trim().equals("")) {
			throw new TwreException(ConstErrCodRC.RCDESCOMPETENCES_OB);
		}
	}

	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ICompBureauDao#update(sn.com.douane.ejb.rc.model.entities.CompBureau)
	 */
	@Override
	public void update(CompBureau vo) throws RcEjbException, TwreException {
		ctrlInsertUpdate(vo); 
		merge(vo); 
		
	}

	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ICompBureauDao#delete(java.lang.String)
	 */
	@Override
	public void delete(String key) throws TwreException, RcEjbException {
		try {
			findByPrimaryKey(key);
			remove(key);
		} catch (FinderException e) {
			throw new TwreException(ConstErrCodRC.ROWNOTFOUND);
		} catch (EJBException e) {
			throw new TwreException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new TwreException(ConstErrCodRC.REMOVEEXP);
		}
		
	}
	
	public List<CompBureau> findAll() throws FinderException {
		Query query = entityManager.createQuery("from CompBureau");
		return (List<CompBureau>) query.getResultList();
	}

	/**
	 * {@inheritDoc}
	 */
	public List<CompBureau> getListCompBureau() throws FinderException {
		return findAll();
	}

	 public List<CompBureauDto> rechercheByWhereCompBureau(String where) throws RcEjbException{
			List<CompBureauDto> result = new ArrayList<CompBureauDto>(); 	
			try {
				List<CompBureau> listeCompBureau = (List<CompBureau>) rechercherByWhere(where);
				for (int i=0; i<listeCompBureau.size(); i++) {
					CompBureauDto compBureauDto = getCompBureauDto(listeCompBureau.get(i));
					result.add(compBureauDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public CompBureauDto getCompBureauDto(CompBureau compBureau) {
			CompBureauDto compBureauDto = new CompBureauDto();
			if (compBureau!=null){
				compBureauDto.setRccodecompetence(compBureau.getRccodecompetence());
				compBureauDto.setRcdescompetences(compBureau.getRcdescompetences());
				compBureauDto.setDelCell(compBureauDto.getPk());
				compBureauDto.setEditCell(compBureauDto.getPk()); 
				}
			return compBureauDto;
		}
	
}
