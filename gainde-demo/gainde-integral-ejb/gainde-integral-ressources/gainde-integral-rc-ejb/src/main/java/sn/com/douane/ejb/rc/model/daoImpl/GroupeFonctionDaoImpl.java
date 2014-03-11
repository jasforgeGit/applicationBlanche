package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
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
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dto.GroupefonctionDto;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.ListeGroupe;

@Stateless(name="IGroupeFonctionDao")
public class GroupeFonctionDaoImpl extends GenericDaoImpl<GroupeFonction> implements IGroupeFonctionDao {

	@Override
	public GroupeFonction rechercherByCodeFonctionInOrder(Integer codegroupe) throws RcEjbException {			
		return findCodegroupeOrderQuery(codegroupe);		
	}

	@Override
	public GroupeFonction findCodegroupeOrderQuery(Integer codeGroup) throws RcEjbException {		
		Query qry = entityManager.createNamedQuery("findCodegroupeOrder");
        qry.setParameter(1, codeGroup);
        return (GroupeFonction) qry.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GroupeFonction> findByCodegrpePereQuery(Integer rccodegrppere)
			throws RcEjbException {
		
		 Query qry = entityManager.createNamedQuery("findByCodegrpePere");
	     qry.setParameter(1, rccodegrppere);	       
	     return (List<GroupeFonction>) qry.getResultList();
	}
	
	@Override
	public List<GroupeFonction> rechercherByCodeGroupePereInOrder(Integer codegrppere)
			throws RcEjbException {
		return findByCodegrpePereQuery(codegrppere);
			
	}

	@Override
	public void insert(GroupeFonction objVo) throws RcEjbException {
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
	public void ctrlInsertUpdate(GroupeFonction vo) throws RcEjbException {
		if (vo.getRcCodeGroupe() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODEGROUPE_OB);}
		if (vo.getRcLibGroupe() == null
				|| vo.getRcLibGroupe().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBGROUPE_OB);}
		if (vo.getRcOrdreAffichage() == null
				|| (vo.getRcOrdreAffichage().toString().compareTo("") == 0)){
			throw new RcEjbException(ConstErrCodRC.RCORDREAFFICHAGE_OB);}
		try {
			if (vo.getRcCodeGrpPere() != null
					&& (vo.getRcCodeGrpPere().toString().compareTo("") != 0)){
				vo.setGrpFoncGpFonct(findByPrimaryKey(vo.getRcCodeGroupe()));
			}
		}catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.GROUPEFONCTIONKEY);
		}		
	}

	@Override
	public void update(GroupeFonction objvo)throws RcEjbException {
		
		ctrlInsertUpdate(objvo); 
		merge(objvo); 
		
	}

	@Override
	public void delete(Integer objkey) throws RcEjbException {

		try {
			remove(objkey);
		} catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
	}

	@Override
	public List<GroupeFonction> rechercherDetailGroupefonctionGroupefonction(Integer key)
			throws RcEjbException {
		try {
			GroupeFonction groupefonctionlocal = findByPrimaryKey(key);
			List<GroupeFonction> vector = new ArrayList<GroupeFonction>();
			List<GroupeFonction>  collection = groupefonctionlocal.getGroupeFonctions();
			Iterator<GroupeFonction> it = collection.iterator();
			while (it.hasNext()) {
				GroupeFonction rmt = (GroupeFonction) it.next()
						.getGrpFoncGpFonct();
				vector.add(rmt);
			}
			return collection;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public List<ProfilGroupe> rechercherDetailGroupefonctionProfilgroupe(Integer key)
			throws RcEjbException {
		try {
			GroupeFonction groupefonctionlocal = findByPrimaryKey(key);
			List<ProfilGroupe> vector = new ArrayList<ProfilGroupe>();
			List<ProfilGroupe> collection = groupefonctionlocal.getProfilGroupes();
			Iterator<ProfilGroupe> it = collection.iterator();
			while (it.hasNext()) {
				ProfilGroupe rmt = (ProfilGroupe) it.next();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public List<RegroupFonctions> rechercherDetailGroupefonctionRegroupfonctions(Integer key)
			throws RcEjbException {
		try {
			GroupeFonction groupefonctionlocal = findByPrimaryKey(key);
			List<RegroupFonctions> vector = new ArrayList<RegroupFonctions>();
			List<RegroupFonctions> collection = groupefonctionlocal.getRegroupFonctions();
			Iterator<RegroupFonctions> it = collection.iterator();
			while (it.hasNext()) {
				RegroupFonctions rmt = (RegroupFonctions) it.next();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}
	
	@Override
	public List<LabelValue> getListeGroupefonction() throws RcEjbException {
		List<GroupeFonction> listGroupefonction = null;
		List<LabelValue> result = new ArrayList<LabelValue>();
		GroupeFonction groupefonctionVO = null;
		try {
			listGroupefonction = findAll();
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		} 
		for (int i = 0; i < listGroupefonction.size(); i++) {
			groupefonctionVO = (GroupeFonction) listGroupefonction.get(i);
			result.add(new LabelValue(groupefonctionVO.getRcCodeGroupe()
					+ " - " + groupefonctionVO.getRcLibGroupe(),
					groupefonctionVO.getRcCodeGroupe() + ""));
		}
		return result;

	}
	
	 public List<GroupefonctionDto> rechercheByWhereGroupefonction(String where) throws RcEjbException{
			List<GroupefonctionDto> result = new ArrayList<GroupefonctionDto>(); 	
			try {
				List<GroupeFonction> listeGroupefonction = (List<GroupeFonction>) rechercherByWhere(where);
				for (int i=0; i<listeGroupefonction.size(); i++) {
					GroupefonctionDto groupefonctionDto = getGroupefonctionDto(listeGroupefonction.get(i));
					result.add(groupefonctionDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public GroupefonctionDto getGroupefonctionDto(GroupeFonction groupefonction) {
			GroupefonctionDto groupefonctionDto = new GroupefonctionDto();
			if (groupefonction!=null){
				groupefonctionDto.setRcCodeGroupe(groupefonction.getRcCodeGroupe());
				groupefonctionDto.setRcCodeGrpPere(groupefonction.getRcCodeGrpPere());
				groupefonctionDto.setRcLibGroupe(groupefonction.getRcLibGroupe());
				groupefonctionDto.setRcOrdreAffichage(groupefonction.getRcOrdreAffichage());
				groupefonctionDto.setDelCell(groupefonctionDto.getPk());
				groupefonctionDto.setEditCell(groupefonctionDto.getPk()); 
				}
			return groupefonctionDto;
		}
		public List<GroupeFonction> rechercherByWhereProfil(String where)
				throws RcEjbException {
			Query qry = entityManager.createQuery("FROM GroupeFonction AS G"
				+ " WHERE 1=1 " + where+" ORDER BY G.rcCodeGroupe");	
			return (List<GroupeFonction>) qry.getResultList();
		}
	    public ListeGroupe getListeGroupe(String codeprofil) throws Exception {
	        ListeGroupe listeGroupe = new ListeGroupe();
	        String sql = " ";

	        if (codeprofil != null && !codeprofil.equals("")) {
	            sql = " AND G.rcCodeGroupe NOT IN (SELECT P.rcCodeGroupe FROM ProfilGroupe AS P "
	                    + "WHERE P.rcCodeProfil = '" + codeprofil + "')";
	            listeGroupe.setListGroupeInitial(rechercherByWhereProfil(sql));
	            sql = " AND G.rcCodeGroupe IN (SELECT P.rcCodeGroupe FROM ProfilGroupe AS P "
	                    + "WHERE P.rcCodeProfil = '" + codeprofil + "')";
	            listeGroupe.setListGroupeFinal(rechercherByWhereProfil(sql));
	        } else {
	            listeGroupe.setListGroupeInitial(rechercherByWhereProfil(sql));
	            listeGroupe.setListGroupeFinal(new ArrayList());
	        }
	        return listeGroupe;
	    }
	    
	    public List getListeGroupefonctionDelegations(String codeprofil)
	            throws TwreException, RcEjbException {
	        List v = null;
	        String sql = "";

	        sql = " AND G.rcCodeGroupe IN (SELECT P.rcCodeGroupe FROM ProfilGroupe AS P "
	                + "WHERE P.rcCodeProfil = '"
	                + codeprofil
	                + "')"
	                + " AND G.rcCodeGroupe IN (SELECT R.rcCodeGroupe FROM RegroupFonctions AS R)"
	                + " OR (G.rcCodeGrpPere IN "
	                + " (SELECT P.rcCodeGroupe FROM ProfilGroupe AS P "
	                + "WHERE P.rcCodeProfil = '" + codeprofil + "'))";
	        v = rechercherByWhereProfil(sql);
	        return v;
	    }
}
