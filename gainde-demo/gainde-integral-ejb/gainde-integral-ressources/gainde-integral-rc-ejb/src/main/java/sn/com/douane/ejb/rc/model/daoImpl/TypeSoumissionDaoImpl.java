package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.model.dao.ITypeSoumissionDao;
import sn.com.douane.ejb.rc.model.entities.TypeSoumission;

@Stateless(name = "ITypeSoumissionDao")
public class TypeSoumissionDaoImpl extends GenericDaoImpl<TypeSoumission> implements ITypeSoumissionDao {
	

}