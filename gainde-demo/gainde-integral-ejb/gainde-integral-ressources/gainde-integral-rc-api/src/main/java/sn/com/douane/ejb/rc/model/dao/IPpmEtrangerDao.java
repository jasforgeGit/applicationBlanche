package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.PpmEtranger;

@Local
public interface IPpmEtrangerDao extends IGenericDao<PpmEtranger>{
	
	void checkExistance(String key) throws TwreException;
}