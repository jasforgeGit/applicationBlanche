package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeApuBurInterditDao;
import sn.com.douane.ejb.rc.model.entities.TypeApuBurInterdit;

@Stateless(name = "ITypeApuBurInterditDao")
public class TypeApuBurInterditDaoImpl extends
		GenericDaoImpl<TypeApuBurInterdit> implements ITypeApuBurInterditDao {

}
