package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITypeUtilisateurDao;
import sn.com.douane.ejb.rc.model.entities.TypeUtilisateur;
import sn.com.douane.utils.LabelValue;

@Stateless(name="ITypeUtilisateurDao")
public class TypeUtilisateurDaoImpl extends GenericDaoImpl<TypeUtilisateur> implements ITypeUtilisateurDao {

	@Override
	public void insert(TypeUtilisateur objVo) throws RcEjbException {
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
	public void update(TypeUtilisateur objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 
		
	}

	@Override
	public void ctrlInsertUpdate(TypeUtilisateur objVo) throws RcEjbException {
		if(objVo.getRcLibelleUser()==null || objVo.getRcLibelleUser().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCLIBELLEUSER_OB);}
		if(objVo.getRcTypeUser()==null || objVo.getRcTypeUser().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCTYPEUSER_OB);}
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

	@Override
	public List<LabelValue> getListTypeUtilisateur() throws RcEjbException {
		List<LabelValue> v = new ArrayList<LabelValue>();
		try {
			TypeUtilisateur vo = null;
			List<TypeUtilisateur> vectortypuser = findAll(); 
			v.add(new LabelValue("", ""));
			for (int i = 0; i < vectortypuser.size(); i++) {
				vo = vectortypuser.get(i);
				v.add(new LabelValue(vo.getRcTypeUser() + " - "
						+ vo.getRcLibelleUser(), vo.getRcTypeUser()));
			}
		}catch(FinderException e){
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
		return v;
	}

}
