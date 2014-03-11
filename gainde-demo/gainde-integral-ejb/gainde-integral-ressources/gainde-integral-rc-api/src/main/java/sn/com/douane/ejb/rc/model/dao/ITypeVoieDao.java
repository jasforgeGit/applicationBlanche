package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.TypeVoie;
import sn.com.douane.utils.LabelValue;

@Local
public interface ITypeVoieDao  extends IGenericDao<TypeVoie> {

//	void create(TypeVoie newInstance) throws CreateException;
	List<LabelValue> getListTypeVoieDestinataire() throws TwreException, FinderException; 
}
