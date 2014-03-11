package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICreditaireDao;
import sn.com.douane.ejb.rc.model.dao.ITypeCreditDao;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.TypeCredit;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name="ITypeCreditDao")
public class TypeCreditDaoImpl extends GenericDaoImpl<TypeCredit> implements ITypeCreditDao {

	@EJB
	private ICreditaireDao creditaireDao; 
	
	@Override
	public void insert(TypeCredit objVo) throws RcEjbException {
		try {
			ctrlInsertUpdate(objVo);
			create(objVo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
	}

	@Override
	public void update(TypeCredit objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 		
	}

	@Override
	public void ctrlInsertUpdate(TypeCredit objVo) throws RcEjbException {
		if (objVo.getRcCodeTypeCredit() == null
				|| objVo.getRcCodeTypeCredit().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODETYPECREDIT_OB);}
		if (objVo.getRcLibelleTypeCredit() == null
				|| objVo.getRcLibelleTypeCredit().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBELLETYPECREDIT_OB);}
		
	}

	@Override
	public void delete(String key) throws RcEjbException {
		try {
			remove(key);
		}  catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
		
	}

	@Override
	public List<Creditaire> rechercherDetailTypecreditCreditaires(String key)
			throws RcEjbException {
		try {
			Query qry = entityManager.createQuery("from TypeCredit where rcCodeTypeCredit ="+key); 
			
			@SuppressWarnings("unchecked")
			List<TypeCredit> list = qry.getResultList();
			List<Creditaire> creditaires = new ArrayList<Creditaire>(); 
			for (int i=0; i<list.size(); i++){
				Creditaire credit = creditaireDao.findByPrimaryKey(list.get(i).getRcCodeTypeCredit()); 
				creditaires.add(credit); 
			}
			
			return creditaires;  

		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public List<LabelValue> getListeTypeCredit() throws RcEjbException {
		List<LabelValue> vector2 = new ArrayList<LabelValue>(); 
		try {
			TypeCredit typecreditVO = null;
			List<TypeCredit> vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				typecreditVO = (TypeCredit) vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(typecreditVO.getRcCodeTypeCredit())
						+ " - " + typecreditVO.getRcLibelleTypeCredit(),
						ConvertUtil.converToString(typecreditVO
								.getRcCodeTypeCredit())));
			}
		} catch (FinderException e) {
			throw new RcEjbException(e.getMessage());
		}
		return vector2;
	}

}
