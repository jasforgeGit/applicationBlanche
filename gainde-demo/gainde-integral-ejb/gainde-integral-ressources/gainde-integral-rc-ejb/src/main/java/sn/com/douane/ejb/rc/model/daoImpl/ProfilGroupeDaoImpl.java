package sn.com.douane.ejb.rc.model.daoImpl;

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
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dao.IProfilDao;
import sn.com.douane.ejb.rc.model.dao.IProfilGroupeDao;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;

@Stateless(name = "IProfilGroupeDao")
public class ProfilGroupeDaoImpl extends GenericDaoImpl<ProfilGroupe> implements IProfilGroupeDao {

	@EJB
	private IGroupeFonctionDao groupeFonctionDao; 
	
	@EJB
	private IProfilDao profilDao; 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProfilGroupe> findProfilGroupeQuery(String codeProfil)	throws RcEjbException {
		Query qry = entityManager.createNamedQuery("findProfilgroupe");
		qry.setParameter(1, codeProfil);
		return (List<ProfilGroupe>) qry.getResultList();
	}

	@Override
	public List<ProfilGroupe> rechercherDetailProfilProfilGroupe(String codeProfil) throws RcEjbException {
		List<ProfilGroupe> profilGroupes = null;
		profilGroupes = findProfilGroupeQuery(codeProfil);
		return profilGroupes;
	}

	@Override
	public void insert(ProfilGroupe objVo) throws RcEjbException {
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
	public void ctrlInsertUpdate(ProfilGroupe objVo) throws RcEjbException {
		if (objVo.getRcCodeGroupe() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODEGROUPE_OB);}
		if (objVo.getRcCodeProfil() == null
				|| objVo.getRcCodeProfil().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODEPROFIL_OB);}
		try {
			if (objVo.getRcCodeGroupe() != null) {
				Integer pk = objVo.getRcCodeGroupe(); 			
				GroupeFonction groupefonctionLocal = (GroupeFonction) groupeFonctionDao.findByPrimaryKey(pk); 
				objVo.setGroupProGrp(groupefonctionLocal);
			}
			
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.GROUPEFONCTIONKEY);
		}
		try {
			if (objVo.getRcCodeProfil() != null
					&& !objVo.getRcCodeProfil().trim().equals("")) {
				String pk = objVo.getRcCodeProfil();
				
				Profil profilLocal = (Profil) profilDao.findByPrimaryKey(pk);
				objVo.setProfilProGrp(profilLocal);
			}
		}catch (FinderException e2 ){
			throw new RcEjbException(ConstErrCodRC.PROFILKEY);
		}
		
	}

	@Override
	public void update(ProfilGroupe objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 	
	}

	@Override
	public void delete(ProfilGroupeKey key) throws RcEjbException {
		try {
			remove(key);
		} catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}	
	}

}
