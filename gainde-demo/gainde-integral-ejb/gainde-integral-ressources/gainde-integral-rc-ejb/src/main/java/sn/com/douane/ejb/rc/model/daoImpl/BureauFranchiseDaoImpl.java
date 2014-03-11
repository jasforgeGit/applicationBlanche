package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IBureauFranchiseDao;
import sn.com.douane.ejb.rc.model.entities.BureauFranchise;

@Stateless(name = "IBureauFranchiseDao")
public class BureauFranchiseDaoImpl extends GenericDaoImpl<BureauFranchise> implements IBureauFranchiseDao {


}
