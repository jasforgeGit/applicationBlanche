package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeMiseEnDepotDao;
import sn.com.douane.ejb.rc.model.entities.TypeMiseEnDepot;

@Stateless(name="ITypeMiseEnDepotDao")
public class TypeMiseEnDepotDaoImpl extends GenericDaoImpl<TypeMiseEnDepot> implements ITypeMiseEnDepotDao{

}
