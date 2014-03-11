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

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IProfilDao;
import sn.com.douane.ejb.rc.model.dto.GroupefonctionDto;
import sn.com.douane.ejb.rc.model.dto.ProfilDto;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;

@Stateless(name="IProfilDao")
public class ProfilDaoImpl extends GenericDaoImpl<Profil> implements IProfilDao {
	
	public void insert(Profil objvo) throws RcEjbException {
		try {
			ctrlInsertUpdate(objvo);
			create(objvo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
	}
	
	public void ctrlInsertUpdate(Profil vo) throws RcEjbException {
		if (vo.getRcCodeProfil() == null
				|| vo.getRcCodeProfil().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODEPROFIL_OB);}
		if (vo.getRcLibelleProfil() == null
				|| vo.getRcLibelleProfil().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBELLEPROFIL_OB);}
	}
	
	public void update(Profil objvo) throws RcEjbException {

		ctrlInsertUpdate(objvo);
		merge(objvo); 
		
	}
	
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

	public List<ProfilGroupe> rechercherDetailProfilProfilgroupe(String profilkey)
			throws RcEjbException {		
		try {
			Profil profillocal = findByPrimaryKey(profilkey);

			List<ProfilGroupe> vector = new ArrayList<ProfilGroupe>(); 
			List<ProfilGroupe> collection = profillocal.getProfilGroupes();
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
	public List<ProfilDto> rechercheByWhereProfil(String where) throws RcEjbException{
		List<ProfilDto> result = new ArrayList<ProfilDto>(); 	
		try {
			List<Profil> listeProfil = (List<Profil>) rechercherByWhere(where);
			for (int i=0; i<listeProfil.size(); i++) {
				ProfilDto profilDto = getProfilDto(listeProfil.get(i));
				result.add(profilDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public ProfilDto getProfilDto(Profil profil) {
		ProfilDto profilDto = new ProfilDto();
		if (profil!=null){
			profilDto.setRcCodeProfil(profil.getRcCodeProfil());
			profilDto.setRcLibelleProfil(profil.getRcLibelleProfil());
			profilDto.setDelCell(profilDto.getPk());
			profilDto.setEditCell(profilDto.getPk()); 
			}
		return profilDto;
	}
}
