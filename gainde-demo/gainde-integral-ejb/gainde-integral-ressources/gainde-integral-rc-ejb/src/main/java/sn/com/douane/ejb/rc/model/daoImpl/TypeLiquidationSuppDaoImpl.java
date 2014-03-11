package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeLiquidationSuppDao;
import sn.com.douane.ejb.rc.model.entities.TypeLiquidationSupp;

@Stateless(name="ITypeLiquidationSuppDao")
public class TypeLiquidationSuppDaoImpl extends GenericDaoImpl<TypeLiquidationSupp> implements ITypeLiquidationSuppDao {

}
