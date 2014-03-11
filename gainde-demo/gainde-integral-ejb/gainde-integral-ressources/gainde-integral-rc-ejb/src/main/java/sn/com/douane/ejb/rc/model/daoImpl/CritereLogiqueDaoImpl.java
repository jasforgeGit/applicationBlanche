package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ICritereLogiqueDao;
import sn.com.douane.ejb.rc.model.entities.CritereLogique;


@Stateless(name="ICritereLogiqueDao")
public class CritereLogiqueDaoImpl extends GenericDaoImpl<CritereLogique> implements ICritereLogiqueDao {	
	
}
