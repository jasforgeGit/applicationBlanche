package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.CreateException;
import javax.ejb.EJB;
import javax.ejb.FinderException;
import javax.ejb.Stateless;
//import sn.com.douane.ejb.declaration.exception.DecEjbException;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IChaineDao;
import sn.com.douane.ejb.rc.model.dao.ICritereLogiqueDao;
import sn.com.douane.ejb.rc.model.entities.Chaine;
import sn.com.douane.ejb.rc.model.entities.CritereLogique;
//import sn.com.douane.utils.CritereDisplay;

@Stateless(name="IChaineDao")
public class ChaineDaoImpl extends GenericDaoImpl<Chaine> implements IChaineDao{
	
	@EJB
	private ICritereLogiqueDao critereLogiqueDao; 

	public void insert(Chaine vo) throws RcEjbException {
		try {
			Chaine chaine = findByPrimaryKey(vo.getRcCodeChaine());
			if (chaine !=null) {
				throw new RcEjbException(ConstErrCod.dupkeyinsert);
			}
			ctrlInsertUpdate(vo);
			create(vo);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCod.insertExp);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
	}
	
	private void ctrlInsertUpdate(Chaine vo) throws RcEjbException {
		if (vo.getRcCodeChaine() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODECHAINE_OB);
		}
		if (vo.getRcCodeCritereLogique() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODECRITERELOGIQUE_OB);
		}
		if (vo.getRcLibelleChaine() == null
				|| vo.getRcLibelleChaine().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBELLECHAINE_OB);
		}
		try {
			if (vo.getRcCodeCritereLogique() != null
					&& !vo.getRcCodeCritereLogique().toString().equals("")) {

				CritereLogique criterLogique = critereLogiqueDao.findByPrimaryKey(vo
						.getRcCodeCritereLogique());
				if (criterLogique == null) {
					throw new RcEjbException(ConstErrCodRC.critereslogiquesKey); 
				}
			}
		} catch (RcEjbException e2) {
			throw new RcEjbException(ConstErrCodRC.critereslogiquesKey);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.critereslogiquesKey); 
		}
	}
}
