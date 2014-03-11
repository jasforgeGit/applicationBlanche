package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IDepotPetrolierDao;
import sn.com.douane.ejb.rc.model.entities.DepotPetrolier;

@Stateless(name = "IDepotPetrolierDao")
public class DepotPetrolierDaoImpl extends GenericDaoImpl<DepotPetrolier> implements IDepotPetrolierDao{

}
