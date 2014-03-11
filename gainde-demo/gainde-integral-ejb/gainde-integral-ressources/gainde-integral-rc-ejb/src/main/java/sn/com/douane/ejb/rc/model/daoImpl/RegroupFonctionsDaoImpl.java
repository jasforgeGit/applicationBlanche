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
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dao.IRegroupFonctionsDao;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.ConvertUtil;

@Stateless(name="IRegroupFonctionsDao")
public class RegroupFonctionsDaoImpl extends GenericDaoImpl<RegroupFonctions> implements IRegroupFonctionsDao{

	@EJB
	private IFonctionnalitesDao fonctionnaliteDao; 
	
	@EJB
	private IGroupeFonctionDao groupeFonctionDao; 
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RegroupFonctions> findByCodegroupeQuery(Integer codeGroupe)
			throws RcEjbException {
		
		 Query qry = entityManager.createNamedQuery("findByCodegroupe");
	     qry.setParameter(1, codeGroupe);	       
	     return (List<RegroupFonctions>) qry.getResultList();
	}
	
	@Override
	public List<RegroupFonctions> rechercherByGroupefonction(Integer rccodegroupe)
			throws RcEjbException {
		List<RegroupFonctions> regroupFonctions = null;		
		regroupFonctions = findByCodegroupeQuery(rccodegroupe);
		return regroupFonctions;			
	}

	@Override
	public void insert(RegroupFonctions objVo) throws RcEjbException {
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
	public void ctrlInsertUpdate(RegroupFonctions objVo) throws RcEjbException {
		if (objVo.getRcCodeFonction() == null
				|| objVo.getRcCodeFonction().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODEFONCTION_OB);}
		if (objVo.getRcCodeGroupe() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODEGROUPE_OB);}
		if (objVo.getRcOrdreAffichage() == null){
			throw new RcEjbException(ConstErrCodRC.RCORDREAFFICHAGE_OB);}
		try {
			if (objVo.getRcCodeFonction() != null
					&& !objVo.getRcCodeFonction().trim().equals("")) {
				Fonctionnalite fonctionnalitesLocal = (Fonctionnalite) fonctionnaliteDao
						.findByPrimaryKey(objVo.getRcCodeFonction());
				objVo.setFoncRegpFonc(fonctionnalitesLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.FONCTIONNALITESKEY);
		}
		try {
			if (objVo.getRcCodeGroupe() != null
					&& !objVo.getRcCodeGroupe().toString().equals("")) {
			
				GroupeFonction groupefonctionLocal = (GroupeFonction) groupeFonctionDao
						.findByPrimaryKey(objVo.getRcCodeGroupe());
				objVo.setGrpGrpFonct(groupefonctionLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.GROUPEFONCTIONKEY);
		}
		
	}

	@Override
	public void update(RegroupFonctions objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 
	}

	@Override
	public void delete(RegroupFonctionsKey key) throws RcEjbException {
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
	
	public String getRegroupFoncString() throws RcEjbException, FinderException {
		RegroupFonctions regroupfonctionsVO = null;
		List<RegroupFonctions> listRegroupFonc = findAll(); 
		String codegroupe;
		String codefonc;
		String temp = "";

		for (int i = 0; i < listRegroupFonc.size(); i++) {
			regroupfonctionsVO = (RegroupFonctions) listRegroupFonc.get(i);
			codefonc = regroupfonctionsVO.getRcCodeFonction();
			codegroupe = ConvertUtil.converToString(regroupfonctionsVO.getRcCodeGroupe());
			temp += (i == 0) ? (codegroupe + ConstManif.TIELD + codefonc)
					: (ConstManif.DIEZ + codegroupe + ConstManif.TIELD + codefonc);
		}
		return temp;

	}
}
