package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IParamModifDao;
import sn.com.douane.ejb.rc.model.entities.ParamModif;

@Stateless(name="IParamModifDao")
public class ParamModifDaoImpl extends GenericDaoImpl<ParamModif> implements IParamModifDao{

}
