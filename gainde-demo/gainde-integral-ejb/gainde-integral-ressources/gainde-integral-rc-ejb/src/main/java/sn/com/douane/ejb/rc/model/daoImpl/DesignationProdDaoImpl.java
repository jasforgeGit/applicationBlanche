package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IDesignationProdDao;
import sn.com.douane.ejb.rc.model.entities.DesignationProd;

@Stateless(name="IDesignationProdDao")
public class DesignationProdDaoImpl extends GenericDaoImpl<DesignationProd> implements IDesignationProdDao {

}
