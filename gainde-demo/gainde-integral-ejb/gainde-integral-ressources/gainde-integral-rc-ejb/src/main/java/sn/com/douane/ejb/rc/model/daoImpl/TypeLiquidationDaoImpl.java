package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeLiquidationDao;
import sn.com.douane.ejb.rc.model.entities.TypeLiquidation;

@Stateless(name="ITypeLiquidationDao")
public class TypeLiquidationDaoImpl extends GenericDaoImpl<TypeLiquidation> implements ITypeLiquidationDao {

	
}
