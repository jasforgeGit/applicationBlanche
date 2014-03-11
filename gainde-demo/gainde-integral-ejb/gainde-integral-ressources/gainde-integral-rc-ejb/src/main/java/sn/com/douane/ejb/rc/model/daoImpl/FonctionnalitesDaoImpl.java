package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.dao.IProfilDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.FonctionnaliteDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.Numerotation;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.ListeFonc;
import sn.com.douane.utils.sysEnv;

@Stateless(name="IFonctionnalitesDao")
public class FonctionnalitesDaoImpl extends GenericDaoImpl<Fonctionnalite> implements IFonctionnalitesDao {

	@EJB
	private IProfilDao profilDao; 
	
	@Override
	public void insert(Fonctionnalite objVo) throws RcEjbException {
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
	public void update(Fonctionnalite objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 
		
	}

	@Override
	public void ctrlInsertUpdate(Fonctionnalite objVo) throws RcEjbException {
		if (objVo.getRcCodeFonction() == null
				|| objVo.getRcCodeFonction().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODEFONCTION_OB);}
		if (objVo.getRcLibFonction() == null
				|| objVo.getRcLibFonction().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBFONCTION_OB);}
		try{
			if (objVo.getRcCodeProfil() != null
					&& !objVo.getRcCodeProfil().trim().equals("")){			
				Profil profilLocal = (Profil)profilDao
						.findByPrimaryKey(objVo.getRcCodeProfil());
				objVo.setRcCodeProfil(profilLocal.getRcCodeProfil()); 
			}
		}
		catch(FinderException e){
			throw new RcEjbException(ConstErrCodRC.PROFILKEY);
		}
		
	}

	@Override
	public void delete(String key) throws RcEjbException {
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Fonctionnalite> rechercherByWhereGroupeFonction(String where)
			throws RcEjbException {
		Query qry = entityManager.createQuery("FROM Fonctionnalite AS F"
			+ " WHERE 1=1 " + where+" ORDER BY F.rcCodeFonction");	
		return (List<Fonctionnalite>) qry.getResultList();
	}

	@Override
	public List<Numerotation> rechercherDetailFonctionnalitesNumerotation(
			String key) throws RcEjbException {

		try {
			Fonctionnalite fonctionnaliteslocal = findByPrimaryKey(key);
			List<Numerotation> vector = new ArrayList<Numerotation>();
			List<Numerotation> collection = fonctionnaliteslocal.getNumerotations();
			Iterator<Numerotation> it = collection.iterator();
			while (it.hasNext()) {
				Numerotation rmt = (Numerotation) it.next();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}


	@Override
	public String getFonctionnaliteString() throws RcEjbException {
		
		Fonctionnalite fonctionnalitesVO = null;
		List<Fonctionnalite> listFonc;
		try {
			listFonc = findAll();
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		} 
		String codefonc;
		String libfonc;
		String temp = "";

		for (int i = 0; i < listFonc.size(); i++) {
			fonctionnalitesVO = (Fonctionnalite) listFonc.get(i);
			codefonc = ConvertUtil.converToString(fonctionnalitesVO
					.getRcCodeFonction());
			libfonc = fonctionnalitesVO.getRcLibFonction();
			temp += (i == 0) ? (codefonc + ConstManif.TIELD + libfonc)
					: (ConstManif.DIEZ + codefonc + ConstManif.TIELD + libfonc);
		}
		return temp;
	}
	
	 public List<FonctionnaliteDto> rechercheByWhereFonctionnalite(String where) throws RcEjbException{
			List<FonctionnaliteDto> result = new ArrayList<FonctionnaliteDto>(); 	
			try {
				List<Fonctionnalite> listeFonctionnalite = (List<Fonctionnalite>) rechercherByWhere(where);
				for (int i=0; i<listeFonctionnalite.size(); i++) {
					FonctionnaliteDto fonctionnaliteDto = getFonctionnaliteDto(listeFonctionnalite.get(i));
					result.add(fonctionnaliteDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public FonctionnaliteDto getFonctionnaliteDto(Fonctionnalite fonctionnalite) {
			FonctionnaliteDto fonctionnaliteDto = new FonctionnaliteDto();
			if (fonctionnalite!=null){
				fonctionnaliteDto.setRcCodeFonction(fonctionnalite.getRcCodeFonction());
				fonctionnaliteDto.setRcCodeProfil(fonctionnalite.getRcCodeProfil());
				fonctionnaliteDto.setRcDescription(fonctionnalite.getRcDescription());
				fonctionnaliteDto.setRcLibFonction(fonctionnalite.getRcLibFonction());
				fonctionnaliteDto.setRcUrlFonction(fonctionnalite.getRcUrlFonction());
				fonctionnaliteDto.setDelCell(fonctionnaliteDto.getPk());
				fonctionnaliteDto.setEditCell(fonctionnaliteDto.getPk()); 
				}
			return fonctionnaliteDto;
		}
		
//		public List RechercheByWhereGroupeFonction(String where) throws Exception {
//			List vector = new ArrayList();
//
//			try {
//				String table = "Fonctionnalite";
//				String req = "", sql = "";
//				req = where.toUpperCase().trim();
//
//				sql = "FROM Fonctionnalite AS F"+ " WHERE 1=1 " + where;
//				sql = sql + " ORDER BY F.RCCODEFONCTION";
//				List<Fonctionnalite> liste = (List<Fonctionnalite>) executerRequete(sql);
//				Fonctionnalite vo = null;
//				
//				for (Fonctionnalite f : liste) {
//					vo = new Fonctionnalite();
//					vo.setRcCodeFonction(f.getRcCodeFonction());
//					vo.setRcLibFonction(f.getRcLibFonction());
//					vector.add(vo);
//				}
//
//			} catch (Exception e) {
//                e.getMessage();
//			}
//			return vector;
//		}
	    public ListeFonc getListeFonctionnalites(String codegroupe) throws Exception {
	        ListeFonc listeFonc = new ListeFonc();
	        String sql = "";

	        if (codegroupe != null && !codegroupe.equals("")) {
	            sql = " AND F.rcCodeFonction NOT IN (SELECT R.rcCodeFonction FROM RegroupFonctions AS R "
	                    + "WHERE R.rcCodeGroupe = "
	                    + sysEnv.strToInteger(codegroupe) + ")";
	            listeFonc.setListFoncInitial(rechercherByWhereGroupeFonction(sql));

	            sql = " AND F.rcCodeFonction IN (SELECT R.rcCodeFonction FROM RegroupFonctions AS R "
	                    + "WHERE R.rcCodeGroupe = "
	                    + sysEnv.strToInteger(codegroupe) + ")";
	            listeFonc.setListFoncFinal(rechercherByWhereGroupeFonction(sql));
	        } else {
	            listeFonc.setListFoncInitial(rechercherByWhereGroupeFonction(sql));
	            listeFonc.setListFoncFinal(new ArrayList());
	        }
	        return listeFonc;
	    }
}
