package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IBacDepotPetrolierDao;
import sn.com.douane.ejb.rc.model.entities.BacDepotPetrolier;

@Stateless(name="IBacDepotPetrolierDao")
public class BacDepotPetrolierDaoImpl  extends GenericDaoImpl<BacDepotPetrolier> implements IBacDepotPetrolierDao {

}
